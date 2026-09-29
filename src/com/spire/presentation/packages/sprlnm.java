/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprffm;
import com.spire.presentation.packages.sprhmm;
import com.spire.presentation.packages.sprjsm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.util.Enumeration;

public class sprlnm
extends sprqqe {
    private final sprszm cfr_renamed_2;
    private sprszm cfr_renamed_3;
    private sprszm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprlnm sprlnm2 = this;
        sprrvm2.cfr_renamed_5004(sprlnm2.cfr_renamed_2);
        sprlnm sprlnm3 = this;
        sprlnm3.cfr_renamed_11316(sprrvm2, 0, sprlnm3.cfr_renamed_3);
        sprlnm2.cfr_renamed_11316(sprrvm2, 1, this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }

    public sprhmm[] cfr_renamed_648() {
        int n;
        sprhmm[] sprhmmArray = new sprhmm[this.cfr_renamed_2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprhmmArray.length) {
            int n3 = n++;
            sprhmmArray[n3] = sprhmm.cfr_renamed_23(this.cfr_renamed_2.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprhmmArray;
    }

    private /* synthetic */ sprlnm(sprszm sprszm2) {
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        this.cfr_renamed_2 = sprszm.cfr_renamed_23(enumeration.nextElement());
        while (enumeration.hasMoreElements()) {
            sprnvm sprnvm2 = sprnvm.cfr_renamed_23(enumeration.nextElement());
            if (sprnvm2.cfr_renamed_312() == 0) {
                this.cfr_renamed_3 = sprszm.cfr_renamed_5085(sprnvm2, true);
                continue;
            }
            this.cfr_renamed_4 = sprszm.cfr_renamed_5085(sprnvm2, true);
        }
    }

    private /* synthetic */ void cfr_renamed_11316(sprrvm arg0, int arg1, sprco arg2) {
        if (arg2 != null) {
            arg0.cfr_renamed_5004(new sprycn(true, arg1, arg2));
        }
    }

    public sprjsm[] cfr_renamed_4848() {
        int n;
        if (this.cfr_renamed_3 == null) {
            return null;
        }
        sprjsm[] sprjsmArray = new sprjsm[this.cfr_renamed_3.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprjsmArray.length) {
            int n3 = n++;
            sprjsmArray[n3] = sprjsm.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprjsmArray;
    }

    public static sprlnm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprlnm) {
            return (sprlnm)arg0;
        }
        if (arg0 != null) {
            return new sprlnm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprffm[] cfr_renamed_4145() {
        int n;
        if (this.cfr_renamed_4 == null) {
            return null;
        }
        sprffm[] sprffmArray = new sprffm[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprffmArray.length) {
            int n3 = n++;
            sprffmArray[n3] = sprffm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprffmArray;
    }
}

