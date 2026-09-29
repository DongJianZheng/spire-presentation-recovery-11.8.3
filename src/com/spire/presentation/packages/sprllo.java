/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdfo;
import com.spire.presentation.packages.sprflo;
import com.spire.presentation.packages.sprlmo;
import com.spire.presentation.packages.sprsto;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprllo
extends sprflo {
    private byte[] cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean cfr_renamed_16062() {
        switch (this.cfr_renamed_16063().cfr_renamed_324()) {
            case 523: 
            case 524: {
                return true;
            }
            case 3907: {
                int n = 22;
                sprllo sprllo2 = this;
                sprllo sprllo3 = this;
                sprllo2.cfr_renamed_16064().cfr_renamed_14060().cfr_renamed_11548(sprllo3.cfr_renamed_16064().cfr_renamed_14060().cfr_renamed_3274() + (long)n);
                int n2 = sprllo2.cfr_renamed_16063().cfr_renamed_16058() - n;
                sprllo2.cfr_renamed_4 = sprsto.cfr_renamed_16221(sprllo3.cfr_renamed_16064(), n2);
                return false;
            }
        }
        return false;
    }

    @sprtea
    public byte[] cfr_renamed_16795() {
        sprllo sprllo2 = this;
        sprllo2.cfr_renamed_13697(false);
        return sprllo2.cfr_renamed_4;
    }

    public sprllo(sprdfo arg0) {
        super(arg0, new sprlmo(null));
    }
}

