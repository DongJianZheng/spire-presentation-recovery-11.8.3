/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvg;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcsg;
import com.spire.presentation.packages.sprdfh;
import com.spire.presentation.packages.sprenh;
import com.spire.presentation.packages.spriug;
import com.spire.presentation.packages.sprlgh;
import com.spire.presentation.packages.sprpch;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrnl;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvrg;
import com.spire.presentation.packages.sprxgf;

public class spruqg
extends sprqqe {
    private final sprdfh cfr_renamed_0;
    private final spriug cfr_renamed_1;
    private final sprvrg cfr_renamed_2;
    private final sprlgh cfr_renamed_3;
    private final sprbvg cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[5];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = this.cfr_renamed_2;
        sprcoArray[2] = this.cfr_renamed_3;
        sprcoArray[3] = this.cfr_renamed_0;
        sprcoArray[4] = sprenh.cfr_renamed_23(this.cfr_renamed_1);
        return sprpch.cfr_renamed_8211(sprcoArray);
    }

    public sprlgh cfr_renamed_324() {
        return this.cfr_renamed_3;
    }

    public static spruqg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spruqg) {
            return (spruqg)arg0;
        }
        if (arg0 != null) {
            return new spruqg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spruqg(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 5) {
            throw new IllegalArgumentException(sprrnl.cfr_renamed_9("h*}7n&h6-!h#x7c1hr~;w7-=kr8"));
        }
        void v0 = arg0;
        spruqg spruqg2 = this;
        void v2 = arg0;
        this.cfr_renamed_4 = sprbvg.cfr_renamed_23(v2.cfr_renamed_85(0));
        spruqg2.cfr_renamed_2 = sprvrg.cfr_renamed_23(v2.cfr_renamed_85(1));
        spruqg2.cfr_renamed_3 = sprlgh.cfr_renamed_23(arg0.cfr_renamed_85(2));
        this.cfr_renamed_0 = sprdfh.cfr_renamed_23(v0.cfr_renamed_85(3));
        this.cfr_renamed_1 = sprenh.cfr_renamed_23(v0.cfr_renamed_85(4)).cfr_renamed_8134(spriug.class);
    }

    public static sprcsg cfr_renamed_7843() {
        return new sprcsg();
    }

    /*
     * WARNING - void declaration
     */
    public spruqg(sprbvg sprbvg2, sprvrg sprvrg2, sprlgh sprlgh2, sprdfh sprdfh2, spriug spriug2) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        spruqg spruqg2 = this;
        spruqg spruqg3 = this;
        this.cfr_renamed_4 = arg0;
        spruqg3.cfr_renamed_2 = arg1;
        spruqg3.cfr_renamed_3 = arg2;
        spruqg2.cfr_renamed_0 = arg3;
        spruqg2.cfr_renamed_1 = spriug2;
    }

    public sprbvg cfr_renamed_3() {
        return this.cfr_renamed_4;
    }

    public sprdfh cfr_renamed_8216() {
        return this.cfr_renamed_0;
    }

    public sprvrg cfr_renamed_8217() {
        return this.cfr_renamed_2;
    }

    public spriug cfr_renamed_8218() {
        return this.cfr_renamed_1;
    }
}

