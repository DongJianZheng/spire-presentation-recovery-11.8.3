/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproqo;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruqm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.sprzsm;
import java.util.Enumeration;

public class sprhvm
extends sprqqe {
    private final sprigm cfr_renamed_137;
    public static final int cfr_renamed_79 = 2;
    public static final int cfr_renamed_107 = 3;
    private sproug cfr_renamed_132;
    private sprjfn cfr_renamed_102;
    private sproug cfr_renamed_93;
    public static final int cfr_renamed_86 = 1;
    private final sprktm cfr_renamed_152;
    private spruqm cfr_renamed_112;
    private sproug cfr_renamed_119;
    public static final sprigm cfr_renamed_91 = new sprigm(sprnbm.cfr_renamed_23(new sprcen()));
    private final sprigm cfr_renamed_0;
    private sprddm cfr_renamed_1;
    private sproug cfr_renamed_2;
    private sproug cfr_renamed_3;
    private sprszm cfr_renamed_4;

    public spruqm cfr_renamed_4873() {
        return this.cfr_renamed_112;
    }

    public sproug cfr_renamed_4876() {
        return this.cfr_renamed_2;
    }

    public sprzsm[] cfr_renamed_4877() {
        int n;
        if (this.cfr_renamed_4 == null) {
            return null;
        }
        sprzsm[] sprzsmArray = new sprzsm[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 < sprzsmArray.length) {
            int n3 = n++;
            sprzsmArray[n3] = sprzsm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprzsmArray;
    }

    public sprjfn cfr_renamed_4870() {
        return this.cfr_renamed_102;
    }

    public sprigm cfr_renamed_4875() {
        return this.cfr_renamed_137;
    }

    public static sprhvm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprhvm) {
            return (sprhvm)arg0;
        }
        if (arg0 != null) {
            return new sprhvm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(12);
        sprhvm sprhvm2 = this;
        sprrvm sprrvm3 = sprrvm2;
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_152);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_0);
        sprrvm2.cfr_renamed_5004(sprhvm2.cfr_renamed_137);
        sprhvm sprhvm3 = this;
        sprrvm sprrvm4 = sprrvm2;
        sprhvm sprhvm4 = this;
        sprrvm sprrvm5 = sprrvm2;
        sprhvm sprhvm5 = this;
        sprhvm5.cfr_renamed_11316(sprrvm2, 0, this.cfr_renamed_102);
        sprhvm5.cfr_renamed_11316(sprrvm2, 1, this.cfr_renamed_1);
        this.cfr_renamed_11316(sprrvm5, 2, this.cfr_renamed_132);
        sprhvm4.cfr_renamed_11316(sprrvm5, 3, this.cfr_renamed_3);
        sprhvm4.cfr_renamed_11316(sprrvm2, 4, this.cfr_renamed_93);
        this.cfr_renamed_11316(sprrvm4, 5, this.cfr_renamed_119);
        sprhvm3.cfr_renamed_11316(sprrvm4, 6, this.cfr_renamed_2);
        sprhvm3.cfr_renamed_11316(sprrvm2, 7, this.cfr_renamed_112);
        sprhvm2.cfr_renamed_11316(sprrvm2, 8, this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }

    public sprktm cfr_renamed_4874() {
        return this.cfr_renamed_152;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprhvm(sprszm arg0) {
        sprnvm sprnvm2;
        sprhvm sprhvm2 = this;
        Enumeration enumeration = arg0.cfr_renamed_329();
        sprhvm2.cfr_renamed_152 = sprktm.cfr_renamed_23(enumeration.nextElement());
        this.cfr_renamed_0 = sprigm.cfr_renamed_23(enumeration.nextElement());
        sprhvm2.cfr_renamed_137 = sprigm.cfr_renamed_23(enumeration.nextElement());
        block11: while (true) {
            if (!enumeration.hasMoreElements()) {
                return;
            }
            sprnvm2 = (sprnvm)enumeration.nextElement();
            switch (sprnvm2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_102 = sprjfn.cfr_renamed_5085(sprnvm2, true);
                    continue block11;
                }
                case 1: {
                    this.cfr_renamed_1 = sprddm.cfr_renamed_5085(sprnvm2, true);
                    continue block11;
                }
                case 2: {
                    this.cfr_renamed_132 = sproug.cfr_renamed_5085(sprnvm2, true);
                    continue block11;
                }
                case 3: {
                    this.cfr_renamed_3 = sproug.cfr_renamed_5085(sprnvm2, true);
                    continue block11;
                }
                case 4: {
                    this.cfr_renamed_93 = sproug.cfr_renamed_5085(sprnvm2, true);
                    continue block11;
                }
                case 5: {
                    this.cfr_renamed_119 = sproug.cfr_renamed_5085(sprnvm2, true);
                    continue block11;
                }
                case 6: {
                    this.cfr_renamed_2 = sproug.cfr_renamed_5085(sprnvm2, true);
                    continue block11;
                }
                case 7: {
                    this.cfr_renamed_112 = spruqm.cfr_renamed_5085(sprnvm2, true);
                    continue block11;
                }
                case 8: {
                    this.cfr_renamed_4 = sprszm.cfr_renamed_5085(sprnvm2, true);
                    continue block11;
                }
            }
            break;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sproqo.cfr_renamed_9("}YcYg@f\u0017|Vo\u0017fBeUmE2\u0017")).append(sprnvm2.cfr_renamed_312()).toString());
    }

    public sproug cfr_renamed_4879() {
        return this.cfr_renamed_93;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprhvm(sprktm sprktm2, sprigm sprigm2, sprigm sprigm3) {
        void arg1;
        void arg0;
        sprhvm sprhvm2 = this;
        this.cfr_renamed_152 = arg0;
        sprhvm2.cfr_renamed_0 = arg1;
        sprhvm2.cfr_renamed_137 = sprigm3;
    }

    public sproug cfr_renamed_4871() {
        return this.cfr_renamed_119;
    }

    public sproug cfr_renamed_4872() {
        return this.cfr_renamed_3;
    }

    public sprigm cfr_renamed_4381() {
        return this.cfr_renamed_0;
    }

    private /* synthetic */ void cfr_renamed_11316(sprrvm arg0, int arg1, sprco arg2) {
        if (arg2 != null) {
            arg0.cfr_renamed_5004(new sprycn(true, arg1, arg2));
        }
    }

    public sproug cfr_renamed_4878() {
        return this.cfr_renamed_132;
    }

    /*
     * WARNING - void declaration
     */
    public sprhvm(int n, sprigm sprigm2, sprigm sprigm3) {
        this(new sprktm((long)arg0), (sprigm)arg1, (sprigm)arg2);
        void arg2;
        void arg1;
        void arg0;
    }

    public sprddm cfr_renamed_4410() {
        return this.cfr_renamed_1;
    }
}

