/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdrm;
import com.spire.presentation.packages.sprdt;
import com.spire.presentation.packages.sprebaa;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmbea;
import com.spire.presentation.packages.sprnfg;
import com.spire.presentation.packages.sprobi;
import com.spire.presentation.packages.spropm;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.spruig;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprvng;
import com.spire.presentation.packages.sprvrm;
import com.spire.presentation.packages.sprwci;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.sprxil;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryhg;
import com.spire.presentation.packages.sprymg;
import com.spire.presentation.packages.sprymm;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;

public class sprwmg
extends sprymg {
    private Map cfr_renamed_91;
    private SecureRandom cfr_renamed_0;
    private sprvng cfr_renamed_1;
    private PublicKey cfr_renamed_2;
    private static final Set cfr_renamed_3 = new HashSet();
    private static final Map cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprwmg(sprddm sprddm2, PublicKey publicKey) {
        void arg0;
        sprwmg sprwmg2 = this;
        super((sprddm)arg0);
        sprwmg sprwmg3 = this;
        sprwmg2.cfr_renamed_1 = new sprvng(new sprrul());
        sprwmg2.cfr_renamed_91 = new HashMap();
        sprwmg2.cfr_renamed_2 = publicKey;
    }

    /*
     * WARNING - void declaration
     */
    public sprwmg(PublicKey publicKey) {
        void arg0;
        sprwmg sprwmg2 = this;
        super(sprvhm.cfr_renamed_23(arg0.getEncoded()).cfr_renamed_593());
        sprwmg sprwmg3 = this;
        sprwmg2.cfr_renamed_1 = new sprvng(new sprrul());
        sprwmg2.cfr_renamed_91 = new HashMap();
        sprwmg2.cfr_renamed_2 = publicKey;
    }

    /*
     * WARNING - void declaration
     */
    public sprwmg(AlgorithmParameterSpec algorithmParameterSpec, PublicKey publicKey) {
        void arg0;
        void arg1;
        sprwmg sprwmg2 = this;
        super(sprwmg.cfr_renamed_7450((PublicKey)arg1, (AlgorithmParameterSpec)arg0));
        sprwmg sprwmg3 = this;
        sprwmg2.cfr_renamed_1 = new sprvng(new sprrul());
        sprwmg2.cfr_renamed_91 = new HashMap();
        sprwmg2.cfr_renamed_2 = publicKey;
    }

    public sprwmg(X509Certificate arg0) {
        this(arg0.getPublicKey());
    }

    static {
        cfr_renamed_3.add(sprqo.cfr_renamed_82);
        cfr_renamed_3.add(sprqo.cfr_renamed_93);
        cfr_renamed_3.add(sprdt.cfr_renamed_79);
        cfr_renamed_3.add(sprdt.cfr_renamed_93);
        cfr_renamed_3.add(sprdt.cfr_renamed_96);
        cfr_renamed_3.add(sprdt.cfr_renamed_91);
        cfr_renamed_4 = new HashMap();
        cfr_renamed_4.put("SHA1", new sprddm(sprgt.cfr_renamed_0, sprpen.cfr_renamed_4));
        cfr_renamed_4.put("SHA-1", new sprddm(sprgt.cfr_renamed_0, sprpen.cfr_renamed_4));
        cfr_renamed_4.put(sprmbea.cfr_renamed_9("pcb\u0019\u0011\u001f"), new sprddm(sprwr.cfr_renamed_957, sprpen.cfr_renamed_4));
        cfr_renamed_4.put("SHA-224", new sprddm(sprwr.cfr_renamed_957, sprpen.cfr_renamed_4));
        cfr_renamed_4.put("SHA256", new sprddm(sprwr.cfr_renamed_1226, sprpen.cfr_renamed_4));
        cfr_renamed_4.put("SHA-256", new sprddm(sprwr.cfr_renamed_1226, sprpen.cfr_renamed_4));
        cfr_renamed_4.put("SHA384", new sprddm(sprwr.cfr_renamed_112, sprpen.cfr_renamed_4));
        cfr_renamed_4.put("SHA-384", new sprddm(sprwr.cfr_renamed_112, sprpen.cfr_renamed_4));
        cfr_renamed_4.put("SHA512", new sprddm(sprwr.cfr_renamed_272, sprpen.cfr_renamed_4));
        cfr_renamed_4.put("SHA-512", new sprddm(sprwr.cfr_renamed_272, sprpen.cfr_renamed_4));
        cfr_renamed_4.put(sprebaa.cfr_renamed_9("\u001d`\u000f\u001d\u007f\u001aa\u001a|\u001c"), new sprddm(sprwr.cfr_renamed_96, sprpen.cfr_renamed_4));
        cfr_renamed_4.put(sprmbea.cfr_renamed_9("xkj\u000e\u001e\u0012\u0019\f\u0019\u0011\u001f"), new sprddm(sprwr.cfr_renamed_96, sprpen.cfr_renamed_4));
        cfr_renamed_4.put(sprebaa.cfr_renamed_9("\u001d`\u000f\u0005{\u0019|\u0000|\u001az\u0001"), new sprddm(sprwr.cfr_renamed_96, sprpen.cfr_renamed_4));
        cfr_renamed_4.put(sprmbea.cfr_renamed_9("pcb\u001e\u0012\u0019\f\u0019\u0016\u001d"), new sprddm(sprwr.cfr_renamed_499, sprpen.cfr_renamed_4));
        cfr_renamed_4.put("SHA-512/256", new sprddm(sprwr.cfr_renamed_499, sprpen.cfr_renamed_4));
        cfr_renamed_4.put(sprebaa.cfr_renamed_9("\u001d`\u000f\u0005{\u0019|\u0000|\u001dx\u0001"), new sprddm(sprwr.cfr_renamed_499, sprpen.cfr_renamed_4));
    }

    public sprwmg cfr_renamed_7451(sprlem arg0, String arg1) {
        sprwmg sprwmg2 = this;
        sprwmg2.cfr_renamed_91.put(arg0, arg1);
        return sprwmg2;
    }

    /*
     * WARNING - void declaration
     */
    public sprwmg cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_1 = new sprvng(new sprkhi((Provider)arg0));
        return this;
    }

    private static /* synthetic */ sprddm cfr_renamed_7450(PublicKey arg0, AlgorithmParameterSpec arg1) {
        if (arg1 instanceof OAEPParameterSpec) {
            OAEPParameterSpec oAEPParameterSpec = (OAEPParameterSpec)arg1;
            if (oAEPParameterSpec.getMGFAlgorithm().equals(OAEPParameterSpec.DEFAULT.getMGFAlgorithm())) {
                if (oAEPParameterSpec.getPSource() instanceof PSource.PSpecified) {
                    return new sprddm(sprdl.cfr_renamed_1456, new spropm(sprwmg.cfr_renamed_2390(oAEPParameterSpec.getDigestAlgorithm()), new sprddm(sprdl.cfr_renamed_135, sprwmg.cfr_renamed_2390(((MGF1ParameterSpec)oAEPParameterSpec.getMGFParameters()).getDigestAlgorithm())), new sprddm(sprdl.cfr_renamed_1472, new sprfvg(((PSource.PSpecified)oAEPParameterSpec.getPSource()).getValue()))));
                }
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprmbea.cfr_renamed_9("^M@MDTE\u0003{pDVY@N\u0019\u000b")).append(oAEPParameterSpec.getPSource().getAlgorithm()).toString());
            }
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprebaa.cfr_renamed_9("] C G9Fne\tnt\b")).append(oAEPParameterSpec.getMGFAlgorithm()).toString());
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprmbea.cfr_renamed_9("VEHEL\\M\u000bP[FH\u0019\u000b")).append(arg1.getClass().getName()).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_7424(sprnfg arg0) throws spryhg {
        byte[] byArray;
        byte[] byArray2 = null;
        if (sprwmg.cfr_renamed_7452(this.cfr_renamed_615().cfr_renamed_593())) {
            try {
                KeyAgreement keyAgreement;
                sprwmg sprwmg2;
                sprvrm sprvrm2;
                sprwmg sprwmg3 = this;
                sprwmg3.cfr_renamed_0 = sprybl.cfr_renamed_5688(sprwmg3.cfr_renamed_0);
                KeyPairGenerator keyPairGenerator = sprwmg3.cfr_renamed_1.cfr_renamed_7440(this.cfr_renamed_615().cfr_renamed_593());
                keyPairGenerator.initialize(((ECPublicKey)this.cfr_renamed_2).getParams(), this.cfr_renamed_0);
                KeyPair keyPair = keyPairGenerator.generateKeyPair();
                byte[] byArray3 = new byte[8];
                this.cfr_renamed_0.nextBytes(byArray3);
                sprvhm sprvhm2 = sprvhm.cfr_renamed_23(keyPair.getPublic().getEncoded());
                if (sprvhm2.cfr_renamed_593().cfr_renamed_593().cfr_renamed_5966(sprdt.cfr_renamed_112)) {
                    sprvrm2 = new sprvrm(sprdt.cfr_renamed_0, sprvhm2, byArray3);
                    sprwmg2 = this;
                } else {
                    sprvrm2 = new sprvrm(sprqo.cfr_renamed_145, sprvhm2, byArray3);
                    sprwmg2 = this;
                }
                KeyAgreement keyAgreement2 = keyAgreement = sprwmg2.cfr_renamed_1.cfr_renamed_7439(this.cfr_renamed_615().cfr_renamed_593());
                keyAgreement2.init((Key)keyPair.getPrivate(), new sprobi(sprvrm2.cfr_renamed_7453()));
                keyAgreement2.doPhase(this.cfr_renamed_2, true);
                SecretKey secretKey = keyAgreement.generateSecret(sprqo.cfr_renamed_3.cfr_renamed_19());
                byte[] byArray4 = spruig.cfr_renamed_7426(arg0).getEncoded();
                Cipher cipher = this.cfr_renamed_1.cfr_renamed_7430(sprqo.cfr_renamed_3);
                cipher.init(3, (Key)secretKey, new sprwci(sprvrm2.cfr_renamed_2105(), sprvrm2.cfr_renamed_7453()));
                byte[] byArray5 = cipher.wrap(new SecretKeySpec(byArray4, sprebaa.cfr_renamed_9("\tg\u001d|")));
                return new sprdrm(new sprymm(sproze.cfr_renamed_533(byArray5, 0, 32), sproze.cfr_renamed_533(byArray5, 32, 36)), sprvrm2).cfr_renamed_91();
            }
            catch (Exception exception) {
                throw new spryhg(new StringBuilder().insert(0, sprmbea.cfr_renamed_9("FS@NS_JDM\u000bTYB[SBML\u0003@FR\u0019\u000b")).append(exception.getMessage()).toString(), exception);
            }
        }
        Cipher cipher = this.cfr_renamed_1.cfr_renamed_7427(this.cfr_renamed_615().cfr_renamed_593(), this.cfr_renamed_91);
        AlgorithmParameters algorithmParameters = null;
        try {
            Cipher cipher2;
            if (!this.cfr_renamed_615().cfr_renamed_593().cfr_renamed_5078(sprgt.cfr_renamed_152)) {
                algorithmParameters = this.cfr_renamed_1.cfr_renamed_7443(this.cfr_renamed_615());
            }
            Cipher cipher3 = cipher;
            if (algorithmParameters != null) {
                cipher3.init(3, (Key)this.cfr_renamed_2, algorithmParameters, this.cfr_renamed_0);
                cipher2 = cipher;
            } else {
                sprwmg sprwmg4 = this;
                cipher3.init(3, (Key)sprwmg4.cfr_renamed_2, sprwmg4.cfr_renamed_0);
                cipher2 = cipher;
            }
            byArray = byArray2 = cipher2.wrap(spruig.cfr_renamed_7426(arg0));
        }
        catch (InvalidKeyException invalidKeyException) {
            byArray = byArray2;
        }
        catch (GeneralSecurityException generalSecurityException) {
            byArray = byArray2;
        }
        catch (IllegalStateException illegalStateException) {
            byArray = byArray2;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            byArray = byArray2;
        }
        catch (ProviderException providerException) {
            byArray = byArray2;
        }
        if (byArray != null) {
            return byArray2;
        }
        try {
            Cipher cipher4;
            Cipher cipher5 = cipher;
            if (algorithmParameters != null) {
                cipher5.init(1, (Key)this.cfr_renamed_2, algorithmParameters, this.cfr_renamed_0);
                cipher4 = cipher;
                return cipher4.doFinal(spruig.cfr_renamed_7426(arg0).getEncoded());
            } else {
                sprwmg sprwmg5 = this;
                cipher5.init(1, (Key)sprwmg5.cfr_renamed_2, sprwmg5.cfr_renamed_0);
                cipher4 = cipher;
            }
            return cipher4.doFinal(spruig.cfr_renamed_7426(arg0).getEncoded());
        }
        catch (InvalidKeyException invalidKeyException) {
            throw new spryhg(sprebaa.cfr_renamed_9(";F/J\"Mn\\!\b+F-Z7X:\b-G \\+F:[nC+Q"), invalidKeyException);
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new spryhg(sprmbea.cfr_renamed_9("VEBION\u0003_L\u000bFE@YZ[W\u000b@DM_FEWX\u0003@FR"), generalSecurityException);
        }
    }

    public sprwmg cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_0 = arg0;
        return this;
    }

    private static /* synthetic */ sprddm cfr_renamed_2390(String arg0) {
        sprddm sprddm2 = (sprddm)cfr_renamed_4.get(arg0);
        if (sprddm2 != null) {
            return sprddm2;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprebaa.cfr_renamed_9("] C G9FnL'O+[:\b I#Mt\b")).append(arg0).toString());
    }

    public static boolean cfr_renamed_7452(sprlem arg0) {
        return cfr_renamed_3.contains(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprwmg(AlgorithmParameters algorithmParameters, PublicKey publicKey) throws InvalidParameterSpecException {
        void arg0;
        void arg1;
        sprwmg sprwmg2 = this;
        super(sprwmg.cfr_renamed_7450((PublicKey)arg1, arg0.getParameterSpec(AlgorithmParameterSpec.class)));
        sprwmg sprwmg3 = this;
        sprwmg2.cfr_renamed_1 = new sprvng(new sprrul());
        sprwmg2.cfr_renamed_91 = new HashMap();
        sprwmg2.cfr_renamed_2 = publicKey;
    }

    /*
     * WARNING - void declaration
     */
    public sprwmg cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_1 = new sprvng(new sprxil((String)arg0));
        return this;
    }
}

