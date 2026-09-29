/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprfje;
import com.spire.presentation.packages.sprggk;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnpe;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprsso;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.math.BigInteger;

public class sprwge
extends sprkra {
    public sprnpe cfr_renamed_3;
    public sprooe cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprwge(sprbne sprbne2) {
        void v3;
        void arg0;
        sprwge sprwge2 = this;
        sprwge2.cfr_renamed_3 = sprnpe.cfr_renamed_655(false);
        sprwge2.cfr_renamed_4 = null;
        if (sprbne2.cfr_renamed_84() == 0) {
            sprwge sprwge3 = this;
            sprwge3.cfr_renamed_3 = null;
            sprwge3.cfr_renamed_4 = null;
            return;
        }
        if (arg0.cfr_renamed_85(0) instanceof sprnpe) {
            void v2 = arg0;
            v3 = v2;
            this.cfr_renamed_3 = sprnpe.cfr_renamed_23(v2.cfr_renamed_85(0));
        } else {
            this.cfr_renamed_3 = null;
            this.cfr_renamed_4 = sprooe.cfr_renamed_23(arg0.cfr_renamed_85(0));
            v3 = arg0;
        }
        if (v3.cfr_renamed_84() > 1) {
            if (this.cfr_renamed_3 != null) {
                this.cfr_renamed_4 = sprooe.cfr_renamed_23(arg0.cfr_renamed_85(1));
                return;
            }
            throw new IllegalArgumentException(sprsso.cfr_renamed_9("I2Q.Y`M%O5[.]%\u001e)P`]/P3J2K#J/L"));
        }
    }

    public sprwge(boolean bl) {
        sprwge sprwge2;
        sprwge sprwge3 = this;
        sprwge3.cfr_renamed_3 = sprnpe.cfr_renamed_655(false);
        sprwge3.cfr_renamed_4 = null;
        if (bl) {
            sprwge2 = this;
            this.cfr_renamed_3 = sprnpe.cfr_renamed_655(true);
        } else {
            sprwge2 = this;
            this.cfr_renamed_3 = null;
        }
        sprwge2.cfr_renamed_4 = null;
    }

    public BigInteger cfr_renamed_299() {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.cfr_renamed_97();
        }
        return null;
    }

    public boolean cfr_renamed_296() {
        return this.cfr_renamed_3 != null && this.cfr_renamed_3.cfr_renamed_587();
    }

    public static sprwge cfr_renamed_2757(sprszd arg0) {
        return sprwge.cfr_renamed_23(arg0.cfr_renamed_4477(sprtie.cfr_renamed_272));
    }

    /*
     * WARNING - void declaration
     */
    public sprwge(int n) {
        void arg0;
        sprwge sprwge2 = this;
        this.cfr_renamed_3 = sprnpe.cfr_renamed_655(false);
        sprwge2.cfr_renamed_4 = null;
        sprwge2.cfr_renamed_3 = sprnpe.cfr_renamed_655(true);
        sprwge sprwge3 = this;
        sprwge2.cfr_renamed_4 = new sprooe((long)arg0);
    }

    public String toString() {
        if (this.cfr_renamed_4 == null) {
            if (this.cfr_renamed_3 == null) {
                return sprggk.cfr_renamed_9("k;Z3J\u0019F4Z.[;@4])\u0013z@)j;\u0001<H6Z?\u0000");
            }
            return new StringBuilder().insert(0, sprsso.cfr_renamed_9("|!M)]\u0003Q.M4L!W.J3\u0004`W3}!\u0016")).append(this.cfr_renamed_296()).append(")").toString();
        }
        return new StringBuilder().insert(0, sprggk.cfr_renamed_9("k;Z3J\u0019F4Z.[;@4])\u0013z@)j;\u0001")).append(this.cfr_renamed_296()).append(sprsso.cfr_renamed_9("\u0017l\u001e0_4V\f[.}/P3J2_)P4\u001e}\u001e")).append(this.cfr_renamed_4.cfr_renamed_97()).toString();
    }

    public static sprwge cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprwge) {
            return (sprwge)arg0;
        }
        if (arg0 instanceof sprfje) {
            return sprwge.cfr_renamed_23(sprfje.cfr_renamed_4464((sprfje)arg0));
        }
        if (arg0 != null) {
            return new sprwge(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public static sprwge cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprwge.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        }
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        return new sprpse(sprlre2);
    }
}

