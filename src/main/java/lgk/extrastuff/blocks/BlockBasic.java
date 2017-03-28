package lgk.extrastuff.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Dunng on 27/03/2017.
 */
public class BlockBasic extends BlockBase{

    public BlockBasic(String name) {
        super(Material.IRON, name);

        setHardness(5f);
        setResistance(500f);
    }

    @Override
    public BlockBasic setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}
