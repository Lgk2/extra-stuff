package lgk.extrastuff.handler;

import net.minecraft.util.IStringSerializable;

/**
 * Created by Dunng on 29/03/2017.
 */
public class EnumHandler {

    public enum ItemMetadata implements IStringSerializable {
        A("resonating_diamond", 0),
        B("resonating_emerald", 1),
        C("resonating_lapis", 2),
        D("flawless_redstone", 3);

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
