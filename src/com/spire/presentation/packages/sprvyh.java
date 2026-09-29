/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbsh;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sproyh;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrrh;
import com.spire.presentation.packages.sprvaz;
import com.spire.presentation.packages.sprvih;
import java.math.BigInteger;

public class sprvyh
extends sprrrh {
    public int[] cfr_renamed_112;
    public static final BigInteger cfr_renamed_119 = new BigInteger(1, sprfqe.cfr_renamed_5217(sprvaz.cfr_renamed_9("-\u0005-\u0005-\u0005-\u0005-\u0005-\u0005-\u0005-\u0005-\u0005-\u0005-\u0005-\u0005-\u0005-\u0005-\u0005-\u0005-\u0005-\u0005-\u0005-\u0005-\u0005-\u0005-\u0005-\u0005-\u0005-\u0005-\u0005-\u0005-\u0005-\u0005-\u0005-\u0006-\u0005-\u0005-\u0005-\u0005[s[s[s[s[s[s[s[s-\u0005-\u0005-\u0005-\u0005")));

    public sprvyh(int[] nArray) {
        this.cfr_renamed_112 = nArray;
    }

    @Override
    public BigInteger cfr_renamed_1779() {
        return sprvih.cfr_renamed_1704(12, this.cfr_renamed_112);
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_119.bitLength();
    }

    @Override
    public boolean cfr_renamed_1930() {
        return sprvih.cfr_renamed_1662(this.cfr_renamed_112, 0) == 1;
    }

    @Override
    public String cfr_renamed_1985() {
        return sproyh.cfr_renamed_9("E\u001fu*%B\"('<\u007f\u001fz\u001e");
    }

    public int hashCode() {
        return cfr_renamed_119.hashCode() ^ sproze.cfr_renamed_536(this.cfr_renamed_112, 0, 12);
    }

    @Override
    public sprlsh cfr_renamed_1817() {
        int[] nArray = this.cfr_renamed_112;
        if (sprvih.cfr_renamed_1737(12, nArray) || sprvih.cfr_renamed_1710(12, nArray)) {
            return this;
        }
        int[] nArray2 = sprvih.cfr_renamed_1716(24);
        int[] nArray3 = sprvih.cfr_renamed_1716(12);
        int[] nArray4 = sprvih.cfr_renamed_1716(12);
        int[] nArray5 = sprvih.cfr_renamed_1716(12);
        int[] nArray6 = sprvih.cfr_renamed_1716(12);
        sprbsh.cfr_renamed_8992(nArray, nArray3, nArray2);
        sprbsh.cfr_renamed_8993(nArray3, nArray, nArray3, nArray2);
        sprbsh.cfr_renamed_8999(nArray3, 2, nArray4, nArray2);
        int[] nArray7 = nArray4;
        sprbsh.cfr_renamed_8993(nArray4, nArray3, nArray4, nArray2);
        sprbsh.cfr_renamed_8992(nArray4, nArray4, nArray2);
        sprbsh.cfr_renamed_8993(nArray7, nArray, nArray4, nArray2);
        sprbsh.cfr_renamed_8999(nArray7, 5, nArray5, nArray2);
        sprbsh.cfr_renamed_8993(nArray5, nArray4, nArray5, nArray2);
        sprbsh.cfr_renamed_8999(nArray5, 5, nArray6, nArray2);
        sprbsh.cfr_renamed_8993(nArray6, nArray4, nArray6, nArray2);
        sprbsh.cfr_renamed_8999(nArray6, 15, nArray4, nArray2);
        sprbsh.cfr_renamed_8993(nArray4, nArray6, nArray4, nArray2);
        sprbsh.cfr_renamed_8999(nArray4, 2, nArray5, nArray2);
        sprbsh.cfr_renamed_8993(nArray3, nArray5, nArray3, nArray2);
        int[] nArray8 = nArray5;
        sprbsh.cfr_renamed_8999(nArray5, 28, nArray8, nArray2);
        sprbsh.cfr_renamed_8993(nArray4, nArray5, nArray4, nArray2);
        sprbsh.cfr_renamed_8999(nArray4, 60, nArray5, nArray2);
        sprbsh.cfr_renamed_8993(nArray5, nArray4, nArray8, nArray2);
        int[] nArray9 = nArray4;
        sprbsh.cfr_renamed_8999(nArray5, 120, nArray9, nArray2);
        int[] nArray10 = nArray9;
        int[] nArray11 = nArray9;
        int[] nArray12 = nArray9;
        sprbsh.cfr_renamed_8993(nArray12, nArray5, nArray9, nArray2);
        sprbsh.cfr_renamed_8999(nArray9, 15, nArray9, nArray2);
        sprbsh.cfr_renamed_8993(nArray11, nArray6, nArray12, nArray2);
        sprbsh.cfr_renamed_8999(nArray9, 33, nArray9, nArray2);
        sprbsh.cfr_renamed_8993(nArray10, nArray3, nArray11, nArray2);
        sprbsh.cfr_renamed_8999(nArray9, 64, nArray9, nArray2);
        sprbsh.cfr_renamed_8993(nArray9, nArray, nArray10, nArray2);
        sprbsh.cfr_renamed_8999(nArray9, 30, nArray3, nArray2);
        sprbsh.cfr_renamed_8992(nArray3, nArray4, nArray2);
        if (sprvih.cfr_renamed_1743(12, nArray, nArray4)) {
            return new sprvyh(nArray3);
        }
        return null;
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprvyh)) {
            return false;
        }
        sprvyh sprvyh2 = (sprvyh)arg0;
        return sprvih.cfr_renamed_1743(12, this.cfr_renamed_112, sprvyh2.cfr_renamed_112);
    }

    /*
     * WARNING - void declaration
     */
    public sprvyh(BigInteger bigInteger) {
        void arg0;
        if (bigInteger == null || arg0.signum() < 0 || arg0.compareTo(cfr_renamed_119) >= 0) {
            throw new IllegalArgumentException(sproyh.cfr_renamed_9("\u00026\fw\u0016c\u001f6\u0013x\fw\u0016\u007f\u001e6\u001cy\b6)s\u0019FI.NDKP\u0013s\u0016r?z\u001f{\u001fx\u000e"));
        }
        this.cfr_renamed_112 = sprbsh.cfr_renamed_1652((BigInteger)arg0);
    }

    @Override
    public sprlsh cfr_renamed_8663(sprlsh arg0) {
        int[] nArray = sprvih.cfr_renamed_1716(12);
        sprbsh.cfr_renamed_1654(this.cfr_renamed_112, ((sprvyh)arg0).cfr_renamed_112, nArray);
        return new sprvyh(nArray);
    }

    public sprvyh() {
        this.cfr_renamed_112 = sprvih.cfr_renamed_1716(12);
    }

    @Override
    public sprlsh cfr_renamed_952() {
        int[] nArray = sprvih.cfr_renamed_1716(12);
        sprbsh.cfr_renamed_8805(this.cfr_renamed_112, nArray);
        return new sprvyh(nArray);
    }

    @Override
    public boolean cfr_renamed_287() {
        return sprvih.cfr_renamed_1710(12, this.cfr_renamed_112);
    }

    @Override
    public sprlsh cfr_renamed_8936(sprlsh arg0) {
        int[] nArray = sprvih.cfr_renamed_1716(12);
        sprbsh.cfr_renamed_8805(((sprvyh)arg0).cfr_renamed_112, nArray);
        sprbsh.cfr_renamed_2022(nArray, this.cfr_renamed_112, nArray);
        return new sprvyh(nArray);
    }

    @Override
    public sprlsh cfr_renamed_8682(sprlsh arg0) {
        int[] nArray = sprvih.cfr_renamed_1716(12);
        sprbsh.cfr_renamed_2022(this.cfr_renamed_112, ((sprvyh)arg0).cfr_renamed_112, nArray);
        return new sprvyh(nArray);
    }

    @Override
    public sprlsh cfr_renamed_8934(sprlsh arg0) {
        int[] nArray = sprvih.cfr_renamed_1716(12);
        sprbsh.cfr_renamed_2021(this.cfr_renamed_112, ((sprvyh)arg0).cfr_renamed_112, nArray);
        return new sprvyh(nArray);
    }

    @Override
    public sprlsh cfr_renamed_1773() {
        int[] nArray = sprvih.cfr_renamed_1716(12);
        sprbsh.cfr_renamed_2027(this.cfr_renamed_112, nArray);
        return new sprvyh(nArray);
    }

    @Override
    public boolean cfr_renamed_805() {
        return sprvih.cfr_renamed_1737(12, this.cfr_renamed_112);
    }

    @Override
    public sprlsh cfr_renamed_1908() {
        int[] nArray = sprvih.cfr_renamed_1716(12);
        sprbsh.cfr_renamed_2025(this.cfr_renamed_112, nArray);
        return new sprvyh(nArray);
    }

    @Override
    public sprlsh cfr_renamed_1048() {
        int[] nArray = sprvih.cfr_renamed_1716(12);
        sprbsh.cfr_renamed_1627(this.cfr_renamed_112, nArray);
        return new sprvyh(nArray);
    }
}

