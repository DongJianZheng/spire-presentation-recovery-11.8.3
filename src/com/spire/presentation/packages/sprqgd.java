/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprel;
import com.spire.presentation.packages.sprhgd;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnk;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprquq;
import com.spire.presentation.packages.sprrmd;
import com.spire.presentation.packages.sprtsa;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprxed;
import java.io.IOException;

public class sprqgd
implements sprnk {
    private int cfr_renamed_1;
    private sprnk cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private sprtzd cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int cfr_renamed_2341(byte[] arg0, int arg1, int arg2) throws sprjkd, IllegalArgumentException {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(new sprije(this.cfr_renamed_4, sprume.cfr_renamed_3));
        sprlre3.cfr_renamed_49(new sprhse(true, 2, new sprlqe(sprtsa.cfr_renamed_453(this.cfr_renamed_1))));
        try {
            this.cfr_renamed_2.cfr_renamed_2342(new sprxed(this.cfr_renamed_3, new sprpse(sprlre2).cfr_renamed_104("DER")));
            return this.cfr_renamed_2.cfr_renamed_2341(arg0, arg1, arg2);
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprquq.cfr_renamed_9("iu}yp~<os;uuuouzpro~<px}&;")).append(iOException.getMessage()).toString());
        }
    }

    @Override
    public void cfr_renamed_2342(sprel arg0) {
        sprrmd sprrmd2 = (sprrmd)arg0;
        sprqgd sprqgd2 = this;
        sprrmd sprrmd3 = sprrmd2;
        this.cfr_renamed_4 = sprrmd3.cfr_renamed_593();
        sprqgd2.cfr_renamed_1 = sprrmd3.cfr_renamed_2398();
        sprqgd2.cfr_renamed_3 = sprrmd2.cfr_renamed_3383();
    }

    @Override
    public sprlc cfr_renamed_580() {
        return this.cfr_renamed_2.cfr_renamed_580();
    }

    /*
     * WARNING - void declaration
     */
    public sprqgd(sprlc sprlc2) {
        void arg0;
        sprqgd sprqgd2 = this;
        sprqgd2.cfr_renamed_2 = new sprhgd((sprlc)arg0);
    }
}

