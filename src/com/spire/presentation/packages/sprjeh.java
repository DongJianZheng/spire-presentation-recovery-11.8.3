/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spratc;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.spruih;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprjeh
extends sprqqe
implements sprlm {
    private final sprco cfr_renamed_1;
    public static final int cfr_renamed_2 = 0;
    private final int cfr_renamed_3;
    public static final int cfr_renamed_4 = 1;

    public static sprjeh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjeh) {
            return (sprjeh)arg0;
        }
        if (arg0 != null) {
            return new sprjeh(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }

    public static sprjeh cfr_renamed_8320(spruih arg0) {
        return new sprjeh(0, arg0);
    }

    public int cfr_renamed_8227() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprjeh(int n, sprco sprco2) {
        void arg0;
        sprjeh sprjeh2 = this;
        sprjeh2.cfr_renamed_3 = arg0;
        sprjeh2.cfr_renamed_1 = sprco2;
    }

    public static sprjeh cfr_renamed_8321(spruih arg0) {
        return new sprjeh(1, arg0);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprjeh sprjeh2 = this;
        return new sprycn(sprjeh2.cfr_renamed_3, sprjeh2.cfr_renamed_1);
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprjeh(sprnvm arg0) {
        sprnvm sprnvm2 = arg0;
        this.cfr_renamed_3 = sprnvm2.cfr_renamed_312();
        switch (sprnvm2.cfr_renamed_312()) {
            case 0: 
            case 1: {
                this.cfr_renamed_1 = spruih.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, spratc.cfr_renamed_9("5\u000f*\u00000\b8A?\t3\b?\u0004|\u0017=\r)\u0004|")).append(arg0.cfr_renamed_312()).toString());
    }

    public sprco cfr_renamed_8322() {
        return this.cfr_renamed_1;
    }
}

