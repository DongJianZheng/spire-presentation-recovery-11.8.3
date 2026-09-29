/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbtaa;
import com.spire.presentation.packages.sprdtb;
import com.spire.presentation.packages.sprfob;
import com.spire.presentation.packages.sprhmaa;
import com.spire.presentation.packages.sprqlb;
import com.spire.presentation.packages.sprrmb;
import com.spire.presentation.packages.sprwtb;
import com.spire.presentation.packages.sprzra;
import java.math.BigInteger;

public class sprskb
extends sprwtb {
    public int[] cfr_renamed_119;
    public static final BigInteger cfr_renamed_91 = sprdtb.cfr_renamed_0;

    @Override
    public sprwtb cfr_renamed_1984(sprwtb arg0) {
        int[] nArray = sprqlb.cfr_renamed_1631();
        sprfob.cfr_renamed_1760(sprrmb.cfr_renamed_0, ((sprskb)arg0).cfr_renamed_119, nArray);
        sprrmb.cfr_renamed_2022(nArray, this.cfr_renamed_119, nArray);
        return new sprskb(nArray);
    }

    public sprskb(int[] nArray) {
        this.cfr_renamed_119 = nArray;
    }

    @Override
    public BigInteger cfr_renamed_1779() {
        return sprqlb.cfr_renamed_1651(this.cfr_renamed_119);
    }

    @Override
    public boolean cfr_renamed_287() {
        return sprqlb.cfr_renamed_1659(this.cfr_renamed_119);
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprskb)) {
            return false;
        }
        sprskb sprskb2 = (sprskb)arg0;
        return sprqlb.cfr_renamed_1648(this.cfr_renamed_119, sprskb2.cfr_renamed_119);
    }

    /*
     * WARNING - void declaration
     */
    public sprskb(BigInteger bigInteger) {
        void arg0;
        if (bigInteger == null || arg0.signum() < 0 || arg0.compareTo(cfr_renamed_91) >= 0) {
            throw new IllegalArgumentException(sprbtaa.cfr_renamed_9("zht)n=ghk&t)n!fhd'phQ-a\u00183q0\u00033\u000ek-n,G$g%g&v"));
        }
        this.cfr_renamed_119 = sprrmb.cfr_renamed_1652((BigInteger)arg0);
    }

    @Override
    public sprwtb cfr_renamed_1817() {
        int[] nArray;
        int[] nArray2 = this.cfr_renamed_119;
        if (sprqlb.cfr_renamed_1660(this.cfr_renamed_119) || sprqlb.cfr_renamed_1659(nArray2)) {
            return this;
        }
        int[] nArray3 = sprqlb.cfr_renamed_1631();
        sprrmb.cfr_renamed_1627(nArray2, nArray3);
        sprrmb.cfr_renamed_2022(nArray3, nArray2, nArray3);
        int[] nArray4 = sprqlb.cfr_renamed_1631();
        sprrmb.cfr_renamed_1627(nArray3, nArray4);
        int[] nArray5 = nArray4;
        sprrmb.cfr_renamed_2022(nArray4, nArray2, nArray5);
        int[] nArray6 = sprqlb.cfr_renamed_1631();
        sprrmb.cfr_renamed_2026(nArray5, 3, nArray6);
        sprrmb.cfr_renamed_2022(nArray6, nArray4, nArray6);
        int[] nArray7 = nArray6;
        sprrmb.cfr_renamed_2026(nArray6, 2, nArray7);
        sprrmb.cfr_renamed_2022(nArray7, nArray3, nArray7);
        int[] nArray8 = nArray3;
        int[] nArray9 = nArray7;
        sprrmb.cfr_renamed_2026(nArray9, 8, nArray8);
        sprrmb.cfr_renamed_2022(nArray3, nArray7, nArray8);
        int[] nArray10 = nArray9;
        sprrmb.cfr_renamed_2026(nArray8, 3, nArray10);
        sprrmb.cfr_renamed_2022(nArray9, nArray4, nArray10);
        int[] nArray11 = sprqlb.cfr_renamed_1631();
        sprrmb.cfr_renamed_2026(nArray9, 16, nArray11);
        sprrmb.cfr_renamed_2022(nArray11, nArray8, nArray11);
        int[] nArray12 = nArray8;
        int[] nArray13 = nArray11;
        sprrmb.cfr_renamed_2026(nArray13, 35, nArray12);
        sprrmb.cfr_renamed_2022(nArray12, nArray11, nArray12);
        int[] nArray14 = nArray13;
        int[] nArray15 = nArray12;
        sprrmb.cfr_renamed_2026(nArray15, 70, nArray14);
        sprrmb.cfr_renamed_2022(nArray13, nArray12, nArray14);
        int[] nArray16 = nArray15;
        sprrmb.cfr_renamed_2026(nArray14, 19, nArray16);
        sprrmb.cfr_renamed_2022(nArray16, nArray10, nArray16);
        int[] nArray17 = nArray = nArray16;
        int[] nArray18 = nArray;
        int[] nArray19 = nArray;
        int[] nArray20 = nArray;
        sprrmb.cfr_renamed_2026(nArray20, 20, nArray);
        sprrmb.cfr_renamed_2022(nArray20, nArray10, nArray);
        sprrmb.cfr_renamed_2026(nArray19, 4, nArray);
        sprrmb.cfr_renamed_2022(nArray19, nArray4, nArray);
        sprrmb.cfr_renamed_2026(nArray18, 6, nArray);
        sprrmb.cfr_renamed_2022(nArray18, nArray4, nArray);
        sprrmb.cfr_renamed_1627(nArray, nArray17);
        int[] nArray21 = nArray4;
        sprrmb.cfr_renamed_1627(nArray17, nArray21);
        if (sprqlb.cfr_renamed_1648(nArray2, nArray21)) {
            return new sprskb(nArray);
        }
        return null;
    }

    @Override
    public sprwtb cfr_renamed_1833(sprwtb arg0) {
        int[] nArray = sprqlb.cfr_renamed_1631();
        sprrmb.cfr_renamed_2022(this.cfr_renamed_119, ((sprskb)arg0).cfr_renamed_119, nArray);
        return new sprskb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_1983(sprwtb arg0) {
        int[] nArray = sprqlb.cfr_renamed_1631();
        sprrmb.cfr_renamed_1654(this.cfr_renamed_119, ((sprskb)arg0).cfr_renamed_119, nArray);
        return new sprskb(nArray);
    }

    @Override
    public String cfr_renamed_1985() {
        return sprhmaa.cfr_renamed_9("L]|h.\u0001-s.~v]s\\");
    }

    @Override
    public sprwtb cfr_renamed_1986(sprwtb arg0) {
        int[] nArray = sprqlb.cfr_renamed_1631();
        sprrmb.cfr_renamed_2021(this.cfr_renamed_119, ((sprskb)arg0).cfr_renamed_119, nArray);
        return new sprskb(nArray);
    }

    @Override
    public boolean cfr_renamed_1930() {
        return sprqlb.cfr_renamed_1662(this.cfr_renamed_119, 0) == 1;
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_91.bitLength();
    }

    public int hashCode() {
        return cfr_renamed_91.hashCode() ^ sprzra.cfr_renamed_536(this.cfr_renamed_119, 0, 6);
    }

    @Override
    public sprwtb cfr_renamed_1908() {
        int[] nArray = sprqlb.cfr_renamed_1631();
        sprrmb.cfr_renamed_2025(this.cfr_renamed_119, nArray);
        return new sprskb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_1773() {
        int[] nArray = sprqlb.cfr_renamed_1631();
        sprrmb.cfr_renamed_2027(this.cfr_renamed_119, nArray);
        return new sprskb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_952() {
        int[] nArray = sprqlb.cfr_renamed_1631();
        sprfob.cfr_renamed_1760(sprrmb.cfr_renamed_0, this.cfr_renamed_119, nArray);
        return new sprskb(nArray);
    }

    @Override
    public boolean cfr_renamed_805() {
        return sprqlb.cfr_renamed_1660(this.cfr_renamed_119);
    }

    public sprskb() {
        this.cfr_renamed_119 = sprqlb.cfr_renamed_1631();
    }

    @Override
    public sprwtb cfr_renamed_1048() {
        int[] nArray = sprqlb.cfr_renamed_1631();
        sprrmb.cfr_renamed_1627(this.cfr_renamed_119, nArray);
        return new sprskb(nArray);
    }
}

