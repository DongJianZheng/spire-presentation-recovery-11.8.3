/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprlue;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtne;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;

public class sprzle
extends sprkra {
    private sprdne cfr_renamed_1;
    private sprbne cfr_renamed_2;
    private sprlue cfr_renamed_3;
    private sprmra cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_4814(sprlre arg0, int arg1, spra arg2) {
        if (arg2 != null) {
            arg0.cfr_renamed_49(new sprhse(true, arg1, arg2));
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprzle(sprdne sprdne2, sprlue sprlue2, sprmra sprmra2, sprtne[] sprtneArray) {
        void arg2;
        void arg1;
        void arg0;
        sprzle sprzle2 = this;
        this.cfr_renamed_1 = arg0;
        sprzle2.cfr_renamed_3 = arg1;
        sprzle2.cfr_renamed_4 = arg2;
        if (sprtneArray != null) {
            void arg3;
            int n;
            sprlre sprlre2 = new sprlre();
            int n2 = n = 0;
            while (n2 < ((void)arg3).length) {
                sprlre2.cfr_renamed_49((spra)arg3[n++]);
                n2 = n;
            }
            this.cfr_renamed_2 = new sprpse(sprlre2);
        }
    }

    private /* synthetic */ sprzle(sprbne sprbne2) {
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        this.cfr_renamed_1 = sprdne.cfr_renamed_23(enumeration.nextElement());
        this.cfr_renamed_3 = sprlue.cfr_renamed_23(enumeration.nextElement());
        while (enumeration.hasMoreElements()) {
            spryte spryte2 = (spryte)enumeration.nextElement();
            if (spryte2.cfr_renamed_312() == 0) {
                this.cfr_renamed_4 = sprmra.cfr_renamed_341(spryte2, true);
                continue;
            }
            this.cfr_renamed_2 = sprbne.cfr_renamed_341(spryte2, true);
        }
    }

    public sprmra cfr_renamed_4413() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprzle sprzle2 = this;
        sprlre2.cfr_renamed_49(this.cfr_renamed_1);
        sprlre2.cfr_renamed_49(sprzle2.cfr_renamed_3);
        sprzle sprzle3 = this;
        sprzle3.cfr_renamed_4814(sprlre2, 0, sprzle3.cfr_renamed_4);
        sprzle2.cfr_renamed_4814(sprlre2, 1, this.cfr_renamed_2);
        return new sprpse(sprlre2);
    }

    public sprdne cfr_renamed_4409() {
        return this.cfr_renamed_1;
    }

    public sprlue cfr_renamed_2573() {
        return this.cfr_renamed_3;
    }

    public sprtne[] cfr_renamed_4414() {
        int n;
        if (this.cfr_renamed_2 == null) {
            return null;
        }
        sprtne[] sprtneArray = new sprtne[this.cfr_renamed_2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 < sprtneArray.length) {
            int n3 = n++;
            sprtneArray[n3] = sprtne.cfr_renamed_23(this.cfr_renamed_2.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprtneArray;
    }

    public sprzle(sprdne arg0, sprlue arg1, sprmra arg2) {
        this(arg0, arg1, arg2, null);
    }

    public sprzle(sprdne arg0, sprlue arg1) {
        this(arg0, arg1, null, null);
    }

    public static sprzle cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzle) {
            return (sprzle)arg0;
        }
        if (arg0 != null) {
            return new sprzle(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}

