/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfap;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtvp;

@sprtea
public class sprivo {
    private int cfr_renamed_112;
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private sprfap cfr_renamed_0;
    private int cfr_renamed_1;
    private sprtvp cfr_renamed_2;
    private sprtvp cfr_renamed_3;
    private int cfr_renamed_4;

    public sprtvp cfr_renamed_13079() {
        if (this.cfr_renamed_3 == null) {
            sprivo sprivo2 = this;
            sprivo2.cfr_renamed_3 = new sprtvp();
        }
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_18337() {
        return this.cfr_renamed_112;
    }

    public sprfap cfr_renamed_13550() {
        if (this.cfr_renamed_0 == null) {
            sprivo sprivo2 = this;
            sprivo2.cfr_renamed_0 = new sprfap();
        }
        return this.cfr_renamed_0;
    }

    public int cfr_renamed_13076() {
        return this.cfr_renamed_91;
    }

    public sprtvp cfr_renamed_18338() {
        if (this.cfr_renamed_2 == null) {
            sprivo sprivo2 = this;
            sprivo2.cfr_renamed_2 = new sprtvp();
        }
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprivo(int n, int n2, int n3, int n4, int n5) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprivo sprivo2 = this;
        sprivo sprivo3 = this;
        this.cfr_renamed_91 = arg0;
        sprivo3.cfr_renamed_119 = arg1;
        sprivo3.cfr_renamed_1 = arg2;
        sprivo2.cfr_renamed_4 = arg3;
        sprivo2.cfr_renamed_112 = n5;
    }

    public void cfr_renamed_18339(sprfap arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public int cfr_renamed_18340() {
        return this.cfr_renamed_4;
    }

    public int cfr_renamed_18341() {
        return this.cfr_renamed_1;
    }

    public int cfr_renamed_13470() {
        return this.cfr_renamed_119;
    }

    public int cfr_renamed_18342() {
        if (this.cfr_renamed_2 != null && this.cfr_renamed_2.cfr_renamed_11861() > 0) {
            return this.cfr_renamed_2.cfr_renamed_576(0);
        }
        return 0;
    }

    public int cfr_renamed_12561() {
        if (this.cfr_renamed_13079().cfr_renamed_11861() > 0) {
            return this.cfr_renamed_3.cfr_renamed_576(0);
        }
        return 0;
    }
}

