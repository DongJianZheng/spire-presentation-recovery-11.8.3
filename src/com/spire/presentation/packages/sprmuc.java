/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprouba;
import com.spire.presentation.packages.sprqog;

public class sprmuc {
    private static final int cfr_renamed_1 = 1024;
    private byte[] cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    public sprmuc() {
        this(1024);
    }

    public void cfr_renamed_2923(byte[] arg0, int arg1, int arg2) {
        sprmuc sprmuc2 = this;
        if (sprmuc2.cfr_renamed_3 + sprmuc2.cfr_renamed_4 + arg2 > this.cfr_renamed_2.length) {
            sprmuc sprmuc3;
            int n = sprmuc.cfr_renamed_3264(this.cfr_renamed_4 + arg2);
            if (n > this.cfr_renamed_2.length) {
                byte[] byArray = new byte[n];
                sprmuc sprmuc4 = this;
                sprmuc3 = sprmuc4;
                System.arraycopy(sprmuc4.cfr_renamed_2, this.cfr_renamed_3, byArray, 0, this.cfr_renamed_4);
                sprmuc4.cfr_renamed_2 = byArray;
            } else {
                sprmuc sprmuc5 = this;
                sprmuc3 = sprmuc5;
                System.arraycopy(sprmuc5.cfr_renamed_2, sprmuc5.cfr_renamed_3, this.cfr_renamed_2, 0, this.cfr_renamed_4);
            }
            sprmuc3.cfr_renamed_3 = 0;
        }
        sprmuc sprmuc6 = this;
        System.arraycopy(arg0, arg1, sprmuc6.cfr_renamed_2, sprmuc6.cfr_renamed_3 + this.cfr_renamed_4, arg2);
        this.cfr_renamed_4 += arg2;
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_3265(int arg0) {
        if (arg0 > this.cfr_renamed_4) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprouba.cfr_renamed_9("_jres\u007f<yyfs}y+")).append(arg0).append(sprqog.cfr_renamed_9("0/i9u><m\u007f#|40*\u007f90")).append(this.cfr_renamed_4).toString());
        }
        sprmuc sprmuc2 = this;
        sprmuc2.cfr_renamed_4 -= arg0;
        sprmuc2.cfr_renamed_3 += arg0;
    }

    public void cfr_renamed_2943(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg0.length - arg1 < arg2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprouba.cfr_renamed_9("Iimznn+obfn<dz+")).append(arg0.length).append(sprqog.cfr_renamed_9("my>09\u007f\"0>},|!0+\u007f?0,0?u,tm\u007f+0")).append(arg2).append(sprouba.cfr_renamed_9("<ie\u007fyx")).toString());
        }
        if (this.cfr_renamed_4 - arg3 < arg2) {
            throw new IllegalStateException(sprqog.cfr_renamed_9("^\"dmu#\u007f8w%0)q9qmd\"0?u,t"));
        }
        sprmuc sprmuc2 = this;
        System.arraycopy(sprmuc2.cfr_renamed_2, sprmuc2.cfr_renamed_3 + arg3, arg0, arg1, arg2);
    }

    public sprmuc(int n) {
        sprmuc sprmuc2 = this;
        this.cfr_renamed_3 = 0;
        sprmuc2.cfr_renamed_4 = 0;
        sprmuc2.cfr_renamed_2 = new byte[n];
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_2912(byte[] byArray, int n, int n2, int n3) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprmuc sprmuc2 = this;
        sprmuc2.cfr_renamed_2943((byte[])arg0, (int)arg1, (int)arg2, (int)arg3);
        sprmuc2.cfr_renamed_3265(n3 + arg2);
    }

    public byte[] cfr_renamed_2944(int arg0, int arg1) {
        byte[] byArray = new byte[arg0];
        this.cfr_renamed_2912(byArray, 0, arg0, arg1);
        return byArray;
    }

    public static int cfr_renamed_3264(int arg0) {
        int n = arg0;
        arg0 = n | n >> 1;
        arg0 |= arg0 >> 2;
        arg0 |= arg0 >> 4;
        arg0 |= arg0 >> 8;
        arg0 |= arg0 >> 16;
        return arg0 + 1;
    }
}

