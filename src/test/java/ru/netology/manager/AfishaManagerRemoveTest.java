package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.AfishaItem;
import ru.netology.repository.AfishaRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AfishaManagerRemoveTest {
    @Mock
    AfishaRepository repository;

    @InjectMocks
    AfishaManager manager;

    AfishaItem cinema1 = new AfishaItem(1, "name3", "picture3.jpg", 1, false);
    AfishaItem cinema2 = new AfishaItem(2, "name3", "picture3.jpg", 1, false);
    AfishaItem cinema3 = new AfishaItem(3, "name3", "picture3.jpg", 1, false);





    @Test
    void shouldRemoveIfExistTest() {

        manager.setCountAfisha(3);
        int idToRemove = 2;
        manager.add(cinema1);
        manager.add(cinema2);
        manager.add(cinema3);
        //setup mock
        AfishaItem[] returned = new AfishaItem[]{cinema1, cinema3};
        doReturn(returned).when(repository).findAll();
        doNothing().when(repository).removeById(idToRemove);

        manager.removeById(idToRemove);
        AfishaItem[] actual = manager.getAll();
        AfishaItem[] expected = new AfishaItem[]{cinema3, cinema1};
        assertArrayEquals(expected, actual);

        verify(repository, times(1)).removeById(idToRemove);
    }

    @Test
    void removeAllTest() {
        manager.setCountAfisha(1);
        manager.add(cinema1);

        //setup mock
        AfishaItem[] returnedEmptyArray = new AfishaItem[]{};
        doNothing().when(repository).save(cinema1);
        doReturn(returnedEmptyArray).when(repository).findAll();
        doReturn(returnedEmptyArray).when(repository).removeAll();

        manager.add(cinema1);
        manager.removeAll();

        AfishaItem[] actual = manager.getAll();
        AfishaItem[] expected = new AfishaItem[]{};
        assertArrayEquals(expected, actual);
    }
}