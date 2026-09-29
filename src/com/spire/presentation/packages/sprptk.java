/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprraja;
import com.spire.presentation.packages.sprxad;
import com.spire.presentation.packages.spryrk;

public class sprptk
implements sprmr {
    private byte[] cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private sprmr cfr_renamed_0;
    private int cfr_renamed_1;
    private boolean cfr_renamed_2;
    private boolean cfr_renamed_3;
    private int cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_10084() {
        this.cfr_renamed_1 = this.cfr_renamed_4;
    }

    private /* synthetic */ void cfr_renamed_10088(byte[] arg0) {
        sprptk sprptk2 = this;
        byte[] byArray = spryrk.cfr_renamed_10032(sprptk2.cfr_renamed_91, sprptk2.cfr_renamed_1 - this.cfr_renamed_4);
        System.arraycopy(byArray, 0, this.cfr_renamed_91, 0, byArray.length);
        System.arraycopy(arg0, 0, this.cfr_renamed_91, byArray.length, this.cfr_renamed_1 - byArray.length);
    }

    private /* synthetic */ void cfr_renamed_10082() {
        sprptk sprptk2 = this;
        sprptk2.cfr_renamed_91 = new byte[sprptk2.cfr_renamed_1];
        sprptk2.cfr_renamed_119 = new byte[sprptk2.cfr_renamed_1];
    }

    /*
     * WARNING - void declaration
     */
    public sprptk(sprmr sprmr2) {
        void arg0;
        sprptk sprptk2 = this;
        this.cfr_renamed_3 = false;
        sprptk2.cfr_renamed_4 = arg0.cfr_renamed_1195();
        sprptk2.cfr_renamed_0 = sprmr2;
    }

    private /* synthetic */ int cfr_renamed_10090(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        sprptk sprptk2 = this;
        byte[] byArray = spryrk.cfr_renamed_10033(sprptk2.cfr_renamed_91, sprptk2.cfr_renamed_4);
        byte[] byArray2 = spryrk.cfr_renamed_10034(arg0, this.cfr_renamed_4, arg1);
        byte[] byArray3 = new byte[byArray2.length];
        this.cfr_renamed_0.cfr_renamed_3064(byArray2, 0, byArray3, 0);
        byte[] byArray4 = spryrk.cfr_renamed_10035(byArray3, byArray);
        System.arraycopy(byArray4, 0, arg2, arg3, byArray4.length);
        if (arg2.length > arg3 + byArray4.length) {
            this.cfr_renamed_10088(byArray2);
        }
        return byArray4.length;
    }

    private /* synthetic */ int cfr_renamed_10091(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        sprptk sprptk2 = this;
        byte[] byArray = spryrk.cfr_renamed_10033(sprptk2.cfr_renamed_91, sprptk2.cfr_renamed_4);
        byte[] byArray2 = spryrk.cfr_renamed_10035(spryrk.cfr_renamed_10034(arg0, this.cfr_renamed_4, arg1), byArray);
        byte[] byArray3 = new byte[byArray2.length];
        this.cfr_renamed_0.cfr_renamed_3064(byArray2, 0, byArray3, 0);
        System.arraycopy(byArray3, 0, arg2, arg3, byArray3.length);
        if (arg2.length > arg3 + byArray2.length) {
            this.cfr_renamed_10088(byArray3);
        }
        return byArray3.length;
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_4;
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprddl, IllegalStateException {
        if (this.cfr_renamed_2) {
            return this.cfr_renamed_10091(arg0, arg1, arg2, arg3);
        }
        return this.cfr_renamed_10090(arg0, arg1, arg2, arg3);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) throws IllegalArgumentException {
        void arg1;
        void arg0;
        this.cfr_renamed_2 = arg0;
        if (sprbj2 instanceof sprkpk) {
            sprkpk sprkpk2 = (sprkpk)arg1;
            byte[] byArray = sprkpk2.cfr_renamed_1205();
            if (byArray.length < this.cfr_renamed_4) {
                throw new IllegalArgumentException(sprraja.cfr_renamed_9("~0\\0C4Z4\\qCqC$]%\u000e3B>M:}8T4\u000em\u0013qC"));
            }
            this.cfr_renamed_1 = byArray.length;
            sprptk sprptk2 = this;
            sprptk2.cfr_renamed_10082();
            sprptk2.cfr_renamed_119 = sproze.cfr_renamed_158(byArray);
            System.arraycopy(sprptk2.cfr_renamed_119, 0, this.cfr_renamed_91, 0, this.cfr_renamed_119.length);
            if (sprkpk2.cfr_renamed_284() != null) {
                this.cfr_renamed_0.cfr_renamed_5535((boolean)arg0, sprkpk2.cfr_renamed_284());
            }
        } else {
            sprptk sprptk3 = this;
            sprptk3.cfr_renamed_10084();
            sprptk3.cfr_renamed_10082();
            System.arraycopy(sprptk3.cfr_renamed_119, 0, this.cfr_renamed_91, 0, this.cfr_renamed_119.length);
            if (arg1 != null) {
                this.cfr_renamed_0.cfr_renamed_5535((boolean)arg0, (sprbj)arg1);
            }
        }
        this.cfr_renamed_3 = true;
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_0.cfr_renamed_1315()).append(sprxad.cfr_renamed_9("V\u0014;\u0014")).toString();
    }

    @Override
    public void cfr_renamed_41() {
        if (this.cfr_renamed_3) {
            System.arraycopy(this.cfr_renamed_119, 0, this.cfr_renamed_91, 0, this.cfr_renamed_119.length);
            this.cfr_renamed_0.cfr_renamed_41();
        }
    }
}

