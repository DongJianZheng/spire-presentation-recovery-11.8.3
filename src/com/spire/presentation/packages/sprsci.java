/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spramk;
import com.spire.presentation.packages.spranf;
import com.spire.presentation.packages.sprbci;
import com.spire.presentation.packages.sprbkf;
import com.spire.presentation.packages.sprbn;
import com.spire.presentation.packages.sprbz;
import com.spire.presentation.packages.sprcn;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdnf;
import com.spire.presentation.packages.sprdof;
import com.spire.presentation.packages.sprenf;
import com.spire.presentation.packages.spresf;
import com.spire.presentation.packages.sprgjf;
import com.spire.presentation.packages.sprjhi;
import com.spire.presentation.packages.sprjv;
import com.spire.presentation.packages.sprkji;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmi;
import com.spire.presentation.packages.sprndl;
import com.spire.presentation.packages.sprplf;
import com.spire.presentation.packages.sprqcf;
import com.spire.presentation.packages.sprqvca;
import com.spire.presentation.packages.sprqw;
import com.spire.presentation.packages.sprraf;
import com.spire.presentation.packages.sprrcf;
import com.spire.presentation.packages.spruci;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprwaf;
import com.spire.presentation.packages.sprxq;
import com.spire.presentation.packages.sprybl;
import java.io.IOException;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class sprsci
extends Provider
implements sprmi {
    private static final Map cfr_renamed_82;
    private static final String cfr_renamed_126 = "com.spire.psmodel.security.jcajce.provider.drbg.";
    private static final String[] cfr_renamed_88;
    private static final Logger cfr_renamed_31;
    public static final String cfr_renamed_272 = "BC";
    private static final String[] cfr_renamed_145;
    private static String cfr_renamed_114;
    private static final Class cfr_renamed_96;
    public static final sprqw cfr_renamed_105;
    private static final sprxq[] cfr_renamed_137;
    private static final String[] cfr_renamed_79;
    private static final String cfr_renamed_107 = "com.spire.psmodel.security.jcajce.provider.symmetric.";
    private static final String cfr_renamed_132 = "com.spire.psmodel.security.jcajce.provider.keystore.";
    private Map<String, Provider.Service> cfr_renamed_102;
    private static final String[] cfr_renamed_93;
    private static final String cfr_renamed_86 = "com.spire.psmodel.security.jcajce.provider.asymmetric.";
    private static final String[] cfr_renamed_152;
    private static final String[] cfr_renamed_112;
    private static final String cfr_renamed_119 = "com.spire.psmodel.security.jcajce.provider.digest.";
    private static final String[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5724(String string, sprlem sprlem2, String string2) {
        void arg2;
        void arg1;
        void arg0;
        sprsci sprsci2 = this;
        sprsci2.cfr_renamed_1260((String)arg0 + "." + arg1, (String)arg2);
        sprsci2.cfr_renamed_1260(new StringBuilder().insert(0, (String)arg0).append(spramk.cfr_renamed_9("\u0003fdm\u0003")).append(arg1).toString(), (String)arg2);
    }

    public static PrivateKey cfr_renamed_5729(sprcom arg0) throws IOException {
        sprcn sprcn2 = sprsci.cfr_renamed_5725(arg0.cfr_renamed_1254().cfr_renamed_593());
        if (sprcn2 == null) {
            return null;
        }
        return sprcn2.cfr_renamed_5653(arg0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cfr_renamed_127(String string, String string2) {
        void arg1;
        void arg0;
        return this.containsKey((String)arg0 + "." + (String)arg1) || this.containsKey(new StringBuilder().insert(0, sprqvca.cfr_renamed_9("$#\u0002a$#\f.\u0016a")).append((String)arg0).append(".").append((String)arg1).toString());
    }

    private /* synthetic */ void cfr_renamed_1258(String arg0, String[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 != arg1.length) {
            this.cfr_renamed_9168(arg0, arg1[n++]);
            n2 = n;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_9168(String arg0, String arg1) {
        Class clazz = spruci.cfr_renamed_5727(sprsci.class, new StringBuilder().insert(0, arg0).append(arg1).append(spramk.cfr_renamed_9("\tdLY]@CN^")).toString());
        if (clazz == null) {
            return;
        }
        try {
            ((sprplf)clazz.newInstance()).cfr_renamed_5728(this);
            return;
        }
        catch (Exception exception) {
            throw new InternalError(new StringBuilder().insert(0, sprqvca.cfr_renamed_9("\u0006.\u000b!\n;E,\u0017*\u0004;\u0000o\f!\u0016;\u0004!\u0006*E \u0003o")).append(arg0).append(arg1).append(spramk.cfr_renamed_9("\r`H]YDGJZ\r\u0013\r")).append(exception).toString());
        }
    }

    public static PublicKey cfr_renamed_5726(sprvhm arg0) throws IOException {
        if (arg0.cfr_renamed_593().cfr_renamed_593().cfr_renamed_5966(sprjv.cfr_renamed_1497)) {
            return new sprgjf().cfr_renamed_3215(arg0);
        }
        sprcn sprcn2 = sprsci.cfr_renamed_5725(arg0.cfr_renamed_593().cfr_renamed_593());
        if (sprcn2 == null) {
            return null;
        }
        return sprcn2.cfr_renamed_3215(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_9169(String arg0, sprxq[] arg1) {
        int n;
        int n2 = n = 0;
        while (true) {
            block4: {
                if (n2 == arg1.length) {
                    return;
                }
                sprxq sprxq2 = arg1[n];
                try {
                    sprybl.cfr_renamed_9170(sprxq2);
                    this.cfr_renamed_9168(arg0, sprxq2.cfr_renamed_9171());
                }
                catch (sprndl sprndl2) {
                    if (!cfr_renamed_31.isLoggable(Level.FINE)) break block4;
                    cfr_renamed_31.fine(new StringBuilder().insert(0, sprqvca.cfr_renamed_9("\u0016*\u00179\f,\u0000o\u0003 \u0017o")).append(sprxq2.cfr_renamed_9171()).append(spramk.cfr_renamed_9("\r@JGB[HM\rMXL\r]B\tNFCZY[L@C]^")).toString());
                }
            }
            n2 = ++n;
        }
    }

    @Override
    public void cfr_renamed_1260(String arg0, String arg1) {
        if (this.containsKey(arg0)) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprqvca.cfr_renamed_9("\u0001:\u0015#\f,\u0004;\u0000o\u0015=\n9\f+\u0000=E$\u00006Eg")).append(arg0).append(spramk.cfr_renamed_9("\u0004\tKFXGI")).toString());
        }
        this.put(arg0, arg1);
    }

    private static /* synthetic */ sprxq cfr_renamed_9172(String arg0, int arg1) {
        return new sprjhi(arg0, arg1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cfr_renamed_1262(String arg0, Object arg1) {
        sprqw sprqw2 = cfr_renamed_105;
        synchronized (sprqw2) {
            ((sprbci)cfr_renamed_105).cfr_renamed_1262(arg0, arg1);
            return;
        }
    }

    private /* synthetic */ void cfr_renamed_9173() {
        sprsci sprsci2 = this;
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_1575, new sprrcf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_1600, new sprrcf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_2920, new sprrcf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_1596, new sprrcf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_2860, new sprrcf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_272, new sprrcf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_2423, new sprrcf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_2, new sprrcf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_1228, new sprrcf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_3236, new sprrcf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_105, new sprrcf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_91, new sprrcf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_2956, new sprrcf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_2424, new sprrcf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_3239, new sprrcf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_1579, new sprrcf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_1217, new sprrcf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_956, new sprrcf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_1764, new sprrcf());
        sprsci2.cfr_renamed_5730(sprbn.cfr_renamed_82, new sprwaf());
        sprsci2.cfr_renamed_5730(sprbn.cfr_renamed_128, new spresf());
        sprsci2.cfr_renamed_5730(sprbn.cfr_renamed_1329, new sprqcf());
        sprsci2.cfr_renamed_5730(sprbz.cfr_renamed_3, new sprqcf());
        sprsci2.cfr_renamed_5730(sprbn.cfr_renamed_84, new sprraf());
        sprsci2.cfr_renamed_5730(sprbz.cfr_renamed_4, new sprraf());
        sprsci2.cfr_renamed_5730(sprdl.cfr_renamed_3, new sprdnf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_1497, new sprgjf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_3034, new sprbkf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_723, new sprbkf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_3240, new sprdof());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_3237, new sprdof());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_499, new sprdof());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_287, new sprdof());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_88, new sprdof());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_96, new sprdof());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_580, new spranf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_2807, new spranf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_2141, new spranf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_805, new spranf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_1339, new spranf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_3251, new spranf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_1472, new sprenf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_489, new sprenf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_3051, new sprenf());
        sprsci2.cfr_renamed_5730(sprjv.cfr_renamed_84, new sprenf());
    }

    @Override
    public sprcn cfr_renamed_5722(sprlem arg0) {
        return (sprcn)cfr_renamed_82.get(arg0);
    }

    static {
        cfr_renamed_31 = Logger.getLogger(sprsci.class.getName());
        cfr_renamed_114 = "BouncyCastle Security Provider v1.75";
        cfr_renamed_105 = new sprbci();
        cfr_renamed_82 = new HashMap();
        cfr_renamed_96 = spruci.cfr_renamed_5727(sprsci.class, sprqvca.cfr_renamed_9("\u000f.\u0013.K<\u0000,\u0010=\f;\u001ca\u0006*\u0017;K\u001f.\u0006=\u001d\u00009\n,\u0004;\f \u000b\f\r*\u0006$\u0000="));
        String[] stringArray = new String[5];
        stringArray[0] = spramk.cfr_renamed_9("}khyobio\u001c");
        stringArray[1] = sprqvca.cfr_renamed_9("\u001f'\n5\r.\u000b#}");
        stringArray[2] = spramk.cfr_renamed_9("}khyfj~\u0018\u001f");
        stringArray[3] = sprqvca.cfr_renamed_9("1\u00036\u0004!\t");
        stringArray[4] = spramk.cfr_renamed_9("zn{tyy");
        cfr_renamed_88 = stringArray;
        String[] stringArray2 = new String[3];
        stringArray2[0] = sprqvca.cfr_renamed_9("\u001c\f?-.\u0016'");
        stringArray2[1] = spramk.cfr_renamed_9("zDYeH^A\u001c\u001b\u0015");
        stringArray2[2] = sprqvca.cfr_renamed_9("5 \t6T|Uz");
        cfr_renamed_145 = stringArray2;
        sprxq[] sprxqArray = new sprxq[38];
        sprxqArray[0] = sprsci.cfr_renamed_9172(spramk.cfr_renamed_9("ll~"), 256);
        sprxqArray[1] = sprsci.cfr_renamed_9172(sprqvca.cfr_renamed_9("$\u001d&{"), 20);
        sprxqArray[2] = sprsci.cfr_renamed_9172(spramk.cfr_renamed_9("h\u007f`l"), 256);
        sprxqArray[3] = sprsci.cfr_renamed_9172(sprqvca.cfr_renamed_9("'#\n8\u0003&\u0016'"), 128);
        sprxqArray[4] = sprsci.cfr_renamed_9172(spramk.cfr_renamed_9("jLDHEA@L"), 256);
        sprxqArray[5] = sprsci.cfr_renamed_9172(sprqvca.cfr_renamed_9("\f$\u001c1z"), 128);
        sprxqArray[6] = sprsci.cfr_renamed_9172(spramk.cfr_renamed_9("nh~}\u001b"), 256);
        sprxqArray[7] = sprsci.cfr_renamed_9172(sprqvca.cfr_renamed_9("&'\u0004\f\r."), 128);
        sprxqArray[8] = sprsci.cfr_renamed_9172("DES", 56);
        sprxqArray[9] = sprsci.cfr_renamed_9172(spramk.cfr_renamed_9("mhzHMH"), 112);
        sprxqArray[10] = sprsci.cfr_renamed_9172(sprqvca.cfr_renamed_9("\b*\u001c1}]~Qx"), 128);
        sprxqArray[11] = sprsci.cfr_renamed_9172(spramk.cfr_renamed_9("j[L@C_\u001c"), 128);
        sprxqArray[12] = sprsci.cfr_renamed_9172(sprqvca.cfr_renamed_9("\"=\u0004&\u000b~Ww"), 128);
        sprxqArray[13] = sprsci.cfr_renamed_9172(spramk.cfr_renamed_9("ej\u001c\u001b\u0015"), 128);
        sprxqArray[14] = sprsci.cfr_renamed_9172(sprqvca.cfr_renamed_9("\u0007&}Py"), 256);
        sprxqArray[15] = sprsci.cfr_renamed_9172(spramk.cfr_renamed_9("`ill"), 128);
        sprxqArray[16] = sprsci.cfr_renamed_9172(sprqvca.cfr_renamed_9("\u0001\n*\u000e*\n!"), 128);
        sprxqArray[17] = sprsci.cfr_renamed_9172("RC2", 128);
        sprxqArray[18] = sprsci.cfr_renamed_9172(spramk.cfr_renamed_9("\u007fj\u0018"), 128);
        sprxqArray[19] = sprsci.cfr_renamed_9172(sprqvca.cfr_renamed_9("\u001d&y"), 256);
        sprxqArray[20] = sprsci.cfr_renamed_9172("Rijndael", 256);
        sprxqArray[21] = sprsci.cfr_renamed_9172(spramk.cfr_renamed_9("~HAZL\u001b\u001d"), 128);
        sprxqArray[22] = sprsci.cfr_renamed_9172(sprqvca.cfr_renamed_9("6\n \u000b"), 128);
        sprxqArray[23] = sprsci.cfr_renamed_9172(spramk.cfr_renamed_9("~L_YHGY"), 256);
        sprxqArray[24] = sprsci.cfr_renamed_9172(sprqvca.cfr_renamed_9("\u001c\r.\u0006.\t}"), 128);
        sprxqArray[25] = sprsci.cfr_renamed_9172(spramk.cfr_renamed_9("zF@]CLJF"), 80);
        sprxqArray[26] = sprsci.cfr_renamed_9172(sprqvca.cfr_renamed_9("\u001c({"), 128);
        sprxqArray[27] = sprsci.cfr_renamed_9172(spramk.cfr_renamed_9("yll"), 128);
        sprxqArray[28] = sprsci.cfr_renamed_9172(sprqvca.cfr_renamed_9("\u001b\u0012 \u0003&\u0016'"), 256);
        sprxqArray[29] = sprsci.cfr_renamed_9172(spramk.cfr_renamed_9("yA_LHODZE"), 128);
        sprxqArray[30] = sprsci.cfr_renamed_9172(sprqvca.cfr_renamed_9("3\u00025\f"), 128);
        sprxqArray[31] = sprsci.cfr_renamed_9172(spramk.cfr_renamed_9("\u007f`ynb~h\u001e"), 128);
        sprxqArray[32] = sprsci.cfr_renamed_9172(sprqvca.cfr_renamed_9("=\u001b \u000e"), 128);
        sprxqArray[33] = sprsci.cfr_renamed_9172(spramk.cfr_renamed_9("q~HAZL\u001b\u001d"), 128);
        sprxqArray[34] = sprsci.cfr_renamed_9172(sprqvca.cfr_renamed_9("*?\u0000!6\u001c)\u001f'\u0004!\t"), 128);
        sprxqArray[35] = sprsci.cfr_renamed_9172(spramk.cfr_renamed_9("m~}x\u001e\u001b\u001b\u0019"), 256);
        sprxqArray[36] = sprsci.cfr_renamed_9172(sprqvca.cfr_renamed_9("\b*\u001c1|Q~W\u0010W\u007fTz"), 256);
        sprxqArray[37] = sprsci.cfr_renamed_9172(spramk.cfr_renamed_9("w\\N"), 128);
        cfr_renamed_137 = sprxqArray;
        String[] stringArray3 = new String[4];
        stringArray3[0] = sprqvca.cfr_renamed_9("=zUv");
        stringArray3[1] = spramk.cfr_renamed_9("dl~");
        stringArray3[2] = sprqvca.cfr_renamed_9("\f*\u00025\u00006\u00061\n");
        stringArray3[3] = spramk.cfr_renamed_9("lu}h{cha");
        cfr_renamed_93 = stringArray3;
        String[] stringArray4 = new String[15];
        stringArray4[0] = "DSA";
        stringArray4[1] = sprqvca.cfr_renamed_9("!\u0007");
        stringArray4[2] = "EC";
        stringArray4[3] = "RSA";
        stringArray4[4] = spramk.cfr_renamed_9("nbzy");
        stringArray4[5] = sprqvca.cfr_renamed_9(" \f\"\u00006\u001b");
        stringArray4[6] = spramk.cfr_renamed_9("hEjH@HA");
        stringArray4[7] = "DSTU4145";
        stringArray4[8] = sprqvca.cfr_renamed_9("\"\u0002");
        stringArray4[9] = spramk.cfr_renamed_9("lIln");
        stringArray4[10] = sprqvca.cfr_renamed_9("\u0003(\u001c");
        stringArray4[11] = spramk.cfr_renamed_9("~ye`cj~yA\\^");
        stringArray4[12] = sprqvca.cfr_renamed_9("\u000b\f#\f;\r&\u0010\"");
        stringArray4[13] = spramk.cfr_renamed_9("oLENFC");
        stringArray4[14] = sprqvca.cfr_renamed_9("+\u001b7\u001a");
        cfr_renamed_112 = stringArray4;
        String[] stringArray5 = new String[24];
        stringArray5[0] = spramk.cfr_renamed_9("nbzy\u001a\u0019\u0018\u001c");
        stringArray5[1] = sprqvca.cfr_renamed_9(".*\u0006,\u0004$");
        stringArray5[2] = spramk.cfr_renamed_9("`m\u001f");
        stringArray5[3] = sprqvca.cfr_renamed_9("\u0002!{");
        stringArray5[4] = "MD5";
        stringArray5[5] = "SHA1";
        stringArray5[6] = spramk.cfr_renamed_9("\u007f`}l`m\u001c\u001b\u0015");
        stringArray5[7] = "RIPEMD160";
        stringArray5[8] = sprqvca.cfr_renamed_9("\u001d,\u001f \u0002!}Py");
        stringArray5[9] = spramk.cfr_renamed_9("\u007f`}l`m\u001e\u001b\u001d");
        stringArray5[10] = sprqvca.cfr_renamed_9("6\u0007$}W{");
        stringArray5[11] = "SHA256";
        stringArray5[12] = "SHA384";
        stringArray5[13] = "SHA512";
        stringArray5[14] = spramk.cfr_renamed_9("zeh\u001e");
        stringArray5[15] = sprqvca.cfr_renamed_9("\u001c\u000e*\f!");
        stringArray5[16] = spramk.cfr_renamed_9("~d\u001e");
        stringArray5[17] = sprqvca.cfr_renamed_9("\u001b\f(\u0000=");
        stringArray5[18] = spramk.cfr_renamed_9("zAD[AYBFA");
        stringArray5[19] = sprqvca.cfr_renamed_9("\r\t.\u000e*W-");
        stringArray5[20] = spramk.cfr_renamed_9("oELBH\u001b^");
        stringArray5[21] = sprqvca.cfr_renamed_9("!\u001c1\u001aRzS{");
        stringArray5[22] = spramk.cfr_renamed_9("aL[LBL");
        stringArray5[23] = sprqvca.cfr_renamed_9("'#\u0004$\u0000|");
        cfr_renamed_4 = stringArray5;
        String[] stringArray6 = new String[3];
        stringArray6[0] = cfr_renamed_272;
        stringArray6[1] = spramk.cfr_renamed_9("ojkb~");
        stringArray6[2] = sprqvca.cfr_renamed_9("5\u0004&\u001cT}");
        cfr_renamed_79 = stringArray6;
        String[] stringArray7 = new String[1];
        stringArray7[0] = spramk.cfr_renamed_9("m\u007fkj");
        cfr_renamed_152 = stringArray7;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5719(String string, String string2, Map<String, String> map) {
        void arg2;
        void arg1;
        void arg0;
        sprsci sprsci2 = this;
        sprsci2.cfr_renamed_1260((String)arg0, (String)arg1);
        sprsci2.cfr_renamed_5720(string, (Map<String, String>)arg2);
    }

    public sprsci() {
        super(cfr_renamed_272, 1.75, cfr_renamed_114);
        sprsci sprsci2 = this;
        sprsci2.cfr_renamed_102 = new ConcurrentHashMap<String, Provider.Service>();
        AccessController.doPrivileged(new sprkji(this));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5723(String string, sprlem sprlem2, String string2, Map<String, String> map) {
        void arg3;
        void arg1;
        void arg0;
        sprsci sprsci2 = this;
        sprsci2.cfr_renamed_5724(string, sprlem2, string2);
        sprsci2.cfr_renamed_5720((String)arg0 + "." + arg1, (Map<String, String>)arg3);
        this.cfr_renamed_5720(new StringBuilder().insert(0, (String)arg0).append(sprqvca.cfr_renamed_9("a*\u0006!a")).append(arg1).toString(), (Map<String, String>)arg3);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static /* synthetic */ sprcn cfr_renamed_5725(sprlem arg0) {
        Map map = cfr_renamed_82;
        // MONITORENTER : map
        // MONITOREXIT : map
        return (sprcn)cfr_renamed_82.get(arg0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cfr_renamed_5730(sprlem arg0, sprcn arg1) {
        Map map = cfr_renamed_82;
        synchronized (map) {
            cfr_renamed_82.put(arg0, arg1);
            return;
        }
    }

    public static /* synthetic */ void cfr_renamed_9174(sprsci arg0) {
        arg0.cfr_renamed_1257();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Provider.Service getService(String arg0, String arg1) {
        String string = sprkoe.cfr_renamed_116(arg1);
        String string2 = new StringBuilder().insert(0, arg0).append(".").append(string).toString();
        Provider.Service service = this.cfr_renamed_102.get(string2);
        if (service != null) {
            return service;
        }
        sprsci sprsci2 = this;
        synchronized (sprsci2) {
            sprsci sprsci3;
            if (!this.cfr_renamed_102.containsKey(string2)) {
                service = super.getService(arg0, arg1);
                if (service == null) {
                    return null;
                }
                this.cfr_renamed_102.put(string2, service);
                super.remove(service.getType() + "." + service.getAlgorithm());
                super.putService(service);
                sprsci3 = sprsci2;
            } else {
                service = this.cfr_renamed_102.get(string2);
                sprsci3 = sprsci2;
            }
            // ** MonitorExit[v0] (shouldn't be in output)
            return service;
        }
    }

    private /* synthetic */ void cfr_renamed_1257() {
        sprsci sprsci2;
        sprsci sprsci3 = this;
        sprsci sprsci4 = this;
        sprsci sprsci5 = this;
        sprsci sprsci6 = this;
        this.cfr_renamed_1258(cfr_renamed_119, cfr_renamed_4);
        sprsci6.cfr_renamed_1258(cfr_renamed_107, cfr_renamed_88);
        sprsci6.cfr_renamed_1258(cfr_renamed_107, cfr_renamed_145);
        sprsci5.cfr_renamed_9169(cfr_renamed_107, cfr_renamed_137);
        sprsci5.cfr_renamed_1258(cfr_renamed_86, cfr_renamed_93);
        sprsci4.cfr_renamed_1258(cfr_renamed_86, cfr_renamed_112);
        sprsci4.cfr_renamed_1258(cfr_renamed_132, cfr_renamed_79);
        sprsci3.cfr_renamed_1258(cfr_renamed_126, cfr_renamed_152);
        sprsci3.cfr_renamed_9173();
        sprsci3.put(spramk.cfr_renamed_9("q\u0018\u0019\u0014zYF_L\u0003jh{y`k`nhyl\u0002jbealn}dfc"), "com.spire.presentation.packages.sprtoh");
        this.put(sprqvca.cfr_renamed_9("\u0017P\u007f\\\u001c\u0011 \u0017*K\u000e1\u001b7\u0006'\u001a1\n&\n7\u001b,\t,\f$\u001b `&\u0000)\u0003 \f1\u0006*\u0001"), "com.spire.presentation.packages.sprpth");
        this.put(spramk.cfr_renamed_9("q\u0018\u0019\u0014zYF_L\u0003j\u007fe\u0002jbealn}dfc"), "com.spire.presentation.packages.sprioh");
        this.put(sprqvca.cfr_renamed_9("=zUv6;\n=\u0000a&\n7\u001b,\t,\f$\u001b \u001f$\u00067`&\u0000)\u0003 \f1\u0006*\u0001"), "com.spire.presentation.packages.sprosh");
        this.put(spramk.cfr_renamed_9("q\u0018\u0019\u0014zYF_L\u0003jh{y`k`nhyl\u0002eih}"), "com.spire.presentation.packages.sprryh");
        this.put(sprqvca.cfr_renamed_9("=zUv6;\n=\u0000a&\u001d)`)\u000b$\u001f"), "com.spire.presentation.packages.sprvqh");
        this.put(spramk.cfr_renamed_9("u\u001c\u001d\u0010~]B[H\u0007l}y{dkx}hjh{y`k`nhyl\u0002eih}"), "com.spire.presentation.packages.sprxth");
        this.put(sprqvca.cfr_renamed_9("=zUv6;\n=\u0000a&\n7\u001b,\t,\f$\u001b \u001f$\u00067`)\u000b$\u001f"), "com.spire.presentation.packages.sprlth");
        this.put(spramk.cfr_renamed_9("q\u0018\u0019\u0014zY[HH@yL[^L_\u0007nl\u007f}dodjl}h"), "com.spire.presentation.packages.sprfoh");
        this.put(sprqvca.cfr_renamed_9("\u0017P\u007f\\\u001c\u0011=\u0000.\b\u001f\u0004=\u0016*\u0017a$\u001b1\u001d,\r0\u001b \f \u001d1\u0006#\u0006&\u000e1\n"), "com.spire.presentation.packages.spryvh");
        this.put(spramk.cfr_renamed_9("q\u0018\u0019\u0014zY[HH@yL[^L_\u0007n{a"), "com.spire.presentation.packages.sprivh");
        this.put(sprqvca.cfr_renamed_9("=zUv6;\u0017*\u0004\"5.\u0017<\u0000=K\f \u001d1\u0006#\u0006&\u000e1\n5\u000e,\u001d"), "com.spire.presentation.packages.sprkxh");
        this.put(spramk.cfr_renamed_9("n@]AH[\u0003k\u007ffflcyolz`ya`m\u0018hcmil~"), "com.spire.presentation.packages.spryii");
        this.put(sprqvca.cfr_renamed_9("&&\u0015'\u0000=K\r7\u0000.\n+\u001f'\n2\u00061\u00076\u0007$~$\u0001!\u000b \u001c"), "com.spire.presentation.packages.sproji");
        this.put(spramk.cfr_renamed_9("jDYEL_\u0007beiyolz`ya~alhcmy~bodze\u0004nkn"), "com.spire.presentation.packages.sprrzh");
        if (cfr_renamed_96 != null) {
            Object object = this.put(sprqvca.cfr_renamed_9("\f\u0000=\u0011\u001f\u0004;\r\u0019\u0004#\f+\u0004;\n=K\u001d#\fV}]~"), "com.spire.presentation.packages.sprsph");
            sprsci sprsci7 = this;
            this.put(spramk.cfr_renamed_9("nL_]}HYAo\\DEIL_\u0007\u007fon\u001a\u001f\u0011\u001c"), "com.spire.presentation.packages.spraoh");
            sprsci2 = sprsci7;
            sprsci7.put(sprqvca.cfr_renamed_9("\f\u0000=\u0011\u001f\u0004;\r\u0019\u0004#\f+\u0004;\n=K\u001d#\fV}]\u007f"), "com.spire.presentation.packages.sprynh");
            this.put(spramk.cfr_renamed_9("nL_]}HYAo\\DEIL_\u0007\u007fon\u001a\u001f\u0011\u001d"), "com.spire.presentation.packages.spryrh");
            this.put(sprqvca.cfr_renamed_9("&*\u0017;5.\u0011'3.\t&\u0001.\u0011 \u0017a5\u0004,\u0017"), "com.spire.presentation.packages.sprynh");
            this.put(spramk.cfr_renamed_9("jH[YyL]EkX@AMH[\u0003yf`u"), "com.spire.presentation.packages.spryrh");
        } else {
            sprsci sprsci8 = this;
            sprsci2 = sprsci8;
            sprsci8.put(sprqvca.cfr_renamed_9("\f\u0000=\u0011\u001f\u0004;\r\u0019\u0004#\f+\u0004;\n=K\u001d#\fV}]~"), "com.spire.presentation.packages.sprsph");
            this.put(spramk.cfr_renamed_9("nL_]}HYAo\\DEIL_\u0007\u007fon\u001a\u001f\u0011\u001c"), "com.spire.presentation.packages.spraoh");
            this.put(sprqvca.cfr_renamed_9("\f\u0000=\u0011\u001f\u0004;\r\u0019\u0004#\f+\u0004;\n=K\u001d#\fV}]\u007f"), "com.spire.presentation.packages.sprpsh");
            this.put(spramk.cfr_renamed_9("nL_]}HYAo\\DEIL_\u0007\u007fon\u001a\u001f\u0011\u001d"), "com.spire.presentation.packages.spryth");
            this.put(sprqvca.cfr_renamed_9("&*\u0017;5.\u0011'3.\t&\u0001.\u0011 \u0017a5\u0004,\u0017"), "com.spire.presentation.packages.sprpsh");
            this.put(spramk.cfr_renamed_9("jH[YyL]EkX@AMH[\u0003yf`u"), "com.spire.presentation.packages.spryth");
        }
        sprsci2.put(sprqvca.cfr_renamed_9("&*\u0017;6;\n=\u0000a& \t#\u0000,\u0011&\n!"), "com.spire.presentation.packages.sprrfi");
        this.put(spramk.cfr_renamed_9("jH[YzYF_L\u0003eih}"), "com.spire.presentation.packages.sprquh");
        this.put(sprqvca.cfr_renamed_9("\f\u0000=\u0011\u001c\u0011 \u0017*K\u0002\u0010#\u0011&"), "com.spire.presentation.packages.sprywh");
        this.put(spramk.cfr_renamed_9("hAN\u0003hA@LZ\u0003jH[YzYF_L\u0003q\u0018\u0019\u0014eih}"), sprqvca.cfr_renamed_9(")\u000b$\u001f"));
        this.getService(spramk.cfr_renamed_9("zHJX[H{LGIF@"), sprqvca.cfr_renamed_9("\u000b \t$\u001a)\u001b"));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5720(String string, Map<String, String> map) {
        void arg1;
        void arg0;
        this.put((String)arg0 + spramk.cfr_renamed_9("\tdD]EHDHGYLI`C"), "Software");
        Iterator iterator = arg1.keySet().iterator();
        Iterator iterator2 = iterator;
        while (iterator2.hasNext()) {
            String string2 = (String)iterator.next();
            String string3 = new StringBuilder().insert(0, (String)arg0).append(" ").append(string2).toString();
            if (this.containsKey(string3)) {
                throw new IllegalStateException(new StringBuilder().insert(0, sprqvca.cfr_renamed_9("\u0001:\u0015#\f,\u0004;\u0000o\u0015=\n9\f+\u0000=E.\u0011;\u0017&\u0007:\u0011*E$\u00006Eg")).append(string3).append(spramk.cfr_renamed_9("\u0004\tKFXGI")).toString());
            }
            this.put(string3, arg1.get(string2));
            iterator2 = iterator;
        }
    }
}

