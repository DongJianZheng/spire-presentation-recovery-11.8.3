/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahe;
import com.spire.presentation.packages.sprdld;
import com.spire.presentation.packages.spreed;
import com.spire.presentation.packages.sprfpd;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprktb;
import com.spire.presentation.packages.sprkxc;
import com.spire.presentation.packages.sprlny;
import com.spire.presentation.packages.sprmdd;
import com.spire.presentation.packages.sprnvc;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprqmn;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprszc;
import com.spire.presentation.packages.sprtjb;
import com.spire.presentation.packages.sprunb;
import com.spire.presentation.packages.spruuca;
import com.spire.presentation.packages.sprvpa;
import com.spire.presentation.packages.sprwkd;
import com.spire.presentation.packages.sprwmd;
import com.spire.presentation.packages.sprwnd;
import com.spire.presentation.packages.sprwtb;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzb;
import com.spire.presentation.packages.sprzra;
import com.spire.presentation.packages.sprzsc;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Hashtable;

public class sprrbd {
    public static final Integer cfr_renamed_2;
    public static final Integer cfr_renamed_3;
    private static final String[] cfr_renamed_4;

    public static BigInteger cfr_renamed_2998(int arg0, InputStream arg1) throws IOException {
        return sprrbd.cfr_renamed_2999(arg0, sprzsc.cfr_renamed_2763(arg1));
    }

    public static byte[] cfr_renamed_3000(short[] arg0, sprrlb arg1) throws IOException {
        sprrlb sprrlb2;
        sprpib sprpib2 = arg1.cfr_renamed_1769();
        boolean bl = false;
        if (sprunb.cfr_renamed_1838(sprpib2)) {
            sprrlb2 = arg1;
            bl = sprrbd.cfr_renamed_3001(arg0, (short)1);
        } else {
            if (sprunb.cfr_renamed_2012(sprpib2)) {
                bl = sprrbd.cfr_renamed_3001(arg0, (short)2);
            }
            sprrlb2 = arg1;
        }
        return sprrlb2.cfr_renamed_1972(bl);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprqid cfr_renamed_2989(int[] arg0, short[] arg1, InputStream arg2) throws IOException {
        try {
            short s = sprzsc.cfr_renamed_2630(arg2);
            switch (s) {
                case 1: {
                    sprrbd.cfr_renamed_3002(arg0, 65281);
                    InputStream inputStream = arg2;
                    BigInteger bigInteger = sprrbd.cfr_renamed_3003(inputStream);
                    BigInteger bigInteger2 = sprrbd.cfr_renamed_2998(bigInteger.bitLength(), arg2);
                    InputStream inputStream2 = arg2;
                    BigInteger bigInteger3 = sprrbd.cfr_renamed_2998(bigInteger.bitLength(), inputStream2);
                    byte[] byArray = sprzsc.cfr_renamed_2763(inputStream);
                    BigInteger bigInteger4 = sprrbd.cfr_renamed_3003(inputStream2);
                    BigInteger bigInteger5 = sprrbd.cfr_renamed_3003(inputStream);
                    sprtjb sprtjb2 = new sprtjb(bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5);
                    sprrlb sprrlb2 = sprrbd.cfr_renamed_3004(arg1, sprtjb2, byArray);
                    return new sprqid(sprtjb2, sprrlb2, bigInteger4, bigInteger5);
                }
                case 2: {
                    sprrbd.cfr_renamed_3002(arg0, 65282);
                    InputStream inputStream = arg2;
                    int n = sprzsc.cfr_renamed_2660(inputStream);
                    short s2 = sprzsc.cfr_renamed_2630(inputStream);
                    if (!sprszc.cfr_renamed_2963(s2)) {
                        throw new spryad(47);
                    }
                    int n2 = sprrbd.cfr_renamed_3005(n, arg2);
                    int n3 = -1;
                    int n4 = -1;
                    if (s2 == 2) {
                        n3 = sprrbd.cfr_renamed_3005(n, arg2);
                        n4 = sprrbd.cfr_renamed_3005(n, arg2);
                    }
                    BigInteger bigInteger = sprrbd.cfr_renamed_2998(n, arg2);
                    BigInteger bigInteger6 = sprrbd.cfr_renamed_2998(n, arg2);
                    InputStream inputStream3 = arg2;
                    byte[] byArray = sprzsc.cfr_renamed_2763(inputStream3);
                    BigInteger bigInteger7 = sprrbd.cfr_renamed_3003(inputStream3);
                    BigInteger bigInteger8 = sprrbd.cfr_renamed_3003(inputStream3);
                    sprktb sprktb2 = s2 == 2 ? new sprktb(n, n2, n3, n4, bigInteger, bigInteger6, bigInteger7, bigInteger8) : new sprktb(n, n2, bigInteger, bigInteger6, bigInteger7, bigInteger8);
                    sprrlb sprrlb3 = sprrbd.cfr_renamed_3004(arg1, sprktb2, byArray);
                    return new sprqid(sprktb2, sprrlb3, bigInteger7, bigInteger8);
                }
                case 3: {
                    int n = sprzsc.cfr_renamed_2660(arg2);
                    if (!sprnvc.cfr_renamed_3006(n)) {
                        throw new spryad(47);
                    }
                    sprrbd.cfr_renamed_3002(arg0, n);
                    return sprrbd.cfr_renamed_2992(n);
                }
            }
            throw new spryad(47);
        }
        catch (RuntimeException runtimeException) {
            throw new spryad(47);
        }
    }

    public static sprwmd cfr_renamed_2985(sprwmd arg0) throws IOException {
        return arg0;
    }

    public static void cfr_renamed_3007(Hashtable arg0, int[] arg1) throws IOException {
        arg0.put(cfr_renamed_3, sprrbd.cfr_renamed_3008(arg1));
    }

    public static boolean cfr_renamed_2991(int arg0) {
        return arg0 > 0 && arg0 <= cfr_renamed_4.length;
    }

    public static boolean cfr_renamed_3009(int[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            if (sprrbd.cfr_renamed_3010(arg0[n])) {
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static sprrlb cfr_renamed_3004(short[] arg0, sprpib arg1, byte[] arg2) throws IOException {
        short[] sArray;
        int n;
        if (arg2 == null || arg2.length < 1) {
            throw new spryad(47);
        }
        switch (arg2[0]) {
            case 2: 
            case 3: {
                if (sprunb.cfr_renamed_2012(arg1)) {
                    n = 2;
                    sArray = arg0;
                    break;
                }
                if (!sprunb.cfr_renamed_1838(arg1)) {
                    throw new spryad(47);
                }
                n = 1;
                sArray = arg0;
                break;
            }
            case 4: {
                n = 0;
                sArray = arg0;
                break;
            }
            default: {
                throw new spryad(47);
            }
        }
        if (!sprzra.cfr_renamed_557(sArray, (short)n)) {
            throw new spryad(47);
        }
        return arg1.cfr_renamed_2002(arg2);
    }

    public static void cfr_renamed_2996(short[] arg0, sprrlb arg1, OutputStream arg2) throws IOException {
        sprzsc.cfr_renamed_2638(sprrbd.cfr_renamed_3000(arg0, arg1), arg2);
    }

    static {
        cfr_renamed_3 = spriwa.cfr_renamed_279(10);
        cfr_renamed_2 = spriwa.cfr_renamed_279(11);
        String[] stringArray = new String[28];
        stringArray[0] = sprqmn.cfr_renamed_9("7<'-uow2u");
        stringArray[1] = sprlny.cfr_renamed_9("\u001c%\f4^v\\2^");
        stringArray[2] = sprqmn.cfr_renamed_9("7<'-uow+v");
        stringArray[3] = sprlny.cfr_renamed_9("\u001c%\f4^y\\2^");
        stringArray[4] = sprqmn.cfr_renamed_9("7<'-u`w+v");
        stringArray[5] = sprlny.cfr_renamed_9("\u001c%\f4]s\\+^");
        stringArray[6] = sprqmn.cfr_renamed_9("7<'-vjw+u");
        stringArray[7] = sprlny.cfr_renamed_9("\u001c%\f4]sV+^");
        stringArray[8] = sprqmn.cfr_renamed_9("7<'-vaw2u");
        stringArray[9] = sprlny.cfr_renamed_9("\u001c%\f4]x\\2^");
        stringArray[10] = sprqmn.cfr_renamed_9("7<'-pi}2u");
        stringArray[11] = sprlny.cfr_renamed_9("\u001c%\f4[pV2^");
        stringArray[12] = sprqmn.cfr_renamed_9("7<'-qnu2u");
        stringArray[13] = sprlny.cfr_renamed_9("\u001c%\f4Zw^2^");
        stringArray[14] = sprqmn.cfr_renamed_9("7<')uot2u");
        stringArray[15] = sprlny.cfr_renamed_9("\u001c%\f0^v_2^");
        stringArray[16] = sprqmn.cfr_renamed_9("7<')uot+v");
        stringArray[17] = sprlny.cfr_renamed_9("\u001c%\f0^y]+^");
        stringArray[18] = sprqmn.cfr_renamed_9("7<')u`v+u");
        stringArray[19] = sprlny.cfr_renamed_9("\u001c%\f0]r[+^");
        stringArray[20] = sprqmn.cfr_renamed_9("7<')vkp+u");
        stringArray[21] = sprlny.cfr_renamed_9("\u001c%\f0]uY+^");
        stringArray[22] = sprqmn.cfr_renamed_9("7<')vlr+u");
        stringArray[23] = sprlny.cfr_renamed_9("\u001c%\f0\\x[2^");
        stringArray[24] = sprqmn.cfr_renamed_9("7<')qku+u");
        stringArray[25] = sprlny.cfr_renamed_9("\r2\u000e)\u00010\u0000/\u0003\u0010]uY2^");
        stringArray[26] = sprqmn.cfr_renamed_9("&+%0*)+6(\twap+u");
        stringArray[27] = sprlny.cfr_renamed_9("\r2\u000e)\u00010\u0000/\u0003\u0010Zq]2^");
        cfr_renamed_4 = stringArray;
    }

    public static void cfr_renamed_3011(Hashtable arg0, short[] arg1) throws IOException {
        arg0.put(cfr_renamed_2, sprrbd.cfr_renamed_3012(arg1));
    }

    public static BigInteger cfr_renamed_3003(InputStream arg0) throws IOException {
        return new BigInteger(1, sprzsc.cfr_renamed_2763(arg0));
    }

    public static sprqid cfr_renamed_2992(int arg0) {
        String string = sprrbd.cfr_renamed_3013(arg0);
        if (string == null) {
            return null;
        }
        sprfpd sprfpd2 = sprwkd.cfr_renamed_1837(string);
        if (sprfpd2 == null && (sprfpd2 = sprahe.cfr_renamed_1837(string)) == null) {
            return null;
        }
        return new sprqid(sprfpd2.cfr_renamed_1769(), sprfpd2.cfr_renamed_1145(), sprfpd2.cfr_renamed_1146(), sprfpd2.cfr_renamed_1153(), sprfpd2.cfr_renamed_2113());
    }

    public static byte[] cfr_renamed_3012(short[] arg0) throws IOException {
        if (arg0 == null || !sprzra.cfr_renamed_557(arg0, (short)0)) {
            arg0 = sprzra.cfr_renamed_563(arg0, (short)0);
        }
        return sprzsc.cfr_renamed_2715(arg0);
    }

    public static spreed cfr_renamed_2984(SecureRandom arg0, short[] arg1, sprqid arg2, OutputStream arg3) throws IOException {
        sprwnd sprwnd2 = sprrbd.cfr_renamed_2993(arg0, arg2);
        sprwmd sprwmd2 = (sprwmd)sprwnd2.cfr_renamed_1224();
        sprrbd.cfr_renamed_2996(arg1, sprwmd2.cfr_renamed_1604(), arg3);
        return (spreed)sprwnd2.cfr_renamed_1225();
    }

    public static void cfr_renamed_3014(int arg0, OutputStream arg1) throws IOException {
        sprrbd.cfr_renamed_3015(BigInteger.valueOf(arg0), arg1);
    }

    private static /* synthetic */ void cfr_renamed_3002(int[] arg0, int arg1) throws IOException {
        if (arg0 != null && !sprzra.cfr_renamed_539(arg0, arg1)) {
            throw new spryad(47);
        }
    }

    public static short[] cfr_renamed_3016(Hashtable arg0) throws IOException {
        byte[] byArray = sprzsc.cfr_renamed_2642(arg0, cfr_renamed_2);
        if (byArray == null) {
            return null;
        }
        return sprrbd.cfr_renamed_3017(byArray);
    }

    public static sprwnd cfr_renamed_2993(SecureRandom arg0, sprqid arg1) {
        sprmdd sprmdd2;
        sprmdd sprmdd3 = sprmdd2 = new sprmdd();
        sprmdd3.cfr_renamed_1222(new sprdld(arg1, arg0));
        return sprmdd3.cfr_renamed_1223();
    }

    public static byte[] cfr_renamed_3018(int arg0, BigInteger arg1) throws IOException {
        return sprvpa.cfr_renamed_512((arg0 + 7) / 8, arg1);
    }

    public static int cfr_renamed_3005(int arg0, InputStream arg1) throws IOException {
        int n;
        BigInteger bigInteger = sprrbd.cfr_renamed_3003(arg1);
        if (bigInteger.bitLength() < 32 && (n = bigInteger.intValue()) > 0 && n < arg0) {
            return n;
        }
        throw new spryad(47);
    }

    public static void cfr_renamed_3015(BigInteger arg0, OutputStream arg1) throws IOException {
        sprzsc.cfr_renamed_2638(sprvpa.cfr_renamed_514(arg0), arg1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void cfr_renamed_2994(short[] arg0, sprqid arg1, OutputStream arg2) throws IOException {
        sprpib sprpib2;
        sprpib sprpib3 = arg1.cfr_renamed_1769();
        if (sprunb.cfr_renamed_1838(sprpib3)) {
            sprzsc.cfr_renamed_2676((short)1, arg2);
            sprpib sprpib4 = sprpib3;
            sprpib2 = sprpib4;
            sprrbd.cfr_renamed_3015(sprpib4.cfr_renamed_845().cfr_renamed_1762(), arg2);
        } else {
            if (!sprunb.cfr_renamed_2012(sprpib3)) throw new IllegalArgumentException(sprlny.cfr_renamed_9("H%\f\u0010\u000e2\u000e-\n4\n2\u001cgO.\u00004O!O+\u0001/\u0018.O#\u001a2\u0019%O4\u00160\n"));
            int[] nArray = ((sprzb)sprpib3.cfr_renamed_845()).cfr_renamed_1764().cfr_renamed_1765();
            sprzsc.cfr_renamed_2676((short)2, arg2);
            int n = nArray[nArray.length - 1];
            sprzsc.cfr_renamed_2647(n);
            sprzsc.cfr_renamed_2648(n, arg2);
            if (nArray.length == 3) {
                sprzsc.cfr_renamed_2676((short)1, arg2);
                sprrbd.cfr_renamed_3014(nArray[1], arg2);
            } else {
                if (nArray.length != 5) throw new IllegalArgumentException(sprqmn.cfr_renamed_9("\u000b7( d-60*6)0%5d8*=d)!706)0%5d:1+2<7y%+!y7,4)++0< "));
                sprzsc.cfr_renamed_2676((short)2, arg2);
                sprrbd.cfr_renamed_3014(nArray[1], arg2);
                sprrbd.cfr_renamed_3014(nArray[2], arg2);
                sprrbd.cfr_renamed_3014(nArray[3], arg2);
            }
            sprpib2 = sprpib3;
        }
        sprrbd.cfr_renamed_3019(sprpib2.cfr_renamed_1778(), arg2);
        sprqid sprqid2 = arg1;
        sprrbd.cfr_renamed_3019(sprpib3.cfr_renamed_1997(), arg2);
        sprzsc.cfr_renamed_2638(sprrbd.cfr_renamed_3000(arg0, sprqid2.cfr_renamed_1145()), arg2);
        sprrbd.cfr_renamed_3015(sprqid2.cfr_renamed_1146(), arg2);
        sprrbd.cfr_renamed_3015(sprqid2.cfr_renamed_1153(), arg2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprwmd cfr_renamed_2986(short[] arg0, sprqid arg1, byte[] arg2) throws IOException {
        try {
            sprrlb sprrlb2 = sprrbd.cfr_renamed_3004(arg0, arg1.cfr_renamed_1769(), arg2);
            return new sprwmd(sprrlb2, arg1);
        }
        catch (RuntimeException runtimeException) {
            throw new spryad(47);
        }
    }

    public static String cfr_renamed_3013(int arg0) {
        if (sprrbd.cfr_renamed_2991(arg0)) {
            return cfr_renamed_4[arg0 - 1];
        }
        return null;
    }

    public static void cfr_renamed_3019(sprwtb arg0, OutputStream arg1) throws IOException {
        sprzsc.cfr_renamed_2638(arg0.cfr_renamed_91(), arg1);
    }

    public static boolean cfr_renamed_3020(sprqid arg0, sprqid arg1) {
        return arg0.cfr_renamed_1769().cfr_renamed_1931(arg1.cfr_renamed_1769()) && arg0.cfr_renamed_1145().cfr_renamed_1962(arg1.cfr_renamed_1145()) && arg0.cfr_renamed_1146().equals(arg1.cfr_renamed_1146()) && arg0.cfr_renamed_1153().equals(arg1.cfr_renamed_1153());
    }

    public static void cfr_renamed_3021(int arg0, BigInteger arg1, OutputStream arg2) throws IOException {
        sprzsc.cfr_renamed_2638(sprrbd.cfr_renamed_3018(arg0, arg1), arg2);
    }

    public static byte[] cfr_renamed_3022(short[] arg0, sprwmd arg1) throws IOException {
        return sprrbd.cfr_renamed_3000(arg0, arg1.cfr_renamed_1604());
    }

    public static void cfr_renamed_2995(int arg0, OutputStream arg1) throws IOException {
        if (!sprnvc.cfr_renamed_3006(arg0)) {
            throw new spryad(80);
        }
        sprzsc.cfr_renamed_2676((short)3, arg1);
        sprzsc.cfr_renamed_2647(arg0);
        sprzsc.cfr_renamed_2648(arg0, arg1);
    }

    public static boolean cfr_renamed_3001(short[] arg0, short arg1) {
        int n;
        if (arg0 == null) {
            return false;
        }
        int n2 = n = 0;
        while (n2 < arg0.length) {
            short s = arg0[n];
            if (s == 0) {
                return false;
            }
            if (s == arg1) {
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    public static byte[] cfr_renamed_2988(sprwmd arg0, spreed arg1) {
        spruuca spruuca2;
        spruuca spruuca3 = spruuca2 = new spruuca();
        spruuca3.cfr_renamed_1524(arg1);
        BigInteger bigInteger = spruuca3.cfr_renamed_2501(arg0);
        return sprvpa.cfr_renamed_512(spruuca3.cfr_renamed_1938(), bigInteger);
    }

    public static byte[] cfr_renamed_3008(int[] arg0) throws IOException {
        if (arg0 == null || arg0.length < 1) {
            throw new spryad(80);
        }
        return sprzsc.cfr_renamed_2694(arg0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean cfr_renamed_3010(int arg0) {
        switch (arg0) {
            case 49153: 
            case 49154: 
            case 49155: 
            case 49156: 
            case 49157: 
            case 49158: 
            case 49159: 
            case 49160: 
            case 49161: 
            case 49162: 
            case 49163: 
            case 49164: 
            case 49165: 
            case 49166: 
            case 49167: 
            case 49168: 
            case 49169: 
            case 49170: 
            case 49171: 
            case 49172: 
            case 49173: 
            case 49174: 
            case 49175: 
            case 49176: 
            case 49177: 
            case 49187: 
            case 49188: 
            case 49189: 
            case 49190: 
            case 49191: 
            case 49192: 
            case 49193: 
            case 49194: 
            case 49195: 
            case 49196: 
            case 49197: 
            case 49198: 
            case 49199: 
            case 49200: 
            case 49201: 
            case 49202: 
            case 49203: 
            case 49204: 
            case 49205: 
            case 49206: 
            case 49207: 
            case 49208: 
            case 49209: 
            case 49210: 
            case 49211: 
            case 49266: 
            case 49267: 
            case 49268: 
            case 49269: 
            case 49270: 
            case 49271: 
            case 49272: 
            case 49273: 
            case 49286: 
            case 49287: 
            case 49288: 
            case 49289: 
            case 49290: 
            case 49291: 
            case 49292: 
            case 49293: 
            case 49306: 
            case 49307: 
            case 52243: 
            case 52244: 
            case 58386: 
            case 58387: 
            case 58388: 
            case 58389: 
            case 58392: 
            case 58393: {
                return true;
            }
        }
        return false;
    }

    public static int[] cfr_renamed_3023(Hashtable arg0) throws IOException {
        byte[] byArray = sprzsc.cfr_renamed_2642(arg0, cfr_renamed_3);
        if (byArray == null) {
            return null;
        }
        return sprrbd.cfr_renamed_3024(byArray);
    }

    public static BigInteger cfr_renamed_2999(int arg0, byte[] arg1) throws IOException {
        int n = (arg0 + 7) / 8;
        if (arg1.length != n) {
            throw new spryad(50);
        }
        return new BigInteger(1, arg1);
    }

    public static boolean cfr_renamed_3025() {
        return cfr_renamed_4.length > 0;
    }

    public static short[] cfr_renamed_3017(byte[] arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprqmn.cfr_renamed_9("~!!0<**-6*\u001d%-%~d:%7*60y&<d715("));
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arg0);
        short s = sprzsc.cfr_renamed_2630(byteArrayInputStream);
        if (s < 1) {
            throw new spryad(50);
        }
        short[] sArray = sprzsc.cfr_renamed_2711(s, byteArrayInputStream);
        sprkxc.cfr_renamed_2674(byteArrayInputStream);
        if (!sprzra.cfr_renamed_557(sArray, (short)0)) {
            throw new spryad(47);
        }
        return sArray;
    }

    public static int[] cfr_renamed_3024(byte[] arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprlny.cfr_renamed_9("g\n8\u001b%\u00013\u0006/\u0001\u0004\u000e4\u000egO#\u000e.\u0001/\u001b`\r%O.\u001a,\u0003"));
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arg0);
        int n = sprzsc.cfr_renamed_2660(byteArrayInputStream);
        if (n < 2 || (n & 1) != 0) {
            throw new spryad(50);
        }
        int[] nArray = sprzsc.cfr_renamed_2754(n / 2, byteArrayInputStream);
        sprkxc.cfr_renamed_2674(byteArrayInputStream);
        return nArray;
    }
}

