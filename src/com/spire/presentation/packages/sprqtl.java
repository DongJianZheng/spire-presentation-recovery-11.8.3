/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprejk;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlgg;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmh;
import com.spire.presentation.packages.sprmol;
import com.spire.presentation.packages.sprmqfa;
import com.spire.presentation.packages.sprni;
import com.spire.presentation.packages.sprwol;
import com.spire.presentation.packages.sprwvl;
import java.security.SecureRandom;

public class sprqtl {
    private static final sprni cfr_renamed_0 = sprlgg.cfr_renamed_3;
    private final sprlem cfr_renamed_1;
    private SecureRandom cfr_renamed_2;
    private final int cfr_renamed_3;
    private sprmol cfr_renamed_4;

    public sprmh cfr_renamed_1451() throws sprlyl {
        sprqtl sprqtl2 = this;
        if (sprqtl2.cfr_renamed_4.cfr_renamed_10730(sprqtl2.cfr_renamed_1)) {
            sprqtl sprqtl3 = this;
            sprqtl sprqtl4 = this;
            return new sprwvl(sprqtl4, sprqtl3.cfr_renamed_1, sprqtl3.cfr_renamed_3, sprqtl4.cfr_renamed_2);
        }
        sprqtl sprqtl5 = this;
        sprqtl sprqtl6 = this;
        return new sprwol(sprqtl6, sprqtl5.cfr_renamed_1, sprqtl5.cfr_renamed_3, sprqtl6.cfr_renamed_2);
    }

    public static /* synthetic */ sprmol cfr_renamed_10841(sprqtl arg0) {
        return arg0.cfr_renamed_4;
    }

    public sprqtl(sprlem arg0) {
        sprlem sprlem2 = arg0;
        this(sprlem2, cfr_renamed_0.cfr_renamed_7413(sprlem2));
    }

    public sprqtl cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprqtl(sprlem sprlem2, int n) {
        void arg1;
        void arg0;
        sprqtl sprqtl2 = this;
        sprqtl2.cfr_renamed_4 = new sprmol();
        sprqtl2.cfr_renamed_1 = sprlem2;
        void v1 = arg0;
        int n2 = cfr_renamed_0.cfr_renamed_7413((sprlem)v1);
        if (v1.cfr_renamed_5078(sprdl.cfr_renamed_2797)) {
            if (arg1 != 168 && arg1 != n2) {
                throw new IllegalArgumentException(sprejk.cfr_renamed_9("hqbpsmd|u?jzxLhed?gps?dqbmxouvnqNVE?q~rld{!kn?cjhsezs1"));
            }
            this.cfr_renamed_3 = 168;
            return;
        }
        if (arg0.cfr_renamed_5078(sprgt.cfr_renamed_2)) {
            if (arg1 != 56 && arg1 != n2) {
                throw new IllegalArgumentException(sprmqfa.cfr_renamed_9("\u0015h\u001fi\u000et\u0019e\b&\u0017c\u0005U\u0015|\u0019&\u001ai\u000e&\u0019h\u001ft\u0005v\bo\u0013h3O8&\fg\u000fu\u0019b\\r\u0013&\u001es\u0015j\u0018c\u000e("));
            }
            this.cfr_renamed_3 = 56;
            return;
        }
        if (n2 > 0 && n2 != arg1) {
            throw new IllegalArgumentException(sprejk.cfr_renamed_9("hqbpsmd|u?jzxLhed?gps?dqbmxouvnqNVE?q~rld{!kn?cjhsezs1"));
        }
        this.cfr_renamed_3 = arg1;
    }
}

