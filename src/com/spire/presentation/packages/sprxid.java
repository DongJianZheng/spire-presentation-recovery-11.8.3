/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhld;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprsez;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spruc;
import com.spire.presentation.packages.sprxfd;
import com.spire.presentation.packages.sprxxd;

public class sprxid
implements spruc {
    private final int cfr_renamed_3;
    private final sprhld cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprxid(sprhld sprhld2) {
        void arg0;
        sprxid sprxid2 = this;
        sprxid2.cfr_renamed_4 = arg0;
        sprxid2.cfr_renamed_3 = 128;
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) throws sprjkd, IllegalStateException {
        this.cfr_renamed_4.cfr_renamed_2417(arg0, arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public sprxid(sprhld sprhld2, int n) {
        void arg0;
        sprxid sprxid2 = this;
        sprxid2.cfr_renamed_4 = arg0;
        sprxid2.cfr_renamed_3 = n;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws sprjkd, IllegalStateException {
        try {
            return this.cfr_renamed_4.cfr_renamed_1219(arg0, arg1);
        }
        catch (sprpjd sprpjd2) {
            throw new IllegalStateException(sprpjd2.toString());
        }
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
        return new StringBuilder().insert(0, this.cfr_renamed_4.cfr_renamed_2349().cfr_renamed_1315()).append(sprxxd.cfr_renamed_9("G '&)")).toString();
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_4.cfr_renamed_41();
    }

    @Override
    public void cfr_renamed_1524(sprt arg0) throws IllegalArgumentException {
        if (arg0 instanceof sprnjd) {
            sprnjd sprnjd2 = (sprnjd)arg0;
            byte[] byArray = sprnjd2.cfr_renamed_1205();
            sprnld sprnld2 = (sprnld)sprnjd2.cfr_renamed_284();
            this.cfr_renamed_4.cfr_renamed_1217(true, new sprxfd(sprnld2, this.cfr_renamed_3, byArray));
            return;
        }
        throw new IllegalArgumentException(sprsez.cfr_renamed_9("++-%L\u0014\t\u0017\u0019\u000f\u001e\u0003\u001fF<\u0007\u001e\u0007\u0001\u0003\u0018\u0003\u001e\u0015;\u000f\u0018\u000e%0"));
    }
}

