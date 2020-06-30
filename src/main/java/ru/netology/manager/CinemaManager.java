package ru.netology.manager;

import lombok.NoArgsConstructor;
import ru.netology.domain.CinemaItem;

@NoArgsConstructor
public class CinemaManager {
    private CinemaItem[] items = new CinemaItem[0];
    public int defaultCinemaLength = 10;
    private int customCinemaLength;

    public CinemaManager(int customCinemaLength) {
        this.customCinemaLength = customCinemaLength;
    }

    public void add(CinemaItem item) {
        int length = items.length + 1;
        CinemaItem[] tmp = new CinemaItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public CinemaItem[] getLastCinema() {
        int resultLength = items.length;

        if (customCinemaLength == 0 && items.length >= defaultCinemaLength) {
            resultLength = defaultCinemaLength;
        } if (customCinemaLength != 0 && items.length >= customCinemaLength)
            resultLength = customCinemaLength;

        CinemaItem[] result = new CinemaItem[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}