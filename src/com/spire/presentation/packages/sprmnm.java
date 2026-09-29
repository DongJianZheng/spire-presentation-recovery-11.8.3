/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfdn;
import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprium;
import com.spire.presentation.packages.sprkdn;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprpsd;
import com.spire.presentation.packages.sprqcn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprufn;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.sprykaa;
import java.util.Enumeration;

public class sprmnm
extends sprqqe {
    private final sprlvm cfr_renamed_107;
    private spridn cfr_renamed_132;
    private boolean cfr_renamed_102;
    private final boolean cfr_renamed_93;
    private spridn cfr_renamed_86;
    private static final sprktm cfr_renamed_152;
    private final boolean cfr_renamed_112;
    private static final sprktm cfr_renamed_119;
    private final spridn cfr_renamed_91;
    private final spridn cfr_renamed_0;
    private final sprktm cfr_renamed_1;
    private boolean cfr_renamed_2;
    private static final sprktm cfr_renamed_3;
    private static final sprktm cfr_renamed_4;

    static {
        cfr_renamed_119 = new sprktm(1L);
        cfr_renamed_4 = new sprktm(3L);
        cfr_renamed_152 = new sprktm(4L);
        cfr_renamed_3 = new sprktm(5L);
    }

    public spridn cfr_renamed_621() {
        return this.cfr_renamed_0;
    }

    public static sprmnm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmnm) {
            return (sprmnm)arg0;
        }
        if (arg0 != null) {
            return new sprmnm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public spridn cfr_renamed_617() {
        return this.cfr_renamed_132;
    }

    /*
     * WARNING - void declaration
     */
    public sprmnm(spridn spridn2, sprlvm sprlvm2, spridn spridn3, spridn spridn4, spridn spridn5) {
        void arg0;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        sprmnm sprmnm2 = this;
        sprmnm sprmnm3 = this;
        sprmnm sprmnm4 = this;
        sprmnm sprmnm5 = this;
        sprmnm5.cfr_renamed_1 = sprmnm5.cfr_renamed_11325(arg1.cfr_renamed_696(), (spridn)arg2, (spridn)arg3, (spridn)arg4);
        sprmnm4.cfr_renamed_91 = arg0;
        sprmnm4.cfr_renamed_107 = arg1;
        sprmnm3.cfr_renamed_132 = arg2;
        sprmnm3.cfr_renamed_86 = arg3;
        sprmnm2.cfr_renamed_0 = arg4;
        sprmnm2.cfr_renamed_93 = spridn2 instanceof sprufn;
        this.cfr_renamed_2 = arg3 instanceof sprufn;
        this.cfr_renamed_102 = arg2 instanceof sprufn;
        this.cfr_renamed_112 = arg4 instanceof sprufn;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprmnm(sprszm sprszm2) {
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        this.cfr_renamed_1 = sprktm.cfr_renamed_23(enumeration.nextElement());
        this.cfr_renamed_91 = (spridn)enumeration.nextElement();
        this.cfr_renamed_107 = sprlvm.cfr_renamed_23(enumeration.nextElement());
        spridn spridn2 = null;
        block4: while (enumeration.hasMoreElements()) {
            sprxgf sprxgf2 = (sprxgf)enumeration.nextElement();
            if (sprxgf2 instanceof sprnvm) {
                sprnvm sprnvm2 = (sprnvm)sprxgf2;
                switch (sprnvm2.cfr_renamed_312()) {
                    case 0: {
                        this.cfr_renamed_102 = sprnvm2 instanceof sprkdn;
                        this.cfr_renamed_132 = spridn.cfr_renamed_5085(sprnvm2, false);
                        continue block4;
                    }
                    case 1: {
                        this.cfr_renamed_2 = sprnvm2 instanceof sprkdn;
                        this.cfr_renamed_86 = spridn.cfr_renamed_5085(sprnvm2, false);
                        continue block4;
                    }
                }
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprykaa.cfr_renamed_9("\fx\u0012x\u0016a\u00176\rw\u001e6\u000fw\u0015c\u001c6")).append(sprnvm2.cfr_renamed_312()).toString());
            }
            if (!(sprxgf2 instanceof spridn)) {
                throw new IllegalArgumentException(sprpsd.cfr_renamed_9("a\u001dfxW B=Q,W<\u001ex\\7FxW6Q7G6F=@=V"));
            }
            spridn2 = (spridn)sprxgf2;
        }
        if (spridn2 == null) {
            throw new IllegalArgumentException(sprykaa.cfr_renamed_9("e\u0010q\u0017s\u000b_\u0017p\u0016eYx\u0016bYe\u001cb"));
        }
        this.cfr_renamed_0 = spridn2;
        this.cfr_renamed_93 = this.cfr_renamed_91 instanceof sprufn;
        this.cfr_renamed_112 = this.cfr_renamed_0 instanceof sprufn;
    }

    private /* synthetic */ boolean cfr_renamed_11326(spridn arg0) {
        Enumeration enumeration = arg0.cfr_renamed_329();
        while (enumeration.hasMoreElements()) {
            if (!sprium.cfr_renamed_23(enumeration.nextElement()).cfr_renamed_3().cfr_renamed_7241(3)) continue;
            return true;
        }
        return false;
    }

    public spridn cfr_renamed_4139() {
        return this.cfr_renamed_91;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public sprxgf cfr_renamed_119() {
        var1_1 = new sprrvm(6);
        v0 = this;
        v1 = var1_1;
        v1.cfr_renamed_5004(this.cfr_renamed_1);
        v1.cfr_renamed_5004(this.cfr_renamed_91);
        var1_1.cfr_renamed_5004(v0.cfr_renamed_107);
        if (v0.cfr_renamed_132 == null) ** GOTO lbl15
        if (this.cfr_renamed_102) {
            v2 = this;
            var1_1.cfr_renamed_5004(new sprkdn((boolean)0, 0, (sprco)this.cfr_renamed_132));
        } else {
            var1_1.cfr_renamed_5004(new sprycn((boolean)0, 0, (sprco)this.cfr_renamed_132));
lbl15:
            // 2 sources

            v2 = this;
        }
        if (v2.cfr_renamed_86 == null) ** GOTO lbl23
        if (this.cfr_renamed_2) {
            v3 = var1_1;
            v4 = v3;
            v3.cfr_renamed_5004(new sprkdn(false, 1, (sprco)this.cfr_renamed_86));
        } else {
            var1_1.cfr_renamed_5004(new sprycn(false, 1, (sprco)this.cfr_renamed_86));
lbl23:
            // 2 sources

            v4 = var1_1;
        }
        v4.cfr_renamed_5004(this.cfr_renamed_0);
        if (!this.cfr_renamed_107.cfr_renamed_11327() || this.cfr_renamed_93 || this.cfr_renamed_112 || this.cfr_renamed_2 || this.cfr_renamed_102) {
            return new sprqcn(var1_1);
        }
        return new sprfdn(var1_1);
    }

    public sprlvm cfr_renamed_2589() {
        return this.cfr_renamed_107;
    }

    public spridn cfr_renamed_633() {
        return this.cfr_renamed_86;
    }

    private /* synthetic */ sprktm cfr_renamed_11325(sprlem arg0, spridn arg1, spridn arg2, spridn arg3) {
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
                if (!(e instanceof sprnvm)) continue;
                sprnvm sprnvm2 = sprnvm.cfr_renamed_23(e);
                if (sprnvm2.cfr_renamed_312() == 1) {
                    bl3 = true;
                    continue;
                }
                if (sprnvm2.cfr_renamed_312() == 2) {
                    bl4 = true;
                    continue;
                }
                if (sprnvm2.cfr_renamed_312() != 3) continue;
                bl = true;
            }
        }
        if (bl) {
            return new sprktm(5L);
        }
        if (arg2 != null) {
            enumeration = arg2.cfr_renamed_329();
            while (enumeration.hasMoreElements()) {
                e = enumeration.nextElement();
                if (!(e instanceof sprnvm)) continue;
                bl2 = true;
            }
        }
        if (bl2) {
            return cfr_renamed_3;
        }
        if (bl4) {
            return cfr_renamed_152;
        }
        if (bl3) {
            return cfr_renamed_4;
        }
        if (this.cfr_renamed_11326(arg3)) {
            return cfr_renamed_4;
        }
        if (!sprgz.cfr_renamed_3.cfr_renamed_5078(arg0)) {
            return cfr_renamed_4;
        }
        return cfr_renamed_119;
    }

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_1;
    }
}

