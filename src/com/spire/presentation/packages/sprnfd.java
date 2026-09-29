/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprakd;
import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprcoca;
import com.spire.presentation.packages.sprimp;
import com.spire.presentation.packages.sprpdd;
import com.spire.presentation.packages.sprwnd;
import com.spire.presentation.packages.sprxjd;
import com.spire.presentation.packages.spry;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Vector;

public class sprnfd
implements spry {
    private sprxjd cfr_renamed_2;
    private static int[] cfr_renamed_3;
    private static final BigInteger cfr_renamed_4;

    private static /* synthetic */ BigInteger cfr_renamed_3507(int arg0, int arg1, SecureRandom arg2) {
        BigInteger bigInteger;
        BigInteger bigInteger2 = bigInteger = new BigInteger(arg0, arg1, arg2);
        while (bigInteger2.bitLength() != arg0) {
            bigInteger2 = new BigInteger(arg0, arg1, arg2);
        }
        return bigInteger;
    }

    @Override
    public sprwnd cfr_renamed_1223() {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4;
        BigInteger bigInteger5;
        int n;
        sprnfd sprnfd2 = this;
        int n2 = sprnfd2.cfr_renamed_2.cfr_renamed_3483();
        SecureRandom secureRandom = sprnfd2.cfr_renamed_2.cfr_renamed_1295();
        int n3 = sprnfd2.cfr_renamed_2.cfr_renamed_3341();
        boolean bl = sprnfd2.cfr_renamed_2.cfr_renamed_3350();
        if (bl) {
            System.out.println(new StringBuilder().insert(0, sprcoca.cfr_renamed_9("|\u0011N\u0017R\u001dT\u0013\u001a\u0012S\u0006I\u0000\u001a")).append(this.cfr_renamed_2.cfr_renamed_3349()).append(sprimp.cfr_renamed_9("ri p?|!7")).toString());
        }
        Vector vector = sprnfd.cfr_renamed_3508(this.cfr_renamed_2.cfr_renamed_3349());
        vector = sprnfd.cfr_renamed_3509(vector, secureRandom);
        BigInteger bigInteger6 = cfr_renamed_4;
        BigInteger bigInteger7 = cfr_renamed_4;
        int n4 = n = 0;
        while (n4 < vector.size() / 2) {
            Object e = vector.elementAt(n);
            bigInteger6 = bigInteger6.multiply((BigInteger)e);
            n4 = ++n;
        }
        int n5 = n = vector.size() / 2;
        while (n5 < vector.size()) {
            Object e = vector.elementAt(n);
            bigInteger7 = bigInteger7.multiply((BigInteger)e);
            n5 = ++n;
        }
        BigInteger bigInteger8 = bigInteger6.multiply(bigInteger7);
        int n6 = n2 - bigInteger8.bitLength() - 48;
        BigInteger bigInteger9 = sprnfd.cfr_renamed_3507(n6 / 2 + 1, n3, secureRandom);
        BigInteger bigInteger10 = sprnfd.cfr_renamed_3507(n6 / 2 + 1, n3, secureRandom);
        long l = 0L;
        if (bl) {
            System.out.println(sprcoca.cfr_renamed_9("\u0013_\u001a_\u0006[\u0000S\u001a]TJT[\u001a^TK"));
        }
        BigInteger bigInteger11 = bigInteger9.multiply(bigInteger6).shiftLeft(1);
        BigInteger bigInteger12 = bigInteger10.multiply(bigInteger7).shiftLeft(1);
        block2: while (true) {
            long l2 = l;
            while (true) {
                l = l2 + 1L;
                bigInteger5 = sprnfd.cfr_renamed_3507(24, n3, secureRandom);
                bigInteger4 = bigInteger5.multiply(bigInteger11).add(cfr_renamed_4);
                if (!bigInteger4.isProbablePrime(n3)) {
                    l2 = l;
                    continue;
                }
                while (bigInteger5.equals(bigInteger3 = sprnfd.cfr_renamed_3507(24, n3, secureRandom)) || !(bigInteger2 = bigInteger3.multiply(bigInteger12).add(cfr_renamed_4)).isProbablePrime(n3)) {
                }
                if (!bigInteger8.gcd(bigInteger5.multiply(bigInteger3)).equals(cfr_renamed_4)) {
                    l2 = l;
                    continue;
                }
                if (bigInteger4.multiply(bigInteger2).bitLength() >= n2) break block2;
                if (!bl) continue block2;
                System.out.println(new StringBuilder().insert(0, sprimp.cfr_renamed_9("9|+9!p(|rm=vrj?x>u|9\u0001q=l>}r{79")).append(n2).append(sprcoca.cfr_renamed_9("\u001a\u0016O\u0000\u001a\u001dIT[\u0017N\u0001[\u0018V\r\u001a")).append(bigInteger4.multiply(bigInteger2).bitLength()).toString());
                l2 = l;
            }
            break;
        }
        if (bl) {
            System.out.println(new StringBuilder().insert(0, sprimp.cfr_renamed_9("w7|6|69")).append(l).append(sprcoca.cfr_renamed_9("\u001a\u0000H\u001d_\u0007\u001a\u0000UT]\u0011T\u0011H\u0015N\u0011\u001a\u0004\u001a\u0015T\u0010\u001a\u0005\u0014")).toString());
        }
        BigInteger bigInteger13 = bigInteger4;
        BigInteger bigInteger14 = bigInteger13.multiply(bigInteger2);
        BigInteger bigInteger15 = bigInteger13.subtract(cfr_renamed_4).multiply(bigInteger2.subtract(cfr_renamed_4));
        l = 0L;
        if (bl) {
            System.out.println(sprimp.cfr_renamed_9("5|<| x&p<~r~"));
        }
        while (true) {
            int n7;
            block23: {
                int n8;
                int n9;
                Vector<BigInteger> vector2 = new Vector<BigInteger>();
                int n10 = n9 = 0;
                while (n10 != vector.size()) {
                    BigInteger bigInteger16 = (BigInteger)vector.elementAt(n9);
                    BigInteger bigInteger17 = bigInteger15.divide(bigInteger16);
                    long l3 = l;
                    while (true) {
                        l = l3 + 1L;
                        bigInteger = new BigInteger(n2, n3, secureRandom);
                        if (!bigInteger.modPow(bigInteger17, bigInteger14).equals(cfr_renamed_4)) break;
                        l3 = l;
                    }
                    vector2.addElement(bigInteger);
                    n10 = ++n9;
                }
                bigInteger = cfr_renamed_4;
                int n11 = n9 = 0;
                while (n11 < vector.size()) {
                    BigInteger bigInteger18 = bigInteger.multiply(((BigInteger)vector2.elementAt(n9)).modPow(bigInteger8.divide((BigInteger)vector.elementAt(n9)), bigInteger14));
                    bigInteger = bigInteger18.mod(bigInteger14);
                    n11 = ++n9;
                }
                n9 = 0;
                int n12 = n8 = 0;
                while (n12 < vector.size()) {
                    if (bigInteger.modPow(bigInteger15.divide((BigInteger)vector.elementAt(n8)), bigInteger14).equals(cfr_renamed_4)) {
                        if (bl) {
                            System.out.println(new StringBuilder().insert(0, sprcoca.cfr_renamed_9("]TR\u0015ITU\u0006^\u0011HTJ\u001cS\\T]\u0015")).append(vector.elementAt(n8)).append(sprimp.cfr_renamed_9("\u0013r~h9")).append(bigInteger).toString());
                        }
                        n7 = n9 = 1;
                        break block23;
                    }
                    n12 = ++n8;
                }
                n7 = n9;
            }
            if (n7 != 0) continue;
            if (bigInteger.modPow(bigInteger15.divide(BigInteger.valueOf(4L)), bigInteger14).equals(cfr_renamed_4)) {
                if (!bl) continue;
                System.out.println(new StringBuilder().insert(0, sprcoca.cfr_renamed_9("\u0013\u001a\u001c[\u0007\u001a\u001bH\u0010_\u0006\u001a\u0004R\u001d\u0012\u001a\u0013[\u000e~\u001a\u0013\u0000")).append(bigInteger).toString());
                continue;
            }
            if (bigInteger.modPow(bigInteger15.divide(bigInteger5), bigInteger14).equals(cfr_renamed_4)) {
                if (!bl) continue;
                System.out.println(new StringBuilder().insert(0, sprimp.cfr_renamed_9("59:x!9=k6| 9\"q;1<0}iu\u0013r~h9")).append(bigInteger).toString());
                continue;
            }
            if (bigInteger.modPow(bigInteger15.divide(bigInteger3), bigInteger14).equals(cfr_renamed_4)) {
                if (!bl) continue;
                System.out.println(new StringBuilder().insert(0, sprcoca.cfr_renamed_9("\u0013\u001a\u001c[\u0007\u001a\u001bH\u0010_\u0006\u001a\u0004R\u001d\u0012\u001a\u0013[KS0T]N\u001a")).append(bigInteger).toString());
                continue;
            }
            if (bigInteger.modPow(bigInteger15.divide(bigInteger9), bigInteger14).equals(cfr_renamed_4)) {
                if (!bl) continue;
                System.out.println(new StringBuilder().insert(0, sprimp.cfr_renamed_9("~rq3jrv }7kri:pzw{63\u0013r~h9")).append(bigInteger).toString());
                continue;
            }
            if (!bigInteger.modPow(bigInteger15.divide(bigInteger10), bigInteger14).equals(cfr_renamed_4)) break;
            if (!bl) continue;
            System.out.println(new StringBuilder().insert(0, sprcoca.cfr_renamed_9("]TR\u0015ITU\u0006^\u0011HTJ\u001cS\\T]\u0015\u00160T]N\u001a")).append(bigInteger).toString());
        }
        if (bl) {
            System.out.println(new StringBuilder().insert(0, sprimp.cfr_renamed_9("w7|6|69")).append(l).append(sprcoca.cfr_renamed_9("TN\u0006S\u0011ITN\u001b\u001a\u0013_\u001a_\u0006[\u0000_T]")).toString());
            System.out.println();
            System.out.println(sprimp.cfr_renamed_9("\u007f=l<}rw7nrW3z1x1q7J&| wrz;i:| 9$x p3{>|!#"));
            System.out.println(new StringBuilder().insert(0, sprcoca.cfr_renamed_9("I\u0019[\u0018V$H\u001dW\u0011IN\u001a")).append(vector).toString());
            System.out.println(new StringBuilder().insert(0, sprimp.cfr_renamed_9("j;~?xh7|7|7|9")).append(bigInteger8).append(sprcoca.cfr_renamed_9("T\u0012")).append(bigInteger8.bitLength()).append(sprimp.cfr_renamed_9("r{;m!0")).toString());
            System.out.println(new StringBuilder().insert(0, sprcoca.cfr_renamed_9("[N\u0014Z\u0014Z\u0014Z\u0014Z\u0014Z\u001a")).append(bigInteger9).toString());
            System.out.println(new StringBuilder().insert(0, sprimp.cfr_renamed_9("{h7|7|7|7|7|9")).append(bigInteger10).toString());
            System.out.println(new StringBuilder().insert(0, sprcoca.cfr_renamed_9("JS\u0000Z\u0014Z\u0014Z\u0014Z\u0014Z\u001a")).append(bigInteger5).toString());
            System.out.println(new StringBuilder().insert(0, sprimp.cfr_renamed_9("hu#|7|7|7|7|9")).append(bigInteger3).toString());
            System.out.println(new StringBuilder().insert(0, sprcoca.cfr_renamed_9("JN\u0014Z\u0014Z\u0014Z\u0014Z\u0014Z\u001a")).append(bigInteger4).toString());
            System.out.println(new StringBuilder().insert(0, sprimp.cfr_renamed_9("hh7|7|7|7|7|9")).append(bigInteger2).toString());
            System.out.println(new StringBuilder().insert(0, sprcoca.cfr_renamed_9("TN\u0014Z\u0014Z\u0014Z\u0014Z\u0014Z\u001a")).append(bigInteger14).toString());
            System.out.println(new StringBuilder().insert(0, sprimp.cfr_renamed_9("i:pzw{#|7|7|9")).append(bigInteger15).toString());
            System.out.println(new StringBuilder().insert(0, sprcoca.cfr_renamed_9("]N\u0014Z\u0014Z\u0014Z\u0014Z\u0014Z\u001a")).append(bigInteger).toString());
            System.out.println();
        }
        return new sprwnd(new sprakd(false, bigInteger, bigInteger14, bigInteger8.bitLength()), new sprpdd(bigInteger, bigInteger14, bigInteger8.bitLength(), vector, bigInteger15));
    }

    private static /* synthetic */ int cfr_renamed_3510(SecureRandom arg0, int arg1) {
        int n;
        int n2;
        int n3 = arg1;
        if ((n3 & -n3) == arg1) {
            return (int)((long)arg1 * (long)(arg0.nextInt() & Integer.MAX_VALUE) >> 31);
        }
        while ((n2 = arg0.nextInt() & Integer.MAX_VALUE) - (n = n2 % arg1) + (arg1 - 1) < 0) {
        }
        return n;
    }

    private static /* synthetic */ Vector cfr_renamed_3508(int arg0) {
        int n;
        Vector<BigInteger> vector = new Vector<BigInteger>(arg0);
        int n2 = n = 0;
        while (n2 != arg0) {
            int n3 = cfr_renamed_3[n];
            vector.addElement(BigInteger.valueOf(n3));
            n2 = ++n;
        }
        return vector;
    }

    @Override
    public void cfr_renamed_1222(sprccb arg0) {
        this.cfr_renamed_2 = (sprxjd)arg0;
    }

    static {
        int[] nArray = new int[101];
        nArray[0] = 3;
        nArray[1] = 5;
        nArray[2] = 7;
        nArray[3] = 11;
        nArray[4] = 13;
        nArray[5] = 17;
        nArray[6] = 19;
        nArray[7] = 23;
        nArray[8] = 29;
        nArray[9] = 31;
        nArray[10] = 37;
        nArray[11] = 41;
        nArray[12] = 43;
        nArray[13] = 47;
        nArray[14] = 53;
        nArray[15] = 59;
        nArray[16] = 61;
        nArray[17] = 67;
        nArray[18] = 71;
        nArray[19] = 73;
        nArray[20] = 79;
        nArray[21] = 83;
        nArray[22] = 89;
        nArray[23] = 97;
        nArray[24] = 101;
        nArray[25] = 103;
        nArray[26] = 107;
        nArray[27] = 109;
        nArray[28] = 113;
        nArray[29] = 127;
        nArray[30] = 131;
        nArray[31] = 137;
        nArray[32] = 139;
        nArray[33] = 149;
        nArray[34] = 151;
        nArray[35] = 157;
        nArray[36] = 163;
        nArray[37] = 167;
        nArray[38] = 173;
        nArray[39] = 179;
        nArray[40] = 181;
        nArray[41] = 191;
        nArray[42] = 193;
        nArray[43] = 197;
        nArray[44] = 199;
        nArray[45] = 211;
        nArray[46] = 223;
        nArray[47] = 227;
        nArray[48] = 229;
        nArray[49] = 233;
        nArray[50] = 239;
        nArray[51] = 241;
        nArray[52] = 251;
        nArray[53] = 257;
        nArray[54] = 263;
        nArray[55] = 269;
        nArray[56] = 271;
        nArray[57] = 277;
        nArray[58] = 281;
        nArray[59] = 283;
        nArray[60] = 293;
        nArray[61] = 307;
        nArray[62] = 311;
        nArray[63] = 313;
        nArray[64] = 317;
        nArray[65] = 331;
        nArray[66] = 337;
        nArray[67] = 347;
        nArray[68] = 349;
        nArray[69] = 353;
        nArray[70] = 359;
        nArray[71] = 367;
        nArray[72] = 373;
        nArray[73] = 379;
        nArray[74] = 383;
        nArray[75] = 389;
        nArray[76] = 397;
        nArray[77] = 401;
        nArray[78] = 409;
        nArray[79] = 419;
        nArray[80] = 421;
        nArray[81] = 431;
        nArray[82] = 433;
        nArray[83] = 439;
        nArray[84] = 443;
        nArray[85] = 449;
        nArray[86] = 457;
        nArray[87] = 461;
        nArray[88] = 463;
        nArray[89] = 467;
        nArray[90] = 479;
        nArray[91] = 487;
        nArray[92] = 491;
        nArray[93] = 499;
        nArray[94] = 503;
        nArray[95] = 509;
        nArray[96] = 521;
        nArray[97] = 523;
        nArray[98] = 541;
        nArray[99] = 547;
        nArray[100] = 557;
        cfr_renamed_3 = nArray;
        cfr_renamed_4 = BigInteger.valueOf(1L);
    }

    private static /* synthetic */ Vector cfr_renamed_3509(Vector arg0, SecureRandom arg1) {
        int n;
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        int n2 = n = 0;
        while (n2 < arg0.size()) {
            vector2.addElement(arg0.elementAt(n++));
            n2 = n;
        }
        vector.addElement(vector2.elementAt(0));
        Vector vector3 = vector2;
        Vector vector4 = vector3;
        vector3.removeElementAt(0);
        while (vector4.size() != 0) {
            Vector vector5 = vector2;
            vector4 = vector5;
            vector.insertElementAt(vector5.elementAt(0), sprnfd.cfr_renamed_3510(arg1, vector.size() + 1));
            vector5.removeElementAt(0);
        }
        return vector;
    }
}

