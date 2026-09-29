/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfob;
import com.spire.presentation.packages.sprglb;
import com.spire.presentation.packages.sprnlb;
import com.spire.presentation.packages.sprrpb;
import com.spire.presentation.packages.sprsmaa;
import com.spire.presentation.packages.sprvan;
import com.spire.presentation.packages.sprwtb;
import com.spire.presentation.packages.sprzra;
import java.math.BigInteger;

public class sprssb
extends sprwtb {
    public static final BigInteger cfr_renamed_91 = sprglb.cfr_renamed_0;
    public int[] cfr_renamed_4;

    @Override
    public sprwtb cfr_renamed_1908() {
        int[] nArray = sprrpb.cfr_renamed_1716(12);
        sprnlb.cfr_renamed_2025(this.cfr_renamed_4, nArray);
        return new sprssb(nArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprssb(BigInteger bigInteger) {
        void arg0;
        if (bigInteger == null || arg0.signum() < 0 || arg0.compareTo(cfr_renamed_91) >= 0) {
            throw new IllegalArgumentException(sprsmaa.cfr_renamed_9("\u000bk\u0005*\u001f>\u0016k\u001a%\u0005*\u001f\"\u0017k\u0015$\u0001k .\u0010\u001b@sG\u0019B\r\u001a.\u001f/6'\u0016&\u0016%\u0007"));
        }
        this.cfr_renamed_4 = sprnlb.cfr_renamed_1652((BigInteger)arg0);
    }

    @Override
    public sprwtb cfr_renamed_1773() {
        int[] nArray = sprrpb.cfr_renamed_1716(12);
        sprnlb.cfr_renamed_2027(this.cfr_renamed_4, nArray);
        return new sprssb(nArray);
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_91.bitLength();
    }

    @Override
    public sprwtb cfr_renamed_1833(sprwtb arg0) {
        int[] nArray = sprrpb.cfr_renamed_1716(12);
        sprnlb.cfr_renamed_2022(this.cfr_renamed_4, ((sprssb)arg0).cfr_renamed_4, nArray);
        return new sprssb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_952() {
        int[] nArray = sprrpb.cfr_renamed_1716(12);
        sprfob.cfr_renamed_1760(sprnlb.cfr_renamed_0, this.cfr_renamed_4, nArray);
        return new sprssb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_1048() {
        int[] nArray = sprrpb.cfr_renamed_1716(12);
        sprnlb.cfr_renamed_1627(this.cfr_renamed_4, nArray);
        return new sprssb(nArray);
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprssb)) {
            return false;
        }
        sprssb sprssb2 = (sprssb)arg0;
        return sprrpb.cfr_renamed_1743(12, this.cfr_renamed_4, sprssb2.cfr_renamed_4);
    }

    @Override
    public boolean cfr_renamed_805() {
        return sprrpb.cfr_renamed_1737(12, this.cfr_renamed_4);
    }

    @Override
    public sprwtb cfr_renamed_1817() {
        int[] nArray = this.cfr_renamed_4;
        if (sprrpb.cfr_renamed_1737(12, nArray) || sprrpb.cfr_renamed_1710(12, nArray)) {
            return this;
        }
        int[] nArray2 = sprrpb.cfr_renamed_1716(12);
        int[] nArray3 = sprrpb.cfr_renamed_1716(12);
        int[] nArray4 = sprrpb.cfr_renamed_1716(12);
        int[] nArray5 = sprrpb.cfr_renamed_1716(12);
        sprnlb.cfr_renamed_1627(nArray, nArray2);
        sprnlb.cfr_renamed_2022(nArray2, nArray, nArray2);
        sprnlb.cfr_renamed_2026(nArray2, 2, nArray3);
        int[] nArray6 = nArray3;
        int[] nArray7 = nArray3;
        sprnlb.cfr_renamed_2022(nArray7, nArray2, nArray3);
        sprnlb.cfr_renamed_1627(nArray3, nArray3);
        sprnlb.cfr_renamed_2022(nArray6, nArray, nArray7);
        sprnlb.cfr_renamed_2026(nArray6, 5, nArray4);
        sprnlb.cfr_renamed_2022(nArray4, nArray3, nArray4);
        sprnlb.cfr_renamed_2026(nArray4, 5, nArray5);
        sprnlb.cfr_renamed_2022(nArray5, nArray3, nArray5);
        sprnlb.cfr_renamed_2026(nArray5, 15, nArray3);
        sprnlb.cfr_renamed_2022(nArray3, nArray5, nArray3);
        sprnlb.cfr_renamed_2026(nArray3, 2, nArray4);
        sprnlb.cfr_renamed_2022(nArray2, nArray4, nArray2);
        int[] nArray8 = nArray4;
        sprnlb.cfr_renamed_2026(nArray4, 28, nArray8);
        sprnlb.cfr_renamed_2022(nArray3, nArray4, nArray3);
        sprnlb.cfr_renamed_2026(nArray3, 60, nArray4);
        sprnlb.cfr_renamed_2022(nArray4, nArray3, nArray8);
        int[] nArray9 = nArray3;
        sprnlb.cfr_renamed_2026(nArray4, 120, nArray9);
        int[] nArray10 = nArray9;
        int[] nArray11 = nArray9;
        int[] nArray12 = nArray9;
        sprnlb.cfr_renamed_2022(nArray12, nArray4, nArray9);
        sprnlb.cfr_renamed_2026(nArray9, 15, nArray9);
        sprnlb.cfr_renamed_2022(nArray11, nArray5, nArray12);
        sprnlb.cfr_renamed_2026(nArray9, 33, nArray9);
        sprnlb.cfr_renamed_2022(nArray10, nArray2, nArray11);
        sprnlb.cfr_renamed_2026(nArray9, 64, nArray9);
        sprnlb.cfr_renamed_2022(nArray9, nArray, nArray10);
        sprnlb.cfr_renamed_2026(nArray9, 30, nArray2);
        sprnlb.cfr_renamed_1627(nArray2, nArray3);
        if (sprrpb.cfr_renamed_1743(12, nArray, nArray3)) {
            return new sprssb(nArray2);
        }
        return null;
    }

    @Override
    public sprwtb cfr_renamed_1984(sprwtb arg0) {
        int[] nArray = sprrpb.cfr_renamed_1716(12);
        sprfob.cfr_renamed_1760(sprnlb.cfr_renamed_0, ((sprssb)arg0).cfr_renamed_4, nArray);
        sprnlb.cfr_renamed_2022(nArray, this.cfr_renamed_4, nArray);
        return new sprssb(nArray);
    }

    @Override
    public boolean cfr_renamed_1930() {
        return sprrpb.cfr_renamed_1662(this.cfr_renamed_4, 0) == 1;
    }

    public sprssb() {
        this.cfr_renamed_4 = sprrpb.cfr_renamed_1716(12);
    }

    public sprssb(int[] nArray) {
        this.cfr_renamed_4 = nArray;
    }

    @Override
    public boolean cfr_renamed_287() {
        return sprrpb.cfr_renamed_1710(12, this.cfr_renamed_4);
    }

    public int hashCode() {
        return cfr_renamed_91.hashCode() ^ sprzra.cfr_renamed_536(this.cfr_renamed_4, 0, 12);
    }

    @Override
    public String cfr_renamed_1985() {
        return sprvan.cfr_renamed_9("md]Q\r9\nS\u000fGWdRe");
    }

    @Override
    public BigInteger cfr_renamed_1779() {
        return sprrpb.cfr_renamed_1704(12, this.cfr_renamed_4);
    }

    @Override
    public sprwtb cfr_renamed_1983(sprwtb arg0) {
        int[] nArray = sprrpb.cfr_renamed_1716(12);
        sprnlb.cfr_renamed_1654(this.cfr_renamed_4, ((sprssb)arg0).cfr_renamed_4, nArray);
        return new sprssb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_1986(sprwtb arg0) {
        int[] nArray = sprrpb.cfr_renamed_1716(12);
        sprnlb.cfr_renamed_2021(this.cfr_renamed_4, ((sprssb)arg0).cfr_renamed_4, nArray);
        return new sprssb(nArray);
    }
}

