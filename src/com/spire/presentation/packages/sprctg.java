/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdlh;
import com.spire.presentation.packages.sprehea;
import com.spire.presentation.packages.sprgfh;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqbh;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprctg
extends sprqqe
implements sprlm {
    private final sprco cfr_renamed_0;
    private final int cfr_renamed_1;
    public static final int cfr_renamed_2 = 2;
    public static final int cfr_renamed_3 = 0;
    public static final int cfr_renamed_4 = 1;

    @Override
    public sprxgf cfr_renamed_119() {
        sprctg sprctg2 = this;
        return new sprycn(sprctg2.cfr_renamed_1, sprctg2.cfr_renamed_0);
    }

    public static sprqbh cfr_renamed_7843() {
        return new sprqbh();
    }

    public sprco cfr_renamed_8367() {
        return this.cfr_renamed_0;
    }

    public int cfr_renamed_8227() {
        return this.cfr_renamed_1;
    }

    public static sprctg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprctg) {
            return (sprctg)arg0;
        }
        if (arg0 != null) {
            return new sprctg(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }

    public static sprctg cfr_renamed_8368(sprgfh arg0) {
        return new sprctg(0, arg0);
    }

    public static sprctg cfr_renamed_8369(sprdlh arg0) {
        return new sprctg(2, arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprctg(int n, sprco sprco2) {
        void arg0;
        sprctg sprctg2 = this;
        sprctg2.cfr_renamed_1 = arg0;
        sprctg2.cfr_renamed_0 = sprco2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprctg(sprnvm sprnvm2) {
        void arg0;
        sprctg sprctg2 = this;
        sprctg2.cfr_renamed_1 = sprnvm2.cfr_renamed_312();
        switch (sprctg2.cfr_renamed_1) {
            case 0: 
            case 1: {
                this.cfr_renamed_0 = sprgfh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 2: {
                this.cfr_renamed_0 = sprdlh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprehea.cfr_renamed_9("a\n~\u0005d\rlDk\fg\rk\u0001(\u0012i\b}\u0001(")).append(arg0.cfr_renamed_312()).toString());
    }

    public static sprctg cfr_renamed_8370(sprgfh arg0) {
        return new sprctg(1, arg0);
    }
}

