/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprdqd;
import com.spire.presentation.packages.sprgm;
import com.spire.presentation.packages.sprhcf;
import com.spire.presentation.packages.sprlff;
import com.spire.presentation.packages.sprnef;
import com.spire.presentation.packages.sprpwe;
import com.spire.presentation.packages.sprveda;
import com.spire.presentation.packages.sprybf;
import com.spire.presentation.packages.sprybl;
import java.security.SecureRandom;

public class sprqef
implements sprgm {
    private SecureRandom cfr_renamed_2;
    private sprlff cfr_renamed_3;
    private sprybf cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean cfr_renamed_129(byte[] arg0, byte[] arg1) {
        switch (this.cfr_renamed_3.cfr_renamed_5538()) {
            case 5: {
                int n = sprnef.cfr_renamed_5539(arg0, arg1, 0, arg1.length, this.cfr_renamed_3.cfr_renamed_5540());
                return 0 == n;
            }
            case 6: {
                int n = sprhcf.cfr_renamed_5539(arg0, arg1, 0, arg1.length, this.cfr_renamed_3.cfr_renamed_5540());
                return 0 == n;
            }
            default: {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprdqd.cfr_renamed_9("gcyc}z|-ahqx`dft2nsywj}\u007fk72")).append(this.cfr_renamed_3.cfr_renamed_5538()).toString());
            }
        }
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        if (arg0) {
            sprqef sprqef2;
            if (arg1 instanceof sprbgk) {
                this.cfr_renamed_2 = ((sprbgk)arg1).cfr_renamed_1295();
                this.cfr_renamed_4 = (sprybf)((sprbgk)arg1).cfr_renamed_284();
                sprqef2 = this;
            } else {
                this.cfr_renamed_2 = sprybl.cfr_renamed_2794();
                this.cfr_renamed_4 = (sprybf)arg1;
                sprqef2 = this;
            }
            sprqef2.cfr_renamed_3 = null;
            sprpwe.cfr_renamed_5541(this.cfr_renamed_4.cfr_renamed_5538());
            return;
        }
        this.cfr_renamed_4 = null;
        this.cfr_renamed_3 = (sprlff)arg1;
        sprpwe.cfr_renamed_5541(this.cfr_renamed_3.cfr_renamed_5538());
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public byte[] cfr_renamed_125(byte[] arg0) {
        sprqef sprqef2 = this;
        byte[] byArray = new byte[sprpwe.cfr_renamed_5542(sprqef2.cfr_renamed_4.cfr_renamed_5538())];
        switch (sprqef2.cfr_renamed_4.cfr_renamed_5538()) {
            case 5: {
                sprnef.cfr_renamed_5543(byArray, arg0, 0, arg0.length, this.cfr_renamed_4.cfr_renamed_3880(), this.cfr_renamed_2);
                return byArray;
            }
            case 6: {
                sprhcf.cfr_renamed_5543(byArray, arg0, 0, arg0.length, this.cfr_renamed_4.cfr_renamed_3880(), this.cfr_renamed_2);
                return byArray;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprveda.cfr_renamed_9("\u0015I\u000bI\u000fP\u000e\u0007\u0013B\u0003R\u0012N\u0014^@D\u0001S\u0005@\u000fU\u0019\u001d@")).append(this.cfr_renamed_4.cfr_renamed_5538()).toString());
    }
}

