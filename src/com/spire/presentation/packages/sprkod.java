/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraod;
import com.spire.presentation.packages.sprcvd;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprixd;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sproud;
import com.spire.presentation.packages.sprt;

public class sprkod
extends spraod {
    @Override
    public sprixd cfr_renamed_3244(sprije arg0, sprije arg1, byte[] arg2) throws sprlqd {
        sprt sprt2 = this.cfr_renamed_4047(arg0, arg1, arg2);
        Object object = sprcvd.cfr_renamed_4210(false, sprt2, arg1);
        return new sprixd(new sproud(this, arg1, object));
    }

    public sprkod(sprhgb arg0) {
        super(arg0);
    }
}

