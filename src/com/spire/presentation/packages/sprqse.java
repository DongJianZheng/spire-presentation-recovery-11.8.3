/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprkte;
import com.spire.presentation.packages.sprtbz;
import com.spire.presentation.packages.sprtne;
import com.spire.presentation.packages.spruna;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprqse
extends sprkra
implements sprkj {
    private sprtne cfr_renamed_3;
    private sprkte cfr_renamed_4;

    public static sprqse cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprqse) {
            return (sprqse)arg0;
        }
        if (arg0 instanceof spryte) {
            return new sprqse((spryte)arg0);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprqse(spryte spryte2) {
        void arg0;
        if (spryte2.cfr_renamed_312() == 0) {
            this.cfr_renamed_3 = sprtne.cfr_renamed_23(arg0.cfr_renamed_2456());
            return;
        }
        if (arg0.cfr_renamed_312() == 1) {
            this.cfr_renamed_4 = sprkte.cfr_renamed_23(arg0.cfr_renamed_2456());
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, spruna.cfr_renamed_9("\u001ah\u0004h\u0000q\u0001&\u001bg\b<O")).append(arg0.cfr_renamed_312()).toString());
    }

    public sprkte cfr_renamed_4897() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprqse(sprkte sprkte2) {
        void arg0;
        if (sprkte2 == null) {
            throw new IllegalArgumentException(sprtbz.cfr_renamed_9("\u000e(G.[4Y9L)j([9\u000emJ,G#F9\t/LmG8E!"));
        }
        this.cfr_renamed_4 = arg0;
    }

    @Override
    public sprvva cfr_renamed_119() {
        if (this.cfr_renamed_3 != null) {
            return new sprhse(true, 0, this.cfr_renamed_3);
        }
        return new sprhse(1 != 0, 1, this.cfr_renamed_4);
    }

    public sprtne cfr_renamed_2141() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprqse(sprtne sprtne2) {
        void arg0;
        if (sprtne2 == null) {
            throw new IllegalArgumentException(spruna.cfr_renamed_9("!\fc\u001dr\u0006`\u0006e\u000er\n!Oe\u000eh\u0001i\u001b&\rcOh\u001aj\u0003"));
        }
        this.cfr_renamed_3 = arg0;
    }
}

