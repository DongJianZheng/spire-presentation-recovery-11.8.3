/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmis;
import com.spire.presentation.packages.sprpzz;
import com.spire.presentation.packages.spryld;
import java.math.BigInteger;

public class sprgjd {
    private final BigInteger cfr_renamed_2;
    private final BigInteger cfr_renamed_3;
    private final BigInteger cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 3 ^ 4;
        int cfr_ignored_0 = 4 << 3 ^ 5;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ 3;
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

    /*
     * WARNING - void declaration
     */
    public sprgjd(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, boolean bl) {
        void arg2;
        void arg1;
        void arg0;
        spryld.cfr_renamed_3930(bigInteger, "p");
        spryld.cfr_renamed_3930(bigInteger2, sprmis.cfr_renamed_9("-"));
        spryld.cfr_renamed_3930(bigInteger3, "g");
        if (!bl) {
            if (!arg0.subtract(spryld.cfr_renamed_4).mod((BigInteger)arg1).equals(spryld.cfr_renamed_3)) {
                throw new IllegalArgumentException(sprpzz.cfr_renamed_9("Dp\u0005}Y(G)\u0014?Q}Q+Q3X$\u00149]+].]?X8\u0014?M}E"));
            }
            if (arg2.compareTo(BigInteger.valueOf(2L)) == -1 || arg2.compareTo(arg0.subtract(spryld.cfr_renamed_4)) == 1) {
                throw new IllegalArgumentException(sprmis.cfr_renamed_9(";H1\u001d/\u001c|\n9H5\u0006|3nD|\u0018qY\u0001"));
            }
            if (!arg2.modPow((BigInteger)arg1, (BigInteger)arg0).equals(spryld.cfr_renamed_4)) {
                throw new IllegalArgumentException(sprpzz.cfr_renamed_9(":j,\u00140[9\u0014-\u00140A.@}Q,A<X}\u0005"));
            }
            if (!arg0.isProbablePrime(20)) {
                throw new IllegalArgumentException(sprmis.cfr_renamed_9(",H1\u001d/\u001c|\n9H,\u001a5\u00059"));
            }
            if (!arg1.isProbablePrime(20)) {
                throw new IllegalArgumentException(sprpzz.cfr_renamed_9("E}Y(G)\u0014?Q}D/]0Q"));
            }
        }
        sprgjd sprgjd2 = this;
        sprgjd2.cfr_renamed_4 = arg0;
        sprgjd2.cfr_renamed_2 = arg1;
        this.cfr_renamed_3 = arg2;
    }

    public sprgjd(BigInteger arg0, BigInteger arg1, BigInteger arg2) {
        this(arg0, arg1, arg2, false);
    }

    public BigInteger cfr_renamed_1145() {
        return this.cfr_renamed_3;
    }

    public BigInteger cfr_renamed_1604() {
        return this.cfr_renamed_2;
    }

    public BigInteger cfr_renamed_1155() {
        return this.cfr_renamed_4;
    }
}

