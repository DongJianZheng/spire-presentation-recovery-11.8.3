/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.DocumentEditException;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprgpa;
import com.spire.presentation.packages.sproze;

public class sprfrk
implements sprbj {
    private byte[] cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private static final int cfr_renamed_4 = 32;

    public void cfr_renamed_9997() {
        sproze.cfr_renamed_492(this.cfr_renamed_3, (byte)0);
    }

    public byte[] cfr_renamed_2820() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }

    public static sprfrk cfr_renamed_9998(byte[] arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException(DocumentEditException.cfr_renamed_9("b\b]\u0007G\u000fOFH\tE\u0012N\u001e_"));
        }
        new sprfrk().cfr_renamed_2 = sproze.cfr_renamed_158(arg0);
        return new sprfrk();
    }

    public byte[] cfr_renamed_1521() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    public static sprfrk cfr_renamed_9999(byte[] arg0) {
        if (arg0 == null || arg0.length != 32) {
            throw new IllegalArgumentException(sprgpa.cfr_renamed_9("\u0016M)B3J;\u00034F&o:M8W7"));
        }
        new sprfrk().cfr_renamed_3 = sproze.cfr_renamed_158(arg0);
        return new sprfrk();
    }
}

