/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprard;
import com.spire.presentation.packages.sprfud;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprotc;
import com.spire.presentation.packages.sprtkk;
import com.spire.presentation.packages.sprtxd;
import com.spire.presentation.packages.spruxc;
import com.spire.presentation.packages.sprvsr;
import java.io.IOException;

public class sprkad {
    private final sprtxd cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprfud cfr_renamed_2587(sprotc arg0) throws spruxc {
        try {
            byte[] byArray = arg0.cfr_renamed_480().cfr_renamed_119().cfr_renamed_104("DER");
            return this.cfr_renamed_4.cfr_renamed_611(new sprard(arg0.cfr_renamed_696(), byArray), true);
        }
        catch (sprlqd sprlqd2) {
            throw new spruxc(sprtkk.cfr_renamed_9(")Z\u001fY\u000e\u0015\u0004Z\u001e\u0015\u0019\\\r[Jq<v9\u0015\u0018P\u001b@\u000fF\u001e"), sprlqd2);
        }
        catch (IOException iOException) {
            throw new spruxc(sprvsr.cfr_renamed_9("&e\u0010f\u0001*\u000be\u0011*\u0000d\u0006e\u0001oEN3I6*\u0017o\u0014\u007f\u0000y\u0011"), iOException);
        }
    }

    public sprkad(sprtxd sprtxd2) {
        this.cfr_renamed_4 = sprtxd2;
    }
}

