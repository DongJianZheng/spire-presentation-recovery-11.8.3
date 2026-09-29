/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprakn;
import com.spire.presentation.packages.sprhty;
import com.spire.presentation.packages.sprpmn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvfja;

@sprtea
public class spraon
extends sprpmn {
    private static sprvfja cfr_renamed_4 = sprvfja.cfr_renamed_13347(sprhty.cfr_renamed_9("Ac\txW"));

    private /* synthetic */ boolean cfr_renamed_12420(int arg0) {
        return arg0 == 9 || arg0 == 10 || arg0 == 13 || arg0 >= 32 && arg0 <= 55295 || arg0 >= 57344 && arg0 <= 65533 || arg0 >= 65536 && arg0 <= 0x10FFFF;
    }

    @sprtea
    public float cfr_renamed_14108() {
        return this.cfr_renamed_13355(0);
    }

    @sprtea
    public spraon(sprakn arg0) {
        super(arg0);
    }

    @sprtea
    public float cfr_renamed_14107(int arg0) {
        float f = 0.0f;
        spraon spraon2 = this;
        float f2 = spraon2.cfr_renamed_13353(arg0);
        float f3 = spraon2.cfr_renamed_13354(arg0);
        if (f2 != -1.0f) {
            f += f2;
        }
        if (f3 != 0.0f) {
            f += f3;
        }
        return f;
    }
}

