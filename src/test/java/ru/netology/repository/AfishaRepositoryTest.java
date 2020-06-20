package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.AfishaItem;
import ru.netology.manager.AfishaManager;

import static org.junit.jupiter.api.Assertions.*;

class AfishaRepositoryTest {

    AfishaRepository repository = new AfishaRepository();

    @Test
    void saveTest() {
        AfishaItem cinema1 = new AfishaItem(1, "name3", "picture3.jpg", 1, false);
        AfishaItem cinema2 = new AfishaItem(1, "name3", "picture3.jpg", 1, false);
        repository.save(cinema1);
        repository.save(cinema2);
        AfishaItem[] actual = repository.findAll();
        AfishaItem[] expected = new AfishaItem[]{cinema1, cinema2};
        assertArrayEquals(actual,expected);

    }

    @Test
    void removeByIdTest() {
        AfishaItem cinema1 = new AfishaItem(1, "name3", "picture3.jpg", 1, false);
        AfishaItem cinema2 = new AfishaItem(2, "name3", "picture3.jpg", 1, false);
        repository.save(cinema1);
        repository.save(cinema2);
        repository.removeById(2);
        AfishaItem[] actual = repository.findAll();
        AfishaItem[] expected = new AfishaItem[]{cinema1};
        assertArrayEquals(actual,expected);
    }

    @Test
    void findAllTest() {
        AfishaItem cinema1 = new AfishaItem(1, "name3", "picture3.jpg", 1, false);
        AfishaItem cinema2 = new AfishaItem(2, "name3", "picture3.jpg", 1, false);
        repository.save(cinema1);
        repository.save(cinema2);
        AfishaItem[] actual = repository.findAll();
        AfishaItem[] expected = new AfishaItem[]{cinema1, cinema2};
        assertArrayEquals(actual,expected);
    }

    @Test
    void findByIdTest() {
        AfishaItem cinema1 = new AfishaItem(1, "name3", "picture3.jpg", 1, false);
        AfishaItem cinema2 = new AfishaItem(2, "name3", "picture3.jpg", 1, false);
        repository.save(cinema1);
        repository.save(cinema2);
        AfishaItem[] actual = repository.findById(2);
        AfishaItem[] expected = new AfishaItem[]{cinema2};
        assertArrayEquals(actual,expected);
    }

    @Test
    void removeAllTest() {
        AfishaItem cinema1 = new AfishaItem(1, "name3", "picture3.jpg", 1, false);
        AfishaItem cinema2 = new AfishaItem(2, "name3", "picture3.jpg", 1, false);
        repository.save(cinema1);
        repository.save(cinema2);
        AfishaItem[] actual = repository.removeAll();
        AfishaItem[] expected = new AfishaItem[]{};
        assertArrayEquals(actual,expected);
    }
}