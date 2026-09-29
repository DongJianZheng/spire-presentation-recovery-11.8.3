/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbtm;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprksa;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlj;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprssm;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprzwl;
import java.io.OutputStream;
import java.math.BigInteger;

public class spriol {
    private final sprssm cfr_renamed_3;
    public static final sprddm cfr_renamed_4 = new sprddm(sprgt.cfr_renamed_0, sprpen.cfr_renamed_4);

    public int hashCode() {
        return this.cfr_renamed_3.cfr_renamed_119().hashCode();
    }

    public byte[] cfr_renamed_4306() {
        return this.cfr_renamed_3.cfr_renamed_4306().cfr_renamed_186();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof spriol)) {
            return false;
        }
        spriol spriol2 = (spriol)arg0;
        return this.cfr_renamed_3.cfr_renamed_119().cfr_renamed_5078(spriol2.cfr_renamed_3.cfr_renamed_119());
    }

    public static spriol cfr_renamed_10916(spriol arg0, BigInteger arg1) {
        return new spriol(new sprssm(arg0.cfr_renamed_3.cfr_renamed_579(), arg0.cfr_renamed_3.cfr_renamed_4302(), arg0.cfr_renamed_3.cfr_renamed_4306(), new sprktm(arg1)));
    }

    /*
     * WARNING - void declaration
     */
    public spriol(sprjj sprjj2, sprtpl sprtpl2, BigInteger bigInteger) throws sprzwl {
        void arg2;
        void arg1;
        void v0 = arg1;
        this.cfr_renamed_3 = spriol.cfr_renamed_10917(sprjj2, (sprtpl)arg1, new sprktm((BigInteger)arg2));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_10918(sprtpl arg0, sprlj arg1) throws sprzwl {
        try {
            return spriol.cfr_renamed_10917(arg1.cfr_renamed_5279(this.cfr_renamed_3.cfr_renamed_579()), arg0, this.cfr_renamed_3.cfr_renamed_114()).equals(this.cfr_renamed_3);
        }
        catch (sprhjg sprhjg2) {
            throw new sprzwl(new StringBuilder().insert(0, sprksa.cfr_renamed_9("\u0010D\u0004H\tOE^\n\n\u0006X\u0000K\u0011OEN\fM\u0000Y\u0011\n\u0006K\tI\u0010F\u0004^\nX_\n")).append(sprhjg2.getMessage()).toString(), sprhjg2);
        }
    }

    public BigInteger cfr_renamed_114() {
        return this.cfr_renamed_3.cfr_renamed_114().cfr_renamed_97();
    }

    public byte[] cfr_renamed_4302() {
        return this.cfr_renamed_3.cfr_renamed_4302().cfr_renamed_186();
    }

    public sprlem cfr_renamed_4301() {
        return this.cfr_renamed_3.cfr_renamed_579().cfr_renamed_593();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprssm cfr_renamed_10917(sprjj arg0, sprtpl arg1, sprktm arg2) throws sprzwl {
        try {
            sprjj sprjj2 = arg0;
            OutputStream outputStream = sprjj2.cfr_renamed_470();
            outputStream.write(arg1.cfr_renamed_568().cfr_renamed_1485().cfr_renamed_104("DER"));
            outputStream.close();
            sprfvg sprfvg2 = new sprfvg(arg0.cfr_renamed_580());
            sprvhm sprvhm2 = arg1.cfr_renamed_1489();
            outputStream = sprjj2.cfr_renamed_470();
            outputStream.write(sprvhm2.cfr_renamed_2314().cfr_renamed_81());
            outputStream.close();
            sprfvg sprfvg3 = new sprfvg(arg0.cfr_renamed_580());
            return new sprssm(arg0.cfr_renamed_615(), sprfvg2, sprfvg3, arg2);
        }
        catch (Exception exception) {
            throw new sprzwl(new StringBuilder().insert(0, sprbtm.cfr_renamed_9("\u0015&\n6\t1\bt\u0006&\u00005\u0011=\u000b3E\u001d!nE")).append(exception).toString(), exception);
        }
    }

    public sprssm cfr_renamed_119() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public spriol(sprssm sprssm2) {
        void arg0;
        if (sprssm2 == null) {
            throw new IllegalArgumentException(sprksa.cfr_renamed_9("\r\fNB\n\u0006K\u000bD\n^EH\u0000\n\u000b_\tF"));
        }
        this.cfr_renamed_3 = arg0;
    }
}

