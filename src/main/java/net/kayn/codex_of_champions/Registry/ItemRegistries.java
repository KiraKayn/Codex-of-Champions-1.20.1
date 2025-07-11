package net.kayn.codex_of_champions.Registry;

import com.google.common.collect.ImmutableMultimap;
import io.redspace.ironsspellbooks.api.item.weapons.ExtendedSwordItem;
import io.redspace.ironsspellbooks.api.item.weapons.MagicSwordItem;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.api.registry.SpellDataRegistryHolder;
import io.redspace.ironsspellbooks.api.spells.SpellRarity;
import io.redspace.ironsspellbooks.compat.Curios;
import io.redspace.ironsspellbooks.item.SpellBook;
import io.redspace.ironsspellbooks.item.curios.CurioBaseItem;
import io.redspace.ironsspellbooks.item.spell_books.SimpleAttributeSpellBook;
import io.redspace.ironsspellbooks.item.weapons.StaffItem;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import io.redspace.ironsspellbooks.api.registry.SpellRegistry;
import net.kayn.codex_of_champions.util.backport.AttributeContainer;
import net.kayn.codex_of_champions.util.backport.ItemHelper;
import net.kayn.codex_of_champions.util.backport.MagicalSwordItemHelper;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.*;
import net.kayn.codex_of_champions.item.armor.*;
import net.kayn.codex_of_champions.item.curios.*;
import net.kayn.codex_of_champions.item.staffs.COCStaffTier;
import net.kayn.codex_of_champions.item.weapons.COCExtendedWeaponTiers;
import net.kayn.codex_of_champions.item.weapons.TriBladeItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.kayn.codex_of_champions.CodexOfChampions;

import java.util.Map;
import java.util.function.Supplier;

public class ItemRegistries {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CodexOfChampions.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> SOUL_FORGED_INGOT = ITEMS.register("soul_forged_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ARCANE_UPGRADE_TEMPLATE = ITEMS.register("arcane_upgrade_template",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLAZE_CORE = ITEMS.register("blaze_core",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DIVINE_STAR = ITEMS.register("divine_star",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ELECTRIFIED_BRONZE = ITEMS.register("electrified_bronze",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ETERNAL_ICE = ITEMS.register("eternal_ice",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GAIA_FRUIT = ITEMS.register("gaia_fruit",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> REINFORCED_ENDER_EYE = ITEMS.register("reinforced_ender_eye",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SCULK_RIB = ITEMS.register("sculk_rib",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> VEXED_PAGE = ITEMS.register("vexed_page",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WITHER_BONE = ITEMS.register("wither_bone",
            () -> new Item(new Item.Properties()));

    public static final Supplier<CurioBaseItem> FLOWERING_PENDANT = ITEMS.register("flowering_pendant", FloweringPendantCurio::new);
    public static final Supplier<CurioBaseItem> TRUEFIREWARDRING = ITEMS.register("true_fireward_ring", TrueFirewardRingCurio::new);
    public static final Supplier<CurioBaseItem> VAMPIRICCHARMCURIO = ITEMS.register("vampiric_charm", VampiricCharmCurio::new);
    public static final Supplier<CurioBaseItem> CHAOSORBCURIO = ITEMS.register("chaos_orb", ChaosOrbCurio::new);
    public static final Supplier<CurioBaseItem> AzureAnlaceCurio = ITEMS.register("azure_anlace", AzureAnlaceCurio::new);
    public static final Supplier<CurioBaseItem> ROYALROSECURIO = ITEMS.register("royal_rose", RoyalRoseCurio::new);
    public static final Supplier<CurioBaseItem> ROYALANLACECURIO = ITEMS.register("royal_anlace", RoyalAnlaceCurio::new);

    public static final RegistryObject<Item> CRYSTAL_CLAYMORE = ITEMS.register("crystal_claymore", () -> {
        var tier = COCExtendedWeaponTiers.CRYSTAL_CLAYMORE;
        var properties = ItemPropertiesHelper.equipment().rarity(Rarity.RARE);
        var attributes = AttributeContainer.build("mainhand", COCExtendedWeaponTiers.CRYSTAL_CLAYMORE.getAdditionalAttributes());
        var spells =  SpellDataRegistryHolder.of(new SpellDataRegistryHolder(SpellRegistry.CHAIN_CREEPER_SPELL, 8));
        return MagicalSwordItemHelper.create(tier, spells, attributes, properties);
    });


    public static final RegistryObject<Item> DEATHFIRE_GREATSWORD = ITEMS.register("deathfire_greatsword", () -> {
        var tier = COCExtendedWeaponTiers.DEATHFIRE_GREATSWORD;
        var properties = ItemPropertiesHelper.equipment().rarity(Rarity.RARE);
        var attributes = AttributeContainer.build("mainhand", COCExtendedWeaponTiers.DEATHFIRE_GREATSWORD.getAdditionalAttributes());
        var spells =  SpellDataRegistryHolder.of(new SpellDataRegistryHolder(SpellRegistry.FLAMING_STRIKE_SPELL, 10));
        return MagicalSwordItemHelper.create(tier, spells, attributes, properties);
    });
    public static final RegistryObject<Item> SOULFIRE_GREATSWORD = ITEMS.register("soulfire_greatsword", () -> {
        var tier = COCExtendedWeaponTiers.SOULFIRE_GREATSWORD;
        var properties = ItemPropertiesHelper.equipment().rarity(Rarity.RARE);
        var attributes = AttributeContainer.build("mainhand", COCExtendedWeaponTiers.SOULFIRE_GREATSWORD.getAdditionalAttributes());
        var spells =  SpellDataRegistryHolder.of(new SpellDataRegistryHolder(SpellRegistry.FLAMING_STRIKE_SPELL, 7));
        return MagicalSwordItemHelper.create(tier, spells, attributes, properties);
    });

    public static final RegistryObject<Item> ANGELIC_ANNHILATOR = ITEMS.register("angelic_annhilator", () -> {
        var tier = COCExtendedWeaponTiers.ANGELIC_ANNHILATOR;
        var properties = ItemPropertiesHelper.equipment().rarity(Rarity.RARE);
        var attributes = AttributeContainer.build("mainhand", COCExtendedWeaponTiers.ANGELIC_ANNHILATOR.getAdditionalAttributes());
        var spells =  SpellDataRegistryHolder.of(new SpellDataRegistryHolder(SpellRegistry.DIVINE_SMITE_SPELL, 7));
        return MagicalSwordItemHelper.create(tier, spells, attributes, properties);
    });

    public static final RegistryObject<Item> EXCALIBUR = ITEMS.register("excalibur", () -> {
        var tier = COCExtendedWeaponTiers.EXCALIBUR;
        var properties = ItemPropertiesHelper.equipment().rarity(Rarity.RARE);
        var attributes = AttributeContainer.build("mainhand", COCExtendedWeaponTiers.EXCALIBUR.getAdditionalAttributes());
        var spells =  SpellDataRegistryHolder.of(new SpellDataRegistryHolder(SpellRegistry.DIVINE_SMITE_SPELL, 6));
        return MagicalSwordItemHelper.create(tier, spells, attributes, properties);
    });
    public static final RegistryObject<Item> THUNDERBRINGER = ITEMS.register("thunderbringer", () -> {
        var tier = COCExtendedWeaponTiers.THUNDERBRINGER;
        var properties = ItemPropertiesHelper.equipment().rarity(Rarity.RARE);
        var attributes = AttributeContainer.build("mainhand", COCExtendedWeaponTiers.THUNDERBRINGER.getAdditionalAttributes());
        var spells =  SpellDataRegistryHolder.of(new SpellDataRegistryHolder(SpellRegistry.THUNDERSTORM_SPELL, 9));
        return MagicalSwordItemHelper.create(tier, spells, attributes, properties);
    });
    public static final RegistryObject<Item> BRUTIS = ITEMS.register("brutis", () -> {
        var tier = COCExtendedWeaponTiers.BRUTIS;
        var properties = ItemPropertiesHelper.equipment().rarity(Rarity.RARE);
        var attributes = AttributeContainer.build("mainhand", COCExtendedWeaponTiers.BRUTIS.getAdditionalAttributes());
        var spells =  SpellDataRegistryHolder.of(new SpellDataRegistryHolder(SpellRegistry.SACRIFICE_SPELL, 7));
        return MagicalSwordItemHelper.create(tier, spells, attributes, properties);
    });
    public static final RegistryObject<Item> WORLDBREAKER = ITEMS.register("worldbreaker", () -> {
        var tier = COCExtendedWeaponTiers.WORLD_BREAKER;
        var properties = ItemPropertiesHelper.equipment().rarity(Rarity.RARE);
        var attributes = AttributeContainer.build("mainhand", COCExtendedWeaponTiers.WORLD_BREAKER.getAdditionalAttributes());
        var spells =  SpellDataRegistryHolder.of(new SpellDataRegistryHolder(SpellRegistry.EARTHQUAKE_SPELL, 11));
        return MagicalSwordItemHelper.create(tier, spells, attributes, properties);
    });
    public static final RegistryObject<Item> SCULK_SLICER = ITEMS.register("sculk_slicer", () -> {
        var tier = COCExtendedWeaponTiers.SCULK_SLICER;
        var properties = ItemPropertiesHelper.equipment().rarity(Rarity.RARE);
        var attributes = AttributeContainer.build("mainhand", COCExtendedWeaponTiers.SCULK_SLICER.getAdditionalAttributes());
        var spells =  SpellDataRegistryHolder.of(new SpellDataRegistryHolder(SpellRegistry.SONIC_BOOM_SPELL, 4));
        return MagicalSwordItemHelper.create(tier, spells, attributes, properties);
    });
    public static final RegistryObject<Item> MONOSWORD = ITEMS.register("monosword", () -> {
        var tier = COCExtendedWeaponTiers.MONOSWORD;
        var properties = ItemPropertiesHelper.equipment().rarity(Rarity.RARE);
        var attributes = AttributeContainer.build("mainhand", COCExtendedWeaponTiers.MONOSWORD.getAdditionalAttributes());
        var spells =  SpellDataRegistryHolder.of(/*new SpellDataRegistryHolder(SpellRegistry.PERSONA_BOND, 1)*/);
        return MagicalSwordItemHelper.create(tier, spells, attributes, properties);
    });
    public static final RegistryObject<Item> PLASMASWORD = ITEMS.register("plasmasword", () -> {
        var tier = COCExtendedWeaponTiers.PLASMASWORD;
        var properties = ItemPropertiesHelper.equipment().rarity(Rarity.RARE);
        var attributes = AttributeContainer.build("mainhand", COCExtendedWeaponTiers.PLASMASWORD.getAdditionalAttributes());
        var spells =  SpellDataRegistryHolder.of(/*new SpellDataRegistryHolder(SpellRegistry.PERSONA_BOND, 1)*/);
        return MagicalSwordItemHelper.create(tier, spells, attributes, properties);
    });
    public static final RegistryObject<Item> TRIBLADE = ITEMS.register("tri_blade", TriBladeItem::new);

    public static final RegistryObject<Item> BLOOD_SOUL_MASK = ITEMS.register("blood_soul_mask", () -> {
        var type = ArmorItem.Type.HELMET;
        var durability = ItemHelper.getAmorBaseDurability(type) * 19;
        return new BloodSoulArmorItem(type, ItemPropertiesHelper.equipment(1).fireResistant().durability(durability));
    });
    public static final RegistryObject<Item> BLOOD_SOUL_ROBES = ITEMS.register("blood_soul_robes", () -> {
        var type = ArmorItem.Type.CHESTPLATE;
        var durability = ItemHelper.getAmorBaseDurability(type) * 19;
        return new BloodSoulArmorItem(type, ItemPropertiesHelper.equipment(1).fireResistant().durability(durability));
    });
    public static final RegistryObject<Item> BLOOD_SOUL_LEGGINGS = ITEMS.register("blood_soul_leggings", () ->
            new BloodSoulArmorItem(
                    ArmorItem.Type.LEGGINGS,
                    ItemPropertiesHelper.equipment(1).fireResistant().durability(ItemHelper.getAmorBaseDurability(ArmorItem.Type.LEGGINGS) * 19))
    );
    public static final RegistryObject<Item> BLOOD_SOUL_BOOTS = ITEMS.register("blood_soul_boots", () -> new BloodSoulArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ItemHelper.getAmorBaseDurability(ArmorItem.Type.BOOTS) * 19)));
    public static final RegistryObject<Item> WARDEN_HUNTER_HELMET = ITEMS.register("warden_hunter_helmet", () -> new WardenHunterArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ItemHelper.getAmorBaseDurability(ArmorItem.Type.HELMET) * 19)));
    public static final RegistryObject<Item> WARDEN_HUNTER_ARMOR = ITEMS.register("warden_hunter_armor", () -> new WardenHunterArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ItemHelper.getAmorBaseDurability(ArmorItem.Type.CHESTPLATE) * 19)));
    public static final RegistryObject<Item> WARDEN_HUNTER_LEGGINGS = ITEMS.register("warden_hunter_leggings", () -> new WardenHunterArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ItemHelper.getAmorBaseDurability(ArmorItem.Type.LEGGINGS) * 19)));
    public static final RegistryObject<Item> WARDEN_HUNTER_BOOTS = ITEMS.register("warden_hunter_boots", () -> new WardenHunterArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ItemHelper.getAmorBaseDurability(ArmorItem.Type.BOOTS) * 19)));
    public static final RegistryObject<Item> BLOSSOM_CLOAK_HELMET = ITEMS.register("blossom_cloak_hood", () -> new BlossomCloakArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ItemHelper.getAmorBaseDurability(ArmorItem.Type.HELMET) * 19)));
    public static final RegistryObject<Item> BLOSSOM_CLOAK_ARMOR = ITEMS.register("blossom_cloak_robes", () -> new BlossomCloakArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ItemHelper.getAmorBaseDurability(ArmorItem.Type.CHESTPLATE) * 19)));
    public static final RegistryObject<Item> BLOSSOM_CLOAK_LEGGINGS = ITEMS.register("blossom_cloak_leggings", () -> new BlossomCloakArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ItemHelper.getAmorBaseDurability(ArmorItem.Type.LEGGINGS) * 19)));
    public static final RegistryObject<Item> BLOSSOM_CLOAK_BOOTS = ITEMS.register("blossom_cloak_boots", () -> new BlossomCloakArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ItemHelper.getAmorBaseDurability(ArmorItem.Type.BOOTS) * 19)));
    public static final RegistryObject<Item> LIGTNING_HERALD_HELMET = ITEMS.register("ligtning_herald_helmet", () -> new LightningHeraldArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ItemHelper.getAmorBaseDurability(ArmorItem.Type.HELMET) * 19)));
    public static final RegistryObject<Item> LIGTNING_HERALD_ARMOR = ITEMS.register("ligtning_herald_chestplate", () -> new LightningHeraldArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ItemHelper.getAmorBaseDurability(ArmorItem.Type.CHESTPLATE) * 19)));
    public static final RegistryObject<Item> LIGTNING_HERALD_LEGGINGS = ITEMS.register("ligtning_herald_leggings", () -> new LightningHeraldArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ItemHelper.getAmorBaseDurability(ArmorItem.Type.LEGGINGS) * 19)));
    public static final RegistryObject<Item> LIGTNING_HERALD_BOOTS = ITEMS.register("ligtning_herald_boots", () -> new LightningHeraldArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ItemHelper.getAmorBaseDurability(ArmorItem.Type.BOOTS) * 19)));
    public static final RegistryObject<Item> FROSTBITE_HELMET = ITEMS.register("frostbite_helmet", () -> new FrostbiteArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ItemHelper.getAmorBaseDurability(ArmorItem.Type.HELMET) * 19)));
    public static final RegistryObject<Item> FROSTBITE_ARMOR = ITEMS.register("frostbite_chestplate", () -> new FrostbiteArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ItemHelper.getAmorBaseDurability(ArmorItem.Type.CHESTPLATE) * 19)));
    public static final RegistryObject<Item> FROSTBITE_LEGGINGS = ITEMS.register("frostbite_leggings", () -> new FrostbiteArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ItemHelper.getAmorBaseDurability(ArmorItem.Type.LEGGINGS) * 19)));
    public static final RegistryObject<Item> FROSTBITE_BOOTS = ITEMS.register("frostbite_boots", () -> new FrostbiteArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ItemHelper.getAmorBaseDurability(ArmorItem.Type.BOOTS) * 19)));

    public static final RegistryObject<Item> SAKURA_BLOSSOM_CLOAK_HELMET = ITEMS.register("sakura_blossom_cloak_hood", () -> new SakuraBlossomCloakArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ItemHelper.getAmorBaseDurability(ArmorItem.Type.HELMET) * 19)));
    public static final RegistryObject<Item> SAKURA_BLOSSOM_CLOAK_ARMOR = ITEMS.register("sakura_blossom_cloak_robes", () -> new SakuraBlossomCloakArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ItemHelper.getAmorBaseDurability(ArmorItem.Type.CHESTPLATE) * 19)));
    public static final RegistryObject<Item> SAKURA_BLOSSOM_CLOAK_LEGGINGS = ITEMS.register("sakura_blossom_cloak_leggings", () -> new SakuraBlossomCloakArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ItemHelper.getAmorBaseDurability(ArmorItem.Type.LEGGINGS) * 19)));
    public static final RegistryObject<Item> SAKURA_BLOSSOM_CLOAK_BOOTS = ITEMS.register("sakura_blossom_cloak_boots", () -> new SakuraBlossomCloakArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ItemHelper.getAmorBaseDurability(ArmorItem.Type.BOOTS) * 19)));

    public static final RegistryObject<Item> CODEX_SPELLBOOK = ITEMS.register("codex_of_champions_spellbook", () -> {
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        var attribute1 = new AttributeContainer(AttributeRegistry.SPELL_POWER.get(), .15F, AttributeModifier.Operation.MULTIPLY_BASE);
        var attribute2 = new AttributeContainer(AttributeRegistry.MAX_MANA.get(), .15F, AttributeModifier.Operation.MULTIPLY_BASE);
        builder.put(attribute1.attribute() , attribute1.createModifier("spellbook"));
        builder.put(attribute2.attribute() , attribute2.createModifier("spellbook"));
        return new SimpleAttributeSpellBook(12, SpellRarity.UNCOMMON, builder.build());
    });
    public static final RegistryObject<Item> ARUROA_SPELLBOOK = ITEMS.register("aurora_spellbook", () -> {
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        var attribute1 = new AttributeContainer(AttributeRegistry.ICE_SPELL_POWER.get(), .10F, AttributeModifier.Operation.MULTIPLY_BASE);
        var attribute2 = new AttributeContainer(AttributeRegistry.MAX_MANA.get(), 200, AttributeModifier.Operation.ADDITION);
        builder.put(attribute1.attribute() , attribute1.createModifier("spellbook"));
        builder.put(attribute2.attribute() , attribute2.createModifier("spellbook"));
        return new SimpleAttributeSpellBook(10, SpellRarity.UNCOMMON, builder.build());
    });

    public static final RegistryObject<Item> NAMELESS_STAFF = ITEMS.register("nameless_staff", () ->
            new StaffItem(ItemPropertiesHelper.equipment(1).fireResistant().rarity(Rarity.RARE),
                    COCStaffTier.NAMELESS_STAFF.getAttackDamageBonus(),
                    COCStaffTier.NAMELESS_STAFF.getSpeed(),
                    AttributeContainer.build("mainhand", COCStaffTier.NAMELESS_STAFF.getAdditionalAttributes())));
}