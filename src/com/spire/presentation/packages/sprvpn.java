/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprepn;
import com.spire.presentation.packages.sprfqn;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprlsn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprthn;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprxnn;

@sprtea
public class sprvpn
extends sprepn {
    private boolean cfr_renamed_4;

    @Override
    public void cfr_renamed_13178(sprlsn arg0) {
        if (!this.cfr_renamed_4) {
            super.cfr_renamed_13178(arg0);
        }
    }

    @Override
    public void cfr_renamed_13175(sprxnn arg0) {
        if (!this.cfr_renamed_4) {
            super.cfr_renamed_13175(arg0);
        }
    }

    @Override
    public void cfr_renamed_13173(sprlsn arg0) {
        if (!this.cfr_renamed_4) {
            if (arg0.cfr_renamed_13174() && arg0.cfr_renamed_11861() > 0) {
                this.cfr_renamed_13186(new sprfqn(arg0.cfr_renamed_13639(), arg0.cfr_renamed_13249()));
            }
            super.cfr_renamed_13173(arg0);
        }
    }

    @Override
    public void cfr_renamed_13108(sprthn arg0) {
        if (arg0.cfr_renamed_13257().cfr_renamed_13265() == 0.0f || arg0.cfr_renamed_12553().cfr_renamed_1778() == 0 && arg0.cfr_renamed_13268().cfr_renamed_1778() == 0) {
            return;
        }
        super.cfr_renamed_13108(arg0);
    }

    @Override
    public sprgeja cfr_renamed_13687(sprgeja arg0, float arg1) {
        sprgeja sprgeja2;
        float f;
        sprgeja sprgeja3 = arg0;
        if (sprgeja3.cfr_renamed_1452() == 0.0f) {
            f = 0.0f;
            sprgeja2 = arg0;
        } else {
            f = arg1;
            sprgeja2 = arg0;
        }
        arg0 = sprgeja.cfr_renamed_13688(sprgeja3, f, sprgeja2.cfr_renamed_1942() == 0.0f ? 0.0f : arg1);
        return arg0;
    }

    @Override
    public void cfr_renamed_13098(sprxln arg0) {
        this.cfr_renamed_4 = arg0.cfr_renamed_29();
        if (!this.cfr_renamed_4) {
            super.cfr_renamed_13098(arg0);
        }
    }

    @Override
    public void cfr_renamed_13107(sprxln arg0) {
        if (!this.cfr_renamed_4) {
            super.cfr_renamed_13107(arg0);
        }
        this.cfr_renamed_4 = false;
    }

    @Override
    public void cfr_renamed_13186(sprfqn arg0) {
        if (!this.cfr_renamed_4) {
            super.cfr_renamed_13186(arg0);
        }
    }
}

