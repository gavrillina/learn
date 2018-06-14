package util;

import java.util.ArrayList;
import java.util.List;

public class Lambda {


    public static List fillList(int amount){
    List list = new ArrayList();
        for (int i = 0; i<amount; i++){
        list.add(i);
    }
    return list;
    }

    public static void showList(List list){
      //stream API
        list.stream().forEach(System.out::println);

        //lambda
        list.forEach(v -> System.out.print(v));
    }

    public static void sumVariables(List list){
    //predicats
        Predicats.sumAll(list, n -> true);
        Predicats.sumAll(list, n -> n % 2 == 0);
        Predicats.sumAll(list, n -> n > 3);
    }
}
