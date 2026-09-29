/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprpkja;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprsr;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprudda;
import com.spire.presentation.packages.sprugg;

@sprtea
public class sprhfo
extends sprrzn
implements sprsr {
    @sprtea
    public Boolean cfr_renamed_15956() {
        String string = this.cfr_renamed_15482(sprudda.cfr_renamed_9("a8X\nF3K2X"));
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return null;
        }
        return Boolean.parseBoolean(string);
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprhfo(String string, boolean bl) {
        void arg1;
        sprhfo sprhfo2 = this;
        sprhfo2();
        sprhfo2.cfr_renamed_15957(string).cfr_renamed_15958((boolean)arg1);
    }

    @sprtea
    public String cfr_renamed_15959() {
        return this.cfr_renamed_15482(sprugg.cfr_renamed_9("Dhq}ftLX"));
    }

    @sprtea
    public sprhfo cfr_renamed_15957(String arg0) {
        sprhfo sprhfo2 = this;
        sprhfo2.cfr_renamed_15480(sprudda.cfr_renamed_9("\u001c[)N>G\u0014k"), arg0);
        return sprhfo2;
    }

    @sprtea
    public sprhfo(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprhfo() {
        super(sprugg.cfr_renamed_9("[jhj]"));
    }

    @sprtea
    public sprhfo(String string) {
        sprhfo sprhfo2 = this;
        sprhfo2();
        sprhfo2.cfr_renamed_15957(string);
    }

    @sprtea
    public sprhfo cfr_renamed_15958(boolean arg0) {
        sprhfo sprhfo2 = this;
        sprhfo2.cfr_renamed_15480(sprudda.cfr_renamed_9("a8X\nF3K2X"), sprpkja.cfr_renamed_15716(arg0));
        return sprhfo2;
    }
}

