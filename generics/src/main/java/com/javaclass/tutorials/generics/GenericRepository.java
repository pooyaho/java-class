package com.javaclass.tutorials.generics;

import javax.xml.stream.events.EndElement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericRepository<E extends BasicEntity> {
    private final Map<Long, E> entityMap = new HashMap<>();

    public void add(E entity) throws DuplicateEntityException{
        if (entityMap.containsKey(entity.getId())) {
            throw new DuplicateEntityException();
        }
        entityMap.put(entity.getId(), entity);
    }

    public E findById(Long id) {
        return entityMap.get(id);
    }

    public void removeById(Long id) {
        entityMap.remove(id);
    }

    public List<E> findAll() {
        return new ArrayList<>(entityMap.values());
    }

    public E update(E entity) {
        if (entityMap.containsKey(entity.getId())) {
            return entityMap.put(entity.getId(), entity);
        } else {
            return null;
        }
    }
}
