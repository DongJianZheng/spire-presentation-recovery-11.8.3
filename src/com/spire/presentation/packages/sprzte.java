/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.spreoe;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprfhi;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprjve;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprrve;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;

public class sprzte
extends sprkra {
    private sprere cfr_renamed_119;
    private sprrve cfr_renamed_91;
    private spreoe cfr_renamed_0;
    private sprxue cfr_renamed_1;
    private sprere cfr_renamed_2;
    private sprere cfr_renamed_3;
    private sprooe cfr_renamed_4;

    public static sprzte cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprzte) {
            return (sprzte)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new sprzte((sprbne)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprfhi.cfr_renamed_9("\u001f_ P:X2\u0011\u0017D\"Y\u0013_ T:^&T2u7E7\u000bv")).append(arg0.getClass().getName()).toString());
    }

    public static sprzte cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprzte.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public sprere cfr_renamed_4190() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprzte(sprrve sprrve2, sprere sprere2, spreoe spreoe2, sprere sprere3, sprxue sprxue2, sprere sprere4) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprzte sprzte2 = this;
        sprzte sprzte3 = this;
        sprzte sprzte4 = this;
        sprzte sprzte5 = this;
        sprzte5.cfr_renamed_4 = new sprooe(0L);
        sprzte4.cfr_renamed_91 = arg0;
        sprzte4.cfr_renamed_2 = arg1;
        sprzte3.cfr_renamed_0 = arg2;
        sprzte3.cfr_renamed_3 = arg3;
        sprzte2.cfr_renamed_1 = arg4;
        sprzte2.cfr_renamed_119 = sprere4;
    }

    public sprere cfr_renamed_4171() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprzte sprzte2 = this;
        sprlre2.cfr_renamed_49(sprzte2.cfr_renamed_4);
        if (sprzte2.cfr_renamed_91 != null) {
            sprlre2.cfr_renamed_49(new sprhse(0 != 0, 0, this.cfr_renamed_91));
        }
        sprlre sprlre3 = sprlre2;
        sprzte sprzte3 = this;
        sprlre3.cfr_renamed_49(sprzte3.cfr_renamed_2);
        sprlre3.cfr_renamed_49(sprzte3.cfr_renamed_0);
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(new sprhse(false, 1, this.cfr_renamed_3));
        }
        sprlre2.cfr_renamed_49(this.cfr_renamed_1);
        if (this.cfr_renamed_119 != null) {
            sprlre2.cfr_renamed_49(new sprhse(false, 2, this.cfr_renamed_119));
        }
        return new sprjve(sprlre2);
    }

    public sprrve cfr_renamed_4170() {
        return this.cfr_renamed_91;
    }

    public sprooe cfr_renamed_3() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprzte(sprbne sprbne2) {
        void arg0;
        int n = 0;
        sprvva sprvva2 = sprbne2.cfr_renamed_85(0).cfr_renamed_119();
        this.cfr_renamed_4 = (sprooe)sprvva2;
        sprvva sprvva3 = arg0.cfr_renamed_85(++n).cfr_renamed_119();
        ++n;
        sprvva2 = sprvva3;
        if (sprvva3 instanceof spryte) {
            this.cfr_renamed_91 = sprrve.cfr_renamed_341((spryte)sprvva2, false);
            sprvva2 = arg0.cfr_renamed_85(n).cfr_renamed_119();
        }
        int n2 = ++n;
        this.cfr_renamed_2 = sprere.cfr_renamed_23(sprvva2);
        sprvva2 = arg0.cfr_renamed_85(n2).cfr_renamed_119();
        this.cfr_renamed_0 = spreoe.cfr_renamed_23(sprvva2);
        sprvva sprvva4 = arg0.cfr_renamed_85(++n).cfr_renamed_119();
        ++n;
        sprvva2 = sprvva4;
        if (sprvva4 instanceof spryte) {
            this.cfr_renamed_3 = sprere.cfr_renamed_341((spryte)sprvva2, false);
            sprvva2 = arg0.cfr_renamed_85(n).cfr_renamed_119();
            ++n;
        }
        this.cfr_renamed_1 = sprxue.cfr_renamed_23(sprvva2);
        if (arg0.cfr_renamed_84() > n) {
            sprvva2 = arg0.cfr_renamed_85(n).cfr_renamed_119();
            ++n;
            this.cfr_renamed_119 = sprere.cfr_renamed_341((spryte)sprvva2, false);
        }
    }

    public sprere cfr_renamed_4191() {
        return this.cfr_renamed_119;
    }

    public sprxue cfr_renamed_1472() {
        return this.cfr_renamed_1;
    }

    public spreoe cfr_renamed_4189() {
        return this.cfr_renamed_0;
    }
}

