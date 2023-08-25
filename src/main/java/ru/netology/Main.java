package ru.netology;

import ru.netology.model.PurchaseItem;
import ru.netology.service.CartService;
import ru.netology.util.PriceAscComparator;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        CartService service = new CartService();
        service.add(new PurchaseItem(1, 1000, 1));
        service.add(new PurchaseItem(2, 4000, 4));
        service.add(new PurchaseItem(3, 6000, 1));
        service.add(new PurchaseItem(4, 7000, 9));
        service.add(new PurchaseItem(5, 9000, 1));
        service.add(new PurchaseItem(6, 8000, 10));

//        System.out.println(
//                new Comparator<PurchaseItem>() {
//            @Override
//            public int compare(PurchaseItem o1, PurchaseItem o2) {
//                return o1.getItemPrice() - o2.getItemPrice();
//            }
//        });


//        Comparator<PurchaseItem> comparator = (PurchaseItem o1, PurchaseItem o2) -> {
//            return o1.getItemPrice() - o2.getItemPrice();
//        };


//        System.out.println(service.sortedBy((PurchaseItem o1, PurchaseItem o2) -> {
//                        return o1.getItemPrice() - o2.getItemPrice();
//                    }
//        ));

//        System.out.println(service.sortedBy((o1, o2) -> {
//                    return o1.getItemPrice() - o2.getItemPrice();
//                }
//        ));

        System.out.println(service.sortedBy((o1, o2) -> o1.getItemPrice() - o2.getItemPrice()));

    }
}
