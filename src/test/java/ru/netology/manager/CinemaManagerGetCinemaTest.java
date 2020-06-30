package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.CinemaItem;

import static org.junit.jupiter.api.Assertions.*;

class CinemaManagerGetCinemaTest {

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
    CinemaItem cinema11 = new CinemaItem(11, "name3", "picture3.jpg", 1, false);

    @Test
    void getLastCinemaIfAddedOneMovieTest() {
        CinemaManager manager = new CinemaManager(1);
        manager.add(cinema1);
        CinemaItem[] actual = manager.getLastCinema();
        CinemaItem[] expected = new CinemaItem[]{cinema1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void getLastDefaultCountMovieTest() {
        CinemaManager manager = new CinemaManager();
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
        manager.add(cinema11);
        CinemaItem[] actual = manager.getLastCinema();
        CinemaItem[] expected = new CinemaItem[]{cinema11, cinema10, cinema9, cinema8, cinema7, cinema6, cinema5, cinema4, cinema3, cinema2};
        assertArrayEquals(expected, actual);
    }

    @Test
    void getLastMoviesIfItemsMoreCustomCountTest() {
        CinemaManager manager = new CinemaManager(3);
        manager.add(cinema1);
        manager.add(cinema2);
        manager.add(cinema3);
        manager.add(cinema4);
        CinemaItem[] actual = manager.getLastCinema();
        CinemaItem[] expected = new CinemaItem[]{cinema4, cinema3, cinema2};
        assertArrayEquals(expected, actual);
    }

    @Test
    void getLastMoviesIfItemsLessCustomCountTest() {
        CinemaManager manager = new CinemaManager(5);
        manager.add(cinema1);
        manager.add(cinema2);
        manager.add(cinema3);
        manager.add(cinema4);
        CinemaItem[] actual = manager.getLastCinema();
        CinemaItem[] expected = new CinemaItem[]{cinema4, cinema3, cinema2, cinema1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void getLastCinemaIfEmpty() {
        CinemaManager manager = new CinemaManager(0);
        CinemaItem[] actual = manager.getLastCinema();
        CinemaItem[] expected = new CinemaItem[]{};
        assertArrayEquals(expected, actual);
    }
}