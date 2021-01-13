package vanilla.foods.enhanced;


import net.fabricmc.api.ModInitializer;
import vanilla.foods.enhanced.registry.block.FoodBlocks;
import vanilla.foods.enhanced.registry.item.FoodItems;

public class Vafoen implements ModInitializer {

    //Creates a string used for calling the mod ID (vafoen)
    public static String MOD_ID = "vafoen";


    //Calling the registries to the onInitialize
    @Override
    public void onInitialize() {
        FoodItems.foodItemsRegistry();
        FoodBlocks.foodBlocksRegistry();

    }
}
