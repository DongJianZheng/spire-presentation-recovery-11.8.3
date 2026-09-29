/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.spriya;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;

public class sprvxa
extends sprkra {
    private byte[][] cfr_renamed_91;
    private sprtzd cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private sprooe cfr_renamed_2;
    private byte[][] cfr_renamed_3;
    private sprooe cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprvxa(sprbne sprbne2) {
        int n;
        int n2;
        void arg0;
        sprvxa sprvxa2;
        if (sprbne2.cfr_renamed_85(0) instanceof sprooe) {
            sprvxa2 = this;
            this.cfr_renamed_4 = sprooe.cfr_renamed_23(arg0.cfr_renamed_85(0));
        } else {
            sprvxa2 = this;
            this.cfr_renamed_0 = sprtzd.cfr_renamed_23(arg0.cfr_renamed_85(0));
        }
        sprvxa2.cfr_renamed_2 = sprooe.cfr_renamed_23(arg0.cfr_renamed_85(1));
        sprbne sprbne3 = sprbne.cfr_renamed_23(arg0.cfr_renamed_85(2));
        this.cfr_renamed_91 = new byte[sprbne3.cfr_renamed_84()][];
        int n3 = n2 = 0;
        while (n3 < sprbne3.cfr_renamed_84()) {
            int n4 = n2++;
            this.cfr_renamed_91[n4] = sprxue.cfr_renamed_23(sprbne3.cfr_renamed_85(n4)).cfr_renamed_186();
            n3 = n2;
        }
        sprbne sprbne4 = (sprbne)arg0.cfr_renamed_85(3);
        this.cfr_renamed_3 = new byte[sprbne4.cfr_renamed_84()][];
        int n5 = n = 0;
        while (n5 < sprbne4.cfr_renamed_84()) {
            int n6 = n++;
            this.cfr_renamed_3[n6] = sprxue.cfr_renamed_23(sprbne4.cfr_renamed_85(n6)).cfr_renamed_186();
            n5 = n;
        }
        sprbne sprbne5 = (sprbne)arg0.cfr_renamed_85(4);
        this.cfr_renamed_1 = sprxue.cfr_renamed_23(sprbne5.cfr_renamed_85(0)).cfr_renamed_186();
    }

    public short[] cfr_renamed_1133() {
        return spriya.cfr_renamed_1271(this.cfr_renamed_1);
    }

    public static sprvxa cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvxa) {
            return (sprvxa)arg0;
        }
        if (arg0 != null) {
            return new sprvxa(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprvxa(int n, short[][] sArray, short[][] sArray2, short[] sArray3) {
        void arg2;
        void arg1;
        void arg0;
        sprvxa sprvxa2 = this;
        sprvxa sprvxa3 = this;
        sprvxa sprvxa4 = this;
        sprvxa3.cfr_renamed_4 = new sprooe(0L);
        sprvxa3.cfr_renamed_2 = new sprooe((long)arg0);
        sprvxa3.cfr_renamed_91 = spriya.cfr_renamed_1267((short[][])arg1);
        sprvxa2.cfr_renamed_3 = spriya.cfr_renamed_1267((short[][])arg2);
        sprvxa2.cfr_renamed_1 = spriya.cfr_renamed_1270(sArray3);
    }

    public int cfr_renamed_1130() {
        return this.cfr_renamed_2.cfr_renamed_97().intValue();
    }

    public sprooe cfr_renamed_3() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprvva cfr_renamed_119() {
        int n;
        int n2;
        sprlre sprlre2;
        sprlre sprlre3 = new sprlre();
        if (this.cfr_renamed_4 != null) {
            sprlre sprlre4 = sprlre3;
            sprlre2 = sprlre4;
            sprlre4.cfr_renamed_49(this.cfr_renamed_4);
        } else {
            sprlre sprlre5 = sprlre3;
            sprlre2 = sprlre5;
            sprlre5.cfr_renamed_49(this.cfr_renamed_0);
        }
        sprlre2.cfr_renamed_49(this.cfr_renamed_2);
        sprlre sprlre6 = new sprlre();
        int n3 = n2 = 0;
        while (n3 < this.cfr_renamed_91.length) {
            sprlre6.cfr_renamed_49(new sprlqe(this.cfr_renamed_91[n2++]));
            n3 = n2;
        }
        sprlre3.cfr_renamed_49(new sprpse(sprlre6));
        sprlre sprlre7 = new sprlre();
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_3.length) {
            sprlre7.cfr_renamed_49(new sprlqe(this.cfr_renamed_3[n++]));
            n4 = n;
        }
        sprlre sprlre8 = sprlre3;
        sprlre8.cfr_renamed_49(new sprpse(sprlre7));
        sprlre sprlre9 = new sprlre();
        sprlre9.cfr_renamed_49(new sprlqe(this.cfr_renamed_1));
        sprlre8.cfr_renamed_49(new sprpse(sprlre9));
        return new sprpse(sprlre3);
    }

    public short[][] cfr_renamed_1131() {
        return spriya.cfr_renamed_1266(this.cfr_renamed_3);
    }

    public short[][] cfr_renamed_1132() {
        return spriya.cfr_renamed_1266(this.cfr_renamed_91);
    }
}

