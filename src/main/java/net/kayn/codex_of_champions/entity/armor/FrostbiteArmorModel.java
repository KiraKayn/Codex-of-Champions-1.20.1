package net.kayn.codex_of_champions.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.minecraft.resources.ResourceLocation;
import net.kayn.codex_of_champions.CodexOfChampions;
import net.kayn.codex_of_champions.item.armor.FrostbiteArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class FrostbiteArmorModel extends DefaultedItemGeoModel<FrostbiteArmorItem> {
    public FrostbiteArmorModel() {
        super(new ResourceLocation(CodexOfChampions.MODID, ""));
    }

    @Override
    public ResourceLocation getModelResource(FrostbiteArmorItem animatable) {
        return new ResourceLocation(CodexOfChampions.MODID, "geo/frostbite_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FrostbiteArmorItem animatable) {
        return new ResourceLocation(CodexOfChampions.MODID, "textures/models/armor/frostbite_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FrostbiteArmorItem animatable) {
        return new ResourceLocation(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
    }
}