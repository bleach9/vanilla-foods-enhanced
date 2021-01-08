package vanilla.foods.enhanced.registry.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.CakeBlock;


public class ChocoCake extends CakeBlock {

    public ChocoCake() {
        super(FabricBlockSettings.copyOf(Blocks.CAKE));
    }
}
