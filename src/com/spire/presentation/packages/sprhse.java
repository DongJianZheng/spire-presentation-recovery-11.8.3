/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprcme;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.io.IOException;

public class sprhse
extends spryte {
    private static final byte[] cfr_renamed_4 = new byte[0];

    @Override
    public void cfr_renamed_4613(sprope arg0) throws IOException {
        if (!this.cfr_renamed_3) {
            sprope sprope2;
            int n;
            sprhse sprhse2 = this;
            sprvva sprvva2 = sprhse2.cfr_renamed_1.cfr_renamed_119().cfr_renamed_4615();
            if (sprhse2.cfr_renamed_4 != false) {
                sprope sprope3 = arg0;
                arg0.cfr_renamed_4781(160, this.cfr_renamed_2);
                sprope3.cfr_renamed_4782(sprvva2.cfr_renamed_4616());
                sprope3.cfr_renamed_2149(sprvva2);
                return;
            }
            if (sprvva2.cfr_renamed_4575()) {
                n = 160;
                sprope2 = arg0;
            } else {
                n = 128;
                sprope2 = arg0;
            }
            sprope2.cfr_renamed_4781(n, this.cfr_renamed_2);
            arg0.cfr_renamed_4783(sprvva2);
            return;
        }
        arg0.cfr_renamed_4784(160, this.cfr_renamed_2, cfr_renamed_4);
    }

    @Override
    public boolean cfr_renamed_4575() {
        if (!this.cfr_renamed_3) {
            if (this.cfr_renamed_4 != false) {
                return true;
            }
            return this.cfr_renamed_1.cfr_renamed_119().cfr_renamed_4615().cfr_renamed_4575();
        }
        return true;
    }

    public sprhse(int arg0, spra arg1) {
        super(true, arg0, arg1);
    }

    @Override
    public int cfr_renamed_4616() throws IOException {
        if (!this.cfr_renamed_3) {
            sprhse sprhse2 = this;
            int n = sprhse2.cfr_renamed_1.cfr_renamed_119().cfr_renamed_4615().cfr_renamed_4616();
            if (sprhse2.cfr_renamed_4 != false) {
                return sprcme.cfr_renamed_4585(this.cfr_renamed_2) + sprcme.cfr_renamed_4586(n) + n;
            }
            return sprcme.cfr_renamed_4585(this.cfr_renamed_2) + --n;
        }
        return sprcme.cfr_renamed_4585(this.cfr_renamed_2) + 1;
    }

    public sprhse(boolean arg0, int arg1, spra arg2) {
        super(arg0, arg1, arg2);
    }
}

