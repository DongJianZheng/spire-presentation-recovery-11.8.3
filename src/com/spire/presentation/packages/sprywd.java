/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprfke;
import com.spire.presentation.packages.sprlod;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprqa;
import com.spire.presentation.packages.sprsly;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.spruzd;
import com.spire.presentation.packages.sprywz;
import java.math.BigInteger;
import java.util.Date;
import java.util.Locale;

public class sprywd {
    private sprfke cfr_renamed_4;

    public sprywd(spruhe arg0, BigInteger arg1, Date arg2, Date arg3, Locale arg4, spruhe arg5, sprdce arg6) {
        this(arg0, arg1, new spruzd(arg2, arg4), new spruzd(arg3, arg4), arg5, arg6);
    }

    public sprcyd cfr_renamed_1484(sprqa arg0) {
        sprywd sprywd2 = this;
        sprqa sprqa2 = arg0;
        sprywd2.cfr_renamed_4.cfr_renamed_53(sprqa2.cfr_renamed_615());
        return sprlod.cfr_renamed_4215(sprqa2, sprywd2.cfr_renamed_4.cfr_renamed_32());
    }

    public sprywd(spruhe arg0, BigInteger arg1, Date arg2, Date arg3, spruhe arg4, sprdce arg5) {
        this(arg0, arg1, new spruzd(arg2), new spruzd(arg3), arg4, arg5);
    }

    /*
     * WARNING - void declaration
     */
    public sprywd(spruhe spruhe2, BigInteger bigInteger, spruzd spruzd2, spruzd spruzd3, spruhe spruhe3, sprdce sprdce2) {
        void arg4;
        void arg3;
        void arg2;
        void arg0;
        void arg1;
        void arg5;
        if (spruhe2 == null) {
            throw new IllegalArgumentException(sprywz.cfr_renamed_9("-L7J!MdR1L0\u001f*P0\u001f&ZdQ1S("));
        }
        if (arg5 == null) {
            throw new IllegalArgumentException(sprsly.cfr_renamed_9("\u0007\u0007\u0015\u001e\u001e\u0011<\u0017\u000e;\u0019\u0014\u0018R\u001a\u0007\u0004\u0006W\u001c\u0018\u0006W\u0010\u0012R\u0019\u0007\u001b\u001e"));
        }
        sprywd sprywd2 = this;
        sprywd2.cfr_renamed_4 = new sprfke();
        sprywd2.cfr_renamed_4.cfr_renamed_11(new sprooe((BigInteger)arg1));
        sprywd2.cfr_renamed_4.cfr_renamed_4216((spruhe)arg0);
        sprywd2.cfr_renamed_4.cfr_renamed_46((spruzd)arg2);
        sprywd2.cfr_renamed_4.cfr_renamed_13((spruzd)arg3);
        sprywd2.cfr_renamed_4.cfr_renamed_4217((spruhe)arg4);
        sprywd2.cfr_renamed_4.cfr_renamed_22((sprdce)arg5);
    }
}

