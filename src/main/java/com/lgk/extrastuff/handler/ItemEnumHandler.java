package com.lgk.extrastuff.handler;

import net.minecraft.util.IStringSerializable;

/**
 * Created by Dunng on 29/03/2017.
 */
public class ItemEnumHandler {

    public enum ItemMetadata implements IStringSerializable {
        A("resonating_diamond", 0),
        B("resonating_diamond_dust", 1),
        C("resonating_ender_pearl", 2),
        D("resonating_ender_dust", 3),
        E("redstone_storage_cell_empty", 4),
        F("redstone_storage_cell", 5),
        G("redstone_compound", 6),
        H("redstone_powered_ingot", 7),
        I("manasteel_plate", 8),
        J("terrasteel_plate", 9),
        K("elementium_plate", 10),
        L("manasteel_dust", 11),
        M("terrasteel_dust", 12),
        N("elementium_dust", 13),
        O("ingot_of_the_void", 14);




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

        @Override
        public String toString() {
            return getName();
        }

    }


}
