/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprdy;
import com.spire.presentation.packages.sprklg;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprsrk;
import com.spire.presentation.packages.sprznj;

public class spretk
extends sprsrk
implements sprdy {
    private sprmr cfr_renamed_112 = null;
    private byte[] cfr_renamed_119;
    private int cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private boolean cfr_renamed_3;
    private int cfr_renamed_4;

    private /* synthetic */ byte cfr_renamed_3456(byte arg0) {
        if (this.cfr_renamed_4 == 0) {
            spretk spretk2 = this;
            spretk2.cfr_renamed_112.cfr_renamed_3064(spretk2.cfr_renamed_0, 0, this.cfr_renamed_2, 0);
        }
        spretk spretk3 = this;
        spretk3.cfr_renamed_1[spretk3.cfr_renamed_4] = arg0;
        byte by = (byte)(spretk3.cfr_renamed_2[this.cfr_renamed_4++] ^ arg0);
        spretk spretk4 = this;
        if (spretk4.cfr_renamed_4 == spretk4.cfr_renamed_91) {
            this.cfr_renamed_4 = 0;
            spretk spretk5 = this;
            System.arraycopy(this.cfr_renamed_0, spretk5.cfr_renamed_91, spretk5.cfr_renamed_0, 0, this.cfr_renamed_0.length - this.cfr_renamed_91);
            spretk spretk6 = this;
            System.arraycopy(this.cfr_renamed_1, 0, spretk6.cfr_renamed_0, spretk6.cfr_renamed_0.length - this.cfr_renamed_91, this.cfr_renamed_91);
        }
        return by;
    }

    public static sprdy cfr_renamed_7531(sprmr arg0, int arg1) {
        return new spretk(arg0, arg1);
    }

    public byte[] cfr_renamed_3452() {
        return sproze.cfr_renamed_158(this.cfr_renamed_0);
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_112.cfr_renamed_1315()).append(sprznj.cfr_renamed_9("7N^O")).append(this.cfr_renamed_91 * 8).toString();
    }

    /*
     * WARNING - void declaration
     */
    public int cfr_renamed_3396(byte[] byArray, int n, byte[] byArray2, int n2) throws sprddl, IllegalStateException {
        void arg3;
        void arg2;
        void arg1;
        spretk spretk2 = this;
        spretk2.cfr_renamed_505(byArray, (int)arg1, spretk2.cfr_renamed_91, (byte[])arg2, (int)arg3);
        return spretk2.cfr_renamed_91;
    }

    private /* synthetic */ byte cfr_renamed_3457(byte arg0) {
        if (this.cfr_renamed_4 == 0) {
            spretk spretk2 = this;
            spretk2.cfr_renamed_112.cfr_renamed_3064(spretk2.cfr_renamed_0, 0, this.cfr_renamed_2, 0);
        }
        spretk spretk3 = this;
        byte by = (byte)(spretk3.cfr_renamed_2[spretk3.cfr_renamed_4] ^ arg0);
        spretk3.cfr_renamed_1[this.cfr_renamed_4++] = by;
        spretk spretk4 = this;
        if (spretk4.cfr_renamed_4 == spretk4.cfr_renamed_91) {
            this.cfr_renamed_4 = 0;
            spretk spretk5 = this;
            System.arraycopy(this.cfr_renamed_0, spretk5.cfr_renamed_91, spretk5.cfr_renamed_0, 0, this.cfr_renamed_0.length - this.cfr_renamed_91);
            spretk spretk6 = this;
            System.arraycopy(this.cfr_renamed_1, 0, spretk6.cfr_renamed_0, spretk6.cfr_renamed_0.length - this.cfr_renamed_91, this.cfr_renamed_91);
        }
        return by;
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_3064(byte[] byArray, int n, byte[] byArray2, int n2) throws sprddl, IllegalStateException {
        void arg3;
        void arg2;
        void arg1;
        spretk spretk2 = this;
        spretk2.cfr_renamed_505(byArray, (int)arg1, spretk2.cfr_renamed_91, (byte[])arg2, (int)arg3);
        return spretk2.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) throws IllegalArgumentException {
        void arg1;
        void arg0;
        this.cfr_renamed_3 = arg0;
        if (sprbj2 instanceof sprkpk) {
            sprkpk sprkpk2 = (sprkpk)arg1;
            byte[] byArray = sprkpk2.cfr_renamed_1205();
            if (byArray.length < this.cfr_renamed_119.length) {
                int n;
                spretk spretk2 = this;
                System.arraycopy(byArray, 0, spretk2.cfr_renamed_119, spretk2.cfr_renamed_119.length - byArray.length, byArray.length);
                int n2 = n = 0;
                while (n2 < this.cfr_renamed_119.length - byArray.length) {
                    this.cfr_renamed_119[n++] = 0;
                    n2 = n;
                }
            } else {
                System.arraycopy(byArray, 0, this.cfr_renamed_119, 0, this.cfr_renamed_119.length);
            }
            this.cfr_renamed_41();
            if (sprkpk2.cfr_renamed_284() != null) {
                this.cfr_renamed_112.cfr_renamed_5535(true, sprkpk2.cfr_renamed_284());
                return;
            }
        } else {
            this.cfr_renamed_41();
            if (arg1 != null) {
                this.cfr_renamed_112.cfr_renamed_5535(true, (sprbj)arg1);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public int cfr_renamed_3393(byte[] byArray, int n, byte[] byArray2, int n2) throws sprddl, IllegalStateException {
        void arg3;
        void arg2;
        void arg1;
        spretk spretk2 = this;
        spretk2.cfr_renamed_505(byArray, (int)arg1, spretk2.cfr_renamed_91, (byte[])arg2, (int)arg3);
        return spretk2.cfr_renamed_91;
    }

    @Override
    public byte cfr_renamed_3272(byte arg0) throws sprddl, IllegalStateException {
        if (this.cfr_renamed_3) {
            return this.cfr_renamed_3457(arg0);
        }
        return this.cfr_renamed_3456(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public spretk(sprmr sprmr2, int n) {
        super((sprmr)arg0);
        void arg1;
        void arg0;
        if (n > arg0.cfr_renamed_1195() * 8 || arg1 < 8 || arg1 % 8 != false) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprklg.cfr_renamed_9("QzP")).append((int)arg1).append(sprznj.cfr_renamed_9("8cwy8~m}hbjy}i")).toString());
        }
        spretk spretk2 = this;
        void v1 = arg0;
        spretk spretk3 = this;
        spretk3.cfr_renamed_112 = arg0;
        spretk3.cfr_renamed_91 = arg1 / 8;
        this.cfr_renamed_119 = new byte[v1.cfr_renamed_1195()];
        this.cfr_renamed_0 = new byte[v1.cfr_renamed_1195()];
        spretk2.cfr_renamed_2 = new byte[arg0.cfr_renamed_1195()];
        spretk2.cfr_renamed_1 = new byte[this.cfr_renamed_91];
    }

    @Override
    public void cfr_renamed_41() {
        System.arraycopy(this.cfr_renamed_119, 0, this.cfr_renamed_0, 0, this.cfr_renamed_119.length);
        spretk spretk2 = this;
        sproze.cfr_renamed_492(spretk2.cfr_renamed_1, (byte)0);
        spretk2.cfr_renamed_4 = 0;
        spretk2.cfr_renamed_112.cfr_renamed_41();
    }
}

