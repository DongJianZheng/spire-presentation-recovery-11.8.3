/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgn;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprjej;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmye;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprowm;
import com.spire.presentation.packages.sprqbn;
import com.spire.presentation.packages.sprrym;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvan;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.sprzwq;
import java.io.IOException;

public abstract class sprgzm
extends sprxgf {
    public static final sprqbn cfr_renamed_91 = new sprbgn(sprgzm.class, 8);
    public sprxgf cfr_renamed_0;
    public sprlem cfr_renamed_1;
    public sprktm cfr_renamed_2;
    public sprxgf cfr_renamed_3;
    public int cfr_renamed_4;

    public abstract sprszm cfr_renamed_11294();

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ sprxgf cfr_renamed_11513(sprnvm arg0) {
        sprnvm sprnvm2 = arg0;
        int n = sprnvm2.cfr_renamed_8120();
        int n2 = sprnvm2.cfr_renamed_312();
        if (128 != n) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprjej.cfr_renamed_9("r1m>w6\u007f\u007fo>|e;")).append(sprvan.cfr_renamed_11434(n, n2)).toString());
        }
        switch (n2) {
            case 0: {
                return arg0.cfr_renamed_8225().cfr_renamed_119();
            }
            case 1: {
                return sproug.cfr_renamed_5085(arg0, false);
            }
            case 2: {
                return sprgbf.cfr_renamed_5085(arg0, false);
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprzwq.cfr_renamed_9("j1u>o6g\u007fw>de#")).append(sprvan.cfr_renamed_11434(n, n2)).toString());
    }

    /*
     * WARNING - void declaration
     */
    public sprgzm(sprlem sprlem2, sprktm sprktm2, sprxgf sprxgf2, sprycn sprycn2) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprgzm sprgzm2 = this;
        sprgzm sprgzm3 = this;
        this.cfr_renamed_1 = arg0;
        sprgzm3.cfr_renamed_2 = arg1;
        sprgzm3.cfr_renamed_0 = arg2;
        sprgzm2.cfr_renamed_4 = sprgzm.cfr_renamed_11514(arg3.cfr_renamed_312());
        sprgzm2.cfr_renamed_3 = sprgzm.cfr_renamed_11513(sprycn2);
    }

    public sprktm cfr_renamed_4570() {
        return this.cfr_renamed_2;
    }

    @Override
    public int hashCode() {
        return sprmye.cfr_renamed_5182(this.cfr_renamed_1) ^ sprmye.cfr_renamed_5182(this.cfr_renamed_2) ^ sprmye.cfr_renamed_5182(this.cfr_renamed_0) ^ this.cfr_renamed_4 ^ this.cfr_renamed_3.hashCode();
    }

    private static /* synthetic */ sprxgf cfr_renamed_11515(sprszm arg0, int arg1) {
        if (arg0.cfr_renamed_84() <= arg1) {
            throw new IllegalArgumentException(sprjej.cfr_renamed_9("o0t\u007f}:l\u007ft=q:x+h\u007fr1;6u/n+;,~.n:u<~"));
        }
        return arg0.cfr_renamed_85(arg1).cfr_renamed_119();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ sprxgf cfr_renamed_11516(int arg0, sprxgf arg1) {
        switch (arg0) {
            case 1: {
                return sproug.cfr_renamed_2.cfr_renamed_11470(arg1);
            }
            case 2: {
                return sprgbf.cfr_renamed_2.cfr_renamed_11470(arg1);
            }
        }
        return arg1;
    }

    /*
     * WARNING - void declaration
     */
    public sprgzm(sprlem sprlem2, sprktm sprktm2, sprxgf sprxgf2, int n, sprxgf sprxgf3) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprgzm sprgzm2 = this;
        sprgzm sprgzm3 = this;
        this.cfr_renamed_1 = arg0;
        sprgzm3.cfr_renamed_2 = arg1;
        sprgzm3.cfr_renamed_0 = arg2;
        sprgzm2.cfr_renamed_4 = sprgzm.cfr_renamed_11514((int)arg3);
        sprgzm2.cfr_renamed_3 = sprgzm.cfr_renamed_11516(n, (sprxgf)arg4);
    }

    @Override
    public boolean cfr_renamed_11277() {
        return true;
    }

    public sprlem cfr_renamed_4569() {
        return this.cfr_renamed_1;
    }

    @Override
    public sprxgf cfr_renamed_4612() {
        sprgzm sprgzm2 = this;
        sprgzm sprgzm3 = this;
        return new sprrym(sprgzm2.cfr_renamed_1, sprgzm2.cfr_renamed_2, sprgzm3.cfr_renamed_0, sprgzm3.cfr_renamed_4, this.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    public sprgzm(sprszm sprszm2) {
        void arg0;
        int n = 0;
        sprxgf sprxgf2 = sprgzm.cfr_renamed_11515(sprszm2, 0);
        if (sprxgf2 instanceof sprlem) {
            this.cfr_renamed_1 = (sprlem)sprxgf2;
            sprxgf2 = sprgzm.cfr_renamed_11515((sprszm)arg0, ++n);
        }
        if (sprxgf2 instanceof sprktm) {
            this.cfr_renamed_2 = (sprktm)sprxgf2;
            sprxgf2 = sprgzm.cfr_renamed_11515((sprszm)arg0, ++n);
        }
        if (!(sprxgf2 instanceof sprnvm)) {
            this.cfr_renamed_0 = sprxgf2;
            sprxgf2 = sprgzm.cfr_renamed_11515((sprszm)arg0, ++n);
        }
        if (arg0.cfr_renamed_84() != n + 1) {
            throw new IllegalArgumentException(sprzwq.cfr_renamed_9("6m/v+#,f.v:m<f\u007fw0l\u007fo>q8f"));
        }
        if (!(sprxgf2 instanceof sprnvm)) {
            throw new IllegalArgumentException(sprjej.cfr_renamed_9("U0;+z8|:\u007f\u007ft=q:x+;9t*u;;6u\u007fh:j*~1x:5\u007fH+i*x+n-~\u007f\u007f0~,uxo\u007fh:~2;+t\u007fy:;0}\u007fo&k:;\u001ac+~-u>w"));
        }
        sprnvm sprnvm2 = (sprnvm)sprxgf2;
        sprgzm sprgzm2 = this;
        sprgzm2.cfr_renamed_4 = sprgzm.cfr_renamed_11514(sprnvm2.cfr_renamed_312());
        sprgzm2.cfr_renamed_3 = sprgzm.cfr_renamed_11513(sprnvm2);
    }

    @Override
    public int cfr_renamed_11213(boolean arg0) throws IOException {
        return this.cfr_renamed_11294().cfr_renamed_11213(arg0);
    }

    public static sprgzm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprgzm) {
            return (sprgzm)arg0;
        }
        if (arg0 instanceof sprco) {
            sprxgf sprxgf2 = ((sprco)arg0).cfr_renamed_119();
            if (sprxgf2 instanceof sprgzm) {
                return (sprgzm)sprxgf2;
            }
        } else if (arg0 instanceof byte[]) {
            try {
                return (sprgzm)cfr_renamed_91.cfr_renamed_184((byte[])arg0);
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprzwq.cfr_renamed_9("9b6o:g\u007fw0#<l1p+q*`+#:{+f-m>o\u007fe-l2#=z+f\u0004^e#")).append(iOException.getMessage()).toString());
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprjej.cfr_renamed_9("r3w:|>w\u007ft=q:x+;6u\u007f|:o\u0016u,o>u<~e;")).append(arg0.getClass().getName()).toString());
    }

    public int cfr_renamed_4572() {
        return this.cfr_renamed_4;
    }

    private static /* synthetic */ int cfr_renamed_11514(int arg0) {
        if (arg0 < 0 || arg0 > 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprzwq.cfr_renamed_9("6m)b3j;#:m<l;j1d\u007fu>o*fe#")).append(arg0).toString());
        }
        return arg0;
    }

    public static sprgzm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return (sprgzm)cfr_renamed_91.cfr_renamed_11433(arg0, arg1);
    }

    public sprxgf cfr_renamed_4573() {
        return this.cfr_renamed_3;
    }

    @Override
    public boolean cfr_renamed_11432(sprxgf arg0) {
        if (this == arg0) {
            return true;
        }
        if (!(arg0 instanceof sprgzm)) {
            return false;
        }
        sprgzm sprgzm2 = (sprgzm)arg0;
        return sprmye.cfr_renamed_5073(this.cfr_renamed_1, sprgzm2.cfr_renamed_1) && sprmye.cfr_renamed_5073(this.cfr_renamed_2, sprgzm2.cfr_renamed_2) && sprmye.cfr_renamed_5073(this.cfr_renamed_0, sprgzm2.cfr_renamed_0) && this.cfr_renamed_4 == sprgzm2.cfr_renamed_4 && this.cfr_renamed_3.cfr_renamed_5078(sprgzm2.cfr_renamed_3);
    }

    @Override
    public sprxgf cfr_renamed_4615() {
        sprgzm sprgzm2 = this;
        sprgzm sprgzm3 = this;
        return new sprowm(sprgzm2.cfr_renamed_1, sprgzm2.cfr_renamed_2, sprgzm3.cfr_renamed_0, sprgzm3.cfr_renamed_4, this.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_11218(sproen sproen2, boolean bl) throws IOException {
        void arg1;
        void arg0;
        arg0.cfr_renamed_11285((boolean)arg1, 40);
        this.cfr_renamed_11294().cfr_renamed_11218((sproen)arg0, false);
    }

    public sprxgf cfr_renamed_4571() {
        return this.cfr_renamed_0;
    }
}

