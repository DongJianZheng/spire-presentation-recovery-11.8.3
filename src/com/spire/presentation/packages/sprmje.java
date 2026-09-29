/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcma;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprqie;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class sprmje
extends sprkra {
    public sprbne cfr_renamed_3;
    public Hashtable cfr_renamed_4;

    public static sprmje cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmje) {
            return (sprmje)arg0;
        }
        if (arg0 != null) {
            return new sprmje(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_3;
    }

    public sprmje(sprqie arg0) {
        sprmje sprmje2 = this;
        sprmje sprmje3 = this;
        sprmje2.cfr_renamed_4 = new Hashtable();
        sprmje3.cfr_renamed_3 = new sprpse(arg0);
        sprqie sprqie2 = arg0;
        sprmje2.cfr_renamed_4.put(sprqie2, sprqie2);
    }

    /*
     * WARNING - void declaration
     */
    public sprmje(Vector vector) {
        void arg0;
        Enumeration enumeration;
        sprmje sprmje2 = this;
        sprmje2.cfr_renamed_4 = new Hashtable();
        sprlre sprlre2 = new sprlre();
        Enumeration enumeration2 = enumeration = arg0.elements();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            sprqie sprqie2 = sprqie.cfr_renamed_23(enumeration3.nextElement());
            sprlre2.cfr_renamed_49(sprqie2);
            sprqie sprqie3 = sprqie2;
            this.cfr_renamed_4.put(sprqie3, sprqie3);
        }
        this.cfr_renamed_3 = new sprpse(sprlre2);
    }

    public boolean cfr_renamed_570(sprqie arg0) {
        return this.cfr_renamed_4.get(arg0) != null;
    }

    /*
     * WARNING - void declaration
     */
    public sprmje(sprqie[] sprqieArray) {
        void arg0;
        int n;
        sprmje sprmje2 = this;
        sprmje2.cfr_renamed_4 = new Hashtable();
        sprlre sprlre2 = new sprlre();
        int n2 = n = 0;
        while (n2 != ((void)arg0).length) {
            sprlre2.cfr_renamed_49((spra)arg0[n]);
            this.cfr_renamed_4.put(arg0[n], arg0[n++]);
            n2 = n;
        }
        this.cfr_renamed_3 = new sprpse(sprlre2);
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_4.size();
    }

    public sprqie[] cfr_renamed_4524() {
        Enumeration enumeration;
        sprqie[] sprqieArray = new sprqie[this.cfr_renamed_3.cfr_renamed_84()];
        int n = 0;
        Enumeration enumeration2 = enumeration = this.cfr_renamed_3.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            sprqieArray[++n] = sprqie.cfr_renamed_23(enumeration3.nextElement());
        }
        return sprqieArray;
    }

    public static sprmje cfr_renamed_2757(sprszd arg0) {
        return sprmje.cfr_renamed_23(arg0.cfr_renamed_4477(sprtie.cfr_renamed_145));
    }

    private /* synthetic */ sprmje(sprbne arg0) {
        Enumeration enumeration;
        sprmje sprmje2 = this;
        sprmje2.cfr_renamed_4 = new Hashtable();
        this.cfr_renamed_3 = arg0;
        Enumeration enumeration2 = enumeration = this.cfr_renamed_3.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            spra spra2 = (spra)enumeration.nextElement();
            if (!(spra2.cfr_renamed_119() instanceof sprtzd)) {
                throw new IllegalArgumentException(sprcma.cfr_renamed_9("\b\u0014+\u0003g;\u00144v5%\u0010\"\u001933#\u001f)\u000e.\u001c.\u001f5\tg\u001b+\u0016(\r\"\u001eg\u0013)Z\u0002\u00023\u001f)\u001e\"\u001e\f\u001f>/4\u001b \u001fi"));
            }
            spra spra3 = spra2;
            this.cfr_renamed_4.put(spra3, spra3);
            enumeration2 = enumeration;
        }
    }

    public static sprmje cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprmje.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }
}

