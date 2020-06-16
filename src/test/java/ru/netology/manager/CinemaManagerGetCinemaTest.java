package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.CinemaItem;

import static org.junit.jupiter.api.Assertions.*;

class CinemaManagerGetCinemaTest {

    @Test
    void getLastOneCinema() {
        CinemaManager manager = new CinemaManager();
        manager.setCountCinema(1);
        CinemaItem cinema1 = new CinemaItem(3, "name3", "picture3.jpg", 1, false);
        manager.add(cinema1);
        CinemaItem[] actual = manager.getLastCinema();
        CinemaItem[] expected = new CinemaItem[]{cinema1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void getLastDefaultCountCinema() {
        CinemaManager manager = new CinemaManager();
        manager.setCountCinema(10);
        CinemaItem cinema1 = new CinemaItem(1, "name3", "picture3.jpg", 1, false);
        CinemaItem cinema2 = new CinemaItem(2, "name3", "picture3.jpg", 1, false);
        CinemaItem cinema3 = new CinemaItem(3, "name3", "picture3.jpg", 1, false);
        CinemaItem cinema4 = new CinemaItem(4, "name3", "picture3.jpg", 1, false);
        CinemaItem cinema5 = new CinemaItem(5, "name3", "picture3.jpg", 1, false);
        CinemaItem cinema6 = new CinemaItem(6, "name3", "picture3.jpg", 1, false);
        CinemaItem cinema7 = new CinemaItem(7, "name3", "picture3.jpg", 1, false);
        CinemaItem cinema8 = new CinemaItem(8, "name3", "picture3.jpg", 1, false);
        CinemaItem cinema9 = new CinemaItem(9, "name3", "picture3.jpg", 1, false);
        CinemaItem cinema10 = new CinemaItem(10, "name3", "picture3.jpg", 1, false);
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
        CinemaItem[] expected = new CinemaItem[]{cinema10, cinema9, cinema8, cinema7, cinema6, cinema5, cinema4, cinema3, cinema2, cinema1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void getLastCinemaIfEmpty() {
        CinemaManager manager = new CinemaManager();
        manager.setCountCinema(0);
        CinemaItem[] actual = manager.getLastCinema();
        CinemaItem[] expected = new CinemaItem[]{};
        assertArrayEquals(expected, actual);
    }
}
