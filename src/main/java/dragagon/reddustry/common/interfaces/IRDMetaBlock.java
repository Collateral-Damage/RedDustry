package dragagon.reddustry.common.interfaces;

import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;

public interface IRDMetaBlock {
		public String getIEBlockName();
		public IProperty getMetaProperty();
		public Enum[] getMetaEnums();
		public IBlockState getInventoryState(int meta);
		public boolean useCustomStateMapper();
		public String getCustomStateMapping(int meta);
}
