/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahe;
import com.spire.presentation.packages.sprfpd;
import com.spire.presentation.packages.sprjpfa;
import com.spire.presentation.packages.sprpb;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprsez;
import com.spire.presentation.packages.sprunb;
import com.spire.presentation.packages.sprvpa;
import com.spire.presentation.packages.sprwkb;
import com.spire.presentation.packages.sprwtb;
import java.io.Serializable;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprwib {
    private static final int cfr_renamed_4 = 16;

    private static /* synthetic */ BigInteger cfr_renamed_1816(BigInteger arg0, BigInteger arg1, BigInteger arg2) {
        BigInteger bigInteger = arg1;
        BigInteger bigInteger2 = bigInteger.multiply(bigInteger).subtract(arg2.shiftLeft(2)).mod(arg0);
        BigInteger bigInteger3 = new sprwkb(arg0, bigInteger2).cfr_renamed_1817().cfr_renamed_1779();
        if (!bigInteger3.testBit(0)) {
            bigInteger3 = arg0.subtract(bigInteger3);
        }
        return bigInteger3.shiftRight(1);
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

    private static /* synthetic */ BigInteger[] cfr_renamed_1819(BigInteger[] arg0) {
        BigInteger[] bigIntegerArray;
        boolean bl;
        boolean bl2 = bl = arg0[0].compareTo(arg0[1]) < 0;
        if (bl) {
            sprwib.cfr_renamed_1820(arg0);
        }
        BigInteger bigInteger = arg0[0];
        BigInteger bigInteger2 = arg0[1];
        BigInteger bigInteger3 = sprpb.cfr_renamed_0;
        BigInteger bigInteger4 = sprpb.cfr_renamed_1;
        BigInteger bigInteger5 = sprpb.cfr_renamed_1;
        BigInteger bigInteger6 = sprpb.cfr_renamed_0;
        BigInteger bigInteger7 = bigInteger2;
        while (bigInteger7.compareTo(sprpb.cfr_renamed_0) > 0) {
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
            throw new IllegalStateException();
        }
        BigInteger[] bigIntegerArray2 = new BigInteger[2];
        bigIntegerArray2[0] = bigInteger4;
        bigIntegerArray2[1] = bigInteger6;
        bigIntegerArray = bigIntegerArray2;
        if (bl) {
            sprwib.cfr_renamed_1820(bigIntegerArray);
        }
        return bigIntegerArray;
    }

    private static /* synthetic */ void cfr_renamed_1821(sprfpd arg0) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        Serializable serializable;
        BigInteger bigInteger3;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        BigInteger bigInteger4 = arg0.cfr_renamed_1146();
        BigInteger[] bigIntegerArray = null;
        BigInteger[] bigIntegerArray2 = null;
        BigInteger bigInteger5 = bigInteger4;
        BigInteger bigInteger6 = sprwib.cfr_renamed_1816(bigInteger5, sprpb.cfr_renamed_0, sprpb.cfr_renamed_0);
        BigInteger[] bigIntegerArray3 = sprwib.cfr_renamed_1822(bigInteger5, bigInteger6);
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
        bigIntegerArray2 = sprwib.cfr_renamed_1823(bigIntegerArray5, bigIntegerArray6);
        if (!sprwib.cfr_renamed_1824(bigIntegerArray2[0].abs().max(bigIntegerArray2[1].abs()), bigInteger4) && sprwib.cfr_renamed_1825(bigIntegerArray[0], bigIntegerArray[1])) {
            BigInteger[] bigIntegerArray7;
            object4 = bigIntegerArray[0];
            object3 = bigIntegerArray[1];
            object2 = ((BigInteger)object4).add(((BigInteger)object3).multiply(bigInteger6)).divide(bigInteger4);
            BigInteger[] bigIntegerArray8 = new BigInteger[2];
            bigIntegerArray8[0] = ((BigInteger)object2).abs();
            bigIntegerArray8[1] = ((BigInteger)object3).abs();
            object = sprwib.cfr_renamed_1819(bigIntegerArray8);
            bigInteger3 = object[0];
            serializable = object[1];
            if (((BigInteger)object2).signum() < 0) {
                bigInteger3 = bigInteger3.negate();
            }
            if (((BigInteger)object3).signum() > 0) {
                serializable = ((BigInteger)serializable).negate();
            }
            if (!(bigInteger2 = ((BigInteger)object2).multiply(bigInteger3).subtract(((BigInteger)object3).multiply((BigInteger)serializable))).equals(sprpb.cfr_renamed_0)) {
                throw new IllegalStateException();
            }
            bigInteger = ((BigInteger)serializable).multiply(bigInteger4).subtract(bigInteger3.multiply(bigInteger6));
            BigInteger bigInteger7 = bigInteger3.negate();
            BigInteger bigInteger8 = bigInteger.negate();
            BigInteger bigInteger9 = sprwib.cfr_renamed_1826(bigInteger4.subtract(sprpb.cfr_renamed_0)).add(sprpb.cfr_renamed_0);
            BigInteger[] bigIntegerArray9 = sprwib.cfr_renamed_1827(bigInteger7, bigInteger9, (BigInteger)object3);
            BigInteger[] bigIntegerArray10 = sprwib.cfr_renamed_1828(bigIntegerArray9, bigIntegerArray7 = sprwib.cfr_renamed_1827(bigInteger8, bigInteger9, (BigInteger)object4));
            if (bigIntegerArray10 != null) {
                BigInteger bigInteger10;
                BigInteger bigInteger11 = bigInteger10 = bigIntegerArray10[0];
                while (bigInteger11.compareTo(bigIntegerArray10[1]) <= 0) {
                    BigInteger[] bigIntegerArray11 = new BigInteger[2];
                    bigIntegerArray11[0] = bigInteger.add(bigInteger10.multiply((BigInteger)object4));
                    bigIntegerArray11[1] = bigInteger3.add(bigInteger10.multiply((BigInteger)object3));
                    BigInteger[] bigIntegerArray12 = bigIntegerArray11;
                    if (sprwib.cfr_renamed_1829(bigIntegerArray11, bigIntegerArray2)) {
                        bigIntegerArray2 = bigIntegerArray12;
                    }
                    bigInteger11 = bigInteger10.add(sprpb.cfr_renamed_0);
                }
            }
        }
        object3 = arg0.cfr_renamed_1145().cfr_renamed_1775();
        object2 = ((sprrlb)object3).cfr_renamed_1830(bigInteger6).cfr_renamed_1775();
        if (!((sprrlb)object3).cfr_renamed_1831().equals(((sprrlb)object2).cfr_renamed_1831())) {
            throw new IllegalStateException(sprsez.cfr_renamed_9("\"\t\u0014\u0005\u0010\r\u0012\u0005\t\u0002F\u0003\u0000L! 0L2\u0015\u0016\tF.F\u001c\u0007\u001e\u0007\u0001\u0003\u0018\u0003\u001e\u0015L\u0000\r\u000f\u0000\u0003\bF\u0019\b\t\u001e\u001c\u0003\u000f\u0012\t\u0002\u0000\u001f"));
        }
        object = arg0.cfr_renamed_1769().cfr_renamed_845().cfr_renamed_1762();
        bigInteger3 = ((BigInteger)object).divide(sprpb.cfr_renamed_3);
        serializable = new SecureRandom();
        while ((bigInteger2 = (bigInteger = sprvpa.cfr_renamed_513(sprpb.cfr_renamed_4, ((BigInteger)object).subtract(sprpb.cfr_renamed_4), (SecureRandom)serializable)).modPow(bigInteger3, (BigInteger)object)).equals(sprpb.cfr_renamed_0)) {
        }
        object4 = arg0.cfr_renamed_1769().cfr_renamed_1652(sprpb.cfr_renamed_4.modPow(bigInteger3, (BigInteger)object));
        if (!((sprrlb)object3).cfr_renamed_1832().cfr_renamed_1833((sprwtb)object4).equals(((sprrlb)object2).cfr_renamed_1832())) {
            object4 = ((sprwtb)object4).cfr_renamed_1048();
            if (!((sprrlb)object3).cfr_renamed_1832().cfr_renamed_1833((sprwtb)object4).equals(((sprrlb)object2).cfr_renamed_1832())) {
                throw new IllegalStateException(sprjpfa.cfr_renamed_9("=\u0019\u000b\u0015\u000f\u001d\r\u0015\u0016\u0012Y\u0013\u001f\\>0/\\-\u0005\t\u0019Y>Y\f\u0018\u000e\u0018\u0011\u001c\b\u001c\u000e\n\\\u001f\u001d\u0010\u0010\u001c\u0018Y\t\u0017\u0019\u0001\f\u001c\u001f\r\u0019\u001d\u0010\u0000"));
            }
        }
        object3 = bigIntegerArray[0].multiply(bigIntegerArray2[1]).subtract(bigIntegerArray[1].multiply(bigIntegerArray2[0]));
        int n = bigInteger4.bitLength() + 16 - (bigInteger4.bitLength() & 7);
        object = sprwib.cfr_renamed_1834(bigIntegerArray2[1].shiftLeft(n), (BigInteger)object3);
        bigInteger3 = sprwib.cfr_renamed_1834(bigIntegerArray[1].shiftLeft(n), (BigInteger)object3).negate();
        sprwib.cfr_renamed_1835(sprsez.cfr_renamed_9(".\u0003\u0018\u0007"), ((sprwtb)object4).cfr_renamed_1779().toString(16));
        sprwib.cfr_renamed_1835(sprjpfa.cfr_renamed_9("0\u0018\u0011\u001b\u0018\u0018"), bigInteger6.toString(16));
        sprwib.cfr_renamed_1835(sprsez.cfr_renamed_9("\u001aW"), new StringBuilder().insert(0, sprjpfa.cfr_renamed_9("\u0007Y")).append(bigIntegerArray[0].toString(16)).append(sprsez.cfr_renamed_9("@F")).append(bigIntegerArray[1].toString(16)).append(sprjpfa.cfr_renamed_9("\\\u0004")).toString());
        sprwib.cfr_renamed_1835(sprsez.cfr_renamed_9("\u001aT"), new StringBuilder().insert(0, sprjpfa.cfr_renamed_9("\u0007Y")).append(bigIntegerArray2[0].toString(16)).append(sprsez.cfr_renamed_9("@F")).append(bigIntegerArray2[1].toString(16)).append(sprjpfa.cfr_renamed_9("\\\u0004")).toString());
        sprwib.cfr_renamed_1835(sprsez.cfr_renamed_9("D)<2EF\u000bW"), ((BigInteger)object).toString(16));
        sprwib.cfr_renamed_1835(sprjpfa.cfr_renamed_9("T6,-UY\u001bK"), bigInteger3.toString(16));
        sprwib.cfr_renamed_1835(sprsez.cfr_renamed_9("D)<2EF\u000e\u000f\u0018\u0015"), Integer.toString(n));
    }

    public static void main(String[] arg0) {
        int n;
        if (arg0.length < 1) {
            System.err.println(sprjpfa.cfr_renamed_9("<\u0004\t\u0019\u001a\b\u001c\u0018Y\u001dY\u0010\u0010\u000f\r\\\u0016\u001aY\u001f\f\u000e\u000f\u0019Y\u0012\u0018\u0011\u001c\u000fY\u001d\n\\\u0018\u000e\u001e\t\u0014\u0019\u0017\b\n"));
            return;
        }
        int n2 = n = 0;
        while (n2 < arg0.length) {
            sprwib.cfr_renamed_1836(arg0[n++]);
            n2 = n;
        }
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

    private static /* synthetic */ boolean cfr_renamed_1825(BigInteger arg0, BigInteger arg1) {
        return arg0.gcd(arg1).equals(sprpb.cfr_renamed_0);
    }

    private static /* synthetic */ BigInteger[] cfr_renamed_1827(BigInteger arg0, BigInteger arg1, BigInteger arg2) {
        BigInteger bigInteger = arg0;
        BigInteger bigInteger2 = bigInteger.subtract(arg1).divide(arg2);
        BigInteger bigInteger3 = bigInteger.add(arg1).divide(arg2);
        return sprwib.cfr_renamed_1818(bigInteger2, bigInteger3);
    }

    private static /* synthetic */ BigInteger[] cfr_renamed_1823(BigInteger[] arg0, BigInteger[] arg1) {
        if (sprwib.cfr_renamed_1829(arg0, arg1)) {
            return arg0;
        }
        return arg1;
    }

    private static /* synthetic */ BigInteger[] cfr_renamed_1822(BigInteger arg0, BigInteger arg1) {
        BigInteger bigInteger = arg0;
        BigInteger bigInteger2 = arg1;
        BigInteger bigInteger3 = sprpb.cfr_renamed_1;
        BigInteger bigInteger4 = sprpb.cfr_renamed_0;
        BigInteger bigInteger5 = bigInteger;
        while (true) {
            BigInteger[] bigIntegerArray = bigInteger5.divideAndRemainder(bigInteger2);
            BigInteger bigInteger6 = bigIntegerArray[0];
            BigInteger bigInteger7 = bigIntegerArray[1];
            BigInteger bigInteger8 = bigInteger3.subtract(bigInteger6.multiply(bigInteger4));
            if (sprwib.cfr_renamed_1824(bigInteger2, arg0)) {
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

    private static /* synthetic */ void cfr_renamed_1820(BigInteger[] bigIntegerArray) {
        BigInteger[] arg0;
        BigInteger bigInteger = bigIntegerArray[0];
        bigIntegerArray[0] = arg0[1];
        arg0[1] = bigInteger;
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

    private static /* synthetic */ void cfr_renamed_1836(String arg0) {
        sprfpd sprfpd2 = sprahe.cfr_renamed_1837(arg0);
        if (sprfpd2 == null) {
            System.err.println(new StringBuilder().insert(0, sprsez.cfr_renamed_9("3\u0002\r\u0002\t\u001b\bL\u0005\u0019\u0014\u001a\u0003VF")).append(arg0).toString());
            return;
        }
        sprpib sprpib2 = sprfpd2.cfr_renamed_1769();
        if (sprunb.cfr_renamed_1838(sprpib2)) {
            sprpib sprpib3 = sprpib2;
            BigInteger bigInteger = sprpib3.cfr_renamed_845().cfr_renamed_1762();
            if (sprpib3.cfr_renamed_1778().cfr_renamed_805() && bigInteger.mod(sprpb.cfr_renamed_3).equals(sprpb.cfr_renamed_0)) {
                System.out.println(new StringBuilder().insert(0, sprjpfa.cfr_renamed_9(":\t\u000b\n\u001c\\^")).append(arg0).append(sprsez.cfr_renamed_9("AL\u000e\r\u0015L\u0007LA+*:F8\u001f\u001c\u0003L$KF\t\b\b\t\u0001\t\u001e\u0016\u0004\u000f\u001f\u000bL\u0011\u0005\u0012\u0004F\u0018\u000e\t\u0015\tF\u001c\u0007\u001e\u0007\u0001\u0003\u0018\u0003\u001e\u0015VF")).toString());
                sprwib.cfr_renamed_1821(sprfpd2);
            }
        }
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
        stringBuffer.append(sprjpfa.cfr_renamed_9("AY"));
        stringBuffer.append(arg1.toString());
        System.out.println(stringBuffer.toString());
    }
}

