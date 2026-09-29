/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraa;
import com.spire.presentation.packages.sprbud;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprhah;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpa;
import com.spire.presentation.packages.sprpae;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprwry;
import java.io.OutputStream;
import java.math.BigInteger;

public class sprfzd {
    private final sprpae cfr_renamed_3;
    public static final sprije cfr_renamed_4 = new sprije(sprdh.cfr_renamed_86, sprume.cfr_renamed_3);

    public sprpae cfr_renamed_94() {
        return this.cfr_renamed_3;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprfzd)) {
            return false;
        }
        sprfzd sprfzd2 = (sprfzd)arg0;
        return this.cfr_renamed_3.cfr_renamed_119().equals(sprfzd2.cfr_renamed_3.cfr_renamed_119());
    }

    public sprtzd cfr_renamed_4301() {
        return this.cfr_renamed_3.cfr_renamed_579().cfr_renamed_593();
    }

    public byte[] cfr_renamed_4302() {
        return this.cfr_renamed_3.cfr_renamed_4302().cfr_renamed_186();
    }

    public int hashCode() {
        return this.cfr_renamed_3.cfr_renamed_119().hashCode();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_4303(sprcyd arg0, spraa arg1) throws sprbud {
        try {
            return sprfzd.cfr_renamed_4304(arg1.cfr_renamed_578(this.cfr_renamed_3.cfr_renamed_579()), arg0, this.cfr_renamed_3.cfr_renamed_114()).equals(this.cfr_renamed_3);
        }
        catch (sprfya sprfya2) {
            throw new sprbud(new StringBuilder().insert(0, sprhah.cfr_renamed_9("\u0012>\u00062\u000b5G$\bp\u0004\"\u00021\u00135G4\u000e7\u0002#\u0013p\u00041\u000b3\u0012<\u0006$\b\"]p")).append(sprfya2.getMessage()).toString(), sprfya2);
        }
    }

    public static sprfzd cfr_renamed_4305(sprfzd arg0, BigInteger arg1) {
        return new sprfzd(new sprpae(arg0.cfr_renamed_3.cfr_renamed_579(), arg0.cfr_renamed_3.cfr_renamed_4302(), arg0.cfr_renamed_3.cfr_renamed_4306(), new sprooe(arg1)));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprpae cfr_renamed_4304(sprpa arg0, sprcyd arg1, sprooe arg2) throws sprbud {
        try {
            sprpa sprpa2 = arg0;
            OutputStream outputStream = sprpa2.cfr_renamed_470();
            outputStream.write(arg1.cfr_renamed_568().cfr_renamed_1485().cfr_renamed_104("DER"));
            outputStream.close();
            sprlqe sprlqe2 = new sprlqe(arg0.cfr_renamed_580());
            sprdce sprdce2 = arg1.cfr_renamed_1489();
            outputStream = sprpa2.cfr_renamed_470();
            outputStream.write(sprdce2.cfr_renamed_2314().cfr_renamed_81());
            outputStream.close();
            sprlqe sprlqe3 = new sprlqe(arg0.cfr_renamed_580());
            return new sprpae(arg0.cfr_renamed_615(), sprlqe2, sprlqe3, arg2);
        }
        catch (Exception exception) {
            throw new sprbud(new StringBuilder().insert(0, sprwry.cfr_renamed_9("M3R#Q$Pa^3X I(S&\u001d\by{\u001d")).append(exception).toString(), exception);
        }
    }

    public byte[] cfr_renamed_4306() {
        return this.cfr_renamed_3.cfr_renamed_4306().cfr_renamed_186();
    }

    /*
     * WARNING - void declaration
     */
    public sprfzd(sprpae sprpae2) {
        void arg0;
        if (sprpae2 == null) {
            throw new IllegalArgumentException(sprhah.cfr_renamed_9("w\u000e4@p\u00041\t>\b$G2\u0002p\t%\u000b<"));
        }
        this.cfr_renamed_3 = arg0;
    }

    public BigInteger cfr_renamed_114() {
        return this.cfr_renamed_3.cfr_renamed_114().cfr_renamed_97();
    }

    /*
     * WARNING - void declaration
     */
    public sprfzd(sprpa sprpa2, sprcyd sprcyd2, BigInteger bigInteger) throws sprbud {
        void arg2;
        void arg1;
        void v0 = arg1;
        this.cfr_renamed_3 = sprfzd.cfr_renamed_4304(sprpa2, (sprcyd)arg1, new sprooe((BigInteger)arg2));
    }
}

