/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprasn;
import com.spire.presentation.packages.sprcjn;
import com.spire.presentation.packages.sprgpo;
import com.spire.presentation.packages.sprheb;
import com.spire.presentation.packages.sprhpo;
import com.spire.presentation.packages.sprsin;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprzhn;
import java.util.Iterator;

@sprtea
public class sprygo
extends sprasn {
    private sprgpo cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprygo(sprgpo sprgpo2) {
        super((sprcjn)arg0);
        void arg0;
        this.cfr_renamed_4 = sprgpo2;
    }

    @Override
    public sprsin cfr_renamed_13415() {
        return new sprhpo(this.cfr_renamed_4);
    }

    @Override
    @sprtea
    public void cfr_renamed_12434() {
        sprygo sprygo2 = this;
        sprygo2.cfr_renamed_13380().cfr_renamed_12402(sprheb.cfr_renamed_9("v]\u000e3\t(\u0013,\u000f\\\"\b'\u0010t"));
        sprygo2.cfr_renamed_13380().cfr_renamed_12423(sprzhn.cfr_renamed_9("\u001a1\u001f)"));
    }

    @Override
    @sprtea
    public void cfr_renamed_12453() {
        Iterator iterator;
        sprygo sprygo2 = this;
        sprygo2.cfr_renamed_4.cfr_renamed_13434();
        sprygo2.cfr_renamed_13380().cfr_renamed_12423("body");
        Iterator iterator2 = iterator = sprygo2.cfr_renamed_2.iterator();
        while (iterator2.hasNext()) {
            ((sprsin)iterator.next()).cfr_renamed_13396();
            iterator2 = iterator;
        }
        sprygo sprygo3 = this;
        sprygo3.cfr_renamed_13380().cfr_renamed_12439();
        sprygo3.cfr_renamed_13380().cfr_renamed_12439();
        sprygo3.cfr_renamed_13380().cfr_renamed_2947();
    }
}

