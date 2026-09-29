/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprfje;
import com.spire.presentation.packages.sprfrb;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprseaa;
import com.spire.presentation.packages.sprtar;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprtua;
import com.spire.presentation.packages.sprude;
import com.spire.presentation.packages.sprxqa;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryee;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;

public class sprsla
extends sprxqa {
    public sprsla(X509Certificate arg0) throws CertificateParsingException {
        super(sprsla.cfr_renamed_370(arg0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprbne cfr_renamed_371(PublicKey arg0) throws InvalidKeyException {
        try {
            sprdce sprdce2 = new sprdce((sprbne)new sprgle(arg0.getEncoded()).cfr_renamed_24());
            return (sprbne)new sprxqa(sprdce2).cfr_renamed_94();
        }
        catch (Exception exception) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprtar.cfr_renamed_9("lAa\u0007{\u0000\u007fR`CjS|\u0000dEv\u001a/")).append(exception).toString());
        }
    }

    public sprsla(byte[] arg0) throws IOException {
        super((sprbne)sprtua.cfr_renamed_36(arg0));
    }

    public sprsla(sprtie arg0) {
        super((sprbne)arg0.cfr_renamed_372());
    }

    public sprsla(PublicKey arg0) throws InvalidKeyException {
        super(sprsla.cfr_renamed_371(arg0));
    }

    private static /* synthetic */ sprbne cfr_renamed_370(X509Certificate arg0) throws CertificateParsingException {
        sprmee sprmee2;
        block5: {
            block4: {
                try {
                    if (arg0.getVersion() == 3) break block4;
                    sprmee sprmee3 = new sprmee(sprfrb.cfr_renamed_373(arg0));
                    sprdce sprdce2 = new sprdce((sprbne)new sprgle(arg0.getPublicKey().getEncoded()).cfr_renamed_24());
                    return (sprbne)new sprxqa(sprdce2, new spryee(sprmee3), arg0.getSerialNumber()).cfr_renamed_94();
                }
                catch (Exception exception) {
                    throw new CertificateParsingException(new StringBuilder().insert(0, sprseaa.cfr_renamed_9("~)X4K%R>Uq^)O#Z2O8U6\u001b2^#O8]8X0O4\u001b5^%Z8W\"\u0001q")).append(exception.toString()).toString());
                }
            }
            sprmee2 = new sprmee(sprfrb.cfr_renamed_373(arg0));
            byte[] byArray = arg0.getExtensionValue(sprude.cfr_renamed_82.cfr_renamed_19());
            if (byArray == null) break block5;
            sprxue sprxue2 = (sprxue)sprtua.cfr_renamed_36(byArray);
            return (sprbne)new sprxqa(sprxue2.cfr_renamed_186(), new spryee(sprmee2), arg0.getSerialNumber()).cfr_renamed_94();
        }
        sprdce sprdce3 = new sprdce((sprbne)new sprgle(arg0.getPublicKey().getEncoded()).cfr_renamed_24());
        return (sprbne)new sprxqa(sprdce3, new spryee(sprmee2), arg0.getSerialNumber()).cfr_renamed_94();
    }

    public sprsla(sprfje arg0) {
        super((sprbne)arg0.cfr_renamed_372());
    }
}

