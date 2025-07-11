package net.kayn.codex_of_champions.item.armor;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.entity.armor.GenericCustomArmorRenderer;
import net.kayn.codex_of_champions.entity.armor.BlossomCloakArmorModel;
import net.kayn.codex_of_champions.util.backport.AttributeContainer;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BlossomCloakArmorItem extends ImbuableModArmorItem {
    public BlossomCloakArmorItem(Type type, Properties settings) {
        // Add in your armor tier + additional attributes for your item
        super(ModArmorMaterials.BLOSSOM_CLOAK_MATERIAL, type, settings,
                new AttributeContainer(AttributeRegistry.MAX_MANA.get(), 200.0, AttributeModifier.Operation.ADDITION),
                new AttributeContainer(AttributeRegistry.NATURE_SPELL_POWER.get(), .15, AttributeModifier.Operation.ADDITION),
//                new AttributeContainer(AttributeRegistry.CASTING_MOVESPEED, .05, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(AttributeRegistry.SPELL_POWER.get(), .10, AttributeModifier.Operation.ADDITION)
        );
    }

    // Just supply the armor model here; you don't have to worry about making a new renderer
    // ISS already has a custom renderer used for armor models
    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new BlossomCloakArmorModel());
    }
}

