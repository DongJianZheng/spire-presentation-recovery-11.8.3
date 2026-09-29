/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprajp;
import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprtpk;

public class sprnvk
implements spraq {
    private sprgf cfr_renamed_119;
    private static final byte cfr_renamed_91 = 92;
    private static final int cfr_renamed_0 = 64;
    private static final byte cfr_renamed_1 = 54;
    private byte[] cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_119.cfr_renamed_1221(arg0);
    }

    @Override
    public void cfr_renamed_41() {
        sprnvk sprnvk2 = this;
        sprnvk2.cfr_renamed_119.cfr_renamed_41();
        sprnvk2.cfr_renamed_119.cfr_renamed_1197(this.cfr_renamed_2, 0, this.cfr_renamed_2.length);
    }

    @Override
    public void cfr_renamed_5692(sprbj sprbj2) {
        int n;
        this.cfr_renamed_119.cfr_renamed_41();
        byte[] byArray = ((sprtpk)sprbj2).cfr_renamed_1521();
        if (byArray.length > 64) {
            this.cfr_renamed_119.cfr_renamed_1197(byArray, 0, byArray.length);
            sprnvk sprnvk2 = this;
            sprnvk2.cfr_renamed_119.cfr_renamed_1219(sprnvk2.cfr_renamed_2, 0);
            n = this.cfr_renamed_4;
            int n2 = n;
            while (n2 < this.cfr_renamed_2.length) {
                this.cfr_renamed_2[n++] = 0;
                n2 = n;
            }
        } else {
            System.arraycopy(byArray, 0, this.cfr_renamed_2, 0, byArray.length);
            int n3 = n = byArray.length;
            while (n3 < this.cfr_renamed_2.length) {
                this.cfr_renamed_2[n++] = 0;
                n3 = n;
            }
        }
        this.cfr_renamed_3 = new byte[this.cfr_renamed_2.length];
        System.arraycopy(this.cfr_renamed_2, 0, this.cfr_renamed_3, 0, this.cfr_renamed_2.length);
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_2.length) {
            int n5 = n++;
            this.cfr_renamed_2[n5] = (byte)(this.cfr_renamed_2[n5] ^ 0x36);
            n4 = n;
        }
        int n6 = n = 0;
        while (n6 < this.cfr_renamed_3.length) {
            int n7 = n++;
            this.cfr_renamed_3[n7] = (byte)(this.cfr_renamed_3[n7] ^ 0x5C);
            n6 = n;
        }
        sprnvk sprnvk3 = this;
        sprnvk3.cfr_renamed_119.cfr_renamed_1197(sprnvk3.cfr_renamed_2, 0, this.cfr_renamed_2.length);
    }

    @Override
    public int cfr_renamed_2404() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprnvk(sprgf sprgf2) {
        void arg0;
        sprnvk sprnvk2 = this;
        sprnvk sprnvk3 = this;
        sprnvk3.cfr_renamed_2 = new byte[64];
        sprnvk3.cfr_renamed_3 = new byte[64];
        sprnvk2.cfr_renamed_119 = arg0;
        sprnvk2.cfr_renamed_4 = sprgf2.cfr_renamed_1218();
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_119.cfr_renamed_1197(arg0, arg1, arg2);
    }

    public sprgf cfr_renamed_3069() {
        return this.cfr_renamed_119;
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_119.cfr_renamed_1315()).append(sprajp.cfr_renamed_9("-\u000eO\u0007A")).toString();
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        sprnvk sprnvk2 = this;
        byte[] byArray = new byte[sprnvk2.cfr_renamed_4];
        sprnvk2.cfr_renamed_119.cfr_renamed_1219(byArray, 0);
        sprnvk2.cfr_renamed_119.cfr_renamed_1197(this.cfr_renamed_3, 0, this.cfr_renamed_3.length);
        this.cfr_renamed_119.cfr_renamed_1197(byArray, 0, byArray.length);
        sprnvk sprnvk3 = this;
        int n = sprnvk3.cfr_renamed_119.cfr_renamed_1219(arg0, arg1);
        sprnvk3.cfr_renamed_41();
        return n;
    }
}

