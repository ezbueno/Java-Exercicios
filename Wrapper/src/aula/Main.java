package aula;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
//        int i = 10;
//        Integer integer = Integer.valueOf(i);
//        i = integer.intValue();
//        System.out.println(i);
//
//        double d = null;
//        Double d2 = null;
//
//          List<Integer> list = new ArrayList<>();
//          list.add(Integer.valueOf(1));
//          list.add(Integer.valueOf(2));
//          list.add(Integer.valueOf(3));
//          System.out.println(list);
//          
//          print(Integer.valueOf(20));

            //Integer x = 20;
            //Integer x = Integer.valueOf(20);
            //x++;
            
            Integer x = Integer.valueOf(20);
            int temp = x.intValue();
            temp++;
            x = Integer.valueOf(temp);
            
            System.out.println(x);
            print(true);
            
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            
            for (int j: list){
                System.out.println(j);
            }
            
            Integer abc = Integer.valueOf(50);
            int cba = abc;
            
            System.out.println(cba);
            
            //Dessa maneira será apresentado um erro após a compilação, pois não
            //é possível converter de um objeto wrapper que recebe um valor null
            //para uma variável do tipo primitivo.
            Integer w = null;
            int w2 = w;
        
    }
    
    public static void print(Object obj){
        System.out.println(obj);
    }
    
}
