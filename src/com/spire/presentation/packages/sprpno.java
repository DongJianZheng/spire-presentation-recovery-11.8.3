/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprrp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwvn;
import java.util.Iterator;

@sprtea
public abstract class sprpno {
    private sprwvn cfr_renamed_4;

    public sprpno() {
        sprpno sprpno2 = this;
        sprpno2.cfr_renamed_4 = new sprwvn();
    }

    public abstract sprqgp cfr_renamed_16312();

    public void cfr_renamed_16293() {
        Iterator iterator;
        Iterator iterator2 = iterator = this.cfr_renamed_4.iterator();
        while (iterator2.hasNext()) {
            ((sprrp)iterator.next()).cfr_renamed_16423();
            iterator2 = iterator;
        }
    }

    public sprwvn cfr_renamed_16424() {
        return this.cfr_renamed_4;
    }
}

