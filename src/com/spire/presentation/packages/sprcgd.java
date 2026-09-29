/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcnd;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spryky;
import com.spire.presentation.packages.sprzra;

public class sprcgd
extends sprcnd {
    private byte[] cfr_renamed_112;
    private int cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private boolean cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private sprff cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_1217(boolean bl, sprt sprt2) throws IllegalArgumentException {
        void arg1;
        void arg0;
        this.cfr_renamed_0 = arg0;
        if (sprt2 instanceof sprnjd) {
            sprnjd sprnjd2 = (sprnjd)arg1;
            byte[] byArray = sprnjd2.cfr_renamed_1205();
            if (byArray.length < this.cfr_renamed_91.length) {
                int n;
                sprcgd sprcgd2 = this;
                System.arraycopy(byArray, 0, sprcgd2.cfr_renamed_91, sprcgd2.cfr_renamed_91.length - byArray.length, byArray.length);
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
                this.cfr_renamed_3.cfr_renamed_1217(true, sprnjd2.cfr_renamed_284());
                return;
            }
        } else {
            this.cfr_renamed_41();
            if (arg1 != null) {
                this.cfr_renamed_3.cfr_renamed_1217(true, (sprt)arg1);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_3064(byte[] byArray, int n, byte[] byArray2, int n2) throws sprjkd, IllegalStateException {
        void arg3;
        void arg2;
        void arg1;
        sprcgd sprcgd2 = this;
        sprcgd2.cfr_renamed_505(byArray, (int)arg1, sprcgd2.cfr_renamed_119, (byte[])arg2, (int)arg3);
        return sprcgd2.cfr_renamed_119;
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_3.cfr_renamed_1315()).append(spryky.cfr_renamed_9("R\u0011;\u0010")).append(this.cfr_renamed_119 * 8).toString();
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_119;
    }

    /*
     * WARNING - void declaration
     */
    public int cfr_renamed_3393(byte[] byArray, int n, byte[] byArray2, int n2) throws sprjkd, IllegalStateException {
        void arg3;
        void arg2;
        void arg1;
        sprcgd sprcgd2 = this;
        sprcgd2.cfr_renamed_505(byArray, (int)arg1, sprcgd2.cfr_renamed_119, (byte[])arg2, (int)arg3);
        return sprcgd2.cfr_renamed_119;
    }

    @Override
    public void cfr_renamed_41() {
        System.arraycopy(this.cfr_renamed_91, 0, this.cfr_renamed_2, 0, this.cfr_renamed_91.length);
        sprcgd sprcgd2 = this;
        sprzra.cfr_renamed_492(sprcgd2.cfr_renamed_112, (byte)0);
        sprcgd2.cfr_renamed_4 = 0;
        sprcgd2.cfr_renamed_3.cfr_renamed_41();
    }

    private /* synthetic */ byte cfr_renamed_3456(byte arg0) {
        if (this.cfr_renamed_4 == 0) {
            sprcgd sprcgd2 = this;
            sprcgd2.cfr_renamed_3.cfr_renamed_3064(sprcgd2.cfr_renamed_2, 0, this.cfr_renamed_1, 0);
        }
        sprcgd sprcgd3 = this;
        sprcgd3.cfr_renamed_112[sprcgd3.cfr_renamed_4] = arg0;
        byte by = (byte)(sprcgd3.cfr_renamed_1[this.cfr_renamed_4++] ^ arg0);
        sprcgd sprcgd4 = this;
        if (sprcgd4.cfr_renamed_4 == sprcgd4.cfr_renamed_119) {
            this.cfr_renamed_4 = 0;
            sprcgd sprcgd5 = this;
            System.arraycopy(this.cfr_renamed_2, sprcgd5.cfr_renamed_119, sprcgd5.cfr_renamed_2, 0, this.cfr_renamed_2.length - this.cfr_renamed_119);
            sprcgd sprcgd6 = this;
            System.arraycopy(this.cfr_renamed_112, 0, sprcgd6.cfr_renamed_2, sprcgd6.cfr_renamed_2.length - this.cfr_renamed_119, this.cfr_renamed_119);
        }
        return by;
    }

    /*
     * WARNING - void declaration
     */
    public int cfr_renamed_3396(byte[] byArray, int n, byte[] byArray2, int n2) throws sprjkd, IllegalStateException {
        void arg3;
        void arg2;
        void arg1;
        sprcgd sprcgd2 = this;
        sprcgd2.cfr_renamed_505(byArray, (int)arg1, sprcgd2.cfr_renamed_119, (byte[])arg2, (int)arg3);
        return sprcgd2.cfr_renamed_119;
    }

    @Override
    public byte cfr_renamed_3272(byte arg0) throws sprjkd, IllegalStateException {
        if (this.cfr_renamed_0) {
            return this.cfr_renamed_3457(arg0);
        }
        return this.cfr_renamed_3456(arg0);
    }

    private /* synthetic */ byte cfr_renamed_3457(byte arg0) {
        if (this.cfr_renamed_4 == 0) {
            sprcgd sprcgd2 = this;
            sprcgd2.cfr_renamed_3.cfr_renamed_3064(sprcgd2.cfr_renamed_2, 0, this.cfr_renamed_1, 0);
        }
        sprcgd sprcgd3 = this;
        byte by = (byte)(sprcgd3.cfr_renamed_1[sprcgd3.cfr_renamed_4] ^ arg0);
        sprcgd3.cfr_renamed_112[this.cfr_renamed_4++] = by;
        sprcgd sprcgd4 = this;
        if (sprcgd4.cfr_renamed_4 == sprcgd4.cfr_renamed_119) {
            this.cfr_renamed_4 = 0;
            sprcgd sprcgd5 = this;
            System.arraycopy(this.cfr_renamed_2, sprcgd5.cfr_renamed_119, sprcgd5.cfr_renamed_2, 0, this.cfr_renamed_2.length - this.cfr_renamed_119);
            sprcgd sprcgd6 = this;
            System.arraycopy(this.cfr_renamed_112, 0, sprcgd6.cfr_renamed_2, sprcgd6.cfr_renamed_2.length - this.cfr_renamed_119, this.cfr_renamed_119);
        }
        return by;
    }

    public sprcgd(sprff arg0, int arg1) {
        sprcgd sprcgd2 = this;
        sprff sprff2 = arg0;
        sprcgd sprcgd3 = this;
        super(arg0);
        this.cfr_renamed_3 = null;
        sprcgd3.cfr_renamed_3 = arg0;
        sprcgd3.cfr_renamed_119 = arg1 / 8;
        this.cfr_renamed_91 = new byte[sprff2.cfr_renamed_1195()];
        this.cfr_renamed_2 = new byte[sprff2.cfr_renamed_1195()];
        sprcgd2.cfr_renamed_1 = new byte[arg0.cfr_renamed_1195()];
        sprcgd2.cfr_renamed_112 = new byte[this.cfr_renamed_119];
    }

    public byte[] cfr_renamed_3452() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_2);
    }
}

