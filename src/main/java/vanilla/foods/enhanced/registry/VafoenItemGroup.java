package vanilla.foods.enhanced.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import vanilla.foods.enhanced.Vafoen;
import vanilla.foods.enhanced.registry.block.FoodBlocks;
import vanilla.foods.enhanced.registry.item.FoodItems;

public class VafoenItemGroup {

    //A class specifically made for the TAB inventory


    //This creates a more advanced item group (FabricItemGroupBuilder.create), see https://fabricmc.net/wiki/tutorial:itemgroup
    public static final ItemGroup VAFOEN_ITEMGROUP = FabricItemGroupBuilder.create(

            //Sets an id for the item group
            new Identifier(Vafoen.MOD_ID, "vafoen_itemgroup"))

            //Sets an Icon from an Itemstack for the item group
            .icon(() -> new ItemStack(FoodItems.SWEET_BERRY_PIE))

            //Adds and sorts items to my item group by order
            .appendItems(stacks -> {
                stacks.add(new ItemStack(FoodBlocks.EGG_BLOCK));
                stacks.add(new ItemStack(FoodBlocks.CHOCO_CAKE));
                stacks.add(new ItemStack(FoodItems.SWEET_BERRY_COOKIE));
                stacks.add(new ItemStack(FoodItems.HONEY_COOKIE));
                stacks.add(new ItemStack(FoodItems.SWEET_BERRY_PIE));
                stacks.add(new ItemStack(FoodItems.APPLE_PIE));
                stacks.add(new ItemStack(FoodItems.PUMPKIN_SLICE));
                stacks.add(new ItemStack(FoodItems.PUMPKIN_SOUP));
                stacks.add(new ItemStack(FoodItems.FRIED_EGG));
            })

            //Ends the Item Group builder (FabricItemGroupBuilder.create)
            .build();
}
