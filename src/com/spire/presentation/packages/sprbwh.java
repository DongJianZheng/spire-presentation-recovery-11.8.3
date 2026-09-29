/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.SaveToImageOption;
import com.spire.presentation.packages.sprcyh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprlsy;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqyh;
import com.spire.presentation.packages.sprthh;
import java.math.BigInteger;

public class sprbwh
extends sprcyh {
    public long[] cfr_renamed_4;

    @Override
    public sprlsh cfr_renamed_1047() {
        long[] lArray = sprthh.cfr_renamed_8534();
        sprqyh.cfr_renamed_8970(this.cfr_renamed_4, lArray);
        return new sprbwh(lArray);
    }

    @Override
    public boolean cfr_renamed_287() {
        return sprthh.cfr_renamed_8541(this.cfr_renamed_4);
    }

    @Override
    public int cfr_renamed_1051() {
        return sprqyh.cfr_renamed_8974(this.cfr_renamed_4);
    }

    @Override
    public sprlsh cfr_renamed_1773() {
        return this;
    }

    @Override
    public sprlsh cfr_renamed_8935(sprlsh arg0, sprlsh arg1, sprlsh arg2) {
        return this.cfr_renamed_8932(arg0, arg1, arg2);
    }

    @Override
    public sprlsh cfr_renamed_8932(sprlsh arg0, sprlsh arg1, sprlsh arg2) {
        long[] lArray = this.cfr_renamed_4;
        long[] lArray2 = ((sprbwh)arg0).cfr_renamed_4;
        long[] lArray3 = ((sprbwh)arg1).cfr_renamed_4;
        long[] lArray4 = ((sprbwh)arg2).cfr_renamed_4;
        long[] lArray5 = sprthh.cfr_renamed_8536();
        sprqyh.cfr_renamed_8966(lArray, lArray2, lArray5);
        sprqyh.cfr_renamed_8966(lArray3, lArray4, lArray5);
        long[] lArray6 = sprthh.cfr_renamed_8534();
        sprqyh.cfr_renamed_6593(lArray5, lArray6);
        return new sprbwh(lArray6);
    }

    public int cfr_renamed_2115() {
        return 9;
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprbwh)) {
            return false;
        }
        sprbwh sprbwh2 = (sprbwh)arg0;
        return sprthh.cfr_renamed_8535(this.cfr_renamed_4, sprbwh2.cfr_renamed_4);
    }

    @Override
    public sprlsh cfr_renamed_1908() {
        long[] lArray = sprthh.cfr_renamed_8534();
        sprqyh.cfr_renamed_8969(this.cfr_renamed_4, lArray);
        return new sprbwh(lArray);
    }

    @Override
    public sprlsh cfr_renamed_8663(sprlsh arg0) {
        long[] lArray = sprthh.cfr_renamed_8534();
        sprqyh.cfr_renamed_7206(this.cfr_renamed_4, ((sprbwh)arg0).cfr_renamed_4, lArray);
        return new sprbwh(lArray);
    }

    @Override
    public sprlsh cfr_renamed_8662(int arg0) {
        if (arg0 < 1) {
            return this;
        }
        long[] lArray = sprthh.cfr_renamed_8534();
        sprqyh.cfr_renamed_7209(this.cfr_renamed_4, arg0, lArray);
        return new sprbwh(lArray);
    }

    @Override
    public sprlsh cfr_renamed_8931(sprlsh arg0, sprlsh arg1) {
        long[] lArray = this.cfr_renamed_4;
        long[] lArray2 = ((sprbwh)arg0).cfr_renamed_4;
        long[] lArray3 = ((sprbwh)arg1).cfr_renamed_4;
        long[] lArray4 = sprthh.cfr_renamed_8536();
        sprqyh.cfr_renamed_8965(lArray, lArray4);
        sprqyh.cfr_renamed_8966(lArray2, lArray3, lArray4);
        long[] lArray5 = sprthh.cfr_renamed_8534();
        sprqyh.cfr_renamed_6593(lArray4, lArray5);
        return new sprbwh(lArray5);
    }

    @Override
    public sprlsh cfr_renamed_952() {
        long[] lArray = sprthh.cfr_renamed_8534();
        sprqyh.cfr_renamed_8971(this.cfr_renamed_4, lArray);
        return new sprbwh(lArray);
    }

    @Override
    public sprlsh cfr_renamed_8682(sprlsh arg0) {
        long[] lArray = sprthh.cfr_renamed_8534();
        sprqyh.cfr_renamed_7200(this.cfr_renamed_4, ((sprbwh)arg0).cfr_renamed_4, lArray);
        return new sprbwh(lArray);
    }

    public int cfr_renamed_1536() {
        return 2;
    }

    @Override
    public boolean cfr_renamed_805() {
        return sprthh.cfr_renamed_8540(this.cfr_renamed_4);
    }

    @Override
    public String cfr_renamed_1985() {
        return sprlsy.cfr_renamed_9("z\u001dJ,\u0018I\u001a>@\u001dE\u001c");
    }

    @Override
    public sprlsh cfr_renamed_1817() {
        long[] lArray = sprthh.cfr_renamed_8534();
        sprqyh.cfr_renamed_8973(this.cfr_renamed_4, lArray);
        return new sprbwh(lArray);
    }

    @Override
    public BigInteger cfr_renamed_1779() {
        return sprthh.cfr_renamed_8542(this.cfr_renamed_4);
    }

    @Override
    public boolean cfr_renamed_1930() {
        return (this.cfr_renamed_4[0] & 1L) != 0L;
    }

    @Override
    public sprlsh cfr_renamed_8933(sprlsh arg0, sprlsh arg1) {
        return this.cfr_renamed_8931(arg0, arg1);
    }

    @Override
    public sprlsh cfr_renamed_8934(sprlsh arg0) {
        return this.cfr_renamed_8663(arg0);
    }

    public int cfr_renamed_2117() {
        return 0;
    }

    @Override
    public boolean cfr_renamed_8972() {
        return true;
    }

    public int cfr_renamed_2116() {
        return 0;
    }

    public sprbwh(long[] lArray) {
        this.cfr_renamed_4 = lArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprbwh(BigInteger bigInteger) {
        void arg0;
        if (bigInteger == null || arg0.signum() < 0 || arg0.bitLength() > 113) {
            throw new IllegalArgumentException(SaveToImageOption.cfr_renamed_9("qG\u007f\u0006e\u0012lG`\t\u007f\u0006e\u000emGo\b{GZ\u0002j38V:!`\u0002e\u0003L\u000bl\nl\t}"));
        }
        this.cfr_renamed_4 = sprqyh.cfr_renamed_1652((BigInteger)arg0);
    }

    @Override
    public sprlsh cfr_renamed_1048() {
        long[] lArray = sprthh.cfr_renamed_8534();
        sprqyh.cfr_renamed_7210(this.cfr_renamed_4, lArray);
        return new sprbwh(lArray);
    }

    @Override
    public int cfr_renamed_1938() {
        return 113;
    }

    public int hashCode() {
        return 0x1B971 ^ sproze.cfr_renamed_5237(this.cfr_renamed_4, 0, 2);
    }

    public sprbwh() {
        this.cfr_renamed_4 = sprthh.cfr_renamed_8534();
    }

    @Override
    public sprlsh cfr_renamed_8936(sprlsh arg0) {
        return this.cfr_renamed_8682(arg0.cfr_renamed_952());
    }

    public int cfr_renamed_1186() {
        return 113;
    }
}

