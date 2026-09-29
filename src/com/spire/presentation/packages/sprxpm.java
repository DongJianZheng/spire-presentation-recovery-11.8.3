/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhtc;
import com.spire.presentation.packages.sprkim;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrpk;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.io.IOException;

public class sprxpm
extends sprqqe
implements sprlm {
    private int cfr_renamed_2;
    private sprqqe cfr_renamed_3;
    private sprndm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprxpm(sprndm sprndm2) {
        void arg0;
        if (sprndm2.cfr_renamed_569() != 3) {
            throw new IllegalArgumentException(sprhtc.cfr_renamed_9("z.y956p2f)z.5s5#p2a)s)v!a%f`t,y/b%q"));
        }
        this.cfr_renamed_4 = arg0;
    }

    public static sprxpm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        if (arg0 != null) {
            if (arg1) {
                return sprxpm.cfr_renamed_23(arg0.cfr_renamed_8225());
            }
            throw new IllegalArgumentException(sprrpk.cfr_renamed_9(">f-''r9sje/'/\u007f:k#d#s"));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprxpm(int n, sprqqe sprqqe2) {
        void arg0;
        sprxpm sprxpm2 = this;
        sprxpm2.cfr_renamed_2 = arg0;
        sprxpm2.cfr_renamed_3 = sprqqe2;
    }

    public sprqqe cfr_renamed_11356() {
        return this.cfr_renamed_3;
    }

    public sprndm cfr_renamed_4415() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        if (this.cfr_renamed_3 != null) {
            sprxpm sprxpm2 = this;
            return new sprycn(true, sprxpm2.cfr_renamed_2, (sprco)sprxpm2.cfr_renamed_3);
        }
        return this.cfr_renamed_4.cfr_renamed_119();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprxpm cfr_renamed_23(Object arg0) {
        Object object;
        if (arg0 == null || arg0 instanceof sprxpm) {
            return (sprxpm)arg0;
        }
        if (arg0 instanceof byte[]) {
            try {
                object = arg0 = sprxgf.cfr_renamed_184((byte[])arg0);
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(sprhtc.cfr_renamed_9("\t{6t,|$5%{#z$|.r`|.5\u0003X\u0010V%g4|&|#t4p"));
            }
        } else {
            object = arg0;
        }
        if (object instanceof sprszm) {
            return new sprxpm(sprndm.cfr_renamed_23(arg0));
        }
        if (arg0 instanceof sprnvm) {
            sprnvm sprnvm2 = sprnvm.cfr_renamed_6501(arg0, 128);
            return new sprxpm(sprnvm2.cfr_renamed_312(), sprnvm2.cfr_renamed_8122());
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprrpk.cfr_renamed_9("\u0003i<f&n.'%e b)sp'")).append(arg0.getClass().getName()).toString());
    }

    public sprkim cfr_renamed_4892() {
        return sprkim.cfr_renamed_23(this.cfr_renamed_3);
    }

    public boolean cfr_renamed_4893() {
        return this.cfr_renamed_4 != null;
    }

    public int cfr_renamed_11357() {
        return this.cfr_renamed_2;
    }

    public sprxpm(sprkim arg0) {
        this(1, arg0);
    }
}

