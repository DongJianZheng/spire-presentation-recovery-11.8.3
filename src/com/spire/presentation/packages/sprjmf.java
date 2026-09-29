/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgl;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprgp;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprhei;
import com.spire.presentation.packages.sprjs;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sproal;
import com.spire.presentation.packages.sprook;
import com.spire.presentation.packages.sprow;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprriq;
import com.spire.presentation.packages.sprsx;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprvsz;
import com.spire.presentation.packages.sprwhl;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.sprxu;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.crypto.KeyAgreementSpi;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

public abstract class sprjmf
extends KeyAgreementSpi {
    private static final Map<String, Integer> cfr_renamed_152;
    public final String cfr_renamed_112;
    private sprhei cfr_renamed_119;
    public final sprjs cfr_renamed_91;
    private static final Map<String, sprlem> cfr_renamed_0;
    private static final Hashtable cfr_renamed_1;
    private static final Map<String, String> cfr_renamed_2;
    private static final Hashtable cfr_renamed_3;
    public byte[] cfr_renamed_4;

    private /* synthetic */ byte[] cfr_renamed_9391() {
        if (this.cfr_renamed_119 != null) {
            byte[] byArray = this.cfr_renamed_5696();
            byte[] byArray2 = sproze.cfr_renamed_543(byArray, this.cfr_renamed_119.cfr_renamed_1144());
            sproze.cfr_renamed_3408(byArray);
            return byArray2;
        }
        return this.cfr_renamed_5696();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ byte[] cfr_renamed_9392(byte[] arg0, String arg1, int arg2) throws NoSuchAlgorithmException {
        if (this.cfr_renamed_91 != null) {
            sprjmf sprjmf2;
            if (arg2 < 0) {
                throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprriq.cfr_renamed_9("{XeXaA`\u0016oZiY|_z^c\u0016kXmY{XzS|Sj\f.")).append(arg1).toString());
            }
            byte[] byArray = new byte[arg2 / 8];
            if (this.cfr_renamed_91 instanceof sprbgl) {
                sprlem sprlem2;
                if (arg1 == null) {
                    throw new NoSuchAlgorithmException(sprvsz.cfr_renamed_9("nFhE}C{Bb\n@cK\nfY/DzFc"));
                }
                try {
                    sprlem2 = new sprlem(arg1);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprriq.cfr_renamed_9("Xa\u0016A\u007fJ\u0016hY|\u0016oZiY|_z^c\f.")).append(arg1).toString());
                }
                sprwhl sprwhl2 = new sprwhl(sprlem2, arg2, arg0, this.cfr_renamed_4);
                sprjmf sprjmf3 = this;
                sprjmf2 = sprjmf3;
                sprjmf3.cfr_renamed_91.cfr_renamed_5671(sprwhl2);
            } else {
                sprook sprook2 = new sprook(arg0, this.cfr_renamed_4);
                sprjmf sprjmf4 = this;
                sprjmf2 = sprjmf4;
                sprjmf4.cfr_renamed_91.cfr_renamed_5671(sprook2);
            }
            sprjmf2.cfr_renamed_91.cfr_renamed_2341(byArray, 0, byArray.length);
            sproze.cfr_renamed_3408(arg0);
            return byArray;
        }
        if (arg2 > 0) {
            byte[] byArray = new byte[arg2 / 8];
            System.arraycopy(arg0, 0, byArray, 0, byArray.length);
            sproze.cfr_renamed_3408(arg0);
            return byArray;
        }
        return arg0;
    }

    @Override
    public SecretKey engineGenerateSecret(String arg0) throws NoSuchAlgorithmException {
        String string = arg0;
        String string2 = sprkoe.cfr_renamed_116(string);
        String string3 = string;
        if (cfr_renamed_3.containsKey(string2)) {
            string3 = ((sprlem)cfr_renamed_3.get(string2)).cfr_renamed_19();
        }
        int n = sprjmf.cfr_renamed_1595(string3);
        sprjmf sprjmf2 = this;
        byte[] byArray = sprjmf2.cfr_renamed_9392(sprjmf2.cfr_renamed_9391(), string3, n);
        String string4 = sprjmf.cfr_renamed_9393(arg0);
        if (cfr_renamed_1.containsKey(string4)) {
            sproal.cfr_renamed_1520(byArray);
        }
        return new SecretKeySpec(byArray, string4);
    }

    /*
     * WARNING - void declaration
     */
    public sprjmf(String string, sprjs sprjs2) {
        void arg0;
        sprjmf sprjmf2 = this;
        sprjmf2.cfr_renamed_112 = arg0;
        sprjmf2.cfr_renamed_91 = sprjs2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(Key arg0, SecureRandom arg1) throws InvalidKeyException {
        try {
            this.cfr_renamed_5691(arg0, null, arg1);
            return;
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new InvalidKeyException(invalidAlgorithmParameterException.getMessage());
        }
    }

    @Override
    public void engineInit(Key arg0, AlgorithmParameterSpec arg1, SecureRandom arg2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (arg1 instanceof sprhei) {
            this.cfr_renamed_119 = (sprhei)arg1;
            sprjmf sprjmf2 = this;
            sprjmf2.cfr_renamed_5691(arg0, sprjmf2.cfr_renamed_119.cfr_renamed_9203(), arg2);
            return;
        }
        this.cfr_renamed_119 = null;
        this.cfr_renamed_5691(arg0, arg1, arg2);
    }

    static {
        cfr_renamed_0 = new HashMap<String, sprlem>();
        cfr_renamed_152 = new HashMap<String, Integer>();
        cfr_renamed_2 = new HashMap<String, String>();
        cfr_renamed_3 = new Hashtable();
        cfr_renamed_1 = new Hashtable();
        Integer n = spruaf.cfr_renamed_279(64);
        Integer n2 = spruaf.cfr_renamed_279(128);
        Integer n3 = spruaf.cfr_renamed_279(192);
        Integer n4 = spruaf.cfr_renamed_279(256);
        cfr_renamed_152.put("DES", n);
        cfr_renamed_152.put(sprvsz.cfr_renamed_9("nJyJnJ"), n3);
        cfr_renamed_152.put(sprriq.cfr_renamed_9("tByYpGeF"), n2);
        cfr_renamed_152.put(sprvsz.cfr_renamed_9("No\\"), n4);
        cfr_renamed_152.put(sprwr.cfr_renamed_1472.cfr_renamed_19(), n2);
        cfr_renamed_152.put(sprwr.cfr_renamed_1221.cfr_renamed_19(), n3);
        cfr_renamed_152.put(sprwr.cfr_renamed_1397.cfr_renamed_19(), n4);
        cfr_renamed_152.put(sprwr.cfr_renamed_88.cfr_renamed_19(), n2);
        cfr_renamed_152.put(sprwr.cfr_renamed_1223.cfr_renamed_19(), n3);
        cfr_renamed_152.put(sprwr.cfr_renamed_724.cfr_renamed_19(), n4);
        cfr_renamed_152.put(sprwr.cfr_renamed_1197.cfr_renamed_19(), n2);
        cfr_renamed_152.put(sprwr.cfr_renamed_953.cfr_renamed_19(), n3);
        cfr_renamed_152.put(sprwr.cfr_renamed_615.cfr_renamed_19(), n4);
        cfr_renamed_152.put(sprwr.cfr_renamed_722.cfr_renamed_19(), n2);
        cfr_renamed_152.put(sprwr.cfr_renamed_152.cfr_renamed_19(), n3);
        cfr_renamed_152.put(sprwr.cfr_renamed_956.cfr_renamed_19(), n4);
        cfr_renamed_152.put(sprwr.cfr_renamed_136.cfr_renamed_19(), n2);
        cfr_renamed_152.put(sprwr.cfr_renamed_287.cfr_renamed_19(), n3);
        cfr_renamed_152.put(sprwr.cfr_renamed_3.cfr_renamed_19(), n4);
        cfr_renamed_152.put(sprwr.cfr_renamed_951.cfr_renamed_19(), n2);
        cfr_renamed_152.put(sprwr.cfr_renamed_107.cfr_renamed_19(), n3);
        cfr_renamed_152.put(sprwr.cfr_renamed_1228.cfr_renamed_19(), n4);
        cfr_renamed_152.put(sprwr.cfr_renamed_134.cfr_renamed_19(), n2);
        cfr_renamed_152.put(sprwr.cfr_renamed_133.cfr_renamed_19(), n3);
        cfr_renamed_152.put(sprwr.cfr_renamed_805.cfr_renamed_19(), n4);
        cfr_renamed_152.put(sprsx.cfr_renamed_91.cfr_renamed_19(), n2);
        cfr_renamed_152.put(sprsx.cfr_renamed_0.cfr_renamed_19(), n3);
        cfr_renamed_152.put(sprsx.cfr_renamed_3.cfr_renamed_19(), n4);
        cfr_renamed_152.put(sprgp.cfr_renamed_3.cfr_renamed_19(), n2);
        cfr_renamed_152.put(sprdl.cfr_renamed_152.cfr_renamed_19(), n3);
        cfr_renamed_152.put(sprdl.cfr_renamed_2797.cfr_renamed_19(), n3);
        cfr_renamed_152.put(sprgt.cfr_renamed_2.cfr_renamed_19(), n);
        cfr_renamed_152.put(sprqo.cfr_renamed_132.cfr_renamed_19(), n4);
        cfr_renamed_152.put(sprqo.cfr_renamed_119.cfr_renamed_19(), n4);
        cfr_renamed_152.put(sprqo.cfr_renamed_3.cfr_renamed_19(), n4);
        cfr_renamed_152.put(sprdl.cfr_renamed_1763.cfr_renamed_19(), spruaf.cfr_renamed_279(160));
        cfr_renamed_152.put(sprdl.cfr_renamed_131.cfr_renamed_19(), n4);
        cfr_renamed_152.put(sprdl.cfr_renamed_1223.cfr_renamed_19(), spruaf.cfr_renamed_279(384));
        cfr_renamed_152.put(sprdl.cfr_renamed_2956.cfr_renamed_19(), spruaf.cfr_renamed_279(512));
        cfr_renamed_0.put(sprriq.cfr_renamed_9("rKeKrK"), sprdl.cfr_renamed_2797);
        cfr_renamed_0.put(sprvsz.cfr_renamed_9("No\\"), sprwr.cfr_renamed_724);
        cfr_renamed_0.put(sprriq.cfr_renamed_9("uO{KzB\u007fO"), sprsx.cfr_renamed_4);
        cfr_renamed_0.put(sprvsz.cfr_renamed_9("yJoK"), sprgp.cfr_renamed_4);
        cfr_renamed_0.put("DES", sprgt.cfr_renamed_2);
        cfr_renamed_2.put(sprow.cfr_renamed_107.cfr_renamed_19(), sprriq.cfr_renamed_9("Mw]b;"));
        cfr_renamed_2.put(sprow.cfr_renamed_953.cfr_renamed_19(), sprvsz.cfr_renamed_9("cKoN"));
        cfr_renamed_2.put(sprow.cfr_renamed_728.cfr_renamed_19(), sprriq.cfr_renamed_9("tbYyPgEf"));
        cfr_renamed_2.put(sprow.cfr_renamed_135.cfr_renamed_19(), sprvsz.cfr_renamed_9("hcExLfYg"));
        cfr_renamed_2.put(sprow.cfr_renamed_287.cfr_renamed_19(), sprriq.cfr_renamed_9("tbYyPgEf"));
        cfr_renamed_2.put(sprow.cfr_renamed_952.cfr_renamed_19(), sprvsz.cfr_renamed_9("hcExLfYg"));
        cfr_renamed_2.put(sprgt.cfr_renamed_1.cfr_renamed_19(), "DES");
        cfr_renamed_2.put(sprgt.cfr_renamed_2.cfr_renamed_19(), "DES");
        cfr_renamed_2.put(sprgt.cfr_renamed_91.cfr_renamed_19(), "DES");
        cfr_renamed_2.put(sprgt.cfr_renamed_112.cfr_renamed_19(), "DES");
        cfr_renamed_2.put(sprgt.cfr_renamed_102.cfr_renamed_19(), sprriq.cfr_renamed_9("rKekRk"));
        cfr_renamed_2.put(sprdl.cfr_renamed_2797.cfr_renamed_19(), sprvsz.cfr_renamed_9("nJyjNj"));
        cfr_renamed_2.put(sprdl.cfr_renamed_152.cfr_renamed_19(), sprriq.cfr_renamed_9("rKekRk"));
        cfr_renamed_2.put(sprdl.cfr_renamed_1435.cfr_renamed_19(), "RC2");
        cfr_renamed_2.put(sprdl.cfr_renamed_1763.cfr_renamed_19(), sprvsz.cfr_renamed_9("bbKlyGk>"));
        cfr_renamed_2.put(sprdl.cfr_renamed_3240.cfr_renamed_19(), sprriq.cfr_renamed_9("~cWmeFw<\u0004:"));
        cfr_renamed_2.put(sprdl.cfr_renamed_131.cfr_renamed_19(), sprvsz.cfr_renamed_9("bbKlyGk=\u001f9"));
        cfr_renamed_2.put(sprdl.cfr_renamed_1223.cfr_renamed_19(), sprriq.cfr_renamed_9("~cWmeFw=\u000e:"));
        cfr_renamed_2.put(sprdl.cfr_renamed_2956.cfr_renamed_19(), sprvsz.cfr_renamed_9("bbKlyGk:\u001b="));
        cfr_renamed_2.put(sprsx.cfr_renamed_2.cfr_renamed_19(), sprriq.cfr_renamed_9("uo[kZb_o"));
        cfr_renamed_2.put(sprsx.cfr_renamed_1.cfr_renamed_19(), sprvsz.cfr_renamed_9("inGjFcCn"));
        cfr_renamed_2.put(sprsx.cfr_renamed_4.cfr_renamed_19(), sprriq.cfr_renamed_9("uo[kZb_o"));
        cfr_renamed_2.put(sprsx.cfr_renamed_91.cfr_renamed_19(), sprvsz.cfr_renamed_9("inGjFcCn"));
        cfr_renamed_2.put(sprsx.cfr_renamed_0.cfr_renamed_19(), sprriq.cfr_renamed_9("uo[kZb_o"));
        cfr_renamed_2.put(sprsx.cfr_renamed_3.cfr_renamed_19(), sprvsz.cfr_renamed_9("inGjFcCn"));
        cfr_renamed_2.put(sprgp.cfr_renamed_3.cfr_renamed_19(), sprriq.cfr_renamed_9("eKsJ"));
        cfr_renamed_2.put(sprgp.cfr_renamed_4.cfr_renamed_19(), sprvsz.cfr_renamed_9("yJoK"));
        cfr_renamed_2.put(sprgp.cfr_renamed_0.cfr_renamed_19(), sprriq.cfr_renamed_9("eKsJ"));
        cfr_renamed_2.put(sprqo.cfr_renamed_132.cfr_renamed_19(), sprvsz.cfr_renamed_9("He\\~=\u0012>\u001e8"));
        cfr_renamed_2.put(sprwr.cfr_renamed_136.cfr_renamed_19(), sprriq.cfr_renamed_9("Os]"));
        cfr_renamed_2.put(sprwr.cfr_renamed_951.cfr_renamed_19(), sprvsz.cfr_renamed_9("No\\"));
        cfr_renamed_2.put(sprwr.cfr_renamed_951.cfr_renamed_19(), sprriq.cfr_renamed_9("Os]"));
        cfr_renamed_3.put(sprvsz.cfr_renamed_9("nJyJnJ"), sprdl.cfr_renamed_2797);
        cfr_renamed_3.put(sprriq.cfr_renamed_9("Os]"), sprwr.cfr_renamed_724);
        cfr_renamed_3.put("DES", sprgt.cfr_renamed_2);
        cfr_renamed_1.put("DES", "DES");
        cfr_renamed_1.put(sprvsz.cfr_renamed_9("nJyJnJ"), "DES");
        cfr_renamed_1.put(sprgt.cfr_renamed_2.cfr_renamed_19(), "DES");
        cfr_renamed_1.put(sprdl.cfr_renamed_2797.cfr_renamed_19(), "DES");
        cfr_renamed_1.put(sprdl.cfr_renamed_152.cfr_renamed_19(), "DES");
    }

    public static int cfr_renamed_1595(String arg0) {
        if (arg0.indexOf(91) > 0) {
            String string = arg0;
            return Integer.parseInt(string.substring(arg0.indexOf(91) + 1, string.indexOf(93)));
        }
        String string = sprkoe.cfr_renamed_116(arg0);
        if (!cfr_renamed_152.containsKey(string)) {
            return -1;
        }
        return cfr_renamed_152.get(string);
    }

    public static String cfr_renamed_9393(String arg0) {
        if (arg0.indexOf(91) > 0) {
            String string = arg0;
            return string.substring(0, string.indexOf(91));
        }
        if (arg0.startsWith(sprwr.cfr_renamed_91.cfr_renamed_19())) {
            return sprriq.cfr_renamed_9("Os]");
        }
        if (arg0.startsWith(sprxu.cfr_renamed_145.cfr_renamed_19())) {
            return sprvsz.cfr_renamed_9("\\O}ZjD{");
        }
        String string = cfr_renamed_2.get(sprkoe.cfr_renamed_116(arg0));
        if (string != null) {
            return string;
        }
        return arg0;
    }

    public abstract byte[] cfr_renamed_5696();

    public static byte[] cfr_renamed_9394(byte[] arg0) {
        int n;
        if (arg0[0] != 0) {
            return arg0;
        }
        int n2 = n = 0;
        while (n2 < arg0.length && arg0[n] == 0) {
            n2 = ++n;
        }
        byte[] byArray = new byte[arg0.length - n];
        System.arraycopy(arg0, n, byArray, 0, byArray.length);
        return byArray;
    }

    public abstract void cfr_renamed_5691(Key var1, AlgorithmParameterSpec var2, SecureRandom var3) throws InvalidKeyException, InvalidAlgorithmParameterException;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineGenerateSecret() throws IllegalStateException {
        if (this.cfr_renamed_91 == null) {
            return this.cfr_renamed_9391();
        }
        byte[] byArray = this.cfr_renamed_9391();
        try {
            return this.cfr_renamed_9392(byArray, null, byArray.length * 8);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new IllegalStateException(noSuchAlgorithmException.getMessage());
        }
    }

    @Override
    public int engineGenerateSecret(byte[] arg0, int arg1) throws IllegalStateException, ShortBufferException {
        byte[] byArray = this.engineGenerateSecret();
        if (arg0.length - arg1 < byArray.length) {
            throw new ShortBufferException(new StringBuilder().insert(0, this.cfr_renamed_112).append(sprriq.cfr_renamed_9(".]kO.WiDkScS`B4\u0016`SkR.")).append(byArray.length).append(sprvsz.cfr_renamed_9("\nmS{O|")).toString());
        }
        System.arraycopy(byArray, 0, arg0, arg1, byArray.length);
        return byArray.length;
    }
}

