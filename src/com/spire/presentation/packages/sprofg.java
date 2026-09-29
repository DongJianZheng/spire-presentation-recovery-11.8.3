/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcog;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmvo;
import com.spire.presentation.packages.spropm;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzpj;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

public class sprofg {
    public sprddm cfr_renamed_7473(sprlem arg0, AlgorithmParameterSpec arg1) throws InvalidAlgorithmParameterException {
        if (arg1 instanceof OAEPParameterSpec) {
            sprddm sprddm2;
            if (arg1.equals(OAEPParameterSpec.DEFAULT)) {
                return new sprddm(arg0, new spropm(spropm.cfr_renamed_91, spropm.cfr_renamed_3, spropm.cfr_renamed_1));
            }
            OAEPParameterSpec oAEPParameterSpec = (OAEPParameterSpec)arg1;
            PSource pSource = oAEPParameterSpec.getPSource();
            if (!oAEPParameterSpec.getMGFAlgorithm().equals(OAEPParameterSpec.DEFAULT.getMGFAlgorithm())) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprmvo.cfr_renamed_9("nAmV!")).append(OAEPParameterSpec.DEFAULT.getMGFAlgorithm()).append(sprzpj.cfr_renamed_9("\u001a\u0005[\u001bQH]\rT\rH\tN\u0007HHI\u001dJ\u0018U\u001aN\r^F")).toString());
            }
            sprddm sprddm3 = new sprcog().cfr_renamed_1494(oAEPParameterSpec.getDigestAlgorithm());
            if (sprddm3.cfr_renamed_284() == null) {
                sprddm3 = new sprddm(sprddm3.cfr_renamed_593(), sprpen.cfr_renamed_4);
            }
            if ((sprddm2 = new sprcog().cfr_renamed_1494(((MGF1ParameterSpec)oAEPParameterSpec.getMGFParameters()).getDigestAlgorithm())).cfr_renamed_284() == null) {
                sprddm2 = new sprddm(sprddm2.cfr_renamed_593(), sprpen.cfr_renamed_4);
            }
            return new sprddm(arg0, new spropm(sprddm3, new sprddm(sprdl.cfr_renamed_135, sprddm2), new sprddm(sprdl.cfr_renamed_1472, new sprfvg(((PSource.PSpecified)pSource).getValue()))));
        }
        throw new InvalidAlgorithmParameterException(sprmvo.cfr_renamed_9("ZoDo@vA!_`]`Bd[d]!\\qJb\u000fqNr\\dK/"));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ 3;
        int cfr_ignored_0 = 5 << 4 ^ (3 << 2 ^ 3);
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 4 << 1;
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
    public sprddm cfr_renamed_7474(sprlem arg0, AlgorithmParameters arg1) throws InvalidAlgorithmParameterException {
        try {
            sprxgf sprxgf2 = sprxgf.cfr_renamed_184(arg1.getEncoded());
            return new sprddm(arg0, sprxgf2);
        }
        catch (IOException iOException) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprzpj.cfr_renamed_9("O\u0006[\nV\r\u001a\u001cUH_\u0006Y\u0007^\r\u001a\u0018[\u001a[\u0005_\u001c_\u001aIHU\nP\rY\u001c\u0000H")).append(iOException.getMessage()).toString());
        }
    }
}

