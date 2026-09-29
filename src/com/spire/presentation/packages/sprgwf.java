/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprpag;
import com.spire.presentation.packages.sprqyo;
import com.spire.presentation.packages.sprztf;
import java.security.SecureRandom;

public class sprgwf
extends sprgye {
    private final sprztf[] cfr_renamed_4;

    public sprztf[] cfr_renamed_6517() {
        return this.cfr_renamed_4;
    }

    public int cfr_renamed_6518() {
        return this.cfr_renamed_4.length;
    }

    public sprgwf(sprztf[] arg0, SecureRandom arg1) {
        super(arg1, sprpag.cfr_renamed_6466(arg0[0]));
        if (arg0.length == 0 || arg0.length > 8) {
            throw new IllegalArgumentException(sprqyo.cfr_renamed_9("\u00065\u0019\b\u000b*\u000b5\u000f,\u000f*\u0019x\u0006=\u0004?\u001e0J+\u00027\u001f4\u000ex\b=J:\u000f,\u001d=\u000f6JiJ9\u0004<J`J1\u0004;\u0006-\u00191\u001c="));
        }
        this.cfr_renamed_4 = arg0;
    }
}

