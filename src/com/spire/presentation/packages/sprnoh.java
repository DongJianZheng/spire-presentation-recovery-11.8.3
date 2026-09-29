/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyh;
import com.spire.presentation.packages.sprjsh;
import com.spire.presentation.packages.sprlfk;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrnr;
import com.spire.presentation.packages.sprvih;
import com.spire.presentation.packages.sprweh;
import java.math.BigInteger;

public class sprnoh
extends sprcyh {
    public long[] cfr_renamed_4;

    public int cfr_renamed_1536() {
        return 2;
    }

    @Override
    public sprlsh cfr_renamed_8932(sprlsh arg0, sprlsh arg1, sprlsh arg2) {
        long[] lArray = this.cfr_renamed_4;
        long[] lArray2 = ((sprnoh)arg0).cfr_renamed_4;
        long[] lArray3 = ((sprnoh)arg1).cfr_renamed_4;
        long[] lArray4 = ((sprnoh)arg2).cfr_renamed_4;
        long[] lArray5 = sprvih.cfr_renamed_8558(13);
        sprjsh.cfr_renamed_8966(lArray, lArray2, lArray5);
        sprjsh.cfr_renamed_8966(lArray3, lArray4, lArray5);
        long[] lArray6 = sprweh.cfr_renamed_8534();
        sprjsh.cfr_renamed_6593(lArray5, lArray6);
        return new sprnoh(lArray6);
    }

    @Override
    public boolean cfr_renamed_805() {
        return sprweh.cfr_renamed_8540(this.cfr_renamed_4);
    }

    @Override
    public String cfr_renamed_1985() {
        return sprlfk.cfr_renamed_9("p9@\b\u0017l\u001a\u001aJ9O8");
    }

    @Override
    public sprlsh cfr_renamed_1817() {
        long[] lArray = sprweh.cfr_renamed_8534();
        sprjsh.cfr_renamed_8973(this.cfr_renamed_4, lArray);
        return new sprnoh(lArray);
    }

    @Override
    public sprlsh cfr_renamed_1773() {
        return this;
    }

    @Override
    public sprlsh cfr_renamed_1047() {
        long[] lArray = sprweh.cfr_renamed_8534();
        sprjsh.cfr_renamed_8970(this.cfr_renamed_4, lArray);
        return new sprnoh(lArray);
    }

    public int cfr_renamed_2117() {
        return 0;
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprnoh)) {
            return false;
        }
        sprnoh sprnoh2 = (sprnoh)arg0;
        return sprweh.cfr_renamed_8535(this.cfr_renamed_4, sprnoh2.cfr_renamed_4);
    }

    @Override
    public sprlsh cfr_renamed_8682(sprlsh arg0) {
        long[] lArray = sprweh.cfr_renamed_8534();
        sprjsh.cfr_renamed_7200(this.cfr_renamed_4, ((sprnoh)arg0).cfr_renamed_4, lArray);
        return new sprnoh(lArray);
    }

    public int hashCode() {
        return 0x3E68E7 ^ sproze.cfr_renamed_5237(this.cfr_renamed_4, 0, 7);
    }

    @Override
    public sprlsh cfr_renamed_8935(sprlsh arg0, sprlsh arg1, sprlsh arg2) {
        return this.cfr_renamed_8932(arg0, arg1, arg2);
    }

    @Override
    public sprlsh cfr_renamed_8663(sprlsh arg0) {
        long[] lArray = sprweh.cfr_renamed_8534();
        sprjsh.cfr_renamed_7206(this.cfr_renamed_4, ((sprnoh)arg0).cfr_renamed_4, lArray);
        return new sprnoh(lArray);
    }

    @Override
    public sprlsh cfr_renamed_8933(sprlsh arg0, sprlsh arg1) {
        return this.cfr_renamed_8931(arg0, arg1);
    }

    public sprnoh(long[] lArray) {
        this.cfr_renamed_4 = lArray;
    }

    @Override
    public int cfr_renamed_1051() {
        return sprjsh.cfr_renamed_8974(this.cfr_renamed_4);
    }

    @Override
    public boolean cfr_renamed_1930() {
        return (this.cfr_renamed_4[0] & 1L) != 0L;
    }

    @Override
    public sprlsh cfr_renamed_1908() {
        long[] lArray = sprweh.cfr_renamed_8534();
        sprjsh.cfr_renamed_8969(this.cfr_renamed_4, lArray);
        return new sprnoh(lArray);
    }

    @Override
    public boolean cfr_renamed_8972() {
        return true;
    }

    @Override
    public sprlsh cfr_renamed_8936(sprlsh arg0) {
        return this.cfr_renamed_8682(arg0.cfr_renamed_952());
    }

    @Override
    public sprlsh cfr_renamed_8931(sprlsh arg0, sprlsh arg1) {
        long[] lArray = this.cfr_renamed_4;
        long[] lArray2 = ((sprnoh)arg0).cfr_renamed_4;
        long[] lArray3 = ((sprnoh)arg1).cfr_renamed_4;
        long[] lArray4 = sprvih.cfr_renamed_8558(13);
        sprjsh.cfr_renamed_8965(lArray, lArray4);
        sprjsh.cfr_renamed_8966(lArray2, lArray3, lArray4);
        long[] lArray5 = sprweh.cfr_renamed_8534();
        sprjsh.cfr_renamed_6593(lArray4, lArray5);
        return new sprnoh(lArray5);
    }

    public sprnoh() {
        this.cfr_renamed_4 = sprweh.cfr_renamed_8534();
    }

    @Override
    public boolean cfr_renamed_287() {
        return sprweh.cfr_renamed_8541(this.cfr_renamed_4);
    }

    @Override
    public sprlsh cfr_renamed_8662(int arg0) {
        if (arg0 < 1) {
            return this;
        }
        long[] lArray = sprweh.cfr_renamed_8534();
        sprjsh.cfr_renamed_7209(this.cfr_renamed_4, arg0, lArray);
        return new sprnoh(lArray);
    }

    public int cfr_renamed_2116() {
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    public sprnoh(BigInteger bigInteger) {
        void arg0;
        if (bigInteger == null || arg0.signum() < 0 || arg0.bitLength() > 409) {
            throw new IllegalArgumentException(sprrnr.cfr_renamed_9("=\u000e3O)[ \u000e,@3O)G!\u000e#A7\u000e\u0016K&zq\u001e|h,K)J\u0000B C @1"));
        }
        this.cfr_renamed_4 = sprjsh.cfr_renamed_1652((BigInteger)arg0);
    }

    public int cfr_renamed_2115() {
        return 87;
    }

    public int cfr_renamed_1186() {
        return 409;
    }

    @Override
    public sprlsh cfr_renamed_952() {
        long[] lArray = sprweh.cfr_renamed_8534();
        sprjsh.cfr_renamed_8971(this.cfr_renamed_4, lArray);
        return new sprnoh(lArray);
    }

    @Override
    public sprlsh cfr_renamed_8934(sprlsh arg0) {
        return this.cfr_renamed_8663(arg0);
    }

    @Override
    public BigInteger cfr_renamed_1779() {
        return sprweh.cfr_renamed_8542(this.cfr_renamed_4);
    }

    @Override
    public sprlsh cfr_renamed_1048() {
        long[] lArray = sprweh.cfr_renamed_8534();
        sprjsh.cfr_renamed_7210(this.cfr_renamed_4, lArray);
        return new sprnoh(lArray);
    }

    @Override
    public int cfr_renamed_1938() {
        return 409;
    }
}

