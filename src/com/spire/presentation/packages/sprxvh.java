/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprik;
import com.spire.presentation.packages.sprjd;
import com.spire.presentation.packages.sprmvh;
import com.spire.presentation.packages.sprnlj;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprsk;
import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

public class sprxvh
extends ECParameterSpec {
    private String cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprxvh(String string, EllipticCurve ellipticCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        super((EllipticCurve)arg1, (ECPoint)arg2, (BigInteger)arg3, arg4.intValue());
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        this.cfr_renamed_4 = string;
    }

    /*
     * WARNING - void declaration
     */
    public sprxvh(String string, sprgxh sprgxh2, spreuh spreuh2, BigInteger bigInteger, BigInteger bigInteger2, byte[] byArray) {
        super(sprxvh.cfr_renamed_9052((sprgxh)arg1, (byte[])arg5), sprnlj.cfr_renamed_9053((spreuh)arg2), (BigInteger)arg3, arg4.intValue());
        void arg4;
        void arg3;
        void arg2;
        void arg5;
        void arg1;
        this.cfr_renamed_4 = string;
    }

    private static /* synthetic */ ECField cfr_renamed_9054(sprjd arg0) {
        if (sprmvh.cfr_renamed_8949(arg0)) {
            return new ECFieldFp(arg0.cfr_renamed_1762());
        }
        sprsk sprsk2 = ((sprik)arg0).cfr_renamed_1764();
        int[] nArray = sprsk2.cfr_renamed_1765();
        int[] nArray2 = sproze.cfr_renamed_5240(sproze.cfr_renamed_531(nArray, 1, nArray.length - 1));
        return new ECFieldF2m(sprsk2.cfr_renamed_813(), nArray2);
    }

    /*
     * WARNING - void declaration
     */
    public sprxvh(String string, EllipticCurve ellipticCurve, ECPoint eCPoint, BigInteger bigInteger) {
        super((EllipticCurve)arg1, (ECPoint)arg2, (BigInteger)arg3, 1);
        void arg3;
        void arg2;
        void arg1;
        this.cfr_renamed_4 = string;
    }

    private static /* synthetic */ EllipticCurve cfr_renamed_9052(sprgxh arg0, byte[] arg1) {
        sprgxh sprgxh2 = arg0;
        ECField eCField = sprxvh.cfr_renamed_9054(sprgxh2.cfr_renamed_845());
        BigInteger bigInteger = sprgxh2.cfr_renamed_1778().cfr_renamed_1779();
        BigInteger bigInteger2 = sprgxh2.cfr_renamed_1997().cfr_renamed_1779();
        return new EllipticCurve(eCField, bigInteger, bigInteger2, arg1);
    }

    public String cfr_renamed_313() {
        return this.cfr_renamed_4;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3;
        int cfr_ignored_0 = 5 << 3 ^ 2;
        int n4 = n2;
        int n5 = 2 << 3 ^ 3;
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
    public sprxvh(String string, sprgxh sprgxh2, spreuh spreuh2, BigInteger bigInteger) {
        super(sprxvh.cfr_renamed_9052((sprgxh)arg1, null), sprnlj.cfr_renamed_9053((spreuh)arg2), (BigInteger)arg3, 1);
        void arg3;
        void arg2;
        void arg1;
        this.cfr_renamed_4 = string;
    }

    /*
     * WARNING - void declaration
     */
    public sprxvh(String string, sprgxh sprgxh2, spreuh spreuh2, BigInteger bigInteger, BigInteger bigInteger2) {
        super(sprxvh.cfr_renamed_9052((sprgxh)arg1, null), sprnlj.cfr_renamed_9053((spreuh)arg2), (BigInteger)arg3, arg4.intValue());
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        this.cfr_renamed_4 = string;
    }
}

