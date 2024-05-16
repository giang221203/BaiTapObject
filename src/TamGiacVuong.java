import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TamGiacVuong {
    public static output8 XacDinh3CanhCuaTamGiacVuong(ArrayList<Double> arr){
        output8 result = new output8();
        if(arr.size() < 3){
            result.status = false;
            result.message = "Mảng không đủ 3 phần tử để tạo thành tam giác vuông";
            return result;
        }
        ArrayList<Double> mangDaLoc = new ArrayList<>();
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) > 0){
                mangDaLoc.add(arr.get(i));
            }
        }
        mangDaLoc.sort(Comparator.reverseOrder());

        ArrayList<Double> MangLuuGiaTri = new ArrayList<>();
        int dem = 0;
        for(int a = 0;a < mangDaLoc.size()-2; a++){
            for(int b = a+1;b < mangDaLoc.size()-1;b++){
                for(int c = b+1;c < mangDaLoc.size();c++){
                    if(mangDaLoc.get(a) == mangDaLoc.get(b) && mangDaLoc.get(b) == mangDaLoc.get(c)){
                        continue;
                    }
                    if(Math.pow(mangDaLoc.get(a),2) == Math.pow(mangDaLoc.get(b),2) + Math.pow(mangDaLoc.get(c),2)){
                        MangLuuGiaTri.add(mangDaLoc.get(a));
                        MangLuuGiaTri.add(mangDaLoc.get(b));
                        MangLuuGiaTri.add(mangDaLoc.get(c));
                        result.status = true;
                        result.message = "Đã tìm ra kết quả";
                        result.content ="Ba giá trị để tạo thành 1 ô vuông là:" +MangLuuGiaTri;
                        return result;
                    }
                }
            }
        }
        result.status = false;
        result.message = "Không tìm ra kết quả";
        result.content ="";
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Double> arr = new ArrayList<>(List.of(5.0,3.0,3.0,3.0,6.2,7.5,4.0,7.0,0.0,5.0,12.0,13.0));
        System.out.println(XacDinh3CanhCuaTamGiacVuong(arr));
    }
}
