/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbln;
import com.spire.presentation.packages.sprcao;
import com.spire.presentation.packages.sprcq;
import com.spire.presentation.packages.sprfy;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprgdp;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprhlp;
import com.spire.presentation.packages.sprkhn;
import com.spire.presentation.packages.sprmin;
import com.spire.presentation.packages.sprnmp;
import com.spire.presentation.packages.sprpip;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprswn
implements sprcq {
    private String cfr_renamed_3;
    private sprbln cfr_renamed_4;

    @Override
    public String cfr_renamed_14599() {
        return this.cfr_renamed_3;
    }

    public static sprswn cfr_renamed_14588(sprgdo arg0, String arg1, sprgdp arg2) {
        sprqgp sprqgp2 = sprswn.cfr_renamed_14753(arg2.cfr_renamed_12672(), sprswn.cfr_renamed_14754(arg0));
        sprkhn sprkhn2 = new sprkhn(arg0, arg2, sprqgp2);
        return new sprswn(arg1, sprkhn2);
    }

    @Override
    public String cfr_renamed_4570() {
        return this.cfr_renamed_4.cfr_renamed_4570();
    }

    public void cfr_renamed_14291(sprfy arg0) {
        this.cfr_renamed_4.cfr_renamed_14291(arg0);
    }

    private static /* synthetic */ sprqgp cfr_renamed_14753(sprqgp arg0, sprqgp arg1) {
        if (arg0 == null) {
            float f;
            float f2 = f = (float)sprnmp.cfr_renamed_13495(1.0);
            sprqgp sprqgp2 = new sprqgp(f2, 0.0f, 0.0f, f2, 0.0f, 0.0f);
            return sprqgp2;
        }
        sprqgp sprqgp3 = arg0.cfr_renamed_12099();
        sprqgp3.cfr_renamed_12634(arg1, 1);
        return sprqgp3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprswn(String string, sprbln sprbln2) {
        void arg0;
        sprswn sprswn2 = this;
        sprswn2.cfr_renamed_3 = arg0;
        sprswn2.cfr_renamed_4 = sprbln2;
    }

    public static sprswn cfr_renamed_14585(sprgdo arg0, String arg1, sprpip arg2, sprgeja arg3) {
        sprqgp sprqgp2 = sprswn.cfr_renamed_14753(arg2.cfr_renamed_12672(), sprswn.cfr_renamed_14754(arg0));
        sprmin sprmin2 = new sprmin(arg0, arg2, arg3, sprqgp2);
        return new sprswn(arg1, sprmin2);
    }

    private static /* synthetic */ sprqgp cfr_renamed_14754(sprgdo arg0) {
        return arg0.cfr_renamed_14350().cfr_renamed_14103().cfr_renamed_12491().cfr_renamed_12099();
    }

    public static sprswn cfr_renamed_14587(sprgdo arg0, String arg1, sprhlp arg2) {
        sprqgp sprqgp2 = sprswn.cfr_renamed_14753(null, sprswn.cfr_renamed_14754(arg0));
        sprcao sprcao2 = new sprcao(arg0, arg2, sprqgp2);
        return new sprswn(arg1, sprcao2);
    }
}

