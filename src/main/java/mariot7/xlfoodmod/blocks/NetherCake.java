package mariot7.xlfoodmod.blocks;

import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.XLFoodModTab;
import mariot7.xlfoodmod.init.BlockListxlfoodmod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class NetherCake extends BlockCake{
	
	int foodlevel;
	float saturation;
	
	public NetherCake(String name, int foodlevel, float saturation) {
		super();
		this.foodlevel = foodlevel / 6;
		this.saturation = saturation;
		this.setTickRandomly(true);
		this.setHardness(0.5F);
		this.setSoundType(SoundType.CLOTH);
		this.setCreativeTab(XLFoodModTab.tabXLFoodMod);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
	
	public void eatCake(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player)
    {
        if (player.canEat(false))
        {
            player.getFoodStats().addStats(foodlevel, saturation);
            int i = ((Integer)state.getValue(BITES)).intValue();
        }
    }


}