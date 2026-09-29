/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahe;
import com.spire.presentation.packages.sprcyh;
import com.spire.presentation.packages.sprebb;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmeh;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.spryph;
import java.math.BigInteger;

public class sprwyh
extends sprcyh {
    public long[] cfr_renamed_4;

    @Override
    public int cfr_renamed_1938() {
        return 193;
    }

    @Override
    public sprlsh cfr_renamed_8933(sprlsh arg0, sprlsh arg1) {
        return this.cfr_renamed_8931(arg0, arg1);
    }

    @Override
    public sprlsh cfr_renamed_8932(sprlsh arg0, sprlsh arg1, sprlsh arg2) {
        long[] lArray = this.cfr_renamed_4;
        long[] lArray2 = ((sprwyh)arg0).cfr_renamed_4;
        long[] lArray3 = ((sprwyh)arg1).cfr_renamed_4;
        long[] lArray4 = ((sprwyh)arg2).cfr_renamed_4;
        long[] lArray5 = sprmeh.cfr_renamed_8536();
        spryph.cfr_renamed_8966(lArray, lArray2, lArray5);
        spryph.cfr_renamed_8966(lArray3, lArray4, lArray5);
        long[] lArray6 = sprmeh.cfr_renamed_8534();
        spryph.cfr_renamed_6593(lArray5, lArray6);
        return new sprwyh(lArray6);
    }

    @Override
    public sprlsh cfr_renamed_1047() {
        long[] lArray = sprmeh.cfr_renamed_8534();
        spryph.cfr_renamed_8970(this.cfr_renamed_4, lArray);
        return new sprwyh(lArray);
    }

    @Override
    public sprlsh cfr_renamed_1817() {
        long[] lArray = sprmeh.cfr_renamed_8534();
        spryph.cfr_renamed_8973(this.cfr_renamed_4, lArray);
        return new sprwyh(lArray);
    }

    @Override
    public boolean cfr_renamed_805() {
        return sprmeh.cfr_renamed_8540(this.cfr_renamed_4);
    }

    public int cfr_renamed_2115() {
        return 15;
    }

    public int cfr_renamed_2116() {
        return 0;
    }

    public sprwyh() {
        this.cfr_renamed_4 = sprmeh.cfr_renamed_8534();
    }

    @Override
    public boolean cfr_renamed_1930() {
        return (this.cfr_renamed_4[0] & 1L) != 0L;
    }

    /*
     * WARNING - void declaration
     */
    public sprwyh(BigInteger bigInteger) {
        void arg0;
        if (bigInteger == null || arg0.signum() < 0 || arg0.bitLength() > 193) {
            throw new IllegalArgumentException(sprahe.cfr_renamed_9("\"\u007f,>6*?\u007f31,>66>\u007f<0(\u007f\t:9\u000bkfi\u00193:6;\u001f3?2?1."));
        }
        this.cfr_renamed_4 = spryph.cfr_renamed_1652((BigInteger)arg0);
    }

    @Override
    public String cfr_renamed_1985() {
        return sprebb.cfr_renamed_9("\u000f\u0011? mMo25\u00110\u0010");
    }

    @Override
    public sprlsh cfr_renamed_8931(sprlsh arg0, sprlsh arg1) {
        long[] lArray = this.cfr_renamed_4;
        long[] lArray2 = ((sprwyh)arg0).cfr_renamed_4;
        long[] lArray3 = ((sprwyh)arg1).cfr_renamed_4;
        long[] lArray4 = sprmeh.cfr_renamed_8536();
        spryph.cfr_renamed_8965(lArray, lArray4);
        spryph.cfr_renamed_8966(lArray2, lArray3, lArray4);
        long[] lArray5 = sprmeh.cfr_renamed_8534();
        spryph.cfr_renamed_6593(lArray4, lArray5);
        return new sprwyh(lArray5);
    }

    @Override
    public sprlsh cfr_renamed_8682(sprlsh arg0) {
        long[] lArray = sprmeh.cfr_renamed_8534();
        spryph.cfr_renamed_7200(this.cfr_renamed_4, ((sprwyh)arg0).cfr_renamed_4, lArray);
        return new sprwyh(lArray);
    }

    @Override
    public sprlsh cfr_renamed_1773() {
        return this;
    }

    public int cfr_renamed_2117() {
        return 0;
    }

    @Override
    public sprlsh cfr_renamed_8935(sprlsh arg0, sprlsh arg1, sprlsh arg2) {
        return this.cfr_renamed_8932(arg0, arg1, arg2);
    }

    @Override
    public sprlsh cfr_renamed_1048() {
        long[] lArray = sprmeh.cfr_renamed_8534();
        spryph.cfr_renamed_7210(this.cfr_renamed_4, lArray);
        return new sprwyh(lArray);
    }

    @Override
    public BigInteger cfr_renamed_1779() {
        return sprmeh.cfr_renamed_8542(this.cfr_renamed_4);
    }

    public int hashCode() {
        return 0x1D731F ^ sproze.cfr_renamed_5237(this.cfr_renamed_4, 0, 4);
    }

    @Override
    public sprlsh cfr_renamed_1908() {
        long[] lArray = sprmeh.cfr_renamed_8534();
        spryph.cfr_renamed_8969(this.cfr_renamed_4, lArray);
        return new sprwyh(lArray);
    }

    @Override
    public sprlsh cfr_renamed_8936(sprlsh arg0) {
        return this.cfr_renamed_8682(arg0.cfr_renamed_952());
    }

    @Override
    public int cfr_renamed_1051() {
        return spryph.cfr_renamed_8974(this.cfr_renamed_4);
    }

    @Override
    public boolean cfr_renamed_8972() {
        return true;
    }

    public int cfr_renamed_1536() {
        return 2;
    }

    @Override
    public sprlsh cfr_renamed_952() {
        long[] lArray = sprmeh.cfr_renamed_8534();
        spryph.cfr_renamed_8971(this.cfr_renamed_4, lArray);
        return new sprwyh(lArray);
    }

    @Override
    public sprlsh cfr_renamed_8662(int arg0) {
        if (arg0 < 1) {
            return this;
        }
        long[] lArray = sprmeh.cfr_renamed_8534();
        spryph.cfr_renamed_7209(this.cfr_renamed_4, arg0, lArray);
        return new sprwyh(lArray);
    }

    @Override
    public sprlsh cfr_renamed_8934(sprlsh arg0) {
        return this.cfr_renamed_8663(arg0);
    }

    public int cfr_renamed_1186() {
        return 193;
    }

    public sprwyh(long[] lArray) {
        this.cfr_renamed_4 = lArray;
    }

    @Override
    public boolean cfr_renamed_287() {
        return sprmeh.cfr_renamed_8541(this.cfr_renamed_4);
    }

    @Override
    public sprlsh cfr_renamed_8663(sprlsh arg0) {
        long[] lArray = sprmeh.cfr_renamed_8534();
        spryph.cfr_renamed_7206(this.cfr_renamed_4, ((sprwyh)arg0).cfr_renamed_4, lArray);
        return new sprwyh(lArray);
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprwyh)) {
            return false;
        }
        sprwyh sprwyh2 = (sprwyh)arg0;
        return sprmeh.cfr_renamed_8535(this.cfr_renamed_4, sprwyh2.cfr_renamed_4);
    }
}

