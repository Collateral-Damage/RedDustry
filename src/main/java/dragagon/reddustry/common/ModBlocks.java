package dragagon.reddustry.common;

import dragagon.reddustry.common.blocks.CopperOre;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {
	public static CopperOre copperOre;
	
	public static void init() {
		copperOre = new CopperOre();
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
    	copperOre.initModel();

    }

    @SideOnly(Side.CLIENT)
    public static void initItemModels() {
        //bakedModelBlock.initItemModel();
    }
}
