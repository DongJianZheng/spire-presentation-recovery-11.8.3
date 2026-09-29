/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprakia;
import com.spire.presentation.packages.sprdyg;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprnth;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrrh;
import com.spire.presentation.packages.sprvih;
import java.math.BigInteger;

public class sprwph
extends sprrrh {
    public static final BigInteger cfr_renamed_119 = new BigInteger(1, sprfqe.cfr_renamed_5217(sprakia.cfr_renamed_9("\u0005Xs/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/s/")));
    public int[] cfr_renamed_4;

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprwph)) {
            return false;
        }
        sprwph sprwph2 = (sprwph)arg0;
        return sprvih.cfr_renamed_1743(17, this.cfr_renamed_4, sprwph2.cfr_renamed_4);
    }

    @Override
    public sprlsh cfr_renamed_952() {
        int[] nArray = sprvih.cfr_renamed_1716(17);
        sprnth.cfr_renamed_8805(this.cfr_renamed_4, nArray);
        return new sprwph(nArray);
    }

    @Override
    public boolean cfr_renamed_805() {
        return sprvih.cfr_renamed_1737(17, this.cfr_renamed_4);
    }

    @Override
    public boolean cfr_renamed_287() {
        return sprvih.cfr_renamed_1710(17, this.cfr_renamed_4);
    }

    @Override
    public sprlsh cfr_renamed_8682(sprlsh arg0) {
        int[] nArray = sprvih.cfr_renamed_1716(17);
        sprnth.cfr_renamed_2022(this.cfr_renamed_4, ((sprwph)arg0).cfr_renamed_4, nArray);
        return new sprwph(nArray);
    }

    public sprwph(int[] nArray) {
        this.cfr_renamed_4 = nArray;
    }

    @Override
    public sprlsh cfr_renamed_1773() {
        int[] nArray = sprvih.cfr_renamed_1716(17);
        sprnth.cfr_renamed_2027(this.cfr_renamed_4, nArray);
        return new sprwph(nArray);
    }

    @Override
    public sprlsh cfr_renamed_1908() {
        int[] nArray = sprvih.cfr_renamed_1716(17);
        sprnth.cfr_renamed_2025(this.cfr_renamed_4, nArray);
        return new sprwph(nArray);
    }

    @Override
    public sprlsh cfr_renamed_8663(sprlsh arg0) {
        int[] nArray = sprvih.cfr_renamed_1716(17);
        sprnth.cfr_renamed_1654(this.cfr_renamed_4, ((sprwph)arg0).cfr_renamed_4, nArray);
        return new sprwph(nArray);
    }

    @Override
    public BigInteger cfr_renamed_1779() {
        return sprvih.cfr_renamed_1704(17, this.cfr_renamed_4);
    }

    @Override
    public sprlsh cfr_renamed_1048() {
        int[] nArray = sprvih.cfr_renamed_1716(17);
        sprnth.cfr_renamed_1627(this.cfr_renamed_4, nArray);
        return new sprwph(nArray);
    }

    @Override
    public boolean cfr_renamed_1930() {
        return sprvih.cfr_renamed_1662(this.cfr_renamed_4, 0) == 1;
    }

    @Override
    public sprlsh cfr_renamed_8936(sprlsh arg0) {
        int[] nArray = sprvih.cfr_renamed_1716(17);
        sprnth.cfr_renamed_8805(((sprwph)arg0).cfr_renamed_4, nArray);
        sprnth.cfr_renamed_2022(nArray, this.cfr_renamed_4, nArray);
        return new sprwph(nArray);
    }

    public sprwph() {
        this.cfr_renamed_4 = sprvih.cfr_renamed_1716(17);
    }

    @Override
    public sprlsh cfr_renamed_8934(sprlsh arg0) {
        int[] nArray = sprvih.cfr_renamed_1716(17);
        sprnth.cfr_renamed_2021(this.cfr_renamed_4, ((sprwph)arg0).cfr_renamed_4, nArray);
        return new sprwph(nArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprwph(BigInteger bigInteger) {
        void arg0;
        if (bigInteger == null || arg0.signum() < 0 || arg0.compareTo(cfr_renamed_119) >= 0) {
            throw new IllegalArgumentException(sprdyg.cfr_renamed_9("\n\u0010\u0004Q\u001eE\u0017\u0010\u001b^\u0004Q\u001eY\u0016\u0010\u0014_\u0000\u0010!U\u0011`G\u0002CbCv\u001bU\u001eT7\\\u0017]\u0017^\u0006"));
        }
        this.cfr_renamed_4 = sprnth.cfr_renamed_1652((BigInteger)arg0);
    }

    @Override
    public sprlsh cfr_renamed_1817() {
        int[] nArray = this.cfr_renamed_4;
        if (sprvih.cfr_renamed_1737(17, nArray) || sprvih.cfr_renamed_1710(17, nArray)) {
            return this;
        }
        int[] nArray2 = sprvih.cfr_renamed_1716(33);
        int[] nArray3 = sprvih.cfr_renamed_1716(17);
        int[] nArray4 = sprvih.cfr_renamed_1716(17);
        sprnth.cfr_renamed_8999(nArray, 519, nArray3, nArray2);
        sprnth.cfr_renamed_8992(nArray3, nArray4, nArray2);
        if (sprvih.cfr_renamed_1743(17, nArray, nArray4)) {
            return new sprwph(nArray3);
        }
        return null;
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_119.bitLength();
    }

    public int hashCode() {
        return cfr_renamed_119.hashCode() ^ sproze.cfr_renamed_536(this.cfr_renamed_4, 0, 17);
    }

    @Override
    public String cfr_renamed_1985() {
        return sprdyg.cfr_renamed_9("c\u0017S\"\u0005@\u0001 \u00014Y\u0017\\\u0016");
    }
}

