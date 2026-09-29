/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhfg;
import com.spire.presentation.packages.sprjuf;
import com.spire.presentation.packages.sprlag;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.spruvf;

public class sprdng {
    private sprhfg cfr_renamed_86;
    private int cfr_renamed_152;
    private sprlag cfr_renamed_112;
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    public final int cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    public void cfr_renamed_7021(spruvf[] arg0, byte[] arg1, boolean arg2) {
        int n;
        sprdng sprdng2 = this;
        byte[] byArray = new byte[sprdng2.cfr_renamed_2 * sprdng2.cfr_renamed_112.cfr_renamed_4 + 2];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_91) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < this.cfr_renamed_91) {
                sprdng sprdng3;
                if (arg2) {
                    sprdng sprdng4 = this;
                    sprdng3 = sprdng4;
                    sprdng4.cfr_renamed_112.cfr_renamed_6970(arg1, (byte)n, (byte)n3);
                } else {
                    sprdng sprdng5 = this;
                    sprdng3 = sprdng5;
                    sprdng5.cfr_renamed_112.cfr_renamed_6970(arg1, (byte)n3, (byte)n);
                }
                sprdng3.cfr_renamed_112.cfr_renamed_6971(byArray, 0, this.cfr_renamed_112.cfr_renamed_4 * this.cfr_renamed_2);
                sprdng sprdng6 = this;
                int n5 = sprdng6.cfr_renamed_2 * sprdng6.cfr_renamed_112.cfr_renamed_4;
                int n6 = sprdng.cfr_renamed_7022(arg0[n].cfr_renamed_6975(n3), 0, 256, byArray, n5);
                while (n6 < 256) {
                    int n7;
                    int n8;
                    int n9 = n5 % 3;
                    int n10 = n8 = 0;
                    while (n10 < n9) {
                        byArray[++n8] = byArray[n5 - n9 + n8];
                        n10 = n8;
                    }
                    this.cfr_renamed_112.cfr_renamed_6971(byArray, n9, this.cfr_renamed_112.cfr_renamed_4 * 2);
                    n5 = n9 + this.cfr_renamed_112.cfr_renamed_4;
                    int n11 = n7;
                    n6 = n11 + sprdng.cfr_renamed_7022(arg0[n].cfr_renamed_6975(n3), n11, 256 - n7, byArray, n5);
                }
                n4 = ++n3;
            }
            n2 = ++n;
        }
    }

    public byte[] cfr_renamed_7023(byte[] arg0, byte[] arg1, byte[] arg2) {
        int n;
        byte by = 0;
        spruvf spruvf2 = new spruvf(this.cfr_renamed_86);
        spruvf spruvf3 = new spruvf(this.cfr_renamed_86);
        spruvf spruvf4 = new spruvf(this.cfr_renamed_86);
        spruvf spruvf5 = new spruvf(this.cfr_renamed_86);
        spruvf[] spruvfArray = new spruvf[this.cfr_renamed_86.cfr_renamed_6977()];
        sprjuf sprjuf2 = new sprjuf(this.cfr_renamed_86);
        sprjuf sprjuf3 = new sprjuf(this.cfr_renamed_86);
        sprjuf sprjuf4 = new sprjuf(this.cfr_renamed_86);
        byte[] byArray = this.cfr_renamed_7024(spruvf3, arg1);
        sprjuf4.cfr_renamed_7006(arg0);
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_91) {
            spruvfArray[n++] = new spruvf(this.cfr_renamed_86);
            n2 = n;
        }
        this.cfr_renamed_7021(spruvfArray, byArray, true);
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_91) {
            byte by2 = by;
            spruvf2.cfr_renamed_6975(n).cfr_renamed_7000(arg2, by2);
            by = (byte)(by2 + 1);
            n3 = ++n;
        }
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_91) {
            byte by3 = by;
            spruvf4.cfr_renamed_6975(n).cfr_renamed_7007(arg2, by3);
            by = (byte)(by3 + 1);
            n4 = ++n;
        }
        sprjuf2.cfr_renamed_7007(arg2, by);
        spruvf2.cfr_renamed_6990();
        int n5 = n = 0;
        while (n5 < this.cfr_renamed_91) {
            sprjuf sprjuf5 = spruvf5.cfr_renamed_6975(n);
            spruvf spruvf6 = spruvfArray[n];
            spruvf.cfr_renamed_6988(sprjuf5, spruvf6, spruvf2, this.cfr_renamed_86);
            n5 = ++n;
        }
        sprjuf sprjuf6 = sprjuf3;
        spruvf spruvf7 = spruvf5;
        spruvf.cfr_renamed_6988(sprjuf3, spruvf3, spruvf2, this.cfr_renamed_86);
        spruvf7.cfr_renamed_6994();
        sprjuf3.cfr_renamed_6995();
        spruvf7.cfr_renamed_6979(spruvf4);
        sprjuf6.cfr_renamed_6980(sprjuf2);
        sprjuf6.cfr_renamed_6980(sprjuf4);
        spruvf5.cfr_renamed_6984();
        sprjuf3.cfr_renamed_6985();
        return this.cfr_renamed_7025(spruvf5, sprjuf3);
    }

    public byte[] cfr_renamed_123(byte[] arg0, byte[] arg1) {
        byte[] byArray = new byte[sprhfg.cfr_renamed_7005()];
        spruvf spruvf2 = new spruvf(this.cfr_renamed_86);
        spruvf spruvf3 = new spruvf(this.cfr_renamed_86);
        sprjuf sprjuf2 = new sprjuf(this.cfr_renamed_86);
        sprjuf sprjuf3 = new sprjuf(this.cfr_renamed_86);
        sprdng sprdng2 = this;
        sprdng2.cfr_renamed_7026(spruvf2, sprjuf2, arg0);
        sprdng2.cfr_renamed_7027(spruvf3, arg1);
        spruvf2.cfr_renamed_6990();
        sprjuf sprjuf4 = sprjuf3;
        sprjuf sprjuf5 = sprjuf3;
        spruvf.cfr_renamed_6988(sprjuf5, spruvf3, spruvf2, this.cfr_renamed_86);
        sprjuf5.cfr_renamed_6995();
        sprjuf4.cfr_renamed_6999(sprjuf2);
        sprjuf3.cfr_renamed_6985();
        byArray = sprjuf4.cfr_renamed_7004();
        return byArray;
    }

    public byte[] cfr_renamed_7024(spruvf arg0, byte[] arg1) {
        byte[] byArray = new byte[32];
        arg0.cfr_renamed_6993(arg1);
        System.arraycopy(arg1, this.cfr_renamed_1, byArray, 0, 32);
        return byArray;
    }

    private static /* synthetic */ int cfr_renamed_7022(sprjuf arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        int n = 0;
        int n2 = 0;
        block0: while (true) {
            int n3 = n2;
            while (n3 < arg2 && n + 3 <= arg4) {
                short s = (short)(((short)(arg3[n] & 0xFF) >> 0 | (short)(arg3[n + 1] & 0xFF) << 8) & 0xFFF);
                short s2 = (short)(((short)(arg3[n + 1] & 0xFF) >> 4 | (short)(arg3[n + 2] & 0xFF) << 4) & 0xFFF);
                n += 3;
                if (s < 3329) {
                    arg0.cfr_renamed_6987(arg1 + n2++, s);
                }
                if (n2 >= arg2 || s2 >= 3329) continue block0;
                arg0.cfr_renamed_6987(arg1 + n2++, s2);
                n3 = n2;
            }
            break;
        }
        return n2;
    }

    public byte[] cfr_renamed_7028(spruvf arg0, byte[] arg1) {
        byte[] byArray = new byte[this.cfr_renamed_4];
        System.arraycopy(arg0.cfr_renamed_6992(), 0, byArray, 0, this.cfr_renamed_1);
        System.arraycopy(arg1, 0, byArray, this.cfr_renamed_1, 32);
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_7026(spruvf spruvf2, sprjuf sprjuf2, byte[] byArray) {
        void arg1;
        void arg2;
        byte[] byArray2 = sproze.cfr_renamed_533(byArray, 0, this.cfr_renamed_86.cfr_renamed_6982());
        spruvf2.cfr_renamed_6986(byArray2);
        void v0 = arg2;
        byte[] byArray3 = sproze.cfr_renamed_533((byte[])v0, this.cfr_renamed_86.cfr_renamed_6982(), ((void)v0).length);
        arg1.cfr_renamed_7002(byArray3);
    }

    private /* synthetic */ byte[] cfr_renamed_7025(spruvf arg0, sprjuf arg1) {
        byte[] byArray = new byte[this.cfr_renamed_3];
        System.arraycopy(arg0.cfr_renamed_6981(), 0, byArray, 0, this.cfr_renamed_119);
        sprdng sprdng2 = this;
        System.arraycopy(arg1.cfr_renamed_7012(), 0, byArray, sprdng2.cfr_renamed_119, sprdng2.cfr_renamed_0);
        return byArray;
    }

    public sprdng(sprhfg sprhfg2) {
        sprdng sprdng2 = this;
        sprhfg sprhfg3 = sprhfg2;
        sprdng sprdng3 = this;
        sprhfg sprhfg4 = sprhfg2;
        sprdng sprdng4 = this;
        this.cfr_renamed_86 = sprhfg2;
        sprdng4.cfr_renamed_91 = this.cfr_renamed_86.cfr_renamed_6977();
        sprdng4.cfr_renamed_152 = sprhfg2.cfr_renamed_7009();
        this.cfr_renamed_4 = sprhfg4.cfr_renamed_7029();
        sprdng3.cfr_renamed_1 = sprhfg4.cfr_renamed_6978();
        sprdng3.cfr_renamed_3 = sprhfg2.cfr_renamed_7030();
        this.cfr_renamed_119 = sprhfg3.cfr_renamed_6982();
        sprdng2.cfr_renamed_0 = sprhfg3.cfr_renamed_7003();
        sprdng2.cfr_renamed_112 = sprhfg2.cfr_renamed_7011();
        this.cfr_renamed_2 = (472 + this.cfr_renamed_112.cfr_renamed_4) / this.cfr_renamed_112.cfr_renamed_4;
    }

    public byte[][] cfr_renamed_1223() {
        int n;
        spruvf spruvf2 = new spruvf(this.cfr_renamed_86);
        spruvf spruvf3 = new spruvf(this.cfr_renamed_86);
        spruvf spruvf4 = new spruvf(this.cfr_renamed_86);
        byte[] byArray = new byte[32];
        sprdng sprdng2 = this;
        sprdng2.cfr_renamed_86.cfr_renamed_7031(byArray);
        byte[] byArray2 = new byte[64];
        sprdng2.cfr_renamed_112.cfr_renamed_6089(byArray2, byArray);
        byte[] byArray3 = new byte[32];
        byte[] byArray4 = new byte[32];
        System.arraycopy(byArray2, 0, byArray3, 0, 32);
        System.arraycopy(byArray2, 32, byArray4, 0, 32);
        byte by = 0;
        spruvf[] spruvfArray = new spruvf[sprdng2.cfr_renamed_91];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_91) {
            spruvfArray[n++] = new spruvf(this.cfr_renamed_86);
            n2 = n;
        }
        this.cfr_renamed_7021(spruvfArray, byArray3, false);
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_91) {
            byte by2 = by;
            spruvf2.cfr_renamed_6975(n).cfr_renamed_7000(byArray4, by2);
            by = (byte)(by2 + 1);
            n3 = ++n;
        }
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_91) {
            byte by3 = by;
            spruvf4.cfr_renamed_6975(n).cfr_renamed_7000(byArray4, by3);
            by = (byte)(by3 + 1);
            n4 = ++n;
        }
        spruvf2.cfr_renamed_6990();
        spruvf4.cfr_renamed_6990();
        int n5 = n = 0;
        while (n5 < this.cfr_renamed_91) {
            spruvf spruvf5 = spruvf3;
            sprjuf sprjuf2 = spruvf5.cfr_renamed_6975(n);
            spruvf spruvf6 = spruvfArray[n];
            spruvf.cfr_renamed_6988(sprjuf2, spruvf6, spruvf2, this.cfr_renamed_86);
            spruvf5.cfr_renamed_6975(++n).cfr_renamed_7013();
            n5 = n;
        }
        spruvf spruvf7 = spruvf3;
        spruvf7.cfr_renamed_6979(spruvf4);
        spruvf7.cfr_renamed_6984();
        byte[][] byArrayArray = new byte[2][];
        byArrayArray[0] = this.cfr_renamed_7028(spruvf3, byArray3);
        byArrayArray[1] = this.cfr_renamed_7032(spruvf2);
        return byArrayArray;
    }

    public void cfr_renamed_7027(spruvf arg0, byte[] arg1) {
        arg0.cfr_renamed_6993(arg1);
    }

    public byte[] cfr_renamed_7032(spruvf arg0) {
        return arg0.cfr_renamed_6992();
    }
}

