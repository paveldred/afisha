package ru.netology.manager;

import lombok.NoArgsConstructor;
import ru.netology.domain.CinemaItem;

@NoArgsConstructor
public class CinemaManager {
    public int countCinema = 10;
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
        CinemaItem[] result = new CinemaItem[getCountCinema()];
        for (int i = 0; i < getCountCinema(); i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public void setCountCinema(int countCinema) {
        this.countCinema = countCinema;
    }

    public int getCountCinema() {
        return countCinema;
    }
}