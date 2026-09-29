/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcih;
import com.spire.presentation.packages.sprjfh;
import com.spire.presentation.packages.sprlfh;
import com.spire.presentation.packages.sprxp;

public class sprsjk {
    private final sprxp cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprsjk(sprxp sprxp2, byte[] byArray) {
        void arg0;
        sprsjk sprsjk2 = this;
        sprsjk2.cfr_renamed_3 = arg0;
        sprsjk2.cfr_renamed_4 = byArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprlfh cfr_renamed_2588(byte[] arg0) {
        try {
            return sprlfh.cfr_renamed_8274(sprcih.cfr_renamed_7843().cfr_renamed_9599(new sprjfh(this.cfr_renamed_4)).cfr_renamed_9600(this.cfr_renamed_3.cfr_renamed_9524(arg0)).cfr_renamed_9601());
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage(), exception);
        }
    }
}

