package lgk.extrastuff.handler;

import net.minecraft.util.IStringSerializable;

/**
 * Created by Dunng on 29/03/2017.
 */
public class ItemEnumHandler {

    public enum ItemMetadata implements IStringSerializable {
        A("resonating_diamond", 0),
        B("redstone_storage_cell_empty", 1),
        C("redstone_storage_cell", 2),
        D("manasteel_plate", 3),
        E("resonating_diamond_dust", 4),
        F("redstone_compound", 5),
        G("redstone_powered_ingot", 6),
        H("resonating_ender_pearl", 7);

        private int ID;
        public String name;

        ItemMetadata(String name, int ID) {
            this.ID = ID;
            this.name = name;
        }

        @Override
        public String getName() {
            return this.name;
        }

        public int getID() {
            return this.ID;
        }

        @Override
        public String toString() {
            return getName();
        }

    }


}
