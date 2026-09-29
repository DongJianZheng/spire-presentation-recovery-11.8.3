/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprjta;
import com.spire.presentation.packages.sprkqa;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmpa;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxta;
import com.spire.presentation.packages.sprxue;
import java.math.BigInteger;

public class sprxgb
extends sprkra {
    private int cfr_renamed_86;
    private byte[][] cfr_renamed_152;
    private byte[] cfr_renamed_112;
    private byte[] cfr_renamed_119;
    private int cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private sprtzd cfr_renamed_4;

    public sprtzd cfr_renamed_113() {
        return this.cfr_renamed_4;
    }

    public sprxta[] cfr_renamed_1148() {
        int n;
        sprxta[] sprxtaArray = new sprxta[this.cfr_renamed_152.length];
        sprmpa sprmpa2 = this.cfr_renamed_845();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_152.length) {
            int n3 = n;
            sprxta sprxta2 = new sprxta(sprmpa2, this.cfr_renamed_152[n]);
            sprxtaArray[n3] = sprxta2;
            n2 = ++n;
        }
        return sprxtaArray;
    }

    @Override
    public sprvva cfr_renamed_119() {
        int n;
        sprlre sprlre2 = new sprlre();
        sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        sprlre2.cfr_renamed_49(new sprooe(this.cfr_renamed_91));
        sprlre2.cfr_renamed_49(new sprooe(this.cfr_renamed_86));
        sprlre2.cfr_renamed_49(new sprlqe(this.cfr_renamed_2));
        sprlre2.cfr_renamed_49(new sprlqe(this.cfr_renamed_119));
        sprlre2.cfr_renamed_49(new sprlqe(this.cfr_renamed_1));
        sprlre2.cfr_renamed_49(new sprlqe(this.cfr_renamed_3));
        sprlre2.cfr_renamed_49(new sprlqe(this.cfr_renamed_0));
        sprlre2.cfr_renamed_49(new sprlqe(this.cfr_renamed_112));
        sprlre sprlre3 = new sprlre();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_152.length) {
            sprlre3.cfr_renamed_49(new sprlqe(this.cfr_renamed_152[n++]));
            n2 = n;
        }
        sprlre2.cfr_renamed_49(new sprpse(sprlre3));
        return new sprpse(sprlre2);
    }

    public sprxta cfr_renamed_1147() {
        return new sprxta(this.cfr_renamed_845(), this.cfr_renamed_119);
    }

    public sprjta cfr_renamed_1153() {
        return new sprjta(this.cfr_renamed_112);
    }

    /*
     * WARNING - void declaration
     */
    public sprxgb(sprtzd sprtzd2, int n, int n2, sprmpa sprmpa2, sprxta sprxta2, sprjta sprjta2, sprkqa sprkqa2, sprkqa sprkqa3, sprjta sprjta3, sprxta[] sprxtaArray) {
        void arg9;
        int n3;
        void arg8;
        void arg7;
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprxgb sprxgb2 = this;
        sprxgb sprxgb3 = this;
        sprxgb sprxgb4 = this;
        sprxgb sprxgb5 = this;
        sprxgb sprxgb6 = this;
        sprxgb6.cfr_renamed_4 = arg0;
        sprxgb6.cfr_renamed_91 = arg1;
        sprxgb5.cfr_renamed_86 = arg2;
        sprxgb5.cfr_renamed_2 = arg3.cfr_renamed_91();
        sprxgb4.cfr_renamed_119 = arg4.cfr_renamed_91();
        sprxgb4.cfr_renamed_1 = arg5.cfr_renamed_91();
        sprxgb3.cfr_renamed_3 = arg6.cfr_renamed_91();
        sprxgb3.cfr_renamed_0 = arg7.cfr_renamed_91();
        sprxgb2.cfr_renamed_112 = arg8.cfr_renamed_91();
        sprxgb2.cfr_renamed_152 = new byte[sprxtaArray.length][];
        int n4 = n3 = 0;
        while (n4 != ((void)arg9).length) {
            int n5 = n3++;
            this.cfr_renamed_152[n5] = arg9[n5].cfr_renamed_91();
            n4 = n3;
        }
    }

    public sprmpa cfr_renamed_845() {
        return new sprmpa(this.cfr_renamed_2);
    }

    public int cfr_renamed_1150() {
        return this.cfr_renamed_86;
    }

    public sprkqa cfr_renamed_1152() {
        return new sprkqa(this.cfr_renamed_3);
    }

    public sprkqa cfr_renamed_1151() {
        return new sprkqa(this.cfr_renamed_0);
    }

    public sprjta cfr_renamed_1149() {
        return new sprjta(this.cfr_renamed_1);
    }

    public int cfr_renamed_1146() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprxgb(sprbne sprbne2) {
        int n;
        void arg0;
        this.cfr_renamed_4 = (sprtzd)sprbne2.cfr_renamed_85(0);
        BigInteger bigInteger = ((sprooe)arg0.cfr_renamed_85(1)).cfr_renamed_97();
        this.cfr_renamed_91 = bigInteger.intValue();
        BigInteger bigInteger2 = ((sprooe)arg0.cfr_renamed_85(2)).cfr_renamed_97();
        sprxgb sprxgb2 = this;
        sprxgb2.cfr_renamed_86 = bigInteger2.intValue();
        sprxgb2.cfr_renamed_2 = ((sprxue)arg0.cfr_renamed_85(3)).cfr_renamed_186();
        this.cfr_renamed_119 = ((sprxue)arg0.cfr_renamed_85(4)).cfr_renamed_186();
        this.cfr_renamed_1 = ((sprxue)arg0.cfr_renamed_85(5)).cfr_renamed_186();
        this.cfr_renamed_3 = ((sprxue)arg0.cfr_renamed_85(6)).cfr_renamed_186();
        this.cfr_renamed_0 = ((sprxue)arg0.cfr_renamed_85(7)).cfr_renamed_186();
        this.cfr_renamed_112 = ((sprxue)arg0.cfr_renamed_85(8)).cfr_renamed_186();
        sprbne sprbne3 = (sprbne)arg0.cfr_renamed_85(9);
        this.cfr_renamed_152 = new byte[sprbne3.cfr_renamed_84()][];
        int n2 = n = 0;
        while (n2 < sprbne3.cfr_renamed_84()) {
            int n3 = n++;
            this.cfr_renamed_152[n3] = ((sprxue)sprbne3.cfr_renamed_85(n3)).cfr_renamed_186();
            n2 = n;
        }
    }

    public static sprxgb cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxgb) {
            return (sprxgb)arg0;
        }
        if (arg0 != null) {
            return new sprxgb(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}

