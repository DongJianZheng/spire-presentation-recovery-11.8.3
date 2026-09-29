/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdiaa;
import com.spire.presentation.packages.sprggb;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmge;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvrb;
import com.spire.presentation.packages.sprvva;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

public class sproza {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprije cfr_renamed_1570(sprtzd arg0, AlgorithmParameters arg1) throws InvalidAlgorithmParameterException {
        try {
            sprvva sprvva2 = sprvva.cfr_renamed_184(arg1.getEncoded());
            return new sprije(arg0, sprvva2);
        }
        catch (IOException iOException) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprvrb.cfr_renamed_9("vqb}oz#kl?fq`pgz#obmbrfkfmp?l}iz`k9?")).append(iOException.getMessage()).toString());
        }
    }

    public sprije cfr_renamed_1571(sprtzd arg0, AlgorithmParameterSpec arg1) throws InvalidAlgorithmParameterException {
        if (arg1 instanceof OAEPParameterSpec) {
            if (arg1.equals(OAEPParameterSpec.DEFAULT)) {
                return new sprije(arg0, new sprmge(sprmge.cfr_renamed_3, sprmge.cfr_renamed_4, sprmge.cfr_renamed_1));
            }
            OAEPParameterSpec oAEPParameterSpec = (OAEPParameterSpec)arg1;
            PSource pSource = oAEPParameterSpec.getPSource();
            if (!oAEPParameterSpec.getMGFAlgorithm().equals(OAEPParameterSpec.DEFAULT.getMGFAlgorithm())) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprdiaa.cfr_renamed_9("\u0007\u001d\u0004\nH")).append(OAEPParameterSpec.DEFAULT.getMGFAlgorithm()).append(sprvrb.cfr_renamed_9("#rblh?dzmzq~wpq?pjsolmwzg1")).toString());
            }
            sprije sprije2 = new sprggb().cfr_renamed_1494(oAEPParameterSpec.getDigestAlgorithm());
            sprije sprije3 = new sprggb().cfr_renamed_1494(((MGF1ParameterSpec)oAEPParameterSpec.getMGFParameters()).getDigestAlgorithm());
            return new sprije(arg0, new sprmge(sprije2, new sprije(sprm.cfr_renamed_123, sprije3), new sprije(sprm.cfr_renamed_953, new sprlqe(((PSource.PSpecified)pSource).getValue()))));
        }
        throw new InvalidAlgorithmParameterException(sprdiaa.cfr_renamed_9("\u0006\u0006\u0018\u0006\u001c\u001f\u001dH\u0003\t\u0001\t\u001e\r\u0007\r\u0001H\u0000\u0018\u0016\u000bS\u0018\u0012\u001b\u0000\r\u0017F"));
    }
}

