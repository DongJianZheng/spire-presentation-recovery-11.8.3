/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfdf;
import com.spire.presentation.packages.sprfhf;
import com.spire.presentation.packages.sproef;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprtpa;
import com.spire.presentation.packages.sprxrq;
import com.spire.presentation.packages.sprydf;
import java.security.SecureRandom;

public class sprwff {
    private int[] cfr_renamed_4;

    public byte[] cfr_renamed_91() {
        int n;
        int n2 = this.cfr_renamed_4.length;
        int n3 = sproef.cfr_renamed_872(n2 - 1);
        byte[] byArray = new byte[4 + n2 * n3];
        sprfdf.cfr_renamed_877(n2, byArray, 0);
        int n4 = n = 0;
        while (n4 < n2) {
            int n5 = this.cfr_renamed_4[n];
            int n6 = n * n3;
            sprfdf.cfr_renamed_878(n5, byArray, 4 + n6, n3);
            n4 = ++n;
        }
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprwff(int n, SecureRandom secureRandom) {
        int n2;
        int n3;
        void arg0;
        if (n <= 0) {
            throw new IllegalArgumentException(sprtpa.cfr_renamed_9("\u0012\n\r\u0005\u0017\r\u001fD\u0017\u0001\u0015\u0003\u000f\f"));
        }
        this.cfr_renamed_4 = new int[arg0];
        int[] nArray = new int[arg0];
        int n4 = n3 = 0;
        while (n4 < arg0) {
            int n5 = n3++;
            nArray[n5] = n5;
            n4 = n3;
        }
        n3 = arg0;
        int n6 = n2 = 0;
        while (n6 < arg0) {
            void arg1;
            int n7 = sprfhf.cfr_renamed_808((SecureRandom)arg1, n3);
            this.cfr_renamed_4[n2] = nArray[n7];
            nArray[n7] = nArray[--n3];
            n6 = ++n2;
        }
    }

    public int[] cfr_renamed_876() {
        return sprydf.cfr_renamed_535(this.cfr_renamed_4);
    }

    private /* synthetic */ boolean cfr_renamed_870(int[] arg0) {
        int n;
        int n2 = arg0.length;
        boolean[] blArray = new boolean[n2];
        int n3 = n = 0;
        while (n3 < n2) {
            if (arg0[n] < 0 || arg0[n] >= n2 || blArray[arg0[n]]) {
                return false;
            }
            int n4 = arg0[n];
            blArray[n4] = true;
            n3 = ++n;
        }
        return true;
    }

    public String toString() {
        int n;
        String string = new StringBuilder().insert(0, "[").append(this.cfr_renamed_4[0]).toString();
        int n2 = n = 1;
        while (n2 < this.cfr_renamed_4.length) {
            int n3 = this.cfr_renamed_4[n];
            string = new StringBuilder().insert(0, string).append(sprxrq.cfr_renamed_9("\u001bn")).append(n3).toString();
            n2 = ++n;
        }
        string = new StringBuilder().insert(0, string).append("]").toString();
        return string;
    }

    public int hashCode() {
        return sproze.cfr_renamed_552(this.cfr_renamed_4);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprwff)) {
            return false;
        }
        sprwff sprwff2 = (sprwff)arg0;
        return sprydf.cfr_renamed_874(this.cfr_renamed_4, sprwff2.cfr_renamed_4);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ 2;
        int cfr_ignored_0 = 1 << 3 ^ 5;
        int n4 = n2;
        int n5 = 3 << 3 ^ 3;
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

    public sprwff cfr_renamed_5483(sprwff arg0) {
        int n;
        if (arg0.cfr_renamed_4.length != this.cfr_renamed_4.length) {
            throw new IllegalArgumentException(sprtpa.cfr_renamed_9("\b\u001e\n\u001c\u0010\u0013D\u0016\r\b\t\u001a\u0010\u0018\f"));
        }
        sprwff sprwff2 = new sprwff(this.cfr_renamed_4.length);
        int n2 = n = this.cfr_renamed_4.length - 1;
        while (n2 >= 0) {
            int n3 = n--;
            sprwff2.cfr_renamed_4[n3] = this.cfr_renamed_4[arg0.cfr_renamed_4[n3]];
            n2 = n;
        }
        return sprwff2;
    }

    public sprwff cfr_renamed_875() {
        int n;
        sprwff sprwff2 = new sprwff(this.cfr_renamed_4.length);
        int n2 = n = this.cfr_renamed_4.length - 1;
        while (n2 >= 0) {
            sprwff2.cfr_renamed_4[this.cfr_renamed_4[n]] = n--;
            n2 = n;
        }
        return sprwff2;
    }

    /*
     * WARNING - void declaration
     */
    public sprwff(byte[] byArray) {
        int n;
        int n2;
        void arg0;
        if (byArray.length <= 4) {
            throw new IllegalArgumentException(sprxrq.cfr_renamed_9("^ A/['SnR T!S'Y)"));
        }
        void v0 = arg0;
        int n3 = sprfdf.cfr_renamed_871((byte[])v0, 0);
        if (((void)v0).length != 4 + n3 * (n2 = sproef.cfr_renamed_872(n3 - 1))) {
            throw new IllegalArgumentException(sprtpa.cfr_renamed_9("\u0012\n\r\u0005\u0017\r\u001fD\u001e\n\u0018\u000b\u001f\r\u0015\u0003"));
        }
        this.cfr_renamed_4 = new int[n3];
        int n4 = n = 0;
        while (n4 < n3) {
            int n5 = n++;
            this.cfr_renamed_4[n5] = sprfdf.cfr_renamed_873((byte[])arg0, 4 + n5 * n2, n2);
            n4 = n;
        }
        sprwff sprwff2 = this;
        if (!sprwff2.cfr_renamed_870(sprwff2.cfr_renamed_4)) {
            throw new IllegalArgumentException(sprxrq.cfr_renamed_9("^ A/['SnR T!S'Y)"));
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprwff(int n) {
        void var2_2;
        void arg0;
        if (n <= 0) {
            throw new IllegalArgumentException(sprtpa.cfr_renamed_9("\u0012\n\r\u0005\u0017\r\u001fD\u0017\u0001\u0015\u0003\u000f\f"));
        }
        this.cfr_renamed_4 = new int[arg0];
        void v0 = var2_2 = arg0 - true;
        while (v0 >= 0) {
            void v1 = var2_2--;
            this.cfr_renamed_4[v1] = v1;
            v0 = var2_2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprwff(int[] nArray) {
        void arg0;
        sprwff sprwff2 = this;
        if (!sprwff2.cfr_renamed_870(nArray)) {
            throw new IllegalArgumentException(sprxrq.cfr_renamed_9("/E<V7\u0017'DnY!CnVnG+E#B:V:^!YnA+T:X<"));
        }
        this.cfr_renamed_4 = sprydf.cfr_renamed_535((int[])arg0);
    }
}

