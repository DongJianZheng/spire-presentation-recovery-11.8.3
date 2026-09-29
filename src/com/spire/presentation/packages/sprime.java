/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdue;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprsky;
import com.spire.presentation.packages.sprtqe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxll;
import com.spire.presentation.packages.spryte;
import java.io.IOException;

public class sprime
extends sprkra
implements sprkj {
    private sprdue cfr_renamed_3;
    private sprtqe cfr_renamed_4;

    public sprtqe cfr_renamed_4763() {
        return this.cfr_renamed_4;
    }

    public sprdue cfr_renamed_4764() {
        return this.cfr_renamed_3;
    }

    public sprime(sprdue sprdue2) {
        this.cfr_renamed_3 = sprdue2;
    }

    public static sprime cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprime.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public sprime(sprtqe sprtqe2) {
        this.cfr_renamed_4 = sprtqe2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.cfr_renamed_119();
        }
        return new sprhse(0, this.cfr_renamed_3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprime cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprime) {
            return (sprime)arg0;
        }
        if (arg0 instanceof byte[]) {
            try {
                return sprime.cfr_renamed_23(sprvva.cfr_renamed_184((byte[])arg0));
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprsky.cfr_renamed_9("\n`\u0005m\teLu\u0003!\u000fn\u0002r\u0018s\u0019b\u0018!\u001fd\u001dt\to\u000fdLg\u001en\u0001!\u000ex\u0018d7\\V!")).append(iOException.getMessage()).toString());
            }
        }
        if (arg0 instanceof sprbne) {
            sprtqe sprtqe2 = sprtqe.cfr_renamed_23(arg0);
            return new sprime(sprtqe2);
        }
        if (arg0 instanceof spryte) {
            spryte spryte2 = spryte.cfr_renamed_23(arg0);
            sprdue sprdue2 = sprdue.cfr_renamed_341(spryte2, false);
            return new sprime(sprdue2);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprxll.cfr_renamed_9("\u0017?!<0>s$t3;>\"5&$t6&?9p;2>57$t$;p\u0010\u0006\u0017\u0003\u00065' ;>'5np")).append(arg0.getClass().getName()).toString());
    }

    public String toString() {
        if (this.cfr_renamed_4 != null) {
            return new StringBuilder().insert(0, sprsky.cfr_renamed_9("E:B?S\tr\u001cn\u0002r\t!\u0017\u000b\bw/d\u001eu%o\nnV!")).append(this.cfr_renamed_4.toString()).append(sprxll.cfr_renamed_9(")Z")).toString();
        }
        if (this.cfr_renamed_3 != null) {
            return new StringBuilder().insert(0, sprsky.cfr_renamed_9("(W/R>d\u001fq\u0003o\u001fdLzfe\u001aD\u001es\u0003s\"n\u0018dV!")).append(this.cfr_renamed_3.toString()).append(sprxll.cfr_renamed_9(")Z")).toString();
        }
        return null;
    }
}

