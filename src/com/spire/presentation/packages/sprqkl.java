/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgfk;
import com.spire.presentation.packages.sprgnk;
import com.spire.presentation.packages.sprhdaa;
import com.spire.presentation.packages.sprhgl;
import com.spire.presentation.packages.sprhx;
import com.spire.presentation.packages.sprkll;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmvh;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprsso;
import com.spire.presentation.packages.spruok;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzuk;
import java.math.BigInteger;

public class sprqkl {
    private sprzuk cfr_renamed_152;
    private spreuh cfr_renamed_112;
    private sprqxk cfr_renamed_119;
    private final sprgf cfr_renamed_91;
    private sprzuk cfr_renamed_0;
    private spreuh cfr_renamed_1;
    private int cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private boolean cfr_renamed_4;

    public void cfr_renamed_5692(sprbj arg0) {
        sprqkl sprqkl2;
        spruok spruok2;
        if (arg0 instanceof sprgnk) {
            spruok2 = (spruok)((sprgnk)arg0).cfr_renamed_284();
            this.cfr_renamed_3 = ((sprgnk)arg0).cfr_renamed_6005();
            sprqkl2 = this;
        } else {
            spruok2 = (spruok)arg0;
            sprqkl2 = this;
            this.cfr_renamed_3 = new byte[0];
        }
        sprqkl2.cfr_renamed_4 = spruok2.cfr_renamed_9976();
        sprqkl sprqkl3 = this;
        sprqkl sprqkl4 = this;
        spruok spruok3 = spruok2;
        this.cfr_renamed_152 = spruok2.cfr_renamed_2095();
        sprqkl4.cfr_renamed_0 = spruok3.cfr_renamed_2094();
        sprqkl4.cfr_renamed_119 = this.cfr_renamed_152.cfr_renamed_284();
        this.cfr_renamed_1 = spruok3.cfr_renamed_9974();
        sprqkl3.cfr_renamed_112 = spruok2.cfr_renamed_9975();
        sprqkl3.cfr_renamed_2 = this.cfr_renamed_119.cfr_renamed_1769().cfr_renamed_1938() / 2 - 1;
        sprybl.cfr_renamed_9170(sprhgl.cfr_renamed_10591(sprhdaa.cfr_renamed_9("b1\u00037t"), this.cfr_renamed_152));
    }

    private /* synthetic */ byte[] cfr_renamed_9924() {
        sprqkl sprqkl2 = this;
        byte[] byArray = new byte[sprqkl2.cfr_renamed_91.cfr_renamed_1218()];
        sprqkl2.cfr_renamed_91.cfr_renamed_1219(byArray, 0);
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ byte[] cfr_renamed_10608(sprgf sprgf2, spreuh spreuh2, byte[] byArray, byte[] byArray2, spreuh spreuh3, spreuh spreuh4) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        void v0 = arg0;
        this.cfr_renamed_9926((sprgf)v0, arg1.cfr_renamed_1969());
        v0.cfr_renamed_1197(byArray, 0, ((void)arg2).length);
        void v1 = arg3;
        arg0.cfr_renamed_1197((byte[])v1, 0, ((void)v1).length);
        sprqkl sprqkl2 = this;
        void v3 = arg0;
        void v4 = arg4;
        this.cfr_renamed_9926((sprgf)arg0, v4.cfr_renamed_1969());
        this.cfr_renamed_9926((sprgf)v3, v4.cfr_renamed_1973());
        sprqkl2.cfr_renamed_9926((sprgf)v3, arg5.cfr_renamed_1969());
        sprqkl2.cfr_renamed_9926((sprgf)arg0, arg5.cfr_renamed_1973());
        return sprqkl2.cfr_renamed_9924();
    }

    private /* synthetic */ spreuh cfr_renamed_10609(sprgfk arg0) {
        sprqkl sprqkl2 = this;
        sprqxk sprqxk2 = sprqkl2.cfr_renamed_152.cfr_renamed_284();
        spreuh spreuh2 = sprmvh.cfr_renamed_8962(sprqxk2.cfr_renamed_1769(), arg0.cfr_renamed_3351().cfr_renamed_1604());
        spreuh spreuh3 = sprmvh.cfr_renamed_8962(sprqxk2.cfr_renamed_1769(), arg0.cfr_renamed_2096().cfr_renamed_1604());
        BigInteger bigInteger = sprqkl2.cfr_renamed_10610(sprqkl2.cfr_renamed_112.cfr_renamed_1969().cfr_renamed_1779());
        BigInteger bigInteger2 = sprqkl2.cfr_renamed_10610(spreuh3.cfr_renamed_1969().cfr_renamed_1779());
        BigInteger bigInteger3 = sprqkl2.cfr_renamed_152.cfr_renamed_2112().add(bigInteger.multiply(this.cfr_renamed_0.cfr_renamed_2112()));
        BigInteger bigInteger4 = sprqkl2.cfr_renamed_119.cfr_renamed_1153().multiply(bigInteger3).mod(this.cfr_renamed_119.cfr_renamed_1146());
        BigInteger bigInteger5 = bigInteger4.multiply(bigInteger2).mod(this.cfr_renamed_119.cfr_renamed_1146());
        return sprmvh.cfr_renamed_8958(spreuh2, bigInteger4, spreuh3, bigInteger5).cfr_renamed_1775();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ byte[] cfr_renamed_10611(sprgf sprgf2, spreuh spreuh2, byte[] byArray) {
        void arg2;
        void arg1;
        void arg0;
        void v0 = arg0;
        v0.cfr_renamed_1221((byte)3);
        this.cfr_renamed_9926((sprgf)v0, arg1.cfr_renamed_1973());
        void v1 = arg2;
        v0.cfr_renamed_1197((byte[])v1, 0, ((void)v1).length);
        return this.cfr_renamed_9924();
    }

    public byte[] cfr_renamed_10612(int arg0, sprbj arg1) {
        sprqkl sprqkl2;
        byte[] byArray;
        sprgfk sprgfk2;
        if (arg1 instanceof sprgnk) {
            sprgfk2 = (sprgfk)((sprgnk)arg1).cfr_renamed_284();
            byArray = ((sprgnk)arg1).cfr_renamed_6005();
            sprqkl2 = this;
        } else {
            sprgfk2 = (sprgfk)arg1;
            byArray = new byte[]{};
            sprqkl2 = this;
        }
        sprqkl sprqkl3 = this;
        byte[] byArray2 = sprqkl2.cfr_renamed_10613(sprqkl3.cfr_renamed_91, sprqkl3.cfr_renamed_3, this.cfr_renamed_1);
        sprqkl sprqkl4 = this;
        byte[] byArray3 = sprqkl4.cfr_renamed_10613(sprqkl4.cfr_renamed_91, byArray, sprgfk2.cfr_renamed_3351().cfr_renamed_1604());
        spreuh spreuh2 = sprqkl4.cfr_renamed_10609(sprgfk2);
        if (sprqkl4.cfr_renamed_4) {
            byte[] byArray4 = this.cfr_renamed_10614(spreuh2, byArray2, byArray3, arg0);
            return byArray4;
        }
        byte[] byArray5 = this.cfr_renamed_10614(spreuh2, byArray3, byArray2, arg0);
        return byArray5;
    }

    private /* synthetic */ BigInteger cfr_renamed_10610(BigInteger arg0) {
        return arg0.and(BigInteger.valueOf(1L).shiftLeft(this.cfr_renamed_2).subtract(BigInteger.valueOf(1L))).setBit(this.cfr_renamed_2);
    }

    public sprqkl(sprgf sprgf2) {
        this.cfr_renamed_91 = sprgf2;
    }

    private /* synthetic */ void cfr_renamed_9926(sprgf arg0, sprlsh arg1) {
        byte[] byArray = arg1.cfr_renamed_91();
        arg0.cfr_renamed_1197(byArray, 0, byArray.length);
    }

    private /* synthetic */ void cfr_renamed_9928(sprgf arg0, byte[] arg1) {
        int n = arg1.length * 8;
        sprgf sprgf2 = arg0;
        int n2 = n;
        arg0.cfr_renamed_1221((byte)(n2 >>> 8));
        sprgf2.cfr_renamed_1221((byte)n2);
        sprgf2.cfr_renamed_1197(arg1, 0, arg1.length);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ byte[] cfr_renamed_10615(sprgf sprgf2, spreuh spreuh2, byte[] byArray) {
        void arg2;
        void arg1;
        void arg0;
        void v0 = arg0;
        v0.cfr_renamed_1221((byte)2);
        this.cfr_renamed_9926((sprgf)v0, arg1.cfr_renamed_1973());
        void v1 = arg2;
        v0.cfr_renamed_1197((byte[])v1, 0, ((void)v1).length);
        return this.cfr_renamed_9924();
    }

    public byte[][] cfr_renamed_10616(int arg0, byte[] arg1, sprbj arg2) {
        sprqkl sprqkl2;
        byte[] byArray;
        sprgfk sprgfk2;
        if (arg2 instanceof sprgnk) {
            sprgfk2 = (sprgfk)((sprgnk)arg2).cfr_renamed_284();
            byArray = ((sprgnk)arg2).cfr_renamed_6005();
            sprqkl2 = this;
        } else {
            sprgfk2 = (sprgfk)arg2;
            byArray = new byte[]{};
            sprqkl2 = this;
        }
        if (sprqkl2.cfr_renamed_4 && arg1 == null) {
            throw new IllegalArgumentException(sprsso.cfr_renamed_9(")X`W.W4W!J)P'\u0012`]/P&W2S!J)Q.j!Y`S5M4\u001e\"[`M%J"));
        }
        sprqkl sprqkl3 = this;
        sprqkl sprqkl4 = this;
        byte[] byArray2 = sprqkl3.cfr_renamed_10613(sprqkl3.cfr_renamed_91, sprqkl4.cfr_renamed_3, this.cfr_renamed_1);
        byte[] byArray3 = sprqkl3.cfr_renamed_10613(sprqkl4.cfr_renamed_91, byArray, sprgfk2.cfr_renamed_3351().cfr_renamed_1604());
        spreuh spreuh2 = sprqkl3.cfr_renamed_10609(sprgfk2);
        if (sprqkl3.cfr_renamed_4) {
            sprqkl sprqkl5 = this;
            byte[] byArray4 = sprqkl5.cfr_renamed_10614(spreuh2, byArray2, byArray3, arg0);
            byte[] byArray5 = sprqkl5.cfr_renamed_10608(sprqkl5.cfr_renamed_91, spreuh2, byArray2, byArray3, this.cfr_renamed_112, sprgfk2.cfr_renamed_2096().cfr_renamed_1604());
            if (!sproze.cfr_renamed_559(sprqkl5.cfr_renamed_10615(sprqkl5.cfr_renamed_91, spreuh2, byArray5), arg1)) {
                throw new IllegalStateException(sprhdaa.cfr_renamed_9("R\u0013_\u001aX\u000e\\\u001dE\u0015^\u0012\u0011\bP\u001b\u0011\u0011X\u000f\\\u001dE\u001fY"));
            }
            byte[][] byArrayArray = new byte[2][];
            byArrayArray[0] = byArray4;
            sprqkl sprqkl6 = this;
            byArrayArray[1] = sprqkl6.cfr_renamed_10611(sprqkl6.cfr_renamed_91, spreuh2, byArray5);
            return byArrayArray;
        }
        sprqkl sprqkl7 = this;
        byte[] byArray6 = sprqkl7.cfr_renamed_10614(spreuh2, byArray3, byArray2, arg0);
        byte[] byArray7 = sprqkl7.cfr_renamed_10608(sprqkl7.cfr_renamed_91, spreuh2, byArray3, byArray2, sprgfk2.cfr_renamed_2096().cfr_renamed_1604(), this.cfr_renamed_112);
        byte[][] byArrayArray = new byte[3][];
        byArrayArray[0] = byArray6;
        sprqkl sprqkl8 = this;
        byArrayArray[1] = sprqkl8.cfr_renamed_10615(sprqkl8.cfr_renamed_91, spreuh2, byArray7);
        sprqkl sprqkl9 = this;
        byArrayArray[2] = sprqkl9.cfr_renamed_10611(sprqkl9.cfr_renamed_91, spreuh2, byArray7);
        return byArrayArray;
    }

    private /* synthetic */ byte[] cfr_renamed_10614(spreuh arg0, byte[] arg1, byte[] arg2, int arg3) {
        sprqkl sprqkl2 = this;
        int n = sprqkl2.cfr_renamed_91.cfr_renamed_1218();
        byte[] byArray = new byte[Math.max(4, n)];
        byte[] byArray2 = new byte[(arg3 + 7) / 8];
        int n2 = 0;
        sprhx sprhx2 = null;
        sprhx sprhx3 = null;
        if (sprqkl2.cfr_renamed_91 instanceof sprhx) {
            sprqkl sprqkl3 = this;
            sprqkl3.cfr_renamed_9926(sprqkl3.cfr_renamed_91, arg0.cfr_renamed_1969());
            sprqkl3.cfr_renamed_9926(sprqkl3.cfr_renamed_91, arg0.cfr_renamed_1973());
            sprqkl3.cfr_renamed_91.cfr_renamed_1197(arg1, 0, arg1.length);
            this.cfr_renamed_91.cfr_renamed_1197(arg2, 0, arg2.length);
            sprhx2 = (sprhx)((Object)this.cfr_renamed_91);
            sprhx3 = sprhx2.cfr_renamed_461();
        }
        int n3 = 0;
        int n4 = n2;
        while (n4 < byArray2.length) {
            if (sprhx2 != null) {
                sprhx2.cfr_renamed_5183(sprhx3);
            } else {
                sprqkl sprqkl4 = this;
                sprqkl4.cfr_renamed_9926(sprqkl4.cfr_renamed_91, arg0.cfr_renamed_1969());
                sprqkl4.cfr_renamed_9926(sprqkl4.cfr_renamed_91, arg0.cfr_renamed_1973());
                sprqkl4.cfr_renamed_91.cfr_renamed_1197(arg1, 0, arg1.length);
                this.cfr_renamed_91.cfr_renamed_1197(arg2, 0, arg2.length);
            }
            sprpxe.cfr_renamed_442(++n3, byArray, 0);
            sprqkl sprqkl5 = this;
            sprqkl5.cfr_renamed_91.cfr_renamed_1197(byArray, 0, 4);
            sprqkl5.cfr_renamed_91.cfr_renamed_1219(byArray, 0);
            int n5 = Math.min(n, byArray2.length - n2);
            System.arraycopy(byArray, 0, byArray2, n2, n5);
            n4 = n2 + n5;
        }
        return byArray2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ byte[] cfr_renamed_10613(sprgf sprgf2, byte[] byArray, spreuh spreuh2) {
        void arg2;
        void arg1;
        void arg0;
        sprqkl sprqkl2 = this;
        void v1 = arg0;
        sprqkl sprqkl3 = this;
        sprqkl sprqkl4 = this;
        sprqkl sprqkl5 = this;
        void v5 = arg0;
        sprqkl5.cfr_renamed_9928((sprgf)v5, (byte[])arg1);
        sprqkl4.cfr_renamed_9926((sprgf)v5, sprqkl5.cfr_renamed_119.cfr_renamed_1769().cfr_renamed_1778());
        sprqkl4.cfr_renamed_9926((sprgf)arg0, sprqkl4.cfr_renamed_119.cfr_renamed_1769().cfr_renamed_1997());
        sprqkl3.cfr_renamed_9926((sprgf)arg0, sprqkl3.cfr_renamed_119.cfr_renamed_1145().cfr_renamed_1969());
        this.cfr_renamed_9926((sprgf)v1, sprqkl3.cfr_renamed_119.cfr_renamed_1145().cfr_renamed_1973());
        sprqkl2.cfr_renamed_9926((sprgf)v1, arg2.cfr_renamed_1969());
        sprqkl2.cfr_renamed_9926(sprgf2, arg2.cfr_renamed_1973());
        return sprqkl2.cfr_renamed_9924();
    }

    public sprqkl() {
        this(new sprkll());
    }
}

