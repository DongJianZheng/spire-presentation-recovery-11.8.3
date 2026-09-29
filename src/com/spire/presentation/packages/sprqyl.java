/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgaa;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqcn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruom;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.util.Enumeration;

public class sprqyl
extends sprqqe
implements sprdl {
    private spridn cfr_renamed_91;
    private spridn cfr_renamed_0;
    private sprktm cfr_renamed_1;
    private spruom cfr_renamed_2;
    private spridn cfr_renamed_3;
    private spridn cfr_renamed_4;

    public spridn cfr_renamed_621() {
        return this.cfr_renamed_91;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(6);
        sprqyl sprqyl2 = this;
        sprrvm sprrvm3 = sprrvm2;
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_1);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm2.cfr_renamed_5004(sprqyl2.cfr_renamed_2);
        if (sprqyl2.cfr_renamed_0 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_0));
        }
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 1, (sprco)this.cfr_renamed_3));
        }
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_91);
        return new sprqcn(sprrvm2);
    }

    public spridn cfr_renamed_633() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprqyl(sprktm sprktm2, spridn spridn2, spruom spruom2, spridn spridn3, spridn spridn4, spridn spridn5) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprqyl sprqyl2 = this;
        sprqyl sprqyl3 = this;
        sprqyl sprqyl4 = this;
        sprqyl4.cfr_renamed_1 = arg0;
        sprqyl4.cfr_renamed_4 = arg1;
        sprqyl3.cfr_renamed_2 = arg2;
        sprqyl3.cfr_renamed_0 = arg3;
        sprqyl2.cfr_renamed_3 = arg4;
        sprqyl2.cfr_renamed_91 = spridn5;
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprqyl(sprszm sprszm2) {
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        this.cfr_renamed_1 = (sprktm)enumeration.nextElement();
        this.cfr_renamed_4 = (spridn)enumeration.nextElement();
        this.cfr_renamed_2 = spruom.cfr_renamed_23(enumeration.nextElement());
        block4: while (enumeration.hasMoreElements()) {
            sprxgf sprxgf2 = (sprxgf)enumeration.nextElement();
            if (sprxgf2 instanceof sprnvm) {
                sprnvm sprnvm2 = (sprnvm)sprxgf2;
                switch (sprnvm2.cfr_renamed_312()) {
                    case 0: {
                        this.cfr_renamed_0 = spridn.cfr_renamed_5085(sprnvm2, false);
                        continue block4;
                    }
                    case 1: {
                        this.cfr_renamed_3 = spridn.cfr_renamed_5085(sprnvm2, false);
                        continue block4;
                    }
                }
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprbgaa.cfr_renamed_9("a7\u007f7{.zy`8syb8x,qy")).append(sprnvm2.cfr_renamed_312()).toString());
            }
            this.cfr_renamed_91 = (spridn)sprxgf2;
        }
        return;
    }

    public spridn cfr_renamed_4139() {
        return this.cfr_renamed_4;
    }

    public static sprqyl cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprqyl) {
            return (sprqyl)arg0;
        }
        if (arg0 != null) {
            return new sprqyl(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public spridn cfr_renamed_617() {
        return this.cfr_renamed_0;
    }

    public spruom cfr_renamed_2442() {
        return this.cfr_renamed_2;
    }

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_1;
    }
}

