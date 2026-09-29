/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcre;
import com.spire.presentation.packages.sprdg;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.sprdrc;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprji;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprqhe;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.spryk;
import com.spire.presentation.packages.spryrh;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;

public class sprhnc {
    private static final sprcre cfr_renamed_4 = sprume.cfr_renamed_3;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_2120(Signature arg0, spra arg1) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        if (arg1 != null && !cfr_renamed_4.equals(arg1)) {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(arg0.getAlgorithm(), arg0.getProvider());
            try {
                algorithmParameters.init(arg1.cfr_renamed_119().cfr_renamed_91());
            }
            catch (IOException iOException) {
                throw new SignatureException(new StringBuilder().insert(0, sprdrc.cfr_renamed_9(",\u001d *\u00067\u0015&\f=\u000br\u00017\u0006=\u0001;\u000b5E\"\u0004 \u0004?\u0000&\u0000 \u0016hE")).append(iOException.getMessage()).toString());
            }
            if (arg0.getAlgorithm().endsWith(spryrh.cfr_renamed_9("=16G"))) {
                try {
                    arg0.setParameter(algorithmParameters.getParameterSpec(PSSParameterSpec.class));
                    return;
                }
                catch (GeneralSecurityException generalSecurityException) {
                    throw new SignatureException(new StringBuilder().insert(0, sprdrc.cfr_renamed_9(" *\u00067\u0015&\f=\u000br\u0000*\u0011 \u00041\u0011;\u000b5E\"\u0004 \u0004?\u0000&\u0000 \u0016hE")).append(generalSecurityException.getMessage()).toString());
                }
            }
        }
    }

    private static /* synthetic */ String cfr_renamed_1546(sprtzd arg0) {
        if (sprm.cfr_renamed_102.equals(arg0)) {
            return "MD5";
        }
        if (sprdh.cfr_renamed_86.equals(arg0)) {
            return "SHA1";
        }
        if (sprdg.spr\ufe34.equals(arg0)) {
            return spryrh.cfr_renamed_9("#>1DBB");
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
            return sprdrc.cfr_renamed_9("7\u001b5\u0017(\u0016T`]");
        }
        if (spryk.cfr_renamed_91.equals(arg0)) {
            return "RIPEMD160";
        }
        if (spryk.cfr_renamed_3.equals(arg0)) {
            return spryrh.cfr_renamed_9("$9&5;4DE@");
        }
        if (sprji.cfr_renamed_31.equals(arg0)) {
            return sprdrc.cfr_renamed_9("\u0015*\u00011aQcT");
        }
        return arg0.cfr_renamed_19();
    }

    public static String cfr_renamed_1538(sprije arg0) {
        spra spra2 = arg0.cfr_renamed_284();
        if (spra2 != null && !cfr_renamed_4.equals(spra2)) {
            if (arg0.cfr_renamed_593().equals(sprm.cfr_renamed_131)) {
                sprqhe sprqhe2 = sprqhe.cfr_renamed_23(spra2);
                return new StringBuilder().insert(0, sprhnc.cfr_renamed_1546(sprqhe2.cfr_renamed_579().cfr_renamed_593())).append(spryrh.cfr_renamed_9("\u0007\u001f\u0004\u001e\"%1\u0017\u001e\u0012=16G")).toString();
            }
            if (arg0.cfr_renamed_593().equals(sprtk.cfr_renamed_107)) {
                sprbne sprbne2 = sprbne.cfr_renamed_23(spra2);
                return sprhnc.cfr_renamed_1546((sprtzd)sprbne2.cfr_renamed_85(0)) + sprdrc.cfr_renamed_9("\u0012;\u0011: \u0011!\u0001$");
            }
        }
        return arg0.cfr_renamed_593().cfr_renamed_19();
    }
}

