/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprdg;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.sprhno;
import com.spire.presentation.packages.sprji;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprsly;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryk;
import java.io.IOException;
import java.security.AlgorithmParameters;

public class sproib {
    public static String cfr_renamed_1546(sprtzd arg0) {
        if (sprm.cfr_renamed_102.equals(arg0)) {
            return "MD5";
        }
        if (sprdh.cfr_renamed_86.equals(arg0)) {
            return "SHA1";
        }
        if (sprdg.spr\ufe34.equals(arg0)) {
            return sprhno.cfr_renamed_9("\u0016<\u0004Fw@");
        }
        if (sprdg.cfr_renamed_119.equals(arg0)) {
            return "SHA256";
        }
        if (sprdg.cfr_renamed_112.equals(arg0)) {
            return "SHA384";
        }
        if (sprdg.cfr_renamed_107.equals(arg0)) {
            return "SHA512";
        }
        if (spryk.cfr_renamed_126.equals(arg0)) {
            return sprsly.cfr_renamed_9(" >\"2?3CEJ");
        }
        if (spryk.cfr_renamed_91.equals(arg0)) {
            return "RIPEMD160";
        }
        if (spryk.cfr_renamed_3.equals(arg0)) {
            return sprhno.cfr_renamed_9("&\f$\u00009\u0001FpB");
        }
        if (sprji.cfr_renamed_31.equals(arg0)) {
            return sprsly.cfr_renamed_9("0=$&DFFC");
        }
        return arg0.cfr_renamed_19();
    }

    private /* synthetic */ sproib() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static spra cfr_renamed_2383(AlgorithmParameters arg0) throws IOException {
        try {
            return sprvva.cfr_renamed_184(arg0.getEncoded("ASN.1"));
        }
        catch (Exception exception) {
            return sprvva.cfr_renamed_184(arg0.getEncoded());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_1541(AlgorithmParameters arg0, spra arg1) throws IOException {
        try {
            arg0.init(arg1.cfr_renamed_119().cfr_renamed_91(), "ASN.1");
            return;
        }
        catch (Exception exception) {
            arg0.init(arg1.cfr_renamed_119().cfr_renamed_91());
            return;
        }
    }
}

