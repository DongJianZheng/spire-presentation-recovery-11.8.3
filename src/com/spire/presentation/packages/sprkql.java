/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbtl;
import com.spire.presentation.packages.sprdxn;
import com.spire.presentation.packages.sprixl;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprmrl;
import com.spire.presentation.packages.sprnvl;
import com.spire.presentation.packages.sprtpl;

public class sprkql {
    private final sprmrl cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprkql(sprjj sprjj2) {
        void arg0;
        sprkql sprkql2 = this;
        sprkql2.cfr_renamed_4 = new sprmrl((sprjj)arg0);
    }

    public sprbtl cfr_renamed_10947(String arg0, int arg1, sprtpl arg2) throws sprixl {
        if (arg1 < 0 || arg1 > 3) {
            throw new sprixl(new StringBuilder().insert(0, sprdxn.cfr_renamed_9("<N\"N&W'\u0000*E;T F C(T,\u0000<S(G,\u001ai")).append(arg1).toString());
        }
        sprnvl sprnvl2 = this.cfr_renamed_4.cfr_renamed_10946(arg0);
        byte[] byArray = new byte[]{(byte)arg1, 0, 0};
        return new sprbtl(sprnvl2.cfr_renamed_10944(), byArray, arg2);
    }

    public sprbtl cfr_renamed_10948(String arg0, sprtpl arg1) throws sprixl {
        return this.cfr_renamed_10947(arg0, 3, arg1);
    }
}

