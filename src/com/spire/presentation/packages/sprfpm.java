/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpnm;
import com.spire.presentation.packages.sprqcn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxra;
import com.spire.presentation.packages.sprycn;
import java.util.Enumeration;

public class sprfpm
extends sprqqe {
    private sprlvm cfr_renamed_152;
    private sprddm cfr_renamed_112;
    private sprktm cfr_renamed_119;
    private sproug cfr_renamed_91;
    private sprddm cfr_renamed_0;
    private spridn cfr_renamed_1;
    private spridn cfr_renamed_2;
    private sprpnm cfr_renamed_3;
    private spridn cfr_renamed_4;

    public static sprfpm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprfpm) {
            return (sprfpm)arg0;
        }
        if (arg0 != null) {
            return new sprfpm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprfpm(sprszm sprszm2) {
        void arg0;
        int n = 0;
        this.cfr_renamed_119 = (sprktm)sprszm2.cfr_renamed_85(0);
        sprco sprco2 = arg0.cfr_renamed_85(++n);
        ++n;
        if (sprco2 instanceof sprnvm) {
            this.cfr_renamed_3 = sprpnm.cfr_renamed_5085((sprnvm)sprco2, false);
            sprco2 = arg0.cfr_renamed_85(n);
        }
        int n2 = ++n;
        this.cfr_renamed_2 = spridn.cfr_renamed_23(sprco2);
        this.cfr_renamed_0 = sprddm.cfr_renamed_23(arg0.cfr_renamed_85(n2));
        sprco2 = arg0.cfr_renamed_85(++n);
        ++n;
        if (sprco2 instanceof sprnvm) {
            this.cfr_renamed_112 = sprddm.cfr_renamed_5085((sprnvm)sprco2, false);
            sprco2 = arg0.cfr_renamed_85(n);
            ++n;
        }
        this.cfr_renamed_152 = sprlvm.cfr_renamed_23(sprco2);
        sprco2 = arg0.cfr_renamed_85(n);
        ++n;
        if (sprco2 instanceof sprnvm) {
            this.cfr_renamed_1 = spridn.cfr_renamed_5085((sprnvm)sprco2, false);
            sprco2 = arg0.cfr_renamed_85(n);
            ++n;
        }
        this.cfr_renamed_91 = sproug.cfr_renamed_23(sprco2);
        if (arg0.cfr_renamed_84() > n) {
            this.cfr_renamed_4 = spridn.cfr_renamed_5085((sprnvm)arg0.cfr_renamed_85(n), false);
        }
    }

    public spridn cfr_renamed_4171() {
        return this.cfr_renamed_2;
    }

    public spridn cfr_renamed_4191() {
        return this.cfr_renamed_4;
    }

    public static int cfr_renamed_10830(sprpnm arg0) {
        sprpnm sprpnm2;
        sprnvm sprnvm2;
        Object e;
        Enumeration enumeration;
        int n;
        block5: {
            if (arg0 == null) {
                return 0;
            }
            n = 0;
            enumeration = arg0.cfr_renamed_617().cfr_renamed_329();
            while (enumeration.hasMoreElements()) {
                e = enumeration.nextElement();
                if (!(e instanceof sprnvm)) continue;
                sprnvm2 = (sprnvm)e;
                if (sprnvm2.cfr_renamed_312() == 2) {
                    n = 1;
                    continue;
                }
                if (sprnvm2.cfr_renamed_312() != 3) continue;
                n = 3;
                sprpnm2 = arg0;
                break block5;
            }
            sprpnm2 = arg0;
        }
        if (sprpnm2.cfr_renamed_633() != null) {
            enumeration = arg0.cfr_renamed_633().cfr_renamed_329();
            while (enumeration.hasMoreElements()) {
                e = enumeration.nextElement();
                if (!(e instanceof sprnvm) || (sprnvm2 = (sprnvm)e).cfr_renamed_312() != 1) continue;
                n = 3;
                return 3;
            }
        }
        return n;
    }

    public spridn cfr_renamed_4190() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprfpm(sprpnm sprpnm2, spridn spridn2, sprddm sprddm2, sprddm sprddm3, sprlvm sprlvm2, spridn spridn3, sproug sproug2, spridn spridn4) {
        void arg7;
        void arg6;
        void arg4;
        void arg1;
        void arg2;
        void arg0;
        void arg3;
        void arg5;
        if (!(sprddm3 == null && arg5 == null || arg3 != null && arg5 != null)) {
            throw new IllegalArgumentException(sprxra.cfr_renamed_9("f\u0011e\u001dq\fC\u0014e\u0017p\u0011v\u0010oXc\u0016fXc\rv\u0010C\fv\nqXo\rq\f\"\u001agXq\u001dvXv\u0017e\u001dv\u0010g\n"));
        }
        sprfpm sprfpm2 = this;
        sprfpm sprfpm3 = this;
        sprfpm sprfpm4 = this;
        sprfpm sprfpm5 = this;
        sprfpm5.cfr_renamed_119 = new sprktm(sprfpm.cfr_renamed_10830((sprpnm)arg0));
        sprfpm5.cfr_renamed_3 = arg0;
        sprfpm4.cfr_renamed_0 = arg2;
        sprfpm4.cfr_renamed_112 = arg3;
        sprfpm3.cfr_renamed_2 = arg1;
        sprfpm3.cfr_renamed_152 = arg4;
        sprfpm2.cfr_renamed_1 = arg5;
        sprfpm2.cfr_renamed_91 = arg6;
        this.cfr_renamed_4 = arg7;
    }

    public sprlvm cfr_renamed_4203() {
        return this.cfr_renamed_152;
    }

    public sprddm cfr_renamed_410() {
        return this.cfr_renamed_112;
    }

    public sproug cfr_renamed_1472() {
        return this.cfr_renamed_91;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(9);
        sprfpm sprfpm2 = this;
        sprrvm2.cfr_renamed_5004(sprfpm2.cfr_renamed_119);
        if (sprfpm2.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_3));
        }
        sprrvm sprrvm3 = sprrvm2;
        sprfpm sprfpm3 = this;
        sprrvm3.cfr_renamed_5004(sprfpm3.cfr_renamed_2);
        sprrvm3.cfr_renamed_5004(sprfpm3.cfr_renamed_0);
        if (this.cfr_renamed_112 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 1, (sprco)this.cfr_renamed_112));
        }
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_152);
        if (this.cfr_renamed_1 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 2, (sprco)this.cfr_renamed_1));
        }
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_91);
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 3, (sprco)this.cfr_renamed_4));
        }
        return new sprqcn(sprrvm2);
    }

    public sprddm cfr_renamed_4202() {
        return this.cfr_renamed_0;
    }

    public sprpnm cfr_renamed_4170() {
        return this.cfr_renamed_3;
    }

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_119;
    }

    public static sprfpm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprfpm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }
}

