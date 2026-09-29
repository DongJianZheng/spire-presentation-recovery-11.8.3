/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprbva;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnvc;
import com.spire.presentation.packages.sproje;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrce;
import com.spire.presentation.packages.sprsce;
import com.spire.presentation.packages.sprvva;
import java.util.Enumeration;

public class sprsae
extends sprkra {
    private sprrce cfr_renamed_2;
    private sprbne cfr_renamed_3;
    private sprbne cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprsae(sproje[] sprojeArray, sprsce[] sprsceArray, sprrce sprrce2) {
        void arg2;
        void arg1;
        void arg0;
        if (null != arg0) {
            sprsae sprsae2 = this;
            sprsae2.cfr_renamed_3 = new sprpse((spra[])arg0);
        }
        if (null != arg1) {
            this.cfr_renamed_4 = new sprpse((spra[])arg1);
        }
        this.cfr_renamed_2 = arg2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (null != this.cfr_renamed_3) {
            sprlre2.cfr_renamed_49(new sprhse(true, 0, this.cfr_renamed_3));
        }
        if (null != this.cfr_renamed_4) {
            sprlre2.cfr_renamed_49(new sprhse(1 != 0, 1, this.cfr_renamed_4));
        }
        if (null != this.cfr_renamed_2) {
            sprlre2.cfr_renamed_49(new sprhse(true, 2, this.cfr_renamed_2.cfr_renamed_119()));
        }
        return new sprpse(sprlre2);
    }

    public static sprsae cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprsae) {
            return (sprsae)arg0;
        }
        if (arg0 != null) {
            return new sprsae(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprsae(sprbne sprbne2) {
        sprhse sprhse2;
        void arg0;
        if (sprbne2.cfr_renamed_84() > 3) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprbva.cfr_renamed_9("QCw\u0002`GbWvLpG3QzXv\u00183")).append(arg0.cfr_renamed_84()).toString());
        }
        Enumeration enumeration = arg0.cfr_renamed_329();
        block5: while (true) {
            if (!enumeration.hasMoreElements()) {
                return;
            }
            sprhse2 = (sprhse)enumeration.nextElement();
            switch (sprhse2.cfr_renamed_312()) {
                case 0: {
                    sprbne sprbne3 = (sprbne)sprhse2.cfr_renamed_2456();
                    Enumeration enumeration2 = sprbne3.cfr_renamed_329();
                    while (enumeration2.hasMoreElements()) {
                        Enumeration enumeration3;
                        Enumeration enumeration4 = enumeration3;
                        enumeration2 = enumeration4;
                        sproje.cfr_renamed_23(enumeration4.nextElement());
                    }
                    this.cfr_renamed_3 = sprbne3;
                    continue block5;
                }
                case 1: {
                    sprbne sprbne4 = (sprbne)sprhse2.cfr_renamed_2456();
                    Enumeration enumeration5 = sprbne4.cfr_renamed_329();
                    while (enumeration5.hasMoreElements()) {
                        Enumeration enumeration6;
                        Enumeration enumeration7 = enumeration6;
                        enumeration5 = enumeration7;
                        sprsce.cfr_renamed_23(enumeration7.nextElement());
                    }
                    this.cfr_renamed_4 = sprbne4;
                    continue block5;
                }
                case 2: {
                    this.cfr_renamed_2 = sprrce.cfr_renamed_23(sprhse2.cfr_renamed_2456());
                    continue block5;
                }
            }
            break;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprnvc.cfr_renamed_9("7L(C2K:\u0002*C9\u0018~")).append(sprhse2.cfr_renamed_312()).toString());
    }

    public sproje[] cfr_renamed_4663() {
        int n;
        if (null == this.cfr_renamed_3) {
            return new sproje[0];
        }
        sproje[] sprojeArray = new sproje[this.cfr_renamed_3.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 < sprojeArray.length) {
            int n3 = n++;
            sprojeArray[n3] = sproje.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprojeArray;
    }

    public sprsce[] cfr_renamed_4664() {
        int n;
        if (null == this.cfr_renamed_4) {
            return new sprsce[0];
        }
        sprsce[] sprsceArray = new sprsce[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 < sprsceArray.length) {
            int n3 = n++;
            sprsceArray[n3] = sprsce.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprsceArray;
    }

    public sprrce cfr_renamed_4665() {
        return this.cfr_renamed_2;
    }
}

