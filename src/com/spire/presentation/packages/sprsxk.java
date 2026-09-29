/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprqap;
import com.spire.presentation.packages.sprucaa;
import com.spire.presentation.packages.sprwjl;

public class sprsxk
implements sprmr {
    private final int cfr_renamed_2;
    private boolean cfr_renamed_3;
    public static final int cfr_renamed_4 = 1;

    @Override
    public void cfr_renamed_41() {
    }

    public sprsxk(int n) {
        this.cfr_renamed_2 = n;
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_2;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprqap.cfr_renamed_9("~{\\b");
    }

    public sprsxk() {
        this(1);
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) throws IllegalArgumentException {
        this.cfr_renamed_3 = true;
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprddl, IllegalStateException {
        int n;
        if (!this.cfr_renamed_3) {
            throw new IllegalStateException(sprucaa.cfr_renamed_9("z\u0010X\t\u0014\u0000Z\u0002]\u000bQEZ\n@E]\u000b]\u0011]\u0004X\fG\u0000P"));
        }
        if (arg1 + this.cfr_renamed_2 > arg0.length) {
            throw new sprddl(sprqap.cfr_renamed_9("Y`@{D.R{VhU|\u0010z_a\u0010}XaBz"));
        }
        if (arg3 + this.cfr_renamed_2 > arg2.length) {
            throw new sprwjl(sprucaa.cfr_renamed_9("[\u0010@\u0015A\u0011\u0014\u0007A\u0003R\u0000FE@\n[EG\r[\u0017@"));
        }
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            int n3 = arg3 + n;
            byte by = arg0[arg1 + n];
            arg2[n3] = by;
            n2 = ++n;
        }
        return this.cfr_renamed_2;
    }
}

