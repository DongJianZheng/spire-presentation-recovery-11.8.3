/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprlya;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprwhh
extends sprqqe
implements sprlm {
    public static final int cfr_renamed_0 = 2;
    private final int cfr_renamed_1;
    private final sprco cfr_renamed_2;
    public static final int cfr_renamed_3 = 1;
    public static final int cfr_renamed_4 = 0;

    public static sprwhh cfr_renamed_8313(sproug arg0) {
        return new sprwhh(2, arg0);
    }

    public int cfr_renamed_8227() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprwhh(int n, sprco sprco2) {
        void arg0;
        sprwhh sprwhh2 = this;
        sprwhh2.cfr_renamed_1 = arg0;
        sprwhh2.cfr_renamed_2 = sprco2;
    }

    public static sprwhh cfr_renamed_8314(byte[] arg0) {
        return new sprwhh(2, new sprfvg(sproze.cfr_renamed_158(arg0)));
    }

    public static sprwhh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprwhh) {
            return (sprwhh)arg0;
        }
        if (arg0 != null) {
            return new sprwhh(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }

    public static sprwhh cfr_renamed_8315(byte[] arg0) {
        return new sprwhh(0, new sprfvg(sproze.cfr_renamed_158(arg0)));
    }

    public sprco cfr_renamed_8316() {
        return this.cfr_renamed_2;
    }

    public static sprwhh cfr_renamed_8317(sproug arg0) {
        return new sprwhh(1, arg0);
    }

    public static sprwhh cfr_renamed_8318(sproug arg0) {
        return new sprwhh(0, arg0);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprwhh sprwhh2 = this;
        return new sprycn(sprwhh2.cfr_renamed_1, sprwhh2.cfr_renamed_2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprwhh(sprnvm sprnvm2) {
        void arg0;
        switch (sprnvm2.cfr_renamed_312()) {
            case 0: 
            case 1: 
            case 2: {
                sprwhh sprwhh2 = this;
                while (false) {
                }
                void v1 = arg0;
                sprwhh2.cfr_renamed_1 = v1.cfr_renamed_312();
                sprwhh2.cfr_renamed_2 = sprfvg.cfr_renamed_23(v1.cfr_renamed_8225());
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprlya.cfr_renamed_9("]hBgXoP&Wn[oWc\u0014pUjAc\u0014")).append(arg0.cfr_renamed_312()).toString());
    }

    public static sprwhh cfr_renamed_8319(byte[] arg0) {
        return new sprwhh(1, new sprfvg(sproze.cfr_renamed_158(arg0)));
    }
}

