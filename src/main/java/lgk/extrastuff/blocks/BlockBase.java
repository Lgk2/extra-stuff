package lgk.extrastuff.blocks;

import lgk.extrastuff.ExtraStuff;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

/**
 * Created by Dunng on 27/03/2017.
 */
public class BlockBase extends Block {

    protected String name;

    public BlockBase(Material material, String name) {
        super(material);

        this.name = name;

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ExtraStuff.creativeTab);
    }

    public void registerItemModel(ItemBlock itemBlock) {
        ExtraStuff.proxy.registerItemRenderer(itemBlock, 0, name);
    }

    @Override
    public BlockBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
