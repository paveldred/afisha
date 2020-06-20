package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.AfishaItem;
import ru.netology.repository.AfishaRepository;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerGetAfishaTest {
    AfishaManager manager = new AfishaManager(new AfishaRepository());

    @Test
    void getLastOneAfisha() {
        manager.setCountAfisha(1);
        AfishaItem item1 = new AfishaItem(3, "name3", "picture3.jpg", 1, false);
        manager.add(item1);
        AfishaItem[] actual = manager.getAll();
        AfishaItem[] expected = new AfishaItem[]{item1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void getLastDefaultCountAfisha() {
        manager.setCountAfisha(10);
        AfishaItem cinema1 = new AfishaItem(1, "name3", "picture3.jpg", 1, false);
        AfishaItem cinema2 = new AfishaItem(2, "name3", "picture3.jpg", 1, false);
        AfishaItem cinema3 = new AfishaItem(3, "name3", "picture3.jpg", 1, false);
        AfishaItem cinema4 = new AfishaItem(4, "name3", "picture3.jpg", 1, false);
        AfishaItem cinema5 = new AfishaItem(5, "name3", "picture3.jpg", 1, false);
        AfishaItem cinema6 = new AfishaItem(6, "name3", "picture3.jpg", 1, false);
        AfishaItem cinema7 = new AfishaItem(7, "name3", "picture3.jpg", 1, false);
        AfishaItem cinema8 = new AfishaItem(8, "name3", "picture3.jpg", 1, false);
        AfishaItem cinema9 = new AfishaItem(9, "name3", "picture3.jpg", 1, false);
        AfishaItem cinema10 = new AfishaItem(10, "name3", "picture3.jpg", 1, false);
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
        AfishaItem[] actual = manager.getAll();
        AfishaItem[] expected = new AfishaItem[]{cinema10, cinema9, cinema8, cinema7, cinema6, cinema5, cinema4, cinema3, cinema2, cinema1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void getLastAfishaIfEmpty() {
        manager.setCountAfisha(0);
        AfishaItem[] actual = manager.getAll();
        AfishaItem[] expected = new AfishaItem[]{};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findById() {
        manager.setCountAfisha(3);
        AfishaItem cinema1 = new AfishaItem(1, "name3", "picture3.jpg", 1, false);
        AfishaItem cinema2 = new AfishaItem(2, "name3", "picture3.jpg", 1, false);
        AfishaItem cinema3 = new AfishaItem(3, "name3", "picture3.jpg", 1, false);
        manager.add(cinema1);
        manager.add(cinema2);
        manager.add(cinema3);

        AfishaItem[] actual = manager.findById(1);
        AfishaItem[] expected = new AfishaItem[]{cinema1};
        assertArrayEquals(expected, actual);

    }
}


