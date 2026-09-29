/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjxl;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprnxe;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprgtn
extends sprrzn {
    @sprtea
    public String cfr_renamed_97() {
        sprnco sprnco2 = this.cfr_renamed_15494("Value");
        if (sprnco2 == null) {
            return null;
        }
        return sprnco2.cfr_renamed_15495();
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprgtn(String string, String string2, String string3) {
        void arg2;
        void arg1;
        sprgtn sprgtn2 = this;
        sprgtn2();
        sprgtn2.cfr_renamed_15746(string).cfr_renamed_12807((String)arg1).cfr_renamed_4325((String)arg2);
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprgtn(String string, String string2) {
        void arg1;
        sprgtn sprgtn2 = this;
        sprgtn2();
        sprgtn2.cfr_renamed_15746(string).cfr_renamed_12807((String)arg1);
    }

    @sprtea
    public sprgtn cfr_renamed_12807(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null) || sprraia.cfr_renamed_12806(arg0).length() == 0) {
            sprgtn sprgtn2 = this;
            sprgtn2.cfr_renamed_15489("");
            return sprgtn2;
        }
        sprgtn sprgtn3 = this;
        sprgtn3.cfr_renamed_15489(arg0);
        return sprgtn3;
    }

    @sprtea
    public sprgtn() {
        super(sprnxe.cfr_renamed_9(")\u000f\u0016\r\u001c\u000f\r\u0004"));
    }

    @sprtea
    public sprgtn cfr_renamed_4325(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null) || sprraia.cfr_renamed_12806(arg0).length() == 0) {
            sprgtn sprgtn2 = this;
            sprgtn2.cfr_renamed_15492("Type");
            return sprgtn2;
        }
        sprgtn sprgtn3 = this;
        sprgtn3.cfr_renamed_15480("Type", arg0);
        return sprgtn3;
    }

    @sprtea
    public String cfr_renamed_324() {
        return this.cfr_renamed_15482("Type");
    }

    @sprtea
    public sprgtn(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public String cfr_renamed_15747() {
        String string = this.cfr_renamed_15482("Name");
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            throw new IllegalArgumentException(sprjxl.cfr_renamed_9("\u6208\u5c56\u5c3f\u6024\u546c\u79f3\uff69M\u0000n\u0004\uff0a\u4e6c\u80fe\u4e5b\u7a79"));
        }
        return string;
    }

    @sprtea
    public sprgtn cfr_renamed_15746(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null) || sprraia.cfr_renamed_12806(arg0).length() == 0) {
            throw new IllegalArgumentException(sprnxe.cfr_renamed_9("\u6210\u5c28\u5c27\u605a\u5474\u798d\uff713\u0018\u0010\u001c\uff74\u4e74\u8080\u4e43\u7a07"));
        }
        sprgtn sprgtn2 = this;
        sprgtn2.cfr_renamed_15480("Name", arg0);
        return sprgtn2;
    }
}

