import java.util.ArrayList;

public class Baitap10 {
    public static output8 TrungLap(Integer[][] arr) {
        output8 result = new output8();

        if (arr.length == 0) {
            result.status = false;
            result.message = "Mảng không có mảng con";
            return result;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length == 0) {
                result.status = false;
                result.message = "Mảng rỗng";
                return result;
            }
        }
        ArrayList<Integer> mangTrungLapTamthoi = new ArrayList<>();
        for (int i = 0; i < arr[0].length; i++) {
            if (!mangTrungLapTamthoi.contains(arr[0][i])) {
                mangTrungLapTamthoi.add(arr[0][i]);
            }
        }
        if(arr.length == 1){
            result.status = true;
            result.message = "Đã tìm ra kết quả";
            result.content = "Danh sách mảng trùng lặp :" +mangTrungLapTamthoi;
            return result;
        }
        for(int i = 1; i < arr.length; i++) {
            ArrayList<Integer> mangTrungLap = new ArrayList<>();
            for(int j = 0; j < mangTrungLapTamthoi.size(); j++) {
                for(int k = 0; k < arr[i].length; k++) {
                    if (mangTrungLapTamthoi.get(j) == arr[i][k]) {
                        mangTrungLap.add(mangTrungLapTamthoi.get(j));
                    }
                }
            }
            if(mangTrungLap.size() == 0) {
                result.status = true;
                result.message = "Đã tìm ra kết quả";
                result.content = "Mảng không có phần tử naof";
                return result;
            }
            mangTrungLapTamthoi =  mangTrungLap;
        }
        result.status = true;
        result.message = "Đã tìm ra kết quả";
        result.content = "Danh sách mảng trùng lặp :" +mangTrungLapTamthoi;
        return result;
    }

    public static void main(String[] args) {
        Integer[][] arr = {{2, 2, 3, 4}};
        System.out.println(TrungLap(arr));
    }
}
