package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.AfishaItem;
import ru.netology.repository.AfishaRepository;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AfishaManager {

    private int countAfisha = 10;

    public AfishaManager(AfishaRepository repository) {
        this.repository = repository;
    }

    private AfishaRepository repository;

    public void add(AfishaItem item) {
        repository.save(item);
    }


    public AfishaItem[] getAll() {
        AfishaItem[] items = repository.findAll();
        AfishaItem[] result = new AfishaItem[countAfisha];
        for (int i = 0; i < countAfisha; i++) {
            int index = countAfisha  - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public AfishaItem[] findById(int id) {
        AfishaItem[] result = repository.findById(id);
        return result;
    }


    public void removeById(int id) {
        repository.removeById(id);
        this.countAfisha--;

    }

    public AfishaItem[] removeAll() {
        AfishaItem[] result = repository.removeAll();
        this.countAfisha = 0;
        return result;
    }

    public void setCountAfisha(int countCinema) {
        this.countAfisha = countCinema;
    }

    public int getCountAfisha() {
        return countAfisha;
    }
}