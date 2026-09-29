/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprktl;
import com.spire.presentation.packages.sprlem;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprhql {
    private static final int cfr_renamed_2 = 32768;
    public InputStream cfr_renamed_3;
    private final sprlem cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprhql(sprlem sprlem2, InputStream inputStream, int n) {
        void arg2;
        void arg1;
        this.cfr_renamed_4 = sprlem2;
        sprhql sprhql2 = this;
        this.cfr_renamed_3 = new sprktl(new BufferedInputStream((InputStream)arg1, (int)arg2));
    }

    public void cfr_renamed_4117() throws IOException {
        sprhql sprhql2 = this;
        sprkqe.cfr_renamed_477(sprhql2.cfr_renamed_3);
        sprhql2.cfr_renamed_3.close();
    }

    public sprhql(sprlem sprlem2) {
        this.cfr_renamed_4 = sprlem2;
    }

    public sprlem cfr_renamed_696() {
        return this.cfr_renamed_4;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5;
        int cfr_ignored_0 = 4 << 3;
        int n4 = n2;
        int n5 = 4 << 3 ^ (2 ^ 5);
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
    public sprhql(String string, InputStream inputStream) {
        this(new sprlem((String)arg0), (InputStream)arg1, 32768);
        void arg1;
        void arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprhql(String string, InputStream inputStream, int n) {
        this(new sprlem((String)arg0), (InputStream)arg1, (int)arg2);
        void arg2;
        void arg1;
        void arg0;
    }

    public sprhql(InputStream arg0) {
        this(sprdl.cfr_renamed_287.cfr_renamed_19(), arg0, 32768);
    }

    public sprhql(sprlem arg0, InputStream arg1) {
        this(arg0, arg1, 32768);
    }

    public InputStream cfr_renamed_4004() {
        return this.cfr_renamed_3;
    }
}

