/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcrn;
import com.spire.presentation.packages.sprfqn;
import com.spire.presentation.packages.sprjmo;
import com.spire.presentation.packages.sprlsn;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwob;
import com.spire.presentation.packages.sprxnn;

@sprtea
public class sprtao
extends sprsmn {
    private boolean cfr_renamed_2;
    private sprcrn cfr_renamed_3;
    private sprsuja cfr_renamed_4;

    @Override
    public void cfr_renamed_13173(sprlsn arg0) {
        if (!this.cfr_renamed_2 && arg0.cfr_renamed_13174()) {
            this.cfr_renamed_3.cfr_renamed_14058("h");
        }
    }

    @Override
    public void cfr_renamed_13186(sprfqn arg0) {
        int n;
        if (arg0.cfr_renamed_13187().cfr_renamed_11861() <= 0) {
            return;
        }
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_13187().cfr_renamed_11861()) {
            if (this.cfr_renamed_2) {
                this.cfr_renamed_13166(arg0.cfr_renamed_13187().cfr_renamed_576(0));
                this.cfr_renamed_2 = false;
            } else {
                this.cfr_renamed_13168(arg0.cfr_renamed_13187().cfr_renamed_576(n));
            }
            n2 = ++n;
        }
        this.cfr_renamed_4 = arg0.cfr_renamed_13187().cfr_renamed_576(arg0.cfr_renamed_13187().cfr_renamed_11861() - 1);
    }

    private /* synthetic */ void cfr_renamed_13172(sprsuja[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n;
            this.cfr_renamed_3.cfr_renamed_14410(arg0[n3]);
            if (n3 < arg0.length - 1) {
                this.cfr_renamed_3.cfr_renamed_11835(" ");
            }
            n2 = ++n;
        }
        this.cfr_renamed_3.cfr_renamed_11835(sprwob.cfr_renamed_9("\u0016#\u0016"));
    }

    @Override
    public void cfr_renamed_13175(sprxnn arg0) {
        if (this.cfr_renamed_2) {
            this.cfr_renamed_13166(arg0.cfr_renamed_13167());
            this.cfr_renamed_2 = false;
        } else if (sprsuja.cfr_renamed_14755(this.cfr_renamed_4, arg0.cfr_renamed_13167())) {
            this.cfr_renamed_13168(arg0.cfr_renamed_13167());
        }
        sprsuja[] sprsujaArray = new sprsuja[]{arg0.cfr_renamed_13169(), arg0.cfr_renamed_13170(), arg0.cfr_renamed_13171()};
        this.cfr_renamed_13172(sprsujaArray);
        this.cfr_renamed_4 = arg0.cfr_renamed_13171();
    }

    private /* synthetic */ void cfr_renamed_13166(sprsuja arg0) {
        sprtao sprtao2 = this;
        sprtao2.cfr_renamed_3.cfr_renamed_14410(arg0);
        sprtao2.cfr_renamed_3.cfr_renamed_11835(" m ");
    }

    public sprtao(sprcrn sprcrn2) {
        this.cfr_renamed_3 = sprcrn2;
    }

    private /* synthetic */ void cfr_renamed_13168(sprsuja arg0) {
        sprtao sprtao2 = this;
        sprtao2.cfr_renamed_3.cfr_renamed_14410(arg0);
        sprtao2.cfr_renamed_3.cfr_renamed_11835(sprjmo.cfr_renamed_9("\u000ef\u000e"));
    }

    @Override
    public void cfr_renamed_13178(sprlsn arg0) {
        sprtao sprtao2 = this;
        sprtao2.cfr_renamed_2 = true;
        sprtao2.cfr_renamed_4 = sprsuja.cfr_renamed_13377();
    }
}

