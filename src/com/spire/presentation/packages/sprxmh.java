/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprgfh;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrpja;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprxmh
extends sprqqe
implements sprlm {
    private final int cfr_renamed_1;
    public static final int cfr_renamed_2 = 0;
    private final sprco cfr_renamed_3;
    public static final int cfr_renamed_4 = 1;

    public static sprxmh cfr_renamed_8421(sprgfh arg0) {
        return new sprxmh(1, arg0);
    }

    public int cfr_renamed_8227() {
        return this.cfr_renamed_1;
    }

    public static sprxmh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxmh) {
            return (sprxmh)arg0;
        }
        if (arg0 != null) {
            return new sprxmh(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }

    public static sprxmh cfr_renamed_8422(sprgfh arg0) {
        return new sprxmh(0, arg0);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprxmh(sprnvm sprnvm2) {
        void arg0;
        sprxmh sprxmh2 = this;
        sprxmh2.cfr_renamed_1 = sprnvm2.cfr_renamed_312();
        switch (sprxmh2.cfr_renamed_1) {
            case 0: 
            case 1: {
                this.cfr_renamed_3 = sprgfh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprrpja.cfr_renamed_9(",\u001b3\u0014)\u001c!U&\u001d*\u001c&\u0010e\u0003$\u00190\u0010e")).append(arg0.cfr_renamed_312()).toString());
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprxmh sprxmh2 = this;
        return new sprycn(sprxmh2.cfr_renamed_1, sprxmh2.cfr_renamed_3);
    }

    public sprco cfr_renamed_8423() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprxmh(int n, sprco sprco2) {
        void arg0;
        sprxmh sprxmh2 = this;
        sprxmh2.cfr_renamed_1 = arg0;
        sprxmh2.cfr_renamed_3 = sprco2;
    }
}

