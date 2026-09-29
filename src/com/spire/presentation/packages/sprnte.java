/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprawc;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdpe;
import com.spire.presentation.packages.sprgl;
import com.spire.presentation.packages.sprhno;
import com.spire.presentation.packages.sprjve;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprnte
extends sprkra
implements sprgl {
    private spra cfr_renamed_79;
    private sprtzd cfr_renamed_107;

    /*
     * WARNING - void declaration
     */
    public sprnte(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() < 1 || arg0.cfr_renamed_84() > 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprawc.cfr_renamed_9("CBe\u0003rFpVdMbF!PhYd\u0019!")).append(arg0.cfr_renamed_84()).toString());
        }
        this.cfr_renamed_107 = (sprtzd)arg0.cfr_renamed_85(0);
        if (arg0.cfr_renamed_84() > 1) {
            spryte spryte2 = (spryte)arg0.cfr_renamed_85(1);
            if (!spryte2.cfr_renamed_4567() || spryte2.cfr_renamed_312() != 0) {
                throw new IllegalArgumentException(sprhno.cfr_renamed_9("6$\u0010e\u0000$\u0013e\u0012*\u0006eS&\u001b+\u0000 \u001a1S"));
            }
            this.cfr_renamed_79 = spryte2.cfr_renamed_2456();
        }
    }

    public static sprnte cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprnte.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprnte sprnte2 = this;
        sprlre2.cfr_renamed_49(sprnte2.cfr_renamed_107);
        if (sprnte2.cfr_renamed_79 != null) {
            sprlre2.cfr_renamed_49(new sprdpe(0, this.cfr_renamed_79));
        }
        return new sprjve(sprlre2);
    }

    public static sprnte cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprnte) {
            return (sprnte)arg0;
        }
        if (arg0 != null) {
            return new sprnte(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public spra cfr_renamed_480() {
        return this.cfr_renamed_79;
    }

    public sprtzd cfr_renamed_696() {
        return this.cfr_renamed_107;
    }

    /*
     * WARNING - void declaration
     */
    public sprnte(sprtzd sprtzd2, spra spra2) {
        void arg0;
        sprnte sprnte2 = this;
        sprnte2.cfr_renamed_107 = arg0;
        sprnte2.cfr_renamed_79 = spra2;
    }
}

