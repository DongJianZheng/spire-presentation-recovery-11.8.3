/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprboj;
import com.spire.presentation.packages.sprcrn;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprrdo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtxca;
import com.spire.presentation.packages.spruao;
import com.spire.presentation.packages.spryjn;

@sprtea
public class sprlnn
extends sprcrn {
    private byte[] cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private boolean cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprlnn(sprgdo sprgdo2, byte[] byArray, int n, int n2, boolean bl) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprlnn sprlnn2 = this;
        sprlnn sprlnn3 = this;
        super((sprgdo)arg0);
        sprlnn3.cfr_renamed_1 = arg1;
        sprlnn3.cfr_renamed_3 = arg2;
        sprlnn2.cfr_renamed_2 = arg3;
        sprlnn2.cfr_renamed_4 = bl;
    }

    @Override
    public void cfr_renamed_14407() {
        sprlnn sprlnn2 = this;
        sprlnn2.cfr_renamed_4924(this.cfr_renamed_1, 0, sprlnn2.cfr_renamed_1.length);
    }

    @Override
    @sprtea
    public spruao cfr_renamed_14114() {
        sprrdo sprrdo2;
        sprrdo sprrdo3 = sprrdo2 = new sprrdo();
        sprrdo sprrdo4 = sprrdo2;
        sprrdo4.cfr_renamed_14178(8);
        sprrdo4.cfr_renamed_14179(this.cfr_renamed_3);
        sprrdo3.cfr_renamed_14180(1);
        sprrdo3.cfr_renamed_14182(true);
        return sprrdo3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @sprtea
    public void cfr_renamed_14404(spryjn spryjn2) {
        void arg0;
        void v0 = arg0;
        void v1 = arg0;
        void v2 = arg0;
        v2.cfr_renamed_14057(sprboj.cfr_renamed_9("%|sXo"), sprtxca.cfr_renamed_9("9\u001fY%|\"u3"));
        v2.cfr_renamed_14057(sprboj.cfr_renamed_9("\u0007Y]h\\sXo"), sprtxca.cfr_renamed_9("9\u000e{&q\""));
        v1.cfr_renamed_14094(sprboj.cfr_renamed_9("\u0007]An\\b"), this.cfr_renamed_3);
        v1.cfr_renamed_14094(sprtxca.cfr_renamed_9("h^\"\u007f ~3"), this.cfr_renamed_2);
        v0.cfr_renamed_14057(sprboj.cfr_renamed_9("%keDeZYXkKo"), sprtxca.cfr_renamed_9("hR\"`.u\"Q5w>"));
        v0.cfr_renamed_14094("/BitsPerComponent", 8);
        if (this.cfr_renamed_4) {
            arg0.cfr_renamed_14057(sprboj.cfr_renamed_9("\u0007GI~\\o"), sprtxca.cfr_renamed_9("\u001c&g&g&\u001a"));
        }
    }
}

