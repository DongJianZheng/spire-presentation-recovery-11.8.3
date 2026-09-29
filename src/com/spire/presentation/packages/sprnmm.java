/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprclm;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdcm;
import com.spire.presentation.packages.sprdim;
import com.spire.presentation.packages.sprfqm;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprhmm;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnom;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprycn;

public class sprnmm {
    private static final int cfr_renamed_79 = 2;
    private sprdim cfr_renamed_107;
    private static final int cfr_renamed_132 = 1;
    private int cfr_renamed_102;
    private static final int cfr_renamed_93 = 1;
    private sprhgm cfr_renamed_86;
    private sprszm cfr_renamed_152;
    private sprktm cfr_renamed_112;
    private sprnom cfr_renamed_119;
    private sprdcm cfr_renamed_91;
    private spravm cfr_renamed_0;
    private static final int cfr_renamed_1 = 0;
    private sprhmm cfr_renamed_2;
    private spridn cfr_renamed_3;
    private static final int cfr_renamed_4 = 3;

    public sprclm cfr_renamed_1451() {
        sprrvm sprrvm2 = new sprrvm(10);
        if (this.cfr_renamed_102 != 1) {
            sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_102));
        }
        sprrvm sprrvm3 = sprrvm2;
        sprnmm sprnmm2 = this;
        sprrvm sprrvm4 = sprrvm2;
        sprrvm4.cfr_renamed_5004(this.cfr_renamed_0);
        sprrvm4.cfr_renamed_5004(this.cfr_renamed_107);
        sprrvm3.cfr_renamed_5004(sprnmm2.cfr_renamed_112);
        sprrvm3.cfr_renamed_5004(sprnmm2.cfr_renamed_119);
        if (this.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_2));
        }
        if (this.cfr_renamed_91 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 1, (sprco)this.cfr_renamed_91));
        }
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 2, (sprco)this.cfr_renamed_3));
        }
        if (this.cfr_renamed_152 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 3, (sprco)this.cfr_renamed_152));
        }
        if (this.cfr_renamed_86 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_86);
        }
        return sprclm.cfr_renamed_23(new sprcen(sprrvm2));
    }

    public void cfr_renamed_9837(sprhgm arg0) {
        this.cfr_renamed_86 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprnmm(spravm spravm2, sprdim sprdim2, sprktm sprktm2, sprnom sprnom2) {
        void arg2;
        void arg1;
        void arg0;
        sprnmm sprnmm2 = this;
        sprnmm sprnmm3 = this;
        this.cfr_renamed_102 = 1;
        sprnmm3.cfr_renamed_0 = arg0;
        sprnmm3.cfr_renamed_107 = arg1;
        sprnmm2.cfr_renamed_112 = arg2;
        sprnmm2.cfr_renamed_119 = sprnom2;
    }

    public void cfr_renamed_11259(sprdim arg0) {
        this.cfr_renamed_107 = arg0;
    }

    public void cfr_renamed_4767(int arg0) {
        this.cfr_renamed_102 = arg0;
    }

    public void cfr_renamed_11260(spravm arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public void cfr_renamed_11261(sprdcm arg0) {
        this.cfr_renamed_91 = arg0;
    }

    public void cfr_renamed_11262(spridn arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public void cfr_renamed_5001(sprktm arg0) {
        this.cfr_renamed_112 = arg0;
    }

    public void cfr_renamed_11263(sprhmm arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public void cfr_renamed_11264(sprnom arg0) {
        this.cfr_renamed_119 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_11265(sprfqm[] sprfqmArray) {
        void arg0;
        sprnmm sprnmm2 = this;
        sprnmm2.cfr_renamed_152 = new sprcen((sprco[])arg0);
    }
}

