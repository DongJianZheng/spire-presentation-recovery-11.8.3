/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprwtba;
import com.spire.presentation.packages.sprzag;

public class sprptf {
    private static final byte[] cfr_renamed_1 = sprkoe.cfr_renamed_433(sprwtba.cfr_renamed_9("]'H>V;\u0018l\nrZ&L:\u0018+W\u007f\u000ek\u0015=A+]\u007fK+Y+]~"));
    private final sprgf cfr_renamed_2;
    private final sprgf cfr_renamed_3;
    private final sprzag cfr_renamed_4;

    public int cfr_renamed_6048(byte[] arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        int n;
        byte[] byArray = new byte[32];
        int n2 = n = 0;
        while (n2 < 32) {
            int n3 = n;
            byte by = (byte)(arg2[arg3 + n3] ^ arg4[arg5 + n]);
            byArray[n3] = by;
            n2 = ++n;
        }
        return this.cfr_renamed_6068(arg0, arg1, byArray, 0);
    }

    public int cfr_renamed_6070(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        int n;
        byte[] byArray = new byte[64];
        int n2 = n = 0;
        while (n2 < 32) {
            int n3 = n;
            byArray[n3] = arg2[arg3 + n3];
            int n4 = n + 32;
            byte by = cfr_renamed_1[n];
            byArray[n4] = by;
            n2 = ++n;
        }
        this.cfr_renamed_4.cfr_renamed_6066(byArray, byArray);
        int n5 = n = 0;
        while (n5 < 32) {
            byArray[++n] = (byte)(byArray[n] ^ arg2[arg3 + n + 32]);
            n5 = n;
        }
        this.cfr_renamed_4.cfr_renamed_6066(byArray, byArray);
        int n6 = n = 0;
        while (n6 < 32) {
            int n7 = arg1 + n;
            byte by = byArray[n];
            arg0[n7] = by;
            n6 = ++n;
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    public sprptf(sprgf sprgf2, sprgf sprgf3) {
        void arg0;
        sprptf sprptf2 = this;
        sprptf sprptf3 = this;
        sprptf3.cfr_renamed_4 = new sprzag();
        sprptf2.cfr_renamed_2 = arg0;
        sprptf2.cfr_renamed_3 = sprgf3;
    }

    public int cfr_renamed_6054(byte[] arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        int n;
        byte[] byArray = new byte[64];
        int n2 = n = 0;
        while (n2 < 64) {
            int n3 = n;
            byte by = (byte)(arg2[arg3 + n3] ^ arg4[arg5 + n]);
            byArray[n3] = by;
            n2 = ++n;
        }
        return this.cfr_renamed_6070(arg0, arg1, byArray, 0);
    }

    public sprgf cfr_renamed_6060() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_6068(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        int n;
        byte[] byArray = new byte[64];
        int n2 = n = 0;
        while (n2 < 32) {
            int n3 = n;
            byArray[n3] = arg2[arg3 + n3];
            int n4 = n + 32;
            byte by = cfr_renamed_1[n];
            byArray[n4] = by;
            n2 = ++n;
        }
        this.cfr_renamed_4.cfr_renamed_6066(byArray, byArray);
        int n5 = n = 0;
        while (n5 < 32) {
            int n6 = arg1 + n;
            byte by = byArray[n];
            arg0[n6] = by;
            n5 = ++n;
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    public int cfr_renamed_6064(byte[] byArray, int n, byte[] byArray2, int n2) {
        void arg1;
        void arg0;
        void arg3;
        void arg2;
        sprptf sprptf2 = this;
        sprptf2.cfr_renamed_2.cfr_renamed_1197((byte[])arg2, 0, (int)arg3);
        sprptf2.cfr_renamed_2.cfr_renamed_1219((byte[])arg0, (int)arg1);
        return 0;
    }

    public sprptf(sprgf arg0) {
        this(arg0, null);
    }
}

