/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdih;
import com.spire.presentation.packages.sprffe;
import com.spire.presentation.packages.sprhbe;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxee;
import java.util.Enumeration;

public class sprube
extends sprkra {
    private sprxee cfr_renamed_2;
    private sprffe cfr_renamed_3;
    private sprhbe cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprube(sprbne sprbne2) {
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        block5: while (true) {
            if (!enumeration.hasMoreElements()) {
                return;
            }
            sprhse sprhse2 = (sprhse)enumeration.nextElement();
            switch (sprhse2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_4 = sprhbe.cfr_renamed_23(sprhse2.cfr_renamed_2456());
                    continue block5;
                }
                case 1: {
                    this.cfr_renamed_3 = sprffe.cfr_renamed_23(sprhse2.cfr_renamed_2456());
                    continue block5;
                }
                case 2: {
                    this.cfr_renamed_2 = sprxee.cfr_renamed_23(sprhse2.cfr_renamed_2456());
                    continue block5;
                }
            }
            break;
        }
        throw new IllegalArgumentException(sprdih.cfr_renamed_9("KHNAEEN\u0004VEE"));
    }

    public sprffe cfr_renamed_4676() {
        return this.cfr_renamed_3;
    }

    public sprhbe cfr_renamed_4677() {
        return this.cfr_renamed_4;
    }

    public sprxee cfr_renamed_4678() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprube(sprhbe sprhbe2, sprffe sprffe2, sprxee sprxee2) {
        void arg1;
        void arg0;
        sprube sprube2 = this;
        this.cfr_renamed_4 = arg0;
        sprube2.cfr_renamed_3 = arg1;
        sprube2.cfr_renamed_2 = sprxee2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (null != this.cfr_renamed_4) {
            sprlre2.cfr_renamed_49(new sprhse(true, 0, this.cfr_renamed_4.cfr_renamed_119()));
        }
        if (null != this.cfr_renamed_3) {
            sprlre2.cfr_renamed_49(new sprhse(1 != 0, 1, this.cfr_renamed_3.cfr_renamed_119()));
        }
        if (null != this.cfr_renamed_2) {
            sprlre2.cfr_renamed_49(new sprhse(true, 2, this.cfr_renamed_2.cfr_renamed_119()));
        }
        return new sprpse(sprlre2);
    }

    public static sprube cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprube) {
            return (sprube)arg0;
        }
        if (arg0 != null) {
            return new sprube(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}

