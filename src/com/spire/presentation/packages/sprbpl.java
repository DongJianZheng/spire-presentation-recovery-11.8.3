/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spritl;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprpxl;
import com.spire.presentation.packages.sprqnaa;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprug;
import com.spire.presentation.packages.sprwtba;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprywl;
import java.io.IOException;

public class sprbpl
implements sprjn {
    private final sprywl cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprlvm cfr_renamed_1443(byte[] arg0) throws spritl {
        try {
            return sprlvm.cfr_renamed_23(sprxgf.cfr_renamed_184(arg0));
        }
        catch (Exception exception) {
            throw new spritl(new StringBuilder().insert(0, sprqnaa.cfr_renamed_9("(1)6*\"(5!p!111\u007fp")).append(exception.getMessage()).toString(), exception);
        }
    }

    public sprbpl(byte[] arg0) throws spritl {
        this(sprbpl.cfr_renamed_1443(arg0));
    }

    public sprug<sprpxl> cfr_renamed_633() {
        return this.cfr_renamed_4.cfr_renamed_633();
    }

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_4.cfr_renamed_91();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprbpl(sprlvm arg0) throws spritl {
        try {
            this.cfr_renamed_4 = new sprywl(arg0);
        }
        catch (sprlyl sprlyl2) {
            throw new spritl(new StringBuilder().insert(0, sprwtba.cfr_renamed_9("U>T9W-U:\\\u007fJ:K/W1K:\u0002\u007f")).append(sprlyl2.getMessage()).toString(), sprlyl2);
        }
        if (this.cfr_renamed_4.cfr_renamed_621().cfr_renamed_84() != 0) {
            throw new spritl(sprqnaa.cfr_renamed_9("=$<#?7= 4e\" #5?+# je\u0003,7+57\u0019+6*p6$7%&$0\" #e6*%+4"));
        }
        if (this.cfr_renamed_4.cfr_renamed_623() != null) {
            throw new spritl(sprwtba.cfr_renamed_9("U>T9W-U:\\\u007fJ:K/W1K:\u0002\u007fk6_1];\u0018\u001cW1L:V+\u00189W*V;"));
        }
    }

    public sprug<sprtpl> cfr_renamed_617() {
        return this.cfr_renamed_4.cfr_renamed_617();
    }
}

