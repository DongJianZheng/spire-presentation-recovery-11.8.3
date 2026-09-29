/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraep;
import com.spire.presentation.packages.sprcjn;
import com.spire.presentation.packages.sprcxp;
import com.spire.presentation.packages.sprczo;
import com.spire.presentation.packages.sprdqn;
import com.spire.presentation.packages.sprebp;
import com.spire.presentation.packages.sprfsn;
import com.spire.presentation.packages.sprjxq;
import com.spire.presentation.packages.sprpkja;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprsto;
import com.spire.presentation.packages.sprtea;

@sprtea
public class spruqn
extends sprfsn {
    private String cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private sprczo cfr_renamed_3;
    private int cfr_renamed_4;

    @sprtea
    public void cfr_renamed_13477() {
        String string;
        spruqn spruqn2;
        if (!this.cfr_renamed_2820().cfr_renamed_13097().cfr_renamed_13405()) {
            Object[] objectArray = new Object[2];
            objectArray[0] = this.cfr_renamed_1;
            objectArray[1] = spraep.cfr_renamed_13311(this.cfr_renamed_4);
            String string2 = sprraia.cfr_renamed_11562(sprjxq.cfr_renamed_9("=I;W=H;"), objectArray);
            spruqn spruqn3 = this;
            spruqn2 = spruqn3;
            string = this.cfr_renamed_2820().cfr_renamed_13447(string2, spruqn3.cfr_renamed_2, false);
        } else {
            Object[] objectArray = new Object[2];
            objectArray[0] = spraep.cfr_renamed_13478(this.cfr_renamed_4);
            objectArray[1] = sprpkja.cfr_renamed_510(this.cfr_renamed_2);
            string = sprraia.cfr_renamed_11562(sprcxp.cfr_renamed_9("c\\s\\=F7@<_fNb\u000b3\u0011|\fz"), objectArray);
            spruqn2 = this;
        }
        spruqn2.cfr_renamed_13380().cfr_renamed_12423("image");
        spruqn spruqn4 = this;
        spruqn spruqn5 = this;
        spruqn4.cfr_renamed_13380().cfr_renamed_12405("id", spruqn5.cfr_renamed_1);
        spruqn5.cfr_renamed_13380().cfr_renamed_12405("xlink:href", string);
        spruqn4.cfr_renamed_13380().cfr_renamed_12405("width", sprebp.cfr_renamed_13083(this.cfr_renamed_3.cfr_renamed_1942()));
        spruqn4.cfr_renamed_13380().cfr_renamed_12405("height", sprebp.cfr_renamed_13083(this.cfr_renamed_3.cfr_renamed_1452()));
        spruqn4.cfr_renamed_13380().cfr_renamed_12439();
    }

    /*
     * WARNING - void declaration
     */
    public spruqn(String string, byte[] byArray, sprdqn sprdqn2) {
        void arg1;
        void arg0;
        void arg2;
        spruqn spruqn2 = this;
        super((sprcjn)arg2);
        this.cfr_renamed_1 = arg0;
        this.cfr_renamed_2 = arg1;
        spruqn2.cfr_renamed_4 = sprsto.cfr_renamed_13225(this.cfr_renamed_2);
        spruqn2.cfr_renamed_3 = sprsto.cfr_renamed_13321(byArray);
    }

    @sprtea
    public String cfr_renamed_13479() {
        return this.cfr_renamed_1;
    }
}

