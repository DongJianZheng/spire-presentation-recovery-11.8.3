/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprheb;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.spryfb;

public class sprogb {
    private int cfr_renamed_93;
    private int cfr_renamed_86;
    private boolean cfr_renamed_152;
    private int cfr_renamed_112;
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private spryfb cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private int cfr_renamed_2;
    private sprlc cfr_renamed_3;
    private int cfr_renamed_4;

    private static /* synthetic */ byte[] cfr_renamed_523(byte[] arg0, int arg1) {
        byte[] byArray = new byte[arg1];
        System.arraycopy(arg0, 0, byArray, 0, arg1 < arg0.length ? arg1 : arg0.length);
        return byArray;
    }

    private /* synthetic */ void cfr_renamed_1347(spryfb arg0, byte[] arg1) {
        sprogb sprogb2 = this;
        sprogb2.cfr_renamed_3.cfr_renamed_1197(sprogb2.cfr_renamed_1, 0, this.cfr_renamed_1.length);
        sprogb sprogb3 = this;
        sprogb sprogb4 = this;
        sprogb3.cfr_renamed_1342(sprogb3.cfr_renamed_3, sprogb4.cfr_renamed_86);
        sprogb4.cfr_renamed_3.cfr_renamed_1219(arg1, 0);
        arg0.cfr_renamed_1348(arg1);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_1342(sprlc sprlc2, int n) {
        void arg1;
        void arg0;
        void v0 = arg0;
        void v1 = arg1;
        arg0.cfr_renamed_1221((byte)(arg1 >> 24));
        arg0.cfr_renamed_1221((byte)(v1 >> 16));
        v0.cfr_renamed_1221((byte)(v1 >> 8));
        v0.cfr_renamed_1221((byte)n);
    }

    public static /* synthetic */ byte[] cfr_renamed_1349(byte[] arg0, int arg1) {
        return sprogb.cfr_renamed_523(arg0, arg1);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ 1;
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ 5;
        int n4 = n2;
        int n5 = 2 << 3 ^ 5;
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
    public sprogb(byte[] byArray, sprheb sprheb2) {
        void arg0;
        void arg1;
        sprogb sprogb2 = this;
        sprogb sprogb3 = this;
        sprogb sprogb4 = this;
        void v3 = arg1;
        this.cfr_renamed_1 = arg0;
        this.cfr_renamed_93 = v3.cfr_renamed_119;
        sprogb4.cfr_renamed_112 = v3.cfr_renamed_86;
        sprogb4.cfr_renamed_4 = arg1.cfr_renamed_112;
        sprogb3.cfr_renamed_2 = 0;
        sprogb3.cfr_renamed_91 = 0;
        sprogb2.cfr_renamed_86 = 0;
        sprogb2.cfr_renamed_3 = arg1.cfr_renamed_145;
        this.cfr_renamed_119 = this.cfr_renamed_3.cfr_renamed_1218();
        this.cfr_renamed_152 = false;
    }

    public int cfr_renamed_1336() {
        Object object;
        int n;
        Object object2;
        if (!this.cfr_renamed_152) {
            sprogb sprogb2 = this;
            this.cfr_renamed_0 = new spryfb();
            object2 = new byte[this.cfr_renamed_3.cfr_renamed_1218()];
            while (sprogb2.cfr_renamed_86 < this.cfr_renamed_4) {
                sprogb sprogb3 = this;
                sprogb2 = sprogb3;
                sprogb3.cfr_renamed_1347(sprogb3.cfr_renamed_0, (byte[])object2);
                ++sprogb3.cfr_renamed_86;
            }
            sprogb sprogb4 = this;
            this.cfr_renamed_2 = this.cfr_renamed_4 * 8 * sprogb4.cfr_renamed_119;
            this.cfr_renamed_91 = sprogb4.cfr_renamed_2;
            this.cfr_renamed_152 = true;
        }
        do {
            sprogb sprogb5 = this;
            sprogb sprogb6 = this;
            sprogb5.cfr_renamed_2 += sprogb6.cfr_renamed_112;
            object2 = sprogb6.cfr_renamed_0.cfr_renamed_1350(this.cfr_renamed_91);
            if (sprogb5.cfr_renamed_91 < this.cfr_renamed_112) {
                sprogb sprogb7 = this;
                sprogb sprogb8 = this;
                n = sprogb7.cfr_renamed_112 - sprogb8.cfr_renamed_91;
                int n2 = sprogb7.cfr_renamed_86 + (n + this.cfr_renamed_119 - 1) / this.cfr_renamed_119;
                byte[] byArray = new byte[sprogb8.cfr_renamed_3.cfr_renamed_1218()];
                block2: while (true) {
                    sprogb sprogb9 = this;
                    while (sprogb9.cfr_renamed_86 < n2) {
                        sprogb sprogb10 = this;
                        sprogb10.cfr_renamed_1347((spryfb)object2, byArray);
                        ++sprogb10.cfr_renamed_86;
                        if (n <= 8 * this.cfr_renamed_119) continue block2;
                        n -= 8 * this.cfr_renamed_119;
                        sprogb9 = this;
                    }
                    break;
                }
                this.cfr_renamed_91 = 8 * this.cfr_renamed_119 - n;
                this.cfr_renamed_0 = new spryfb();
                this.cfr_renamed_0.cfr_renamed_1348(byArray);
                object = object2;
                continue;
            }
            this.cfr_renamed_91 -= this.cfr_renamed_112;
            object = object2;
        } while ((n = ((spryfb)object).cfr_renamed_1351(this.cfr_renamed_112)) >= (1 << this.cfr_renamed_112) - (1 << this.cfr_renamed_112) % this.cfr_renamed_93);
        return n % this.cfr_renamed_93;
    }
}

