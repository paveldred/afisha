package ru.netology.repository;

import ru.netology.domain.AfishaItem;

public class AfishaRepository {

    private AfishaItem[] items = new AfishaItem[0];

    public void save(AfishaItem item) {
        int length = items.length + 1;
        AfishaItem[] tmp = new AfishaItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }


    public void removeById(int id) {
        int lenght = items.length - 1;
        AfishaItem[] tmp = new AfishaItem[lenght];

        int index = 0;
        for (AfishaItem item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }

        }
        items = tmp;
    }

    public AfishaItem[] findAll() {
        return items;

    }

    public AfishaItem[] findById(int id) {
        AfishaItem[] result = new AfishaItem[1];
        for (AfishaItem item : items) {
            if (item.getId() == id){
                result[0] = item;
            }
        }
        return result;
    }

    public AfishaItem[] removeAll() {
        AfishaItem[] items = new AfishaItem[0];
        return items;
    }

}