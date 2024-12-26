package com.intern.studentjdbc.base.repository;

import com.intern.studentjdbc.base.domain.Entity;

@SuppressWarnings("unused")
public interface BaseEntityRepository {

    Entity[] findAll();
    Entity findById(Long id);
    void deleteById(Long id);
    Long count();
    Entity save(Entity entity);
    Entity update(Entity entity);
    boolean existsById(Long id);
}
