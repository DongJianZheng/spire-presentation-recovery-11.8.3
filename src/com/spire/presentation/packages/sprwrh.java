/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbco;
import com.spire.presentation.packages.sprbth;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmeh;
import com.spire.presentation.packages.sprnwj;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrrh;
import java.math.BigInteger;

public class sprwrh
extends sprrrh {
    public static final BigInteger cfr_renamed_119 = sprmeh.cfr_renamed_1651(sprbth.cfr_renamed_1);
    public int[] cfr_renamed_3;
    private static final int[] cfr_renamed_4;

    public sprwrh(int[] nArray) {
        this.cfr_renamed_3 = nArray;
    }

    @Override
    public sprlsh cfr_renamed_1773() {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprbth.cfr_renamed_2027(this.cfr_renamed_3, nArray);
        return new sprwrh(nArray);
    }

    @Override
    public String cfr_renamed_1985() {
        return sprnwj.cfr_renamed_9("P8a;v\u007f&x\"tU$v!w");
    }

    @Override
    public boolean cfr_renamed_805() {
        return sprmeh.cfr_renamed_1660(this.cfr_renamed_3);
    }

    public int hashCode() {
        return cfr_renamed_119.hashCode() ^ sproze.cfr_renamed_536(this.cfr_renamed_3, 0, 8);
    }

    @Override
    public sprlsh cfr_renamed_8682(sprlsh arg0) {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprbth.cfr_renamed_2022(this.cfr_renamed_3, ((sprwrh)arg0).cfr_renamed_3, nArray);
        return new sprwrh(nArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprwrh(BigInteger bigInteger) {
        void arg0;
        if (bigInteger == null || arg0.signum() < 0 || arg0.compareTo(cfr_renamed_119) >= 0) {
            throw new IllegalArgumentException(sprbco.cfr_renamed_9("HsF2\\&UsY=F2\\:TsV<Bss&B%Ua\u0005f\u0001jv:U?T\u0016\\6]6^'"));
        }
        this.cfr_renamed_3 = sprbth.cfr_renamed_1652((BigInteger)arg0);
    }

    @Override
    public sprlsh cfr_renamed_1817() {
        int[] nArray;
        int[] nArray2 = this.cfr_renamed_3;
        if (sprmeh.cfr_renamed_1660(this.cfr_renamed_3) || sprmeh.cfr_renamed_1659(nArray2)) {
            return this;
        }
        int[] nArray3 = sprmeh.cfr_renamed_1631();
        sprbth.cfr_renamed_1627(nArray2, nArray3);
        sprbth.cfr_renamed_2022(nArray3, nArray2, nArray3);
        int[] nArray4 = nArray3;
        sprbth.cfr_renamed_1627(nArray3, nArray3);
        int[] nArray5 = nArray4;
        sprbth.cfr_renamed_2022(nArray5, nArray2, nArray5);
        int[] nArray6 = sprmeh.cfr_renamed_1631();
        sprbth.cfr_renamed_1627(nArray4, nArray6);
        int[] nArray7 = nArray6;
        sprbth.cfr_renamed_2022(nArray6, nArray2, nArray7);
        int[] nArray8 = sprmeh.cfr_renamed_1631();
        sprbth.cfr_renamed_2026(nArray7, 3, nArray8);
        sprbth.cfr_renamed_2022(nArray8, nArray4, nArray8);
        int[] nArray9 = nArray4;
        sprbth.cfr_renamed_2026(nArray8, 4, nArray9);
        sprbth.cfr_renamed_2022(nArray9, nArray6, nArray9);
        int[] nArray10 = nArray8;
        sprbth.cfr_renamed_2026(nArray9, 4, nArray10);
        sprbth.cfr_renamed_2022(nArray10, nArray6, nArray10);
        int[] nArray11 = nArray6;
        sprbth.cfr_renamed_2026(nArray10, 15, nArray11);
        sprbth.cfr_renamed_2022(nArray11, nArray10, nArray11);
        int[] nArray12 = nArray10;
        int[] nArray13 = nArray11;
        sprbth.cfr_renamed_2026(nArray13, 30, nArray12);
        sprbth.cfr_renamed_2022(nArray10, nArray11, nArray12);
        int[] nArray14 = nArray13;
        int[] nArray15 = nArray12;
        sprbth.cfr_renamed_2026(nArray15, 60, nArray14);
        sprbth.cfr_renamed_2022(nArray13, nArray12, nArray14);
        int[] nArray16 = nArray15;
        sprbth.cfr_renamed_2026(nArray14, 11, nArray16);
        sprbth.cfr_renamed_2022(nArray16, nArray9, nArray16);
        int[] nArray17 = nArray9;
        sprbth.cfr_renamed_2026(nArray16, 120, nArray17);
        sprbth.cfr_renamed_2022(nArray17, nArray14, nArray17);
        int[] nArray18 = nArray = nArray17;
        sprbth.cfr_renamed_1627(nArray, nArray18);
        int[] nArray19 = nArray14;
        sprbth.cfr_renamed_1627(nArray18, nArray19);
        if (sprmeh.cfr_renamed_1648(nArray2, nArray19)) {
            return new sprwrh(nArray);
        }
        sprbth.cfr_renamed_2022(nArray, cfr_renamed_4, nArray);
        sprbth.cfr_renamed_1627(nArray, nArray19);
        if (sprmeh.cfr_renamed_1648(nArray2, nArray19)) {
            return new sprwrh(nArray);
        }
        return null;
    }

    @Override
    public sprlsh cfr_renamed_8936(sprlsh arg0) {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprbth.cfr_renamed_8805(((sprwrh)arg0).cfr_renamed_3, nArray);
        sprbth.cfr_renamed_2022(nArray, this.cfr_renamed_3, nArray);
        return new sprwrh(nArray);
    }

    static {
        int[] nArray = new int[8];
        nArray[0] = 1242472624;
        nArray[1] = -991028441;
        nArray[2] = -1389370248;
        nArray[3] = 792926214;
        nArray[4] = 1039914919;
        nArray[5] = 726466713;
        nArray[6] = 1338105611;
        nArray[7] = 730014848;
        cfr_renamed_4 = nArray;
    }

    @Override
    public sprlsh cfr_renamed_8934(sprlsh arg0) {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprbth.cfr_renamed_2021(this.cfr_renamed_3, ((sprwrh)arg0).cfr_renamed_3, nArray);
        return new sprwrh(nArray);
    }

    @Override
    public BigInteger cfr_renamed_1779() {
        return sprmeh.cfr_renamed_1651(this.cfr_renamed_3);
    }

    @Override
    public sprlsh cfr_renamed_1908() {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprbth.cfr_renamed_2025(this.cfr_renamed_3, nArray);
        return new sprwrh(nArray);
    }

    @Override
    public sprlsh cfr_renamed_8663(sprlsh arg0) {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprbth.cfr_renamed_1654(this.cfr_renamed_3, ((sprwrh)arg0).cfr_renamed_3, nArray);
        return new sprwrh(nArray);
    }

    @Override
    public sprlsh cfr_renamed_952() {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprbth.cfr_renamed_8805(this.cfr_renamed_3, nArray);
        return new sprwrh(nArray);
    }

    @Override
    public boolean cfr_renamed_287() {
        return sprmeh.cfr_renamed_1659(this.cfr_renamed_3);
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprwrh)) {
            return false;
        }
        sprwrh sprwrh2 = (sprwrh)arg0;
        return sprmeh.cfr_renamed_1648(this.cfr_renamed_3, sprwrh2.cfr_renamed_3);
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_119.bitLength();
    }

    @Override
    public boolean cfr_renamed_1930() {
        return sprmeh.cfr_renamed_1662(this.cfr_renamed_3, 0) == 1;
    }

    public sprwrh() {
        this.cfr_renamed_3 = sprmeh.cfr_renamed_1631();
    }

    @Override
    public sprlsh cfr_renamed_1048() {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprbth.cfr_renamed_1627(this.cfr_renamed_3, nArray);
        return new sprwrh(nArray);
    }
}

