/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprakb;
import com.spire.presentation.packages.sprasb;
import com.spire.presentation.packages.sprbfe;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprbqb;
import com.spire.presentation.packages.sprefe;
import com.spire.presentation.packages.sprfua;
import com.spire.presentation.packages.sprgjy;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprgma;
import com.spire.presentation.packages.sprgmb;
import com.spire.presentation.packages.sprgva;
import com.spire.presentation.packages.spriae;
import com.spire.presentation.packages.sprkmb;
import com.spire.presentation.packages.sprkpb;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlhe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprlsa;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprmon;
import com.spire.presentation.packages.sprmqa;
import com.spire.presentation.packages.sprnge;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprosb;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtae;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprude;
import com.spire.presentation.packages.spruib;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwge;
import com.spire.presentation.packages.spryee;
import com.spire.presentation.packages.spryke;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprzra;
import com.spire.presentation.packages.sprzrb;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;

public class sprwmb {
    public static final String cfr_renamed_114;
    public static final String cfr_renamed_96;
    public static final String cfr_renamed_105;
    private static final sprbqb cfr_renamed_137;
    public static final String cfr_renamed_79;
    public static final String cfr_renamed_107;
    public static final String cfr_renamed_132 = "2.5.29.32.0";
    public static final String cfr_renamed_102;
    public static final String cfr_renamed_93;
    public static final String[] cfr_renamed_86;
    public static final int cfr_renamed_152 = 6;
    public static final String cfr_renamed_112;
    public static final String cfr_renamed_119;
    public static final int cfr_renamed_91 = 5;
    public static final String cfr_renamed_0;
    public static final String cfr_renamed_1;
    public static final String cfr_renamed_2;
    public static final String cfr_renamed_3;
    public static final String cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_2173(spryke arg0, Object arg1, X509CRL arg2) throws sprakb {
        block31: {
            sprkra sprkra2;
            sprnge sprnge2;
            block32: {
                boolean bl;
                block30: {
                    int n;
                    int n2;
                    sprmee[] sprmeeArray;
                    boolean bl2;
                    ArrayList<sprmee> arrayList;
                    block36: {
                        boolean bl3;
                        block29: {
                            int n3;
                            sprmee[] sprmeeArray2;
                            block34: {
                                int n4;
                                block35: {
                                    block33: {
                                        Object object;
                                        sprnge2 = null;
                                        try {
                                            sprnge2 = sprnge.cfr_renamed_23(sprmqa.cfr_renamed_292(arg2, cfr_renamed_102));
                                        }
                                        catch (Exception exception) {
                                            throw new sprakb(sprgjy.cfr_renamed_9("\fi6o,t\":!s6n7s'o1s*tej*s+ne\u007f=n t6s*tey*o)~et*nex :!\u007f&u!\u007f!4"), exception);
                                        }
                                        if (sprnge2 == null) break block31;
                                        if (sprnge2.cfr_renamed_323() == null) break block32;
                                        sprkra2 = sprnge.cfr_renamed_23(sprnge2).cfr_renamed_323();
                                        arrayList = new ArrayList<sprmee>();
                                        if (((sprtae)sprkra2).cfr_renamed_324() == 0) {
                                            int n5;
                                            object = spryee.cfr_renamed_23(((sprtae)sprkra2).cfr_renamed_313()).cfr_renamed_289();
                                            int n6 = n5 = 0;
                                            while (n6 < ((sprmee[])object).length) {
                                                arrayList.add(object[n5++]);
                                                n6 = n5;
                                            }
                                        }
                                        if (((sprtae)sprkra2).cfr_renamed_324() == 1) {
                                            object = new sprlre();
                                            try {
                                                Enumeration enumeration = sprbne.cfr_renamed_23(sprbne.cfr_renamed_184(sprmqa.cfr_renamed_305(arg2).getEncoded())).cfr_renamed_329();
                                                while (enumeration.hasMoreElements()) {
                                                    ((sprlre)object).cfr_renamed_49((spra)enumeration.nextElement());
                                                }
                                            }
                                            catch (IOException iOException) {
                                                throw new sprakb(sprmon.cfr_renamed_9("!%\u0017&\u0006j\f%\u0016j\u0010/\u0003.B\t0\u0006B#\u00119\u0017/\u0010d"), iOException);
                                            }
                                            ((sprlre)object).cfr_renamed_49(((sprtae)sprkra2).cfr_renamed_313());
                                            arrayList.add(new sprmee(spruib.cfr_renamed_23(new sprpse((sprlre)object))));
                                        }
                                        bl2 = false;
                                        if (arg0.cfr_renamed_323() == null) break block33;
                                        sprkra2 = arg0.cfr_renamed_323();
                                        sprmeeArray2 = null;
                                        if (((sprtae)sprkra2).cfr_renamed_324() == 0) {
                                            sprmeeArray2 = spryee.cfr_renamed_23(((sprtae)sprkra2).cfr_renamed_313()).cfr_renamed_289();
                                        }
                                        if (((sprtae)sprkra2).cfr_renamed_324() != 1) break block34;
                                        if (arg0.cfr_renamed_2186() != null) {
                                            sprmeeArray2 = arg0.cfr_renamed_2186().cfr_renamed_289();
                                        } else {
                                            sprmeeArray2 = new sprmee[1];
                                            try {
                                                sprmeeArray2[0] = new sprmee(new spruib((sprbne)sprbne.cfr_renamed_184(sprmqa.cfr_renamed_302(arg1).getEncoded())));
                                            }
                                            catch (IOException iOException) {
                                                throw new sprakb(sprgjy.cfr_renamed_9("\u0006u0v!:+u1:7\u007f$~ey h1s#s&{1\u007fes6i0\u007f74"), iOException);
                                            }
                                        }
                                        n4 = n3 = 0;
                                        break block35;
                                    }
                                    if (arg0.cfr_renamed_2186() == null) {
                                        throw new sprakb(sprgjy.cfr_renamed_9("_,n-\u007f7:1r :&H\tS6i0\u007f7:*hen-\u007fe~,i1h,x0n,u+J*s+ne|,\u007f)~ew0i1:'\u007fey*t1{,t ~es+:\u0001s6n7s'o1s*t\u0015u,t14"));
                                    }
                                    sprmeeArray = arg0.cfr_renamed_2186().cfr_renamed_289();
                                    n = n2 = 0;
                                    break block36;
                                }
                                while (n4 < sprmeeArray2.length) {
                                    Enumeration enumeration = sprbne.cfr_renamed_23(sprmeeArray2[n3].cfr_renamed_313().cfr_renamed_119()).cfr_renamed_329();
                                    sprlre sprlre2 = new sprlre();
                                    Enumeration enumeration2 = enumeration;
                                    while (enumeration2.hasMoreElements()) {
                                        sprlre2.cfr_renamed_49((spra)enumeration.nextElement());
                                        enumeration2 = enumeration;
                                    }
                                    sprlre2.cfr_renamed_49(((sprtae)sprkra2).cfr_renamed_313());
                                    sprmeeArray2[n3++] = new sprmee(new spruib(new sprpse(sprlre2)));
                                    n4 = n3;
                                }
                            }
                            if (sprmeeArray2 != null) {
                                int n7 = n3 = 0;
                                while (n7 < sprmeeArray2.length) {
                                    if (arrayList.contains(sprmeeArray2[n3])) {
                                        bl3 = bl2 = true;
                                        break block29;
                                    }
                                    n7 = ++n3;
                                }
                            }
                            bl3 = bl2;
                        }
                        if (!bl3) {
                            throw new sprakb(sprmon.cfr_renamed_9("\u0004\rj\u000f+\u0016)\nj\u0004%\u0010j\u0001/\u0010>\u000b,\u000b)\u0003>\u0007j!\u0018.j\u000b9\u0011?\u000b$\u0005j\u0006#\u0011>\u0010#\u0000?\u0016#\r$B:\r#\f>B$\u0003'\u0007j\u0016%B)0\u0006+9\u0011?\u00078B\t0\u0006B.\u000b9\u00168\u000b(\u0017>\u000b%\fj\u0012%\u000b$\u0016d"));
                        }
                        break block32;
                    }
                    while (n < sprmeeArray.length) {
                        if (arrayList.contains(sprmeeArray[n2])) {
                            bl = bl2 = true;
                            break block30;
                        }
                        n = ++n2;
                    }
                    bl = bl2;
                }
                if (!bl) {
                    throw new sprakb(sprmon.cfr_renamed_9("\u0004\rj\u000f+\u0016)\nj\u0004%\u0010j\u0001/\u0010>\u000b,\u000b)\u0003>\u0007j!\u0018.j\u000b9\u0011?\u000b$\u0005j\u0006#\u0011>\u0010#\u0000?\u0016#\r$B:\r#\f>B$\u0003'\u0007j\u0016%B)0\u0006+9\u0011?\u00078B\t0\u0006B.\u000b9\u00168\u000b(\u0017>\u000b%\fj\u0012%\u000b$\u0016d"));
                }
            }
            sprkra2 = null;
            try {
                sprkra2 = sprwge.cfr_renamed_23(sprmqa.cfr_renamed_292((X509Extension)arg1, cfr_renamed_3));
            }
            catch (Exception exception) {
                throw new sprakb(sprgjy.cfr_renamed_9("X$i,yey*t6n7{,t1ie\u007f=n t6s*tey*o)~et*nex :!\u007f&u!\u007f!4"), exception);
            }
            if (arg1 instanceof X509Certificate) {
                if (sprnge2.cfr_renamed_306() && sprkra2 != null && ((sprwge)sprkra2).cfr_renamed_296()) {
                    throw new sprakb(sprmon.cfr_renamed_9("!\u000bB\t\u00078\u0016j!\u0018.j\r$\u000e3B)\r$\u0016+\u000b$\u0011j\u00179\u00078B)\u00078\u0016#\u0004#\u0001+\u0016/\u0011d"));
                }
                if (sprnge2.cfr_renamed_307() && (sprkra2 == null || !((sprwge)sprkra2).cfr_renamed_296())) {
                    throw new sprakb(sprgjy.cfr_renamed_9("\u0000t!:\u0006H\t:*t)cey*t1{,t6:\u0006[ey h1s#s&{1\u007f64"));
                }
            }
            if (sprnge2.cfr_renamed_308()) {
                throw new sprakb(sprmon.cfr_renamed_9("%\f&\u001b\t\r$\u0016+\u000b$\u0011\u000b\u0016>\u0010#\u0000?\u0016/!/\u0010>\u0011j\u0000%\r&\u0007+\fj\u000b9B+\u00119\u00078\u0016/\u0006d"));
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_2187(CertPath arg0, int arg1, sprkmb arg2) throws CertPathValidatorException {
        List<? extends Certificate> list = arg0.getCertificates();
        X509Certificate x509Certificate = (X509Certificate)list.get(arg1);
        int n = list.size();
        int n2 = n - arg1;
        if (!sprmqa.cfr_renamed_286(x509Certificate) || n2 >= n) {
            sprbne sprbne2;
            X500Principal x500Principal = sprmqa.cfr_renamed_282(x509Certificate);
            sprgle sprgle2 = new sprgle(x500Principal.getEncoded());
            try {
                sprbne2 = sprpse.cfr_renamed_23(sprgle2.cfr_renamed_24());
            }
            catch (Exception exception) {
                throw new CertPathValidatorException(sprgjy.cfr_renamed_9("_=y j1s*te\u007f=n7{&n,t\":6o'p y1:+{(\u007fem-\u007f+:&r y.s+}ei0x1h \u007f64"), (Throwable)exception, arg0, arg1);
            }
            {
                arg2.cfr_renamed_344(sprbne2);
                arg2.cfr_renamed_345(sprbne2);
            }
            spryee spryee2 = null;
            try {
                spryee2 = spryee.cfr_renamed_23(sprmqa.cfr_renamed_292(x509Certificate, cfr_renamed_107));
            }
            catch (Exception exception) {
                throw new CertPathValidatorException(sprgjy.cfr_renamed_9("\u0016o'p y1:$v1\u007f7t$n,l :+{(\u007fe\u007f=n t6s*tey*o)~et*nex :!\u007f&u!\u007f!4"), (Throwable)exception, arg0, arg1);
            }
            Vector vector = new spruib(sprbne2).cfr_renamed_2188(spruib.cfr_renamed_272);
            sprmee[] sprmeeArray = vector.elements();
            while (sprmeeArray.hasMoreElements()) {
                String string = (String)sprmeeArray.nextElement();
                sprmee sprmee2 = new sprmee(1, string);
                try {
                    sprkmb sprkmb2 = arg2;
                    sprmee sprmee3 = sprmee2;
                    sprkmb2.cfr_renamed_346(sprmee3);
                    sprkmb2.cfr_renamed_347(sprmee3);
                }
                catch (sprzrb sprzrb2) {
                    throw new CertPathValidatorException(sprmon.cfr_renamed_9("\u0019\u0017(\u00168\u0007/B)\n/\u0001!B,\r8B)\u00078\u0016#\u0004#\u0001+\u0016/B9\u0017(\b/\u0001>B+\u000e>\u00078\f+\u0016#\u0014/B/\u000f+\u000b&B,\u0003#\u000e/\u0006d"), (Throwable)sprzrb2, arg0, arg1);
                }
            }
            if (spryee2 != null) {
                int n3;
                sprmeeArray = null;
                try {
                    sprmeeArray = spryee2.cfr_renamed_289();
                }
                catch (Exception exception) {
                    throw new CertPathValidatorException(sprgjy.cfr_renamed_9("I0x/\u007f&ne{)n h+{1s3\u007fet$w :&u+n t1iey*o)~et*nex :!\u007f&u!\u007f!4"), (Throwable)exception, arg0, arg1);
                }
                int n4 = n3 = 0;
                while (n4 < sprmeeArray.length) {
                    try {
                        arg2.cfr_renamed_346(sprmeeArray[n3]);
                        arg2.cfr_renamed_347(sprmeeArray[n3]);
                    }
                    catch (sprzrb sprzrb3) {
                        throw new CertPathValidatorException(sprmon.cfr_renamed_9("1?\u0000>\u0010/\u0007j\u0001\"\u0007)\tj\u0004%\u0010j\u0001/\u0010>\u000b,\u000b)\u0003>\u0007j\u0011?\u0000 \u0007)\u0016j\u0003&\u0016/\u0010$\u0003>\u000b<\u0007j\f+\u000f/B,\u0003#\u000e/\u0006d"), (Throwable)sprzrb3, arg0, arg1);
                    }
                    n4 = ++n3;
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Set cfr_renamed_2189(Date arg0, sprlsa arg1, X509Certificate arg2, X509CRL arg3) throws sprakb {
        HashSet hashSet = new HashSet();
        if (arg1.cfr_renamed_391()) {
            sprefe sprefe2;
            sprefe sprefe3 = null;
            try {
                sprefe3 = sprefe.cfr_renamed_23(sprmqa.cfr_renamed_292(arg2, cfr_renamed_114));
            }
            catch (sprakb sprakb2) {
                throw new sprakb(sprgjy.cfr_renamed_9("\\7\u007f6r i1:\u0006H\t: b1\u007f+i,u+:&u0v!:+u1:'\u007fe~ y*~ ~e|7u(:&\u007f7n,|,y$n 4"), sprakb2);
            }
            if (sprefe3 == null) {
                try {
                    sprefe2 = sprefe3 = sprefe.cfr_renamed_23(sprmqa.cfr_renamed_292(arg3, cfr_renamed_114));
                }
                catch (sprakb sprakb3) {
                    throw new sprakb(sprmon.cfr_renamed_9("\f\u0010/\u0011\"\u00079\u0016j!\u0018.j\u00072\u0016/\f9\u000b%\fj\u0001%\u0017&\u0006j\f%\u0016j\u0000/B.\u0007)\r.\u0007.B,\u0010%\u000fj!\u0018.d"), sprakb3);
                }
            } else {
                sprefe2 = sprefe3;
            }
            if (sprefe2 != null) {
                try {
                    sprmqa.cfr_renamed_2160(sprefe3, arg1);
                }
                catch (sprakb sprakb4) {
                    throw new sprakb(sprgjy.cfr_renamed_9("\u000buet me~ v1{eY\u0017Vev*y$n,u+iey*o)~ex :$~!\u007f!:#h*we\\7\u007f6r i1:\u0006H\t: b1\u007f+i,u+4"), sprakb4);
                }
                {
                    hashSet.addAll(sprmqa.cfr_renamed_2171(arg0, arg1, arg3));
                }
                return hashSet;
            }
        }
        return hashSet;
    }

    static {
        cfr_renamed_137 = new sprbqb();
        cfr_renamed_119 = sprude.cfr_renamed_91.cfr_renamed_19();
        cfr_renamed_1 = sprude.cfr_renamed_88.cfr_renamed_19();
        cfr_renamed_93 = sprude.cfr_renamed_105.cfr_renamed_19();
        cfr_renamed_102 = sprude.cfr_renamed_4.cfr_renamed_19();
        cfr_renamed_114 = sprude.cfr_renamed_723.cfr_renamed_19();
        cfr_renamed_0 = sprude.cfr_renamed_132.cfr_renamed_19();
        cfr_renamed_96 = sprude.cfr_renamed_126.cfr_renamed_19();
        cfr_renamed_3 = sprude.cfr_renamed_79.cfr_renamed_19();
        cfr_renamed_112 = sprude.cfr_renamed_93.cfr_renamed_19();
        cfr_renamed_107 = sprude.cfr_renamed_152.cfr_renamed_19();
        cfr_renamed_105 = sprude.cfr_renamed_31.cfr_renamed_19();
        cfr_renamed_4 = sprude.cfr_renamed_287.cfr_renamed_19();
        cfr_renamed_79 = sprude.cfr_renamed_137.cfr_renamed_19();
        cfr_renamed_2 = sprude.cfr_renamed_114.cfr_renamed_19();
        String[] stringArray = new String[11];
        stringArray[0] = sprgjy.cfr_renamed_9("o+i5\u007f&s#s ~");
        stringArray[1] = sprmon.cfr_renamed_9("!\u00073!%\u000f:\u0010%\u000f#\u0011/");
        stringArray[2] = sprgjy.cfr_renamed_9("&[\u0006u(j7u(s6\u007f");
        stringArray[3] = sprmon.cfr_renamed_9("\u0003,\u0004#\u000e#\u0003>\u000b%\f\t\n+\f-\u0007.");
        stringArray[4] = sprgjy.cfr_renamed_9("6o5\u007f7i ~ ~");
        stringArray[5] = sprmon.cfr_renamed_9("\u0001/\u00119\u0003>\u000b%\f\u0005\u0004\u0005\u0012/\u0010+\u0016#\r$");
        stringArray[6] = sprgjy.cfr_renamed_9("y h1s#s&{1\u007f\ru)~");
        stringArray[7] = "unknown";
        stringArray[8] = sprmon.cfr_renamed_9("8\u0007'\r<\u0007\f\u0010%\u000f\t0\u0006");
        stringArray[9] = sprgjy.cfr_renamed_9("5h,l,v } M,n-~7{2t");
        stringArray[10] = sprmon.cfr_renamed_9("\u0003\u000b!%\u000f:\u0010%\u000f#\u0011/");
        cfr_renamed_86 = stringArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int cfr_renamed_2190(CertPath arg0, int arg1, int arg2) throws CertPathValidatorException {
        int n;
        X509Certificate x509Certificate = (X509Certificate)arg0.getCertificates().get(arg1);
        sprooe sprooe2 = null;
        try {
            sprooe2 = sprooe.cfr_renamed_23(sprmqa.cfr_renamed_292(x509Certificate, cfr_renamed_93));
        }
        catch (Exception exception) {
            throw new sprgmb(sprgjy.cfr_renamed_9("S+r,x,ne{+chj*v,y<: b1\u007f+i,u+:&{+t*nex :!\u007f&u!\u007f!4"), (Throwable)exception, arg0, arg1);
        }
        if (sprooe2 != null && (n = sprooe2.cfr_renamed_97().intValue()) < arg2) {
            return n;
        }
        return arg2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static X509CRL cfr_renamed_2170(Set arg0, PublicKey arg1) throws sprakb {
        Iterator iterator;
        Exception exception = null;
        Iterator iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            X509CRL x509CRL = (X509CRL)iterator.next();
            try {
                x509CRL.verify(arg1);
                return x509CRL;
            }
            catch (Exception exception2) {
                exception = exception2;
                iterator2 = iterator;
            }
        }
        if (exception != null) {
            throw new sprakb(sprmon.cfr_renamed_9("!+\f$\r>B<\u00078\u000b,\u001bj\u0006/\u000e>\u0003j!\u0018.d"), exception);
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    public static int cfr_renamed_2191(CertPath arg0, int arg1, int arg2) throws CertPathValidatorException {
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
    public static PublicKey cfr_renamed_2168(X509CRL arg0, Set arg1) throws sprakb {
        Iterator iterator;
        Exception exception = null;
        Iterator iterator2 = iterator = arg1.iterator();
        while (true) {
            if (!iterator2.hasNext()) {
                throw new sprakb(sprgjy.cfr_renamed_9("\u0006{+t*nel h,|<:\u0006H\t4"), exception);
            }
            PublicKey publicKey = (PublicKey)iterator.next();
            try {
                arg0.verify(publicKey);
                return publicKey;
            }
            catch (Exception exception2) {
                exception = exception2;
                iterator2 = iterator;
                continue;
            }
            break;
        }
    }

    public static void cfr_renamed_2192(CertPath arg0, int arg1) throws CertPathValidatorException {
        boolean[] blArray = ((X509Certificate)arg0.getCertificates().get(arg1)).getKeyUsage();
        if (blArray != null && !blArray[5]) {
            throw new sprgmb(sprmon.cfr_renamed_9("+9\u0011?\u00078B)\u00078\u0016#\u0004#\u0001+\u0016/B!\u00073\u00179\u0003-\u0007j\u00072\u0016/\f9\u000b%\fj\u000b9B)\u0010#\u0016#\u0001+\u000ej\u0003$\u0006j\u0006%\u00079B$\r>B:\u00078\u000f#\u0016j\t/\u001bj\u0011#\u0005$\u000b$\u0005d"), null, arg0, arg1);
        }
    }

    public static int cfr_renamed_2193(int arg0, X509Certificate arg1) {
        if (!sprmqa.cfr_renamed_286(arg1) && arg0 != 0) {
            --arg0;
        }
        return arg0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ void cfr_renamed_2194(spryke arg0, sprlsa arg1, X509Certificate arg2, Date arg3, X509Certificate arg4, PublicKey arg5, sprosb arg6, sprasb arg7, List arg8) throws sprakb {
        Iterator iterator;
        Date date = new Date(System.currentTimeMillis());
        if (arg3.getTime() > date.getTime()) {
            throw new sprakb(sprgjy.cfr_renamed_9("L$v,~$n,u+:1s(\u007fes6:,te|0n0h 4"));
        }
        Set set = sprmqa.cfr_renamed_2165(arg0, arg2, date, arg1);
        boolean bl = false;
        sprakb sprakb2 = null;
        Iterator iterator2 = iterator = set.iterator();
        while (iterator2.hasNext() && arg6.cfr_renamed_2161() == 11 && !arg7.cfr_renamed_2162()) {
            try {
                Set<String> set2;
                X509CRL x509CRL = (X509CRL)iterator.next();
                sprasb sprasb2 = sprwmb.cfr_renamed_2166(x509CRL, arg0);
                if (!sprasb2.cfr_renamed_2167(arg7)) {
                    iterator2 = iterator;
                }
                X509CRL x509CRL2 = x509CRL;
                PublicKey publicKey = sprwmb.cfr_renamed_2168(x509CRL2, sprwmb.cfr_renamed_2169(x509CRL2, arg2, arg4, arg5, arg1, arg8));
                X509CRL x509CRL3 = null;
                if (arg1.cfr_renamed_391()) {
                    set2 = sprmqa.cfr_renamed_2171(date, arg1, x509CRL);
                    x509CRL3 = sprwmb.cfr_renamed_2170(set2, publicKey);
                }
                if (arg1.cfr_renamed_376() != 1 && arg2.getNotAfter().getTime() < x509CRL.getThisUpdate().getTime()) {
                    throw new sprakb(sprmon.cfr_renamed_9(",%B<\u0003&\u000b.B\t0\u0006B,\r8B)\u00178\u0010/\f>B>\u000b'\u0007j\u0004%\u0017$\u0006d"));
                }
                X509Certificate x509Certificate = arg2;
                sprwmb.cfr_renamed_2172(arg0, x509Certificate, x509CRL);
                sprwmb.cfr_renamed_2173(arg0, x509Certificate, x509CRL);
                X509CRL x509CRL4 = x509CRL;
                sprwmb.cfr_renamed_2174(x509CRL3, x509CRL4, arg1);
                Date date2 = arg3;
                sprwmb.cfr_renamed_2175(date2, x509CRL3, arg2, arg6, arg1);
                sprwmb.cfr_renamed_2176(date2, x509CRL4, arg2, arg6);
                if (arg6.cfr_renamed_2161() == 8) {
                    arg6.cfr_renamed_2164(11);
                }
                arg7.cfr_renamed_2177(sprasb2);
                set2 = x509CRL.getCriticalExtensionOIDs();
                if (set2 != null) {
                    Set<String> set3 = set2 = new HashSet<String>(set2);
                    set2.remove(sprude.cfr_renamed_4.cfr_renamed_19());
                    set3.remove(sprude.cfr_renamed_132.cfr_renamed_19());
                    if (!set3.isEmpty()) {
                        throw new sprakb(sprgjy.cfr_renamed_9("Y\u0017Vey*t1{,t6:0t6o5j*h1\u007f!:&h,n,y$ve\u007f=n t6s*t64"));
                    }
                }
                if (x509CRL3 != null && (set2 = x509CRL3.getCriticalExtensionOIDs()) != null) {
                    Set<String> set4 = set2 = new HashSet<String>(set2);
                    set2.remove(sprude.cfr_renamed_4.cfr_renamed_19());
                    set4.remove(sprude.cfr_renamed_132.cfr_renamed_19());
                    if (!set4.isEmpty()) {
                        throw new sprakb(sprmon.cfr_renamed_9("&/\u000e>\u0003j!\u0018.j\u0001%\f>\u0003#\f9B?\f9\u0017:\u0012%\u0010>\u0007.B)\u0010#\u0016#\u0001+\u000ej\u00072\u0016/\f9\u000b%\fd"));
                    }
                }
                bl = true;
                iterator2 = iterator;
            }
            catch (sprakb sprakb3) {
                sprakb2 = sprakb3;
                iterator2 = iterator;
            }
        }
        if (!bl) {
            throw sprakb2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_2195(CertPath arg0, int arg1, sprkmb arg2) throws CertPathValidatorException {
        sprbfe[] sprbfeArray;
        X509Certificate x509Certificate = (X509Certificate)arg0.getCertificates().get(arg1);
        sprlhe sprlhe2 = null;
        try {
            sprbfeArray = sprpse.cfr_renamed_23(sprmqa.cfr_renamed_292(x509Certificate, cfr_renamed_105));
            if (sprbfeArray != null) {
                sprlhe2 = sprlhe.cfr_renamed_23(sprbfeArray);
            }
        }
        catch (Exception exception) {
            throw new sprgmb(sprgjy.cfr_renamed_9("\u000b{(\u007fey*t6n7{,t1ie\u007f=n t6s*tey*o)~et*nex :!\u007f&u!\u007f!4"), (Throwable)exception, arg0, arg1);
        }
        if (sprlhe2 != null) {
            sprlhe sprlhe3;
            sprbfeArray = sprlhe2.cfr_renamed_348();
            if (sprbfeArray != null) {
                try {
                    arg2.cfr_renamed_349(sprbfeArray);
                    sprlhe3 = sprlhe2;
                }
                catch (Exception exception) {
                    throw new sprgmb(sprmon.cfr_renamed_9("\u001a\u00078\u000f#\u0016>\u0007.B9\u0017(\u00168\u0007/\u0011j\u0001+\f$\r>B(\u0007j\u0000?\u000b&\u0006j\u00048\r'B$\u0003'\u0007j\u0001%\f9\u00168\u0003#\f>\u0011j\u00072\u0016/\f9\u000b%\fd"), (Throwable)exception, arg0, arg1);
                }
            } else {
                sprlhe3 = sprlhe2;
            }
            sprbfe[] sprbfeArray2 = sprlhe3.cfr_renamed_350();
            if (sprbfeArray2 != null) {
                int n;
                int n2 = n = 0;
                while (n2 != sprbfeArray2.length) {
                    try {
                        arg2.cfr_renamed_351(sprbfeArray2[n]);
                    }
                    catch (Exception exception) {
                        throw new sprgmb(sprgjy.cfr_renamed_9("\u0000b&v0~ ~ei0x1h \u007f6:&{+t*nex :'o,v!:#h*wet$w :&u+i1h$s+n6: b1\u007f+i,u+4"), (Throwable)exception, arg0, arg1);
                    }
                    n2 = ++n;
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_2174(X509CRL arg0, X509CRL arg1, sprlsa arg2) throws sprakb {
        block15: {
            boolean bl;
            block18: {
                boolean bl2;
                block17: {
                    sprnge sprnge2;
                    sprnge sprnge3;
                    block16: {
                        if (arg0 == null) {
                            return;
                        }
                        sprnge3 = null;
                        try {
                            sprnge3 = sprnge.cfr_renamed_23(sprmqa.cfr_renamed_292(arg1, cfr_renamed_102));
                        }
                        catch (Exception exception) {
                            throw new sprakb(sprmon.cfr_renamed_9("+9\u0011?\u000b$\u0005j\u0006#\u0011>\u0010#\u0000?\u0016#\r$B:\r#\f>B/\u001a>\u0007$\u0011#\r$B)\r?\u000e.B$\r>B(\u0007j\u0006/\u0001%\u0006/\u0006d"), exception);
                        }
                        if (!arg2.cfr_renamed_391()) break block15;
                        if (!arg0.getIssuerX500Principal().equals(arg1.getIssuerX500Principal())) {
                            throw new sprakb(sprgjy.cfr_renamed_9("\u0006u(j)\u007f1\u007feY\u0017Ves6i0\u007f7:!u iet*new$n&re~ v1{eY\u0017Ves6i0\u007f74"));
                        }
                        sprnge2 = null;
                        try {
                            sprnge2 = sprnge.cfr_renamed_23(sprmqa.cfr_renamed_292(arg0, cfr_renamed_102));
                        }
                        catch (Exception exception) {
                            throw new sprakb(sprmon.cfr_renamed_9("\u0003\u00119\u0017#\f-B.\u000b9\u00168\u000b(\u0017>\u000b%\fj\u0012%\u000b$\u0016j\u00072\u0016/\f9\u000b%\fj\u00048\r'B.\u0007&\u0016+B\t0\u0006B)\r?\u000e.B$\r>B(\u0007j\u0006/\u0001%\u0006/\u0006d"), exception);
                        }
                        bl2 = false;
                        if (sprnge3 != null) break block16;
                        if (sprnge2 != null) break block17;
                        bl = bl2 = true;
                        break block18;
                    }
                    if (sprnge3.equals(sprnge2)) {
                        bl2 = true;
                    }
                }
                bl = bl2;
            }
            if (!bl) {
                throw new sprakb(sprgjy.cfr_renamed_9("\fi6o,t\":!s6n7s'o1s*tej*s+ne\u007f=n t6s*te|7u(:!\u007f)n$:\u0006H\t:$t!:&u(j)\u007f1\u007feY\u0017Ve~*\u007f6:+u1:({1y-4"));
            }
            sprvva sprvva2 = null;
            try {
                sprvva2 = sprmqa.cfr_renamed_292(arg1, cfr_renamed_4);
            }
            catch (sprakb sprakb2) {
                throw new sprakb(sprmon.cfr_renamed_9("#?\u0016\"\r8\u000b>\u001bj\t/\u001bj\u000b.\u0007$\u0016#\u0004#\u00078B/\u001a>\u0007$\u0011#\r$B)\r?\u000e.B$\r>B(\u0007j\u00072\u00168\u0003)\u0016/\u0006j\u00048\r'B)\r'\u0012&\u0007>\u0007j!\u0018.d"), sprakb2);
            }
            sprvva sprvva3 = null;
            try {
                sprvva3 = sprmqa.cfr_renamed_292(arg0, cfr_renamed_4);
            }
            catch (sprakb sprakb3) {
                throw new sprakb(sprgjy.cfr_renamed_9("[0n-u7s1ceq ces!\u007f+n,|,\u007f7: b1\u007f+i,u+:&u0v!:+u1:'\u007fe\u007f=n7{&n ~e|7u(:!\u007f)n$:\u0006H\t4"), sprakb3);
            }
            if (sprvva2 == null) {
                throw new sprakb(sprmon.cfr_renamed_9("\t0\u0006B+\u0017>\n%\u0010#\u00163B!\u00073B#\u0006/\f>\u000b,\u000b/\u0010j\u000b9B$\u0017&\u000ed"));
            }
            if (sprvva3 == null) {
                throw new sprakb(sprgjy.cfr_renamed_9("^ v1{eY\u0017Ve{0n-u7s1ceq ces!\u007f+n,|,\u007f7:,iet0v)4"));
            }
            if (!sprvva2.equals(sprvva3)) {
                throw new sprakb(sprmon.cfr_renamed_9("&/\u000e>\u0003j!\u0018.j\u0003?\u0016\"\r8\u000b>\u001bj\t/\u001bj\u000b.\u0007$\u0016#\u0004#\u00078B.\r/\u0011j\f%\u0016j\u000f+\u0016)\nj\u0001%\u000f:\u000e/\u0016/B\t0\u0006B+\u0017>\n%\u0010#\u00163B!\u00073B#\u0006/\f>\u000b,\u000b/\u0010d"));
            }
        }
    }

    public static int cfr_renamed_2196(CertPath arg0, int arg1, int arg2) {
        if (!sprmqa.cfr_renamed_286((X509Certificate)arg0.getCertificates().get(arg1)) && arg2 != 0) {
            return arg2 - 1;
        }
        return arg2;
    }

    public static int cfr_renamed_2197(CertPath arg0, int arg1, int arg2) {
        if (!sprmqa.cfr_renamed_286((X509Certificate)arg0.getCertificates().get(arg1)) && arg2 != 0) {
            return arg2 - 1;
        }
        return arg2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_2198(CertPath arg0, int arg1, List arg2, Set arg3) throws CertPathValidatorException {
        Iterator iterator;
        X509Certificate x509Certificate = (X509Certificate)arg0.getCertificates().get(arg1);
        Iterator iterator2 = iterator = arg2.iterator();
        while (iterator2.hasNext()) {
            try {
                ((PKIXCertPathChecker)iterator.next()).check(x509Certificate, arg3);
                iterator2 = iterator;
            }
            catch (CertPathValidatorException certPathValidatorException) {
                throw new sprgmb(sprgjy.cfr_renamed_9("[!~,n,u+{):&\u007f7n,|,y$n :5{1rey-\u007f&q he|$s)\u007f!4"), (Throwable)certPathValidatorException, arg0, arg1);
            }
        }
        if (!arg3.isEmpty()) {
            throw new sprgmb(new StringBuilder().insert(0, sprmon.cfr_renamed_9("!/\u0010>\u000b,\u000b)\u0003>\u0007j\n+\u0011j\u0017$\u0011?\u0012:\r8\u0016/\u0006j\u00018\u000b>\u000b)\u0003&B/\u001a>\u0007$\u0011#\r$Xj")).append(arg3).toString(), null, arg0, arg1);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprkpb cfr_renamed_2199(CertPath arg0, int arg1, sprkpb arg2) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate)arg0.getCertificates().get(arg1);
        sprbne sprbne2 = null;
        try {
            sprbne2 = sprpse.cfr_renamed_23(sprmqa.cfr_renamed_292(x509Certificate, cfr_renamed_119));
        }
        catch (sprakb sprakb2) {
            throw new sprgmb(sprgjy.cfr_renamed_9("Y*o)~et*neh {!:&\u007f7n,|,y$n :5u)s&s ie\u007f=n t6s*te|7u(:&\u007f7n,|,y$n 4"), (Throwable)sprakb2, arg0, arg1);
        }
        if (sprbne2 != null) return arg2;
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_2200(CertPath arg0, sprlsa arg1, int arg2, PublicKey arg3, boolean arg4, X500Principal arg5, X509Certificate arg6) throws sprgmb {
        block12: {
            var7_7 = arg0.getCertificates();
            var8_8 = (X509Certificate)var7_7.get(arg2);
            if (arg4) break block12;
            try {
                sprmqa.cfr_renamed_280(var8_8, arg3, arg1.getSigProvider());
                v0 = var8_8;
                ** GOTO lbl13
            }
            catch (GeneralSecurityException var9_9) {
                throw new sprgmb(sprmon.cfr_renamed_9("\t\r?\u000e.B$\r>B<\u0003&\u000b.\u0003>\u0007j\u0001/\u0010>\u000b,\u000b)\u0003>\u0007j\u0011#\u0005$\u0003>\u00178\u0007d"), (Throwable)var9_9, arg0, arg2);
            }
        }
        try {
            v0 = var8_8;
lbl13:
            // 2 sources

            v0.checkValidity(sprmqa.cfr_renamed_2201(arg1, arg0, arg2));
        }
        catch (CertificateExpiredException var9_10) {
            throw new sprgmb(new StringBuilder().insert(0, sprgjy.cfr_renamed_9("\u0006u0v!:+u1:3{)s!{1\u007fey h1s#s&{1\u007f\u007f:")).append(var9_10.getMessage()).toString(), (Throwable)var9_10, arg0, arg2);
        }
        catch (CertificateNotYetValidException var9_11) {
            throw new sprgmb(new StringBuilder().insert(0, sprmon.cfr_renamed_9("!%\u0017&\u0006j\f%\u0016j\u0014+\u000e#\u0006+\u0016/B)\u00078\u0016#\u0004#\u0001+\u0016/Xj")).append(var9_11.getMessage()).toString(), (Throwable)var9_11, arg0, arg2);
        }
        catch (sprakb var9_12) {
            throw new sprgmb(sprgjy.cfr_renamed_9("Y*o)~et*nel$v,~$n :1s(\u007feu#:&\u007f7n,|,y$n 4"), (Throwable)var9_12, arg0, arg2);
        }
        if (arg1.isRevocationEnabled()) {
            try {
                sprwmb.cfr_renamed_2202(arg1, var8_8, sprmqa.cfr_renamed_2201(arg1, arg0, arg2), arg6, arg3, var7_7);
                v1 = var8_8;
            }
            catch (sprakb var9_13) {
                var10_14 /* !! */  = var9_13;
                if (null != var9_13.getCause()) {
                    var10_14 /* !! */  = var9_13.getCause();
                }
                throw new sprgmb(var9_13.getMessage(), (Throwable)var10_14 /* !! */ , arg0, arg2);
            }
        } else {
            v1 = var8_8;
        }
        if (!sprmqa.cfr_renamed_302(v1).equals(arg5)) {
            throw new sprgmb(new StringBuilder().insert(0, sprmon.cfr_renamed_9("\u0003\u00119\u0017/\u0010\u0004\u0003'\u0007b")).append(sprmqa.cfr_renamed_302(var8_8)).append(sprgjy.cfr_renamed_9("3e~*\u007f6:+u1:({1y-:\u0016o'p y1T$w 2")).append(arg5).append(sprmon.cfr_renamed_9("cB%\u0004j\u0011#\u0005$\u000b$\u0005j\u0001/\u0010>\u000b,\u000b)\u0003>\u0007d")).toString(), null, arg0, arg2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprasb cfr_renamed_2166(X509CRL arg0, spryke arg1) throws sprakb {
        sprasb sprasb2;
        sprnge sprnge2;
        sprasb sprasb3;
        sprnge sprnge3 = null;
        try {
            sprnge3 = sprnge.cfr_renamed_23(sprmqa.cfr_renamed_292(arg0, cfr_renamed_102));
        }
        catch (Exception exception) {
            throw new sprakb(sprgjy.cfr_renamed_9("\fi6o,t\":!s6n7s'o1s*tej*s+ne\u007f=n t6s*tey*o)~et*nex :!\u007f&u!\u007f!4"), exception);
        }
        if (sprnge3 != null && sprnge3.cfr_renamed_2203() != null && arg1.cfr_renamed_2204() != null) {
            return new sprasb(arg1.cfr_renamed_2204()).cfr_renamed_2205(new sprasb(sprnge3.cfr_renamed_2203()));
        }
        if ((sprnge3 == null || sprnge3.cfr_renamed_2203() == null) && arg1.cfr_renamed_2204() == null) {
            return sprasb.cfr_renamed_4;
        }
        if (arg1.cfr_renamed_2204() == null) {
            sprasb3 = sprasb.cfr_renamed_4;
            sprnge2 = sprnge3;
        } else {
            sprasb3 = new sprasb(arg1.cfr_renamed_2204());
            sprnge2 = sprnge3;
        }
        if (sprnge2 == null) {
            sprasb2 = sprasb.cfr_renamed_4;
            return sprasb3.cfr_renamed_2205(sprasb2);
        }
        sprasb2 = new sprasb(sprnge3.cfr_renamed_2203());
        return sprasb3.cfr_renamed_2205(sprasb2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Set[] cfr_renamed_2206(Date arg0, sprlsa arg1, X509Certificate arg2, X509CRL arg3) throws sprakb {
        HashSet hashSet = new HashSet();
        sprgva sprgva2 = new sprgva();
        sprgva2.setCertificateChecking(arg2);
        try {
            sprgva2.addIssuerName(arg3.getIssuerX500Principal().getEncoded());
        }
        catch (IOException iOException) {
            throw new sprakb(new StringBuilder().insert(0, sprmon.cfr_renamed_9("\t\u0003$\f%\u0016j\u00072\u00168\u0003)\u0016j\u000b9\u0011?\u00078B,\u0010%\u000fj!\u0018.d")).append(iOException).toString(), iOException);
        }
        sprgva2.cfr_renamed_167(true);
        Set set = cfr_renamed_137.cfr_renamed_2207(sprgva2, arg1, arg0);
        if (arg1.cfr_renamed_391()) {
            try {
                hashSet.addAll(sprmqa.cfr_renamed_2171(arg0, arg1, arg3));
            }
            catch (sprakb sprakb2) {
                throw new sprakb(sprgjy.cfr_renamed_9("_=y j1s*teu'n$s+s+}e~ v1{eY\u0017V64"), sprakb2);
            }
        }
        Set[] setArray = new Set[2];
        setArray[0] = set;
        setArray[1] = hashSet;
        return setArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_2208(CertPath arg0, int arg1, Set arg2, List arg3) throws CertPathValidatorException {
        Iterator iterator;
        X509Certificate x509Certificate = (X509Certificate)arg0.getCertificates().get(arg1);
        Iterator iterator2 = iterator = arg3.iterator();
        while (iterator2.hasNext()) {
            try {
                ((PKIXCertPathChecker)iterator.next()).check(x509Certificate, arg2);
                iterator2 = iterator;
            }
            catch (CertPathValidatorException certPathValidatorException) {
                throw new CertPathValidatorException(certPathValidatorException.getMessage(), certPathValidatorException.getCause(), arg0, arg1);
            }
        }
        if (!arg2.isEmpty()) {
            throw new sprgmb(new StringBuilder().insert(0, sprmon.cfr_renamed_9("!/\u0010>\u000b,\u000b)\u0003>\u0007j\n+\u0011j\u0017$\u0011?\u0012:\r8\u0016/\u0006j\u00018\u000b>\u000b)\u0003&B/\u001a>\u0007$\u0011#\r$Xj")).append(arg2).toString(), null, arg0, arg1);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprkpb cfr_renamed_2209(CertPath arg0, int arg1, Set arg2, sprkpb arg3, List[] arg4, int arg5) throws CertPathValidatorException {
        int n;
        Object object;
        sprkpb sprkpb2;
        int n2;
        int n3;
        Collection collection;
        Object object2;
        Object object3;
        HashSet<String> hashSet;
        Enumeration enumeration;
        List<? extends Certificate> list = arg0.getCertificates();
        X509Certificate x509Certificate = (X509Certificate)list.get(arg1);
        int n4 = list.size();
        int n5 = n4 - arg1;
        sprbne sprbne2 = null;
        try {
            sprbne2 = sprpse.cfr_renamed_23(sprmqa.cfr_renamed_292(x509Certificate, cfr_renamed_119));
        }
        catch (sprakb sprakb2) {
            throw new sprgmb(sprgjy.cfr_renamed_9("Y*o)~et*neh {!:&\u007f7n,|,y$n :5u)s&s ie\u007f=n t6s*te|7u(:&\u007f7n,|,y$n 4"), (Throwable)sprakb2, arg0, arg1);
        }
        if (sprbne2 != null && arg3 != null) {
            enumeration = sprbne2.cfr_renamed_329();
            hashSet = new HashSet<String>();
        } else {
            return null;
        }
        while (enumeration.hasMoreElements()) {
            object3 = spriae.cfr_renamed_23(enumeration.nextElement());
            object2 = ((spriae)object3).cfr_renamed_330();
            hashSet.add(((sprtzd)object2).cfr_renamed_19());
            if (cfr_renamed_132.equals(((sprtzd)object2).cfr_renamed_19())) continue;
            collection = null;
            try {
                collection = sprmqa.cfr_renamed_331(((spriae)object3).cfr_renamed_332());
            }
            catch (CertPathValidatorException certPathValidatorException) {
                throw new sprgmb(sprmon.cfr_renamed_9("\u001a\r&\u000b)\u001bj\u0013?\u0003&\u000b,\u000b/\u0010j\u000b$\u0004%B9\u0007>B)\r?\u000e.B$\r>B(\u0007j\u0000?\u000b&\u0006d"), (Throwable)certPathValidatorException, arg0, arg1);
            }
            n3 = sprmqa.cfr_renamed_333(n5, arg4, (sprtzd)object2, (Set)collection);
            if (n3 != 0) continue;
            sprmqa.cfr_renamed_334(n5, arg4, (sprtzd)object2, collection);
        }
        if (arg2.isEmpty() || arg2.contains(cfr_renamed_132)) {
            arg2.clear();
            arg2.addAll(hashSet);
            n2 = arg5;
        } else {
            object3 = arg2.iterator();
            object2 = new HashSet();
            while (object3.hasNext()) {
                collection = (Collection)object3.next();
                if (!hashSet.contains(collection)) continue;
                object2.add(collection);
            }
            arg2.clear();
            arg2.addAll(object2);
            n2 = arg5;
        }
        if (n2 > 0 || n5 < n4 && sprmqa.cfr_renamed_286(x509Certificate)) {
            enumeration = sprbne2.cfr_renamed_329();
            while (enumeration.hasMoreElements()) {
                object3 = spriae.cfr_renamed_23(enumeration.nextElement());
                if (!cfr_renamed_132.equals(((spriae)object3).cfr_renamed_330().cfr_renamed_19())) continue;
                object2 = sprmqa.cfr_renamed_331(((spriae)object3).cfr_renamed_332());
                collection = arg4[n5 - 1];
                int n6 = n3 = 0;
                while (n6 < collection.size()) {
                    sprkpb2 = (sprkpb)collection.get(n3);
                    object = sprkpb2.getExpectedPolicies().iterator();
                    while (object.hasNext()) {
                        Object object4;
                        String string;
                        Object e;
                        Object e2 = e = object.next();
                        if (e instanceof String) {
                            string = (String)e2;
                        } else {
                            if (!(e2 instanceof sprtzd)) continue;
                            string = ((sprtzd)e).cfr_renamed_19();
                        }
                        boolean bl = false;
                        Iterator iterator = sprkpb2.getChildren();
                        while (iterator.hasNext()) {
                            object4 = (sprkpb)iterator.next();
                            if (!string.equals(((sprkpb)object4).getValidPolicy())) continue;
                            bl = true;
                        }
                        if (bl) continue;
                        object4 = new HashSet<String>();
                        object4.add(string);
                        sprkpb sprkpb3 = new sprkpb(new ArrayList(), n5, (Set)object4, sprkpb2, (Set)object2, string, false);
                        sprkpb2.cfr_renamed_335(sprkpb3);
                        arg4[n5].add(sprkpb3);
                    }
                    n6 = ++n3;
                }
                break block6;
            }
        }
        object3 = arg3;
        int n7 = n = n5 - 1;
        while (true) {
            int n8;
            if (n7 >= 0) {
                collection = arg4[n];
                n8 = n3 = 0;
            } else {
                Set<String> set = x509Certificate.getCriticalExtensionOIDs();
                if (set != null) {
                    int n9;
                    boolean bl = set.contains(cfr_renamed_119);
                    List list2 = arg4[n5];
                    int n10 = n9 = 0;
                    while (n10 < list2.size()) {
                        sprkpb sprkpb4 = (sprkpb)list2.get(n9);
                        object = sprkpb4;
                        sprkpb4.cfr_renamed_338(bl);
                        n10 = ++n9;
                    }
                }
                return object3;
            }
            while (n8 < collection.size() && ((sprkpb2 = (sprkpb)collection.get(n3)).cfr_renamed_336() || (object3 = sprmqa.cfr_renamed_337((sprkpb)object3, arg4, sprkpb2)) != null)) {
                n8 = ++n3;
            }
            n7 = --n;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_2202(sprlsa arg0, X509Certificate arg1, Date arg2, X509Certificate arg3, PublicKey arg4, List arg5) throws sprakb {
        boolean bl;
        Object object;
        sprasb sprasb2;
        sprosb sprosb2;
        sprakb sprakb2;
        block20: {
            sprlsa sprlsa2;
            sprakb2 = null;
            sprefe sprefe2 = null;
            try {
                sprefe2 = sprefe.cfr_renamed_23(sprmqa.cfr_renamed_292(arg1, cfr_renamed_112));
            }
            catch (Exception exception) {
                throw new sprakb(sprgjy.cfr_renamed_9("Y\u0017Ve~,i1h,x0n,u+:5u,t1: b1\u007f+i,u+:&u0v!:+u1:'\u007feh {!4"), exception);
            }
            {
                sprmqa.cfr_renamed_2160(sprefe2, arg0);
            }
            sprosb2 = new sprosb();
            sprasb2 = new sprasb();
            boolean bl2 = false;
            if (sprefe2 != null) {
                object = null;
                try {
                    object = sprefe2.cfr_renamed_322();
                }
                catch (Exception exception) {
                    throw new sprakb(sprgjy.cfr_renamed_9("\u0001s6n7s'o1s*tej*s+n6:&u0v!:+u1:'\u007feh {!4"), exception);
                }
                if (object != null) {
                    int n;
                    int n2 = n = 0;
                    while (n2 < ((spryke[])object).length && sprosb2.cfr_renamed_2161() == 11 && !sprasb2.cfr_renamed_2162()) {
                        sprlsa2 = (sprlsa)arg0.clone();
                        try {
                            sprwmb.cfr_renamed_2194(object[n], sprlsa2, arg1, arg2, arg3, arg4, sprosb2, sprasb2, arg5);
                            bl2 = true;
                        }
                        catch (sprakb sprakb3) {
                            sprakb2 = sprakb3;
                        }
                        n2 = ++n;
                    }
                }
            }
            if (sprosb2.cfr_renamed_2161() == 11 && !sprasb2.cfr_renamed_2162()) {
                try {
                    object = null;
                    try {
                        object = new sprgle(sprmqa.cfr_renamed_302(arg1).getEncoded()).cfr_renamed_24();
                    }
                    catch (Exception exception) {
                        throw new sprakb(sprmon.cfr_renamed_9("\u0003\u00119\u0017/\u0010j\u00048\r'B)\u00078\u0016#\u0004#\u0001+\u0016/B,\r8B\t0\u0006B)\r?\u000e.B$\r>B(\u0007j\u0010/\u0007$\u0001%\u0006/\u0006d"), exception);
                    }
                    spryke spryke2 = new spryke(new sprtae(0, new spryee(new sprmee(4, (spra)object))), null, null);
                    sprlsa2 = (sprlsa)arg0.clone();
                    sprwmb.cfr_renamed_2194(spryke2, sprlsa2, arg1, arg2, arg3, arg4, sprosb2, sprasb2, arg5);
                    bl = bl2 = true;
                    break block20;
                }
                catch (sprakb sprakb4) {
                    sprakb2 = sprakb4;
                }
            }
            bl = bl2;
        }
        if (!bl) {
            if (sprakb2 instanceof sprakb) {
                throw sprakb2;
            }
            throw new sprakb(sprgjy.cfr_renamed_9("T*:3{)s!:\u0006H\t:#u0t!4"), sprakb2);
        }
        if (sprosb2.cfr_renamed_2161() != 11) {
            object = new SimpleDateFormat(sprmon.cfr_renamed_9("3\u001b3\u001bg/\u0007O.\u0006j*\u0002X'\u000fp\u00119B\u0010"));
            ((DateFormat)object).setTimeZone(TimeZone.getTimeZone("UTC"));
            String string = new StringBuilder().insert(0, sprgjy.cfr_renamed_9("Y h1s#s&{1\u007feh l*y$n,u+:$|1\u007f7:")).append(((DateFormat)object).format(sprosb2.cfr_renamed_2139())).toString();
            string = new StringBuilder().insert(0, string).append(sprmon.cfr_renamed_9("Nj\u0010/\u00039\r$Xj")).append(cfr_renamed_86[sprosb2.cfr_renamed_2161()]).toString();
            throw new sprakb(string);
        }
        if (!sprasb2.cfr_renamed_2162() && sprosb2.cfr_renamed_2161() == 11) {
            sprosb2.cfr_renamed_2164(12);
        }
        if (sprosb2.cfr_renamed_2161() == 12) {
            throw new sprakb(sprgjy.cfr_renamed_9("Y h1s#s&{1\u007fei1{1o6:&u0v!:+u1:'\u007fe~ n h(s+\u007f!4"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int cfr_renamed_2210(CertPath arg0, int arg1, int arg2) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate)arg0.getCertificates().get(arg1);
        sprbne sprbne2 = null;
        try {
            sprbne2 = sprpse.cfr_renamed_23(sprmqa.cfr_renamed_292(x509Certificate, cfr_renamed_96));
        }
        catch (sprakb sprakb2) {
            throw new sprgmb(sprmon.cfr_renamed_9("2%\u000e#\u00013B)\r$\u0011>\u0010+\u000b$\u00169B)\r?\u000e.B$\r>B(\u0007j\u0006/\u0001%\u0006/\u0006d"), (Throwable)sprakb2, arg0, arg1);
        }
        if (sprbne2 != null) {
            Enumeration enumeration = sprbne2.cfr_renamed_329();
            block7: while (enumeration.hasMoreElements()) {
                spryte spryte2 = (spryte)enumeration.nextElement();
                switch (spryte2.cfr_renamed_312()) {
                    case 0: {
                        int n;
                        try {
                            n = sprooe.cfr_renamed_341(spryte2, false).cfr_renamed_97().intValue();
                        }
                        catch (Exception exception) {
                            throw new sprgmb(sprgjy.cfr_renamed_9("\u0015u)s&cey*t6n7{,t1ieh k0s7\u007f\u0000b5v,y,n\u0015u)s&ce|,\u007f)~ey*o)~et*nex :!\u007f&u!\u007f!4"), (Throwable)exception, arg0, arg1);
                        }
                        if (n != 0) continue block7;
                        return 0;
                    }
                }
            }
        }
        return arg2;
    }

    public static void cfr_renamed_2175(Date arg0, X509CRL arg1, Object arg2, sprosb arg3, sprlsa arg4) throws sprakb {
        if (arg4.cfr_renamed_391() && arg1 != null) {
            sprmqa.cfr_renamed_2211(arg0, arg1, arg2, arg3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_2212(CertPath arg0, int arg1) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate)arg0.getCertificates().get(arg1);
        sprwge sprwge2 = null;
        try {
            sprwge2 = sprwge.cfr_renamed_23(sprmqa.cfr_renamed_292(x509Certificate, cfr_renamed_3));
        }
        catch (Exception exception) {
            throw new sprgmb(sprmon.cfr_renamed_9(" +\u0011#\u0001j\u0001%\f9\u00168\u0003#\f>\u0011j\u00072\u0016/\f9\u000b%\fj\u0001+\f$\r>B(\u0007j\u0006/\u0001%\u0006/\u0006d"), (Throwable)exception, arg0, arg1);
        }
        if (sprwge2 == null) {
            throw new CertPathValidatorException(sprmon.cfr_renamed_9("\u0003\f>\u00078\u000f/\u0006#\u0003>\u0007j\u0001/\u0010>\u000b,\u000b)\u0003>\u0007j\u000e+\u0001!\u0011j +\u0011#\u0001\t\r$\u0011>\u0010+\u000b$\u00169"));
        }
        if (!sprwge2.cfr_renamed_296()) {
            throw new CertPathValidatorException(sprgjy.cfr_renamed_9("\u000bu1:$:\u0006[ey h1s#s&{1\u007f"));
        }
    }

    public static void cfr_renamed_2213(CertPath arg0, int arg1, sprkpb arg2, int arg3) throws CertPathValidatorException {
        if (arg3 <= 0 && arg2 == null) {
            throw new sprgmb(sprgjy.cfr_renamed_9("T*:3{)s!:5u)s&cen7\u007f :#u0t!:2r teu+\u007fe\u007f=j y1\u007f!4"), null, arg0, arg1);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprkpb cfr_renamed_2214(CertPath arg0, int arg1, List[] arg2, sprkpb arg3, int arg4) throws CertPathValidatorException {
        sprkpb sprkpb2;
        block22: {
            Object object5;
            Object object2;
            int n;
            List<? extends Certificate> list = arg0.getCertificates();
            X509Certificate x509Certificate = (X509Certificate)list.get(arg1);
            int n2 = list.size() - arg1;
            sprbne sprbne2 = null;
            try {
                sprbne2 = sprpse.cfr_renamed_23(sprmqa.cfr_renamed_292(x509Certificate, cfr_renamed_1));
            }
            catch (sprakb sprakb2) {
                throw new sprgmb(sprmon.cfr_renamed_9("\u001a\r&\u000b)\u001bj\u000f+\u0012:\u000b$\u00059B/\u001a>\u0007$\u0011#\r$B)\r?\u000e.B$\r>B(\u0007j\u0006/\u0001%\u0006/\u0006d"), (Throwable)sprakb2, arg0, arg1);
            }
            sprkpb2 = arg3;
            if (sprbne2 == null) break block22;
            sprbne sprbne3 = sprbne2;
            HashMap<String, Object> hashMap = new HashMap<String, Object>();
            HashSet<String> hashSet = new HashSet<String>();
            int n3 = n = 0;
            while (n3 < sprbne3.cfr_renamed_84()) {
                Object object3 = (sprbne)sprbne3.cfr_renamed_85(n);
                String string = ((sprtzd)((sprbne)object3).cfr_renamed_85(0)).cfr_renamed_19();
                object2 = ((sprtzd)((sprbne)object3).cfr_renamed_85(1)).cfr_renamed_19();
                if (!hashMap.containsKey(string)) {
                    object5 = new HashSet();
                    object5.add(object2);
                    hashMap.put(string, object5);
                    hashSet.add(string);
                } else {
                    object5 = (Set)hashMap.get(string);
                    object5.add(object2);
                }
                n3 = ++n;
            }
            for (Object object3 : hashSet) {
                Iterator iterator;
                Object object4;
                block23: {
                    sprkpb sprkpb3;
                    Enumeration enumeration;
                    Set set;
                    block21: {
                        if (arg4 > 0) {
                            boolean bl;
                            block20: {
                                boolean bl2 = false;
                                for (Object object5 : arg2[n2]) {
                                    if (!((sprkpb)object5).getValidPolicy().equals(object3)) continue;
                                    bl2 = true;
                                    ((sprkpb)object5).cfr_renamed_119 = (Set)hashMap.get(object3);
                                    bl = bl2;
                                    break block20;
                                }
                                bl = bl2;
                            }
                            if (bl) continue;
                            for (Object object5 : arg2[n2]) {
                                if (!cfr_renamed_132.equals(((sprkpb)object5).getValidPolicy())) continue;
                                set = null;
                                object4 = null;
                                try {
                                    object4 = (sprbne)sprmqa.cfr_renamed_292(x509Certificate, cfr_renamed_119);
                                }
                                catch (sprakb sprakb3) {
                                    throw new sprgmb(sprgjy.cfr_renamed_9("\u0006\u007f7n,|,y$n :5u)s&s ie\u007f=n t6s*tey*o)~et*nex :!\u007f&u!\u007f!4"), (Throwable)sprakb3, arg0, arg1);
                                }
                                enumeration = ((sprbne)object4).cfr_renamed_329();
                                break block21;
                            }
                            continue;
                        }
                        if (arg4 > 0) continue;
                        iterator = arg2[n2].iterator();
                        break block23;
                    }
                    while (enumeration.hasMoreElements()) {
                        spriae spriae2 = null;
                        try {
                            spriae2 = spriae.cfr_renamed_23(enumeration.nextElement());
                        }
                        catch (Exception exception) {
                            throw new CertPathValidatorException(sprmon.cfr_renamed_9("2%\u000e#\u00013B#\f,\r8\u000f+\u0016#\r$B)\r?\u000e.B$\r>B(\u0007j\u0006/\u0001%\u0006/\u0006d"), (Throwable)exception, arg0, arg1);
                        }
                        if (!cfr_renamed_132.equals(spriae2.cfr_renamed_330().cfr_renamed_19())) continue;
                        try {
                            set = sprmqa.cfr_renamed_331(spriae2.cfr_renamed_332());
                            break;
                        }
                        catch (CertPathValidatorException certPathValidatorException) {
                            throw new sprgmb(sprgjy.cfr_renamed_9("J*v,y<:4o$v,|,\u007f7:,t#uei ney*o)~et*nex :!\u007f&u!\u007f!4"), (Throwable)certPathValidatorException, arg0, arg1);
                        }
                    }
                    boolean bl = false;
                    if (x509Certificate.getCriticalExtensionOIDs() != null) {
                        bl = x509Certificate.getCriticalExtensionOIDs().contains(cfr_renamed_119);
                    }
                    if (!cfr_renamed_132.equals((sprkpb3 = (sprkpb)((sprkpb)object5).getParent()).getValidPolicy())) continue;
                    sprkpb sprkpb4 = new sprkpb(new ArrayList(), n2, (Set)hashMap.get(object3), sprkpb3, set, (String)object3, bl);
                    sprkpb3.cfr_renamed_335(sprkpb4);
                    arg2[n2].add(sprkpb4);
                    continue;
                }
                while (iterator.hasNext()) {
                    object2 = (sprkpb)iterator.next();
                    if (!((sprkpb)object2).getValidPolicy().equals(object3)) continue;
                    object5 = (sprkpb)((sprkpb)object2).getParent();
                    ((sprkpb)object5).cfr_renamed_2215((sprkpb)object2);
                    iterator.remove();
                    int n4 = n2 - 1;
                    while (n4 >= 0) {
                        sprkpb sprkpb5;
                        int n5;
                        int n6;
                        object4 = arg2[n6];
                        int n7 = n5 = 0;
                        while (n7 < object4.size() && ((sprkpb5 = (sprkpb)object4.get(n5)).cfr_renamed_336() || (sprkpb2 = sprmqa.cfr_renamed_337(sprkpb2, arg2, sprkpb5)) != null)) {
                            n7 = ++n5;
                        }
                        n4 = --n6;
                    }
                }
            }
        }
        return sprkpb2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int cfr_renamed_2216(CertPath arg0, int arg1, int arg2) throws CertPathValidatorException {
        int n;
        BigInteger bigInteger;
        X509Certificate x509Certificate = (X509Certificate)arg0.getCertificates().get(arg1);
        sprwge sprwge2 = null;
        try {
            sprwge2 = sprwge.cfr_renamed_23(sprmqa.cfr_renamed_292(x509Certificate, cfr_renamed_3));
        }
        catch (Exception exception) {
            throw new sprgmb(sprmon.cfr_renamed_9(" +\u0011#\u0001j\u0001%\f9\u00168\u0003#\f>\u0011j\u00072\u0016/\f9\u000b%\fj\u0001+\f$\r>B(\u0007j\u0006/\u0001%\u0006/\u0006d"), (Throwable)exception, arg0, arg1);
        }
        if (sprwge2 != null && (bigInteger = sprwge2.cfr_renamed_299()) != null && (n = bigInteger.intValue()) < arg2) {
            return n;
        }
        return arg2;
    }

    public static int cfr_renamed_2217(CertPath arg0, int arg1, int arg2) {
        if (!sprmqa.cfr_renamed_286((X509Certificate)arg0.getCertificates().get(arg1)) && arg2 != 0) {
            return arg2 - 1;
        }
        return arg2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_2218(CertPath arg0, int arg1) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate)arg0.getCertificates().get(arg1);
        sprbne sprbne2 = null;
        try {
            sprbne2 = sprpse.cfr_renamed_23(sprmqa.cfr_renamed_292(x509Certificate, cfr_renamed_1));
        }
        catch (sprakb sprakb2) {
            throw new sprgmb(sprgjy.cfr_renamed_9("J*v,y<:({5j,t\"ie\u007f=n t6s*tey*o)~et*nex :!\u007f&u!\u007f!4"), (Throwable)sprakb2, arg0, arg1);
        }
        if (sprbne2 != null) {
            int n;
            sprbne sprbne3 = sprbne2;
            int n2 = n = 0;
            while (n2 < sprbne3.cfr_renamed_84()) {
                sprtzd sprtzd2 = null;
                sprtzd sprtzd3 = null;
                try {
                    sprbne sprbne4 = sprpse.cfr_renamed_23(sprbne3.cfr_renamed_85(n));
                    sprtzd2 = sprtzd.cfr_renamed_23(sprbne4.cfr_renamed_85(0));
                    sprtzd3 = sprtzd.cfr_renamed_23(sprbne4.cfr_renamed_85(1));
                }
                catch (Exception exception) {
                    throw new sprgmb(sprmon.cfr_renamed_9("2%\u000e#\u00013B'\u0003:\u0012#\f-\u0011j\u00072\u0016/\f9\u000b%\fj\u0001%\f>\u0007$\u00169B)\r?\u000e.B$\r>B(\u0007j\u0006/\u0001%\u0006/\u0006d"), (Throwable)exception, arg0, arg1);
                }
                if (cfr_renamed_132.equals(sprtzd2.cfr_renamed_19())) {
                    throw new CertPathValidatorException(sprgjy.cfr_renamed_9("S6i0\u007f7^*w$s+J*v,y<:,ie{+c\u0015u)s&c"), null, arg0, arg1);
                }
                if (cfr_renamed_132.equals(sprtzd3.cfr_renamed_19())) {
                    throw new CertPathValidatorException(sprmon.cfr_renamed_9("\u0019\u0017(\b/\u0001>&%\u000f+\u000b$2%\u000e#\u00013B#\u0011j\u0003$\u001b\u001a\r&\u000b)\u001bf"), null, arg0, arg1);
                }
                n2 = ++n;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Set cfr_renamed_2169(X509CRL arg0, Object arg1, X509Certificate arg2, PublicKey arg3, sprlsa arg4, List arg5) throws sprakb {
        int n;
        Object object;
        Object object2;
        Object object3;
        Serializable serializable;
        Object object4;
        sprgma sprgma2 = new sprgma();
        try {
            object4 = sprmqa.cfr_renamed_305(arg0).getEncoded();
            sprgma2.setSubject((byte[])object4);
        }
        catch (IOException iOException) {
            throw new sprakb(sprgjy.cfr_renamed_9("\u0016o'p y1:&h,n h,{e|*hey h1s#s&{1\u007fei v y1u7:1ue|,t!:,i6o hey h1s#s&{1\u007fe|*heY\u0017Vey*o)~et*nex :6\u007f14"), iOException);
        }
        {
            Object object5 = object4 = (Object)sprmqa.cfr_renamed_2181(sprgma2, arg4.cfr_renamed_385());
            object5.addAll(sprmqa.cfr_renamed_2181(sprgma2, arg4.cfr_renamed_377()));
            object5.addAll(sprmqa.cfr_renamed_2181(sprgma2, arg4.getCertStores()));
        }
        object4.add(arg2);
        Iterator iterator = object4.iterator();
        ArrayList<Serializable> arrayList = new ArrayList<Serializable>();
        ArrayList<PublicKey> arrayList2 = new ArrayList<PublicKey>();
        block7: while (true) {
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                serializable = (X509Certificate)iterator.next();
                if (((Certificate)serializable).equals(arg2)) {
                    iterator2 = iterator;
                    arrayList.add(serializable);
                    arrayList2.add(arg3);
                    continue;
                }
                try {
                    Object object6;
                    object3 = CertPathBuilder.getInstance(sprgjy.cfr_renamed_9("\u0015Q\fB"), "BC");
                    sprgma2 = new sprgma();
                    sprgma2.setCertificate((X509Certificate)serializable);
                    sprlsa sprlsa2 = (sprlsa)arg4.clone();
                    sprlsa2.setTargetCertConstraints(sprgma2);
                    Object object7 = object2 = (sprfua)sprfua.cfr_renamed_382(sprlsa2);
                    if (arg5.contains(serializable)) {
                        ((PKIXParameters)object7).setRevocationEnabled(false);
                        object6 = object3;
                    } else {
                        ((PKIXParameters)object7).setRevocationEnabled(true);
                        object6 = object3;
                    }
                    object = ((CertPathBuilder)object6).build((CertPathParameters)object2).getCertPath().getCertificates();
                    arrayList.add(serializable);
                    arrayList2.add(sprmqa.cfr_renamed_297((List)object, 0));
                }
                catch (CertPathBuilderException certPathBuilderException) {
                    throw new sprakb(sprmon.cfr_renamed_9("\u0003\f>\u00078\f+\u000ej\u00078\u0010%\u0010d"), certPathBuilderException);
                }
                catch (CertPathValidatorException certPathValidatorException) {
                    throw new sprakb(sprgjy.cfr_renamed_9("J0x)s&:.\u007f<:*|es6i0\u007f7:&\u007f7n,|,y$n :*|eY\u0017Vey*o)~et*nex :7\u007f1h,\u007f3\u007f!4"), certPathValidatorException);
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception.getMessage());
                }
                continue block7;
            }
            break;
        }
        serializable = new HashSet();
        object3 = null;
        int n2 = n = 0;
        while (n2 < arrayList.size()) {
            object2 = (X509Certificate)arrayList.get(n);
            object = ((X509Certificate)object2).getKeyUsage();
            if (!(object == null || ((boolean[])object).length >= 7 && object[6])) {
                object3 = new sprakb(sprmon.cfr_renamed_9("\u0003\u00119\u0017/\u0010j\u0001/\u0010>\u000b,\u000b)\u0003>\u0007j\t/\u001bj\u00179\u0003-\u0007j\u00072\u0016/\f9\u000b%\fj\u0006%\u00079B$\r>B:\u00078\u000f#\u0016j!\u0018.j\u0011#\u0005$\u000b$\u0005d"));
            } else {
                serializable.add(arrayList2.get(n));
            }
            n2 = ++n;
        }
        if (serializable.isEmpty() && object3 == null) {
            throw new sprakb(sprgjy.cfr_renamed_9("Y$t+u1:#s+~e{el$v,~es6i0\u007f7:&\u007f7n,|,y$n 4"));
        }
        if (serializable.isEmpty() && object3 != null) {
            throw object3;
        }
        return serializable;
    }

    public static void cfr_renamed_2176(Date arg0, X509CRL arg1, Object arg2, sprosb arg3) throws sprakb {
        if (arg3.cfr_renamed_2161() == 11) {
            sprmqa.cfr_renamed_2211(arg0, arg1, arg2, arg3);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static sprkpb cfr_renamed_2219(CertPath certPath, sprlsa sprlsa2, Set set, int n, List[] listArray, sprkpb sprkpb2, Set set2) throws CertPathValidatorException {
        Object object;
        int n2;
        sprkpb arg5;
        void arg4;
        void arg2;
        void arg3;
        void arg1;
        CertPath arg0;
        int n3 = arg0.getCertificates().size();
        if (sprkpb2 == null) {
            if (arg1.isExplicitPolicyRequired()) {
                throw new sprgmb(sprmon.cfr_renamed_9("\u000f\u001a:\u000e#\u0001#\u0016j\u0012%\u000e#\u00013B8\u0007;\u0017/\u0011>\u0007.B(\u0017>B$\r$\u0007j\u0003<\u0003#\u000e+\u0000&\u0007d"), null, arg0, (int)arg3);
            }
            sprkpb sprkpb3 = null;
            return null;
        }
        if (sprmqa.cfr_renamed_342((Set)arg2)) {
            if (arg1.isExplicitPolicyRequired()) {
                sprkpb sprkpb4;
                int n4;
                void arg6;
                if (arg6.isEmpty()) {
                    throw new sprgmb(sprgjy.cfr_renamed_9("_=j)s&s1:5u)s&ceh k0\u007f6n ~ex0net*t :$l$s){'v 4"), null, arg0, (int)arg3);
                }
                HashSet hashSet = new HashSet();
                int n5 = n4 = 0;
                while (n5 < ((void)arg4).length) {
                    int n6;
                    sprkpb sprkpb5 = arg4[n4];
                    int n7 = n6 = 0;
                    while (n7 < sprkpb5.size()) {
                        sprkpb sprkpb6 = (sprkpb)sprkpb5.get(n6);
                        if (cfr_renamed_132.equals(sprkpb6.getValidPolicy())) {
                            Iterator iterator = sprkpb6.getChildren();
                            while (iterator.hasNext()) {
                                Iterator iterator2 = sprkpb4;
                                iterator = iterator2;
                                hashSet.add(iterator2.next());
                            }
                        }
                        n7 = ++n6;
                    }
                    n5 = ++n4;
                }
                for (sprkpb sprkpb5 : hashSet) {
                    String string = sprkpb5.getValidPolicy();
                    if (arg6.contains(string)) continue;
                }
                if (arg5 != null) {
                    int n8;
                    int n9 = n8 = n3 - 1;
                    while (n9 >= 0) {
                        int n10;
                        void var12_24 = arg4[n8];
                        int n11 = n10 = 0;
                        while (n11 < var12_24.size()) {
                            sprkpb4 = (sprkpb)var12_24.get(n10);
                            if (!sprkpb4.cfr_renamed_336()) {
                                arg5 = sprmqa.cfr_renamed_337(arg5, (List[])arg4, sprkpb4);
                            }
                            n11 = ++n10;
                        }
                        n9 = --n8;
                    }
                }
            }
            void var8_9 = arg5;
            return var8_9;
        }
        HashSet<sprkpb> hashSet = new HashSet<sprkpb>();
        int n12 = n2 = 0;
        while (n12 < ((void)arg4).length) {
            int n13;
            sprkpb sprkpb7 = arg4[n2];
            int n14 = n13 = 0;
            while (n14 < sprkpb7.size()) {
                sprkpb sprkpb8 = (sprkpb)sprkpb7.get(n13);
                if (cfr_renamed_132.equals(sprkpb8.getValidPolicy())) {
                    object = sprkpb8.getChildren();
                    while (object.hasNext()) {
                        sprkpb sprkpb9 = (sprkpb)object.next();
                        if (cfr_renamed_132.equals(sprkpb9.getValidPolicy())) continue;
                        hashSet.add(sprkpb9);
                    }
                }
                n14 = ++n13;
            }
            n12 = ++n2;
        }
        for (sprkpb sprkpb7 : hashSet) {
            String string = sprkpb7.getValidPolicy();
            if (arg2.contains(string)) continue;
            arg5 = sprmqa.cfr_renamed_337(arg5, (List[])arg4, sprkpb7);
        }
        if (arg5 != null) {
            int n15;
            int n16 = n15 = n3 - 1;
            while (n16 >= 0) {
                int n17;
                void var12_27 = arg4[n15];
                int n18 = n17 = 0;
                while (n18 < var12_27.size()) {
                    object = (sprkpb)var12_27.get(n17);
                    if (!((sprkpb)object).cfr_renamed_336()) {
                        arg5 = sprmqa.cfr_renamed_337(arg5, (List[])arg4, (sprkpb)object);
                    }
                    n18 = ++n17;
                }
                n16 = --n15;
            }
        }
        void var8_10 = arg5;
        return var8_10;
    }

    /*
     * Exception decompiling
     */
    public static int cfr_renamed_2220(CertPath arg0, int arg1, int arg2) throws CertPathValidatorException {
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
    public static void cfr_renamed_2172(spryke arg0, Object arg1, X509CRL arg2) throws sprakb {
        sprvva sprvva2 = sprmqa.cfr_renamed_292(arg2, cfr_renamed_102);
        boolean bl = false;
        if (sprvva2 != null && sprnge.cfr_renamed_23(sprvva2).cfr_renamed_2131()) {
            bl = true;
        }
        byte[] byArray = sprmqa.cfr_renamed_305(arg2).getEncoded();
        boolean bl2 = false;
        if (arg0.cfr_renamed_2186() == null) {
            if (sprmqa.cfr_renamed_305(arg2).equals(sprmqa.cfr_renamed_302(arg1))) {
                return;
            }
        } else {
            int n;
            sprmee[] sprmeeArray = arg0.cfr_renamed_2186().cfr_renamed_289();
            int n2 = n = 0;
            while (n2 < sprmeeArray.length) {
                if (sprmeeArray[n].cfr_renamed_312() == 4) {
                    try {
                        if (sprzra.cfr_renamed_92(sprmeeArray[n].cfr_renamed_313().cfr_renamed_119().cfr_renamed_91(), byArray)) {
                            bl2 = true;
                        }
                    }
                    catch (IOException iOException) {
                        throw new sprakb(sprmon.cfr_renamed_9("\t0\u0006B#\u00119\u0017/\u0010j\u000b$\u0004%\u0010'\u0003>\u000b%\fj\u00048\r'B.\u000b9\u00168\u000b(\u0017>\u000b%\fj\u0012%\u000b$\u0016j\u0001+\f$\r>B(\u0007j\u0006/\u0001%\u0006/\u0006d"), iOException);
                    }
                }
                n2 = ++n;
            }
            if (bl2 && !bl) {
                throw new sprakb(sprgjy.cfr_renamed_9("\u0001s6n7s'o1s*tej*s+ney*t1{,t6:&H\tS6i0\u007f7:#s v!:'o1:\u0006H\t:,iet*nes+~,h y14"));
            }
            if (!bl2) {
                throw new sprakb(sprmon.cfr_renamed_9("!\u0018.j\u000b9\u0011?\u00078B%\u0004j!\u0018.j\u0006%\u00079B$\r>B'\u0003>\u0001\"B\t0\u0006B#\u00119\u0017/\u0010j\r,B.\u000b9\u00168\u000b(\u0017>\u000b%\fj\u0012%\u000b$\u0016d"));
            }
        }
        if (bl2) return;
        throw new sprakb(sprgjy.cfr_renamed_9("\u0006{+t*ne|,t!:({1y-s+}eY\u0017Ves6i0\u007f7:#u7:&\u007f7n,|,y$n 4"));
    }

    public static int cfr_renamed_2221(CertPath arg0, int arg1, int arg2) throws CertPathValidatorException {
        if (!sprmqa.cfr_renamed_286((X509Certificate)arg0.getCertificates().get(arg1))) {
            if (arg2 <= 0) {
                throw new sprgmb(sprmon.cfr_renamed_9("\u0007\u00032B:\u0003>\nj\u000e/\f-\u0016\"B$\r>B-\u0010/\u0003>\u00078B>\n+\fj\u0018/\u0010%"), null, arg0, arg1);
            }
            return arg2 - 1;
        }
        return arg2;
    }
}

