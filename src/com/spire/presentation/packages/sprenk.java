/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbhk;
import com.spire.presentation.packages.sprbok;
import com.spire.presentation.packages.sprelk;
import com.spire.presentation.packages.sprexl;
import com.spire.presentation.packages.spriik;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprqik;
import com.spire.presentation.packages.sprrk;
import com.spire.presentation.packages.sprux;
import com.spire.presentation.packages.sprvdaa;
import com.spire.presentation.packages.sprvok;
import java.io.IOException;

public class sprenk {
    public static final byte[] cfr_renamed_0 = sprkoe.cfr_renamed_433(sprexl.cfr_renamed_9("YlJH"));
    public final int cfr_renamed_1;
    public final int cfr_renamed_2;
    public final long cfr_renamed_3;
    public final sprvok cfr_renamed_4;

    public int cfr_renamed_3() {
        return this.cfr_renamed_2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static sprenk cfr_renamed_9673(Object arg0, sprrk arg1, sprux arg2) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprvdaa.cfr_renamed_9("\u001aV7Y6CyC8\\<\u0017>R-\u00170Y*C8Y:RyX?\u00177B5["));
        }
        sprqik sprqik2 = sprqik.cfr_renamed_9654(arg0);
        if (!sprqik2.cfr_renamed_9671()) {
            return null;
        }
        sprqik sprqik3 = sprqik2;
        int n = sprqik3.cfr_renamed_9666();
        long l = sprqik3.cfr_renamed_9655();
        sprvok sprvok2 = sprvok.cfr_renamed_9698(sprqik3.cfr_renamed_9657());
        int n2 = sprqik3.cfr_renamed_9657();
        switch (spriik.cfr_renamed_4[sprvok2.ordinal()]) {
            case 1: {
                return null;
            }
            case 2: {
                return sprbhk.cfr_renamed_9691(n, l, sprvok2, n2, sprqik2);
            }
            case 3: {
                return sprbok.cfr_renamed_9695(n, l, sprvok2, n2, sprqik2, arg2);
            }
            case 4: {
                return sprelk.cfr_renamed_9661(n, l, sprvok2, n2, sprqik2, arg1, arg2);
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprenk(int n, long l, sprvok sprvok2, int n2) {
        void arg2;
        void arg1;
        void arg0;
        sprenk sprenk2 = this;
        sprenk sprenk3 = this;
        sprenk3.cfr_renamed_1 = arg0;
        sprenk3.cfr_renamed_3 = arg1;
        sprenk2.cfr_renamed_4 = arg2;
        sprenk2.cfr_renamed_2 = n2;
    }

    public sprvok cfr_renamed_324() {
        return this.cfr_renamed_4;
    }
}

