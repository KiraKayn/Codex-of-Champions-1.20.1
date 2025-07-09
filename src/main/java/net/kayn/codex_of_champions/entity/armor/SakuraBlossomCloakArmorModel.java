package net.kayn.codex_of_champions.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.minecraft.resources.ResourceLocation;
import net.kayn.codex_of_champions.CodexOfChampions;
import net.kayn.codex_of_champions.item.armor.SakuraBlossomCloakArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class SakuraBlossomCloakArmorModel extends DefaultedItemGeoModel<SakuraBlossomCloakArmorItem> {
    public SakuraBlossomCloakArmorModel() {
        super(new ResourceLocation(CodexOfChampions.MODID, ""));
    }

    @Override
    public ResourceLocation getModelResource(SakuraBlossomCloakArmorItem animatable) {
        return new ResourceLocation(CodexOfChampions.MODID, "geo/sakura_cloak_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SakuraBlossomCloakArmorItem animatable) {
        return new ResourceLocation(CodexOfChampions.MODID, "textures/models/armor/sakura_blossom_cloak_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SakuraBlossomCloakArmorItem animatable) {
        return new ResourceLocation(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
    }
}