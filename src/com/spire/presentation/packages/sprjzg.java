/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spragm;
import com.spire.presentation.packages.sprar;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprcyg;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdm;
import com.spire.presentation.packages.sprehm;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfcm;
import com.spire.presentation.packages.sprfim;
import com.spire.presentation.packages.sprfjm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprfzg;
import com.spire.presentation.packages.sprgcm;
import com.spire.presentation.packages.sprhbm;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.sprhrm;
import com.spire.presentation.packages.sprifm;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprkrg;
import com.spire.presentation.packages.sprlam;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmah;
import com.spire.presentation.packages.sprmwg;
import com.spire.presentation.packages.sprnhm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproyl;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpaz;
import com.spire.presentation.packages.sprprg;
import com.spire.presentation.packages.sprrim;
import com.spire.presentation.packages.sprrk;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprtem;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprtu;
import com.spire.presentation.packages.sprvbh;
import com.spire.presentation.packages.sprvdm;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprwcm;
import com.spire.presentation.packages.sprxil;
import com.spire.presentation.packages.sprxu;
import com.spire.presentation.packages.sprxyy;
import com.spire.presentation.packages.sprzkl;
import java.io.IOException;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Date;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import javax.crypto.spec.DHPublicKeySpec;

public class sprjzg {
    private static final int cfr_renamed_0 = 32;
    private sprcyg cfr_renamed_1;
    private sprrk cfr_renamed_2;
    private static final sprfzg cfr_renamed_3 = new sprfzg(8, 7);
    private static final int cfr_renamed_4 = 32;

    public sprmah cfr_renamed_7964(sprvbh arg0, PrivateKey arg1) throws sprtqg {
        sprar sprar2 = this.cfr_renamed_7967(arg0, arg1);
        return new sprmah(arg0.cfr_renamed_7541(), arg0.cfr_renamed_7735(), sprar2);
    }

    private /* synthetic */ PublicKey cfr_renamed_7968(String arg0, sprvhm arg1) throws GeneralSecurityException, IOException, sprtqg {
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(arg1.cfr_renamed_91());
        return this.cfr_renamed_7969(arg0, x509EncodedKeySpec);
    }

    private /* synthetic */ sprfzg cfr_renamed_7970(sprdm arg0) {
        if (null == arg0) {
            return cfr_renamed_3;
        }
        return (sprfzg)arg0;
    }

    public sprvbh cfr_renamed_7966(int arg0, sprdm arg1, PublicKey arg2, Date arg3) throws sprtqg {
        sprar sprar2 = this.cfr_renamed_7971(arg0, arg1, arg2, arg3);
        return new sprvbh(new sprifm(arg0, arg3, sprar2), this.cfr_renamed_2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprar cfr_renamed_7967(sprvbh arg0, PrivateKey arg1) throws sprtqg {
        switch (arg0.cfr_renamed_593()) {
            case 17: {
                DSAPrivateKey dSAPrivateKey = (DSAPrivateKey)arg1;
                return new sproyl(dSAPrivateKey.getX());
            }
            case 18: {
                if (arg1 instanceof ECPrivateKey) {
                    ECPrivateKey eCPrivateKey = (ECPrivateKey)arg1;
                    return new sprgcm(eCPrivateKey.getS());
                }
                sprcom sprcom2 = sprcom.cfr_renamed_23(arg1.getEncoded());
                try {
                    return new sprgcm(new BigInteger(1, sproze.cfr_renamed_537(sproug.cfr_renamed_23(sprcom2.cfr_renamed_1229()).cfr_renamed_186())));
                }
                catch (IOException iOException) {
                    throw new sprtqg(iOException.getMessage(), iOException);
                }
            }
            case 19: {
                ECPrivateKey eCPrivateKey = (ECPrivateKey)arg1;
                return new sprgcm(eCPrivateKey.getS());
            }
            case 22: {
                sprcom sprcom3 = sprcom.cfr_renamed_23(arg1.getEncoded());
                try {
                    return new spragm(new BigInteger(1, sproug.cfr_renamed_23(sprcom3.cfr_renamed_1229()).cfr_renamed_186()));
                }
                catch (IOException iOException) {
                    throw new sprtqg(iOException.getMessage(), iOException);
                }
            }
            case 16: 
            case 20: {
                DHPrivateKey dHPrivateKey = (DHPrivateKey)arg1;
                return new sprlam(dHPrivateKey.getX());
            }
            case 1: 
            case 2: 
            case 3: {
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey)arg1;
                return new sprhbm(rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ());
            }
        }
        throw new sprtqg(sprpaz.cfr_renamed_9("Q/O/K6JaO$]aG-E2W"));
    }

    private /* synthetic */ PrivateKey cfr_renamed_7972(String arg0, sprtem arg1, sprgcm arg2) throws GeneralSecurityException, sprtqg {
        ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(arg2.cfr_renamed_1980(), this.cfr_renamed_7973(arg1.cfr_renamed_7813()));
        return this.cfr_renamed_7974(arg0, eCPrivateKeySpec);
    }

    private /* synthetic */ PrivateKey cfr_renamed_7974(String arg0, KeySpec arg1) throws GeneralSecurityException, sprtqg {
        return this.cfr_renamed_1.cfr_renamed_1511(arg0).generatePrivate(arg1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PublicKey cfr_renamed_7926(sprvbh arg0) throws sprtqg {
        sprifm sprifm2 = arg0.cfr_renamed_7735();
        try {
            switch (sprifm2.cfr_renamed_593()) {
                case 17: {
                    sprfjm sprfjm2 = (sprfjm)sprifm2.cfr_renamed_1521();
                    DSAPublicKeySpec dSAPublicKeySpec = new DSAPublicKeySpec(sprfjm2.spr\u3181(), sprfjm2.cfr_renamed_1155(), sprfjm2.cfr_renamed_1604(), sprfjm2.cfr_renamed_1145());
                    return this.cfr_renamed_7969("DSA", dSAPublicKeySpec);
                }
                case 18: {
                    sprvdm sprvdm2 = (sprvdm)sprifm2.cfr_renamed_1521();
                    if (!sprvdm2.cfr_renamed_7813().cfr_renamed_5078(sprhrm.cfr_renamed_2)) {
                        return this.cfr_renamed_7975(sprxyy.cfr_renamed_9("fsgx"), sprvdm2);
                    }
                    byte[] byArray = sprhdf.cfr_renamed_514(sprvdm2.cfr_renamed_7976());
                    if (byArray.length >= 1 && 64 == byArray[0]) {
                        return this.cfr_renamed_7968(sprpaz.cfr_renamed_9("|\u0005l"), new sprvhm(new sprddm(sprtu.cfr_renamed_3), sproze.cfr_renamed_533(byArray, 1, byArray.length)));
                    }
                    throw new IllegalArgumentException(sprxyy.cfr_renamed_9("yMFB\\JT\u0003sVBUU\u0011\u0005\u0016\u0001\u001a\u0010SEA\\JS\u0003[FI"));
                }
                case 19: {
                    return this.cfr_renamed_7975(sprpaz.cfr_renamed_9("a\u0002`\u0012e"), (sprrim)sprifm2.cfr_renamed_1521());
                }
                case 22: {
                    sprfcm sprfcm2 = (sprfcm)sprifm2.cfr_renamed_1521();
                    byte[] byArray = sprhdf.cfr_renamed_514(sprfcm2.cfr_renamed_7976());
                    if (byArray.length >= 1 && 64 == byArray[0]) {
                        return this.cfr_renamed_7968(sprpaz.cfr_renamed_9("a%`\u0012e"), new sprvhm(new sprddm(sprtu.cfr_renamed_0), sproze.cfr_renamed_533(byArray, 1, byArray.length)));
                    }
                    throw new IllegalArgumentException(sprxyy.cfr_renamed_9("j^UQOYG\u0010fT\u0011\u0005\u0016\u0001\u001a\u0010SEA\\JS\u0003[FI"));
                }
                case 16: 
                case 20: {
                    sprehm sprehm2 = (sprehm)sprifm2.cfr_renamed_1521();
                    DHPublicKeySpec dHPublicKeySpec = new DHPublicKeySpec(sprehm2.spr\u3181(), sprehm2.cfr_renamed_1155(), sprehm2.cfr_renamed_1145());
                    return this.cfr_renamed_7969(sprxyy.cfr_renamed_9("uOwB]B\\"), dHPublicKeySpec);
                }
                case 1: 
                case 2: 
                case 3: {
                    sprwcm sprwcm2 = (sprwcm)sprifm2.cfr_renamed_1521();
                    RSAPublicKeySpec rSAPublicKeySpec = new RSAPublicKeySpec(sprwcm2.cfr_renamed_2295(), sprwcm2.cfr_renamed_2296());
                    return this.cfr_renamed_7969("RSA", rSAPublicKeySpec);
                }
            }
            throw new sprtqg(new StringBuilder().insert(0, sprpaz.cfr_renamed_9("4J*J.S/\u00041Q#H(GaO$]aE-C.V(P)IaA/G.Q/P$V$@{\u0004")).append(sprifm2.cfr_renamed_593()).toString());
        }
        catch (sprtqg sprtqg2) {
            throw sprtqg2;
        }
        catch (Exception exception) {
            throw new sprtqg(sprxyy.cfr_renamed_9("U[SF@WYL^\u0003SL^PDQE@DJ^D\u0010SEA\\JS\u0003[FI"), exception);
        }
    }

    private /* synthetic */ PublicKey cfr_renamed_7975(String arg0, sprtem arg1) throws GeneralSecurityException, IOException, sprtqg {
        sprtem sprtem2 = arg1;
        sprlem sprlem2 = sprtem2.cfr_renamed_7813();
        sprhfm sprhfm2 = sprkrg.cfr_renamed_7928(sprlem2);
        spreuh spreuh2 = sprkrg.cfr_renamed_7977(sprtem2.cfr_renamed_7976(), sprhfm2.cfr_renamed_1769());
        ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(new ECPoint(spreuh2.cfr_renamed_1969().cfr_renamed_1779(), spreuh2.cfr_renamed_1973().cfr_renamed_1779()), this.cfr_renamed_7978(sprlem2, sprhfm2));
        return this.cfr_renamed_7969(arg0, eCPublicKeySpec);
    }

    /*
     * WARNING - void declaration
     */
    public sprjzg cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_1 = new sprcyg(new sprxil((String)arg0));
        return this;
    }

    private /* synthetic */ PrivateKey cfr_renamed_7979(String arg0, sprcom arg1) throws GeneralSecurityException, IOException, sprtqg {
        PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(arg1.cfr_renamed_91());
        return this.cfr_renamed_7974(arg0, pKCS8EncodedKeySpec);
    }

    private /* synthetic */ ECParameterSpec cfr_renamed_7978(sprlem arg0, sprhfm arg1) throws InvalidParameterSpecException, NoSuchProviderException, NoSuchAlgorithmException {
        AlgorithmParameters algorithmParameters;
        AlgorithmParameters algorithmParameters2 = algorithmParameters = this.cfr_renamed_1.cfr_renamed_1540("EC");
        AlgorithmParameters algorithmParameters3 = algorithmParameters;
        algorithmParameters2.init(new ECGenParameterSpec(sprnhm.cfr_renamed_7555(arg0)));
        return algorithmParameters2.getParameterSpec(ECParameterSpec.class);
    }

    public sprvbh cfr_renamed_7962(int arg0, PublicKey arg1, Date arg2) throws sprtqg {
        return this.cfr_renamed_7966(arg0, null, arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public sprjzg cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_1 = new sprcyg(new sprkhi((Provider)arg0));
        return this;
    }

    private /* synthetic */ ECParameterSpec cfr_renamed_7973(sprlem arg0) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidParameterSpecException {
        sprlem sprlem2 = arg0;
        return this.cfr_renamed_7978(sprlem2, sprkrg.cfr_renamed_7928(sprlem2));
    }

    private /* synthetic */ PublicKey cfr_renamed_7969(String arg0, KeySpec arg1) throws GeneralSecurityException, sprtqg {
        return this.cfr_renamed_1.cfr_renamed_1511(arg0).generatePublic(arg1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PrivateKey cfr_renamed_7934(sprmah arg0) throws sprtqg {
        if (arg0 instanceof sprprg) {
            return ((sprprg)arg0).cfr_renamed_1369();
        }
        sprmah sprmah2 = arg0;
        sprifm sprifm2 = sprmah2.cfr_renamed_7735();
        sprar sprar2 = sprmah2.cfr_renamed_7758();
        try {
            switch (sprifm2.cfr_renamed_593()) {
                case 17: {
                    sprfjm sprfjm2 = (sprfjm)sprifm2.cfr_renamed_1521();
                    sproyl sproyl2 = (sproyl)sprar2;
                    DSAPrivateKeySpec dSAPrivateKeySpec = new DSAPrivateKeySpec(sproyl2.cfr_renamed_1980(), sprfjm2.cfr_renamed_1155(), sprfjm2.cfr_renamed_1604(), sprfjm2.cfr_renamed_1145());
                    return this.cfr_renamed_7974("DSA", dSAPrivateKeySpec);
                }
                case 18: {
                    sprvdm sprvdm2 = (sprvdm)sprifm2.cfr_renamed_1521();
                    sprgcm sprgcm2 = (sprgcm)sprar2;
                    if (sprhrm.cfr_renamed_2.cfr_renamed_5078(sprvdm2.cfr_renamed_7813())) {
                        return this.cfr_renamed_7979(sprpaz.cfr_renamed_9("|\u0005l"), new sprcom(new sprddm(sprtu.cfr_renamed_3), new sprfvg(sproze.cfr_renamed_5249(sprhdf.cfr_renamed_514(sprgcm2.cfr_renamed_1980())))));
                    }
                    return this.cfr_renamed_7972(sprxyy.cfr_renamed_9("fsgx"), sprvdm2, sprgcm2);
                }
                case 19: {
                    return this.cfr_renamed_7972(sprpaz.cfr_renamed_9("a\u0002`\u0012e"), (sprrim)sprifm2.cfr_renamed_1521(), (sprgcm)sprar2);
                }
                case 22: {
                    spragm spragm2 = (spragm)sprar2;
                    return this.cfr_renamed_7979(sprxyy.cfr_renamed_9("uGtpq"), new sprcom(new sprddm(sprtu.cfr_renamed_0), new sprfvg(sprhdf.cfr_renamed_512(32, spragm2.cfr_renamed_1980()))));
                }
                case 16: 
                case 20: {
                    sprehm sprehm2 = (sprehm)sprifm2.cfr_renamed_1521();
                    sprlam sprlam2 = (sprlam)sprar2;
                    DHPrivateKeySpec dHPrivateKeySpec = new DHPrivateKeySpec(sprlam2.cfr_renamed_1980(), sprehm2.cfr_renamed_1155(), sprehm2.cfr_renamed_1145());
                    return this.cfr_renamed_7974(sprpaz.cfr_renamed_9("a-c I H"), dHPrivateKeySpec);
                }
                case 1: 
                case 2: 
                case 3: {
                    sprwcm sprwcm2 = (sprwcm)sprifm2.cfr_renamed_1521();
                    sprhbm sprhbm2 = (sprhbm)sprar2;
                    RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec = new RSAPrivateCrtKeySpec(sprhbm2.cfr_renamed_2295(), sprwcm2.cfr_renamed_2296(), sprhbm2.cfr_renamed_2299(), sprhbm2.cfr_renamed_7980(), sprhbm2.cfr_renamed_7981(), sprhbm2.cfr_renamed_7982(), sprhbm2.cfr_renamed_7983(), sprhbm2.cfr_renamed_7984());
                    return this.cfr_renamed_7974("RSA", rSAPrivateCrtKeySpec);
                }
            }
            throw new sprtqg(new StringBuilder().insert(0, sprxyy.cfr_renamed_9("V^H^LGM\u0010SEA\\JS\u0003[FI\u0003QOWLBJDK]\u0003UMSLEMDFBFT\u0019\u0010")).append(sprifm2.cfr_renamed_593()).toString());
        }
        catch (sprtqg sprtqg2) {
            throw sprtqg2;
        }
        catch (Exception exception) {
            throw new sprtqg(sprpaz.cfr_renamed_9("\u0004\\\"A1P(K/\u0004\"K/W5V4G5M/CaO$]"), exception);
        }
    }

    public sprjzg() {
        sprjzg sprjzg2 = this;
        this.cfr_renamed_1 = new sprcyg(new sprrul());
        sprjzg2.cfr_renamed_2 = new sprmwg();
    }

    private /* synthetic */ sprar cfr_renamed_7971(int arg0, sprdm arg1, PublicKey arg2, Date arg3) throws sprtqg {
        if (arg2 instanceof RSAPublicKey) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey)arg2;
            return new sprwcm(rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
        }
        if (arg2 instanceof DSAPublicKey) {
            DSAPublicKey dSAPublicKey = (DSAPublicKey)arg2;
            DSAParams dSAParams = dSAPublicKey.getParams();
            return new sprfjm(dSAParams.getP(), dSAParams.getQ(), dSAParams.getG(), dSAPublicKey.getY());
        }
        if (arg2 instanceof DHPublicKey) {
            DHPublicKey dHPublicKey = (DHPublicKey)arg2;
            DHParameterSpec dHParameterSpec = dHPublicKey.getParams();
            return new sprehm(dHParameterSpec.getP(), dHParameterSpec.getG(), dHPublicKey.getY());
        }
        if (arg2 instanceof ECPublicKey) {
            sprvhm sprvhm2 = sprvhm.cfr_renamed_23(arg2.getEncoded());
            sprlem sprlem2 = sprlem.cfr_renamed_23(sprvhm2.cfr_renamed_593().cfr_renamed_284());
            sprzkl sprzkl2 = sprnhm.cfr_renamed_7814(sprlem2);
            sprfvg sprfvg2 = new sprfvg(sprvhm2.cfr_renamed_2314().cfr_renamed_81());
            sprfim sprfim2 = new sprfim(sprzkl2.cfr_renamed_1769(), sprfvg2);
            if (arg0 == 18) {
                sprfzg sprfzg2 = this.cfr_renamed_7970(arg1);
                return new sprvdm(sprlem2, sprfim2.cfr_renamed_2322(), sprfzg2.cfr_renamed_579(), sprfzg2.cfr_renamed_7842());
            }
            if (arg0 == 19) {
                return new sprrim(sprlem2, sprfim2.cfr_renamed_2322());
            }
            throw new sprtqg(sprxyy.cfr_renamed_9("V^H^LGM\u0010fs\u0003QOWLBJDK]"));
        }
        if (arg2.getAlgorithm().regionMatches(true, 0, sprpaz.cfr_renamed_9("a\u0005\u0016"), 0, 3)) {
            sprvhm sprvhm3 = sprvhm.cfr_renamed_23(arg2.getEncoded());
            byte[] byArray = new byte[33];
            byArray[0] = 64;
            System.arraycopy(sprvhm3.cfr_renamed_2314().cfr_renamed_81(), 0, byArray, 1, byArray.length - 1);
            return new sprfcm(sprxu.cfr_renamed_88, new BigInteger(1, byArray));
        }
        if (arg2.getAlgorithm().regionMatches(true, 0, sprxyy.cfr_renamed_9("{\u0002"), 0, 2)) {
            sprvhm sprvhm4 = sprvhm.cfr_renamed_23(arg2.getEncoded());
            byte[] byArray = new byte[33];
            byArray[0] = 64;
            System.arraycopy(sprvhm4.cfr_renamed_2314().cfr_renamed_81(), 0, byArray, 1, byArray.length - 1);
            sprfzg sprfzg3 = this.cfr_renamed_7970(arg1);
            return new sprvdm(sprhrm.cfr_renamed_2, new BigInteger(1, byArray), sprfzg3.cfr_renamed_579(), sprfzg3.cfr_renamed_7842());
        }
        throw new sprtqg(sprpaz.cfr_renamed_9("Q/O/K6JaO$]aG-E2W"));
    }
}

