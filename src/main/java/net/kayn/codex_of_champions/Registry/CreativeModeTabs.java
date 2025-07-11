//package net.kayn.codex_of_champions.Registry;
//
//import net.minecraft.core.registries.Registries;
//import net.minecraft.network.chat.Component;
//import net.minecraft.world.item.CreativeModeTab;
//import net.minecraft.world.item.ItemStack;
//import net.kayn.codex_of_champions.CodexOfChampions;
//import net.minecraftforge.eventbus.api.IEventBus;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.RegistryObject;
//
//public class CreativeModeTabs {
//    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
//            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CodexOfChampions.MODID);
//
//    public static final RegistryObject<CreativeModeTab> CODEX_OF_CHAMPIONS = CREATIVE_MODE_TAB.register("codex_of_champions",
//            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemRegistries.FLOWERING_PENDANT.get()))
//                    .title(Component.translatable("creativetab.codex_of_champions.codex_of_champions"))
//                    .displayItems((itemDisplayParameters, output) -> {
//                        output.accept(ItemRegistries.FLOWERING_PENDANT.get());
//                        output.accept(ItemRegistries.TRUEFIREWARDRING.get());
//                        output.accept(ItemRegistries.BLOOD_SOUL_MASK.get());
//                        output.accept(ItemRegistries.BLOOD_SOUL_ROBES.get());
//                        output.accept(ItemRegistries.BLOOD_SOUL_LEGGINGS.get());
//                        output.accept(ItemRegistries.BLOOD_SOUL_BOOTS.get());
//                        output.accept(ItemRegistries.ARCANE_UPGRADE_TEMPLATE.get());
//                        output.accept(ItemRegistries.CODEX_SPELLBOOK.get());
//                        output.accept(ItemRegistries.SOUL_FORGED_INGOT.get());
//                        output.accept(ItemRegistries.AzureAnlaceCurio.get());
//                        output.accept(ItemRegistries.CHAOSORBCURIO.get());
//                        output.accept(ItemRegistries.VAMPIRICCHARMCURIO.get());
//                        output.accept(ItemRegistries.ROYALROSECURIO.get());
//                        output.accept(ItemRegistries.ROYALANLACECURIO.get());
//                        output.accept(ItemRegistries.DIVINE_STAR.get());
//                        output.accept(ItemRegistries.WITHER_BONE.get());
//                        output.accept(ItemRegistries.GAIA_FRUIT.get());
//                        output.accept(ItemRegistries.ETERNAL_ICE.get());
//                        output.accept(ItemRegistries.BLAZE_CORE.get());
//                        output.accept(ItemRegistries.ELECTRIFIED_BRONZE.get());
//                        output.accept(ItemRegistries.REINFORCED_ENDER_EYE.get());
//                        output.accept(ItemRegistries.SCULK_RIB.get());
//                        output.accept(ItemRegistries.VEXED_PAGE.get());
//                        output.accept(ItemRegistries.BRUTIS.get());
//                        output.accept(ItemRegistries.EXCALIBUR.get());
//                        output.accept(ItemRegistries.ANGELIC_ANNHILATOR.get());
//                        output.accept(ItemRegistries.CRYSTAL_CLAYMORE.get());
//                        output.accept(ItemRegistries.SOULFIRE_GREATSWORD.get());
//                        output.accept(ItemRegistries.DEATHFIRE_GREATSWORD.get());
//                        output.accept(ItemRegistries.SCULK_SLICER.get());
//                        output.accept(ItemRegistries.WORLDBREAKER.get());
//                        output.accept(ItemRegistries.THUNDERBRINGER.get());
//                        output.accept(ItemRegistries.ARUROA_SPELLBOOK.get());
//                        output.accept(ItemRegistries.TRIBLADE.get());
//                        output.accept(ItemRegistries.NAMELESS_STAFF.get());
//                    })
//                    .build());
//
//    public static void register(IEventBus eventBus) {
//        CREATIVE_MODE_TAB.register(eventBus);
//    }
//}