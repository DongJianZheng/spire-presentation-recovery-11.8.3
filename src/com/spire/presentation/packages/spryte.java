/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbim;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdsk;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprhg;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkre;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import java.io.IOException;

public abstract class spryte
extends sprvva
implements sprhg {
    public spra cfr_renamed_1;
    public int cfr_renamed_2;
    public boolean cfr_renamed_3;
    public boolean cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_4612() {
        spryte spryte2 = this;
        return new sprkre(spryte2.cfr_renamed_4, spryte2.cfr_renamed_2, this.cfr_renamed_1);
    }

    @Override
    public int cfr_renamed_312() {
        return this.cfr_renamed_2;
    }

    public sprvva cfr_renamed_2456() {
        if (this.cfr_renamed_1 != null) {
            return this.cfr_renamed_1.cfr_renamed_119();
        }
        return null;
    }

    @Override
    public int hashCode() {
        spryte spryte2 = this;
        int n = spryte2.cfr_renamed_2;
        if (spryte2.cfr_renamed_1 != null) {
            n ^= this.cfr_renamed_1.hashCode();
        }
        return n;
    }

    public boolean cfr_renamed_29() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprvva cfr_renamed_4615() {
        spryte spryte2 = this;
        return new sprhse(spryte2.cfr_renamed_4, spryte2.cfr_renamed_2, this.cfr_renamed_1);
    }

    @Override
    public sprvva cfr_renamed_2414() {
        return this.cfr_renamed_119();
    }

    public static spryte cfr_renamed_341(spryte arg0, boolean arg1) {
        if (arg1) {
            return (spryte)arg0.cfr_renamed_2456();
        }
        throw new IllegalArgumentException(sprbim.cfr_renamed_9("\r\u001c\u0014\u001d\r\u0012\r\u0005\b\bD\u0005\u0005\u0016\u0003\u0014\u0000Q\u0010\u0010\u0003\u0016\u0001\u0015D\u001e\u0006\u001b\u0001\u0012\u0010"));
    }

    public String toString() {
        return new StringBuilder().insert(0, "[").append(this.cfr_renamed_2).append("]").append(this.cfr_renamed_1).toString();
    }

    /*
     * WARNING - void declaration
     */
    public spryte(boolean bl, int n, spra spra2) {
        void arg2;
        void arg1;
        spryte spryte2;
        spryte spryte3 = this;
        this.cfr_renamed_3 = false;
        spryte3.cfr_renamed_4 = true;
        spryte3.cfr_renamed_1 = null;
        if (spra2 instanceof sprkj) {
            spryte2 = this;
            this.cfr_renamed_4 = true;
        } else {
            void arg0;
            spryte2 = this;
            this.cfr_renamed_4 = arg0;
        }
        spryte2.cfr_renamed_2 = arg1;
        if (this.cfr_renamed_4) {
            this.cfr_renamed_1 = arg2;
            return;
        }
        if (arg2.cfr_renamed_119() instanceof sprere) {
            Object var5_4 = null;
        }
        this.cfr_renamed_1 = arg2;
    }

    public boolean cfr_renamed_4567() {
        return this.cfr_renamed_4;
    }

    @Override
    public boolean cfr_renamed_4788(sprvva arg0) {
        if (!(arg0 instanceof spryte)) {
            return false;
        }
        spryte spryte2 = (spryte)arg0;
        if (this.cfr_renamed_2 != spryte2.cfr_renamed_2 || this.cfr_renamed_3 != spryte2.cfr_renamed_3 || this.cfr_renamed_4 != spryte2.cfr_renamed_4) {
            return false;
        }
        return !(this.cfr_renamed_1 == null ? spryte2.cfr_renamed_1 != null : !this.cfr_renamed_1.cfr_renamed_119().equals(spryte2.cfr_renamed_1.cfr_renamed_119()));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static spryte cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof spryte) {
            return (spryte)arg0;
        }
        if (!(arg0 instanceof byte[])) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprbim.cfr_renamed_9("\u0011\u001f\u000f\u001f\u000b\u0006\nQ\u000b\u0013\u000e\u0014\u0007\u0005D\u0018\nQ\u0003\u0014\u00108\n\u0002\u0010\u0010\n\u0012\u0001KD")).append(arg0.getClass().getName()).toString());
        }
        try {
            return spryte.cfr_renamed_23(spryte.cfr_renamed_184((byte[])arg0));
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprdsk.cfr_renamed_9("\u0003\"\f/\u0000'E7\nc\u0006,\u000b0\u00111\u0010 \u0011c\u0011\"\u0002$\u0000'E,\u0007)\u0000 \u0011c\u00031\n.E!\u001c7\u0000\u00188yE")).append(iOException.getMessage()).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public spra cfr_renamed_4829(int arg0, boolean arg1) {
        switch (arg0) {
            case 17: {
                return sprere.cfr_renamed_341(this, arg1).cfr_renamed_4828();
            }
            case 16: {
                return sprbne.cfr_renamed_341(this, arg1).cfr_renamed_4828();
            }
            case 4: {
                return sprxue.cfr_renamed_341(this, arg1).cfr_renamed_4828();
            }
        }
        if (arg1) {
            return this.cfr_renamed_2456();
        }
        throw new RuntimeException(new StringBuilder().insert(0, sprdsk.cfr_renamed_9("*\b3\t*\u0006*\u0011c\u0011\"\u0002$\f-\u0002c\u000b,\u0011c\f.\u0015/\u0000.\u0000-\u0011&\u0001c\u0003,\u0017c\u0011\"\u0002yE")).append(arg0).toString());
    }

    @Override
    public abstract void cfr_renamed_4613(sprope var1) throws IOException;
}

