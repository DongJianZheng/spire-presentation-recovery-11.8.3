/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxte;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprzro;
import java.util.Enumeration;

public class sprtse
extends sprkra {
    public sprbne cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprtse(sprbne sprbne2) {
        void arg0;
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        while (enumeration.hasMoreElements()) {
            if (enumeration.nextElement() instanceof sprxte) continue;
            throw new IllegalArgumentException(sprzro.cfr_renamed_9("\t}\u001cl\u0005y\u001c)\u001cfH`\u0006z\r{\u001c)\u0006f\u0006)=].1HZ<[!G/)\u0001g\u001cfHY#@.{\rl<l\u0010}"));
        }
        this.cfr_renamed_4 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprtse(String string) {
        this(new sprxte((String)arg0));
        void arg0;
    }

    public static sprtse cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprtse.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprtse(sprxte sprxte2) {
        void arg0;
        sprtse sprtse2 = this;
        sprtse2.cfr_renamed_4 = new sprpse((spra)arg0);
    }

    public sprtse(String[] arg0) {
        int n;
        sprlre sprlre2 = new sprlre();
        int n2 = n = 0;
        while (n2 < arg0.length) {
            sprlre2.cfr_renamed_49(new sprxte(arg0[n++]));
            n2 = n;
        }
        this.cfr_renamed_4 = new sprpse(sprlre2);
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_4.cfr_renamed_84();
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public sprxte cfr_renamed_649(int arg0) {
        return (sprxte)this.cfr_renamed_4.cfr_renamed_85(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprtse(sprxte[] sprxteArray) {
        void arg0;
        sprtse sprtse2 = this;
        sprtse2.cfr_renamed_4 = new sprpse((spra[])arg0);
    }

    public static sprtse cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprtse) {
            return (sprtse)arg0;
        }
        if (arg0 != null) {
            return new sprtse(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}

