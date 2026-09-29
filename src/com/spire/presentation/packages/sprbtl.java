/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprtpl;
import java.io.IOException;

public class sprbtl {
    public static final int cfr_renamed_86 = 0;
    public static final int cfr_renamed_152 = 2;
    private final String cfr_renamed_112;
    public static final int cfr_renamed_119 = 3;
    private final byte[] cfr_renamed_91;
    public static final int cfr_renamed_0 = 2;
    public static final int cfr_renamed_1 = 0;
    private final sprtpl cfr_renamed_2;
    public static final int cfr_renamed_3 = 1;
    public static final int cfr_renamed_4 = 1;

    public static boolean cfr_renamed_10942(byte[] arg0) {
        return (arg0[0] >= 0 || arg0[0] <= 3) && arg0[1] == 0 && arg0[2] == 0;
    }

    /*
     * WARNING - void declaration
     */
    public sprbtl(String string, byte[] byArray, sprtpl sprtpl2) {
        void arg0;
        void arg1;
        sprbtl sprbtl2 = this;
        this.cfr_renamed_91 = arg1;
        sprbtl2.cfr_renamed_112 = arg0;
        sprbtl2.cfr_renamed_2 = sprtpl2;
    }

    public String cfr_renamed_10944() {
        return this.cfr_renamed_112;
    }

    public sprbtl(String arg0, byte[] arg1) throws IOException {
        this(arg0, sproze.cfr_renamed_533(arg1, 0, 3), new sprtpl(sproze.cfr_renamed_533(arg1, 3, arg1.length)));
    }

    public byte[] cfr_renamed_4690() {
        return sproze.cfr_renamed_158(this.cfr_renamed_91);
    }

    public sprtpl cfr_renamed_2141() {
        return this.cfr_renamed_2;
    }

    public byte[] cfr_renamed_10949() throws IOException {
        sprbtl sprbtl2 = this;
        byte[] byArray = sprbtl2.cfr_renamed_2.cfr_renamed_91();
        byte[] byArray2 = new byte[sprbtl2.cfr_renamed_91.length + byArray.length];
        System.arraycopy(this.cfr_renamed_91, 0, byArray2, 0, this.cfr_renamed_91.length);
        System.arraycopy(byArray, 0, byArray2, this.cfr_renamed_91.length, byArray.length);
        return byArray2;
    }
}

