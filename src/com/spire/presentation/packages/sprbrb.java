/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprj;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprokb;
import com.spire.presentation.packages.sprpsd;
import com.spire.presentation.packages.sprr;
import com.spire.presentation.packages.sprrica;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprupb;
import com.spire.presentation.packages.sprwc;
import com.spire.presentation.packages.sprydb;
import java.io.IOException;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public final class sprbrb
extends Provider
implements sprr {
    private static final String[] cfr_renamed_96;
    private static final String[] cfr_renamed_105;
    private static final String cfr_renamed_137 = "org.bouncycastle.jcajce.provider.symmetric.";
    private static final String[] cfr_renamed_79;
    private static String cfr_renamed_107;
    public static final String cfr_renamed_132 = "BC";
    private static final String[] cfr_renamed_102;
    private static final String cfr_renamed_93 = "org.bouncycastle.jcajce.provider.asymmetric.";
    public static final sprwc cfr_renamed_86;
    private static final Map cfr_renamed_152;
    private static final String[] cfr_renamed_112;
    private static final String[] cfr_renamed_119;
    private static final String cfr_renamed_91 = "org.bouncycastle.jcajce.provider.keystore.";
    private static final String cfr_renamed_0 = "org.bouncycastle.jcajce.provider.digest.";
    private static final String[] cfr_renamed_4;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cfr_renamed_1262(String arg0, Object arg1) {
        sprwc sprwc2 = cfr_renamed_86;
        synchronized (sprwc2) {
            ((sprupb)cfr_renamed_86).cfr_renamed_1262(arg0, arg1);
            return;
        }
    }

    public static PublicKey cfr_renamed_1255(sprdce arg0) throws IOException {
        sprj sprj2 = (sprj)cfr_renamed_152.get(arg0.cfr_renamed_593().cfr_renamed_593());
        if (sprj2 == null) {
            return null;
        }
        return sprj2.cfr_renamed_1226(arg0);
    }

    private /* synthetic */ void cfr_renamed_1257() {
        sprbrb sprbrb2 = this;
        sprbrb sprbrb3 = this;
        sprbrb sprbrb4 = this;
        sprbrb sprbrb5 = this;
        sprbrb5.cfr_renamed_1258(cfr_renamed_0, cfr_renamed_112);
        sprbrb5.cfr_renamed_1258(cfr_renamed_137, cfr_renamed_4);
        sprbrb4.cfr_renamed_1258(cfr_renamed_137, cfr_renamed_79);
        sprbrb4.cfr_renamed_1258(cfr_renamed_137, cfr_renamed_102);
        sprbrb3.cfr_renamed_1258(cfr_renamed_93, cfr_renamed_119);
        sprbrb3.cfr_renamed_1258(cfr_renamed_93, cfr_renamed_96);
        sprbrb2.cfr_renamed_1258(cfr_renamed_91, cfr_renamed_105);
        sprbrb2.put(sprpsd.cfr_renamed_9("\u0000\u0007h\u000b\u000bF7@=\u001c\u001bw\nf\u0011t\u0011q\u0019f\u001d\u001d\u001b}\u0014~\u001dq\f{\u0017|"), "com.spire.presentation.packages.sprijb");
        this.put(sprrica.cfr_renamed_9("zh\u0012dq)M/Gsc\tv\u000fk\u001fw\tg\u001eg\u000fv\u0014d\u0014a\u001cv\u0018\r\u001em\u0011n\u0018a\tk\u0012l"), "com.spire.presentation.packages.sprplb");
        this.put(sprpsd.cfr_renamed_9("\u0000\u0007h\u000b\u000bF7@=\u001c\u001b`\u0014\u001d\u001b}\u0014~\u001dq\f{\u0017|"), "com.spire.presentation.packages.sprpkb");
        this.put(sprrica.cfr_renamed_9("\u0005\u0017m\u001b\u000eV2P8\f\u001eg\u000fv\u0014d\u0014a\u001cv\u0018r\u001ck\u000f\r\u001em\u0011n\u0018a\tk\u0012l"), "com.spire.presentation.packages.sprtqb");
        this.put(sprpsd.cfr_renamed_9("\u0000\u0007h\u000b\u000bF7@=\u001c\u001bw\nf\u0011t\u0011q\u0019f\u001d\u001d\u0014v\u0019b"), "com.spire.presentation.packages.sprhpb");
        this.put(sprrica.cfr_renamed_9("\u0005\u0017m\u001b\u000eV2P8\f\u001ep\u0011\r\u0011f\u001cr"), "com.spire.presentation.packages.sprypb");
        this.put(sprpsd.cfr_renamed_9("jm\u0002aa,]*Wvs\ff\n{\u001ag\fw\u001bw\nf\u0011t\u0011q\u0019f\u001d\u001d\u0014v\u0019b"), "com.spire.presentation.packages.spryob");
        this.put(sprrica.cfr_renamed_9("\u0005\u0017m\u001b\u000eV2P8\f\u001eg\u000fv\u0014d\u0014a\u001cv\u0018r\u001ck\u000f\r\u0011f\u001cr"), "com.spire.presentation.packages.sprbjb");
        this.put(sprpsd.cfr_renamed_9("\u0000\u0007h\u000b\u000bF*W9_\bS*A=@vq\u001d`\f{\u001e{\u001bs\fw"), "com.spire.presentation.packages.sprjtb");
        this.put(sprrica.cfr_renamed_9("zh\u0012dq)P8C0r<P.G/\f\u001cv\tp\u0014`\bv\u0018a\u0018p\tk\u001bk\u001ec\tg"), "com.spire.presentation.packages.sprtkb");
        this.put(sprpsd.cfr_renamed_9("\u0000\u0007h\u000b\u000bF*W9_\bS*A=@vq\n~"), "com.spire.presentation.packages.sprvlb");
        this.put(sprrica.cfr_renamed_9("\u0005\u0017m\u001b\u000eV/G<O\rC/Q8Psa\u0018p\tk\u001bk\u001ec\tg\rc\u0014p"), "com.spire.presentation.packages.sprrjb");
        this.put(sprpsd.cfr_renamed_9("q1B0W*\u001c\u001a`\u0017y\u001d|\bp\u001de\u0011f\u0010\u007f\u001c\u0007\u0019|\u001cv\u001da"), "com.spire.presentation.packages.spryqb");
        this.put(sprrica.cfr_renamed_9("\u001eK-J8Ps`\u000fm\u0016g\u0013r\u001fg\nk\tj\u000ej\u001c\u0013\u001cl\u0019f\u0018q"), "com.spire.presentation.packages.sprqmb");
        this.put(sprpsd.cfr_renamed_9("\u001b[(Z=@v}\u0014v\bp\u001de\u0011f\u0010a\u0010s\u0019|\u001cf\u000f}\u001e{\u000bzuq\u001aq"), "com.spire.presentation.packages.sprjrb");
        this.put(sprrica.cfr_renamed_9("a8P)r<V5t<N4F<V2Psp\u001ban\u0010e\u0013"), "com.spire.presentation.packages.sprcqb");
        this.put(sprpsd.cfr_renamed_9("q=@,b9F0p-[4V=@v`\u001eqk\u0000`\u0003"), "com.spire.presentation.packages.sprpqb");
        this.put(sprrica.cfr_renamed_9("a8P)r<V5t<N4F<V2Psp\u001ban\u0010e\u0012"), "com.spire.presentation.packages.sprsrb");
        this.put(sprpsd.cfr_renamed_9("q=@,b9F0p-[4V=@v`\u001eqk\u0000`\u0002"), "com.spire.presentation.packages.sprzib");
        this.put(sprrica.cfr_renamed_9("\u001eG/V\rC)J\u000bC1K9C)M/\f\ri\u0014z"), "com.spire.presentation.packages.sprsrb");
        this.put(sprpsd.cfr_renamed_9("\u001bW*F\bS,Z\u001aG1^<W*\u001c\by\u0011j"), "com.spire.presentation.packages.sprzib");
        this.put(sprrica.cfr_renamed_9("\u001eG/V\u000eV2P8\f\u001eM1N8A)K2L"), "com.spire.presentation.packages.sprvtb");
        this.put(sprpsd.cfr_renamed_9("\u001bW*F\u000bF7@=\u001c\u0014v\u0019b"), "com.spire.presentation.packages.sprukb");
        this.put(sprrica.cfr_renamed_9("a8P)q)M/Gso(N)K"), "com.spire.presentation.packages.sprlob");
        this.put(sprpsd.cfr_renamed_9("\u0019^?\u001c\u0019^1S+\u001c\u001bW*F\u000bF7@=\u001c\u0000\u0007h\u000b\u0014v\u0019b"), sprrica.cfr_renamed_9("\u0011f\u001cr"));
    }

    @Override
    public void cfr_renamed_1260(String arg0, String arg1) {
        if (this.containsKey(arg0)) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprpsd.cfr_renamed_9("<G(^1Q9F=\u0012(@7D1V=@xY=Kx\u001a")).append(arg0).append(sprrica.cfr_renamed_9("\u000b}D2W3F")).toString());
        }
        this.put(arg0, arg1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_1258(String arg0, String[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 != arg1.length) {
            Class<?> clazz = null;
            try {
                ClassLoader classLoader = this.getClass().getClassLoader();
                clazz = classLoader != null ? classLoader.loadClass(arg0 + arg1[n] + sprpsd.cfr_renamed_9("\u0016\u0015S(B1\\?A")) : Class.forName(new StringBuilder().insert(0, arg0).append(arg1[n]).append(sprrica.cfr_renamed_9("\u0006\u0010C-R4L:Q")).toString());
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
            if (clazz != null) {
                try {
                    ((sprydb)clazz.newInstance()).cfr_renamed_1259(this);
                }
                catch (Exception exception) {
                    throw new InternalError(new StringBuilder().insert(0, sprpsd.cfr_renamed_9(";S6\\7FxQ*W9F=\u00121\\+F9\\;Wx]>\u0012")).append(arg0).append(arg1[n]).append(sprrica.cfr_renamed_9("yo<R-K3E.\u0002g\u0002")).append(exception).toString());
                }
            }
            n2 = ++n;
        }
        return;
    }

    static {
        cfr_renamed_107 = "BouncyCastle Security Provider v1.51";
        cfr_renamed_86 = new sprupb();
        cfr_renamed_152 = new HashMap();
        String[] stringArray = new String[2];
        stringArray[0] = sprpsd.cfr_renamed_9("b\u001aw\bp\u0013v\u001e\u0000");
        stringArray[1] = sprrica.cfr_renamed_9("r\u001fg\ri\u001eql\u0010");
        cfr_renamed_4 = stringArray;
        String[] stringArray2 = new String[1];
        stringArray2[0] = sprpsd.cfr_renamed_9("a1B\u0010S+Z");
        cfr_renamed_79 = stringArray2;
        String[] stringArray3 = new String[32];
        stringArray3[0] = sprrica.cfr_renamed_9("c\u0018q");
        stringArray3[1] = sprpsd.cfr_renamed_9("\u0019`\u001b\u0006");
        stringArray3[2] = sprrica.cfr_renamed_9("\u001fN2U;K.J");
        stringArray3[3] = sprpsd.cfr_renamed_9("\u001bS5W4^1S");
        stringArray3[4] = sprrica.cfr_renamed_9("a\u001cq\t\u0017");
        stringArray3[5] = sprpsd.cfr_renamed_9("q\u0019a\f\u0004");
        stringArray3[6] = sprrica.cfr_renamed_9("\u001eJ<a5C");
        stringArray3[7] = "DES";
        stringArray3[8] = sprpsd.cfr_renamed_9("\u001cw\u000bW<W");
        stringArray3[9] = sprrica.cfr_renamed_9("e\u0012q\t\u0010e\u0013i\u0015");
        stringArray3[10] = sprpsd.cfr_renamed_9("u*S1\\.\u0003");
        stringArray3[11] = sprrica.cfr_renamed_9("\u001aP<K3\u0013o\u001a");
        stringArray3[12] = sprpsd.cfr_renamed_9("z\u001b\u0003j\n");
        stringArray3[13] = sprrica.cfr_renamed_9("j\u001e\u0010h\u0014");
        stringArray3[14] = sprpsd.cfr_renamed_9("\u0011v\u001ds");
        stringArray3[15] = sprrica.cfr_renamed_9("l2G6G2L");
        stringArray3[16] = "RC2";
        stringArray3[17] = sprpsd.cfr_renamed_9("`\u001b\u0007");
        stringArray3[18] = sprrica.cfr_renamed_9("p\u001e\u0014");
        stringArray3[19] = "Rijndael";
        stringArray3[20] = sprpsd.cfr_renamed_9("a9^+Sj\u0002");
        stringArray3[21] = sprrica.cfr_renamed_9("\u000eg\u0018f");
        stringArray3[22] = sprpsd.cfr_renamed_9("a=@(W6F");
        stringArray3[23] = sprrica.cfr_renamed_9("q5C>C1\u0010");
        stringArray3[24] = sprpsd.cfr_renamed_9("\u000bY1B2S;Y");
        stringArray3[25] = sprrica.cfr_renamed_9("v\u0018c");
        stringArray3[26] = sprpsd.cfr_renamed_9("f/]>[+Z");
        stringArray3[27] = sprrica.cfr_renamed_9("v5P8G;K.J");
        stringArray3[28] = sprpsd.cfr_renamed_9("\u000e\u007f\bq");
        stringArray3[29] = sprrica.cfr_renamed_9("\u000bo\ra\u0016q\u001c\u0011");
        stringArray3[30] = sprpsd.cfr_renamed_9("\u0000f\u001ds");
        stringArray3[31] = sprrica.cfr_renamed_9("\u0005q<N.Co\u0012");
        cfr_renamed_102 = stringArray3;
        String[] stringArray4 = new String[2];
        stringArray4[0] = sprpsd.cfr_renamed_9("\u0000\u0007h\u000b");
        stringArray4[1] = sprrica.cfr_renamed_9("k\u0018q");
        cfr_renamed_119 = stringArray4;
        String[] stringArray5 = new String[8];
        stringArray5[0] = "DSA";
        stringArray5[1] = sprpsd.cfr_renamed_9("\u001cz");
        stringArray5[2] = "EC";
        stringArray5[3] = "RSA";
        stringArray5[4] = sprrica.cfr_renamed_9("\u001am\u000ev");
        stringArray5[5] = sprpsd.cfr_renamed_9("\u001dq\u001f}\u000bf");
        stringArray5[6] = sprrica.cfr_renamed_9("g1e<O<N");
        stringArray5[7] = "DSTU4145";
        cfr_renamed_96 = stringArray5;
        String[] stringArray6 = new String[18];
        stringArray6[0] = sprpsd.cfr_renamed_9("\u001f}\u000bfk\u0006i\u0003");
        stringArray6[1] = sprrica.cfr_renamed_9("o\u0019\u0010");
        stringArray6[2] = sprpsd.cfr_renamed_9("\u007f\u001c\u0006");
        stringArray6[3] = "MD5";
        stringArray6[4] = "SHA1";
        stringArray6[5] = sprrica.cfr_renamed_9("p\u0014r\u0018o\u0019\u0013o\u001a");
        stringArray6[6] = "RIPEMD160";
        stringArray6[7] = sprpsd.cfr_renamed_9("`\u0011b\u001d\u007f\u001c\u0000m\u0004");
        stringArray6[8] = sprrica.cfr_renamed_9("p\u0014r\u0018o\u0019\u0011o\u0012");
        stringArray6[9] = sprpsd.cfr_renamed_9("\u000bz\u0019\u0000j\u0006");
        stringArray6[10] = "SHA256";
        stringArray6[11] = "SHA384";
        stringArray6[12] = "SHA512";
        stringArray6[13] = sprrica.cfr_renamed_9("\u000ej\u001c\u0011");
        stringArray6[14] = sprpsd.cfr_renamed_9("a3W1\\");
        stringArray6[15] = sprrica.cfr_renamed_9("q\u0010\u0011");
        stringArray6[16] = sprpsd.cfr_renamed_9("f1U=@");
        stringArray6[17] = sprrica.cfr_renamed_9("u5K/N-M2N");
        cfr_renamed_112 = stringArray6;
        String[] stringArray7 = new String[2];
        stringArray7[0] = cfr_renamed_132;
        stringArray7[1] = sprpsd.cfr_renamed_9("\by\u001bai\u0000");
        cfr_renamed_105 = stringArray7;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cfr_renamed_127(String string, String string2) {
        void arg1;
        void arg0;
        return this.containsKey((String)arg0 + "." + (String)arg1) || this.containsKey(new StringBuilder().insert(0, sprrica.cfr_renamed_9("\u001cN:\f\u001cN4C.\f")).append((String)arg0).append(".").append((String)arg1).toString());
    }

    public sprbrb() {
        super(cfr_renamed_132, 1.51, cfr_renamed_107);
        AccessController.doPrivileged(new sprokb(this));
    }

    public static /* synthetic */ void cfr_renamed_2363(sprbrb arg0) {
        arg0.cfr_renamed_1257();
    }

    @Override
    public void cfr_renamed_1261(sprtzd arg0, sprj arg1) {
        cfr_renamed_152.put(arg0, arg1);
    }

    public static PrivateKey cfr_renamed_1253(sprmke arg0) throws IOException {
        sprj sprj2 = (sprj)cfr_renamed_152.get(arg0.cfr_renamed_1254().cfr_renamed_593());
        if (sprj2 == null) {
            return null;
        }
        return sprj2.cfr_renamed_1228(arg0);
    }
}

