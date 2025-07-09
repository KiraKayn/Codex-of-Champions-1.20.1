package net.kayn.codex_of_champions.Registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.kayn.codex_of_champions.CodexOfChampions;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

public class EntityRegistry {
    private static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(Registries.ENTITY_TYPE, CodexOfChampions.MODID);

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }
}