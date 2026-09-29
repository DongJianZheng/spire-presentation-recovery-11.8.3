/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprarl;
import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcsl;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprkgs;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnbi;
import com.spire.presentation.packages.sprns;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprpsl;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprtar;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.spryu;
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

public class sprpvl {
    private sprrr cfr_renamed_91;
    public static final Map cfr_renamed_0 = new HashMap();
    public static final Map cfr_renamed_1 = new HashMap();
    public static final Map cfr_renamed_2;
    public static final Map cfr_renamed_3;
    public static final Map cfr_renamed_4;

    public Cipher cfr_renamed_10701(Key arg0, sprddm arg1) throws sprcsl {
        return (Cipher)sprpvl.cfr_renamed_10968(new sprarl(this, arg1, arg0));
    }

    /*
     * Exception decompiling
     */
    public MessageDigest cfr_renamed_6520(sprlem arg0) throws sprcsl {
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
    public Mac cfr_renamed_10743(sprlem arg0) throws sprcsl {
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
    public KeyFactory cfr_renamed_10710(sprlem arg0) throws sprcsl {
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
    public AlgorithmParameters cfr_renamed_10719(sprlem arg0) throws NoSuchAlgorithmException, NoSuchProviderException {
        String string = (String)cfr_renamed_0.get(arg0);
        if (string != null) {
            try {
                return this.cfr_renamed_91.cfr_renamed_1540(string);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                // empty catch block
            }
        }
        return this.cfr_renamed_91.cfr_renamed_1540(arg0.cfr_renamed_19());
    }

    static {
        cfr_renamed_3 = new HashMap();
        cfr_renamed_2 = new HashMap();
        cfr_renamed_4 = new HashMap();
        cfr_renamed_0.put(sprdl.cfr_renamed_2797, sprkgs.cfr_renamed_9("NPYPNP"));
        cfr_renamed_0.put(sprwr.cfr_renamed_88, sprtar.cfr_renamed_9("Ne\\"));
        cfr_renamed_0.put(sprwr.cfr_renamed_1223, sprkgs.cfr_renamed_9("TOF"));
        cfr_renamed_0.put(sprwr.cfr_renamed_724, sprtar.cfr_renamed_9("Ne\\"));
        cfr_renamed_1.put(sprpsl.cfr_renamed_1222, sprkgs.cfr_renamed_9("QOFOQO:IWI:Z^IF?Ekqn|dr"));
        cfr_renamed_1.put(sprpsl.cfr_renamed_272, sprtar.cfr_renamed_9("aJs cMc pDc\\\u0015_AkDfNh"));
        cfr_renamed_1.put(sprpsl.cfr_renamed_723, sprkgs.cfr_renamed_9("KPY:IWI:Z^IF?Ekqn|dr"));
        cfr_renamed_1.put(sprpsl.cfr_renamed_102, sprtar.cfr_renamed_9("aJs cMc pDc\\\u0015_AkDfNh"));
        cfr_renamed_1.put(new sprlem(sprdl.cfr_renamed_1205.cfr_renamed_19()), sprkgs.cfr_renamed_9("XFK:OVH:Z^IF;Ekqn|dr"));
        cfr_renamed_3.put(sprgt.cfr_renamed_0, "SHA1");
        cfr_renamed_3.put(sprwr.cfr_renamed_957, sprtar.cfr_renamed_9("sGa=\u0012;"));
        cfr_renamed_3.put(sprwr.cfr_renamed_1226, "SHA256");
        cfr_renamed_3.put(sprwr.cfr_renamed_112, "SHA384");
        cfr_renamed_3.put(sprwr.cfr_renamed_272, "SHA512");
        cfr_renamed_4.put(sprns.cfr_renamed_4, "HMACSHA1");
        cfr_renamed_4.put(sprdl.cfr_renamed_1763, "HMACSHA1");
        cfr_renamed_4.put(sprdl.cfr_renamed_3240, sprkgs.cfr_renamed_9("BXKVY]K'8!"));
        cfr_renamed_4.put(sprdl.cfr_renamed_131, "HMACSHA256");
        cfr_renamed_4.put(sprdl.cfr_renamed_1223, "HMACSHA384");
        cfr_renamed_4.put(sprdl.cfr_renamed_2956, "HMACSHA512");
        cfr_renamed_2.put(sprdl.cfr_renamed_1205, "RSA");
        cfr_renamed_2.put(sprbr.cfr_renamed_84, "DSA");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object cfr_renamed_10968(spryu arg0) throws sprcsl {
        try {
            return arg0.cfr_renamed_4091();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new sprcsl(sprtar.cfr_renamed_9("lAa\u0007{\u0000iIaD/AcG`RfTgM!"), noSuchAlgorithmException);
        }
        catch (InvalidKeyException invalidKeyException) {
            throw new sprcsl(sprkgs.cfr_renamed_9("~ol*|dckycq*|d5gpyfkro;"), invalidKeyException);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new sprcsl(sprtar.cfr_renamed_9("CnN(T/FfNk\u0000\u007fR`VfDjR!"), noSuchProviderException);
        }
        catch (NoSuchPaddingException noSuchPaddingException) {
            throw new sprcsl(sprkgs.cfr_renamed_9("god\u007f|xpn5ztnqc{m5dz~5y`zeeg~pn;"), noSuchPaddingException);
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new sprcsl(sprtar.cfr_renamed_9("nLhO}I{Hb\u0000\u007fA}AbE{E}S/IaVnLfD!"), invalidAlgorithmParameterException);
        }
        catch (InvalidParameterSpecException invalidParameterSpecException) {
            throw new sprcsl(sprkgs.cfr_renamed_9("XKV*tfregcabx*ekgkxoaog*fzpi5c{|tf|n;"), invalidParameterSpecException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public AlgorithmParameterGenerator cfr_renamed_10748(sprlem arg0) throws GeneralSecurityException {
        String string = (String)cfr_renamed_0.get(arg0);
        if (string != null) {
            try {
                return this.cfr_renamed_91.cfr_renamed_107(string);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                // empty catch block
            }
        }
        return this.cfr_renamed_91.cfr_renamed_107(arg0.cfr_renamed_19());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprddm cfr_renamed_7474(sprlem arg0, AlgorithmParameters arg1) throws sprcsl {
        sprco sprco2;
        if (arg1 == null) {
            sprco2 = sprpen.cfr_renamed_4;
            return new sprddm(arg0, sprco2);
        }
        try {
            sprco2 = sprnbi.cfr_renamed_2383(arg1);
            return new sprddm(arg0, sprco2);
        }
        catch (IOException iOException) {
            throw new sprcsl(new StringBuilder().insert(0, sprtar.cfr_renamed_9("CnNaO{\u0000jNlOkE/PnRnMjTjR|\u001a/")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public sprpvl(sprrr sprrr2) {
        this.cfr_renamed_91 = sprrr2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public AlgorithmParameters cfr_renamed_10747(sprlem arg0, SecretKey arg1, SecureRandom arg2) throws sprcsl {
        try {
            AlgorithmParameterGenerator algorithmParameterGenerator;
            AlgorithmParameterGenerator algorithmParameterGenerator2 = this.cfr_renamed_10748(arg0);
            if (!arg0.cfr_renamed_5078(sprpsl.cfr_renamed_3)) {
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
                throw new sprcsl(new StringBuilder().insert(0, sprkgs.cfr_renamed_9("ekgkxoaogy5mpdpxt~|e{*pxgeg05")).append(invalidAlgorithmParameterException).toString(), invalidAlgorithmParameterException);
            }
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            return null;
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprcsl(new StringBuilder().insert(0, sprtar.cfr_renamed_9("EwCjP{I`N/C}EnTfNh\u0000nLhO}I{Hb\u0000\u007fA}AbE{E}\u0000hEaE}A{O}\u001a/")).append(generalSecurityException).toString(), generalSecurityException);
        }
    }

    /*
     * Exception decompiling
     */
    public KeyGenerator cfr_renamed_10745(sprlem arg0) throws sprcsl {
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
    public PublicKey cfr_renamed_10966(sprvhm arg0) throws sprcsl {
        try {
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(arg0.cfr_renamed_91());
            sprddm sprddm2 = arg0.cfr_renamed_593();
            return this.cfr_renamed_10710(sprddm2.cfr_renamed_593()).generatePublic(x509EncodedKeySpec);
        }
        catch (Exception exception) {
            throw new sprcsl(new StringBuilder().insert(0, sprtar.cfr_renamed_9("fNyAcIk\u0000dEv\u001a/")).append(exception.getMessage()).toString(), exception);
        }
    }

    /*
     * Exception decompiling
     */
    public Cipher cfr_renamed_7430(sprlem arg0) throws sprcsl {
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
}

