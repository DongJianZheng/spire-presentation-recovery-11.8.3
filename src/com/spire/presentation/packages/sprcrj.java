/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraxz;
import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprfan;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmdi;
import com.spire.presentation.packages.sproeb;
import com.spire.presentation.packages.sprow;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprrsm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtu;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class sprcrj {
    private static final sprfan cfr_renamed_3;
    private static final Map<sprlem, String> cfr_renamed_4;

    private static /* synthetic */ String cfr_renamed_9336(sprlem arg0) {
        int n;
        Object object;
        Provider provider = Security.getProvider("BC");
        if (provider != null && (object = sprcrj.cfr_renamed_9337(provider, arg0)) != null) {
            return object;
        }
        object = Security.getProviders();
        int n2 = n = 0;
        while (n2 != ((Provider[])object).length) {
            String string;
            if (provider != object[n] && (string = sprcrj.cfr_renamed_9337(object[n], arg0)) != null) {
                return string;
            }
            n2 = ++n;
        }
        return arg0.cfr_renamed_19();
    }

    public static boolean cfr_renamed_9338(sprddm arg0) {
        return sprow.cfr_renamed_272.cfr_renamed_5078(arg0.cfr_renamed_593());
    }

    private static /* synthetic */ String cfr_renamed_9058(sprlem arg0) {
        String string = sprmdi.cfr_renamed_5816(arg0);
        int n = string.indexOf(45);
        if (n > 0 && !string.startsWith(sproeb.cfr_renamed_9("\u0015W\u0007,"))) {
            return new StringBuilder().insert(0, string.substring(0, n)).append(string.substring(n + 1)).toString();
        }
        return string;
    }

    public static String cfr_renamed_9057(sprddm arg0) {
        String string;
        sprco sprco2 = arg0.cfr_renamed_284();
        if (sprco2 != null && !cfr_renamed_3.cfr_renamed_7476(sprco2)) {
            if (arg0.cfr_renamed_593().cfr_renamed_5078(sprdl.cfr_renamed_3250)) {
                sprrsm sprrsm2 = sprrsm.cfr_renamed_23(sprco2);
                return new StringBuilder().insert(0, sprcrj.cfr_renamed_9058(sprrsm2.cfr_renamed_579().cfr_renamed_593())).append(spraxz.cfr_renamed_9("N>M?k\u0004x6W3t\u0010\u007ff")).toString();
            }
            if (arg0.cfr_renamed_593().cfr_renamed_5078(sprbr.cfr_renamed_1)) {
                sprszm sprszm2 = sprszm.cfr_renamed_23(sprco2);
                return sprcrj.cfr_renamed_9058((sprlem)sprszm2.cfr_renamed_85(0)) + sproeb.cfr_renamed_9("h/k.Z\u0005[\u0015^");
            }
        }
        if ((string = cfr_renamed_4.get(arg0.cfr_renamed_593())) != null) {
            return string;
        }
        return sprcrj.cfr_renamed_9336(arg0.cfr_renamed_593());
    }

    public static void cfr_renamed_9339(byte[] arg0, StringBuffer arg1, String arg2) {
        if (arg0.length > 20) {
            arg1.append(spraxz.cfr_renamed_9("w\u0019w\u0019w\u0019w\u0019w\u0019w\u0019\u0004P0W6M\"K2\u0003w")).append(sprfqe.cfr_renamed_501(arg0, 0, 20)).append(arg2);
            int n = 20;
            int n2 = n;
            while (n2 < arg0.length) {
                if (n < arg0.length - 20) {
                    arg1.append(sproeb.cfr_renamed_9("?f?f?f?f?f?f?f?f?f?f?f?")).append(sprfqe.cfr_renamed_501(arg0, n, 20)).append(arg2);
                } else {
                    arg1.append(spraxz.cfr_renamed_9("w\u0019w\u0019w\u0019w\u0019w\u0019w\u0019w\u0019w\u0019w\u0019w\u0019w\u0019w")).append(sprfqe.cfr_renamed_501(arg0, n, arg0.length - n)).append(arg2);
                }
                n2 = n += 20;
            }
        } else {
            arg1.append(sproeb.cfr_renamed_9("?f?f?f?f?f?fL/x(~2j4z|?")).append(sprfqe.cfr_renamed_503(arg0)).append(arg2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_9056(Signature arg0, sprco arg1) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        if (arg1 != null && !cfr_renamed_3.cfr_renamed_7476(arg1)) {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(arg0.getAlgorithm(), arg0.getProvider());
            try {
                algorithmParameters.init(arg1.cfr_renamed_119().cfr_renamed_91());
            }
            catch (IOException iOException) {
                throw new SignatureException(new StringBuilder().insert(0, spraxz.cfr_renamed_9("\u001ev\u0012A4\\'M>V9\u00193\\4V3P9^wI6K6T2M2K$\u0003w")).append(iOException.getMessage()).toString());
            }
            if (arg0.getAlgorithm().endsWith(sproeb.cfr_renamed_9("\u000bX\u0000."))) {
                try {
                    arg0.setParameter(algorithmParameters.getParameterSpec(PSSParameterSpec.class));
                    return;
                }
                catch (GeneralSecurityException generalSecurityException) {
                    throw new SignatureException(new StringBuilder().insert(0, spraxz.cfr_renamed_9("\u0012A4\\'M>V9\u00192A#K6Z#P9^wI6K6T2M2K$\u0003w")).append(generalSecurityException.getMessage()).toString());
                }
            }
        }
    }

    static {
        cfr_renamed_4 = new HashMap<sprlem, String>();
        cfr_renamed_4.put(sprtu.cfr_renamed_0, "Ed25519");
        cfr_renamed_4.put(sprtu.cfr_renamed_2, "Ed448");
        cfr_renamed_4.put(sprgt.cfr_renamed_93, sproeb.cfr_renamed_9("L\u000e^wh/k.[\u0015^"));
        cfr_renamed_4.put(sprbr.cfr_renamed_615, spraxz.cfr_renamed_9("\u0004q\u0016\b P#Q\u0013j\u0016"));
        cfr_renamed_3 = sprpen.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ String cfr_renamed_9337(Provider provider, sprlem sprlem2) {
        void arg1;
        Provider arg0;
        String string = arg0.getProperty(sproeb.cfr_renamed_9("\u0007s!1\u0007s/~51\u0015v!q'k3m#1") + arg1);
        if (string != null) {
            return string;
        }
        string = arg0.getProperty(new StringBuilder().insert(0, spraxz.cfr_renamed_9("x;^yx;P6Jyj>^9X#L%\\yv\u001e}y")).append(arg1).toString());
        if (string != null) {
            return string;
        }
        return null;
    }
}

