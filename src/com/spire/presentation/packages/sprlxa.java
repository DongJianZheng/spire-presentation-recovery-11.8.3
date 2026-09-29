/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprae;
import com.spire.presentation.packages.sprbm;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdg;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.sprdn;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprhn;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprji;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmg;
import com.spire.presentation.packages.sproib;
import com.spire.presentation.packages.sprpza;
import com.spire.presentation.packages.sprqhe;
import com.spire.presentation.packages.sprspx;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.spryk;
import com.spire.presentation.packages.sprzmg;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
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

public class sprlxa {
    private static final Map cfr_renamed_0 = new HashMap();
    private sprhn cfr_renamed_1;
    private static final Map cfr_renamed_2 = new HashMap();
    private static final Map cfr_renamed_3 = new HashMap();
    private static final Map cfr_renamed_4 = new HashMap();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Signature cfr_renamed_1537(sprije arg0) {
        try {
            AlgorithmParameters algorithmParameters;
            String string;
            sprije sprije2 = arg0;
            String string2 = string = sprlxa.cfr_renamed_1538(sprije2);
            string = new StringBuilder().insert(0, sprspx.cfr_renamed_9("\u0004/\u0004%")).append(string2.substring(string2.indexOf(sprzmg.cfr_renamed_9("\u0005\u0015\u0006\u0014")))).toString();
            Signature signature = this.cfr_renamed_1.cfr_renamed_1539(string);
            if (!sprije2.cfr_renamed_593().equals(sprm.cfr_renamed_131)) return signature;
            AlgorithmParameters algorithmParameters2 = algorithmParameters = this.cfr_renamed_1.cfr_renamed_1540(string);
            sproib.cfr_renamed_1541(algorithmParameters2, arg0.cfr_renamed_284());
            PSSParameterSpec pSSParameterSpec = algorithmParameters2.getParameterSpec(PSSParameterSpec.class);
            signature.setParameter(pSSParameterSpec);
            return signature;
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * Exception decompiling
     */
    public Cipher cfr_renamed_1542(sprtzd arg0) throws sprfya {
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
    public PublicKey cfr_renamed_1543(sprdce arg0) throws sprfya {
        try {
            KeyFactory keyFactory = this.cfr_renamed_1.cfr_renamed_1511(arg0.cfr_renamed_593().cfr_renamed_593().cfr_renamed_19());
            return keyFactory.generatePublic(new X509EncodedKeySpec(arg0.cfr_renamed_91()));
        }
        catch (IOException iOException) {
            throw new sprfya(new StringBuilder().insert(0, sprzmg.cfr_renamed_9("1=<2=(r;7(r9<?=878r:=.?|=:r77%h|")).append(iOException.getMessage()).toString(), iOException);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new sprfya(new StringBuilder().insert(0, sprspx.cfr_renamed_9("\u0003+\u000e$\u000f>@)\u0012/\u0001>\u0005j\u000b/\u0019j\u0006+\u0003>\u000f8\u0019p@")).append(noSuchAlgorithmException.getMessage()).toString(), noSuchAlgorithmException);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new sprfya(new StringBuilder().insert(0, sprzmg.cfr_renamed_9("1=<2=(r:;26|4=1(=.+|\".=*;87.h|")).append(noSuchProviderException.getMessage()).toString(), noSuchProviderException);
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            throw new sprfya(new StringBuilder().insert(0, sprspx.cfr_renamed_9("\u0003+\u000e$\u000f>@)\u0012/\u0001>\u0005j\u000b/\u0019j\u0006+\u0003>\u000f8\u0019p@")).append(invalidKeySpecException.getMessage()).toString(), invalidKeySpecException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public AlgorithmParameters cfr_renamed_1544(sprije arg0) throws sprfya {
        AlgorithmParameters algorithmParameters;
        if (arg0.cfr_renamed_593().equals(sprm.cfr_renamed_1510)) {
            return null;
        }
        try {
            algorithmParameters = this.cfr_renamed_1.cfr_renamed_1540(arg0.cfr_renamed_593().cfr_renamed_19());
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            return null;
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new sprfya(new StringBuilder().insert(0, sprzmg.cfr_renamed_9("1=<2=(r? 93(7|3053 5&4?|\"= =?9&9 /h|")).append(noSuchProviderException.getMessage()).toString(), noSuchProviderException);
        }
        {
            algorithmParameters.init(arg0.cfr_renamed_284().cfr_renamed_119().cfr_renamed_91());
        }
        return algorithmParameters;
    }

    static {
        cfr_renamed_0.put(new sprtzd(sprzmg.cfr_renamed_9("cr`rjhbrcmaife|m|m|i")), sprspx.cfr_renamed_9("3\u0002!{7\u00034\u00022\u0019!"));
        cfr_renamed_0.put(sprm.cfr_renamed_128, sprzmg.cfr_renamed_9("\u000f\u001a\u001d`nf\u000b\u001b\b\u001a\u000e\u0001\u001d"));
        cfr_renamed_0.put(sprm.cfr_renamed_129, sprspx.cfr_renamed_9("3\u0002!xU|7\u00034\u00022\u0019!"));
        cfr_renamed_0.put(sprm.cfr_renamed_130, sprzmg.cfr_renamed_9("\u000f\u001a\u001dadf\u000b\u001b\b\u001a\u000e\u0001\u001d"));
        cfr_renamed_0.put(sprm.cfr_renamed_107, sprspx.cfr_renamed_9("3\u0002!\u007fQx7\u00034\u00022\u0019!"));
        cfr_renamed_0.put(sprji.cfr_renamed_88, sprzmg.cfr_renamed_9("\u0015\u0013\u0001\bahcm\u0005\u0015\u0006\u0014\u0015\u0013\u0001\bahcl"));
        cfr_renamed_0.put(sprji.cfr_renamed_137, sprspx.cfr_renamed_9("\r/\u00194yT{Q\u001d)\u001e(\u000f#\r/\u00194yT{P"));
        cfr_renamed_0.put(sprbm.cfr_renamed_2, sprzmg.cfr_renamed_9("\u000f\u001a\u001dc\u000b\u001b\b\u001a\f\u001e\u001d\u001b\u0012\u007f\u0019\u0011\u0018\u0001\u001d"));
        cfr_renamed_0.put(sprbm.cfr_renamed_4, sprspx.cfr_renamed_9("3\u0002!xR~7\u00034\u00020\u0006!\u0003.g%\t$\u0019!"));
        cfr_renamed_0.put(sprbm.cfr_renamed_91, sprzmg.cfr_renamed_9("\u000f\u001a\u001d`id\u000b\u001b\b\u001a\f\u001e\u001d\u001b\u0012\u007f\u0019\u0011\u0018\u0001\u001d"));
        cfr_renamed_0.put(sprbm.cfr_renamed_3, sprspx.cfr_renamed_9("3\u0002!yX~7\u00034\u00020\u0006!\u0003.g%\t$\u0019!"));
        cfr_renamed_0.put(sprbm.cfr_renamed_119, sprzmg.cfr_renamed_9("\u000f\u001a\u001dgm`\u000b\u001b\b\u001a\f\u001e\u001d\u001b\u0012\u007f\u0019\u0011\u0018\u0001\u001d"));
        cfr_renamed_0.put(sprbm.cfr_renamed_1, sprspx.cfr_renamed_9("\u0018)\u001a%\u0007${Vz7\u00034\u00020\u0006!\u0003.g%\t$\u0019!"));
        cfr_renamed_0.put(sprmg.cfr_renamed_88, sprzmg.cfr_renamed_9("\u000f\u001a\u001dc\u000b\u001b\b\u001a\u001f\u0004\u001f\u007f\u0019\u0011\u0018\u0001\u001d"));
        cfr_renamed_0.put(sprmg.cfr_renamed_272, sprspx.cfr_renamed_9("3\u0002!xR~7\u00034\u0002#\u001c#g%\t$\u0019!"));
        cfr_renamed_0.put(sprmg.cfr_renamed_1, sprzmg.cfr_renamed_9("\u000f\u001a\u001d`id\u000b\u001b\b\u001a\u001f\u0004\u001f\u007f\u0019\u0011\u0018\u0001\u001d"));
        cfr_renamed_0.put(sprmg.cfr_renamed_93, sprspx.cfr_renamed_9("3\u0002!yX~7\u00034\u0002#\u001c#g%\t$\u0019!"));
        cfr_renamed_0.put(sprmg.cfr_renamed_114, sprzmg.cfr_renamed_9("\u000f\u001a\u001dgm`\u000b\u001b\b\u001a\u001f\u0004\u001f\u007f\u0019\u0011\u0018\u0001\u001d"));
        cfr_renamed_0.put(new sprtzd(sprspx.cfr_renamed_9("{NxNrTzN{QyU~YdQdQdT")), sprzmg.cfr_renamed_9("\u001f\u0018g\u000b\u001b\b\u001a\u000e\u0001\u001d"));
        cfr_renamed_0.put(new sprtzd(sprspx.cfr_renamed_9("{NxNrTzN{QyU~YdQdQdR")), sprzmg.cfr_renamed_9("\u001f\u0018`\u000b\u001b\b\u001a\u000e\u0001\u001d"));
        cfr_renamed_0.put(new sprtzd(sprspx.cfr_renamed_9("QdRdX~PdQzP~PdTdS")), sprzmg.cfr_renamed_9("\u000f\u001a\u001dc\u000b\u001b\b\u001a\u0018\u0001\u001d"));
        cfr_renamed_0.put(sprtk.cfr_renamed_4, sprspx.cfr_renamed_9("3\u0002!{7\u00034\u0002%\t$\u0019!"));
        cfr_renamed_0.put(sprtk.cfr_renamed_134, sprzmg.cfr_renamed_9("\u000f\u001a\u001d`nf\u000b\u001b\b\u001a\u0019\u0011\u0018\u0001\u001d"));
        cfr_renamed_0.put(sprtk.cfr_renamed_91, sprspx.cfr_renamed_9("3\u0002!xU|7\u00034\u0002%\t$\u0019!"));
        cfr_renamed_0.put(sprtk.cfr_renamed_135, sprzmg.cfr_renamed_9("\u000f\u001a\u001dadf\u000b\u001b\b\u001a\u0019\u0011\u0018\u0001\u001d"));
        cfr_renamed_0.put(sprtk.cfr_renamed_136, sprspx.cfr_renamed_9("3\u0002!\u007fQx7\u00034\u0002%\t$\u0019!"));
        cfr_renamed_0.put(sprdh.cfr_renamed_112, sprzmg.cfr_renamed_9("\u000f\u001a\u001dc\u000b\u001b\b\u001a\u000e\u0001\u001d"));
        cfr_renamed_0.put(sprdh.cfr_renamed_1, sprspx.cfr_renamed_9("3\u0002!{7\u00034\u0002$\u0019!"));
        cfr_renamed_0.put(sprdg.cfr_renamed_4, sprzmg.cfr_renamed_9("\u000f\u001a\u001d`nf\u000b\u001b\b\u001a\u0018\u0001\u001d"));
        cfr_renamed_0.put(sprdg.cfr_renamed_1, sprspx.cfr_renamed_9("3\u0002!xU|7\u00034\u0002$\u0019!"));
        cfr_renamed_0.put(sprdh.cfr_renamed_86, "SHA-1");
        cfr_renamed_0.put(sprdg.spr\ufe34, "SHA-224");
        cfr_renamed_0.put(sprdg.cfr_renamed_119, "SHA-256");
        cfr_renamed_0.put(sprdg.cfr_renamed_112, "SHA-384");
        cfr_renamed_0.put(sprdg.cfr_renamed_107, "SHA-512");
        cfr_renamed_0.put(spryk.cfr_renamed_126, sprzmg.cfr_renamed_9("\u000e\u001b\f\u0017\u0011\u0016m`d"));
        cfr_renamed_0.put(spryk.cfr_renamed_91, "RIPEMD160");
        cfr_renamed_0.put(spryk.cfr_renamed_3, sprspx.cfr_renamed_9("2\u00030\u000f-\u000eR\u007fV"));
        cfr_renamed_2.put(sprm.cfr_renamed_1510, sprzmg.cfr_renamed_9("\u0000\u000f\u0013s\u0017\u001f\u0010s\u0002\u0017\u0011\u000fc\f3865<;"));
        cfr_renamed_3.put(sprm.cfr_renamed_1472, sprspx.cfr_renamed_9("\u000e%\u0019%\u000e%\u001d\u0012+\u0010"));
        cfr_renamed_3.put(sprm.cfr_renamed_1545, sprzmg.cfr_renamed_9("\u000e\u0011n\u0005.3,"));
        cfr_renamed_3.put(sprdg.cfr_renamed_185, sprspx.cfr_renamed_9("!\u000f3\u001d\u0012+\u0010"));
        cfr_renamed_3.put(sprdg.cfr_renamed_3, sprzmg.cfr_renamed_9("\u001d\u0017\u000f\u0005.3,"));
        cfr_renamed_3.put(sprdg.cfr_renamed_91, sprspx.cfr_renamed_9("!\u000f3\u001d\u0012+\u0010"));
        cfr_renamed_3.put(sprae.cfr_renamed_4, sprzmg.cfr_renamed_9("\u0011=?9>0;=\u0005.3,"));
        cfr_renamed_3.put(sprae.cfr_renamed_0, sprspx.cfr_renamed_9("\t\u0001'\u0005&\f#\u0001\u001d\u0012+\u0010"));
        cfr_renamed_3.put(sprae.cfr_renamed_91, sprzmg.cfr_renamed_9("\u0011=?9>0;=\u0005.3,"));
        cfr_renamed_3.put(sprdn.cfr_renamed_1, sprspx.cfr_renamed_9("\u0019%\u000f$\u001d\u0012+\u0010"));
        cfr_renamed_3.put(sprm.cfr_renamed_1262, sprzmg.cfr_renamed_9("\u0016\u0019\u0001969"));
        cfr_renamed_4.put(sprdg.cfr_renamed_145, sprspx.cfr_renamed_9("!\u000f3"));
        cfr_renamed_4.put(sprdg.cfr_renamed_287, sprzmg.cfr_renamed_9("\u001d\u0017\u000f"));
        cfr_renamed_4.put(sprdg.cfr_renamed_152, sprspx.cfr_renamed_9("!\u000f3"));
        cfr_renamed_4.put(sprdg.cfr_renamed_102, sprzmg.cfr_renamed_9("\u001d\u0017\u000f"));
        cfr_renamed_4.put(sprm.cfr_renamed_1262, sprspx.cfr_renamed_9("\u000e%\u0019\u0005.\u0005"));
        cfr_renamed_4.put(sprm.cfr_renamed_1435, "RC2");
    }

    private static /* synthetic */ String cfr_renamed_1538(sprije arg0) {
        spra spra2 = arg0.cfr_renamed_284();
        if (spra2 != null && !sprume.cfr_renamed_3.equals(spra2) && arg0.cfr_renamed_593().equals(sprm.cfr_renamed_131)) {
            sprqhe sprqhe2 = sprqhe.cfr_renamed_23(spra2);
            return new StringBuilder().insert(0, sproib.cfr_renamed_1546(sprqhe2.cfr_renamed_579().cfr_renamed_593())).append(sprzmg.cfr_renamed_9("\u0005\u0015\u0006\u0014\u0000\u000f\u0013\u001d\u001c\u0018\u001f\u001b\u0014m")).toString();
        }
        if (cfr_renamed_0.containsKey(arg0.cfr_renamed_593())) {
            return (String)cfr_renamed_0.get(arg0.cfr_renamed_593());
        }
        return arg0.cfr_renamed_593().cfr_renamed_19();
    }

    public sprlxa(sprhn sprhn2) {
        this.cfr_renamed_1 = sprhn2;
    }

    public String cfr_renamed_1547(sprtzd arg0) {
        String string = (String)cfr_renamed_4.get(arg0);
        if (string != null) {
            return string;
        }
        return arg0.cfr_renamed_19();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Signature cfr_renamed_1548(sprije arg0) throws GeneralSecurityException {
        try {
            return this.cfr_renamed_1.cfr_renamed_1539(sprlxa.cfr_renamed_1538(arg0));
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            if (cfr_renamed_0.get(arg0.cfr_renamed_593()) == null) throw noSuchAlgorithmException;
            String string = (String)cfr_renamed_0.get(arg0.cfr_renamed_593());
            return this.cfr_renamed_1.cfr_renamed_1539(string);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X509Certificate cfr_renamed_1549(sprcyd arg0) throws CertificateException {
        try {
            CertificateFactory certificateFactory = this.cfr_renamed_1.cfr_renamed_1550(sprspx.cfr_renamed_9("8dUzY"));
            return (X509Certificate)certificateFactory.generateCertificate(new ByteArrayInputStream(arg0.cfr_renamed_91()));
        }
        catch (IOException iOException) {
            throw new sprpza(new StringBuilder().insert(0, sprzmg.cfr_renamed_9("1=<2=(r;7(r9<?=878r:=.?|=:r?7.&5451=&9h|")).append(iOException.getMessage()).toString(), iOException);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new sprpza(new StringBuilder().insert(0, sprspx.cfr_renamed_9("\u0003+\u000e$\u000f>@)\u0012/\u0001>\u0005j\u0003/\u0012>\t,\t)\u0001>\u0005j\u0006+\u0003>\u000f8\u0019p@")).append(noSuchAlgorithmException.getMessage()).toString(), noSuchAlgorithmException);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new sprpza(new StringBuilder().insert(0, sprzmg.cfr_renamed_9("1=<2=(r:;26|4=1(=.+|\".=*;87.h|")).append(noSuchProviderException.getMessage()).toString(), noSuchProviderException);
        }
    }

    /*
     * Exception decompiling
     */
    public Cipher cfr_renamed_1551(sprtzd arg0, Map arg1) throws sprfya {
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
    public MessageDigest cfr_renamed_1552(sprije arg0) throws GeneralSecurityException {
        try {
            return this.cfr_renamed_1.cfr_renamed_1553(sproib.cfr_renamed_1546(arg0.cfr_renamed_593()));
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            if (cfr_renamed_0.get(arg0.cfr_renamed_593()) == null) throw noSuchAlgorithmException;
            String string = (String)cfr_renamed_0.get(arg0.cfr_renamed_593());
            return this.cfr_renamed_1.cfr_renamed_1553(string);
        }
    }
}

