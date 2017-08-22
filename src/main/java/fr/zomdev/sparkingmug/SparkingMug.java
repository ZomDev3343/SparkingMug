/*
 * Copyright (c) Zom' 2017
 * You can use this code, if you want just please don't appropriate it to you
 */

package fr.zomdev.sparkingmug;

import fr.zomdev.sparkingmug.proxy.CommonProxy;
import fr.zomdev.sparkingmug.util.References;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;


@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)
public class SparkingMug
{

	@Mod.Instance(References.MODID)
	public static SparkingMug instance;

	@SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.SERVER_PROXY)
	public static CommonProxy proxy;

	public static Logger logger;

	@Mod.EventHandler
	public void preIniti(FMLPreInitializationEvent e)
	{
		logger = e.getModLog();

		proxy.preInit();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent e)
	{
		proxy.init();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e)
	{
		proxy.postInit();
	}

}
