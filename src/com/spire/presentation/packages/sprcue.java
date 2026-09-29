/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdpe;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprfve;
import com.spire.presentation.packages.sprgl;
import com.spire.presentation.packages.sprgve;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprjfd;
import com.spire.presentation.packages.sprjve;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;

public class sprcue
extends sprkra {
    private static final sprooe cfr_renamed_102;
    private sprnte cfr_renamed_93;
    private sprere cfr_renamed_86;
    private static final sprooe cfr_renamed_152;
    private sprooe cfr_renamed_112;
    private static final sprooe cfr_renamed_119;
    private boolean cfr_renamed_91;
    private sprere cfr_renamed_0;
    private sprere cfr_renamed_1;
    private sprere cfr_renamed_2;
    private boolean cfr_renamed_3;
    private static final sprooe cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprcue(sprbne sprbne2) {
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        this.cfr_renamed_112 = sprooe.cfr_renamed_23(enumeration.nextElement());
        this.cfr_renamed_1 = (sprere)enumeration.nextElement();
        this.cfr_renamed_93 = sprnte.cfr_renamed_23(enumeration.nextElement());
        block4: while (enumeration.hasMoreElements()) {
            sprvva sprvva2 = (sprvva)enumeration.nextElement();
            if (sprvva2 instanceof spryte) {
                spryte spryte2 = (spryte)sprvva2;
                switch (spryte2.cfr_renamed_312()) {
                    case 0: {
                        this.cfr_renamed_3 = spryte2 instanceof sprdpe;
                        this.cfr_renamed_0 = sprere.cfr_renamed_341(spryte2, false);
                        continue block4;
                    }
                    case 1: {
                        this.cfr_renamed_91 = spryte2 instanceof sprdpe;
                        this.cfr_renamed_2 = sprere.cfr_renamed_341(spryte2, false);
                        continue block4;
                    }
                }
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprjfd.cfr_renamed_9("?G!G%^$\t>H-\t<H&\\/\t")).append(spryte2.cfr_renamed_312()).toString());
            }
            this.cfr_renamed_86 = (sprere)sprvva2;
        }
        return;
    }

    public sprere cfr_renamed_617() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public sprcue(sprere sprere2, sprnte sprnte2, sprere sprere3, sprere sprere4, sprere sprere5) {
        void arg0;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        sprcue sprcue2 = this;
        sprcue sprcue3 = this;
        sprcue sprcue4 = this;
        sprcue sprcue5 = this;
        sprcue5.cfr_renamed_112 = sprcue5.cfr_renamed_4830(arg1.cfr_renamed_696(), (sprere)arg2, (sprere)arg3, (sprere)arg4);
        sprcue4.cfr_renamed_1 = arg0;
        sprcue4.cfr_renamed_93 = arg1;
        sprcue3.cfr_renamed_0 = arg2;
        sprcue3.cfr_renamed_2 = arg3;
        sprcue2.cfr_renamed_86 = arg4;
        sprcue2.cfr_renamed_91 = sprere4 instanceof sprgve;
        this.cfr_renamed_3 = arg2 instanceof sprgve;
    }

    private /* synthetic */ sprooe cfr_renamed_4830(sprtzd arg0, sprere arg1, sprere arg2, sprere arg3) {
        Object e;
        Enumeration enumeration;
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        if (arg1 != null) {
            enumeration = arg1.cfr_renamed_329();
            while (enumeration.hasMoreElements()) {
                e = enumeration.nextElement();
                if (!(e instanceof spryte)) continue;
                spryte spryte2 = spryte.cfr_renamed_23(e);
                if (spryte2.cfr_renamed_312() == 1) {
                    bl3 = true;
                    continue;
                }
                if (spryte2.cfr_renamed_312() == 2) {
                    bl4 = true;
                    continue;
                }
                if (spryte2.cfr_renamed_312() != 3) continue;
                bl = true;
            }
        }
        if (bl) {
            return new sprooe(5L);
        }
        if (arg2 != null) {
            enumeration = arg2.cfr_renamed_329();
            while (enumeration.hasMoreElements()) {
                e = enumeration.nextElement();
                if (!(e instanceof spryte)) continue;
                bl2 = true;
            }
        }
        if (bl2) {
            return cfr_renamed_119;
        }
        if (bl4) {
            return cfr_renamed_152;
        }
        if (bl3) {
            return cfr_renamed_102;
        }
        if (this.cfr_renamed_4831(arg3)) {
            return cfr_renamed_102;
        }
        if (!sprgl.cfr_renamed_152.equals(arg0)) {
            return cfr_renamed_102;
        }
        return cfr_renamed_4;
    }

    public sprooe cfr_renamed_3() {
        return this.cfr_renamed_112;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public sprvva cfr_renamed_119() {
        var1_1 = new sprlre();
        v0 = this;
        v1 = var1_1;
        v1.cfr_renamed_49(this.cfr_renamed_112);
        v1.cfr_renamed_49(this.cfr_renamed_1);
        var1_1.cfr_renamed_49(v0.cfr_renamed_93);
        if (v0.cfr_renamed_0 == null) ** GOTO lbl15
        if (this.cfr_renamed_3) {
            v2 = this;
            var1_1.cfr_renamed_49(new sprdpe((boolean)0, 0, this.cfr_renamed_0));
        } else {
            var1_1.cfr_renamed_49(new sprhse((boolean)0, 0, this.cfr_renamed_0));
lbl15:
            // 2 sources

            v2 = this;
        }
        if (v2.cfr_renamed_2 == null) ** GOTO lbl23
        if (this.cfr_renamed_91) {
            v3 = var1_1;
            v4 = v3;
            v3.cfr_renamed_49(new sprdpe(false, 1, this.cfr_renamed_2));
        } else {
            var1_1.cfr_renamed_49(new sprhse(false, 1, this.cfr_renamed_2));
lbl23:
            // 2 sources

            v4 = var1_1;
        }
        v4.cfr_renamed_49(this.cfr_renamed_86);
        return new sprjve(var1_1);
    }

    public sprnte cfr_renamed_2589() {
        return this.cfr_renamed_93;
    }

    public sprere cfr_renamed_633() {
        return this.cfr_renamed_2;
    }

    public static sprcue cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprcue) {
            return (sprcue)arg0;
        }
        if (arg0 != null) {
            return new sprcue(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprere cfr_renamed_621() {
        return this.cfr_renamed_86;
    }

    public sprere cfr_renamed_4139() {
        return this.cfr_renamed_1;
    }

    static {
        cfr_renamed_4 = new sprooe(1L);
        cfr_renamed_102 = new sprooe(3L);
        cfr_renamed_152 = new sprooe(4L);
        cfr_renamed_119 = new sprooe(5L);
    }

    private /* synthetic */ boolean cfr_renamed_4831(sprere arg0) {
        Enumeration enumeration = arg0.cfr_renamed_329();
        while (enumeration.hasMoreElements()) {
            if (sprfve.cfr_renamed_23(enumeration.nextElement()).cfr_renamed_3().cfr_renamed_97().intValue() != 3) continue;
            return true;
        }
        return false;
    }
}

