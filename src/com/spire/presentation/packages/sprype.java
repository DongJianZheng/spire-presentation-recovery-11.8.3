/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.spruve;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;

public class sprype
extends sprkra {
    private sprooe cfr_renamed_0;
    private sprxue cfr_renamed_1;
    private spruve cfr_renamed_2;
    private sprbne cfr_renamed_3;
    private sprije cfr_renamed_4;

    public sprxue cfr_renamed_4032() {
        return this.cfr_renamed_1;
    }

    public static sprype cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprype) {
            return (sprype)arg0;
        }
        if (arg0 != null) {
            return new sprype(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprbne cfr_renamed_4027() {
        return this.cfr_renamed_3;
    }

    public spruve cfr_renamed_4031() {
        return this.cfr_renamed_2;
    }

    public sprooe cfr_renamed_3() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public sprype(sprbne sprbne2) {
        void arg0;
        int n = 0;
        this.cfr_renamed_0 = (sprooe)sprbne2.cfr_renamed_85(0);
        spryte spryte2 = (spryte)arg0.cfr_renamed_85(++n);
        this.cfr_renamed_2 = spruve.cfr_renamed_341(spryte2, true);
        if (arg0.cfr_renamed_85(++n) instanceof spryte) {
            spryte spryte3 = (spryte)arg0.cfr_renamed_85(n);
            ++n;
            this.cfr_renamed_1 = sprxue.cfr_renamed_341(spryte3, true);
        }
        sprype sprype2 = this;
        void v3 = arg0;
        sprype2.cfr_renamed_4 = sprije.cfr_renamed_23(v3.cfr_renamed_85(n));
        sprype2.cfr_renamed_3 = (sprbne)v3.cfr_renamed_85(++n);
        ++n;
    }

    /*
     * WARNING - void declaration
     */
    public sprype(spruve spruve2, sprxue sprxue2, sprije sprije2, sprbne sprbne2) {
        void arg2;
        void arg1;
        void arg0;
        sprype sprype2 = this;
        sprype sprype3 = this;
        sprype sprype4 = this;
        sprype4.cfr_renamed_0 = new sprooe(3L);
        sprype3.cfr_renamed_2 = arg0;
        sprype3.cfr_renamed_1 = arg1;
        sprype2.cfr_renamed_4 = arg2;
        sprype2.cfr_renamed_3 = sprbne2;
    }

    public static sprype cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprype.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public sprije cfr_renamed_4000() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprype sprype2 = this;
        sprlre2.cfr_renamed_49(sprype2.cfr_renamed_0);
        sprlre sprlre3 = sprlre2;
        sprlre2.cfr_renamed_49(new sprhse(true, 0, this.cfr_renamed_2));
        if (sprype2.cfr_renamed_1 != null) {
            sprlre2.cfr_renamed_49(new sprhse(1 != 0, 1, this.cfr_renamed_1));
        }
        sprlre sprlre4 = sprlre2;
        sprype sprype3 = this;
        sprlre4.cfr_renamed_49(sprype3.cfr_renamed_4);
        sprlre4.cfr_renamed_49(sprype3.cfr_renamed_3);
        return new sprpse(sprlre2);
    }
}

