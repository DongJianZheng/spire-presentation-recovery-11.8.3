/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkjo;
import com.spire.presentation.packages.sprlgo;
import com.spire.presentation.packages.sprlyn;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprqbo;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprsdn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprzxn;

@sprtea
public class sprlbo
extends sprrzn {
    private sprqbo cfr_renamed_4;

    @sprtea
    public sprlbo cfr_renamed_15190(Boolean arg0) {
        if (arg0 == null) {
            arg0 = false;
        }
        sprlbo sprlbo2 = this;
        sprlbo2.cfr_renamed_15480("Bold", arg0.toString().toLowerCase());
        return sprlbo2;
    }

    @sprtea
    public String cfr_renamed_13460() {
        return this.cfr_renamed_15482(sprsdn.cfr_renamed_9("1N\u001aF\u001bV9N\u001aJ"));
    }

    @sprtea
    public sprlbo cfr_renamed_15182(Boolean arg0) {
        if (arg0 == null) {
            arg0 = false;
        }
        sprlbo sprlbo2 = this;
        sprlbo2.cfr_renamed_15480("Italic", arg0.toString().toLowerCase());
        return sprlbo2;
    }

    @sprtea
    public sprlbo cfr_renamed_15531(sprzxn arg0) {
        if (arg0 == null) {
            arg0 = sprzxn.cfr_renamed_1;
        }
        sprlbo sprlbo2 = this;
        sprlbo2.cfr_renamed_15480(sprlyn.cfr_renamed_9("j\u0000H\u001az\r]"), arg0.toString());
        return sprlbo2;
    }

    @sprtea
    public Boolean cfr_renamed_15532() {
        String string = this.cfr_renamed_15482(sprsdn.cfr_renamed_9("1F\u000fJ\u0013x\u001eK\u0003G"));
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return false;
        }
        return Boolean.parseBoolean(string);
    }

    @sprtea
    public Boolean cfr_renamed_15533() {
        String string = this.cfr_renamed_15482("Bold");
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return false;
        }
        return Boolean.parseBoolean(string);
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprlbo cfr_renamed_15534(String string) {
        void arg0;
        return this.cfr_renamed_15188(new sprlgo((String)arg0));
    }

    @sprtea
    public sprqbo cfr_renamed_15155() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public sprlbo cfr_renamed_15535(Boolean arg0) {
        if (arg0 == null) {
            arg0 = false;
        }
        sprlbo sprlbo2 = this;
        sprlbo2.cfr_renamed_15480(sprlyn.cfr_renamed_9("z\r[\u0001O"), arg0.toString().toLowerCase());
        return sprlbo2;
    }

    @sprtea
    public sprlbo() {
        super(sprsdn.cfr_renamed_9("1@\u0019["));
    }

    @sprtea
    public boolean cfr_renamed_14878() {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.cfr_renamed_14878();
        }
        return false;
    }

    @sprtea
    public String cfr_renamed_15536() {
        String string = this.cfr_renamed_15482("FontName");
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            throw new IllegalArgumentException(sprlyn.cfr_renamed_9("\u5b7e\u5f0a\u5424\uff60O\u0007G\u001cg\tD\r\uff20\u4e65\u80d4\u4e52\u7a53"));
        }
        return string;
    }

    @sprtea
    public sprkjo cfr_renamed_6005() {
        return this.cfr_renamed_15537();
    }

    @sprtea
    public sprlbo cfr_renamed_15186(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null) || sprraia.cfr_renamed_12806(arg0).length() == 0) {
            return this;
        }
        sprlbo sprlbo2 = this;
        sprlbo2.cfr_renamed_15480(sprsdn.cfr_renamed_9("1N\u001aF\u001bV9N\u001aJ"), arg0);
        return sprlbo2;
    }

    @sprtea
    public sprlbo cfr_renamed_15263(sprkjo arg0) {
        sprlbo sprlbo2 = this;
        sprlbo2.cfr_renamed_15279(arg0);
        return sprlbo2;
    }

    @sprtea
    public sprlbo cfr_renamed_15188(sprlgo arg0) {
        sprlbo sprlbo2 = this;
        sprlbo2.cfr_renamed_15538(sprlyn.cfr_renamed_9(".F\u0006].@\u0004L"), arg0.toString());
        return sprlbo2;
    }

    @sprtea
    public sprlbo cfr_renamed_15539(Boolean arg0) {
        if (arg0 == null) {
            arg0 = false;
        }
        sprlbo sprlbo2 = this;
        sprlbo2.cfr_renamed_15480(sprsdn.cfr_renamed_9("1F\u000fJ\u0013x\u001eK\u0003G"), arg0.toString().toLowerCase());
        return sprlbo2;
    }

    @sprtea
    public sprlbo cfr_renamed_15185(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null)) {
            throw new IllegalArgumentException(sprlyn.cfr_renamed_9("\u5b7e\u5f0a\u5424\uff60O\u0007G\u001cg\tD\r\uff20\u4e65\u80d4\u4e52\u7a53"));
        }
        sprlbo sprlbo2 = this;
        sprlbo2.cfr_renamed_15480("FontName", arg0.toString());
        return sprlbo2;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprlbo cfr_renamed_15187(long l) {
        void arg0;
        sprlbo sprlbo2 = this;
        sprlbo2.cfr_renamed_15279(new sprkjo((long)arg0));
        return sprlbo2;
    }

    @sprtea
    public sprlgo cfr_renamed_15252() {
        return sprlgo.cfr_renamed_141(this.cfr_renamed_15499(sprsdn.cfr_renamed_9("1@\u0019[1F\u001bJ")));
    }

    @sprtea
    public void cfr_renamed_15189(sprqbo arg0) {
        this.cfr_renamed_4 = arg0;
    }

    @sprtea
    public Boolean cfr_renamed_15540() {
        String string = this.cfr_renamed_15482(sprlyn.cfr_renamed_9("z\r[\u0001O"));
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return false;
        }
        return Boolean.parseBoolean(string);
    }

    @sprtea
    public sprzxn cfr_renamed_15541() {
        return sprzxn.cfr_renamed_141(this.cfr_renamed_15482(sprsdn.cfr_renamed_9("l\u001fN\u0005|\u0012[")));
    }

    @sprtea
    public Boolean cfr_renamed_15526() {
        String string = this.cfr_renamed_15482("Italic");
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return false;
        }
        return Boolean.parseBoolean(string);
    }

    @sprtea
    public sprlbo(String string) {
        sprlbo sprlbo2 = this;
        sprlbo2();
        sprlbo2.cfr_renamed_15185(string);
    }

    @sprtea
    public sprlbo(sprnco arg0) {
        super(arg0);
    }
}

