/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlgg;
import com.spire.presentation.packages.sprni;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtng;
import com.spire.presentation.packages.sprxg;
import com.spire.presentation.packages.sprxil;
import java.security.Provider;

public class sproig {
    private boolean cfr_renamed_2;
    private sprrr cfr_renamed_3;
    private sprni cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sproig cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_3 = new sprkhi((Provider)arg0);
        return this;
    }

    public sproig() {
        sproig sproig2 = this;
        sproig sproig3 = this;
        sproig2.cfr_renamed_3 = new sprrul();
        sproig2.cfr_renamed_2 = false;
        sproig2.cfr_renamed_4 = sprlgg.cfr_renamed_3;
    }

    public static /* synthetic */ sprrr cfr_renamed_7392(sproig arg0) {
        return arg0.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sproig cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_3 = new sprxil((String)arg0);
        return this;
    }

    public sproig cfr_renamed_1502(boolean arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    public sproig cfr_renamed_7391(sprni arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    private /* synthetic */ boolean cfr_renamed_7393(sprco arg0) {
        sprszm sprszm2;
        sprco sprco2 = sprddm.cfr_renamed_23(arg0).cfr_renamed_284();
        if (sprco2 instanceof sprszm && (sprszm2 = sprszm.cfr_renamed_23(sprco2)).cfr_renamed_84() == 2) {
            return sprszm2.cfr_renamed_85(1) instanceof sprktm;
        }
        return false;
    }

    public static /* synthetic */ sprni cfr_renamed_7394(sproig arg0) {
        return arg0.cfr_renamed_4;
    }

    public static /* synthetic */ boolean cfr_renamed_7395(sproig arg0) {
        return arg0.cfr_renamed_2;
    }

    public sprxg cfr_renamed_1480(char[] arg0) {
        return new sprtng(this, arg0);
    }

    public static /* synthetic */ boolean cfr_renamed_7396(sproig arg0, sprco arg1) {
        return arg0.cfr_renamed_7393(arg1);
    }
}

