/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbyk;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprnuk;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.spruym;
import com.spire.presentation.packages.sprybl;
import java.security.SecureRandom;

public class sprral
implements sprii {
    private SecureRandom cfr_renamed_4;

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        this.cfr_renamed_4 = arg0.cfr_renamed_1295();
        sprybl.cfr_renamed_9170(new sprfdl(spruym.cfr_renamed_9("3KD\u001aC\u001eOd\u0013V1J\u0018"), 128, null, spriil.cfr_renamed_91));
    }

    @Override
    public sprsil cfr_renamed_1223() {
        sprbyk sprbyk2 = new sprbyk(this.cfr_renamed_4);
        sprnuk sprnuk2 = sprbyk2.cfr_renamed_9432();
        return new sprsil(sprnuk2, sprbyk2);
    }
}

