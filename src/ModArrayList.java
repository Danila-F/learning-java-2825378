import java.util.ArrayList;

public class ModArrayList<E> extends ArrayList<E> {
    
    public E getUsingMod(int index) {
        index = Math.abs(index) % super.size();
        //System.out.println("Getting element using mod " + super.get(index));
        return super.get(index);
    }

}
