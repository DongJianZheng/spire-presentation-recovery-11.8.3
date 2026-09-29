/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvg;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdfh;
import com.spire.presentation.packages.sprenh;
import com.spire.presentation.packages.sprlgh;
import com.spire.presentation.packages.sprpch;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprqzg;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.sprvrg;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprykaa;

public class sprwwg
extends sprqqe {
    private final sprupm cfr_renamed_0;
    private final sprvrg cfr_renamed_1;
    private final sprbvg cfr_renamed_2;
    private final sprlgh cfr_renamed_3;
    private final sprdfh cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[5];
        sprcoArray[0] = this.cfr_renamed_2;
        sprcoArray[1] = this.cfr_renamed_1;
        sprcoArray[2] = this.cfr_renamed_3;
        sprcoArray[3] = this.cfr_renamed_4;
        sprcoArray[4] = sprenh.cfr_renamed_23(this.cfr_renamed_0);
        return sprpch.cfr_renamed_8211(sprcoArray);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprwwg(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 5) {
            throw new IllegalArgumentException(sprykaa.cfr_renamed_9("s\u0001f\u001cu\rs\u001d6\ns\bc\u001cx\u001asYe\u0010l\u001c6\u0016pY#"));
        }
        void v0 = arg0;
        sprwwg sprwwg2 = this;
        void v2 = arg0;
        this.cfr_renamed_2 = sprbvg.cfr_renamed_23(v2.cfr_renamed_85(0));
        sprwwg2.cfr_renamed_1 = sprvrg.cfr_renamed_23(v2.cfr_renamed_85(1));
        sprwwg2.cfr_renamed_3 = sprlgh.cfr_renamed_23(arg0.cfr_renamed_85(2));
        this.cfr_renamed_4 = sprdfh.cfr_renamed_23(v0.cfr_renamed_85(3));
        this.cfr_renamed_0 = sprenh.cfr_renamed_23(v0.cfr_renamed_85(4)).cfr_renamed_8134(sprupm.class);
    }

    public static sprqzg cfr_renamed_7843() {
        return new sprqzg();
    }

    public sprlgh cfr_renamed_324() {
        return this.cfr_renamed_3;
    }

    public sprvrg cfr_renamed_8217() {
        return this.cfr_renamed_1;
    }

    public sprupm cfr_renamed_8219() {
        return this.cfr_renamed_0;
    }

    public sprdfh cfr_renamed_8216() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprwwg(sprbvg sprbvg2, sprvrg sprvrg2, sprlgh sprlgh2, sprdfh sprdfh2, sprupm sprupm2) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprwwg sprwwg2 = this;
        sprwwg sprwwg3 = this;
        this.cfr_renamed_2 = arg0;
        sprwwg3.cfr_renamed_1 = arg1;
        sprwwg3.cfr_renamed_3 = arg2;
        sprwwg2.cfr_renamed_4 = arg3;
        sprwwg2.cfr_renamed_0 = sprupm2;
    }

    public static sprwwg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprwwg) {
            return (sprwwg)arg0;
        }
        if (arg0 != null) {
            return new sprwwg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprbvg cfr_renamed_3() {
        return this.cfr_renamed_2;
    }
}

