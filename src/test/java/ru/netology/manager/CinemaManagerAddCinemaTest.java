package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.CinemaItem;

import static org.junit.jupiter.api.Assertions.*;

class CinemaManagerAddCinemaTest {

    @Test
    void add() {
        CinemaManager manager = new CinemaManager();
        manager.setCountCinema(1);
        CinemaItem cinema1 = new CinemaItem(1,"name1","picture1.jpg", 1,true);
        manager.add(cinema1);
        CinemaItem[] actual = manager.getLastCinema();
        CinemaItem[] expected = new CinemaItem[]{cinema1};
        assertArrayEquals(expected, actual);
    }
}
