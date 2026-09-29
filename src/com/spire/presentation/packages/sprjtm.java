/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbpm;
import com.spire.presentation.packages.sprcmm;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprjkm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnum;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprpnm;
import com.spire.presentation.packages.sprqcn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.sprypm;
import java.util.Enumeration;

public class sprjtm
extends sprqqe {
    private sprpnm cfr_renamed_0;
    private spridn cfr_renamed_1;
    private spridn cfr_renamed_2;
    private sprktm cfr_renamed_3;
    private sprnum cfr_renamed_4;

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprjtm(sprpnm sprpnm2, spridn spridn2, sprnum sprnum2, spridn spridn3) {
        void arg2;
        void arg3;
        void arg1;
        void arg0;
        sprjtm sprjtm2 = this;
        sprjtm sprjtm3 = this;
        sprjtm sprjtm4 = this;
        sprjtm4.cfr_renamed_3 = new sprktm(sprjtm.cfr_renamed_8093((sprpnm)arg0, (spridn)arg1, (spridn)arg3));
        sprjtm3.cfr_renamed_0 = arg0;
        sprjtm3.cfr_renamed_2 = arg1;
        sprjtm2.cfr_renamed_4 = arg2;
        sprjtm2.cfr_renamed_1 = spridn3;
    }

    public spridn cfr_renamed_4171() {
        return this.cfr_renamed_2;
    }

    public sprnum cfr_renamed_4172() {
        return this.cfr_renamed_4;
    }

    public sprpnm cfr_renamed_4170() {
        return this.cfr_renamed_0;
    }

    public spridn cfr_renamed_4176() {
        return this.cfr_renamed_1;
    }

    public static sprjtm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprjtm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public static int cfr_renamed_8093(sprpnm arg0, spridn arg1, spridn arg2) {
        Enumeration enumeration = arg1.cfr_renamed_329();
        boolean bl = false;
        boolean bl2 = false;
        while (enumeration.hasMoreElements()) {
            sprco sprco2;
            sprbpm sprbpm2 = sprbpm.cfr_renamed_23(enumeration.nextElement());
            if (!sprbpm2.cfr_renamed_3().cfr_renamed_7241(0)) {
                bl = true;
            }
            if (!((sprco2 = sprbpm2.cfr_renamed_3365()) instanceof sprcmm) && !(sprco2 instanceof sprjkm)) continue;
            bl2 = true;
        }
        if (bl2) {
            return 3;
        }
        if (bl) {
            return 2;
        }
        if (arg0 != null || arg2 != null) {
            return 2;
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    public sprjtm(sprpnm sprpnm2, spridn spridn2, sprnum sprnum2, sprypm sprypm2) {
        void arg2;
        void arg3;
        void arg1;
        void arg0;
        sprjtm sprjtm2 = this;
        sprjtm sprjtm3 = this;
        sprjtm sprjtm4 = this;
        sprjtm4.cfr_renamed_3 = new sprktm(sprjtm.cfr_renamed_8093((sprpnm)arg0, (spridn)arg1, spridn.cfr_renamed_23(arg3)));
        sprjtm3.cfr_renamed_0 = arg0;
        sprjtm3.cfr_renamed_2 = arg1;
        sprjtm2.cfr_renamed_4 = arg2;
        sprjtm2.cfr_renamed_1 = spridn.cfr_renamed_23(sprypm2);
    }

    public static sprjtm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjtm) {
            return (sprjtm)arg0;
        }
        if (arg0 != null) {
            return new sprjtm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(5);
        sprjtm sprjtm2 = this;
        sprrvm2.cfr_renamed_5004(sprjtm2.cfr_renamed_3);
        if (sprjtm2.cfr_renamed_0 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_0));
        }
        sprrvm sprrvm3 = sprrvm2;
        sprjtm sprjtm3 = this;
        sprrvm3.cfr_renamed_5004(sprjtm3.cfr_renamed_2);
        sprrvm3.cfr_renamed_5004(sprjtm3.cfr_renamed_4);
        if (this.cfr_renamed_1 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 1, (sprco)this.cfr_renamed_1));
        }
        return new sprqcn(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprjtm(sprszm sprszm2) {
        void arg0;
        int n = 0;
        this.cfr_renamed_3 = (sprktm)sprszm2.cfr_renamed_85(0);
        sprco sprco2 = arg0.cfr_renamed_85(++n);
        ++n;
        if (sprco2 instanceof sprnvm) {
            this.cfr_renamed_0 = sprpnm.cfr_renamed_5085((sprnvm)sprco2, false);
            sprco2 = arg0.cfr_renamed_85(n);
        }
        int n2 = ++n;
        this.cfr_renamed_2 = spridn.cfr_renamed_23(sprco2);
        this.cfr_renamed_4 = sprnum.cfr_renamed_23(arg0.cfr_renamed_85(n2));
        if (arg0.cfr_renamed_84() > ++n) {
            this.cfr_renamed_1 = spridn.cfr_renamed_5085((sprnvm)arg0.cfr_renamed_85(n), false);
        }
    }
}

