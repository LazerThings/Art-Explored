
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.artexplored.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.artexplored.ArtblocksMod;

public class ArtblocksModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ArtblocksMod.MODID);
	public static final RegistryObject<Item> ROSES_WALLPAPER = block(ArtblocksModBlocks.ROSES_WALLPAPER);
	public static final RegistryObject<Item> BLUE_YELLOW_STRIPE_BLOCK = block(ArtblocksModBlocks.BLUE_YELLOW_STRIPE_BLOCK);
	public static final RegistryObject<Item> PINK_GREEN_STRIPE_BLOCK = block(ArtblocksModBlocks.PINK_GREEN_STRIPE_BLOCK);
	public static final RegistryObject<Item> RED_POLKA_DOT_BLOCK = block(ArtblocksModBlocks.RED_POLKA_DOT_BLOCK);
	public static final RegistryObject<Item> MONSTER_FACE_BLOCK = block(ArtblocksModBlocks.MONSTER_FACE_BLOCK);
	public static final RegistryObject<Item> REALISTIC_YELLOW_ORANGE_RINGED_BLOCK = block(ArtblocksModBlocks.REALISTIC_YELLOW_ORANGE_RINGED_BLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
