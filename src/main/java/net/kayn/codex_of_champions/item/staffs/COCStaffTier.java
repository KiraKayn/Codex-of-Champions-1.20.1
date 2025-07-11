package net.kayn.codex_of_champions.item.staffs;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import net.kayn.codex_of_champions.util.backport.AttributeContainer;
import net.kayn.codex_of_champions.util.backport.IronsWeaponTier;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;

public class COCStaffTier  implements IronsWeaponTier {
    // Staff of Vehemence
    public static COCStaffTier NAMELESS_STAFF = new COCStaffTier(3, -3,
            new AttributeContainer(AttributeRegistry.FIRE_SPELL_POWER.get(), 0.15f, AttributeModifier.Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.BLOOD_SPELL_POWER.get(), 0.15f, AttributeModifier.Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.COOLDOWN_REDUCTION.get(), 0.1f, AttributeModifier.Operation.MULTIPLY_BASE)
    );


    float damage;
    float speed;
    AttributeContainer[] attributeContainers;

    public COCStaffTier(float damage, float speed, AttributeContainer... attributeContainers)
    {
        this.damage = damage;
        this.speed = speed;
        this.attributeContainers = attributeContainers;
    }

    @Override
    public float getAttackDamageBonus() {
        return damage;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public AttributeContainer[] getAdditionalAttributes() {
        return this.attributeContainers;
    }
}