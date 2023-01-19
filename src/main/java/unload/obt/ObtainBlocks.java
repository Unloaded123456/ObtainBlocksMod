package unload.obt;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;

@Mod(modid = "obt", name = "Obtain Blocks", version = "0.2")
public class ObtainBlocks {
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // HashSet hashset = Sets.newHashSet(new Block[] {Blocks.air, Blocks.brewing_stand, Blocks.bed, Blocks.nether_wart, Blocks.cauldron, Blocks.flower_pot, Blocks.wheat, Blocks.reeds, Blocks.cake, Blocks.skull, Blocks.piston_head, Blocks.piston_extension, Blocks.lit_redstone_ore, Blocks.powered_repeater, Blocks.pumpkin_stem, Blocks.standing_sign, Blocks.powered_comparator, Blocks.tripwire, Blocks.lit_redstone_lamp, Blocks.melon_stem, Blocks.unlit_redstone_torch, Blocks.unpowered_comparator, Blocks.redstone_wire, Blocks.wall_sign, Blocks.unpowered_repeater, Blocks.iron_door, Blocks.wooden_door});
        net.minecraft.item.Item.itemRegistry.addObject(Block.getIdFromBlock(Blocks.air), "air", new ItemBlock(Blocks.air));
        net.minecraft.item.Item.itemRegistry.addObject(Block.getIdFromBlock(Blocks.brewing_stand), "brewing_stand", new ItemBlock(Blocks.brewing_stand));
        net.minecraft.item.Item.itemRegistry.addObject(Block.getIdFromBlock(Blocks.bed), "bed", new ItemBlock(Blocks.bed));
        net.minecraft.item.Item.itemRegistry.addObject(Block.getIdFromBlock(Blocks.nether_wart), "nether_wart", new ItemBlock(Blocks.nether_wart));
        net.minecraft.item.Item.itemRegistry.addObject(Block.getIdFromBlock(Blocks.cauldron), "cauldron", new ItemBlock(Blocks.cauldron));
        net.minecraft.item.Item.itemRegistry.addObject(Block.getIdFromBlock(Blocks.flower_pot), "flower_pot", new ItemBlock(Blocks.flower_pot));
        net.minecraft.item.Item.itemRegistry.addObject(Block.getIdFromBlock(Blocks.wheat), "wheat", new ItemBlock(Blocks.wheat));
        net.minecraft.item.Item.itemRegistry.addObject(Block.getIdFromBlock(Blocks.reeds), "reeds", new ItemBlock(Blocks.reeds));
        net.minecraft.item.Item.itemRegistry.addObject(Block.getIdFromBlock(Blocks.cake), "cake", new ItemBlock(Blocks.cake));
        net.minecraft.item.Item.itemRegistry.addObject(Block.getIdFromBlock(Blocks.skull), "skull", new ItemBlock(Blocks.skull));
        net.minecraft.item.Item.itemRegistry.addObject(Block.getIdFromBlock(Blocks.piston_head), "piston_head", new ItemBlock(Blocks.piston_head));
        net.minecraft.item.Item.itemRegistry.addObject(Block.getIdFromBlock(Blocks.piston_extension), "piston_extension", new ItemBlock(Blocks.piston_extension));
        net.minecraft.item.Item.itemRegistry.addObject(Block.getIdFromBlock(Blocks.lit_redstone_ore), "lit_redstone_ore", new ItemBlock(Blocks.lit_redstone_ore));
        net.minecraft.item.Item.itemRegistry.addObject(Block.getIdFromBlock(Blocks.powered_repeater), "powered_repeater", new ItemBlock(Blocks.powered_repeater));
        net.minecraft.item.Item.itemRegistry.addObject(Block.getIdFromBlock(Blocks.pumpkin_stem), "pumpkin_stem", new ItemBlock(Blocks.pumpkin_stem));
        net.minecraft.item.Item.itemRegistry.addObject(Block.getIdFromBlock(Blocks.standing_sign), "standing_sign", new ItemBlock(Blocks.standing_sign));
        net.minecraft.item.Item.itemRegistry.addObject(Block.getIdFromBlock(Blocks.powered_comparator), "powered_comparator", new ItemBlock(Blocks.powered_comparator));
        net.minecraft.item.Item.itemRegistry.addObject(Block.getIdFromBlock(Blocks.tripwire), "tripwire", new ItemBlock(Blocks.tripwire));
        net.minecraft.item.Item.itemRegistry.addObject(Block.getIdFromBlock(Blocks.lit_redstone_lamp), "lit_redstone_lamp", new ItemBlock(Blocks.lit_redstone_lamp));
        net.minecraft.item.Item.itemRegistry.addObject(Block.getIdFromBlock(Blocks.melon_stem), "melon_stem", new ItemBlock(Blocks.melon_stem));
        net.minecraft.item.Item.itemRegistry.addObject(Block.getIdFromBlock(Blocks.unlit_redstone_torch), "unlit_redstone_torch", new ItemBlock(Blocks.unlit_redstone_torch));
        net.minecraft.item.Item.itemRegistry.addObject(Block.getIdFromBlock(Blocks.unpowered_comparator), "unpowered_comparator", new ItemBlock(Blocks.unpowered_comparator));
        net.minecraft.item.Item.itemRegistry.addObject(Block.getIdFromBlock(Blocks.wooden_door), "wooden_door", new ItemBlock(Blocks.wooden_door));
        net.minecraft.item.Item.itemRegistry.addObject(Block.getIdFromBlock(Blocks.iron_door), "iron_door", new ItemBlock(Blocks.iron_door));
        net.minecraft.item.Item.itemRegistry.addObject(Block.getIdFromBlock(Blocks.redstone_wire), "redstone_wire", new ItemBlock(Blocks.redstone_wire));
        net.minecraft.item.Item.itemRegistry.addObject(Block.getIdFromBlock(Blocks.wall_sign), "wall_sign", new ItemBlock(Blocks.wall_sign));
        net.minecraft.item.Item.itemRegistry.addObject(Block.getIdFromBlock(Blocks.unpowered_repeater), "unpowered_repeater", new ItemBlock(Blocks.unpowered_repeater));
    }
    @EventHandler
    public void init(FMLInitializationEvent event) {


    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
