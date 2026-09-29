/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdjy;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtig;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxte;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryee;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;
import java.util.Vector;

public class spriie
extends sprkra {
    public spryee cfr_renamed_91;
    public int cfr_renamed_0;
    public Vector cfr_renamed_1;
    public static final int cfr_renamed_2 = 1;
    public static final int cfr_renamed_3 = 2;
    public static final int cfr_renamed_4 = 3;

    public spryee cfr_renamed_422() {
        return this.cfr_renamed_91;
    }

    public int cfr_renamed_423() {
        return this.cfr_renamed_0;
    }

    @Override
    public sprvva cfr_renamed_119() {
        Enumeration enumeration;
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_91 != null) {
            sprlre2.cfr_renamed_49(new sprhse(0, this.cfr_renamed_91));
        }
        sprlre sprlre3 = new sprlre();
        Enumeration enumeration2 = enumeration = this.cfr_renamed_1.elements();
        while (enumeration2.hasMoreElements()) {
            sprlre3.cfr_renamed_49((spra)enumeration.nextElement());
            enumeration2 = enumeration;
        }
        sprlre2.cfr_renamed_49(new sprpse(sprlre3));
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spriie(sprbne sprbne2) {
        Enumeration enumeration;
        void v2;
        sprbne arg0;
        spriie spriie2 = this;
        spriie2.cfr_renamed_91 = null;
        spriie spriie3 = this;
        spriie2.cfr_renamed_1 = new Vector();
        spriie2.cfr_renamed_0 = -1;
        int n = 0;
        if (sprbne2.cfr_renamed_85(0) instanceof spryte) {
            ++n;
            this.cfr_renamed_91 = spryee.cfr_renamed_341((spryte)arg0.cfr_renamed_85(0), false);
            v2 = arg0;
        } else {
            if (arg0.cfr_renamed_84() == 2) {
                ++n;
                this.cfr_renamed_91 = spryee.cfr_renamed_23(arg0.cfr_renamed_85(0));
            }
            v2 = arg0;
        }
        if (!(v2.cfr_renamed_85(n) instanceof sprbne)) {
            throw new IllegalArgumentException(sprtig.cfr_renamed_9("K,knL&q%D7q1V:k7d;%&k j'l-b"));
        }
        arg0 = (sprbne)arg0.cfr_renamed_85(n);
        Enumeration enumeration2 = enumeration = arg0.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            spriie spriie4;
            int n2;
            sprvva sprvva2 = (sprvva)enumeration.nextElement();
            if (sprvva2 instanceof sprtzd) {
                n2 = 2;
                spriie4 = this;
            } else if (sprvva2 instanceof sprxte) {
                n2 = 3;
                spriie4 = this;
            } else if (sprvva2 instanceof sprlqe) {
                n2 = 1;
                spriie4 = this;
            } else {
                throw new IllegalArgumentException(sprdjy.cfr_renamed_9("\u001fM9\f+M1Y8\f)U-I}I3O2H4B:\f\u0014I)J\u001cX)^\u000eU3X<T"));
            }
            if (spriie4.cfr_renamed_0 < 0) {
                this.cfr_renamed_0 = n2;
            }
            if (n2 != this.cfr_renamed_0) {
                throw new IllegalArgumentException(sprtig.cfr_renamed_9("\u000el;%,ccs\"i6`cq:u&vcl-%\n`7c\u0002q7w\u0010|-q\"}"));
            }
            this.cfr_renamed_1.addElement(sprvva2);
            enumeration2 = enumeration;
        }
    }

    public Object[] cfr_renamed_205() {
        int n;
        if (this.cfr_renamed_423() == 1) {
            int n2;
            Object[] objectArray = new sprxue[this.cfr_renamed_1.size()];
            int n3 = n2 = 0;
            while (n3 != objectArray.length) {
                int n4 = n2++;
                objectArray[n4] = (sprxue)this.cfr_renamed_1.elementAt(n4);
                n3 = n2;
            }
            return objectArray;
        }
        if (this.cfr_renamed_423() == 2) {
            int n5;
            Object[] objectArray = new sprtzd[this.cfr_renamed_1.size()];
            int n6 = n5 = 0;
            while (n6 != objectArray.length) {
                int n7 = n5++;
                objectArray[n7] = (sprtzd)this.cfr_renamed_1.elementAt(n7);
                n6 = n5;
            }
            return objectArray;
        }
        Object[] objectArray = new sprxte[this.cfr_renamed_1.size()];
        int n8 = n = 0;
        while (n8 != objectArray.length) {
            int n9 = n++;
            objectArray[n9] = (sprxte)this.cfr_renamed_1.elementAt(n9);
            n8 = n;
        }
        return objectArray;
    }

    public static spriie cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spriie) {
            return (spriie)arg0;
        }
        if (arg0 != null) {
            return new spriie(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}

