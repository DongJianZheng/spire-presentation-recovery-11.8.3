/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfqn;
import com.spire.presentation.packages.sprkzn;
import com.spire.presentation.packages.sprlsn;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxnn;
import com.spire.presentation.packages.sprzyn;

@sprtea
public class sprico
extends sprsmn {
    private boolean cfr_renamed_2;
    private sprsuja cfr_renamed_3 = sprsuja.cfr_renamed_13377();
    private sprkzn cfr_renamed_4;

    private /* synthetic */ sprzyn cfr_renamed_13380() {
        return this.cfr_renamed_4.cfr_renamed_13380();
    }

    @sprtea
    public sprico(sprkzn sprkzn2) {
        this.cfr_renamed_4 = sprkzn2;
    }

    @Override
    public void cfr_renamed_13173(sprlsn arg0) {
        if (!this.cfr_renamed_2 && arg0.cfr_renamed_13174()) {
            this.cfr_renamed_13380().cfr_renamed_14973((byte)-124);
        }
    }

    private /* synthetic */ void cfr_renamed_13168(sprsuja arg0) {
        sprico sprico2 = this;
        sprico2.cfr_renamed_13380().cfr_renamed_14410(arg0);
        sprico2.cfr_renamed_13380().cfr_renamed_14970((byte)69);
        sprico2.cfr_renamed_13380().cfr_renamed_14973((byte)-101);
    }

    private /* synthetic */ void cfr_renamed_13166(sprsuja arg0) {
        sprico sprico2 = this;
        sprico2.cfr_renamed_13380().cfr_renamed_14410(arg0);
        sprico2.cfr_renamed_13380().cfr_renamed_14970((byte)76);
        sprico2.cfr_renamed_13380().cfr_renamed_14973((byte)107);
    }

    @Override
    public void cfr_renamed_13178(sprlsn arg0) {
        sprico sprico2 = this;
        sprico2.cfr_renamed_2 = true;
        sprico2.cfr_renamed_3 = sprsuja.cfr_renamed_13377();
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
        this.cfr_renamed_3 = arg0.cfr_renamed_13187().cfr_renamed_576(arg0.cfr_renamed_13187().cfr_renamed_11861() - 1);
    }

    private /* synthetic */ void cfr_renamed_13172(sprsuja[] arg0) {
        sprico sprico2 = this;
        sprico2.cfr_renamed_13380().cfr_renamed_14410(arg0[0]);
        sprico2.cfr_renamed_13380().cfr_renamed_14970((byte)81);
        sprico2.cfr_renamed_13380().cfr_renamed_14410(arg0[1]);
        sprico2.cfr_renamed_13380().cfr_renamed_14970((byte)82);
        sprico2.cfr_renamed_13380().cfr_renamed_14410(arg0[2]);
        sprico2.cfr_renamed_13380().cfr_renamed_14970((byte)69);
        sprico2.cfr_renamed_13380().cfr_renamed_14973((byte)-109);
    }

    @Override
    public void cfr_renamed_13175(sprxnn arg0) {
        if (this.cfr_renamed_2) {
            this.cfr_renamed_13166(arg0.cfr_renamed_13167());
            this.cfr_renamed_2 = false;
        } else if (sprsuja.cfr_renamed_14755(this.cfr_renamed_3, arg0.cfr_renamed_13167())) {
            this.cfr_renamed_13168(arg0.cfr_renamed_13167());
        }
        sprsuja[] sprsujaArray = new sprsuja[]{arg0.cfr_renamed_13169(), arg0.cfr_renamed_13170(), arg0.cfr_renamed_13171()};
        this.cfr_renamed_13172(sprsujaArray);
        this.cfr_renamed_3 = arg0.cfr_renamed_13171();
    }
}

