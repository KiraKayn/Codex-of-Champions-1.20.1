package net.kayn.codex_of_champions.item.curios;

import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import dev.shadowsoffire.attributeslib.api.ALObjects;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.item.curios.SimpleDescriptiveCurio;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.kayn.codex_of_champions.util.backport.AttributeUtil;
import net.minecraft.core.Holder;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;

import java.util.UUID;

public class RoyalAnlaceCurio extends SimpleDescriptiveCurio {
    public RoyalAnlaceCurio() {
        super(ItemPropertiesHelper.equipment().stacksTo(1).fireResistant() );
    }
    //uhhhhhhhhhhhhhhh idk what this does I just looked at the DTE Github
    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(SlotContext slotContext, UUID uuid, ItemStack stack) {
        UUID uuid1 = AttributeUtil.getOrCreateUUID(stack);
        Multimap<Attribute, AttributeModifier> attr = LinkedHashMultimap.create();
        //The attributes of the curio
        attr.put(AttributeRegistry.HOLY_SPELL_POWER.get(), new AttributeModifier(uuid1, slotContext.getIdentifier() + "HOLY_SPELL_POWER", 0.15, AttributeModifier.Operation.MULTIPLY_BASE));
        attr.put(ALObjects.Attributes.HEALING_RECEIVED.get(), new AttributeModifier(uuid1,slotContext.getIdentifier() + "HEALING_RECEIVED", 0.15, AttributeModifier.Operation.MULTIPLY_BASE));
        attr.put(AttributeRegistry.ENDER_SPELL_POWER.get(), new AttributeModifier(uuid1,slotContext.getIdentifier() + "ENDER_SPELL_POWER", 0.15, AttributeModifier.Operation.MULTIPLY_BASE));
        attr.put(ALObjects.Attributes.CRIT_DAMAGE.get(), new AttributeModifier(uuid1,slotContext.getIdentifier() + "CRIT_DAMAGE", 0.15, AttributeModifier.Operation.MULTIPLY_BASE));
        attr.put(Attributes.MAX_HEALTH, new AttributeModifier(uuid1,slotContext.getIdentifier() + "MAX_HEALTH", 3, AttributeModifier.Operation.ADDITION));
        return attr;
    }
}
