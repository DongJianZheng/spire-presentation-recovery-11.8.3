/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprclm;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprlui;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprpnia;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprukm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.io.IOException;

public class sprakm
extends sprqqe
implements sprlm {
    private sprukm cfr_renamed_3;
    private sprclm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.cfr_renamed_119();
        }
        return new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprakm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprakm) {
            return (sprakm)arg0;
        }
        if (arg0 instanceof byte[]) {
            try {
                return sprakm.cfr_renamed_23(sprxgf.cfr_renamed_184((byte[])arg0));
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprpnia.cfr_renamed_9("/k f,ni~&**e'y=x<i=*:o8\u007f,d*oil;e$*+s=o\u0012Ws*")).append(iOException.getMessage()).toString());
            }
        }
        if (arg0 instanceof sprszm) {
            sprclm sprclm2 = sprclm.cfr_renamed_23(arg0);
            return new sprakm(sprclm2);
        }
        if (arg0 instanceof sprnvm) {
            sprnvm sprnvm2 = sprnvm.cfr_renamed_23(arg0);
            sprukm sprukm2 = sprukm.cfr_renamed_5085(sprnvm2, false);
            return new sprakm(sprukm2);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprlui.cfr_renamed_9("/0\u00193\b1K+L<\u00031\u001a:\u001e+L9\u001e0\u0001\u007f\u0003=\u0006:\u000f+L+\u0003\u007f(\t/\f>:\u001f/\u00031\u001f:V\u007f")).append(arg0.getClass().getName()).toString());
    }

    public sprakm(sprclm sprclm2) {
        this.cfr_renamed_4 = sprclm2;
    }

    public static sprakm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprakm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public sprukm cfr_renamed_4764() {
        return this.cfr_renamed_3;
    }

    public String toString() {
        if (this.cfr_renamed_4 != null) {
            return new StringBuilder().insert(0, sprpnia.cfr_renamed_9("N\u001fI\u001aX,y9e'y,*2\u0000-|\no;~\u0000d/es*")).append(this.cfr_renamed_4.toString()).append(sprlui.cfr_renamed_9("\u0011U")).toString();
        }
        return new StringBuilder().insert(0, sprpnia.cfr_renamed_9("\r\\\nY\u001bo:z&d:oiqCn?O;x&x\u0007e=os*")).append(this.cfr_renamed_3.toString()).append(sprlui.cfr_renamed_9("\u0011U")).toString();
    }

    public sprclm cfr_renamed_4763() {
        return this.cfr_renamed_4;
    }

    public sprakm(sprukm sprukm2) {
        this.cfr_renamed_3 = sprukm2;
    }
}

