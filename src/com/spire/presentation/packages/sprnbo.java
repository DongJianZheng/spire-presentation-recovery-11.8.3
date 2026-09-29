/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjyy;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.pdf.security.PdfSecurity;

@sprtea
public final class sprnbo {
    public static final byte cfr_renamed_0 = 3;
    public static final int cfr_renamed_1 = 4;
    public static final byte cfr_renamed_2 = 2;
    public static final byte cfr_renamed_3 = 0;
    public static final byte cfr_renamed_4 = 1;

    public static byte cfr_renamed_5644(String arg0) {
        if (PdfSecurity.cfr_renamed_9("\"%\u000e\u0013\u0012").equals(arg0)) {
            return 0;
        }
        if (sprjyy.cfr_renamed_9("\u0004\u000b.=2").equals(arg0)) {
            return 1;
        }
        if (PdfSecurity.cfr_renamed_9("2>\t\u0003VA").equals(arg0)) {
            return 2;
        }
        if (sprjyy.cfr_renamed_9("\u001a\u001e'#xa").equals(arg0)) {
            return 3;
        }
        throw new IllegalArgumentException(PdfSecurity.cfr_renamed_9("2\u0019\f\u0019\b\u0000\tW#\u0016\u0013\u00163\u000e\u0017\u0012G\u0019\u0006\u001a\u0002Y"));
    }

    public static byte[] cfr_renamed_205() {
        byte[] byArray = new byte[4];
        byArray[0] = 0;
        byArray[1] = 1;
        byArray[2] = 2;
        byArray[3] = 3;
        return byArray;
    }

    public static String cfr_renamed_12049(byte arg0) {
        if (0 == arg0) {
            return sprjyy.cfr_renamed_9("\u0002\u000b.=2");
        }
        if (1 == arg0) {
            return PdfSecurity.cfr_renamed_9("$%\u000e\u0013\u0012");
        }
        if (2 == arg0) {
            return sprjyy.cfr_renamed_9("\u001c\u001e'#xa");
        }
        if (3 == arg0) {
            return PdfSecurity.cfr_renamed_9("4>\t\u0003VA");
        }
        return sprjyy.cfr_renamed_9("\u0002'<'8>9i\u0013(#(\u00030',w?6%\",y");
    }

    private /* synthetic */ sprnbo() {
    }

    public static String cfr_renamed_12048(byte arg0) {
        if (0 == arg0) {
            return PdfSecurity.cfr_renamed_9("\"%\u000e\u0013\u0012");
        }
        if (1 == arg0) {
            return sprjyy.cfr_renamed_9("\u0004\u000b.=2");
        }
        if (2 == arg0) {
            return PdfSecurity.cfr_renamed_9("2>\t\u0003VA");
        }
        if (3 == arg0) {
            return sprjyy.cfr_renamed_9("\u001a\u001e'#xa");
        }
        return PdfSecurity.cfr_renamed_9("\"\t\u001c\t\u0018\u0010\u0019G3\u0006\u0003\u0006#\u001e\u0007\u0002W\u0011\u0016\u000b\u0002\u0002Y");
    }
}

