
package com.apocalypse.caerulaarbor.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class RedstoneIngotItem extends Item {
	public RedstoneIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
