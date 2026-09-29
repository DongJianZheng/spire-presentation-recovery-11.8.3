/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.spraoe;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprsly;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprycga;

public class sprvje
extends sprkra
implements sprkj {
    public final int cfr_renamed_0 = 3;
    public int cfr_renamed_1;
    public final int cfr_renamed_2 = 1;
    public spra cfr_renamed_3;
    public final int cfr_renamed_4 = 999;

    /*
     * WARNING - void declaration
     */
    public sprvje(int n) {
        void arg0;
        sprvje sprvje2 = this;
        this.cfr_renamed_0 = 3;
        sprvje2.cfr_renamed_2 = 1;
        sprvje2.cfr_renamed_4 = 999;
        if (n > 999 || arg0 < true) {
            throw new IllegalArgumentException(sprsly.cfr_renamed_9("\u0000\u0000\u0018\u001c\u0010R\u0004\u001b\r\u0017W\u001b\u0019R\u0019\u0007\u001a\u0017\u0005\u001b\u0014R\u0014\u001d\u0013\u0017WHW\u001c\u0018\u0006W\u001b\u0019R_CY\\NKN["));
        }
        this.cfr_renamed_3 = new sprooe((long)arg0);
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_3.cfr_renamed_119();
    }

    public boolean cfr_renamed_361() {
        return this.cfr_renamed_3 instanceof spraoe;
    }

    public String cfr_renamed_362() {
        return ((spraoe)this.cfr_renamed_3).cfr_renamed_314();
    }

    /*
     * WARNING - void declaration
     */
    public sprvje(String string) {
        void arg0;
        sprvje sprvje2 = this;
        this.cfr_renamed_0 = 3;
        sprvje2.cfr_renamed_2 = 1;
        sprvje2.cfr_renamed_4 = 999;
        if (string.length() > 3) {
            throw new IllegalArgumentException(sprycga.cfr_renamed_9("\u0002N\u001aR\u0012\u001c\u0006U\u000fYUU\u001b\u001c\u0014P\u0005T\u0014^\u0010H\u001c_U_\u001aX\u0010\u001cO\u001c\u0018]\r\u001c\u0006U\u000fYUU\u0006\u001cF"));
        }
        this.cfr_renamed_3 = new spraoe((String)arg0);
    }

    public int cfr_renamed_363() {
        return ((sprooe)this.cfr_renamed_3).cfr_renamed_97().intValue();
    }

    public static sprvje cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprvje) {
            return (sprvje)arg0;
        }
        if (arg0 instanceof sprooe) {
            sprooe sprooe2 = sprooe.cfr_renamed_23(arg0);
            int n = sprooe2.cfr_renamed_97().intValue();
            return new sprvje(n);
        }
        if (arg0 instanceof spraoe) {
            spraoe spraoe2 = spraoe.cfr_renamed_23(arg0);
            return new sprvje(spraoe2.cfr_renamed_314());
        }
        throw new IllegalArgumentException(sprsly.cfr_renamed_9("\u0007\u0019\u0019\u0019\u001d\u0000\u001cW\u001d\u0015\u0018\u0012\u0011\u0003R\u001e\u001cW\u0015\u0012\u0006>\u001c\u0004\u0006\u0016\u001c\u0014\u0017"));
    }
}

