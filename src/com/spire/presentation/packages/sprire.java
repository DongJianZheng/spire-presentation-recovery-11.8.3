/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkme;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtkc;
import com.spire.presentation.packages.sprtme;
import com.spire.presentation.packages.sprtne;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;

public class sprire
extends sprkra {
    private sprtne cfr_renamed_1;
    private sprkme cfr_renamed_2;
    private sprbne cfr_renamed_3;
    private sprbne cfr_renamed_4;

    public static sprire cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprire) {
            return (sprire)arg0;
        }
        if (arg0 != null) {
            return new sprire(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ void cfr_renamed_4814(sprlre arg0, int arg1, spra arg2) {
        if (arg2 != null) {
            arg0.cfr_renamed_49(new sprhse(true, arg1, arg2));
        }
    }

    public sprtme[] cfr_renamed_4883() {
        int n;
        if (this.cfr_renamed_4 == null) {
            return null;
        }
        sprtme[] sprtmeArray = new sprtme[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprtmeArray.length) {
            int n3 = n++;
            sprtmeArray[n3] = sprtme.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprtmeArray;
    }

    public sprtne[] cfr_renamed_4884() {
        int n;
        if (this.cfr_renamed_3 == null) {
            return null;
        }
        sprtne[] sprtneArray = new sprtne[this.cfr_renamed_3.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprtneArray.length) {
            int n3 = n++;
            sprtneArray[n3] = sprtne.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprtneArray;
    }

    public sprkme cfr_renamed_648() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprire sprire2 = this;
        sprlre2.cfr_renamed_49(sprire2.cfr_renamed_2);
        sprire sprire3 = this;
        sprire3.cfr_renamed_4814(sprlre2, 0, this.cfr_renamed_1);
        sprire3.cfr_renamed_4814(sprlre2, 1, this.cfr_renamed_3);
        sprire2.cfr_renamed_4814(sprlre2, 2, this.cfr_renamed_4);
        return new sprpse(sprlre2);
    }

    public sprtne cfr_renamed_4885() {
        return this.cfr_renamed_1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprire(sprbne sprbne2) {
        spryte spryte2;
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        this.cfr_renamed_2 = sprkme.cfr_renamed_23(enumeration.nextElement());
        block5: while (true) {
            if (!enumeration.hasMoreElements()) {
                return;
            }
            spryte2 = spryte.cfr_renamed_23(enumeration.nextElement());
            switch (spryte2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_1 = sprtne.cfr_renamed_23(spryte2.cfr_renamed_2456());
                    continue block5;
                }
                case 1: {
                    this.cfr_renamed_3 = sprbne.cfr_renamed_23(spryte2.cfr_renamed_2456());
                    continue block5;
                }
                case 2: {
                    this.cfr_renamed_4 = sprbne.cfr_renamed_23(spryte2.cfr_renamed_2456());
                    continue block5;
                }
            }
            break;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprtkc.cfr_renamed_9(".U0U4L5\u001b/Z<\u001b5N6Y>Ia\u001b")).append(spryte2.cfr_renamed_312()).toString());
    }
}

