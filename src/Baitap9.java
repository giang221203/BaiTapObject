import java.util.Scanner;

public class Baitap9 {
    public static output8 GiaiThua (Long so){
        output8 result = new output8();
        if ( so < 0){
            result.status = false;
            result.message = "Số đã cho sai định dạng";
            return result;
        }
        if(so == 1 || so == 0){
            result.status = true;
            result.message = "Đã tìm ra kết quả";
            result.content =STR."Giai thừa của \{so} là :1 ";
            return result;
        }
        Long  ketQua = so;
        for(Long i = so - 1; i > 0; i--){
            ketQua *= i;
        }
        result.status = true;
        result.message = "Đã tìm ra kết quả";
        result.content =STR."Giai thừa của \{so} là :\{ketQua}";
        return result;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       System.out.println("Nhập vào 1 số");

    Long so;
    boolean status = false;
    while (!status) {
        if(sc.hasNextLong()){
            so = sc.nextLong();
            System.out.println(GiaiThua(so));
            status = true;
        }else {
            System.out.println("Bạn vừa nhập 1 ký tự không phải là số");
            sc.next();
        }
    }

    }
}