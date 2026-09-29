/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbnm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvrc;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.util.Enumeration;

public class sprjzl
extends sprqqe {
    private sprbnm cfr_renamed_119;
    private spridn cfr_renamed_91;
    private sprddm cfr_renamed_0;
    private spridn cfr_renamed_1;
    private sprktm cfr_renamed_2;
    private sprddm cfr_renamed_3;
    private sproug cfr_renamed_4;

    public spridn cfr_renamed_3973() {
        return this.cfr_renamed_1;
    }

    public sproug cfr_renamed_3971() {
        return this.cfr_renamed_4;
    }

    public static sprjzl cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjzl) {
            return (sprjzl)arg0;
        }
        if (arg0 instanceof sprszm) {
            return new sprjzl((sprszm)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprvrc.cfr_renamed_9("<E\"E&\\'\u000b&I#N*_iB'\u000b/J*_&Y0\u0011i")).append(arg0.getClass().getName()).toString());
    }

    public sprddm cfr_renamed_3970() {
        return this.cfr_renamed_0;
    }

    public sprjzl(sprszm sprszm2) {
        sprjzl sprjzl2;
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        this.cfr_renamed_2 = (sprktm)enumeration.nextElement();
        Enumeration enumeration2 = enumeration;
        this.cfr_renamed_119 = sprbnm.cfr_renamed_23(enumeration.nextElement());
        this.cfr_renamed_3 = sprddm.cfr_renamed_23(enumeration2.nextElement());
        Object e = enumeration2.nextElement();
        if (e instanceof sprnvm) {
            this.cfr_renamed_91 = spridn.cfr_renamed_5085((sprnvm)e, false);
            sprjzl2 = this;
            this.cfr_renamed_0 = sprddm.cfr_renamed_23(enumeration.nextElement());
        } else {
            sprjzl2 = this;
            sprjzl sprjzl3 = this;
            sprjzl3.cfr_renamed_91 = null;
            sprjzl3.cfr_renamed_0 = sprddm.cfr_renamed_23(e);
        }
        sprjzl2.cfr_renamed_4 = sprfvg.cfr_renamed_23(enumeration.nextElement());
        if (enumeration.hasMoreElements()) {
            this.cfr_renamed_1 = spridn.cfr_renamed_5085((sprnvm)enumeration.nextElement(), false);
            return;
        }
        this.cfr_renamed_1 = null;
    }

    public spridn cfr_renamed_3969() {
        return this.cfr_renamed_91;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(7);
        sprjzl sprjzl2 = this;
        sprrvm sprrvm3 = sprrvm2;
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_119);
        sprrvm2.cfr_renamed_5004(sprjzl2.cfr_renamed_3);
        if (sprjzl2.cfr_renamed_91 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_91));
        }
        sprrvm sprrvm4 = sprrvm2;
        sprjzl sprjzl3 = this;
        sprrvm4.cfr_renamed_5004(sprjzl3.cfr_renamed_0);
        sprrvm4.cfr_renamed_5004(sprjzl3.cfr_renamed_4);
        if (this.cfr_renamed_1 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 1, (sprco)this.cfr_renamed_1));
        }
        return new sprcen(sprrvm2);
    }

    public sprbnm cfr_renamed_4024() {
        return this.cfr_renamed_119;
    }

    /*
     * WARNING - void declaration
     */
    public sprjzl(sprktm sprktm2, sprbnm sprbnm2, sprddm sprddm2, spridn spridn2, sprddm sprddm3, sproug sproug2, spridn spridn3) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprjzl sprjzl2 = this;
        sprjzl sprjzl3 = this;
        sprjzl sprjzl4 = this;
        this.cfr_renamed_2 = arg0;
        sprjzl4.cfr_renamed_119 = arg1;
        sprjzl4.cfr_renamed_3 = arg2;
        sprjzl3.cfr_renamed_91 = arg3;
        sprjzl3.cfr_renamed_0 = arg4;
        sprjzl2.cfr_renamed_4 = arg5;
        sprjzl2.cfr_renamed_1 = spridn3;
    }

    public sprddm cfr_renamed_410() {
        return this.cfr_renamed_3;
    }

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_2;
    }
}

