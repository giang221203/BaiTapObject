
public class TimKiemNhiPhan {
    public static output8 TimKiem(double[] arr, double soCanTim) {
        output8 result = new output8();
        if (arr.length == 0) {
            result.status = false;
            result.message = "Mảng rỗng";
            return result;
        }
        int viTriDau = 0;
        int viTriCuoi = arr.length - 1;
        int viTriXuatHien;
        do {
            int viTriTrungVi = (viTriDau + viTriCuoi) / 2;
            if (soCanTim == arr[viTriTrungVi]) {
                viTriXuatHien = viTriTrungVi;
                result.status = true;
                result.message = "Đã tìm thấy số cần tìm";
                result.content = STR."Vị trí xuất hiên số cần tìm: \{viTriXuatHien}";
                return result;
            }
            if (soCanTim < arr[viTriTrungVi]) {
                viTriCuoi = viTriTrungVi - 1;
            } else {
                viTriDau = viTriTrungVi + 1;
            }
        }while (viTriDau <= viTriCuoi);
        result.status = false;
        result.message = "Không tìm thấy số cần tìm";
        result.content = "";
        return result;
    }

    public static void main(String[] args) {
       double[] arr= {1,2};
        double soCanTIm = 1;
        System.out.println(TimKiem(arr,soCanTIm));
    }

}
