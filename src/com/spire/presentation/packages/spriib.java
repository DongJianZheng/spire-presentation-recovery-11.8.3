/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.spreae;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlcd;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprshn;
import com.spire.presentation.packages.sprvva;
import java.io.ByteArrayInputStream;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.X509EncodedKeySpec;

public class spriib
extends sprkra {
    private sprije cfr_renamed_1;
    private sprmra cfr_renamed_2;
    private spreae cfr_renamed_3;
    private sprbne cfr_renamed_4;

    public spreae cfr_renamed_1622() {
        return this.cfr_renamed_3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_1623(String arg0) throws NoSuchAlgorithmException, SignatureException, NoSuchProviderException, InvalidKeyException {
        spriib spriib2;
        Signature signature = null;
        if (arg0 == null) {
            spriib spriib3 = this;
            spriib2 = spriib3;
            signature = Signature.getInstance(spriib3.cfr_renamed_1.cfr_renamed_593().cfr_renamed_19());
        } else {
            spriib spriib4 = this;
            spriib2 = spriib4;
            signature = Signature.getInstance(spriib4.cfr_renamed_1.cfr_renamed_593().cfr_renamed_19(), arg0);
        }
        PublicKey publicKey = spriib2.cfr_renamed_1624(arg0);
        signature.initVerify(publicKey);
        try {
            sprmra sprmra2 = new sprmra(this.cfr_renamed_3);
            Signature signature2 = signature;
            signature2.update(sprmra2.cfr_renamed_81());
            return signature2.verify(this.cfr_renamed_2.cfr_renamed_81());
        }
        catch (Exception exception) {
            throw new InvalidKeyException(sprshn.cfr_renamed_9("/\u000f8\u00128]/\u0013)\u0012.\u0014$\u001aj\r?\u001f&\u0014)]!\u00183"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprbne cfr_renamed_1625(byte[] arg0) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arg0);
            return (sprbne)new sprgle(byteArrayInputStream).cfr_renamed_24();
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(sprlcd.cfr_renamed_9("1\u001d7\u0010*\\6\u00120\u00137\u00197\\!\u0019\"\t6\u000f'"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PublicKey cfr_renamed_1624(String arg0) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException {
        sprdce sprdce2 = this.cfr_renamed_3.cfr_renamed_1489();
        try {
            sprmra sprmra2 = new sprmra(sprdce2);
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(sprmra2.cfr_renamed_81());
            return KeyFactory.getInstance(sprdce2.cfr_renamed_593().cfr_renamed_593().cfr_renamed_19(), arg0).generatePublic(x509EncodedKeySpec);
        }
        catch (Exception exception) {
            throw new InvalidKeyException(sprshn.cfr_renamed_9("/\u000f8\u00128]/\u0013)\u0012.\u0014$\u001aj\r?\u001f&\u0014)]!\u00183"));
        }
    }

    public spriib(byte[] arg0) {
        spriib spriib2 = this;
        spriib spriib3 = this;
        spriib2.cfr_renamed_4 = spriib.cfr_renamed_1625(arg0);
        spriib2.cfr_renamed_3 = spreae.cfr_renamed_23(spriib3.cfr_renamed_4.cfr_renamed_85(0));
        spriib2.cfr_renamed_1 = sprije.cfr_renamed_23(spriib2.cfr_renamed_4.cfr_renamed_85(1));
        spriib2.cfr_renamed_2 = (sprmra)spriib2.cfr_renamed_4.cfr_renamed_85(2);
    }

    public boolean cfr_renamed_1626() throws NoSuchAlgorithmException, SignatureException, NoSuchProviderException, InvalidKeyException {
        return this.cfr_renamed_1623(null);
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }
}

