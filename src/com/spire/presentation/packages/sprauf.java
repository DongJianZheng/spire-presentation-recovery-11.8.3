/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfeg;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.sprkyf;
import com.spire.presentation.packages.sproyf;
import com.spire.presentation.packages.sprptf;
import com.spire.presentation.packages.sprryf;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprwag;
import java.security.SecureRandom;

public class sprauf
implements sprii {
    private sprgf cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    @Override
    public sprsil cfr_renamed_1223() {
        sprkyf sprkyf2 = new sprkyf();
        byte[] byArray = new byte[1088];
        this.cfr_renamed_4.nextBytes(byArray);
        byte[] byArray2 = new byte[1056];
        System.arraycopy(byArray, 32, byArray2, 0, 1024);
        sprkyf sprkyf3 = sprkyf2;
        sprkyf3.cfr_renamed_2 = 11;
        sprkyf3.cfr_renamed_3 = 0L;
        sprkyf3.cfr_renamed_4 = 0L;
        sprfeg.cfr_renamed_6052(new sprptf(this.cfr_renamed_3), byArray2, 1024, 5, byArray, sprkyf2, byArray2, 0);
        return new sprsil(new sprryf(byArray2, this.cfr_renamed_3.cfr_renamed_1315()), new sprwag(byArray, this.cfr_renamed_3.cfr_renamed_1315()));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5536(sprgye sprgye2) {
        void arg0;
        sprauf sprauf2 = this;
        sprauf2.cfr_renamed_4 = arg0.cfr_renamed_1295();
        sprauf2.cfr_renamed_3 = ((sproyf)sprgye2).cfr_renamed_3234();
    }
}

