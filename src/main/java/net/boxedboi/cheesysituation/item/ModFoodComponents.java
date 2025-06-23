package net.boxedboi.cheesysituation.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
public static final FoodComponent SWISS_CHEESE_WHEEL = new FoodComponent.Builder().hunger(7).saturationModifier(0.25f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 6000), 1).build();
    public static final FoodComponent SWISS_CHEESE_SLICE = new FoodComponent.Builder().hunger(4).saturationModifier(0.25f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 2000), 1).build();

    public static final FoodComponent FETA_CHEESE_WHEEL = new FoodComponent.Builder().hunger(7).saturationModifier(0.25f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 6000), 1).build();
    public static final FoodComponent FETA_CHEESE_SLICE = new FoodComponent.Builder().hunger(4).saturationModifier(0.25f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2000), 1).build();

    public static final FoodComponent CHEDAR_CHEESE_WHEEL = new FoodComponent.Builder().hunger(7).saturationModifier(0.25f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 6000), 1).build();
    public static final FoodComponent CHEDAR_CHEESE_SLICE = new FoodComponent.Builder().hunger(4).saturationModifier(0.25f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2000), 1).build();

    public static final FoodComponent END_CHEESE_WHEEL = new FoodComponent.Builder().hunger(7).saturationModifier(0.25f).statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 6000), 1).build();
    public static final FoodComponent END_CHEESE_SLICE = new FoodComponent.Builder().hunger(4).saturationModifier(0.25f).statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 2000), 1).build();

    public static final FoodComponent BASTION_CHEDAR_WHEEL = new FoodComponent.Builder().hunger(7).saturationModifier(0.25f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000), 1).build();
    public static final FoodComponent BASTION_CHEDAR_SLICE = new FoodComponent.Builder().hunger(4).saturationModifier(0.25f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 2000), 1).build();




}
