/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprb;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprlpd;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprvre;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.sprzra;
import java.math.BigInteger;

public class sprntd
implements sprb {
    private byte[] cfr_renamed_2;
    private spruhe cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    public spruhe cfr_renamed_102() {
        return this.cfr_renamed_3;
    }

    public sprntd(spruhe arg0, BigInteger arg1) {
        this(arg0, arg1, null);
    }

    public sprntd(byte[] arg0) {
        this(null, null, arg0);
    }

    public int hashCode() {
        sprntd sprntd2 = this;
        int n = sprzra.cfr_renamed_95(sprntd2.cfr_renamed_2);
        if (sprntd2.cfr_renamed_4 != null) {
            n ^= this.cfr_renamed_4.hashCode();
        }
        if (this.cfr_renamed_3 != null) {
            n ^= this.cfr_renamed_3.hashCode();
        }
        return n;
    }

    @Override
    public boolean cfr_renamed_132(Object arg0) {
        if (arg0 instanceof sprcyd) {
            sprcyd sprcyd2 = (sprcyd)arg0;
            if (this.cfr_renamed_114() != null) {
                sprvre sprvre2 = new sprvre(sprcyd2.cfr_renamed_568());
                return sprvre2.cfr_renamed_313().equals(this.cfr_renamed_3) && sprvre2.cfr_renamed_114().cfr_renamed_97().equals(this.cfr_renamed_4);
            }
            if (this.cfr_renamed_2 != null) {
                sprtie sprtie2 = sprcyd2.cfr_renamed_100(sprtie.cfr_renamed_93);
                if (sprtie2 == null) {
                    return sprzra.cfr_renamed_92(this.cfr_renamed_2, sprlpd.cfr_renamed_4239(sprcyd2.cfr_renamed_1489()));
                }
                byte[] byArray = sprxue.cfr_renamed_23(sprtie2.cfr_renamed_372()).cfr_renamed_186();
                return sprzra.cfr_renamed_92(this.cfr_renamed_2, byArray);
            }
        } else if (arg0 instanceof byte[]) {
            return sprzra.cfr_renamed_92(this.cfr_renamed_2, (byte[])arg0);
        }
        return false;
    }

    public BigInteger cfr_renamed_114() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ boolean cfr_renamed_4019(Object arg0, Object arg1) {
        if (arg0 != null) {
            return arg0.equals(arg1);
        }
        return arg1 == null;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprntd)) {
            return false;
        }
        sprntd sprntd2 = (sprntd)arg0;
        if (sprzra.cfr_renamed_92(this.cfr_renamed_2, sprntd2.cfr_renamed_2)) {
            sprntd sprntd3 = this;
            if (sprntd3.cfr_renamed_4019(sprntd3.cfr_renamed_4, sprntd2.cfr_renamed_4)) {
                sprntd sprntd4 = this;
                if (sprntd4.cfr_renamed_4019(sprntd4.cfr_renamed_3, sprntd2.cfr_renamed_3)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Object clone() {
        sprntd sprntd2 = this;
        return new sprntd(sprntd2.cfr_renamed_3, sprntd2.cfr_renamed_4, this.cfr_renamed_2);
    }

    public byte[] cfr_renamed_3955() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_2);
    }

    /*
     * WARNING - void declaration
     */
    public sprntd(spruhe spruhe2, BigInteger bigInteger, byte[] byArray) {
        void arg1;
        void arg0;
        sprntd sprntd2 = this;
        this.cfr_renamed_3 = arg0;
        sprntd2.cfr_renamed_4 = arg1;
        sprntd2.cfr_renamed_2 = byArray;
    }
}

