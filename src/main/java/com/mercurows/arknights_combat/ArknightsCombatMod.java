package com.mercurows.arknights_combat;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(ArknightsCombatMod.MODID)
public class ArknightsCombatMod {

    public static final String MODID = "arknights_combat";

    private static final Logger LOGGER = LogUtils.getLogger();

    public ArknightsCombatMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    }
}
