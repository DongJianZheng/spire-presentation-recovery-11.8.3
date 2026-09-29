/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreid;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprqk;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spruvy;
import com.spire.presentation.packages.sprvoo;

public class sprgfd
implements sprqk {
    private boolean cfr_renamed_152;
    private static final int cfr_renamed_112 = 5;
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private int[] cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private int[] cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_3672() {
        sprgfd sprgfd2 = this;
        sprgfd2.cfr_renamed_91 = sprgfd2.cfr_renamed_3673();
        sprgfd2.cfr_renamed_3[0] = (byte)this.cfr_renamed_91;
        sprgfd2.cfr_renamed_3[1] = (byte)(this.cfr_renamed_91 >> 8);
        sprgfd2.cfr_renamed_0 = sprgfd2.cfr_renamed_3674(sprgfd2.cfr_renamed_0, this.cfr_renamed_3675() ^ this.cfr_renamed_4[0]);
        sprgfd2.cfr_renamed_4 = sprgfd2.cfr_renamed_3674(sprgfd2.cfr_renamed_4, this.cfr_renamed_3676());
    }

    private /* synthetic */ int cfr_renamed_3673() {
        sprgfd sprgfd2 = this;
        sprgfd sprgfd3 = this;
        int n = sprgfd2.cfr_renamed_0[0] >>> 1 | sprgfd3.cfr_renamed_0[1] << 15;
        int n2 = sprgfd2.cfr_renamed_0[0] >>> 2 | this.cfr_renamed_0[1] << 14;
        int n3 = sprgfd3.cfr_renamed_0[0] >>> 4 | this.cfr_renamed_0[1] << 12;
        int n4 = sprgfd2.cfr_renamed_0[0] >>> 10 | this.cfr_renamed_0[1] << 6;
        int n5 = sprgfd2.cfr_renamed_0[1] >>> 15 | this.cfr_renamed_0[2] << 1;
        int n6 = sprgfd2.cfr_renamed_0[2] >>> 11 | this.cfr_renamed_0[3] << 5;
        int n7 = sprgfd2.cfr_renamed_0[3] >>> 8 | this.cfr_renamed_0[4] << 8;
        int n8 = sprgfd2.cfr_renamed_0[3] >>> 15 | this.cfr_renamed_0[4] << 1;
        int n9 = sprgfd2.cfr_renamed_4[0] >>> 3 | this.cfr_renamed_4[1] << 13;
        int n10 = sprgfd2.cfr_renamed_4[1] >>> 9 | this.cfr_renamed_4[2] << 7;
        int n11 = sprgfd2.cfr_renamed_4[2] >>> 14 | this.cfr_renamed_4[3] << 2;
        int n12 = sprgfd2.cfr_renamed_4[4];
        return (n10 ^ n8 ^ n9 & n12 ^ n11 & n12 ^ n12 & n8 ^ n9 & n10 & n11 ^ n9 & n11 & n12 ^ n9 & n11 & n8 ^ n10 & n11 & n8 ^ n11 & n12 & n8 ^ n ^ n2 ^ n3 ^ n4 ^ n5 ^ n6 ^ n7) & 0xFFFF;
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprjkd {
        int n;
        if (!this.cfr_renamed_152) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(spruvy.cfr_renamed_9("\u0007IHS\u0007NINSNFKNTBC")).toString());
        }
        if (arg1 + arg2 > arg0.length) {
            throw new sprjkd(sprvoo.cfr_renamed_9(">4'/#z5/1<2(w.85w)?5%."));
        }
        if (arg4 + arg2 > arg3.length) {
            throw new spreid(spruvy.cfr_renamed_9("HRSWRS\u0007ERAABU\u0007SHH\u0007TOHUS"));
        }
        int n2 = n = 0;
        while (n2 < arg2) {
            int n3 = arg4 + n;
            byte by = (byte)(arg0[arg1 + n] ^ this.cfr_renamed_3677());
            arg3[n3] = by;
            n2 = ++n;
        }
        return arg2;
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) throws IllegalArgumentException {
        if (!(arg1 instanceof sprnjd)) {
            throw new IllegalArgumentException(sprvoo.cfr_renamed_9("\u001d%;>4w,fz\u001e4>.w*6(672.2($z:/$.w399;/3?w;9z\u001e\f"));
        }
        sprnjd sprnjd2 = (sprnjd)arg1;
        byte[] byArray = sprnjd2.cfr_renamed_1205();
        if (byArray == null || byArray.length != 8) {
            throw new IllegalArgumentException(spruvy.cfr_renamed_9("`UFNI\u0007Q\u0016\u0007UBVRNUBT\u0007B_FDSK^\u0007\u001f\u0007E^SBT\u0007HA\u0007nq"));
        }
        if (!(sprnjd2.cfr_renamed_284() instanceof sprnld)) {
            throw new IllegalArgumentException(sprvoo.cfr_renamed_9("\u001d%;>4w,fz\u001e4>.w*6(672.2($z:/$.w399;/3?w;w12#"));
        }
        sprnld sprnld2 = (sprnld)sprnjd2.cfr_renamed_284();
        this.cfr_renamed_2 = new byte[sprnld2.cfr_renamed_1521().length];
        this.cfr_renamed_1 = new byte[sprnld2.cfr_renamed_1521().length];
        sprgfd sprgfd2 = this;
        this.cfr_renamed_4 = new int[5];
        sprgfd2.cfr_renamed_0 = new int[5];
        sprgfd2.cfr_renamed_3 = new byte[2];
        System.arraycopy(byArray, 0, this.cfr_renamed_2, 0, byArray.length);
        System.arraycopy(sprnld2.cfr_renamed_1521(), 0, this.cfr_renamed_1, 0, sprnld2.cfr_renamed_1521().length);
        this.cfr_renamed_41();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int[] cfr_renamed_3674(int[] nArray, int n) {
        void arg1;
        void arg0;
        void v0 = arg0;
        void v1 = arg0;
        v1[0] = v1[1];
        void v2 = arg0;
        v2[1] = v2[2];
        void v3 = arg0;
        v3[2] = v3[3];
        v0[3] = arg0[4];
        v0[4] = arg1;
        return v0;
    }

    public sprgfd() {
        sprgfd sprgfd2 = this;
        sprgfd2.cfr_renamed_119 = 2;
        sprgfd2.cfr_renamed_152 = false;
    }

    private /* synthetic */ int cfr_renamed_3675() {
        sprgfd sprgfd2 = this;
        int n = sprgfd2.cfr_renamed_0[0];
        sprgfd sprgfd3 = this;
        int n2 = sprgfd2.cfr_renamed_0[0] >>> 9 | sprgfd3.cfr_renamed_0[1] << 7;
        int n3 = sprgfd3.cfr_renamed_0[0] >>> 14 | this.cfr_renamed_0[1] << 2;
        int n4 = sprgfd2.cfr_renamed_0[0] >>> 15 | this.cfr_renamed_0[1] << 1;
        int n5 = sprgfd2.cfr_renamed_0[1] >>> 5 | this.cfr_renamed_0[2] << 11;
        int n6 = sprgfd2.cfr_renamed_0[1] >>> 12 | this.cfr_renamed_0[2] << 4;
        int n7 = sprgfd2.cfr_renamed_0[2] >>> 1 | this.cfr_renamed_0[3] << 15;
        int n8 = sprgfd2.cfr_renamed_0[2] >>> 5 | this.cfr_renamed_0[3] << 11;
        int n9 = sprgfd2.cfr_renamed_0[2] >>> 13 | this.cfr_renamed_0[3] << 3;
        int n10 = sprgfd2.cfr_renamed_0[3] >>> 4 | this.cfr_renamed_0[4] << 12;
        int n11 = sprgfd2.cfr_renamed_0[3] >>> 12 | this.cfr_renamed_0[4] << 4;
        int n12 = sprgfd2.cfr_renamed_0[3] >>> 14 | this.cfr_renamed_0[4] << 2;
        int n13 = sprgfd2.cfr_renamed_0[3] >>> 15 | this.cfr_renamed_0[4] << 1;
        return (n12 ^ n11 ^ n10 ^ n9 ^ n8 ^ n7 ^ n6 ^ n5 ^ n3 ^ n2 ^ n ^ n13 & n11 ^ n8 & n7 ^ n4 & n2 ^ n11 & n10 & n9 ^ n7 & n6 & n5 ^ n13 & n9 & n6 & n2 ^ n11 & n10 & n8 & n7 ^ n13 & n11 & n5 & n4 ^ n13 & n11 & n10 & n9 & n8 ^ n7 & n6 & n5 & n4 & n2 ^ n10 & n9 & n8 & n7 & n6 & n5) & 0xFFFF;
    }

    @Override
    public void cfr_renamed_41() {
        sprgfd sprgfd2 = this;
        sprgfd2.cfr_renamed_119 = 2;
        sprgfd sprgfd3 = this;
        sprgfd3.cfr_renamed_3471(sprgfd2.cfr_renamed_1, sprgfd3.cfr_renamed_2);
        sprgfd2.cfr_renamed_3678();
    }

    @Override
    public byte cfr_renamed_3243(byte arg0) {
        if (!this.cfr_renamed_152) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(spruvy.cfr_renamed_9("\u0007IHS\u0007NINSNFKNTBC")).toString());
        }
        return (byte)(arg0 ^ this.cfr_renamed_3677());
    }

    private /* synthetic */ int cfr_renamed_3676() {
        sprgfd sprgfd2 = this;
        int n = sprgfd2.cfr_renamed_4[0];
        sprgfd sprgfd3 = this;
        int n2 = sprgfd2.cfr_renamed_4[0] >>> 13 | sprgfd3.cfr_renamed_4[1] << 3;
        int n3 = sprgfd3.cfr_renamed_4[1] >>> 7 | this.cfr_renamed_4[2] << 9;
        int n4 = sprgfd2.cfr_renamed_4[2] >>> 6 | this.cfr_renamed_4[3] << 10;
        int n5 = sprgfd2.cfr_renamed_4[3] >>> 3 | this.cfr_renamed_4[4] << 13;
        int n6 = sprgfd2.cfr_renamed_4[3] >>> 14 | this.cfr_renamed_4[4] << 2;
        return (n ^ n2 ^ n3 ^ n4 ^ n5 ^ n6) & 0xFFFF;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3471(byte[] byArray, byte[] byArray2) {
        int n;
        void arg0;
        void arg1;
        void v0 = arg1;
        v0[8] = -1;
        v0[9] = -1;
        sprgfd sprgfd2 = this;
        sprgfd2.cfr_renamed_1 = arg0;
        sprgfd2.cfr_renamed_2 = v0;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_0.length) {
            sprgfd sprgfd3 = this;
            this.cfr_renamed_0[n] = (sprgfd3.cfr_renamed_1[n2 + 1] << 8 | this.cfr_renamed_1[n2] & 0xFF) & 0xFFFF;
            int n4 = (this.cfr_renamed_2[n2 + 1] << 8 | this.cfr_renamed_2[n2] & 0xFF) & 0xFFFF;
            n2 += 2;
            sprgfd3.cfr_renamed_4[n] = n4;
            n3 = ++n;
        }
    }

    private /* synthetic */ byte cfr_renamed_3677() {
        if (this.cfr_renamed_119 > 1) {
            this.cfr_renamed_3672();
            this.cfr_renamed_119 = 0;
        }
        return this.cfr_renamed_3[this.cfr_renamed_119++];
    }

    @Override
    public String cfr_renamed_1315() {
        return sprvoo.cfr_renamed_9("\u0010(639z!k");
    }

    private /* synthetic */ void cfr_renamed_3678() {
        int n;
        int n2 = n = 0;
        while (n2 < 10) {
            sprgfd sprgfd2 = this;
            sprgfd2.cfr_renamed_91 = sprgfd2.cfr_renamed_3673();
            sprgfd2.cfr_renamed_0 = sprgfd2.cfr_renamed_3674(sprgfd2.cfr_renamed_0, this.cfr_renamed_3675() ^ this.cfr_renamed_4[0] ^ this.cfr_renamed_91);
            sprgfd2.cfr_renamed_4 = sprgfd2.cfr_renamed_3674(sprgfd2.cfr_renamed_4, this.cfr_renamed_3676() ^ this.cfr_renamed_91);
            n2 = ++n;
        }
        this.cfr_renamed_152 = true;
    }
}

