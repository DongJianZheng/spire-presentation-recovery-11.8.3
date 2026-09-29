/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprakg;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprffm;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprkam;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprllm;
import com.spire.presentation.packages.sprlpm;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpxl;
import com.spire.presentation.packages.sprtom;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprurm;

public class sprypg {
    public static final sprlem cfr_renamed_2 = sprdl.cfr_renamed_470;
    public static final sprlem cfr_renamed_3 = sprdl.cfr_renamed_91;
    private sprkam cfr_renamed_4;

    public sprkam cfr_renamed_568() {
        return this.cfr_renamed_4;
    }

    public sprurm[] cfr_renamed_82() {
        int n;
        spridn spridn2 = this.cfr_renamed_4.cfr_renamed_1461();
        if (spridn2 == null) {
            return null;
        }
        sprurm[] sprurmArray = new sprurm[spridn2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != spridn2.cfr_renamed_84()) {
            int n3 = n++;
            sprurmArray[n3] = sprurm.cfr_renamed_23(spridn2.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprurmArray;
    }

    public sprlem cfr_renamed_324() {
        return this.cfr_renamed_4.cfr_renamed_1457();
    }

    public sprypg(sprkam sprkam2) {
        this.cfr_renamed_4 = sprkam2;
    }

    public Object cfr_renamed_1458() {
        if (this.cfr_renamed_324().cfr_renamed_5078(sprdl.cfr_renamed_2541)) {
            return new sprakg(sprllm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_1458()));
        }
        if (this.cfr_renamed_324().cfr_renamed_5078(sprdl.cfr_renamed_593)) {
            sprtom sprtom2 = sprtom.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_1458());
            return new sprtpl(sprndm.cfr_renamed_23(sproug.cfr_renamed_23(sprtom2.cfr_renamed_1459()).cfr_renamed_186()));
        }
        if (this.cfr_renamed_324().cfr_renamed_5078(sprdl.cfr_renamed_1497)) {
            return sprcom.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_1458());
        }
        if (this.cfr_renamed_324().cfr_renamed_5078(sprdl.cfr_renamed_955)) {
            sprlpm sprlpm2 = sprlpm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_1458());
            return new sprpxl(sprffm.cfr_renamed_23(sproug.cfr_renamed_23(sprlpm2.cfr_renamed_7361()).cfr_renamed_186()));
        }
        return this.cfr_renamed_4.cfr_renamed_1458();
    }
}

