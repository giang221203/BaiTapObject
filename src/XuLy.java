import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class XuLy {
    public static void main(String[] args) {
        ArrayList<ItemProduct> newArrayItem = new ArrayList<>();
        ArrayList<CartProduct> newArrayCart = new ArrayList<>();
        ArrayList<Warehouse> newArrayWare = new ArrayList<>();
        int[] arr = {1, 2, 3, 1, 2, 3, 1, 2, 3, 1,};
        String[] arrNamr = {"Quan", "Ao", "Dien Thoai", "Quan", "Ao", "Dien Thoai", "Quan", "Ao", "Dien Thoai", "Ao"};
        for (int i = 0; i < 3; i++) {
            ItemProduct itemProduct = new ItemProduct(arr[i], arrNamr[i]);
            newArrayItem.add(itemProduct);
            if (i == 2) {
                continue;
            }
            CartProduct cartProduct = new CartProduct(arrNamr[i], 200);
            newArrayCart.add(cartProduct);
        }
        System.out.println(newArrayItem);
        System.out.println(newArrayCart);


        int[] arrY = {2000,2020,2023,2000,2020,2023,2000,2020,2023,2022};
        int[] arrM = {1,4,3,7,8,2,5,3,8,6};
        int[] arrD = {1,4,25,24,14,17,9,3,8,6};
        int[] arrKho = {200,250,400,100,300,40,50,160,50,500};
        for (int i = 0; i < arr.length; i++) {
            Warehouse warehouse = new Warehouse(arr[i], new Date(arrY[i]-1900,arrM[i]-1,arrD[i]),arrKho[i]);
            newArrayWare.add(warehouse);
        }
        System.out.println(newArrayWare);
        newArrayWare.sort(Comparator.comparing(ob -> ob.getDate()));
        for (int i = 0; i < newArrayCart.size(); i++) {
            String name = newArrayCart.get(i).getNameProduct();
            vong_lap_2:
            for (int j = 0; j < newArrayItem.size(); j++) {
                if(newArrayItem.get(j).getNameProduct().equals(name)){
                    int id = newArrayItem.get(j).getIdProduct();
                    for(int k = 0; k < newArrayWare.size(); k++){
                        if(newArrayWare.get(k).getIdWareHouse() == id){
                            if(newArrayWare.get(k).getQuantity() == 0)continue ;
                            if(newArrayCart.get(j).getQuantityBuy() == 0)break vong_lap_2;
                            if(newArrayCart.get(i).getQuantityBuy() <= newArrayWare.get(k).getQuantity()){
                                newArrayWare.get(k).setQuantity(newArrayWare.get(k).getQuantity()-newArrayCart.get(i).getQuantityBuy());
                            break vong_lap_2;
                            }else{
                                newArrayCart.get(i).setQuantityBuy(newArrayCart.get(i).getQuantityBuy()-newArrayWare.get(k).getQuantity());
                                newArrayWare.get(k).setQuantity(0);
                            }
                        }
                    }
                }
            }

        }
        System.out.println(newArrayWare);
        System.out.println(newArrayWare.stream().filter(e-> e.getQuantity()>0).collect(Collectors.toList()));

    }

}
