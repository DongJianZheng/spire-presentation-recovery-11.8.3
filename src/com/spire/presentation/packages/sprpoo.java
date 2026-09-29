/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprlfk;
import com.spire.presentation.packages.sprmze;
import com.spire.presentation.packages.sprnmp;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprpoo {
    private double cfr_renamed_2;
    private static final double cfr_renamed_3 = 300.0;
    private double cfr_renamed_4;

    public void cfr_renamed_16519(double arg0) {
        this.cfr_renamed_2 = arg0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public double cfr_renamed_16520(double arg0, int arg1) {
        switch (arg1) {
            case 0: {
                return arg0;
            }
            case 1: {
                return arg0;
            }
            case 2: {
                return arg0;
            }
            case 3: {
                return sprnmp.cfr_renamed_16521(arg0, this.cfr_renamed_2);
            }
            case 4: {
                return sprnmp.cfr_renamed_16522(arg0, this.cfr_renamed_2);
            }
            case 5: {
                return sprnmp.cfr_renamed_16522(arg0 / 300.0, this.cfr_renamed_2);
            }
            case 6: {
                return sprnmp.cfr_renamed_16523(arg0, this.cfr_renamed_2);
            }
        }
        throw new IllegalArgumentException(sprlfk.cfr_renamed_9("s=Q=N9W9Q|M=N9\u0019|V2J(w%S9"));
    }

    public sprpoo() {
        sprpoo sprpoo2 = this;
        sprpoo2.cfr_renamed_2 = 96.0;
        sprpoo2.cfr_renamed_4 = 96.0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public double cfr_renamed_16524(double arg0, int arg1) {
        switch (arg1) {
            case 0: {
                return arg0;
            }
            case 1: {
                return arg0;
            }
            case 2: {
                return sprnmp.cfr_renamed_16525(arg0, this.cfr_renamed_2);
            }
            case 3: {
                return arg0;
            }
            case 4: {
                return sprnmp.cfr_renamed_16526(arg0);
            }
            case 5: {
                return sprnmp.cfr_renamed_16526(arg0 / 300.0);
            }
            case 6: {
                return sprnmp.cfr_renamed_13141(arg0);
            }
        }
        throw new IllegalArgumentException(sprmze.cfr_renamed_9("\u000b%)%6!/!)d5%6!ad.*20\u000f=+!"));
    }

    public sprgeja cfr_renamed_16527(sprgeja arg0, int arg1) {
        return sprgeja.cfr_renamed_14827((float)this.cfr_renamed_16520(arg0.cfr_renamed_13430(), arg1), (float)this.cfr_renamed_16520(arg0.cfr_renamed_13342(), arg1), (float)this.cfr_renamed_16520(arg0.cfr_renamed_13341(), arg1), (float)this.cfr_renamed_16520(arg0.cfr_renamed_13429(), arg1));
    }

    public double cfr_renamed_16528() {
        return this.cfr_renamed_2;
    }

    public void cfr_renamed_16529(double arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public double cfr_renamed_16530() {
        return this.cfr_renamed_4;
    }
}

