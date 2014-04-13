package com.cortez.samples.jpaperformance.bean;

import com.cortez.samples.jpaperformance.data.DepartmentEntity;
import com.cortez.samples.jpaperformance.data.EmployeeEntity;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Roberto Cortez
 */
@RunWith(Arquillian.class)
public class PerformanceBeanTest {
    @Inject
    private PerformanceBean performanceBean;

    private static List<String> results = new ArrayList<>();

    @Deployment
    public static WebArchive createDeployment() {
        File[] requiredLibraries = Maven.resolver().loadPomFromFile("pom.xml")
                                        .resolve("org.apache.commons:commons-lang3",
                                                 "commons-beanutils:commons-beanutils")
                                        .withTransitivity().asFile();

        WebArchive war = ShrinkWrap.create(WebArchive.class)
                                   .addClass(DepartmentEntity.class)
                                   .addClass(EmployeeEntity.class)
                                   .addClass(PerformanceBean.class)
                                   .addAsResource("META-INF/persistence.xml")
                                   .addAsLibraries(requiredLibraries);

        System.out.println(war.toString(true));
        return war;
    }

    @Test
    public void testFindAll() {
        System.out.println("PerformanceBeanTest.testFindAll");
        long start = System.currentTimeMillis();
        List<DepartmentEntity> all = performanceBean.findAll();
        long end = System.currentTimeMillis();
        results.add("Time for findAll: " + (end - start));
        System.out.println("Elements for findAll: " + all.size());
    }

    @Test
    public void testFindAllNeededColumns() {
        System.out.println("PerformanceBeanTest.testFindAllNeededColumns");
        long start = System.currentTimeMillis();
        performanceBean.findAllNeededColumns();
        long end = System.currentTimeMillis();
        results.add("Time for findAllNeededColumns: " + (end - start));
    }

    @Test
    public void testFindAllNeededColumnsPaginated() {
        System.out.println("PerformanceBeanTest.testFindAllNeededColumnsPaginated");
        long start = System.currentTimeMillis();
        performanceBean.findAllNeededColumnsPaginated();
        long end = System.currentTimeMillis();
        results.add("Time for findAllNeededColumnsPaginated: " + (end - start));
    }

    @Test
    public void testFindAllEager() throws Exception {
        System.out.println("PerformanceBeanTest.testFindAllEager");
        long start = System.currentTimeMillis();
        performanceBean.findAllEager();
        long end = System.currentTimeMillis();
        results.add("Time for findAllEager: " + (end - start));
    }

    @Test
    public void testFindAllLazy() throws Exception {
        System.out.println("PerformanceBeanTest.testFindAllLazy");
        long start = System.currentTimeMillis();
        performanceBean.findAllLazy();
        long end = System.currentTimeMillis();
        results.add("Time for findAllLazy: " + (end - start));
    }

    @Test
    public void testFindAllFetchLazy() throws Exception {
        System.out.println("PerformanceBeanTest.testFindAllFetchLazy");
        long start = System.currentTimeMillis();
        performanceBean.findAllFetchLazy();
        long end = System.currentTimeMillis();
        results.add("Time for findAllFetchLazy: " + (end - start));
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("PerformanceBeanTest.tearDown");
        for (String result : results) {
            System.out.println(result);
        }
    }
}
