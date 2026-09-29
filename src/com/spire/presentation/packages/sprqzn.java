/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraqe;
import com.spire.presentation.packages.sprbtn;
import com.spire.presentation.packages.sprgtja;
import com.spire.presentation.packages.sprlgo;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprqwg;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprqzn
extends sprrzn {
    @sprtea
    public sprqzn cfr_renamed_15491(sprbtn arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException(spraqe.cfr_renamed_9("\u7260\u6725\u532d\u5422\u76ac\u658e\u4ede\u521e\u8840\uff01n`Dld`[}\uff21\u4e04\u80d5\u4e33\u7a52"));
        }
        sprqzn sprqzn2 = this;
        sprqzn2.cfr_renamed_15271(arg0);
        return sprqzn2;
    }

    @sprtea
    public sprqzn cfr_renamed_15224(sprgtja arg0) {
        if (arg0 == null) {
            sprqzn sprqzn2 = this;
            sprqzn2.cfr_renamed_15492(sprqwg.cfr_renamed_9("Q%w6f>}9V6f2"));
            return sprqzn2;
        }
        sprqzn sprqzn3 = this;
        sprqzn3.cfr_renamed_15480(spraqe.cfr_renamed_9("JZlI}AfFMI}M"), arg0.toString());
        return sprqzn3;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprqzn(String string, sprbtn sprbtn2) {
        void arg1;
        sprqzn sprqzn2 = this;
        sprqzn2();
        sprqzn2.cfr_renamed_15479(string).cfr_renamed_15491((sprbtn)arg1);
    }

    @sprtea
    public sprqzn cfr_renamed_15202(sprlgo arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprqwg.cfr_renamed_9("\u8bb2\u725a\u677b\u7696\u5132\u53f1\u65d0\u4ee4\uff5fV8q\u0005}8f\uff5e\u4e1f\u80aa\u4e28\u7a2d"));
        }
        sprqzn sprqzn2 = this;
        sprqzn2.cfr_renamed_15421("DocRoot", arg0);
        return sprqzn2;
    }

    @sprtea
    public sprqzn() {
        super(spraqe.cfr_renamed_9("MGj~lZzAfF"));
    }

    @sprtea
    public String cfr_renamed_15493() {
        return this.cfr_renamed_15482("Name");
    }

    @sprtea
    public sprqzn(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public String cfr_renamed_3() {
        return this.cfr_renamed_15482("Version");
    }

    @sprtea
    public sprlgo cfr_renamed_15365() {
        sprnco sprnco2 = this.cfr_renamed_15494("DocRoot");
        if (sprnco2 == null) {
            return null;
        }
        return new sprlgo(sprnco2.cfr_renamed_15495());
    }

    @sprtea
    public sprqzn cfr_renamed_15479(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null) || sprraia.cfr_renamed_12806(arg0).length() == 0) {
            throw new IllegalArgumentException(sprqwg.cfr_renamed_9("\u721f\u673e\u6850\u8bd4\u7b71\uff1a\u001eV\uff5e\u4e1f\u80aa\u4e28\u7a2d"));
        }
        sprqzn sprqzn2 = this;
        sprqzn2.cfr_renamed_15480("ID", arg0.toString());
        return sprqzn2;
    }

    @sprtea
    public sprqzn cfr_renamed_15496(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null)) {
            sprqzn sprqzn2 = this;
            sprqzn2.cfr_renamed_15492("Name");
            return sprqzn2;
        }
        sprqzn sprqzn3 = this;
        sprqzn3.cfr_renamed_15480("Name", arg0);
        return sprqzn3;
    }

    @sprtea
    public sprbtn cfr_renamed_15497() {
        sprnco sprnco2 = this.cfr_renamed_15494(spraqe.cfr_renamed_9("OAeMEAz\\"));
        if (sprnco2 == null) {
            return null;
        }
        return new sprbtn(sprnco2);
    }

    @sprtea
    public sprqzn cfr_renamed_15498(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null)) {
            sprqzn sprqzn2 = this;
            sprqzn2.cfr_renamed_15492(arg0);
            return sprqzn2;
        }
        sprqzn sprqzn3 = this;
        sprqzn3.cfr_renamed_15480("Version", arg0);
        return sprqzn3;
    }

    @sprtea
    public String cfr_renamed_6005() {
        String string = this.cfr_renamed_15482("ID");
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            throw new IllegalArgumentException(sprqwg.cfr_renamed_9("\u721f\u673e\u6850\u8bd4\u7b71\uff1a\u001eV\uff5e\u4e1f\u80aa\u4e28\u7a2d"));
        }
        return string;
    }

    @sprtea
    public sprgtja cfr_renamed_9310() {
        String string = this.cfr_renamed_15499(spraqe.cfr_renamed_9("JZlI}AfFMI}M"));
        sprgtja sprgtja2 = new sprgtja();
        sprgtja2 = !sprriia.cfr_renamed_15321(string, null) ? sprgtja.cfr_renamed_15500(string) : sprgtja2;
        return sprgtja2;
    }
}

