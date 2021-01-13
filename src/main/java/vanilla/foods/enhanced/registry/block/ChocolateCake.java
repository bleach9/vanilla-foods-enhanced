package vanilla.foods.enhanced.registry.block;

import net.minecraft.block.Blocks;
import net.minecraft.block.CakeBlock;


public class ChocolateCake extends CakeBlock {

    public ChocolateCake() {
        super(Settings.copy(Blocks.CAKE));
    }
}
