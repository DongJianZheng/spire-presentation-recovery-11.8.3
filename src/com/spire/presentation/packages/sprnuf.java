/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprttc;

public class sprnuf {
    private final byte[] cfr_renamed_0;
    private final sprgf cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    public byte[] cfr_renamed_6436(byte[] arg0, int arg1) {
        if (arg0.length - arg1 < this.cfr_renamed_1.cfr_renamed_1218()) {
            throw new IllegalArgumentException(sprttc.cfr_renamed_9(">\t8\u000f/\u001cj\u0004/\u0006-\u001c\"H#\u001bj\u0004/\u001b9H>\u0000+\u0006j\f#\u000f/\u001b>H9\u00010\rd"));
        }
        sprnuf sprnuf2 = this;
        sprnuf2.cfr_renamed_1.cfr_renamed_1197(sprnuf2.cfr_renamed_4, 0, this.cfr_renamed_4.length);
        sprnuf sprnuf3 = this;
        sprnuf sprnuf4 = this;
        sprnuf3.cfr_renamed_1.cfr_renamed_1221((byte)(sprnuf4.cfr_renamed_3 >>> 24));
        sprnuf3.cfr_renamed_1.cfr_renamed_1221((byte)(this.cfr_renamed_3 >>> 16));
        sprnuf4.cfr_renamed_1.cfr_renamed_1221((byte)(this.cfr_renamed_3 >>> 8));
        sprnuf3.cfr_renamed_1.cfr_renamed_1221((byte)this.cfr_renamed_3);
        sprnuf3.cfr_renamed_1.cfr_renamed_1221((byte)(this.cfr_renamed_2 >>> 8));
        sprnuf3.cfr_renamed_1.cfr_renamed_1221((byte)this.cfr_renamed_2);
        sprnuf3.cfr_renamed_1.cfr_renamed_1221((byte)-1);
        sprnuf3.cfr_renamed_1.cfr_renamed_1197(this.cfr_renamed_0, 0, this.cfr_renamed_0.length);
        this.cfr_renamed_1.cfr_renamed_1219(arg0, arg1);
        return arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprnuf(byte[] byArray, byte[] byArray2, sprgf sprgf2) {
        void arg1;
        void arg0;
        sprnuf sprnuf2 = this;
        this.cfr_renamed_4 = arg0;
        sprnuf2.cfr_renamed_0 = arg1;
        sprnuf2.cfr_renamed_1 = sprgf2;
    }

    public void cfr_renamed_6437(byte[] arg0, boolean arg1) {
        this.cfr_renamed_6438(arg0, arg1, 0);
    }

    public byte[] cfr_renamed_6439() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_6440(int arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public int cfr_renamed_2616() {
        return this.cfr_renamed_2;
    }

    public byte[] cfr_renamed_6441() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_6438(byte[] byArray, boolean bl, int n) {
        void arg2;
        void arg0;
        this.cfr_renamed_6436((byte[])arg0, (int)arg2);
        if (bl) {
            ++this.cfr_renamed_2;
        }
    }

    public int cfr_renamed_1604() {
        return this.cfr_renamed_3;
    }

    public void cfr_renamed_6442(int arg0) {
        this.cfr_renamed_3 = arg0;
    }
}

