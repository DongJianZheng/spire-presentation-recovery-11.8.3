/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprrlb;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

public class sprlpb
implements AlgorithmParameterSpec {
    private BigInteger cfr_renamed_0;
    private BigInteger cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private sprpib cfr_renamed_3;
    private sprrlb cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprlpb(sprpib sprpib2, sprrlb sprrlb2, BigInteger bigInteger, BigInteger bigInteger2, byte[] byArray) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprlpb sprlpb2 = this;
        sprlpb sprlpb3 = this;
        this.cfr_renamed_3 = arg0;
        sprlpb3.cfr_renamed_4 = arg1.cfr_renamed_1775();
        sprlpb3.cfr_renamed_1 = arg2;
        sprlpb2.cfr_renamed_0 = arg3;
        sprlpb2.cfr_renamed_2 = byArray;
    }

    public byte[] cfr_renamed_2113() {
        return this.cfr_renamed_2;
    }

    public sprrlb cfr_renamed_1145() {
        return this.cfr_renamed_4;
    }

    public sprpib cfr_renamed_1769() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprlpb(sprpib sprpib2, sprrlb sprrlb2, BigInteger bigInteger, BigInteger bigInteger2) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprlpb sprlpb2 = this;
        sprlpb sprlpb3 = this;
        this.cfr_renamed_3 = arg0;
        sprlpb3.cfr_renamed_4 = arg1.cfr_renamed_1775();
        sprlpb3.cfr_renamed_1 = arg2;
        sprlpb2.cfr_renamed_0 = arg3;
        sprlpb2.cfr_renamed_2 = null;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ 5 << 1;
        int cfr_ignored_0 = 4 << 4;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ 5 << 1;
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

    public BigInteger cfr_renamed_1146() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprlpb(sprpib sprpib2, sprrlb sprrlb2, BigInteger bigInteger) {
        void arg2;
        void arg1;
        void arg0;
        sprlpb sprlpb2 = this;
        sprlpb sprlpb3 = this;
        this.cfr_renamed_3 = arg0;
        sprlpb3.cfr_renamed_4 = arg1.cfr_renamed_1775();
        sprlpb3.cfr_renamed_1 = arg2;
        sprlpb2.cfr_renamed_0 = BigInteger.valueOf(1L);
        sprlpb2.cfr_renamed_2 = null;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprlpb)) {
            return false;
        }
        sprlpb sprlpb2 = (sprlpb)arg0;
        return this.cfr_renamed_1769().cfr_renamed_1931(sprlpb2.cfr_renamed_1769()) && this.cfr_renamed_1145().cfr_renamed_1962(sprlpb2.cfr_renamed_1145());
    }

    public BigInteger cfr_renamed_1153() {
        return this.cfr_renamed_0;
    }

    public int hashCode() {
        return this.cfr_renamed_1769().hashCode() ^ this.cfr_renamed_1145().hashCode();
    }
}

