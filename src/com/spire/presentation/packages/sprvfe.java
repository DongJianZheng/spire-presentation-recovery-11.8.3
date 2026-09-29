/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprmhe;
import com.spire.presentation.packages.sprnke;
import com.spire.presentation.packages.sprok;
import com.spire.presentation.packages.sprqge;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruhe;
import java.util.Vector;

public class sprvfe {
    private sprok cfr_renamed_3;
    private Vector cfr_renamed_4;

    public sprvfe() {
        this(sprmhe.cfr_renamed_84);
    }

    public sprvfe cfr_renamed_4532(sprqge[] arg0) {
        sprvfe sprvfe2 = this;
        sprvfe2.cfr_renamed_4.addElement(new sprnke(arg0));
        return sprvfe2;
    }

    public sprvfe(sprok sprok2) {
        sprvfe sprvfe2 = this;
        this.cfr_renamed_4 = new Vector();
        this.cfr_renamed_3 = sprok2;
    }

    /*
     * WARNING - void declaration
     */
    public sprvfe cfr_renamed_4533(sprtzd sprtzd2, String string) {
        void arg1;
        void arg0;
        sprvfe sprvfe2 = this;
        sprvfe2.cfr_renamed_4534(sprtzd2, sprvfe2.cfr_renamed_3.cfr_renamed_3218((sprtzd)arg0, (String)arg1));
        return sprvfe2;
    }

    public sprvfe cfr_renamed_4535(sprtzd[] arg0, String[] arg1) {
        int n;
        spra[] spraArray = new spra[arg1.length];
        int n2 = n = 0;
        while (n2 != spraArray.length) {
            int n3 = n;
            spra spra2 = this.cfr_renamed_3.cfr_renamed_3218(arg0[n3], arg1[n]);
            spraArray[n3] = spra2;
            n2 = ++n;
        }
        return this.cfr_renamed_4536(arg0, spraArray);
    }

    public sprvfe cfr_renamed_4534(sprtzd arg0, spra arg1) {
        sprvfe sprvfe2 = this;
        sprvfe2.cfr_renamed_4.addElement(new sprnke(arg0, arg1));
        return sprvfe2;
    }

    public sprvfe cfr_renamed_4537(sprqge arg0) {
        sprvfe sprvfe2 = this;
        sprvfe2.cfr_renamed_4.addElement(new sprnke(arg0));
        return sprvfe2;
    }

    public sprvfe cfr_renamed_4536(sprtzd[] arg0, spra[] arg1) {
        int n;
        sprqge[] sprqgeArray = new sprqge[arg0.length];
        int n2 = n = 0;
        while (n2 != arg0.length) {
            int n3 = n;
            sprqge sprqge2 = new sprqge(arg0[n], arg1[n]);
            sprqgeArray[n3] = sprqge2;
            n2 = ++n;
        }
        return this.cfr_renamed_4532(sprqgeArray);
    }

    public spruhe cfr_renamed_1451() {
        int n;
        sprnke[] sprnkeArray = new sprnke[this.cfr_renamed_4.size()];
        int n2 = n = 0;
        while (n2 != sprnkeArray.length) {
            int n3 = n++;
            sprnkeArray[n3] = (sprnke)this.cfr_renamed_4.elementAt(n3);
            n2 = n;
        }
        return new spruhe(this.cfr_renamed_3, sprnkeArray);
    }
}

