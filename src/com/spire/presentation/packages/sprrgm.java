/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprmln;
import com.spire.presentation.packages.sprmnm;
import com.spire.presentation.packages.sprnnca;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqgf;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.sprypm;
import com.spire.presentation.packages.sprzhm;

public class sprrgm
extends sprqqe {
    private final sprlvm cfr_renamed_1;
    private final sprypm cfr_renamed_2;
    private final sprszm cfr_renamed_3;
    private final sprddm cfr_renamed_4;

    private /* synthetic */ sprzhm cfr_renamed_577() {
        if (this.cfr_renamed_1.cfr_renamed_696().cfr_renamed_5078(sprgz.cfr_renamed_105)) {
            sprmnm sprmnm2 = sprmnm.cfr_renamed_23(this.cfr_renamed_1.cfr_renamed_480());
            if (sprmnm2.cfr_renamed_2589().cfr_renamed_696().cfr_renamed_5078(sprdl.cfr_renamed_1494)) {
                return sprzhm.cfr_renamed_23(sproug.cfr_renamed_23(sprmnm2.cfr_renamed_2589().cfr_renamed_480()).cfr_renamed_186());
            }
            throw new IllegalStateException(sprmln.cfr_renamed_9("?c2l3v|r=p/g|v5o9\"/v=o,"));
        }
        throw new IllegalStateException(sprnnca.cfr_renamed_9("u3x<y&6;r7x&\u007f4orw>q=d;b:{r\u007f6s<b;p;s 64y 66\u007f5s!b"));
    }

    public sprddm cfr_renamed_410() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(4);
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_4));
        }
        if (this.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 1, (sprco)this.cfr_renamed_2));
        }
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 2, (sprco)this.cfr_renamed_3));
        }
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_1);
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprrgm(sprddm sprddm2, sprypm sprypm2, sprqgf[] sprqgfArray, sprlvm sprlvm2) {
        void arg3;
        sprrgm sprrgm2;
        void arg1;
        void arg0;
        sprrgm sprrgm3 = this;
        sprrgm3.cfr_renamed_4 = arg0;
        sprrgm3.cfr_renamed_2 = arg1;
        if (sprqgfArray != null) {
            void arg2;
            sprrgm2 = this;
            this.cfr_renamed_3 = new sprcen((sprco[])arg2);
        } else {
            sprrgm2 = this;
            this.cfr_renamed_3 = null;
        }
        sprrgm2.cfr_renamed_1 = arg3;
    }

    public byte[] cfr_renamed_5333() {
        return this.cfr_renamed_577().cfr_renamed_592().cfr_renamed_595();
    }

    public static sprrgm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprrgm) {
            return (sprrgm)arg0;
        }
        if (arg0 != null) {
            return new sprrgm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprrgm(sprlvm arg0) {
        this(null, null, null, arg0);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprrgm(sprszm sprszm2) {
        int n;
        void arg0;
        if (sprszm2.cfr_renamed_84() < 1 || arg0.cfr_renamed_84() > 4) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprmln.cfr_renamed_9("u.m2e|q9s)g2a9\"/k&g|k2\"?m2q(p)a(m.8|")).append(arg0.cfr_renamed_84()).toString());
        }
        sprddm sprddm2 = null;
        sprypm sprypm2 = null;
        sprszm sprszm3 = null;
        int n2 = n = 0;
        while (true) {
            if (n2 >= arg0.cfr_renamed_84() - 1) {
                void v1 = arg0;
                sprrgm sprrgm2 = this;
                this.cfr_renamed_4 = sprddm2;
                sprrgm2.cfr_renamed_2 = sprypm2;
                sprrgm2.cfr_renamed_3 = sprszm3;
                this.cfr_renamed_1 = sprlvm.cfr_renamed_23(v1.cfr_renamed_85(v1.cfr_renamed_84() - 1));
                return;
            }
            sprco sprco2 = arg0.cfr_renamed_85(n);
            if (sprco2 instanceof sprnvm) {
                sprnvm sprnvm2 = sprnvm.cfr_renamed_23(sprco2);
                switch (sprnvm2.cfr_renamed_312()) {
                    case 0: {
                        sprddm2 = sprddm.cfr_renamed_5085(sprnvm2, false);
                        break;
                    }
                    case 1: {
                        sprypm2 = sprypm.cfr_renamed_5085(sprnvm2, false);
                        break;
                    }
                    case 2: {
                        sprszm3 = sprszm.cfr_renamed_5085(sprnvm2, false);
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException(new StringBuilder().insert(0, sprnnca.cfr_renamed_9("\u007f<`3z;rrb3qrx=6;xru=x!b c1b=dh6")).append(sprnvm2.cfr_renamed_312()).toString());
                    }
                }
            }
            n2 = ++n;
        }
    }

    public sprlvm cfr_renamed_5339() {
        return this.cfr_renamed_1;
    }

    public sprddm cfr_renamed_1479() {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4;
        }
        return this.cfr_renamed_577().cfr_renamed_592().cfr_renamed_579();
    }

    public sprqgf[] cfr_renamed_5374() {
        int n;
        if (this.cfr_renamed_3 == null) {
            return null;
        }
        sprqgf[] sprqgfArray = new sprqgf[this.cfr_renamed_3.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprqgfArray.length) {
            int n3 = n++;
            sprqgfArray[n3] = sprqgf.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprqgfArray;
    }

    public sprrgm(sprddm arg0, sprqgf[] arg1, sprlvm arg2) {
        this(arg0, null, arg1, arg2);
    }

    public sprqgf cfr_renamed_5331() {
        if (this.cfr_renamed_3 == null) {
            return null;
        }
        return sprqgf.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_85(0));
    }
}

