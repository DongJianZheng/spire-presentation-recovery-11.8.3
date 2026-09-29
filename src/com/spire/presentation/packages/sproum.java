/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbxm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdcm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtlo;
import com.spire.presentation.packages.sprwxca;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.util.Arrays;

public class sproum
extends sprqqe {
    private boolean cfr_renamed_1;
    private sprdcm[] cfr_renamed_2;
    private boolean cfr_renamed_3;
    private boolean cfr_renamed_4;

    public static sproum cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sproum.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    private /* synthetic */ void cfr_renamed_4760(boolean arg0) {
        this.cfr_renamed_3 = arg0;
    }

    private /* synthetic */ void cfr_renamed_4762(boolean arg0) {
        this.cfr_renamed_4 = arg0;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        int n;
        sprrvm sprrvm2 = new sprrvm(4);
        sprrvm sprrvm3 = new sprrvm(this.cfr_renamed_2.length);
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_2.length) {
            sprrvm3.cfr_renamed_5004(this.cfr_renamed_2[n++]);
            n2 = n;
        }
        sprrvm2.cfr_renamed_5004(new sprcen(sprrvm3));
        if (this.cfr_renamed_4) {
            sprrvm2.cfr_renamed_5004(sprbxm.cfr_renamed_655(this.cfr_renamed_4));
        }
        if (this.cfr_renamed_1) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)sprbxm.cfr_renamed_655(this.cfr_renamed_1)));
        }
        if (this.cfr_renamed_3) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 1, (sprco)sprbxm.cfr_renamed_655(this.cfr_renamed_3)));
        }
        return new sprcen(sprrvm2);
    }

    public sproum(sprdcm[] sprdcmArray) {
        sproum sproum2 = this;
        sproum2.cfr_renamed_4 = false;
        sproum2.cfr_renamed_1 = false;
        this.cfr_renamed_3 = false;
        this.cfr_renamed_2 = this.cfr_renamed_11154(sprdcmArray);
    }

    private /* synthetic */ sprdcm[] cfr_renamed_11154(sprdcm[] arg0) {
        sprdcm[] sprdcmArray = new sprdcm[arg0.length];
        System.arraycopy(arg0, 0, sprdcmArray, 0, sprdcmArray.length);
        return sprdcmArray;
    }

    public boolean cfr_renamed_4757() {
        return this.cfr_renamed_4;
    }

    public boolean cfr_renamed_4756() {
        return this.cfr_renamed_3;
    }

    private static /* synthetic */ sprdcm[] cfr_renamed_11256(sprszm arg0) {
        int n;
        sprdcm[] sprdcmArray = new sprdcm[arg0.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprdcmArray.length) {
            int n3 = n++;
            sprdcmArray[n3] = sprdcm.cfr_renamed_23(arg0.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprdcmArray;
    }

    public boolean cfr_renamed_4755() {
        return this.cfr_renamed_1;
    }

    private /* synthetic */ void cfr_renamed_4761(boolean arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public static sproum cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sproum) {
            return (sproum)arg0;
        }
        if (arg0 != null) {
            int n;
            sprszm sprszm2 = sprszm.cfr_renamed_23(arg0);
            sprszm sprszm3 = sprszm.cfr_renamed_23(sprszm2.cfr_renamed_85(0));
            sproum sproum2 = new sproum(sproum.cfr_renamed_11256(sprszm3));
            int n2 = n = 1;
            while (n2 < sprszm2.cfr_renamed_84()) {
                sprxgf sprxgf2;
                sprco sprco2 = sprszm2.cfr_renamed_85(n);
                if (sprco2 instanceof sprbxm) {
                    sprxgf2 = sprbxm.cfr_renamed_23(sprco2);
                    sproum2.cfr_renamed_4762(((sprbxm)sprxgf2).cfr_renamed_587());
                } else if (sprco2 instanceof sprnvm) {
                    sprxgf2 = sprnvm.cfr_renamed_23(sprco2);
                    switch (((sprnvm)sprxgf2).cfr_renamed_312()) {
                        case 0: {
                            while (false) {
                            }
                            sprbxm sprbxm2 = sprbxm.cfr_renamed_5085((sprnvm)sprxgf2, false);
                            sproum2.cfr_renamed_4761(sprbxm2.cfr_renamed_587());
                            break;
                        }
                        case 1: {
                            sprbxm sprbxm2 = sprbxm.cfr_renamed_5085((sprnvm)sprxgf2, false);
                            sproum2.cfr_renamed_4760(sprbxm2.cfr_renamed_587());
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException(new StringBuilder().insert(0, sprtlo.cfr_renamed_9("$(\u001a(\u001e1\u001ff\u0005'\u0016f\u0014(\u0012)\u0004(\u0005#\u0003#\u0015|Q")).append(((sprnvm)sprxgf2).cfr_renamed_312()).toString());
                        }
                    }
                }
                n2 = ++n;
            }
            return sproum2;
        }
        return null;
    }

    public sprdcm[] cfr_renamed_4759() {
        sproum sproum2 = this;
        return sproum2.cfr_renamed_11154(sproum2.cfr_renamed_2);
    }

    public String toString() {
        return new StringBuilder().insert(0, sprwxca.cfr_renamed_9("\u0004\u0015 \u001c\u0004\u0006;\u0017\u001d\u001a$\u0001 Nt\u000f^\u00157\u00171\u0004 \u00156\u00181$;\u0018=\u0017-'1\u0000nT")).append(Arrays.asList(this.cfr_renamed_2)).append("\n").append(sprtlo.cfr_renamed_9("/\u001f.\u0018$\u00182!)\u001d/\u0012?<'\u00016\u0018(\u0016|Q")).append(this.cfr_renamed_4).append("\n").append(sprwxca.cfr_renamed_9("1\f$\u0018=\u0017=\u0000\u0004\u001b8\u001d7\r\u0006\u0011%\u0010nT")).append(this.cfr_renamed_1).append("\n").append(sprtlo.cfr_renamed_9("/\u001f.\u0018$\u001820(\b\u0016\u001e*\u0018%\b|Q")).append(this.cfr_renamed_3).append("\n").append(sprwxca.cfr_renamed_9(")~")).toString();
    }

    /*
     * WARNING - void declaration
     */
    public sproum(sprdcm[] sprdcmArray, boolean bl, boolean bl2, boolean bl3) {
        void arg2;
        void arg1;
        void arg0;
        sproum sproum2 = this;
        sproum sproum3 = this;
        this.cfr_renamed_4 = false;
        sproum3.cfr_renamed_1 = false;
        sproum3.cfr_renamed_3 = false;
        this.cfr_renamed_2 = this.cfr_renamed_11154((sprdcm[])arg0);
        this.cfr_renamed_4 = arg1;
        sproum2.cfr_renamed_1 = arg2;
        sproum2.cfr_renamed_3 = bl3;
    }
}

