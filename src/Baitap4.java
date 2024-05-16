import java.util.ArrayList;
import java.util.List;

class result4 {
    public Boolean status;
    public String message;
    public content content;

    class content {
        ArrayList<Integer> mangtrung;
        ArrayList<Integer> mangkhongtrung;

        @Override
        public String toString() {
            return "content{" +
                    "mangtrung=" + mangtrung +
                    ", mangkhongtrung=" + mangkhongtrung +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "result{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", content=" + content +
                '}';
    }
}

public class Baitap4 {

    public static ArrayList<Integer> LocTrung(ArrayList<Integer> array){
        ArrayList<Integer> mangLapTrung = new ArrayList<>();
        for(int i = 0; i < array.size(); i++) {
            if(!mangLapTrung.contains(array.get(i))){
                mangLapTrung.add(array.get(i));
            }
        }
        return mangLapTrung;
    }
        public static result4 TrungLap(ArrayList<Integer>...arr){
            result4 output = new result4();
            output.content = new result4().new content();
            output.content.mangtrung = new ArrayList<>();
            output.content.mangkhongtrung = new ArrayList<>();
            ArrayList<Integer> myArray = new ArrayList<>();
            boolean status = true;
            for(int i = 0; i<arr.length; i++){
                if(!arr[i].isEmpty()){
                    status = false;
                    break;
                }
            }
            if(status){
                output.status = false;
                output.message = "mãng rỗng";
                return output;
            }
            for(int i = 0; i<arr.length; i++){
                arr[i] = LocTrung(arr[i]);
            }
            for(int i = 0; i<arr.length; i++){
                myArray.addAll(arr[i]);
            }


            for (int i = 0; i < myArray.size(); i++) {
                int dem = 1;
                if(output.content.mangtrung.contains(myArray.get(i))) continue;
                if(output.content.mangkhongtrung.contains(myArray.get(i))) continue;
                for (int j = i + 1; j < myArray.size(); j++) {
                    if (myArray.get(i) == myArray.get(j)) {
                        dem++;
                    }
                }
                if (dem == arr.length ) {
                    output.content.mangtrung.add(myArray.get(i));
                } else {
                    output.content.mangkhongtrung.add(myArray.get(i));
                }
            }
            if (output.content.mangtrung.isEmpty()) {
                output.message = "Mảng trùng không có phần tử nào";
            } else if (output.content.mangkhongtrung.isEmpty()) {
                output.message = "Mảng không trùng không có phần tử nào";
            } else {
                output.status = true;
                output.message = "Đã tìm ra kết quả";
            }
            return output;
        }

    public static void main(String[] args) {

        ArrayList<Integer> arr3 = new ArrayList<>(List.of(4,4, 4,5,2));
        ArrayList<Integer> arr4 = new ArrayList<>(List.of(4,2,1));
        ArrayList<Integer> arr5 = new ArrayList<>(List.of(4,7));

        System.out.println(TrungLap(arr3,arr4,arr5));
    }
}

