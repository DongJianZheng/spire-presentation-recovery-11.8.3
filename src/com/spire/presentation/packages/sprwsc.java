/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreue;
import com.spire.presentation.packages.sprfud;
import com.spire.presentation.packages.sprite;
import com.spire.presentation.packages.sprnsc;
import com.spire.presentation.packages.sprnzc;
import com.spire.presentation.packages.spruxc;
import com.spire.presentation.packages.sprvve;
import com.spire.presentation.packages.sprxqy;
import com.spire.presentation.packages.sprxse;
import java.io.IOException;
import java.util.Date;

public class sprwsc
extends sprnsc {
    public sprwsc() {
        super(new sprvve(sprite.cfr_renamed_0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprnzc cfr_renamed_2580(sprfud arg0) throws spruxc {
        try {
            spreue spreue2 = new spreue(arg0.cfr_renamed_91());
            return this.cfr_renamed_2581(spreue2);
        }
        catch (IOException iOException) {
            throw new spruxc(sprxqy.cfr_renamed_9("g;H6D>\u0001.NzD4B5E?\u0001\u0019l\t\u0001)H=O?EzE;U;"), iOException);
        }
    }

    public void cfr_renamed_2582(Date arg0) {
        this.cfr_renamed_4.cfr_renamed_2583(new sprxse(arg0));
    }
}

