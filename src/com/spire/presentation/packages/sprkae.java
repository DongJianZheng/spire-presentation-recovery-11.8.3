/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;

public class sprkae
extends sprkra
implements sprkj {
    private spra cfr_renamed_4;

    public static sprkae cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprkae) {
            return (sprkae)arg0;
        }
        if (arg0 instanceof sprlqe) {
            return new sprkae((sprlqe)arg0);
        }
        if (arg0 instanceof spryte) {
            spryte spryte2 = (spryte)arg0;
            if (spryte2.cfr_renamed_312() == 1) {
                return new sprkae(spruhe.cfr_renamed_341(spryte2, true));
            }
            return new sprkae(sprxue.cfr_renamed_341(spryte2, true));
        }
        return new sprkae(spruhe.cfr_renamed_23(arg0));
    }

    public sprkae(spruhe spruhe2) {
        this.cfr_renamed_4 = spruhe2;
    }

    public spruhe cfr_renamed_313() {
        if (this.cfr_renamed_4 instanceof sprxue) {
            return null;
        }
        return spruhe.cfr_renamed_23(this.cfr_renamed_4);
    }

    public static sprkae cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprkae.cfr_renamed_23(arg0.cfr_renamed_2456());
    }

    public sprkae(sprxue sprxue2) {
        this.cfr_renamed_4 = sprxue2;
    }

    public byte[] cfr_renamed_4604() {
        if (this.cfr_renamed_4 instanceof sprxue) {
            return ((sprxue)this.cfr_renamed_4).cfr_renamed_186();
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        if (this.cfr_renamed_4 instanceof sprxue) {
            return new sprhse(true, 2, this.cfr_renamed_4);
        }
        return new sprhse(1 != 0, 1, this.cfr_renamed_4);
    }
}

