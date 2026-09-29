/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprakm;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprgok;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprmnm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpfk;
import com.spire.presentation.packages.sprpnja;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruxy;
import com.spire.presentation.packages.sprvr;
import com.spire.presentation.packages.sprywl;

public class sprvkk
extends sprgok {
    private sprakm cfr_renamed_4;

    @Override
    public sprco cfr_renamed_480() {
        return this.cfr_renamed_4;
    }

    public sprvkk(sprywl arg0) throws sprpfk {
        this(sprmnm.cfr_renamed_23(arg0.cfr_renamed_568().cfr_renamed_480()).cfr_renamed_2589());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprvkk(sprlvm arg0) throws sprpfk {
        super(arg0);
        if (!sprvr.cfr_renamed_2.cfr_renamed_5078(arg0.cfr_renamed_696())) {
            throw new sprpfk(sprpnja.cfr_renamed_9("\u0001\r,\u0016'\f6+,\u0004-B,\r6B#B\u00064\u00011b0'\u00112\r,\u0011'"));
        }
        try {
            if (arg0.cfr_renamed_480().cfr_renamed_119() instanceof sprszm) {
                this.cfr_renamed_4 = sprakm.cfr_renamed_23(arg0.cfr_renamed_480());
                return;
            }
            this.cfr_renamed_4 = sprakm.cfr_renamed_23(sproug.cfr_renamed_23(arg0.cfr_renamed_480()).cfr_renamed_186());
            return;
        }
        catch (Exception exception) {
            throw new sprpfk(new StringBuilder().insert(0, spruxy.cfr_renamed_9("N~zrwu;dt0kqic~0x\u007fud~~o*;")).append(exception.getMessage()).toString(), exception);
        }
    }
}

