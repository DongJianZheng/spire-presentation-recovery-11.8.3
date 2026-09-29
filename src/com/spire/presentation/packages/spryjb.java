/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdqb;
import com.spire.presentation.packages.sprexl;
import com.spire.presentation.packages.sprfob;
import com.spire.presentation.packages.sprigk;
import com.spire.presentation.packages.sprvjb;
import com.spire.presentation.packages.sprwtb;
import com.spire.presentation.packages.spryrb;
import com.spire.presentation.packages.sprzra;
import java.math.BigInteger;

public class spryjb
extends sprwtb {
    public static final BigInteger cfr_renamed_91 = sprvjb.cfr_renamed_4;
    public int[] cfr_renamed_4;

    @Override
    public boolean cfr_renamed_805() {
        return spryrb.cfr_renamed_1660(this.cfr_renamed_4);
    }

    @Override
    public sprwtb cfr_renamed_952() {
        int[] nArray = spryrb.cfr_renamed_1631();
        sprfob.cfr_renamed_1760(sprdqb.cfr_renamed_3, this.cfr_renamed_4, nArray);
        return new spryjb(nArray);
    }

    /*
     * WARNING - void declaration
     */
    public spryjb(BigInteger bigInteger) {
        void arg0;
        if (bigInteger == null || arg0.signum() < 0 || arg0.compareTo(cfr_renamed_91) >= 0) {
            throw new IllegalArgumentException(sprigk.cfr_renamed_9("\u0004?\n~\u0010j\u0019?\u0015q\n~\u0010v\u0018?\u001ap\u000e?/z\u001fON*JMMY\u0015z\u0010{9s\u0019r\u0019q\b"));
        }
        this.cfr_renamed_4 = sprdqb.cfr_renamed_1652((BigInteger)arg0);
    }

    @Override
    public sprwtb cfr_renamed_1773() {
        int[] nArray = spryrb.cfr_renamed_1631();
        sprdqb.cfr_renamed_2027(this.cfr_renamed_4, nArray);
        return new spryjb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_1817() {
        int[] nArray = this.cfr_renamed_4;
        if (spryrb.cfr_renamed_1660(this.cfr_renamed_4) || spryrb.cfr_renamed_1659(nArray)) {
            return this;
        }
        int[] nArray2 = spryrb.cfr_renamed_1631();
        int[] nArray3 = spryrb.cfr_renamed_1631();
        sprdqb.cfr_renamed_1627(nArray, nArray2);
        int[] nArray4 = nArray2;
        int[] nArray5 = nArray2;
        int[] nArray6 = nArray2;
        int[] nArray7 = nArray2;
        sprdqb.cfr_renamed_2022(nArray2, nArray, nArray2);
        sprdqb.cfr_renamed_2026(nArray7, 2, nArray3);
        sprdqb.cfr_renamed_2022(nArray3, nArray2, nArray3);
        sprdqb.cfr_renamed_2026(nArray3, 4, nArray2);
        sprdqb.cfr_renamed_2022(nArray7, nArray3, nArray2);
        sprdqb.cfr_renamed_2026(nArray6, 8, nArray3);
        sprdqb.cfr_renamed_2022(nArray3, nArray2, nArray3);
        sprdqb.cfr_renamed_2026(nArray3, 16, nArray2);
        sprdqb.cfr_renamed_2022(nArray6, nArray3, nArray2);
        sprdqb.cfr_renamed_2026(nArray5, 32, nArray2);
        sprdqb.cfr_renamed_2022(nArray5, nArray, nArray2);
        sprdqb.cfr_renamed_2026(nArray4, 96, nArray2);
        sprdqb.cfr_renamed_2022(nArray4, nArray, nArray2);
        sprdqb.cfr_renamed_2026(nArray2, 94, nArray2);
        sprdqb.cfr_renamed_1627(nArray2, nArray3);
        if (spryrb.cfr_renamed_1648(nArray, nArray3)) {
            return new spryjb(nArray2);
        }
        return null;
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof spryjb)) {
            return false;
        }
        spryjb spryjb2 = (spryjb)arg0;
        return spryrb.cfr_renamed_1648(this.cfr_renamed_4, spryjb2.cfr_renamed_4);
    }

    @Override
    public boolean cfr_renamed_287() {
        return spryrb.cfr_renamed_1659(this.cfr_renamed_4);
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_91.bitLength();
    }

    @Override
    public BigInteger cfr_renamed_1779() {
        return spryrb.cfr_renamed_1651(this.cfr_renamed_4);
    }

    @Override
    public sprwtb cfr_renamed_1908() {
        int[] nArray = spryrb.cfr_renamed_1631();
        sprdqb.cfr_renamed_2025(this.cfr_renamed_4, nArray);
        return new spryjb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_1984(sprwtb arg0) {
        int[] nArray = spryrb.cfr_renamed_1631();
        sprfob.cfr_renamed_1760(sprdqb.cfr_renamed_3, ((spryjb)arg0).cfr_renamed_4, nArray);
        sprdqb.cfr_renamed_2022(nArray, this.cfr_renamed_4, nArray);
        return new spryjb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_1986(sprwtb arg0) {
        int[] nArray = spryrb.cfr_renamed_1631();
        sprdqb.cfr_renamed_2021(this.cfr_renamed_4, ((spryjb)arg0).cfr_renamed_4, nArray);
        return new spryjb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_1983(sprwtb arg0) {
        int[] nArray = spryrb.cfr_renamed_1631();
        sprdqb.cfr_renamed_1654(this.cfr_renamed_4, ((spryjb)arg0).cfr_renamed_4, nArray);
        return new spryjb(nArray);
    }

    public spryjb(int[] nArray) {
        this.cfr_renamed_4 = nArray;
    }

    @Override
    public sprwtb cfr_renamed_1048() {
        int[] nArray = spryrb.cfr_renamed_1631();
        sprdqb.cfr_renamed_1627(this.cfr_renamed_4, nArray);
        return new spryjb(nArray);
    }

    @Override
    public String cfr_renamed_1985() {
        return sprexl.cfr_renamed_9("AKq~ \u001b$|#h{K~J");
    }

    @Override
    public sprwtb cfr_renamed_1833(sprwtb arg0) {
        int[] nArray = spryrb.cfr_renamed_1631();
        sprdqb.cfr_renamed_2022(this.cfr_renamed_4, ((spryjb)arg0).cfr_renamed_4, nArray);
        return new spryjb(nArray);
    }

    public spryjb() {
        this.cfr_renamed_4 = spryrb.cfr_renamed_1631();
    }

    @Override
    public boolean cfr_renamed_1930() {
        return spryrb.cfr_renamed_1662(this.cfr_renamed_4, 0) == 1;
    }

    public int hashCode() {
        return cfr_renamed_91.hashCode() ^ sprzra.cfr_renamed_536(this.cfr_renamed_4, 0, 8);
    }
}

