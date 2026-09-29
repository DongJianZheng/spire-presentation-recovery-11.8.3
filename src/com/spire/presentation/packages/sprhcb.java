/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprc;
import com.spire.presentation.packages.sprcrh;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprjuaa;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprt;

public class sprhcb {
    private final sprc cfr_renamed_2;
    private final sprlc cfr_renamed_3;
    private boolean cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ 3;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 5 << 1;
        int n4 = n2;
        int n5 = 5 << 4 ^ (2 ^ 5);
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_1237() {
        if (!this.cfr_renamed_4) {
            throw new IllegalStateException(sprcrh.cfr_renamed_9("\u0003\u0018\u000b\u0017'\u001e-\u001e\b\u000e$\u0012=\u001a%\u0012\n\u0012)\u001e=\u000f\r\u0012>\u0013+\tn\u0015!\u000fn\u0012 \u0012:\u0012/\u0017'\b+\u001fn\u001d!\tn\u001e \u0018<\u0002>\u000f'\u0015)U"));
        }
        sprhcb sprhcb2 = this;
        byte[] byArray = new byte[sprhcb2.cfr_renamed_3.cfr_renamed_1218()];
        sprhcb2.cfr_renamed_3.cfr_renamed_1219(byArray, 0);
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
        if (this.cfr_renamed_4) {
            throw new IllegalStateException(sprjuaa.cfr_renamed_9(">!6.\u001a'\u0010'57\u0019+\u0000#\u0018+7+\u0014'\u000060+\u0003*\u00160S,\u001c6S+\u001d+\u0007+\u0012.\u001a1\u0016&S$\u001c0S&\u0016!\u0001;\u00036\u001a,\u0014l"));
        }
        try {
            return this.cfr_renamed_2.cfr_renamed_1214(arg0);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return byArray;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_1217(boolean bl, sprt sprt2) {
        void v0;
        sprhgb sprhgb2;
        void arg1;
        void arg0;
        this.cfr_renamed_4 = arg0;
        if (sprt2 instanceof spraed) {
            sprhgb2 = (sprhgb)((spraed)arg1).cfr_renamed_284();
            v0 = arg0;
        } else {
            sprhgb2 = (sprhgb)arg1;
            v0 = arg0;
        }
        if (v0 != false && sprhgb2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprcrh.cfr_renamed_9("> \u0018<\u0002>\u000f'\u0015)[\u001c\u001e?\u000e'\t+\bn+;\u0019\"\u0012-[\u0005\u001e7U"));
        }
        if (arg0 == false && !sprhgb2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprjuaa.cfr_renamed_9("7'\u00100\n2\u0007+\u001d%S\u0010\u00163\u0006+\u0001'\u0000b#0\u001a4\u00126\u0016b8'\nl"));
        }
        sprhcb sprhcb2 = this;
        sprhcb2.cfr_renamed_41();
        sprhcb2.cfr_renamed_2.cfr_renamed_1217((boolean)arg0, (sprt)arg1);
    }

    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_3.cfr_renamed_1197(arg0, arg1, arg2);
    }

    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_3.cfr_renamed_1221(arg0);
    }

    public void cfr_renamed_41() {
        this.cfr_renamed_3.cfr_renamed_41();
    }

    /*
     * WARNING - void declaration
     */
    public sprhcb(sprc sprc2, sprlc sprlc2) {
        void arg0;
        sprhcb sprhcb2 = this;
        sprhcb2.cfr_renamed_2 = arg0;
        sprhcb2.cfr_renamed_3 = sprlc2;
    }
}

