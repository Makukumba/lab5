package Managers;
import Drago.Dragon;
import com.sun.source.tree.Tree;

import java.util.List;
import java.util.TreeSet;

public class ParseHelper {
    TreeSet<Dragon> dragon = new TreeSet<Dragon>();
    public TreeSet<Dragon> getDragon(){return dragon;
    }
    public void setDragon(TreeSet<Dragon> dragon){
        this.dragon = dragon;
    }
    public String toString(){

        //Iterator<Dragon> itr = dragon.iterator();
        //  while (itr.hasNext()) {
        //    System.out.println(itr.next().getName());
        //}
        return "" + dragon;
    }
}


