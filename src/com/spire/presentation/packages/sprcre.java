/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhfp;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprprc;
import com.spire.presentation.packages.sprvva;
import java.io.IOException;

public abstract class sprcre
extends sprvva {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprcre cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprcre) {
            return (sprcre)arg0;
        }
        if (arg0 == null) {
            return null;
        }
        try {
            return sprcre.cfr_renamed_23(sprvva.cfr_renamed_184((byte[])arg0));
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprhfp.cfr_renamed_9("#U,X Pe@*\u0014&[+G1F0W1\u0014\u000ba\txeR7[(\u0014'M1Q\u001ei\u007f\u0014")).append(iOException.getMessage()).toString());
        }
        catch (ClassCastException classCastException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprprc.cfr_renamed_9("`j~jzs{$zf\u007favp5m{$raaM{wae{gp,<>5")).append(arg0.getClass().getName()).toString());
        }
    }

    public String toString() {
        return sprhfp.cfr_renamed_9("\u000ba\tx");
    }

    @Override
    public int hashCode() {
        return -1;
    }

    @Override
    public boolean cfr_renamed_4788(sprvva arg0) {
        return arg0 instanceof sprcre;
    }

    @Override
    public abstract void cfr_renamed_4613(sprope var1) throws IOException;
}

