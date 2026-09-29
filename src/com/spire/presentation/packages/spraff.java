/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjgz;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprzfm;

public class spraff {
    private sprzfm cfr_renamed_4;

    private /* synthetic */ int cfr_renamed_5311(sprktm arg0) {
        if (arg0 != null) {
            return arg0.cfr_renamed_5023();
        }
        return 0;
    }

    private /* synthetic */ String cfr_renamed_669(int arg0) {
        if (arg0 < 10) {
            return new StringBuilder().insert(0, sprjgz.cfr_renamed_9("cT")).append(arg0).toString();
        }
        if (arg0 < 100) {
            return new StringBuilder().insert(0, "0").append(arg0).toString();
        }
        return Integer.toString(arg0);
    }

    public String toString() {
        spraff spraff2 = this;
        spraff spraff3 = this;
        return this.cfr_renamed_668() + "." + spraff2.cfr_renamed_669(spraff2.cfr_renamed_670()) + spraff3.cfr_renamed_669(spraff3.cfr_renamed_666());
    }

    public int cfr_renamed_668() {
        spraff spraff2 = this;
        return spraff2.cfr_renamed_5311(spraff2.cfr_renamed_4.cfr_renamed_668());
    }

    public spraff(sprzfm sprzfm2) {
        this.cfr_renamed_4 = sprzfm2;
    }

    public int cfr_renamed_666() {
        spraff spraff2 = this;
        return spraff2.cfr_renamed_5311(spraff2.cfr_renamed_4.cfr_renamed_666());
    }

    public int cfr_renamed_670() {
        spraff spraff2 = this;
        return spraff2.cfr_renamed_5311(spraff2.cfr_renamed_4.cfr_renamed_670());
    }
}

