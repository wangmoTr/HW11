import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array1= new ArrayList<Integer>(Arrays.asList(-2,-3,6,3));
        ArrayList<Integer> array2= new ArrayList<Integer>(Arrays.asList(-2,-4,5,-3));
        System.out.println(array1);
        System.out.println(array2);
        ArrayList<Integer> array3 = new ArrayList<Integer>();
        //add array 1 and 2 in 3
        for(int i = 0; i < array1.size(); i++) {
            System.out.println("i " + array1.get(i));
            array3.add(array1.get(i));
        }
        System.out.println("this is arrray3 " + array3);
        for(int j = 0; j < array2.size(); j++) {
            System.out.println("i " + array1.get(j));
            array3.add(array1.get(j));
        }
        System.out.println("this is arrray3 after adding 2 arrays " + array3);
    }
}
