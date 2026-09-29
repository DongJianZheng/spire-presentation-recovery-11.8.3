/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtre;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwme;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;

public class sprfve
extends sprkra {
    private sprije cfr_renamed_119;
    private sprooe cfr_renamed_91;
    private sprere cfr_renamed_0;
    private sprwme cfr_renamed_1;
    private sprije cfr_renamed_2;
    private sprere cfr_renamed_3;
    private sprxue cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprfve(sprwme sprwme2, sprije sprije2, sprere sprere2, sprije sprije3, sprxue sprxue2, sprere sprere3) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprfve sprfve2;
        if (sprwme2.cfr_renamed_3972()) {
            sprfve2 = this;
            this.cfr_renamed_91 = new sprooe(3L);
        } else {
            sprfve2 = this;
            this.cfr_renamed_91 = new sprooe(1L);
        }
        sprfve2.cfr_renamed_1 = arg0;
        sprfve sprfve3 = this;
        sprfve sprfve4 = this;
        this.cfr_renamed_2 = arg1;
        sprfve4.cfr_renamed_0 = arg2;
        sprfve4.cfr_renamed_119 = arg3;
        sprfve3.cfr_renamed_4 = arg4;
        sprfve3.cfr_renamed_3 = arg5;
    }

    public sprije cfr_renamed_3970() {
        return this.cfr_renamed_119;
    }

    public sprije cfr_renamed_410() {
        return this.cfr_renamed_2;
    }

    public sprooe cfr_renamed_3() {
        return this.cfr_renamed_91;
    }

    public sprxue cfr_renamed_3971() {
        return this.cfr_renamed_4;
    }

    public sprere cfr_renamed_3969() {
        return this.cfr_renamed_0;
    }

    public sprwme cfr_renamed_634() {
        return this.cfr_renamed_1;
    }

    public sprere cfr_renamed_3973() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprfve sprfve2 = this;
        sprlre sprlre3 = sprlre2;
        sprlre3.cfr_renamed_49(this.cfr_renamed_91);
        sprlre3.cfr_renamed_49(this.cfr_renamed_1);
        sprlre2.cfr_renamed_49(sprfve2.cfr_renamed_2);
        if (sprfve2.cfr_renamed_0 != null) {
            sprlre2.cfr_renamed_49(new sprhse(0 != 0, 0, this.cfr_renamed_0));
        }
        sprlre sprlre4 = sprlre2;
        sprfve sprfve3 = this;
        sprlre4.cfr_renamed_49(sprfve3.cfr_renamed_119);
        sprlre4.cfr_renamed_49(sprfve3.cfr_renamed_4);
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(new sprhse(false, 1, this.cfr_renamed_3));
        }
        return new sprpse(sprlre2);
    }

    public static sprfve cfr_renamed_23(Object arg0) throws IllegalArgumentException {
        if (arg0 instanceof sprfve) {
            return (sprfve)arg0;
        }
        if (arg0 != null) {
            return new sprfve(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprfve(sprwme sprwme2, sprije sprije2, sprtre sprtre2, sprije sprije3, sprxue sprxue2, sprtre sprtre3) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprfve sprfve2;
        if (sprwme2.cfr_renamed_3972()) {
            sprfve2 = this;
            this.cfr_renamed_91 = new sprooe(3L);
        } else {
            sprfve2 = this;
            this.cfr_renamed_91 = new sprooe(1L);
        }
        sprfve2.cfr_renamed_1 = arg0;
        sprfve sprfve3 = this;
        sprfve sprfve4 = this;
        this.cfr_renamed_2 = arg1;
        sprfve4.cfr_renamed_0 = sprere.cfr_renamed_23(arg2);
        sprfve4.cfr_renamed_119 = arg3;
        sprfve3.cfr_renamed_4 = arg4;
        sprfve3.cfr_renamed_3 = sprere.cfr_renamed_23(arg5);
    }

    public sprfve(sprbne sprbne2) {
        sprfve sprfve2;
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        this.cfr_renamed_91 = (sprooe)enumeration.nextElement();
        Enumeration enumeration2 = enumeration;
        this.cfr_renamed_1 = sprwme.cfr_renamed_23(enumeration.nextElement());
        this.cfr_renamed_2 = sprije.cfr_renamed_23(enumeration2.nextElement());
        Object e = enumeration2.nextElement();
        if (e instanceof spryte) {
            this.cfr_renamed_0 = sprere.cfr_renamed_341((spryte)e, false);
            sprfve2 = this;
            this.cfr_renamed_119 = sprije.cfr_renamed_23(enumeration.nextElement());
        } else {
            sprfve2 = this;
            sprfve sprfve3 = this;
            sprfve3.cfr_renamed_0 = null;
            sprfve3.cfr_renamed_119 = sprije.cfr_renamed_23(e);
        }
        sprfve2.cfr_renamed_4 = sprlqe.cfr_renamed_23(enumeration.nextElement());
        if (enumeration.hasMoreElements()) {
            this.cfr_renamed_3 = sprere.cfr_renamed_341((spryte)enumeration.nextElement(), false);
            return;
        }
        this.cfr_renamed_3 = null;
    }
}

