/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spremb;
import com.spire.presentation.packages.sprfob;
import com.spire.presentation.packages.sprmro;
import com.spire.presentation.packages.sprrpb;
import com.spire.presentation.packages.sprsob;
import com.spire.presentation.packages.sprwtb;
import com.spire.presentation.packages.sprxad;
import com.spire.presentation.packages.sprzra;
import java.math.BigInteger;

public class sprfqb
extends sprwtb {
    public static final BigInteger cfr_renamed_91 = spremb.cfr_renamed_0;
    public int[] cfr_renamed_4;

    @Override
    public sprwtb cfr_renamed_1908() {
        int[] nArray = sprrpb.cfr_renamed_1716(17);
        sprsob.cfr_renamed_2025(this.cfr_renamed_4, nArray);
        return new sprfqb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_1833(sprwtb arg0) {
        int[] nArray = sprrpb.cfr_renamed_1716(17);
        sprsob.cfr_renamed_2022(this.cfr_renamed_4, ((sprfqb)arg0).cfr_renamed_4, nArray);
        return new sprfqb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_1984(sprwtb arg0) {
        int[] nArray = sprrpb.cfr_renamed_1716(17);
        sprfob.cfr_renamed_1760(sprsob.cfr_renamed_4, ((sprfqb)arg0).cfr_renamed_4, nArray);
        sprsob.cfr_renamed_2022(nArray, this.cfr_renamed_4, nArray);
        return new sprfqb(nArray);
    }

    public sprfqb() {
        this.cfr_renamed_4 = sprrpb.cfr_renamed_1716(17);
    }

    @Override
    public sprwtb cfr_renamed_952() {
        int[] nArray = sprrpb.cfr_renamed_1716(17);
        sprfob.cfr_renamed_1760(sprsob.cfr_renamed_4, this.cfr_renamed_4, nArray);
        return new sprfqb(nArray);
    }

    @Override
    public boolean cfr_renamed_287() {
        return sprrpb.cfr_renamed_1710(17, this.cfr_renamed_4);
    }

    public int hashCode() {
        return cfr_renamed_91.hashCode() ^ sprzra.cfr_renamed_536(this.cfr_renamed_4, 0, 17);
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprfqb)) {
            return false;
        }
        sprfqb sprfqb2 = (sprfqb)arg0;
        return sprrpb.cfr_renamed_1743(17, this.cfr_renamed_4, sprfqb2.cfr_renamed_4);
    }

    @Override
    public sprwtb cfr_renamed_1048() {
        int[] nArray = sprrpb.cfr_renamed_1716(17);
        sprsob.cfr_renamed_1627(this.cfr_renamed_4, nArray);
        return new sprfqb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_1817() {
        int[] nArray = this.cfr_renamed_4;
        if (sprrpb.cfr_renamed_1737(17, nArray) || sprrpb.cfr_renamed_1710(17, nArray)) {
            return this;
        }
        int[] nArray2 = sprrpb.cfr_renamed_1716(17);
        int[] nArray3 = sprrpb.cfr_renamed_1716(17);
        sprsob.cfr_renamed_2026(nArray, 519, nArray2);
        sprsob.cfr_renamed_1627(nArray2, nArray3);
        if (sprrpb.cfr_renamed_1743(17, nArray, nArray3)) {
            return new sprfqb(nArray2);
        }
        return null;
    }

    @Override
    public sprwtb cfr_renamed_1986(sprwtb arg0) {
        int[] nArray = sprrpb.cfr_renamed_1716(17);
        sprsob.cfr_renamed_2021(this.cfr_renamed_4, ((sprfqb)arg0).cfr_renamed_4, nArray);
        return new sprfqb(nArray);
    }

    public sprfqb(int[] nArray) {
        this.cfr_renamed_4 = nArray;
    }

    @Override
    public String cfr_renamed_1985() {
        return sprmro.cfr_renamed_9("g\u0019W,\u0001N\u0005.\u0005:]\u0019X\u0018");
    }

    @Override
    public boolean cfr_renamed_1930() {
        return sprrpb.cfr_renamed_1662(this.cfr_renamed_4, 0) == 1;
    }

    /*
     * WARNING - void declaration
     */
    public sprfqb(BigInteger bigInteger) {
        void arg0;
        if (bigInteger == null || arg0.signum() < 0 || arg0.compareTo(cfr_renamed_91) >= 0) {
            throw new IllegalArgumentException(sprxad.cfr_renamed_9("/Y!\u0018;\f2Y>\u0017!\u0018;\u00103Y1\u0016%Y\u0004\u001c4)bKf+f?>\u001c;\u001d\u0012\u00152\u00142\u0017#"));
        }
        this.cfr_renamed_4 = sprsob.cfr_renamed_1652((BigInteger)arg0);
    }

    @Override
    public BigInteger cfr_renamed_1779() {
        return sprrpb.cfr_renamed_1704(17, this.cfr_renamed_4);
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_91.bitLength();
    }

    @Override
    public boolean cfr_renamed_805() {
        return sprrpb.cfr_renamed_1737(17, this.cfr_renamed_4);
    }

    @Override
    public sprwtb cfr_renamed_1983(sprwtb arg0) {
        int[] nArray = sprrpb.cfr_renamed_1716(17);
        sprsob.cfr_renamed_1654(this.cfr_renamed_4, ((sprfqb)arg0).cfr_renamed_4, nArray);
        return new sprfqb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_1773() {
        int[] nArray = sprrpb.cfr_renamed_1716(17);
        sprsob.cfr_renamed_2027(this.cfr_renamed_4, nArray);
        return new sprfqb(nArray);
    }
}

