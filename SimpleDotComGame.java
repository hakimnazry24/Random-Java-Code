import java.util.ArrayList;
import java.util.List;

public class SimpleDotComGame {
    public static void main(String[] args){
        Dotcom dotcom = new Dotcom("dotcom", new int[]{1, 2, 3}, new int[]{10, 10, 10});
    }
}
class Dotcom{
    Boolean isHit;
    int[] x_axis;
    int[] y_axis;
    String name;

    Dotcom(String n, int[] x, int[] y){
        name = n;
        x_axis = x;
        y_axis = y;
    }

    public void isDestroyed(int input){
        for(int i = 0; i < location.length; i++){
            if (input == location[i]){
                isHit = true;
            }
        }
    }
    public int getCoordinate(){
        List<Integer> coordinates = new ArrayList<>();
        List<Integer> coordinate = new ArrayList<>();
        
        for(int i = 0; i < x_axis.length; i++){
            coordinate.add(x_axis[i]);
            coordinate.add(y_axis[i]);
            coordinates.add(coordinate);
        }
    }
    

}
