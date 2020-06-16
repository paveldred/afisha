package ru.netology.manager;

import ru.netology.domain.CinemaItem;

public class CinemaManager {
    private CinemaItem[] items = new CinemaItem[0];

    public void add(CinemaItem item) {
        int length = items.length + 1;
        CinemaItem[] tmp = new CinemaItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }


    public CinemaItem[] getLastCinema() {
        int getLastId = 1;

        CinemaItem[] result = new CinemaItem[getLastId];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном

        for (int i = 0; i < getLastId; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

//  // наивная реализация
//  public void removeById(int id) {
//    int length = items.length - 1;
//    PurchaseItem[] tmp = new PurchaseItem[length];
//    int index = 0;
//    for (PurchaseItem item : items) {
//      if (item.getId() != id) {
//        tmp[index] = item;
//        index++;
//      }
//    }
//    // меняем наши элементы
//    items = tmp;
//  }
}