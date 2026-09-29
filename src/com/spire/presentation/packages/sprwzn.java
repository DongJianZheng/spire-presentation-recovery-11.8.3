/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprayca;
import com.spire.presentation.packages.sprfbo;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprkbo;
import com.spire.presentation.packages.sprkvn;
import com.spire.presentation.packages.sprrwn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprudo;
import com.spire.presentation.packages.sprwbp;

@sprtea
public abstract class sprwzn {
    private static sprwzn cfr_renamed_0;
    private static sprwzn cfr_renamed_1;
    private static sprwzn cfr_renamed_2;
    private static sprwzn cfr_renamed_3;
    private static sprwzn cfr_renamed_4;

    @sprtea
    public static sprwzn cfr_renamed_14192(int arg0) {
        switch (arg0) {
            case 0: {
                sprwzn sprwzn2 = sprwzn.cfr_renamed_14201();
                while (false) {
                }
                return sprwzn2;
            }
            case 1: {
                return sprwzn.cfr_renamed_14119();
            }
            case 2: {
                return sprwzn.cfr_renamed_14202();
            }
            case 3: {
                return sprwzn.cfr_renamed_14796();
            }
        }
        throw new IllegalStateException(sprayca.cfr_renamed_9("\u0003b=b9{8,4e\"a7|vo9`9~v\u007f&m5ix"));
    }

    @sprtea
    public abstract String cfr_renamed_14083();

    @sprtea
    public abstract String cfr_renamed_14782();

    @sprtea
    public static sprwzn cfr_renamed_14797(sprwbp arg0) {
        if (arg0.cfr_renamed_14798()) {
            return sprwzn.cfr_renamed_14202();
        }
        return sprwzn.cfr_renamed_14201();
    }

    @sprtea
    public abstract String cfr_renamed_14783();

    @sprtea
    public static sprwzn cfr_renamed_14201() {
        return cfr_renamed_0;
    }

    @sprtea
    public static sprwzn cfr_renamed_14202() {
        return cfr_renamed_4;
    }

    static {
        cfr_renamed_4 = new sprkvn();
        cfr_renamed_0 = new sprfbo();
        cfr_renamed_3 = new sprudo();
        cfr_renamed_2 = new sprkbo();
        cfr_renamed_1 = new sprrwn();
    }

    @sprtea
    public abstract int cfr_renamed_14181();

    @sprtea
    public abstract String cfr_renamed_13163(sprwbp var1);

    public static sprwzn cfr_renamed_14796() {
        return cfr_renamed_3;
    }

    @sprtea
    public static sprwzn cfr_renamed_14775() {
        return cfr_renamed_1;
    }

    @sprtea
    public static sprwzn cfr_renamed_14119() {
        return cfr_renamed_2;
    }

    @sprtea
    public static sprwzn cfr_renamed_14778(sprwbp arg0, sprgdo arg1) {
        if (arg0.cfr_renamed_14798()) {
            return sprwzn.cfr_renamed_14202();
        }
        if (arg1 != null && arg1.cfr_renamed_14359()) {
            return sprwzn.cfr_renamed_14796();
        }
        return sprwzn.cfr_renamed_14201();
    }
}

