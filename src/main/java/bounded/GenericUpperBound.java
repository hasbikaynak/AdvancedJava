package bounded;

//we can specify that a method accepts a type an all its subclasses(upper bound)
public class GenericUpperBound<T extends Number>  {

    T[] numberArray;

    public GenericUpperBound(T[] numberArray) {
        this.numberArray = numberArray;
    }

    public double getAverage(){
        double sum = 0;
        for (int i = 0; i < numberArray.length; i++) {
            sum+=numberArray[i].doubleValue();
        }

        double avg = sum/numberArray.length;
        return avg;
    }

    public static void main(String[] args) {

        Integer[] intArr = {2,5,45,34};
        GenericUpperBound<Integer> gub = new GenericUpperBound<>(intArr);
        System.out.println("Integer Array avg value: "+ gub.getAverage());

        Double[] doubleArr = {2.45,5.23,45.67,34.12};
        GenericUpperBound<Double> gub1 = new GenericUpperBound<>(doubleArr);
        System.out.println("Double Array avg value: "+ gub1.getAverage());
    }
}
