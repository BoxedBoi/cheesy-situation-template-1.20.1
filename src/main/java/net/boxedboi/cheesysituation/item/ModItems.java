package net.boxedboi.cheesysituation.item;

import net.boxedboi.cheesysituation.CheesySituation;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
public static final Item CURD_BUCKET = registerItem("curd_bucket", new Item(new FabricItemSettings()));
    public static final Item SWISS_CHEESE_WHEEL = registerItem("swiss_cheese_wheel", new Item(new FabricItemSettings().food(ModFoodComponents.SWISS_CHEESE_WHEEL)));
    public static final Item SWISS_CHEESE_SLICE = registerItem("swiss_cheese_slice", new Item(new FabricItemSettings().food(ModFoodComponents.SWISS_CHEESE_SLICE)));
    public static final Item FETA_CHEESE_WHEEL = registerItem("feta_cheese_wheel", new Item(new FabricItemSettings().food(ModFoodComponents.FETA_CHEESE_WHEEL)));
    public static final Item FETA_CHEESE_SLICE = registerItem("feta_cheese_slice", new Item(new FabricItemSettings().food(ModFoodComponents.FETA_CHEESE_SLICE)));
    public static final Item CHEDAR_CHEESE_WHEEL = registerItem("chedar_cheese_wheel", new Item(new FabricItemSettings().food(ModFoodComponents.CHEDAR_CHEESE_WHEEL)));
    public static final Item CHEDAR_CHEESE_SLICE = registerItem("chedar_cheese_slice", new Item(new FabricItemSettings().food(ModFoodComponents.CHEDAR_CHEESE_SLICE)));
    public static final Item END_CHEESE_WHEEL = registerItem("end_cheese_wheel", new Item(new FabricItemSettings().food(ModFoodComponents.END_CHEESE_WHEEL)));
    public static final Item END_CHEESE_SLICE = registerItem("end_cheese_slice", new Item(new FabricItemSettings().food(ModFoodComponents.END_CHEESE_SLICE)));
    public static final Item BASTION_CHEDAR_WHEEL = registerItem("bastion_chedar_wheel", new Item(new FabricItemSettings().food(ModFoodComponents.BASTION_CHEDAR_WHEEL)));
    public static final Item BASTION_CHEDAR_SLICE = registerItem("bastion_chedar_slice", new Item(new FabricItemSettings().food(ModFoodComponents.BASTION_CHEDAR_SLICE)));





private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries ) {
    entries.add(CURD_BUCKET);
}


    private static Item registerItem(String name, Item item){
      return Registry.register(Registries.ITEM, new Identifier(CheesySituation.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CheesySituation.LOGGER.info("Registering Mod items for " + CheesySituation.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
