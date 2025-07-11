package net.kayn.codex_of_champions.util.backport;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.ForgeRegistries;

import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.UUID;

public class AttributeUtil {
    public static final Map<EquipmentSlot, UUID> UUIDS_BY_SLOT = Map.of(
            EquipmentSlot.HEAD, UUID.fromString("27ec6504-2978-4f6c-b080-df66f67a577c"),
            EquipmentSlot.CHEST, UUID.fromString("825bc6b4-4f27-4f7e-af9d-b47011e1aa67"),
            EquipmentSlot.LEGS, UUID.fromString("ada0c119-e713-400d-92f2-7164f5d107c9"),
            EquipmentSlot.FEET, UUID.fromString("645774ec-d3cf-472c-a71f-3af9b46503eb"),
            EquipmentSlot.MAINHAND, UUID.fromString("13e8dfee-abf6-4689-bb5d-7df2b2b9e899"),
            EquipmentSlot.OFFHAND, UUID.fromString("3df59718-cb43-400d-aa48-d62a37cac403")
    );

    public static UUID getSlotUUID(EquipmentSlot slot) {
        return UUIDS_BY_SLOT.get(slot);
    }

    public static UUID getOrCreateUUID(ItemStack itemStack) {
        CompoundTag tag = itemStack.getOrCreateTag();
        if (!tag.contains("CoCData")) {
            tag.putUUID("CoCData", UUID.randomUUID());
        }
        return tag.getUUID("CoCData");
    }

    public static UUID generateSlotAttributeUUID(Item item, String slotId, Attribute attribute) {
        String id = ForgeRegistries.ITEMS.getKey(item).toString();
        String attr = ForgeRegistries.ATTRIBUTES.getKey(attribute).toString();
        return UUID.nameUUIDFromBytes((id + ":" + slotId + ":" + attr).getBytes(StandardCharsets.UTF_8));
    }
}
