/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprhql;
import com.spire.presentation.packages.sprjlp;
import com.spire.presentation.packages.sprlod;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprphe;
import com.spire.presentation.packages.sprqa;
import com.spire.presentation.packages.sprqwd;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.spruzd;
import com.spire.presentation.packages.spryae;
import java.math.BigInteger;
import java.util.Date;
import java.util.Locale;

public class sprryd {
    private sprphe cfr_renamed_3;
    private spryae cfr_renamed_4;

    public sprcyd cfr_renamed_1484(sprqa arg0) {
        sprryd sprryd2 = this;
        sprryd2.cfr_renamed_3.cfr_renamed_53(arg0.cfr_renamed_615());
        if (!sprryd2.cfr_renamed_4.cfr_renamed_29()) {
            sprryd sprryd3 = this;
            sprryd3.cfr_renamed_3.cfr_renamed_2603(sprryd3.cfr_renamed_4.cfr_renamed_31());
        }
        return sprlod.cfr_renamed_4215(arg0, this.cfr_renamed_3.cfr_renamed_32());
    }

    public sprryd(spruhe arg0, BigInteger arg1, Date arg2, Date arg3, spruhe arg4, sprdce arg5) {
        this(arg0, arg1, new spruzd(arg2), new spruzd(arg3), arg4, arg5);
    }

    public sprryd cfr_renamed_18(sprtzd arg0, boolean arg1, byte[] arg2) throws sprqwd {
        sprryd sprryd2 = this;
        sprryd2.cfr_renamed_4.cfr_renamed_18(arg0, arg1, arg2);
        return sprryd2;
    }

    public sprryd cfr_renamed_55(boolean[] arg0) {
        sprryd sprryd2 = this;
        sprryd2.cfr_renamed_3.cfr_renamed_56(sprlod.cfr_renamed_27(arg0));
        return sprryd2;
    }

    public sprryd(spruhe arg0, BigInteger arg1, spruzd arg2, spruzd arg3, spruhe arg4, sprdce arg5) {
        sprryd sprryd2 = this;
        sprryd2.cfr_renamed_3 = new sprphe();
        this.cfr_renamed_3.cfr_renamed_11(new sprooe(arg1));
        sprryd2.cfr_renamed_3.cfr_renamed_4216(arg0);
        sprryd2.cfr_renamed_3.cfr_renamed_46(arg2);
        sprryd2.cfr_renamed_3.cfr_renamed_13(arg3);
        sprryd2.cfr_renamed_3.cfr_renamed_4217(arg4);
        sprryd2.cfr_renamed_3.cfr_renamed_22(arg5);
        sprryd2.cfr_renamed_4 = new spryae();
    }

    public sprryd cfr_renamed_4218(sprtzd arg0, boolean arg1, sprcyd arg2) {
        sprtie sprtie2 = arg2.cfr_renamed_568().cfr_renamed_2151().cfr_renamed_98().cfr_renamed_100(arg0);
        if (sprtie2 == null) {
            throw new NullPointerException(new StringBuilder().insert(0, sprhql.cfr_renamed_9("`_qBkTlHk\u0007")).append(arg0).append(sprjlp.cfr_renamed_9("w08*w.%;$;9*")).toString());
        }
        sprryd sprryd2 = this;
        sprryd2.cfr_renamed_4.cfr_renamed_18(arg0, arg1, sprtie2.cfr_renamed_103().cfr_renamed_186());
        return sprryd2;
    }

    public sprryd cfr_renamed_39(boolean[] arg0) {
        sprryd sprryd2 = this;
        sprryd2.cfr_renamed_3.cfr_renamed_40(sprlod.cfr_renamed_27(arg0));
        return sprryd2;
    }

    public sprryd cfr_renamed_6(sprtzd arg0, boolean arg1, spra arg2) throws sprqwd {
        sprryd sprryd2 = this;
        sprlod.cfr_renamed_571(sprryd2.cfr_renamed_4, arg0, arg1, arg2);
        return sprryd2;
    }

    public sprryd(spruhe arg0, BigInteger arg1, Date arg2, Date arg3, Locale arg4, spruhe arg5, sprdce arg6) {
        this(arg0, arg1, new spruzd(arg2, arg4), new spruzd(arg3, arg4), arg5, arg6);
    }
}

