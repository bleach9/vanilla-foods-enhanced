package vanilla.foods.enhanced.registry.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import vanilla.foods.enhanced.Vafoen;

public class FoodBlocks extends Block{

    public static final EggBlock EGG_BLOCK = new EggBlock(Settings.copy(Blocks.GLASS).sounds(BlockSoundGroup.BONE));
    public static final ChocolateCake CHOCOLATE_CAKE = new ChocolateCake();

    public FoodBlocks(Settings settings) {
        super(settings);
    }


    public static void foodBlocksRegistry() {
        Registry.register(Registry.BLOCK, new Identifier(Vafoen.MOD_ID, "egg_block"), EGG_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Vafoen.MOD_ID, "egg_block"), new BlockItem(EGG_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(Vafoen.MOD_ID, "chocolate_cake"), CHOCOLATE_CAKE);
        Registry.register(Registry.ITEM, new Identifier(Vafoen.MOD_ID, "chocolate_cake"), new BlockItem(CHOCOLATE_CAKE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));



    }
}
