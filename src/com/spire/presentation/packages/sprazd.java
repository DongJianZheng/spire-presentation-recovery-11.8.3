/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprbpd;
import com.spire.presentation.packages.sprch;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprei;
import com.spire.presentation.packages.sprgi;
import com.spire.presentation.packages.sprgne;
import com.spire.presentation.packages.sprgwd;
import com.spire.presentation.packages.sprhre;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprixd;
import com.spire.presentation.packages.sprjxd;
import com.spire.presentation.packages.sprlh;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprnre;
import com.spire.presentation.packages.sprrvca;
import com.spire.presentation.packages.sprsxy;
import com.spire.presentation.packages.sprurd;
import com.spire.presentation.packages.spruve;
import com.spire.presentation.packages.sprvqe;
import com.spire.presentation.packages.sprvre;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.sprype;
import java.io.IOException;
import java.util.List;

public class sprazd
extends sprurd {
    private sprxue cfr_renamed_3;
    private sprype cfr_renamed_4;

    private /* synthetic */ sprdce cfr_renamed_4021(sprije arg0, spruve arg1) throws sprlqd, IOException {
        sprazd sprazd2;
        sprbpd sprbpd2;
        sprvqe sprvqe2 = arg1.cfr_renamed_4022();
        if (sprvqe2 != null) {
            return this.cfr_renamed_4023(arg0, sprvqe2);
        }
        sprvre sprvre2 = arg1.cfr_renamed_4024();
        if (sprvre2 != null) {
            sprbpd2 = new sprbpd(sprvre2.cfr_renamed_313(), sprvre2.cfr_renamed_114().cfr_renamed_97());
            sprazd2 = this;
        } else {
            sprrvca sprrvca2 = arg1.cfr_renamed_3955();
            sprbpd2 = new sprbpd(sprrvca2.cfr_renamed_327());
            sprazd2 = this;
        }
        return sprazd2.cfr_renamed_4025(sprbpd2);
    }

    public static void cfr_renamed_4026(List arg0, sprype arg1, sprije arg2, sprch arg3, sprgi arg4) {
        int n;
        sprbne sprbne2 = arg1.cfr_renamed_4027();
        int n2 = n = 0;
        while (n2 < sprbne2.cfr_renamed_84()) {
            List list;
            sprgwd sprgwd2;
            sprnre sprnre2 = sprnre.cfr_renamed_23(sprbne2.cfr_renamed_85(n));
            sprhre sprhre2 = sprnre2.cfr_renamed_4028();
            sprvre sprvre2 = sprhre2.cfr_renamed_4024();
            if (sprvre2 != null) {
                sprgwd2 = new sprgwd(sprvre2.cfr_renamed_313(), sprvre2.cfr_renamed_114().cfr_renamed_97());
                list = arg0;
            } else {
                sprgne sprgne2 = sprhre2.cfr_renamed_4029();
                sprgwd2 = new sprgwd(sprgne2.cfr_renamed_3955().cfr_renamed_186());
                list = arg0;
            }
            list.add(new sprazd(arg1, sprgwd2, sprnre2.cfr_renamed_4010(), arg2, arg3, arg4));
            n2 = ++n;
        }
    }

    private /* synthetic */ sprdce cfr_renamed_4025(sprbpd arg0) throws sprlqd {
        throw new sprlqd(sprsxy.cfr_renamed_9("dP\nL_OZPXK\nYEM\n\u0018EMCXCQKKEM\r\u001fKL\nvYL_ZX~D[yZXVKSdJG]OM\nPX\u001fyJHUO\\^tOFc[OQ^VLVOM"));
    }

    @Override
    public sprixd cfr_renamed_3999(sprlh arg0) throws sprlqd, IOException {
        sprije sprije2 = ((sprei)arg0).cfr_renamed_3241();
        sprazd sprazd2 = this;
        sprazd sprazd3 = this;
        return ((sprei)arg0).cfr_renamed_4030((sprije)((Object)sprazd2.cfr_renamed_3), sprazd2.cfr_renamed_1, sprazd3.cfr_renamed_4021(sprije2, sprazd3.cfr_renamed_4.cfr_renamed_4031()), this.cfr_renamed_4.cfr_renamed_4032(), this.cfr_renamed_3.cfr_renamed_186());
    }

    /*
     * WARNING - void declaration
     */
    public sprazd(sprype sprype2, sprjxd sprjxd2, sprxue sprxue2, sprije sprije2, sprch sprch2, sprgi sprgi2) {
        void arg1;
        void arg5;
        void arg4;
        void arg3;
        void arg0;
        sprazd sprazd2 = this;
        super(arg0.cfr_renamed_4000(), (sprije)arg3, (sprch)arg4, (sprgi)arg5);
        this.cfr_renamed_4 = arg0;
        sprazd2.cfr_renamed_0 = arg1;
        sprazd2.cfr_renamed_3 = sprxue2;
    }

    private /* synthetic */ sprdce cfr_renamed_4023(sprije arg0, sprvqe arg1) {
        return new sprdce(arg0, arg1.cfr_renamed_1157().cfr_renamed_81());
    }
}

