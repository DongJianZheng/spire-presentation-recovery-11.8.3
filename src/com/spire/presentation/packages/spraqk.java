/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprexo;
import com.spire.presentation.packages.sprgbl;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprtxk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprzbs;

public class spraqk
implements spraq {
    private final int cfr_renamed_3;
    private final sprgbl cfr_renamed_4;

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_4.cfr_renamed_41();
    }

    @Override
    public void cfr_renamed_5692(sprbj arg0) throws IllegalArgumentException {
        if (arg0 instanceof sprkpk) {
            sprkpk sprkpk2 = (sprkpk)arg0;
            byte[] byArray = sprkpk2.cfr_renamed_1205();
            sprtpk sprtpk2 = (sprtpk)sprkpk2.cfr_renamed_284();
            this.cfr_renamed_4.cfr_renamed_5535(true, new sprtxk(sprtpk2, this.cfr_renamed_3, byArray));
            return;
        }
        throw new IllegalArgumentException(sprexo.cfr_renamed_9("m\"k$eET\u0000W\u0010O\u0017C\u0016\u00065G\u0017G\bC\u0011C\u0017U2O\u0011N,p"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws sprddl, IllegalStateException {
        try {
            return this.cfr_renamed_4.cfr_renamed_1219(arg0, arg1);
        }
        catch (sprull sprull2) {
            throw new IllegalStateException(sprull2.toString());
        }
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) throws sprddl, IllegalStateException {
        this.cfr_renamed_4.cfr_renamed_2417(arg0, arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public spraqk(sprgbl sprgbl2) {
        void arg0;
        spraqk spraqk2 = this;
        spraqk2.cfr_renamed_4 = arg0;
        spraqk2.cfr_renamed_3 = sprgbl2.cfr_renamed_2349().cfr_renamed_1195() * 8;
    }

    /*
     * WARNING - void declaration
     */
    public spraqk(sprgbl sprgbl2, int n) {
        void arg0;
        spraqk spraqk2 = this;
        spraqk2.cfr_renamed_4 = arg0;
        spraqk2.cfr_renamed_3 = n;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) throws IllegalStateException {
        this.cfr_renamed_4.cfr_renamed_3212(arg0);
    }

    @Override
    public int cfr_renamed_2404() {
        return this.cfr_renamed_3 / 8;
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_4.cfr_renamed_2349().cfr_renamed_1315()).append(sprzbs.cfr_renamed_9("\\\u000f6\t0\u0007")).toString();
    }
}

