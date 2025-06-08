package net.CBE.fortcraft.item;

import net.CBE.fortcraft.FortCraft;
import net.CBE.fortcraft.block.ModBlocks;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FortCraft.MOD_ID);

    public static final DeferredItem<Item> BISMUTH = ITEMS.register("bismuth",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_BISMUTH = ITEMS.register("raw_bismuth",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SLURP_BERRIES = ITEMS.register("slurp_berries",
            () -> new ItemNameBlockItem(ModBlocks.SLURP_BERRY_BUSH.get(), new Item.Properties().food(ModFoodProperties.SLURP_BERRIES)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
