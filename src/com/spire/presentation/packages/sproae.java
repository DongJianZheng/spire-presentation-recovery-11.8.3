/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.spride;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprnpe;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprqap;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryce;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;

public class sproae
extends sprkra {
    private sprtzd cfr_renamed_86;
    private sprszd cfr_renamed_152;
    private spride cfr_renamed_112;
    private sprnpe cfr_renamed_119;
    private sprmee cfr_renamed_91;
    private sprooe cfr_renamed_0;
    private sprrpe cfr_renamed_1;
    private sprooe cfr_renamed_2;
    private spryce cfr_renamed_3;
    private sprooe cfr_renamed_4;

    public sprooe cfr_renamed_3() {
        return this.cfr_renamed_4;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sproae(sprbne arg0) {
        sproae sproae2 = this;
        Enumeration enumeration = arg0.cfr_renamed_329();
        sproae2.cfr_renamed_4 = sprooe.cfr_renamed_23(enumeration.nextElement());
        this.cfr_renamed_86 = sprtzd.cfr_renamed_23(enumeration.nextElement());
        sproae2.cfr_renamed_112 = spride.cfr_renamed_23(enumeration.nextElement());
        sproae2.cfr_renamed_2 = sprooe.cfr_renamed_23(enumeration.nextElement());
        sproae2.cfr_renamed_1 = sprrpe.cfr_renamed_23(enumeration.nextElement());
        sproae2.cfr_renamed_119 = sprnpe.cfr_renamed_655(false);
        block4: while (enumeration.hasMoreElements()) {
            sprkra sprkra2 = (sprkra)enumeration.nextElement();
            if (sprkra2 instanceof spryte) {
                sprhse sprhse2 = (sprhse)sprkra2;
                switch (sprhse2.cfr_renamed_312()) {
                    case 0: {
                        this.cfr_renamed_91 = sprmee.cfr_renamed_341(sprhse2, true);
                        continue block4;
                    }
                    case 1: {
                        this.cfr_renamed_152 = sprszd.cfr_renamed_341(sprhse2, false);
                        continue block4;
                    }
                }
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprqap.cfr_renamed_9("e`[`_y^.DoW.Fo\\{U.")).append(sprhse2.cfr_renamed_312()).toString());
            }
            if (sprkra2 instanceof sprbne || sprkra2 instanceof spryce) {
                this.cfr_renamed_3 = spryce.cfr_renamed_23(sprkra2);
                continue;
            }
            if (sprkra2 instanceof sprnpe) {
                this.cfr_renamed_119 = sprnpe.cfr_renamed_23(sprkra2);
                continue;
            }
            if (!(sprkra2 instanceof sprooe)) continue;
            this.cfr_renamed_0 = sprooe.cfr_renamed_23(sprkra2);
        }
        return;
    }

    /*
     * WARNING - void declaration
     */
    public sproae(sprtzd sprtzd2, spride spride2, sprooe sprooe2, sprrpe sprrpe2, spryce spryce2, sprnpe sprnpe2, sprooe sprooe3, sprmee sprmee2, sprszd sprszd2) {
        void arg7;
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sproae sproae2 = this;
        sproae sproae3 = this;
        sproae sproae4 = this;
        sproae sproae5 = this;
        sproae sproae6 = this;
        this.cfr_renamed_4 = new sprooe(1L);
        this.cfr_renamed_86 = arg0;
        sproae5.cfr_renamed_112 = arg1;
        sproae5.cfr_renamed_2 = arg2;
        sproae4.cfr_renamed_1 = arg3;
        sproae4.cfr_renamed_3 = arg4;
        sproae3.cfr_renamed_119 = arg5;
        sproae3.cfr_renamed_0 = arg6;
        sproae2.cfr_renamed_91 = arg7;
        sproae2.cfr_renamed_152 = sprszd2;
    }

    public sprnpe cfr_renamed_586() {
        return this.cfr_renamed_119;
    }

    public sprmee cfr_renamed_590() {
        return this.cfr_renamed_91;
    }

    public sprtzd cfr_renamed_598() {
        return this.cfr_renamed_86;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sproae sproae2 = this;
        sprlre sprlre3 = sprlre2;
        sproae sproae3 = this;
        sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        sprlre2.cfr_renamed_49(sproae3.cfr_renamed_86);
        sprlre3.cfr_renamed_49(sproae3.cfr_renamed_112);
        sprlre3.cfr_renamed_49(this.cfr_renamed_2);
        sprlre2.cfr_renamed_49(sproae2.cfr_renamed_1);
        if (sproae2.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        }
        if (this.cfr_renamed_119 != null && this.cfr_renamed_119.cfr_renamed_587()) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_119);
        }
        if (this.cfr_renamed_0 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_0);
        }
        if (this.cfr_renamed_91 != null) {
            sprlre2.cfr_renamed_49(new sprhse(true, 0, this.cfr_renamed_91));
        }
        if (this.cfr_renamed_152 != null) {
            sprlre2.cfr_renamed_49(new sprhse(false, 1, this.cfr_renamed_152));
        }
        return new sprpse(sprlre2);
    }

    public spride cfr_renamed_592() {
        return this.cfr_renamed_112;
    }

    public sprooe cfr_renamed_114() {
        return this.cfr_renamed_2;
    }

    public sprrpe cfr_renamed_588() {
        return this.cfr_renamed_1;
    }

    public sprszd cfr_renamed_98() {
        return this.cfr_renamed_152;
    }

    public spryce cfr_renamed_589() {
        return this.cfr_renamed_3;
    }

    public static sproae cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sproae) {
            return (sproae)arg0;
        }
        if (arg0 != null) {
            return new sproae(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprooe cfr_renamed_596() {
        return this.cfr_renamed_0;
    }
}

