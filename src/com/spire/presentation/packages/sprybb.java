/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprbwc;
import com.spire.presentation.packages.sprc;
import com.spire.presentation.packages.sprcza;
import com.spire.presentation.packages.sprdab;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprlhb;
import com.spire.presentation.packages.sprlid;
import com.spire.presentation.packages.sprnta;
import com.spire.presentation.packages.sprooz;
import com.spire.presentation.packages.sprsma;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtgb;
import com.spire.presentation.packages.sprzcb;
import com.spire.presentation.packages.sprzos;
import java.security.SecureRandom;

public class sprybb
implements sprc {
    private SecureRandom cfr_renamed_112;
    private sprlc cfr_renamed_119;
    public sprcza cfr_renamed_91;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private static final String cfr_renamed_3 = "SHA1PRNG";
    public static final String cfr_renamed_4 = "1.3.6.1.4.1.8301.3.1.3.4.2.1";

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_1357(sprlhb sprlhb2) {
        void arg0;
        sprybb sprybb2 = this;
        void v1 = arg0;
        this.cfr_renamed_119 = v1.cfr_renamed_284().cfr_renamed_580();
        sprybb2.cfr_renamed_1 = v1.cfr_renamed_1146();
        sprybb2.cfr_renamed_0 = sprlhb2.cfr_renamed_1144();
    }

    public int cfr_renamed_1232(sprcza arg0) throws IllegalArgumentException {
        if (arg0 instanceof sprzcb) {
            return ((sprzcb)arg0).cfr_renamed_1146();
        }
        if (arg0 instanceof sprlhb) {
            return ((sprlhb)arg0).cfr_renamed_1146();
        }
        throw new IllegalArgumentException(sprzos.cfr_renamed_9("<\u0004:\u001f9\u001a&\u0018=\u000f-J=\u00139\u000f"));
    }

    @Override
    public byte[] cfr_renamed_136(byte[] arg0) throws Exception {
        int n;
        sprybb sprybb2 = this;
        sprsma sprsma2 = new sprsma(sprybb2.cfr_renamed_2, sprybb2.cfr_renamed_112);
        byte[] byArray = sprsma2.cfr_renamed_91();
        byte[] byArray2 = sprnta.cfr_renamed_543(byArray, arg0);
        this.cfr_renamed_119.cfr_renamed_1197(byArray2, 0, byArray2.length);
        sprybb sprybb3 = this;
        byte[] byArray3 = new byte[sprybb3.cfr_renamed_119.cfr_renamed_1218()];
        sprybb sprybb4 = this;
        sprybb3.cfr_renamed_119.cfr_renamed_1219(byArray3, 0);
        sprsma sprsma3 = sprtgb.cfr_renamed_1355(this.cfr_renamed_1, sprybb4.cfr_renamed_0, byArray3);
        byte[] byArray4 = sprdab.cfr_renamed_1246((sprzcb)sprybb4.cfr_renamed_91, sprsma2, sprsma3).cfr_renamed_91();
        sprbwc sprbwc2 = new sprbwc(new sprlid());
        sprbwc2.cfr_renamed_1353(byArray);
        byte[] byArray5 = new byte[arg0.length];
        sprbwc2.cfr_renamed_1354(byArray5);
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n;
            byte by = (byte)(byArray5[n3] ^ arg0[n]);
            byArray5[n3] = by;
            n2 = ++n;
        }
        return sprnta.cfr_renamed_543(byArray4, byArray5);
    }

    private /* synthetic */ void cfr_renamed_1356(sprzcb arg0) {
        this.cfr_renamed_112 = this.cfr_renamed_112 != null ? this.cfr_renamed_112 : new SecureRandom();
        sprybb sprybb2 = this;
        sprzcb sprzcb2 = arg0;
        this.cfr_renamed_119 = arg0.cfr_renamed_284().cfr_renamed_580();
        this.cfr_renamed_1 = sprzcb2.cfr_renamed_1146();
        sprybb2.cfr_renamed_2 = sprzcb2.cfr_renamed_1150();
        sprybb2.cfr_renamed_0 = arg0.cfr_renamed_1144();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public byte[] cfr_renamed_1214(byte[] byArray) throws Exception {
        int n;
        sprbwc sprbwc2;
        void arg0;
        int n2 = this.cfr_renamed_1 + 7 >> 3;
        int n3 = byArray.length - n2;
        byte[][] byArray2 = sprnta.cfr_renamed_1121((byte[])arg0, n2);
        byte[] byArray3 = byArray2[0];
        byte[] byArray4 = byArray2[1];
        sprybb sprybb2 = this;
        sprsma sprsma2 = sprsma.cfr_renamed_963(sprybb2.cfr_renamed_1, byArray3);
        sprsma[] sprsmaArray = sprdab.cfr_renamed_1244((sprlhb)sprybb2.cfr_renamed_91, sprsma2);
        byte[] byArray5 = sprsmaArray[0].cfr_renamed_91();
        sprsma sprsma3 = sprsmaArray[1];
        sprbwc sprbwc3 = sprbwc2 = new sprbwc(new sprlid());
        sprbwc3.cfr_renamed_1353(byArray5);
        byte[] byArray6 = new byte[n3];
        sprbwc3.cfr_renamed_1354(byArray6);
        int n4 = n = 0;
        while (n4 < n3) {
            int n5 = n;
            byte by = (byte)(byArray6[n5] ^ byArray4[n]);
            byArray6[n5] = by;
            n4 = ++n;
        }
        byte[] byArray7 = sprnta.cfr_renamed_543(byArray5, byArray6);
        sprybb sprybb3 = this;
        byte[] byArray8 = new byte[sprybb3.cfr_renamed_119.cfr_renamed_1218()];
        sprybb3.cfr_renamed_119.cfr_renamed_1197(byArray7, 0, byArray7.length);
        this.cfr_renamed_119.cfr_renamed_1219(byArray8, 0);
        sprybb sprybb4 = this;
        sprsma2 = sprtgb.cfr_renamed_1355(sprybb4.cfr_renamed_1, sprybb4.cfr_renamed_0, byArray8);
        if (!sprsma2.equals(sprsma3)) {
            throw new Exception(sprooz.cfr_renamed_9("\u001a\u0006<G\b\u0006<\u00031\t?]x\u000e6\u00119\u000b1\u0003x\u00041\u00170\u0002*\u0013=\u001f,"));
        }
        return byArray6;
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        if (arg0) {
            if (arg1 instanceof spraed) {
                spraed spraed2 = (spraed)arg1;
                sprybb sprybb2 = this;
                sprybb2.cfr_renamed_112 = spraed2.cfr_renamed_1295();
                sprybb2.cfr_renamed_91 = (sprzcb)spraed2.cfr_renamed_284();
                sprybb sprybb3 = this;
                sprybb3.cfr_renamed_1356((sprzcb)sprybb3.cfr_renamed_91);
                return;
            }
            this.cfr_renamed_112 = new SecureRandom();
            this.cfr_renamed_91 = (sprzcb)arg1;
            sprybb sprybb4 = this;
            sprybb4.cfr_renamed_1356((sprzcb)sprybb4.cfr_renamed_91);
            return;
        }
        this.cfr_renamed_91 = (sprlhb)arg1;
        sprybb sprybb5 = this;
        sprybb5.cfr_renamed_1357((sprlhb)sprybb5.cfr_renamed_91);
    }
}

