/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkqo;
import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprruo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtvp;

@sprtea
public class sprrpo
extends sprkqo {
    private boolean cfr_renamed_2;
    private static final int cfr_renamed_3 = 131070;
    private sprtvp cfr_renamed_4 = sprtvp.cfr_renamed_14846();

    public void cfr_renamed_18312(boolean arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public void cfr_renamed_18313() {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_15080().cfr_renamed_11861()) {
            if (this.cfr_renamed_15080().cfr_renamed_576(n) % 2 != 0) {
                this.cfr_renamed_18312(false);
                return;
            }
            n2 = sprrgga.cfr_renamed_2548(n2, this.cfr_renamed_15080().cfr_renamed_576(n++));
            n3 = n;
        }
        this.cfr_renamed_18312(n2 <= 131070);
    }

    @Override
    @sprtea
    public void cfr_renamed_18252(sprruo arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_15080().cfr_renamed_11861()) {
            if (this.cfr_renamed_15090()) {
                arg0.cfr_renamed_14639(this.cfr_renamed_15080().cfr_renamed_576(n) / 2);
            } else {
                arg0.cfr_renamed_12761(this.cfr_renamed_15080().cfr_renamed_576(n));
            }
            n2 = ++n;
        }
    }

    public sprtvp cfr_renamed_15080() {
        return this.cfr_renamed_4;
    }

    public sprrpo() {
    }

    public static sprrpo cfr_renamed_15089(sprmzo arg0, long arg1, boolean arg2) {
        sprrpo sprrpo2 = new sprrpo(arg2);
        if (arg2) {
            int n;
            int n2 = (int)((arg1 & 0xFFFFFFFFL) / 2L);
            int n3 = n = 0;
            while (n3 < n2) {
                sprrpo2.cfr_renamed_15080().cfr_renamed_12819((arg0.cfr_renamed_13218() & 0xFFFF) * 2);
                n3 = ++n;
            }
        } else {
            int n;
            int n4 = (int)((arg1 & 0xFFFFFFFFL) / 4L);
            int n5 = n = 0;
            while (n5 < n4) {
                sprrpo2.cfr_renamed_15080().cfr_renamed_12819(arg0.cfr_renamed_12261());
                n5 = ++n;
            }
        }
        return sprrpo2;
    }

    public sprrpo(boolean bl) {
        this.cfr_renamed_2 = bl;
    }

    public boolean cfr_renamed_15090() {
        return this.cfr_renamed_2;
    }
}

