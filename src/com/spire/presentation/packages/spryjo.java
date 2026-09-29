/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgtb;
import com.spire.presentation.packages.sprhio;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprnlo;
import com.spire.presentation.packages.sproko;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprzfo;

@sprtea
public abstract class spryjo {
    public abstract sprmrn cfr_renamed_16288(sprsuja[] var1, sprwbp[] var2);

    public static spryjo cfr_renamed_1716(int arg0) {
        switch (arg0) {
            case 0: {
                return new sprzfo();
            }
            case 1: {
                return new sproko();
            }
            case 2: {
                return new sprnlo();
            }
        }
        throw new IllegalStateException(sprgtb.cfr_renamed_9("/m\u001f{\nf\u0019w\u001fgZd\bb\u001ej\u001fm\u000e#\u001cj\u0016oZn\u0015g\u001f-"));
    }

    public abstract void cfr_renamed_16289(sprhio var1, int var2);
}

