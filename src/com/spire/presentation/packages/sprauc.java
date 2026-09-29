/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprayc;
import com.spire.presentation.packages.sprbbd;
import com.spire.presentation.packages.spreed;
import com.spire.presentation.packages.sprgsc;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprixc;
import com.spire.presentation.packages.sprkc;
import com.spire.presentation.packages.sprlnd;
import com.spire.presentation.packages.sprlxc;
import com.spire.presentation.packages.sprmtc;
import com.spire.presentation.packages.sprqbz;
import com.spire.presentation.packages.sprsc;
import com.spire.presentation.packages.sprsmaa;
import com.spire.presentation.packages.sprvmd;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzsc;
import com.spire.presentation.packages.sprzuc;
import java.io.IOException;

public class sprauc
extends sprgsc {
    public sprbbd cfr_renamed_0;
    public sprzuc cfr_renamed_1;
    public sprsc cfr_renamed_2;
    public sprhgb cfr_renamed_3;
    public sprkc cfr_renamed_4;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_2805(byte[] arg0) throws IOException {
        try {
            if (sprzsc.cfr_renamed_2631(this.cfr_renamed_2)) {
                sprauc sprauc2 = this;
                return sprauc2.cfr_renamed_4.cfr_renamed_2808(sprauc2.cfr_renamed_1, this.cfr_renamed_3, arg0);
            }
        }
        catch (sprvmd sprvmd2) {
            throw new spryad(80);
        }
        {
            sprauc sprauc3 = this;
            return sprauc3.cfr_renamed_4.cfr_renamed_2810(sprauc3.cfr_renamed_3, arg0);
        }
    }

    @Override
    public sprzuc cfr_renamed_2804() {
        return this.cfr_renamed_1;
    }

    public sprauc(sprsc arg0, sprbbd arg1, sprhgb arg2) {
        this(arg0, arg1, arg2, null);
    }

    @Override
    public sprbbd cfr_renamed_2141() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public sprauc(sprsc sprsc2, sprbbd sprbbd2, sprhgb sprhgb2, sprzuc sprzuc2) {
        sprauc sprauc2;
        void arg3;
        void arg0;
        void arg2;
        void arg1;
        if (sprbbd2 == null) {
            throw new IllegalArgumentException(sprqbz.cfr_renamed_9("R\u0003\u0010\u0012\u0001\t\u0013\t\u0016\u0001\u0001\u0005R@\u0016\u0001\u001b\u000e\u001a\u0014U\u0002\u0010@\u001b\u0015\u0019\f"));
        }
        if (arg1.cfr_renamed_29()) {
            throw new IllegalArgumentException(sprsmaa.cfr_renamed_9("T(\u00169\u0007\"\u0015\"\u0010*\u0007.Tk\u0010*\u001d%\u001c?S)\u0016k\u0016&\u0003?\n"));
        }
        if (arg2 == null) {
            throw new IllegalArgumentException(sprqbz.cfr_renamed_9("G\u0005\u0012\u001c\u0016\u0014\u0014\u0010+\u0010\u0019R@\u0016\u0001\u001b\u000e\u001a\u0014U\u0002\u0010@\u001b\u0015\u0019\f"));
        }
        if (!arg2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprsmaa.cfr_renamed_9("l\u00039\u001a=\u0012?\u0016\u0000\u00162Tk\u001e>\u0000?S)\u0016k\u00039\u001a=\u0012?\u0016"));
        }
        if (sprzsc.cfr_renamed_2631((sprsc)arg0) && arg3 == null) {
            throw new IllegalArgumentException(sprqbz.cfr_renamed_9("R\u0013\u001c\u0007\u001b\u0001\u0001\u0015\u0007\u00054\u000e\u0011(\u0014\u0013\u001d!\u0019\u0007\u001a\u0012\u001c\u0014\u001d\rR@\u0016\u0001\u001b\u000e\u001a\u0014U\u0002\u0010@\u001b\u0015\u0019\fU\u0006\u001a\u0012UH1I!,&@DNGK"));
        }
        if (arg2 instanceof sprmtc) {
            sprauc2 = this;
            this.cfr_renamed_4 = new sprayc();
        } else if (arg2 instanceof sprlnd) {
            sprauc2 = this;
            this.cfr_renamed_4 = new sprlxc();
        } else if (arg2 instanceof spreed) {
            sprauc2 = this;
            this.cfr_renamed_4 = new sprixc();
        } else {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprsmaa.cfr_renamed_9("T;\u0001\"\u0005*\u0007.8.\nlS?\n;\u0016k\u001d$\u0007k\u0000>\u0003;\u001c9\u0007.\u0017qS")).append(arg2.getClass().getName()).toString());
        }
        sprauc2.cfr_renamed_4.cfr_renamed_2797((sprsc)arg0);
        sprauc sprauc3 = this;
        sprauc sprauc4 = this;
        sprauc4.cfr_renamed_2 = arg0;
        sprauc4.cfr_renamed_0 = arg1;
        sprauc3.cfr_renamed_3 = arg2;
        sprauc3.cfr_renamed_1 = arg3;
    }
}

