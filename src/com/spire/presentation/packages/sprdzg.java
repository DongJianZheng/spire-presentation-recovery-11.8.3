/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyg;
import com.spire.presentation.packages.sprfah;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprnql;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprsm;
import com.spire.presentation.packages.sprwrg;
import com.spire.presentation.packages.sprxil;
import com.spire.presentation.packages.sprysg;
import java.security.Provider;
import java.security.SecureRandom;

public class sprdzg {
    private sprsm cfr_renamed_0;
    private sprcyg cfr_renamed_1;
    private SecureRandom cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprdzg(int n, sprsm sprsm2, int n2) {
        void arg2;
        void arg1;
        void arg0;
        sprdzg sprdzg2 = this;
        sprdzg sprdzg3 = this;
        this.cfr_renamed_1 = new sprcyg(new sprrul());
        this.cfr_renamed_3 = 96;
        sprdzg2.cfr_renamed_4 = arg0;
        sprdzg2.cfr_renamed_0 = arg1;
        if (n2 < 0 || arg2 > 255) {
            throw new IllegalArgumentException(sprnql.cfr_renamed_9("qtI\u0005m3l2\"0c*w#\")w2q/f#\")dfp'l!gf2fv)\"t7s,"));
        }
        this.cfr_renamed_3 = arg2;
    }

    public sprdzg(int arg0, int arg1) {
        this(arg0, new sprwrg(), arg1);
    }

    public sprdzg(int arg0, sprsm arg1) {
        this(arg0, arg1, 96);
    }

    public sprysg cfr_renamed_1480(char[] arg0) {
        if (this.cfr_renamed_2 == null) {
            sprdzg sprdzg2 = this;
            sprdzg2.cfr_renamed_2 = new SecureRandom();
        }
        sprdzg sprdzg3 = this;
        sprdzg sprdzg4 = this;
        return new sprfah(sprdzg4, sprdzg3.cfr_renamed_4, sprdzg3.cfr_renamed_0, sprdzg4.cfr_renamed_3, this.cfr_renamed_2, arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprdzg cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_1 = new sprcyg(new sprxil((String)arg0));
        return this;
    }

    public sprdzg(int arg0) {
        this(arg0, new sprwrg());
    }

    public sprdzg cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    public static /* synthetic */ sprcyg cfr_renamed_7947(sprdzg arg0) {
        return arg0.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprdzg cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_1 = new sprcyg(new sprkhi((Provider)arg0));
        return this;
    }
}

