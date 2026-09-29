/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprczf;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprhwf;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.sprnag;
import com.spire.presentation.packages.sprsdg;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprtff;
import com.spire.presentation.packages.spruuf;
import java.security.SecureRandom;

public class sprnbg
implements sprii {
    private SecureRandom cfr_renamed_3;
    private sprnag cfr_renamed_4;

    @Override
    public sprsil cfr_renamed_1223() {
        sprnbg sprnbg2 = this;
        sprtff sprtff2 = sprnbg2.cfr_renamed_4.cfr_renamed_284().cfr_renamed_3;
        byte[] byArray = new byte[sprtff2.cfr_renamed_5432()];
        sprnbg2.cfr_renamed_3.nextBytes(byArray);
        spruuf spruuf2 = new sprhwf(sprtff2).cfr_renamed_6399(byArray);
        byte[] byArray2 = spruuf2.cfr_renamed_4;
        byte[] byArray3 = new byte[sprtff2.cfr_renamed_5426()];
        byte[] byArray4 = spruuf2.cfr_renamed_3;
        System.arraycopy(spruuf2.cfr_renamed_3, 0, byArray3, 0, byArray4.length);
        byte[] byArray5 = new byte[sprtff2.cfr_renamed_5430()];
        this.cfr_renamed_3.nextBytes(byArray5);
        System.arraycopy(byArray5, 0, byArray3, sprtff2.cfr_renamed_5427(), byArray5.length);
        return new sprsil(new sprsdg(this.cfr_renamed_4.cfr_renamed_284(), byArray2), new sprczf(this.cfr_renamed_4.cfr_renamed_284(), byArray3));
    }

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        this.cfr_renamed_4 = (sprnag)arg0;
        this.cfr_renamed_3 = arg0.cfr_renamed_1295();
    }
}

