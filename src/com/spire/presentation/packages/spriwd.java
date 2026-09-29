/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbsa;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.spred;
import com.spire.presentation.packages.sprfa;
import com.spire.presentation.packages.sprkte;
import com.spire.presentation.packages.spron;
import com.spire.presentation.packages.sprrsq;
import com.spire.presentation.packages.sprywa;
import com.spire.presentation.packages.sprzod;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class spriwd {
    private sprkte cfr_renamed_3;
    private spron cfr_renamed_4;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ byte[] cfr_renamed_4355(spred arg0) throws sprzod {
        if (this.cfr_renamed_3.cfr_renamed_4356() != null) {
            throw new UnsupportedOperationException();
        }
        if (this.cfr_renamed_3.cfr_renamed_4357() != null) {
            throw new UnsupportedOperationException();
        }
        sprfa sprfa2 = arg0.cfr_renamed_3245(this.cfr_renamed_3.cfr_renamed_4358(), this.cfr_renamed_3.cfr_renamed_4359(), this.cfr_renamed_3.cfr_renamed_4360().cfr_renamed_81());
        InputStream inputStream = sprfa2.cfr_renamed_1447(new ByteArrayInputStream(this.cfr_renamed_3.cfr_renamed_4361().cfr_renamed_81()));
        try {
            byte[] byArray = sprbsa.cfr_renamed_471(inputStream);
            if (this.cfr_renamed_4 == null) return byArray;
            return this.cfr_renamed_4.cfr_renamed_4362(byArray);
        }
        catch (IOException iOException) {
            throw new sprzod(new StringBuilder().insert(0, sprrsq.cfr_renamed_9("\u0014u9z8`wd6f$qwp2w%m'`2pwp6`6.w")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public char[] cfr_renamed_4363(spred arg0) throws sprzod {
        return sprywa.cfr_renamed_427(this.cfr_renamed_4355(arg0)).toCharArray();
    }

    /*
     * WARNING - void declaration
     */
    public spriwd(sprkte sprkte2, spron spron2) {
        void arg0;
        spriwd spriwd2 = this;
        spriwd2.cfr_renamed_3 = arg0;
        spriwd2.cfr_renamed_4 = spron2;
    }

    public spriwd(sprkte sprkte2) {
        this.cfr_renamed_3 = sprkte2;
    }

    public sprcyd cfr_renamed_4364(spred arg0) throws sprzod {
        return new sprcyd(sprcge.cfr_renamed_23(this.cfr_renamed_4355(arg0)));
    }
}

