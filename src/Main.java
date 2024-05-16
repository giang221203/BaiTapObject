import java.util.Arrays;

class result2 {
    public Boolean status;
    public String message;
    public double[] content;

    @Override
    public String toString() {
        return "result{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", content=" + Arrays.toString(content) +
                '}';
    }
}
public class Main {
    public static result2 BinhPhuong(double [] arr){
        result2 output = new result2();
        double[] newArr = new double[arr.length];
        if (arr.length == 0) {
            output.status = false;
            output.message = "mãng rỗng";
            return output;
        }
//        for (int i = 0; i < arr.length; i++) {
//            newArr[i] = arr[i]* arr[i];
//        }
        int i = 0;
        for(double el :arr){
            newArr[i] = el * el;
            i++;
        }
        output.status = true;
        output.message = "Đã trả ra kết quả";
        output.content = newArr;
        return output;
    }
    public static void main(String[] args) {
        double[] arr = {1,2,-3,4,5,6,7,8,9};
        System.out.println(BinhPhuong(arr));
    }
}