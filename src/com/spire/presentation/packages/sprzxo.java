/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprrpp;
import com.spire.presentation.packages.sprtea;
import java.util.Iterator;

@sprtea
public class sprzxo {
    private sprrpp cfr_renamed_3;
    private String cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprzxo(String string, Iterable iterable) {
        Iterator iterator;
        void arg0;
        this.cfr_renamed_4 = arg0;
        sprzxo sprzxo2 = this;
        this.cfr_renamed_3 = new sprrpp();
        Iterator iterator2 = iterator = iterable.iterator();
        while (iterator2.hasNext()) {
            sprfzo sprfzo2 = (sprfzo)iterator.next();
            iterator2 = iterator;
            this.cfr_renamed_3.cfr_renamed_12962(sprfzo2.cfr_renamed_13303(), sprfzo2);
        }
    }

    @sprtea
    public sprfzo cfr_renamed_18491(int arg0, boolean arg1) {
        sprfzo sprfzo2 = (sprfzo)this.cfr_renamed_3.cfr_renamed_576(arg0);
        if (sprfzo2 != null) {
            return sprfzo2;
        }
        if (arg1) {
            return null;
        }
        int n = arg0 & 0xFFFFFFFB;
        sprfzo2 = (sprfzo)this.cfr_renamed_3.cfr_renamed_576(n);
        if (sprfzo2 != null) {
            return sprfzo2;
        }
        n = arg0 & 0xFFFFFFF7;
        sprfzo2 = (sprfzo)this.cfr_renamed_3.cfr_renamed_576(n);
        if (sprfzo2 != null) {
            return sprfzo2;
        }
        n = arg0 & 0xFFFFFFFD;
        sprfzo2 = (sprfzo)this.cfr_renamed_3.cfr_renamed_576(n);
        if (sprfzo2 != null) {
            return sprfzo2;
        }
        n = arg0 & 0xFFFFFFFE;
        sprfzo2 = (sprfzo)this.cfr_renamed_3.cfr_renamed_576(n);
        if (sprfzo2 != null) {
            return sprfzo2;
        }
        n = 0;
        sprfzo2 = (sprfzo)this.cfr_renamed_3.cfr_renamed_576(n);
        if (sprfzo2 != null) {
            return sprfzo2;
        }
        Iterator iterator = this.cfr_renamed_3.cfr_renamed_205().iterator();
        if (iterator.hasNext()) {
            return (sprfzo)iterator.next();
        }
        return null;
    }

    public sprrpp cfr_renamed_15191() {
        return this.cfr_renamed_3;
    }

    public void cfr_renamed_11665() {
        this.cfr_renamed_3.cfr_renamed_722();
    }

    public void cfr_renamed_18492(sprfzo arg0) {
        this.cfr_renamed_3.cfr_renamed_12962(arg0.cfr_renamed_13303(), arg0);
    }

    @sprtea
    public String cfr_renamed_13460() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public int cfr_renamed_11861() {
        return this.cfr_renamed_3.cfr_renamed_11861();
    }
}

