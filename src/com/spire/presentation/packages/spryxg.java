/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgxg;
import com.spire.presentation.packages.sprsm;
import com.spire.presentation.packages.sprysg;
import com.spire.presentation.packages.sprzgp;
import com.spire.presentation.packages.sprzvg;
import java.security.SecureRandom;

public class spryxg {
    private sprsm cfr_renamed_1;
    private int cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private int cfr_renamed_4;

    public spryxg cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = 1 << 3 ^ 2;
        int n4 = n2;
        int n5 = 5 << 4 ^ (3 ^ 5) << 1;
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
    public spryxg(int n, sprsm sprsm2, int n2) {
        void arg2;
        void arg1;
        void arg0;
        spryxg spryxg2 = this;
        this.cfr_renamed_2 = 96;
        spryxg2.cfr_renamed_4 = arg0;
        spryxg2.cfr_renamed_1 = arg1;
        if (n2 < 0 || arg2 > 255) {
            throw new IllegalArgumentException(sprzgp.cfr_renamed_9("K\u0019shW^V_\u0018]YGMN\u0018DM_KB\\N\u0018D^\u000bJJVL]\u000b\b\u000bLD\u0018\u0019\r\u001e\u0016"));
        }
        this.cfr_renamed_2 = arg2;
    }

    public spryxg(int arg0) {
        this(arg0, new sprzvg());
    }

    public spryxg(int arg0, int arg1) {
        this(arg0, new sprzvg(), arg1);
    }

    public sprysg cfr_renamed_1480(char[] arg0) {
        if (this.cfr_renamed_3 == null) {
            spryxg spryxg2 = this;
            spryxg2.cfr_renamed_3 = new SecureRandom();
        }
        spryxg spryxg3 = this;
        spryxg spryxg4 = this;
        return new sprgxg(spryxg4, spryxg3.cfr_renamed_4, spryxg3.cfr_renamed_1, spryxg4.cfr_renamed_2, this.cfr_renamed_3, arg0);
    }

    public spryxg(int arg0, sprsm arg1) {
        this(arg0, arg1, 96);
    }
}

