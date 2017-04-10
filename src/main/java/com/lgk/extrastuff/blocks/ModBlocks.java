package com.lgk.extrastuff.blocks;

import com.lgk.extrastuff.blocks.Item.ItemBlockMetadataBase;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Dunng on 27/03/2017.
 */
public class ModBlocks {

    public static BlockMetadataBase blocks;

    public static void init() {
        blocks = register(new BlockMetadataBase("blocks"));
    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        GameRegistry.register(itemBlock);

    if (block instanceof BlockMetadataBase) {
            ((BlockMetadataBase)block).registerItemModel(itemBlock);
            ((BlockMetadataBase)block).registerBakeryVariants();
        }
        return block;
    }

    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlockMetadataBase(block);
        return register(block, itemBlock);
    }

}
