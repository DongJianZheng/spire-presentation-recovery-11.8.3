/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraen;
import com.spire.presentation.packages.sprcoca;
import com.spire.presentation.packages.sprfcn;
import com.spire.presentation.packages.sprkgn;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprltq;
import com.spire.presentation.packages.sprlzm;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprnrm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprpan;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzen;

public class sprtjm
extends sprqqe
implements sprlm {
    public int cfr_renamed_119;
    public sprml cfr_renamed_91;
    public static final int cfr_renamed_0 = 3;
    public static final int cfr_renamed_1 = 0;
    public static final int cfr_renamed_2 = 2;
    public static final int cfr_renamed_3 = 200;
    public static final int cfr_renamed_4 = 1;

    @Override
    public sprxgf cfr_renamed_119() {
        return (sprxgf)((Object)this.cfr_renamed_91);
    }

    public sprtjm(String string) {
        String arg0;
        if (string.length() > 200) {
            arg0 = arg0.substring(0, 200);
        }
        sprtjm sprtjm2 = this;
        sprtjm2.cfr_renamed_119 = 2;
        sprtjm sprtjm3 = this;
        sprtjm2.cfr_renamed_91 = new spraen(arg0);
    }

    public static sprtjm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprml) {
            return new sprtjm((sprml)arg0);
        }
        if (arg0 == null || arg0 instanceof sprtjm) {
            return (sprtjm)arg0;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprcoca.cfr_renamed_9("S\u0018V\u0011]\u0015VTU\u0016P\u0011Y\u0000\u001a\u001dTT]\u0011N=T\u0007N\u0015T\u0017_N\u001a")).append(arg0.getClass().getName()).toString());
    }

    public static sprtjm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        if (!arg1) {
            throw new IllegalArgumentException(sprltq.cfr_renamed_9("\u0000\t\f\b\u0000\u0004C\b\u0017\u0004\u000eA\u000e\u0014\u0010\u0015C\u0003\u0006A\u0006\u0019\u0013\r\n\u0002\n\u0015\u000f\u0018C\u0015\u0002\u0006\u0004\u0004\u0007"));
        }
        return sprtjm.cfr_renamed_23(arg0.cfr_renamed_8225());
    }

    public String cfr_renamed_314() {
        return this.cfr_renamed_91.cfr_renamed_314();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public sprtjm(int n, String string) {
        void arg0;
        String arg1;
        if (string.length() > 200) {
            arg1 = arg1.substring(0, 200);
        }
        this.cfr_renamed_119 = arg0;
        switch (arg0) {
            case 0: {
                this.cfr_renamed_91 = new sprnrm(arg1);
                return;
            }
            case 2: {
                this.cfr_renamed_91 = new spraen(arg1);
                return;
            }
            case 3: {
                this.cfr_renamed_91 = new sprlzm(arg1);
                return;
            }
            case 1: {
                this.cfr_renamed_91 = new sprzen(arg1);
                return;
            }
        }
        this.cfr_renamed_91 = new spraen(arg1);
    }

    private /* synthetic */ sprtjm(sprml arg0) {
        this.cfr_renamed_91 = arg0;
        if (this.cfr_renamed_91 instanceof sprkgn) {
            this.cfr_renamed_119 = 2;
            return;
        }
        if (arg0 instanceof sprfcn) {
            this.cfr_renamed_119 = 1;
            return;
        }
        if (arg0 instanceof sprupm) {
            this.cfr_renamed_119 = 0;
            return;
        }
        if (arg0 instanceof sprpan) {
            this.cfr_renamed_119 = 3;
            return;
        }
        throw new IllegalArgumentException(sprcoca.cfr_renamed_9("\u0001T\u001fT\u001bM\u001a\u001a'n&s:}TN\rJ\u0011\u001a\u001dTT~\u001dI\u0004V\u0015C _\fN"));
    }
}

