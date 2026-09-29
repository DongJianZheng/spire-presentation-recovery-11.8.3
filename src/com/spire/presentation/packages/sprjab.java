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

public class sprjab
extends sprkra {
    private byte[][] cfr_renamed_112;
    private int cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private int cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private sprtzd cfr_renamed_4;

    public int cfr_renamed_1146() {
        return this.cfr_renamed_0;
    }

    public sprjta cfr_renamed_1153() {
        return new sprjta(this.cfr_renamed_1);
    }

    public sprxta cfr_renamed_1147() {
        return new sprxta(this.cfr_renamed_845(), this.cfr_renamed_2);
    }

    public sprtzd cfr_renamed_113() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprjab(sprtzd sprtzd2, int n, int n2, sprmpa sprmpa2, sprxta sprxta2, sprkqa sprkqa2, sprjta sprjta2, sprxta[] sprxtaArray) {
        void arg7;
        int n3;
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprjab sprjab2 = this;
        sprjab sprjab3 = this;
        sprjab sprjab4 = this;
        sprjab sprjab5 = this;
        sprjab5.cfr_renamed_4 = arg0;
        sprjab5.cfr_renamed_0 = arg1;
        sprjab4.cfr_renamed_119 = arg2;
        sprjab4.cfr_renamed_91 = arg3.cfr_renamed_91();
        sprjab3.cfr_renamed_2 = arg4.cfr_renamed_91();
        sprjab3.cfr_renamed_3 = arg5.cfr_renamed_91();
        sprjab2.cfr_renamed_1 = arg6.cfr_renamed_91();
        sprjab2.cfr_renamed_112 = new byte[sprxtaArray.length][];
        int n4 = n3 = 0;
        while (n4 != ((void)arg7).length) {
            int n5 = n3++;
            this.cfr_renamed_112[n5] = arg7[n5].cfr_renamed_91();
            n4 = n3;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprjab(sprbne sprbne2) {
        int n;
        void arg0;
        this.cfr_renamed_4 = (sprtzd)sprbne2.cfr_renamed_85(0);
        BigInteger bigInteger = ((sprooe)arg0.cfr_renamed_85(1)).cfr_renamed_97();
        this.cfr_renamed_0 = bigInteger.intValue();
        BigInteger bigInteger2 = ((sprooe)arg0.cfr_renamed_85(2)).cfr_renamed_97();
        sprjab sprjab2 = this;
        sprjab2.cfr_renamed_119 = bigInteger2.intValue();
        sprjab2.cfr_renamed_91 = ((sprxue)arg0.cfr_renamed_85(3)).cfr_renamed_186();
        this.cfr_renamed_2 = ((sprxue)arg0.cfr_renamed_85(4)).cfr_renamed_186();
        this.cfr_renamed_3 = ((sprxue)arg0.cfr_renamed_85(5)).cfr_renamed_186();
        this.cfr_renamed_1 = ((sprxue)arg0.cfr_renamed_85(6)).cfr_renamed_186();
        sprbne sprbne3 = (sprbne)arg0.cfr_renamed_85(7);
        this.cfr_renamed_112 = new byte[sprbne3.cfr_renamed_84()][];
        int n2 = n = 0;
        while (n2 < sprbne3.cfr_renamed_84()) {
            int n3 = n++;
            this.cfr_renamed_112[n3] = ((sprxue)sprbne3.cfr_renamed_85(n3)).cfr_renamed_186();
            n2 = n;
        }
    }

    public int cfr_renamed_1150() {
        return this.cfr_renamed_119;
    }

    public static sprjab cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjab) {
            return (sprjab)arg0;
        }
        if (arg0 != null) {
            return new sprjab(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprxta[] cfr_renamed_1148() {
        int n;
        sprxta[] sprxtaArray = new sprxta[this.cfr_renamed_112.length];
        sprmpa sprmpa2 = this.cfr_renamed_845();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_112.length) {
            int n3 = n;
            sprxta sprxta2 = new sprxta(sprmpa2, this.cfr_renamed_112[n]);
            sprxtaArray[n3] = sprxta2;
            n2 = ++n;
        }
        return sprxtaArray;
    }

    public sprmpa cfr_renamed_845() {
        return new sprmpa(this.cfr_renamed_91);
    }

    public sprkqa cfr_renamed_1155() {
        return new sprkqa(this.cfr_renamed_3);
    }

    @Override
    public sprvva cfr_renamed_119() {
        int n;
        sprlre sprlre2 = new sprlre();
        sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        sprlre2.cfr_renamed_49(new sprooe(this.cfr_renamed_0));
        sprlre2.cfr_renamed_49(new sprooe(this.cfr_renamed_119));
        sprlre2.cfr_renamed_49(new sprlqe(this.cfr_renamed_91));
        sprlre2.cfr_renamed_49(new sprlqe(this.cfr_renamed_2));
        sprlre2.cfr_renamed_49(new sprlqe(this.cfr_renamed_3));
        sprlre2.cfr_renamed_49(new sprlqe(this.cfr_renamed_1));
        sprlre sprlre3 = new sprlre();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_112.length) {
            sprlre3.cfr_renamed_49(new sprlqe(this.cfr_renamed_112[n++]));
            n2 = n;
        }
        sprlre2.cfr_renamed_49(new sprpse(sprlre3));
        return new sprpse(sprlre2);
    }
}

