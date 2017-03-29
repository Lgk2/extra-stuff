package lgk.extrastuff.items;

import lgk.extrastuff.ExtraStuff;
import lgk.extrastuff.handler.EnumHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created by Dunng on 29/03/2017.
 */
public class ItemMetadata extends Item {

    protected String name;

    public ItemMetadata(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ExtraStuff.creativeTab);
        setHasSubtypes(true);
    }

    public void registerItemModel() {
        for (int i = 0; i < EnumHandler.ItemMetadata.values().length; i++) {
            ExtraStuff.proxy.registerItemMetadataRenderer(this, i, "" + EnumHandler.ItemMetadata.values()[i].getName());
        }
    }

    public void registerBakeryVariants() {
        for (int i = 0; i < EnumHandler.ItemMetadata.values().length; i++) {
            ExtraStuff.proxy.registerModelBakeryVariants(this, name);
            }
    }


     @Override
     public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
        for(int i = 0; i < EnumHandler.ItemMetadata.values().length; i++) {
            items.add(new ItemStack(item, 1, i));
        }
     }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        for(int i = 0; i < EnumHandler.ItemMetadata.values().length; i++) {
            if(stack.getItemDamage() == i) {
                return this.getUnlocalizedName() + "." + EnumHandler.ItemMetadata.values()[i].getName();
            }
            else {
                continue;
            }
        }
        return this.getUnlocalizedName() + "." + EnumHandler.ItemMetadata.A.getName();
    }

    @Override
    public ItemMetadata setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }




}
