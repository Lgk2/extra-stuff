package com.lgk.extrastuff.blocks.Item;

import com.lgk.extrastuff.blocks.Interface.IMetaBlockName;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Created by Dunng on 30/03/2017.
 */
public class ItemBlockMetadataBase extends ItemBlock {

    public ItemBlockMetadataBase(Block block)
    {
    super(block);
    if(!(block instanceof IMetaBlockName)) {
        throw new IllegalArgumentException(String.format("The given block %s is not an instance of IMetaBlockName!", block.getUnlocalizedName()));
        }
    this.setHasSubtypes(true);
    this.setMaxDamage(0);
    this.setRegistryName(block.getRegistryName());
    }

    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName() + "." + ((IMetaBlockName) this.block).getSpecialName(stack);
    }

    @Override
    public int getMetadata(int damage) {
        return damage;
    }

}
