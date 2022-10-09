package be.raft.jurassic.common;

import be.raft.jurassic.Jurassic;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegister {
    //Call this to correctly register all blocks
    public static void register() {
       Jurassic.logger.info("Why does the ground rumble like this?");
    }

    //Registers
        //Block Register
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItems(name, block, group);
        return Registry.register(Registry.BLOCK,new Identifier(Jurassic.modId, name), block);
    }
        //ItemBlock Register
    private static Item registerBlockItems(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(Jurassic.modId, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    //Blocks
}
