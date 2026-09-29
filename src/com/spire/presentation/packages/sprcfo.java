/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdfo;
import com.spire.presentation.packages.sprkoo;
import com.spire.presentation.packages.sprlmo;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprszca;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxko;
import java.util.ArrayList;

@sprtea
public class sprcfo
extends sprkoo {
    private ArrayList<String> cfr_renamed_4;

    @Override
    public void cfr_renamed_16240() {
    }

    @Override
    public sprmrn cfr_renamed_5112() {
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprcfo(byte[] byArray) {
        super(new sprdfo((byte[])arg0), new sprlmo(null));
        void arg0;
    }

    @Override
    public void cfr_renamed_16237() {
        if (((sprxko)((Object)this.cfr_renamed_4)).cfr_renamed_324() == 70) {
            String string;
            int n = this.cfr_renamed_3.cfr_renamed_12261();
            sprcfo sprcfo2 = this;
            String string2 = string = sprszca.cfr_renamed_12801().cfr_renamed_14565(sprcfo2.cfr_renamed_3.cfr_renamed_16065(n));
            sprovja.cfr_renamed_16066(sprcfo2.cfr_renamed_4, string2.substring(0, 0 + (string2.length() - 1)));
        }
    }

    private /* synthetic */ ArrayList<String> cfr_renamed_137() {
        sprcfo sprcfo2 = this;
        sprcfo sprcfo3 = this;
        sprcfo2.cfr_renamed_4 = new ArrayList();
        sprcfo2.cfr_renamed_13697(false);
        return sprcfo2.cfr_renamed_4;
    }

    @sprtea
    public static ArrayList<String> cfr_renamed_11774(byte[] arg0) {
        return new sprcfo(arg0).cfr_renamed_137();
    }
}

