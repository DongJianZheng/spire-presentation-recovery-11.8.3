/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprafz;
import com.spire.presentation.packages.sprcgo;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprfom;
import com.spire.presentation.packages.sprge;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprhk;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprlum;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.X509EncodedKeySpec;

public class sprddh
implements sprjn {
    public final sprlum cfr_renamed_4;

    public sprddh(sprlum sprlum2) {
        this.cfr_renamed_4 = sprlum2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_1623(String arg0) throws NoSuchAlgorithmException, SignatureException, NoSuchProviderException, InvalidKeyException {
        sprddh sprddh2;
        Signature signature = null;
        if (arg0 == null) {
            sprddh sprddh3 = this;
            sprddh2 = sprddh3;
            signature = Signature.getInstance(sprddh3.cfr_renamed_4.cfr_renamed_89().cfr_renamed_593().cfr_renamed_19());
        } else {
            sprddh sprddh4 = this;
            sprddh2 = sprddh4;
            signature = Signature.getInstance(sprddh4.cfr_renamed_4.cfr_renamed_89().cfr_renamed_593().cfr_renamed_19(), arg0);
        }
        PublicKey publicKey = sprddh2.cfr_renamed_1624(arg0);
        signature.initVerify(publicKey);
        try {
            Signature signature2 = signature;
            sprddh sprddh5 = this;
            signature2.update(sprddh5.cfr_renamed_4.cfr_renamed_1622().cfr_renamed_91());
            return signature2.verify(sprddh5.cfr_renamed_4.cfr_renamed_79().cfr_renamed_81());
        }
        catch (Exception exception) {
            throw new InvalidKeyException(sprcgo.cfr_renamed_9("\u007f~hch,\u007fbyc~etk:|onvey,qic"));
        }
    }

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_568().cfr_renamed_91();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PublicKey cfr_renamed_1624(String arg0) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException {
        sprvhm sprvhm2 = this.cfr_renamed_4.cfr_renamed_1622().cfr_renamed_1489();
        try {
            sprdye sprdye2 = new sprdye(sprvhm2);
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(sprdye2.cfr_renamed_186());
            return KeyFactory.getInstance(sprvhm2.cfr_renamed_593().cfr_renamed_593().cfr_renamed_19(), arg0).generatePublic(x509EncodedKeySpec);
        }
        catch (Exception exception) {
            throw new InvalidKeyException(sprafz.cfr_renamed_9("u\u0004b\u0019bVu\u0018s\u0019t\u001f~\u00110\u0006e\u0014|\u001fsV{\u0013i"));
        }
    }

    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4.cfr_renamed_119();
    }

    public sprfom cfr_renamed_1622() {
        return this.cfr_renamed_4.cfr_renamed_1622();
    }

    public sprddh(byte[] byArray) {
        this.cfr_renamed_4 = sprlum.cfr_renamed_23(byArray);
    }

    public String cfr_renamed_2366() {
        return this.cfr_renamed_4.cfr_renamed_1622().cfr_renamed_2366().cfr_renamed_314();
    }

    public sprvhm cfr_renamed_1489() {
        return this.cfr_renamed_4.cfr_renamed_1622().cfr_renamed_1489();
    }

    public boolean cfr_renamed_1626() throws NoSuchAlgorithmException, SignatureException, NoSuchProviderException, InvalidKeyException {
        return this.cfr_renamed_1623(null);
    }

    public boolean cfr_renamed_7374(sprhk arg0) throws sprhjg, IOException {
        sprge sprge2 = arg0.cfr_renamed_5279(this.cfr_renamed_4.cfr_renamed_89());
        OutputStream outputStream = sprge2.cfr_renamed_470();
        sprddh sprddh2 = this;
        sprddh2.cfr_renamed_4.cfr_renamed_1622().cfr_renamed_8489(outputStream, "DER");
        outputStream.close();
        return sprge2.cfr_renamed_1435(sprddh2.cfr_renamed_4.cfr_renamed_79().cfr_renamed_186());
    }

    public sprlum cfr_renamed_568() {
        return this.cfr_renamed_4;
    }
}

