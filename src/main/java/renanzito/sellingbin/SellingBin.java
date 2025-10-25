package renanzito.sellingbin;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import renanzito.sellingbin.block.ModBlocks;
import renanzito.sellingbin.item.ModItemGroups;
import renanzito.sellingbin.item.ModItems;

public class SellingBin implements ModInitializer {
	public static final String MOD_ID = "sellingbin";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}