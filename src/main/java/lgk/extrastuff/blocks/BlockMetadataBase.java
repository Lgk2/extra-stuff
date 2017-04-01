package lgk.extrastuff.blocks;

import lgk.extrastuff.ExtraStuff;
import lgk.extrastuff.Reference;
import lgk.extrastuff.blocks.Interface.IMetaBlockName;
import lgk.extrastuff.handler.BlockEnumHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by Dunng on 27/03/2017.
 */
public class BlockMetadataBase extends Block implements IMetaBlockName {

    protected String name;

    public static final PropertyEnum TYPE = PropertyEnum.create("type", BlockEnumHandler.BlockMetadata.class);

    public BlockMetadataBase(String name) {
        super(Material.IRON);
        this.name = name;
        this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, BlockEnumHandler.BlockMetadata.A));

        setUnlocalizedName(name);
        setRegistryName(new ResourceLocation(Reference.MODID, name));
        setCreativeTab(ExtraStuff.creativeTab);
        setHardness(5f);
        setResistance(500f);
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] {TYPE});
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        BlockEnumHandler.BlockMetadata type = (BlockEnumHandler.BlockMetadata) state.getValue(TYPE);
        return type.getID();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(TYPE, BlockEnumHandler.BlockMetadata.values()[meta]);
    }

    public void registerItemModel(ItemBlock itemBlock) {
        for (int i = 0; i < BlockEnumHandler.BlockMetadata.values().length; i++) {
            ExtraStuff.proxy.registerItemBlockMetadataRenderer(itemBlock, i, "" + BlockEnumHandler.BlockMetadata.values()[i].getName());
        }
    }

    public void registerBakeryVariants() {
        for (int i = 0; i < BlockEnumHandler.BlockMetadata.values().length; i++) {
            ExtraStuff.proxy.registerModelBakeryVariants(Item.getItemFromBlock(this), name);
        }
    }

    @Override
    public void getSubBlocks(Item item, CreativeTabs tab, List<ItemStack> list) {
        for(int i = 0; i < BlockEnumHandler.BlockMetadata.values().length; i++) {
            list.add(new ItemStack(item, 1, i));
        }
    }

    @Override
    public BlockMetadataBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

    @Override
    public String getSpecialName(ItemStack stack) {
        return BlockEnumHandler.BlockMetadata.values()[stack.getItemDamage()].getName();
    }

    @Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
        {
            return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
        }

    @Override
    public int damageDropped(IBlockState state) {
        return getMetaFromState(state);
    }
}
