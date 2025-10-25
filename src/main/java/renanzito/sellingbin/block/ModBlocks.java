package renanzito.sellingbin.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractChestBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import renanzito.sellingbin.SellingBin;




public class ModBlocks {
    public static final Block SELLING_BIN_BLOCK = registerBlock("selling_bin_block",
        new Block(AbstractBlock.Settings.create().strength(2.5F).sounds(BlockSoundGroup.WOOD)));

    public static final Block UPGRADED_SELLING_BIN_BLOCK = registerBlock("upgraded_selling_bin_block",
        new Block(AbstractBlock.Settings.create().strength(2.5F).sounds(BlockSoundGroup.WOOD)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(SellingBin.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(SellingBin.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        SellingBin.LOGGER.info("Registering Mod Blocks for" + SellingBin.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.SELLING_BIN_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.UPGRADED_SELLING_BIN_BLOCK);
        });
    }
}
