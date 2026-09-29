/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgdg;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.sprmag;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprtxf;
import com.spire.presentation.packages.sprwxf;
import java.security.SecureRandom;

public class sprlwf
implements sprii {
    private int cfr_renamed_152;
    private sprtxf cfr_renamed_112;
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public sprsil cfr_renamed_1223() {
        byte[] byArray = new byte[48];
        sprlwf sprlwf2 = this;
        sprlwf2.cfr_renamed_3.nextBytes(byArray);
        return sprlwf2.cfr_renamed_6574(byArray);
    }

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        this.cfr_renamed_112 = (sprtxf)arg0;
        sprlwf sprlwf2 = this;
        sprlwf2.cfr_renamed_3 = arg0.cfr_renamed_1295();
        sprlwf2.cfr_renamed_91 = sprlwf2.cfr_renamed_112.cfr_renamed_284().cfr_renamed_1146();
        sprlwf2.cfr_renamed_119 = sprlwf2.cfr_renamed_112.cfr_renamed_284().cfr_renamed_1150();
        sprlwf2.cfr_renamed_0 = sprlwf2.cfr_renamed_112.cfr_renamed_284().cfr_renamed_5948();
        sprlwf2.cfr_renamed_152 = sprlwf2.cfr_renamed_112.cfr_renamed_284().cfr_renamed_1438();
        sprlwf2.cfr_renamed_1 = sprlwf2.cfr_renamed_112.cfr_renamed_284().cfr_renamed_6571();
        sprlwf2.cfr_renamed_2 = sprlwf2.cfr_renamed_112.cfr_renamed_284().cfr_renamed_6572();
        sprlwf2.cfr_renamed_4 = (sprlwf2.cfr_renamed_91 + 7) / 8;
    }

    public sprsil cfr_renamed_6575(byte[] arg0) {
        return this.cfr_renamed_6574(arg0);
    }

    private /* synthetic */ sprsil cfr_renamed_6574(byte[] arg0) {
        sprwxf sprwxf2 = this.cfr_renamed_112.cfr_renamed_284().cfr_renamed_143();
        byte[] byArray = new byte[40 + this.cfr_renamed_4];
        byte[] byArray2 = new byte[80 + this.cfr_renamed_4];
        sprwxf2.cfr_renamed_6576(byArray, byArray2, arg0);
        sprgdg sprgdg2 = new sprgdg(this.cfr_renamed_112.cfr_renamed_284(), byArray);
        sprmag sprmag2 = new sprmag(this.cfr_renamed_112.cfr_renamed_284(), byArray2);
        return new sprsil(sprgdg2, sprmag2);
    }
}

