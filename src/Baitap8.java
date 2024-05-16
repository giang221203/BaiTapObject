import static java.lang.StringTemplate.STR;



public class Baitap8 {
    public static output8 TrungBinh(double[] array){
        output8 result = new output8();

        if(array.length == 0){
            result.status = false;
            result.message = "Mảng rỗng";
            return result;
        }
        if(array.length == 1){
            result.status = true;
            result.message = "Đã tìm ra kết quả";
            result.content = STR."Trung bình cộng :\{array[0]} , Giá trị trung bình: \{array[0]}";
            return result;
        }
        double tong = 0.0;

        for(int i = 0; i < array.length; i++){
            tong += array[i];
        }
        double giaTriTrungBinh = 0;
        double trungBinhCong = tong / array.length;
        double timGiaTriTrungBinh = Math.abs(trungBinhCong - array[0]);
        for(int i = 0; i < array.length; i++){
            if(Math.abs(trungBinhCong - array[i]) == 0){
                giaTriTrungBinh = array[i];
                break;
            }
           if( Math.abs(trungBinhCong - array[i]) <= timGiaTriTrungBinh){
               timGiaTriTrungBinh = Math.abs(trungBinhCong - array[i]);
               giaTriTrungBinh = array[i];

           }
        }
        result.status = true;
        result.message = "Đã tìm ra kết quả";
        result.content = STR."Trung bình cộng :\{trungBinhCong} , Giá trị trung bình: \{giaTriTrungBinh}";
        return result;
    }
    public static void main(String[] args) {
        double [] array = {6,5,4};
        System.out.println(TrungBinh(array));
    }
}
