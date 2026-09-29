/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcf;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprffm;
import com.spire.presentation.packages.sprfgq;
import com.spire.presentation.packages.sprgem;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprkgs;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmgm;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprpxl;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrcm;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtfm;
import com.spire.presentation.packages.sprvhf;
import com.spire.presentation.packages.sprznl;
import com.spire.presentation.packages.sprzxl;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Date;
import java.util.Enumeration;
import java.util.Locale;

public class sprbnl {
    private sprgem cfr_renamed_3;
    private sprmgm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprbnl cfr_renamed_4221(Date date, Locale locale) {
        void arg1;
        void arg0;
        return this.cfr_renamed_5016(new sprrcm((Date)arg0, (Locale)arg1));
    }

    public sprbnl cfr_renamed_59(BigInteger arg0, Date arg1, int arg2, Date arg3) {
        sprbnl sprbnl2 = this;
        sprbnl2.cfr_renamed_4.cfr_renamed_5022(new sprktm(arg0), new sprrcm(arg1), arg2, new sprjfn(arg3));
        return sprbnl2;
    }

    public sprbnl cfr_renamed_5016(sprrcm arg0) {
        sprbnl sprbnl2 = this;
        sprbnl2.cfr_renamed_4.cfr_renamed_5016(arg0);
        return sprbnl2;
    }

    public sprbnl cfr_renamed_10844(sprlem arg0, boolean arg1, byte[] arg2) throws sprznl {
        sprbnl sprbnl2 = this;
        sprbnl2.cfr_renamed_3 = sprzxl.cfr_renamed_10845(sprbnl2.cfr_renamed_3, new sprrdm(arg0, arg1, arg2));
        return sprbnl2;
    }

    private static /* synthetic */ byte[] cfr_renamed_10848(sprcf arg0, sprqqe arg1) throws IOException {
        OutputStream outputStream;
        sprcf sprcf2 = arg0;
        OutputStream outputStream2 = outputStream = sprcf2.cfr_renamed_470();
        arg1.cfr_renamed_8489(outputStream2, "DER");
        outputStream2.close();
        return sprcf2.cfr_renamed_79();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprpxl cfr_renamed_10857(sprcf arg0, sprtfm arg1) {
        try {
            sprtfm sprtfm2 = arg1;
            return new sprpxl(sprbnl.cfr_renamed_10858(sprtfm2, arg0.cfr_renamed_615(), sprbnl.cfr_renamed_10848(arg0, sprtfm2)));
        }
        catch (IOException iOException) {
            throw sprvhf.cfr_renamed_5211(sprkgs.cfr_renamed_9("itd{ea*exzn`ip*vog~|l|it~p*fcrdt~`xp"), iOException);
        }
    }

    public sprbnl cfr_renamed_5013(sprlem arg0, boolean arg1, byte[] arg2) throws sprznl {
        sprbnl sprbnl2 = this;
        sprbnl2.cfr_renamed_3.cfr_renamed_5013(arg0, arg1, arg2);
        return sprbnl2;
    }

    public sprbnl cfr_renamed_5283(sprrdm arg0) throws sprznl {
        sprbnl sprbnl2 = this;
        sprbnl2.cfr_renamed_3.cfr_renamed_5283(arg0);
        return sprbnl2;
    }

    public sprbnl(sprnbm arg0, Date arg1) {
        sprbnl sprbnl2 = this;
        sprbnl sprbnl3 = this;
        sprbnl2.cfr_renamed_4 = new sprmgm();
        sprbnl3.cfr_renamed_3 = new sprgem();
        sprbnl2.cfr_renamed_4.cfr_renamed_10846(arg0);
        sprbnl2.cfr_renamed_4.cfr_renamed_5021(new sprrcm(arg1));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprpxl cfr_renamed_10852(sprcf arg0, boolean arg1, sprcf arg2) {
        this.cfr_renamed_4.cfr_renamed_4996(null);
        try {
            this.cfr_renamed_3.cfr_renamed_4998(sprrdm.cfr_renamed_132, arg1, arg2.cfr_renamed_615());
        }
        catch (IOException iOException) {
            throw sprvhf.cfr_renamed_5211(sprfgq.cfr_renamed_9("\u0015_\u0018P\u0019JV_\u0012ZV_\u001aJ%W\u0011P\u0017J\u0003L\u0013\u007f\u001aY\u0019L\u001fJ\u001eSV[\u000eJ\u0013P\u0005W\u0019P"), iOException);
        }
        this.cfr_renamed_4.cfr_renamed_9837(this.cfr_renamed_3.cfr_renamed_31());
        try {
            sprtfm sprtfm2;
            sprbnl sprbnl2 = this;
            sprbnl2.cfr_renamed_3.cfr_renamed_4998(sprrdm.cfr_renamed_112, arg1, new sprdye(sprbnl.cfr_renamed_10848(arg2, this.cfr_renamed_4.cfr_renamed_10859())));
            sprbnl2.cfr_renamed_4.cfr_renamed_4996(arg0.cfr_renamed_615());
            sprbnl2.cfr_renamed_4.cfr_renamed_9837(this.cfr_renamed_3.cfr_renamed_31());
            sprtfm sprtfm3 = sprtfm2 = sprbnl2.cfr_renamed_4.cfr_renamed_67();
            return new sprpxl(sprbnl.cfr_renamed_10858(sprtfm3, arg0.cfr_renamed_615(), sprbnl.cfr_renamed_10848(arg0, sprtfm3)));
        }
        catch (IOException iOException) {
            throw sprvhf.cfr_renamed_5213(sprkgs.cfr_renamed_9("itd{ea*exzn`ip*vog~|l|it~p*fcrdt~`xp"), iOException);
        }
    }

    public sprbnl cfr_renamed_10769(sprpxl arg0) {
        sprtfm sprtfm2 = arg0.cfr_renamed_568().cfr_renamed_2134();
        if (sprtfm2 != null) {
            Enumeration enumeration;
            Enumeration enumeration2 = enumeration = sprtfm2.cfr_renamed_2135();
            while (enumeration2.hasMoreElements()) {
                this.cfr_renamed_4.cfr_renamed_5020(sprszm.cfr_renamed_23(((sprco)enumeration.nextElement()).cfr_renamed_119()));
                enumeration2 = enumeration;
            }
        }
        return this;
    }

    public sprrdm cfr_renamed_5024(sprlem arg0) {
        return this.cfr_renamed_10850(arg0);
    }

    public sprpxl cfr_renamed_7373(sprcf arg0) {
        sprbnl sprbnl2 = this;
        sprbnl2.cfr_renamed_4.cfr_renamed_4996(arg0.cfr_renamed_615());
        if (!sprbnl2.cfr_renamed_3.cfr_renamed_29()) {
            sprbnl sprbnl3 = this;
            sprbnl3.cfr_renamed_4.cfr_renamed_9837(sprbnl3.cfr_renamed_3.cfr_renamed_31());
        }
        return sprbnl.cfr_renamed_10857(arg0, this.cfr_renamed_4.cfr_renamed_67());
    }

    private /* synthetic */ sprrdm cfr_renamed_10850(sprlem arg0) {
        return this.cfr_renamed_3.cfr_renamed_31().cfr_renamed_5024(arg0);
    }

    public sprbnl cfr_renamed_10860(BigInteger arg0, Date arg1, sprhgm arg2) {
        sprbnl sprbnl2 = this;
        sprbnl2.cfr_renamed_4.cfr_renamed_5019(new sprktm(arg0), new sprrcm(arg1), arg2);
        return sprbnl2;
    }

    public sprbnl cfr_renamed_73(BigInteger arg0, Date arg1, int arg2) {
        sprbnl sprbnl2 = this;
        sprbnl2.cfr_renamed_4.cfr_renamed_5015(new sprktm(arg0), new sprrcm(arg1), arg2);
        return sprbnl2;
    }

    public boolean cfr_renamed_10849(sprlem arg0) {
        return this.cfr_renamed_10850(arg0) != null;
    }

    /*
     * WARNING - void declaration
     */
    public sprbnl cfr_renamed_71(Date date) {
        void arg0;
        return this.cfr_renamed_5016(new sprrcm((Date)arg0));
    }

    public sprbnl cfr_renamed_10855(sprlem arg0) {
        sprbnl sprbnl2 = this;
        sprbnl2.cfr_renamed_3 = sprzxl.cfr_renamed_10856(sprbnl2.cfr_renamed_3, arg0);
        return sprbnl2;
    }

    private static /* synthetic */ sprffm cfr_renamed_10858(sprtfm arg0, sprddm arg1, byte[] arg2) {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm();
        sprrvm3.cfr_renamed_5004(arg0);
        sprrvm3.cfr_renamed_5004(arg1);
        sprrvm sprrvm4 = sprrvm2;
        sprrvm3.cfr_renamed_5004(new sprdye(arg2));
        return sprffm.cfr_renamed_23(new sprcen(sprrvm2));
    }

    public sprbnl cfr_renamed_10851(sprrdm arg0) throws sprznl {
        sprbnl sprbnl2 = this;
        sprbnl2.cfr_renamed_3 = sprzxl.cfr_renamed_10845(sprbnl2.cfr_renamed_3, arg0);
        return sprbnl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprbnl cfr_renamed_10854(sprlem arg0, boolean arg1, sprco arg2) throws sprznl {
        try {
            this.cfr_renamed_3 = sprzxl.cfr_renamed_10845(this.cfr_renamed_3, new sprrdm(arg0, arg1, arg2.cfr_renamed_119().cfr_renamed_104("DER")));
            return this;
        }
        catch (IOException iOException) {
            throw new sprznl(new StringBuilder().insert(0, sprfgq.cfr_renamed_9("]\u0017P\u0018Q\u0002\u001e\u0013P\u0015Q\u0012[V[\u000eJ\u0013P\u0005W\u0019PL\u001e")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public sprbnl(sprnbm arg0, sprrcm arg1) {
        sprbnl sprbnl2 = this;
        sprbnl sprbnl3 = this;
        sprbnl2.cfr_renamed_4 = new sprmgm();
        sprbnl3.cfr_renamed_3 = new sprgem();
        sprbnl2.cfr_renamed_4.cfr_renamed_10846(arg0);
        sprbnl2.cfr_renamed_4.cfr_renamed_5021(arg1);
    }

    public sprbnl cfr_renamed_4998(sprlem arg0, boolean arg1, sprco arg2) throws sprznl {
        sprbnl sprbnl2 = this;
        sprzxl.cfr_renamed_5280(sprbnl2.cfr_renamed_3, arg0, arg1, arg2);
        return sprbnl2;
    }

    public sprbnl(sprnbm arg0, Date arg1, Locale arg2) {
        sprbnl sprbnl2 = this;
        sprbnl sprbnl3 = this;
        sprbnl2.cfr_renamed_4 = new sprmgm();
        sprbnl3.cfr_renamed_3 = new sprgem();
        sprbnl2.cfr_renamed_4.cfr_renamed_10846(arg0);
        sprbnl2.cfr_renamed_4.cfr_renamed_5021(new sprrcm(arg1, arg2));
    }

    public sprbnl(sprpxl arg0) {
        sprbnl sprbnl2 = this;
        sprbnl2.cfr_renamed_4 = new sprmgm();
        sprpxl sprpxl2 = arg0;
        this.cfr_renamed_4.cfr_renamed_10846(sprpxl2.cfr_renamed_102());
        sprbnl2.cfr_renamed_4.cfr_renamed_5021(new sprrcm(arg0.cfr_renamed_2132()));
        Date date = sprpxl2.cfr_renamed_2133();
        if (date != null) {
            this.cfr_renamed_4.cfr_renamed_5016(new sprrcm(date));
        }
        this.cfr_renamed_10769(arg0);
        this.cfr_renamed_3 = new sprgem();
        sprhgm sprhgm2 = arg0.cfr_renamed_98();
        if (sprhgm2 != null) {
            Enumeration enumeration = sprhgm2.cfr_renamed_99();
            block0: while (true) {
                Enumeration enumeration2 = enumeration;
                while (enumeration2.hasMoreElements()) {
                    sprlem sprlem2 = (sprlem)enumeration.nextElement();
                    if (sprrdm.cfr_renamed_132.cfr_renamed_5078(sprlem2)) continue block0;
                    if (sprrdm.cfr_renamed_112.cfr_renamed_5078(sprlem2)) {
                        enumeration2 = enumeration;
                        continue;
                    }
                    this.cfr_renamed_3.cfr_renamed_5283(sprhgm2.cfr_renamed_5024(sprlem2));
                    enumeration2 = enumeration;
                }
                break;
            }
        }
    }
}

