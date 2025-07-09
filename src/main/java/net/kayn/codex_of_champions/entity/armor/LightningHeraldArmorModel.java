package net.kayn.codex_of_champions.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.minecraft.resources.ResourceLocation;
import net.kayn.codex_of_champions.CodexOfChampions;
import net.kayn.codex_of_champions.item.armor.LightningHeraldArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class LightningHeraldArmorModel extends DefaultedItemGeoModel<LightningHeraldArmorItem> {
    public LightningHeraldArmorModel() {
        super(new ResourceLocation(CodexOfChampions.MODID, ""));
    }

    @Override
    public ResourceLocation getModelResource(LightningHeraldArmorItem animatable) {
        return new ResourceLocation(CodexOfChampions.MODID, "geo/lightning_herald_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(LightningHeraldArmorItem animatable) {
        return new ResourceLocation(CodexOfChampions.MODID, "textures/models/armor/lightning_herald_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(LightningHeraldArmorItem animatable) {
        return new ResourceLocation(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
    }
}