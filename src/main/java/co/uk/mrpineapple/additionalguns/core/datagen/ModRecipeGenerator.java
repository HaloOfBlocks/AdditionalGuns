package co.uk.mrpineapple.additionalguns.core.datagen;

import co.uk.mrpineapple.additionalguns.core.registry.ItemRegistry;
import com.mrcrayfish.guns.crafting.WorkbenchIngredient;
import com.mrcrayfish.guns.crafting.WorkbenchRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

/**
 * Author: Autovw
 */
public class ModRecipeGenerator extends RecipeProvider {

    public ModRecipeGenerator(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        // Guns
        WorkbenchRecipeBuilder.crafting(ItemRegistry.MAMMOTH.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 30))
                .addIngredient(WorkbenchIngredient.of(Items.OAK_PLANKS, 20))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .addCriterion("has_oak_planks", has(Items.OAK_PLANKS))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.VECTOR.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 12))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.NINE_A_NINE_ONE.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 20))
                .addIngredient(WorkbenchIngredient.of(Items.SPONGE, 1))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .addCriterion("has_sponge", has(Items.SPONGE))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.ACE_OF_SPADES.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 28))
                .addIngredient(WorkbenchIngredient.of(Items.BLACK_CONCRETE, 4))
                .addIngredient(WorkbenchIngredient.of(Items.WHITE_CONCRETE, 4))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .addCriterion("has_black_concrete", has(Items.BLACK_CONCRETE))
                .addCriterion("has_white_concrete", has(Items.WHITE_CONCRETE))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.G_ELEVEN.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 65))
                .addIngredient(WorkbenchIngredient.of(Items.GRAY_WOOL, 10))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.DUSTS_REDSTONE, 5))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .addCriterion("has_gray_wool", has(Items.GRAY_WOOL))
                .addCriterion("has_redstone", has(Tags.Items.DUSTS_REDSTONE))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.VINTOREZ.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 45))
                .addIngredient(WorkbenchIngredient.of(Items.STRIPPED_OAK_LOG, 3))
                .addIngredient(WorkbenchIngredient.of(Items.SPONGE, 1))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .addCriterion("has_stripped_oak_log", has(Items.STRIPPED_OAK_LOG))
                .addCriterion("has_sponge", has(Items.SPONGE))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.VAL.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 45))
                .addIngredient(WorkbenchIngredient.of(Items.SPONGE, 1))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .addCriterion("has_sponge", has(Items.SPONGE))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.AUG.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 32))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.FN_TWO_THOUSAND.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 25))
                .addIngredient(WorkbenchIngredient.of(Items.WHITE_CONCRETE, 5))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .addCriterion("has_white_concrete", has(Items.WHITE_CONCRETE))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.PP_NINETEEN.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 13))
                .addIngredient(WorkbenchIngredient.of(Items.BLACK_WOOL, 5))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .addCriterion("has_black_wool", has(Items.BLACK_WOOL))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.MAT_FORTY_NINE.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 28))
                .addIngredient(WorkbenchIngredient.of(Items.OAK_PLANKS, 1))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .addCriterion("has_oak_planks", has(Items.OAK_PLANKS))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.SCHWARZLOSE.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 10))
                .addIngredient(WorkbenchIngredient.of(Items.OAK_PLANKS, 1))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .addCriterion("has_oak_planks", has(Items.OAK_PLANKS))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.OTS_THREE.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 45))
                .addIngredient(WorkbenchIngredient.of(Items.GRAY_WOOL, 3))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .addCriterion("has_gray_wool", has(Items.GRAY_WOOL))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.AK_HUNDRED_FIVE.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 80))
                .addIngredient(WorkbenchIngredient.of(Items.BLACK_WOOL, 4))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .addCriterion("has_black_wool", has(Items.BLACK_WOOL))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.RAVENS_CLAW.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 65))
                .addIngredient(WorkbenchIngredient.of(Items.BLACK_WOOL, 2))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .addCriterion("has_black_wool", has(Items.BLACK_WOOL))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.BANSHEE.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 20))
                .addIngredient(WorkbenchIngredient.of(Items.SPONGE, 1))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .addCriterion("has_sponge", has(Items.SPONGE))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.M_FOUR_A_ONE_S.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 32))
                .addIngredient(WorkbenchIngredient.of(Items.SPONGE, 1))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .addCriterion("has_sponge", has(Items.SPONGE))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.M_FOUR_A_FOUR.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 34))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.GLOCK_EIGHT_TEEN.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 16))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.AKM.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 30))
                .addIngredient(WorkbenchIngredient.of(ItemTags.PLANKS, 4))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .addCriterion("has_planks", has(ItemTags.PLANKS))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.AKM_CUSTOM.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 30))
                .addIngredient(WorkbenchIngredient.of(Items.BLACK_CONCRETE, 4))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .addCriterion("has_black_concrete", has(Items.BLACK_CONCRETE))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.SSG_ZERO_EIGHT.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 30))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.DESERT_EAGLE.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 18))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.MAC_TEN.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 24))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.AWM.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 60))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .build(consumer);


        // Scopes
        WorkbenchRecipeBuilder.crafting(ItemRegistry.HOLO_SCOPE.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 7))
                .addIngredient(WorkbenchIngredient.of(Items.GLASS_PANE, 2))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.DUSTS_REDSTONE, 4))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .addCriterion("has_glass_pane", has(Items.GLASS_PANE))
                .addCriterion("has_redstone", has(Tags.Items.DUSTS_REDSTONE))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.ZERKALO_SCOPE.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 8))
                .addIngredient(WorkbenchIngredient.of(Items.GLASS_PANE, 1))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.DUSTS_REDSTONE, 4))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .addCriterion("has_glass_pane", has(Items.GLASS_PANE))
                .addCriterion("has_redstone", has(Tags.Items.DUSTS_REDSTONE))
                .build(consumer);


        // Stocks
        WorkbenchRecipeBuilder.crafting(ItemRegistry.BASIC_STOCK.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_IRON, 9))
                .addCriterion("has_iron_nugget", has(Tags.Items.NUGGETS_IRON))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.VINTOREZ_STOCK.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_IRON, 4))
                .addIngredient(WorkbenchIngredient.of(Items.STRIPPED_OAK_LOG, 1))
                .addCriterion("has_iron_nugget", has(Tags.Items.NUGGETS_IRON))
                .addCriterion("has_stripped_oak_log", has(Items.STRIPPED_OAK_LOG))
                .build(consumer);


        // Barrels
        WorkbenchRecipeBuilder.crafting(ItemRegistry.MUZZLE_BRAKE.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 3))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_IRON, 6))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .addCriterion("has_iron_nugget", has(Tags.Items.NUGGETS_IRON))
                .build(consumer);


        // Under Barrels
        WorkbenchRecipeBuilder.crafting(ItemRegistry.ANGLED_GRIP.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 5))
                .addIngredient(WorkbenchIngredient.of(Items.GRAY_WOOL, 1))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .addCriterion("has_gray_wool", has(Items.GRAY_WOOL))
                .build(consumer);


        // Ammunition
        WorkbenchRecipeBuilder.crafting(ItemRegistry.AMMO_NINE.get(), 16)
                .addIngredient(WorkbenchIngredient.of(Tags.Items.GUNPOWDER, 1))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_IRON, 2))
                .addIngredient(WorkbenchIngredient.of(Items.BLACK_DYE, 1))
                .addCriterion("has_gunpowder", has(Tags.Items.GUNPOWDER))
                .addCriterion("has_iron_nugget", has(Tags.Items.NUGGETS_IRON))
                .addCriterion("has_black_dye", has(Items.BLACK_DYE))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.AMMO_FORTY_FIVE.get(), 16)
                .addIngredient(WorkbenchIngredient.of(Tags.Items.GUNPOWDER, 2))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_IRON, 1))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_GOLD, 2))
                .addCriterion("has_gunpowder", has(Tags.Items.GUNPOWDER))
                .addCriterion("has_iron_nugget", has(Tags.Items.NUGGETS_IRON))
                .addCriterion("has_gold_nugget", has(Tags.Items.NUGGETS_GOLD))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.AMMO_FIVE_FOUR_FIVE.get(), 16)
                .addIngredient(WorkbenchIngredient.of(Tags.Items.GUNPOWDER, 4))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_IRON, 4))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_GOLD, 1))
                .addIngredient(WorkbenchIngredient.of(Items.RED_DYE, 1))
                .addCriterion("has_gunpowder", has(Tags.Items.GUNPOWDER))
                .addCriterion("has_iron_nugget", has(Tags.Items.NUGGETS_IRON))
                .addCriterion("has_gold_nugget", has(Tags.Items.NUGGETS_GOLD))
                .addCriterion("has_red_dye", has(Items.RED_DYE))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.AMMO_FIVE_FIVE_SIX.get(), 16)
                .addIngredient(WorkbenchIngredient.of(Tags.Items.GUNPOWDER, 3))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_IRON, 4))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_GOLD, 1))
                .addIngredient(WorkbenchIngredient.of(Items.WHITE_DYE, 1))
                .addCriterion("has_gunpowder", has(Tags.Items.GUNPOWDER))
                .addCriterion("has_iron_nugget", has(Tags.Items.NUGGETS_IRON))
                .addCriterion("has_gold_nugget", has(Tags.Items.NUGGETS_GOLD))
                .addCriterion("has_white_dye", has(Items.WHITE_DYE))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.AMMO_SEVEN_SIX_TWO_FIFTY_ONE.get(), 16)
                .addIngredient(WorkbenchIngredient.of(Tags.Items.GUNPOWDER, 5))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_IRON, 5))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_GOLD, 3))
                .addCriterion("has_gunpowder", has(Tags.Items.GUNPOWDER))
                .addCriterion("has_iron_nugget", has(Tags.Items.NUGGETS_IRON))
                .addCriterion("has_gold_nugget", has(Tags.Items.NUGGETS_GOLD))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.AMMO_NINE_THREE_NINE.get(), 16)
                .addIngredient(WorkbenchIngredient.of(Tags.Items.GUNPOWDER, 4))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_IRON, 4))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_GOLD, 2))
                .addCriterion("has_gunpowder", has(Tags.Items.GUNPOWDER))
                .addCriterion("has_iron_nugget", has(Tags.Items.NUGGETS_IRON))
                .addCriterion("has_gold_nugget", has(Tags.Items.NUGGETS_GOLD))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.AMMO_NINE_THREE_NINE_SP_FIVE.get(), 16)
                .addIngredient(WorkbenchIngredient.of(Tags.Items.GUNPOWDER, 4))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_IRON, 6))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_GOLD, 2))
                .addIngredient(WorkbenchIngredient.of(Items.BLUE_DYE, 1))
                .addCriterion("has_gunpowder", has(Tags.Items.GUNPOWDER))
                .addCriterion("has_iron_nugget", has(Tags.Items.NUGGETS_IRON))
                .addCriterion("has_gold_nugget", has(Tags.Items.NUGGETS_GOLD))
                .addCriterion("has_blue_dye", has(Items.BLUE_DYE))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.AMMO_NINE_THREE_NINE_SP_SIX.get(), 16)
                .addIngredient(WorkbenchIngredient.of(Tags.Items.GUNPOWDER, 4))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_IRON, 6))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_GOLD, 2))
                .addIngredient(WorkbenchIngredient.of(Items.GREEN_DYE, 1))
                .addCriterion("has_gunpowder", has(Tags.Items.GUNPOWDER))
                .addCriterion("has_iron_nugget", has(Tags.Items.NUGGETS_IRON))
                .addCriterion("has_gold_nugget", has(Tags.Items.NUGGETS_GOLD))
                .addCriterion("has_green_dye", has(Items.GREEN_DYE))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(ItemRegistry.AMMO_JCC.get(), 32)
                .addIngredient(WorkbenchIngredient.of(Tags.Items.GUNPOWDER, 1))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_IRON, 6))
                .addIngredient(WorkbenchIngredient.of(Items.CACTUS, 1))
                .addCriterion("has_gunpowder", has(Tags.Items.GUNPOWDER))
                .addCriterion("has_iron_nugget", has(Tags.Items.NUGGETS_IRON))
                .addCriterion("has_cactus", has(Items.CACTUS))
                .build(consumer);
    }
}
