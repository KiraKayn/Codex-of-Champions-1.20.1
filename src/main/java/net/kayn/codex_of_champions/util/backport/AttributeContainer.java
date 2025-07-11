package net.kayn.codex_of_champions.util.backport;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.core.Holder;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.ForgeRegistries;

import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.UUID;

public record AttributeContainer(Attribute attribute, double value, AttributeModifier.Operation operation) {
    public AttributeModifier createModifier(String slot, ItemStack itemStack) {
        ResourceLocation attrId = ForgeRegistries.ATTRIBUTES.getKey(attribute);
        if (attrId == null) {
            throw new IllegalStateException("Unregistered attribute: " + attribute);
        }
        String name = String.format("%s_%s_modifier", slot, attrId.getPath());
        if (itemStack.isEmpty()) {
            UUID uuid = UUID.nameUUIDFromBytes(name.getBytes(StandardCharsets.UTF_8));
            return new AttributeModifier(uuid, name, this.value, this.operation);
        }
        CompoundTag tag = itemStack.getOrCreateTag();
        if (!tag.contains("CoC_UUID")) {
            tag.putUUID("CoC_UUID", UUID.randomUUID());
        }
        UUID uuid1 = tag.getUUID("CoC_UUID");

        return new AttributeModifier(uuid1, name, this.value, this.operation);
    }

    public AttributeModifier createModifier(String slot) {
        ResourceLocation attrId = ForgeRegistries.ATTRIBUTES.getKey(attribute);
        if (attrId == null) {
            throw new IllegalStateException("Unregistered attribute: " + attribute);
        }
        String name = String.format("%s_%s_modifier", slot, attrId.getPath());
        UUID uuid = UUID.nameUUIDFromBytes(name.getBytes(StandardCharsets.UTF_8));
        return new AttributeModifier(uuid, name, this.value, this.operation);
    }

    public static Map<Attribute, AttributeModifier> build(String slot, ItemStack itemStack, AttributeContainer... containers) {
        ImmutableMap.Builder<Attribute, AttributeModifier> builder = new ImmutableMap.Builder<>();
        for (AttributeContainer container : containers) {
            builder.put(container.attribute, container.createModifier(slot, itemStack));
        }
        return builder.build();
    }

    public static Map<Attribute, AttributeModifier> build(String slot,  AttributeContainer... containers) {
        ImmutableMap.Builder<Attribute, AttributeModifier> builder = new ImmutableMap.Builder<>();
        for (AttributeContainer container : containers) {
            builder.put(container.attribute, container.createModifier(slot, ItemStack.EMPTY));
        }
        return builder.build();
    }
}
