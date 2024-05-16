import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class result {
    public Boolean status;
    public String message;
    public  content content;

    class content {
        ArrayList<Integer> mangchan;
        int tongMangChan;
        ArrayList<Integer> mangle;
        int tongMangLe;
        int tongTatCa;

        @Override
        public String toString() {
            return "content{" +
                    "mangchan=" + mangchan +
                    ", tongMangChan=" + tongMangChan +
                    ", mangle=" + mangle +
                    ", tongMangLe=" + tongMangLe +
                    ", tongTatCa=" + tongTatCa +
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

public class Baitap3 {
    public static result TongChanLe(int[] arr1, int[] arr2) {
        result output = new result();
        output.content = new result().new content();
        output.content.mangchan = new ArrayList<>();
        output.content.mangle = new ArrayList<>();

        ArrayList<Integer> mang = Stream.concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed())
                .collect(Collectors.toCollection(ArrayList::new));
        if (mang.isEmpty()) {
            output.status = false;
            output.message = "mãng rỗng";
            return output;
        }
        for (int i = 0; i < mang.size(); i++) {
            int el = mang.get(i);

                if (el % 2 == 0) {
                    output.content.mangchan.add(el);
                    output.content.tongMangChan += el;
                } else {
                    output.content.mangle.add(el);
                    output.content.tongMangLe += el;
                }


        }
//        output.content.tongMangChan = mang.stream().filter(el ->el % 2 == 0).reduce(0,(total , el)->total + el);
//        output.content.mangle = mang.stream().filter(el ->el % 2 != 0).collect(Collectors.toCollection(ArrayList::new));
        output.content.tongTatCa = output.content.tongMangChan + output.content.tongMangLe;
        output.status = true;
        output.message = "Đã tìm ra kết quả";
        return output;

    }

    public static void main(String[] args) {
        int[] arr = {1, -2,3,4};
        int[] arr2 = {1, -4, 5, 9};
        System.out.println(TongChanLe(arr, arr2));
    }
}