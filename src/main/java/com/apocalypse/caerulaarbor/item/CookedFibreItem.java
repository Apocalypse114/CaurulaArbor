
package com.apocalypse.caerulaarbor.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class CookedFibreItem extends Item {
	public CookedFibreItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(6).saturationMod(6f).meat().build()));
	}
}
