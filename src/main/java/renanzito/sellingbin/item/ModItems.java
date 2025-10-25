package renanzito.sellingbin.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import renanzito.sellingbin.SellingBin;

public class ModItems {
    public static final Item COPPER_COIN = RegisterItem("copper_coin", new Item(new Item.Settings()));
    public static final Item SILVER_COIN = RegisterItem("silver_coin", new Item(new Item.Settings()));
    public static final Item GOLD_COIN = RegisterItem("gold_coin", new Item(new Item.Settings()));

    private static Item RegisterItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SellingBin.MOD_ID, name), item);
    }

    public static void registerModItems(){
        SellingBin.LOGGER.info("Register Mod  Items for" + SellingBin.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(COPPER_COIN);
            entries.add(SILVER_COIN);
            entries.add(GOLD_COIN);
        });
    }
}
