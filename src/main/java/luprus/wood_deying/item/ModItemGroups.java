package luprus.wood_deying.item;

import luprus.wood_deying.WoodDyeing;
import luprus.wood_deying.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup WOOD_DYEING_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(WoodDyeing.MOD_ID, "wood_dyeing"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.wood_dyeing"))
                    .icon(() -> new ItemStack(ModBlocks.RED_OAK_PLANKS)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.RED_OAK_PLANKS);
                        entries.add(ModBlocks.WHITE_OAK_PLANKS);
                        entries.add(ModItems.FIBERS);
                    }).build());
    public static void registerItemGroups() {
        WoodDyeing.LOGGER.info("Registering ModItemGroups for " + WoodDyeing.MOD_ID);
    }
}
