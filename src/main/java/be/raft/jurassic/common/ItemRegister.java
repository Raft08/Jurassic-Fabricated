package be.raft.jurassic.common;

import be.raft.jurassic.Jurassic;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegister {
    //Call this to correctly register all items
    public static void register() {
        Jurassic.logger.info("NOO!!! *Lost Connection*");
    }

    //Registers
        //Item Register
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Jurassic.modId, name), item);
    }

    //Items
}
