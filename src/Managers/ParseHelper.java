package Managers;
import Drago.Dragon;
import com.sun.source.tree.Tree;

import java.util.List;
import java.util.TreeSet;

public class ParseHelper {
    private String name;
    TreeSet<Dragon> dragon = new TreeSet<Dragon>();
    public String getName(){
        return name;
    }
    public TreeSet<Dragon> getDragon(){return dragon;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDragon(TreeSet<Dragon> dragon){
        this.dragon = dragon;
    }
    public String toString(){
        return ""+ dragon + "";
    }}


