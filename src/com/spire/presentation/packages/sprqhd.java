/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprad;
import com.spire.presentation.packages.sprjgz;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprjrf;
import com.spire.presentation.packages.sprko;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprxmd;
import com.spire.presentation.packages.sprzra;
import java.security.SecureRandom;

public class sprqhd
implements sprad {
    private final sprlc cfr_renamed_2;
    private final int cfr_renamed_3;
    private final SecureRandom cfr_renamed_4;

    @Override
    public sprxmd cfr_renamed_3878(byte[] arg0) {
        if (arg0.length > this.cfr_renamed_3 / 2) {
            throw new sprjkd(sprjgz.cfr_renamed_9("\u001e\u0001 \u00172\u00036D'\u000bs\u00066D0\u000b>\t:\u0010'\u00017D'\u000bs\u0010<\u000bs\b2\u00164\u0001s\u0002<\u0016s\u0000:\u00036\u0017'J"));
        }
        byte[] byArray = new byte[this.cfr_renamed_3 - arg0.length];
        this.cfr_renamed_4.nextBytes(byArray);
        return new sprxmd(byArray, this.cfr_renamed_3879(byArray, arg0));
    }

    private /* synthetic */ byte[] cfr_renamed_3879(byte[] arg0, byte[] arg1) {
        sprqhd sprqhd2 = this;
        byte[] byArray = new byte[sprqhd2.cfr_renamed_2.cfr_renamed_1218()];
        sprqhd2.cfr_renamed_2.cfr_renamed_1197(arg0, 0, arg0.length);
        this.cfr_renamed_2.cfr_renamed_1197(arg1, 0, arg1.length);
        this.cfr_renamed_2.cfr_renamed_1221((byte)(arg1.length >>> 8));
        this.cfr_renamed_2.cfr_renamed_1221((byte)arg1.length);
        this.cfr_renamed_2.cfr_renamed_1219(byArray, 0);
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprqhd(sprko sprko2, SecureRandom secureRandom) {
        void arg0;
        sprqhd sprqhd2 = this;
        this.cfr_renamed_2 = arg0;
        sprqhd2.cfr_renamed_3 = this.cfr_renamed_2.cfr_renamed_3248();
        sprqhd2.cfr_renamed_4 = secureRandom;
    }

    @Override
    public boolean cfr_renamed_3877(sprxmd arg0, byte[] arg1) {
        if (arg1.length + arg0.cfr_renamed_3880().length != this.cfr_renamed_3) {
            throw new sprjkd(sprjrf.cfr_renamed_9("X\u0013f\u0005t\u0011pVt\u0018qVb\u001fa\u0018p\u0005fVf\u0013v\u0004p\u00025\u001ap\u0018r\u0002}\u00055\u0012zV{\u0019aVx\u0017a\u0015}X"));
        }
        byte[] byArray = this.cfr_renamed_3879(arg0.cfr_renamed_3880(), arg1);
        return sprzra.cfr_renamed_559(arg0.cfr_renamed_3881(), byArray);
    }
}

