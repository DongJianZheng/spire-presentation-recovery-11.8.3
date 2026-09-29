/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprzzz;

@sprtea
public class sprlqo {
    private int cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    public void cfr_renamed_6601(int n) {
        sprlqo sprlqo2 = this;
        sprlqo2.cfr_renamed_2947();
        sprlqo2.cfr_renamed_17430();
        sprlqo2.cfr_renamed_3 = n;
    }

    private /* synthetic */ boolean cfr_renamed_17431() {
        return this.cfr_renamed_1 == 1;
    }

    public void cfr_renamed_14896() {
        if (this.cfr_renamed_17431()) {
            sprlqo sprlqo2 = this;
            sprlqo2.cfr_renamed_17432();
            sprlqo2.cfr_renamed_6601(sprlqo2.cfr_renamed_17433() + 1);
            return;
        }
        this.cfr_renamed_1 >>= 1;
    }

    private /* synthetic */ void cfr_renamed_17430() {
        sprlqo sprlqo2 = this;
        sprlqo2.cfr_renamed_1 = 128;
        sprlqo2.cfr_renamed_4 = 0;
    }

    private /* synthetic */ void cfr_renamed_17432() {
        this.cfr_renamed_2[this.cfr_renamed_17433()] = (byte)this.cfr_renamed_4;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void cfr_renamed_17434(String arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length()) {
            switch (arg0.charAt(n)) {
                case '0': {
                    this.cfr_renamed_14896();
                    break;
                }
                case '1': {
                    sprlqo sprlqo2 = this;
                    sprlqo2.cfr_renamed_14895();
                    sprlqo2.cfr_renamed_14896();
                    break;
                }
                default: {
                    throw new IllegalArgumentException(sprzzz.cfr_renamed_9("\u000f\u000f-\u000f2\u000b+\u000b-N1\u000f2\u000beN=\u0007+=+\u001c6\u00008N<\u00011\u001a>\u00071\u001d\u007f\u001d&\u0003=\u00013\u001d\u007f\u0001+\u0006:\u001c\u007f\u001a7\u000f1NoN0\u001c\u007f_q"));
                }
            }
            n2 = ++n;
        }
        return;
    }

    public void cfr_renamed_2947() {
        if (this.cfr_renamed_1 != 128) {
            sprlqo sprlqo2 = this;
            if (sprlqo2.cfr_renamed_3 < sprlqo2.cfr_renamed_2.length) {
                this.cfr_renamed_17432();
            }
        }
    }

    public void cfr_renamed_14895() {
        this.cfr_renamed_4 += (byte)this.cfr_renamed_1 & 0xFF;
    }

    public int cfr_renamed_17433() {
        return this.cfr_renamed_3;
    }

    public sprlqo(byte[] byArray) {
        sprlqo sprlqo2 = this;
        sprlqo2.cfr_renamed_2 = byArray;
        sprlqo2.cfr_renamed_17430();
    }
}

