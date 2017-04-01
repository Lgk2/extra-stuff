package lgk.extrastuff.handler;


import net.minecraft.util.IStringSerializable;

/**
 * Created by Dunng on 29/03/2017.
 */

public class BlockEnumHandler {

    public enum BlockMetadata implements IStringSerializable {
        A("hardened_machine_frame", 0),
        B("reinforced_machine_frame", 1),
        C("resonant_machine_frame", 2);

        private int ID;
        public String name;

        BlockMetadata(String name, int ID) {
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

