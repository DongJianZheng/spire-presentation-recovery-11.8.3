/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprazaa;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprfmr;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprzra;
import java.math.BigInteger;

public class spriza
extends sprkra {
    private int[] cfr_renamed_0;
    private int[] cfr_renamed_1;
    private static final BigInteger cfr_renamed_2 = BigInteger.valueOf(0L);
    private int[] cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spriza(int n, int[] nArray, int[] nArray2, int[] nArray3) {
        void arg2;
        void arg1;
        void arg0;
        spriza spriza2 = this;
        spriza spriza3 = this;
        spriza3.cfr_renamed_4 = arg0;
        spriza3.cfr_renamed_3 = arg1;
        spriza2.cfr_renamed_0 = arg2;
        spriza2.cfr_renamed_1 = nArray3;
    }

    public int[] cfr_renamed_1153() {
        return sprzra.cfr_renamed_535(this.cfr_renamed_3);
    }

    public int[] cfr_renamed_1150() {
        return sprzra.cfr_renamed_535(this.cfr_renamed_1);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spriza(sprbne sprbne2) {
        int n;
        void arg0;
        if (sprbne2.cfr_renamed_84() != 4) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprazaa.cfr_renamed_9("!:7s=5r 7\"\u001d5\u00022 2? rnr")).append(arg0.cfr_renamed_84()).toString());
        }
        BigInteger bigInteger = ((sprooe)arg0.cfr_renamed_85(0)).cfr_renamed_97();
        this.cfr_renamed_4 = spriza.cfr_renamed_1437(bigInteger);
        sprbne sprbne3 = (sprbne)arg0.cfr_renamed_85(1);
        sprbne sprbne4 = (sprbne)arg0.cfr_renamed_85(2);
        sprbne sprbne5 = (sprbne)arg0.cfr_renamed_85(3);
        if (sprbne3.cfr_renamed_84() != this.cfr_renamed_4 || sprbne4.cfr_renamed_84() != this.cfr_renamed_4 || sprbne5.cfr_renamed_84() != this.cfr_renamed_4) {
            throw new IllegalArgumentException(sprfmr.cfr_renamed_9("FWYXCPK\u0019\\PU\\\u000fVI\u0019\\\\^LJWL\\\\"));
        }
        spriza spriza2 = this;
        spriza2.cfr_renamed_3 = new int[sprbne3.cfr_renamed_84()];
        spriza2.cfr_renamed_0 = new int[sprbne4.cfr_renamed_84()];
        this.cfr_renamed_1 = new int[sprbne5.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4) {
            int n3 = n;
            this.cfr_renamed_3[n3] = spriza.cfr_renamed_1437(((sprooe)sprbne3.cfr_renamed_85(n3)).cfr_renamed_97());
            int n4 = n;
            this.cfr_renamed_0[n4] = spriza.cfr_renamed_1437(((sprooe)sprbne4.cfr_renamed_85(n4)).cfr_renamed_97());
            int n5 = n++;
            this.cfr_renamed_1[n5] = spriza.cfr_renamed_1437(((sprooe)sprbne5.cfr_renamed_85(n5)).cfr_renamed_97());
            n2 = n;
        }
    }

    public static spriza cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spriza) {
            return (spriza)arg0;
        }
        if (arg0 != null) {
            return new spriza(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        int n;
        sprlre sprlre2 = new sprlre();
        sprlre sprlre3 = new sprlre();
        sprlre sprlre4 = new sprlre();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.length) {
            sprlre2.cfr_renamed_49(new sprooe(this.cfr_renamed_3[n]));
            sprlre3.cfr_renamed_49(new sprooe(this.cfr_renamed_0[n]));
            int n3 = this.cfr_renamed_1[n];
            sprlre4.cfr_renamed_49(new sprooe(n3));
            n2 = ++n;
        }
        sprlre sprlre5 = new sprlre();
        sprlre5.cfr_renamed_49(new sprooe(this.cfr_renamed_4));
        sprlre5.cfr_renamed_49(new sprpse(sprlre2));
        sprlre5.cfr_renamed_49(new sprpse(sprlre3));
        sprlre5.cfr_renamed_49(new sprpse(sprlre4));
        return new sprpse(sprlre5);
    }

    private static /* synthetic */ int cfr_renamed_1437(BigInteger arg0) {
        if (arg0.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0 || arg0.compareTo(cfr_renamed_2) <= 0) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprazaa.cfr_renamed_9("\u0010:5\u001a<'747!r=='r:<s\u00002<47ir")).append(arg0.toString()).toString());
        }
        return arg0.intValue();
    }

    public int[] cfr_renamed_1438() {
        return sprzra.cfr_renamed_535(this.cfr_renamed_0);
    }

    public int cfr_renamed_1144() {
        return this.cfr_renamed_4;
    }
}

