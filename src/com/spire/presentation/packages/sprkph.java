/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprfan;
import com.spire.presentation.packages.sprgnz;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.spris;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmzn;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprrsm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprwr;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;

public class sprkph {
    private static final sprfan cfr_renamed_4 = sprpen.cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_9056(Signature arg0, sprco arg1) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        if (arg1 != null && !cfr_renamed_4.cfr_renamed_7476(arg1)) {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(arg0.getAlgorithm(), arg0.getProvider());
            try {
                algorithmParameters.init(arg1.cfr_renamed_119().cfr_renamed_91());
            }
            catch (IOException iOException) {
                throw new SignatureException(new StringBuilder().insert(0, sprgnz.cfr_renamed_9("559\u0002\u001f\u001f\f\u000e\u0015\u0015\u0012Z\u0018\u001f\u001f\u0015\u0018\u0013\u0012\u001d\\\n\u001d\b\u001d\u0017\u0019\u000e\u0019\b\u000f@\\")).append(iOException.getMessage()).toString());
            }
            if (arg0.getAlgorithm().endsWith(sprmzn.cfr_renamed_9(" K+="))) {
                try {
                    arg0.setParameter(algorithmParameters.getParameterSpec(PSSParameterSpec.class));
                    return;
                }
                catch (GeneralSecurityException generalSecurityException) {
                    throw new SignatureException(new StringBuilder().insert(0, sprgnz.cfr_renamed_9("9\u0002\u001f\u001f\f\u000e\u0015\u0015\u0012Z\u0019\u0002\b\b\u001d\u0019\b\u0013\u0012\u001d\\\n\u001d\b\u001d\u0017\u0019\u000e\u0019\b\u000f@\\")).append(generalSecurityException.getMessage()).toString());
                }
            }
        }
    }

    public static String cfr_renamed_9057(sprddm arg0) {
        sprco sprco2 = arg0.cfr_renamed_284();
        if (sprco2 != null && !cfr_renamed_4.cfr_renamed_7476(sprco2)) {
            if (arg0.cfr_renamed_593().cfr_renamed_5078(sprdl.cfr_renamed_3250)) {
                sprrsm sprrsm2 = sprrsm.cfr_renamed_23(sprco2);
                return new StringBuilder().insert(0, sprkph.cfr_renamed_9058(sprrsm2.cfr_renamed_579().cfr_renamed_593())).append(sprmzn.cfr_renamed_9("\u001ae\u0019d?_,m\u0003h K+=")).toString();
            }
            if (arg0.cfr_renamed_593().cfr_renamed_5078(sprbr.cfr_renamed_1)) {
                sprszm sprszm2 = sprszm.cfr_renamed_23(sprco2);
                return new StringBuilder().insert(0, sprkph.cfr_renamed_9058(sprlem.cfr_renamed_23(sprszm2.cfr_renamed_85(0)))).append(sprgnz.cfr_renamed_9("\u000b\u0013\b\u0012998)=")).toString();
            }
        }
        return arg0.cfr_renamed_593().cfr_renamed_19();
    }

    private static /* synthetic */ String cfr_renamed_9058(sprlem arg0) {
        if (sprdl.cfr_renamed_1540.cfr_renamed_5078(arg0)) {
            return "MD5";
        }
        if (sprgt.cfr_renamed_0.cfr_renamed_5078(arg0)) {
            return "SHA1";
        }
        if (sprwr.cfr_renamed_957.cfr_renamed_5078(arg0)) {
            return sprmzn.cfr_renamed_9(">D,>_8");
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
            return sprgnz.cfr_renamed_9(".3,?1>MHD");
        }
        if (spris.cfr_renamed_272.cfr_renamed_5078(arg0)) {
            return "RIPEMD160";
        }
        if (spris.cfr_renamed_102.cfr_renamed_5078(arg0)) {
            return sprmzn.cfr_renamed_9("^$\\(A)>X:");
        }
        if (sprqo.cfr_renamed_112.cfr_renamed_5078(arg0)) {
            return sprgnz.cfr_renamed_9("=3)(IHKM");
        }
        return arg0.cfr_renamed_19();
    }
}

