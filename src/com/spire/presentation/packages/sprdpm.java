/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdtm;
import com.spire.presentation.packages.sprhkm;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprsso;
import com.spire.presentation.packages.sprtcaa;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxpm;
import com.spire.presentation.packages.sprycn;

public class sprdpm
extends sprqqe
implements sprlm {
    private sprxpm cfr_renamed_3;
    private sprdtm cfr_renamed_4;

    public static sprdpm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdpm) {
            return (sprdpm)arg0;
        }
        if (arg0 instanceof sprnvm) {
            return new sprdpm(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }

    public boolean cfr_renamed_10977() {
        return this.cfr_renamed_4 != null;
    }

    public sprdtm cfr_renamed_4897() {
        return this.cfr_renamed_4;
    }

    public sprxpm cfr_renamed_2141() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        if (this.cfr_renamed_3 != null) {
            return new sprycn(true, 0, (sprco)this.cfr_renamed_3);
        }
        return new sprycn(1 != 0, 1, (sprco)this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprdpm(sprxpm sprxpm2) {
        void arg0;
        if (sprxpm2 == null) {
            throw new IllegalArgumentException(sprtcaa.cfr_renamed_9("Zl\u0018}\tf\u001bf\u001en\tjZ/\u001en\u0013a\u0012{]m\u0018/\u0013z\u0011c"));
        }
        this.cfr_renamed_3 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprdpm(sprdtm sprdtm2) {
        void arg0;
        if (sprdtm2 == null) {
            throw new IllegalArgumentException(sprsso.cfr_renamed_9("g[.]2G0J%Z\u0003[2Jg\u001e#_.P/J`\\%\u001e.K,R"));
        }
        this.cfr_renamed_4 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprdpm(sprhkm sprhkm2) {
        void arg0;
        if (sprhkm2 == null) {
            throw new IllegalArgumentException(sprtcaa.cfr_renamed_9("Zj\u0013l\u000fv\r{\u0018k>j\u000f{Z/\u001en\u0013a\u0012{]m\u0018/\u0013z\u0011c"));
        }
        this.cfr_renamed_4 = new sprdtm((sprhkm)arg0);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprdpm(sprnvm sprnvm2) {
        void arg0;
        if (sprnvm2.cfr_renamed_312() == 0) {
            this.cfr_renamed_3 = sprxpm.cfr_renamed_23(arg0.cfr_renamed_8225());
            return;
        }
        if (arg0.cfr_renamed_312() == 1) {
            this.cfr_renamed_4 = sprdtm.cfr_renamed_23(arg0.cfr_renamed_8225());
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprsso.cfr_renamed_9("K.U.Q7P`J!Yz\u001e")).append(arg0.cfr_renamed_312()).toString());
    }
}

