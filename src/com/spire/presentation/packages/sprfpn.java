/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprebp;
import com.spire.presentation.packages.sprfqn;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprlsn;
import com.spire.presentation.packages.sprndz;
import com.spire.presentation.packages.sprpxo;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprxnn;

@sprtea
public class sprfpn
extends sprsmn {
    private boolean cfr_renamed_3;
    private StringBuilder cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_13166(sprsuja arg0) {
        sprghha.cfr_renamed_12279(this.cfr_renamed_4, "M");
        this.cfr_renamed_13851(arg0);
    }

    private /* synthetic */ void cfr_renamed_13168(sprsuja arg0) {
        sprghha.cfr_renamed_12279(this.cfr_renamed_4, sprndz.cfr_renamed_9("a"));
        this.cfr_renamed_13851(arg0);
    }

    @sprtea
    public String cfr_renamed_13146(sprxln sprxln2) {
        sprfpn sprfpn2 = this;
        sprfpn sprfpn3 = this;
        sprfpn2.cfr_renamed_4 = new StringBuilder();
        sprxln2.cfr_renamed_13121(sprfpn2);
        return sprfpn2.cfr_renamed_4.toString();
    }

    private /* synthetic */ void cfr_renamed_13851(sprsuja arg0) {
        sprghha.cfr_renamed_12279(this.cfr_renamed_4, sprebp.cfr_renamed_13083(arg0.cfr_renamed_1980()));
        sprghha.cfr_renamed_12279(this.cfr_renamed_4, ",");
        sprghha.cfr_renamed_12279(this.cfr_renamed_4, sprebp.cfr_renamed_13083(arg0.spr\u3181()));
        sprghha.cfr_renamed_12279(this.cfr_renamed_4, " ");
    }

    @Override
    public void cfr_renamed_13175(sprxnn arg0) {
        sprsuja[] sprsujaArray;
        if (this.cfr_renamed_3) {
            this.cfr_renamed_13166(arg0.cfr_renamed_13167());
            this.cfr_renamed_3 = false;
        } else {
            this.cfr_renamed_13168(arg0.cfr_renamed_13167());
        }
        sprsuja[] sprsujaArray2 = sprsujaArray = new sprsuja[3];
        sprsujaArray[0] = arg0.cfr_renamed_13169();
        sprsujaArray2[1] = arg0.cfr_renamed_13170();
        sprsujaArray[2] = arg0.cfr_renamed_13171();
        this.cfr_renamed_13172(sprsujaArray2);
    }

    @Override
    public void cfr_renamed_13186(sprfqn arg0) {
        int n;
        if (arg0.cfr_renamed_13187().cfr_renamed_11861() <= 0) {
            return;
        }
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_13187().cfr_renamed_11861()) {
            if (this.cfr_renamed_3) {
                this.cfr_renamed_13166(arg0.cfr_renamed_13187().cfr_renamed_576(0));
                this.cfr_renamed_3 = false;
            } else {
                this.cfr_renamed_13168(arg0.cfr_renamed_13187().cfr_renamed_576(n));
            }
            n2 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_13172(sprsuja[] arg0) {
        sprghha.cfr_renamed_12279(this.cfr_renamed_4, sprpxo.cfr_renamed_9("["));
        int n = 0;
        int n2 = n;
        while (n2 < arg0.length) {
            this.cfr_renamed_13851(arg0[n++]);
            n2 = n;
        }
    }

    @Override
    public void cfr_renamed_13178(sprlsn arg0) {
        this.cfr_renamed_3 = true;
    }

    @Override
    public void cfr_renamed_13173(sprlsn arg0) {
        if (arg0.cfr_renamed_13174()) {
            sprghha.cfr_renamed_12279(this.cfr_renamed_4, sprndz.cfr_renamed_9("w"));
        }
    }
}

