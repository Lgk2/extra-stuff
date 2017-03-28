package lgk.extrastuff;

import lgk.extrastuff.blocks.ModBlocks;
import lgk.extrastuff.creativetab.ExtraStuffTab;
import lgk.extrastuff.items.ModItems;
import lgk.extrastuff.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name =  Reference.NAME, version = Reference.VERSION)
public class ExtraStuff {

    @Mod.Instance(Reference.MODID)
    public static ExtraStuff instance;
    public static final ExtraStuffTab creativeTab = new ExtraStuffTab();

    @SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.init();
        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {


    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }


}