/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprdqd;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkme;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlee;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sproge;
import com.spire.presentation.packages.sproje;
import com.spire.presentation.packages.sprpae;
import com.spire.presentation.packages.sprshe;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprtkm;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryje;
import com.spire.presentation.packages.spryte;

public class sprnme
extends sprkra
implements sprkj {
    public static final int cfr_renamed_132 = 6;
    public static final int cfr_renamed_102 = 0;
    private int cfr_renamed_93;
    public static final int cfr_renamed_86 = 5;
    private static final boolean[] cfr_renamed_152;
    public static final int cfr_renamed_112 = 4;
    private spra cfr_renamed_119;
    public static final int cfr_renamed_91 = 2;
    public static final int cfr_renamed_0 = 1;
    private sprtie cfr_renamed_1;
    public static final int cfr_renamed_2 = 3;
    public static final int cfr_renamed_3 = 8;
    public static final int cfr_renamed_4 = 7;

    /*
     * WARNING - void declaration
     */
    public sprnme(int n, spra spra2) {
        void arg0;
        sprnme sprnme2 = this;
        sprnme2.cfr_renamed_93 = arg0;
        sprnme2.cfr_renamed_119 = spra2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        if (this.cfr_renamed_1 == null) {
            sprnme sprnme2 = this;
            return new sprhse(cfr_renamed_152[this.cfr_renamed_93], sprnme2.cfr_renamed_93, sprnme2.cfr_renamed_119);
        }
        return this.cfr_renamed_1.cfr_renamed_119();
    }

    public sprnme(sprtie sprtie2) {
        sprnme sprnme2 = this;
        sprnme2.cfr_renamed_93 = -1;
        sprnme2.cfr_renamed_1 = sprtie2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprnme(spryte spryte2) {
        sprnme sprnme2 = this;
        sprnme2.cfr_renamed_93 = spryte2.cfr_renamed_312();
        switch (sprnme2.cfr_renamed_93) {
            case 0: {
                void arg0;
                this.cfr_renamed_119 = sprcge.cfr_renamed_341((spryte)arg0, false);
                return;
            }
            case 1: {
                void arg0;
                this.cfr_renamed_119 = sprlee.cfr_renamed_23(arg0.cfr_renamed_2456());
                return;
            }
            case 2: {
                void arg0;
                this.cfr_renamed_119 = sprkme.cfr_renamed_341((spryte)arg0, false);
                return;
            }
            case 3: {
                void arg0;
                this.cfr_renamed_119 = sprnte.cfr_renamed_23(arg0.cfr_renamed_2456());
                return;
            }
            case 4: {
                void arg0;
                this.cfr_renamed_119 = sproje.cfr_renamed_341((spryte)arg0, false);
                return;
            }
            case 5: {
                void arg0;
                this.cfr_renamed_119 = sproge.cfr_renamed_23(arg0.cfr_renamed_2456());
                return;
            }
            case 6: {
                void arg0;
                this.cfr_renamed_119 = sprpae.cfr_renamed_341((spryte)arg0, false);
                return;
            }
            case 7: {
                void arg0;
                this.cfr_renamed_119 = spryje.cfr_renamed_341((spryte)arg0, false);
                return;
            }
            case 8: {
                void arg0;
                this.cfr_renamed_119 = sprshe.cfr_renamed_23(arg0.cfr_renamed_2456());
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprtkm.cfr_renamed_9("\nM4M0T1\u0003+B8\u0019\u007f")).append(this.cfr_renamed_93).toString());
    }

    public static sprnme cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprnme) {
            return (sprnme)arg0;
        }
        if (arg0 instanceof spryte) {
            return new sprnme((spryte)arg0);
        }
        if (arg0 != null) {
            return new sprnme(sprtie.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprtie cfr_renamed_4780() {
        return this.cfr_renamed_1;
    }

    public static sprnme[] cfr_renamed_4749(sprbne arg0) {
        int n;
        sprnme[] sprnmeArray = new sprnme[arg0.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprnmeArray.length) {
            int n3 = n++;
            sprnmeArray[n3] = sprnme.cfr_renamed_23(arg0.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprnmeArray;
    }

    public int cfr_renamed_312() {
        return this.cfr_renamed_93;
    }

    public String toString() {
        return new StringBuilder().insert(0, sprdqd.cfr_renamed_9("Qh`yWyqY}fwc2v\u0018")).append(this.cfr_renamed_119).append(sprtkm.cfr_renamed_9("^U")).toString();
    }

    static {
        boolean[] blArray = new boolean[9];
        blArray[0] = 0;
        blArray[1] = 1;
        blArray[2] = false;
        blArray[3] = true;
        blArray[4] = false;
        blArray[5] = true;
        blArray[6] = false;
        blArray[7] = false;
        blArray[8] = true;
        cfr_renamed_152 = blArray;
    }

    public spra cfr_renamed_97() {
        return this.cfr_renamed_119;
    }
}

