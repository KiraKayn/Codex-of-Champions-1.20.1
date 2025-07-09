package net.kayn.codex_of_champions.network.particles;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.phys.Vec3;
import net.kayn.codex_of_champions.CodexOfChampions;
import net.kayn.codex_of_champions.player.COCClientSpellCastHelper;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class PetalStepParticlesPacket {
    private final Vec3 pos1;
    private final Vec3 pos2;

    public PetalStepParticlesPacket(Vec3 pos1, Vec3 pos2) {
        this.pos1 = pos1;
        this.pos2 = pos2;
    }

    public PetalStepParticlesPacket(FriendlyByteBuf buf) {
        pos1 = new Vec3(buf.readDouble(), buf.readDouble(), buf.readDouble());
        pos2 = new Vec3(buf.readDouble(), buf.readDouble(), buf.readDouble());
    }

    public void write(FriendlyByteBuf buf) {
        buf.writeDouble(pos1.x);
        buf.writeDouble(pos1.y);
        buf.writeDouble(pos1.z);
        buf.writeDouble(pos2.x);
        buf.writeDouble(pos2.y);
        buf.writeDouble(pos2.z);
    }

    public static void handle(PetalStepParticlesPacket packet, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> {
            COCClientSpellCastHelper.handleClientboundPetalStep(packet.pos1, packet.pos2);
        });
        context.setPacketHandled(true);
    }
}