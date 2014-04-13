package com.cortez.samples.jpaperformance.bean;

import com.cortez.samples.jpaperformance.data.LazyEntity;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 * @author Roberto Cortez
 */
@RunWith(Arquillian.class)
public class LazyBeanTest {
    @Inject
    private LazyBean lazyBean;

    private static List<String> results = new ArrayList<>();

    @Deployment
    public static WebArchive createDeployment() {
        WebArchive war = ShrinkWrap.create(WebArchive.class)
                                   .addClass(LazyEntity.class)
                                   .addClass(LazyBean.class)
                                   .addAsResource("META-INF/persistence.xml");
        System.out.println(war.toString(true));
        return war;
    }

    @Test
    public void testFindLazyEntity() throws Exception {
        LazyEntity lazyEntity = lazyBean.find(1L);
        assertNotNull(lazyEntity.getId());

        assertNotNull(lazyEntity.getProperty01());
        /*
        System.out.println("lazyEntity.getProperty01() = " + lazyEntity.getProperty01());
        assertNotNull(lazyEntity.getProperty02());
        assertNotNull(lazyEntity.getProperty03());
        assertNotNull(lazyEntity.getProperty04());
        assertNotNull(lazyEntity.getProperty05());
        assertNotNull(lazyEntity.getProperty06());
        assertNotNull(lazyEntity.getProperty07());
        assertNotNull(lazyEntity.getProperty08());
        assertNotNull(lazyEntity.getProperty09());
        assertNotNull(lazyEntity.getProperty10());*/
    }
}
