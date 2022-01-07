package com.luna.aiots.item;

import com.luna.aiots.Aiots;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Aiots.MOD_ID);

public static final RegistryObject<Item> IRIDIUM_INGOT = ITEMS.register("iridium_ingot",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AIOTS_TAB)));

    public static final RegistryObject<Item> IRIDIUM_NUGGET = ITEMS.register("iridium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AIOTS_TAB)));

    public static final RegistryObject<Item> RAW_IRIDIUM = ITEMS.register("raw_iridium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AIOTS_TAB)));

    public static final RegistryObject<Item> IRIDIUM_SWORD = ITEMS.register("iridium_sword",
            () -> new SwordItem(ModTiers.IRIDIUM, 4, 4f,
                    new Item.Properties().tab(ModCreativeModeTab.AIOTS_TAB)));

    public static final RegistryObject<Item> IRIDIUM_PICKAXE = ITEMS.register("iridium_pickaxe",
            () -> new PickaxeItem(ModTiers.IRIDIUM, 1, 2f,
                    new Item.Properties().tab(ModCreativeModeTab.AIOTS_TAB)));

    public static final RegistryObject<Item> IRIDIUM_SHOVEL = ITEMS.register("iridium_shovel",
            () -> new ShovelItem(ModTiers.IRIDIUM, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.AIOTS_TAB)));

    public static final RegistryObject<Item> IRIDIUM_AXE = ITEMS.register("iridium_axe",
            () -> new AxeItem(ModTiers.IRIDIUM, 6, 5,
                    new Item.Properties().tab(ModCreativeModeTab.AIOTS_TAB)));

    public static final RegistryObject<Item> IRIDIUM_HOE = ITEMS.register("iridium_hoe",
            () -> new HoeItem(ModTiers.IRIDIUM, 1, 2f,
                    new Item.Properties().tab(ModCreativeModeTab.AIOTS_TAB)));

    public static final RegistryObject<Item> IRIDIUM_BOOTS = ITEMS.register("iridium_boots",
            () -> new ArmorItem(ModArmorMaterial.IRIDIUM, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.AIOTS_TAB)));

    public static final RegistryObject<Item> IRIDIUM_LEGGINGS = ITEMS.register("iridium_leggings",
            () -> new ArmorItem(ModArmorMaterial.IRIDIUM, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.AIOTS_TAB)));

    public static final RegistryObject<Item> IRIDIUM_CHESTPLATE = ITEMS.register("iridium_chestplate",
            () -> new ArmorItem(ModArmorMaterial.IRIDIUM, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.AIOTS_TAB)));

    public static final RegistryObject<Item> IRIDIUM_HELMET = ITEMS.register("iridium_helmet",
            () -> new ArmorItem(ModArmorMaterial.IRIDIUM, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.AIOTS_TAB)));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
