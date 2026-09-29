/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhze;
import com.spire.presentation.packages.spruhf;

public class sprcdf
extends spruhf {
    @Override
    public void cfr_renamed_5413(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.cfr_renamed_5405() / 2) {
            sprcdf sprcdf2 = this;
            sprcdf2.cfr_renamed_3[2 * n + 0] = (short)((arg0[3 * n + 0] & 0xFF) >>> 0 | ((short)(arg0[3 * n + 1] & 0xFF) & 0xF) << 8);
            int n3 = 2 * n + 1;
            short s = (short)((arg0[3 * n + 1] & 0xFF) >>> 4 | ((short)(arg0[3 * n + 2] & 0xFF) & 0xFF) << 4);
            sprcdf2.cfr_renamed_3[n3] = s;
            n2 = ++n;
        }
        sprcdf sprcdf3 = this;
        sprcdf3.cfr_renamed_3[sprcdf3.cfr_renamed_4.cfr_renamed_5403() - 1] = 0;
    }

    public sprcdf(sprhze arg0) {
        super(arg0);
    }

    @Override
    public byte[] cfr_renamed_5410(int arg0) {
        int n;
        byte[] byArray = new byte[arg0];
        int n2 = this.cfr_renamed_4.cfr_renamed_5397();
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_4.cfr_renamed_5405() / 2) {
            byArray[3 * n + 0] = (byte)(sprcdf.cfr_renamed_5396(this.cfr_renamed_3[2 * n + 0] & 0xFFFF, n2) & 0xFF);
            byArray[3 * n + 1] = (byte)(sprcdf.cfr_renamed_5396(this.cfr_renamed_3[2 * n + 0] & 0xFFFF, n2) >>> 8 | (sprcdf.cfr_renamed_5396(this.cfr_renamed_3[2 * n + 1] & 0xFFFF, n2) & 0xF) << 4);
            int n4 = 3 * n + 2;
            byte by = (byte)(sprcdf.cfr_renamed_5396(this.cfr_renamed_3[2 * n + 1] & 0xFFFF, n2) >>> 4);
            byArray[n4] = by;
            n3 = ++n;
        }
        return byArray;
    }
}

