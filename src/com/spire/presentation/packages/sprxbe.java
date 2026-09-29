/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprege;
import com.spire.presentation.packages.sprgpe;
import com.spire.presentation.packages.sprhhe;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprjyc;
import com.spire.presentation.packages.sprkie;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.spruzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;

public class sprxbe
extends sprkra {
    public spruhe cfr_renamed_119;
    public sprije cfr_renamed_91;
    public spruzd cfr_renamed_0;
    public sprooe cfr_renamed_1;
    public sprszd cfr_renamed_2;
    public sprbne cfr_renamed_3;
    public spruzd cfr_renamed_4;

    public sprszd cfr_renamed_98() {
        return this.cfr_renamed_2;
    }

    public spruzd cfr_renamed_2132() {
        return this.cfr_renamed_4;
    }

    public sprooe cfr_renamed_3() {
        return this.cfr_renamed_1;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_1 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_1);
        }
        sprlre sprlre3 = sprlre2;
        sprxbe sprxbe2 = this;
        sprlre2.cfr_renamed_49(this.cfr_renamed_91);
        sprlre3.cfr_renamed_49(sprxbe2.cfr_renamed_119);
        sprlre3.cfr_renamed_49(sprxbe2.cfr_renamed_4);
        if (this.cfr_renamed_0 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_0);
        }
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        }
        if (this.cfr_renamed_2 != null) {
            sprlre2.cfr_renamed_49(new sprhse(0, this.cfr_renamed_2));
        }
        return new sprpse(sprlre2);
    }

    public Enumeration cfr_renamed_2135() {
        if (this.cfr_renamed_3 == null) {
            return new sprkie(this, null);
        }
        sprxbe sprxbe2 = this;
        return new sprhhe(sprxbe2, sprxbe2.cfr_renamed_3.cfr_renamed_329());
    }

    public sprege[] cfr_renamed_4232() {
        int n;
        if (this.cfr_renamed_3 == null) {
            return new sprege[0];
        }
        sprege[] spregeArray = new sprege[this.cfr_renamed_3.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 < spregeArray.length) {
            int n3 = n++;
            spregeArray[n3] = sprege.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_85(n3));
            n2 = n;
        }
        return spregeArray;
    }

    public int cfr_renamed_569() {
        if (this.cfr_renamed_1 == null) {
            return 1;
        }
        return this.cfr_renamed_1.cfr_renamed_97().intValue() + 1;
    }

    /*
     * WARNING - void declaration
     */
    public sprxbe(sprbne sprbne2) {
        sprxbe sprxbe2;
        void arg0;
        if (sprbne2.cfr_renamed_84() < 3 || arg0.cfr_renamed_84() > 7) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprjyc.cfr_renamed_9("OYi\u0018~]|MhVn]-KdBh\u0002-")).append(arg0.cfr_renamed_84()).toString());
        }
        int n = 0;
        if (arg0.cfr_renamed_85(n) instanceof sprooe) {
            sprxbe2 = this;
            this.cfr_renamed_1 = sprooe.cfr_renamed_23(arg0.cfr_renamed_85(n));
            ++n;
        } else {
            sprxbe2 = this;
            this.cfr_renamed_1 = null;
        }
        sprxbe2.cfr_renamed_91 = sprije.cfr_renamed_23(arg0.cfr_renamed_85(n));
        sprxbe sprxbe3 = this;
        sprxbe3.cfr_renamed_119 = spruhe.cfr_renamed_23(arg0.cfr_renamed_85(++n));
        sprxbe3.cfr_renamed_4 = spruzd.cfr_renamed_23(arg0.cfr_renamed_85(++n));
        if (++n < arg0.cfr_renamed_84() && (arg0.cfr_renamed_85(n) instanceof sprgpe || arg0.cfr_renamed_85(n) instanceof sprrpe || arg0.cfr_renamed_85(n) instanceof spruzd)) {
            this.cfr_renamed_0 = spruzd.cfr_renamed_23(arg0.cfr_renamed_85(n));
            ++n;
        }
        if (n < arg0.cfr_renamed_84() && !(arg0.cfr_renamed_85(n) instanceof sprhse)) {
            this.cfr_renamed_3 = sprbne.cfr_renamed_23(arg0.cfr_renamed_85(n));
            ++n;
        }
        if (n < arg0.cfr_renamed_84() && arg0.cfr_renamed_85(n) instanceof sprhse) {
            this.cfr_renamed_2 = sprszd.cfr_renamed_23(sprbne.cfr_renamed_341((spryte)arg0.cfr_renamed_85(n), true));
        }
    }

    public static sprxbe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxbe) {
            return (sprxbe)arg0;
        }
        if (arg0 != null) {
            return new sprxbe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprije cfr_renamed_79() {
        return this.cfr_renamed_91;
    }

    public spruzd cfr_renamed_2133() {
        return this.cfr_renamed_0;
    }

    public spruhe cfr_renamed_102() {
        return this.cfr_renamed_119;
    }

    public static sprxbe cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprxbe.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }
}

