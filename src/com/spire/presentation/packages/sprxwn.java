/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprqks;
import com.spire.presentation.packages.sprqsn;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrbaa;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprssja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvfja;

@sprtea
public class sprxwn
extends sprrzn {
    @sprtea
    public sprxwn(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprxwn() {
        super(sprqks.cfr_renamed_9("/\b\u001b\u0000\u0019\u0003\b"));
    }

    @sprtea
    public sprxwn cfr_renamed_15621(Double arg0) {
        if (arg0 == null) {
            sprxwn sprxwn2 = this;
            sprxwn2.cfr_renamed_15492("Position");
            return sprxwn2;
        }
        sprxwn sprxwn3 = this;
        sprxwn3.cfr_renamed_15480("Position", arg0.toString());
        return sprxwn3;
    }

    @sprtea
    public Double cfr_renamed_3274() {
        String string = this.cfr_renamed_15482("Position");
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return null;
        }
        return sprssja.cfr_renamed_13364(string, sprvfja.cfr_renamed_12042());
    }

    @sprtea
    public sprxwn cfr_renamed_15622(sprqsn arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprrbaa.cfr_renamed_9("\u6be0\u98a8\u8227\uff3c\u0016[9['\uff3d\u4e6f\u7a4e"));
        }
        sprxwn sprxwn2 = this;
        sprxwn2.cfr_renamed_15623();
        this.cfr_renamed_15271(arg0);
        return sprxwn2;
    }

    @sprtea
    public sprqsn cfr_renamed_12553() {
        sprnco sprnco2 = this.cfr_renamed_15494("Color");
        if (sprnco2 == null) {
            return null;
        }
        return new sprqsn(sprnco2);
    }

    @sprtea
    public sprxwn(sprqsn sprqsn2) {
        sprxwn sprxwn2 = this;
        sprxwn2();
        sprxwn2.cfr_renamed_15622(sprqsn2);
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprxwn(Double d, sprqsn sprqsn2) {
        void arg0;
        sprxwn sprxwn2 = this;
        sprxwn2();
        sprxwn2.cfr_renamed_15622(sprqsn2).cfr_renamed_15621((Double)arg0);
    }
}

