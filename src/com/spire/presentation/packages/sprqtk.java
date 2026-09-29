/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbxk;
import com.spire.presentation.packages.sprprk;
import com.spire.presentation.packages.sprzyk;
import java.math.BigInteger;

public class sprqtk
extends sprprk {
    private BigInteger cfr_renamed_91;
    private sprbxk cfr_renamed_0;
    private BigInteger cfr_renamed_1;
    private BigInteger cfr_renamed_2;
    private BigInteger cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    public BigInteger cfr_renamed_3386() {
        return this.cfr_renamed_2;
    }

    public void cfr_renamed_9995(sprbxk arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public BigInteger cfr_renamed_3384() {
        return this.cfr_renamed_1;
    }

    @Override
    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprqtk)) {
            return false;
        }
        sprqtk sprqtk2 = (sprqtk)arg0;
        return sprqtk2.cfr_renamed_3380().equals(this.cfr_renamed_91) && sprqtk2.cfr_renamed_3384().equals(this.cfr_renamed_1) && sprqtk2.cfr_renamed_3385().equals(this.cfr_renamed_3) && sprqtk2.cfr_renamed_3386().equals(this.cfr_renamed_2) && sprqtk2.cfr_renamed_3383().equals(this.cfr_renamed_4) && super.equals(arg0);
    }

    @Override
    public int hashCode() {
        return this.cfr_renamed_91.hashCode() ^ this.cfr_renamed_1.hashCode() ^ this.cfr_renamed_3.hashCode() ^ this.cfr_renamed_2.hashCode() ^ this.cfr_renamed_4.hashCode() ^ super.hashCode();
    }

    public BigInteger cfr_renamed_3380() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    public sprqtk(sprzyk sprzyk2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprqtk sprqtk2 = this;
        sprqtk sprqtk3 = this;
        super(true, (sprzyk)arg0);
        this.cfr_renamed_91 = arg1;
        sprqtk3.cfr_renamed_1 = arg2;
        sprqtk3.cfr_renamed_3 = arg3;
        sprqtk2.cfr_renamed_2 = arg4;
        sprqtk2.cfr_renamed_4 = bigInteger5;
    }

    public sprbxk cfr_renamed_3382() {
        return this.cfr_renamed_0;
    }

    public BigInteger cfr_renamed_3383() {
        return this.cfr_renamed_4;
    }

    public BigInteger cfr_renamed_3385() {
        return this.cfr_renamed_3;
    }
}

