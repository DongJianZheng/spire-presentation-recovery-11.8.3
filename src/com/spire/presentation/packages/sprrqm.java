/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnica;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprurm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzuo;
import java.io.IOException;

public class sprrqm
extends sprqqe
implements sprlm {
    private final sprlem cfr_renamed_3;
    private final sprurm cfr_renamed_4;

    public sprurm cfr_renamed_9809() {
        return this.cfr_renamed_4;
    }

    public static sprrqm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprrqm) {
            return (sprrqm)arg0;
        }
        if (arg0 != null) {
            if (arg0 instanceof sprco) {
                sprxgf sprxgf2 = ((sprco)arg0).cfr_renamed_119();
                if (sprxgf2 instanceof sprlem) {
                    return new sprrqm(sprlem.cfr_renamed_23(sprxgf2));
                }
                if (sprxgf2 instanceof sprszm) {
                    return new sprrqm(sprurm.cfr_renamed_23(sprxgf2));
                }
            }
            if (arg0 instanceof byte[]) {
                try {
                    return sprrqm.cfr_renamed_23(sprxgf.cfr_renamed_184((byte[])arg0));
                }
                catch (IOException iOException) {
                    throw new IllegalArgumentException(sprnica.cfr_renamed_9("\bL\u0016L\u0012U\u0013\u0002\u0018L\u001eM\u0019K\u0013E]K\u0013\u0002\u001aG\tk\u0013Q\tC\u0013A\u0018\nT"));
                }
            }
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprzuo.cfr_renamed_9("\u001b>\u0005>\u0001'\u0000p\u00012\u00045\r$N9\u0000p\t5\u001a\u0019\u0000#\u001a1\u00003\u000bxGjN")).append(arg0.getClass().getName()).toString());
        }
        return null;
    }

    public boolean cfr_renamed_9808() {
        return this.cfr_renamed_3 != null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        if (this.cfr_renamed_3 != null) {
            return this.cfr_renamed_3;
        }
        return this.cfr_renamed_4.cfr_renamed_119();
    }

    public sprrqm(sprurm sprurm2) {
        sprrqm sprrqm2 = this;
        sprrqm2.cfr_renamed_3 = null;
        sprrqm2.cfr_renamed_4 = sprurm2;
    }

    public sprlem cfr_renamed_4721() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprrqm(sprlem sprlem2) {
        void arg0;
        sprrqm sprrqm2 = this;
        sprrqm2.cfr_renamed_3 = arg0;
        sprrqm2.cfr_renamed_4 = null;
    }
}

