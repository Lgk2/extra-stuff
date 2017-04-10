package com.lgk.extrastuff.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;


/**
 * Created by Dunng on 27/03/2017.
 */
public class ModItems {

    public static ItemMetadata items;

    public static void init() {
        items = register(new ItemMetadata("items"));
    }

    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);
        if (item instanceof ItemMetadata) {
            ((ItemMetadata) item).registerItemModel();
            ((ItemMetadata) item).registerBakeryVariants();
        }
        return item;
    }
}
