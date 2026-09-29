/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprsrk;
import com.spire.presentation.packages.sprtig;
import com.spire.presentation.packages.spryrk;
import com.spire.presentation.packages.sprysb;

public class sprqsk
extends sprsrk {
    private byte[] cfr_renamed_93;
    private byte[] cfr_renamed_86;
    private boolean cfr_renamed_152;
    private sprmr cfr_renamed_112;
    private byte[] cfr_renamed_119;
    private int cfr_renamed_91;
    private final int cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private boolean cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) throws IllegalArgumentException {
        void arg1;
        void arg0;
        this.cfr_renamed_152 = arg0;
        if (sprbj2 instanceof sprkpk) {
            sprkpk sprkpk2 = (sprkpk)arg1;
            byte[] byArray = sprkpk2.cfr_renamed_1205();
            if (byArray.length < this.cfr_renamed_4) {
                throw new IllegalArgumentException(sprysb.cfr_renamed_9("\u0012\u00140\u0014/\u00106\u00100U/U/\u00001\u0001b\u0017.\u001a!\u001e\u0011\u001c8\u0010bI\u007fU/"));
            }
            this.cfr_renamed_3 = byArray.length;
            sprqsk sprqsk2 = this;
            sprqsk2.cfr_renamed_10082();
            sprqsk2.cfr_renamed_93 = sproze.cfr_renamed_158(byArray);
            System.arraycopy(sprqsk2.cfr_renamed_93, 0, this.cfr_renamed_119, 0, this.cfr_renamed_93.length);
            if (sprkpk2.cfr_renamed_284() != null) {
                this.cfr_renamed_112.cfr_renamed_5535(true, sprkpk2.cfr_renamed_284());
            }
        } else {
            sprqsk sprqsk3 = this;
            sprqsk3.cfr_renamed_10084();
            sprqsk3.cfr_renamed_10082();
            System.arraycopy(sprqsk3.cfr_renamed_93, 0, this.cfr_renamed_119, 0, this.cfr_renamed_93.length);
            if (arg1 != null) {
                this.cfr_renamed_112.cfr_renamed_5535(true, (sprbj)arg1);
            }
        }
        this.cfr_renamed_2 = true;
    }

    public void cfr_renamed_10088(byte[] arg0) {
        sprqsk sprqsk2 = this;
        byte[] byArray = spryrk.cfr_renamed_10032(sprqsk2.cfr_renamed_119, sprqsk2.cfr_renamed_3 - this.cfr_renamed_0);
        System.arraycopy(byArray, 0, this.cfr_renamed_119, 0, byArray.length);
        System.arraycopy(arg0, 0, this.cfr_renamed_119, byArray.length, this.cfr_renamed_3 - byArray.length);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_3064(byte[] byArray, int n, byte[] byArray2, int n2) throws sprddl, IllegalStateException {
        void arg3;
        void arg2;
        void arg1;
        sprqsk sprqsk2 = this;
        sprqsk2.cfr_renamed_505(byArray, (int)arg1, sprqsk2.cfr_renamed_1195(), (byte[])arg2, (int)arg3);
        return sprqsk2.cfr_renamed_1195();
    }

    private /* synthetic */ void cfr_renamed_10082() {
        sprqsk sprqsk2 = this;
        sprqsk2.cfr_renamed_119 = new byte[sprqsk2.cfr_renamed_3];
        sprqsk2.cfr_renamed_93 = new byte[sprqsk2.cfr_renamed_3];
    }

    public byte[] cfr_renamed_10089() {
        sprqsk sprqsk2 = this;
        byte[] byArray = spryrk.cfr_renamed_10033(sprqsk2.cfr_renamed_119, sprqsk2.cfr_renamed_4);
        byte[] byArray2 = new byte[byArray.length];
        sprqsk sprqsk3 = this;
        sprqsk3.cfr_renamed_112.cfr_renamed_3064(byArray, 0, byArray2, 0);
        return spryrk.cfr_renamed_10033(byArray2, sprqsk3.cfr_renamed_0);
    }

    @Override
    public byte cfr_renamed_3272(byte arg0) {
        if (this.cfr_renamed_91 == 0) {
            this.cfr_renamed_1 = this.cfr_renamed_10089();
        }
        sprqsk sprqsk2 = this;
        byte by = (byte)(sprqsk2.cfr_renamed_1[sprqsk2.cfr_renamed_91] ^ arg0);
        byte by2 = sprqsk2.cfr_renamed_86[this.cfr_renamed_91++] = this.cfr_renamed_152 ? by : arg0;
        if (this.cfr_renamed_91 == this.cfr_renamed_1195()) {
            sprqsk sprqsk3 = this;
            sprqsk3.cfr_renamed_91 = 0;
            sprqsk3.cfr_renamed_10088(sprqsk3.cfr_renamed_86);
        }
        return by;
    }

    /*
     * WARNING - void declaration
     */
    public sprqsk(sprmr sprmr2, int n) {
        super((sprmr)arg0);
        void arg1;
        void arg0;
        this.cfr_renamed_2 = false;
        if (n < 0 || arg1 > arg0.cfr_renamed_1195() * 8) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprtig.cfr_renamed_9("\u0013d1d.`7`1%!l7G/j n\u0010l9`ch6v7%!`cl-%1d-b&%s%\u007f%!l7G/j n\u0010l9`c9~%")).append(arg0.cfr_renamed_1195() * 8).toString());
        }
        sprqsk sprqsk2 = this;
        void v1 = arg0;
        this.cfr_renamed_4 = v1.cfr_renamed_1195();
        this.cfr_renamed_112 = v1;
        sprqsk2.cfr_renamed_0 = arg1 / 8;
        sprqsk2.cfr_renamed_86 = new byte[this.cfr_renamed_1195()];
    }

    public sprqsk(sprmr arg0) {
        sprmr sprmr2 = arg0;
        this(sprmr2, sprmr2.cfr_renamed_1195() * 8);
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_112.cfr_renamed_1315()).append(sprysb.cfr_renamed_9("Z\u00013\u0000")).append(this.cfr_renamed_4 * 8).toString();
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_0;
    }

    private /* synthetic */ void cfr_renamed_10084() {
        this.cfr_renamed_3 = 2 * this.cfr_renamed_4;
    }

    @Override
    public void cfr_renamed_41() {
        sprqsk sprqsk2 = this;
        sprqsk2.cfr_renamed_91 = 0;
        sproze.cfr_renamed_3408(sprqsk2.cfr_renamed_86);
        sproze.cfr_renamed_3408(sprqsk2.cfr_renamed_1);
        if (sprqsk2.cfr_renamed_2) {
            System.arraycopy(this.cfr_renamed_93, 0, this.cfr_renamed_119, 0, this.cfr_renamed_93.length);
            this.cfr_renamed_112.cfr_renamed_41();
        }
    }
}

