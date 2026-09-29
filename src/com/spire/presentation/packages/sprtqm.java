/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.sprhno;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnum;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpnm;
import com.spire.presentation.packages.sprqcn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsra;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprtqm
extends sprqqe {
    private sprpnm cfr_renamed_119;
    private sprktm cfr_renamed_91;
    private spridn cfr_renamed_0;
    private spridn cfr_renamed_1;
    private sprnum cfr_renamed_2;
    private sproug cfr_renamed_3;
    private spridn cfr_renamed_4;

    public spridn cfr_renamed_4190() {
        return this.cfr_renamed_0;
    }

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_91;
    }

    public static sprtqm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprtqm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(7);
        sprtqm sprtqm2 = this;
        sprrvm2.cfr_renamed_5004(sprtqm2.cfr_renamed_91);
        if (sprtqm2.cfr_renamed_119 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_119));
        }
        sprrvm sprrvm3 = sprrvm2;
        sprtqm sprtqm3 = this;
        sprrvm3.cfr_renamed_5004(sprtqm3.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(sprtqm3.cfr_renamed_2);
        if (this.cfr_renamed_0 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 1, (sprco)this.cfr_renamed_0));
        }
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        if (this.cfr_renamed_1 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 2, (sprco)this.cfr_renamed_1));
        }
        return new sprqcn(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprtqm(sprpnm sprpnm2, spridn spridn2, sprnum sprnum2, spridn spridn3, sproug sproug2, spridn spridn4) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg0;
        sprtqm sprtqm2 = this;
        sprtqm2.cfr_renamed_91 = new sprktm(0L);
        this.cfr_renamed_119 = arg0;
        this.cfr_renamed_4 = spridn2;
        if (this.cfr_renamed_4.cfr_renamed_84() == 0) {
            throw new IllegalArgumentException(sprsra.cfr_renamed_9("*\u0014\u001f\t.\u000f\u001d\u0004\u0007\u000e\u001b\u0004\u000f%\n\u0015\nA\u0019\u0004\u001a\u0014\u0002\u0013\u000e\u0012K\u0000\u001fA\u0007\u0004\n\u0012\u001fAZA9\u0004\b\b\u001b\b\u000e\u000f\u001f(\u0005\u0007\u0004"));
        }
        this.cfr_renamed_2 = arg2;
        this.cfr_renamed_0 = arg3;
        if (!(arg2.cfr_renamed_696().cfr_renamed_5078(sprgz.cfr_renamed_3) || arg3 != null && arg3.cfr_renamed_84() != 0)) {
            throw new IllegalArgumentException(sprhno.cfr_renamed_9("\u00150\u0000-51\u00007\u0007e\u00190\u00071T'\u0011e\u00047\u00116\u0011+\u0000e\u0003,\u0000-T+\u001b+Y!\u00151\u0015e\u0017*\u001a1\u0011+\u0000"));
        }
        this.cfr_renamed_3 = arg4;
        this.cfr_renamed_1 = arg5;
    }

    public static sprtqm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprtqm) {
            return (sprtqm)arg0;
        }
        if (arg0 != null) {
            return new sprtqm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sproug cfr_renamed_1472() {
        return this.cfr_renamed_3;
    }

    public spridn cfr_renamed_4171() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprtqm(sprszm sprszm2) {
        sprtqm sprtqm2;
        void arg0;
        sprtqm sprtqm3 = this;
        int n = 0;
        ++n;
        sprxgf sprxgf2 = sprszm2.cfr_renamed_85(0).cfr_renamed_119();
        sprtqm3.cfr_renamed_91 = sprktm.cfr_renamed_23(sprxgf2);
        if (!sprtqm3.cfr_renamed_91.cfr_renamed_7241(0)) {
            throw new IllegalArgumentException(sprsra.cfr_renamed_9(" \u001e\u0015\u0003$\u0005\u0017\u000e\r\u0004\u0011\u000e\u0005/\u0000\u001f\u0000K\u0017\u000e\u0013\u0018\b\u0004\u000fK\u000f\u001e\f\t\u0004\u0019A\u0006\u0014\u0018\u0015K\u0003\u000eA["));
        }
        sprxgf sprxgf3 = arg0.cfr_renamed_85(n).cfr_renamed_119();
        ++n;
        sprxgf2 = sprxgf3;
        if (sprxgf3 instanceof sprnvm) {
            this.cfr_renamed_119 = sprpnm.cfr_renamed_5085((sprnvm)sprxgf2, false);
            sprxgf2 = arg0.cfr_renamed_85(n).cfr_renamed_119();
            ++n;
        }
        this.cfr_renamed_4 = spridn.cfr_renamed_23(sprxgf2);
        if (this.cfr_renamed_4.cfr_renamed_84() == 0) {
            throw new IllegalArgumentException(sprhno.cfr_renamed_9("50\u0000-1+\u0002 \u0018*\u0004 \u0010\u0001\u00151\u0015e\u0006 \u00050\u001d7\u00116T$\u0000e\u0018 \u00156\u0000eEe& \u0017,\u0004,\u0011+\u0000\f\u001a#\u001b"));
        }
        void v2 = arg0;
        sprxgf2 = v2.cfr_renamed_85(n).cfr_renamed_119();
        int n2 = ++n;
        ++n;
        this.cfr_renamed_2 = sprnum.cfr_renamed_23(sprxgf2);
        sprxgf2 = v2.cfr_renamed_85(n2).cfr_renamed_119();
        if (sprxgf2 instanceof sprnvm) {
            this.cfr_renamed_0 = spridn.cfr_renamed_5085((sprnvm)sprxgf2, false);
            sprxgf2 = arg0.cfr_renamed_85(n).cfr_renamed_119();
            ++n;
            sprtqm2 = this;
        } else {
            if (!(this.cfr_renamed_2.cfr_renamed_696().cfr_renamed_5078(sprgz.cfr_renamed_3) || this.cfr_renamed_0 != null && this.cfr_renamed_0.cfr_renamed_84() != 0)) {
                throw new IllegalArgumentException(sprsra.cfr_renamed_9("\n\u0014\u001f\t*\u0015\u001f\u0013\u0018A\u0006\u0014\u0018\u0015K\u0003\u000eA\u001b\u0013\u000e\u0012\u000e\u000f\u001fA\u001c\b\u001f\tK\u000f\u0004\u000fF\u0005\n\u0015\nA\b\u000e\u0005\u0015\u000e\u000f\u001f"));
            }
            sprtqm2 = this;
        }
        sprtqm2.cfr_renamed_3 = sproug.cfr_renamed_23(sprxgf2);
        if (arg0.cfr_renamed_84() > n) {
            sprxgf2 = arg0.cfr_renamed_85(n).cfr_renamed_119();
            this.cfr_renamed_1 = spridn.cfr_renamed_5085((sprnvm)sprxgf2, false);
        }
    }

    public sprnum cfr_renamed_4189() {
        return this.cfr_renamed_2;
    }

    public sprpnm cfr_renamed_4170() {
        return this.cfr_renamed_119;
    }

    public spridn cfr_renamed_4191() {
        return this.cfr_renamed_1;
    }
}

