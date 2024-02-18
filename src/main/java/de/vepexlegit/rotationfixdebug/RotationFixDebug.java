package de.vepexlegit.rotationfixdebug;

import de.vepexlegit.rotationfixdebug.commands.*;
import net.minecraftforge.client.*;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.event.*;

@Mod(modid = "rotationfixdebug", version = "1.0")
public class RotationFixDebug {
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ClientCommandHandler.instance.registerCommand(new RotationFixCommand());
    }
}
