/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprenn;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprrup;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwln;

@sprtea
public final class sprehn
extends sprenn {
    private String cfr_renamed_1;
    private boolean cfr_renamed_2;
    private String cfr_renamed_3;
    private String cfr_renamed_4;

    public String cfr_renamed_14052() {
        return this.cfr_renamed_1;
    }

    public String cfr_renamed_13395() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprehn(sprgeja sprgeja2, String string, String string2, String string3) {
        super((sprgeja)arg0);
        void arg3;
        void arg2;
        void arg1;
        sprehn sprehn2;
        void arg0;
        if (sprrup.cfr_renamed_14053(string)) {
            sprehn2 = this;
            this.cfr_renamed_2 = true;
            this.cfr_renamed_3 = sprwln.cfr_renamed_13788(arg1.substring(1));
        } else {
            sprehn2 = this;
            sprehn sprehn3 = this;
            sprehn3.cfr_renamed_2 = false;
            sprehn3.cfr_renamed_3 = arg1;
        }
        sprehn2.cfr_renamed_4 = arg2;
        this.cfr_renamed_1 = arg3;
    }

    public boolean cfr_renamed_13234() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprehn(sprgeja sprgeja2, boolean bl, String string, String string2, String string3) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprehn sprehn2 = this;
        sprehn sprehn3 = this;
        super((sprgeja)arg0);
        sprehn3.cfr_renamed_2 = arg1;
        sprehn3.cfr_renamed_3 = arg2;
        sprehn2.cfr_renamed_4 = arg3;
        sprehn2.cfr_renamed_1 = string3;
    }

    @Override
    public sprenn cfr_renamed_12099() {
        sprehn sprehn2 = new sprehn(super.cfr_renamed_13543(), this.cfr_renamed_13234(), this.cfr_renamed_4750(), this.cfr_renamed_13395(), this.cfr_renamed_14052());
        sprehn2.cfr_renamed_14050(super.cfr_renamed_14051());
        return sprehn2;
    }

    public sprehn(sprgeja arg0, String arg1, String arg2) {
        this(arg0, arg1, arg2, null);
    }

    @Override
    public int cfr_renamed_14049() {
        return 0;
    }

    public String cfr_renamed_4750() {
        return this.cfr_renamed_3;
    }

    public sprehn(sprgeja arg0, String arg1) {
        this(arg0, arg1, "", null);
    }
}

