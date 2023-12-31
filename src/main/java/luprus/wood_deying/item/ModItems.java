package luprus.wood_deying.item;

import luprus.wood_deying.WoodDyeing;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item FIBERS = registerItem("fibers", new Item(new FabricItemSettings()));
    private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries) {
        entries.add(FIBERS);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(WoodDyeing.MOD_ID, name), item);
    }
    public static void registerModItems() {
        WoodDyeing.LOGGER.info("Registering ModItems for " + WoodDyeing.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsItemGroup);
    }
}
