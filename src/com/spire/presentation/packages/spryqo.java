/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralo;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprfgja;
import com.spire.presentation.packages.sproup;
import com.spire.presentation.packages.sprrica;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtzja;
import com.spire.presentation.packages.sprzto;

@sprtea
public class spryqo
extends sprzto {
    private sprfgja cfr_renamed_4;

    public void cfr_renamed_17435(int arg0, int arg1) {
        if (arg1 == 0) {
            return;
        }
        if (arg1 < 0 || arg1 > 31) {
            throw new IllegalArgumentException(sprrica.cfr_renamed_9("r<P<O8V8P}L<O8\u0018}L(O?G/m;`4V.d/M0p4E5V"));
        }
        byte[] byArray = sprtzja.cfr_renamed_12109(arg0);
        int n = (arg1 - 1) / 8;
        int n2 = arg1 - n * 8;
        this.cfr_renamed_17436(byArray[n], n2);
        int n3 = --n;
        while (n3 >= 0) {
            this.cfr_renamed_17436(byArray[n], 8);
            n3 = --n;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_17437(boolean bl) {
        void arg0;
        this.cfr_renamed_3 = (byte)sproup.cfr_renamed_17438(this.cfr_renamed_3 & 0xFF, this.cfr_renamed_17439() & 0xFF, (boolean)arg0);
    }

    public void cfr_renamed_17436(byte arg0, int arg1) {
        int n;
        if (arg1 == 0) {
            return;
        }
        if (arg1 < 0 || arg1 > 8) {
            throw new IllegalArgumentException(spralo.cfr_renamed_9("9R\u001bR\u0004V\u001dV\u001b\u0013\u0007R\u0004VS\u0013\u0007F\u0004Q\fA&U+Z\u001d@/A\u0006^;Z\u000e[\u001d"));
        }
        int n2 = 1 << arg1 - 1;
        int n3 = n = 0;
        while (n3 < arg1) {
            boolean bl = (arg0 & 0xFF & n2) != 0;
            this.cfr_renamed_14916(bl);
            n2 >>= 1;
            n3 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_17440() {
        spryqo spryqo2 = this;
        this.cfr_renamed_4.cfr_renamed_11594(spryqo2.cfr_renamed_3);
        spryqo2.cfr_renamed_4.cfr_renamed_2947();
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public spryqo(spreen spreen2, boolean bl) {
        super(bl);
        void arg0;
        spryqo spryqo2 = this;
        spryqo2.cfr_renamed_4 = new sprfgja((spreen)arg0);
    }

    public void cfr_renamed_14916(boolean arg0) {
        spryqo spryqo2 = this;
        spryqo2.cfr_renamed_17437(arg0);
        ++spryqo2.cfr_renamed_2;
        if (spryqo2.cfr_renamed_2 < 8) {
            return;
        }
        spryqo spryqo3 = this;
        spryqo3.cfr_renamed_17440();
        spryqo3.cfr_renamed_17441();
    }

    @sprtea
    public void cfr_renamed_2947() {
        if (this.cfr_renamed_2 < 1) {
            return;
        }
        this.cfr_renamed_17440();
    }
}

