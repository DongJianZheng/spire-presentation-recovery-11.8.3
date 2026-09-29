/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprcwe;
import com.spire.presentation.packages.sprgsd;
import com.spire.presentation.packages.sprjee;
import com.spire.presentation.packages.sprlod;
import com.spire.presentation.packages.sprmsd;
import com.spire.presentation.packages.sproee;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sproqd;
import com.spire.presentation.packages.sprqa;
import com.spire.presentation.packages.sprqwd;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprxde;
import com.spire.presentation.packages.spryae;
import java.math.BigInteger;
import java.util.Date;
import java.util.Locale;

public class sprgrd {
    private spryae cfr_renamed_3;
    private sprjee cfr_renamed_4;

    public sprgrd cfr_renamed_18(sprtzd arg0, boolean arg1, byte[] arg2) throws sprqwd {
        sprgrd sprgrd2 = this;
        sprgrd2.cfr_renamed_3.cfr_renamed_18(arg0, arg1, arg2);
        return sprgrd2;
    }

    public sprgrd cfr_renamed_1481(sprtzd arg0, spra arg1) {
        sprgrd sprgrd2 = this;
        sprgrd2.cfr_renamed_4.cfr_renamed_4222(new sprxde(arg0, new sprcwe(arg1)));
        return sprgrd2;
    }

    public void cfr_renamed_4223(boolean[] arg0) {
        this.cfr_renamed_4.cfr_renamed_40(sprlod.cfr_renamed_27(arg0));
    }

    public sprgrd cfr_renamed_1482(sprtzd arg0, spra[] arg1) {
        sprgrd sprgrd2 = this;
        sprgrd2.cfr_renamed_4.cfr_renamed_4222(new sprxde(arg0, new sprcwe(arg1)));
        return sprgrd2;
    }

    public sprgrd(sprgsd arg0, sprmsd arg1, BigInteger arg2, Date arg3, Date arg4, Locale arg5) {
        sprgrd sprgrd2 = this;
        sprgrd sprgrd3 = this;
        sprgrd2.cfr_renamed_4 = new sprjee();
        sprgrd3.cfr_renamed_3 = new spryae();
        sprgrd2.cfr_renamed_4.cfr_renamed_4224(arg0.cfr_renamed_3);
        sprgrd2.cfr_renamed_4.cfr_renamed_4225(sproee.cfr_renamed_23(arg1.cfr_renamed_4));
        sprgrd2.cfr_renamed_4.cfr_renamed_11(new sprooe(arg2));
        sprgrd2.cfr_renamed_4.cfr_renamed_4226(new sprrpe(arg3, arg5));
        sprgrd2.cfr_renamed_4.cfr_renamed_4227(new sprrpe(arg4, arg5));
    }

    public sproqd cfr_renamed_1484(sprqa arg0) {
        sprgrd sprgrd2 = this;
        sprgrd2.cfr_renamed_4.cfr_renamed_53(arg0.cfr_renamed_615());
        if (!sprgrd2.cfr_renamed_3.cfr_renamed_29()) {
            sprgrd sprgrd3 = this;
            sprgrd3.cfr_renamed_4.cfr_renamed_2603(sprgrd3.cfr_renamed_3.cfr_renamed_31());
        }
        return sprlod.cfr_renamed_4228(arg0, this.cfr_renamed_4.cfr_renamed_4229());
    }

    public sprgrd(sprgsd arg0, sprmsd arg1, BigInteger arg2, Date arg3, Date arg4) {
        sprgrd sprgrd2 = this;
        sprgrd sprgrd3 = this;
        sprgrd2.cfr_renamed_4 = new sprjee();
        sprgrd3.cfr_renamed_3 = new spryae();
        sprgrd2.cfr_renamed_4.cfr_renamed_4224(arg0.cfr_renamed_3);
        sprgrd2.cfr_renamed_4.cfr_renamed_4225(sproee.cfr_renamed_23(arg1.cfr_renamed_4));
        sprgrd2.cfr_renamed_4.cfr_renamed_11(new sprooe(arg2));
        sprgrd2.cfr_renamed_4.cfr_renamed_4226(new sprrpe(arg3));
        sprgrd2.cfr_renamed_4.cfr_renamed_4227(new sprrpe(arg4));
    }

    public sprgrd cfr_renamed_6(sprtzd arg0, boolean arg1, spra arg2) throws sprqwd {
        sprgrd sprgrd2 = this;
        sprlod.cfr_renamed_571(sprgrd2.cfr_renamed_3, arg0, arg1, arg2);
        return sprgrd2;
    }
}

