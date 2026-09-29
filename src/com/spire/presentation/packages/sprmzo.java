/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sproup;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprujo;

@sprtea
public class sprmzo {
    private sprujo cfr_renamed_4;

    public long cfr_renamed_17453() {
        return sproup.cfr_renamed_17449(this.cfr_renamed_4.cfr_renamed_17453());
    }

    public spreen cfr_renamed_14060() {
        return this.cfr_renamed_4.cfr_renamed_14060();
    }

    public int cfr_renamed_12261() {
        return sproup.cfr_renamed_17447(this.cfr_renamed_4.cfr_renamed_12261());
    }

    public byte cfr_renamed_12137() {
        return this.cfr_renamed_4.cfr_renamed_12137();
    }

    public byte[] cfr_renamed_16065(int arg0) {
        return this.cfr_renamed_4.cfr_renamed_16065(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprmzo(spreen spreen2) {
        void arg0;
        sprmzo sprmzo2 = this;
        sprmzo2.cfr_renamed_4 = new sprujo((spreen)arg0);
    }

    public long cfr_renamed_13220() {
        return sproup.cfr_renamed_17452(this.cfr_renamed_4.cfr_renamed_13220());
    }

    public int cfr_renamed_13218() {
        return sproup.cfr_renamed_17450(this.cfr_renamed_4.cfr_renamed_13218());
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ 4 << 1;
        int cfr_ignored_0 = 4 << 4 ^ 3 << 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 3 ^ 4;
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

    public boolean cfr_renamed_17454() {
        return this.cfr_renamed_14060().cfr_renamed_3274() == this.cfr_renamed_14060().cfr_renamed_806() - 1L;
    }

    public short cfr_renamed_12254() {
        return sproup.cfr_renamed_17451(this.cfr_renamed_4.cfr_renamed_12254());
    }

    public byte cfr_renamed_17455() {
        return this.cfr_renamed_4.cfr_renamed_17455();
    }

    public int cfr_renamed_11556(byte[] arg0, int arg1, int arg2) {
        return this.cfr_renamed_4.cfr_renamed_11556(arg0, arg1, arg2);
    }

    public int cfr_renamed_17456() {
        int n;
        byte[] byArray = this.cfr_renamed_4.cfr_renamed_16065(3);
        int n2 = 0;
        int n3 = 1;
        int n4 = n = 2;
        while (n4 >= 0) {
            n2 += (byArray[n] & 0xFF) * n3;
            n3 <<= 8;
            n4 = --n;
        }
        return n2;
    }

    public char[] cfr_renamed_13221(int arg0) {
        int n;
        char[] cArray = new char[arg0];
        int n2 = n = 0;
        while (n2 < cArray.length) {
            cArray[n++] = (char)(this.cfr_renamed_4.cfr_renamed_12137() & 0xFF);
            n2 = n;
        }
        return cArray;
    }
}

