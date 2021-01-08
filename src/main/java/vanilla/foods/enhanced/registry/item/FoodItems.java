package vanilla.foods.enhanced.registry.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.MushroomStewItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import vanilla.foods.enhanced.Vafoen;
import vanilla.foods.enhanced.registry.VafoenItemGroup;

public class FoodItems {

    //Food Items list


    //Creates a new Item with the id "pumpkin_slice"
    public static final Item PUMPKIN_SLICE = new Item(new FabricItemSettings()

            //Decides in which Item Group it will be added to, in this case FOOD tab, and the custom created tab "vafoen_itemgroup"
            .group(ItemGroup.FOOD)
            .group(VafoenItemGroup.VAFOEN_ITEMGROUP)

            //Decides the max. amount as a stack
            .maxCount(64)

            //Makes it an edible and adds a food builder which will be needed for the next steps
            .food(new FoodComponent.Builder()

                //How many saturation points you get from eating it (1.2 FLOAT)
                .saturationModifier(1.2F)

                //How many hunger points get filled from eating it (5 hunger points = 2.5 hunger bars)
                .hunger(2)

                //Ends the food builder
                .build()));

    public static final Item FRIED_EGG = new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD)
            .maxCount(16)
            .food(new FoodComponent.Builder()
                    .saturationModifier(2.5F)
                    .hunger(4)
                    .build()));

    public static final Item HONEY_COOKIE = new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD)
            .maxCount(64)
            .food(new FoodComponent.Builder()
                    .saturationModifier(0.6F)
                    .hunger(3)
                    .build()));

    public static final Item SWEET_BERRY_COOKIE = new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD)
            .maxCount(16)
            .food(new FoodComponent.Builder()
                    .saturationModifier(0.6F)
                    .hunger(3)
                    .build()));

    public static final Item APPLE_PIE = new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD)
            .maxCount(64)
            .food(new FoodComponent.Builder()
                    .saturationModifier(12.8F)
                    .hunger(8)
                    .build()));

    public static final Item SWEET_BERRY_PIE = new Item(new FabricItemSettings()
            .group(ItemGroup.FOOD)
            .maxCount(64)
            .food(new FoodComponent.Builder()
                    .saturationModifier(12.8F)
                    .hunger(8)
                    .build()));

    public static final Item PUMPKIN_SOUP = new MushroomStewItem(new FabricItemSettings()
            .group(ItemGroup.FOOD)
            .maxCount(1)
            .food(new FoodComponent.Builder()
                    .saturationModifier(14F)
                    .hunger(32)
                    .build()));

    //Registry to add and register our created items to the game
    public static void foodItemsRegistry() {
        Registry.register(Registry.ITEM, new Identifier(Vafoen.MOD_ID, "pumpkin_slice"), PUMPKIN_SLICE);
        Registry.register(Registry.ITEM, new Identifier(Vafoen.MOD_ID, "fried_egg"), FRIED_EGG);
        Registry.register(Registry.ITEM, new Identifier(Vafoen.MOD_ID, "honey_cookie"), HONEY_COOKIE);
        Registry.register(Registry.ITEM, new Identifier(Vafoen.MOD_ID, "sweet_berry_cookie"), SWEET_BERRY_COOKIE);
        Registry.register(Registry.ITEM, new Identifier(Vafoen.MOD_ID, "apple_pie"), APPLE_PIE);
        Registry.register(Registry.ITEM, new Identifier(Vafoen.MOD_ID, "sweet_berry_pie"), SWEET_BERRY_PIE);
        Registry.register(Registry.ITEM, new Identifier(Vafoen.MOD_ID, "pumpkin_soup"), PUMPKIN_SOUP);
    }
}
