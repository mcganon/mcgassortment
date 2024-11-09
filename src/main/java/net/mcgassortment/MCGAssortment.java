package net.mcgassortment;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCGAssortment implements ModInitializer {
	public static final String MOD_ID = "mcgassortment";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		MCGBlocks.registerModBlocks();
		MCGItems.registerModItems();
		MCGBlockEntities.registerBlockEntities();
		MCGItemGroup.registerItemGroups();
		Instance.init();
	}
}