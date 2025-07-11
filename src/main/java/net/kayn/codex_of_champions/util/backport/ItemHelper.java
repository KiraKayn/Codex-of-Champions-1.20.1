package net.kayn.codex_of_champions.util.backport;

import net.minecraft.world.item.ArmorItem;

public class ItemHelper {
    public static int getAmorBaseDurability(ArmorItem.Type type) {
        return switch (type) {
            case HELMET -> 11;
            case CHESTPLATE -> 16;
            case LEGGINGS -> 15;
            case BOOTS -> 13;
        };
    }
}
