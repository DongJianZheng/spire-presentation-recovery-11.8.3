/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprape;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprosq;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqvk;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprwdi;
import com.spire.presentation.packages.spryim;
import com.spire.presentation.packages.sprzne;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;

public class sprjte
extends sprzne {
    public sprjte(X509Certificate arg0) throws CertificateParsingException {
        super(sprjte.cfr_renamed_370(arg0));
    }

    private static /* synthetic */ sprszm cfr_renamed_370(X509Certificate arg0) throws CertificateParsingException {
        sprigm sprigm2;
        block5: {
            block4: {
                try {
                    if (arg0.getVersion() == 3) break block4;
                    sprigm sprigm3 = new sprigm(sprwdi.cfr_renamed_373(arg0));
                    sprvhm sprvhm2 = sprvhm.cfr_renamed_23(arg0.getPublicKey().getEncoded());
                    return (sprszm)new sprzne(sprvhm2, new spraem(sprigm3), arg0.getSerialNumber()).cfr_renamed_119();
                }
                catch (Exception exception) {
                    throw new CertificateParsingException(new StringBuilder().insert(0, sprqvk.cfr_renamed_9("\u0004V\"K1Z(A/\u000e$V5\\ M5G/IaM$\\5G'G\"O5KaJ$Z G-]{\u000e")).append(exception.toString()).toString());
                }
            }
            sprigm2 = new sprigm(sprwdi.cfr_renamed_373(arg0));
            byte[] byArray = arg0.getExtensionValue(sprrdm.cfr_renamed_126.cfr_renamed_19());
            if (byArray == null) break block5;
            sproug sproug2 = (sproug)sprape.cfr_renamed_36(byArray);
            return (sprszm)new sprzne(sproug2.cfr_renamed_186(), new spraem(sprigm2), arg0.getSerialNumber()).cfr_renamed_119();
        }
        sprvhm sprvhm3 = sprvhm.cfr_renamed_23(arg0.getPublicKey().getEncoded());
        return (sprszm)new sprzne(sprvhm3, new spraem(sprigm2), arg0.getSerialNumber()).cfr_renamed_119();
    }

    public sprjte(PublicKey arg0) throws InvalidKeyException {
        super(sprjte.cfr_renamed_371(arg0));
    }

    public sprjte(sprrdm arg0) {
        super((sprszm)arg0.cfr_renamed_372());
    }

    public sprjte(byte[] arg0) throws IOException {
        super((sprszm)sprape.cfr_renamed_36(arg0));
    }

    public sprjte(spryim arg0) {
        super((sprszm)arg0.cfr_renamed_372());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprszm cfr_renamed_371(PublicKey arg0) throws InvalidKeyException {
        try {
            sprvhm sprvhm2 = sprvhm.cfr_renamed_23(arg0.getEncoded());
            return (sprszm)new sprzne(sprvhm2).cfr_renamed_119();
        }
        catch (Exception exception) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprosq.cfr_renamed_9("a\u001clZv]r\u000fm\u001eg\u000eq]i\u0018{G\"")).append(exception).toString());
        }
    }
}

