/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdim;
import com.spire.presentation.packages.sprfqm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprjaaa;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprsaz;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprirm
extends sprqqe
implements sprlm {
    private sprszm cfr_renamed_2;
    private sprdim cfr_renamed_3;
    private sproug cfr_renamed_4;

    public sprdim cfr_renamed_592() {
        return this.cfr_renamed_3;
    }

    public static sprirm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprirm.cfr_renamed_23(arg0.cfr_renamed_8225());
    }

    /*
     * WARNING - void declaration
     */
    public sprirm(sprfqm sprfqm2) {
        void arg0;
        sprirm sprirm2 = this;
        sprirm2.cfr_renamed_2 = new sprcen((sprco)arg0);
    }

    public sprirm(sprdim sprdim2) {
        this.cfr_renamed_3 = sprdim2;
    }

    public sprfqm[] cfr_renamed_626() {
        int n;
        if (this.cfr_renamed_2 == null) {
            return null;
        }
        sprfqm[] sprfqmArray = new sprfqm[this.cfr_renamed_2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprfqmArray.length) {
            int n3 = n++;
            sprfqmArray[n3] = sprfqm.cfr_renamed_23(this.cfr_renamed_2.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprfqmArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprirm(byte[] byArray) {
        void arg0;
        sprirm sprirm2 = this;
        sprirm2.cfr_renamed_4 = new sprfvg((byte[])arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprirm(sprfqm[] sprfqmArray) {
        void arg0;
        sprirm sprirm2 = this;
        sprirm2.cfr_renamed_2 = new sprcen((sprco[])arg0);
    }

    public sprirm(sproug sproug2) {
        this.cfr_renamed_4 = sproug2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.cfr_renamed_119();
        }
        if (this.cfr_renamed_3 != null) {
            return this.cfr_renamed_3.cfr_renamed_119();
        }
        return new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_2);
    }

    public sproug cfr_renamed_2578() {
        return this.cfr_renamed_4;
    }

    public String toString() {
        if (this.cfr_renamed_4 != null) {
            return new StringBuilder().insert(0, sprjaaa.cfr_renamed_9("%.\u0015.A4k")).append(this.cfr_renamed_4).append(sprsaz.cfr_renamed_9(")v")).toString();
        }
        if (this.cfr_renamed_3 != null) {
            return new StringBuilder().insert(0, sprjaaa.cfr_renamed_9("%.\u0015.A4k")).append(this.cfr_renamed_3).append(sprsaz.cfr_renamed_9(")v")).toString();
        }
        return new StringBuilder().insert(0, sprjaaa.cfr_renamed_9("%.\u0015.A4k")).append(this.cfr_renamed_2).append(sprsaz.cfr_renamed_9(")v")).toString();
    }

    public static sprirm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprirm) {
            return (sprirm)arg0;
        }
        if (arg0 instanceof sproug) {
            return new sprirm((sproug)arg0);
        }
        if (arg0 instanceof sprszm) {
            return new sprirm(sprdim.cfr_renamed_23(arg0));
        }
        if (arg0 instanceof sprnvm) {
            return new sprirm(sprszm.cfr_renamed_5085((sprnvm)arg0, false));
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprjaaa.cfr_renamed_9("4!\n!\u000e8\u000fo\u000e-\u000b*\u0002;A<\u0014-\f&\u0015;\u0004+A;\u000eo\u0006*\u0015\u0006\u000f<\u0015.\u000f,\u0004uA")).append(arg0.getClass().getName()).toString());
    }

    private /* synthetic */ sprirm(sprszm sprszm2) {
        this.cfr_renamed_2 = sprszm2;
    }
}

