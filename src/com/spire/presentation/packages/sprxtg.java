/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyg;
import com.spire.presentation.packages.sprdhea;
import com.spire.presentation.packages.sprfbh;
import com.spire.presentation.packages.sprgwg;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprmrg;
import com.spire.presentation.packages.sprnrg;
import com.spire.presentation.packages.sprrd;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprth;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprxil;
import java.security.Provider;

public class sprxtg
implements sprrd {
    private sprth cfr_renamed_1;
    private final char[] cfr_renamed_2;
    private sprmrg cfr_renamed_3;
    private sprcyg cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprxtg cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprcyg(new sprxil((String)arg0));
        if (this.cfr_renamed_3 != null) {
            this.cfr_renamed_3.cfr_renamed_1499((String)arg0);
        }
        return this;
    }

    public static /* synthetic */ sprcyg cfr_renamed_7949(sprxtg arg0) {
        return arg0.cfr_renamed_4;
    }

    @Override
    public sprgwg cfr_renamed_2776(String arg0) throws sprtqg {
        if (this.cfr_renamed_1 == null) {
            this.cfr_renamed_1 = this.cfr_renamed_3.cfr_renamed_1451();
        }
        if (arg0.indexOf(sprdhea.cfr_renamed_9("_\u001fR")) >= 0) {
            sprxtg sprxtg2 = this;
            return new sprfbh(sprxtg2, this.cfr_renamed_2, sprxtg2.cfr_renamed_1);
        }
        sprxtg sprxtg3 = this;
        return new sprnrg(sprxtg3, this.cfr_renamed_2, sprxtg3.cfr_renamed_1);
    }

    /*
     * WARNING - void declaration
     */
    public sprxtg(char[] cArray, sprth sprth2) {
        void arg0;
        sprxtg sprxtg2 = this;
        sprxtg sprxtg3 = this;
        sprxtg3.cfr_renamed_4 = new sprcyg(new sprrul());
        sprxtg2.cfr_renamed_2 = arg0;
        sprxtg2.cfr_renamed_1 = sprth2;
    }

    /*
     * WARNING - void declaration
     */
    public sprxtg cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprcyg(new sprkhi((Provider)arg0));
        if (this.cfr_renamed_3 != null) {
            this.cfr_renamed_3.cfr_renamed_1498((Provider)arg0);
        }
        return this;
    }

    public sprxtg(char[] cArray) {
        sprxtg sprxtg2 = this;
        sprxtg sprxtg3 = this;
        sprxtg2.cfr_renamed_4 = new sprcyg(new sprrul());
        sprxtg2.cfr_renamed_2 = cArray;
        sprxtg2.cfr_renamed_3 = new sprmrg();
    }
}

