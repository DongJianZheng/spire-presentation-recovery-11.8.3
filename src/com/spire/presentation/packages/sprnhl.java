/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfxd;
import com.spire.presentation.packages.sprkil;
import com.spire.presentation.packages.sprxnc;
import java.math.BigInteger;

public class sprnhl {
    private final BigInteger cfr_renamed_2;
    private final BigInteger cfr_renamed_3;
    private final BigInteger cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (2 << 2 ^ 1);
        int cfr_ignored_0 = 5 << 4 ^ (3 << 2 ^ 1);
        int n4 = n2;
        int n5 = 3 << 3;
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
    public sprnhl(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, boolean bl) {
        void arg2;
        void arg1;
        void arg0;
        sprkil.cfr_renamed_3930(bigInteger, "p");
        sprkil.cfr_renamed_3930(bigInteger2, sprfxd.cfr_renamed_9("h"));
        sprkil.cfr_renamed_3930(bigInteger3, "g");
        if (!bl) {
            if (!arg0.subtract(sprkil.cfr_renamed_3).mod((BigInteger)arg1).equals(sprkil.cfr_renamed_4)) {
                throw new IllegalArgumentException(sprxnc.cfr_renamed_9("1\u000ep\u0003,V2WaA$\u0003$U$M-ZaG(U(P(A-FaA8\u00030"));
            }
            if (arg2.compareTo(BigInteger.valueOf(2L)) == -1 || arg2.compareTo(arg0.subtract(sprkil.cfr_renamed_3)) == 1) {
                throw new IllegalArgumentException(sprfxd.cfr_renamed_9("~\u0017tBjC9U|\u0017pY9l+\u001b9G4\u0006D"));
            }
            if (!arg2.modPow((BigInteger)arg1, (BigInteger)arg0).equals(sprkil.cfr_renamed_3)) {
                throw new IllegalArgumentException(sprxnc.cfr_renamed_9("D\u001fRaN.GaSaN4P5\u0003$R4B-\u0003p"));
            }
            if (!arg0.isProbablePrime(20)) {
                throw new IllegalArgumentException(sprfxd.cfr_renamed_9("i\u0017tBjC9U|\u0017iEpZ|"));
            }
            if (!arg1.isProbablePrime(20)) {
                throw new IllegalArgumentException(sprxnc.cfr_renamed_9("0\u0003,V2WaA$\u00031Q(N$"));
            }
        }
        sprnhl sprnhl2 = this;
        sprnhl2.cfr_renamed_2 = arg0;
        sprnhl2.cfr_renamed_4 = arg1;
        this.cfr_renamed_3 = arg2;
    }

    public BigInteger cfr_renamed_1155() {
        return this.cfr_renamed_2;
    }

    public sprnhl(BigInteger arg0, BigInteger arg1, BigInteger arg2) {
        this(arg0, arg1, arg2, false);
    }

    public BigInteger cfr_renamed_1145() {
        return this.cfr_renamed_3;
    }

    public BigInteger cfr_renamed_1604() {
        return this.cfr_renamed_4;
    }
}

