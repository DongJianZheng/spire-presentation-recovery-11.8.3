/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprage;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprfbe;
import com.spire.presentation.packages.sprfxa;
import com.spire.presentation.packages.sprgde;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprjog;
import com.spire.presentation.packages.sproce;
import com.spire.presentation.packages.spronb;
import com.spire.presentation.packages.sprpgb;
import com.spire.presentation.packages.sprqwd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.sprya;
import com.spire.presentation.packages.sprzra;
import java.io.IOException;

public class sprffb {
    private sprgde cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprgde cfr_renamed_1443(byte[] arg0) throws IOException {
        try {
            return sprgde.cfr_renamed_23(sprvva.cfr_renamed_184(arg0));
        }
        catch (ClassCastException classCastException) {
            throw new sprqwd(new StringBuilder().insert(0, spronb.cfr_renamed_9("\bB\tE\nQ\bF\u0001\u0003\u0001B\u0011B_\u0003")).append(classCastException.getMessage()).toString(), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprqwd(new StringBuilder().insert(0, sprjog.cfr_renamed_9("t&u!v5t\"}g}&m&#g")).append(illegalArgumentException.getMessage()).toString(), illegalArgumentException);
        }
    }

    public boolean cfr_renamed_1469() {
        return this.cfr_renamed_4.cfr_renamed_1470() != null;
    }

    public sprgde cfr_renamed_568() {
        return this.cfr_renamed_4;
    }

    public sprffb(sprgde sprgde2) {
        this.cfr_renamed_4 = sprgde2;
    }

    public sprffb(byte[] arg0) throws IOException {
        this(sprffb.cfr_renamed_1443(arg0));
    }

    public sprije cfr_renamed_1471() {
        sprage sprage2 = this.cfr_renamed_4.cfr_renamed_1470();
        if (sprage2 != null) {
            return sprage2.cfr_renamed_1472().cfr_renamed_1473();
        }
        return null;
    }

    public byte[] cfr_renamed_104(String arg0) throws IOException {
        return this.cfr_renamed_568().cfr_renamed_104(arg0);
    }

    public sproce[] cfr_renamed_1474() {
        int n;
        sprbne sprbne2 = sprbne.cfr_renamed_23(sprxue.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_1475().cfr_renamed_480()).cfr_renamed_186());
        sproce[] sproceArray = new sproce[sprbne2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprbne2.cfr_renamed_84()) {
            int n3 = n++;
            sproceArray[n3] = sproce.cfr_renamed_23(sprbne2.cfr_renamed_85(n3));
            n2 = n;
        }
        return sproceArray;
    }

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_568().cfr_renamed_91();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3;
        int cfr_ignored_0 = 5 << 3 ^ (3 ^ 5);
        int n4 = n2;
        int n5 = 5 << 4 ^ (2 ^ 5) << 1;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_1476(sprya arg0, char[] arg1) throws sprfxa {
        if (!this.cfr_renamed_1469()) {
            throw new IllegalStateException(sprjog.cfr_renamed_9(")vgT\u0006Zgi5|4|)mgv)9\u0017_\u001f"));
        }
        sprage sprage2 = this.cfr_renamed_4.cfr_renamed_1470();
        sprpgb sprpgb2 = new sprpgb(arg0.cfr_renamed_578(new sprije(sprage2.cfr_renamed_1472().cfr_renamed_1473().cfr_renamed_593(), new sprfbe(sprage2.cfr_renamed_1477(), sprage2.cfr_renamed_1478().intValue()))));
        try {
            sprage sprage3 = sprpgb2.cfr_renamed_1464(arg1, sprxue.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_1475().cfr_renamed_480()).cfr_renamed_186());
            return sprzra.cfr_renamed_559(sprage3.cfr_renamed_91(), this.cfr_renamed_4.cfr_renamed_1470().cfr_renamed_91());
        }
        catch (IOException iOException) {
            throw new sprfxa(new StringBuilder().insert(0, spronb.cfr_renamed_9("\u0010M\u0004A\tFEW\n\u0003\u0015Q\n@\u0000P\u0016\u0003$V\u0011K6B\u0003F_\u0003")).append(iOException.getMessage()).toString());
        }
    }
}

