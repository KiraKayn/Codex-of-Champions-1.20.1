package net.kayn.codex_of_champions.Registry;
import net.kayn.codex_of_champions.CodexOfChampions;
import net.kayn.codex_of_champions.spells.eldritch.PersonaBondSpell;
import net.kayn.codex_of_champions.spells.ender.MissileSalvo;
import net.kayn.codex_of_champions.spells.fire.FireCluster;
import net.kayn.codex_of_champions.spells.nature.PetalStep;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import java.util.function.Supplier;
import static io.redspace.ironsspellbooks.api.registry.SpellRegistry.SPELL_REGISTRY_KEY;

public class SpellRegistry {
    public static final DeferredRegister<AbstractSpell> SPELLS = DeferredRegister.create(SPELL_REGISTRY_KEY, CodexOfChampions.MODID);

    public static Supplier<AbstractSpell> registerSpell(AbstractSpell spell) {
        return SPELLS.register(spell.getSpellName(), () -> spell);
    }

    public static final Supplier<AbstractSpell> PERSONA_BOND = registerSpell(new PersonaBondSpell());

    public static final Supplier<AbstractSpell> MISSILE_SALVO = registerSpell(new MissileSalvo());

    public static final Supplier<AbstractSpell> PETAL_STEP = registerSpell(new PetalStep());

    public static final Supplier<AbstractSpell> FIRE_CLUSTER = registerSpell(new FireCluster());

    public static void register(IEventBus eventBus)
    {
        SPELLS.register(eventBus);
    }
}