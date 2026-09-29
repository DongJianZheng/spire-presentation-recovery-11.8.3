/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprace;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdyg;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;

public class spreke
extends sprkra {
    private sprxue cfr_renamed_119;
    private sprere cfr_renamed_91;
    private sprije cfr_renamed_0;
    private sprere cfr_renamed_1;
    private sprije cfr_renamed_2;
    private sprooe cfr_renamed_3;
    private sprace cfr_renamed_4;

    public sprije cfr_renamed_410() {
        return this.cfr_renamed_0;
    }

    public sprije cfr_renamed_3970() {
        return this.cfr_renamed_2;
    }

    public static spreke cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spreke) {
            return (spreke)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new spreke((sprbne)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprdyg.cfr_renamed_9("\u0007^\u0019^\u001dG\u001c\u0010\u001dR\u0018U\u0011DRY\u001c\u0010\u0014Q\u0011D\u001dB\u000b\nR")).append(arg0.getClass().getName()).toString());
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        spreke spreke2 = this;
        sprlre sprlre3 = sprlre2;
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        sprlre2.cfr_renamed_49(spreke2.cfr_renamed_0);
        if (spreke2.cfr_renamed_91 != null) {
            sprlre2.cfr_renamed_49(new sprhse(0 != 0, 0, this.cfr_renamed_91));
        }
        sprlre sprlre4 = sprlre2;
        spreke spreke3 = this;
        sprlre4.cfr_renamed_49(spreke3.cfr_renamed_2);
        sprlre4.cfr_renamed_49(spreke3.cfr_renamed_119);
        if (this.cfr_renamed_1 != null) {
            sprlre2.cfr_renamed_49(new sprhse(false, 1, this.cfr_renamed_1));
        }
        return new sprpse(sprlre2);
    }

    public sprere cfr_renamed_3969() {
        return this.cfr_renamed_91;
    }

    public sprere cfr_renamed_3973() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public spreke(sprooe sprooe2, sprace sprace2, sprije sprije2, sprere sprere2, sprije sprije3, sprxue sprxue2, sprere sprere3) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        spreke spreke2 = this;
        spreke spreke3 = this;
        spreke spreke4 = this;
        this.cfr_renamed_3 = arg0;
        spreke4.cfr_renamed_4 = arg1;
        spreke4.cfr_renamed_0 = arg2;
        spreke3.cfr_renamed_91 = arg3;
        spreke3.cfr_renamed_2 = arg4;
        spreke2.cfr_renamed_119 = arg5;
        spreke2.cfr_renamed_1 = sprere3;
    }

    public spreke(sprbne sprbne2) {
        spreke spreke2;
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        this.cfr_renamed_3 = (sprooe)enumeration.nextElement();
        Enumeration enumeration2 = enumeration;
        this.cfr_renamed_4 = sprace.cfr_renamed_23(enumeration.nextElement());
        this.cfr_renamed_0 = sprije.cfr_renamed_23(enumeration2.nextElement());
        Object e = enumeration2.nextElement();
        if (e instanceof spryte) {
            this.cfr_renamed_91 = sprere.cfr_renamed_341((spryte)e, false);
            spreke2 = this;
            this.cfr_renamed_2 = sprije.cfr_renamed_23(enumeration.nextElement());
        } else {
            spreke2 = this;
            spreke spreke3 = this;
            spreke3.cfr_renamed_91 = null;
            spreke3.cfr_renamed_2 = sprije.cfr_renamed_23(e);
        }
        spreke2.cfr_renamed_119 = sprlqe.cfr_renamed_23(enumeration.nextElement());
        if (enumeration.hasMoreElements()) {
            this.cfr_renamed_1 = sprere.cfr_renamed_341((spryte)enumeration.nextElement(), false);
            return;
        }
        this.cfr_renamed_1 = null;
    }

    public sprooe cfr_renamed_3() {
        return this.cfr_renamed_3;
    }

    public sprace cfr_renamed_4024() {
        return this.cfr_renamed_4;
    }

    public sprxue cfr_renamed_3971() {
        return this.cfr_renamed_119;
    }
}

