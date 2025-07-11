package net.kayn.codex_of_champions.item.weapons;

import dev.shadowsoffire.attributeslib.api.ALObjects;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.registries.ItemRegistry;
import net.kayn.codex_of_champions.util.backport.AttributeContainer;
import net.kayn.codex_of_champions.util.backport.IronsWeaponTier;
import net.minecraft.core.Holder;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.kayn.codex_of_champions.Registry.ItemRegistries;

import java.util.function.Supplier;

public class COCExtendedWeaponTiers implements Tier, IronsWeaponTier {
    //  Crystal Claymore
    public static COCExtendedWeaponTiers CRYSTAL_CLAYMORE = new COCExtendedWeaponTiers(12000, 12, -3.5F, 10, BlockTags.WOOL, () -> Ingredient.of(ItemRegistries.VEXED_PAGE.get()),
            new AttributeContainer(AttributeRegistry.EVOCATION_SPELL_POWER.get(), 0.15, AttributeModifier.Operation.MULTIPLY_BASE));
    //  Soulfire Greatsword
    public static COCExtendedWeaponTiers SOULFIRE_GREATSWORD = new COCExtendedWeaponTiers(12000, 10, -3.0F, 10, BlockTags.WOOL, () -> Ingredient.of(ItemRegistries.SOUL_FORGED_INGOT.get()),
            new AttributeContainer(AttributeRegistry.FIRE_SPELL_POWER.get(), 0.15, AttributeModifier.Operation.MULTIPLY_BASE),
            new AttributeContainer(ALObjects.Attributes.OVERHEAL.get(), 0.125, AttributeModifier.Operation.ADDITION)
            );

    //  Deathfire Greatsword
    public static COCExtendedWeaponTiers DEATHFIRE_GREATSWORD = new COCExtendedWeaponTiers(16000, 11, -3.2F, 10, BlockTags.WOOL, () -> Ingredient.of(ItemRegistries.SOUL_FORGED_INGOT.get()),
            new AttributeContainer(AttributeRegistry.ELDRITCH_MAGIC_RESIST.get(), 0.10, AttributeModifier.Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.FIRE_SPELL_POWER.get(), 0.20, AttributeModifier.Operation.MULTIPLY_BASE),
            new AttributeContainer(ALObjects.Attributes.OVERHEAL.get(), 0.25, AttributeModifier.Operation.ADDITION)
    );
//Angelic Annhilator
    public static COCExtendedWeaponTiers ANGELIC_ANNHILATOR = new COCExtendedWeaponTiers(16000, 8, -2.5F, 10, BlockTags.WOOL, () -> Ingredient.of(ItemRegistries.DIVINE_STAR.get()),
            new AttributeContainer(AttributeRegistry.HOLY_SPELL_POWER.get(), 0.20, AttributeModifier.Operation.MULTIPLY_BASE),
            new AttributeContainer(ALObjects.Attributes.HEALING_RECEIVED.get(), 0.20, AttributeModifier.Operation.ADDITION)
    );
//Exaclibur
    public static COCExtendedWeaponTiers EXCALIBUR = new COCExtendedWeaponTiers(16000, 7, -2.5F, 10, BlockTags.WOOL, () -> Ingredient.of(ItemRegistries.DIVINE_STAR.get()),
            new AttributeContainer(AttributeRegistry.HOLY_SPELL_POWER.get(), 0.15, AttributeModifier.Operation.MULTIPLY_BASE)
    );
    //Thunderbringer
    public static COCExtendedWeaponTiers THUNDERBRINGER = new COCExtendedWeaponTiers(16000, 10, -3.2F, 10, BlockTags.WOOL, () -> Ingredient.of(ItemRegistries.DIVINE_STAR.get()),
            new AttributeContainer(AttributeRegistry.LIGHTNING_SPELL_POWER.get(), 0.20, AttributeModifier.Operation.MULTIPLY_BASE),
            new AttributeContainer(Attributes.MOVEMENT_SPEED, 0.02, AttributeModifier.Operation.ADDITION)
    );
    //Brutis
    public static COCExtendedWeaponTiers BRUTIS = new COCExtendedWeaponTiers(16000, 6, -2.5F, 10, BlockTags.WOOL, () -> Ingredient.of(ItemRegistries.WITHER_BONE.get()),
            new AttributeContainer(AttributeRegistry.BLOOD_SPELL_POWER.get(), 0.20, AttributeModifier.Operation.MULTIPLY_BASE)
//            new AttributeContainer(Attributes.SNEAKING_SPEED, 20, AttributeModifier.Operation.ADDITION)
    );
    //World Breaker
    public static COCExtendedWeaponTiers WORLD_BREAKER = new COCExtendedWeaponTiers(16000, 12, -3.5F, 10, BlockTags.WOOL, () -> Ingredient.of(ItemRegistries.GAIA_FRUIT.get()),
            new AttributeContainer(AttributeRegistry.NATURE_SPELL_POWER.get(), 0.20, AttributeModifier.Operation.MULTIPLY_BASE),
            new AttributeContainer(ALObjects.Attributes.OVERHEAL.get(), 0.2, AttributeModifier.Operation.ADDITION)
    );
    //Sculk Slicer
    public static COCExtendedWeaponTiers SCULK_SLICER = new COCExtendedWeaponTiers(16000, 6, -2.5F, 10, BlockTags.WOOL, () -> Ingredient.of(ItemRegistries.SCULK_RIB.get()),
            new AttributeContainer(AttributeRegistry.ELDRITCH_SPELL_POWER.get(), 0.20, AttributeModifier.Operation.MULTIPLY_BASE),
            new AttributeContainer(ALObjects.Attributes.CURRENT_HP_DAMAGE.get(), 0.05, AttributeModifier.Operation.ADDITION)
    );
    //Monosword
    public static COCExtendedWeaponTiers MONOSWORD = new COCExtendedWeaponTiers(16000, 9, -2.5F, 10, BlockTags.WOOL, () -> Ingredient.of(ItemRegistry.DIVINE_PEARL.get()),
            new AttributeContainer(AttributeRegistry.MAX_MANA.get(), 250, AttributeModifier.Operation.ADDITION),
            new AttributeContainer(ALObjects.Attributes.ARMOR_SHRED.get(), 0.25, AttributeModifier.Operation.ADDITION)
    );
    //Plasmasword
    public static COCExtendedWeaponTiers PLASMASWORD = new COCExtendedWeaponTiers(16000, 9, -2.5F, 10, BlockTags.WOOL, () -> Ingredient.of(ItemRegistry.DIVINE_PEARL.get()),
            new AttributeContainer(AttributeRegistry.MAX_MANA.get(), 300, AttributeModifier.Operation.ADDITION),
            new AttributeContainer(ALObjects.Attributes.ARMOR_SHRED.get(), 0.30, AttributeModifier.Operation.ADDITION)
    );
    //Tri-Sword
    public static COCExtendedWeaponTiers TRISWORD = new COCExtendedWeaponTiers(16000, 9, -2.5F, 10, BlockTags.WOOL, () -> Ingredient.of(ItemRegistry.BLANK_RUNE.get()),
            new AttributeContainer(AttributeRegistry.MAX_MANA.get(), 50, AttributeModifier.Operation.ADDITION),
            new AttributeContainer(AttributeRegistry.NATURE_SPELL_POWER.get(), 0.10, AttributeModifier.Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.ICE_SPELL_POWER.get(), 0.10, AttributeModifier.Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.FIRE_SPELL_POWER.get(), 0.10, AttributeModifier.Operation.MULTIPLY_BASE)
    );
    


    //private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final TagKey<Block> incorrectBlocksForDrops;
    private final Supplier<Ingredient> repairIngredient;
    private final AttributeContainer[] attributeContainers;

    private COCExtendedWeaponTiers(int uses, float damage, float speed, int enchantmentValue, TagKey<Block> incorrectBlocksForDrops, Supplier<Ingredient> repairIngredient, AttributeContainer... attributes) {
        //this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.incorrectBlocksForDrops = incorrectBlocksForDrops;
        this.repairIngredient = repairIngredient;
        this.attributeContainers = attributes;
    }

    @Override
    public AttributeContainer[] getAdditionalAttributes() {
        return this.attributeContainers;
    }

    @Override
    public int getUses() {
        return uses;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return damage;
    }

    @Override
    public int getLevel() {
        return 0;
    }

//    @Override
//    public TagKey<Block> getIncorrectBlocksForDrops() {
//        return incorrectBlocksForDrops;
//    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}