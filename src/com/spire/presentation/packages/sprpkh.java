/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdfj;
import com.spire.presentation.packages.sprjfh;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.sprzhh;

public class sprpkh
extends sprqqe
implements sprlm {
    private final int cfr_renamed_0;
    public static final int cfr_renamed_1 = 2;
    public static final int cfr_renamed_2 = 0;
    private final sprco cfr_renamed_3;
    public static final int cfr_renamed_4 = 1;

    public int cfr_renamed_8227() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public sprpkh(int n, sprco sprco2) {
        void arg0;
        sprpkh sprpkh2 = this;
        sprpkh2.cfr_renamed_0 = arg0;
        sprpkh2.cfr_renamed_3 = sprco2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprpkh(sprnvm sprnvm2) {
        sprpkh sprpkh2 = this;
        sprpkh2.cfr_renamed_0 = sprnvm2.cfr_renamed_312();
        switch (sprpkh2.cfr_renamed_0) {
            case 0: {
                void arg0;
                this.cfr_renamed_3 = sprjfh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 1: {
                void arg0;
                this.cfr_renamed_3 = sprzhh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 2: {
                void arg0;
                this.cfr_renamed_3 = sprpen.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprdfj.cfr_renamed_9(":t%{?s7:0r<s0\u007fsl2v&\u007fs")).append(this.cfr_renamed_0).toString());
    }

    public static sprpkh cfr_renamed_8265(sprzhh arg0) {
        return new sprpkh(1, arg0);
    }

    public static sprpkh cfr_renamed_8266() {
        return new sprpkh(2, sprpen.cfr_renamed_4);
    }

    public static sprpkh cfr_renamed_8267(sprjfh arg0) {
        return new sprpkh(0, arg0);
    }

    public static sprpkh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprpkh) {
            return (sprpkh)arg0;
        }
        if (arg0 != null) {
            return new sprpkh(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprpkh sprpkh2 = this;
        return new sprycn(sprpkh2.cfr_renamed_0, sprpkh2.cfr_renamed_3);
    }

    public sprco cfr_renamed_8268() {
        return this.cfr_renamed_3;
    }
}

