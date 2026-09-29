/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkqo;
import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sprruo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprudz;
import com.spire.presentation.packages.spruqo;
import com.spire.presentation.packages.spryxp;

@sprtea
public class sprmto
extends sprkqo {
    @sprtea
    public int cfr_renamed_1;
    @sprtea
    public spruqo[] cfr_renamed_2;
    @sprtea
    public int cfr_renamed_3;
    @sprtea
    public int cfr_renamed_4;

    @sprtea
    public void cfr_renamed_18580() {
        this.cfr_renamed_1 = spryxp.cfr_renamed_17420(spruqo.cfr_renamed_18581(this.cfr_renamed_3), 4);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @sprtea
    public void cfr_renamed_18252(sprruo sprruo2) {
        int n;
        void arg0;
        this.cfr_renamed_18086((sprruo)arg0);
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2.length) {
            spruqo spruqo2 = this.cfr_renamed_2[n];
            spruqo2.cfr_renamed_18582((sprruo)arg0, this.cfr_renamed_1);
            n2 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public void cfr_renamed_18086(sprruo sprruo2) {
        void arg0;
        void v0 = arg0;
        v0.cfr_renamed_15085(this.cfr_renamed_4 & 0xFFFF);
        v0.cfr_renamed_14639(this.cfr_renamed_2.length);
        arg0.cfr_renamed_12761(this.cfr_renamed_1);
    }

    @sprtea
    public static sprmto cfr_renamed_18476(sprmzo arg0, int arg1) {
        int n;
        sprmto sprmto2 = new sprmto();
        sprmzo sprmzo2 = arg0;
        sprmto sprmto3 = sprmto2;
        sprmto2.cfr_renamed_3 = arg1;
        sprmto3.cfr_renamed_4 = arg0.cfr_renamed_13218();
        int n2 = sprmzo2.cfr_renamed_12254();
        sprmto3.cfr_renamed_1 = sprmzo2.cfr_renamed_12261();
        if (n2 < 0 || sprmto2.cfr_renamed_1 < spruqo.cfr_renamed_18581(arg1)) {
            throw new IllegalStateException(sprudz.cfr_renamed_9("rcTxW}H\u007fShC-OiJu\u0007yFoKh\u0007kH\u007fJlS#"));
        }
        sprmto2.cfr_renamed_2 = new spruqo[n2];
        int n3 = n = 0;
        while (n3 < n2) {
            sprmto2.cfr_renamed_2[n++] = spruqo.cfr_renamed_18583(arg0, arg1, sprmto2.cfr_renamed_1);
            n3 = n;
        }
        return sprmto2;
    }
}

