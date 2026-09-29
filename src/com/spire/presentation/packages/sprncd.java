/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcnd;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprlpb;
import com.spire.presentation.packages.sprlyy;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprt;

public class sprncd
extends sprcnd {
    public int cfr_renamed_93;
    private final sprff cfr_renamed_86;
    public static final int cfr_renamed_152 = 0x1010101;
    public boolean cfr_renamed_112 = true;
    public int cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private final int cfr_renamed_1;
    private int cfr_renamed_2;
    public static final int cfr_renamed_3 = 0x1010104;
    private byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_3064(byte[] byArray, int n, byte[] byArray2, int n2) throws sprjkd, IllegalStateException {
        void arg3;
        void arg2;
        void arg1;
        sprncd sprncd2 = this;
        sprncd2.cfr_renamed_505(byArray, (int)arg1, sprncd2.cfr_renamed_1, (byte[])arg2, (int)arg3);
        return sprncd2.cfr_renamed_1;
    }

    @Override
    public byte cfr_renamed_3272(byte arg0) {
        if (this.cfr_renamed_2 == 0) {
            if (this.cfr_renamed_112) {
                this.cfr_renamed_112 = false;
                this.cfr_renamed_86.cfr_renamed_3064(this.cfr_renamed_4, 0, this.cfr_renamed_0, 0);
                sprncd sprncd2 = this;
                sprncd2.cfr_renamed_119 = sprncd2.cfr_renamed_3409(sprncd2.cfr_renamed_0, 0);
                sprncd2.cfr_renamed_93 = sprncd2.cfr_renamed_3409(sprncd2.cfr_renamed_0, 4);
            }
            sprncd sprncd3 = this;
            sprncd3.cfr_renamed_119 += 0x1010101;
            sprncd3.cfr_renamed_93 += 0x1010104;
            sprncd3.cfr_renamed_3410(sprncd3.cfr_renamed_119, this.cfr_renamed_4, 0);
            sprncd3.cfr_renamed_3410(sprncd3.cfr_renamed_93, this.cfr_renamed_4, 4);
            sprncd3.cfr_renamed_86.cfr_renamed_3064(this.cfr_renamed_4, 0, this.cfr_renamed_0, 0);
        }
        byte by = (byte)(this.cfr_renamed_0[this.cfr_renamed_2++] ^ arg0);
        sprncd sprncd4 = this;
        if (sprncd4.cfr_renamed_2 == sprncd4.cfr_renamed_1) {
            this.cfr_renamed_2 = 0;
            sprncd sprncd5 = this;
            System.arraycopy(this.cfr_renamed_4, sprncd5.cfr_renamed_1, sprncd5.cfr_renamed_4, 0, this.cfr_renamed_4.length - this.cfr_renamed_1);
            sprncd sprncd6 = this;
            System.arraycopy(this.cfr_renamed_0, 0, sprncd6.cfr_renamed_4, sprncd6.cfr_renamed_4.length - this.cfr_renamed_1, this.cfr_renamed_1);
        }
        return by;
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprncd(sprff sprff2) {
        super((sprff)arg0);
        void arg0;
        this.cfr_renamed_86 = arg0;
        this.cfr_renamed_1 = sprff2.cfr_renamed_1195();
        if (this.cfr_renamed_1 != 8) {
            throw new IllegalArgumentException(sprlpb.cfr_renamed_9("=9.(Z\u0015\u0014\u0016\u0003Z\u001c\u0015\bZLNZ\u0018\u0013\u000eZ\u0018\u0016\u0015\u0019\u0011Z\u0019\u0013\n\u0012\u001f\b\t"));
        }
        sprncd sprncd2 = this;
        void v1 = arg0;
        this.cfr_renamed_91 = new byte[arg0.cfr_renamed_1195()];
        sprncd2.cfr_renamed_4 = new byte[v1.cfr_renamed_1195()];
        sprncd2.cfr_renamed_0 = new byte[v1.cfr_renamed_1195()];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_1217(boolean bl, sprt sprt2) throws IllegalArgumentException {
        void arg1;
        sprncd sprncd2 = this;
        this.cfr_renamed_112 = true;
        sprncd2.cfr_renamed_119 = 0;
        sprncd2.cfr_renamed_93 = 0;
        if (sprt2 instanceof sprnjd) {
            sprnjd sprnjd2 = (sprnjd)arg1;
            byte[] byArray = sprnjd2.cfr_renamed_1205();
            if (byArray.length < this.cfr_renamed_91.length) {
                int n;
                sprncd sprncd3 = this;
                System.arraycopy(byArray, 0, sprncd3.cfr_renamed_91, sprncd3.cfr_renamed_91.length - byArray.length, byArray.length);
                int n2 = n = 0;
                while (n2 < this.cfr_renamed_91.length - byArray.length) {
                    this.cfr_renamed_91[n++] = 0;
                    n2 = n;
                }
            } else {
                System.arraycopy(byArray, 0, this.cfr_renamed_91, 0, this.cfr_renamed_91.length);
            }
            this.cfr_renamed_41();
            if (sprnjd2.cfr_renamed_284() != null) {
                this.cfr_renamed_86.cfr_renamed_1217(true, sprnjd2.cfr_renamed_284());
                return;
            }
        } else {
            this.cfr_renamed_41();
            if (arg1 != null) {
                this.cfr_renamed_86.cfr_renamed_1217(true, (sprt)arg1);
            }
        }
    }

    private /* synthetic */ int cfr_renamed_3409(byte[] arg0, int arg1) {
        return (arg0[arg1 + 3] << 24 & 0xFF000000) + (arg0[arg1 + 2] << 16 & 0xFF0000) + (arg0[arg1 + 1] << 8 & 0xFF00) + (arg0[arg1] & 0xFF);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3410(int n, byte[] byArray, int n2) {
        void arg0;
        void arg2;
        void arg1;
        void v0 = arg1;
        void v1 = arg2;
        arg1[arg2 + 3] = (byte)(arg0 >>> 24);
        arg1[v1 + 2] = (byte)(arg0 >>> 16);
        v0[v1 + true] = (byte)(arg0 >>> 8);
        v0[n2] = (byte)arg0;
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_112 = true;
        this.cfr_renamed_119 = 0;
        this.cfr_renamed_93 = 0;
        System.arraycopy(this.cfr_renamed_91, 0, this.cfr_renamed_4, 0, this.cfr_renamed_91.length);
        this.cfr_renamed_2 = 0;
        this.cfr_renamed_86.cfr_renamed_41();
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_86.cfr_renamed_1315()).append(sprlyy.cfr_renamed_9("&\u000eJ\u001d[")).toString();
    }
}

