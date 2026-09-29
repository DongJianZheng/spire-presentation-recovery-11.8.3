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
import com.spire.presentation.packages.sprpgm;
import com.spire.presentation.packages.sprrnm;
import com.spire.presentation.packages.sprsma;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtgb;
import com.spire.presentation.packages.sprzcb;
import java.security.SecureRandom;

public class sprkdb
implements sprc {
    private SecureRandom cfr_renamed_119;
    public static final String cfr_renamed_91 = "1.3.6.1.4.1.8301.3.1.3.4.2.2";
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private sprlc cfr_renamed_2;
    public sprcza cfr_renamed_3;
    private int cfr_renamed_4;

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
        sprkdb sprkdb2 = this;
        sprsma sprsma2 = sprsma.cfr_renamed_963(sprkdb2.cfr_renamed_1, byArray3);
        sprsma[] sprsmaArray = sprdab.cfr_renamed_1244((sprlhb)sprkdb2.cfr_renamed_3, sprsma2);
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
        this.cfr_renamed_2.cfr_renamed_1197(byArray6, 0, byArray6.length);
        sprkdb sprkdb3 = this;
        byte[] byArray7 = new byte[sprkdb3.cfr_renamed_2.cfr_renamed_1218()];
        sprkdb3.cfr_renamed_2.cfr_renamed_1219(byArray7, 0);
        sprkdb sprkdb4 = this;
        sprsma2 = sprtgb.cfr_renamed_1355(sprkdb4.cfr_renamed_1, sprkdb4.cfr_renamed_0, byArray7);
        if (!sprsma2.equals(sprsma3)) {
            throw new Exception(sprrnm.cfr_renamed_9("[y}8Iy}|pv~\"9Qwnxtp|9{phq}kl|`m6"));
        }
        int n6 = this.cfr_renamed_4 >> 3;
        return sprnta.cfr_renamed_1121(byArray6, n3 - n6)[0];
    }

    public int cfr_renamed_1232(sprcza arg0) throws IllegalArgumentException {
        if (arg0 instanceof sprzcb) {
            return ((sprzcb)arg0).cfr_renamed_1146();
        }
        if (arg0 instanceof sprlhb) {
            return ((sprlhb)arg0).cfr_renamed_1146();
        }
        throw new IllegalArgumentException(sprpgm.cfr_renamed_9("^YXB[GDE_RO\u0017_N[R"));
    }

    public int cfr_renamed_1209(int arg0) {
        return 0;
    }

    public int cfr_renamed_1207(int arg0) {
        return 0;
    }

    public void cfr_renamed_1356(sprzcb arg0) {
        this.cfr_renamed_119 = this.cfr_renamed_119 != null ? this.cfr_renamed_119 : new SecureRandom();
        sprkdb sprkdb2 = this;
        sprzcb sprzcb2 = arg0;
        this.cfr_renamed_2 = arg0.cfr_renamed_284().cfr_renamed_580();
        this.cfr_renamed_1 = sprzcb2.cfr_renamed_1146();
        sprkdb2.cfr_renamed_4 = sprzcb2.cfr_renamed_1150();
        sprkdb2.cfr_renamed_0 = arg0.cfr_renamed_1144();
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        if (arg0) {
            if (arg1 instanceof spraed) {
                spraed spraed2 = (spraed)arg1;
                sprkdb sprkdb2 = this;
                sprkdb2.cfr_renamed_119 = spraed2.cfr_renamed_1295();
                sprkdb2.cfr_renamed_3 = (sprzcb)spraed2.cfr_renamed_284();
                sprkdb sprkdb3 = this;
                sprkdb3.cfr_renamed_1356((sprzcb)sprkdb3.cfr_renamed_3);
                return;
            }
            this.cfr_renamed_119 = new SecureRandom();
            this.cfr_renamed_3 = (sprzcb)arg1;
            sprkdb sprkdb4 = this;
            sprkdb4.cfr_renamed_1356((sprzcb)sprkdb4.cfr_renamed_3);
            return;
        }
        this.cfr_renamed_3 = (sprlhb)arg1;
        sprkdb sprkdb5 = this;
        sprkdb5.cfr_renamed_1357((sprlhb)sprkdb5.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public byte[] cfr_renamed_136(byte[] byArray) throws Exception {
        int n;
        void arg0;
        sprkdb sprkdb2 = this;
        int n2 = sprkdb2.cfr_renamed_4 >> 3;
        byte[] byArray2 = new byte[n2];
        sprkdb2.cfr_renamed_119.nextBytes(byArray2);
        sprkdb sprkdb3 = this;
        sprsma sprsma2 = new sprsma(sprkdb3.cfr_renamed_4, this.cfr_renamed_119);
        byte[] byArray3 = sprsma2.cfr_renamed_91();
        byte[] byArray4 = sprnta.cfr_renamed_543((byte[])arg0, byArray2);
        sprkdb3.cfr_renamed_2.cfr_renamed_1197(byArray4, 0, byArray4.length);
        sprkdb sprkdb4 = this;
        byte[] byArray5 = new byte[sprkdb4.cfr_renamed_2.cfr_renamed_1218()];
        sprkdb sprkdb5 = this;
        sprkdb4.cfr_renamed_2.cfr_renamed_1219(byArray5, 0);
        sprsma sprsma3 = sprtgb.cfr_renamed_1355(this.cfr_renamed_1, sprkdb5.cfr_renamed_0, byArray5);
        byte[] byArray6 = sprdab.cfr_renamed_1246((sprzcb)sprkdb5.cfr_renamed_3, sprsma2, sprsma3).cfr_renamed_91();
        sprbwc sprbwc2 = new sprbwc(new sprlid());
        sprbwc2.cfr_renamed_1353(byArray3);
        byte[] byArray7 = new byte[((void)arg0).length + n2];
        sprbwc2.cfr_renamed_1354(byArray7);
        int n3 = n = 0;
        while (n3 < ((void)arg0).length) {
            int n4 = n;
            byte by = (byte)(byArray7[n4] ^ arg0[n]);
            byArray7[n4] = by;
            n3 = ++n;
        }
        int n5 = n = 0;
        while (n5 < n2) {
            int n6 = ((void)arg0).length + n;
            byte by = (byte)(byArray7[n6] ^ byArray2[n]);
            byArray7[n6] = by;
            n5 = ++n;
        }
        return sprnta.cfr_renamed_543(byArray6, byArray7);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_1357(sprlhb sprlhb2) {
        void arg0;
        sprkdb sprkdb2 = this;
        void v1 = arg0;
        this.cfr_renamed_2 = arg0.cfr_renamed_284().cfr_renamed_580();
        this.cfr_renamed_1 = v1.cfr_renamed_1146();
        sprkdb2.cfr_renamed_4 = v1.cfr_renamed_1150();
        sprkdb2.cfr_renamed_0 = sprlhb2.cfr_renamed_1144();
    }
}

