/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgo;
import com.spire.presentation.packages.sprqxn;
import com.spire.presentation.packages.sprzsc;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class sprzuc {
    public short cfr_renamed_3;
    public short cfr_renamed_4;

    public short cfr_renamed_2690() {
        return this.cfr_renamed_4;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprzuc)) {
            return false;
        }
        sprzuc sprzuc2 = (sprzuc)arg0;
        return sprzuc2.cfr_renamed_2690() == this.cfr_renamed_2690() && sprzuc2.cfr_renamed_79() == this.cfr_renamed_79();
    }

    public short cfr_renamed_79() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprzuc(short s, short s2) {
        void arg0;
        void arg1;
        if (!sprzsc.cfr_renamed_2759(s)) {
            throw new IllegalArgumentException(sprqxn.cfr_renamed_9("aS'H.\u001cfH.T3W\"\u001b$^fZfN/U2\u0003"));
        }
        if (!sprzsc.cfr_renamed_2759((short)arg1)) {
            throw new IllegalArgumentException(sprbgo.cfr_renamed_9("\u001e.P:W<M(K8\u001e}J5V(U9\u0019?\\}X}L4W)\u0001"));
        }
        if (arg1 == false) {
            throw new IllegalArgumentException(sprqxn.cfr_renamed_9("\u001c5R!U'O3I#\u001cfv\u0013h\u0012\u001b\bt\u0012\u001b$^f\u0019'U)U?V)N5\u0019"));
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_3 = arg1;
    }

    public void cfr_renamed_2623(OutputStream arg0) throws IOException {
        sprzuc sprzuc2 = this;
        sprzsc.cfr_renamed_2676(sprzuc2.cfr_renamed_2690(), arg0);
        sprzsc.cfr_renamed_2676(sprzuc2.cfr_renamed_79(), arg0);
    }

    public int hashCode() {
        return this.cfr_renamed_2690() << 16 | this.cfr_renamed_79();
    }

    public static sprzuc cfr_renamed_2661(InputStream arg0) throws IOException {
        InputStream inputStream = arg0;
        short s = sprzsc.cfr_renamed_2630(inputStream);
        short s2 = sprzsc.cfr_renamed_2630(inputStream);
        return new sprzuc(s, s2);
    }
}

