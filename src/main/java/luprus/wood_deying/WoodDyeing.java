package luprus.wood_deying;

import luprus.wood_deying.block.ModBlocks;
import luprus.wood_deying.item.ModItemGroups;
import luprus.wood_deying.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WoodDyeing implements ModInitializer {
    public static final String MOD_ID = "wood_dyeing";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}