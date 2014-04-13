package com.cortez.samples.jpaperformance.bean;

import com.cortez.samples.jpaperformance.data.LazyEntity;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Roberto Cortez
 */
@Singleton
public class LazyBean {
    @PersistenceContext
    private EntityManager entityManager;

    @PostConstruct
    public void init() {
        LazyEntity lazyEntity = new LazyEntity();
        lazyEntity.setId(1L);
        lazyEntity.setProperty01("01");
        lazyEntity.setProperty02("02");
        lazyEntity.setProperty03("03");
        lazyEntity.setProperty04("04");
        lazyEntity.setProperty05("05");
        lazyEntity.setProperty06("06");
        lazyEntity.setProperty07("07");
        lazyEntity.setProperty08("08");
        lazyEntity.setProperty09("09");
        lazyEntity.setProperty10("10");
        entityManager.persist(lazyEntity);
        entityManager.flush();
        entityManager.clear();
    }

    public LazyEntity find(Long id) {
        return entityManager.find(LazyEntity.class, id);
    }
}
