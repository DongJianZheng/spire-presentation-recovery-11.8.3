/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.spreud;
import com.spire.presentation.packages.sprfee;
import com.spire.presentation.packages.sprlod;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprqa;
import com.spire.presentation.packages.sprqwd;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprude;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.spruzd;
import com.spire.presentation.packages.sprxbe;
import com.spire.presentation.packages.spryae;
import java.math.BigInteger;
import java.util.Date;
import java.util.Enumeration;
import java.util.Locale;

public class sprqyd {
    private sprfee cfr_renamed_3;
    private spryae cfr_renamed_4;

    public sprqyd cfr_renamed_73(BigInteger arg0, Date arg1, int arg2) {
        sprqyd sprqyd2 = this;
        sprqyd2.cfr_renamed_3.cfr_renamed_74(new sprooe(arg0), new spruzd(arg1), arg2);
        return sprqyd2;
    }

    public sprqyd(spruhe arg0, Date arg1) {
        sprqyd sprqyd2 = this;
        sprqyd sprqyd3 = this;
        sprqyd2.cfr_renamed_3 = new sprfee();
        sprqyd3.cfr_renamed_4 = new spryae();
        sprqyd2.cfr_renamed_3.cfr_renamed_4216(arg0);
        sprqyd2.cfr_renamed_3.cfr_renamed_62(new spruzd(arg1));
    }

    public sprqyd cfr_renamed_4219(BigInteger arg0, Date arg1, sprszd arg2) {
        sprqyd sprqyd2 = this;
        sprqyd2.cfr_renamed_3.cfr_renamed_77(new sprooe(arg0), new spruzd(arg1), arg2);
        return sprqyd2;
    }

    public sprqyd cfr_renamed_72(spruzd arg0) {
        sprqyd sprqyd2 = this;
        sprqyd2.cfr_renamed_3.cfr_renamed_72(arg0);
        return sprqyd2;
    }

    public sprqyd cfr_renamed_4124(spreud arg0) {
        sprxbe sprxbe2 = arg0.cfr_renamed_568().cfr_renamed_2134();
        if (sprxbe2 != null) {
            Enumeration enumeration;
            Enumeration enumeration2 = enumeration = sprxbe2.cfr_renamed_2135();
            while (enumeration2.hasMoreElements()) {
                this.cfr_renamed_3.cfr_renamed_70(sprbne.cfr_renamed_23(((spra)enumeration.nextElement()).cfr_renamed_119()));
                enumeration2 = enumeration;
            }
        }
        return this;
    }

    public sprqyd(spruhe arg0, Date arg1, Locale arg2) {
        sprqyd sprqyd2 = this;
        sprqyd sprqyd3 = this;
        sprqyd2.cfr_renamed_3 = new sprfee();
        sprqyd3.cfr_renamed_4 = new spryae();
        sprqyd2.cfr_renamed_3.cfr_renamed_4216(arg0);
        sprqyd2.cfr_renamed_3.cfr_renamed_62(new spruzd(arg1, arg2));
    }

    public sprqyd cfr_renamed_76(BigInteger arg0, Date arg1, sprude arg2) {
        sprqyd sprqyd2 = this;
        sprqyd2.cfr_renamed_3.cfr_renamed_77(new sprooe(arg0), new spruzd(arg1), sprszd.cfr_renamed_23(arg2));
        return sprqyd2;
    }

    public spreud cfr_renamed_1484(sprqa arg0) {
        sprqyd sprqyd2 = this;
        sprqyd2.cfr_renamed_3.cfr_renamed_53(arg0.cfr_renamed_615());
        if (!sprqyd2.cfr_renamed_4.cfr_renamed_29()) {
            sprqyd sprqyd3 = this;
            sprqyd3.cfr_renamed_3.cfr_renamed_2603(sprqyd3.cfr_renamed_4.cfr_renamed_31());
        }
        return sprlod.cfr_renamed_4220(arg0, this.cfr_renamed_3.cfr_renamed_67());
    }

    public sprqyd cfr_renamed_59(BigInteger arg0, Date arg1, int arg2, Date arg3) {
        sprqyd sprqyd2 = this;
        sprqyd2.cfr_renamed_3.cfr_renamed_60(new sprooe(arg0), new spruzd(arg1), arg2, new sprrpe(arg3));
        return sprqyd2;
    }

    public sprqyd cfr_renamed_6(sprtzd arg0, boolean arg1, spra arg2) throws sprqwd {
        sprqyd sprqyd2 = this;
        sprlod.cfr_renamed_571(sprqyd2.cfr_renamed_4, arg0, arg1, arg2);
        return sprqyd2;
    }

    /*
     * WARNING - void declaration
     */
    public sprqyd cfr_renamed_71(Date date) {
        void arg0;
        return this.cfr_renamed_72(new spruzd((Date)arg0));
    }

    public sprqyd(spruhe arg0, spruzd arg1) {
        sprqyd sprqyd2 = this;
        sprqyd sprqyd3 = this;
        sprqyd2.cfr_renamed_3 = new sprfee();
        sprqyd3.cfr_renamed_4 = new spryae();
        sprqyd2.cfr_renamed_3.cfr_renamed_4216(arg0);
        sprqyd2.cfr_renamed_3.cfr_renamed_62(arg1);
    }

    public sprqyd cfr_renamed_18(sprtzd arg0, boolean arg1, byte[] arg2) throws sprqwd {
        sprqyd sprqyd2 = this;
        sprqyd2.cfr_renamed_4.cfr_renamed_18(arg0, arg1, arg2);
        return sprqyd2;
    }

    /*
     * WARNING - void declaration
     */
    public sprqyd cfr_renamed_4221(Date date, Locale locale) {
        void arg1;
        void arg0;
        return this.cfr_renamed_72(new spruzd((Date)arg0, (Locale)arg1));
    }
}

