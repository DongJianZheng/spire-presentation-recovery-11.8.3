/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcf;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprgem;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprhwl;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlpl;
import com.spire.presentation.packages.sprocn;
import com.spire.presentation.packages.sprram;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprtgm;
import com.spire.presentation.packages.sprujm;
import com.spire.presentation.packages.sprypl;
import com.spire.presentation.packages.sprzcf;
import com.spire.presentation.packages.sprznl;
import com.spire.presentation.packages.sprzxl;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Date;
import java.util.Enumeration;
import java.util.Locale;

public class sprdyl {
    private sprgem cfr_renamed_3;
    private sprram cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprdyl cfr_renamed_10854(sprlem arg0, boolean arg1, sprco arg2) throws sprznl {
        try {
            this.cfr_renamed_3 = sprzxl.cfr_renamed_10845(this.cfr_renamed_3, new sprrdm(arg0, arg1, arg2.cfr_renamed_119().cfr_renamed_104("DER")));
            return this;
        }
        catch (IOException iOException) {
            throw new sprznl(new StringBuilder().insert(0, sprzcf.cfr_renamed_9("\u0002R\u000f]\u000eGAV\u000fP\u000eW\u0004\u0013\u0004K\u0015V\u000f@\b\\\u000f\tA")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public sprdyl cfr_renamed_5283(sprrdm arg0) throws sprznl {
        sprdyl sprdyl2 = this;
        sprdyl2.cfr_renamed_3.cfr_renamed_5283(arg0);
        return sprdyl2;
    }

    private /* synthetic */ sprrdm cfr_renamed_10850(sprlem arg0) {
        return this.cfr_renamed_3.cfr_renamed_31().cfr_renamed_5024(arg0);
    }

    public sprdyl(sprlpl arg0, sprhwl arg1, BigInteger arg2, Date arg3, Date arg4, Locale arg5) {
        sprdyl sprdyl2 = this;
        sprdyl sprdyl3 = this;
        sprdyl2.cfr_renamed_4 = new sprram();
        sprdyl3.cfr_renamed_3 = new sprgem();
        sprdyl2.cfr_renamed_4.cfr_renamed_10861(arg0.cfr_renamed_4);
        sprdyl2.cfr_renamed_4.cfr_renamed_10862(sprtgm.cfr_renamed_23(arg1.cfr_renamed_4));
        sprdyl2.cfr_renamed_4.cfr_renamed_5001(new sprktm(arg2));
        sprdyl2.cfr_renamed_4.cfr_renamed_10863(new sprjfn(arg3, arg5));
        sprdyl2.cfr_renamed_4.cfr_renamed_10864(new sprjfn(arg4, arg5));
    }

    public sprdyl cfr_renamed_7370(sprlem arg0, sprco[] arg1) {
        sprdyl sprdyl2 = this;
        sprdyl2.cfr_renamed_4.cfr_renamed_10865(new sprujm(arg0, new sprocn(arg1)));
        return sprdyl2;
    }

    public sprdyl cfr_renamed_5013(sprlem arg0, boolean arg1, byte[] arg2) throws sprznl {
        sprdyl sprdyl2 = this;
        sprdyl2.cfr_renamed_3.cfr_renamed_5013(arg0, arg1, arg2);
        return sprdyl2;
    }

    public sprdyl cfr_renamed_10851(sprrdm arg0) throws sprznl {
        sprdyl sprdyl2 = this;
        sprdyl2.cfr_renamed_3 = sprzxl.cfr_renamed_10845(sprdyl2.cfr_renamed_3, arg0);
        return sprdyl2;
    }

    public sprdyl cfr_renamed_10844(sprlem arg0, boolean arg1, byte[] arg2) throws sprznl {
        sprdyl sprdyl2 = this;
        sprdyl2.cfr_renamed_3 = sprzxl.cfr_renamed_10845(sprdyl2.cfr_renamed_3, new sprrdm(arg0, arg1, arg2));
        return sprdyl2;
    }

    public void cfr_renamed_4223(boolean[] arg0) {
        this.cfr_renamed_4.cfr_renamed_4994(sprzxl.cfr_renamed_27(arg0));
    }

    public sprdyl cfr_renamed_10855(sprlem arg0) {
        sprdyl sprdyl2 = this;
        sprdyl2.cfr_renamed_3 = sprzxl.cfr_renamed_10856(sprdyl2.cfr_renamed_3, arg0);
        return sprdyl2;
    }

    public sprdyl cfr_renamed_4998(sprlem arg0, boolean arg1, sprco arg2) throws sprznl {
        sprdyl sprdyl2 = this;
        sprzxl.cfr_renamed_5280(sprdyl2.cfr_renamed_3, arg0, arg1, arg2);
        return sprdyl2;
    }

    public boolean cfr_renamed_10849(sprlem arg0) {
        return this.cfr_renamed_10850(arg0) != null;
    }

    public sprdyl(sprypl arg0) {
        Enumeration enumeration;
        int n;
        sprdyl sprdyl2 = this;
        sprdyl2.cfr_renamed_4 = new sprram();
        this.cfr_renamed_4.cfr_renamed_5001(new sprktm(arg0.cfr_renamed_114()));
        sprdyl2.cfr_renamed_4.cfr_renamed_10862(sprtgm.cfr_renamed_23(arg0.cfr_renamed_102().cfr_renamed_4));
        sprdyl2.cfr_renamed_4.cfr_renamed_10863(new sprjfn(arg0.cfr_renamed_0()));
        sprdyl2.cfr_renamed_4.cfr_renamed_10864(new sprjfn(arg0.cfr_renamed_86()));
        sprypl sprypl2 = arg0;
        sprdyl2.cfr_renamed_4.cfr_renamed_10861(sprypl2.cfr_renamed_93().cfr_renamed_4);
        boolean[] blArray = sprypl2.cfr_renamed_105();
        if (blArray != null) {
            this.cfr_renamed_4.cfr_renamed_4994(sprzxl.cfr_renamed_27(blArray));
        }
        sprujm[] sprujmArray = arg0.cfr_renamed_82();
        int n2 = n = 0;
        while (n2 != sprujmArray.length) {
            this.cfr_renamed_4.cfr_renamed_10865(sprujmArray[n++]);
            n2 = n;
        }
        this.cfr_renamed_3 = new sprgem();
        sprhgm sprhgm2 = arg0.cfr_renamed_98();
        Enumeration enumeration2 = enumeration = sprhgm2.cfr_renamed_99();
        while (enumeration2.hasMoreElements()) {
            this.cfr_renamed_3.cfr_renamed_5283(sprhgm2.cfr_renamed_5024((sprlem)enumeration.nextElement()));
            enumeration2 = enumeration;
        }
    }

    public sprypl cfr_renamed_7373(sprcf arg0) {
        sprdyl sprdyl2 = this;
        sprdyl2.cfr_renamed_4.cfr_renamed_4996(arg0.cfr_renamed_615());
        if (!sprdyl2.cfr_renamed_3.cfr_renamed_29()) {
            sprdyl sprdyl3 = this;
            sprdyl3.cfr_renamed_4.cfr_renamed_9837(sprdyl3.cfr_renamed_3.cfr_renamed_31());
        }
        return sprzxl.cfr_renamed_10866(arg0, this.cfr_renamed_4.cfr_renamed_4229());
    }

    public sprdyl cfr_renamed_7372(sprlem arg0, sprco arg1) {
        sprdyl sprdyl2 = this;
        sprdyl2.cfr_renamed_4.cfr_renamed_10865(new sprujm(arg0, new sprocn(arg1)));
        return sprdyl2;
    }

    public sprdyl(sprlpl arg0, sprhwl arg1, BigInteger arg2, Date arg3, Date arg4) {
        sprdyl sprdyl2 = this;
        sprdyl sprdyl3 = this;
        sprdyl2.cfr_renamed_4 = new sprram();
        sprdyl3.cfr_renamed_3 = new sprgem();
        sprdyl2.cfr_renamed_4.cfr_renamed_10861(arg0.cfr_renamed_4);
        sprdyl2.cfr_renamed_4.cfr_renamed_10862(sprtgm.cfr_renamed_23(arg1.cfr_renamed_4));
        sprdyl2.cfr_renamed_4.cfr_renamed_5001(new sprktm(arg2));
        sprdyl2.cfr_renamed_4.cfr_renamed_10863(new sprjfn(arg3));
        sprdyl2.cfr_renamed_4.cfr_renamed_10864(new sprjfn(arg4));
    }

    public sprrdm cfr_renamed_5024(sprlem arg0) {
        return this.cfr_renamed_10850(arg0);
    }
}

