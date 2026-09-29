/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprhqh;
import com.spire.presentation.packages.sprinh;
import com.spire.presentation.packages.sprjrf;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpaba;
import com.spire.presentation.packages.sprrrh;
import java.math.BigInteger;

public class sprbph
extends sprrrh {
    public static final BigInteger cfr_renamed_119 = new BigInteger(1, sprfqe.cfr_renamed_5217(sprjrf.cfr_renamed_9("S0S0S0S0S0S0S0S0S0S0S0S0S0S0S0S3S0S0S0S0S0S0S0S0")));
    public int[] cfr_renamed_4;

    @Override
    public sprlsh cfr_renamed_1773() {
        int[] nArray = sprinh.cfr_renamed_1631();
        sprhqh.cfr_renamed_2027(this.cfr_renamed_4, nArray);
        return new sprbph(nArray);
    }

    @Override
    public sprlsh cfr_renamed_1908() {
        int[] nArray = sprinh.cfr_renamed_1631();
        sprhqh.cfr_renamed_2025(this.cfr_renamed_4, nArray);
        return new sprbph(nArray);
    }

    public sprbph(int[] nArray) {
        this.cfr_renamed_4 = nArray;
    }

    @Override
    public boolean cfr_renamed_287() {
        return sprinh.cfr_renamed_1659(this.cfr_renamed_4);
    }

    @Override
    public sprlsh cfr_renamed_1048() {
        int[] nArray = sprinh.cfr_renamed_1631();
        sprhqh.cfr_renamed_1627(this.cfr_renamed_4, nArray);
        return new sprbph(nArray);
    }

    @Override
    public BigInteger cfr_renamed_1779() {
        return sprinh.cfr_renamed_1651(this.cfr_renamed_4);
    }

    @Override
    public sprlsh cfr_renamed_952() {
        int[] nArray = sprinh.cfr_renamed_1631();
        sprhqh.cfr_renamed_8805(this.cfr_renamed_4, nArray);
        return new sprbph(nArray);
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprbph)) {
            return false;
        }
        sprbph sprbph2 = (sprbph)arg0;
        return sprinh.cfr_renamed_1648(this.cfr_renamed_4, sprbph2.cfr_renamed_4);
    }

    @Override
    public boolean cfr_renamed_805() {
        return sprinh.cfr_renamed_1660(this.cfr_renamed_4);
    }

    @Override
    public sprlsh cfr_renamed_8663(sprlsh arg0) {
        int[] nArray = sprinh.cfr_renamed_1631();
        sprhqh.cfr_renamed_1654(this.cfr_renamed_4, ((sprbph)arg0).cfr_renamed_4, nArray);
        return new sprbph(nArray);
    }

    @Override
    public sprlsh cfr_renamed_1817() {
        int[] nArray = this.cfr_renamed_4;
        if (sprinh.cfr_renamed_1660(this.cfr_renamed_4) || sprinh.cfr_renamed_1659(nArray)) {
            return this;
        }
        int[] nArray2 = sprinh.cfr_renamed_1631();
        int[] nArray3 = sprinh.cfr_renamed_1631();
        sprhqh.cfr_renamed_1627(nArray, nArray2);
        int[] nArray4 = nArray2;
        int[] nArray5 = nArray2;
        int[] nArray6 = nArray2;
        sprhqh.cfr_renamed_2022(nArray2, nArray, nArray2);
        sprhqh.cfr_renamed_2026(nArray6, 2, nArray3);
        sprhqh.cfr_renamed_2022(nArray3, nArray2, nArray3);
        sprhqh.cfr_renamed_2026(nArray3, 4, nArray2);
        sprhqh.cfr_renamed_2022(nArray6, nArray3, nArray2);
        sprhqh.cfr_renamed_2026(nArray5, 8, nArray3);
        sprhqh.cfr_renamed_2022(nArray3, nArray2, nArray3);
        sprhqh.cfr_renamed_2026(nArray3, 16, nArray2);
        sprhqh.cfr_renamed_2022(nArray5, nArray3, nArray2);
        sprhqh.cfr_renamed_2026(nArray4, 32, nArray3);
        sprhqh.cfr_renamed_2022(nArray3, nArray2, nArray3);
        sprhqh.cfr_renamed_2026(nArray3, 64, nArray2);
        sprhqh.cfr_renamed_2022(nArray4, nArray3, nArray2);
        sprhqh.cfr_renamed_2026(nArray2, 62, nArray2);
        sprhqh.cfr_renamed_1627(nArray2, nArray3);
        if (sprinh.cfr_renamed_1648(nArray, nArray3)) {
            return new sprbph(nArray2);
        }
        return null;
    }

    public sprbph() {
        this.cfr_renamed_4 = sprinh.cfr_renamed_1631();
    }

    @Override
    public sprlsh cfr_renamed_8934(sprlsh arg0) {
        int[] nArray = sprinh.cfr_renamed_1631();
        sprhqh.cfr_renamed_2021(this.cfr_renamed_4, ((sprbph)arg0).cfr_renamed_4, nArray);
        return new sprbph(nArray);
    }

    @Override
    public String cfr_renamed_1985() {
        return sprpaba.cfr_renamed_9("XBhw:\u001e9u:abBgC");
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_119.bitLength();
    }

    /*
     * WARNING - void declaration
     */
    public sprbph(BigInteger bigInteger) {
        void arg0;
        if (bigInteger == null || arg0.signum() < 0 || arg0.compareTo(cfr_renamed_119) >= 0) {
            throw new IllegalArgumentException(sprjrf.cfr_renamed_9("\u000e5\u0000t\u001a`\u00135\u001f{\u0000t\u001a|\u00125\u0010z\u00045%p\u0015EG,DGGS\u001fp\u001aq3y\u0013x\u0013{\u0002"));
        }
        this.cfr_renamed_4 = sprhqh.cfr_renamed_1652((BigInteger)arg0);
    }

    @Override
    public sprlsh cfr_renamed_8682(sprlsh arg0) {
        int[] nArray = sprinh.cfr_renamed_1631();
        sprhqh.cfr_renamed_2022(this.cfr_renamed_4, ((sprbph)arg0).cfr_renamed_4, nArray);
        return new sprbph(nArray);
    }

    public int hashCode() {
        return cfr_renamed_119.hashCode() ^ sproze.cfr_renamed_536(this.cfr_renamed_4, 0, 6);
    }

    @Override
    public sprlsh cfr_renamed_8936(sprlsh arg0) {
        int[] nArray = sprinh.cfr_renamed_1631();
        sprhqh.cfr_renamed_8805(((sprbph)arg0).cfr_renamed_4, nArray);
        sprhqh.cfr_renamed_2022(nArray, this.cfr_renamed_4, nArray);
        return new sprbph(nArray);
    }

    @Override
    public boolean cfr_renamed_1930() {
        return sprinh.cfr_renamed_1662(this.cfr_renamed_4, 0) == 1;
    }
}

