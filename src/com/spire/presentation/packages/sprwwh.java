/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmeh;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprppy;
import com.spire.presentation.packages.sprrrh;
import com.spire.presentation.packages.sprunh;
import com.spire.presentation.packages.sprzgg;
import java.math.BigInteger;

public class sprwwh
extends sprrrh {
    public static final BigInteger cfr_renamed_119 = new BigInteger(1, sprfqe.cfr_renamed_5217(sprppy.cfr_renamed_9("\u001fC\u001fC\u001fC\u001fCi5i5i5i4i5i5i5i5i5i5i5i5i5i5i5i5\u001fC\u001fC\u001fC\u001fC\u001fC\u001fC\u001fC\u001fC\u001fC\u001fC\u001fC\u001fC")));
    public int[] cfr_renamed_4;

    @Override
    public sprlsh cfr_renamed_952() {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprunh.cfr_renamed_8805(this.cfr_renamed_4, nArray);
        return new sprwwh(nArray);
    }

    @Override
    public sprlsh cfr_renamed_1773() {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprunh.cfr_renamed_2027(this.cfr_renamed_4, nArray);
        return new sprwwh(nArray);
    }

    public sprwwh(int[] nArray) {
        this.cfr_renamed_4 = nArray;
    }

    @Override
    public sprlsh cfr_renamed_8934(sprlsh arg0) {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprunh.cfr_renamed_2021(this.cfr_renamed_4, ((sprwwh)arg0).cfr_renamed_4, nArray);
        return new sprwwh(nArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprwwh(BigInteger bigInteger) {
        void arg0;
        if (bigInteger == null || arg0.signum() < 0 || arg0.compareTo(cfr_renamed_119) >= 0) {
            throw new IllegalArgumentException(sprzgg.cfr_renamed_9("\u0018\u0014\u0016U\fA\u0005\u0014\tZ\u0016U\f]\u0004\u0014\u0006[\u0012\u00143Q\u0003dR\u0001VfQr\tQ\fP%X\u0005Y\u0005Z\u0014"));
        }
        this.cfr_renamed_4 = sprunh.cfr_renamed_1652((BigInteger)arg0);
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_119.bitLength();
    }

    @Override
    public boolean cfr_renamed_1930() {
        return sprmeh.cfr_renamed_1662(this.cfr_renamed_4, 0) == 1;
    }

    @Override
    public sprlsh cfr_renamed_1048() {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprunh.cfr_renamed_1627(this.cfr_renamed_4, nArray);
        return new sprwwh(nArray);
    }

    public sprwwh() {
        this.cfr_renamed_4 = sprmeh.cfr_renamed_1631();
    }

    @Override
    public sprlsh cfr_renamed_8936(sprlsh arg0) {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprunh.cfr_renamed_8805(((sprwwh)arg0).cfr_renamed_4, nArray);
        sprunh.cfr_renamed_2022(nArray, this.cfr_renamed_4, nArray);
        return new sprwwh(nArray);
    }

    @Override
    public boolean cfr_renamed_287() {
        return sprmeh.cfr_renamed_1659(this.cfr_renamed_4);
    }

    @Override
    public sprlsh cfr_renamed_1817() {
        int[] nArray = this.cfr_renamed_4;
        if (sprmeh.cfr_renamed_1660(this.cfr_renamed_4) || sprmeh.cfr_renamed_1659(nArray)) {
            return this;
        }
        int[] nArray2 = sprmeh.cfr_renamed_1633();
        int[] nArray3 = sprmeh.cfr_renamed_1631();
        int[] nArray4 = sprmeh.cfr_renamed_1631();
        sprunh.cfr_renamed_8992(nArray, nArray3, nArray2);
        int[] nArray5 = nArray3;
        int[] nArray6 = nArray3;
        int[] nArray7 = nArray3;
        int[] nArray8 = nArray3;
        sprunh.cfr_renamed_8993(nArray3, nArray, nArray3, nArray2);
        sprunh.cfr_renamed_8999(nArray8, 2, nArray4, nArray2);
        sprunh.cfr_renamed_8993(nArray4, nArray3, nArray4, nArray2);
        sprunh.cfr_renamed_8999(nArray4, 4, nArray3, nArray2);
        sprunh.cfr_renamed_8993(nArray8, nArray4, nArray3, nArray2);
        sprunh.cfr_renamed_8999(nArray7, 8, nArray4, nArray2);
        sprunh.cfr_renamed_8993(nArray4, nArray3, nArray4, nArray2);
        sprunh.cfr_renamed_8999(nArray4, 16, nArray3, nArray2);
        sprunh.cfr_renamed_8993(nArray7, nArray4, nArray3, nArray2);
        sprunh.cfr_renamed_8999(nArray6, 32, nArray3, nArray2);
        sprunh.cfr_renamed_8993(nArray6, nArray, nArray3, nArray2);
        sprunh.cfr_renamed_8999(nArray5, 96, nArray3, nArray2);
        sprunh.cfr_renamed_8993(nArray5, nArray, nArray3, nArray2);
        sprunh.cfr_renamed_8999(nArray3, 94, nArray3, nArray2);
        sprunh.cfr_renamed_8992(nArray3, nArray4, nArray2);
        if (sprmeh.cfr_renamed_1648(nArray, nArray4)) {
            return new sprwwh(nArray3);
        }
        return null;
    }

    @Override
    public sprlsh cfr_renamed_8682(sprlsh arg0) {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprunh.cfr_renamed_2022(this.cfr_renamed_4, ((sprwwh)arg0).cfr_renamed_4, nArray);
        return new sprwwh(nArray);
    }

    @Override
    public sprlsh cfr_renamed_1908() {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprunh.cfr_renamed_2025(this.cfr_renamed_4, nArray);
        return new sprwwh(nArray);
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprwwh)) {
            return false;
        }
        sprwwh sprwwh2 = (sprwwh)arg0;
        return sprmeh.cfr_renamed_1648(this.cfr_renamed_4, sprwwh2.cfr_renamed_4);
    }

    @Override
    public sprlsh cfr_renamed_8663(sprlsh arg0) {
        int[] nArray = sprmeh.cfr_renamed_1631();
        sprunh.cfr_renamed_1654(this.cfr_renamed_4, ((sprwwh)arg0).cfr_renamed_4, nArray);
        return new sprwwh(nArray);
    }

    @Override
    public BigInteger cfr_renamed_1779() {
        return sprmeh.cfr_renamed_1651(this.cfr_renamed_4);
    }

    @Override
    public String cfr_renamed_1985() {
        return sprppy.cfr_renamed_9("\n`:Uk0oWhC0`5a");
    }

    public int hashCode() {
        return cfr_renamed_119.hashCode() ^ sproze.cfr_renamed_536(this.cfr_renamed_4, 0, 8);
    }

    @Override
    public boolean cfr_renamed_805() {
        return sprmeh.cfr_renamed_1660(this.cfr_renamed_4);
    }
}

