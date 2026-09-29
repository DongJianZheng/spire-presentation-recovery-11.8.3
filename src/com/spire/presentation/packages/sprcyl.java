/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdsm;
import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrql;
import com.spire.presentation.packages.sprtpl;
import java.math.BigInteger;

public class sprcyl
implements sprhd {
    private BigInteger cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private sprnbm cfr_renamed_4;

    public sprcyl(sprnbm arg0, BigInteger arg1) {
        this(arg0, arg1, null);
    }

    /*
     * WARNING - void declaration
     */
    public sprcyl(sprnbm sprnbm2, BigInteger bigInteger, byte[] byArray) {
        void arg1;
        void arg0;
        sprcyl sprcyl2 = this;
        this.cfr_renamed_4 = arg0;
        sprcyl2.cfr_renamed_2 = arg1;
        sprcyl2.cfr_renamed_3 = byArray;
    }

    public boolean cfr_renamed_132(Object arg0) {
        if (arg0 instanceof sprtpl) {
            sprtpl sprtpl2 = (sprtpl)arg0;
            if (this.cfr_renamed_114() != null) {
                sprdsm sprdsm2 = new sprdsm(sprtpl2.cfr_renamed_568());
                return sprdsm2.cfr_renamed_313().equals(this.cfr_renamed_4) && sprdsm2.cfr_renamed_114().cfr_renamed_5103(this.cfr_renamed_2);
            }
            if (this.cfr_renamed_3 != null) {
                sprrdm sprrdm2 = sprtpl2.cfr_renamed_5024(sprrdm.cfr_renamed_126);
                if (sprrdm2 == null) {
                    return sproze.cfr_renamed_92(this.cfr_renamed_3, sprrql.cfr_renamed_10886(sprtpl2.cfr_renamed_1489()));
                }
                byte[] byArray = sproug.cfr_renamed_23(sprrdm2.cfr_renamed_372()).cfr_renamed_186();
                return sproze.cfr_renamed_92(this.cfr_renamed_3, byArray);
            }
        } else if (arg0 instanceof byte[]) {
            return sproze.cfr_renamed_92(this.cfr_renamed_3, (byte[])arg0);
        }
        return false;
    }

    public byte[] cfr_renamed_3955() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    public BigInteger cfr_renamed_114() {
        return this.cfr_renamed_2;
    }

    public sprnbm cfr_renamed_102() {
        return this.cfr_renamed_4;
    }

    public sprcyl(byte[] arg0) {
        this(null, null, arg0);
    }

    private /* synthetic */ boolean cfr_renamed_4019(Object arg0, Object arg1) {
        if (arg0 != null) {
            return arg0.equals(arg1);
        }
        return arg1 == null;
    }

    public int hashCode() {
        sprcyl sprcyl2 = this;
        int n = sproze.cfr_renamed_95(sprcyl2.cfr_renamed_3);
        if (sprcyl2.cfr_renamed_2 != null) {
            n ^= this.cfr_renamed_2.hashCode();
        }
        if (this.cfr_renamed_4 != null) {
            n ^= this.cfr_renamed_4.hashCode();
        }
        return n;
    }

    @Override
    public Object clone() {
        sprcyl sprcyl2 = this;
        return new sprcyl(sprcyl2.cfr_renamed_4, sprcyl2.cfr_renamed_2, this.cfr_renamed_3);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprcyl)) {
            return false;
        }
        sprcyl sprcyl2 = (sprcyl)arg0;
        if (sproze.cfr_renamed_92(this.cfr_renamed_3, sprcyl2.cfr_renamed_3)) {
            sprcyl sprcyl3 = this;
            if (sprcyl3.cfr_renamed_4019(sprcyl3.cfr_renamed_2, sprcyl2.cfr_renamed_2)) {
                sprcyl sprcyl4 = this;
                if (sprcyl4.cfr_renamed_4019(sprcyl4.cfr_renamed_4, sprcyl2.cfr_renamed_4)) {
                    return true;
                }
            }
        }
        return false;
    }
}

