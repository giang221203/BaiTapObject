import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TimViTri {
    public static int[] TimViTriBinhPhuong(int[] arr1, int[] arr2) {
        if(arr1.length == 0 || arr2.length == 0){
            return null;
        }
        int[] viTriXuatHien = new int[arr2.length];
        for(int j = 0; j < arr2.length; j++){
            for(int k = 0; k < arr1.length; k++){
                if(Math.pow(arr2[j],2) == arr1[k]){
                    viTriXuatHien[j] = k;
                    break;
                }else {
                    viTriXuatHien[j] = -1;
                }

            }

        }

        return viTriXuatHien;
    }
    public static void main(String[] args) {
        int[] arr1 = {2,4,3,8,16,36,64};
        int[] arr2 = {2,5,8};

        System.out.println(Arrays.toString(TimViTriBinhPhuong(arr1, arr2)));
    }
}
