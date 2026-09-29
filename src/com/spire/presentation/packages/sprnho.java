/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcfp;
import com.spire.presentation.packages.sprjth;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprpkja;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprnho
extends sprrzn {
    @sprtea
    public sprnho cfr_renamed_15861(int arg0) {
        sprnho sprnho2 = this;
        sprnho2.cfr_renamed_15480(sprjth.cfr_renamed_9("HB{Dn^"), sprpkja.cfr_renamed_15512(arg0));
        return sprnho2;
    }

    @sprtea
    public sprnho() {
        super(sprcfp.cfr_renamed_9("$Z\u001dF\u0000"));
    }

    @sprtea
    public sprnho(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public Integer cfr_renamed_15862() {
        String string = this.cfr_renamed_15482(sprjth.cfr_renamed_9("HB{Dn^"));
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return -1;
        }
        return Integer.parseInt(string);
    }

    @sprtea
    public Boolean cfr_renamed_15863() {
        String string = this.cfr_renamed_15499(sprcfp.cfr_renamed_9("$Z\u001dF\u0000I\u0016D\u0011"));
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return true;
        }
        return Boolean.parseBoolean(string);
    }

    @sprtea
    public sprnho cfr_renamed_15864(boolean arg0) {
        sprnho sprnho2 = this;
        sprnho2.cfr_renamed_15480(sprjth.cfr_renamed_9("}yDeYjOgH"), sprpkja.cfr_renamed_15716(arg0));
        return sprnho2;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprnho(boolean bl, int n) {
        void arg1;
        sprnho sprnho2 = this;
        sprnho2();
        sprnho2.cfr_renamed_15864(bl).cfr_renamed_15861((int)arg1);
    }
}

