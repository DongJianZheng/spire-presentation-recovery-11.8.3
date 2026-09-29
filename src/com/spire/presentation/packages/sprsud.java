/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbyd;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdg;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.sprfh;
import com.spire.presentation.packages.sprhn;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.spripd;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprnd;
import com.spire.presentation.packages.sproib;
import com.spire.presentation.packages.sprppba;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprwyy;
import com.spire.presentation.packages.sprzod;
import java.io.IOException;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.RC2ParameterSpec;

public class sprsud {
    public static final Map cfr_renamed_91;
    public static final Map cfr_renamed_0;
    public static final Map cfr_renamed_1;
    public static final Map cfr_renamed_2;
    private sprhn cfr_renamed_3;
    public static final Map cfr_renamed_4;

    public Cipher cfr_renamed_4042(Key arg0, sprije arg1) throws sprzod {
        return (Cipher)sprsud.cfr_renamed_4354(new sprbyd(this, arg1, arg0));
    }

    /*
     * Exception decompiling
     */
    public MessageDigest cfr_renamed_4344(sprtzd arg0) throws sprzod {
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
    public static Object cfr_renamed_4354(sprfh arg0) throws sprzod {
        try {
            return arg0.cfr_renamed_4091();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new sprzod(sprppba.cfr_renamed_9("w!zg``r)z$4!x'{2}4|-:"), noSuchAlgorithmException);
        }
        catch (InvalidKeyException invalidKeyException) {
            throw new sprzod(sprwyy.cfr_renamed_9("HkZ.J`UoOgG.J`\u0003cF}PoDk\r"), invalidKeyException);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new sprzod(sprppba.cfr_renamed_9("#u.344&}.p`d2{6}$q2:"), noSuchProviderException);
        }
        catch (NoSuchPaddingException noSuchPaddingException) {
            throw new sprzod(sprwyy.cfr_renamed_9("QkR{J|Fj\u0003~BjGgMi\u0003`Lz\u0003}V~SaQzFj\r"), noSuchPaddingException);
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new sprzod(sprppba.cfr_renamed_9("u,s/f)`(y`d!f!y%`%f34)z6u,}$:"), invalidAlgorithmParameterException);
        }
        catch (InvalidParameterSpecException invalidParameterSpecException) {
            throw new sprzod(sprwyy.cfr_renamed_9("nO`.BbDaQgWfN.SoQoNkWkQ.P~Fm\u0003gMxBbJj\r"), invalidParameterSpecException);
        }
    }

    /*
     * Exception decompiling
     */
    public Cipher cfr_renamed_4059(sprtzd arg0) throws sprzod {
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
    public AlgorithmParameterGenerator cfr_renamed_4087(sprtzd arg0) throws GeneralSecurityException {
        String string = (String)cfr_renamed_2.get(arg0);
        if (string != null) {
            try {
                return this.cfr_renamed_3.cfr_renamed_107(string);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                // empty catch block
            }
        }
        return this.cfr_renamed_3.cfr_renamed_107(arg0.cfr_renamed_19());
    }

    /*
     * Exception decompiling
     */
    public KeyGenerator cfr_renamed_4088(sprtzd arg0) throws sprzod {
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
    public KeyFactory cfr_renamed_4063(sprtzd arg0) throws sprzod {
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
    public AlgorithmParameters cfr_renamed_4068(sprtzd arg0) throws NoSuchAlgorithmException, NoSuchProviderException {
        String string = (String)cfr_renamed_2.get(arg0);
        if (string != null) {
            try {
                return this.cfr_renamed_3.cfr_renamed_1540(string);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                // empty catch block
            }
        }
        return this.cfr_renamed_3.cfr_renamed_1540(arg0.cfr_renamed_19());
    }

    /*
     * Exception decompiling
     */
    public Mac cfr_renamed_4086(sprtzd arg0) throws sprzod {
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
    public sprije cfr_renamed_1570(sprtzd arg0, AlgorithmParameters arg1) throws sprzod {
        spra spra2;
        if (arg1 == null) {
            spra2 = sprume.cfr_renamed_3;
            return new sprije(arg0, spra2);
        }
        try {
            spra2 = sproib.cfr_renamed_2383(arg1);
            return new sprije(arg0, spra2);
        }
        catch (IOException iOException) {
            throw new sprzod(new StringBuilder().insert(0, sprppba.cfr_renamed_9("#u.z/``q.w/p%40u2u-q4q2gz4")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PublicKey cfr_renamed_4352(sprdce arg0) throws sprzod {
        try {
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(arg0.cfr_renamed_91());
            sprije sprije2 = arg0.cfr_renamed_593();
            return this.cfr_renamed_4063(sprije2.cfr_renamed_593()).generatePublic(x509EncodedKeySpec);
        }
        catch (Exception exception) {
            throw new sprzod(new StringBuilder().insert(0, sprwyy.cfr_renamed_9("J`UoOgG.HkZ4\u0003")).append(exception.getMessage()).toString(), exception);
        }
    }

    static {
        cfr_renamed_2 = new HashMap();
        cfr_renamed_1 = new HashMap();
        cfr_renamed_91 = new HashMap();
        cfr_renamed_4 = new HashMap();
        cfr_renamed_0 = new HashMap();
        cfr_renamed_2.put(sprm.cfr_renamed_1262, sprppba.cfr_renamed_9("\u0004Q\u0013Q\u0004Q"));
        cfr_renamed_2.put(sprdg.cfr_renamed_287, sprwyy.cfr_renamed_9("bKp"));
        cfr_renamed_2.put(sprdg.cfr_renamed_152, sprppba.cfr_renamed_9("U\u0005G"));
        cfr_renamed_2.put(sprdg.cfr_renamed_102, sprwyy.cfr_renamed_9("bKp"));
        cfr_renamed_1.put(spripd.cfr_renamed_145, sprppba.cfr_renamed_9("P\u0005G\u0005P\u0005;\u0003V\u0003;\u0010_\u0003GuD!p$}.s"));
        cfr_renamed_1.put(spripd.spr\ufe34, sprwyy.cfr_renamed_9("Of]\fMaM\f^hMp;soGjJ`D"));
        cfr_renamed_1.put(spripd.cfr_renamed_88, sprppba.cfr_renamed_9("\u0001Q\u0013;\u0003V\u0003;\u0010_\u0003GuD!p$}.s"));
        cfr_renamed_1.put(spripd.cfr_renamed_105, sprwyy.cfr_renamed_9("Of]\fMaM\f^hMp;soGjJ`D"));
        cfr_renamed_1.put(new sprtzd(sprm.cfr_renamed_1510.cfr_renamed_19()), sprppba.cfr_renamed_9("\u0012G\u0001;\u0005W\u0002;\u0010_\u0003GqD!p$}.s"));
        cfr_renamed_91.put(sprdh.cfr_renamed_86, "SHA1");
        cfr_renamed_91.put(sprdg.spr\ufe34, sprwyy.cfr_renamed_9("]kO\u0011<\u0017"));
        cfr_renamed_91.put(sprdg.cfr_renamed_119, "SHA256");
        cfr_renamed_91.put(sprdg.cfr_renamed_112, "SHA384");
        cfr_renamed_91.put(sprdg.cfr_renamed_107, "SHA512");
        cfr_renamed_0.put(sprnd.cfr_renamed_0, "HMACSHA1");
        cfr_renamed_0.put(sprm.cfr_renamed_3249, "HMACSHA1");
        cfr_renamed_0.put(sprm.cfr_renamed_1197, sprppba.cfr_renamed_9("\bY\u0001W\u0013\\\u0001&r "));
        cfr_renamed_0.put(sprm.cfr_renamed_593, "HMACSHA256");
        cfr_renamed_0.put(sprm.cfr_renamed_1601, "HMACSHA384");
        cfr_renamed_0.put(sprm.cfr_renamed_2807, "HMACSHA512");
        cfr_renamed_4.put(sprm.cfr_renamed_1510, "RSA");
        cfr_renamed_4.put(sprtk.cfr_renamed_314, "DSA");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public AlgorithmParameters cfr_renamed_4089(sprtzd arg0, SecretKey arg1, SecureRandom arg2) throws sprzod {
        try {
            AlgorithmParameterGenerator algorithmParameterGenerator;
            AlgorithmParameterGenerator algorithmParameterGenerator2 = this.cfr_renamed_4087(arg0);
            if (!arg0.equals(spripd.cfr_renamed_2)) {
                algorithmParameterGenerator = algorithmParameterGenerator2;
                return algorithmParameterGenerator.generateParameters();
            }
            byte[] byArray = new byte[8];
            arg2.nextBytes(byArray);
            try {
                algorithmParameterGenerator2.init(new RC2ParameterSpec(arg1.getEncoded().length * 8, byArray), arg2);
                algorithmParameterGenerator = algorithmParameterGenerator2;
                return algorithmParameterGenerator.generateParameters();
            }
            catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
                throw new sprzod(new StringBuilder().insert(0, sprwyy.cfr_renamed_9("SoQoNkWkQ}\u0003iF`F|BzJaM.F|QaQ4\u0003")).append(invalidAlgorithmParameterException).toString(), invalidAlgorithmParameterException);
            }
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            return null;
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprzod(new StringBuilder().insert(0, sprppba.cfr_renamed_9("%l#q0`){.4#f%u4}.s`u,s/f)`(y`d!f!y%`%f`s%z%f!`/fz4")).append(generalSecurityException).toString(), generalSecurityException);
        }
    }

    public sprsud(sprhn sprhn2) {
        this.cfr_renamed_3 = sprhn2;
    }
}

