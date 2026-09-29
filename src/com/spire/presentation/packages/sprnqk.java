/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprnhk;
import com.spire.presentation.packages.sprqlk;
import com.spire.presentation.packages.sprrkl;
import com.spire.presentation.packages.sprsgk;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprspo;
import com.spire.presentation.packages.spruaz;
import com.spire.presentation.packages.sprybl;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Vector;

public class sprnqk
implements sprii {
    private static final BigInteger cfr_renamed_2;
    private sprsgk cfr_renamed_3;
    private static int[] cfr_renamed_4;

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
        cfr_renamed_4 = nArray;
        cfr_renamed_2 = BigInteger.valueOf(1L);
    }

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        this.cfr_renamed_3 = (sprsgk)arg0;
        sprybl.cfr_renamed_9170(new sprfdl(sprspo.cfr_renamed_9("WMzOxOqIJX|^w\fRI`k|B"), sprrkl.cfr_renamed_10167(arg0.cfr_renamed_3483()), arg0, spriil.cfr_renamed_91));
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
            vector.insertElementAt(vector5.elementAt(0), sprnqk.cfr_renamed_3510(arg1, vector.size() + 1));
            vector5.removeElementAt(0);
        }
        return vector;
    }

    private static /* synthetic */ BigInteger cfr_renamed_3507(int arg0, int arg1, SecureRandom arg2) {
        BigInteger bigInteger;
        BigInteger bigInteger2 = bigInteger = sprhdf.cfr_renamed_5236(arg0, arg1, arg2);
        while (bigInteger2.bitLength() != arg0) {
            bigInteger2 = sprhdf.cfr_renamed_5236(arg0, arg1, arg2);
        }
        return bigInteger;
    }

    private static /* synthetic */ Vector cfr_renamed_3508(int arg0) {
        int n;
        Vector<BigInteger> vector = new Vector<BigInteger>(arg0);
        int n2 = n = 0;
        while (n2 != arg0) {
            int n3 = cfr_renamed_4[n];
            vector.addElement(BigInteger.valueOf(n3));
            n2 = ++n;
        }
        return vector;
    }

    @Override
    public sprsil cfr_renamed_1223() {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4;
        BigInteger bigInteger5;
        int n;
        sprnqk sprnqk2 = this;
        int n2 = sprnqk2.cfr_renamed_3.cfr_renamed_3483();
        SecureRandom secureRandom = sprnqk2.cfr_renamed_3.cfr_renamed_1295();
        int n3 = sprnqk2.cfr_renamed_3.cfr_renamed_3341();
        boolean bl = sprnqk2.cfr_renamed_3.cfr_renamed_3350();
        if (bl) {
            System.out.println(new StringBuilder().insert(0, spruaz.cfr_renamed_9("i\u0014[\u0012G\u0018A\u0016\u000f\u0017F\u0003\\\u0005\u000f")).append(this.cfr_renamed_3.cfr_renamed_3349()).append(sprspo.cfr_renamed_9("9\\kEtIj\u0002")).toString());
        }
        Vector vector = sprnqk.cfr_renamed_3508(this.cfr_renamed_3.cfr_renamed_3349());
        vector = sprnqk.cfr_renamed_3509(vector, secureRandom);
        BigInteger bigInteger6 = cfr_renamed_2;
        BigInteger bigInteger7 = cfr_renamed_2;
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
        BigInteger bigInteger9 = sprnqk.cfr_renamed_3507(n6 / 2 + 1, n3, secureRandom);
        BigInteger bigInteger10 = sprnqk.cfr_renamed_3507(n6 / 2 + 1, n3, secureRandom);
        long l = 0L;
        if (bl) {
            System.out.println(spruaz.cfr_renamed_9("\u0016J\u001fJ\u0003N\u0005F\u001fHQ_QN\u001fKQ^"));
        }
        BigInteger bigInteger11 = bigInteger9.multiply(bigInteger6).shiftLeft(1);
        BigInteger bigInteger12 = bigInteger10.multiply(bigInteger7).shiftLeft(1);
        block2: while (true) {
            long l2 = l;
            while (true) {
                l = l2 + 1L;
                bigInteger5 = sprnqk.cfr_renamed_3507(24, n3, secureRandom);
                bigInteger4 = bigInteger5.multiply(bigInteger11).add(cfr_renamed_2);
                if (!bigInteger4.isProbablePrime(n3)) {
                    l2 = l;
                    continue;
                }
                while (bigInteger5.equals(bigInteger3 = sprnqk.cfr_renamed_3507(24, n3, secureRandom)) || !(bigInteger2 = bigInteger3.multiply(bigInteger12).add(cfr_renamed_2)).isProbablePrime(n3)) {
                }
                if (!bigInteger8.gcd(bigInteger5.multiply(bigInteger3)).equals(cfr_renamed_2)) {
                    l2 = l;
                    continue;
                }
                if (bigInteger4.multiply(bigInteger2).bitLength() >= n2) break block2;
                if (!bl) continue block2;
                System.out.println(new StringBuilder().insert(0, sprspo.cfr_renamed_9("rI`\fjEcI9XvC9_tMu@7\fJDvYuH9N|\f")).append(n2).append(spruaz.cfr_renamed_9("\u000f\u0013Z\u0005\u000f\u0018\\QN\u0012[\u0004N\u001dC\b\u000f")).append(bigInteger4.multiply(bigInteger2).bitLength()).toString());
                l2 = l;
            }
            break;
        }
        if (bl) {
            System.out.println(new StringBuilder().insert(0, sprspo.cfr_renamed_9("B|I}I}\f")).append(l).append(spruaz.cfr_renamed_9("\u000f\u0005]\u0018J\u0002\u000f\u0005@QH\u0014A\u0014]\u0010[\u0014\u000f\u0001\u000f\u0010A\u0015\u000f\u0000\u0001")).toString());
        }
        BigInteger bigInteger13 = bigInteger4;
        BigInteger bigInteger14 = bigInteger13.multiply(bigInteger2);
        BigInteger bigInteger15 = bigInteger13.subtract(cfr_renamed_2).multiply(bigInteger2.subtract(cfr_renamed_2));
        l = 0L;
        if (bl) {
            System.out.println(sprspo.cfr_renamed_9("~IwIkMmEwK9K"));
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
                        bigInteger = sprhdf.cfr_renamed_5236(n2, n3, secureRandom);
                        if (!bigInteger.modPow(bigInteger17, bigInteger14).equals(cfr_renamed_2)) break;
                        l3 = l;
                    }
                    vector2.addElement(bigInteger);
                    n10 = ++n9;
                }
                bigInteger = cfr_renamed_2;
                int n11 = n9 = 0;
                while (n11 < vector.size()) {
                    BigInteger bigInteger18 = bigInteger.multiply(((BigInteger)vector2.elementAt(n9)).modPow(bigInteger8.divide((BigInteger)vector.elementAt(n9)), bigInteger14));
                    bigInteger = bigInteger18.mod(bigInteger14);
                    n11 = ++n9;
                }
                n9 = 0;
                int n12 = n8 = 0;
                while (n12 < vector.size()) {
                    if (bigInteger.modPow(bigInteger15.divide((BigInteger)vector.elementAt(n8)), bigInteger14).equals(cfr_renamed_2)) {
                        if (bl) {
                            System.out.println(new StringBuilder().insert(0, spruaz.cfr_renamed_9("HQG\u0010\\Q@\u0003K\u0014]Q_\u0019FYAX\u0000")).append(vector.elementAt(n8)).append(sprspo.cfr_renamed_9("&9K#\f")).append(bigInteger).toString());
                        }
                        n7 = n9 = 1;
                        break block23;
                    }
                    n12 = ++n8;
                }
                n7 = n9;
            }
            if (n7 != 0) continue;
            if (bigInteger.modPow(bigInteger15.divide(BigInteger.valueOf(4L)), bigInteger14).equals(cfr_renamed_2)) {
                if (!bl) continue;
                System.out.println(new StringBuilder().insert(0, spruaz.cfr_renamed_9("\u0016\u000f\u0019N\u0002\u000f\u001e]\u0015J\u0003\u000f\u0001G\u0018\u0007\u001f\u0006^\u001b{\u000f\u0016\u0015")).append(bigInteger).toString());
                continue;
            }
            if (bigInteger.modPow(bigInteger15.divide(bigInteger5), bigInteger14).equals(cfr_renamed_2)) {
                if (!bl) continue;
                System.out.println(new StringBuilder().insert(0, sprspo.cfr_renamed_9("~\fqMj\fv^}Ik\fiDp\u0004w\u00056\\>&9K#\f")).append(bigInteger).toString());
                continue;
            }
            if (bigInteger.modPow(bigInteger15.divide(bigInteger3), bigInteger14).equals(cfr_renamed_2)) {
                if (!bl) continue;
                System.out.println(new StringBuilder().insert(0, spruaz.cfr_renamed_9("\u0016\u000f\u0019N\u0002\u000f\u001e]\u0015J\u0003\u000f\u0001G\u0018\u0007\u001f\u0006^^V%QHK\u000f")).append(bigInteger).toString());
                continue;
            }
            if (bigInteger.modPow(bigInteger15.divide(bigInteger9), bigInteger14).equals(cfr_renamed_2)) {
                if (!bl) continue;
                System.out.println(new StringBuilder().insert(0, sprspo.cfr_renamed_9("K9Dx_9CkH|^9\\qE1B0\u0003x&9K#\f")).append(bigInteger).toString());
                continue;
            }
            if (!bigInteger.modPow(bigInteger15.divide(bigInteger10), bigInteger14).equals(cfr_renamed_2)) break;
            if (!bl) continue;
            System.out.println(new StringBuilder().insert(0, spruaz.cfr_renamed_9("HQG\u0010\\Q@\u0003K\u0014]Q_\u0019FYAX\u0000\u0013%QHK\u000f")).append(bigInteger).toString());
        }
        if (bl) {
            System.out.println(new StringBuilder().insert(0, sprspo.cfr_renamed_9("B|I}I}\f")).append(l).append(spruaz.cfr_renamed_9("Q[\u0003F\u0014\\Q[\u001e\u000f\u0016J\u001fJ\u0003N\u0005JQH")).toString());
            System.out.println();
            System.out.println(sprspo.cfr_renamed_9("JvYwH9B|[9bxOzMzD|\u007fmIkB9Op\\qIk\foMkExNuIj\u0016"));
            System.out.println(new StringBuilder().insert(0, spruaz.cfr_renamed_9("\\\u001cN\u001dC!]\u0018B\u0014\\K\u000f")).append(vector).toString());
            System.out.println(new StringBuilder().insert(0, sprspo.cfr_renamed_9("_pKtM#\u00027\u00027\u00027\f")).append(bigInteger8).append(spruaz.cfr_renamed_9("Q\u0007")).append(bigInteger8.bitLength()).append(sprspo.cfr_renamed_9("9NpXj\u0005")).toString());
            System.out.println(new StringBuilder().insert(0, spruaz.cfr_renamed_9("NK\u0001_\u0001_\u0001_\u0001_\u0001_\u000f")).append(bigInteger9).toString());
            System.out.println(new StringBuilder().insert(0, sprspo.cfr_renamed_9("N#\u00027\u00027\u00027\u00027\u00027\f")).append(bigInteger10).toString());
            System.out.println(new StringBuilder().insert(0, spruaz.cfr_renamed_9("_V\u0015_\u0001_\u0001_\u0001_\u0001_\u000f")).append(bigInteger5).toString());
            System.out.println(new StringBuilder().insert(0, sprspo.cfr_renamed_9("]>\u00167\u00027\u00027\u00027\u00027\f")).append(bigInteger3).toString());
            System.out.println(new StringBuilder().insert(0, spruaz.cfr_renamed_9("_K\u0001_\u0001_\u0001_\u0001_\u0001_\u000f")).append(bigInteger4).toString());
            System.out.println(new StringBuilder().insert(0, sprspo.cfr_renamed_9("]#\u00027\u00027\u00027\u00027\u00027\f")).append(bigInteger2).toString());
            System.out.println(new StringBuilder().insert(0, spruaz.cfr_renamed_9("AK\u0001_\u0001_\u0001_\u0001_\u0001_\u000f")).append(bigInteger14).toString());
            System.out.println(new StringBuilder().insert(0, sprspo.cfr_renamed_9("\\qE1B0\u00167\u00027\u00027\f")).append(bigInteger15).toString());
            System.out.println(new StringBuilder().insert(0, spruaz.cfr_renamed_9("HK\u0001_\u0001_\u0001_\u0001_\u0001_\u000f")).append(bigInteger).toString());
            System.out.println();
        }
        return new sprsil(new sprnhk(false, bigInteger, bigInteger14, bigInteger8.bitLength()), new sprqlk(bigInteger, bigInteger14, bigInteger8.bitLength(), vector, bigInteger15));
    }
}

