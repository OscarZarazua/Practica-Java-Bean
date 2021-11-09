package com.example.springcoredojo.repository;

import com.example.springcoredojo.entity.Unit;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class BarracksRepository {

    private final List<Unit> list;

    public List<Unit> getList() {
        return list;
    }

    public BarracksRepository() {
        list = new ArrayList<>();
    }

    public Unit findById(Long id) {
        Optional<Unit> optionalUnit = getList().stream().filter(u -> u.getId() == id).findFirst();
        return optionalUnit.get();
    }

    public void delete(Long id) {
        Unit unit = findById(id);
        list.remove(unit);
    }
}
