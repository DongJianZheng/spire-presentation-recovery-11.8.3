/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprbwc;
import com.spire.presentation.packages.sprc;
import com.spire.presentation.packages.sprcza;
import com.spire.presentation.packages.sprdab;
import com.spire.presentation.packages.sprfib;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprlhb;
import com.spire.presentation.packages.sprlid;
import com.spire.presentation.packages.sprnta;
import com.spire.presentation.packages.sprsma;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtgb;
import com.spire.presentation.packages.sprufba;
import com.spire.presentation.packages.sprzcb;
import com.spire.presentation.packages.sprzma;
import java.security.SecureRandom;

public class sprveb
implements sprc {
    private SecureRandom cfr_renamed_152;
    private sprlc cfr_renamed_112;
    private int cfr_renamed_119;
    private static final String cfr_renamed_91 = "SHA1PRNG";
    public static final String cfr_renamed_0 = "1.3.6.1.4.1.8301.3.1.3.4.2.3";
    private int cfr_renamed_1;
    public sprcza cfr_renamed_2;
    public static final byte[] cfr_renamed_3 = sprufba.cfr_renamed_9("'\"6p#f#v#p+k(g\"\"6w$n/afa)l5v'l2").getBytes();
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_1356(sprzcb sprzcb2) {
        void arg0;
        sprveb sprveb2 = this;
        void v1 = arg0;
        this.cfr_renamed_112 = arg0.cfr_renamed_284().cfr_renamed_580();
        this.cfr_renamed_119 = v1.cfr_renamed_1146();
        sprveb2.cfr_renamed_4 = v1.cfr_renamed_1150();
        sprveb2.cfr_renamed_1 = sprzcb2.cfr_renamed_1144();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public byte[] cfr_renamed_1214(byte[] byArray) throws Exception {
        int n;
        sprbwc sprbwc2;
        sprveb sprveb2;
        byte[] byArray2;
        byte[] byArray3;
        Object object;
        void arg0;
        int n2 = this.cfr_renamed_119 >> 3;
        if (byArray.length < n2) {
            throw new Exception(sprufba.cfr_renamed_9("@'ffR'f\"k(e|\"\u0005k6j#p2g>vfv)mfq.m4vh"));
        }
        sprveb sprveb3 = this;
        int n3 = sprveb3.cfr_renamed_112.cfr_renamed_1218();
        int n4 = sprveb3.cfr_renamed_4 >> 3;
        int n5 = ((void)arg0).length - n2;
        if (n5 > 0) {
            object = sprnta.cfr_renamed_1121((byte[])arg0, n5);
            byArray3 = object[0];
            byArray2 = object[1];
            sprveb2 = this;
        } else {
            byArray3 = new byte[]{};
            byArray2 = arg0;
            sprveb2 = this;
        }
        object = sprsma.cfr_renamed_963(sprveb2.cfr_renamed_119, byArray2);
        sprsma[] sprsmaArray = sprdab.cfr_renamed_1244((sprlhb)this.cfr_renamed_2, (sprsma)object);
        byte[] byArray4 = sprsmaArray[0].cfr_renamed_91();
        sprsma sprsma2 = sprsmaArray[1];
        if (byArray4.length > n4) {
            byArray4 = sprnta.cfr_renamed_1109(byArray4, 0, n4);
        }
        sprveb sprveb4 = this;
        byte[] byArray5 = sprtgb.cfr_renamed_1362(sprveb4.cfr_renamed_119, sprveb4.cfr_renamed_1, sprsma2);
        byte[] byArray6 = sprnta.cfr_renamed_543(byArray3, byArray5);
        byArray6 = sprnta.cfr_renamed_543(byArray6, byArray4);
        int n6 = byArray6.length - n3;
        byte[][] byArray7 = sprnta.cfr_renamed_1121(byArray6, n3);
        byte[] byArray8 = byArray7[0];
        byte[] byArray9 = byArray7[1];
        sprveb sprveb5 = this;
        byte[] byArray10 = new byte[sprveb5.cfr_renamed_112.cfr_renamed_1218()];
        sprveb5.cfr_renamed_112.cfr_renamed_1197(byArray9, 0, byArray9.length);
        this.cfr_renamed_112.cfr_renamed_1219(byArray10, 0);
        int n7 = n3 - 1;
        int n8 = n7;
        while (n8 >= 0) {
            int n9 = n7;
            byte by = (byte)(byArray10[n9] ^ byArray8[n7]);
            byArray10[n9] = by;
            n8 = --n7;
        }
        sprbwc sprbwc3 = sprbwc2 = new sprbwc(new sprlid());
        sprbwc3.cfr_renamed_1353(byArray10);
        byte[] byArray11 = new byte[n6];
        sprbwc3.cfr_renamed_1354(byArray11);
        int n10 = n = n6 - 1;
        while (n10 >= 0) {
            int n11 = n;
            byte by = (byte)(byArray11[n11] ^ byArray9[n]);
            byArray11[n11] = by;
            n10 = --n;
        }
        if (byArray11.length < n6) {
            throw new Exception(sprfib.cfr_renamed_9("\u0003-%l\u0011-%((\"&va%/:  ((a/(<))38$45"));
        }
        byte[][] byArray12 = sprnta.cfr_renamed_1121(byArray11, n6 - cfr_renamed_3.length);
        byte[] byArray13 = byArray12[0];
        if (!sprnta.cfr_renamed_1110(byArray12[1], cfr_renamed_3)) {
            throw new Exception(sprufba.cfr_renamed_9("\u0004c\"\"\u0016c\"f/l!8fk(t'n/ffa/r.g4v#z2"));
        }
        return byArray13;
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        if (arg0) {
            if (arg1 instanceof spraed) {
                spraed spraed2 = (spraed)arg1;
                sprveb sprveb2 = this;
                sprveb2.cfr_renamed_152 = spraed2.cfr_renamed_1295();
                sprveb2.cfr_renamed_2 = (sprzcb)spraed2.cfr_renamed_284();
                sprveb sprveb3 = this;
                sprveb3.cfr_renamed_1356((sprzcb)sprveb3.cfr_renamed_2);
                return;
            }
            this.cfr_renamed_152 = new SecureRandom();
            this.cfr_renamed_2 = (sprzcb)arg1;
            sprveb sprveb4 = this;
            sprveb4.cfr_renamed_1356((sprzcb)sprveb4.cfr_renamed_2);
            return;
        }
        this.cfr_renamed_2 = (sprlhb)arg1;
        sprveb sprveb5 = this;
        sprveb5.cfr_renamed_1357((sprlhb)sprveb5.cfr_renamed_2);
    }

    @Override
    public byte[] cfr_renamed_136(byte[] arg0) throws Exception {
        int n;
        sprbwc sprbwc2;
        sprveb sprveb2 = this;
        int n2 = sprveb2.cfr_renamed_112.cfr_renamed_1218();
        int n3 = sprveb2.cfr_renamed_4 >> 3;
        int n4 = sprzma.cfr_renamed_920(sprveb2.cfr_renamed_119, this.cfr_renamed_1).bitLength() - 1 >> 3;
        int n5 = n3 + n4 - n2 - cfr_renamed_3.length;
        if (arg0.length > n5) {
            n5 = arg0.length;
        }
        int n6 = n5 + cfr_renamed_3.length;
        int n7 = n6 + n2 - n3 - n4;
        byte[] byArray = new byte[n6];
        System.arraycopy(arg0, 0, byArray, 0, arg0.length);
        System.arraycopy(cfr_renamed_3, 0, byArray, n5, cfr_renamed_3.length);
        byte[] byArray2 = new byte[n2];
        this.cfr_renamed_152.nextBytes(byArray2);
        sprbwc sprbwc3 = sprbwc2 = new sprbwc(new sprlid());
        sprbwc3.cfr_renamed_1353(byArray2);
        byte[] byArray3 = new byte[n6];
        sprbwc3.cfr_renamed_1354(byArray3);
        int n8 = n = n6 - 1;
        while (n8 >= 0) {
            int n9 = n;
            byte by = (byte)(byArray3[n9] ^ byArray[n]);
            byArray3[n9] = by;
            n8 = --n;
        }
        sprveb sprveb3 = this;
        byte[] byArray4 = new byte[sprveb3.cfr_renamed_112.cfr_renamed_1218()];
        sprveb3.cfr_renamed_112.cfr_renamed_1197(byArray3, 0, byArray3.length);
        this.cfr_renamed_112.cfr_renamed_1219(byArray4, 0);
        int n10 = n2 - 1;
        int n11 = n10;
        while (n11 >= 0) {
            int n12 = n10;
            byte by = (byte)(byArray4[n12] ^ byArray2[n10]);
            byArray4[n12] = by;
            n11 = --n10;
        }
        byte[] byArray5 = sprnta.cfr_renamed_543(byArray4, byArray3);
        byte[] byArray6 = new byte[]{};
        if (n7 > 0) {
            byArray6 = new byte[n7];
            System.arraycopy(byArray5, 0, byArray6, 0, n7);
        }
        byte[] byArray7 = new byte[n4];
        System.arraycopy(byArray5, n7, byArray7, 0, n4);
        byte[] byArray8 = new byte[n3];
        System.arraycopy(byArray5, n7 + n4, byArray8, 0, n3);
        sprveb sprveb4 = this;
        sprsma sprsma2 = sprsma.cfr_renamed_963(sprveb4.cfr_renamed_4, byArray8);
        sprveb sprveb5 = this;
        sprsma sprsma3 = sprtgb.cfr_renamed_1355(sprveb4.cfr_renamed_119, sprveb5.cfr_renamed_1, byArray7);
        byte[] byArray9 = sprdab.cfr_renamed_1246((sprzcb)sprveb5.cfr_renamed_2, sprsma2, sprsma3).cfr_renamed_91();
        if (n7 > 0) {
            return sprnta.cfr_renamed_543(byArray6, byArray9);
        }
        return byArray9;
    }

    public int cfr_renamed_1232(sprcza arg0) {
        if (arg0 instanceof sprzcb) {
            return ((sprzcb)arg0).cfr_renamed_1146();
        }
        if (arg0 instanceof sprlhb) {
            return ((sprlhb)arg0).cfr_renamed_1146();
        }
        throw new IllegalArgumentException(sprfib.cfr_renamed_9("9/?4<1#38$(a88<$"));
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_1357(sprlhb sprlhb2) {
        void arg0;
        sprveb sprveb2 = this;
        void v1 = arg0;
        this.cfr_renamed_112 = arg0.cfr_renamed_284().cfr_renamed_580();
        this.cfr_renamed_119 = v1.cfr_renamed_1146();
        sprveb2.cfr_renamed_4 = v1.cfr_renamed_1150();
        sprveb2.cfr_renamed_1 = sprlhb2.cfr_renamed_1144();
    }
}

