/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprapm;
import com.spire.presentation.packages.sprhyo;
import com.spire.presentation.packages.sprirm;
import com.spire.presentation.packages.sprngk;
import com.spire.presentation.packages.sprnom;
import com.spire.presentation.packages.sprvgk;
import com.spire.presentation.packages.sprwum;
import com.spire.presentation.packages.sprywl;
import com.spire.presentation.packages.sprzmk;
import java.io.IOException;
import java.util.Date;

public class sprqpk
extends sprngk {
    public void cfr_renamed_2582(Date arg0) {
        this.cfr_renamed_2.cfr_renamed_9829(new sprnom(arg0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprzmk cfr_renamed_9830(sprywl arg0) throws sprvgk {
        try {
            sprirm sprirm2 = new sprirm(arg0.cfr_renamed_91());
            return this.cfr_renamed_9831(sprirm2);
        }
        catch (IOException iOException) {
            throw new sprvgk(sprhyo.cfr_renamed_9("SH|EpM5]z\tpGvFqL5jXz5Z|N{Lq\tqHaH"), iOException);
        }
    }

    public sprqpk() {
        super(new sprapm(sprwum.cfr_renamed_4));
    }
}

