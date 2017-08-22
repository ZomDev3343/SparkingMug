/*
 * Copyright (c) Zom' 2017
 * You can use this code, if you want just please don't appropriate it to you
 */

package fr.zomdev.sparkingmug.init;

import fr.zomdev.sparkingmug.util.References;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems
{

	private void init()
	{

	}

	public void registerItems()
	{
		init();


	}

	public void registerItemRenders()
	{

	}

	private void registerItem(Item item)
	{
		GameRegistry.findRegistry(Item.class).register(item);
	}

	private void regsterItemRender(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(References.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
	}
}
