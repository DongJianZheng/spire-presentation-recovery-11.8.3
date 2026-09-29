/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.data.table.DataColumn;
import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprgnd;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprlid;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprrld;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprwzj;
import com.spire.presentation.packages.spryn;
import com.spire.presentation.packages.sprzra;
import java.security.SecureRandom;

public class sprvjd
implements spryn {
    private boolean cfr_renamed_112;
    private sprnjd cfr_renamed_119;
    private byte[] cfr_renamed_91;
    public byte[] cfr_renamed_0;
    public sprlc cfr_renamed_1;
    private sprgnd cfr_renamed_2;
    private static final byte[] cfr_renamed_3;
    private sprnld cfr_renamed_4;

    private static /* synthetic */ byte[] cfr_renamed_537(byte[] arg0) {
        int n;
        byte[] byArray = new byte[arg0.length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n;
            byte by = arg0[arg0.length - (n + 1)];
            byArray[n3] = by;
            n2 = ++n;
        }
        return byArray;
    }

    private /* synthetic */ byte[] cfr_renamed_3636(byte[] arg0) {
        byte[] byArray = new byte[8];
        this.cfr_renamed_1.cfr_renamed_1197(arg0, 0, arg0.length);
        sprvjd sprvjd2 = this;
        sprvjd2.cfr_renamed_1.cfr_renamed_1219(sprvjd2.cfr_renamed_0, 0);
        System.arraycopy(this.cfr_renamed_0, 0, byArray, 0, 8);
        return byArray;
    }

    @Override
    public void cfr_renamed_1217(boolean bl, sprt sprt2) {
        sprt sprt3;
        SecureRandom secureRandom;
        sprt arg1;
        this.cfr_renamed_112 = bl;
        sprvjd sprvjd2 = this;
        sprvjd2.cfr_renamed_2 = new sprgnd(new sprrld());
        if (sprt2 instanceof spraed) {
            spraed spraed2 = (spraed)arg1;
            arg1 = spraed2.cfr_renamed_284();
            secureRandom = spraed2.cfr_renamed_1295();
            sprt3 = arg1;
        } else {
            secureRandom = new SecureRandom();
            sprt3 = arg1;
        }
        if (sprt3 instanceof sprnld) {
            this.cfr_renamed_4 = (sprnld)arg1;
            if (this.cfr_renamed_112) {
                this.cfr_renamed_91 = new byte[8];
                secureRandom.nextBytes(this.cfr_renamed_91);
                sprvjd sprvjd3 = this;
                this.cfr_renamed_119 = new sprnjd(sprvjd3.cfr_renamed_4, sprvjd3.cfr_renamed_91);
                return;
            }
        } else if (arg1 instanceof sprnjd) {
            this.cfr_renamed_119 = (sprnjd)arg1;
            sprvjd sprvjd4 = this;
            sprvjd4.cfr_renamed_91 = sprvjd4.cfr_renamed_119.cfr_renamed_1205();
            sprvjd4.cfr_renamed_4 = (sprnld)sprvjd4.cfr_renamed_119.cfr_renamed_284();
            if (this.cfr_renamed_112) {
                if (this.cfr_renamed_91 == null || this.cfr_renamed_91.length != 8) {
                    throw new IllegalArgumentException(DataColumn.cfr_renamed_9("8$Q\u001b\u0002R\u001f\u001d\u0005RIR\u001e\u0011\u0005\u0017\u0005\u0001"));
                }
            } else {
                throw new IllegalArgumentException(sprwzj.cfr_renamed_9("7\u001b\u001bT\u001d\u001c\u0001\u0001\u0002\u0010N\u001a\u0001\u0000N\u0007\u001b\u0004\u001e\u0018\u0017T\u000f\u001aN=8T\b\u001b\u001cT\u001b\u001a\u0019\u0006\u000f\u0004\u001e\u001d\u0000\u0013"));
            }
        }
    }

    @Override
    public String cfr_renamed_1315() {
        return DataColumn.cfr_renamed_9("57\"\u0017\u0015\u0017");
    }

    @Override
    public byte[] cfr_renamed_1579(byte[] arg0, int arg1, int arg2) throws sprpjd {
        int n;
        int n2;
        if (this.cfr_renamed_112) {
            throw new IllegalStateException(sprwzj.cfr_renamed_9(" \u001b\u001aT\u001d\u0011\u001aT\b\u001b\u001cT\u001b\u001a\u0019\u0006\u000f\u0004\u001e\u001d\u0000\u0013"));
        }
        if (arg0 == null) {
            throw new sprpjd(DataColumn.cfr_renamed_9("?\u0007\u001d\u001eQ\u0002\u001e\u001b\u001f\u0006\u0014\u0000Q\u0013\u0002R\u0012\u001b\u0001\u001a\u0014\u0000\u0005\u0017\t\u0006"));
        }
        int n3 = this.cfr_renamed_2.cfr_renamed_1195();
        if (arg2 % n3 != 0) {
            throw new sprpjd(new StringBuilder().insert(0, sprwzj.cfr_renamed_9("7\u0007\u0004\u0006\u0011\u001c\u0000\u000b\f\u001aT\u0000\u001b\u001aT\u0003\u0001\u0002\u0000\u0007\u0004\u0002\u0011N\u001b\bT")).append(n3).toString());
        }
        sprnjd sprnjd2 = new sprnjd(this.cfr_renamed_4, cfr_renamed_3);
        this.cfr_renamed_2.cfr_renamed_1217(false, sprnjd2);
        byte[] byArray = new byte[arg2];
        int n4 = n2 = 0;
        while (n4 != arg2) {
            this.cfr_renamed_2.cfr_renamed_3064(arg0, arg1 + n2, byArray, n2);
            n4 = n2 += n3;
        }
        byte[] byArray2 = sprvjd.cfr_renamed_537(byArray);
        this.cfr_renamed_91 = new byte[8];
        byte[] byArray3 = new byte[byArray2.length - 8];
        System.arraycopy(byArray2, 0, this.cfr_renamed_91, 0, 8);
        System.arraycopy(byArray2, 8, byArray3, 0, byArray2.length - 8);
        sprvjd sprvjd2 = this;
        this.cfr_renamed_119 = new sprnjd(sprvjd2.cfr_renamed_4, sprvjd2.cfr_renamed_91);
        this.cfr_renamed_2.cfr_renamed_1217(false, this.cfr_renamed_119);
        byte[] byArray4 = new byte[byArray3.length];
        int n5 = n = 0;
        while (n5 != byArray4.length) {
            int n6 = n;
            this.cfr_renamed_2.cfr_renamed_3064(byArray3, n6, byArray4, n6);
            n5 = n += n3;
        }
        byte[] byArray5 = new byte[byArray4.length - 8];
        byte[] byArray6 = new byte[8];
        System.arraycopy(byArray4, 0, byArray5, 0, byArray4.length - 8);
        System.arraycopy(byArray4, byArray4.length - 8, byArray6, 0, 8);
        if (!this.cfr_renamed_3637(byArray5, byArray6)) {
            throw new sprpjd(DataColumn.cfr_renamed_9("1\u0019\u0017\u0012\u0019\u0002\u0007\u001cR\u0018\u001c\u0002\u001b\u0015\u0017Q\u0011\u0018\u0002\u0019\u0017\u0003\u0006\u0014\n\u0005R\u0018\u0001Q\u0011\u001e\u0000\u0003\u0007\u0001\u0006\u0014\u0016"));
        }
        return byArray5;
    }

    public sprvjd() {
        sprvjd sprvjd2 = this;
        this.cfr_renamed_1 = new sprlid();
        this.cfr_renamed_0 = new byte[20];
    }

    private /* synthetic */ boolean cfr_renamed_3637(byte[] arg0, byte[] arg1) {
        return sprzra.cfr_renamed_559(this.cfr_renamed_3636(arg0), arg1);
    }

    @Override
    public byte[] cfr_renamed_1575(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2;
        if (!this.cfr_renamed_112) {
            throw new IllegalStateException(sprwzj.cfr_renamed_9(" \u001b\u001aT\u0007\u001a\u0007\u0000\u0007\u0015\u0002\u001d\u0014\u0011\nT\b\u001b\u001cT\u0019\u0006\u000f\u0004\u001e\u001d\u0000\u0013"));
        }
        byte[] byArray = new byte[arg2];
        System.arraycopy(arg0, arg1, byArray, 0, arg2);
        byte[] byArray2 = this.cfr_renamed_3636(byArray);
        byte[] byArray3 = new byte[byArray.length + byArray2.length];
        System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
        System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
        int n3 = this.cfr_renamed_2.cfr_renamed_1195();
        if (byArray3.length % n3 != 0) {
            throw new IllegalStateException(DataColumn.cfr_renamed_9("?\u001d\u0005R\u001c\u0007\u001d\u0006\u0018\u0002\u001d\u0017Q\u001d\u0017R\u0013\u001e\u001e\u0011\u001aR\u001d\u0017\u001f\u0015\u0005\u001a"));
        }
        this.cfr_renamed_2.cfr_renamed_1217(true, this.cfr_renamed_119);
        byte[] byArray4 = new byte[byArray3.length];
        int n4 = n2 = 0;
        while (n4 != byArray3.length) {
            int n5 = n2;
            this.cfr_renamed_2.cfr_renamed_3064(byArray3, n5, byArray4, n5);
            n4 = n2 += n3;
        }
        byte[] byArray5 = new byte[this.cfr_renamed_91.length + byArray4.length];
        System.arraycopy(this.cfr_renamed_91, 0, byArray5, 0, this.cfr_renamed_91.length);
        System.arraycopy(byArray4, 0, byArray5, this.cfr_renamed_91.length, byArray4.length);
        byte[] byArray6 = sprvjd.cfr_renamed_537(byArray5);
        sprnjd sprnjd2 = new sprnjd(this.cfr_renamed_4, cfr_renamed_3);
        this.cfr_renamed_2.cfr_renamed_1217(true, sprnjd2);
        int n6 = n = 0;
        while (n6 != byArray6.length) {
            this.cfr_renamed_2.cfr_renamed_3064(byArray6, n, byArray6, n);
            n6 = n += n3;
        }
        return byArray6;
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
        cfr_renamed_3 = byArray;
    }
}

