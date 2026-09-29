/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprayca;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprgp;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.spris;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmdi;
import com.spire.presentation.packages.sprnbi;
import com.spire.presentation.packages.sprnez;
import com.spire.presentation.packages.sprqhg;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrsm;
import com.spire.presentation.packages.sprsx;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.spruog;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprwr;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;

public class sprvng {
    private static final Map cfr_renamed_119;
    private static final Map cfr_renamed_91;
    private sprrr cfr_renamed_0;
    private static final Map cfr_renamed_1;
    private static final Map cfr_renamed_2;
    private static sprqhg cfr_renamed_3;
    private static final Map cfr_renamed_4;

    /*
     * Exception decompiling
     */
    public Cipher cfr_renamed_7427(sprlem arg0, Map arg1) throws sprhjg {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: non catch before exception catch block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2354)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    public Cipher cfr_renamed_7428(sprlem arg0) throws sprhjg {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: non catch before exception catch block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2354)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PublicKey cfr_renamed_7429(sprvhm arg0) throws sprhjg {
        try {
            KeyFactory keyFactory = this.cfr_renamed_0.cfr_renamed_1511(arg0.cfr_renamed_593().cfr_renamed_593().cfr_renamed_19());
            return keyFactory.generatePublic(new X509EncodedKeySpec(arg0.cfr_renamed_91()));
        }
        catch (IOException iOException) {
            throw new sprhjg(new StringBuilder().insert(0, sprayca.cfr_renamed_9("o7b8c\",1i\",3b5c2i2,0c$avc0,=i/6v")).append(iOException.getMessage()).toString(), iOException);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new sprhjg(new StringBuilder().insert(0, sprnez.cfr_renamed_9("\u0000*\r%\f?C(\u0011.\u0002?\u0006k\b.\u001ak\u0005*\u0000?\f9\u001aqC")).append(noSuchAlgorithmException.getMessage()).toString(), noSuchAlgorithmException);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new sprhjg(new StringBuilder().insert(0, sprayca.cfr_renamed_9("o7b8c\",0e8hvj7o\"c$uv|$c e2i$6v")).append(noSuchProviderException.getMessage()).toString(), noSuchProviderException);
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            throw new sprhjg(new StringBuilder().insert(0, sprnez.cfr_renamed_9("\u0000*\r%\f?C(\u0011.\u0002?\u0006k\b.\u001ak\u0005*\u0000?\f9\u001aqC")).append(invalidKeySpecException.getMessage()).toString(), invalidKeySpecException);
        }
    }

    static {
        cfr_renamed_1 = new HashMap();
        cfr_renamed_91 = new HashMap();
        cfr_renamed_119 = new HashMap();
        cfr_renamed_4 = new HashMap();
        cfr_renamed_2 = new HashMap();
        cfr_renamed_3 = new sprqhg();
        cfr_renamed_1.put(sprgt.cfr_renamed_0, "SHA1");
        cfr_renamed_1.put(sprwr.cfr_renamed_957, sprayca.cfr_renamed_9("_\u001eMd>b"));
        cfr_renamed_1.put(sprwr.cfr_renamed_1226, "SHA256");
        cfr_renamed_1.put(sprwr.cfr_renamed_112, "SHA384");
        cfr_renamed_1.put(sprwr.cfr_renamed_272, "SHA512");
        cfr_renamed_1.put(spris.cfr_renamed_91, sprnez.cfr_renamed_9("1\u00023\u000e.\u000fRy["));
        cfr_renamed_1.put(spris.cfr_renamed_272, "RIPEMD160");
        cfr_renamed_1.put(spris.cfr_renamed_102, sprayca.cfr_renamed_9("\u0004E\u0006I\u001bHd9`"));
        cfr_renamed_91.put(sprdl.cfr_renamed_1205, sprnez.cfr_renamed_9("\u00190\nL\u000e \tL\u001b(\b0z3*\u0007/\n%\u0004"));
        cfr_renamed_91.put(sprgt.cfr_renamed_152, sprayca.cfr_renamed_9("I:k7a7`yI\u0015Ny\\\u001dO\u0005=\u0006m2h?b1"));
        cfr_renamed_91.put(sprdl.cfr_renamed_1456, sprnez.cfr_renamed_9("1\u0018\"d&\b!d,\n&\u001b3*\u0007/\n%\u0004"));
        cfr_renamed_91.put(sprqo.cfr_renamed_93, "ECGOST3410");
        cfr_renamed_119.put(sprdl.cfr_renamed_152, sprayca.cfr_renamed_9("H\u0013_\u0013H\u0013[$m&"));
        cfr_renamed_119.put(sprdl.cfr_renamed_1435, sprnez.cfr_renamed_9("1\bQ\u001c\u0011*\u0013"));
        cfr_renamed_119.put(sprwr.cfr_renamed_136, sprayca.cfr_renamed_9("\u0017I\u0005[$m&"));
        cfr_renamed_119.put(sprwr.cfr_renamed_287, sprnez.cfr_renamed_9("\"\u000e0\u001c\u0011*\u0013"));
        cfr_renamed_119.put(sprwr.cfr_renamed_3, sprayca.cfr_renamed_9("\u0017I\u0005[$m&"));
        cfr_renamed_119.put(sprsx.cfr_renamed_91, sprnez.cfr_renamed_9("\b\u0002&\u0006'\u000f\"\u0002\u001c\u0011*\u0013"));
        cfr_renamed_119.put(sprsx.cfr_renamed_0, sprayca.cfr_renamed_9("O7a3`:e7[$m&"));
        cfr_renamed_119.put(sprsx.cfr_renamed_3, sprnez.cfr_renamed_9("\b\u0002&\u0006'\u000f\"\u0002\u001c\u0011*\u0013"));
        cfr_renamed_119.put(sprgp.cfr_renamed_3, sprayca.cfr_renamed_9("_\u0013I\u0012[$m&"));
        cfr_renamed_119.put(sprdl.cfr_renamed_2797, sprnez.cfr_renamed_9("\u000f&\u0018\u0006/\u0006"));
        cfr_renamed_2.put(sprdl.cfr_renamed_152, spruaf.cfr_renamed_279(192));
        cfr_renamed_2.put(sprwr.cfr_renamed_136, spruaf.cfr_renamed_279(128));
        cfr_renamed_2.put(sprwr.cfr_renamed_287, spruaf.cfr_renamed_279(192));
        cfr_renamed_2.put(sprwr.cfr_renamed_3, spruaf.cfr_renamed_279(256));
        cfr_renamed_2.put(sprsx.cfr_renamed_91, spruaf.cfr_renamed_279(128));
        cfr_renamed_2.put(sprsx.cfr_renamed_0, spruaf.cfr_renamed_279(192));
        cfr_renamed_2.put(sprsx.cfr_renamed_3, spruaf.cfr_renamed_279(256));
        cfr_renamed_2.put(sprgp.cfr_renamed_3, spruaf.cfr_renamed_279(128));
        cfr_renamed_2.put(sprdl.cfr_renamed_2797, spruaf.cfr_renamed_279(192));
        cfr_renamed_4.put(sprwr.cfr_renamed_91, sprayca.cfr_renamed_9("\u0017I\u0005"));
        cfr_renamed_4.put(sprwr.cfr_renamed_88, sprnez.cfr_renamed_9("\"\u000e0"));
        cfr_renamed_4.put(sprwr.cfr_renamed_1223, sprayca.cfr_renamed_9("\u0017I\u0005"));
        cfr_renamed_4.put(sprwr.cfr_renamed_724, sprnez.cfr_renamed_9("\"\u000e0"));
        cfr_renamed_4.put(sprdl.cfr_renamed_2797, sprayca.cfr_renamed_9("H\u0013_3h3"));
        cfr_renamed_4.put(sprdl.cfr_renamed_1479, "RC2");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Cipher cfr_renamed_7430(sprlem arg0) throws sprhjg {
        try {
            return this.cfr_renamed_0.cfr_renamed_1496(arg0.cfr_renamed_19());
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprhjg(new StringBuilder().insert(0, sprnez.cfr_renamed_9("(\u0002%\r$\u0017k\u00009\u0006*\u0017.C(\n;\u000b.\u0011qC")).append(generalSecurityException.getMessage()).toString(), generalSecurityException);
        }
    }

    public String cfr_renamed_7431(sprlem arg0) {
        String string = (String)cfr_renamed_4.get(arg0);
        if (string != null) {
            return string;
        }
        return arg0.cfr_renamed_19();
    }

    public sprvng(sprrr sprrr2) {
        this.cfr_renamed_0 = sprrr2;
    }

    public int cfr_renamed_7432(sprlem arg0) {
        return (Integer)cfr_renamed_2.get(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Signature cfr_renamed_7433(sprddm arg0) {
        try {
            AlgorithmParameters algorithmParameters;
            String string;
            sprddm sprddm2 = arg0;
            String string2 = string = sprvng.cfr_renamed_3.cfr_renamed_7250(sprddm2);
            string = new StringBuilder().insert(0, sprayca.cfr_renamed_9("B\u0019B\u0013")).append(string2.substring(string2.indexOf(sprnez.cfr_renamed_9("\u001c*\u001f+")))).toString();
            Signature signature = this.cfr_renamed_0.cfr_renamed_1539(string);
            if (!sprddm2.cfr_renamed_593().cfr_renamed_5078(sprdl.cfr_renamed_3250)) return signature;
            AlgorithmParameters algorithmParameters2 = algorithmParameters = this.cfr_renamed_0.cfr_renamed_1540(string);
            sprnbi.cfr_renamed_7434(algorithmParameters2, arg0.cfr_renamed_284());
            PSSParameterSpec pSSParameterSpec = algorithmParameters2.getParameterSpec(PSSParameterSpec.class);
            signature.setParameter(pSSParameterSpec);
            return signature;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public String cfr_renamed_7435(sprlem arg0) {
        return (String)cfr_renamed_119.get(arg0);
    }

    private /* synthetic */ boolean cfr_renamed_7436(sprszm arg0) throws GeneralSecurityException {
        if (arg0 == null || arg0.cfr_renamed_84() == 0) {
            return false;
        }
        sprrsm sprrsm2 = sprrsm.cfr_renamed_23(arg0);
        if (!sprrsm2.cfr_renamed_4596().cfr_renamed_593().cfr_renamed_5078(sprdl.cfr_renamed_135)) {
            return true;
        }
        if (!sprrsm2.cfr_renamed_579().equals(sprddm.cfr_renamed_23(sprrsm2.cfr_renamed_4596().cfr_renamed_284()))) {
            return true;
        }
        MessageDigest messageDigest = this.cfr_renamed_7437(sprrsm2.cfr_renamed_579());
        return sprrsm2.cfr_renamed_4598().intValue() != messageDigest.getDigestLength();
    }

    public MessageDigest cfr_renamed_7437(sprddm arg0) throws GeneralSecurityException {
        MessageDigest messageDigest;
        try {
            messageDigest = arg0.cfr_renamed_593().cfr_renamed_5078(sprwr.cfr_renamed_2) ? this.cfr_renamed_0.cfr_renamed_7438(new StringBuilder().insert(0, sprayca.cfr_renamed_9("\u0005D\u0017G\u0013>c:{")).append(sprktm.cfr_renamed_23(arg0.cfr_renamed_284()).cfr_renamed_97()).toString()) : (arg0.cfr_renamed_593().cfr_renamed_5078(sprwr.cfr_renamed_314) ? this.cfr_renamed_0.cfr_renamed_7438(new StringBuilder().insert(0, sprnez.cfr_renamed_9("0\u0003\"\u0000&zQsN")).append(sprktm.cfr_renamed_23(arg0.cfr_renamed_284()).cfr_renamed_97()).toString()) : this.cfr_renamed_0.cfr_renamed_7438(sprmdi.cfr_renamed_5816(arg0.cfr_renamed_593())));
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            if (cfr_renamed_1.get(arg0.cfr_renamed_593()) != null) {
                String string = (String)cfr_renamed_1.get(arg0.cfr_renamed_593());
                MessageDigest messageDigest2 = this.cfr_renamed_0.cfr_renamed_7438(string);
                return messageDigest2;
            }
            throw noSuchAlgorithmException;
        }
        return messageDigest;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public KeyAgreement cfr_renamed_7439(sprlem arg0) throws sprhjg {
        try {
            return this.cfr_renamed_0.cfr_renamed_2382(arg0.cfr_renamed_19());
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprhjg(new StringBuilder().insert(0, sprayca.cfr_renamed_9("5m8b9xvo$i7x3,=i/,7k$i3a3b\"6v")).append(generalSecurityException.getMessage()).toString(), generalSecurityException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public KeyPairGenerator cfr_renamed_7440(sprlem arg0) throws sprlyl {
        try {
            return this.cfr_renamed_0.cfr_renamed_2381(arg0.cfr_renamed_19());
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprlyl(new StringBuilder().insert(0, sprnez.cfr_renamed_9("\u0000*\r%\f?C(\u0011.\u0002?\u0006k\b.\u001ak\u0002,\u0011.\u0006&\u0006%\u0017qC")).append(generalSecurityException.getMessage()).toString(), generalSecurityException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X509Certificate cfr_renamed_7441(sprtpl arg0) throws CertificateException {
        try {
            CertificateFactory certificateFactory = this.cfr_renamed_0.cfr_renamed_1550(sprayca.cfr_renamed_9("\u000e\"c<o"));
            return (X509Certificate)certificateFactory.generateCertificate(new ByteArrayInputStream(arg0.cfr_renamed_91()));
        }
        catch (IOException iOException) {
            throw new spruog(new StringBuilder().insert(0, sprnez.cfr_renamed_9("(\u0002%\r$\u0017k\u0004.\u0017k\u0006%\u0000$\u0007.\u0007k\u0005$\u0011&C$\u0005k\u0000.\u0011?\n-\n(\u0002?\u0006qC")).append(iOException.getMessage()).toString(), iOException);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new spruog(new StringBuilder().insert(0, sprayca.cfr_renamed_9("o7b8c\",0e8hvj7o\"c$uv|$c e2i$6v")).append(noSuchProviderException.getMessage()).toString(), noSuchProviderException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Signature cfr_renamed_7442(sprddm arg0) throws GeneralSecurityException {
        sprszm sprszm2;
        Object object;
        sprddm sprddm2;
        Signature signature;
        String string = sprvng.cfr_renamed_3.cfr_renamed_7250(arg0);
        try {
            signature = this.cfr_renamed_0.cfr_renamed_1539(string);
            sprddm2 = arg0;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            if (!string.endsWith(sprnez.cfr_renamed_9("\u001c*\u001f+\u00190\n\"\u0005'\u0006$\rR"))) {
                throw noSuchAlgorithmException;
            }
            String string2 = string;
            object = new StringBuilder().insert(0, string2.substring(0, string2.indexOf(87))).append(sprayca.cfr_renamed_9("[\u001fX\u001e^\u0005M\u0005_\u0017!\u0006_\u0005")).toString();
            signature = this.cfr_renamed_0.cfr_renamed_1539((String)object);
            sprddm2 = arg0;
        }
        if (sprddm2.cfr_renamed_593().cfr_renamed_5078(sprdl.cfr_renamed_3250) && this.cfr_renamed_7436(sprszm2 = sprszm.cfr_renamed_23(arg0.cfr_renamed_284()))) {
            try {
                Object object2 = object = this.cfr_renamed_0.cfr_renamed_1540(sprnez.cfr_renamed_9("3\u00180"));
                ((AlgorithmParameters)object2).init(sprszm2.cfr_renamed_91());
                signature.setParameter(((AlgorithmParameters)object2).getParameterSpec(PSSParameterSpec.class));
                return signature;
            }
            catch (IOException iOException) {
                throw new GeneralSecurityException(new StringBuilder().insert(0, sprayca.cfr_renamed_9("y8m4`3,\"cv|$c5i%\u007fv\\\u0005_v|7~7a3x3~%6v")).append(iOException.getMessage()).toString());
            }
        }
        return signature;
    }

    public static String cfr_renamed_5816(sprlem arg0) {
        String string = sprmdi.cfr_renamed_5816(arg0);
        int n = string.indexOf(45);
        if (n > 0 && !string.startsWith(sprnez.cfr_renamed_9("\u0018+\nP"))) {
            return new StringBuilder().insert(0, string.substring(0, n)).append(string.substring(n + 1)).toString();
        }
        return string;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public AlgorithmParameters cfr_renamed_7443(sprddm arg0) throws sprhjg {
        block11: {
            var2_2 = null;
            if (arg0.cfr_renamed_593().cfr_renamed_5078(sprdl.cfr_renamed_1205)) {
                return null;
            }
            if (arg0.cfr_renamed_593().cfr_renamed_5078(sprdl.cfr_renamed_1456)) {
                try {
                    v0 = var2_2 = this.cfr_renamed_0.cfr_renamed_1540(sprayca.cfr_renamed_9("C\u0017I\u0006"));
                }
                catch (NoSuchAlgorithmException var3_3) {
                    v0 = var2_2;
                }
                catch (NoSuchProviderException var3_4) {
                    throw new sprhjg(new StringBuilder().insert(0, sprnez.cfr_renamed_9("(\u0002%\r$\u0017k\u00009\u0006*\u0017.C*\u000f,\f9\n?\u000b&C;\u00029\u0002&\u0006?\u00069\u0010qC")).append(var3_4.getMessage()).toString(), var3_4);
                }
            } else {
                v0 = var2_2;
            }
            if (v0 != null) break block11;
            try {
                v1 = var2_2 = this.cfr_renamed_0.cfr_renamed_1540(arg0.cfr_renamed_593().cfr_renamed_19());
                ** GOTO lbl25
            }
            catch (NoSuchAlgorithmException var3_5) {
                return null;
            }
            catch (NoSuchProviderException var3_6) {
                throw new sprhjg(new StringBuilder().insert(0, sprayca.cfr_renamed_9("o7b8c\",5~3m\"ivm:k9~?x>av|7~7a3x3~%6v")).append(var3_6.getMessage()).toString(), var3_6);
            }
        }
        try {
            v1 = var2_2;
lbl25:
            // 2 sources

            v1.init(arg0.cfr_renamed_284().cfr_renamed_119().cfr_renamed_91());
            return var2_2;
        }
        catch (IOException var3_7) {
            throw new sprhjg(new StringBuilder().insert(0, sprnez.cfr_renamed_9("(\u0002%\r$\u0017k\n%\n?\n*\u000f\"\u0010.C*\u000f,\f9\n?\u000b&C;\u00029\u0002&\u0006?\u00069\u0010qC")).append(var3_7.getMessage()).toString(), var3_7);
        }
    }
}

