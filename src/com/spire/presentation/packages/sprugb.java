/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprc;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprjmb;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprrhq;
import com.spire.presentation.packages.sprt;

public class sprugb {
    private final sprc cfr_renamed_2;
    private boolean cfr_renamed_3;
    private final sprlc cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 5 << 1;
        int n4 = n2;
        int n5 = 1 << 3 ^ (3 ^ 5);
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprugb(sprc sprc2, sprlc sprlc2) {
        void arg0;
        sprugb sprugb2 = this;
        sprugb2.cfr_renamed_2 = arg0;
        sprugb2.cfr_renamed_4 = sprlc2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_1237() {
        if (!this.cfr_renamed_3) {
            throw new IllegalStateException(sprrhq.cfr_renamed_9("*,\"#\u000e*\u0004*7 \u000e!\u0013,\u000f*\u0011.\u000b\u000b\u000e(\u0002<\u0013\f\u000e?\u000f*\u0015o\t \u0013o\u000e!\u000e;\u000e.\u000b&\u0014*\u0003o\u0001 \u0015o\u0002!\u0004=\u001e?\u0013&\t(I"));
        }
        sprugb sprugb2 = this;
        byte[] byArray = new byte[sprugb2.cfr_renamed_4.cfr_renamed_1218()];
        sprugb2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        byte[] byArray2 = null;
        try {
            return this.cfr_renamed_2.cfr_renamed_136(byArray);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return byArray2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_1214(byte[] arg0) {
        byte[] byArray = null;
        if (this.cfr_renamed_3) {
            throw new IllegalStateException(sprjmb.cfr_renamed_9(")\u001a!\u0015\r\u001c\u0007\u001c4\u0016\r\u0017\u0010\u001a\f\u001c\u0012\u0018\b=\r\u001e\u0001\n\u0010:\r\t\f\u001c\u0016Y\n\u0016\u0010Y\r\u0017\r\r\r\u0018\b\u0010\u0017\u001c\u0000Y\u0002\u0016\u0016Y\u0000\u001c\u0007\u000b\u001d\t\u0010\u0010\n\u001eJ"));
        }
        try {
            return this.cfr_renamed_2.cfr_renamed_1214(arg0);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return byArray;
        }
    }

    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_4.cfr_renamed_1221(arg0);
    }

    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_1217(boolean bl, sprt sprt2) {
        void v0;
        sprhgb sprhgb2;
        void arg1;
        void arg0;
        this.cfr_renamed_3 = arg0;
        if (sprt2 instanceof spraed) {
            sprhgb2 = (sprhgb)((spraed)arg1).cfr_renamed_284();
            v0 = arg0;
        } else {
            sprhgb2 = (sprhgb)arg1;
            v0 = arg0;
        }
        if (v0 != false && sprhgb2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprrhq.cfr_renamed_9("\"!\u0004=\u001e?\u0013&\t(G\u001d\u0002>\u0012&\u0015*\u0014o7:\u0005#\u000e,G\u0004\u00026I"));
        }
        if (arg0 == false && !sprhgb2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprjmb.cfr_renamed_9("=\u0001\u001a\u0016\u0000\u0014\r\r\u0017\u0003Y6\u001c\u0015\f\r\u000b\u0001\nD)\u0016\u0010\u0012\u0018\u0010\u001cD2\u0001\u0000J"));
        }
        sprugb sprugb2 = this;
        sprugb2.cfr_renamed_41();
        sprugb2.cfr_renamed_2.cfr_renamed_1217((boolean)arg0, (sprt)arg1);
    }

    public void cfr_renamed_41() {
        this.cfr_renamed_4.cfr_renamed_41();
    }
}

