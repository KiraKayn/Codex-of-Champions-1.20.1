package net.kayn.codex_of_champions.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.minecraft.resources.ResourceLocation;
import net.kayn.codex_of_champions.CodexOfChampions;
import net.kayn.codex_of_champions.item.armor.BloodSoulArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class BloodSoulArmorModel extends  DefaultedItemGeoModel<BloodSoulArmorItem> {
    public BloodSoulArmorModel()
    {
        super(new ResourceLocation(CodexOfChampions.MODID, ""));
    }

    @Override
    public ResourceLocation getModelResource(BloodSoulArmorItem animatable) {
        return new ResourceLocation(CodexOfChampions.MODID, "geo/blood_soul_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BloodSoulArmorItem animatable) {
        return new ResourceLocation(CodexOfChampions.MODID, "textures/models/armor/blood_soul_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BloodSoulArmorItem animatable) {
        return new ResourceLocation(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
    }
}