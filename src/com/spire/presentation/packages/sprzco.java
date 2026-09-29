/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spriai;
import com.spire.presentation.packages.sprspga;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwbo;
import com.spire.presentation.packages.sprxik;
import com.spire.presentation.packages.spryjn;

@sprtea
public class sprzco
extends sprwbo {
    private boolean cfr_renamed_3;
    private String cfr_renamed_4;

    @Override
    @sprtea
    public void cfr_renamed_14944(spryjn arg0) {
        sprzco sprzco2 = this;
        arg0.cfr_renamed_14310(spriai.cfr_renamed_9("$)Y5"), sprzco2.cfr_renamed_4, true);
        if (sprzco2.cfr_renamed_3) {
            arg0.cfr_renamed_14073(sprxik.cfr_renamed_9("\u00134O0]\r"), true);
        }
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprzco(String string, boolean bl) {
        void arg1;
        void arg0;
        if (string == null) {
            throw new NullPointerException("uri");
        }
        this.cfr_renamed_4 = sprzco.cfr_renamed_14945((String)arg0);
        this.cfr_renamed_3 = arg1;
    }

    @Override
    @sprtea
    public String cfr_renamed_14946() {
        return spriai.cfr_renamed_9(")Y5");
    }

    @sprtea
    public sprzco(String arg0) {
        this(arg0, false);
    }

    @sprtea
    public static String cfr_renamed_14945(String arg0) {
        block4: {
            try {
                sprspga sprspga2 = new sprspga(arg0, 0);
                if (!sprspga2.cfr_renamed_14947()) break block4;
                if (sprspga2.cfr_renamed_14948()) {
                    return sprspga2.cfr_renamed_14949();
                }
                return sprspga.cfr_renamed_12906(sprspga.cfr_renamed_14950(sprspga2.cfr_renamed_14949()));
            }
            catch (Exception exception) {
                return arg0;
            }
        }
        return sprspga.cfr_renamed_12906(arg0);
    }
}

