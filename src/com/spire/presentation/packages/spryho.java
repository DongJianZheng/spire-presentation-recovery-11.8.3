/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhz;
import com.spire.presentation.packages.sprmgo;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprnrj;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrdz;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprssja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvfja;
import com.spire.presentation.packages.sprxfo;
import com.spire.presentation.packages.sprzjo;

@sprtea
public class spryho
extends sprrzn
implements sprhz {
    @sprtea
    public spryho cfr_renamed_15963(double arg0) {
        spryho spryho2 = this;
        spryho2.cfr_renamed_15538("Right", sprmgo.cfr_renamed_15502(arg0));
        return spryho2;
    }

    @sprtea
    public spryho cfr_renamed_15964(double arg0) {
        spryho spryho2 = this;
        spryho2.cfr_renamed_15538("Bottom", sprmgo.cfr_renamed_15502(arg0));
        return spryho2;
    }

    @sprtea
    public Double cfr_renamed_13341() {
        String string = this.cfr_renamed_15499("Right");
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return 0.0;
        }
        return sprssja.cfr_renamed_13364(string, sprvfja.cfr_renamed_12042());
    }

    @sprtea
    public spryho cfr_renamed_15965(sprxfo arg0) {
        spryho spryho2 = this;
        spryho2.cfr_renamed_15480("Type", arg0.toString());
        return spryho2;
    }

    @sprtea
    public Double cfr_renamed_13430() {
        String string = this.cfr_renamed_15499("Left");
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return 0.0;
        }
        return sprssja.cfr_renamed_13364(string, sprvfja.cfr_renamed_12042());
    }

    @sprtea
    public Double cfr_renamed_13429() {
        String string = this.cfr_renamed_15499("Bottom");
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return 0.0;
        }
        return sprssja.cfr_renamed_13364(string, sprvfja.cfr_renamed_12042());
    }

    @sprtea
    public Double cfr_renamed_13342() {
        String string = this.cfr_renamed_15499("Top");
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return 0.0;
        }
        return sprssja.cfr_renamed_13364(string, sprvfja.cfr_renamed_12042());
    }

    @sprtea
    public spryho cfr_renamed_15852(double arg0) {
        spryho spryho2 = this;
        spryho2.cfr_renamed_15538(sprnrj.cfr_renamed_9("p\u001dE\u001f"), sprmgo.cfr_renamed_15502(arg0));
        return spryho2;
    }

    @sprtea
    public spryho(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public Double cfr_renamed_15966() {
        String string = this.cfr_renamed_15499(sprrdz.cfr_renamed_9("J\u0000\u007f\u0002"));
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return 0.0;
        }
        return sprssja.cfr_renamed_13364(string, sprvfja.cfr_renamed_12042());
    }

    @sprtea
    public sprzjo cfr_renamed_15924() {
        return sprzjo.cfr_renamed_141(this.cfr_renamed_15482(sprnrj.cfr_renamed_9("z\u0013M\u0017c6")));
    }

    @sprtea
    public sprxfo cfr_renamed_324() {
        return sprxfo.cfr_renamed_141(this.cfr_renamed_15482("Type"));
    }

    @sprtea
    public spryho() {
        super(sprrdz.cfr_renamed_9("T\nc\u001b"));
    }

    @sprtea
    public spryho cfr_renamed_15967(double arg0) {
        spryho spryho2 = this;
        spryho2.cfr_renamed_15538("Top", sprmgo.cfr_renamed_15502(arg0));
        return spryho2;
    }

    @sprtea
    public spryho cfr_renamed_15968(double arg0) {
        spryho spryho2 = this;
        spryho2.cfr_renamed_15538("Left", sprmgo.cfr_renamed_15502(arg0));
        return spryho2;
    }

    @sprtea
    public spryho cfr_renamed_15922(sprzjo arg0) {
        spryho spryho2 = this;
        spryho2.cfr_renamed_15480(sprnrj.cfr_renamed_9("z\u0013M\u0017c6"), arg0.toString());
        return spryho2;
    }
}

