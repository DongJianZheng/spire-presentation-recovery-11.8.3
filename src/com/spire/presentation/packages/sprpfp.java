/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprecp;
import com.spire.presentation.packages.sprrzo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprujo;

@sprtea
public class sprpfp {
    private int cfr_renamed_1;
    public sprecp[] cfr_renamed_2;
    public int[] cfr_renamed_3;
    public int cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     */
    public int cfr_renamed_18930(int arg0) {
        int n;
        switch (this.cfr_renamed_7832()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 1: {
                if ((arg0 & 0xFFFF) >= (this.cfr_renamed_4 & 0xFFFF) && (arg0 & 0xFFFF) < this.cfr_renamed_3.length) {
                    return this.cfr_renamed_3[(arg0 & 0xFFFF) - (this.cfr_renamed_4 & 0xFFFF)];
                }
                return -1;
            }
            case 2: 
        }
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2.length) {
            sprecp sprecp2 = this.cfr_renamed_2[n];
            if ((sprecp2.cfr_renamed_3 & 0xFFFF) > (arg0 & 0xFFFF)) {
                return -1;
            }
            if ((arg0 & 0xFFFF) <= (sprecp2.cfr_renamed_2 & 0xFFFF)) {
                return sprecp2.cfr_renamed_4;
            }
            n2 = ++n;
        }
        return -1;
    }

    /*
     * Unable to fully structure code
     */
    public static sprpfp cfr_renamed_18689(sprujo arg0, long arg1) {
        arg0.cfr_renamed_14060().cfr_renamed_11547(arg1, 0);
        var3_2 = new sprpfp();
        var3_2.cfr_renamed_18931(arg0.cfr_renamed_13218());
        switch (var3_2.cfr_renamed_7832()) lbl-1000:
        // 2 sources

        {
            case 1: {
                if (false) ** GOTO lbl-1000
                v0 = arg0;
                v1 = var3_2;
                v1.cfr_renamed_4 = arg0.cfr_renamed_13218();
                var4_3 = v0.cfr_renamed_13218();
                v1.cfr_renamed_3 = sprrzo.cfr_renamed_18661(v0, var4_3 & 65535);
                return var3_2;
            }
            case 2: {
                var4_4 = arg0.cfr_renamed_13218();
                var5_5 = new sprecp[var4_4];
                v2 = var6_6 = 0;
                while (v2 < (var4_4 & 65535)) {
                    var5_5[var6_6++] = new sprecp(arg0.cfr_renamed_13218(), arg0.cfr_renamed_13218(), arg0.cfr_renamed_13218());
                    v2 = var6_6;
                }
                var3_2.cfr_renamed_2 = var5_5;
                return var3_2;
            }
        }
        throw new UnsupportedOperationException();
    }

    public void cfr_renamed_18931(int arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public int cfr_renamed_7832() {
        return this.cfr_renamed_1;
    }
}

