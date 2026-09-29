/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprjhf;
import com.spire.presentation.packages.sprugf;

public class sprdze {
    private sprgf cfr_renamed_93;
    private int cfr_renamed_86;
    private byte[] cfr_renamed_152;
    private int cfr_renamed_112;
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private sprjhf cfr_renamed_0;
    private int cfr_renamed_1;
    private boolean cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprdze(byte[] byArray, sprugf sprugf2) {
        void arg0;
        void arg1;
        sprdze sprdze2 = this;
        sprdze sprdze3 = this;
        sprdze sprdze4 = this;
        void v3 = arg1;
        this.cfr_renamed_152 = arg0;
        this.cfr_renamed_86 = v3.cfr_renamed_119;
        sprdze4.cfr_renamed_1 = v3.cfr_renamed_1;
        sprdze4.cfr_renamed_4 = arg1.cfr_renamed_105;
        sprdze3.cfr_renamed_112 = 0;
        sprdze3.cfr_renamed_3 = 0;
        sprdze2.cfr_renamed_91 = 0;
        sprdze2.cfr_renamed_93 = arg1.cfr_renamed_2;
        this.cfr_renamed_119 = this.cfr_renamed_93.cfr_renamed_1218();
        this.cfr_renamed_2 = false;
    }

    private /* synthetic */ void cfr_renamed_5623(sprjhf arg0, byte[] arg1) {
        sprdze sprdze2 = this;
        sprdze2.cfr_renamed_93.cfr_renamed_1197(sprdze2.cfr_renamed_152, 0, this.cfr_renamed_152.length);
        sprdze sprdze3 = this;
        sprdze sprdze4 = this;
        sprdze3.cfr_renamed_5621(sprdze3.cfr_renamed_93, sprdze4.cfr_renamed_91);
        sprdze4.cfr_renamed_93.cfr_renamed_1219(arg1, 0);
        arg0.cfr_renamed_1348(arg1);
    }

    private static /* synthetic */ byte[] cfr_renamed_523(byte[] arg0, int arg1) {
        byte[] byArray = new byte[arg1];
        System.arraycopy(arg0, 0, byArray, 0, arg1 < arg0.length ? arg1 : arg0.length);
        return byArray;
    }

    public int cfr_renamed_1336() {
        Object object;
        int n;
        Object object2;
        if (!this.cfr_renamed_2) {
            sprdze sprdze2 = this;
            this.cfr_renamed_0 = new sprjhf();
            object2 = new byte[this.cfr_renamed_93.cfr_renamed_1218()];
            while (sprdze2.cfr_renamed_91 < this.cfr_renamed_4) {
                sprdze sprdze3 = this;
                sprdze2 = sprdze3;
                sprdze3.cfr_renamed_5623(sprdze3.cfr_renamed_0, (byte[])object2);
                ++sprdze3.cfr_renamed_91;
            }
            sprdze sprdze4 = this;
            this.cfr_renamed_112 = this.cfr_renamed_4 * 8 * sprdze4.cfr_renamed_119;
            this.cfr_renamed_3 = sprdze4.cfr_renamed_112;
            this.cfr_renamed_2 = true;
        }
        do {
            sprdze sprdze5 = this;
            sprdze sprdze6 = this;
            sprdze5.cfr_renamed_112 += sprdze6.cfr_renamed_1;
            object2 = sprdze6.cfr_renamed_0.cfr_renamed_1350(this.cfr_renamed_3);
            if (sprdze5.cfr_renamed_3 < this.cfr_renamed_1) {
                sprdze sprdze7 = this;
                sprdze sprdze8 = this;
                n = sprdze7.cfr_renamed_1 - sprdze8.cfr_renamed_3;
                int n2 = sprdze7.cfr_renamed_91 + (n + this.cfr_renamed_119 - 1) / this.cfr_renamed_119;
                byte[] byArray = new byte[sprdze8.cfr_renamed_93.cfr_renamed_1218()];
                block2: while (true) {
                    sprdze sprdze9 = this;
                    while (sprdze9.cfr_renamed_91 < n2) {
                        sprdze sprdze10 = this;
                        sprdze10.cfr_renamed_5623((sprjhf)object2, byArray);
                        ++sprdze10.cfr_renamed_91;
                        if (n <= 8 * this.cfr_renamed_119) continue block2;
                        n -= 8 * this.cfr_renamed_119;
                        sprdze9 = this;
                    }
                    break;
                }
                this.cfr_renamed_3 = 8 * this.cfr_renamed_119 - n;
                this.cfr_renamed_0 = new sprjhf();
                this.cfr_renamed_0.cfr_renamed_1348(byArray);
                object = object2;
                continue;
            }
            this.cfr_renamed_3 -= this.cfr_renamed_1;
            object = object2;
        } while ((n = ((sprjhf)object).cfr_renamed_1351(this.cfr_renamed_1)) >= (1 << this.cfr_renamed_1) - (1 << this.cfr_renamed_1) % this.cfr_renamed_86);
        return n % this.cfr_renamed_86;
    }

    public static /* synthetic */ byte[] cfr_renamed_1349(byte[] arg0, int arg1) {
        return sprdze.cfr_renamed_523(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5621(sprgf sprgf2, int n) {
        void arg1;
        void arg0;
        void v0 = arg0;
        void v1 = arg1;
        arg0.cfr_renamed_1221((byte)(arg1 >> 24));
        arg0.cfr_renamed_1221((byte)(v1 >> 16));
        v0.cfr_renamed_1221((byte)(v1 >> 8));
        v0.cfr_renamed_1221((byte)n);
    }
}

