package lgk.extrastuff.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Dunng on 27/03/2017.
 */
public class ModBlocks {

    public static BlockBase hardened_machine_frame;
    public static BlockBase reinforced_machine_frame;
    public static BlockBase resonant_machine_frame;

    public static void init() {
        hardened_machine_frame = register(new BlockBasic("hardened_machine_frame"));
        reinforced_machine_frame = register(new BlockBasic("reinforced_machine_frame"));
        resonant_machine_frame = register(new BlockBasic("resonant_machine_frame"));

    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        GameRegistry.register(itemBlock);

        if (block instanceof BlockBase) {
            ((BlockBase)block).registerItemModel(itemBlock);
        }

        return block;
    }

    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }

}
