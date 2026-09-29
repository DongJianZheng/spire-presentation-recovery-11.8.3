/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spranm;
import com.spire.presentation.packages.sprbtm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcum;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdhl;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdul;
import com.spire.presentation.packages.sprenm;
import com.spire.presentation.packages.sprfhl;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgei;
import com.spire.presentation.packages.spriom;
import com.spire.presentation.packages.sprjmm;
import com.spire.presentation.packages.sprjrl;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlgg;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprnfg;
import com.spire.presentation.packages.sprni;
import com.spire.presentation.packages.sprobi;
import com.spire.presentation.packages.sproul;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpfl;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprseca;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprwci;
import com.spire.presentation.packages.sprwkl;
import com.spire.presentation.packages.sprymm;
import com.spire.presentation.packages.sprzw;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;

public class sprgfl
extends sprwkl {
    private SecureRandom cfr_renamed_86;
    private static sprzw cfr_renamed_152 = new sprfhl();
    private sprni cfr_renamed_112;
    private PrivateKey cfr_renamed_119;
    private PublicKey cfr_renamed_91;
    private List cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private sprdul cfr_renamed_2;
    private KeyPair cfr_renamed_3;
    private List cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprgfl(sprlem sprlem2, PrivateKey privateKey, PublicKey publicKey, sprlem sprlem3) {
        void arg3;
        void arg2;
        void arg0;
        sprgfl sprgfl2 = this;
        super((sprlem)arg0, sprvhm.cfr_renamed_23(arg2.getEncoded()), (sprlem)arg3);
        sprgfl sprgfl3 = this;
        this.cfr_renamed_112 = new sprlgg();
        sprgfl3.cfr_renamed_4 = new ArrayList();
        this.cfr_renamed_0 = new ArrayList();
        this.cfr_renamed_2 = new sprdul(new sprjrl());
        sprgfl2.cfr_renamed_91 = arg2;
        sprgfl2.cfr_renamed_119 = sproul.cfr_renamed_10695(privateKey);
    }

    public sprgfl cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_86 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprgfl cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_2 = new sprdul(new sprpfl((String)arg0));
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprgfl cfr_renamed_4053(X509Certificate x509Certificate) throws CertificateEncodingException {
        void arg0;
        sprgfl sprgfl2 = this;
        this.cfr_renamed_4.add(new spranm(sproul.cfr_renamed_4054(x509Certificate)));
        sprgfl2.cfr_renamed_0.add(arg0.getPublicKey());
        return sprgfl2;
    }

    public sprgfl cfr_renamed_10714(byte[] arg0) {
        this.cfr_renamed_1 = sproze.cfr_renamed_158(arg0);
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprgfl cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_2 = new sprdul(new sprdhl((Provider)arg0));
        return this;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_10687(sprddm arg0) throws sprlyl {
        sprgfl sprgfl2 = this;
        sprgfl2.cfr_renamed_10715(arg0.cfr_renamed_593());
        if (sprgfl2.cfr_renamed_3 == null) {
            return this.cfr_renamed_1;
        }
        sprgfl sprgfl3 = this;
        spriom spriom2 = sprgfl3.cfr_renamed_10685(sprvhm.cfr_renamed_23(sprgfl3.cfr_renamed_3.getPublic().getEncoded()));
        try {
            if (this.cfr_renamed_1 == null) return new sprenm(spriom2, null).cfr_renamed_91();
            return new sprenm(spriom2, new sprfvg(this.cfr_renamed_1)).cfr_renamed_91();
        }
        catch (IOException iOException) {
            throw new sprlyl(new StringBuilder().insert(0, sprseca.cfr_renamed_9("\u0003z\u0017v\u001aqV`\u00194\u0013z\u0015{\u0012qVa\u0005q\u00044\u001dq\u000f}\u0018sVy\u0017`\u0013f\u001fu\u001a.V")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public sprszm cfr_renamed_10686(sprddm arg0, sprddm arg1, sprnfg arg2) throws sprlyl {
        int n;
        if (this.cfr_renamed_4.isEmpty()) {
            throw new sprlyl(sprbtm.cfr_renamed_9("\u001a\nt\u00171\u0006=\u0015=\u0000:\u0011'E5\u0016'\n7\f5\u00111\u0001t\u0012=\u0011<E3\u0000:\u0000&\u0004 \n&EyE!\u00161E5\u0001071\u0006=\u0015=\u0000:\u0011|L"));
        }
        sprgfl sprgfl2 = this;
        sprgfl2.cfr_renamed_10715(arg0.cfr_renamed_593());
        PrivateKey privateKey = sprgfl2.cfr_renamed_119;
        sprlem sprlem2 = arg0.cfr_renamed_593();
        sprrvm sprrvm2 = new sprrvm();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.size()) {
            PublicKey publicKey = (PublicKey)this.cfr_renamed_0.get(n);
            spranm spranm2 = (spranm)this.cfr_renamed_4.get(n);
            try {
                sprrvm sprrvm3;
                sprfvg sprfvg2;
                byte[] byArray;
                void var10_10;
                Object object;
                sprgfl sprgfl3;
                sprlem sprlem3 = arg1.cfr_renamed_593();
                if (sproul.cfr_renamed_10716(sprlem2)) {
                    sprgei sprgei2 = new sprgei(this.cfr_renamed_3, publicKey, this.cfr_renamed_1);
                    sprgfl3 = this;
                } else if (sproul.cfr_renamed_10717(sprlem2)) {
                    object = cfr_renamed_152.cfr_renamed_10692(arg1, this.cfr_renamed_112.cfr_renamed_7413(sprlem3), this.cfr_renamed_1);
                    sprobi sprobi2 = new sprobi((byte[])object);
                    sprgfl3 = this;
                } else if (sproul.cfr_renamed_10718(sprlem2)) {
                    if (this.cfr_renamed_1 != null) {
                        sprobi sprobi3 = new sprobi(this.cfr_renamed_1);
                        sprgfl3 = this;
                    } else {
                        if (sprlem2.cfr_renamed_5078(sprdl.cfr_renamed_1596)) {
                            throw new sprlyl(sprseca.cfr_renamed_9("#g\u0013fV\u007f\u0013m\u001fz\u00114\u001bu\u0002q\u0004}\u0017xVy\u0003g\u00024\u0014qVg\u0013`Vr\u0019fVg\u0002u\u0002}\u00154\u001dq\u000fgX"));
                        }
                        Object var10_14 = null;
                        sprgfl3 = this;
                    }
                } else {
                    if (!sproul.cfr_renamed_7452(sprlem2)) throw new sprlyl(new StringBuilder().insert(0, sprseca.cfr_renamed_9("#z\u001dz\u0019c\u00184\u001dq\u000f4\u0017s\u0004q\u0013y\u0013z\u00024\u0017x\u0011{\u0004}\u0002|\u001b.V")).append(sprlem2).toString());
                    if (this.cfr_renamed_1 == null) throw new sprlyl(sprbtm.cfr_renamed_9("0'\u0000&E?\u0000-\f:\u0002t\b5\u00111\u0017=\u00048E9\u0010'\u0011t\u00071E'\u0000 E2\n&E'\u00115\u0011=\u0006t\u000e1\u001c'K"));
                    sprobi sprobi4 = new sprobi(this.cfr_renamed_1);
                    sprgfl3 = this;
                }
                Object object2 = object = (Object)sprgfl3.cfr_renamed_2.cfr_renamed_7439(sprlem2);
                ((KeyAgreement)object2).init(privateKey, (AlgorithmParameterSpec)var10_10, this.cfr_renamed_86);
                ((KeyAgreement)object2).doPhase(publicKey, true);
                SecretKey secretKey = ((KeyAgreement)object).generateSecret(sprlem3.cfr_renamed_19());
                Cipher cipher = this.cfr_renamed_2.cfr_renamed_7430(sprlem3);
                if (sprlem3.cfr_renamed_5078(sprqo.cfr_renamed_119) || sprlem3.cfr_renamed_5078(sprqo.cfr_renamed_3)) {
                    cipher.init(3, (Key)secretKey, new sprwci(sprqo.cfr_renamed_145, this.cfr_renamed_1));
                    byArray = cipher.wrap(this.cfr_renamed_2.cfr_renamed_7426(arg2));
                    sprymm sprymm2 = new sprymm(sproze.cfr_renamed_533(byArray, 0, byArray.length - 4), sproze.cfr_renamed_533(byArray, byArray.length - 4, byArray.length));
                    sprfvg2 = new sprfvg(sprymm2.cfr_renamed_104("DER"));
                    sprrvm3 = sprrvm2;
                } else {
                    cipher.init(3, (Key)secretKey, this.cfr_renamed_86);
                    byArray = cipher.wrap(this.cfr_renamed_2.cfr_renamed_7426(arg2));
                    sprfvg2 = new sprfvg(byArray);
                    sprrvm3 = sprrvm2;
                }
                sprrvm3.cfr_renamed_5004(new sprjmm(spranm2, sprfvg2));
            }
            catch (GeneralSecurityException generalSecurityException) {
                throw new sprlyl(new StringBuilder().insert(0, sprbtm.cfr_renamed_9("\u00065\u000b:\n E$\u0000&\u0003;\u00179E5\u0002&\u00001\b1\u000b E'\u00111\u0015nE")).append(generalSecurityException.getMessage()).toString(), generalSecurityException);
            }
            catch (IOException iOException) {
                throw new sprlyl(new StringBuilder().insert(0, sprseca.cfr_renamed_9("a\u0018u\u0014x\u00134\u0002{Vq\u0018w\u0019p\u00134\u0001f\u0017d\u0006q\u00124\u001dq\u000f.V")).append(iOException.getMessage()).toString(), iOException);
            }
            n2 = ++n;
        }
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprgfl cfr_renamed_4055(byte[] byArray, PublicKey publicKey) throws CertificateEncodingException {
        void arg1;
        sprgfl sprgfl2 = this;
        this.cfr_renamed_4.add(new spranm(new sprcum(byArray)));
        sprgfl2.cfr_renamed_0.add(arg1);
        return sprgfl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_10715(sprlem arg0) throws sprlyl {
        if (this.cfr_renamed_86 == null) {
            sprgfl sprgfl2 = this;
            sprgfl2.cfr_renamed_86 = new SecureRandom();
        }
        if (sproul.cfr_renamed_10716(arg0) && this.cfr_renamed_3 == null) {
            try {
                sprgfl sprgfl3 = this;
                sprvhm sprvhm2 = sprvhm.cfr_renamed_23(sprgfl3.cfr_renamed_91.getEncoded());
                AlgorithmParameters algorithmParameters = sprgfl3.cfr_renamed_2.cfr_renamed_10719(arg0);
                algorithmParameters.init(sprvhm2.cfr_renamed_593().cfr_renamed_284().cfr_renamed_119().cfr_renamed_91());
                KeyPairGenerator keyPairGenerator = sprgfl3.cfr_renamed_2.cfr_renamed_7440(arg0);
                keyPairGenerator.initialize(algorithmParameters.getParameterSpec(AlgorithmParameterSpec.class), this.cfr_renamed_86);
                sprgfl3.cfr_renamed_3 = keyPairGenerator.generateKeyPair();
                return;
            }
            catch (Exception exception) {
                throw new sprlyl(new StringBuilder().insert(0, sprbtm.cfr_renamed_9("7\u0004:\u000b;\u0011t\u00011\u00111\u00179\f:\u0000t(\u00053t\u0000$\r1\b1\u00175\tt\u000e1\u001ct\u00155\f&E$\u0004&\u00049\u0000 \u0000&\u0016t\u0003&\n9E$\u00106\t=\u0006t\u000e1\u001cnE")).append(exception).toString(), exception);
            }
        }
    }
}

