package net.CBE.fortcraft.item;

import net.CBE.fortcraft.FortCraft;
import net.CBE.fortcraft.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FortCraft.MOD_ID);

    public static final Supplier<CreativeModeTab> FORTCRAFT_RESOURCES_TAB = CREATIVE_MODE_TAB.register("fortcraft_resources_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.RAW_BISMUTH.get()))
                    .withSearchBar()
                    .title(Component.translatable("creativetab.fortcraft_resources"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RAW_BISMUTH);
                        output.accept(ModItems.BISMUTH);
                        output.accept(ModBlocks.BISMUTH_BLOCK);
                        output.accept(ModBlocks.BISMUTH_ORE);
                    }).build());


    public static final Supplier<CreativeModeTab> FORTCRAFT_CONSUMABLES_TAB = CREATIVE_MODE_TAB.register("fortcraft_consumables_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.SLURP_BERRIES.get()))
                    .withSearchBar()
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(FortCraft.MOD_ID, "fortcraft_resources_tab"))
                    .title(Component.translatable("creativetab.fortcraft_consumables"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SLURP_BERRIES);
                    }).build());





    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
