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
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
class AfishaManagerAddAfishaTest {

    AfishaItem cinema1 = new AfishaItem(1, "name1", "picture1.jpg", 1, true);

    @Mock
    AfishaRepository repository;

    @InjectMocks
    AfishaManager manager;

    @Test
    void addTest() {
        manager.setCountAfisha(1);

        //setup mock
        AfishaItem[] returned = new AfishaItem[]{cinema1};
        doNothing().when(repository).save(cinema1);
        doReturn(returned).when(repository).findAll();
        manager.add(cinema1);

        AfishaItem[] actual = manager.getAll();
        AfishaItem[] expected = new AfishaItem[]{cinema1};
        assertArrayEquals(expected, actual);
    }
}
