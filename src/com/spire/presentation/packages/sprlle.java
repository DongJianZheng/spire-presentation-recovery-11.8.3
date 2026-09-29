/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprhky;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprjve;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpnn;
import com.spire.presentation.packages.sprrve;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;

public class sprlle
extends sprkra {
    private sprere cfr_renamed_152;
    private sprije cfr_renamed_112;
    private sprrve cfr_renamed_119;
    private sprere cfr_renamed_91;
    private sprere cfr_renamed_0;
    private sprooe cfr_renamed_1;
    private sprxue cfr_renamed_2;
    private sprnte cfr_renamed_3;
    private sprije cfr_renamed_4;

    public static int cfr_renamed_4195(sprrve arg0) {
        sprrve sprrve2;
        spryte spryte2;
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
                if (!(e instanceof spryte)) continue;
                spryte2 = (spryte)e;
                if (spryte2.cfr_renamed_312() == 2) {
                    n = 1;
                    continue;
                }
                if (spryte2.cfr_renamed_312() != 3) continue;
                n = 3;
                sprrve2 = arg0;
                break block5;
            }
            sprrve2 = arg0;
        }
        if (sprrve2.cfr_renamed_633() != null) {
            enumeration = arg0.cfr_renamed_633().cfr_renamed_329();
            while (enumeration.hasMoreElements()) {
                e = enumeration.nextElement();
                if (!(e instanceof spryte) || (spryte2 = (spryte)e).cfr_renamed_312() != 1) continue;
                n = 3;
                return 3;
            }
        }
        return n;
    }

    public sprrve cfr_renamed_4170() {
        return this.cfr_renamed_119;
    }

    public static sprlle cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprlle.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public sprxue cfr_renamed_1472() {
        return this.cfr_renamed_2;
    }

    public static sprlle cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprlle) {
            return (sprlle)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new sprlle((sprbne)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprhky.cfr_renamed_9("42\u000b=\u00115\u0019|<)\t4\u00182\t5\u001e=\t9\u0019\u0018\u001c(\u001cf]")).append(arg0.getClass().getName()).toString());
    }

    public sprere cfr_renamed_4191() {
        return this.cfr_renamed_91;
    }

    public sprere cfr_renamed_4190() {
        return this.cfr_renamed_0;
    }

    public sprije cfr_renamed_4202() {
        return this.cfr_renamed_112;
    }

    /*
     * WARNING - void declaration
     */
    public sprlle(sprbne sprbne2) {
        void arg0;
        int n = 0;
        this.cfr_renamed_1 = (sprooe)sprbne2.cfr_renamed_85(0);
        spra spra2 = arg0.cfr_renamed_85(++n);
        ++n;
        if (spra2 instanceof spryte) {
            this.cfr_renamed_119 = sprrve.cfr_renamed_341((spryte)spra2, false);
            spra2 = arg0.cfr_renamed_85(n);
        }
        int n2 = ++n;
        this.cfr_renamed_152 = sprere.cfr_renamed_23(spra2);
        this.cfr_renamed_112 = sprije.cfr_renamed_23(arg0.cfr_renamed_85(n2));
        spra2 = arg0.cfr_renamed_85(++n);
        ++n;
        if (spra2 instanceof spryte) {
            this.cfr_renamed_4 = sprije.cfr_renamed_341((spryte)spra2, false);
            spra2 = arg0.cfr_renamed_85(n);
            ++n;
        }
        this.cfr_renamed_3 = sprnte.cfr_renamed_23(spra2);
        spra2 = arg0.cfr_renamed_85(n);
        ++n;
        if (spra2 instanceof spryte) {
            this.cfr_renamed_0 = sprere.cfr_renamed_341((spryte)spra2, false);
            spra2 = arg0.cfr_renamed_85(n);
            ++n;
        }
        this.cfr_renamed_2 = sprxue.cfr_renamed_23(spra2);
        if (arg0.cfr_renamed_84() > n) {
            this.cfr_renamed_91 = sprere.cfr_renamed_341((spryte)arg0.cfr_renamed_85(n), false);
        }
    }

    public sprije cfr_renamed_410() {
        return this.cfr_renamed_4;
    }

    public sprere cfr_renamed_4171() {
        return this.cfr_renamed_152;
    }

    /*
     * WARNING - void declaration
     */
    public sprlle(sprrve sprrve2, sprere sprere2, sprije sprije2, sprije sprije3, sprnte sprnte2, sprere sprere3, sprxue sprxue2, sprere sprere4) {
        void arg7;
        void arg6;
        void arg4;
        void arg1;
        void arg2;
        void arg0;
        void arg3;
        void arg5;
        if (!(sprije3 == null && arg5 == null || arg3 != null && arg5 != null)) {
            throw new IllegalArgumentException(sprpnn.cfr_renamed_9("a|bpvaDybzw|q}h5d{a5d`q}Daqgv5h`va%w`5vpq5qzbpq}`g"));
        }
        sprlle sprlle2 = this;
        sprlle sprlle3 = this;
        sprlle sprlle4 = this;
        sprlle sprlle5 = this;
        sprlle5.cfr_renamed_1 = new sprooe(sprlle.cfr_renamed_4195((sprrve)arg0));
        sprlle5.cfr_renamed_119 = arg0;
        sprlle4.cfr_renamed_112 = arg2;
        sprlle4.cfr_renamed_4 = arg3;
        sprlle3.cfr_renamed_152 = arg1;
        sprlle3.cfr_renamed_3 = arg4;
        sprlle2.cfr_renamed_0 = arg5;
        sprlle2.cfr_renamed_2 = arg6;
        this.cfr_renamed_91 = arg7;
    }

    public sprooe cfr_renamed_3() {
        return this.cfr_renamed_1;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprlle sprlle2 = this;
        sprlre2.cfr_renamed_49(sprlle2.cfr_renamed_1);
        if (sprlle2.cfr_renamed_119 != null) {
            sprlre2.cfr_renamed_49(new sprhse(0 != 0, 0, this.cfr_renamed_119));
        }
        sprlre sprlre3 = sprlre2;
        sprlle sprlle3 = this;
        sprlre3.cfr_renamed_49(sprlle3.cfr_renamed_152);
        sprlre3.cfr_renamed_49(sprlle3.cfr_renamed_112);
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(new sprhse(false, 1, this.cfr_renamed_4));
        }
        sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        if (this.cfr_renamed_0 != null) {
            sprlre2.cfr_renamed_49(new sprhse(false, 2, this.cfr_renamed_0));
        }
        sprlre2.cfr_renamed_49(this.cfr_renamed_2);
        if (this.cfr_renamed_91 != null) {
            sprlre2.cfr_renamed_49(new sprhse(false, 3, this.cfr_renamed_91));
        }
        return new sprjve(sprlre2);
    }

    public sprnte cfr_renamed_4203() {
        return this.cfr_renamed_3;
    }
}

