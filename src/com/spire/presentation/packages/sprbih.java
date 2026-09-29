/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraaea;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproqg;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.sprywg;

public class sprbih
extends sprqqe
implements sprlm {
    public static final int cfr_renamed_1 = 1;
    public static final int cfr_renamed_2 = 0;
    private final int cfr_renamed_3;
    private final sprco cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprbih sprbih2 = this;
        return new sprycn(sprbih2.cfr_renamed_3, sprbih2.cfr_renamed_4);
    }

    public static sprbih cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbih) {
            return (sprbih)arg0;
        }
        if (arg0 != null) {
            return new sprbih(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }

    public static sprbih cfr_renamed_8387(sproqg arg0) {
        return new sprbih(1, arg0);
    }

    public int cfr_renamed_8227() {
        return this.cfr_renamed_3;
    }

    public static sprbih cfr_renamed_8388(sprywg arg0) {
        return new sprbih(0, arg0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprbih(int arg0, sprco arg1) {
        this.cfr_renamed_3 = arg0;
        switch (this.cfr_renamed_3) {
            case 0: 
            case 1: {
                this.cfr_renamed_4 = arg1;
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, spraaea.cfr_renamed_9("\u0000(\u001f'\u0005/\rf\n.\u0006/\n#I0\b*\u001c#I")).append(arg0).toString());
    }

    public sprco cfr_renamed_8221() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ sprbih(sprnvm arg0) {
        this(arg0.cfr_renamed_312(), arg0.cfr_renamed_8225());
    }
}

