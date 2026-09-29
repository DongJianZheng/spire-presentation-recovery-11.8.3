/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraxo;
import com.spire.presentation.packages.sprbvm;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spripm;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnkr;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.io.IOException;

public class sprfsm
extends sprqqe
implements sprlm {
    public static final int cfr_renamed_0 = 1;
    private final int cfr_renamed_1;
    public static final int cfr_renamed_2 = 2;
    private final sprco cfr_renamed_3;
    public static final int cfr_renamed_4 = 0;

    public sprfsm(sprbvm sprbvm2) {
        sprfsm sprfsm2 = this;
        sprfsm2.cfr_renamed_1 = 1;
        sprfsm2.cfr_renamed_3 = sprbvm2;
    }

    public int cfr_renamed_312() {
        return this.cfr_renamed_1;
    }

    private /* synthetic */ sprfsm(sprszm sprszm2) {
        sprfsm sprfsm2 = this;
        sprfsm2.cfr_renamed_1 = 2;
        sprfsm2.cfr_renamed_3 = sprszm2;
    }

    public static sprfsm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprfsm) {
            return (sprfsm)arg0;
        }
        if (arg0 != null) {
            if (arg0 instanceof sprco) {
                sprnvm sprnvm2 = sprnvm.cfr_renamed_23(((sprco)arg0).cfr_renamed_119());
                switch (sprnvm2.cfr_renamed_312()) {
                    case 0: {
                        return new sprfsm(spripm.cfr_renamed_5085(sprnvm2, false));
                    }
                    case 1: {
                        return new sprfsm(sprbvm.cfr_renamed_5085(sprnvm2, false));
                    }
                    case 2: {
                        return new sprfsm(sprszm.cfr_renamed_5085(sprnvm2, false));
                    }
                }
                throw new IllegalArgumentException(new StringBuilder().insert(0, spraxo.cfr_renamed_9("j;t;p\"quk4xuv;?2z!V;l!~;|07|%u")).append(sprnvm2.cfr_renamed_312()).toString());
            }
            if (arg0 instanceof byte[]) {
                try {
                    return sprfsm.cfr_renamed_23(sprxgf.cfr_renamed_184((byte[])arg0));
                }
                catch (IOException iOException) {
                    throw new IllegalArgumentException(sprnkr.cfr_renamed_9("y\u0003g\u0003c\u001abMi\u0003o\u0002h\u0004b\n,\u0004bMk\bx$b\u001ex\fb\u000eiE%"));
                }
            }
            throw new IllegalArgumentException(new StringBuilder().insert(0, spraxo.cfr_renamed_9(" q>q:h;?:}?z6kuv;?2z!V;l!~;|07|%u")).append(arg0.getClass().getName()).toString());
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprfsm sprfsm2 = this;
        return new sprycn(false, sprfsm2.cfr_renamed_1, sprfsm2.cfr_renamed_3);
    }

    public sprco cfr_renamed_97() {
        return this.cfr_renamed_3;
    }

    public sprfsm(spripm spripm2) {
        sprfsm sprfsm2 = this;
        sprfsm2.cfr_renamed_1 = 0;
        sprfsm2.cfr_renamed_3 = spripm2;
    }
}

