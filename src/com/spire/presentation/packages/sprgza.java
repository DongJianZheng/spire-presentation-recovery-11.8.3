/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcuca;
import com.spire.presentation.packages.sprdbfa;
import com.spire.presentation.packages.sprdg;
import com.spire.presentation.packages.sprdso;
import com.spire.presentation.packages.sprhn;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprkza;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprqza;
import com.spire.presentation.packages.sprryca;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprxsb;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sprgza {
    private static final Set cfr_renamed_2;
    private static final Set cfr_renamed_3;
    private static final Map cfr_renamed_4;

    public static SecretKey cfr_renamed_1605(String arg0, char[] arg1, byte[] arg2, int arg3) {
        sprryca sprryca2 = new sprryca();
        sprryca2.cfr_renamed_1515(sprxsb.cfr_renamed_1606(arg1), arg2, arg3);
        return new SecretKeySpec(((sprnld)((sprxsb)sprryca2).cfr_renamed_249(sprgza.cfr_renamed_1595(arg0))).cfr_renamed_1521(), arg0);
    }

    public static boolean cfr_renamed_1492(sprtzd arg0) {
        return arg0.cfr_renamed_19().startsWith(sprm.cfr_renamed_580.cfr_renamed_19());
    }

    private static /* synthetic */ SecretKey cfr_renamed_1607(char[] arg0, String arg1, int arg2, byte[] arg3, boolean arg4) {
        sprcuca sprcuca2;
        sprcuca sprcuca3 = sprcuca2 = new sprcuca();
        sprcuca3.cfr_renamed_1608(sprxsb.cfr_renamed_1606(arg0), arg3);
        byte[] byArray = ((sprnld)sprcuca3.cfr_renamed_249(arg2 * 8)).cfr_renamed_1521();
        if (arg4 && byArray.length >= 24) {
            System.arraycopy(byArray, 0, byArray, 16, 8);
        }
        return new SecretKeySpec(byArray, arg1);
    }

    static {
        cfr_renamed_4 = new HashMap();
        cfr_renamed_3 = new HashSet();
        cfr_renamed_2 = new HashSet();
        cfr_renamed_3.add(sprm.cfr_renamed_1579);
        cfr_renamed_3.add(sprm.cfr_renamed_1521);
        cfr_renamed_3.add(sprm.cfr_renamed_84);
        cfr_renamed_3.add(sprm.cfr_renamed_4);
        cfr_renamed_3.add(sprm.cfr_renamed_112);
        cfr_renamed_3.add(sprm.cfr_renamed_957);
        cfr_renamed_2.add(sprm.cfr_renamed_1494);
        cfr_renamed_2.add(sprm.cfr_renamed_1262);
        cfr_renamed_2.add(sprdg.cfr_renamed_287);
        cfr_renamed_2.add(sprdg.cfr_renamed_152);
        cfr_renamed_2.add(sprdg.cfr_renamed_102);
        cfr_renamed_4.put(sprm.cfr_renamed_1262.cfr_renamed_19(), spriwa.cfr_renamed_279(192));
        cfr_renamed_4.put(sprdg.cfr_renamed_287.cfr_renamed_19(), spriwa.cfr_renamed_279(128));
        cfr_renamed_4.put(sprdg.cfr_renamed_152.cfr_renamed_19(), spriwa.cfr_renamed_279(192));
        cfr_renamed_4.put(sprdg.cfr_renamed_102.cfr_renamed_19(), spriwa.cfr_renamed_279(256));
    }

    public static byte[] cfr_renamed_1609(boolean arg0, sprhn arg1, byte[] arg2, char[] arg3, String arg4, byte[] arg5) throws sprkza {
        SecretKey secretKey;
        String string;
        AlgorithmParameterSpec algorithmParameterSpec = new IvParameterSpec(arg5);
        String string2 = sprdbfa.cfr_renamed_9("L\u0016L");
        String string3 = sprdso.cfr_renamed_9("F'U?#<w\br\u0005x\u000b");
        if (arg4.endsWith(sprdbfa.cfr_renamed_9("yL\u0012M"))) {
            string2 = sprdso.cfr_renamed_9("/P.");
            string3 = sprdbfa.cfr_renamed_9("A;_5k0f:h");
        }
        if (arg4.endsWith(sprdso.cfr_renamed_9(";)U.")) || sprdbfa.cfr_renamed_9("K\u0011\\yJ\u0010J").equals(arg4) || sprdso.cfr_renamed_9("R)EAS(S_").equals(arg4)) {
            string2 = sprdbfa.cfr_renamed_9("J\u0017M");
            algorithmParameterSpec = null;
        }
        if (arg4.endsWith(sprdso.cfr_renamed_9(";#P."))) {
            string2 = sprdbfa.cfr_renamed_9("@\u0012M");
            string3 = sprdso.cfr_renamed_9("\"y<w\br\u0005x\u000b");
        }
        if (arg4.startsWith(sprdbfa.cfr_renamed_9("K\u0011\\yJ\u0010J"))) {
            string = sprdso.cfr_renamed_9("R)E\tr\t");
            boolean bl = !arg4.startsWith(sprdbfa.cfr_renamed_9("\u0010J\u0007\"\u0011K\u0011<"));
            secretKey = sprgza.cfr_renamed_1607(arg3, string, 24, arg5, bl);
        } else if (arg4.startsWith(sprdso.cfr_renamed_9("R)EA"))) {
            string = "DES";
            secretKey = sprgza.cfr_renamed_1607(arg3, string, 8, arg5, false);
        } else if (arg4.startsWith(sprdbfa.cfr_renamed_9("M\u0012\""))) {
            string = sprdso.cfr_renamed_9("T\u0000y\u001bp\u0005e\u0004");
            secretKey = sprgza.cfr_renamed_1607(arg3, string, 16, arg5, false);
        } else if (arg4.startsWith(sprdbfa.cfr_renamed_9("\u0006Lf\""))) {
            RC2ParameterSpec rC2ParameterSpec;
            char[] cArray;
            string = "RC2";
            int n = 128;
            if (arg4.startsWith(sprdso.cfr_renamed_9(">U^;X&A"))) {
                n = 40;
                cArray = arg3;
            } else {
                if (arg4.startsWith(sprdbfa.cfr_renamed_9("]\u0017=y9`\""))) {
                    n = 64;
                }
                cArray = arg3;
            }
            secretKey = sprgza.cfr_renamed_1607(cArray, string, n / 8, arg5, false);
            if (algorithmParameterSpec == null) {
                rC2ParameterSpec = new RC2ParameterSpec(n);
                algorithmParameterSpec = rC2ParameterSpec;
            } else {
                rC2ParameterSpec = new RC2ParameterSpec(n, arg5);
                algorithmParameterSpec = rC2ParameterSpec;
            }
        } else if (arg4.startsWith(sprdso.cfr_renamed_9("W)EA"))) {
            char[] cArray;
            int n;
            string = sprdbfa.cfr_renamed_9("N\u0011\\");
            byte[] byArray = arg5;
            if (arg5.length > 8) {
                byArray = new byte[8];
                System.arraycopy(arg5, 0, byArray, 0, 8);
            }
            if (arg4.startsWith(sprdso.cfr_renamed_9("W)EA'^.A"))) {
                n = 128;
                cArray = arg3;
            } else if (arg4.startsWith(sprdbfa.cfr_renamed_9("\u0015J\u0007\"e6f\""))) {
                n = 192;
                cArray = arg3;
            } else if (arg4.startsWith(sprdso.cfr_renamed_9("W)EA$Y A"))) {
                n = 256;
                cArray = arg3;
            } else {
                throw new sprqza(sprdbfa.cfr_renamed_9("z:d:`#atN\u0011\\tj:l&v${=`:/#f gt\u007f&f\"n jtd1v"));
            }
            secretKey = sprgza.cfr_renamed_1607(cArray, sprdso.cfr_renamed_9("-S?"), n / 8, byArray, false);
        } else {
            throw new sprqza(sprdbfa.cfr_renamed_9("z:d:`#atj:l&v${=`:/#f gt\u007f&f\"n jtd1v"));
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
            throw new sprqza(sprdso.cfr_renamed_9("s\u0014u\tf\u0018\u007f\u0003xLc\u001f\u007f\u0002qLu\u0005f\u0004s\u001e6A6\u001cz\tw\u001fsLu\u0004s\u000f}Lf\re\u001fa\u0003d\b6\rx\b6\bw\u0018wB"), (Throwable)exception);
        }
    }

    public static int cfr_renamed_1595(String arg0) {
        if (!cfr_renamed_4.containsKey(arg0)) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprdbfa.cfr_renamed_9("a;/?j-/'f.jti;}tn8h;}={<bn/")).append(arg0).toString());
        }
        return (Integer)cfr_renamed_4.get(arg0);
    }

    public static boolean cfr_renamed_1594(sprtzd arg0) {
        return cfr_renamed_3.contains(arg0);
    }

    public static boolean cfr_renamed_1593(sprtzd arg0) {
        return cfr_renamed_2.contains(arg0);
    }
}

