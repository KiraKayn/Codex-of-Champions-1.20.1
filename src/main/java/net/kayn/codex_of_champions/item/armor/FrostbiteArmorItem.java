package net.kayn.codex_of_champions.item.armor;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.entity.armor.GenericCustomArmorRenderer;
import net.kayn.codex_of_champions.entity.armor.FrostbiteArmorModel;
import net.kayn.codex_of_champions.util.backport.AttributeContainer;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class FrostbiteArmorItem extends ImbuableModArmorItem {
    public FrostbiteArmorItem(Type type, Properties settings) {
        // Add in your armor tier + additional attributes for your item
        super(ModArmorMaterials.FROSTBITE_MATERIAL, type, settings,
                new AttributeContainer(AttributeRegistry.MAX_MANA.get(), 200.0, AttributeModifier.Operation.ADDITION),
                new AttributeContainer(AttributeRegistry.ICE_SPELL_POWER.get(), .15, AttributeModifier.Operation.ADDITION),
//                new AttributeContainer(AttributeRegistry.CASTING_MOVESPEED, .05, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(AttributeRegistry.SPELL_POWER.get(), .10, AttributeModifier.Operation.ADDITION)
        );
    }

    // Just supply the armor model here; you don't have to worry about making a new renderer
    // ISS already has a custom renderer used for armor models
    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new FrostbiteArmorModel());
    }
}