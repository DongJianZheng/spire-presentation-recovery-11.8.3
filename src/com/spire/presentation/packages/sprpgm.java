/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprdzl;
import com.spire.presentation.packages.sprgen;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprizda;
import com.spire.presentation.packages.sprjii;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprmbm;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprrcm;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.spryoy;

public class sprpgm {
    public sprvhm cfr_renamed_102;
    public sprycn cfr_renamed_93;
    private sprdye cfr_renamed_86;
    public sprktm cfr_renamed_152;
    public sprddm cfr_renamed_112;
    public sprrcm cfr_renamed_119;
    public sprnbm cfr_renamed_91;
    private boolean cfr_renamed_0;
    public sprhgm cfr_renamed_1;
    public sprnbm cfr_renamed_2;
    private sprdye cfr_renamed_3;
    public sprrcm cfr_renamed_4;

    public sprszm cfr_renamed_10853() {
        if (this.cfr_renamed_112 != null) {
            throw new IllegalStateException(sprizda.cfr_renamed_9("q)e.c4w2g`d)g,f`q(m5n$\".m4\"\"g`q%v`k.\"\u0010p%V\u0002Q\u0003g2v)d)a!v%"));
        }
        if (this.cfr_renamed_152 == null || this.cfr_renamed_91 == null || this.cfr_renamed_119 == null || this.cfr_renamed_4 == null || this.cfr_renamed_2 == null && !this.cfr_renamed_0 || this.cfr_renamed_102 == null) {
            throw new IllegalStateException(spryoy.cfr_renamed_9("4f.);e6)7h4m;}5{#)<`?e>zzz?}z`4)\f:z]\u0018Z9l(}3o3j;}?)=l4l(h.f("));
        }
        return this.cfr_renamed_11125();
    }

    public void cfr_renamed_5005(sprrcm arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public void cfr_renamed_9837(sprhgm arg0) {
        sprrdm sprrdm2;
        this.cfr_renamed_1 = arg0;
        if (this.cfr_renamed_1 != null && (sprrdm2 = arg0.cfr_renamed_5024(sprrdm.cfr_renamed_137)) != null && sprrdm2.cfr_renamed_101()) {
            this.cfr_renamed_0 = true;
        }
    }

    public void cfr_renamed_5009(sprmbm arg0) {
        this.cfr_renamed_9837(sprhgm.cfr_renamed_23(arg0));
    }

    private /* synthetic */ sprszm cfr_renamed_11125() {
        sprrvm sprrvm2;
        sprrvm sprrvm3;
        sprrvm sprrvm4 = new sprrvm(10);
        sprpgm sprpgm2 = this;
        sprrvm4.cfr_renamed_5004(this.cfr_renamed_93);
        sprrvm4.cfr_renamed_5004(sprpgm2.cfr_renamed_152);
        if (sprpgm2.cfr_renamed_112 != null) {
            sprrvm4.cfr_renamed_5004(this.cfr_renamed_112);
        }
        sprrvm sprrvm5 = sprrvm4;
        sprrvm5.cfr_renamed_5004(this.cfr_renamed_91);
        sprrvm sprrvm6 = sprrvm3 = new sprrvm(2);
        sprrvm6.cfr_renamed_5004(this.cfr_renamed_119);
        sprrvm6.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm sprrvm7 = sprrvm4;
        sprrvm5.cfr_renamed_5004(new sprcen(sprrvm3));
        if (this.cfr_renamed_2 != null) {
            sprrvm sprrvm8 = sprrvm4;
            sprrvm2 = sprrvm8;
            sprrvm8.cfr_renamed_5004(this.cfr_renamed_2);
        } else {
            sprrvm sprrvm9 = sprrvm4;
            sprrvm2 = sprrvm9;
            sprrvm9.cfr_renamed_5004(new sprcen());
        }
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_102);
        if (this.cfr_renamed_86 != null) {
            sprrvm4.cfr_renamed_5004(new sprycn(false, 1, (sprco)this.cfr_renamed_86));
        }
        if (this.cfr_renamed_3 != null) {
            sprrvm4.cfr_renamed_5004(new sprycn(false, 2, (sprco)this.cfr_renamed_3));
        }
        if (this.cfr_renamed_1 != null) {
            sprrvm4.cfr_renamed_5004(new sprycn(true, 3, (sprco)this.cfr_renamed_1));
        }
        return new sprcen(sprrvm4);
    }

    public void cfr_renamed_5001(sprktm arg0) {
        this.cfr_renamed_152 = arg0;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 3 ^ 3;
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ 5;
        int n4 = n2;
        int n5 = (3 ^ 5) << 3 ^ (2 ^ 5);
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_11126(sprgen sprgen2) {
        void arg0;
        sprpgm sprpgm2 = this;
        sprpgm2.cfr_renamed_4 = new sprrcm((sprxgf)arg0);
    }

    public void cfr_renamed_10846(sprnbm arg0) {
        this.cfr_renamed_91 = arg0;
    }

    public void cfr_renamed_5002(sprdye arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public sprpgm() {
        sprpgm sprpgm2 = this;
        sprpgm2.cfr_renamed_93 = new sprycn(true, 0, (sprco)new sprktm(2L));
    }

    public void cfr_renamed_10847(sprnbm arg0) {
        this.cfr_renamed_2 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_11127(sprgen sprgen2) {
        void arg0;
        sprpgm sprpgm2 = this;
        sprpgm2.cfr_renamed_119 = new sprrcm((sprxgf)arg0);
    }

    public void cfr_renamed_4994(sprdye arg0) {
        this.cfr_renamed_86 = arg0;
    }

    public sprdzl cfr_renamed_32() {
        if (this.cfr_renamed_152 == null || this.cfr_renamed_112 == null || this.cfr_renamed_91 == null || this.cfr_renamed_119 == null || this.cfr_renamed_4 == null || this.cfr_renamed_2 == null && !this.cfr_renamed_0 || this.cfr_renamed_102 == null) {
            throw new IllegalStateException(sprizda.cfr_renamed_9(".m4\"!n,\"-c.f!v/p9\"&k%n$q`q%v`k.\"\u00161`V\u0002Q#g2v)d)a!v%\"'g.g2c4m2"));
        }
        return sprdzl.cfr_renamed_23(this.cfr_renamed_11125());
    }

    public void cfr_renamed_5010(sprjii arg0) {
        this.cfr_renamed_2 = sprnbm.cfr_renamed_23(arg0.cfr_renamed_119());
    }

    public void cfr_renamed_4999(sprrcm arg0) {
        this.cfr_renamed_119 = arg0;
    }

    public void cfr_renamed_4996(sprddm arg0) {
        this.cfr_renamed_112 = arg0;
    }

    public void cfr_renamed_5007(sprjii arg0) {
        this.cfr_renamed_91 = sprnbm.cfr_renamed_23(arg0);
    }

    public void cfr_renamed_5006(sprvhm arg0) {
        this.cfr_renamed_102 = arg0;
    }
}

