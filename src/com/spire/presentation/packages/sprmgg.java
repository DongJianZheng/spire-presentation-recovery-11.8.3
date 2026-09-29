/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spragg;
import com.spire.presentation.packages.sprarg;
import com.spire.presentation.packages.sprbfb;
import com.spire.presentation.packages.sprcah;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprwr;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sprmgg {
    private static final Map cfr_renamed_119;
    private static final Map cfr_renamed_91;
    private static final Map cfr_renamed_0;
    private static final Set cfr_renamed_1;
    private static final Map cfr_renamed_2;
    private static final Map cfr_renamed_3;
    private static final Set cfr_renamed_4;

    public static boolean cfr_renamed_7501(sprlem arg0) {
        return cfr_renamed_4.contains(arg0);
    }

    public static boolean cfr_renamed_7379(sprlem arg0) {
        return arg0.cfr_renamed_19().startsWith(sprdl.cfr_renamed_2920.cfr_renamed_19());
    }

    public static int cfr_renamed_1595(String arg0) {
        if (!cfr_renamed_2.containsKey(arg0)) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprarg.cfr_renamed_9("HD\u0006@CR\u0006XOQC\u000b@DT\u000bGGADTBRCK\u0011\u0006")).append(arg0).toString());
        }
        return (Integer)cfr_renamed_2.get(arg0);
    }

    static {
        cfr_renamed_2 = new HashMap();
        cfr_renamed_4 = new HashSet();
        cfr_renamed_1 = new HashSet();
        cfr_renamed_91 = new HashMap();
        cfr_renamed_0 = new HashMap();
        cfr_renamed_119 = new HashMap();
        cfr_renamed_3 = new HashMap();
        cfr_renamed_4.add(sprdl.cfr_renamed_93);
        cfr_renamed_4.add(sprdl.cfr_renamed_1521);
        cfr_renamed_4.add(sprdl.cfr_renamed_1452);
        cfr_renamed_4.add(sprdl.cfr_renamed_0);
        cfr_renamed_4.add(sprdl.cfr_renamed_1397);
        cfr_renamed_4.add(sprdl.cfr_renamed_133);
        cfr_renamed_1.add(sprdl.cfr_renamed_112);
        cfr_renamed_1.add(sprdl.cfr_renamed_2797);
        cfr_renamed_1.add(sprwr.cfr_renamed_88);
        cfr_renamed_1.add(sprwr.cfr_renamed_1223);
        cfr_renamed_1.add(sprwr.cfr_renamed_724);
        cfr_renamed_2.put(sprdl.cfr_renamed_2797.cfr_renamed_19(), spruaf.cfr_renamed_279(192));
        cfr_renamed_2.put(sprwr.cfr_renamed_88.cfr_renamed_19(), spruaf.cfr_renamed_279(128));
        cfr_renamed_2.put(sprwr.cfr_renamed_1223.cfr_renamed_19(), spruaf.cfr_renamed_279(192));
        cfr_renamed_2.put(sprwr.cfr_renamed_724.cfr_renamed_19(), spruaf.cfr_renamed_279(256));
        cfr_renamed_2.put(sprdl.cfr_renamed_272.cfr_renamed_19(), spruaf.cfr_renamed_279(128));
        cfr_renamed_2.put(sprdl.cfr_renamed_1454, spruaf.cfr_renamed_279(40));
        cfr_renamed_2.put(sprdl.cfr_renamed_805, spruaf.cfr_renamed_279(128));
        cfr_renamed_2.put(sprdl.cfr_renamed_954, spruaf.cfr_renamed_279(192));
        cfr_renamed_2.put(sprdl.cfr_renamed_1260, spruaf.cfr_renamed_279(128));
        cfr_renamed_2.put(sprdl.cfr_renamed_2, spruaf.cfr_renamed_279(40));
        cfr_renamed_91.put(sprdl.cfr_renamed_1763, sprbfb.cfr_renamed_9("m\rv\u000b{}J&I'u\u0002|\fn\u0007|~"));
        cfr_renamed_91.put(sprdl.cfr_renamed_131, sprarg.cfr_renamed_9("{d`bm\u0014\\O_Nckjexnj\u0014\u001e\u0010"));
        cfr_renamed_91.put(sprdl.cfr_renamed_2956, sprbfb.cfr_renamed_9("m\rv\u000b{}J&I'u\u0002|\fn\u0007|z\f}"));
        cfr_renamed_91.put(sprdl.cfr_renamed_3240, sprarg.cfr_renamed_9("{d`bm\u0014\\O_Nckjexnj\u0014\u0019\u0012"));
        cfr_renamed_91.put(sprdl.cfr_renamed_1223, sprbfb.cfr_renamed_9("m\rv\u000b{}J&I'u\u0002|\fn\u0007||\u0005{"));
        cfr_renamed_91.put(sprwr.cfr_renamed_105, sprarg.cfr_renamed_9("{d`bm\u0014\\O_Nckjexnj\u0015\u0006\u0014\u0019\u0012"));
        cfr_renamed_91.put(sprwr.cfr_renamed_728, sprbfb.cfr_renamed_9("m\rv\u000b{}J&I'u\u0002|\fn\u0007||\u0010}\by"));
        cfr_renamed_91.put(sprwr.cfr_renamed_145, sprarg.cfr_renamed_9("{d`bm\u0014\\O_Nckjexnj\u0015\u0006\u0015\u0013\u0012"));
        cfr_renamed_91.put(sprwr.cfr_renamed_119, sprbfb.cfr_renamed_9("m\rv\u000b{}J&I'u\u0002|\fn\u0007||\u0010z\f}"));
        cfr_renamed_91.put(sprqo.cfr_renamed_4, sprarg.cfr_renamed_9("{d`bm\u0014\\O_Nckjelixr\u0018\u0012\u001a\u0017"));
        cfr_renamed_0.put(sprdl.cfr_renamed_1763, spruaf.cfr_renamed_279(20));
        cfr_renamed_0.put(sprdl.cfr_renamed_131, spruaf.cfr_renamed_279(32));
        cfr_renamed_0.put(sprdl.cfr_renamed_2956, spruaf.cfr_renamed_279(64));
        cfr_renamed_0.put(sprdl.cfr_renamed_3240, spruaf.cfr_renamed_279(28));
        cfr_renamed_0.put(sprdl.cfr_renamed_1223, spruaf.cfr_renamed_279(48));
        cfr_renamed_0.put(sprwr.cfr_renamed_105, spruaf.cfr_renamed_279(28));
        cfr_renamed_0.put(sprwr.cfr_renamed_728, spruaf.cfr_renamed_279(32));
        cfr_renamed_0.put(sprwr.cfr_renamed_145, spruaf.cfr_renamed_279(48));
        cfr_renamed_0.put(sprwr.cfr_renamed_119, spruaf.cfr_renamed_279(64));
        cfr_renamed_0.put(sprqo.cfr_renamed_4, spruaf.cfr_renamed_279(32));
        cfr_renamed_119.put(sprdl.cfr_renamed_2797, sprbfb.cfr_renamed_9("\u000bx\u001cx\u000bx`~\r~`m\u0004~\u001c\b\u001f\\+Y&S("));
        cfr_renamed_119.put(sprwr.cfr_renamed_88, sprarg.cfr_renamed_9("jcx\thdh\t{MHU\u001cvJBOOEA"));
        cfr_renamed_119.put(sprwr.cfr_renamed_1223, sprbfb.cfr_renamed_9("|\nn`~\r~`m$^<\n\u001f\\+Y&S("));
        cfr_renamed_119.put(sprwr.cfr_renamed_724, sprarg.cfr_renamed_9("jcx\thdh\t{MHU\u001cvJBOOEA"));
        cfr_renamed_3.put(sprdl.cfr_renamed_2797.cfr_renamed_19(), sprbfb.cfr_renamed_9("y\nn\ny\n"));
        cfr_renamed_3.put(sprwr.cfr_renamed_88.cfr_renamed_19(), sprarg.cfr_renamed_9("gnu"));
        cfr_renamed_3.put(sprwr.cfr_renamed_1223.cfr_renamed_19(), sprbfb.cfr_renamed_9("\u000ex\u001c"));
        cfr_renamed_3.put(sprwr.cfr_renamed_724.cfr_renamed_19(), sprarg.cfr_renamed_9("gnu"));
    }

    public static byte[] cfr_renamed_7502(boolean arg0, sprrr arg1, byte[] arg2, char[] arg3, String arg4, byte[] arg5) throws spragg {
        SecretKey secretKey;
        String string;
        AlgorithmParameterSpec algorithmParameterSpec = new IvParameterSpec(arg5);
        String string2 = sprbfb.cfr_renamed_9("\f\u007f\f");
        String string3 = sprarg.cfr_renamed_9("{mhu\u001evJBOOEA");
        if (arg4.endsWith(sprbfb.cfr_renamed_9("\u0010\f{\r"))) {
            string2 = sprarg.cfr_renamed_9("emd");
            string3 = sprbfb.cfr_renamed_9("\u0001R\u001f\\+Y&S(");
        }
        if (arg4.endsWith(sprarg.cfr_renamed_9("\u0006chd")) || sprbfb.cfr_renamed_9("\u000bx\u001c\u0010\ny\n").equals(arg4) || sprarg.cfr_renamed_9("ocx\u000bnbn\u0015").equals(arg4)) {
            string2 = sprbfb.cfr_renamed_9("\n~\r");
            algorithmParameterSpec = null;
        }
        if (arg4.endsWith(sprarg.cfr_renamed_9("\u0006imd"))) {
            string2 = sprbfb.cfr_renamed_9("\u0000{\r");
            string3 = sprarg.cfr_renamed_9("hDvJBOOEA");
        }
        if (arg4.startsWith(sprbfb.cfr_renamed_9("\u000bx\u001c\u0010\ny\n"))) {
            string = sprarg.cfr_renamed_9("ocxCOC");
            boolean bl = !arg4.startsWith(sprbfb.cfr_renamed_9("y\nnbx\u000bx|"));
            secretKey = sprmgg.cfr_renamed_7503(arg1, arg3, string, 24, arg5, bl);
        } else if (arg4.startsWith(sprarg.cfr_renamed_9("ocx\u000b"))) {
            string = "DES";
            secretKey = sprmgg.cfr_renamed_7503(arg1, arg3, string, 8, arg5, false);
        } else if (arg4.startsWith(sprbfb.cfr_renamed_9("\r{b"))) {
            string = sprarg.cfr_renamed_9("iJDQMOXN");
            secretKey = sprmgg.cfr_renamed_7503(arg1, arg3, string, 16, arg5, false);
        } else if (arg4.startsWith(sprbfb.cfr_renamed_9("o\f\u000fb"))) {
            RC2ParameterSpec rC2ParameterSpec;
            sprrr sprrr2;
            string = "RC2";
            int n = 128;
            if (arg4.startsWith(sprarg.cfr_renamed_9("th\u0014\u0006\u0012\u001b\u000b"))) {
                n = 40;
                sprrr2 = arg1;
            } else {
                if (arg4.startsWith(sprbfb.cfr_renamed_9("\u001d~}\u0010y\tb"))) {
                    n = 64;
                }
                sprrr2 = arg1;
            }
            secretKey = sprmgg.cfr_renamed_7503(sprrr2, arg3, string, n / 8, arg5, false);
            if (algorithmParameterSpec == null) {
                rC2ParameterSpec = new RC2ParameterSpec(n);
                algorithmParameterSpec = rC2ParameterSpec;
            } else {
                rC2ParameterSpec = new RC2ParameterSpec(n, arg5);
                algorithmParameterSpec = rC2ParameterSpec;
            }
        } else if (arg4.startsWith(sprarg.cfr_renamed_9("jcx\u000b"))) {
            sprrr sprrr3;
            int n;
            string = sprbfb.cfr_renamed_9("\u000ex\u001c");
            byte[] byArray = arg5;
            if (arg5.length > 8) {
                byArray = new byte[8];
                System.arraycopy(arg5, 0, byArray, 0, 8);
            }
            if (arg4.startsWith(sprarg.cfr_renamed_9("jcx\u000b\u001a\u0014\u0013\u000b"))) {
                n = 128;
                sprrr3 = arg1;
            } else if (arg4.startsWith(sprbfb.cfr_renamed_9("|\nnb\fv\u000fb"))) {
                n = 192;
                sprrr3 = arg1;
            } else if (arg4.startsWith(sprarg.cfr_renamed_9("jcx\u000b\u0019\u0013\u001d\u000b"))) {
                n = 256;
                sprrr3 = arg1;
            } else {
                throw new sprcah(sprbfb.cfr_renamed_9(":S$S J!\u001d\u000ex\u001c\u001d*S,O6M;T SoJ&I'\u001d?O&K.I*\u001d$X6"));
            }
            secretKey = sprmgg.cfr_renamed_7503(sprrr3, arg3, sprarg.cfr_renamed_9("gnu"), n / 8, byArray, false);
        } else {
            throw new sprcah(sprbfb.cfr_renamed_9(":S$S J!\u001d*S,O6M;T SoJ&I'\u001d?O&K.I*\u001d$X6"));
        }
        String string4 = new StringBuilder().insert(0, string).append("/").append(string2).append("/").append(string3).toString();
        try {
            Cipher cipher;
            Cipher cipher2 = arg1.cfr_renamed_1496(string4);
            int n = arg0 ? 1 : 2;
            Cipher cipher3 = cipher2;
            if (algorithmParameterSpec == null) {
                cipher3.init(n, secretKey);
                cipher = cipher2;
            } else {
                cipher3.init(n, (Key)secretKey, algorithmParameterSpec);
                cipher = cipher2;
            }
            return cipher.doFinal(arg2);
        }
        catch (Exception exception) {
            throw new sprcah(sprarg.cfr_renamed_9("N^HC[RBIE\u0006^UBHL\u0006HO[NNT\u000b\u000b\u000bVGCJUN\u0006HNNE@\u0006[GXU\\IYB\u000bGEB\u000bBJRJ\b"), (Throwable)exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ SecretKey cfr_renamed_7503(sprrr arg0, char[] arg1, String arg2, int arg3, byte[] arg4, boolean arg5) throws spragg {
        try {
            PBEKeySpec pBEKeySpec = new PBEKeySpec(arg1, arg4, 1, arg3 * 8);
            byte[] byArray = arg0.cfr_renamed_1495(sprbfb.cfr_renamed_9("\u001f\u007f\u0004y\t\u0010\u0000M*S\u001cn\u0003")).generateSecret(pBEKeySpec).getEncoded();
            if (arg5 && byArray.length >= 24) {
                System.arraycopy(byArray, 0, byArray, 16, 8);
            }
            return new SecretKeySpec(byArray, arg2);
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new spragg(new StringBuilder().insert(0, sprarg.cfr_renamed_9("~HJDGC\u000bRD\u0006HTNG_C\u000bi[CEuxj\u000bvib``\u0011\u0006")).append(generalSecurityException.getMessage()).toString(), generalSecurityException);
        }
    }

    public static boolean cfr_renamed_7504(sprddm arg0) {
        return arg0 == null || arg0.cfr_renamed_593().cfr_renamed_5078(sprdl.cfr_renamed_1763);
    }

    public static int cfr_renamed_7356(sprlem arg0) {
        if (!cfr_renamed_0.containsKey(arg0)) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprbfb.cfr_renamed_9("S \u001d<\\#IoN&G*\u001d)R=\u001d.Q(R=T;U\"\u0007o")).append(arg0).toString());
        }
        return (Integer)cfr_renamed_0.get(arg0);
    }

    public static String cfr_renamed_7505(sprlem arg0) {
        String string = (String)cfr_renamed_119.get(arg0);
        if (string != null) {
            return string;
        }
        return arg0.cfr_renamed_19();
    }

    public static SecretKey cfr_renamed_7506(sprrr arg0, String arg1, char[] arg2, byte[] arg3, int arg4, sprddm arg5) throws NoSuchProviderException, NoSuchAlgorithmException, InvalidKeySpecException {
        String string = (String)cfr_renamed_91.get(arg5.cfr_renamed_593());
        if (string == null) {
            throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprarg.cfr_renamed_9("SEMEI\\H\u000bvy`\u000bOE\u0006{mhu\b\u0014\u0011\u0006")).append(arg5.cfr_renamed_593()).toString());
        }
        SecretKeyFactory secretKeyFactory = arg0.cfr_renamed_1495(string);
        SecretKey secretKey = secretKeyFactory.generateSecret(new PBEKeySpec(arg2, arg3, arg4, sprmgg.cfr_renamed_1595(arg1)));
        return new SecretKeySpec(secretKey.getEncoded(), arg1);
    }

    public static SecretKey cfr_renamed_7507(sprrr arg0, String arg1, char[] arg2, byte[] arg3, int arg4) throws NoSuchProviderException, NoSuchAlgorithmException, InvalidKeySpecException {
        SecretKeyFactory secretKeyFactory = arg0.cfr_renamed_1495(sprbfb.cfr_renamed_9("m\rv\u000b{}J&I'\u0005\rt\u001b"));
        SecretKey secretKey = secretKeyFactory.generateSecret(new PBEKeySpec(arg2, arg3, arg4, sprmgg.cfr_renamed_1595(arg1)));
        return new SecretKeySpec(secretKey.getEncoded(), sprmgg.cfr_renamed_7508(arg1));
    }

    public static String cfr_renamed_7508(String arg0) {
        String string = (String)cfr_renamed_3.get(arg0);
        if (string != null) {
            return string;
        }
        return arg0;
    }

    public static boolean cfr_renamed_7509(sprlem arg0) {
        return cfr_renamed_1.contains(arg0);
    }
}

