/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdsp;
import com.spire.presentation.packages.spromp;
import com.spire.presentation.packages.sprsfp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtqo;

@sprtea
public class spraxo {
    private sprdsp cfr_renamed_3;
    private spromp cfr_renamed_4;

    private /* synthetic */ int cfr_renamed_15044(byte[] arg0, sprtqo arg1) {
        return spraxo.cfr_renamed_15045(this.cfr_renamed_15043(arg0), arg1);
    }

    public Object cfr_renamed_13485(int arg0) {
        return this.cfr_renamed_3.cfr_renamed_13485(arg0);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = 4 << 4;
        int n4 = n2;
        int n5 = 5 << 4 ^ 5;
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

    public spraxo() {
        spraxo spraxo2 = this;
        this.cfr_renamed_4 = new spromp();
        spraxo2.cfr_renamed_3 = new sprdsp();
    }

    public boolean cfr_renamed_13889(byte[] arg0, sprtqo arg1) {
        return this.cfr_renamed_3.cfr_renamed_14000(this.cfr_renamed_15044(arg0, arg1));
    }

    public void cfr_renamed_13502(byte[] arg0, sprtqo arg1, Object arg2) {
        this.cfr_renamed_3.cfr_renamed_12962(this.cfr_renamed_15044(arg0, arg1), arg2);
    }

    private static /* synthetic */ int cfr_renamed_15045(int arg0, sprtqo arg1) {
        int n = arg1 != null && arg1.cfr_renamed_14231() ? arg1.hashCode() : 0;
        return arg0 * 397 ^ n;
    }

    private static /* synthetic */ int cfr_renamed_15041(byte[] arg0) {
        return sprsfp.cfr_renamed_15042(arg0).hashCode();
    }

    public Object cfr_renamed_13501(byte[] arg0, sprtqo arg1) {
        return this.cfr_renamed_3.cfr_renamed_576(this.cfr_renamed_15044(arg0, arg1));
    }

    private /* synthetic */ int cfr_renamed_15043(byte[] arg0) {
        int n;
        if (this.cfr_renamed_4.cfr_renamed_12143(arg0)) {
            return this.cfr_renamed_4.cfr_renamed_18016(arg0);
        }
        int n2 = n = spraxo.cfr_renamed_15041(arg0);
        this.cfr_renamed_4.cfr_renamed_18017(arg0, n2);
        return n2;
    }

    public int cfr_renamed_11861() {
        return this.cfr_renamed_3.cfr_renamed_11861();
    }
}

