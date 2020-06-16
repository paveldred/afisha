package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.CinemaItem;

import static org.junit.jupiter.api.Assertions.*;

class CinemaManagerGetCinemaTest {

    @Test
    void getLast3Cinema() {
        CinemaManager manager = new CinemaManager();
        CinemaItem cinema1 = new CinemaItem(1, "name1", "picture1.jpg", 1, true);
        CinemaItem cinema2 = new CinemaItem(2, "name2", "picture2.jpg", 2, true);
        CinemaItem cinema3 = new CinemaItem(3, "name3", "picture3.jpg", 1, false);
        manager.add(cinema1);
        manager.add(cinema2);
        manager.add(cinema3);
        CinemaItem[] actual = manager.getLastCinema();
        CinemaItem[] expected = new CinemaItem[]{cinema3};
        assertArrayEquals(expected, actual);
    }

    @Test
    void getLast10Cinema() {
        CinemaManager manager = new CinemaManager();
        CinemaItem cinema1 = new CinemaItem(1, "name1", "picture1.jpg", 1, true);
        CinemaItem cinema2 = new CinemaItem(2, "name2", "picture2.jpg", 2, true);
        CinemaItem cinema3 = new CinemaItem(3, "name3", "picture3.jpg", 3, false);
        CinemaItem cinema4 = new CinemaItem(4, "name4", "picture4.jpg", 1, false);
        CinemaItem cinema5 = new CinemaItem(5, "name5", "picture5.jpg", 1, false);
        CinemaItem cinema6 = new CinemaItem(6, "name6", "picture6.jpg", 1, false);
        CinemaItem cinema7 = new CinemaItem(7, "name7", "picture7.jpg", 1, false);
        CinemaItem cinema8 = new CinemaItem(8, "name8", "picture8.jpg", 1, false);
        CinemaItem cinema9 = new CinemaItem(9, "name9", "picture9.jpg", 1, false);
        CinemaItem cinema10 = new CinemaItem(10, "name10", "picture10.jpg", 1, false);
        manager.add(cinema1);
        manager.add(cinema2);
        manager.add(cinema3);
        manager.add(cinema4);
        manager.add(cinema5);
        manager.add(cinema6);
        manager.add(cinema7);
        manager.add(cinema8);
        manager.add(cinema9);
        manager.add(cinema10);
        CinemaItem[] actual = manager.getLastCinema();
        CinemaItem[] expected = new CinemaItem[]{cinema10};
        assertArrayEquals(expected, actual);
    }
}
