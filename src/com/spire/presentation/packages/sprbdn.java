/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprean;
import com.spire.presentation.packages.sprief;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprse;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.Iterator;

public class sprbdn
extends sprqqe
implements sprse<sprco> {
    private final sprco[] cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprcen(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprbdn(sprszm sprszm2) {
        int n;
        this.cfr_renamed_4 = new sprco[sprszm2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.length) {
            void arg0;
            int n3 = n++;
            this.cfr_renamed_4[n3] = sprean.cfr_renamed_23(arg0.cfr_renamed_85(n3));
            n2 = n;
        }
    }

    public static sprbdn cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbdn) {
            return (sprbdn)arg0;
        }
        if (arg0 != null) {
            return new sprbdn(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public Iterator<sprco> iterator() {
        return new sprief<sprco>(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprbdn(sprean[] spreanArray) {
        void arg0;
        this.cfr_renamed_4 = new sprco[spreanArray.length];
        System.arraycopy(arg0, 0, this.cfr_renamed_4, 0, ((void)arg0).length);
    }
}

