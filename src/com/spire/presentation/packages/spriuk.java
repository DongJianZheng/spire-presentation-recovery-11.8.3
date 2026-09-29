/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhqk;
import com.spire.presentation.packages.sprkkk;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprlfg;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpzk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprwvd;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryy;
import java.security.SecureRandom;

public class spriuk
implements spryy {
    private sprhqk cfr_renamed_152;
    private static final byte[] cfr_renamed_112;
    private byte[] cfr_renamed_119;
    public sprgf cfr_renamed_91 = sprkkk.cfr_renamed_5701();
    private sprkpk cfr_renamed_0;
    private boolean cfr_renamed_1;
    private sprbj cfr_renamed_2;
    public byte[] cfr_renamed_3 = new byte[20];
    private SecureRandom cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_1575(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2;
        int n3;
        if (!this.cfr_renamed_1) {
            throw new IllegalStateException(sprwvd.cfr_renamed_9("`\u000eZAG\u000fG\u0015G\u0000B\bT\u0004JAH\u000e\\AY\u0013O\u0011^\b@\u0006"));
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
            this.cfr_renamed_4.nextBytes(byArray2);
            System.arraycopy(byArray2, 0, byArray, arg2 + 1, byArray2.length);
        }
        byte[] byArray3 = this.cfr_renamed_3636(byArray);
        byte[] byArray4 = new byte[byArray.length + byArray3.length];
        System.arraycopy(byArray, 0, byArray4, 0, byArray.length);
        System.arraycopy(byArray3, 0, byArray4, byArray.length, byArray3.length);
        byte[] byArray5 = new byte[byArray4.length];
        System.arraycopy(byArray4, 0, byArray5, 0, byArray4.length);
        int n6 = byArray4.length / this.cfr_renamed_152.cfr_renamed_1195();
        if (byArray4.length % this.cfr_renamed_152.cfr_renamed_1195() != 0) {
            throw new IllegalStateException(sprlfg.cfr_renamed_9("<m\u0006\"\u001fw\u001ev\u001br\u001egRm\u0014\"\u0010n\u001da\u0019\"\u001eg\u001ce\u0006j"));
        }
        this.cfr_renamed_152.cfr_renamed_5535(true, this.cfr_renamed_0);
        int n7 = n3 = 0;
        while (n7 < n6) {
            int n8 = n3 * this.cfr_renamed_152.cfr_renamed_1195();
            this.cfr_renamed_152.cfr_renamed_3064(byArray5, n8, byArray5, n8);
            n7 = ++n3;
        }
        byte[] byArray6 = new byte[this.cfr_renamed_119.length + byArray5.length];
        System.arraycopy(this.cfr_renamed_119, 0, byArray6, 0, this.cfr_renamed_119.length);
        System.arraycopy(byArray5, 0, byArray6, this.cfr_renamed_119.length, byArray5.length);
        byte[] byArray7 = new byte[byArray6.length];
        int n9 = n2 = 0;
        while (n9 < byArray6.length) {
            int n10 = n2;
            byte by = byArray6[byArray6.length - (n2 + 1)];
            byArray7[n10] = by;
            n9 = ++n2;
        }
        sprkpk sprkpk2 = new sprkpk(this.cfr_renamed_2, cfr_renamed_112);
        this.cfr_renamed_152.cfr_renamed_5535(true, sprkpk2);
        int n11 = n = 0;
        while (n11 < n6 + 1) {
            int n12 = n * this.cfr_renamed_152.cfr_renamed_1195();
            this.cfr_renamed_152.cfr_renamed_3064(byArray7, n12, byArray7, n12);
            n11 = ++n;
        }
        return byArray7;
    }

    private /* synthetic */ boolean cfr_renamed_3637(byte[] arg0, byte[] arg1) {
        return sproze.cfr_renamed_559(this.cfr_renamed_3636(arg0), arg1);
    }

    @Override
    public String cfr_renamed_1315() {
        return "RC2";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) {
        sprbj sprbj3;
        sprbj arg1;
        this.cfr_renamed_1 = bl;
        spriuk spriuk2 = this;
        spriuk2.cfr_renamed_152 = new sprhqk(new sprpzk());
        if (sprbj2 instanceof sprbgk) {
            sprbgk sprbgk2;
            sprbgk sprbgk3 = sprbgk2 = (sprbgk)arg1;
            this.cfr_renamed_4 = sprbgk3.cfr_renamed_1295();
            sprbj3 = arg1 = sprbgk3.cfr_renamed_284();
        } else {
            this.cfr_renamed_4 = sprybl.cfr_renamed_2794();
            sprbj3 = arg1;
        }
        if (sprbj3 instanceof sprkpk) {
            this.cfr_renamed_0 = (sprkpk)arg1;
            spriuk spriuk3 = this;
            spriuk3.cfr_renamed_119 = spriuk3.cfr_renamed_0.cfr_renamed_1205();
            spriuk3.cfr_renamed_2 = spriuk3.cfr_renamed_0.cfr_renamed_284();
            if (!spriuk3.cfr_renamed_1) throw new IllegalArgumentException(sprlfg.cfr_renamed_9("+m\u0007\"\u0001j\u001dw\u001efRl\u001dvRq\u0007r\u0002n\u000b\"\u0013lRK$\"\u0014m\u0000\"\u0007l\u0005p\u0013r\u0002k\u001ce"));
            if (this.cfr_renamed_119 != null && this.cfr_renamed_119.length == 8) return;
            throw new IllegalArgumentException(sprwvd.cfr_renamed_9("g7\u000e\b]A@\u000eZA\u0016AA\u0002Z\u0004Z\u0012"));
        }
        this.cfr_renamed_2 = arg1;
        if (!this.cfr_renamed_1) return;
        this.cfr_renamed_119 = new byte[8];
        this.cfr_renamed_4.nextBytes(this.cfr_renamed_119);
        this.cfr_renamed_0 = new sprkpk(this.cfr_renamed_2, this.cfr_renamed_119);
    }

    @Override
    public byte[] cfr_renamed_1579(byte[] arg0, int arg1, int arg2) throws sprull {
        int n;
        int n2;
        int n3;
        if (this.cfr_renamed_1) {
            throw new IllegalStateException(sprwvd.cfr_renamed_9("`\u000eZA]\u0004ZAH\u000e\\A[\u000fY\u0013O\u0011^\b@\u0006"));
        }
        if (arg0 == null) {
            throw new sprull(sprlfg.cfr_renamed_9("<w\u001enRr\u001dk\u001cv\u0017pRc\u0001\"\u0011k\u0002j\u0017p\u0006g\nv"));
        }
        if (arg2 % this.cfr_renamed_152.cfr_renamed_1195() != 0) {
            throw new sprull(new StringBuilder().insert(0, sprwvd.cfr_renamed_9("\"G\u0011F\u0004\\\u0015K\u0019ZA@\u000eZAC\u0014B\u0015G\u0011B\u0004\u000e\u000eHA")).append(this.cfr_renamed_152.cfr_renamed_1195()).toString());
        }
        sprkpk sprkpk2 = new sprkpk(this.cfr_renamed_2, cfr_renamed_112);
        this.cfr_renamed_152.cfr_renamed_5535(false, sprkpk2);
        byte[] byArray = new byte[arg2];
        System.arraycopy(arg0, arg1, byArray, 0, arg2);
        int n4 = n3 = 0;
        while (n4 < byArray.length / this.cfr_renamed_152.cfr_renamed_1195()) {
            n2 = n3 * this.cfr_renamed_152.cfr_renamed_1195();
            this.cfr_renamed_152.cfr_renamed_3064(byArray, n2, byArray, n2);
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
        this.cfr_renamed_119 = new byte[8];
        byte[] byArray3 = new byte[byArray2.length - 8];
        System.arraycopy(byArray2, 0, this.cfr_renamed_119, 0, 8);
        System.arraycopy(byArray2, 8, byArray3, 0, byArray2.length - 8);
        spriuk spriuk2 = this;
        this.cfr_renamed_0 = new sprkpk(spriuk2.cfr_renamed_2, spriuk2.cfr_renamed_119);
        this.cfr_renamed_152.cfr_renamed_5535(false, this.cfr_renamed_0);
        byte[] byArray4 = new byte[byArray3.length];
        System.arraycopy(byArray3, 0, byArray4, 0, byArray3.length);
        int n7 = n = 0;
        while (n7 < byArray4.length / this.cfr_renamed_152.cfr_renamed_1195()) {
            int n8 = n * this.cfr_renamed_152.cfr_renamed_1195();
            this.cfr_renamed_152.cfr_renamed_3064(byArray4, n8, byArray4, n8);
            n7 = ++n;
        }
        byte[] byArray5 = new byte[byArray4.length - 8];
        byte[] byArray6 = new byte[8];
        System.arraycopy(byArray4, 0, byArray5, 0, byArray4.length - 8);
        System.arraycopy(byArray4, byArray4.length - 8, byArray6, 0, 8);
        if (!this.cfr_renamed_3637(byArray5, byArray6)) {
            throw new sprull(sprlfg.cfr_renamed_9("A\u001ag\u0011i\u0001w\u001f\"\u001bl\u0001k\u0016gRa\u001br\u001ag\u0000v\u0017z\u0006\"\u001bqRa\u001dp\u0000w\u0002v\u0017f"));
        }
        if (byArray5.length - ((byArray5[0] & 0xFF) + 1) > 7) {
            throw new sprull(new StringBuilder().insert(0, sprwvd.cfr_renamed_9("Z\u000eAAC\u0000@\u0018\u000e\u0011O\u0005\u000e\u0003W\u0015K\u0012\u000eI")).append(byArray5.length - ((byArray5[0] & 0xFF) + 1)).append(")").toString());
        }
        byte[] byArray7 = new byte[byArray5[0]];
        System.arraycopy(byArray5, 1, byArray7, 0, byArray7.length);
        return byArray7;
    }

    private /* synthetic */ byte[] cfr_renamed_3636(byte[] arg0) {
        byte[] byArray = new byte[8];
        this.cfr_renamed_91.cfr_renamed_1197(arg0, 0, arg0.length);
        spriuk spriuk2 = this;
        spriuk2.cfr_renamed_91.cfr_renamed_1219(spriuk2.cfr_renamed_3, 0);
        System.arraycopy(this.cfr_renamed_3, 0, byArray, 0, 8);
        return byArray;
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
        cfr_renamed_112 = byArray;
    }
}

