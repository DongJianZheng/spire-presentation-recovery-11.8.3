/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sprruo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwxo;

@sprtea
public class spraqo {
    public sprwxo[] cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    public static spraqo cfr_renamed_15088(sprmzo arg0) {
        int n;
        spraqo spraqo2 = new spraqo();
        int n2 = arg0.cfr_renamed_13218();
        new spraqo().cfr_renamed_2 = new sprwxo[n2];
        spraqo spraqo3 = spraqo2;
        spraqo3.cfr_renamed_3 = arg0.cfr_renamed_12137() & 0xFF;
        spraqo3.cfr_renamed_4 = arg0.cfr_renamed_12137() & 0xFF;
        int n3 = 0;
        int n4 = 0;
        int n5 = n = 0;
        while (n5 < (n2 & 0xFFFF)) {
            spraqo2.cfr_renamed_2[n] = sprwxo.cfr_renamed_15088(arg0);
            n3 += ((spraqo2.cfr_renamed_2[n].cfr_renamed_2 << 16) + (spraqo2.cfr_renamed_2[n].cfr_renamed_4 & 0xFFFF) / 2) / (spraqo2.cfr_renamed_2[n].cfr_renamed_4 & 0xFFFF);
            n4 += ((spraqo2.cfr_renamed_2[++n].cfr_renamed_3 << 16) - (spraqo2.cfr_renamed_2[n].cfr_renamed_4 & 0xFFFF) / 2) / (spraqo2.cfr_renamed_2[n].cfr_renamed_4 & 0xFFFF);
            n5 = n;
        }
        n3 = (n3 + (n2 & 0xFFFF) / 2) / (n2 & 0xFFFF);
        n4 = (n4 - (n2 & 0xFFFF) / 2) / (n2 & 0xFFFF);
        spraqo2.cfr_renamed_3 = n3 + 16 >> 5;
        spraqo2.cfr_renamed_4 = -n4 + 16 >> 5;
        return spraqo2;
    }

    @sprtea
    public int cfr_renamed_18254() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public int cfr_renamed_18255() {
        return this.cfr_renamed_3;
    }

    public void cfr_renamed_18252(sprruo arg0) {
        int n;
        arg0.cfr_renamed_15085(this.cfr_renamed_2.length);
        sprruo sprruo2 = arg0;
        sprruo2.cfr_renamed_11594((byte)(this.cfr_renamed_2[0].cfr_renamed_4 & 0xFFFF));
        sprruo2.cfr_renamed_11594((byte)(this.cfr_renamed_2[this.cfr_renamed_2.length - 1].cfr_renamed_4 & 0xFFFF));
        sprwxo[] sprwxoArray = this.cfr_renamed_2;
        int n2 = this.cfr_renamed_2.length;
        int n3 = n = 0;
        while (n3 < n2) {
            sprwxoArray[n++].cfr_renamed_18252(arg0);
            n3 = n;
        }
    }
}

