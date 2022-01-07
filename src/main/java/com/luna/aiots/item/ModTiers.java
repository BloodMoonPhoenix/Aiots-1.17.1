package com.luna.aiots.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ModTiers {
    public static final ForgeTier IRIDIUM = new ForgeTier(4, 3000, 12f, 4f,
            15, Tags.Blocks.NEEDS_GOLD_TOOL,
            () -> Ingredient.of(ModItems.IRIDIUM_INGOT.get()));
}
