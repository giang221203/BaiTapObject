import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Baitap11 {
    public static output8 SapXep(Integer[] ...arr){
        output8 result=new output8();
        boolean status = true;
        for(int i=0;i<arr.length;i++){
            if(arr[i].length > 0){
                status=false;
                break;
            }
        }
        if(status){
            result.status = false;
            result.message = "Mãng rỗng";
            return result;
        }
        ArrayList<Integer> array = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            array.addAll(Arrays.stream(arr[i]).toList());
        }
        array = array.stream().distinct().collect(Collectors.toCollection(ArrayList::new));
        array.sort(Integer::compareTo);
        result.status = true;
        result.message = "Đã tìm ra kết quả";
        result.content = "Mảng đã sắp xếp:" +array;
        return result;
    }
    public static void main(String[] args) {
        Integer[] a = {1,5,3,2};
        Integer[] b = {2,4,2,6};
        System.out.println(SapXep(a,b));
    }
}
