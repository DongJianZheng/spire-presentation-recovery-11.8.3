/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprloja;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmrh;
import com.spire.presentation.packages.sprmvz;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqkh;
import com.spire.presentation.packages.sprrrh;
import java.math.BigInteger;

public class sprjuh
extends sprrrh {
    public static final BigInteger cfr_renamed_119 = new BigInteger(1, sprfqe.cfr_renamed_5217(sprloja.cfr_renamed_9("x\u0010x\u0010x\u0010x\u0010x\u0010x\u0010x\u0010x\u0010x\u0010x\u0010x\u0010x\u0010x\u0010x\u0010x\u0010x\u0013x\u0010x\u0010\u007f\u0015\te")));
    public int[] cfr_renamed_4;

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprjuh)) {
            return false;
        }
        sprjuh sprjuh2 = (sprjuh)arg0;
        return sprqkh.cfr_renamed_1648(this.cfr_renamed_4, sprjuh2.cfr_renamed_4);
    }

    @Override
    public boolean cfr_renamed_1930() {
        return sprqkh.cfr_renamed_1662(this.cfr_renamed_4, 0) == 1;
    }

    /*
     * WARNING - void declaration
     */
    public sprjuh(BigInteger bigInteger) {
        void arg0;
        if (bigInteger == null || arg0.signum() < 0 || arg0.compareTo(cfr_renamed_119) >= 0) {
            throw new IllegalArgumentException(sprloja.cfr_renamed_9(".\u001e _:K3\u001e?P _:W2\u001e0Q$\u001e\u0005[5ng\bfldx?[:Z\u0013R3S3P\""));
        }
        this.cfr_renamed_4 = sprmrh.cfr_renamed_1652((BigInteger)arg0);
    }

    public int hashCode() {
        return cfr_renamed_119.hashCode() ^ sproze.cfr_renamed_536(this.cfr_renamed_4, 0, 5);
    }

    @Override
    public boolean cfr_renamed_805() {
        return sprqkh.cfr_renamed_1660(this.cfr_renamed_4);
    }

    @Override
    public String cfr_renamed_1985() {
        return sprmvz.cfr_renamed_9("\u0012A\"tp\u0012qvsb(A-@");
    }

    @Override
    public sprlsh cfr_renamed_1048() {
        int[] nArray = sprqkh.cfr_renamed_1631();
        sprmrh.cfr_renamed_1627(this.cfr_renamed_4, nArray);
        return new sprjuh(nArray);
    }

    public sprjuh(int[] nArray) {
        this.cfr_renamed_4 = nArray;
    }

    @Override
    public sprlsh cfr_renamed_8934(sprlsh arg0) {
        int[] nArray = sprqkh.cfr_renamed_1631();
        sprmrh.cfr_renamed_2021(this.cfr_renamed_4, ((sprjuh)arg0).cfr_renamed_4, nArray);
        return new sprjuh(nArray);
    }

    @Override
    public sprlsh cfr_renamed_8663(sprlsh arg0) {
        int[] nArray = sprqkh.cfr_renamed_1631();
        sprmrh.cfr_renamed_1654(this.cfr_renamed_4, ((sprjuh)arg0).cfr_renamed_4, nArray);
        return new sprjuh(nArray);
    }

    @Override
    public sprlsh cfr_renamed_1908() {
        int[] nArray = sprqkh.cfr_renamed_1631();
        sprmrh.cfr_renamed_2025(this.cfr_renamed_4, nArray);
        return new sprjuh(nArray);
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_119.bitLength();
    }

    @Override
    public sprlsh cfr_renamed_8682(sprlsh arg0) {
        int[] nArray = sprqkh.cfr_renamed_1631();
        sprmrh.cfr_renamed_2022(this.cfr_renamed_4, ((sprjuh)arg0).cfr_renamed_4, nArray);
        return new sprjuh(nArray);
    }

    @Override
    public sprlsh cfr_renamed_8936(sprlsh arg0) {
        int[] nArray = sprqkh.cfr_renamed_1631();
        sprmrh.cfr_renamed_8805(((sprjuh)arg0).cfr_renamed_4, nArray);
        sprmrh.cfr_renamed_2022(nArray, this.cfr_renamed_4, nArray);
        return new sprjuh(nArray);
    }

    @Override
    public sprlsh cfr_renamed_952() {
        int[] nArray = sprqkh.cfr_renamed_1631();
        sprmrh.cfr_renamed_8805(this.cfr_renamed_4, nArray);
        return new sprjuh(nArray);
    }

    @Override
    public boolean cfr_renamed_287() {
        return sprqkh.cfr_renamed_1659(this.cfr_renamed_4);
    }

    @Override
    public sprlsh cfr_renamed_1817() {
        int[] nArray;
        int[] nArray2 = this.cfr_renamed_4;
        if (sprqkh.cfr_renamed_1660(this.cfr_renamed_4) || sprqkh.cfr_renamed_1659(nArray2)) {
            return this;
        }
        int[] nArray3 = sprqkh.cfr_renamed_1631();
        sprmrh.cfr_renamed_1627(nArray2, nArray3);
        sprmrh.cfr_renamed_2022(nArray3, nArray2, nArray3);
        int[] nArray4 = sprqkh.cfr_renamed_1631();
        sprmrh.cfr_renamed_1627(nArray3, nArray4);
        int[] nArray5 = nArray4;
        sprmrh.cfr_renamed_2022(nArray4, nArray2, nArray5);
        int[] nArray6 = sprqkh.cfr_renamed_1631();
        sprmrh.cfr_renamed_1627(nArray5, nArray6);
        sprmrh.cfr_renamed_2022(nArray6, nArray2, nArray6);
        int[] nArray7 = sprqkh.cfr_renamed_1631();
        sprmrh.cfr_renamed_2026(nArray6, 3, nArray7);
        sprmrh.cfr_renamed_2022(nArray7, nArray4, nArray7);
        int[] nArray8 = nArray6;
        int[] nArray9 = nArray7;
        sprmrh.cfr_renamed_2026(nArray9, 7, nArray8);
        sprmrh.cfr_renamed_2022(nArray8, nArray7, nArray8);
        int[] nArray10 = nArray9;
        sprmrh.cfr_renamed_2026(nArray8, 3, nArray10);
        sprmrh.cfr_renamed_2022(nArray9, nArray4, nArray10);
        int[] nArray11 = sprqkh.cfr_renamed_1631();
        sprmrh.cfr_renamed_2026(nArray9, 14, nArray11);
        sprmrh.cfr_renamed_2022(nArray11, nArray8, nArray11);
        int[] nArray12 = nArray8;
        int[] nArray13 = nArray11;
        sprmrh.cfr_renamed_2026(nArray13, 31, nArray12);
        sprmrh.cfr_renamed_2022(nArray12, nArray11, nArray12);
        int[] nArray14 = nArray13;
        int[] nArray15 = nArray12;
        sprmrh.cfr_renamed_2026(nArray15, 62, nArray14);
        sprmrh.cfr_renamed_2022(nArray13, nArray12, nArray14);
        int[] nArray16 = nArray15;
        sprmrh.cfr_renamed_2026(nArray14, 3, nArray16);
        sprmrh.cfr_renamed_2022(nArray16, nArray4, nArray16);
        int[] nArray17 = nArray = nArray16;
        int[] nArray18 = nArray;
        int[] nArray19 = nArray;
        int[] nArray20 = nArray;
        int[] nArray21 = nArray;
        sprmrh.cfr_renamed_2026(nArray21, 18, nArray);
        sprmrh.cfr_renamed_2022(nArray21, nArray10, nArray);
        sprmrh.cfr_renamed_2026(nArray20, 2, nArray);
        sprmrh.cfr_renamed_2022(nArray20, nArray2, nArray);
        sprmrh.cfr_renamed_2026(nArray19, 3, nArray);
        sprmrh.cfr_renamed_2022(nArray19, nArray3, nArray);
        sprmrh.cfr_renamed_2026(nArray18, 6, nArray);
        sprmrh.cfr_renamed_2022(nArray18, nArray4, nArray);
        sprmrh.cfr_renamed_2026(nArray17, 2, nArray);
        sprmrh.cfr_renamed_2022(nArray17, nArray2, nArray);
        int[] nArray22 = nArray3;
        sprmrh.cfr_renamed_1627(nArray, nArray22);
        if (sprqkh.cfr_renamed_1648(nArray2, nArray22)) {
            return new sprjuh(nArray);
        }
        return null;
    }

    @Override
    public sprlsh cfr_renamed_1773() {
        int[] nArray = sprqkh.cfr_renamed_1631();
        sprmrh.cfr_renamed_2027(this.cfr_renamed_4, nArray);
        return new sprjuh(nArray);
    }

    @Override
    public BigInteger cfr_renamed_1779() {
        return sprqkh.cfr_renamed_1651(this.cfr_renamed_4);
    }

    public sprjuh() {
        this.cfr_renamed_4 = sprqkh.cfr_renamed_1631();
    }
}

