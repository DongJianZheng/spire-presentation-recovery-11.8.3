/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprjfh;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqgh;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprtkk;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprudh
extends sprqqe
implements sprlm {
    private final int cfr_renamed_1;
    public static final int cfr_renamed_2 = 1;
    public static final int cfr_renamed_3 = 0;
    private final sprco cfr_renamed_4;

    public int cfr_renamed_8227() {
        return this.cfr_renamed_1;
    }

    private /* synthetic */ sprudh(sprnvm arg0) {
        this(arg0.cfr_renamed_312(), arg0.cfr_renamed_8225());
    }

    public static sprudh cfr_renamed_8464(sprjfh arg0) {
        return new sprudh(0, arg0);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprudh sprudh2 = this;
        return new sprycn(sprudh2.cfr_renamed_1, sprudh2.cfr_renamed_4);
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprudh(int arg0, sprco arg1) {
        this.cfr_renamed_1 = arg0;
        switch (this.cfr_renamed_1) {
            case 0: {
                this.cfr_renamed_4 = sprjfh.cfr_renamed_23(arg1);
                return;
            }
            case 1: {
                this.cfr_renamed_4 = sprqgh.cfr_renamed_23(arg1);
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprtkk.cfr_renamed_9("\u0003[\u001cT\u0006\\\u000e\u0015\t]\u0005\\\tPJC\u000bY\u001fPJ")).append(arg0).toString());
    }

    public static sprudh cfr_renamed_8465(sprqgh arg0) {
        return new sprudh(1, arg0);
    }

    public static sprudh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprudh) {
            return (sprudh)arg0;
        }
        if (arg0 != null) {
            return new sprudh(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }

    public sprco cfr_renamed_8466() {
        return this.cfr_renamed_4;
    }
}

