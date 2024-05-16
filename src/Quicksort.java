import java.util.ArrayList;
import java.util.List;
public class Quicksort {
public static ArrayList<Double> sapXep(ArrayList<Double> arr) {
    if (arr.size() < 2) {
        return arr;
    }
    ArrayList<Double> left = new ArrayList<>();
    ArrayList<Double> right = new ArrayList<>();
    Double pivot = arr.get(arr.size() - 1);
    for (int i = 0; i < arr.size() - 1; i++) {
        if (arr.get(i) < pivot) {
            left.add(arr.get(i));
        } else {
            right.add(arr.get(i));
        }
    }

    ArrayList<Double> arrLeft = sapXep(left);
    ArrayList<Double> arrRight = sapXep(right);

    ArrayList<Double> sortedArray = new ArrayList<>();
    sortedArray.addAll(arrRight);
    sortedArray.add(pivot);
    sortedArray.addAll(arrLeft);



    return sortedArray;
}



public static void main() {
    ArrayList<Double> arr = new ArrayList<>(List.of(4.6,5.6,6.0,7.2));
    System.out.println(sapXep(arr));
}
}