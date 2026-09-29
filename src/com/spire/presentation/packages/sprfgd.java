/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprad;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprko;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprtaz;
import com.spire.presentation.packages.sprxmd;
import com.spire.presentation.packages.sprzeo;
import com.spire.presentation.packages.sprzra;
import java.security.SecureRandom;

public class sprfgd
implements sprad {
    private final SecureRandom cfr_renamed_2;
    private final int cfr_renamed_3;
    private final sprlc cfr_renamed_4;

    private /* synthetic */ byte[] cfr_renamed_3879(byte[] arg0, byte[] arg1) {
        sprfgd sprfgd2 = this;
        byte[] byArray = new byte[sprfgd2.cfr_renamed_4.cfr_renamed_1218()];
        sprfgd2.cfr_renamed_4.cfr_renamed_1197(arg0, 0, arg0.length);
        this.cfr_renamed_4.cfr_renamed_1197(arg1, 0, arg1.length);
        this.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        return byArray;
    }

    @Override
    public boolean cfr_renamed_3877(sprxmd arg0, byte[] arg1) {
        if (arg1.length + arg0.cfr_renamed_3880().length != this.cfr_renamed_3) {
            throw new sprjkd(sprtaz.cfr_renamed_9("G_yIk]o\u001akTn\u001a}S~ToIy\u001ay_iHoN*VoTmNbI*^e\u001adU~\u001ag[~Yb\u0014"));
        }
        byte[] byArray = this.cfr_renamed_3879(arg0.cfr_renamed_3880(), arg1);
        return sprzra.cfr_renamed_559(arg0.cfr_renamed_3881(), byArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprfgd(sprko sprko2, SecureRandom secureRandom) {
        void arg0;
        sprfgd sprfgd2 = this;
        this.cfr_renamed_4 = arg0;
        sprfgd2.cfr_renamed_3 = this.cfr_renamed_4.cfr_renamed_3248();
        sprfgd2.cfr_renamed_2 = secureRandom;
    }

    @Override
    public sprxmd cfr_renamed_3878(byte[] arg0) {
        if (arg0.length > this.cfr_renamed_3 / 2) {
            throw new sprjkd(sprzeo.cfr_renamed_9("E\u000f{\u0019i\rmJ|\u0005(\bmJk\u0005e\u0007a\u001e|\u000flJ|\u0005(\u001eg\u0005(\u0006i\u0018o\u000f(\fg\u0018(\u000ea\rm\u0019|D"));
        }
        byte[] byArray = new byte[this.cfr_renamed_3 - arg0.length];
        this.cfr_renamed_2.nextBytes(byArray);
        return new sprxmd(byArray, this.cfr_renamed_3879(byArray, arg0));
    }
}

