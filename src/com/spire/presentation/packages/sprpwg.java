/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprksg;
import com.spire.presentation.packages.sprksz;
import com.spire.presentation.packages.sprpzg;
import com.spire.presentation.packages.sprqm;
import com.spire.presentation.packages.sprrbh;
import com.spire.presentation.packages.sprrug;
import com.spire.presentation.packages.sprtks;
import com.spire.presentation.packages.sprxyg;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

public class sprpwg
implements sprqm {
    public static final char cfr_renamed_91 = 't';
    public static final Date cfr_renamed_0 = sprpzg.cfr_renamed_3;
    private sprrbh cfr_renamed_1;
    public static final String cfr_renamed_2 = "_CONSOLE";
    public static final char cfr_renamed_3 = 'u';
    private boolean cfr_renamed_4;

    public OutputStream cfr_renamed_7552(OutputStream arg0, char arg1, File arg2) throws IOException {
        return this.cfr_renamed_7871(arg0, arg1, arg2.getName(), new Date(arg2.lastModified()));
    }

    public OutputStream cfr_renamed_7872(OutputStream arg0, char arg1, String arg2, Date arg3, File arg4) throws IOException {
        if (this.cfr_renamed_1 != null) {
            throw new IllegalStateException(sprtks.cfr_renamed_9("up|p`tfz`5sy`psqk5{{2zbp|5aasaw"));
        }
        this.cfr_renamed_1 = new sprrbh(this.cfr_renamed_4);
        return new sprrug(arg0, this.cfr_renamed_1, arg1, arg2, new Date(arg3.getTime()), arg4);
    }

    public sprpwg(boolean bl) {
        sprpwg sprpwg2 = this;
        sprpwg2.cfr_renamed_4 = false;
        sprpwg2.cfr_renamed_4 = bl;
    }

    public sprpwg() {
        this.cfr_renamed_4 = false;
    }

    public OutputStream cfr_renamed_7871(OutputStream arg0, char arg1, String arg2, Date arg3) throws IOException {
        if (this.cfr_renamed_1 != null) {
            throw new IllegalStateException(sprksz.cfr_renamed_9("y^p^lZjTl\u001b\u007fWl^\u007f_g\u001bwU>Tn^p\u001bmO\u007fO{"));
        }
        this.cfr_renamed_1 = new sprrbh(this.cfr_renamed_4);
        return new sprxyg(arg0, this.cfr_renamed_1, arg1, arg2, new Date(arg3.getTime()));
    }

    public OutputStream cfr_renamed_7558(OutputStream arg0, char arg1, String arg2, Date arg3, byte[] arg4) throws IOException {
        if (this.cfr_renamed_1 != null) {
            throw new IllegalStateException(sprtks.cfr_renamed_9("up|p`tfz`5sy`psqk5{{2zbp|5aasaw"));
        }
        this.cfr_renamed_1 = new sprrbh(this.cfr_renamed_4);
        return new sprksg(arg0, this.cfr_renamed_1, arg1, arg2, new Date(arg3.getTime()), arg4);
    }

    @Override
    public void cfr_renamed_2637() throws IOException {
        if (this.cfr_renamed_1 != null) {
            this.cfr_renamed_1.cfr_renamed_2637();
            this.cfr_renamed_1 = null;
        }
    }
}

