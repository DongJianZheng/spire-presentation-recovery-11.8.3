/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvg;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdfh;
import com.spire.presentation.packages.sprenh;
import com.spire.presentation.packages.sprgmh;
import com.spire.presentation.packages.sprlgh;
import com.spire.presentation.packages.sprmsf;
import com.spire.presentation.packages.sprpch;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprumh;
import com.spire.presentation.packages.sprvwg;
import com.spire.presentation.packages.sprxgf;

public class sprhjh
extends sprqqe {
    private final sprvwg cfr_renamed_0;
    private final sprdfh cfr_renamed_1;
    private final sprlgh cfr_renamed_2;
    private final sprgmh cfr_renamed_3;
    private final sprbvg cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprhjh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 5) {
            throw new IllegalArgumentException(sprmsf.cfr_renamed_9("=\u001b(\u0006;\u0017=\u0007x\u0010=\u0012-\u00066\u0000=C+\n\"\u0006x\f>Cm"));
        }
        sprhjh sprhjh2 = this;
        void v1 = arg0;
        this.cfr_renamed_4 = sprbvg.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_2 = sprlgh.cfr_renamed_23(v1.cfr_renamed_85(1));
        sprhjh2.cfr_renamed_3 = sprgmh.cfr_renamed_23(v1.cfr_renamed_85(2));
        sprhjh2.cfr_renamed_1 = sprdfh.cfr_renamed_23(arg0.cfr_renamed_85(3));
        this.cfr_renamed_0 = sprenh.cfr_renamed_8135(sprvwg.class, arg0.cfr_renamed_85(4));
    }

    public sprlgh cfr_renamed_324() {
        return this.cfr_renamed_2;
    }

    public sprbvg cfr_renamed_3() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[5];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = this.cfr_renamed_2;
        sprcoArray[2] = this.cfr_renamed_3;
        sprcoArray[3] = this.cfr_renamed_1;
        sprcoArray[4] = sprenh.cfr_renamed_23(this.cfr_renamed_0);
        return sprpch.cfr_renamed_8211(sprcoArray);
    }

    public static sprhjh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprhjh) {
            return (sprhjh)arg0;
        }
        if (arg0 != null) {
            return new sprhjh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprdfh cfr_renamed_8295() {
        return this.cfr_renamed_1;
    }

    public static sprumh cfr_renamed_7843() {
        return new sprumh();
    }

    public sprgmh cfr_renamed_102() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprhjh(sprbvg sprbvg2, sprlgh sprlgh2, sprgmh sprgmh2, sprdfh sprdfh2, sprvwg sprvwg2) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprhjh sprhjh2 = this;
        sprhjh sprhjh3 = this;
        this.cfr_renamed_4 = arg0;
        sprhjh3.cfr_renamed_2 = arg1;
        sprhjh3.cfr_renamed_3 = arg2;
        sprhjh2.cfr_renamed_1 = arg3;
        sprhjh2.cfr_renamed_0 = sprvwg2;
    }

    public sprvwg cfr_renamed_79() {
        return this.cfr_renamed_0;
    }
}

