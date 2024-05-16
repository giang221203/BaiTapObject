
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        List<Integer> viTien = Arrays.asList(100 , 50, 200, 500,20,10,5);
        List<Integer> tienMuonLay = viTien.stream()
                .filter(tien -> tien <200)
                .collect(Collectors.toList());

        System.out.println(tienMuonLay); // Output: [100, 50, 20, 10, 5]
    }
}
