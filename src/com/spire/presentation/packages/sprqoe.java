/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdsk;
import com.spire.presentation.packages.sprfoe;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrre;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprzpe;
import java.util.Enumeration;

public class sprqoe
extends sprkra {
    private sprzpe cfr_renamed_2;
    private sprbne cfr_renamed_3;
    private sprrre cfr_renamed_4;

    public sprfoe[] cfr_renamed_4824() {
        int n;
        if (this.cfr_renamed_3 == null) {
            return null;
        }
        sprfoe[] sprfoeArray = new sprfoe[this.cfr_renamed_3.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprfoeArray.length) {
            int n3 = n++;
            sprfoeArray[n3] = sprfoe.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprfoeArray;
    }

    private /* synthetic */ void cfr_renamed_4825(sprlre arg0, spra arg1) {
        if (arg1 != null) {
            arg0.cfr_renamed_49(arg1);
        }
    }

    public sprzpe cfr_renamed_4826() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprqoe(sprrre sprrre2, sprzpe sprzpe2, sprfoe[] sprfoeArray) {
        void arg2;
        void arg1;
        void arg0;
        if (sprrre2 == null) {
            throw new IllegalArgumentException(sprdsk.cfr_renamed_9("d\u0006&\u001777&\u0014dE \u0004-\u000b,\u0011c\u0007&E-\u0010/\t"));
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_2 = arg1;
        if (arg2 != null) {
            sprqoe sprqoe2 = this;
            sprqoe2.cfr_renamed_3 = new sprpse((spra[])arg2);
        }
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprqoe sprqoe2 = this;
        sprlre2.cfr_renamed_49(sprqoe2.cfr_renamed_4);
        sprqoe sprqoe3 = this;
        sprqoe3.cfr_renamed_4825(sprlre2, sprqoe3.cfr_renamed_2);
        sprqoe2.cfr_renamed_4825(sprlre2, sprqoe3.cfr_renamed_3);
        return new sprpse(sprlre2);
    }

    public sprrre cfr_renamed_609() {
        return this.cfr_renamed_4;
    }

    public static sprqoe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprqoe) {
            return (sprqoe)arg0;
        }
        if (arg0 != null) {
            return new sprqoe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprzpe cfr_renamed_2431() {
        return this.cfr_renamed_2;
    }

    private /* synthetic */ sprqoe(sprbne sprbne2) {
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        this.cfr_renamed_4 = sprrre.cfr_renamed_23(enumeration.nextElement());
        while (enumeration.hasMoreElements()) {
            Object e = enumeration.nextElement();
            if (e instanceof spryte || e instanceof sprzpe) {
                this.cfr_renamed_2 = sprzpe.cfr_renamed_23(e);
                continue;
            }
            this.cfr_renamed_3 = sprbne.cfr_renamed_23(e);
        }
    }
}

