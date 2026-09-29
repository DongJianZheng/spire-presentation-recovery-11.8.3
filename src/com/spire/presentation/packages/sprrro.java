/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprrro {
    private int cfr_renamed_2;
    private long[] cfr_renamed_3;
    private sprmzo cfr_renamed_4;

    public long[] cfr_renamed_18479() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_18436() {
        return this.cfr_renamed_2;
    }

    public void cfr_renamed_18437(int arg0) {
        sprrro sprrro2 = this;
        long l = sprrro2.cfr_renamed_18479()[arg0];
        sprrro2.cfr_renamed_4.cfr_renamed_14060().cfr_renamed_11548(l);
    }

    public sprrro(sprmzo sprmzo2) {
        this.cfr_renamed_4 = sprmzo2;
    }

    public boolean cfr_renamed_15072() {
        int n;
        this.cfr_renamed_4.cfr_renamed_14060().cfr_renamed_11548(0L);
        String string = new String(this.cfr_renamed_4.cfr_renamed_13221(4));
        if (!"ttcf".equals(string)) {
            return false;
        }
        int n2 = this.cfr_renamed_4.cfr_renamed_12261();
        if (n2 != 65536 && n2 != 131072) {
            return false;
        }
        sprrro sprrro2 = this;
        sprrro2.cfr_renamed_2 = sprrro2.cfr_renamed_4.cfr_renamed_12261();
        if (sprrro2.cfr_renamed_2 <= 0) {
            return false;
        }
        sprrro sprrro3 = this;
        sprrro3.cfr_renamed_18564(new long[sprrro3.cfr_renamed_18436()]);
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_18436()) {
            this.cfr_renamed_18479()[n++] = this.cfr_renamed_4.cfr_renamed_13220();
            n3 = n;
        }
        if (131072 == n2) {
            this.cfr_renamed_4.cfr_renamed_13220();
            this.cfr_renamed_4.cfr_renamed_13220();
            this.cfr_renamed_4.cfr_renamed_13220();
        }
        return true;
    }

    public void cfr_renamed_18564(long[] arg0) {
        this.cfr_renamed_3 = arg0;
    }
}

