package luprus.wood_deying.block;

import luprus.wood_deying.WoodDyeing;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block RED_OAK_PLANKS = registerBlock("red_oak_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WHITE_OAK_PLANKS = registerBlock("white_oak_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    private static Block registerBlock (String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(WoodDyeing.MOD_ID, name), block);
    }
    private static Item registerBlockItem (String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(WoodDyeing.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        WoodDyeing.LOGGER.info("Registering ModBlocks for " + WoodDyeing.MOD_ID);
    }
}
