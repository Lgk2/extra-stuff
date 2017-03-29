package lgk.extrastuff.proxy;

import lgk.extrastuff.ExtraStuff;
import lgk.extrastuff.Reference;
import lgk.extrastuff.handler.EnumHandler;
import lgk.extrastuff.items.ModItems;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
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
    public void registerModelBakeryVariants(Item item, String name) {
    }
}


