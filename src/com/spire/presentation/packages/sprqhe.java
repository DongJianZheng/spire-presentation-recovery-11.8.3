/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxcja;
import com.spire.presentation.packages.spryte;
import java.math.BigInteger;

public class sprqhe
extends sprkra {
    private sprije cfr_renamed_112;
    public static final sprije cfr_renamed_119;
    public static final sprooe cfr_renamed_91;
    private sprije cfr_renamed_0;
    private sprooe cfr_renamed_1;
    private sprooe cfr_renamed_2;
    public static final sprooe cfr_renamed_3;
    public static final sprije cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (!this.cfr_renamed_112.equals(cfr_renamed_4)) {
            sprlre2.cfr_renamed_49(new sprhse(true, 0, this.cfr_renamed_112));
        }
        if (!this.cfr_renamed_0.equals(cfr_renamed_119)) {
            sprlre2.cfr_renamed_49(new sprhse(1 != 0, 1, this.cfr_renamed_0));
        }
        if (!this.cfr_renamed_1.equals(cfr_renamed_91)) {
            sprlre2.cfr_renamed_49(new sprhse(true, 2, this.cfr_renamed_1));
        }
        if (!this.cfr_renamed_2.equals(cfr_renamed_3)) {
            sprlre2.cfr_renamed_49(new sprhse(true, 3, this.cfr_renamed_2));
        }
        return new sprpse(sprlre2);
    }

    static {
        cfr_renamed_4 = new sprije(sprdh.cfr_renamed_86, sprume.cfr_renamed_3);
        cfr_renamed_119 = new sprije(sprm.cfr_renamed_123, cfr_renamed_4);
        cfr_renamed_91 = new sprooe(20L);
        cfr_renamed_3 = new sprooe(1L);
    }

    public sprije cfr_renamed_4596() {
        return this.cfr_renamed_0;
    }

    public BigInteger cfr_renamed_4597() {
        return this.cfr_renamed_2.cfr_renamed_97();
    }

    public sprqhe() {
        this.cfr_renamed_112 = cfr_renamed_4;
        this.cfr_renamed_0 = cfr_renamed_119;
        this.cfr_renamed_1 = cfr_renamed_91;
        this.cfr_renamed_2 = cfr_renamed_3;
    }

    public sprije cfr_renamed_579() {
        return this.cfr_renamed_112;
    }

    /*
     * WARNING - void declaration
     */
    public sprqhe(sprije sprije2, sprije sprije3, sprooe sprooe2, sprooe sprooe3) {
        void arg2;
        void arg1;
        void arg0;
        sprqhe sprqhe2 = this;
        sprqhe sprqhe3 = this;
        sprqhe3.cfr_renamed_112 = arg0;
        sprqhe3.cfr_renamed_0 = arg1;
        sprqhe2.cfr_renamed_1 = arg2;
        sprqhe2.cfr_renamed_2 = sprooe3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprqhe(sprbne sprbne2) {
        int n;
        this.cfr_renamed_112 = cfr_renamed_4;
        this.cfr_renamed_0 = cfr_renamed_119;
        this.cfr_renamed_1 = cfr_renamed_91;
        this.cfr_renamed_2 = cfr_renamed_3;
        int n2 = n = 0;
        void arg0;
        while (n2 != arg0.cfr_renamed_84()) {
            spryte spryte2 = (spryte)arg0.cfr_renamed_85(n);
            switch (spryte2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_112 = sprije.cfr_renamed_341(spryte2, true);
                    break;
                }
                case 1: {
                    this.cfr_renamed_0 = sprije.cfr_renamed_341(spryte2, true);
                    break;
                }
                case 2: {
                    this.cfr_renamed_1 = sprooe.cfr_renamed_341(spryte2, true);
                    break;
                }
                case 3: {
                    this.cfr_renamed_2 = sprooe.cfr_renamed_341(spryte2, true);
                    break;
                }
                default: {
                    throw new IllegalArgumentException(sprxcja.cfr_renamed_9("?o!o%v$!>`-"));
                }
            }
            n2 = ++n;
        }
        return;
    }

    public BigInteger cfr_renamed_4598() {
        return this.cfr_renamed_1.cfr_renamed_97();
    }

    public static sprqhe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprqhe) {
            return (sprqhe)arg0;
        }
        if (arg0 != null) {
            return new sprqhe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}

