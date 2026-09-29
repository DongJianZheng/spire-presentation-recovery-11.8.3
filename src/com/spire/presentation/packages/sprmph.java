/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyh;
import com.spire.presentation.packages.spreqh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmeh;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprtsa;
import com.spire.presentation.packages.sprvkba;
import java.math.BigInteger;

public class sprmph
extends sprcyh {
    public long[] cfr_renamed_4;

    @Override
    public boolean cfr_renamed_805() {
        return sprmeh.cfr_renamed_8540(this.cfr_renamed_4);
    }

    @Override
    public sprlsh cfr_renamed_1773() {
        return this;
    }

    @Override
    public sprlsh cfr_renamed_8936(sprlsh arg0) {
        return this.cfr_renamed_8682(arg0.cfr_renamed_952());
    }

    @Override
    public int cfr_renamed_1051() {
        return spreqh.cfr_renamed_8974(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprmph(BigInteger bigInteger) {
        void arg0;
        if (bigInteger == null || arg0.signum() < 0 || arg0.bitLength() > 233) {
            throw new IllegalArgumentException(sprvkba.cfr_renamed_9("r\u0012|SfGo\u0012c\\|Sf[n\u0012l]x\u0012YWif8\u00019tcWfVO^o_o\\~"));
        }
        this.cfr_renamed_4 = spreqh.cfr_renamed_1652((BigInteger)arg0);
    }

    @Override
    public boolean cfr_renamed_8972() {
        return true;
    }

    @Override
    public BigInteger cfr_renamed_1779() {
        return sprmeh.cfr_renamed_8542(this.cfr_renamed_4);
    }

    public int cfr_renamed_2117() {
        return 0;
    }

    @Override
    public sprlsh cfr_renamed_8662(int arg0) {
        if (arg0 < 1) {
            return this;
        }
        long[] lArray = sprmeh.cfr_renamed_8534();
        spreqh.cfr_renamed_7209(this.cfr_renamed_4, arg0, lArray);
        return new sprmph(lArray);
    }

    @Override
    public sprlsh cfr_renamed_1817() {
        long[] lArray = sprmeh.cfr_renamed_8534();
        spreqh.cfr_renamed_8973(this.cfr_renamed_4, lArray);
        return new sprmph(lArray);
    }

    public int hashCode() {
        return 0x238DDA ^ sproze.cfr_renamed_5237(this.cfr_renamed_4, 0, 4);
    }

    @Override
    public sprlsh cfr_renamed_8934(sprlsh arg0) {
        return this.cfr_renamed_8663(arg0);
    }

    @Override
    public boolean cfr_renamed_1930() {
        return (this.cfr_renamed_4[0] & 1L) != 0L;
    }

    public sprmph(long[] lArray) {
        this.cfr_renamed_4 = lArray;
    }

    @Override
    public int cfr_renamed_1938() {
        return 233;
    }

    @Override
    public sprlsh cfr_renamed_8931(sprlsh arg0, sprlsh arg1) {
        long[] lArray = this.cfr_renamed_4;
        long[] lArray2 = ((sprmph)arg0).cfr_renamed_4;
        long[] lArray3 = ((sprmph)arg1).cfr_renamed_4;
        long[] lArray4 = sprmeh.cfr_renamed_8536();
        spreqh.cfr_renamed_8965(lArray, lArray4);
        spreqh.cfr_renamed_8966(lArray2, lArray3, lArray4);
        long[] lArray5 = sprmeh.cfr_renamed_8534();
        spreqh.cfr_renamed_6593(lArray4, lArray5);
        return new sprmph(lArray5);
    }

    @Override
    public sprlsh cfr_renamed_952() {
        long[] lArray = sprmeh.cfr_renamed_8534();
        spreqh.cfr_renamed_8971(this.cfr_renamed_4, lArray);
        return new sprmph(lArray);
    }

    public int cfr_renamed_2116() {
        return 0;
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprmph)) {
            return false;
        }
        sprmph sprmph2 = (sprmph)arg0;
        return sprmeh.cfr_renamed_8535(this.cfr_renamed_4, sprmph2.cfr_renamed_4);
    }

    public int cfr_renamed_2115() {
        return 74;
    }

    @Override
    public sprlsh cfr_renamed_1048() {
        long[] lArray = sprmeh.cfr_renamed_8534();
        spreqh.cfr_renamed_7210(this.cfr_renamed_4, lArray);
        return new sprmph(lArray);
    }

    @Override
    public sprlsh cfr_renamed_8682(sprlsh arg0) {
        long[] lArray = sprmeh.cfr_renamed_8534();
        spreqh.cfr_renamed_7200(this.cfr_renamed_4, ((sprmph)arg0).cfr_renamed_4, lArray);
        return new sprmph(lArray);
    }

    @Override
    public sprlsh cfr_renamed_8932(sprlsh arg0, sprlsh arg1, sprlsh arg2) {
        long[] lArray = this.cfr_renamed_4;
        long[] lArray2 = ((sprmph)arg0).cfr_renamed_4;
        long[] lArray3 = ((sprmph)arg1).cfr_renamed_4;
        long[] lArray4 = ((sprmph)arg2).cfr_renamed_4;
        long[] lArray5 = sprmeh.cfr_renamed_8536();
        spreqh.cfr_renamed_8966(lArray, lArray2, lArray5);
        spreqh.cfr_renamed_8966(lArray3, lArray4, lArray5);
        long[] lArray6 = sprmeh.cfr_renamed_8534();
        spreqh.cfr_renamed_6593(lArray5, lArray6);
        return new sprmph(lArray6);
    }

    @Override
    public sprlsh cfr_renamed_8933(sprlsh arg0, sprlsh arg1) {
        return this.cfr_renamed_8931(arg0, arg1);
    }

    public sprmph() {
        this.cfr_renamed_4 = sprmeh.cfr_renamed_8534();
    }

    public int cfr_renamed_1186() {
        return 233;
    }

    @Override
    public sprlsh cfr_renamed_8935(sprlsh arg0, sprlsh arg1, sprlsh arg2) {
        return this.cfr_renamed_8932(arg0, arg1, arg2);
    }

    @Override
    public sprlsh cfr_renamed_1908() {
        long[] lArray = sprmeh.cfr_renamed_8534();
        spreqh.cfr_renamed_8969(this.cfr_renamed_4, lArray);
        return new sprmph(lArray);
    }

    @Override
    public sprlsh cfr_renamed_8663(sprlsh arg0) {
        long[] lArray = sprmeh.cfr_renamed_8534();
        spreqh.cfr_renamed_7206(this.cfr_renamed_4, ((sprmph)arg0).cfr_renamed_4, lArray);
        return new sprmph(lArray);
    }

    @Override
    public String cfr_renamed_1985() {
        return sprtsa.cfr_renamed_9("/M\u001f|N\u001bOn\u0015M\u0010L");
    }

    @Override
    public boolean cfr_renamed_287() {
        return sprmeh.cfr_renamed_8541(this.cfr_renamed_4);
    }

    public int cfr_renamed_1536() {
        return 2;
    }

    @Override
    public sprlsh cfr_renamed_1047() {
        long[] lArray = sprmeh.cfr_renamed_8534();
        spreqh.cfr_renamed_8970(this.cfr_renamed_4, lArray);
        return new sprmph(lArray);
    }
}

