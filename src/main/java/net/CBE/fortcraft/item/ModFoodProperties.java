package net.CBE.fortcraft.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties SLURP_BERRIES = new FoodProperties.Builder()
            .nutrition(2).saturationModifier(0.15f).fast()
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 400), 1.0f)
            .build();
}
