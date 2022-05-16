package Drago;

import java.util.Comparator;

public class HeadComparatop implements Comparator<DragonHead> {
    public int compare(DragonHead d1, DragonHead d2) {
        return (int) (d2.getEyesCount() - d1.getEyesCount());
    }
}
