/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmjo;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtyba;
import com.spire.presentation.packages.sprumn;
import com.spire.presentation.packages.sprusca;

@sprtea
public class sprgmo
extends sprmjo {
    private static final sprusca cfr_renamed_4;

    private /* synthetic */ sprgmo() {
        super(sprumn.cfr_renamed_9("YhljNhgb"));
    }

    static {
        String[] stringArray = new String[4];
        stringArray[0] = "Default";
        stringArray[1] = sprtyba.cfr_renamed_9("\u0003\u00001! \u0000\"\u00011");
        stringArray[2] = sprumn.cfr_renamed_9("EnwPjcwo");
        stringArray[3] = sprtyba.cfr_renamed_9("\u0003\u00001; \n1");
        cfr_renamed_4 = new sprusca(stringArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public int cfr_renamed_324() {
        String string = this.cfr_renamed_13030();
        switch (cfr_renamed_4.cfr_renamed_12854(string)) {
            case 0: {
                return 0;
            }
            case 1: {
                return 1;
            }
            case 2: {
                return 2;
            }
            case 3: {
                return 3;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprumn.cfr_renamed_9("\u672d\u77e6\u7683\u81e9\u52af\u7f2a\u6539\u6a22\u5f08\uff19'")).append(string).toString());
    }

    private /* synthetic */ sprgmo(String string) {
        sprgmo sprgmo2 = this;
        sprgmo2();
        sprgmo2.cfr_renamed_15614(string);
    }

    @sprtea
    public sprgmo(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public static sprgmo cfr_renamed_4944(int arg0) {
        return new sprgmo(String.valueOf(arg0));
    }
}

