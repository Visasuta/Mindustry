package io.anuke.mindustry.world.blocks;

import io.anuke.arc.graphics.g2d.Draw;
import io.anuke.arc.math.Mathf;
import io.anuke.mindustry.world.Tile;

/**A type of floor that is overlaid on top of over floors.*/
public class OverlayFloor extends Floor{

    public OverlayFloor(String name){
        super(name);
    }

    @Override
    public void draw(Tile tile){
        Draw.rect(variantRegions[Mathf.randomSeed(tile.pos(), 0, Math.max(0, variantRegions.length - 1))], tile.worldx(), tile.worldy());
    }
}
