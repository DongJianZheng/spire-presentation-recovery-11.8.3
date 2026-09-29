/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprcvg;
import com.spire.presentation.packages.sprczg;
import com.spire.presentation.packages.sprdwg;
import com.spire.presentation.packages.sprli;
import com.spire.presentation.packages.sprmah;
import com.spire.presentation.packages.sprrwg;
import com.spire.presentation.packages.sprsm;
import com.spire.presentation.packages.sprtm;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprvm;
import com.spire.presentation.packages.spryye;
import java.security.SecureRandom;

public class sprubh
implements sprtm {
    private sprrwg cfr_renamed_0;
    private SecureRandom cfr_renamed_1;
    private int cfr_renamed_2;
    private sprcvg cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public sprli cfr_renamed_7539(int arg0, sprmah arg1) throws sprtqg {
        sprubh sprubh2 = this;
        spryye spryye2 = sprubh2.cfr_renamed_0.cfr_renamed_7934(arg1);
        sprubh sprubh3 = this;
        sprsm sprsm2 = sprubh2.cfr_renamed_3.cfr_renamed_576(sprubh3.cfr_renamed_4);
        sprvm sprvm2 = sprczg.cfr_renamed_8024(sprubh3.cfr_renamed_2, this.cfr_renamed_4, spryye2);
        if (sprubh2.cfr_renamed_1 != null) {
            sprvm2.cfr_renamed_5535(true, new sprbgk(spryye2, this.cfr_renamed_1));
        } else {
            sprvm2.cfr_renamed_5535(true, spryye2);
        }
        return new sprdwg(this, arg0, arg1, sprvm2, sprsm2);
    }

    public static /* synthetic */ int cfr_renamed_8025(sprubh arg0) {
        return arg0.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprubh(int n, int n2) {
        void arg0;
        sprubh sprubh2 = this;
        sprubh sprubh3 = this;
        this.cfr_renamed_3 = new sprcvg();
        sprubh3.cfr_renamed_0 = new sprrwg();
        sprubh2.cfr_renamed_2 = arg0;
        sprubh2.cfr_renamed_4 = n2;
    }

    public static /* synthetic */ int cfr_renamed_8026(sprubh arg0) {
        return arg0.cfr_renamed_4;
    }

    public sprubh cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_1 = arg0;
        return this;
    }
}

