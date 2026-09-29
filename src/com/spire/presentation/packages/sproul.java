/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdhl;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdsm;
import com.spire.presentation.packages.sprdt;
import com.spire.presentation.packages.sprdul;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprhr;
import com.spire.presentation.packages.sprhzh;
import com.spire.presentation.packages.sprip;
import com.spire.presentation.packages.sprjrl;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprnbi;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprnfg;
import com.spire.presentation.packages.sprnkp;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpfl;
import com.spire.presentation.packages.sprpsl;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprseo;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class sproul {
    private static final Map cfr_renamed_0;
    private static final Set cfr_renamed_1;
    private static final Set cfr_renamed_2;
    private static final Set cfr_renamed_3;
    private static Map<sprlem, String> cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_7434(AlgorithmParameters arg0, sprco arg1) throws sprlyl {
        try {
            sprnbi.cfr_renamed_7434(arg0, arg1);
            return;
        }
        catch (IOException iOException) {
            throw new sprlyl(sprseo.cfr_renamed_9("7' : u7;1:6<<2r4>2=';!:8r%3'387!7'!{"), iOException);
        }
    }

    public static String cfr_renamed_10749(sprlem arg0) {
        return cfr_renamed_4.get(arg0);
    }

    public static boolean cfr_renamed_10717(sprlem arg0) {
        return cfr_renamed_3.contains(arg0);
    }

    public static boolean cfr_renamed_10716(sprlem arg0) {
        return cfr_renamed_1.contains(arg0);
    }

    public static sprdul cfr_renamed_4046(String arg0) {
        if (arg0 != null) {
            return new sprdul(new sprpfl(arg0));
        }
        return new sprdul(new sprjrl());
    }

    /*
     * Exception decompiling
     */
    public static Cipher cfr_renamed_10750(sprrr arg0, sprlem arg1, Map arg2) throws sprhjg {
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

    public static boolean cfr_renamed_10718(sprlem arg0) {
        return arg0.cfr_renamed_5078(sprdl.cfr_renamed_1575) || arg0.cfr_renamed_5078(sprdl.cfr_renamed_1596);
    }

    public static sprdsm cfr_renamed_4054(X509Certificate arg0) throws CertificateEncodingException {
        sprndm sprndm2 = sprndm.cfr_renamed_23(arg0.getEncoded());
        return new sprdsm(sprndm2.cfr_renamed_102(), arg0.getSerialNumber());
    }

    public static boolean cfr_renamed_7452(sprlem arg0) {
        return cfr_renamed_2.contains(arg0);
    }

    public static int cfr_renamed_10728(sprlem arg0) {
        if (arg0.cfr_renamed_5078(sprpsl.cfr_renamed_615)) {
            return 32;
        }
        if (arg0.cfr_renamed_5078(sprpsl.cfr_renamed_1337)) {
            return 16;
        }
        if (arg0.cfr_renamed_5078(sprpsl.cfr_renamed_88)) {
            return 24;
        }
        throw new IllegalArgumentException(sprseo.cfr_renamed_9("';9;=\"<u%'3%r4>2=';!:8"));
    }

    static {
        cfr_renamed_1 = new HashSet();
        cfr_renamed_3 = new HashSet();
        cfr_renamed_2 = new HashSet();
        cfr_renamed_0 = new HashMap();
        cfr_renamed_4 = new HashMap<sprlem, String>();
        cfr_renamed_4.put(sprpsl.cfr_renamed_1337, sprnkp.cfr_renamed_9("%)7;6-4"));
        cfr_renamed_4.put(sprpsl.cfr_renamed_88, sprseo.cfr_renamed_9("\u0014\u0017\u0006\u0005\u0007\u0013\u0005"));
        cfr_renamed_4.put(sprpsl.cfr_renamed_615, sprnkp.cfr_renamed_9("%)7;6-4"));
        cfr_renamed_1.add(sprbr.cfr_renamed_96);
        cfr_renamed_1.add(sprhr.cfr_renamed_96);
        cfr_renamed_1.add(sprhr.cfr_renamed_955);
        cfr_renamed_1.add(sprhr.cfr_renamed_723);
        cfr_renamed_1.add(sprhr.cfr_renamed_135);
        cfr_renamed_3.add(sprbr.cfr_renamed_137);
        cfr_renamed_3.add(sprbr.cfr_renamed_725);
        cfr_renamed_3.add(sprhr.cfr_renamed_31);
        cfr_renamed_3.add(sprhr.cfr_renamed_952);
        cfr_renamed_3.add(sprhr.cfr_renamed_1226);
        cfr_renamed_3.add(sprhr.cfr_renamed_86);
        cfr_renamed_3.add(sprhr.cfr_renamed_119);
        cfr_renamed_3.add(sprhr.cfr_renamed_499);
        cfr_renamed_3.add(sprhr.cfr_renamed_126);
        cfr_renamed_3.add(sprhr.cfr_renamed_1228);
        cfr_renamed_2.add(sprqo.cfr_renamed_82);
        cfr_renamed_2.add(sprqo.cfr_renamed_93);
        cfr_renamed_2.add(sprdt.cfr_renamed_79);
        cfr_renamed_2.add(sprdt.cfr_renamed_93);
        cfr_renamed_2.add(sprdt.cfr_renamed_96);
        cfr_renamed_2.add(sprdt.cfr_renamed_91);
        cfr_renamed_0.put(sprdl.cfr_renamed_1205, sprseo.cfr_renamed_9("\u0000\u0006\u0013z\u0017\u0016\u0010z\u0002\u001e\u0011\u0006c\u0005316<<2"));
        cfr_renamed_0.put(sprgt.cfr_renamed_152, sprnkp.cfr_renamed_9(")\b\u000b\u0005\u0001\u0005\u0000K)'.K<//7]4\r\u0000\b\r\u0002\u0003"));
        cfr_renamed_0.put(sprdl.cfr_renamed_1456, sprseo.cfr_renamed_9("\u0007\u0001\u0014}\u0010\u0011\u0017}\u001a\u0013\u0010\u0002\u0005316<<2"));
        cfr_renamed_0.put(sprqo.cfr_renamed_93, "ECGOST3410");
        cfr_renamed_0.put(sprip.cfr_renamed_112, sprnkp.cfr_renamed_9("6?%A/87A/))A/;7"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprco cfr_renamed_2383(AlgorithmParameters arg0) throws sprlyl {
        try {
            return sprnbi.cfr_renamed_2383(arg0);
        }
        catch (IOException iOException) {
            throw new sprlyl(new StringBuilder().insert(0, sprseo.cfr_renamed_9("63;<:&u7-&'36&u\"4 4?0&0 &hu")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public static byte[] cfr_renamed_4044(X509Certificate arg0) {
        byte[] byArray = arg0.getExtensionValue(sprrdm.cfr_renamed_126.cfr_renamed_19());
        if (byArray != null) {
            return sproug.cfr_renamed_23(sproug.cfr_renamed_23(byArray).cfr_renamed_186()).cfr_renamed_186();
        }
        return null;
    }

    public static sprdul cfr_renamed_4052(Provider arg0) {
        if (arg0 != null) {
            return new sprdul(new sprdhl(arg0));
        }
        return new sprdul(new sprjrl());
    }

    public static PrivateKey cfr_renamed_10695(PrivateKey arg0) {
        if (arg0 instanceof sprhzh) {
            return sproul.cfr_renamed_10695(((sprhzh)arg0).cfr_renamed_1521());
        }
        return arg0;
    }

    public static Key cfr_renamed_7426(sprnfg arg0) {
        if (arg0.cfr_renamed_1536() instanceof Key) {
            return (Key)arg0.cfr_renamed_1536();
        }
        if (arg0.cfr_renamed_1536() instanceof byte[]) {
            return new SecretKeySpec((byte[])arg0.cfr_renamed_1536(), sprnkp.cfr_renamed_9("!\"'"));
        }
        throw new IllegalArgumentException(sprseo.cfr_renamed_9("';9;=\"<u50<0 <1u90+u&,\"0"));
    }
}

