/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraye;
import com.spire.presentation.packages.spricf;
import com.spire.presentation.packages.sprkze;
import com.spire.presentation.packages.sprmze;
import com.spire.presentation.packages.sprnhf;
import com.spire.presentation.packages.sprtef;
import com.spire.presentation.packages.sprwff;

public class sprwxe
extends sprkze {
    private spricf[] cfr_renamed_119;
    private int cfr_renamed_91;
    private sprnhf cfr_renamed_0;
    private spricf cfr_renamed_1;
    private int cfr_renamed_2;
    private sprwff cfr_renamed_3;
    private spraye cfr_renamed_4;

    public sprnhf cfr_renamed_845() {
        return this.cfr_renamed_0;
    }

    public spricf cfr_renamed_1147() {
        return this.cfr_renamed_1;
    }

    public int cfr_renamed_1144() {
        return this.cfr_renamed_1.cfr_renamed_813();
    }

    public sprwxe(int arg0, int arg1, sprnhf arg2, spricf arg3, sprwff arg4, String arg5) {
        sprnhf sprnhf2 = arg2;
        this(arg0, arg1, sprnhf2, arg3, sprtef.cfr_renamed_5488(sprnhf2, arg3), arg4, arg5);
    }

    public sprwff cfr_renamed_1155() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprwxe(int n, int n2, sprnhf sprnhf2, spricf spricf2, spraye spraye2, sprwff sprwff2, String string) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        void arg6;
        sprwxe sprwxe2 = this;
        sprwxe sprwxe3 = this;
        sprwxe sprwxe4 = this;
        super(true, (String)arg6);
        sprwxe4.cfr_renamed_2 = arg0;
        sprwxe4.cfr_renamed_91 = arg1;
        sprwxe3.cfr_renamed_0 = arg2;
        sprwxe3.cfr_renamed_1 = arg3;
        sprwxe2.cfr_renamed_4 = arg4;
        sprwxe2.cfr_renamed_3 = sprwff2;
        sprwxe2.cfr_renamed_119 = new sprmze((sprnhf)arg2, (spricf)arg3).cfr_renamed_812();
    }

    public spricf[] cfr_renamed_1148() {
        return this.cfr_renamed_119;
    }

    public int cfr_renamed_1146() {
        return this.cfr_renamed_2;
    }

    public int cfr_renamed_1150() {
        return this.cfr_renamed_91;
    }

    public spraye cfr_renamed_1153() {
        return this.cfr_renamed_4;
    }
}

