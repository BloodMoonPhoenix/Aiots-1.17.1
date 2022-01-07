package com.luna.aiots.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab AIOTS_TAB = new CreativeModeTab("aiotsModTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.IRIDIUM_INGOT.get());
        }
    };
}
