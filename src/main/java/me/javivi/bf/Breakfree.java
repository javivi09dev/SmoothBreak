package me.javivi.bf;

import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.slf4j.Logger;

@Mod(Breakfree.MODID)
public class Breakfree {

    public static final String MODID = "smoothbreak";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Breakfree() {
        LOGGER.info("Break Free mod loaded!");
    }

}
