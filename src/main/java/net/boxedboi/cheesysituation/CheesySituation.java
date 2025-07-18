package net.boxedboi.cheesysituation;

import net.boxedboi.cheesysituation.item.ModItemGroups;
import net.boxedboi.cheesysituation.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CheesySituation implements ModInitializer {
	public static final String MOD_ID = "cheesysituation";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

		LOGGER.info("We need CHEESE Gromit CHEEEEESE!!!!");
	}
}