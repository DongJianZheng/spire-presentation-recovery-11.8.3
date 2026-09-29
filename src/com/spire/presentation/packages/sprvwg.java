/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfkh;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprveda;
import com.spire.presentation.packages.sprwih;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprvwg
extends sprqqe
implements sprlm {
    private final int cfr_renamed_0;
    public static final int cfr_renamed_1 = 0;
    public static final int cfr_renamed_2 = 1;
    private final sprco cfr_renamed_3;
    public static final int cfr_renamed_4 = 2;

    /*
     * WARNING - void declaration
     */
    public sprvwg(int n, sprco sprco2) {
        void arg0;
        sprvwg sprvwg2 = this;
        sprvwg2.cfr_renamed_0 = arg0;
        sprvwg2.cfr_renamed_3 = sprco2;
    }

    public static sprvwg cfr_renamed_8347(sprwih arg0) {
        return new sprvwg(0, arg0);
    }

    public static sprvwg cfr_renamed_8348(sprwih arg0) {
        return new sprvwg(1, arg0);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprvwg(sprnvm sprnvm2) {
        void arg0;
        sprvwg sprvwg2 = this;
        sprvwg2.cfr_renamed_0 = sprnvm2.cfr_renamed_312();
        switch (sprvwg2.cfr_renamed_0) {
            case 0: 
            case 1: {
                this.cfr_renamed_3 = sprwih.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 2: {
                this.cfr_renamed_3 = sprfkh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprveda.cfr_renamed_9("\tI\u0016F\fN\u0004\u0007\u0003O\u000fN\u0003B@Q\u0001K\u0015B@")).append(arg0.cfr_renamed_312()).toString());
    }

    public static sprvwg cfr_renamed_8349(sprfkh arg0) {
        return new sprvwg(2, arg0);
    }

    public sprco cfr_renamed_79() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprvwg sprvwg2 = this;
        return new sprycn(sprvwg2.cfr_renamed_0, sprvwg2.cfr_renamed_3);
    }

    public static sprvwg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvwg) {
            return (sprvwg)arg0;
        }
        if (arg0 != null) {
            return new sprvwg(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }

    public int cfr_renamed_8227() {
        return this.cfr_renamed_0;
    }
}

