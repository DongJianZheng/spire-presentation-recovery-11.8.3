/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprntc;
import com.spire.presentation.packages.sprnuia;
import com.spire.presentation.packages.sprqtha;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzsc;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class sprevc {
    public Object cfr_renamed_3;
    public short cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprevc(short s, Object object) {
        void arg0;
        void arg1;
        if (!sprevc.cfr_renamed_3074(s, arg1)) {
            throw new IllegalArgumentException(sprqtha.cfr_renamed_9(" &b%r1t  tn'':h '5itn:t f:d1';ats<btd;u&b7sts-w1"));
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_3 = arg1;
    }

    public short cfr_renamed_3258() {
        return this.cfr_renamed_4;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean cfr_renamed_3074(short arg0, Object arg1) {
        switch (arg0) {
            case 1: {
                return arg1 instanceof sprntc;
            }
        }
        throw new IllegalArgumentException(sprnuia.cfr_renamed_9("0DcVcBdcnGr\u00107^d\u0017vY7ByDbGgXeCrS7Av[bR"));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3;
        int cfr_ignored_0 = 5 << 4 ^ (3 ^ 5) << 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 5 << 1;
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

    public sprntc cfr_renamed_3259() {
        if (!sprevc.cfr_renamed_3074((short)1, this.cfr_renamed_3)) {
            throw new IllegalStateException(sprqtha.cfr_renamed_9("su1v!b'ss'=tti;stf:'\u001bD\u0007W\u0007s5s!t\u0006b%r1t "));
        }
        return (sprntc)this.cfr_renamed_3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void cfr_renamed_2623(OutputStream arg0) throws IOException {
        sprevc sprevc2 = this;
        sprzsc.cfr_renamed_2676(sprevc2.cfr_renamed_4, arg0);
        switch (sprevc2.cfr_renamed_4) {
            case 1: {
                ((sprntc)this.cfr_renamed_3).cfr_renamed_2623(arg0);
                return;
            }
        }
        throw new spryad(80);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static sprevc cfr_renamed_2661(InputStream arg0) throws IOException {
        short s = sprzsc.cfr_renamed_2630(arg0);
        switch (s) {
            case 1: {
                sprntc sprntc2 = sprntc.cfr_renamed_2661(arg0);
                return new sprevc(s, sprntc2);
            }
        }
        throw new spryad(50);
    }

    public Object cfr_renamed_3260() {
        return this.cfr_renamed_3;
    }
}

