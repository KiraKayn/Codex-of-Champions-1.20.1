package net.kayn.codex_of_champions.util.backport;

import io.redspace.ironsspellbooks.api.item.weapons.MagicSwordItem;
import io.redspace.ironsspellbooks.api.registry.SpellDataRegistryHolder;
import net.kayn.codex_of_champions.item.weapons.COCExtendedWeaponTiers;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.Item;

import java.util.Map;

public class MagicalSwordItemHelper {
    public static MagicSwordItem create(COCExtendedWeaponTiers tier, SpellDataRegistryHolder[] spellDataRegistryHolders, Map<Attribute, AttributeModifier> additionalAttributes, Item.Properties properties) {
        return new MagicSwordItem(tier, tier.getAttackDamageBonus(), tier.getSpeed(), spellDataRegistryHolders, additionalAttributes, properties);
    }
}
