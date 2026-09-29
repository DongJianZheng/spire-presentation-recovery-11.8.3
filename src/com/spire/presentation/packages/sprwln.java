/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjvo;
import com.spire.presentation.packages.sprruha;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvjn;

@sprtea
public class sprwln
extends sprvjn {
    private String cfr_renamed_2;
    private String cfr_renamed_3;
    private sprsuja cfr_renamed_4;

    public String cfr_renamed_12909() {
        return this.cfr_renamed_3;
    }

    @sprtea
    public static String cfr_renamed_13788(String arg0) {
        return new sprruha(sprjvo.cfr_renamed_9("\u0011\u001b")).cfr_renamed_12004(arg0, "_");
    }

    @Override
    public void cfr_renamed_13121(sprsmn arg0) {
        arg0.cfr_renamed_13115(this);
    }

    /*
     * WARNING - void declaration
     */
    public sprwln(sprsuja sprsuja2, String string) {
        void arg1;
        void arg0;
        sprwln sprwln2 = this;
        this.cfr_renamed_4 = sprsuja.cfr_renamed_13377();
        this.cfr_renamed_4 = arg0;
        sprwln2.cfr_renamed_3 = arg1;
        sprwln2.cfr_renamed_2 = sprwln.cfr_renamed_13788(string);
    }

    public void cfr_renamed_13109(sprsuja arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public String cfr_renamed_313() {
        return this.cfr_renamed_2;
    }

    public sprsuja cfr_renamed_13110() {
        return this.cfr_renamed_4;
    }

    public boolean cfr_renamed_13279() {
        return this.cfr_renamed_2.startsWith("_");
    }
}

