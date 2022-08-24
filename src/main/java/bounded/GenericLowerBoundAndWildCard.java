package bounded;

import java.util.ArrayList;
import java.util.List;

public class GenericLowerBoundAndWildCard {
    public static void main(String[] args) {

        List<Object> objList = new ArrayList<>();
        addNumber(objList);
        System.out.println(objList);

        List<Number> numList = new ArrayList<>();
        addNumber(numList);
        System.out.println(numList);

        List<Integer> intList = new ArrayList<>();
        addNumber(intList);
        System.out.println(intList);

        addNumber3(objList);
        System.out.println(objList);

    }

    public static void addNumber(List<? super Integer> list){ // we use WildCard in order to use parent of defined generic type. In this case it is Integer, so we can use Object,Number and Integer.
        for (int i = 1; i < 11; i++) {
            list.add(i);
        }
    }

    public static void addNumber3(List<Object> myList){
            myList.add(10);
            myList.add("test");
    }
}
