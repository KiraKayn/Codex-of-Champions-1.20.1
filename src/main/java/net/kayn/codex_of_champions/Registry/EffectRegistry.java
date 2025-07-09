package net.kayn.codex_of_champions.Registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.kayn.codex_of_champions.CodexOfChampions;
import net.kayn.codex_of_champions.effects.PersonaBond;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EffectRegistry {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CodexOfChampions.MODID);

    public static final RegistryObject<MobEffect> PersonaBond = MOB_EFFECTS.register("persona_bond",
            () -> new PersonaBond(MobEffectCategory.BENEFICIAL, 0x657832)
                    .addAttributeModifier(Attributes.MOVEMENT_SPEED,
                            new ResourceLocation(CodexOfChampions.MODID, "persona_bond").toString(), 0.15f,
                            AttributeModifier.Operation.MULTIPLY_BASE)
                    .addAttributeModifier(Attributes.ATTACK_DAMAGE,
                            new ResourceLocation(CodexOfChampions.MODID, "persona_bond").toString(), 0.15f,
                            AttributeModifier.Operation.MULTIPLY_BASE));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}