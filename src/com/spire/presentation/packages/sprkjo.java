/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjdda;
import com.spire.presentation.packages.sprmgo;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprzjo;

@sprtea
public class sprkjo
extends sprmgo {
    private Long cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprkjo(long l) {
        void arg0;
        this.cfr_renamed_4 = 0L;
        if (l <= 0L) {
            throw new NumberFormatException(sprjdda.cfr_renamed_9("Y70\u5fb6\u986b\u5954\u4e9eS "));
        }
        this.cfr_renamed_4 = (long)arg0;
    }

    @sprtea
    public sprkjo cfr_renamed_15782(Long arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    @sprtea
    public Long cfr_renamed_19() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public static sprkjo cfr_renamed_141(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null) || sprraia.cfr_renamed_12806(arg0).length() == 0) {
            return null;
        }
        return new sprkjo(sprraia.cfr_renamed_12806(arg0));
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (!(arg0 instanceof sprkjo)) {
            return false;
        }
        sprkjo sprkjo2 = (sprkjo)arg0;
        return sprriia.cfr_renamed_2253(this.cfr_renamed_19(), sprkjo2.cfr_renamed_19());
    }

    public int hashCode() {
        return this.hashCode();
    }

    @sprtea
    public sprkjo(String string) {
        sprkjo sprkjo2 = this;
        sprkjo2.cfr_renamed_4 = 0L;
        sprkjo2.cfr_renamed_4 = Long.parseLong(string);
    }

    @sprtea
    public sprzjo cfr_renamed_15175() {
        return new sprzjo(this);
    }

    public String toString() {
        return this.cfr_renamed_4.toString();
    }
}

