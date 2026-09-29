/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprhcf;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.sprlff;
import com.spire.presentation.packages.sprnef;
import com.spire.presentation.packages.sprnmy;
import com.spire.presentation.packages.sprpwe;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprtdf;
import com.spire.presentation.packages.sprybf;
import java.security.SecureRandom;

public final class sprxcf
implements sprii {
    private int cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    private /* synthetic */ byte[] cfr_renamed_5547(int arg0) {
        return new byte[sprpwe.cfr_renamed_5545(arg0)];
    }

    private /* synthetic */ byte[] cfr_renamed_5548(int arg0) {
        return new byte[sprpwe.cfr_renamed_5546(arg0)];
    }

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        sprtdf sprtdf2 = (sprtdf)arg0;
        sprxcf sprxcf2 = this;
        sprxcf2.cfr_renamed_4 = sprtdf2.cfr_renamed_1295();
        sprxcf2.cfr_renamed_3 = sprtdf2.cfr_renamed_5538();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public sprsil cfr_renamed_1223() {
        sprxcf sprxcf2 = this;
        byte[] byArray = sprxcf2.cfr_renamed_5548(sprxcf2.cfr_renamed_3);
        byte[] byArray2 = sprxcf2.cfr_renamed_5547(sprxcf2.cfr_renamed_3);
        switch (sprxcf2.cfr_renamed_3) {
            case 5: {
                sprnef.cfr_renamed_5549(byArray2, byArray, this.cfr_renamed_4);
                return new sprsil(new sprlff(this.cfr_renamed_3, byArray2), new sprybf(this.cfr_renamed_3, byArray));
            }
            case 6: {
                sprhcf.cfr_renamed_5549(byArray2, byArray, this.cfr_renamed_4);
                return new sprsil(new sprlff(this.cfr_renamed_3, byArray2), new sprybf(this.cfr_renamed_3, byArray));
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprnmy.cfr_renamed_9("T\u0001J\u0001N\u0018OOR\nB\u001aS\u0006U\u0016\u0001\f@\u001bD\bN\u001dXU\u0001")).append(this.cfr_renamed_3).toString());
    }
}

