package net.kayn.codex_of_champions.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.minecraft.resources.ResourceLocation;
import net.kayn.codex_of_champions.CodexOfChampions;
import net.kayn.codex_of_champions.item.armor.BlossomCloakArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class BlossomCloakArmorModel extends DefaultedItemGeoModel<BlossomCloakArmorItem> {
    public BlossomCloakArmorModel()
    {
        super(new ResourceLocation(CodexOfChampions.MODID, ""));
    }

    @Override
    public ResourceLocation getModelResource(BlossomCloakArmorItem animatable) {
        return new ResourceLocation(CodexOfChampions.MODID, "geo/blossom_cloak_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BlossomCloakArmorItem animatable) {
        return new ResourceLocation(CodexOfChampions.MODID, "textures/models/armor/blossom_cloak_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BlossomCloakArmorItem animatable) {
        return new ResourceLocation(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
    }
}