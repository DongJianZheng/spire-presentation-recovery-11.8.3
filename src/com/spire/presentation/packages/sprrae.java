/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprauq;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrhn;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;

public class sprrae
extends sprkra {
    private sprcge cfr_renamed_3;
    private sprcge cfr_renamed_4;

    public sprcge cfr_renamed_178() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprrae(sprcge sprcge2, sprcge sprcge3) {
        void arg0;
        sprrae sprrae2 = this;
        sprrae2.cfr_renamed_4 = arg0;
        sprrae2.cfr_renamed_3 = sprcge3;
    }

    public static sprrae cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprrae) {
            return (sprrae)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new sprrae((sprbne)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprrhn.cfr_renamed_9("JmOdD`O!LcId@u\u0003hM!DdWHMrW`MbF;\u0003")).append(arg0.getClass().getName()).toString());
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(new sprhse(0, this.cfr_renamed_4));
        }
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(new sprhse(1, this.cfr_renamed_3));
        }
        return new sprpse(sprlre2);
    }

    public sprcge cfr_renamed_177() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprrae(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() != 1 && arg0.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprauq.cfr_renamed_9("\u000fz);>~<n(u.~mh$a(!m")).append(arg0.cfr_renamed_84()).toString());
        }
        Enumeration enumeration = arg0.cfr_renamed_329();
        while (enumeration.hasMoreElements()) {
            spryte spryte2 = spryte.cfr_renamed_23(enumeration.nextElement());
            if (spryte2.cfr_renamed_312() == 0) {
                this.cfr_renamed_4 = sprcge.cfr_renamed_341(spryte2, true);
                continue;
            }
            if (spryte2.cfr_renamed_312() == 1) {
                this.cfr_renamed_3 = sprcge.cfr_renamed_341(spryte2, true);
                continue;
            }
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprrhn.cfr_renamed_9("CBe\u0003uBf\u0003oVlAdQ;\u0003")).append(spryte2.cfr_renamed_312()).toString());
        }
    }
}

