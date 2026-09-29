/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprjbh;
import com.spire.presentation.packages.sprjih;
import com.spire.presentation.packages.sprjxg;
import com.spire.presentation.packages.sprnah;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprsqaa;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprpxg
extends sprqqe {
    private final sprnah cfr_renamed_2;
    private final sprjbh cfr_renamed_3;
    private final sprjih cfr_renamed_4;

    public sprnah cfr_renamed_8335() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprpxg(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(sprsqaa.cfr_renamed_9("W\bB\u0015Q\u0004W\u0014\u0012\u0003W\u0001G\u0015\\\u0013WPA\u0019H\u0015\u0012\u001fTP\u0001"));
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprjbh.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_2 = sprnah.cfr_renamed_23(v0.cfr_renamed_85(1));
        this.cfr_renamed_4 = sprjih.cfr_renamed_23(v0.cfr_renamed_85(2));
    }

    public sprjih cfr_renamed_8340() {
        return this.cfr_renamed_4;
    }

    public static sprpxg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprpxg) {
            return (sprpxg)arg0;
        }
        if (arg0 != null) {
            return new sprpxg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprpxg(sprjbh sprjbh2, sprnah sprnah2, sprjih sprjih2) {
        void arg1;
        void arg0;
        sprpxg sprpxg2 = this;
        this.cfr_renamed_3 = arg0;
        sprpxg2.cfr_renamed_2 = arg1;
        sprpxg2.cfr_renamed_4 = sprjih2;
    }

    public sprjbh cfr_renamed_8336() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[3];
        sprcoArray[0] = this.cfr_renamed_3;
        sprcoArray[1] = this.cfr_renamed_2;
        sprcoArray[2] = this.cfr_renamed_4;
        return new sprcen(sprcoArray);
    }

    public static sprjxg cfr_renamed_7843() {
        return new sprjxg();
    }
}

