/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcf;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprdzl;
import com.spire.presentation.packages.sprgem;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmdj;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprpgm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrcm;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprunfa;
import com.spire.presentation.packages.sprvhf;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprznl;
import com.spire.presentation.packages.sprzxl;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Date;
import java.util.Enumeration;
import java.util.Locale;

public class sprstl {
    private sprgem cfr_renamed_3;
    private sprpgm cfr_renamed_4;

    public sprstl cfr_renamed_10842(sprlem arg0, boolean arg1, sprtpl arg2) {
        sprrdm sprrdm2 = arg2.cfr_renamed_568().cfr_renamed_2151().cfr_renamed_98().cfr_renamed_5024(arg0);
        if (sprrdm2 == null) {
            throw new NullPointerException(new StringBuilder().insert(0, sprmdj.cfr_renamed_9("\t\u0018\u0018\u0005\u0002\u0013\u0005\u000f\u0002@")).append(arg0).append(sprunfa.cfr_renamed_9("\u0014\n[\u0010\u0014\u0014F\u0001G\u0001Z\u0010")).toString());
        }
        sprstl sprstl2 = this;
        sprstl2.cfr_renamed_3.cfr_renamed_5013(arg0, arg1, sprrdm2.cfr_renamed_103().cfr_renamed_186());
        return sprstl2;
    }

    private static /* synthetic */ sprndm cfr_renamed_10843(sprdzl arg0, sprddm arg1, byte[] arg2) {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm();
        sprrvm3.cfr_renamed_5004(arg0);
        sprrvm3.cfr_renamed_5004(arg1);
        sprrvm sprrvm4 = sprrvm2;
        sprrvm3.cfr_renamed_5004(new sprdye(arg2));
        return sprndm.cfr_renamed_23(new sprcen(sprrvm2));
    }

    public static sprdye cfr_renamed_27(boolean[] arg0) {
        int n;
        byte[] byArray = new byte[(arg0.length + 7) / 8];
        int n2 = n = 0;
        while (n2 != arg0.length) {
            int n3 = n / 8;
            byArray[n3] = (byte)(byArray[n3] | (arg0[n] ? 1 << 7 - n % 8 : 0));
            n2 = ++n;
        }
        n = arg0.length % 8;
        if (n == 0) {
            return new sprdye(byArray);
        }
        return new sprdye(byArray, 8 - n);
    }

    public sprstl cfr_renamed_10844(sprlem arg0, boolean arg1, byte[] arg2) throws sprznl {
        sprstl sprstl2 = this;
        sprstl2.cfr_renamed_3 = sprzxl.cfr_renamed_10845(sprstl2.cfr_renamed_3, new sprrdm(arg0, arg1, arg2));
        return sprstl2;
    }

    public sprstl cfr_renamed_55(boolean[] arg0) {
        sprstl sprstl2 = this;
        sprstl2.cfr_renamed_4.cfr_renamed_5002(sprstl.cfr_renamed_27(arg0));
        return sprstl2;
    }

    public sprstl cfr_renamed_5013(sprlem arg0, boolean arg1, byte[] arg2) throws sprznl {
        sprstl sprstl2 = this;
        sprstl2.cfr_renamed_3.cfr_renamed_5013(arg0, arg1, arg2);
        return sprstl2;
    }

    public sprstl(sprnbm arg0, BigInteger arg1, Date arg2, Date arg3, sprnbm arg4, sprvhm arg5) {
        this(arg0, arg1, new sprrcm(arg2), new sprrcm(arg3), arg4, arg5);
    }

    public sprstl(sprnbm arg0, BigInteger arg1, sprrcm arg2, sprrcm arg3, sprnbm arg4, sprvhm arg5) {
        sprstl sprstl2 = this;
        sprstl2.cfr_renamed_4 = new sprpgm();
        this.cfr_renamed_4.cfr_renamed_5001(new sprktm(arg1));
        sprstl2.cfr_renamed_4.cfr_renamed_10846(arg0);
        sprstl2.cfr_renamed_4.cfr_renamed_4999(arg2);
        sprstl2.cfr_renamed_4.cfr_renamed_5005(arg3);
        sprstl2.cfr_renamed_4.cfr_renamed_10847(arg4);
        sprstl2.cfr_renamed_4.cfr_renamed_5006(arg5);
        sprstl2.cfr_renamed_3 = new sprgem();
    }

    private static /* synthetic */ byte[] cfr_renamed_10848(sprcf arg0, sprqqe arg1) throws IOException {
        OutputStream outputStream;
        sprcf sprcf2 = arg0;
        OutputStream outputStream2 = outputStream = sprcf2.cfr_renamed_470();
        arg1.cfr_renamed_8489(outputStream2, "DER");
        outputStream2.close();
        return sprcf2.cfr_renamed_79();
    }

    public boolean cfr_renamed_10849(sprlem arg0) {
        return this.cfr_renamed_10850(arg0) != null;
    }

    public sprstl cfr_renamed_10851(sprrdm arg0) throws sprznl {
        sprstl sprstl2 = this;
        sprstl2.cfr_renamed_3 = sprzxl.cfr_renamed_10845(sprstl2.cfr_renamed_3, arg0);
        return sprstl2;
    }

    public sprstl(sprnbm arg0, BigInteger arg1, Date arg2, Date arg3, Locale arg4, sprnbm arg5, sprvhm arg6) {
        this(arg0, arg1, new sprrcm(arg2, arg4), new sprrcm(arg3, arg4), arg5, arg6);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprtpl cfr_renamed_10852(sprcf arg0, boolean arg1, sprcf arg2) {
        this.cfr_renamed_4.cfr_renamed_4996(null);
        try {
            this.cfr_renamed_3.cfr_renamed_4998(sprrdm.cfr_renamed_132, arg1, arg2.cfr_renamed_615());
        }
        catch (IOException iOException) {
            throw sprvhf.cfr_renamed_5211(sprmdj.cfr_renamed_9("\u000f\u0001\u0002\u000e\u0003\u0014L\u0001\b\u0004L\u0001\u0000\u0014?\t\u000b\u000e\r\u0014\u0019\u0012\t!\u0000\u0007\u0003\u0012\u0005\u0014\u0004\rL\u0005\u0014\u0014\t\u000e\u001f\t\u0003\u000e"), iOException);
        }
        this.cfr_renamed_4.cfr_renamed_9837(this.cfr_renamed_3.cfr_renamed_31());
        try {
            sprdzl sprdzl2;
            sprstl sprstl2 = this;
            sprstl2.cfr_renamed_3.cfr_renamed_4998(sprrdm.cfr_renamed_112, arg1, new sprdye(sprstl.cfr_renamed_10848(arg2, this.cfr_renamed_4.cfr_renamed_10853())));
            sprstl2.cfr_renamed_4.cfr_renamed_4996(arg0.cfr_renamed_615());
            sprstl2.cfr_renamed_4.cfr_renamed_9837(this.cfr_renamed_3.cfr_renamed_31());
            sprdzl sprdzl3 = sprdzl2 = sprstl2.cfr_renamed_4.cfr_renamed_32();
            return new sprtpl(sprstl.cfr_renamed_10843(sprdzl3, arg0.cfr_renamed_615(), sprstl.cfr_renamed_10848(arg0, sprdzl3)));
        }
        catch (IOException iOException) {
            throw sprvhf.cfr_renamed_5213(sprunfa.cfr_renamed_9("W\u0005Z\n[\u0010\u0014\u0014F\u000bP\u0011W\u0001\u0014\u0007Q\u0016@\rR\rW\u0005@\u0001\u0014\u0017]\u0003Z\u0005@\u0011F\u0001"), iOException);
        }
    }

    private /* synthetic */ sprrdm cfr_renamed_10850(sprlem arg0) {
        return this.cfr_renamed_3.cfr_renamed_31().cfr_renamed_5024(arg0);
    }

    public sprstl cfr_renamed_5283(sprrdm arg0) throws sprznl {
        sprstl sprstl2 = this;
        sprstl2.cfr_renamed_3.cfr_renamed_5283(arg0);
        return sprstl2;
    }

    public sprstl(sprtpl arg0) {
        sprstl sprstl2 = this;
        sprstl2.cfr_renamed_4 = new sprpgm();
        this.cfr_renamed_4.cfr_renamed_5001(new sprktm(arg0.cfr_renamed_114()));
        sprstl2.cfr_renamed_4.cfr_renamed_10846(arg0.cfr_renamed_102());
        sprstl2.cfr_renamed_4.cfr_renamed_4999(new sprrcm(arg0.cfr_renamed_0()));
        sprstl2.cfr_renamed_4.cfr_renamed_5005(new sprrcm(arg0.cfr_renamed_86()));
        sprstl2.cfr_renamed_4.cfr_renamed_10847(arg0.cfr_renamed_1485());
        sprtpl sprtpl2 = arg0;
        sprstl2.cfr_renamed_4.cfr_renamed_5006(sprtpl2.cfr_renamed_1489());
        sprstl2.cfr_renamed_3 = new sprgem();
        sprhgm sprhgm2 = sprtpl2.cfr_renamed_98();
        Enumeration enumeration = sprhgm2.cfr_renamed_99();
        block0: while (true) {
            Enumeration enumeration2 = enumeration;
            while (enumeration2.hasMoreElements()) {
                sprlem sprlem2 = (sprlem)enumeration.nextElement();
                if (sprrdm.cfr_renamed_287.cfr_renamed_5078(sprlem2) || sprrdm.cfr_renamed_132.cfr_renamed_5078(sprlem2)) continue block0;
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprstl cfr_renamed_4998(sprlem arg0, boolean arg1, sprco arg2) throws sprznl {
        try {
            this.cfr_renamed_3.cfr_renamed_4998(arg0, arg1, arg2);
            return this;
        }
        catch (IOException iOException) {
            throw new sprznl(new StringBuilder().insert(0, sprmdj.cfr_renamed_9("\u0003\r\u000e\u0002\u000f\u0018@\t\u000e\u000f\u000f\b\u0005L\u0005\u0014\u0014\t\u000e\u001f\t\u0003\u000eV@")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprstl cfr_renamed_10854(sprlem arg0, boolean arg1, sprco arg2) throws sprznl {
        try {
            this.cfr_renamed_3 = sprzxl.cfr_renamed_10845(this.cfr_renamed_3, new sprrdm(arg0, arg1, arg2.cfr_renamed_119().cfr_renamed_104("DER")));
            return this;
        }
        catch (IOException iOException) {
            throw new sprznl(new StringBuilder().insert(0, sprunfa.cfr_renamed_9("\u0007U\nZ\u000b@DQ\nW\u000bP\u0001\u0014\u0001L\u0010Q\nG\r[\n\u000eD")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public sprstl cfr_renamed_10855(sprlem arg0) {
        sprstl sprstl2 = this;
        sprstl2.cfr_renamed_3 = sprzxl.cfr_renamed_10856(sprstl2.cfr_renamed_3, arg0);
        return sprstl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprtpl cfr_renamed_7373(sprcf arg0) {
        sprstl sprstl2 = this;
        sprstl2.cfr_renamed_4.cfr_renamed_4996(arg0.cfr_renamed_615());
        if (!sprstl2.cfr_renamed_3.cfr_renamed_29()) {
            sprstl sprstl3 = this;
            sprstl3.cfr_renamed_4.cfr_renamed_9837(sprstl3.cfr_renamed_3.cfr_renamed_31());
        }
        try {
            sprdzl sprdzl2;
            sprdzl sprdzl3 = sprdzl2 = this.cfr_renamed_4.cfr_renamed_32();
            return new sprtpl(sprstl.cfr_renamed_10843(sprdzl3, arg0.cfr_renamed_615(), sprstl.cfr_renamed_10848(arg0, sprdzl3)));
        }
        catch (IOException iOException) {
            throw sprvhf.cfr_renamed_5213(sprmdj.cfr_renamed_9("\u000f\u0001\u0002\u000e\u0003\u0014L\u0010\u001e\u000f\b\u0015\u000f\u0005L\u0003\t\u0012\u0018\t\n\t\u000f\u0001\u0018\u0005L\u0013\u0005\u0007\u0002\u0001\u0018\u0015\u001e\u0005"), iOException);
        }
    }

    public sprrdm cfr_renamed_5024(sprlem arg0) {
        return this.cfr_renamed_10850(arg0);
    }

    public sprstl cfr_renamed_39(boolean[] arg0) {
        sprstl sprstl2 = this;
        sprstl2.cfr_renamed_4.cfr_renamed_4994(sprstl.cfr_renamed_27(arg0));
        return sprstl2;
    }
}

