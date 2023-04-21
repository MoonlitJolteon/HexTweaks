package net.walksanator.hextweaks.patterns;

import at.petrak.hexcasting.api.misc.MediaConstants;
import at.petrak.hexcasting.common.casting.operators.spells.OpPotionEffect;
import net.minecraft.world.effect.MobEffects;
import net.walksanator.hextweaks.HexTweaks;
import at.petrak.hexcasting.api.PatternRegistry;
import at.petrak.hexcasting.api.spell.math.HexDir;
import at.petrak.hexcasting.api.spell.math.HexPattern;
import net.minecraft.resources.ResourceLocation;

public class PatternRegister {
    public static void registerPatterns() throws PatternRegistry.RegisterPatternException {
        //HexPattern(SOUTH_WEST qqaw)
        PatternRegistry.mapPattern(
                HexPattern.fromAngles("qqaw", HexDir.SOUTH_WEST),
                new ResourceLocation("hextweaks","page/right"),
                new OpNewFlip(true),false
        );
        //HexPattern(SOUTH_EAST eedw)
        PatternRegistry.mapPattern(
                HexPattern.fromAngles("eedw",HexDir.SOUTH_EAST),
                new ResourceLocation("hextweaks","page/left"),
                new OpNewFlip(false), false
        );
        //HexPattern(EAST deqwedaqedqeweqewwdweqa)
        PatternRegistry.mapPattern(
                HexPattern.fromAngles("dewdeqwwedaqedwadweqewwd",HexDir.EAST),
                new ResourceLocation("hextweaks","suicide"),
                new OpSuicide(), true
        );
        PatternRegistry.mapPattern(
                HexPattern.fromAngles("weed",HexDir.EAST),
                new ResourceLocation("hextweaks","nausea"),
                new OpPotionEffect(MobEffects.CONFUSION, MediaConstants.DUST_UNIT / 4,true,false,false),false
        );
        //HexPattern(North_East qaqwaq)
        PatternRegistry.mapPattern(
                HexPattern.fromAngles("qaqwaq",HexDir.NORTH_EAST),
                new ResourceLocation("hextweaks","dict/new"),
                new OpNewDict(), false
        );
        //HexPattern(North_East qaqwaqewaa)
        PatternRegistry.mapPattern(
                HexPattern.fromAngles("qaqwaqdqedqde",HexDir.NORTH_EAST),
                new ResourceLocation("hextweaks","dict/set"),
                new OpDictSet(), false
        );
        //HexPattern(North_East  qaqwaqdadeeedqaqwaqdadeeed)
        PatternRegistry.mapPattern(
                HexPattern.fromAngles("qaqwaqdadeeed",HexDir.NORTH_EAST),
                new ResourceLocation("hextweaks","dict/get"),
                new OpDictPop(), false
        );
        //HexPattern(East qaqwaqeqdd)
        PatternRegistry.mapPattern(
                HexPattern.fromAngles("qaqwaqeqdd",HexDir.NORTH_EAST),
                new ResourceLocation("hextweaks","dict/remove"),
                new OpDictRemove(), false
        );
        //HexPattern(East ddwwee)
        PatternRegistry.mapPattern(
                HexPattern.fromAngles("wdwaw",HexDir.NORTH_EAST),
                new ResourceLocation("hextweaks","itter"),
                new OpItterator(), false
        );
        //HexPattern(North_East qaqwaqedadad) Thoth but dictionary
        //altrenate thoths idea: it runs the program but does not reset the stack or en-listify it
        HexTweaks.LOGGER.info("finished loading hextweaks hexes");
    }
}
