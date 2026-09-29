/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.spramk;
import com.spire.presentation.packages.spraoe;
import com.spire.presentation.packages.sprbqe;
import com.spire.presentation.packages.sprgme;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprmne;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprx;
import com.spire.presentation.packages.sprxte;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprzxe;

public class sprice
extends sprkra
implements sprkj,
sprx {
    private sprx cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        return ((spra)((Object)this.cfr_renamed_4)).cfr_renamed_119();
    }

    @Override
    public String cfr_renamed_314() {
        return this.cfr_renamed_4.cfr_renamed_314();
    }

    private /* synthetic */ sprice(spraoe spraoe2) {
        this.cfr_renamed_4 = spraoe2;
    }

    public static sprice cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprice) {
            return (sprice)arg0;
        }
        if (arg0 instanceof sprgme) {
            return new sprice((sprgme)arg0);
        }
        if (arg0 instanceof spraoe) {
            return new sprice((spraoe)arg0);
        }
        if (arg0 instanceof sprbqe) {
            return new sprice((sprbqe)arg0);
        }
        if (arg0 instanceof sprxte) {
            return new sprice((sprxte)arg0);
        }
        if (arg0 instanceof sprmne) {
            return new sprice((sprmne)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprzxe.cfr_renamed_9("J\nO\u0003D\u0007OFL\u0004I\u0003@\u0012\u0003\u000fMFD\u0003W/M\u0015W\u0007M\u0005F\\\u0003")).append(arg0.getClass().getName()).toString());
    }

    private /* synthetic */ sprice(sprmne sprmne2) {
        this.cfr_renamed_4 = sprmne2;
    }

    public static sprice cfr_renamed_341(spryte arg0, boolean arg1) {
        if (!arg1) {
            throw new IllegalArgumentException(spramk.cfr_renamed_9("NAB@NL\r@YL@\t@\\^]\rKH\tHQ]EDJD]AP\r]LNJLI"));
        }
        return sprice.cfr_renamed_23(arg0.cfr_renamed_2456());
    }

    public String toString() {
        return this.cfr_renamed_4.cfr_renamed_314();
    }

    private /* synthetic */ sprice(sprxte sprxte2) {
        this.cfr_renamed_4 = sprxte2;
    }

    /*
     * WARNING - void declaration
     */
    public sprice(String string) {
        void arg0;
        sprice sprice2 = this;
        sprice2.cfr_renamed_4 = new sprxte((String)arg0);
    }

    private /* synthetic */ sprice(sprgme sprgme2) {
        this.cfr_renamed_4 = sprgme2;
    }

    private /* synthetic */ sprice(sprbqe sprbqe2) {
        this.cfr_renamed_4 = sprbqe2;
    }
}

