/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprafja;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.Enumeration;

public class sprqgf
extends sprqqe {
    private final sprszm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprqgf(sprszm sprszm2) {
        void arg0;
        int n;
        int n2 = n = 0;
        while (n2 != arg0.cfr_renamed_84()) {
            if (!(arg0.cfr_renamed_85(n) instanceof sprfvg)) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprafja.cfr_renamed_9("\t\u000e\u0017\u000e\u0013\u0017\u0012@\u0013\u0002\u0016\u0005\u001f\u0014\\\t\u0012@\u001f\u000f\u0012\u0013\b\u0012\t\u0003\b\u000f\u000eZ\\")).append(arg0.cfr_renamed_85(n).getClass().getName()).toString());
            }
            n2 = ++n;
        }
        this.cfr_renamed_4 = arg0;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public sprqgf(byte[][] arg0) {
        int n;
        sprrvm sprrvm2 = new sprrvm(arg0.length);
        int n2 = n = 0;
        while (n2 != arg0.length) {
            byte[] byArray = arg0[n];
            sprrvm2.cfr_renamed_5004(new sprfvg(sproze.cfr_renamed_158(byArray)));
            n2 = ++n;
        }
        this.cfr_renamed_4 = new sprcen(sprrvm2);
    }

    public boolean cfr_renamed_5375(byte[] arg0) {
        Enumeration enumeration = this.cfr_renamed_4.cfr_renamed_329();
        while (enumeration.hasMoreElements()) {
            byte[] byArray = sproug.cfr_renamed_23(enumeration.nextElement()).cfr_renamed_186();
            if (!sproze.cfr_renamed_559(arg0, byArray)) continue;
            return true;
        }
        return false;
    }

    public static sprqgf cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprqgf) {
            return (sprqgf)arg0;
        }
        if (arg0 != null) {
            return new sprqgf(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public int cfr_renamed_5366() {
        return this.cfr_renamed_4.cfr_renamed_84();
    }

    public byte[][] cfr_renamed_205() {
        int n;
        byte[][] byArrayArray = new byte[this.cfr_renamed_4.cfr_renamed_84()][];
        int n2 = n = 0;
        while (n2 != byArrayArray.length) {
            int n3 = n++;
            byArrayArray[n3] = sproze.cfr_renamed_158(sproug.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3)).cfr_renamed_186());
            n2 = n;
        }
        return byArrayArray;
    }

    public sprqgf(byte[] arg0) {
        byte[][] byArrayArray = new byte[1][];
        byArrayArray[0] = arg0;
        this(byArrayArray);
    }
}

