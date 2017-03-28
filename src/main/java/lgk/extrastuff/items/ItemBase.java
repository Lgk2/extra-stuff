package lgk.extrastuff.items;

import net.minecraft.creativetab.CreativeTabs;
import lgk.extrastuff.ExtraStuff;
import net.minecraft.item.Item;

import static net.minecraftforge.fml.common.registry.GameRegistry.register;

/**
 * Created by Dunng on 27/03/2017.
 */
public class ItemBase extends Item {


    protected String name;

    public ItemBase(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ExtraStuff.creativeTab);
    }

    public void registerItemModel() {
        ExtraStuff.proxy.registerItemRenderer(this, 0, name);
    }


    @Override
    public ItemBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}
