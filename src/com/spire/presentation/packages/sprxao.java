/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcqy;
import com.spire.presentation.packages.sprlgo;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sproxz;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtvn;

@sprtea
public class sprxao
extends sprrzn {
    @sprtea
    public sprxao() {
        super(sprcqy.cfr_renamed_9("(\r\u001c\n\u001a\u0010\u000e\u0016\u001e"));
    }

    @sprtea
    public sprlgo cfr_renamed_15481() {
        String string = this.cfr_renamed_15482("BaseLoc");
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            throw new IllegalArgumentException(sproxz.cfr_renamed_9("\u6331\u5404\u5333\u5190\u76b2\u7b6b\u543b\u63da\u8fc6\u6592\u4ec0\uff1dttEpzzU\uff1c\u4e0c\u7a6f"));
        }
        return sprlgo.cfr_renamed_141(string);
    }

    @sprtea
    public sprxao cfr_renamed_15479(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null) || sprraia.cfr_renamed_12806(arg0).length() == 0) {
            throw new IllegalArgumentException(sprcqy.cfr_renamed_9("\u7b1a\u5476\u6272\u7b05\u7a84\u76ff\u6863\u8bbd\uff6c2 \uff72\u4e5e\u7a01"));
        }
        sprxao sprxao2 = this;
        sprxao2.cfr_renamed_15480("ID", arg0);
        return sprxao2;
    }

    @sprtea
    public sprxao(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprxao cfr_renamed_15235(sprlgo arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException(sproxz.cfr_renamed_9("\u6331\u5404\u5333\u5190\u76b2\u7b6b\u543b\u63da\u8fc6\u6592\u4ec0\uff1dttEpzzU\uff1c\u4e0c\u7a6f"));
        }
        sprxao sprxao2 = this;
        sprxao2.cfr_renamed_15480("BaseLoc", arg0.toString());
        return sprxao2;
    }

    @sprtea
    public sprtvn cfr_renamed_324() {
        return sprtvn.cfr_renamed_141(this.cfr_renamed_15482("Type"));
    }

    @sprtea
    public sprxao cfr_renamed_15549(sprtvn arg0) {
        if (arg0 == null) {
            sprxao sprxao2 = this;
            sprxao2.cfr_renamed_15492("Type");
            return sprxao2;
        }
        sprxao sprxao3 = this;
        sprxao3.cfr_renamed_15480("Type", arg0.toString());
        return sprxao3;
    }

    @sprtea
    public String cfr_renamed_6005() {
        String string = this.cfr_renamed_15482("ID");
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            throw new IllegalArgumentException(sprcqy.cfr_renamed_9("\u7b1a\u5476\u6272\u7b05\u7a84\u76ff\u6863\u8bbd\uff6c2 \uff72\u4e5e\u7a01"));
        }
        return string;
    }
}

