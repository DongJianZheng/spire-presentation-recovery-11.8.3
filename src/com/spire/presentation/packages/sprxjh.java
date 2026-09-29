/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spregh;
import com.spire.presentation.packages.sprjfh;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprszm;

public class sprxjh
extends spregh {
    public sprxjh(spregh arg0) {
        super(arg0.cfr_renamed_8428(), arg0.cfr_renamed_8429());
    }

    public sprxjh(sprjfh arg0, sprktm arg1) {
        super(arg0, arg1);
    }

    public static sprxjh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxjh) {
            return (sprxjh)arg0;
        }
        if (arg0 != null) {
            return new sprxjh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprxjh(sprszm arg0) {
        super(arg0);
    }
}

