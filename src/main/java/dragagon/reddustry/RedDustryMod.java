package dragagon.reddustry;

import org.apache.logging.log4j.Logger;

import dragagon.reddustry.common.Config;
import dragagon.reddustry.common.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RedDustryMod.MODID, version = RedDustryMod.VERSION)
public class RedDustryMod {
    public static final String MODID = "reddustry";
    public static final String VERSION = "0.0.1";
    
    @Mod.Instance(MODID)
	public static RedDustryMod instance = new RedDustryMod();
	
	@SidedProxy
    public static CommonProxy proxy;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }

    public static class CommonProxy {
        public void preInit(FMLPreInitializationEvent e) {
            // Initialize our packet handler. Make sure the name is
            // 20 characters or less!
            //PacketHandler.registerMessages("modtut");

            // Initialization of blocks and items typically goes here:
            ModBlocks.init();
            //ModItems.init();

            //MainCompatHandler.registerWaila();
            //MainCompatHandler.registerTOP();

        }

        public void init(FMLInitializationEvent e) {

        }

        public void postInit(FMLPostInitializationEvent e) {

        }
    }


    public static class ClientProxy extends CommonProxy {
        @Override
        public void preInit(FMLPreInitializationEvent e) {
            super.preInit(e);

            OBJLoader.INSTANCE.addDomain(MODID);
            //ModelLoaderRegistry.registerLoader(new BakedModelLoader());

            // Typically initialization of models and such goes here:
            ModBlocks.initModels();
            //ModItems.initModels();
        }

        @Override
        public void init(FMLInitializationEvent e) {
            super.init(e);

            // Initialize our input handler so we can listen to keys
            //MinecraftForge.EVENT_BUS.register(new InputHandler());
            //KeyBindings.init();

            ModBlocks.initItemModels();
        }
    }

    public static class ServerProxy extends CommonProxy {

    }
}
