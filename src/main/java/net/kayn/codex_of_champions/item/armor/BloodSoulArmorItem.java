package net.kayn.codex_of_champions.item.armor;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import net.kayn.codex_of_champions.entity.armor.BloodSoulArmorModel;
import net.kayn.codex_of_champions.util.backport.AttributeContainer;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import io.redspace.ironsspellbooks.entity.armor.GenericCustomArmorRenderer;



public class BloodSoulArmorItem extends ImbuableModArmorItem {
    public BloodSoulArmorItem(ArmorItem.Type type, Item.Properties settings) {
        super(ModArmorMaterials.BLOOD_SOUL_MATERIAL, type, settings,
                new AttributeContainer(AttributeRegistry.MAX_MANA.get(), 200.0, AttributeModifier.Operation.ADDITION),
                new AttributeContainer(AttributeRegistry.BLOOD_SPELL_POWER.get(), .15, AttributeModifier.Operation.ADDITION),
//                new AttributeContainer(AttributeRegistry.CASTING_MOVESPEED, .05, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(AttributeRegistry.SPELL_POWER.get(), .10, AttributeModifier.Operation.ADDITION)
        );
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {

        return new GenericCustomArmorRenderer<>(new BloodSoulArmorModel());
    }
}