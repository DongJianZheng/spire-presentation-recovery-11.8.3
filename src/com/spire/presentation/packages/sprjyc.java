/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprduc;
import com.spire.presentation.packages.sprlhz;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzsc;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class sprjyc {
    public short cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3;
        int cfr_ignored_0 = 1 << 3 ^ 1;
        int n4 = n2;
        int n5 = 1 << 3 ^ 5;
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

    public static sprjyc cfr_renamed_2661(InputStream arg0) throws IOException {
        short s = sprzsc.cfr_renamed_2630(arg0);
        if (!sprduc.cfr_renamed_2963(s)) {
            throw new spryad(47);
        }
        return new sprjyc(s);
    }

    /*
     * WARNING - void declaration
     */
    public sprjyc(short s) {
        void arg0;
        if (!sprduc.cfr_renamed_2963(s)) {
            throw new IllegalArgumentException(sprlhz.cfr_renamed_9("\u001a6R?X|\u001d2N{S4I{\\{K:Q2Y{u>\\)I9X:I\u0016R?X{K:Q.X"));
        }
        this.cfr_renamed_4 = arg0;
    }

    public void cfr_renamed_2623(OutputStream arg0) throws IOException {
        sprzsc.cfr_renamed_2676(this.cfr_renamed_4, arg0);
    }

    public short cfr_renamed_3098() {
        return this.cfr_renamed_4;
    }
}

