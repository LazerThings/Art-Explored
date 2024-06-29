
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.artexplored.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.artexplored.block.RosesWallpaperBlock;
import net.mcreator.artexplored.block.RedPolkaDotBlockBlock;
import net.mcreator.artexplored.block.RealisticYellowOrangeRingedBlockBlock;
import net.mcreator.artexplored.block.PinkGreenStripeBlockBlock;
import net.mcreator.artexplored.block.MonsterFaceBlockBlock;
import net.mcreator.artexplored.block.BlueYellowStripeBlockBlock;
import net.mcreator.artexplored.ArtblocksMod;

public class ArtblocksModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ArtblocksMod.MODID);
	public static final RegistryObject<Block> ROSES_WALLPAPER = REGISTRY.register("roses_wallpaper", () -> new RosesWallpaperBlock());
	public static final RegistryObject<Block> BLUE_YELLOW_STRIPE_BLOCK = REGISTRY.register("blue_yellow_stripe_block", () -> new BlueYellowStripeBlockBlock());
	public static final RegistryObject<Block> PINK_GREEN_STRIPE_BLOCK = REGISTRY.register("pink_green_stripe_block", () -> new PinkGreenStripeBlockBlock());
	public static final RegistryObject<Block> RED_POLKA_DOT_BLOCK = REGISTRY.register("red_polka_dot_block", () -> new RedPolkaDotBlockBlock());
	public static final RegistryObject<Block> MONSTER_FACE_BLOCK = REGISTRY.register("monster_face_block", () -> new MonsterFaceBlockBlock());
	public static final RegistryObject<Block> REALISTIC_YELLOW_ORANGE_RINGED_BLOCK = REGISTRY.register("realistic_yellow_orange_ringed_block", () -> new RealisticYellowOrangeRingedBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
