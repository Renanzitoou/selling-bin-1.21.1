package renanzito.sellingbin.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import renanzito.sellingbin.SellingBin;
import renanzito.sellingbin.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup SELLING_BIN_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(SellingBin.MOD_ID, "selling_bin_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.GOLD_COIN))
                    .displayName(Text.translatable("itemgroup.sellingbin.selling_bin_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.GOLD_COIN);
                        entries.add(ModItems.SILVER_COIN);
                        entries.add(ModItems.COPPER_COIN);
                        entries.add(ModBlocks.UPGRADED_SELLING_BIN_BLOCK);
                        entries.add(ModBlocks.SELLING_BIN_BLOCK);

                    }).build());

    public static void registerItemGroups() {
        SellingBin.LOGGER.info("Registering Item Groups for" + SellingBin.MOD_ID);
    }
}
