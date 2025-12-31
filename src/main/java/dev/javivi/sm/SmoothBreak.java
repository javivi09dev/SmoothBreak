package dev.javivi.sm;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SmoothBreak.MODID)
public class SmoothBreak {

    public static final String MODID = "smoothbreak";

    public SmoothBreak(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

    }
}
