/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdfp;
import com.spire.presentation.packages.sprhel;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprud;
import com.spire.presentation.packages.sprxq;
import com.spire.presentation.packages.spryhl;
import com.spire.presentation.packages.sprznj;

public class sprnil
extends spryhl
implements sprud {
    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        void arg1;
        sprnil sprnil2 = this;
        return sprnil2.cfr_renamed_1199(byArray, (int)arg1, sprnil2.cfr_renamed_1218());
    }

    public sprnil() {
        this(128);
    }

    public sprnil(spriil arg0) {
        this(128, arg0);
    }

    public sprnil(sprnil arg0) {
        super(arg0);
    }

    public sprnil(int arg0, spriil arg1) {
        super(sprnil.cfr_renamed_10483(arg0), arg1);
    }

    public sprnil(int arg0) {
        super(sprnil.cfr_renamed_10483(arg0), spriil.cfr_renamed_0);
    }

    @Override
    public sprxq cfr_renamed_10476() {
        sprnil sprnil2 = this;
        return sprhel.cfr_renamed_10474(sprnil2, sprnil2.cfr_renamed_119);
    }

    public int cfr_renamed_10484(byte[] arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg4 < 0 || arg4 > 7) {
            throw new IllegalArgumentException(sprdfp.cfr_renamed_9("\u0014CRAGZR_qZG@\u0014\u0013^F@G\u0013QV\u0013Z]\u0013G[V\u0013AR]TV\u0013h\u0003\u001f\u0004n"));
        }
        int n = arg3 & (1 << arg4) - 1 | 15 << arg4;
        int n2 = arg4 + 4;
        if (n2 >= 8) {
            n2 -= 8;
            this.cfr_renamed_10485((byte)n);
            n >>>= 8;
        }
        if (n2 > 0) {
            this.cfr_renamed_10486(n, n2);
        }
        sprnil sprnil2 = this;
        sprnil2.cfr_renamed_3800(arg0, arg1, (long)arg2 * 8L);
        sprnil2.cfr_renamed_41();
        return arg2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_10487(byte[] byArray, int n, byte by, int n2) {
        void arg3;
        void arg2;
        void arg1;
        sprnil sprnil2 = this;
        return sprnil2.cfr_renamed_10484(byArray, (int)arg1, sprnil2.cfr_renamed_1218(), (byte)arg2, (int)arg3);
    }

    @Override
    public int cfr_renamed_1218() {
        return this.cfr_renamed_1 / 4;
    }

    @Override
    public int cfr_renamed_1199(byte[] arg0, int arg1, int arg2) {
        sprnil sprnil2 = this;
        int n = sprnil2.cfr_renamed_6410(arg0, arg1, arg2);
        sprnil2.cfr_renamed_41();
        return n;
    }

    @Override
    public int cfr_renamed_6410(byte[] arg0, int arg1, int arg2) {
        if (!this.cfr_renamed_4) {
            this.cfr_renamed_10486(15, 4);
        }
        this.cfr_renamed_3800(arg0, arg1, (long)arg2 * 8L);
        return arg2;
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, sprznj.cfr_renamed_9("^PLSH")).append(this.cfr_renamed_1).toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ int cfr_renamed_10483(int arg0) {
        switch (arg0) {
            case 128: 
            case 256: {
                return arg0;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprdfp.cfr_renamed_9("\u0014QZG`GAV]TG[\u0014\u0013")).append(arg0).append(sprznj.cfr_renamed_9("8cwy8~m}hbjy}i8kw\u007f8^PLSH")).toString());
    }
}

