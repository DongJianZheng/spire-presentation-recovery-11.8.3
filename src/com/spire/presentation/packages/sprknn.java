/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprknn {
    private static final int cfr_renamed_86 = 33;
    private byte[] cfr_renamed_152;
    private static final String cfr_renamed_112 = "<~";
    private boolean cfr_renamed_119;
    private boolean cfr_renamed_91;
    private long cfr_renamed_0;
    private static final String cfr_renamed_1 = "~>";
    private static final int cfr_renamed_2 = 75;
    private int cfr_renamed_3;
    private byte[] cfr_renamed_4;

    @sprtea
    public static String cfr_renamed_14087(byte[] arg0, boolean arg1, boolean arg2) {
        return new sprknn(arg1, arg2).cfr_renamed_485(arg0);
    }

    private /* synthetic */ void cfr_renamed_14158(int arg0, StringBuilder arg1) {
        int n;
        int n2 = n = this.cfr_renamed_152.length - 1;
        while (n2 >= 0) {
            sprknn sprknn2 = this;
            this.cfr_renamed_152[n] = (byte)((sprknn2.cfr_renamed_0 & 0xFFFFFFFFL) % 85L + 33L);
            this.cfr_renamed_0 = (sprknn2.cfr_renamed_0 & 0xFFFFFFFFL) / 85L;
            n2 = --n;
        }
        int n3 = n = 0;
        while (n3 < arg0) {
            sprknn sprknn3 = this;
            byte by = sprknn3.cfr_renamed_152[n];
            sprknn3.cfr_renamed_14159(arg1, (char)(by & 0xFF));
            n3 = ++n;
        }
    }

    private /* synthetic */ String cfr_renamed_485(byte[] arg0) {
        int n;
        StringBuilder stringBuilder = new StringBuilder(arg0.length * (this.cfr_renamed_152.length / this.cfr_renamed_4.length));
        this.cfr_renamed_3 = 0;
        if (this.cfr_renamed_91) {
            this.cfr_renamed_14160(stringBuilder, cfr_renamed_112);
        }
        int n2 = 0;
        this.cfr_renamed_0 = 0L;
        byte[] byArray = arg0;
        int n3 = arg0.length;
        int n4 = n = 0;
        while (n4 < n3) {
            byte by = byArray[n];
            if (n2 >= this.cfr_renamed_4.length - 1) {
                sprknn sprknn2;
                sprknn sprknn3 = this;
                sprknn3.cfr_renamed_0 |= (long)(by & 0xFF);
                if ((sprknn3.cfr_renamed_0 & 0xFFFFFFFFL) == 0L) {
                    sprknn sprknn4 = this;
                    sprknn2 = sprknn4;
                    sprknn4.cfr_renamed_14159(stringBuilder, 'z');
                } else {
                    sprknn sprknn5 = this;
                    sprknn2 = sprknn5;
                    sprknn5.cfr_renamed_14161(stringBuilder);
                }
                sprknn2.cfr_renamed_0 = 0L;
                n2 = 0;
            } else {
                int n5 = (by & 0xFF) << 24 - n2 * 8;
                ++n2;
                this.cfr_renamed_0 |= (long)n5;
            }
            n4 = ++n;
        }
        if (n2 > 0) {
            this.cfr_renamed_14158(n2 + 1, stringBuilder);
        }
        if (this.cfr_renamed_119) {
            this.cfr_renamed_14160(stringBuilder, cfr_renamed_1);
        }
        return stringBuilder.toString();
    }

    private /* synthetic */ void cfr_renamed_14159(StringBuilder arg0, char arg1) {
        sprknn sprknn2 = this;
        arg0.append(arg1);
        ++sprknn2.cfr_renamed_3;
        if (sprknn2.cfr_renamed_3 >= 75) {
            this.cfr_renamed_3 = 0;
            sprghha.cfr_renamed_12279(arg0, "\r\n");
        }
    }

    private /* synthetic */ void cfr_renamed_14160(StringBuilder arg0, String arg1) {
        StringBuilder stringBuilder;
        if (this.cfr_renamed_3 + arg1.length() > 75) {
            StringBuilder stringBuilder2 = arg0;
            stringBuilder = stringBuilder2;
            this.cfr_renamed_3 = 0;
            sprghha.cfr_renamed_12279(stringBuilder2, "\r\n");
        } else {
            this.cfr_renamed_3 += arg1.length();
            stringBuilder = arg0;
        }
        sprghha.cfr_renamed_12279(stringBuilder, arg1);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprknn(boolean bl, boolean bl2) {
        void arg0;
        sprknn sprknn2 = this;
        sprknn sprknn3 = this;
        sprknn3.cfr_renamed_152 = new byte[5];
        sprknn3.cfr_renamed_4 = new byte[4];
        sprknn2.cfr_renamed_91 = arg0;
        sprknn2.cfr_renamed_119 = bl2;
    }

    private /* synthetic */ void cfr_renamed_14161(StringBuilder arg0) {
        sprknn sprknn2 = this;
        sprknn2.cfr_renamed_14158(sprknn2.cfr_renamed_152.length, arg0);
    }
}

