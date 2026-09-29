/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprakp;
import com.spire.presentation.packages.sprbcn;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruzm;
import com.spire.presentation.packages.sprxfca;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.io.IOException;

public class sprsym
extends sprqqe
implements sprlm {
    public static final int cfr_renamed_1 = 1;
    public static final int cfr_renamed_2 = 0;
    private final sprqqe cfr_renamed_3;
    private final int cfr_renamed_4;

    public int cfr_renamed_324() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprsym(sprbcn sprbcn2) {
        this(new sprycn(0, (sprco)arg0));
        void arg0;
    }

    public sprqqe cfr_renamed_9306() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        if (this.cfr_renamed_3 instanceof sprbcn) {
            return new sprycn(0, this.cfr_renamed_3);
        }
        return this.cfr_renamed_3.cfr_renamed_119();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprsym cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprsym) {
            return (sprsym)arg0;
        }
        if (arg0 instanceof byte[]) {
            try {
                return new sprsym(sprxgf.cfr_renamed_184((byte[])arg0));
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(sprxfca.cfr_renamed_9(">L\n@\u0007GKV\u0004\u0002\u001bC\u0019Q\u000e\u0002\u0002L\u001fG\fP\u0002V\u0012\u0002\bJ\u000eA\u0000\u0002\u000fG\u001fC\u0002N\u0018\f"));
            }
        }
        if (arg0 != null) {
            return new sprsym((sprco)arg0);
        }
        return null;
    }

    public sprsym(spruzm arg0) {
        this((sprco)arg0);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprsym(sprco sprco2) {
        void arg0;
        if (sprco2 instanceof sprszm || arg0 instanceof spruzm) {
            this.cfr_renamed_4 = 0;
            this.cfr_renamed_3 = spruzm.cfr_renamed_23(arg0);
            return;
        }
        if (arg0 instanceof sprnvm) {
            sprsym sprsym2 = this;
            sprsym2.cfr_renamed_4 = 1;
            sprsym2.cfr_renamed_3 = sprbcn.cfr_renamed_23(((sprnvm)arg0).cfr_renamed_8225());
            return;
        }
        throw new IllegalArgumentException(sprakp.cfr_renamed_9("1T\u000fT\u000bM\n\u001a\u0007R\u0001Y\u000f\u001a\u000bX\u000e_\u0007NDS\n\u001a\rT\u0010_\u0003H\rN\u001d\u001a\u0007R\u0001Y\u000f\u0014"));
    }
}

