/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprjve;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sproce;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprqvk;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;

public class sprozd
extends sprkra
implements sprm {
    private sprere cfr_renamed_91;
    private sprere cfr_renamed_0;
    private sprere cfr_renamed_1;
    private sprooe cfr_renamed_2;
    private sprere cfr_renamed_3;
    private sproce cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprozd(sprooe sprooe2, sprere sprere2, sproce sproce2, sprere sprere3, sprere sprere4, sprere sprere5) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprozd sprozd2 = this;
        sprozd sprozd3 = this;
        sprozd sprozd4 = this;
        sprozd4.cfr_renamed_2 = arg0;
        sprozd4.cfr_renamed_91 = arg1;
        sprozd3.cfr_renamed_4 = arg2;
        sprozd3.cfr_renamed_3 = arg3;
        sprozd2.cfr_renamed_0 = arg4;
        sprozd2.cfr_renamed_1 = sprere5;
    }

    public sprere cfr_renamed_4139() {
        return this.cfr_renamed_91;
    }

    public sproce cfr_renamed_2442() {
        return this.cfr_renamed_4;
    }

    public sprooe cfr_renamed_3() {
        return this.cfr_renamed_2;
    }

    public static sprozd cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprozd) {
            return (sprozd)arg0;
        }
        if (arg0 != null) {
            return new sprozd(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprozd(sprbne sprbne2) {
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        this.cfr_renamed_2 = (sprooe)enumeration.nextElement();
        this.cfr_renamed_91 = (sprere)enumeration.nextElement();
        this.cfr_renamed_4 = sproce.cfr_renamed_23(enumeration.nextElement());
        block4: while (enumeration.hasMoreElements()) {
            sprvva sprvva2 = (sprvva)enumeration.nextElement();
            if (sprvva2 instanceof spryte) {
                spryte spryte2 = (spryte)sprvva2;
                switch (spryte2.cfr_renamed_312()) {
                    case 0: {
                        this.cfr_renamed_3 = sprere.cfr_renamed_341(spryte2, false);
                        continue block4;
                    }
                    case 1: {
                        this.cfr_renamed_0 = sprere.cfr_renamed_341(spryte2, false);
                        continue block4;
                    }
                }
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprqvk.cfr_renamed_9("4@*@.Y/\u000e5O&\u000e7O-[$\u000e")).append(spryte2.cfr_renamed_312()).toString());
            }
            this.cfr_renamed_1 = (sprere)sprvva2;
        }
        return;
    }

    public sprere cfr_renamed_633() {
        return this.cfr_renamed_0;
    }

    public sprere cfr_renamed_621() {
        return this.cfr_renamed_1;
    }

    public sprere cfr_renamed_617() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprozd sprozd2 = this;
        sprlre sprlre3 = sprlre2;
        sprlre3.cfr_renamed_49(this.cfr_renamed_2);
        sprlre3.cfr_renamed_49(this.cfr_renamed_91);
        sprlre2.cfr_renamed_49(sprozd2.cfr_renamed_4);
        if (sprozd2.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(new sprhse(0 != 0, 0, this.cfr_renamed_3));
        }
        if (this.cfr_renamed_0 != null) {
            sprlre2.cfr_renamed_49(new sprhse(false, 1, this.cfr_renamed_0));
        }
        sprlre2.cfr_renamed_49(this.cfr_renamed_1);
        return new sprjve(sprlre2);
    }
}

