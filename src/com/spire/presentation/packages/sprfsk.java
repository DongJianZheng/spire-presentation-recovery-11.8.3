/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralo;
import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprhw;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprpjo;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprtxk;
import com.spire.presentation.packages.sprull;

public class sprfsk
implements spraq {
    private final sprhw cfr_renamed_3;
    private final int cfr_renamed_4;

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_3.cfr_renamed_41();
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) throws sprddl, IllegalStateException {
        this.cfr_renamed_3.cfr_renamed_2417(arg0, arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public sprfsk(sprhw sprhw2, int n) {
        void arg0;
        sprfsk sprfsk2 = this;
        sprfsk2.cfr_renamed_3 = arg0;
        sprfsk2.cfr_renamed_4 = n;
    }

    @Override
    public int cfr_renamed_2404() {
        return this.cfr_renamed_4 / 8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws sprddl, IllegalStateException {
        try {
            return this.cfr_renamed_3.cfr_renamed_1219(arg0, arg1);
        }
        catch (sprull sprull2) {
            throw new IllegalStateException(sprull2.toString());
        }
    }

    @Override
    public void cfr_renamed_5692(sprbj arg0) throws IllegalArgumentException {
        if (arg0 instanceof sprkpk) {
            sprkpk sprkpk2 = (sprkpk)arg0;
            byte[] byArray = sprkpk2.cfr_renamed_1205();
            sprtpk sprtpk2 = (sprtpk)sprkpk2.cfr_renamed_284();
            this.cfr_renamed_3.cfr_renamed_5535(true, new sprtxk(sprtpk2, this.cfr_renamed_4, byArray));
            return;
        }
        throw new IllegalArgumentException(spralo.cfr_renamed_9("t$r*\u0013\u001bV\u0018F\u0000A\f@Ic\bA\b^\fG\fA\u001ad\u0000G\u0001z?"));
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_3.cfr_renamed_2349().cfr_renamed_1315()).append(sprpjo.cfr_renamed_9("e{\u0005}\u000b")).toString();
    }

    @Override
    public void cfr_renamed_1221(byte arg0) throws IllegalStateException {
        this.cfr_renamed_3.cfr_renamed_3212(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprfsk(sprhw sprhw2) {
        void arg0;
        sprfsk sprfsk2 = this;
        sprfsk2.cfr_renamed_3 = arg0;
        sprfsk2.cfr_renamed_4 = 128;
    }
}

