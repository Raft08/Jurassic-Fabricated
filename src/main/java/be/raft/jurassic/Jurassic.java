package be.raft.jurassic;

import be.raft.jurassic.common.BlockRegister;
import be.raft.jurassic.common.ItemRegister;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Jurassic implements ModInitializer {
    public static final String modName = "Jurassic Fabricated";
    public static final String modId = "jurassic";
    public static final Logger logger = LoggerFactory.getLogger(modName);

    @Override
    public void onInitialize() {
        logger.info("Entering Jurassic..");
        logger.info("Hmm.. weird why is this empty?");
        BlockRegister.register();
        logger.info("OOH SH!T!!");
        ItemRegister.register();
    }
}
