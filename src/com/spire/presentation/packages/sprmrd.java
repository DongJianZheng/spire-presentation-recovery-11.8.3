/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.spraqb;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprbqd;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdsb;
import com.spire.presentation.packages.spreya;
import com.spire.presentation.packages.sprgep;
import com.spire.presentation.packages.sprgne;
import com.spire.presentation.packages.sprhre;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.spripd;
import com.spire.presentation.packages.spriud;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnre;
import com.spire.presentation.packages.sprpdi;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprqrd;
import com.spire.presentation.packages.sprswd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprwrd;
import com.spire.presentation.packages.sprxme;
import com.spire.presentation.packages.sprypd;
import com.spire.presentation.packages.sprzxd;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;

public class sprmrd
extends spriud {
    private KeyPair cfr_renamed_119;
    private PrivateKey cfr_renamed_91;
    private List cfr_renamed_0;
    private List cfr_renamed_1;
    private PublicKey cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private sprzxd cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprmrd cfr_renamed_4053(X509Certificate x509Certificate) throws CertificateEncodingException {
        void arg0;
        sprmrd sprmrd2 = this;
        this.cfr_renamed_0.add(new sprhre(sprwrd.cfr_renamed_4054(x509Certificate)));
        sprmrd2.cfr_renamed_1.add(arg0.getPublicKey());
        return sprmrd2;
    }

    /*
     * WARNING - void declaration
     */
    public sprmrd(sprtzd sprtzd2, PrivateKey privateKey, PublicKey publicKey, sprtzd sprtzd3) {
        void arg3;
        void arg2;
        void arg0;
        sprmrd sprmrd2 = this;
        super((sprtzd)arg0, sprdce.cfr_renamed_23(arg2.getEncoded()), (sprtzd)arg3);
        sprmrd sprmrd3 = this;
        this.cfr_renamed_0 = new ArrayList();
        sprmrd3.cfr_renamed_1 = new ArrayList();
        this.cfr_renamed_4 = new sprzxd(new sprypd());
        sprmrd2.cfr_renamed_2 = arg2;
        sprmrd2.cfr_renamed_91 = privateKey;
    }

    /*
     * WARNING - void declaration
     */
    public sprmrd cfr_renamed_4055(byte[] byArray, PublicKey publicKey) throws CertificateEncodingException {
        void arg1;
        sprmrd sprmrd2 = this;
        this.cfr_renamed_0.add(new sprhre(new sprgne(byArray)));
        sprmrd2.cfr_renamed_1.add(arg1);
        return sprmrd2;
    }

    /*
     * WARNING - void declaration
     */
    public sprmrd cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprzxd(new sprqrd((Provider)arg0));
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprmrd cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprzxd(new sprbqd((String)arg0));
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_4056(sprtzd arg0) throws sprlqd {
        if (this.cfr_renamed_3 == null) {
            sprmrd sprmrd2 = this;
            sprmrd2.cfr_renamed_3 = new SecureRandom();
        }
        if (arg0.equals(spripd.cfr_renamed_137) && this.cfr_renamed_119 == null) {
            try {
                ECParameterSpec eCParameterSpec = ((ECPublicKey)this.cfr_renamed_2).getParams();
                KeyPairGenerator keyPairGenerator = this.cfr_renamed_4.cfr_renamed_4057(arg0);
                keyPairGenerator.initialize(eCParameterSpec, this.cfr_renamed_3);
                this.cfr_renamed_119 = keyPairGenerator.generateKeyPair();
                return;
            }
            catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
                throw new sprlqd(new StringBuilder().insert(0, sprgep.cfr_renamed_9("{\rv\u0002w\u00188\b}\u0018}\u001eu\u0005v\t8!I:8\th\u0004}\u0001}\u001ey\u00008\u0007}\u00158\u001cy\u0005jLh\rj\ru\tl\tj\u001f8\nj\u0003uLh\u0019z\u0000q\u000f8\u0007}\u0015\"L")).append(invalidAlgorithmParameterException).toString());
            }
        }
    }

    public sprmrd cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprbne cfr_renamed_4034(sprije arg0, sprije arg1, spreya arg2) throws sprlqd {
        int n;
        sprmrd sprmrd2 = this;
        sprmrd2.cfr_renamed_4056(arg0.cfr_renamed_593());
        PrivateKey privateKey = sprmrd2.cfr_renamed_91;
        sprtzd sprtzd2 = arg0.cfr_renamed_593();
        if (sprtzd2.cfr_renamed_19().equals(sprswd.cfr_renamed_112)) {
            privateKey = new sprdsb(privateKey, this.cfr_renamed_119.getPrivate(), this.cfr_renamed_119.getPublic());
        }
        sprlre sprlre2 = new sprlre();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_0.size()) {
            PublicKey publicKey = (PublicKey)this.cfr_renamed_1.get(n);
            sprhre sprhre2 = (sprhre)this.cfr_renamed_0.get(n);
            if (sprtzd2.cfr_renamed_19().equals(sprswd.cfr_renamed_112)) {
                PublicKey publicKey2 = publicKey;
                publicKey = new spraqb(publicKey2, publicKey2);
            }
            try {
                Cipher cipher;
                KeyAgreement keyAgreement;
                KeyAgreement keyAgreement2 = keyAgreement = this.cfr_renamed_4.cfr_renamed_4058(sprtzd2);
                keyAgreement2.init((Key)privateKey, this.cfr_renamed_3);
                keyAgreement2.doPhase(publicKey, true);
                SecretKey secretKey = keyAgreement.generateSecret(arg1.cfr_renamed_593().cfr_renamed_19());
                Cipher cipher2 = cipher = this.cfr_renamed_4.cfr_renamed_4059(arg1.cfr_renamed_593());
                cipher2.init(3, (Key)secretKey, this.cfr_renamed_3);
                byte[] byArray = cipher2.wrap(this.cfr_renamed_4.cfr_renamed_1535(arg2));
                sprlqe sprlqe2 = new sprlqe(byArray);
                sprlre2.cfr_renamed_49(new sprnre(sprhre2, sprlqe2));
            }
            catch (GeneralSecurityException generalSecurityException) {
                throw new sprlqd(new StringBuilder().insert(0, sprpdi.cfr_renamed_9("h\u001be\u0014d\u000e+\nn\bm\u0015y\u0017+\u001bl\bn\u001ff\u001fe\u000e+\t\u007f\u001f{@+")).append(generalSecurityException.getMessage()).toString(), generalSecurityException);
            }
            n2 = ++n;
        }
        return new sprpse(sprlre2);
    }

    @Override
    public spra cfr_renamed_4035(sprije arg0) throws sprlqd {
        sprmrd sprmrd2 = this;
        sprmrd2.cfr_renamed_4056(arg0.cfr_renamed_593());
        if (sprmrd2.cfr_renamed_119 != null) {
            sprmrd sprmrd3 = this;
            return new sprxme(sprmrd3.cfr_renamed_4033(sprdce.cfr_renamed_23(sprmrd3.cfr_renamed_119.getPublic().getEncoded())), null);
        }
        return null;
    }
}

