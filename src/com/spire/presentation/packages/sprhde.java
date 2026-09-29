/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprjze;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnfe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxde;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;

public class sprhde
extends sprkra {
    private Object[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprhde(sprxde[] sprxdeArray) {
        void arg0;
        this.cfr_renamed_4 = new Object[1];
        this.cfr_renamed_4[0] = arg0;
    }

    @Override
    public sprvva cfr_renamed_119() {
        int n;
        sprlre sprlre2 = new sprlre();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.length) {
            if (this.cfr_renamed_4[n] instanceof sprxde[]) {
                sprlre2.cfr_renamed_49(new sprhse(0, new sprpse((sprxde[])this.cfr_renamed_4[n])));
            } else {
                sprlre2.cfr_renamed_49(new sprhse(1, (sprnfe)this.cfr_renamed_4[n]));
            }
            n2 = ++n;
        }
        return new sprpse(sprlre2);
    }

    public static sprhde cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprhde) {
            return (sprhde)arg0;
        }
        if (arg0 != null) {
            return new sprhde(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public Object[] cfr_renamed_205() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprhde(sprbne sprbne2) {
        void arg0;
        Enumeration enumeration;
        int n = 0;
        this.cfr_renamed_4 = new Object[sprbne2.cfr_renamed_84()];
        Enumeration enumeration2 = enumeration = arg0.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            spryte spryte2 = spryte.cfr_renamed_23(enumeration.nextElement());
            if (spryte2.cfr_renamed_312() == 0) {
                int n2;
                sprbne sprbne3 = sprbne.cfr_renamed_341(spryte2, true);
                sprxde[] sprxdeArray = new sprxde[sprbne3.cfr_renamed_84()];
                int n3 = n2 = 0;
                while (n3 != sprxdeArray.length) {
                    int n4 = n2++;
                    sprxdeArray[n4] = sprxde.cfr_renamed_23(sprbne3.cfr_renamed_85(n4));
                    n3 = n2;
                }
                this.cfr_renamed_4[n] = sprxdeArray;
            } else if (spryte2.cfr_renamed_312() == 1) {
                this.cfr_renamed_4[n] = sprnfe.cfr_renamed_23(sprbne.cfr_renamed_341(spryte2, true));
            } else {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprjze.cfr_renamed_9("\u0010O\u0015F\u001eB\u0015\u0003\rB\u001e\u0019Y")).append(spryte2.cfr_renamed_312()).toString());
            }
            ++n;
            enumeration2 = enumeration;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprhde(sprnfe sprnfe2) {
        void arg0;
        this.cfr_renamed_4 = new Object[1];
        this.cfr_renamed_4[0] = arg0;
    }
}

