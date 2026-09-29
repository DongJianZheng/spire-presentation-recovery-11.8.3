/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spratk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcqm;
import com.spire.presentation.packages.sprcrk;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprjs;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sprkik;
import com.spire.presentation.packages.sprkv;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqrq;
import com.spire.presentation.packages.sprrkl;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprybl;
import java.security.SecureRandom;

public class spreal
implements sprkv {
    private SecureRandom cfr_renamed_2;
    private sprjs cfr_renamed_3;
    private sprkik cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spreal(sprjs sprjs2, SecureRandom secureRandom) {
        void arg0;
        spreal spreal2 = this;
        spreal2.cfr_renamed_3 = arg0;
        spreal2.cfr_renamed_2 = secureRandom;
    }

    public sprbj cfr_renamed_3487(byte[] arg0, int arg1) {
        return this.cfr_renamed_3485(arg0, 0, arg1);
    }

    @Override
    public sprbj cfr_renamed_1456(byte[] arg0, int arg1, int arg2, int arg3) throws IllegalArgumentException {
        if (!this.cfr_renamed_4.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprqrq.cfr_renamed_9("[\u0007b\u0003j\u0001nU`\u0010rUy\u0010z\u0000b\u0007n\u0011+\u0013d\u0007+\u0011n\u0016y\f{\u0001b\u001ae"));
        }
        int n = arg1;
        byte[] byArray = new sprcrk(this.cfr_renamed_4, arg3, this.cfr_renamed_3).cfr_renamed_5685(sproze.cfr_renamed_533(arg0, n, n + arg2));
        return new sprtpk(byArray);
    }

    public sprbj cfr_renamed_3488(byte[] arg0, int arg1) {
        return this.cfr_renamed_1456(arg0, 0, arg0.length, arg1);
    }

    @Override
    public sprbj cfr_renamed_3485(byte[] arg0, int arg1, int arg2) throws IllegalArgumentException {
        if (this.cfr_renamed_4.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprcqm.cfr_renamed_9("Wbe{nt'|bn'ebfr~urc7axu7byde~gs~hy"));
        }
        spreal spreal2 = this;
        sprki sprki2 = new spratk(arg2, spreal2.cfr_renamed_3, spreal2.cfr_renamed_2).cfr_renamed_5686(this.cfr_renamed_4);
        byte[] byArray = sprki2.cfr_renamed_5684();
        System.arraycopy(byArray, 0, arg0, arg1, byArray.length);
        return new sprtpk(sprki2.cfr_renamed_3880());
    }

    @Override
    public void cfr_renamed_5692(sprbj arg0) throws IllegalArgumentException {
        if (!(arg0 instanceof sprkik)) {
            throw new IllegalArgumentException(sprqrq.cfr_renamed_9("'X4+\u001en\f+\u0007n\u0004~\u001cy\u0010o"));
        }
        this.cfr_renamed_4 = (sprkik)arg0;
        sprybl.cfr_renamed_9170(new sprfdl(sprcqm.cfr_renamed_9("UDF\\bz"), sprrkl.cfr_renamed_9919(this.cfr_renamed_4.cfr_renamed_2295()), arg0, this.cfr_renamed_4.cfr_renamed_1352() ? spriil.cfr_renamed_152 : spriil.cfr_renamed_3));
    }
}

