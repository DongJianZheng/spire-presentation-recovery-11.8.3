/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyh;
import com.spire.presentation.packages.sprinh;
import com.spire.presentation.packages.spripe;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sproyy;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprvih;
import com.spire.presentation.packages.sprvwh;
import java.math.BigInteger;

public class sprgsh
extends sprcyh {
    public long[] cfr_renamed_4;

    @Override
    public sprlsh cfr_renamed_1817() {
        long[] lArray = sprinh.cfr_renamed_8534();
        sprvwh.cfr_renamed_8973(this.cfr_renamed_4, lArray);
        return new sprgsh(lArray);
    }

    public int hashCode() {
        return 0x202F8 ^ sproze.cfr_renamed_5237(this.cfr_renamed_4, 0, 3);
    }

    public sprgsh() {
        this.cfr_renamed_4 = sprinh.cfr_renamed_8534();
    }

    @Override
    public String cfr_renamed_1985() {
        return sproyy.cfr_renamed_9("H.x\u001f*x*\rr.w/");
    }

    public int cfr_renamed_2115() {
        return 2;
    }

    @Override
    public boolean cfr_renamed_287() {
        return sprinh.cfr_renamed_8541(this.cfr_renamed_4);
    }

    @Override
    public sprlsh cfr_renamed_8662(int arg0) {
        if (arg0 < 1) {
            return this;
        }
        long[] lArray = sprinh.cfr_renamed_8534();
        sprvwh.cfr_renamed_7209(this.cfr_renamed_4, arg0, lArray);
        return new sprgsh(lArray);
    }

    @Override
    public int cfr_renamed_1051() {
        return sprvwh.cfr_renamed_8974(this.cfr_renamed_4);
    }

    @Override
    public sprlsh cfr_renamed_1773() {
        return this;
    }

    @Override
    public sprlsh cfr_renamed_1047() {
        long[] lArray = sprinh.cfr_renamed_8534();
        sprvwh.cfr_renamed_8970(this.cfr_renamed_4, lArray);
        return new sprgsh(lArray);
    }

    public int cfr_renamed_1536() {
        return 3;
    }

    @Override
    public sprlsh cfr_renamed_8935(sprlsh arg0, sprlsh arg1, sprlsh arg2) {
        return this.cfr_renamed_8932(arg0, arg1, arg2);
    }

    @Override
    public sprlsh cfr_renamed_1908() {
        long[] lArray = sprinh.cfr_renamed_8534();
        sprvwh.cfr_renamed_8969(this.cfr_renamed_4, lArray);
        return new sprgsh(lArray);
    }

    @Override
    public sprlsh cfr_renamed_8682(sprlsh arg0) {
        long[] lArray = sprinh.cfr_renamed_8534();
        sprvwh.cfr_renamed_7200(this.cfr_renamed_4, ((sprgsh)arg0).cfr_renamed_4, lArray);
        return new sprgsh(lArray);
    }

    @Override
    public sprlsh cfr_renamed_8931(sprlsh arg0, sprlsh arg1) {
        long[] lArray = this.cfr_renamed_4;
        long[] lArray2 = ((sprgsh)arg0).cfr_renamed_4;
        long[] lArray3 = ((sprgsh)arg1).cfr_renamed_4;
        long[] lArray4 = sprvih.cfr_renamed_8558(5);
        sprvwh.cfr_renamed_8965(lArray, lArray4);
        sprvwh.cfr_renamed_8966(lArray2, lArray3, lArray4);
        long[] lArray5 = sprinh.cfr_renamed_8534();
        sprvwh.cfr_renamed_6593(lArray4, lArray5);
        return new sprgsh(lArray5);
    }

    @Override
    public BigInteger cfr_renamed_1779() {
        return sprinh.cfr_renamed_8542(this.cfr_renamed_4);
    }

    @Override
    public sprlsh cfr_renamed_1048() {
        long[] lArray = sprinh.cfr_renamed_8534();
        sprvwh.cfr_renamed_7210(this.cfr_renamed_4, lArray);
        return new sprgsh(lArray);
    }

    public int cfr_renamed_2116() {
        return 8;
    }

    public sprgsh(long[] lArray) {
        this.cfr_renamed_4 = lArray;
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprgsh)) {
            return false;
        }
        sprgsh sprgsh2 = (sprgsh)arg0;
        return sprinh.cfr_renamed_8535(this.cfr_renamed_4, sprgsh2.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprgsh(BigInteger bigInteger) {
        void arg0;
        if (bigInteger == null || arg0.signum() < 0 || arg0.bitLength() > 131) {
            throw new IllegalArgumentException(spripe.cfr_renamed_9("3\u0018=Y'M.\u0018\"V=Y'Q/\u0018-W9\u0018\u0018](lz\u000bz~\"]'\\\u000eT.U.V?"));
        }
        this.cfr_renamed_4 = sprvwh.cfr_renamed_1652((BigInteger)arg0);
    }

    @Override
    public sprlsh cfr_renamed_8933(sprlsh arg0, sprlsh arg1) {
        return this.cfr_renamed_8931(arg0, arg1);
    }

    @Override
    public boolean cfr_renamed_805() {
        return sprinh.cfr_renamed_8540(this.cfr_renamed_4);
    }

    @Override
    public sprlsh cfr_renamed_8936(sprlsh arg0) {
        return this.cfr_renamed_8682(arg0.cfr_renamed_952());
    }

    @Override
    public sprlsh cfr_renamed_8932(sprlsh arg0, sprlsh arg1, sprlsh arg2) {
        long[] lArray = this.cfr_renamed_4;
        long[] lArray2 = ((sprgsh)arg0).cfr_renamed_4;
        long[] lArray3 = ((sprgsh)arg1).cfr_renamed_4;
        long[] lArray4 = ((sprgsh)arg2).cfr_renamed_4;
        long[] lArray5 = sprvih.cfr_renamed_8558(5);
        sprvwh.cfr_renamed_8966(lArray, lArray2, lArray5);
        sprvwh.cfr_renamed_8966(lArray3, lArray4, lArray5);
        long[] lArray6 = sprinh.cfr_renamed_8534();
        sprvwh.cfr_renamed_6593(lArray5, lArray6);
        return new sprgsh(lArray6);
    }

    @Override
    public sprlsh cfr_renamed_8663(sprlsh arg0) {
        long[] lArray = sprinh.cfr_renamed_8534();
        sprvwh.cfr_renamed_7206(this.cfr_renamed_4, ((sprgsh)arg0).cfr_renamed_4, lArray);
        return new sprgsh(lArray);
    }

    @Override
    public sprlsh cfr_renamed_8934(sprlsh arg0) {
        return this.cfr_renamed_8663(arg0);
    }

    @Override
    public boolean cfr_renamed_1930() {
        return (this.cfr_renamed_4[0] & 1L) != 0L;
    }

    @Override
    public int cfr_renamed_1938() {
        return 131;
    }

    public int cfr_renamed_1186() {
        return 131;
    }

    @Override
    public boolean cfr_renamed_8972() {
        return true;
    }

    @Override
    public sprlsh cfr_renamed_952() {
        long[] lArray = sprinh.cfr_renamed_8534();
        sprvwh.cfr_renamed_8971(this.cfr_renamed_4, lArray);
        return new sprgsh(lArray);
    }

    public int cfr_renamed_2117() {
        return 3;
    }
}

