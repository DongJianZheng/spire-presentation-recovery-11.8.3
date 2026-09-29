/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnhe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprqee;
import com.spire.presentation.packages.sprsjo;
import com.spire.presentation.packages.sprtwg;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryee;
import com.spire.presentation.packages.spryte;

public class spryie
extends sprkra {
    public sprnhe cfr_renamed_2;
    public sprqee cfr_renamed_3;
    public spryee cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spryie(sprbne sprbne2) {
        int n;
        void arg0;
        if (sprbne2.cfr_renamed_84() > 3) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprsjo.cfr_renamed_9("O-il~)|9h\"n)-?d6hv-")).append(arg0.cfr_renamed_84()).toString());
        }
        int n2 = 0;
        if (!(arg0.cfr_renamed_85(0) instanceof spryte)) {
            this.cfr_renamed_4 = spryee.cfr_renamed_23(arg0.cfr_renamed_85(0));
        }
        int n3 = n = ++n2;
        while (n3 != arg0.cfr_renamed_84()) {
            spryte spryte2 = spryte.cfr_renamed_23(arg0.cfr_renamed_85(n));
            if (spryte2.cfr_renamed_312() == 0) {
                this.cfr_renamed_2 = sprnhe.cfr_renamed_341(spryte2, false);
            } else if (spryte2.cfr_renamed_312() == 1) {
                this.cfr_renamed_3 = sprqee.cfr_renamed_341(spryte2, false);
            } else {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprtwg.cfr_renamed_9("$\u0001\u0002@\u0012\u0001\u0001@\b\u0015\u000b\u0002\u0003\u0012\\@")).append(spryte2.cfr_renamed_312()).toString());
            }
            n3 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public spryie(spryee spryee2, sprnhe sprnhe2, sprqee sprqee2) {
        void arg1;
        void arg0;
        spryie spryie2 = this;
        this.cfr_renamed_4 = arg0;
        spryie2.cfr_renamed_2 = arg1;
        spryie2.cfr_renamed_3 = sprqee2;
    }

    public sprnhe cfr_renamed_404() {
        return this.cfr_renamed_2;
    }

    public static spryie cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spryie) {
            return (spryie)arg0;
        }
        if (arg0 != null) {
            return new spryie(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public spryee cfr_renamed_403() {
        return this.cfr_renamed_4;
    }

    public spryie(spryee arg0, sprqee arg1) {
        this(arg0, null, arg1);
    }

    public static spryie cfr_renamed_341(spryte arg0, boolean arg1) {
        return spryie.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public sprqee cfr_renamed_409() {
        return this.cfr_renamed_3;
    }

    public spryie(spryee arg0) {
        this(arg0, null, null);
    }

    public spryie(spryee arg0, sprnhe arg1) {
        this(arg0, arg1, null);
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        if (this.cfr_renamed_2 != null) {
            sprlre2.cfr_renamed_49(new sprhse(0 != 0, 0, this.cfr_renamed_2));
        }
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(new sprhse(false, 1, this.cfr_renamed_3));
        }
        return new sprpse(sprlre2);
    }
}

