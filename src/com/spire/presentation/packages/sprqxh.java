/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyh;
import com.spire.presentation.packages.sprlny;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprolh;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprxqh;
import com.spire.presentation.packages.sprzqh;
import java.math.BigInteger;

public class sprqxh
extends sprcyh {
    public long[] cfr_renamed_4;

    @Override
    public int cfr_renamed_1938() {
        return 571;
    }

    public int hashCode() {
        return 0x5724CC ^ sproze.cfr_renamed_5237(this.cfr_renamed_4, 0, 9);
    }

    @Override
    public String cfr_renamed_1985() {
        return sprzqh.cfr_renamed_9("\u007faOP\u00193\u001dBEa@`");
    }

    @Override
    public sprlsh cfr_renamed_8931(sprlsh arg0, sprlsh arg1) {
        long[] lArray = this.cfr_renamed_4;
        long[] lArray2 = ((sprqxh)arg0).cfr_renamed_4;
        long[] lArray3 = ((sprqxh)arg1).cfr_renamed_4;
        long[] lArray4 = sprolh.cfr_renamed_8536();
        sprxqh.cfr_renamed_8965(lArray, lArray4);
        sprxqh.cfr_renamed_8966(lArray2, lArray3, lArray4);
        long[] lArray5 = sprolh.cfr_renamed_8534();
        sprxqh.cfr_renamed_6593(lArray4, lArray5);
        return new sprqxh(lArray5);
    }

    @Override
    public sprlsh cfr_renamed_1047() {
        long[] lArray = sprolh.cfr_renamed_8534();
        sprxqh.cfr_renamed_8970(this.cfr_renamed_4, lArray);
        return new sprqxh(lArray);
    }

    public int cfr_renamed_2117() {
        return 5;
    }

    @Override
    public sprlsh cfr_renamed_8682(sprlsh arg0) {
        long[] lArray = sprolh.cfr_renamed_8534();
        sprxqh.cfr_renamed_7200(this.cfr_renamed_4, ((sprqxh)arg0).cfr_renamed_4, lArray);
        return new sprqxh(lArray);
    }

    @Override
    public sprlsh cfr_renamed_1773() {
        return this;
    }

    @Override
    public boolean cfr_renamed_805() {
        return sprolh.cfr_renamed_8540(this.cfr_renamed_4);
    }

    public int cfr_renamed_1186() {
        return 571;
    }

    public int cfr_renamed_1536() {
        return 3;
    }

    /*
     * WARNING - void declaration
     */
    public sprqxh(BigInteger bigInteger) {
        void arg0;
        if (bigInteger == null || arg0.signum() < 0 || arg0.bitLength() > 571) {
            throw new IllegalArgumentException(sprlny.cfr_renamed_9("\u0017`\u0019!\u00035\n`\u0006.\u0019!\u0003)\u000b`\t/\u001d`<%\f\u0014Zw^\u0006\u0006%\u0003$*,\n-\n.\u001b"));
        }
        this.cfr_renamed_4 = sprxqh.cfr_renamed_1652((BigInteger)arg0);
    }

    @Override
    public sprlsh cfr_renamed_8933(sprlsh arg0, sprlsh arg1) {
        return this.cfr_renamed_8931(arg0, arg1);
    }

    @Override
    public sprlsh cfr_renamed_1908() {
        long[] lArray = sprolh.cfr_renamed_8534();
        sprxqh.cfr_renamed_8969(this.cfr_renamed_4, lArray);
        return new sprqxh(lArray);
    }

    @Override
    public sprlsh cfr_renamed_952() {
        long[] lArray = sprolh.cfr_renamed_8534();
        sprxqh.cfr_renamed_8971(this.cfr_renamed_4, lArray);
        return new sprqxh(lArray);
    }

    @Override
    public boolean cfr_renamed_8972() {
        return true;
    }

    @Override
    public sprlsh cfr_renamed_8932(sprlsh arg0, sprlsh arg1, sprlsh arg2) {
        long[] lArray = this.cfr_renamed_4;
        long[] lArray2 = ((sprqxh)arg0).cfr_renamed_4;
        long[] lArray3 = ((sprqxh)arg1).cfr_renamed_4;
        long[] lArray4 = ((sprqxh)arg2).cfr_renamed_4;
        long[] lArray5 = sprolh.cfr_renamed_8536();
        sprxqh.cfr_renamed_8966(lArray, lArray2, lArray5);
        sprxqh.cfr_renamed_8966(lArray3, lArray4, lArray5);
        long[] lArray6 = sprolh.cfr_renamed_8534();
        sprxqh.cfr_renamed_6593(lArray5, lArray6);
        return new sprqxh(lArray6);
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprqxh)) {
            return false;
        }
        sprqxh sprqxh2 = (sprqxh)arg0;
        return sprolh.cfr_renamed_8535(this.cfr_renamed_4, sprqxh2.cfr_renamed_4);
    }

    public int cfr_renamed_2116() {
        return 10;
    }

    @Override
    public sprlsh cfr_renamed_8935(sprlsh arg0, sprlsh arg1, sprlsh arg2) {
        return this.cfr_renamed_8932(arg0, arg1, arg2);
    }

    public sprqxh() {
        this.cfr_renamed_4 = sprolh.cfr_renamed_8534();
    }

    @Override
    public sprlsh cfr_renamed_1048() {
        long[] lArray = sprolh.cfr_renamed_8534();
        sprxqh.cfr_renamed_7210(this.cfr_renamed_4, lArray);
        return new sprqxh(lArray);
    }

    @Override
    public sprlsh cfr_renamed_8662(int arg0) {
        if (arg0 < 1) {
            return this;
        }
        long[] lArray = sprolh.cfr_renamed_8534();
        sprxqh.cfr_renamed_7209(this.cfr_renamed_4, arg0, lArray);
        return new sprqxh(lArray);
    }

    @Override
    public sprlsh cfr_renamed_8934(sprlsh arg0) {
        return this.cfr_renamed_8663(arg0);
    }

    public sprqxh(long[] lArray) {
        this.cfr_renamed_4 = lArray;
    }

    @Override
    public sprlsh cfr_renamed_8936(sprlsh arg0) {
        return this.cfr_renamed_8682(arg0.cfr_renamed_952());
    }

    @Override
    public boolean cfr_renamed_1930() {
        return (this.cfr_renamed_4[0] & 1L) != 0L;
    }

    @Override
    public BigInteger cfr_renamed_1779() {
        return sprolh.cfr_renamed_8542(this.cfr_renamed_4);
    }

    @Override
    public sprlsh cfr_renamed_1817() {
        long[] lArray = sprolh.cfr_renamed_8534();
        sprxqh.cfr_renamed_8973(this.cfr_renamed_4, lArray);
        return new sprqxh(lArray);
    }

    @Override
    public sprlsh cfr_renamed_8663(sprlsh arg0) {
        long[] lArray = sprolh.cfr_renamed_8534();
        sprxqh.cfr_renamed_7206(this.cfr_renamed_4, ((sprqxh)arg0).cfr_renamed_4, lArray);
        return new sprqxh(lArray);
    }

    public int cfr_renamed_2115() {
        return 2;
    }

    @Override
    public boolean cfr_renamed_287() {
        return sprolh.cfr_renamed_8541(this.cfr_renamed_4);
    }

    @Override
    public int cfr_renamed_1051() {
        return sprxqh.cfr_renamed_8974(this.cfr_renamed_4);
    }
}

