/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxtn;

@sprtea
public class sprpsn {
    private byte[] cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @sprtea
    public byte[] cfr_renamed_1512(byte[] arg0) {
        sprpdja sprpdja2 = new sprpdja();
        try {
            this.cfr_renamed_14409(sprpdja2).cfr_renamed_4924(arg0, 0, arg0.length);
            byte[] byArray = sprpdja2.cfr_renamed_4529();
            return byArray;
        }
        finally {
            if (sprpdja2 != null) {
                sprpdja2.cfr_renamed_2637();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprpsn(byte[] byArray, int n) {
        void arg0;
        sprpsn sprpsn2 = this;
        sprpsn2.cfr_renamed_3 = arg0;
        sprpsn2.cfr_renamed_4 = n;
    }

    @sprtea
    public sprxtn cfr_renamed_14409(spreen arg0) {
        return new sprxtn(arg0, this.cfr_renamed_3, 0, this.cfr_renamed_4);
    }
}

