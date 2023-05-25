import java.lang.reflect.Array;
import java.util.ArrayList;

public class List{
    public static void main(String[] args){
        ArrayList<Integer> number_arr = new ArrayList<Integer>();
        number_arr.add(10);
        number_arr.add(20);
        System.out.println(number_arr);
        System.out.println(number_arr.size());
        System.out.println(number_arr.contains(20));
        System.out.println(number_arr.contains(1));
        number_arr.remove(0);
        number_arr.remove(0);
        System.out.println(number_arr.isEmpty());
    }
}
