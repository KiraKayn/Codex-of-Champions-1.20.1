package net.kayn.codex_of_champions.item.curios;
//imports required

import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import dev.shadowsoffire.attributeslib.api.ALObjects;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.item.curios.CurioBaseItem;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.kayn.codex_of_champions.util.backport.AttributeUtil;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;

import java.util.UUID;

//Class Setup
public class FloweringPendantCurio extends CurioBaseItem {
    public FloweringPendantCurio() {
        super(ItemPropertiesHelper.equipment().stacksTo(1).fireResistant());
    }

    //uhhhhhhhhhhhhhhh idk what this does I just looked at the DTE Github
    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(SlotContext slotContext, UUID uuid, ItemStack stack) {
        UUID uuid1 = AttributeUtil.getOrCreateUUID(stack);
        Multimap<Attribute, AttributeModifier> attr = LinkedHashMultimap.create();
        //The attributes of the curio
        attr.put(AttributeRegistry.NATURE_SPELL_POWER.get(), new AttributeModifier(uuid1, slotContext.identifier() + "NATURE_SPELL_POWER", 0.1, AttributeModifier.Operation.MULTIPLY_BASE));
        attr.put(ALObjects.Attributes.OVERHEAL.get(), new AttributeModifier(uuid1, slotContext.identifier() + "OVERHEAL", 0.15, AttributeModifier.Operation.ADDITION));
        return attr;
    }
}
