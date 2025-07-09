package net.kayn.codex_of_champions.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.minecraft.resources.ResourceLocation;
import net.kayn.codex_of_champions.CodexOfChampions;
import net.kayn.codex_of_champions.item.armor.WardenHunterArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class WardenHunterArmorModel extends DefaultedItemGeoModel<WardenHunterArmorItem> {
    public WardenHunterArmorModel() {
        super(new ResourceLocation(CodexOfChampions.MODID, ""));
    }

    @Override
    public ResourceLocation getModelResource(WardenHunterArmorItem animatable) {
        return new ResourceLocation(CodexOfChampions.MODID, "geo/warden_hunter_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WardenHunterArmorItem animatable) {
        return new ResourceLocation(CodexOfChampions.MODID, "textures/models/armor/warden_hunter_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WardenHunterArmorItem animatable) {
        return new ResourceLocation(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
    }
}