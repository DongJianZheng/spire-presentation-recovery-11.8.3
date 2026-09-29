/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprery;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprqpaa;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprdbo
extends sprrzn {
    @sprtea
    public sprdbo cfr_renamed_15498(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null) || sprraia.cfr_renamed_12806(arg0).length() == 0) {
            sprdbo sprdbo2 = this;
            sprdbo2.cfr_renamed_15492("Version");
            return sprdbo2;
        }
        sprdbo sprdbo3 = this;
        sprdbo3.cfr_renamed_15480("Version", arg0);
        return sprdbo3;
    }

    @sprtea
    public String cfr_renamed_3() {
        return this.cfr_renamed_15482("Version");
    }

    @sprtea
    public sprdbo cfr_renamed_15564(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null) || sprraia.cfr_renamed_12806(arg0).length() == 0) {
            throw new IllegalArgumentException(sprery.cfr_renamed_9("\u5236\u5ec2\u7b53\u5435\u65db\u6278\u7505\u76bc\u7b53\u7ad8\u7ee9\u4ece\u63fd\u4fa3\u8028\u4fd9\u6042\uff30}JBND\\HJcY@]\uff24\u4e02\u7a57"));
        }
        sprdbo sprdbo2 = this;
        sprdbo2.cfr_renamed_15480(sprqpaa.cfr_renamed_9("\\,c(e:i,B?a;"), arg0);
        return sprdbo2;
    }

    @sprtea
    public String cfr_renamed_15565() {
        return this.cfr_renamed_15482("Company");
    }

    @sprtea
    public sprdbo cfr_renamed_15566(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null) || sprraia.cfr_renamed_12806(arg0).length() == 0) {
            sprdbo sprdbo2 = this;
            sprdbo2.cfr_renamed_15492("Company");
            return sprdbo2;
        }
        sprdbo sprdbo3 = this;
        sprdbo3.cfr_renamed_15480("Company", arg0);
        return sprdbo3;
    }

    @sprtea
    public sprdbo(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprdbo() {
        super(sprery.cfr_renamed_9("h_W[QI]_"));
    }

    @sprtea
    public String cfr_renamed_15567() {
        String string = this.cfr_renamed_15482(sprqpaa.cfr_renamed_9("\\,c(e:i,B?a;"));
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            throw new IllegalArgumentException(sprery.cfr_renamed_9("\u5236\u5ec2\u7b53\u5435\u65db\u6278\u7505\u76bc\u7b53\u7ad8\u7ee9\u4ece\u63fd\u4fa3\u8028\u4fd9\u6042\uff30}JBND\\HJcY@]\uff24\u4e02\u7a57"));
        }
        return string;
    }
}

