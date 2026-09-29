/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.spreum;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprhfp;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprqan
extends sprqqe {
    private final spreum cfr_renamed_2;
    private final sprddm cfr_renamed_3;
    private final sprszm cfr_renamed_4;

    public byte[][] cfr_renamed_11416() {
        int n;
        byte[][] byArrayArray = new byte[this.cfr_renamed_4.cfr_renamed_84()][];
        int n2 = n = 0;
        while (n2 != byArrayArray.length) {
            int n3 = n++;
            byArrayArray[n3] = sproze.cfr_renamed_158(sproug.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3)).cfr_renamed_186());
            n2 = n;
        }
        return byArrayArray;
    }

    public sprddm cfr_renamed_4881() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprqan(sprddm sprddm2, byte[][] byArray, spreum spreum2) {
        void arg2;
        int n;
        void arg1;
        this.cfr_renamed_3 = sprddm2;
        sprrvm sprrvm2 = new sprrvm(((void)arg1).length);
        int n2 = n = 0;
        while (n2 != ((void)arg1).length) {
            void v1 = arg1[n];
            sprrvm2.cfr_renamed_5004(new sprfvg(sproze.cfr_renamed_158((byte[])v1)));
            n2 = ++n;
        }
        this.cfr_renamed_4 = new sprcen(sprrvm2);
        this.cfr_renamed_2 = arg2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprqan(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(sprhfp.cfr_renamed_9("]+W*F7Q&@eG E0Q+W \u00146]?Q"));
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprddm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprszm.cfr_renamed_23(v0.cfr_renamed_85(1));
        this.cfr_renamed_2 = spreum.cfr_renamed_23(v0.cfr_renamed_85(2));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(3);
        sprqan sprqan2 = this;
        sprrvm2.cfr_renamed_5004(sprqan2.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(sprqan2.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_2);
        return new sprcen(sprrvm2);
    }

    public static sprqan cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprqan) {
            return (sprqan)arg0;
        }
        if (arg0 != null) {
            return new sprqan(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public spreum cfr_renamed_11417() {
        return this.cfr_renamed_2;
    }
}

