/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprehga;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprlfg;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrrh;
import com.spire.presentation.packages.sprthh;
import com.spire.presentation.packages.sprxoh;
import java.math.BigInteger;

public class sprsrh
extends sprrrh {
    public int[] cfr_renamed_112;
    public static final BigInteger cfr_renamed_119 = new BigInteger(1, sprfqe.cfr_renamed_5217(sprlfg.cfr_renamed_9("4D4D4D4F4D4D4D4D4D4D4D4D4D4D4D4D")));

    public int hashCode() {
        return cfr_renamed_119.hashCode() ^ sproze.cfr_renamed_536(this.cfr_renamed_112, 0, 4);
    }

    @Override
    public sprlsh cfr_renamed_1908() {
        int[] nArray = sprthh.cfr_renamed_1631();
        sprxoh.cfr_renamed_2025(this.cfr_renamed_112, nArray);
        return new sprsrh(nArray);
    }

    public sprsrh(int[] nArray) {
        this.cfr_renamed_112 = nArray;
    }

    @Override
    public boolean cfr_renamed_805() {
        return sprthh.cfr_renamed_1660(this.cfr_renamed_112);
    }

    @Override
    public boolean cfr_renamed_287() {
        return sprthh.cfr_renamed_1659(this.cfr_renamed_112);
    }

    @Override
    public sprlsh cfr_renamed_8663(sprlsh arg0) {
        int[] nArray = sprthh.cfr_renamed_1631();
        sprxoh.cfr_renamed_1654(this.cfr_renamed_112, ((sprsrh)arg0).cfr_renamed_112, nArray);
        return new sprsrh(nArray);
    }

    @Override
    public sprlsh cfr_renamed_1048() {
        int[] nArray = sprthh.cfr_renamed_1631();
        sprxoh.cfr_renamed_1627(this.cfr_renamed_112, nArray);
        return new sprsrh(nArray);
    }

    @Override
    public String cfr_renamed_1985() {
        return sprehga.cfr_renamed_9("\bB8wj\u0015cuja2B7C");
    }

    @Override
    public sprlsh cfr_renamed_1817() {
        int[] nArray = this.cfr_renamed_112;
        if (sprthh.cfr_renamed_1660(this.cfr_renamed_112) || sprthh.cfr_renamed_1659(nArray)) {
            return this;
        }
        int[] nArray2 = sprthh.cfr_renamed_1631();
        sprxoh.cfr_renamed_1627(nArray, nArray2);
        sprxoh.cfr_renamed_2022(nArray2, nArray, nArray2);
        int[] nArray3 = sprthh.cfr_renamed_1631();
        sprxoh.cfr_renamed_2026(nArray2, 2, nArray3);
        int[] nArray4 = nArray3;
        sprxoh.cfr_renamed_2022(nArray4, nArray2, nArray4);
        int[] nArray5 = sprthh.cfr_renamed_1631();
        sprxoh.cfr_renamed_2026(nArray3, 4, nArray5);
        sprxoh.cfr_renamed_2022(nArray5, nArray3, nArray5);
        int[] nArray6 = nArray3;
        sprxoh.cfr_renamed_2026(nArray5, 2, nArray6);
        sprxoh.cfr_renamed_2022(nArray6, nArray2, nArray6);
        int[] nArray7 = nArray2;
        sprxoh.cfr_renamed_2026(nArray6, 10, nArray7);
        sprxoh.cfr_renamed_2022(nArray7, nArray6, nArray7);
        int[] nArray8 = nArray5;
        sprxoh.cfr_renamed_2026(nArray2, 10, nArray8);
        sprxoh.cfr_renamed_2022(nArray8, nArray6, nArray8);
        int[] nArray9 = nArray6;
        sprxoh.cfr_renamed_1627(nArray8, nArray9);
        sprxoh.cfr_renamed_2022(nArray9, nArray, nArray9);
        int[] nArray10 = nArray9;
        sprxoh.cfr_renamed_2026(nArray10, 95, nArray10);
        int[] nArray11 = nArray8;
        sprxoh.cfr_renamed_1627(nArray10, nArray11);
        if (sprthh.cfr_renamed_1648(nArray, nArray11)) {
            return new sprsrh(nArray10);
        }
        return null;
    }

    public sprsrh() {
        this.cfr_renamed_112 = sprthh.cfr_renamed_1631();
    }

    @Override
    public sprlsh cfr_renamed_952() {
        int[] nArray = sprthh.cfr_renamed_1631();
        sprxoh.cfr_renamed_8805(this.cfr_renamed_112, nArray);
        return new sprsrh(nArray);
    }

    @Override
    public sprlsh cfr_renamed_8936(sprlsh arg0) {
        int[] nArray = sprthh.cfr_renamed_1631();
        sprxoh.cfr_renamed_8805(((sprsrh)arg0).cfr_renamed_112, nArray);
        sprxoh.cfr_renamed_2022(nArray, this.cfr_renamed_112, nArray);
        return new sprsrh(nArray);
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_119.bitLength();
    }

    @Override
    public sprlsh cfr_renamed_8682(sprlsh arg0) {
        int[] nArray = sprthh.cfr_renamed_1631();
        sprxoh.cfr_renamed_2022(this.cfr_renamed_112, ((sprsrh)arg0).cfr_renamed_112, nArray);
        return new sprsrh(nArray);
    }

    @Override
    public BigInteger cfr_renamed_1779() {
        return sprthh.cfr_renamed_1651(this.cfr_renamed_112);
    }

    /*
     * WARNING - void declaration
     */
    public sprsrh(BigInteger bigInteger) {
        void arg0;
        if (bigInteger == null || arg0.signum() < 0 || arg0.compareTo(cfr_renamed_119) >= 0) {
            throw new IllegalArgumentException(sprlfg.cfr_renamed_9("zRt\u0013n\u0007gRk\u001ct\u0013n\u001bfRd\u001dpRQ\u0017a\"3@: 34k\u0017n\u0016G\u001eg\u001fg\u001cv"));
        }
        this.cfr_renamed_112 = sprxoh.cfr_renamed_1652((BigInteger)arg0);
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprsrh)) {
            return false;
        }
        sprsrh sprsrh2 = (sprsrh)arg0;
        return sprthh.cfr_renamed_1648(this.cfr_renamed_112, sprsrh2.cfr_renamed_112);
    }

    @Override
    public sprlsh cfr_renamed_8934(sprlsh arg0) {
        int[] nArray = sprthh.cfr_renamed_1631();
        sprxoh.cfr_renamed_2021(this.cfr_renamed_112, ((sprsrh)arg0).cfr_renamed_112, nArray);
        return new sprsrh(nArray);
    }

    @Override
    public boolean cfr_renamed_1930() {
        return sprthh.cfr_renamed_1662(this.cfr_renamed_112, 0) == 1;
    }

    @Override
    public sprlsh cfr_renamed_1773() {
        int[] nArray = sprthh.cfr_renamed_1631();
        sprxoh.cfr_renamed_2027(this.cfr_renamed_112, nArray);
        return new sprsrh(nArray);
    }
}

