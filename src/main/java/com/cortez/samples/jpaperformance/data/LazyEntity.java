package com.cortez.samples.jpaperformance.data;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;

/**
 * @author Roberto Cortez
 */
@Entity
public class LazyEntity {
    @Id
    private Long id;
    @Basic(fetch = FetchType.LAZY)
    private String property01;
    @Basic(fetch = FetchType.LAZY)
    private String property02;
    @Basic(fetch = FetchType.LAZY)
    private String property03;
    @Basic(fetch = FetchType.LAZY)
    private String property04;
    @Basic(fetch = FetchType.LAZY)
    private String property05;
    @Basic(fetch = FetchType.LAZY)
    private String property06;
    @Basic(fetch = FetchType.LAZY)
    private String property07;
    @Basic(fetch = FetchType.LAZY)
    private String property08;
    @Basic(fetch = FetchType.LAZY)
    private String property09;
    @Basic(fetch = FetchType.LAZY)
    private String property10;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProperty01() {
        return property01;
    }

    public void setProperty01(String property01) {
        this.property01 = property01;
    }

    public String getProperty02() {
        return property02;
    }

    public void setProperty02(String property02) {
        this.property02 = property02;
    }

    public String getProperty03() {
        return property03;
    }

    public void setProperty03(String property03) {
        this.property03 = property03;
    }

    public String getProperty04() {
        return property04;
    }

    public void setProperty04(String property04) {
        this.property04 = property04;
    }

    public String getProperty05() {
        return property05;
    }

    public void setProperty05(String property05) {
        this.property05 = property05;
    }

    public String getProperty06() {
        return property06;
    }

    public void setProperty06(String property06) {
        this.property06 = property06;
    }

    public String getProperty07() {
        return property07;
    }

    public void setProperty07(String property07) {
        this.property07 = property07;
    }

    public String getProperty08() {
        return property08;
    }

    public void setProperty08(String property08) {
        this.property08 = property08;
    }

    public String getProperty09() {
        return property09;
    }

    public void setProperty09(String property09) {
        this.property09 = property09;
    }

    public String getProperty10() {
        return property10;
    }

    public void setProperty10(String property10) {
        this.property10 = property10;
    }
}
