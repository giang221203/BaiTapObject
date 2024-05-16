import java.util.ArrayList;
import java.util.stream.Stream;

public static String TimPhanTu(int[] arr){
        String kq;
        if(arr.length < 2){
            kq= "not có 2 phần tử để tìm";
            return kq;
        }

    ArrayList<Integer> myArr = new ArrayList<>();
    for(int i=0;i<arr.length;i++){
        if(arr[i]<=22 && arr[i]>= 0){
            myArr.add(arr[i]);
        }
    }
        if(myArr.size() < 2){
            kq= "not có 2 phần tử để tìm";
            return kq;
        }


//        for(int i = 0;i < myArr.size() - 1;i++){
//            for(int j = i + 1;j < myArr.size();j++){
//                if(myArr.get(i) + myArr.get(j) == 22){
//                    kq = "Gia tri phan tu co tong bang 22 la:"+arr[i] +" " +arr[j];
//                    return kq;
//                }
//            }
//        }

    ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<myArr.size();i++){
            if(!list.contains(22 - myArr.get(i))){
                list.add(myArr.get(i));
            }else {
                kq = "Gia tri phan tu co tong bang 22 la:"+myArr.get(i) +" " +(22 - myArr.get(i));
                return kq;
            }
        }
        kq = "not found 2 phan tu co tong bang 22";
        return kq;
    }
    public static void main() {
        int[] arr = {3,6,5,7,10,15,20,35,31,70};
        System.out.println(TimPhanTu(arr));
    }

