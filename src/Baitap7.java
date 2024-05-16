import java.util.HashMap;

class output{
    public boolean status;
    public String message;
    public HashMap<String,Integer> content;



}
public class Baitap7 {

    public static output DemPhanTu(String[][] array){
        output result = new output();
        result.content = new HashMap<>();
        if(array.length == 0){
            result.status = false;
            result.message= "Mảng không có phần tử nào";
            return result;
        }
        for(int i=0;i<array.length;i++){
            if(array[i].length == 0){
                result.status = false;
                result.message = "Mảng con sai kiểu dữ liệu";
            }
        }
       for(int i=0;i<array.length;i++){
           for(int j=0;j<array[i].length;j++){
               if(result.content.containsKey(array[i][j])){
                   result.content.put(array[i][j],result.content.get(array[i][j])+1);
               }else {
                   result.content.put(array[i][j],1);
               }
           }
       }
        result.status = true;
        result.message = "Đã tìm ra kết quả";
        return result;
    }
    public static void main(String[] args) {
String [][] array = {{"a","b","c"},{"a","1","e"},{"1","b","c"}};
        System.out.println(DemPhanTu(array));
    }
}
