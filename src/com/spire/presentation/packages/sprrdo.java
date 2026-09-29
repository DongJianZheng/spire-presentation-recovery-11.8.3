/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravr;
import com.spire.presentation.packages.sprbbo;
import com.spire.presentation.packages.sprecia;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruao;

@sprtea
public class sprrdo
extends spruao {
    private boolean cfr_renamed_137;
    private static final int cfr_renamed_79 = 8;
    private static final int cfr_renamed_107 = 1;
    private int cfr_renamed_132;
    private boolean cfr_renamed_102;
    private static final int cfr_renamed_93 = 1;
    private boolean cfr_renamed_86;
    private static final String cfr_renamed_152 = "/Colors";
    private static final String cfr_renamed_112 = "/BitsPerComponent";
    private int cfr_renamed_119;
    private static final String cfr_renamed_91 = "/Predictor";
    private boolean cfr_renamed_0;
    private static final String cfr_renamed_1 = "/Columns";
    private boolean cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    @sprtea
    public String cfr_renamed_14083() {
        return sprecia.cfr_renamed_9("x'\r<\u0013\u000e4\u00043\u000e");
    }

    private /* synthetic */ void cfr_renamed_14921() {
        if (this.cfr_renamed_86 || this.cfr_renamed_102 || this.cfr_renamed_0 || this.cfr_renamed_2) {
            if (this.cfr_renamed_137) {
                if (this.cfr_renamed_132 >= 3) {
                    this.cfr_renamed_4 = 14;
                    return;
                }
                this.cfr_renamed_4 = 1;
                return;
            }
            if (this.cfr_renamed_132 >= 3) {
                this.cfr_renamed_4 = 15;
                return;
            }
            this.cfr_renamed_4 = 1;
        }
    }

    @sprtea
    public void cfr_renamed_14178(int arg0) {
        if (arg0 != 8) {
            sprrdo sprrdo2 = this;
            sprrdo2.cfr_renamed_3 = arg0;
            sprrdo2.cfr_renamed_0 = true;
        }
    }

    @sprtea
    public int cfr_renamed_14922() {
        return this.cfr_renamed_132;
    }

    @sprtea
    public void cfr_renamed_14180(int arg0) {
        if (arg0 != 1) {
            sprrdo sprrdo2 = this;
            sprrdo2.cfr_renamed_132 = arg0;
            sprrdo2.cfr_renamed_102 = true;
        }
    }

    @sprtea
    public void cfr_renamed_14179(int arg0) {
        if (arg0 != 1) {
            sprrdo sprrdo2 = this;
            sprrdo2.cfr_renamed_119 = arg0;
            sprrdo2.cfr_renamed_2 = true;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_14182(boolean bl) {
        void arg0;
        sprrdo sprrdo2 = this;
        sprrdo2.cfr_renamed_137 = arg0;
        sprrdo2.cfr_renamed_86 = true;
    }

    public sprrdo() {
        sprrdo sprrdo2 = this;
        sprrdo sprrdo3 = this;
        sprrdo3.cfr_renamed_4 = 10;
        sprrdo3.cfr_renamed_132 = 1;
        sprrdo2.cfr_renamed_119 = 1;
        sprrdo2.cfr_renamed_3 = 8;
    }

    @Override
    @sprtea
    public spreen cfr_renamed_14115(spreen arg0) {
        sprrdo sprrdo2 = this;
        sprrdo2.cfr_renamed_14921();
        if (sprrdo2.cfr_renamed_4 == 1) {
            return new sprbbo(arg0);
        }
        sprrdo sprrdo3 = this;
        sprrdo sprrdo4 = this;
        return new sprbbo(arg0, sprrdo3.cfr_renamed_4, sprrdo3.cfr_renamed_132, sprrdo4.cfr_renamed_119, sprrdo4.cfr_renamed_3);
    }

    @Override
    @sprtea
    public String cfr_renamed_14084() {
        sprrdo sprrdo2 = this;
        sprrdo2.cfr_renamed_14921();
        if (sprrdo2.cfr_renamed_4 != 1) {
            StringBuilder stringBuilder;
            StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
            sprghha.cfr_renamed_12279(stringBuilder2, spravr.cfr_renamed_9("\u0005z"));
            Object[] objectArray = new Object[2];
            objectArray[0] = cfr_renamed_91;
            objectArray[1] = this.cfr_renamed_4;
            sprghha.cfr_renamed_12289(stringBuilder2, sprecia.cfr_renamed_9("\u0010g\u0016w\u0010f\u0016"), objectArray);
            if (this.cfr_renamed_102) {
                Object[] objectArray2 = new Object[2];
                objectArray2[0] = cfr_renamed_152;
                objectArray2[1] = this.cfr_renamed_132;
                sprghha.cfr_renamed_12289(stringBuilder, spravr.cfr_renamed_9("=\t;\u0019=\b;"), objectArray2);
            }
            if (this.cfr_renamed_2) {
                Object[] objectArray3 = new Object[2];
                objectArray3[0] = cfr_renamed_1;
                objectArray3[1] = this.cfr_renamed_119;
                sprghha.cfr_renamed_12289(stringBuilder, sprecia.cfr_renamed_9("\u0010g\u0016w\u0010f\u0016"), objectArray3);
            }
            if (this.cfr_renamed_0) {
                Object[] objectArray4 = new Object[2];
                objectArray4[0] = cfr_renamed_112;
                objectArray4[1] = this.cfr_renamed_3;
                sprghha.cfr_renamed_12289(stringBuilder, spravr.cfr_renamed_9("=\t;\u0019=\b;"), objectArray4);
            }
            StringBuilder stringBuilder3 = stringBuilder;
            sprghha.cfr_renamed_12279(stringBuilder3, sprecia.cfr_renamed_9("iU"));
            return stringBuilder3.toString();
        }
        return null;
    }

    @sprtea
    public int cfr_renamed_14121() {
        return this.cfr_renamed_3;
    }

    @sprtea
    public int cfr_renamed_6329() {
        return this.cfr_renamed_119;
    }
}

