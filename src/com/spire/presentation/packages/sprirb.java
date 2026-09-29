/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfob;
import com.spire.presentation.packages.sprljg;
import com.spire.presentation.packages.sprmmb;
import com.spire.presentation.packages.spruzy;
import com.spire.presentation.packages.sprwtb;
import com.spire.presentation.packages.spryrb;
import com.spire.presentation.packages.sprzjb;
import com.spire.presentation.packages.sprzra;
import java.math.BigInteger;

public class sprirb
extends sprwtb {
    public static final BigInteger cfr_renamed_91 = sprmmb.cfr_renamed_0;
    public int[] cfr_renamed_4;

    @Override
    public sprwtb cfr_renamed_952() {
        int[] nArray = spryrb.cfr_renamed_1631();
        sprfob.cfr_renamed_1760(sprzjb.cfr_renamed_4, this.cfr_renamed_4, nArray);
        return new sprirb(nArray);
    }

    @Override
    public boolean cfr_renamed_805() {
        return spryrb.cfr_renamed_1660(this.cfr_renamed_4);
    }

    @Override
    public BigInteger cfr_renamed_1779() {
        return spryrb.cfr_renamed_1651(this.cfr_renamed_4);
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_91.bitLength();
    }

    public sprirb() {
        this.cfr_renamed_4 = spryrb.cfr_renamed_1631();
    }

    @Override
    public boolean cfr_renamed_287() {
        return spryrb.cfr_renamed_1659(this.cfr_renamed_4);
    }

    @Override
    public sprwtb cfr_renamed_1048() {
        int[] nArray = spryrb.cfr_renamed_1631();
        sprzjb.cfr_renamed_1627(this.cfr_renamed_4, nArray);
        return new sprirb(nArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprirb(BigInteger bigInteger) {
        void arg0;
        if (bigInteger == null || arg0.signum() < 0 || arg0.compareTo(cfr_renamed_91) >= 0) {
            throw new IllegalArgumentException(sprljg.cfr_renamed_9("`\u001cn]tI}\u001cqRn]tU|\u001c~Sj\u001cKY{l*\t.w)zqYtX]P}Q}Rl"));
        }
        this.cfr_renamed_4 = sprzjb.cfr_renamed_1652((BigInteger)arg0);
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprirb)) {
            return false;
        }
        sprirb sprirb2 = (sprirb)arg0;
        return spryrb.cfr_renamed_1648(this.cfr_renamed_4, sprirb2.cfr_renamed_4);
    }

    @Override
    public sprwtb cfr_renamed_1983(sprwtb arg0) {
        int[] nArray = spryrb.cfr_renamed_1631();
        sprzjb.cfr_renamed_1654(this.cfr_renamed_4, ((sprirb)arg0).cfr_renamed_4, nArray);
        return new sprirb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_1986(sprwtb arg0) {
        int[] nArray = spryrb.cfr_renamed_1631();
        sprzjb.cfr_renamed_2021(this.cfr_renamed_4, ((sprirb)arg0).cfr_renamed_4, nArray);
        return new sprirb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_1908() {
        int[] nArray = spryrb.cfr_renamed_1631();
        sprzjb.cfr_renamed_2025(this.cfr_renamed_4, nArray);
        return new sprirb(nArray);
    }

    @Override
    public String cfr_renamed_1985() {
        return spruzy.cfr_renamed_9("6n\u0006[W>S@TM\fn\to");
    }

    public sprirb(int[] nArray) {
        this.cfr_renamed_4 = nArray;
    }

    public int hashCode() {
        return cfr_renamed_91.hashCode() ^ sprzra.cfr_renamed_536(this.cfr_renamed_4, 0, 8);
    }

    @Override
    public sprwtb cfr_renamed_1817() {
        int[] nArray;
        int[] nArray2 = this.cfr_renamed_4;
        if (spryrb.cfr_renamed_1660(this.cfr_renamed_4) || spryrb.cfr_renamed_1659(nArray2)) {
            return this;
        }
        int[] nArray3 = spryrb.cfr_renamed_1631();
        sprzjb.cfr_renamed_1627(nArray2, nArray3);
        sprzjb.cfr_renamed_2022(nArray3, nArray2, nArray3);
        int[] nArray4 = spryrb.cfr_renamed_1631();
        sprzjb.cfr_renamed_1627(nArray3, nArray4);
        int[] nArray5 = nArray4;
        sprzjb.cfr_renamed_2022(nArray4, nArray2, nArray5);
        int[] nArray6 = spryrb.cfr_renamed_1631();
        sprzjb.cfr_renamed_2026(nArray5, 3, nArray6);
        sprzjb.cfr_renamed_2022(nArray6, nArray4, nArray6);
        int[] nArray7 = nArray6;
        sprzjb.cfr_renamed_2026(nArray6, 3, nArray7);
        sprzjb.cfr_renamed_2022(nArray7, nArray4, nArray7);
        int[] nArray8 = nArray7;
        sprzjb.cfr_renamed_2026(nArray7, 2, nArray8);
        int[] nArray9 = nArray8;
        sprzjb.cfr_renamed_2022(nArray9, nArray3, nArray9);
        int[] nArray10 = spryrb.cfr_renamed_1631();
        sprzjb.cfr_renamed_2026(nArray8, 11, nArray10);
        sprzjb.cfr_renamed_2022(nArray10, nArray8, nArray10);
        int[] nArray11 = nArray8;
        sprzjb.cfr_renamed_2026(nArray10, 22, nArray11);
        sprzjb.cfr_renamed_2022(nArray11, nArray10, nArray11);
        int[] nArray12 = spryrb.cfr_renamed_1631();
        sprzjb.cfr_renamed_2026(nArray11, 44, nArray12);
        int[] nArray13 = nArray12;
        sprzjb.cfr_renamed_2022(nArray13, nArray11, nArray13);
        int[] nArray14 = spryrb.cfr_renamed_1631();
        sprzjb.cfr_renamed_2026(nArray12, 88, nArray14);
        sprzjb.cfr_renamed_2022(nArray14, nArray12, nArray14);
        int[] nArray15 = nArray12;
        sprzjb.cfr_renamed_2026(nArray14, 44, nArray15);
        sprzjb.cfr_renamed_2022(nArray15, nArray11, nArray15);
        int[] nArray16 = nArray11;
        sprzjb.cfr_renamed_2026(nArray15, 3, nArray16);
        sprzjb.cfr_renamed_2022(nArray16, nArray4, nArray16);
        int[] nArray17 = nArray = nArray16;
        int[] nArray18 = nArray;
        sprzjb.cfr_renamed_2026(nArray18, 23, nArray);
        sprzjb.cfr_renamed_2022(nArray18, nArray10, nArray);
        sprzjb.cfr_renamed_2026(nArray17, 6, nArray);
        sprzjb.cfr_renamed_2022(nArray17, nArray3, nArray);
        sprzjb.cfr_renamed_2026(nArray, 2, nArray);
        int[] nArray19 = nArray3;
        sprzjb.cfr_renamed_1627(nArray, nArray19);
        if (spryrb.cfr_renamed_1648(nArray2, nArray19)) {
            return new sprirb(nArray);
        }
        return null;
    }

    @Override
    public sprwtb cfr_renamed_1984(sprwtb arg0) {
        int[] nArray = spryrb.cfr_renamed_1631();
        sprfob.cfr_renamed_1760(sprzjb.cfr_renamed_4, ((sprirb)arg0).cfr_renamed_4, nArray);
        sprzjb.cfr_renamed_2022(nArray, this.cfr_renamed_4, nArray);
        return new sprirb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_1833(sprwtb arg0) {
        int[] nArray = spryrb.cfr_renamed_1631();
        sprzjb.cfr_renamed_2022(this.cfr_renamed_4, ((sprirb)arg0).cfr_renamed_4, nArray);
        return new sprirb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_1773() {
        int[] nArray = spryrb.cfr_renamed_1631();
        sprzjb.cfr_renamed_2027(this.cfr_renamed_4, nArray);
        return new sprirb(nArray);
    }

    @Override
    public boolean cfr_renamed_1930() {
        return spryrb.cfr_renamed_1662(this.cfr_renamed_4, 0) == 1;
    }
}

