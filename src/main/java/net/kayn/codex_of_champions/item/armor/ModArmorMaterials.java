package net.kayn.codex_of_champions.item.armor;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    BLOOD_SOUL_MATERIAL("blood_soul",
            19,
            new int[]{6, 8, 10, 6},
            9,
            0.0F,
            0.0F,
            () -> Ingredient.of(Items.DIAMOND)),
    WARDEN_HUNTER_MATERIAL("warden_hunter",
            19,
            new int[]{6, 8, 10, 6},
            16,
            2.0F,
            1.0F,
            () -> Ingredient.of(Items.DIAMOND)),
    BLOSSOM_CLOAK_MATERIAL("blossom_cloak",
            19,
            new int[]{6, 8, 10, 6},
            16,
            2.0F,
            1.0F,
            () -> Ingredient.of(Items.DIAMOND)),
    LIGHTNING_HERALD_MATERIAL("lightning_herald",
            19,
            new int[]{6, 8, 10, 6},
            16,
            2.0F,
            1.0F,
            () -> Ingredient.of(Items.DIAMOND)),
    FROSTBITE_MATERIAL("frostbite",
            19,
            new int[]{6, 8, 10, 6},
            16,
            2.0F,
            1.0F,
            () -> Ingredient.of(Items.DIAMOND)),
    SAKURA_BLOSSOM_CLOAK_MATERIAL("sakura_blossom_cloak",
            19,
            new int[]{6, 8, 10, 6},
            16,
            2.0F,
            1.0F,
            () -> Ingredient.of(Items.DIAMOND));



    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};

    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantability;
    private static final SoundEvent equipSound = SoundEvents.ARMOR_EQUIP_NETHERITE;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    ModArmorMaterials(String name, int durabilityMultiplier, int[] slotProtections, int enchantability,
                      float toughness, float knockbackResistance,
                      Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantability = enchantability;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type slot) {
        return BASE_DURABILITY[slot.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type slot) {
        return this.slotProtections[slot.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return name; // full ID will be "modid:my_material"
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}