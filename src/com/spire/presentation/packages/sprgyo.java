/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgxo;
import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sprnra;
import com.spire.presentation.packages.sproup;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprruo;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprgyo
extends sprgxo {
    public boolean cfr_renamed_152;
    private static final int cfr_renamed_112 = 1;
    private static final int cfr_renamed_119 = 64;
    private static final int cfr_renamed_91 = 128;
    private static final int cfr_renamed_0 = 8;
    public byte[] cfr_renamed_1;
    public byte[] cfr_renamed_2;
    private static final int cfr_renamed_3 = 256;
    private static final int cfr_renamed_4 = 32;

    private static /* synthetic */ boolean cfr_renamed_18623(int arg0) {
        return sproup.cfr_renamed_16714(arg0, 256);
    }

    private static /* synthetic */ boolean cfr_renamed_18624(int arg0) {
        return sproup.cfr_renamed_16714(arg0, 32);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void cfr_renamed_18625(sprmzo arg0) {
        sprpdja sprpdja2 = new sprpdja();
        try {
            int n;
            sprruo sprruo2 = new sprruo(sprpdja2);
            do {
                sprmzo sprmzo2 = arg0;
                n = sprmzo2.cfr_renamed_13218();
                int n2 = sprmzo2.cfr_renamed_13218();
                byte[] byArray = sprmzo2.cfr_renamed_16065(sprgyo.cfr_renamed_18626(n));
                sprruo sprruo3 = sprruo2;
                sprruo2.cfr_renamed_15085(n & 0xFFFF);
                sprruo3.cfr_renamed_15085(n2 & 0xFFFF);
                sprruo3.cfr_renamed_15098(byArray, 0, byArray.length);
            } while (sprgyo.cfr_renamed_18624(n));
            sprgyo sprgyo2 = this;
            sprgyo2.cfr_renamed_152 = sprgyo.cfr_renamed_18623(n);
            sprgyo2.cfr_renamed_1 = sprpdja2.cfr_renamed_4529();
            if (sprpdja2 == null) return;
        }
        catch (Throwable throwable) {
            if (sprpdja2 == null) throw throwable;
            sprpdja2.cfr_renamed_2637();
            throw throwable;
        }
        sprpdja2.cfr_renamed_2637();
    }

    public static sprgyo cfr_renamed_18598(sprmzo arg0) {
        sprgyo sprgyo2 = new sprgyo();
        sprgyo2.cfr_renamed_1 = (byte[])arg0.cfr_renamed_12254();
        if (sprgyo2.cfr_renamed_1 >= 0) {
            throw new IllegalStateException(sprnra.cfr_renamed_9("x\u0000G\u000f]\u0007UNR\u0001_\u001a^\u001bC\u001d\u0011\u0000D\u0003S\u000bC@"));
        }
        sprmzo sprmzo2 = arg0;
        sprgyo sprgyo3 = sprgyo2;
        sprgyo3.cfr_renamed_4 = arg0.cfr_renamed_12254();
        sprgyo3.cfr_renamed_3 = arg0.cfr_renamed_12254();
        sprgyo2.cfr_renamed_0 = sprmzo2.cfr_renamed_12254();
        sprgyo2.cfr_renamed_2 = (byte[])sprmzo2.cfr_renamed_12254();
        sprgyo2.cfr_renamed_18625(arg0);
        if (sprgyo2.cfr_renamed_152) {
            int n = arg0.cfr_renamed_13218();
            sprgyo2.cfr_renamed_2 = arg0.cfr_renamed_16065(n & 0xFFFF);
        }
        return sprgyo2;
    }

    @Override
    public void cfr_renamed_18252(sprruo arg0) {
        sprgyo sprgyo2 = this;
        sprruo sprruo2 = arg0;
        super.cfr_renamed_18252(sprruo2);
        sprruo2.cfr_renamed_15098(sprgyo2.cfr_renamed_1, 0, this.cfr_renamed_1.length);
        if (this.cfr_renamed_152) {
            arg0.cfr_renamed_15085(this.cfr_renamed_2.length);
            arg0.cfr_renamed_15098(this.cfr_renamed_2, 0, this.cfr_renamed_2.length);
        }
    }

    private static /* synthetic */ int cfr_renamed_18626(int arg0) {
        int n;
        int n2 = n = sproup.cfr_renamed_16714(arg0, 1) ? 4 : 2;
        if (sproup.cfr_renamed_16714(arg0, 8)) {
            return n += 2;
        }
        if (sproup.cfr_renamed_16714(arg0, 64)) {
            return n += 4;
        }
        if (sproup.cfr_renamed_16714(arg0, 128)) {
            n += 8;
        }
        return n;
    }
}

