package lgk.extrastuff.proxy;

import lgk.extrastuff.ExtraStuff;
import lgk.extrastuff.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by Dunng on 27/03/2017.
 */
public class ClientProxy extends  CommonProxy {

    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Reference.MODID + ":" + id, "inventory"));
    }
}
