package net.kayn.codex_of_champions.item.armor;

import net.kayn.codex_of_champions.entity.armor.BloodSoulArmorModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import io.redspace.ironsspellbooks.entity.armor.GenericCustomArmorRenderer;

import java.util.Properties;

public class BloodSoulArmorItem extends ImbuableModArmorItem {
    public BloodSoulArmorItem(Type type, Properties settings) {
        super(ChampionArmorMaterials.BLOOD_SOUL, type, settings);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {

        return new GenericCustomArmorRenderer<>(new BloodSoulArmorModel());
    }
}