/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprchl;
import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprggp;
import com.spire.presentation.packages.sprgpr;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmvh;
import com.spire.presentation.packages.sprnhm;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.TreeSet;

public class sprcdh {
    private static final int cfr_renamed_4 = 16;

    private static /* synthetic */ void cfr_renamed_8668(sprhfm arg0) {
        sprhfm sprhfm2 = arg0;
        BigInteger[] bigIntegerArray = sprcdh.cfr_renamed_8669(sprhfm2.cfr_renamed_1146(), sprck.cfr_renamed_4, sprck.cfr_renamed_0, sprck.cfr_renamed_4);
        sprlsh[] sprlshArray = sprcdh.cfr_renamed_8670(sprhfm2.cfr_renamed_1769());
        sprcdh.cfr_renamed_8671(sprhfm2, bigIntegerArray[0], sprlshArray);
        System.out.println(sprgpr.cfr_renamed_9("C5"));
        sprcdh.cfr_renamed_8671(sprhfm2, bigIntegerArray[1], sprlshArray);
    }

    private static /* synthetic */ void cfr_renamed_8672(sprhfm arg0, String arg1) {
        sprgxh sprgxh2 = arg0.cfr_renamed_1769();
        if (sprmvh.cfr_renamed_8673(sprgxh2)) {
            sprgxh sprgxh3 = sprgxh2;
            BigInteger bigInteger = sprgxh3.cfr_renamed_845().cfr_renamed_1762();
            if (sprgxh3.cfr_renamed_1997().cfr_renamed_805() && bigInteger.mod(sprck.cfr_renamed_2).equals(sprck.cfr_renamed_4)) {
                System.out.println(new StringBuilder().insert(0, sprggp.cfr_renamed_9("#\u000f\u0012\f\u0005ZG")).append(arg1).append(sprgpr.cfr_renamed_9("+Gd\u0006\u007fGmG+ @1,3u\u0017iGM@,\u0002b\u0003c\nc\u0015|\u000fe\u0014aG{\u000ex\u000f,\u0013d\u0002\u007f\u0002,\u0017m\u0015m\ni\u0013i\u0015\u007f]")).toString());
                sprcdh.cfr_renamed_8668(arg0);
            }
            if (sprgxh2.cfr_renamed_1778().cfr_renamed_805() && bigInteger.mod(sprck.cfr_renamed_91).equals(sprck.cfr_renamed_4)) {
                System.out.println(new StringBuilder().insert(0, sprggp.cfr_renamed_9("#\u000f\u0012\f\u0005ZG")).append(arg1).append(sprgpr.cfr_renamed_9("+Gd\u0006\u007fGmG+ @1,3u\u0017iGN@,\u0002b\u0003c\nc\u0015|\u000fe\u0014aG{\u000ex\u000f,\u0013d\u0002\u007f\u0002,\u0017m\u0015m\ni\u0013i\u0015\u007f]")).toString());
                sprcdh.cfr_renamed_8674(arg0);
            }
        }
    }

    private static /* synthetic */ sprlsh[] cfr_renamed_8675(sprgxh arg0) {
        Object object;
        BigInteger bigInteger;
        BigInteger bigInteger2 = arg0.cfr_renamed_845().cfr_renamed_1762();
        BigInteger bigInteger3 = bigInteger2.divide(sprck.cfr_renamed_91);
        SecureRandom secureRandom = new SecureRandom();
        while ((bigInteger = ((BigInteger)(object = sprhdf.cfr_renamed_513(sprck.cfr_renamed_1, bigInteger2.subtract(sprck.cfr_renamed_1), secureRandom))).modPow(bigInteger3, bigInteger2)).equals(sprck.cfr_renamed_4)) {
        }
        object = arg0.cfr_renamed_1652(bigInteger);
        sprlsh[] sprlshArray = new sprlsh[2];
        sprlshArray[0] = object;
        sprlshArray[1] = ((sprlsh)object).cfr_renamed_1048();
        return sprlshArray;
    }

    private static /* synthetic */ boolean cfr_renamed_1825(BigInteger arg0, BigInteger arg1) {
        return arg0.gcd(arg1).equals(sprck.cfr_renamed_4);
    }

    private static /* synthetic */ void cfr_renamed_1820(BigInteger[] bigIntegerArray) {
        BigInteger[] arg0;
        BigInteger bigInteger = bigIntegerArray[0];
        bigIntegerArray[0] = arg0[1];
        arg0[1] = bigInteger;
    }

    private static /* synthetic */ BigInteger[] cfr_renamed_1822(BigInteger arg0, BigInteger arg1) {
        BigInteger bigInteger = arg0;
        BigInteger bigInteger2 = arg1;
        BigInteger bigInteger3 = sprck.cfr_renamed_0;
        BigInteger bigInteger4 = sprck.cfr_renamed_4;
        BigInteger bigInteger5 = bigInteger;
        while (true) {
            BigInteger[] bigIntegerArray = bigInteger5.divideAndRemainder(bigInteger2);
            BigInteger bigInteger6 = bigIntegerArray[0];
            BigInteger bigInteger7 = bigIntegerArray[1];
            BigInteger bigInteger8 = bigInteger3.subtract(bigInteger6.multiply(bigInteger4));
            if (sprcdh.cfr_renamed_1824(bigInteger2, arg0)) {
                BigInteger[] bigIntegerArray2 = new BigInteger[6];
                bigIntegerArray2[0] = bigInteger;
                bigIntegerArray2[1] = bigInteger3;
                bigIntegerArray2[2] = bigInteger2;
                bigIntegerArray2[3] = bigInteger4;
                bigIntegerArray2[4] = bigInteger7;
                bigIntegerArray2[5] = bigInteger8;
                return bigIntegerArray2;
            }
            bigInteger = bigInteger2;
            bigInteger2 = bigInteger7;
            bigInteger3 = bigInteger4;
            bigInteger4 = bigInteger8;
            bigInteger5 = bigInteger;
        }
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ 3;
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ 1;
        int n4 = n2;
        int n5 = 4 << 3 ^ 2;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    private static /* synthetic */ void cfr_renamed_1835(String arg0, Object arg1) {
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2 = stringBuffer = new StringBuffer("  ");
        stringBuffer.append(arg0);
        while (stringBuffer2.length() < 20) {
            StringBuffer stringBuffer3 = stringBuffer;
            stringBuffer2 = stringBuffer3;
            stringBuffer3.append(' ');
        }
        stringBuffer.append(": ");
        stringBuffer.append(arg1.toString());
        System.out.println(stringBuffer.toString());
    }

    private static /* synthetic */ BigInteger cfr_renamed_8676(BigInteger arg0, BigInteger arg1) {
        if (!arg1.testBit(0)) {
            throw new IllegalStateException();
        }
        BigInteger bigInteger = arg1.subtract(sprck.cfr_renamed_4).shiftRight(1);
        BigInteger bigInteger2 = bigInteger;
        if (!arg0.modPow(bigInteger2, arg1).equals(sprck.cfr_renamed_4)) {
            return null;
        }
        while (!bigInteger2.testBit(0)) {
            if (arg0.modPow(bigInteger2 = bigInteger2.shiftRight(1), arg1).equals(sprck.cfr_renamed_4)) continue;
            return sprcdh.cfr_renamed_8677(arg0, bigInteger2, arg1, bigInteger);
        }
        bigInteger2 = bigInteger2.add(sprck.cfr_renamed_4).shiftRight(1);
        return arg0.modPow(bigInteger2, arg1);
    }

    private static /* synthetic */ boolean cfr_renamed_1824(BigInteger arg0, BigInteger arg1) {
        block2: {
            block3: {
                arg0 = arg0.abs();
                arg1 = arg1.abs();
                int n = arg1.bitLength();
                int n2 = arg0.bitLength() * 2;
                if (n2 - 1 > n) break block2;
                if (n2 < n) break block3;
                BigInteger bigInteger = arg0;
                if (bigInteger.multiply(bigInteger).compareTo(arg1) >= 0) break block2;
            }
            return true;
        }
        return false;
    }

    private static /* synthetic */ BigInteger[] cfr_renamed_1818(BigInteger arg0, BigInteger arg1) {
        if (arg0.compareTo(arg1) <= 0) {
            BigInteger[] bigIntegerArray = new BigInteger[2];
            bigIntegerArray[0] = arg0;
            bigIntegerArray[1] = arg1;
            return bigIntegerArray;
        }
        BigInteger[] bigIntegerArray = new BigInteger[2];
        bigIntegerArray[0] = arg1;
        bigIntegerArray[1] = arg0;
        return bigIntegerArray;
    }

    private static /* synthetic */ BigInteger cfr_renamed_8677(BigInteger arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3) {
        BigInteger bigInteger;
        BigInteger bigInteger2 = sprcdh.cfr_renamed_8678(arg2, arg3);
        BigInteger bigInteger3 = bigInteger = arg3;
        block0: while (true) {
            BigInteger bigInteger4 = arg1;
            while (!bigInteger4.testBit(0)) {
                arg1 = arg1.shiftRight(1);
                bigInteger = bigInteger.shiftRight(1);
                if (arg0.modPow(arg1, arg2).equals(bigInteger2.modPow(bigInteger, arg2))) continue block0;
                bigInteger = bigInteger.add(bigInteger3);
                bigInteger4 = arg1;
            }
            break;
        }
        arg1 = arg1.subtract(sprck.cfr_renamed_4).shiftRight(1);
        bigInteger = bigInteger.shiftRight(1);
        BigInteger bigInteger5 = arg0.modInverse(arg2).modPow(arg1, arg2);
        BigInteger bigInteger6 = bigInteger2.modPow(bigInteger, arg2);
        return bigInteger5.multiply(bigInteger6).mod(arg2);
    }

    private static /* synthetic */ boolean cfr_renamed_1829(BigInteger[] arg0, BigInteger[] arg1) {
        boolean bl;
        BigInteger bigInteger = arg0[0].abs();
        BigInteger bigInteger2 = arg0[1].abs();
        BigInteger bigInteger3 = arg1[0].abs();
        BigInteger bigInteger4 = arg1[1].abs();
        boolean bl2 = bigInteger.compareTo(bigInteger3) < 0;
        boolean bl3 = bl = bigInteger2.compareTo(bigInteger4) < 0;
        if (bl2 == bl) {
            return bl2;
        }
        BigInteger bigInteger5 = bigInteger;
        BigInteger bigInteger6 = bigInteger2;
        BigInteger bigInteger7 = bigInteger5.multiply(bigInteger5).add(bigInteger6.multiply(bigInteger6));
        BigInteger bigInteger8 = bigInteger3;
        BigInteger bigInteger9 = bigInteger4;
        BigInteger bigInteger10 = bigInteger8.multiply(bigInteger8).add(bigInteger9.multiply(bigInteger9));
        return bigInteger7.compareTo(bigInteger10) < 0;
    }

    private static /* synthetic */ sprlsh[] cfr_renamed_8670(sprgxh arg0) {
        sprlsh sprlsh2 = arg0.cfr_renamed_1652(sprck.cfr_renamed_4).cfr_renamed_1773().cfr_renamed_1817();
        if (sprlsh2 == null) {
            throw new IllegalStateException(sprggp.cfr_renamed_9("9\u0001\u0016\u0003\u000f\f\u001b\u0014\u0013\u000f\u0014@\u0015\u0006Z\u000e\u0015\u000eW\u0014\b\t\f\t\u001b\fZ\u000f\b\u0004\u001f\u0012WTZ@\u001c\t\u001f\f\u001e@\u001f\f\u001f\r\u001f\u000e\u000e\u0013Z\u0006\u001b\t\u0016\u0005\u001e@\u000f\u000e\u001f\u0018\n\u0005\u0019\u0014\u001f\u0004\u0016\u0019"));
        }
        sprlsh[] sprlshArray = new sprlsh[2];
        sprlshArray[0] = sprlsh2;
        sprlshArray[1] = sprlsh2.cfr_renamed_1773();
        return sprlshArray;
    }

    private static /* synthetic */ void cfr_renamed_8679(String arg0) {
        sprhfm sprhfm2 = sprchl.cfr_renamed_1837(arg0);
        if (sprhfm2 == null && (sprhfm2 = sprnhm.cfr_renamed_1837(arg0)) == null) {
            System.err.println(new StringBuilder().insert(0, sprgpr.cfr_renamed_9("2b\fb\b{\t,\u0004y\u0015z\u00026G")).append(arg0).toString());
            return;
        }
        sprcdh.cfr_renamed_8672(sprhfm2, arg0);
    }

    private static /* synthetic */ BigInteger[] cfr_renamed_1819(BigInteger[] arg0) {
        BigInteger[] bigIntegerArray;
        boolean bl;
        boolean bl2 = bl = arg0[0].compareTo(arg0[1]) < 0;
        if (bl) {
            sprcdh.cfr_renamed_1820(arg0);
        }
        BigInteger bigInteger = arg0[0];
        BigInteger bigInteger2 = arg0[1];
        BigInteger bigInteger3 = sprck.cfr_renamed_4;
        BigInteger bigInteger4 = sprck.cfr_renamed_0;
        BigInteger bigInteger5 = sprck.cfr_renamed_0;
        BigInteger bigInteger6 = sprck.cfr_renamed_4;
        BigInteger bigInteger7 = bigInteger2;
        while (bigInteger7.compareTo(sprck.cfr_renamed_4) > 0) {
            bigIntegerArray = bigInteger.divideAndRemainder(bigInteger2);
            BigInteger bigInteger8 = bigIntegerArray[0];
            BigInteger bigInteger9 = bigIntegerArray[1];
            BigInteger bigInteger10 = bigInteger3.subtract(bigInteger8.multiply(bigInteger4));
            BigInteger bigInteger11 = bigInteger5.subtract(bigInteger8.multiply(bigInteger6));
            bigInteger = bigInteger2;
            bigInteger2 = bigInteger9;
            bigInteger3 = bigInteger4;
            bigInteger4 = bigInteger10;
            bigInteger5 = bigInteger6;
            bigInteger6 = bigInteger11;
            bigInteger7 = bigInteger2;
        }
        if (bigInteger2.signum() <= 0) {
            return null;
        }
        BigInteger[] bigIntegerArray2 = new BigInteger[2];
        bigIntegerArray2[0] = bigInteger4;
        bigIntegerArray2[1] = bigInteger6;
        bigIntegerArray = bigIntegerArray2;
        if (bl) {
            sprcdh.cfr_renamed_1820(bigIntegerArray);
        }
        return bigIntegerArray;
    }

    private static /* synthetic */ ArrayList cfr_renamed_8661(Enumeration arg0) {
        ArrayList arrayList = new ArrayList();
        Enumeration enumeration = arg0;
        while (enumeration.hasMoreElements()) {
            Enumeration enumeration2 = arg0;
            enumeration = enumeration2;
            arrayList.add(enumeration2.nextElement());
        }
        return arrayList;
    }

    private static /* synthetic */ BigInteger cfr_renamed_1826(BigInteger arg0) {
        BigInteger bigInteger;
        BigInteger bigInteger2 = arg0;
        BigInteger bigInteger3 = bigInteger = bigInteger2.shiftRight(bigInteger2.bitLength() / 2);
        BigInteger bigInteger4;
        while (!(bigInteger4 = bigInteger3.add(arg0.divide(bigInteger)).shiftRight(1)).equals(bigInteger)) {
            bigInteger3 = bigInteger4;
        }
        return bigInteger4;
    }

    public static void main(String[] arg0) {
        if (arg0.length > 0) {
            int n;
            int n2 = n = 0;
            while (n2 < arg0.length) {
                sprcdh.cfr_renamed_8679(arg0[n++]);
                n2 = n;
            }
        } else {
            TreeSet treeSet = new TreeSet(sprcdh.cfr_renamed_8661(sprnhm.cfr_renamed_289()));
            treeSet.addAll(sprcdh.cfr_renamed_8661(sprchl.cfr_renamed_289()));
            Iterator iterator = treeSet.iterator();
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                sprcdh.cfr_renamed_8679((String)iterator.next());
                iterator2 = iterator;
            }
        }
    }

    private static /* synthetic */ void cfr_renamed_8680(BigInteger arg0, BigInteger arg1) {
        Object object;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger[] bigIntegerArray = null;
        BigInteger[] bigIntegerArray2 = null;
        BigInteger[] bigIntegerArray3 = sprcdh.cfr_renamed_1822(arg0, arg1);
        BigInteger[] bigIntegerArray4 = new BigInteger[2];
        bigIntegerArray4[0] = bigIntegerArray3[2];
        bigIntegerArray4[1] = bigIntegerArray3[3].negate();
        bigIntegerArray = bigIntegerArray4;
        BigInteger[] bigIntegerArray5 = new BigInteger[2];
        bigIntegerArray5[0] = bigIntegerArray3[0];
        bigIntegerArray5[1] = bigIntegerArray3[1].negate();
        BigInteger[] bigIntegerArray6 = new BigInteger[2];
        bigIntegerArray6[0] = bigIntegerArray3[4];
        bigIntegerArray6[1] = bigIntegerArray3[5].negate();
        bigIntegerArray2 = sprcdh.cfr_renamed_1823(bigIntegerArray5, bigIntegerArray6);
        if (!sprcdh.cfr_renamed_1824(bigIntegerArray2[0].abs().max(bigIntegerArray2[1].abs()), arg0) && sprcdh.cfr_renamed_1825(bigIntegerArray[0], bigIntegerArray[1])) {
            bigInteger2 = bigIntegerArray[0];
            BigInteger bigInteger3 = bigIntegerArray[1];
            bigInteger = bigInteger2.add(bigInteger3.multiply(arg1)).divide(arg0);
            BigInteger[] bigIntegerArray7 = new BigInteger[2];
            bigIntegerArray7[0] = bigInteger.abs();
            bigIntegerArray7[1] = bigInteger3.abs();
            object = sprcdh.cfr_renamed_1819(bigIntegerArray7);
            if (object != null) {
                BigInteger[] bigIntegerArray8;
                Object object2 = object;
                BigInteger bigInteger4 = object2[0];
                BigInteger bigInteger5 = object2[1];
                if (bigInteger.signum() < 0) {
                    bigInteger4 = bigInteger4.negate();
                }
                if (bigInteger3.signum() > 0) {
                    bigInteger5 = bigInteger5.negate();
                }
                if (!bigInteger.multiply(bigInteger4).subtract(bigInteger3.multiply(bigInteger5)).equals(sprck.cfr_renamed_4)) {
                    throw new IllegalStateException();
                }
                BigInteger bigInteger6 = bigInteger5.multiply(arg0).subtract(bigInteger4.multiply(arg1));
                BigInteger bigInteger7 = bigInteger4.negate();
                BigInteger bigInteger8 = bigInteger6.negate();
                BigInteger bigInteger9 = sprcdh.cfr_renamed_1826(arg0.subtract(sprck.cfr_renamed_4)).add(sprck.cfr_renamed_4);
                BigInteger[] bigIntegerArray9 = sprcdh.cfr_renamed_1827(bigInteger7, bigInteger9, bigInteger3);
                BigInteger[] bigIntegerArray10 = sprcdh.cfr_renamed_1828(bigIntegerArray9, bigIntegerArray8 = sprcdh.cfr_renamed_1827(bigInteger8, bigInteger9, bigInteger2));
                if (bigIntegerArray10 != null) {
                    BigInteger bigInteger10;
                    BigInteger bigInteger11 = bigInteger10 = bigIntegerArray10[0];
                    while (bigInteger11.compareTo(bigIntegerArray10[1]) <= 0) {
                        BigInteger[] bigIntegerArray11 = new BigInteger[2];
                        bigIntegerArray11[0] = bigInteger6.add(bigInteger10.multiply(bigInteger2));
                        bigIntegerArray11[1] = bigInteger4.add(bigInteger10.multiply(bigInteger3));
                        BigInteger[] bigIntegerArray12 = bigIntegerArray11;
                        if (sprcdh.cfr_renamed_1829(bigIntegerArray11, bigIntegerArray2)) {
                            bigIntegerArray2 = bigIntegerArray12;
                        }
                        bigInteger11 = bigInteger10.add(sprck.cfr_renamed_4);
                    }
                }
            }
        }
        bigInteger2 = bigIntegerArray[0].multiply(bigIntegerArray2[1]).subtract(bigIntegerArray[1].multiply(bigIntegerArray2[0]));
        int n = arg0.bitLength() + 16 - (arg0.bitLength() & 7);
        bigInteger = sprcdh.cfr_renamed_1834(bigIntegerArray2[1].shiftLeft(n), bigInteger2);
        object = sprcdh.cfr_renamed_1834(bigIntegerArray[1].shiftLeft(n), bigInteger2).negate();
        sprcdh.cfr_renamed_1835(sprggp.cfr_renamed_9("\fQ"), new StringBuilder().insert(0, sprgpr.cfr_renamed_9("wG")).append(bigIntegerArray[0].toString(16)).append(sprggp.cfr_renamed_9("V@")).append(bigIntegerArray[1].toString(16)).append(sprgpr.cfr_renamed_9(",\u001a")).toString());
        sprcdh.cfr_renamed_1835(sprggp.cfr_renamed_9("\fR"), new StringBuilder().insert(0, sprgpr.cfr_renamed_9("wG")).append(bigIntegerArray2[0].toString(16)).append(sprggp.cfr_renamed_9("V@")).append(bigIntegerArray2[1].toString(16)).append(sprgpr.cfr_renamed_9(",\u001a")).toString());
        sprcdh.cfr_renamed_1835("d", bigInteger2.toString(16));
        sprcdh.cfr_renamed_1835(sprggp.cfr_renamed_9("R/*4S@\u001dQ"), bigInteger.toString(16));
        sprcdh.cfr_renamed_1835(sprgpr.cfr_renamed_9("$(\\3%GkU"), ((BigInteger)object).toString(16));
        sprcdh.cfr_renamed_1835(sprggp.cfr_renamed_9("R/*4S@\u0018\t\u000e\u0013"), Integer.toString(n));
    }

    private static /* synthetic */ BigInteger[] cfr_renamed_1827(BigInteger arg0, BigInteger arg1, BigInteger arg2) {
        BigInteger bigInteger = arg0;
        BigInteger bigInteger2 = bigInteger.subtract(arg1).divide(arg2);
        BigInteger bigInteger3 = bigInteger.add(arg1).divide(arg2);
        return sprcdh.cfr_renamed_1818(bigInteger2, bigInteger3);
    }

    private static /* synthetic */ BigInteger cfr_renamed_1834(BigInteger arg0, BigInteger arg1) {
        boolean bl = arg0.signum() != arg1.signum();
        arg0 = arg0.abs();
        arg1 = arg1.abs();
        BigInteger bigInteger = arg0.add(arg1.shiftRight(1)).divide(arg1);
        if (bl) {
            return bigInteger.negate();
        }
        return bigInteger;
    }

    private static /* synthetic */ void cfr_renamed_8681(sprhfm arg0, BigInteger arg1, sprlsh[] arg2) {
        spreuh spreuh2 = arg0.cfr_renamed_1145().cfr_renamed_1775();
        spreuh spreuh3 = spreuh2.cfr_renamed_1830(arg1).cfr_renamed_1775();
        if (!spreuh2.cfr_renamed_1831().equals(spreuh3.cfr_renamed_1831())) {
            throw new IllegalStateException(sprgpr.cfr_renamed_9("#i\u0015e\u0011m\u0013e\bbGc\u0001, @1,3u\u0017iGNG|\u0006~\u0006a\u0002x\u0002~\u0014,\u0001m\u000e`\u0002hGy\ti\u001f|\u0002o\u0013i\u0003`\u001e"));
        }
        sprlsh sprlsh2 = arg2[0];
        if (!spreuh2.cfr_renamed_1832().cfr_renamed_8682(sprlsh2).equals(spreuh3.cfr_renamed_1832())) {
            sprlsh2 = arg2[1];
            if (!spreuh2.cfr_renamed_1832().cfr_renamed_8682(sprlsh2).equals(spreuh3.cfr_renamed_1832())) {
                throw new IllegalStateException(sprggp.cfr_renamed_9("$\u001f\u0012\u0013\u0016\u001b\u0014\u0013\u000f\u0014@\u0015\u0006Z'66Z4\u0003\u0010\u001f@8@\n\u0001\b\u0001\u0017\u0005\u000e\u0005\b\u0013Z\u0006\u001b\t\u0016\u0005\u001e@\u000f\u000e\u001f\u0018\n\u0005\u0019\u0014\u001f\u0004\u0016\u0019"));
            }
        }
        sprcdh.cfr_renamed_1835(sprgpr.cfr_renamed_9("7c\u000eb\u0013,\nm\u0017"), sprggp.cfr_renamed_9("\f\u001b\r\u0018\u0004\u001b@P@R\u0018V@\u0003IZ]ZH\u0018\u0005\u000e\u0001ZJZ\u0018V@\u0003I"));
        sprcdh.cfr_renamed_1835(sprgpr.cfr_renamed_9("n\u0002x\u0006"), sprlsh2.cfr_renamed_1779().toString(16));
        sprcdh.cfr_renamed_1835(sprggp.cfr_renamed_9("\u0016\u0001\u0017\u0002\u001e\u0001"), arg1.toString(16));
        sprcdh.cfr_renamed_8680(arg0.cfr_renamed_1146(), arg1);
    }

    private static /* synthetic */ BigInteger[] cfr_renamed_8669(BigInteger arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3) {
        BigInteger bigInteger = arg2;
        BigInteger bigInteger2 = sprcdh.cfr_renamed_8676(bigInteger.multiply(bigInteger).subtract(arg1.multiply(arg3).shiftLeft(2)).mod(arg0), arg0);
        if (bigInteger2 == null) {
            throw new IllegalStateException(sprgpr.cfr_renamed_9("_\b`\u0011e\tkG}\u0012m\u0003~\u0006x\u000eoGi\u0016y\u0006x\u000ec\t,\u0001m\u000e`\u0002hGy\ti\u001f|\u0002o\u0013i\u0003`\u001e"));
        }
        BigInteger bigInteger3 = arg1.shiftLeft(1).modInverse(arg0);
        BigInteger bigInteger4 = bigInteger2;
        BigInteger bigInteger5 = bigInteger4.subtract(arg2).multiply(bigInteger3).mod(arg0);
        BigInteger bigInteger6 = bigInteger4.negate().subtract(arg2).multiply(bigInteger3).mod(arg0);
        BigInteger[] bigIntegerArray = new BigInteger[2];
        bigIntegerArray[0] = bigInteger5;
        bigIntegerArray[1] = bigInteger6;
        return bigIntegerArray;
    }

    private static /* synthetic */ void cfr_renamed_8671(sprhfm arg0, BigInteger arg1, sprlsh[] arg2) {
        spreuh spreuh2 = arg0.cfr_renamed_1145().cfr_renamed_1775();
        spreuh spreuh3 = spreuh2.cfr_renamed_1830(arg1).cfr_renamed_1775();
        if (!spreuh2.cfr_renamed_1832().cfr_renamed_1773().equals(spreuh3.cfr_renamed_1832())) {
            throw new IllegalStateException(sprggp.cfr_renamed_9("$\u001f\u0012\u0013\u0016\u001b\u0014\u0013\u000f\u0014@\u0015\u0006Z'66Z4\u0003\u0010\u001f@;@\n\u0001\b\u0001\u0017\u0005\u000e\u0005\b\u0013Z\u0006\u001b\t\u0016\u0005\u001e@\u000f\u000e\u001f\u0018\n\u0005\u0019\u0014\u001f\u0004\u0016\u0019"));
        }
        sprlsh sprlsh2 = arg2[0];
        if (!spreuh2.cfr_renamed_1831().cfr_renamed_8682(sprlsh2).equals(spreuh3.cfr_renamed_1831())) {
            sprlsh2 = arg2[1];
            if (!spreuh2.cfr_renamed_1831().cfr_renamed_8682(sprlsh2).equals(spreuh3.cfr_renamed_1831())) {
                throw new IllegalStateException(sprgpr.cfr_renamed_9("#i\u0015e\u0011m\u0013e\bbGc\u0001, @1,3u\u0017iGMG|\u0006~\u0006a\u0002x\u0002~\u0014,\u0001m\u000e`\u0002hGy\ti\u001f|\u0002o\u0013i\u0003`\u001e"));
            }
        }
        sprcdh.cfr_renamed_1835(sprggp.cfr_renamed_9("0\u0015\t\u0014\u0014Z\r\u001b\u0010"), sprgpr.cfr_renamed_9("\u000bm\nn\u0003mG&G$\u001f GuN,Z,O!\u001f GeG&GuN"));
        sprcdh.cfr_renamed_1835("i", sprlsh2.cfr_renamed_1779().toString(16));
        sprcdh.cfr_renamed_1835(sprggp.cfr_renamed_9("\u0016\u0001\u0017\u0002\u001e\u0001"), arg1.toString(16));
        sprcdh.cfr_renamed_8680(arg0.cfr_renamed_1146(), arg1);
    }

    private static /* synthetic */ BigInteger[] cfr_renamed_1828(BigInteger[] arg0, BigInteger[] arg1) {
        BigInteger bigInteger;
        BigInteger bigInteger2 = arg0[0].max(arg1[0]);
        if (bigInteger2.compareTo(bigInteger = arg0[1].min(arg1[1])) > 0) {
            return null;
        }
        BigInteger[] bigIntegerArray = new BigInteger[2];
        bigIntegerArray[0] = bigInteger2;
        bigIntegerArray[1] = bigInteger;
        return bigIntegerArray;
    }

    private static /* synthetic */ BigInteger cfr_renamed_8678(BigInteger arg0, BigInteger arg1) {
        int n;
        int n2 = n = 2;
        while (n2 < 1000) {
            BigInteger bigInteger = BigInteger.valueOf(n);
            if (!bigInteger.modPow(arg1, arg0).equals(sprck.cfr_renamed_4)) {
                return bigInteger;
            }
            n2 = ++n;
        }
        throw new IllegalStateException();
    }

    private static /* synthetic */ void cfr_renamed_8674(sprhfm arg0) {
        sprhfm sprhfm2 = arg0;
        BigInteger[] bigIntegerArray = sprcdh.cfr_renamed_8669(sprhfm2.cfr_renamed_1146(), sprck.cfr_renamed_4, sprck.cfr_renamed_4, sprck.cfr_renamed_4);
        sprlsh[] sprlshArray = sprcdh.cfr_renamed_8675(sprhfm2.cfr_renamed_1769());
        sprcdh.cfr_renamed_8681(sprhfm2, bigIntegerArray[0], sprlshArray);
        System.out.println(sprgpr.cfr_renamed_9("C5"));
        sprcdh.cfr_renamed_8681(sprhfm2, bigIntegerArray[1], sprlshArray);
    }

    private static /* synthetic */ BigInteger[] cfr_renamed_1823(BigInteger[] arg0, BigInteger[] arg1) {
        if (sprcdh.cfr_renamed_1829(arg0, arg1)) {
            return arg0;
        }
        return arg1;
    }

    public static void cfr_renamed_8683(sprhfm arg0) {
        if (arg0 == null) {
            throw new NullPointerException(sprggp.cfr_renamed_9("\u0002Y"));
        }
        sprcdh.cfr_renamed_8672(arg0, sprgpr.cfr_renamed_9("[Y)G)C0BY"));
    }
}

