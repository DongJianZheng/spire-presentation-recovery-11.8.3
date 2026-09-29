/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprktb;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprunb;
import java.math.BigInteger;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

public class sprmjb
extends ECParameterSpec {
    private String cfr_renamed_4;

    private static /* synthetic */ EllipticCurve cfr_renamed_2114(sprpib arg0, byte[] arg1) {
        if (sprunb.cfr_renamed_1838(arg0)) {
            return new EllipticCurve(new ECFieldFp(arg0.cfr_renamed_845().cfr_renamed_1762()), arg0.cfr_renamed_1778().cfr_renamed_1779(), arg0.cfr_renamed_1997().cfr_renamed_1779(), arg1);
        }
        sprktb sprktb2 = (sprktb)arg0;
        if (sprktb2.cfr_renamed_1024()) {
            int[] nArray = new int[1];
            nArray[0] = sprktb2.cfr_renamed_2115();
            int[] nArray2 = nArray;
            return new EllipticCurve(new ECFieldF2m(sprktb2.cfr_renamed_1186(), nArray2), arg0.cfr_renamed_1778().cfr_renamed_1779(), arg0.cfr_renamed_1997().cfr_renamed_1779(), arg1);
        }
        int[] nArray = new int[3];
        nArray[0] = sprktb2.cfr_renamed_2116();
        nArray[1] = sprktb2.cfr_renamed_2117();
        nArray[2] = sprktb2.cfr_renamed_2115();
        int[] nArray3 = nArray;
        return new EllipticCurve(new ECFieldF2m(sprktb2.cfr_renamed_1186(), nArray3), arg0.cfr_renamed_1778().cfr_renamed_1779(), arg0.cfr_renamed_1997().cfr_renamed_1779(), arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprmjb(String string, sprpib sprpib2, sprrlb sprrlb2, BigInteger bigInteger, BigInteger bigInteger2) {
        super(sprmjb.cfr_renamed_2114((sprpib)arg1, null), sprmjb.cfr_renamed_2118((sprrlb)arg2), (BigInteger)arg3, arg4.intValue());
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        this.cfr_renamed_4 = string;
    }

    /*
     * WARNING - void declaration
     */
    public sprmjb(String string, sprpib sprpib2, sprrlb sprrlb2, BigInteger bigInteger) {
        super(sprmjb.cfr_renamed_2114((sprpib)arg1, null), sprmjb.cfr_renamed_2118((sprrlb)arg2), (BigInteger)arg3, 1);
        void arg3;
        void arg2;
        void arg1;
        this.cfr_renamed_4 = string;
    }

    private static /* synthetic */ ECPoint cfr_renamed_2118(sprrlb arg0) {
        arg0 = arg0.cfr_renamed_1775();
        return new ECPoint(arg0.cfr_renamed_1969().cfr_renamed_1779(), arg0.cfr_renamed_1973().cfr_renamed_1779());
    }

    /*
     * WARNING - void declaration
     */
    public sprmjb(String string, EllipticCurve ellipticCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
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
    public sprmjb(String string, sprpib sprpib2, sprrlb sprrlb2, BigInteger bigInteger, BigInteger bigInteger2, byte[] byArray) {
        super(sprmjb.cfr_renamed_2114((sprpib)arg1, (byte[])arg5), sprmjb.cfr_renamed_2118((sprrlb)arg2), (BigInteger)arg3, arg4.intValue());
        void arg4;
        void arg3;
        void arg2;
        void arg5;
        void arg1;
        this.cfr_renamed_4 = string;
    }

    public String cfr_renamed_313() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprmjb(String string, EllipticCurve ellipticCurve, ECPoint eCPoint, BigInteger bigInteger) {
        super((EllipticCurve)arg1, (ECPoint)arg2, (BigInteger)arg3, 1);
        void arg3;
        void arg2;
        void arg1;
        this.cfr_renamed_4 = string;
    }
}

