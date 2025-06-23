package net.boxedboi.cheesysituation.item;

import net.boxedboi.cheesysituation.CheesySituation;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
public static final ItemGroup CHEESE_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(CheesySituation.MOD_ID, "curd_bucket"),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.curd_bucket"))
                .icon(() -> new ItemStack(ModItems.SWISS_CHEESE_WHEEL)).entries((displayContext, entries) -> {

             entries.add(ModItems.CURD_BUCKET);
                    entries.add(ModItems.SWISS_CHEESE_WHEEL);
                    entries.add(ModItems.SWISS_CHEESE_SLICE);
                    entries.add(ModItems.FETA_CHEESE_WHEEL);
                    entries.add(ModItems.FETA_CHEESE_SLICE);
                    entries.add(ModItems.CHEDAR_CHEESE_WHEEL);
                    entries.add(ModItems.CHEDAR_CHEESE_SLICE);
                    entries.add(ModItems.END_CHEESE_WHEEL);
                    entries.add(ModItems.END_CHEESE_SLICE);
                    entries.add(ModItems.BASTION_CHEDAR_WHEEL);
                    entries.add(ModItems.BASTION_CHEDAR_SLICE);





                }).build());
    public static void registerItemGroups() {
        CheesySituation.LOGGER.info("Registering Item groups for" + CheesySituation.MOD_ID);
    }
}
