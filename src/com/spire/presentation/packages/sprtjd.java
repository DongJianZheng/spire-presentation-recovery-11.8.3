/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprgnd;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprlid;
import com.spire.presentation.packages.sprlik;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprsmd;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spryn;
import com.spire.presentation.packages.sprzkaa;
import com.spire.presentation.packages.sprzra;
import java.security.SecureRandom;

public class sprtjd
implements spryn {
    private static final byte[] cfr_renamed_152;
    private sprnjd cfr_renamed_112;
    public byte[] cfr_renamed_119;
    private sprgnd cfr_renamed_91;
    private sprt cfr_renamed_0;
    private SecureRandom cfr_renamed_1;
    private boolean cfr_renamed_2;
    public sprlc cfr_renamed_3;
    private byte[] cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_1575(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2;
        int n3;
        if (!this.cfr_renamed_2) {
            throw new IllegalStateException(sprlik.cfr_renamed_9("\u0015\u0015/Z2\u00142\u000e2\u001b7\u0013!\u001f?Z=\u0015)Z,\b:\n+\u00135\u001d"));
        }
        int n4 = arg2 + 1;
        if (n4 % 8 != 0) {
            int n5 = n4;
            n4 = n5 + (8 - n5 % 8);
        }
        byte[] byArray = new byte[n4];
        byArray[0] = (byte)arg2;
        System.arraycopy(arg0, arg1, byArray, 1, arg2);
        byte[] byArray2 = new byte[byArray.length - arg2 - 1];
        if (byArray2.length > 0) {
            this.cfr_renamed_1.nextBytes(byArray2);
            System.arraycopy(byArray2, 0, byArray, arg2 + 1, byArray2.length);
        }
        byte[] byArray3 = this.cfr_renamed_3636(byArray);
        byte[] byArray4 = new byte[byArray.length + byArray3.length];
        System.arraycopy(byArray, 0, byArray4, 0, byArray.length);
        System.arraycopy(byArray3, 0, byArray4, byArray.length, byArray3.length);
        byte[] byArray5 = new byte[byArray4.length];
        System.arraycopy(byArray4, 0, byArray5, 0, byArray4.length);
        int n6 = byArray4.length / this.cfr_renamed_91.cfr_renamed_1195();
        if (byArray4.length % this.cfr_renamed_91.cfr_renamed_1195() != 0) {
            throw new IllegalStateException(sprzkaa.cfr_renamed_9("F/|`e5d4a0d%(/n`j,g#c`d%f'|("));
        }
        this.cfr_renamed_91.cfr_renamed_1217(true, this.cfr_renamed_112);
        int n7 = n3 = 0;
        while (n7 < n6) {
            int n8 = n3 * this.cfr_renamed_91.cfr_renamed_1195();
            this.cfr_renamed_91.cfr_renamed_3064(byArray5, n8, byArray5, n8);
            n7 = ++n3;
        }
        byte[] byArray6 = new byte[this.cfr_renamed_4.length + byArray5.length];
        System.arraycopy(this.cfr_renamed_4, 0, byArray6, 0, this.cfr_renamed_4.length);
        System.arraycopy(byArray5, 0, byArray6, this.cfr_renamed_4.length, byArray5.length);
        byte[] byArray7 = new byte[byArray6.length];
        int n9 = n2 = 0;
        while (n9 < byArray6.length) {
            int n10 = n2;
            byte by = byArray6[byArray6.length - (n2 + 1)];
            byArray7[n10] = by;
            n9 = ++n2;
        }
        sprnjd sprnjd2 = new sprnjd(this.cfr_renamed_0, cfr_renamed_152);
        this.cfr_renamed_91.cfr_renamed_1217(true, sprnjd2);
        int n11 = n = 0;
        while (n11 < n6 + 1) {
            int n12 = n * this.cfr_renamed_91.cfr_renamed_1195();
            this.cfr_renamed_91.cfr_renamed_3064(byArray7, n12, byArray7, n12);
            n11 = ++n;
        }
        return byArray7;
    }

    private /* synthetic */ byte[] cfr_renamed_3636(byte[] arg0) {
        byte[] byArray = new byte[8];
        this.cfr_renamed_3.cfr_renamed_1197(arg0, 0, arg0.length);
        sprtjd sprtjd2 = this;
        sprtjd2.cfr_renamed_3.cfr_renamed_1219(sprtjd2.cfr_renamed_119, 0);
        System.arraycopy(this.cfr_renamed_119, 0, byArray, 0, 8);
        return byArray;
    }

    public sprtjd() {
        sprtjd sprtjd2 = this;
        this.cfr_renamed_3 = new sprlid();
        this.cfr_renamed_119 = new byte[20];
    }

    private /* synthetic */ boolean cfr_renamed_3637(byte[] arg0, byte[] arg1) {
        return sprzra.cfr_renamed_559(this.cfr_renamed_3636(arg0), arg1);
    }

    @Override
    public byte[] cfr_renamed_1579(byte[] arg0, int arg1, int arg2) throws sprpjd {
        int n;
        int n2;
        int n3;
        if (this.cfr_renamed_2) {
            throw new IllegalStateException(sprlik.cfr_renamed_9("\u0015\u0015/Z(\u001f/Z=\u0015)Z.\u0014,\b:\n+\u00135\u001d"));
        }
        if (arg0 == null) {
            throw new sprpjd(sprzkaa.cfr_renamed_9("F5d,(0g)f4m2(!{`k)x(m2|%p4"));
        }
        if (arg2 % this.cfr_renamed_91.cfr_renamed_1195() != 0) {
            throw new sprpjd(new StringBuilder().insert(0, sprlik.cfr_renamed_9("92\n3\u001f)\u000e>\u0002/Z5\u0015/Z6\u000f7\u000e2\n7\u001f{\u0015=Z")).append(this.cfr_renamed_91.cfr_renamed_1195()).toString());
        }
        sprnjd sprnjd2 = new sprnjd(this.cfr_renamed_0, cfr_renamed_152);
        this.cfr_renamed_91.cfr_renamed_1217(false, sprnjd2);
        byte[] byArray = new byte[arg2];
        System.arraycopy(arg0, arg1, byArray, 0, arg2);
        int n4 = n3 = 0;
        while (n4 < byArray.length / this.cfr_renamed_91.cfr_renamed_1195()) {
            n2 = n3 * this.cfr_renamed_91.cfr_renamed_1195();
            this.cfr_renamed_91.cfr_renamed_3064(byArray, n2, byArray, n2);
            n4 = ++n3;
        }
        byte[] byArray2 = new byte[byArray.length];
        int n5 = n2 = 0;
        while (n5 < byArray.length) {
            int n6 = n2;
            byte by = byArray[byArray.length - (n2 + 1)];
            byArray2[n6] = by;
            n5 = ++n2;
        }
        this.cfr_renamed_4 = new byte[8];
        byte[] byArray3 = new byte[byArray2.length - 8];
        System.arraycopy(byArray2, 0, this.cfr_renamed_4, 0, 8);
        System.arraycopy(byArray2, 8, byArray3, 0, byArray2.length - 8);
        sprtjd sprtjd2 = this;
        this.cfr_renamed_112 = new sprnjd(sprtjd2.cfr_renamed_0, sprtjd2.cfr_renamed_4);
        this.cfr_renamed_91.cfr_renamed_1217(false, this.cfr_renamed_112);
        byte[] byArray4 = new byte[byArray3.length];
        System.arraycopy(byArray3, 0, byArray4, 0, byArray3.length);
        int n7 = n = 0;
        while (n7 < byArray4.length / this.cfr_renamed_91.cfr_renamed_1195()) {
            int n8 = n * this.cfr_renamed_91.cfr_renamed_1195();
            this.cfr_renamed_91.cfr_renamed_3064(byArray4, n8, byArray4, n8);
            n7 = ++n;
        }
        byte[] byArray5 = new byte[byArray4.length - 8];
        byte[] byArray6 = new byte[8];
        System.arraycopy(byArray4, 0, byArray5, 0, byArray4.length - 8);
        System.arraycopy(byArray4, byArray4.length - 8, byArray6, 0, 8);
        if (!this.cfr_renamed_3637(byArray5, byArray6)) {
            throw new sprpjd(sprzkaa.cfr_renamed_9("\u0003`%k+{5e`a.{)l%(#a0`%z4m8|`a3(#g2z5x4m$"));
        }
        if (byArray5.length - ((byArray5[0] & 0xFF) + 1) > 7) {
            throw new sprpjd(new StringBuilder().insert(0, sprlik.cfr_renamed_9("/\u00154Z6\u001b5\u0003{\n:\u001e{\u0018\"\u000e>\t{R")).append(byArray5.length - ((byArray5[0] & 0xFF) + 1)).append(")").toString());
        }
        byte[] byArray7 = new byte[byArray5[0]];
        System.arraycopy(byArray5, 1, byArray7, 0, byArray7.length);
        return byArray7;
    }

    @Override
    public String cfr_renamed_1315() {
        return "RC2";
    }

    static {
        byte[] byArray = new byte[8];
        byArray[0] = 74;
        byArray[1] = -35;
        byArray[2] = -94;
        byArray[3] = 44;
        byArray[4] = 121;
        byArray[5] = -24;
        byArray[6] = 33;
        byArray[7] = 5;
        cfr_renamed_152 = byArray;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void cfr_renamed_1217(boolean bl, sprt sprt2) {
        sprt sprt3;
        sprt arg1;
        this.cfr_renamed_2 = bl;
        sprtjd sprtjd2 = this;
        sprtjd2.cfr_renamed_91 = new sprgnd(new sprsmd());
        if (sprt2 instanceof spraed) {
            spraed spraed2;
            spraed spraed3 = spraed2 = (spraed)arg1;
            this.cfr_renamed_1 = spraed3.cfr_renamed_1295();
            sprt3 = arg1 = spraed3.cfr_renamed_284();
        } else {
            this.cfr_renamed_1 = new SecureRandom();
            sprt3 = arg1;
        }
        if (sprt3 instanceof sprnjd) {
            this.cfr_renamed_112 = (sprnjd)arg1;
            sprtjd sprtjd3 = this;
            sprtjd3.cfr_renamed_4 = sprtjd3.cfr_renamed_112.cfr_renamed_1205();
            sprtjd3.cfr_renamed_0 = sprtjd3.cfr_renamed_112.cfr_renamed_284();
            if (!sprtjd3.cfr_renamed_2) throw new IllegalArgumentException(sprlik.cfr_renamed_9("\u0002\u0015.Z(\u00124\u000f7\u001e{\u00144\u000e{\t.\n+\u0016\"Z:\u0014{3\rZ=\u0015)Z.\u0014,\b:\n+\u00135\u001d"));
            if (this.cfr_renamed_4 != null && this.cfr_renamed_4.length == 8) return;
            throw new IllegalArgumentException(sprzkaa.cfr_renamed_9("A\u0016(){`f/|`0`g#|%|3"));
        }
        this.cfr_renamed_0 = arg1;
        if (!this.cfr_renamed_2) return;
        this.cfr_renamed_4 = new byte[8];
        this.cfr_renamed_1.nextBytes(this.cfr_renamed_4);
        this.cfr_renamed_112 = new sprnjd(this.cfr_renamed_0, this.cfr_renamed_4);
    }
}

