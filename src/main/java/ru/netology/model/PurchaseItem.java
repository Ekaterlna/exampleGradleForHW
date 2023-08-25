package ru.netology.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //геттеры и сеттеры на все поля
@NoArgsConstructor //конструктор без параметров
@AllArgsConstructor // конструктор со всеми параметрами
public class PurchaseItem {
    private int itemId;
    private int itemPrice;
    private int count;
}
