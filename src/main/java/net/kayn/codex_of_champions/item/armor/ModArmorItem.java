package net.kayn.codex_of_champions.item.armor;

import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import net.kayn.codex_of_champions.util.backport.AttributeContainer;
import net.kayn.codex_of_champions.util.backport.AttributeUtil;
import net.kayn.codex_of_champions.util.backport.GeoRenderProvider;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.util.GeckoLibUtil;

import javax.annotation.Nullable;
import java.util.function.Consumer;

public class ModArmorItem extends ArmorItem implements GeoItem {
    // I copied this stuff from DTE, once you have this armor item class set up
    // You don't need to touch it any further
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    private final Multimap<Attribute, AttributeModifier> defaultModifiers;

    public ModArmorItem(ArmorMaterial material, Type type, Properties properties, AttributeContainer... attributeContainers) {
        super(material, type, properties);
        {
            int i = material.getDefenseForType(type);
            float f = material.getToughness();
            ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
//            EquipmentSlotGroup equipmentSlotGroup = EquipmentSlotGroup.bySlot(type.getSlot());
            ResourceLocation resourceLocation = ResourceLocation.withDefaultNamespace("armor." + type.getName());
            builder.put(
                    Attributes.ARMOR,
                    new AttributeModifier(
                            AttributeUtil.getSlotUUID(type.getSlot()),
                            resourceLocation.toString(),
                            i,
                            AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ARMOR_TOUGHNESS,
                    new AttributeModifier(
                            AttributeUtil.getSlotUUID(type.getSlot()),
                            resourceLocation.toString(),
                            i,
                            AttributeModifier.Operation.ADDITION));
            float resistance = material.getKnockbackResistance();
            if (resistance > 0.0F) {
                builder.put(Attributes.KNOCKBACK_RESISTANCE,
                        new AttributeModifier(
                                AttributeUtil.getSlotUUID(type.getSlot()),
                                resourceLocation.toString(),
                                i,
                                AttributeModifier.Operation.ADDITION));
            }
            for (AttributeContainer holder : attributeContainers) {
                builder.put(holder.attribute(), holder.createModifier(type.getSlot().getName(), ItemStack.EMPTY));
            }

            this.defaultModifiers = builder.build();
        }
    }

    // These two methods are used for giving additional attributes to armor sets. Feel free to edit these!
    public static AttributeContainer[] schoolAttributes(Attribute school, int mana, float schoolSpellPower, float spellPower)
    {
        return new AttributeContainer[]{
                new AttributeContainer(AttributeRegistry.MAX_MANA.get(), mana, AttributeModifier.Operation.ADDITION),
                new AttributeContainer(school, schoolSpellPower, AttributeModifier.Operation.MULTIPLY_BASE),
                new AttributeContainer(AttributeRegistry.SPELL_POWER.get(), spellPower, AttributeModifier.Operation.MULTIPLY_BASE),
        };

    }

    // Can also be used for giving two attributes, doesn't have to be resistance
    public static AttributeContainer[] schoolAttributesWithResistance(Attribute school, Attribute resistSchool, int mana, float schoolSpellPower, float spellPower, float resistSpellPower)
    {
        return new AttributeContainer[]{
                new AttributeContainer(AttributeRegistry.MAX_MANA.get(), mana, AttributeModifier.Operation.ADDITION),
                new AttributeContainer(school, schoolSpellPower, AttributeModifier.Operation.MULTIPLY_BASE),
                new AttributeContainer(resistSchool, resistSpellPower, AttributeModifier.Operation.MULTIPLY_BASE),
                new AttributeContainer(AttributeRegistry.SPELL_POWER.get(), spellPower, AttributeModifier.Operation.MULTIPLY_BASE)};
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot slot) {
        return this.defaultModifiers;
    }

    // Geckolib
    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        // Don't put anything in here, no need to
        //controllers.add(new AnimationController<ModArmorItem>(this, "controller", this::predicate));
    }

//    // Don't do anything w/ this
//    private PlayState predicate(AnimationState<ModArmorItem> itemAnimationState)
//    {
//        itemAnimationState.getController().setAnimation(RawAnimation.begin().thenLoop("idle"));
//        return PlayState.CONTINUE;
//    }


    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

//    @Override
//    public void createGeoRenderer(Consumer<GeoRenderProvider> consumer) {
//        consumer.accept(new GeoRenderProvider() {
//            private GeoArmorRenderer<?> renderer;
//
//            @Override
//            public <T extends LivingEntity> HumanoidModel<?> getGeoArmorRenderer(@Nullable T livingEntity, ItemStack itemStack, @Nullable EquipmentSlot equipmentSlot, @Nullable HumanoidModel<T> original) {
//                if (this.renderer == null) {
//                    this.renderer = supplyRenderer();
//                }
//                return this.renderer;
//            }
//        });
//    }

    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return null;
    }
}
