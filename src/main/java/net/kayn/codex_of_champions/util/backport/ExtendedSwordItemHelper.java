//package net.kayn.codex_of_champions.util.backport;
//
//import com.google.common.collect.ImmutableMultimap;
//import com.google.common.collect.Multimap;
//import net.minecraft.world.entity.EquipmentSlot;
//import net.minecraft.world.entity.ai.attributes.Attribute;
//import net.minecraft.world.entity.ai.attributes.AttributeModifier;
//import net.minecraft.world.entity.ai.attributes.Attributes;
//
//public class ExtendedSwordItemHelper {
//    public static Multimap<Attribute, AttributeModifier> createAttributes(IronsWeaponTier pTier) {
//        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
//        builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_ID, (double)pTier.getAttackDamageBonus(), AttributeModifier.Operation.ADDITION));
//        builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_ID, (double)pTier.getSpeed(), AttributeModifier.Operation.ADDITION));
//        for(AttributeContainer holder : pTier.getAdditionalAttributes()) {
//            builder.put(holder.attribute(), holder.createModifier(EquipmentSlot.MAINHAND.getName()));
//        }
//
//        return builder.build();
//    }
//}
