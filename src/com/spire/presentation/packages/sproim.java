/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprepy;
import com.spire.presentation.packages.sprihm;
import com.spire.presentation.packages.sprjbm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproxfa;
import com.spire.presentation.packages.sprqim;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrgm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtyl;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.util.Enumeration;

public class sproim
extends sprqqe {
    private static final sprlem cfr_renamed_91 = new sprlem(sprepy.cfr_renamed_9("e\bg\bb\be\ba\ba\be\u0017z\u0016z\u0014z\u0017"));
    private sprktm cfr_renamed_0;
    private sprihm cfr_renamed_1;
    private sprtyl cfr_renamed_2;
    private sprqim cfr_renamed_3;
    private sprszm cfr_renamed_4;

    public static sproim cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sproim.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sproim(sproim sproim2, sprtyl sprtyl2, sprrgm sprrgm2) {
        void arg1;
        void arg0;
        sproim sproim3 = this;
        this.cfr_renamed_0 = new sprktm(1L);
        this.cfr_renamed_0 = arg0.cfr_renamed_0;
        if (sprrgm2 != null) {
            boolean bl;
            sprrvm sprrvm2;
            sprddm sprddm2;
            block5: {
                void arg2;
                sprddm2 = arg2.cfr_renamed_1479();
                sprrvm2 = new sprrvm();
                Enumeration enumeration = arg0.cfr_renamed_4.cfr_renamed_329();
                boolean bl2 = false;
                while (enumeration.hasMoreElements()) {
                    sprddm sprddm3;
                    sprddm sprddm4 = sprddm3 = sprddm.cfr_renamed_23(enumeration.nextElement());
                    sprrvm2.cfr_renamed_5004(sprddm4);
                    if (!sprddm4.equals(sprddm2)) continue;
                    bl = bl2 = true;
                    break block5;
                }
                bl = bl2;
            }
            if (!bl) {
                sprrvm2.cfr_renamed_5004(sprddm2);
                this.cfr_renamed_4 = new sprcen(sprrvm2);
            } else {
                this.cfr_renamed_4 = arg0.cfr_renamed_4;
            }
        } else {
            this.cfr_renamed_4 = arg0.cfr_renamed_4;
        }
        sproim sproim4 = this;
        sproim4.cfr_renamed_3 = arg0.cfr_renamed_3;
        sproim4.cfr_renamed_1 = arg0.cfr_renamed_1;
        this.cfr_renamed_2 = arg1;
    }

    /*
     * WARNING - void declaration
     */
    public sproim(sprddm[] sprddmArray, sprqim sprqim2, sprihm sprihm2, sprtyl sprtyl2) {
        void arg2;
        void arg1;
        void arg0;
        sproim sproim2 = this;
        sproim sproim3 = this;
        sproim sproim4 = this;
        sproim3.cfr_renamed_0 = new sprktm(1L);
        sproim3.cfr_renamed_4 = new sprcen((sprco[])arg0);
        sproim3.cfr_renamed_3 = arg1;
        sproim2.cfr_renamed_1 = arg2;
        sproim2.cfr_renamed_2 = sprtyl2;
    }

    /*
     * WARNING - void declaration
     */
    public sproim(sprqim sprqim2, sprihm sprihm2, sprrgm sprrgm2) {
        void arg0;
        void arg2;
        sproim sproim2 = this;
        sproim sproim3 = this;
        this.cfr_renamed_0 = new sprktm(1L);
        sproim3.cfr_renamed_4 = new sprcen(arg2.cfr_renamed_1479());
        sproim2.cfr_renamed_3 = arg0;
        sproim2.cfr_renamed_1 = sprihm2;
        sproim2.cfr_renamed_2 = new sprtyl(new sprjbm((sprrgm)arg2));
    }

    public static sproim cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sproim) {
            return (sproim)arg0;
        }
        if (arg0 != null) {
            return new sproim(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sproim(sprszm sprszm2) {
        int n;
        void arg0;
        sproim sproim2 = this;
        sproim2.cfr_renamed_0 = new sprktm(1L);
        if (sprszm2.cfr_renamed_84() < 3 && arg0.cfr_renamed_84() > 5) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sproxfa.cfr_renamed_9("t\u0015l\tdGp\u0002r\u0012f\t`\u0002#\u0014j\u001dfGj\t#\u0004l\tp\u0013q\u0012`\u0013l\u00159G")).append(arg0.cfr_renamed_84()).toString());
        }
        sprktm sprktm2 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        if (!sprktm2.cfr_renamed_7241(1)) {
            throw new IllegalArgumentException(sprepy.cfr_renamed_9("=H7I9V5R=D8CtP1T'O;H"));
        }
        this.cfr_renamed_0 = sprktm2;
        this.cfr_renamed_4 = sprszm.cfr_renamed_23(arg0.cfr_renamed_85(1));
        int n2 = n = 2;
        while (true) {
            if (n2 == arg0.cfr_renamed_84() - 1) {
                void v2 = arg0;
                this.cfr_renamed_2 = sprtyl.cfr_renamed_23(v2.cfr_renamed_85(v2.cfr_renamed_84() - 1));
                return;
            }
            sprco sprco2 = arg0.cfr_renamed_85(n);
            if (!(sprco2 instanceof sprnvm)) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprepy.cfr_renamed_9("S:M:I#HtI6L1E \u0006=HtA1R\u001dH'R5H7Cn\u0006")).append(sprco2.getClass().getName()).toString());
            }
            sprnvm sprnvm2 = (sprnvm)sprco2;
            switch (sprnvm2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_3 = sprqim.cfr_renamed_5085(sprnvm2, false);
                    break;
                }
                case 1: {
                    this.cfr_renamed_1 = sprihm.cfr_renamed_5085(sprnvm2, false);
                    break;
                }
                default: {
                    throw new IllegalArgumentException(new StringBuilder().insert(0, sproxfa.cfr_renamed_9("v\th\tl\u0010mGw\u0006dGj\t#\u0000f\u0013J\tp\u0013b\t`\u00029G")).append(sprnvm2.cfr_renamed_312()).toString());
                }
            }
            n2 = ++n;
        }
    }

    public sproim cfr_renamed_5347(sprrgm arg0, boolean arg1) {
        if (arg1) {
            sprjbm sprjbm2 = new sprjbm(arg0);
            sproim sproim2 = this;
            return new sproim(sproim2, sproim2.cfr_renamed_2.cfr_renamed_11189(sprjbm2), arg0);
        }
        sprjbm[] sprjbmArray = this.cfr_renamed_2.cfr_renamed_5353();
        if (!sprjbmArray[sprjbmArray.length - 1].cfr_renamed_5354()[0].cfr_renamed_1479().equals(arg0.cfr_renamed_1479())) {
            throw new IllegalArgumentException(sproxfa.cfr_renamed_9("\nj\u0014n\u0006w\u0004kGl\u0001#\u0003j\u0000f\u0014wGb\u000bd\bq\u000ew\u000fnGj\t#\u0006g\u0003B\u0015`\u000fj\u0011f3j\nf4w\u0006n\u0017"));
        }
        sprjbmArray[sprjbmArray.length - 1] = sprjbmArray[sprjbmArray.length - 1].cfr_renamed_11190(arg0);
        return new sproim(this, new sprtyl(sprjbmArray), null);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(5);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_0);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        if (null != this.cfr_renamed_3) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_3));
        }
        if (null != this.cfr_renamed_1) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 1, (sprco)this.cfr_renamed_1));
        }
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        return new sprcen(sprrvm2);
    }

    public sprddm[] cfr_renamed_4139() {
        int n;
        sprddm[] sprddmArray = new sprddm[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprddmArray.length) {
            int n3 = n++;
            sprddmArray[n3] = sprddm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprddmArray;
    }

    public String toString() {
        return new StringBuilder().insert(0, sprepy.cfr_renamed_9("\u0011P=B1H7C\u0006C7I&Bn\u0006\u001bO0\u000e")).append(cfr_renamed_91).append(")").toString();
    }

    public sprtyl cfr_renamed_5345() {
        return this.cfr_renamed_2;
    }
}

