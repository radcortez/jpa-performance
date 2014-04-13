package com.cortez.samples.jpaperformance.data;

import javax.persistence.*;
import java.util.List;

/**
 * Simple entity.
 *
 * @author Roberto Cortez
 */
@Entity
@NamedEntityGraphs({
        @NamedEntityGraph(name = "departmentWithEmployees", attributeNodes = {@NamedAttributeNode("employees")})
})
public class DepartmentEntity {
    @Id
    private Long id;
    private String property01;
    private String property02;
    private String property03;
    private String property04;
    private String property05;
    private String property06;
    private String property07;
    private String property08;
    private String property09;
    private String property10;
    private String property11;
    private String property12;
    private String property13;
    private String property14;
    private String property15;
    private String property16;
    private String property17;
    private String property18;
    private String property19;
    private String property20;
    private String property21;
    private String property22;
    private String property23;
    private String property24;
    private String property25;
    private String property26;
    private String property27;
    private String property28;
    private String property29;
    private String property30;
    private String property31;
    private String property32;
    private String property33;
    private String property34;
    private String property35;
    private String property36;
    private String property37;
    private String property38;
    private String property39;
    private String property40;
    private String property41;
    private String property42;
    private String property43;
    private String property44;
    private String property45;
    private String property46;
    private String property47;
    private String property48;
    private String property49;
    private String property50;
    private String property51;
    private String property52;
    private String property53;
    private String property54;
    private String property55;
    private String property56;
    private String property57;
    private String property58;
    private String property59;
    private String property60;
    private String property61;
    private String property62;
    private String property63;
    private String property64;
    private String property65;
    private String property66;
    private String property67;
    private String property68;
    private String property69;
    private String property70;
    private String property71;
    private String property72;
    private String property73;
    private String property74;
    private String property75;
    private String property76;
    private String property77;
    private String property78;
    private String property79;
    private String property80;
    private String property81;
    private String property82;
    private String property83;
    private String property84;
    private String property85;
    private String property86;
    private String property87;
    private String property88;
    private String property89;
    private String property90;
    private String property91;
    private String property92;
    private String property93;
    private String property94;
    private String property95;
    private String property96;
    private String property97;
    private String property98;
    private String property99;
    private String property100;

    @OneToMany(mappedBy = "departmentEntity", cascade = CascadeType.ALL)
    private List<EmployeeEntity> employees;

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

    public String getProperty11() {
        return property11;
    }

    public void setProperty11(String property11) {
        this.property11 = property11;
    }

    public String getProperty12() {
        return property12;
    }

    public void setProperty12(String property12) {
        this.property12 = property12;
    }

    public String getProperty13() {
        return property13;
    }

    public void setProperty13(String property13) {
        this.property13 = property13;
    }

    public String getProperty14() {
        return property14;
    }

    public void setProperty14(String property14) {
        this.property14 = property14;
    }

    public String getProperty15() {
        return property15;
    }

    public void setProperty15(String property15) {
        this.property15 = property15;
    }

    public String getProperty16() {
        return property16;
    }

    public void setProperty16(String property16) {
        this.property16 = property16;
    }

    public String getProperty17() {
        return property17;
    }

    public void setProperty17(String property17) {
        this.property17 = property17;
    }

    public String getProperty18() {
        return property18;
    }

    public void setProperty18(String property18) {
        this.property18 = property18;
    }

    public String getProperty19() {
        return property19;
    }

    public void setProperty19(String property19) {
        this.property19 = property19;
    }

    public String getProperty20() {
        return property20;
    }

    public void setProperty20(String property20) {
        this.property20 = property20;
    }

    public String getProperty21() {
        return property21;
    }

    public void setProperty21(String property21) {
        this.property21 = property21;
    }

    public String getProperty22() {
        return property22;
    }

    public void setProperty22(String property22) {
        this.property22 = property22;
    }

    public String getProperty23() {
        return property23;
    }

    public void setProperty23(String property23) {
        this.property23 = property23;
    }

    public String getProperty24() {
        return property24;
    }

    public void setProperty24(String property24) {
        this.property24 = property24;
    }

    public String getProperty25() {
        return property25;
    }

    public void setProperty25(String property25) {
        this.property25 = property25;
    }

    public String getProperty26() {
        return property26;
    }

    public void setProperty26(String property26) {
        this.property26 = property26;
    }

    public String getProperty27() {
        return property27;
    }

    public void setProperty27(String property27) {
        this.property27 = property27;
    }

    public String getProperty28() {
        return property28;
    }

    public void setProperty28(String property28) {
        this.property28 = property28;
    }

    public String getProperty29() {
        return property29;
    }

    public void setProperty29(String property29) {
        this.property29 = property29;
    }

    public String getProperty30() {
        return property30;
    }

    public void setProperty30(String property30) {
        this.property30 = property30;
    }

    public String getProperty31() {
        return property31;
    }

    public void setProperty31(String property31) {
        this.property31 = property31;
    }

    public String getProperty32() {
        return property32;
    }

    public void setProperty32(String property32) {
        this.property32 = property32;
    }

    public String getProperty33() {
        return property33;
    }

    public void setProperty33(String property33) {
        this.property33 = property33;
    }

    public String getProperty34() {
        return property34;
    }

    public void setProperty34(String property34) {
        this.property34 = property34;
    }

    public String getProperty35() {
        return property35;
    }

    public void setProperty35(String property35) {
        this.property35 = property35;
    }

    public String getProperty36() {
        return property36;
    }

    public void setProperty36(String property36) {
        this.property36 = property36;
    }

    public String getProperty37() {
        return property37;
    }

    public void setProperty37(String property37) {
        this.property37 = property37;
    }

    public String getProperty38() {
        return property38;
    }

    public void setProperty38(String property38) {
        this.property38 = property38;
    }

    public String getProperty39() {
        return property39;
    }

    public void setProperty39(String property39) {
        this.property39 = property39;
    }

    public String getProperty40() {
        return property40;
    }

    public void setProperty40(String property40) {
        this.property40 = property40;
    }

    public String getProperty41() {
        return property41;
    }

    public void setProperty41(String property41) {
        this.property41 = property41;
    }

    public String getProperty42() {
        return property42;
    }

    public void setProperty42(String property42) {
        this.property42 = property42;
    }

    public String getProperty43() {
        return property43;
    }

    public void setProperty43(String property43) {
        this.property43 = property43;
    }

    public String getProperty44() {
        return property44;
    }

    public void setProperty44(String property44) {
        this.property44 = property44;
    }

    public String getProperty45() {
        return property45;
    }

    public void setProperty45(String property45) {
        this.property45 = property45;
    }

    public String getProperty46() {
        return property46;
    }

    public void setProperty46(String property46) {
        this.property46 = property46;
    }

    public String getProperty47() {
        return property47;
    }

    public void setProperty47(String property47) {
        this.property47 = property47;
    }

    public String getProperty48() {
        return property48;
    }

    public void setProperty48(String property48) {
        this.property48 = property48;
    }

    public String getProperty49() {
        return property49;
    }

    public void setProperty49(String property49) {
        this.property49 = property49;
    }

    public String getProperty50() {
        return property50;
    }

    public void setProperty50(String property50) {
        this.property50 = property50;
    }

    public String getProperty51() {
        return property51;
    }

    public void setProperty51(String property51) {
        this.property51 = property51;
    }

    public String getProperty52() {
        return property52;
    }

    public void setProperty52(String property52) {
        this.property52 = property52;
    }

    public String getProperty53() {
        return property53;
    }

    public void setProperty53(String property53) {
        this.property53 = property53;
    }

    public String getProperty54() {
        return property54;
    }

    public void setProperty54(String property54) {
        this.property54 = property54;
    }

    public String getProperty55() {
        return property55;
    }

    public void setProperty55(String property55) {
        this.property55 = property55;
    }

    public String getProperty56() {
        return property56;
    }

    public void setProperty56(String property56) {
        this.property56 = property56;
    }

    public String getProperty57() {
        return property57;
    }

    public void setProperty57(String property57) {
        this.property57 = property57;
    }

    public String getProperty58() {
        return property58;
    }

    public void setProperty58(String property58) {
        this.property58 = property58;
    }

    public String getProperty59() {
        return property59;
    }

    public void setProperty59(String property59) {
        this.property59 = property59;
    }

    public String getProperty60() {
        return property60;
    }

    public void setProperty60(String property60) {
        this.property60 = property60;
    }

    public String getProperty61() {
        return property61;
    }

    public void setProperty61(String property61) {
        this.property61 = property61;
    }

    public String getProperty62() {
        return property62;
    }

    public void setProperty62(String property62) {
        this.property62 = property62;
    }

    public String getProperty63() {
        return property63;
    }

    public void setProperty63(String property63) {
        this.property63 = property63;
    }

    public String getProperty64() {
        return property64;
    }

    public void setProperty64(String property64) {
        this.property64 = property64;
    }

    public String getProperty65() {
        return property65;
    }

    public void setProperty65(String property65) {
        this.property65 = property65;
    }

    public String getProperty66() {
        return property66;
    }

    public void setProperty66(String property66) {
        this.property66 = property66;
    }

    public String getProperty67() {
        return property67;
    }

    public void setProperty67(String property67) {
        this.property67 = property67;
    }

    public String getProperty68() {
        return property68;
    }

    public void setProperty68(String property68) {
        this.property68 = property68;
    }

    public String getProperty69() {
        return property69;
    }

    public void setProperty69(String property69) {
        this.property69 = property69;
    }

    public String getProperty70() {
        return property70;
    }

    public void setProperty70(String property70) {
        this.property70 = property70;
    }

    public String getProperty71() {
        return property71;
    }

    public void setProperty71(String property71) {
        this.property71 = property71;
    }

    public String getProperty72() {
        return property72;
    }

    public void setProperty72(String property72) {
        this.property72 = property72;
    }

    public String getProperty73() {
        return property73;
    }

    public void setProperty73(String property73) {
        this.property73 = property73;
    }

    public String getProperty74() {
        return property74;
    }

    public void setProperty74(String property74) {
        this.property74 = property74;
    }

    public String getProperty75() {
        return property75;
    }

    public void setProperty75(String property75) {
        this.property75 = property75;
    }

    public String getProperty76() {
        return property76;
    }

    public void setProperty76(String property76) {
        this.property76 = property76;
    }

    public String getProperty77() {
        return property77;
    }

    public void setProperty77(String property77) {
        this.property77 = property77;
    }

    public String getProperty78() {
        return property78;
    }

    public void setProperty78(String property78) {
        this.property78 = property78;
    }

    public String getProperty79() {
        return property79;
    }

    public void setProperty79(String property79) {
        this.property79 = property79;
    }

    public String getProperty80() {
        return property80;
    }

    public void setProperty80(String property80) {
        this.property80 = property80;
    }

    public String getProperty81() {
        return property81;
    }

    public void setProperty81(String property81) {
        this.property81 = property81;
    }

    public String getProperty82() {
        return property82;
    }

    public void setProperty82(String property82) {
        this.property82 = property82;
    }

    public String getProperty83() {
        return property83;
    }

    public void setProperty83(String property83) {
        this.property83 = property83;
    }

    public String getProperty84() {
        return property84;
    }

    public void setProperty84(String property84) {
        this.property84 = property84;
    }

    public String getProperty85() {
        return property85;
    }

    public void setProperty85(String property85) {
        this.property85 = property85;
    }

    public String getProperty86() {
        return property86;
    }

    public void setProperty86(String property86) {
        this.property86 = property86;
    }

    public String getProperty87() {
        return property87;
    }

    public void setProperty87(String property87) {
        this.property87 = property87;
    }

    public String getProperty88() {
        return property88;
    }

    public void setProperty88(String property88) {
        this.property88 = property88;
    }

    public String getProperty89() {
        return property89;
    }

    public void setProperty89(String property89) {
        this.property89 = property89;
    }

    public String getProperty90() {
        return property90;
    }

    public void setProperty90(String property90) {
        this.property90 = property90;
    }

    public String getProperty91() {
        return property91;
    }

    public void setProperty91(String property91) {
        this.property91 = property91;
    }

    public String getProperty92() {
        return property92;
    }

    public void setProperty92(String property92) {
        this.property92 = property92;
    }

    public String getProperty93() {
        return property93;
    }

    public void setProperty93(String property93) {
        this.property93 = property93;
    }

    public String getProperty94() {
        return property94;
    }

    public void setProperty94(String property94) {
        this.property94 = property94;
    }

    public String getProperty95() {
        return property95;
    }

    public void setProperty95(String property95) {
        this.property95 = property95;
    }

    public String getProperty96() {
        return property96;
    }

    public void setProperty96(String property96) {
        this.property96 = property96;
    }

    public String getProperty97() {
        return property97;
    }

    public void setProperty97(String property97) {
        this.property97 = property97;
    }

    public String getProperty98() {
        return property98;
    }

    public void setProperty98(String property98) {
        this.property98 = property98;
    }

    public String getProperty99() {
        return property99;
    }

    public void setProperty99(String property99) {
        this.property99 = property99;
    }

    public String getProperty100() {
        return property100;
    }

    public void setProperty100(String property100) {
        this.property100 = property100;
    }

    public List<EmployeeEntity> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeEntity> employeeEntities) {
        this.employees = employeeEntities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }

        DepartmentEntity that = (DepartmentEntity) o;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
