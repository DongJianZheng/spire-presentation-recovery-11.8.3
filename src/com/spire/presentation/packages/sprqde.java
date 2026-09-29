/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprehe;
import com.spire.presentation.packages.sprfap;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprjaz;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprnee;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;

public class sprqde
extends sprkra {
    private sprbne cfr_renamed_2;
    private sprmee cfr_renamed_3;
    private sprnee cfr_renamed_4;

    public static sprqde cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprqde) {
            return (sprqde)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new sprqde((sprbne)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprjaz.cfr_renamed_9("&T#](Y#\u0018 Z%],LoQ!\u0018(];q!K;Y![*\u0002o")).append(arg0.getClass().getName()).toString());
    }

    public sprmee cfr_renamed_4633() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(new sprhse(true, 0, this.cfr_renamed_3));
        }
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(new sprhse(1 != 0, 1, this.cfr_renamed_4));
        }
        sprlre2.cfr_renamed_49(this.cfr_renamed_2);
        return new sprpse(sprlre2);
    }

    public sprnee cfr_renamed_4619() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprqde(sprmee sprmee2, sprnee sprnee2, sprehe[] spreheArray) {
        void arg2;
        void arg0;
        sprqde sprqde2 = this;
        sprqde2.cfr_renamed_3 = arg0;
        sprqde2.cfr_renamed_4 = sprnee2;
        sprqde sprqde3 = this;
        sprqde2.cfr_renamed_2 = new sprpse((spra[])arg2);
    }

    public sprehe[] cfr_renamed_4634() {
        Enumeration enumeration;
        sprehe[] spreheArray = new sprehe[this.cfr_renamed_2.cfr_renamed_84()];
        int n = 0;
        Enumeration enumeration2 = enumeration = this.cfr_renamed_2.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            spreheArray[++n] = sprehe.cfr_renamed_23(enumeration3.nextElement());
        }
        return spreheArray;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprqde(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() > 3) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprfap.cfr_renamed_9("vRP\u0013GVEFQ]WV\u0014@]IQ\t\u0014")).append(arg0.cfr_renamed_84()).toString());
        }
        Enumeration enumeration = arg0.cfr_renamed_329();
        spra spra2 = (spra)enumeration.nextElement();
        if (spra2 instanceof spryte) {
            Enumeration enumeration2;
            switch (((spryte)spra2).cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_3 = sprmee.cfr_renamed_341((spryte)spra2, true);
                    enumeration2 = enumeration;
                    break;
                }
                case 1: {
                    this.cfr_renamed_4 = sprnee.cfr_renamed_341((spryte)spra2, true);
                    enumeration2 = enumeration;
                    break;
                }
                default: {
                    throw new IllegalArgumentException(new StringBuilder().insert(0, sprjaz.cfr_renamed_9("z.\\oL._oV:U-]=\u0002o")).append(((spryte)spra2).cfr_renamed_312()).toString());
                }
            }
            spra2 = (spra)enumeration2.nextElement();
        }
        if (spra2 instanceof spryte) {
            switch (((spryte)spra2).cfr_renamed_312()) {
                case 1: {
                    this.cfr_renamed_4 = sprnee.cfr_renamed_341((spryte)spra2, true);
                    break;
                }
                default: {
                    throw new IllegalArgumentException(new StringBuilder().insert(0, sprfap.cfr_renamed_9("qUW\u0014GUT\u0014]A^VVF\t\u0014")).append(((spryte)spra2).cfr_renamed_312()).toString());
                }
            }
            spra2 = (spra)enumeration.nextElement();
        }
        this.cfr_renamed_2 = sprbne.cfr_renamed_23(spra2);
        if (enumeration.hasMoreElements()) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprjaz.cfr_renamed_9("z.\\oW-R*[;\u0018*V,W:V;]=]+\u0002o")).append(enumeration.nextElement().getClass()).toString());
        }
    }
}

