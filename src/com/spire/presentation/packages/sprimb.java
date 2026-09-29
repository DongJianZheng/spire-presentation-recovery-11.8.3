/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfob;
import com.spire.presentation.packages.sprhah;
import com.spire.presentation.packages.sprkqb;
import com.spire.presentation.packages.sprsvy;
import com.spire.presentation.packages.sprwtb;
import com.spire.presentation.packages.spryrb;
import com.spire.presentation.packages.sprzra;
import com.spire.presentation.packages.sprztb;
import java.math.BigInteger;

public class sprimb
extends sprwtb {
    public int[] cfr_renamed_112;
    private static final int[] cfr_renamed_119;
    public static final BigInteger cfr_renamed_91;

    public sprimb(int[] nArray) {
        this.cfr_renamed_112 = nArray;
    }

    @Override
    public sprwtb cfr_renamed_1984(sprwtb arg0) {
        int[] nArray = spryrb.cfr_renamed_1631();
        sprfob.cfr_renamed_1760(sprztb.cfr_renamed_4, ((sprimb)arg0).cfr_renamed_112, nArray);
        sprztb.cfr_renamed_2022(nArray, this.cfr_renamed_112, nArray);
        return new sprimb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_1983(sprwtb arg0) {
        int[] nArray = spryrb.cfr_renamed_1631();
        sprztb.cfr_renamed_1654(this.cfr_renamed_112, ((sprimb)arg0).cfr_renamed_112, nArray);
        return new sprimb(nArray);
    }

    public int hashCode() {
        return cfr_renamed_91.hashCode() ^ sprzra.cfr_renamed_536(this.cfr_renamed_112, 0, 8);
    }

    @Override
    public String cfr_renamed_1985() {
        return sprsvy.cfr_renamed_9("\u007f\u0001N\u0002YF\tA\rMz\u001dY\u0018X");
    }

    @Override
    public BigInteger cfr_renamed_1779() {
        return spryrb.cfr_renamed_1651(this.cfr_renamed_112);
    }

    @Override
    public boolean cfr_renamed_1930() {
        return spryrb.cfr_renamed_1662(this.cfr_renamed_112, 0) == 1;
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_91.bitLength();
    }

    @Override
    public boolean cfr_renamed_805() {
        return spryrb.cfr_renamed_1660(this.cfr_renamed_112);
    }

    static {
        cfr_renamed_91 = sprkqb.cfr_renamed_0;
        int[] nArray = new int[8];
        nArray[0] = 1242472624;
        nArray[1] = -991028441;
        nArray[2] = -1389370248;
        nArray[3] = 792926214;
        nArray[4] = 1039914919;
        nArray[5] = 726466713;
        nArray[6] = 1338105611;
        nArray[7] = 730014848;
        cfr_renamed_119 = nArray;
    }

    @Override
    public sprwtb cfr_renamed_1817() {
        int[] nArray;
        int[] nArray2 = this.cfr_renamed_112;
        if (spryrb.cfr_renamed_1660(this.cfr_renamed_112) || spryrb.cfr_renamed_1659(nArray2)) {
            return this;
        }
        int[] nArray3 = spryrb.cfr_renamed_1631();
        sprztb.cfr_renamed_1627(nArray2, nArray3);
        sprztb.cfr_renamed_2022(nArray3, nArray2, nArray3);
        int[] nArray4 = nArray3;
        sprztb.cfr_renamed_1627(nArray3, nArray3);
        int[] nArray5 = nArray4;
        sprztb.cfr_renamed_2022(nArray5, nArray2, nArray5);
        int[] nArray6 = spryrb.cfr_renamed_1631();
        sprztb.cfr_renamed_1627(nArray4, nArray6);
        int[] nArray7 = nArray6;
        sprztb.cfr_renamed_2022(nArray6, nArray2, nArray7);
        int[] nArray8 = spryrb.cfr_renamed_1631();
        sprztb.cfr_renamed_2026(nArray7, 3, nArray8);
        sprztb.cfr_renamed_2022(nArray8, nArray4, nArray8);
        int[] nArray9 = nArray4;
        sprztb.cfr_renamed_2026(nArray8, 4, nArray9);
        sprztb.cfr_renamed_2022(nArray9, nArray6, nArray9);
        int[] nArray10 = nArray8;
        sprztb.cfr_renamed_2026(nArray9, 4, nArray10);
        sprztb.cfr_renamed_2022(nArray10, nArray6, nArray10);
        int[] nArray11 = nArray6;
        sprztb.cfr_renamed_2026(nArray10, 15, nArray11);
        sprztb.cfr_renamed_2022(nArray11, nArray10, nArray11);
        int[] nArray12 = nArray10;
        int[] nArray13 = nArray11;
        sprztb.cfr_renamed_2026(nArray13, 30, nArray12);
        sprztb.cfr_renamed_2022(nArray10, nArray11, nArray12);
        int[] nArray14 = nArray13;
        int[] nArray15 = nArray12;
        sprztb.cfr_renamed_2026(nArray15, 60, nArray14);
        sprztb.cfr_renamed_2022(nArray13, nArray12, nArray14);
        int[] nArray16 = nArray15;
        sprztb.cfr_renamed_2026(nArray14, 11, nArray16);
        sprztb.cfr_renamed_2022(nArray16, nArray9, nArray16);
        int[] nArray17 = nArray9;
        sprztb.cfr_renamed_2026(nArray16, 120, nArray17);
        sprztb.cfr_renamed_2022(nArray17, nArray14, nArray17);
        int[] nArray18 = nArray = nArray17;
        sprztb.cfr_renamed_1627(nArray, nArray18);
        int[] nArray19 = nArray14;
        sprztb.cfr_renamed_1627(nArray18, nArray19);
        if (spryrb.cfr_renamed_1648(nArray2, nArray19)) {
            return new sprimb(nArray);
        }
        sprztb.cfr_renamed_2022(nArray, cfr_renamed_119, nArray);
        sprztb.cfr_renamed_1627(nArray, nArray19);
        if (spryrb.cfr_renamed_1648(nArray2, nArray19)) {
            return new sprimb(nArray);
        }
        return null;
    }

    @Override
    public sprwtb cfr_renamed_1048() {
        int[] nArray = spryrb.cfr_renamed_1631();
        sprztb.cfr_renamed_1627(this.cfr_renamed_112, nArray);
        return new sprimb(nArray);
    }

    public sprimb() {
        this.cfr_renamed_112 = spryrb.cfr_renamed_1631();
    }

    /*
     * WARNING - void declaration
     */
    public sprimb(BigInteger bigInteger) {
        void arg0;
        if (bigInteger == null || arg0.signum() < 0 || arg0.compareTo(cfr_renamed_91) >= 0) {
            throw new IllegalArgumentException(sprhah.cfr_renamed_9("\u001fp\u00111\u000b%\u0002p\u000e>\u00111\u000b9\u0003p\u0001?\u0015p$%\u0015&\u0002bReVi!9\u0002<\u0003\u0015\u000b5\n5\t$"));
        }
        this.cfr_renamed_112 = sprztb.cfr_renamed_1652((BigInteger)arg0);
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprimb)) {
            return false;
        }
        sprimb sprimb2 = (sprimb)arg0;
        return spryrb.cfr_renamed_1648(this.cfr_renamed_112, sprimb2.cfr_renamed_112);
    }

    @Override
    public sprwtb cfr_renamed_1833(sprwtb arg0) {
        int[] nArray = spryrb.cfr_renamed_1631();
        sprztb.cfr_renamed_2022(this.cfr_renamed_112, ((sprimb)arg0).cfr_renamed_112, nArray);
        return new sprimb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_1986(sprwtb arg0) {
        int[] nArray = spryrb.cfr_renamed_1631();
        sprztb.cfr_renamed_2021(this.cfr_renamed_112, ((sprimb)arg0).cfr_renamed_112, nArray);
        return new sprimb(nArray);
    }

    @Override
    public boolean cfr_renamed_287() {
        return spryrb.cfr_renamed_1659(this.cfr_renamed_112);
    }

    @Override
    public sprwtb cfr_renamed_1773() {
        int[] nArray = spryrb.cfr_renamed_1631();
        sprztb.cfr_renamed_2027(this.cfr_renamed_112, nArray);
        return new sprimb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_1908() {
        int[] nArray = spryrb.cfr_renamed_1631();
        sprztb.cfr_renamed_2025(this.cfr_renamed_112, nArray);
        return new sprimb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_952() {
        int[] nArray = spryrb.cfr_renamed_1631();
        sprfob.cfr_renamed_1760(sprztb.cfr_renamed_4, this.cfr_renamed_112, nArray);
        return new sprimb(nArray);
    }
}

