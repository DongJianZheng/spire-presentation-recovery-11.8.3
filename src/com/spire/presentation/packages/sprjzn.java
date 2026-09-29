/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlgo;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprraja;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprzkaa;

@sprtea
public class sprjzn
extends sprrzn {
    @sprtea
    public sprjzn cfr_renamed_15479(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null)) {
            throw new IllegalArgumentException(sprraja.cfr_renamed_9("\u65d6\u4ed8\u5246\u8846\u65d6\u4ed8\u6856\u8be8\uff59g\u0015\uff27\u4e5c\u80d3\u4e6b\u7a54"));
        }
        sprjzn sprjzn2 = this;
        sprjzn2.cfr_renamed_15480("ID", arg0);
        return sprjzn2;
    }

    @sprtea
    public sprjzn() {
        super(sprzkaa.cfr_renamed_9("N)d%"));
    }

    @sprtea
    public sprjzn cfr_renamed_15488(sprlgo arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprraja.cfr_renamed_9("\u65d6\u4ed8\u5246\u8846\u65d6\u4ed8\u639e\u8fde\uff59h8B4\uff27\u4e5c\u80d3\u4e6b\u7a54"));
        }
        sprjzn sprjzn2 = this;
        sprjzn2.cfr_renamed_15489(arg0.toString());
        return sprjzn2;
    }

    @sprtea
    public String cfr_renamed_6005() {
        String string = this.cfr_renamed_15482("ID");
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            throw new IllegalArgumentException(sprzkaa.cfr_renamed_9("\u658f\u4eb6\u521f\u8828\u658f\u4eb6\u680f\u8b86\uff00\tL\uff49\u4e05\u80bd\u4e32\u7a3a"));
        }
        return string;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprjzn(String string, sprlgo sprlgo2) {
        void arg1;
        sprjzn sprjzn2 = this;
        sprjzn2();
        sprjzn2.cfr_renamed_15479(string).cfr_renamed_15488((sprlgo)arg1);
    }

    @sprtea
    public sprlgo cfr_renamed_15490() {
        String string = this.cfr_renamed_13030();
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            throw new IllegalArgumentException(sprraja.cfr_renamed_9("\u65d6\u4ed8\u5246\u8846\u65d6\u4ed8\u639e\u8fde\uff59h8B4\uff27\u4e5c\u80d3\u4e6b\u7a54"));
        }
        return sprlgo.cfr_renamed_141(string);
    }

    @sprtea
    public sprjzn(sprnco arg0) {
        super(arg0);
    }
}

