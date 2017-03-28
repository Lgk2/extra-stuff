package lgk.extrastuff.creativetab;

import lgk.extrastuff.Reference;
import lgk.extrastuff.items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Dunng on 27/03/2017.
 */
public class ExtraStuffTab extends CreativeTabs {

    public ExtraStuffTab() {
        super(Reference.MODID);
        setBackgroundImageName("extrastuff.png");
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.resonating_diamond;
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }

}
