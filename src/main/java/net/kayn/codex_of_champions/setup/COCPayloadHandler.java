package net.kayn.codex_of_champions.setup;

import net.kayn.codex_of_champions.CodexOfChampions;
import net.kayn.codex_of_champions.network.particles.PetalStepParticlesPacket;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;

public class COCPayloadHandler {
    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel CHANNEL = NetworkRegistry.newSimpleChannel(
            new ResourceLocation(CodexOfChampions.MODID, "main"),
            () -> PROTOCOL_VERSION,
            PROTOCOL_VERSION::equals,
            PROTOCOL_VERSION::equals
    );

    public static void register() {
        int id = 0;
        CHANNEL.registerMessage(id++, PetalStepParticlesPacket.class, PetalStepParticlesPacket::write, PetalStepParticlesPacket::new, PetalStepParticlesPacket::handle);
    }
}