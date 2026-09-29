/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spredh;
import com.spire.presentation.packages.sprfih;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproqo;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.sprzdh;

public class sprmjh
extends sprqqe
implements sprlm {
    public static final int cfr_renamed_91 = 3;
    private final int cfr_renamed_0;
    private final sprco cfr_renamed_1;
    public static final int cfr_renamed_2 = 0;
    public static final int cfr_renamed_3 = 1;
    public static final int cfr_renamed_4 = 2;

    /*
     * WARNING - void declaration
     */
    public sprmjh(int n, sprco sprco2) {
        void arg0;
        sprmjh sprmjh2 = this;
        sprmjh2.cfr_renamed_0 = arg0;
        sprmjh2.cfr_renamed_1 = sprco2;
    }

    public int cfr_renamed_8227() {
        return this.cfr_renamed_0;
    }

    public static sprmjh cfr_renamed_8297(sprfih arg0) {
        return new sprmjh(2, arg0);
    }

    public static sprmjh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmjh) {
            return (sprmjh)arg0;
        }
        if (arg0 != null) {
            return new sprmjh(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }

    public sprco cfr_renamed_8298() {
        return this.cfr_renamed_1;
    }

    public static sprmjh cfr_renamed_8299(sprzdh arg0) {
        return new sprmjh(3, arg0);
    }

    public static sprmjh cfr_renamed_8300(sprzdh arg0) {
        return new sprmjh(0, arg0);
    }

    public static sprmjh cfr_renamed_8301(byte[] arg0) {
        return new sprmjh(3, new sprfvg(sproze.cfr_renamed_158(arg0)));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprmjh sprmjh2 = this;
        return new sprycn(sprmjh2.cfr_renamed_0, sprmjh2.cfr_renamed_1);
    }

    public static sprmjh cfr_renamed_8302(byte[] arg0) {
        return new sprmjh(0, new sprfvg(sproze.cfr_renamed_158(arg0)));
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprmjh(sprnvm sprnvm2) {
        void arg0;
        sprmjh sprmjh2 = this;
        sprmjh2.cfr_renamed_0 = sprnvm2.cfr_renamed_312();
        switch (sprmjh2.cfr_renamed_0) {
            case 0: 
            case 3: {
                this.cfr_renamed_1 = sprzdh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 1: {
                this.cfr_renamed_1 = spredh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 2: {
                this.cfr_renamed_1 = sprfih.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sproqo.cfr_renamed_9("^fAi[aS(T`XaTm\u0017~VdBm\u0017")).append(arg0.cfr_renamed_312()).toString());
    }

    public static sprmjh cfr_renamed_8303(spredh arg0) {
        return new sprmjh(1, arg0);
    }
}

