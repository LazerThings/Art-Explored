
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.artexplored.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.artexplored.ArtblocksMod;

public class ArtblocksModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ArtblocksMod.MODID);
	public static final RegistryObject<CreativeModeTab> ART_BLOCKS = REGISTRY.register("art_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.artblocks.art_blocks")).icon(() -> new ItemStack(ArtblocksModBlocks.BLUE_YELLOW_STRIPE_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ArtblocksModBlocks.BLUE_YELLOW_STRIPE_BLOCK.get().asItem());
				tabData.accept(ArtblocksModBlocks.ROSES_WALLPAPER.get().asItem());
				tabData.accept(ArtblocksModBlocks.PINK_GREEN_STRIPE_BLOCK.get().asItem());
				tabData.accept(ArtblocksModBlocks.RED_POLKA_DOT_BLOCK.get().asItem());
				tabData.accept(ArtblocksModBlocks.MONSTER_FACE_BLOCK.get().asItem());
				tabData.accept(ArtblocksModBlocks.REALISTIC_YELLOW_ORANGE_RINGED_BLOCK.get().asItem());
			})

					.build());
}
