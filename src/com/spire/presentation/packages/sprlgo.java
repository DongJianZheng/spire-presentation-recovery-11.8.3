/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmgo;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprqio;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprlgo
extends sprmgo {
    private String cfr_renamed_4;

    @sprtea
    public boolean cfr_renamed_15777(String arg0) {
        return sprraia.cfr_renamed_15778(this.cfr_renamed_4, arg0, (short)4);
    }

    @sprtea
    public String cfr_renamed_678() {
        int n = this.cfr_renamed_4.lastIndexOf(47);
        if (n == -1) {
            return this.cfr_renamed_4;
        }
        if (n == this.cfr_renamed_4.length() - 1) {
            return "";
        }
        return this.cfr_renamed_4.substring(n + 1);
    }

    @sprtea
    public static sprlgo cfr_renamed_15562(sprnco arg0) {
        if (arg0 == null) {
            return null;
        }
        return sprlgo.cfr_renamed_141(arg0.cfr_renamed_15495());
    }

    @sprtea
    public String[] cfr_renamed_15779() {
        return sprqio.cfr_renamed_15133(this.cfr_renamed_4, "/", true);
    }

    @sprtea
    public sprlgo cfr_renamed_15780(String arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public String toString() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public sprlgo cfr_renamed_15341(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null)) {
            return this;
        }
        String string = this.cfr_renamed_4;
        if (sprraia.cfr_renamed_15778(string, "/", (short)4)) {
            String string2 = string;
            string = string2.substring(0, 0 + (string2.length() - 1));
        }
        if (sprraia.cfr_renamed_13266(arg0, "/", (short)4)) {
            arg0 = arg0.substring(1);
        }
        return new sprlgo(new StringBuilder().insert(0, string).append("/").append(arg0).toString());
    }

    @sprtea
    public sprlgo(String string) {
        this.cfr_renamed_4 = string;
    }

    @sprtea
    public String cfr_renamed_15253() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public static sprlgo cfr_renamed_141(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null) || sprraia.cfr_renamed_12806(arg0).length() == 0) {
            return null;
        }
        return new sprlgo(sprraia.cfr_renamed_12806(arg0));
    }

    @sprtea
    public String cfr_renamed_15366() {
        int n = this.cfr_renamed_4.lastIndexOf(47);
        if (n == -1) {
            return "";
        }
        return this.cfr_renamed_4.substring(0, 0 + n);
    }

    @sprtea
    public sprlgo cfr_renamed_15781(sprlgo arg0) {
        if (arg0 == null) {
            return this;
        }
        return this.cfr_renamed_15341(arg0.cfr_renamed_15253());
    }
}

