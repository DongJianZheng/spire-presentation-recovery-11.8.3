/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcty;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprqtp;
import com.spire.presentation.packages.sprvva;

public class spryce
extends sprkra {
    public sprooe cfr_renamed_119;
    public static final int cfr_renamed_91 = 999;
    public static final int cfr_renamed_0 = 1;
    public static final int cfr_renamed_1 = 999;
    public static final int cfr_renamed_2 = 1;
    public sprooe cfr_renamed_3;
    public sprooe cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spryce(sprbne sprbne2) {
        void arg0;
        int n;
        spryce spryce2 = this;
        this.cfr_renamed_119 = null;
        spryce2.cfr_renamed_3 = null;
        spryce2.cfr_renamed_4 = null;
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_84()) {
            if (arg0.cfr_renamed_85(n) instanceof sprooe) {
                this.cfr_renamed_119 = (sprooe)arg0.cfr_renamed_85(n);
            } else if (arg0.cfr_renamed_85(n) instanceof sprhse) {
                sprhse sprhse2 = (sprhse)arg0.cfr_renamed_85(n);
                switch (sprhse2.cfr_renamed_312()) {
                    case 0: {
                        while (false) {
                        }
                        this.cfr_renamed_3 = sprooe.cfr_renamed_341(sprhse2, false);
                        if (this.cfr_renamed_3.cfr_renamed_97().intValue() >= 1 && this.cfr_renamed_3.cfr_renamed_97().intValue() <= 999) break;
                        throw new IllegalArgumentException(sprqtp.cfr_renamed_9("\u0010\u0000/\u000f5\u0007=N4\u00075\u00020\u001dy\b0\u000b5\nyTy\u00006\u001ay\u00077Nq_w@`W`Gw"));
                    }
                    case 1: {
                        this.cfr_renamed_4 = sprooe.cfr_renamed_341(sprhse2, false);
                        if (this.cfr_renamed_4.cfr_renamed_97().intValue() >= 1 && this.cfr_renamed_4.cfr_renamed_97().intValue() <= 999) break;
                        throw new IllegalArgumentException(sprcty.cfr_renamed_9("\u0012*-%7-?d6-8647{\"2!7 {~{*40{-5dsuujb}bmu"));
                    }
                    default: {
                        throw new IllegalArgumentException(sprqtp.cfr_renamed_9("'7\u00188\u00020\ty\u001a8\ty\u0000,\u0003;\u000b+"));
                    }
                }
            }
            n2 = ++n;
        }
    }

    public spryce() {
    }

    public sprooe cfr_renamed_666() {
        return this.cfr_renamed_4;
    }

    public sprooe cfr_renamed_668() {
        return this.cfr_renamed_119;
    }

    public sprooe cfr_renamed_670() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_119 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_119);
        }
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(new sprhse(0 != 0, 0, this.cfr_renamed_3));
        }
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(new sprhse(false, 1, this.cfr_renamed_4));
        }
        return new sprpse(sprlre2);
    }

    public static spryce cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spryce) {
            return (spryce)arg0;
        }
        if (arg0 != null) {
            return new spryce(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public spryce(sprooe sprooe2, sprooe sprooe3, sprooe sprooe4) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_119 = arg0;
        if (sprooe3 != null && (arg1.cfr_renamed_97().intValue() < 1 || arg1.cfr_renamed_97().intValue() > 999)) {
            throw new IllegalArgumentException(sprcty.cfr_renamed_9("\r52:(2 {)2(7-(d=->(?dad5+/d2*{ljju}b}r"));
        }
        this.cfr_renamed_3 = arg1;
        if (arg2 != null && (arg2.cfr_renamed_97().intValue() < 1 || arg2.cfr_renamed_97().intValue() > 999)) {
            throw new IllegalArgumentException(sprqtp.cfr_renamed_9("'7\u00188\u00020\ny\u00030\r+\u0001*N?\u0007<\u0002=NcN7\u0001-N0\u0000yFh@wW`Wp"));
        }
        this.cfr_renamed_4 = arg2;
    }
}

