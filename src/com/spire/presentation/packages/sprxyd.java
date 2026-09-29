/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprch;
import com.spire.presentation.packages.sprgi;
import com.spire.presentation.packages.sprhtd;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprixd;
import com.spire.presentation.packages.sprkne;
import com.spire.presentation.packages.sprle;
import com.spire.presentation.packages.sprlh;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprurd;
import com.spire.presentation.packages.sprxne;
import java.io.IOException;

public class sprxyd
extends sprurd {
    private sprxne cfr_renamed_4;

    public sprxyd(sprxne sprxne2, sprije sprije2, sprch sprch2, sprgi sprgi2) {
        super(sprxne2.cfr_renamed_4000(), sprije2, sprch2, sprgi2);
        this.cfr_renamed_4 = sprxne2;
        sprkne sprkne2 = this.cfr_renamed_4.cfr_renamed_4036();
        sprxyd sprxyd2 = this;
        sprxyd2.cfr_renamed_0 = new sprhtd(sprkne2.cfr_renamed_327().cfr_renamed_186());
    }

    @Override
    public sprixd cfr_renamed_3999(sprlh arg0) throws sprlqd, IOException {
        sprxyd sprxyd2 = this;
        return ((sprle)arg0).cfr_renamed_3244(sprxyd2.cfr_renamed_3, sprxyd2.cfr_renamed_1, this.cfr_renamed_4.cfr_renamed_4010().cfr_renamed_186());
    }
}

