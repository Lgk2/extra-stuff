package lgk.extrastuff.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;


/**
 * Created by Dunng on 27/03/2017.
 */
public class ModItems {

    public static ItemBase resonating_diamond;

    public static void init() {
        resonating_diamond = register(new ItemBase("resonating_diamond"));
    }

    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);

        if (item instanceof ItemBase) {
            ((ItemBase) item).registerItemModel();
        }

        return item;
    }

}
