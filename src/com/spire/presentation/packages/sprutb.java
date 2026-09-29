/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdkb;
import com.spire.presentation.packages.sprfpb;
import com.spire.presentation.packages.sprktb;
import com.spire.presentation.packages.sprmqb;
import com.spire.presentation.packages.sprqtb;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprsqb;
import com.spire.presentation.packages.sprtb;
import com.spire.presentation.packages.sprxgi;
import java.math.BigInteger;

public class sprutb
extends sprmqb {
    public static final String cfr_renamed_4 = "bc_wtnaf";

    @Override
    public sprrlb cfr_renamed_1768(sprrlb arg0, BigInteger arg1) {
        if (!(arg0 instanceof sprdkb)) {
            throw new IllegalArgumentException(sprxgi.cfr_renamed_9("fVEA\t}jhFQGL\u0007~\u001bU\t[HV\tZL\u0018\\KL\\\tQG\u0018~lHMgYOu\\T]QYT@]["));
        }
        sprdkb sprdkb2 = (sprdkb)arg0;
        sprktb sprktb2 = (sprktb)sprdkb2.cfr_renamed_1769();
        int n = sprktb2.cfr_renamed_1186();
        byte by = sprktb2.cfr_renamed_1778().cfr_renamed_1779().byteValue();
        byte by2 = sprktb2.cfr_renamed_1780();
        BigInteger[] bigIntegerArray = sprktb2.cfr_renamed_1781();
        sprfpb sprfpb2 = sprqtb.cfr_renamed_1782(arg1, n, by, bigIntegerArray, by2, (byte)10);
        sprdkb sprdkb3 = sprdkb2;
        return this.cfr_renamed_1783(sprdkb3, sprfpb2, sprktb2.cfr_renamed_1784(sprdkb3, cfr_renamed_4), by, by2);
    }

    private /* synthetic */ sprdkb cfr_renamed_1783(sprdkb arg0, sprfpb arg1, sprtb arg2, byte arg3, byte arg4) {
        sprfpb[] sprfpbArray = arg3 == 0 ? sprqtb.cfr_renamed_4 : sprqtb.cfr_renamed_0;
        BigInteger bigInteger = sprqtb.cfr_renamed_1785(arg4, 4);
        byte[] byArray = sprqtb.cfr_renamed_1786(arg4, arg1, (byte)4, BigInteger.valueOf(16L), bigInteger, sprfpbArray);
        return sprutb.cfr_renamed_1787(arg0, byArray, arg2);
    }

    private static /* synthetic */ sprdkb cfr_renamed_1787(sprdkb arg0, byte[] arg1, sprtb arg2) {
        int n;
        Object object;
        sprdkb[] sprdkbArray;
        sprdkb sprdkb2;
        sprktb sprktb2 = (sprktb)arg0.cfr_renamed_1769();
        byte by = sprktb2.cfr_renamed_1778().cfr_renamed_1779().byteValue();
        if (arg2 == null || !(arg2 instanceof sprsqb)) {
            sprdkb sprdkb3 = arg0;
            sprdkb2 = sprdkb3;
            sprdkbArray = sprqtb.cfr_renamed_1788(sprdkb3, by);
            object = new sprsqb();
            ((sprsqb)object).cfr_renamed_1776(sprdkbArray);
            sprktb2.cfr_renamed_1789(arg0, cfr_renamed_4, (sprtb)object);
        } else {
            sprdkbArray = ((sprsqb)arg2).cfr_renamed_1777();
            sprdkb2 = arg0;
        }
        object = (sprdkb)sprdkb2.cfr_renamed_1769().cfr_renamed_1770();
        int n2 = n = arg1.length - 1;
        while (n2 >= 0) {
            object = sprqtb.cfr_renamed_1790((sprdkb)object);
            byte by2 = arg1[n];
            if (by2 != 0) {
                object = by2 > 0 ? ((sprdkb)object).cfr_renamed_1791(sprdkbArray[by2]) : ((sprdkb)object).cfr_renamed_1792(sprdkbArray[-by2]);
            }
            n2 = --n;
        }
        return object;
    }
}

