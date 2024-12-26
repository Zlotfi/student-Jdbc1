package com.intern.studentjdbc.base.repository.impl;

import com.intern.studentjdbc.base.domain.Entity;
import com.intern.studentjdbc.base.repository.BaseEntityRepository;

public class BaseEntityRepositoryImpl
        implements BaseEntityRepository {
    @Override
    public Entity[] findAll() {
        return new Entity[0];
    }

    @Override
    public Entity findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Long count() {
        return null;
    }

    @Override
    public Entity save(Entity entity) {
        return null;
    }

    @Override
    public Entity update(Entity entity) {
        return null;
    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }
}
