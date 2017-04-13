package com.lgk.extrastuff.proxy;

import com.lgk.extrastuff.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by Dunng on 27/03/2017.
 */
public class ClientProxy extends  CommonProxy {

    @Override
    public void registerItemMetadataRenderer(Item item, int meta, String fileName) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, fileName), "inventory"));
    }

    @Override
    public void registerItemBlockMetadataRenderer(ItemBlock itemBlock, int meta, String fileName) {
        ModelLoader.setCustomModelResourceLocation(itemBlock, meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, fileName), "inventory"));
    }

    @Override
    public void registerModelBakeryVariants(Item item, String name) {
        new ResourceLocation(Reference.MODID, "item");
    }
}


