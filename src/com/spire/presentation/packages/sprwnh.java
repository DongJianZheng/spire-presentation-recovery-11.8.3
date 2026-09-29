/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmeh;
import com.spire.presentation.packages.sprmvr;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpzy;
import com.spire.presentation.packages.sprrrh;
import com.spire.presentation.packages.sprxxh;
import java.math.BigInteger;

public class sprwnh
extends sprrrh {
    public int[] cfr_renamed_112;
    public static final BigInteger cfr_renamed_119 = new BigInteger(1, sprfqe.cfr_renamed_5217(sprmvr.cfr_renamed_9("P%P%P%P&P%P%P%P%P%P%P%P%P%P%P%P%P%P%P%P%&S&S&S&SP%P%P%P%P%P%P%P%")));

    public sprwnh() {
        this.cfr_renamed_112 = sprmeh.cfr_renamed_1631();
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_119.bitLength();
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprwnh)) {
            return false;
        }
        sprwnh sprwnh2 = (sprwnh)arg0;
        return sprmeh.cfr_renamed_1648(this.cfr_renamed_112, sprwnh2.cfr_renamed_112);
    }

    /*
     * WARNING - void declaration
     */
    public sprwnh(BigInteger bigInteger) {
        void arg0;
        if (bigInteger == null || arg0.signum() < 0 || arg0.compareTo(cfr_renamed_119) >= 0) {
            throw new IllegalArgumentException(sprmvr.cfr_renamed_9("\u001b6\u0015w\u000fc\u00066\nx\u0015w\u000f\u007f\u00076\u0005y\u001160[QFQ#U@RP\ns\u000fr&z\u0006{\u0006x\u0017"));
        }
        this.cfr_renamed_112 = sprxxh.cfr_renamed_1652((BigInteger)arg0);
    }

    @Override
    public boolean cfr_renamed_805() {
        return sprmeh.cfr_renamed_1660(this.cfr_renamed_112);
    }

    @Override
    public sprlsh cfr_renamed_8663(sprlsh arg0) {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprxxh.cfr_renamed_1654(this.cfr_renamed_112, ((sprwnh)arg0).cfr_renamed_112, nArray);
        return new sprwnh(nArray);
    }

    @Override
    public BigInteger cfr_renamed_1779() {
        return sprmeh.cfr_renamed_1651(this.cfr_renamed_112);
    }

    @Override
    public sprlsh cfr_renamed_8682(sprlsh arg0) {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprxxh.cfr_renamed_2022(this.cfr_renamed_112, ((sprwnh)arg0).cfr_renamed_112, nArray);
        return new sprwnh(nArray);
    }

    @Override
    public boolean cfr_renamed_1930() {
        return sprmeh.cfr_renamed_1662(this.cfr_renamed_112, 0) == 1;
    }

    @Override
    public String cfr_renamed_1985() {
        return sprpzy.cfr_renamed_9("\fzmgm\u0002ianq6R3S");
    }

    @Override
    public sprlsh cfr_renamed_8936(sprlsh arg0) {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprxxh.cfr_renamed_8805(((sprwnh)arg0).cfr_renamed_112, nArray);
        sprxxh.cfr_renamed_2022(nArray, this.cfr_renamed_112, nArray);
        return new sprwnh(nArray);
    }

    public int hashCode() {
        return cfr_renamed_119.hashCode() ^ sproze.cfr_renamed_536(this.cfr_renamed_112, 0, 8);
    }

    public sprwnh(int[] nArray) {
        this.cfr_renamed_112 = nArray;
    }

    @Override
    public sprlsh cfr_renamed_8934(sprlsh arg0) {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprxxh.cfr_renamed_2021(this.cfr_renamed_112, ((sprwnh)arg0).cfr_renamed_112, nArray);
        return new sprwnh(nArray);
    }

    @Override
    public sprlsh cfr_renamed_1048() {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprxxh.cfr_renamed_1627(this.cfr_renamed_112, nArray);
        return new sprwnh(nArray);
    }

    @Override
    public sprlsh cfr_renamed_1773() {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprxxh.cfr_renamed_2027(this.cfr_renamed_112, nArray);
        return new sprwnh(nArray);
    }

    @Override
    public sprlsh cfr_renamed_1817() {
        int[] nArray = this.cfr_renamed_112;
        if (sprmeh.cfr_renamed_1660(this.cfr_renamed_112) || sprmeh.cfr_renamed_1659(nArray)) {
            return this;
        }
        int[] nArray2 = sprmeh.cfr_renamed_1631();
        sprxxh.cfr_renamed_1627(nArray, nArray2);
        sprxxh.cfr_renamed_2022(nArray2, nArray, nArray2);
        int[] nArray3 = sprmeh.cfr_renamed_1631();
        sprxxh.cfr_renamed_2026(nArray2, 2, nArray3);
        int[] nArray4 = nArray3;
        sprxxh.cfr_renamed_2022(nArray3, nArray2, nArray4);
        int[] nArray5 = sprmeh.cfr_renamed_1631();
        sprxxh.cfr_renamed_2026(nArray4, 2, nArray5);
        sprxxh.cfr_renamed_2022(nArray5, nArray2, nArray5);
        int[] nArray6 = nArray2;
        sprxxh.cfr_renamed_2026(nArray5, 6, nArray6);
        sprxxh.cfr_renamed_2022(nArray6, nArray5, nArray6);
        int[] nArray7 = sprmeh.cfr_renamed_1631();
        sprxxh.cfr_renamed_2026(nArray2, 12, nArray7);
        sprxxh.cfr_renamed_2022(nArray7, nArray6, nArray7);
        int[] nArray8 = nArray2;
        sprxxh.cfr_renamed_2026(nArray7, 6, nArray8);
        sprxxh.cfr_renamed_2022(nArray8, nArray5, nArray8);
        int[] nArray9 = nArray5;
        sprxxh.cfr_renamed_1627(nArray8, nArray9);
        sprxxh.cfr_renamed_2022(nArray9, nArray, nArray9);
        int[] nArray10 = nArray7;
        sprxxh.cfr_renamed_2026(nArray9, 31, nArray10);
        int[] nArray11 = nArray8;
        int[] nArray12 = nArray10;
        int[] nArray13 = nArray10;
        int[] nArray14 = nArray10;
        int[] nArray15 = nArray10;
        sprxxh.cfr_renamed_2022(nArray10, nArray9, nArray11);
        sprxxh.cfr_renamed_2026(nArray15, 32, nArray10);
        sprxxh.cfr_renamed_2022(nArray15, nArray11, nArray10);
        sprxxh.cfr_renamed_2026(nArray14, 62, nArray10);
        sprxxh.cfr_renamed_2022(nArray14, nArray11, nArray10);
        sprxxh.cfr_renamed_2026(nArray13, 4, nArray10);
        sprxxh.cfr_renamed_2022(nArray13, nArray3, nArray10);
        sprxxh.cfr_renamed_2026(nArray12, 32, nArray10);
        sprxxh.cfr_renamed_2022(nArray12, nArray, nArray10);
        sprxxh.cfr_renamed_2026(nArray10, 62, nArray10);
        int[] nArray16 = nArray3;
        sprxxh.cfr_renamed_1627(nArray10, nArray16);
        if (sprmeh.cfr_renamed_1648(nArray, nArray16)) {
            return new sprwnh(nArray10);
        }
        return null;
    }

    @Override
    public sprlsh cfr_renamed_952() {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprxxh.cfr_renamed_8805(this.cfr_renamed_112, nArray);
        return new sprwnh(nArray);
    }

    @Override
    public sprlsh cfr_renamed_1908() {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprxxh.cfr_renamed_2025(this.cfr_renamed_112, nArray);
        return new sprwnh(nArray);
    }

    @Override
    public boolean cfr_renamed_287() {
        return sprmeh.cfr_renamed_1659(this.cfr_renamed_112);
    }
}

