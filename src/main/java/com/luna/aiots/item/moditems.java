package com.luna.aiots.item;

import com.luna.aiots.Aiots;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Aiots.MOD_ID);

public static final RegistryObject<Item> IRIDIUM_INGOT = ITEMS.register("iridium_ingot",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AIOTS_TAB)));

    public static final RegistryObject<Item> IRIDIUM_NUGGET = ITEMS.register("iridium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AIOTS_TAB)));

    public static final RegistryObject<Item> RAW_IRIDIUM = ITEMS.register("raw_iridium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AIOTS_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
