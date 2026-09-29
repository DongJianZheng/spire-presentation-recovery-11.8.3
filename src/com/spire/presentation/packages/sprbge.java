/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcae;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprjej;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;

public class sprbge
extends sprkra {
    private sprooe cfr_renamed_2;
    private sprrpe cfr_renamed_3;
    private sprcae cfr_renamed_4;

    public static sprbge cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbge) {
            return (sprbge)arg0;
        }
        if (arg0 != null) {
            return new sprbge(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprooe cfr_renamed_4605() {
        return this.cfr_renamed_2;
    }

    public sprrpe cfr_renamed_4606() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(new sprhse(true, 0, this.cfr_renamed_4));
        }
        if (this.cfr_renamed_2 != null) {
            sprlre2.cfr_renamed_49(new sprhse(1 != 0, 1, this.cfr_renamed_2));
        }
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(new sprhse(true, 2, this.cfr_renamed_3));
        }
        return new sprpse(sprlre2);
    }

    public sprcae cfr_renamed_4607() {
        return this.cfr_renamed_4;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprbge(sprbne sprbne2) {
        spryte spryte2;
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        block5: while (true) {
            if (!enumeration.hasMoreElements()) {
                return;
            }
            spryte2 = (spryte)enumeration.nextElement();
            switch (spryte2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_4 = sprcae.cfr_renamed_341(spryte2, true);
                    continue block5;
                }
                case 1: {
                    this.cfr_renamed_2 = sprooe.cfr_renamed_341(spryte2, true);
                    continue block5;
                }
                case 2: {
                    this.cfr_renamed_3 = sprrpe.cfr_renamed_341(spryte2, true);
                    continue block5;
                }
            }
            break;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprjej.cfr_renamed_9("*u4u0l1;+z8;1n2y:ie;")).append(spryte2.cfr_renamed_312()).toString());
    }
}

