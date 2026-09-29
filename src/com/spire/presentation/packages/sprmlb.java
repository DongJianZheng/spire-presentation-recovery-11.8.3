/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprecia;
import com.spire.presentation.packages.sprfob;
import com.spire.presentation.packages.sprmob;
import com.spire.presentation.packages.sprqlb;
import com.spire.presentation.packages.sprujb;
import com.spire.presentation.packages.sprwtb;
import com.spire.presentation.packages.sprxgk;
import com.spire.presentation.packages.sprzra;
import java.math.BigInteger;

public class sprmlb
extends sprwtb {
    public int[] cfr_renamed_119;
    public static final BigInteger cfr_renamed_91 = sprmob.cfr_renamed_3;

    @Override
    public String cfr_renamed_1985() {
        return sprxgk.cfr_renamed_9("bfRS\u0000:\u0003Q\u0000EXf]g");
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprmlb)) {
            return false;
        }
        sprmlb sprmlb2 = (sprmlb)arg0;
        return sprqlb.cfr_renamed_1648(this.cfr_renamed_119, sprmlb2.cfr_renamed_119);
    }

    @Override
    public boolean cfr_renamed_805() {
        return sprqlb.cfr_renamed_1660(this.cfr_renamed_119);
    }

    @Override
    public sprwtb cfr_renamed_1817() {
        int[] nArray = this.cfr_renamed_119;
        if (sprqlb.cfr_renamed_1660(this.cfr_renamed_119) || sprqlb.cfr_renamed_1659(nArray)) {
            return this;
        }
        int[] nArray2 = sprqlb.cfr_renamed_1631();
        int[] nArray3 = sprqlb.cfr_renamed_1631();
        sprujb.cfr_renamed_1627(nArray, nArray2);
        int[] nArray4 = nArray2;
        int[] nArray5 = nArray2;
        int[] nArray6 = nArray2;
        sprujb.cfr_renamed_2022(nArray2, nArray, nArray2);
        sprujb.cfr_renamed_2026(nArray6, 2, nArray3);
        sprujb.cfr_renamed_2022(nArray3, nArray2, nArray3);
        sprujb.cfr_renamed_2026(nArray3, 4, nArray2);
        sprujb.cfr_renamed_2022(nArray6, nArray3, nArray2);
        sprujb.cfr_renamed_2026(nArray5, 8, nArray3);
        sprujb.cfr_renamed_2022(nArray3, nArray2, nArray3);
        sprujb.cfr_renamed_2026(nArray3, 16, nArray2);
        sprujb.cfr_renamed_2022(nArray5, nArray3, nArray2);
        sprujb.cfr_renamed_2026(nArray4, 32, nArray3);
        sprujb.cfr_renamed_2022(nArray3, nArray2, nArray3);
        sprujb.cfr_renamed_2026(nArray3, 64, nArray2);
        sprujb.cfr_renamed_2022(nArray4, nArray3, nArray2);
        sprujb.cfr_renamed_2026(nArray2, 62, nArray2);
        sprujb.cfr_renamed_1627(nArray2, nArray3);
        if (sprqlb.cfr_renamed_1648(nArray, nArray3)) {
            return new sprmlb(nArray2);
        }
        return null;
    }

    @Override
    public boolean cfr_renamed_287() {
        return sprqlb.cfr_renamed_1659(this.cfr_renamed_119);
    }

    public sprmlb(int[] nArray) {
        this.cfr_renamed_119 = nArray;
    }

    public sprmlb() {
        this.cfr_renamed_119 = sprqlb.cfr_renamed_1631();
    }

    /*
     * WARNING - void declaration
     */
    public sprmlb(BigInteger bigInteger) {
        void arg0;
        if (bigInteger == null || arg0.signum() < 0 || arg0.compareTo(cfr_renamed_91) >= 0) {
            throw new IllegalArgumentException(sprecia.cfr_renamed_9("\u0013w\u001d6\u0007\"\u000ew\u00029\u001d6\u0007>\u000fw\r8\u0019w82\b\u0007ZnY\u0005Z\u0011\u00022\u00073.;\u000e:\u000e9\u001f"));
        }
        this.cfr_renamed_119 = sprujb.cfr_renamed_1652((BigInteger)arg0);
    }

    @Override
    public boolean cfr_renamed_1930() {
        return sprqlb.cfr_renamed_1662(this.cfr_renamed_119, 0) == 1;
    }

    @Override
    public sprwtb cfr_renamed_1984(sprwtb arg0) {
        int[] nArray = sprqlb.cfr_renamed_1631();
        sprfob.cfr_renamed_1760(sprujb.cfr_renamed_1, ((sprmlb)arg0).cfr_renamed_119, nArray);
        sprujb.cfr_renamed_2022(nArray, this.cfr_renamed_119, nArray);
        return new sprmlb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_1983(sprwtb arg0) {
        int[] nArray = sprqlb.cfr_renamed_1631();
        sprujb.cfr_renamed_1654(this.cfr_renamed_119, ((sprmlb)arg0).cfr_renamed_119, nArray);
        return new sprmlb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_1986(sprwtb arg0) {
        int[] nArray = sprqlb.cfr_renamed_1631();
        sprujb.cfr_renamed_2021(this.cfr_renamed_119, ((sprmlb)arg0).cfr_renamed_119, nArray);
        return new sprmlb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_1773() {
        int[] nArray = sprqlb.cfr_renamed_1631();
        sprujb.cfr_renamed_2027(this.cfr_renamed_119, nArray);
        return new sprmlb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_1833(sprwtb arg0) {
        int[] nArray = sprqlb.cfr_renamed_1631();
        sprujb.cfr_renamed_2022(this.cfr_renamed_119, ((sprmlb)arg0).cfr_renamed_119, nArray);
        return new sprmlb(nArray);
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_91.bitLength();
    }

    @Override
    public BigInteger cfr_renamed_1779() {
        return sprqlb.cfr_renamed_1651(this.cfr_renamed_119);
    }

    @Override
    public sprwtb cfr_renamed_952() {
        int[] nArray = sprqlb.cfr_renamed_1631();
        sprfob.cfr_renamed_1760(sprujb.cfr_renamed_1, this.cfr_renamed_119, nArray);
        return new sprmlb(nArray);
    }

    public int hashCode() {
        return cfr_renamed_91.hashCode() ^ sprzra.cfr_renamed_536(this.cfr_renamed_119, 0, 6);
    }

    @Override
    public sprwtb cfr_renamed_1048() {
        int[] nArray = sprqlb.cfr_renamed_1631();
        sprujb.cfr_renamed_1627(this.cfr_renamed_119, nArray);
        return new sprmlb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_1908() {
        int[] nArray = sprqlb.cfr_renamed_1631();
        sprujb.cfr_renamed_2025(this.cfr_renamed_119, nArray);
        return new sprmlb(nArray);
    }
}

