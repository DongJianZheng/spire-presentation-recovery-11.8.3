/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprjze;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwzq;
import com.spire.presentation.packages.spryte;

public class sprrve
extends sprkra {
    private sprere cfr_renamed_3;
    private sprere cfr_renamed_4;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprrve(sprbne sprbne2) {
        switch (sprbne2.cfr_renamed_84()) {
            case 0: {
                return;
            }
            case 1: {
                void arg0;
                spryte spryte2 = (spryte)arg0.cfr_renamed_85(0);
                switch (spryte2.cfr_renamed_312()) {
                    case 0: {
                        this.cfr_renamed_3 = sprere.cfr_renamed_341(spryte2, false);
                        return;
                    }
                    case 1: {
                        this.cfr_renamed_4 = sprere.cfr_renamed_341(spryte2, false);
                        return;
                    }
                }
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprjze.cfr_renamed_9(";B\u001d\u0003\rB\u001e\u0003\u0010MYl\u000bJ\u001eJ\u0017B\rL\u000bj\u0017E\u0016\u0019Y")).append(spryte2.cfr_renamed_312()).toString());
            }
            case 2: {
                void arg0;
                this.cfr_renamed_3 = sprere.cfr_renamed_341((spryte)arg0.cfr_renamed_85(0), false);
                this.cfr_renamed_4 = sprere.cfr_renamed_341((spryte)arg0.cfr_renamed_85(1), false);
                return;
            }
        }
        throw new IllegalArgumentException(sprwzq.cfr_renamed_9("*,\f9\f0\u0004*\n,,0\u00031E*\n1E<\f9"));
    }

    public sprere cfr_renamed_617() {
        return this.cfr_renamed_3;
    }

    public static sprrve cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprrve.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public sprere cfr_renamed_633() {
        return this.cfr_renamed_4;
    }

    public static sprrve cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprrve) {
            return (sprrve)arg0;
        }
        if (arg0 != null) {
            return new sprrve(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprrve(sprere sprere2, sprere sprere3) {
        void arg0;
        sprrve sprrve2 = this;
        sprrve2.cfr_renamed_3 = arg0;
        sprrve2.cfr_renamed_4 = sprere3;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(new sprhse(0 != 0, 0, this.cfr_renamed_3));
        }
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(new sprhse(false, 1, this.cfr_renamed_4));
        }
        return new sprpse(sprlre2);
    }
}

