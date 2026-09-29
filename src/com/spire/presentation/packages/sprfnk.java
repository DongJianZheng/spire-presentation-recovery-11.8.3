/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprblk;
import com.spire.presentation.packages.sprirm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprpfk;
import com.spire.presentation.packages.sprrzp;
import com.spire.presentation.packages.sprxqo;
import com.spire.presentation.packages.sprywl;

public class sprfnk
extends sprblk {
    private sprywl cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_2579() throws sprpfk {
        if (this.cfr_renamed_4 != null) {
            return;
        }
        if (((sprirm)((Object)this.cfr_renamed_4)).cfr_renamed_2578() == null) {
            throw new sprpfk(sprrzp.cfr_renamed_9("abfgwQTA@GQ\u001aAUQU\u000bY@GVUBQ\u0005GM[PXA\u0014GQ\u0005GUQF]C]@P\u0005RJF\u0005bvp\u0005G@FS]FQ"));
        }
        try {
            this.cfr_renamed_4 = new sprywl(((sprirm)((Object)this.cfr_renamed_4)).cfr_renamed_2578().cfr_renamed_186());
            return;
        }
        catch (sprlyl sprlyl2) {
            throw new sprpfk(sprxqo.cfr_renamed_9("$&\t`\u0013g\u0015\"\u0006#G\u0004*\u0014G\u0014\u000e \t\"\u0003\u0003\u00063\u0006g\u00015\b*G.\t7\u00123"), sprlyl2);
        }
    }

    public byte[] cfr_renamed_2578() {
        return ((sprirm)((Object)this.cfr_renamed_4)).cfr_renamed_2578().cfr_renamed_186();
    }

    public sprywl cfr_renamed_2577() {
        return this.cfr_renamed_4;
    }

    public sprfnk(sprirm arg0) throws sprpfk {
        sprfnk sprfnk2 = this;
        super(arg0);
        sprfnk2.cfr_renamed_2579();
    }
}

