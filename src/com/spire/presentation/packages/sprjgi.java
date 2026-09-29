/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.spris;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnql;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprvzca;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;
import java.security.AlgorithmParameters;

public class sprjgi {
    private /* synthetic */ sprjgi() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_7434(AlgorithmParameters arg0, sprco arg1) throws IOException {
        try {
            arg0.init(arg1.cfr_renamed_119().cfr_renamed_91(), "ASN.1");
            return;
        }
        catch (Exception exception) {
            arg0.init(arg1.cfr_renamed_119().cfr_renamed_91());
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprco cfr_renamed_2383(AlgorithmParameters arg0) throws IOException {
        try {
            return sprxgf.cfr_renamed_184(arg0.getEncoded("ASN.1"));
        }
        catch (Exception exception) {
            return sprxgf.cfr_renamed_184(arg0.getEncoded());
        }
    }

    public static String cfr_renamed_9058(sprlem arg0) {
        if (sprdl.cfr_renamed_1540.cfr_renamed_5078(arg0)) {
            return "MD5";
        }
        if (sprgt.cfr_renamed_0.cfr_renamed_5078(arg0)) {
            return "SHA1";
        }
        if (sprwr.cfr_renamed_957.cfr_renamed_5078(arg0)) {
            return sprnql.cfr_renamed_9("\u0015J\u00070t6");
        }
        if (sprwr.cfr_renamed_1226.cfr_renamed_5078(arg0)) {
            return "SHA256";
        }
        if (sprwr.cfr_renamed_112.cfr_renamed_5078(arg0)) {
            return "SHA384";
        }
        if (sprwr.cfr_renamed_272.cfr_renamed_5078(arg0)) {
            return "SHA512";
        }
        if (spris.cfr_renamed_91.cfr_renamed_5078(arg0)) {
            return sprvzca.cfr_renamed_9("*)(%5$IR@");
        }
        if (spris.cfr_renamed_272.cfr_renamed_5078(arg0)) {
            return "RIPEMD160";
        }
        if (spris.cfr_renamed_102.cfr_renamed_5078(arg0)) {
            return sprnql.cfr_renamed_9("P\u000fR\u0003O\u00020s4");
        }
        if (sprqo.cfr_renamed_112.cfr_renamed_5078(arg0)) {
            return sprvzca.cfr_renamed_9("'73,SLQI");
        }
        return arg0.cfr_renamed_19();
    }
}

