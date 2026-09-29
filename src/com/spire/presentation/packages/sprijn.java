/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Pointer
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbhja;
import com.spire.presentation.packages.sprcln;
import com.spire.presentation.packages.spreeja;
import com.spire.presentation.packages.sprfu;
import com.spire.presentation.packages.sprtea;
import com.sun.jna.Pointer;

@sprtea
public class sprijn
extends sprcln {
    public boolean cfr_renamed_13022() {
        return sprfu.cfr_renamed_4.hb_blob_is_immutable(this.cfr_renamed_12977());
    }

    @Override
    public void cfr_renamed_11540(boolean arg0) {
        super.cfr_renamed_11540(arg0);
    }

    public void cfr_renamed_13023() {
        sprfu.cfr_renamed_4.hb_blob_make_immutable(this.cfr_renamed_12977());
    }

    @Override
    public void cfr_renamed_12974() {
        if (this.cfr_renamed_12977() != Pointer.NULL) {
            sprfu.cfr_renamed_4.hb_blob_destroy(this.cfr_renamed_12977());
        }
    }

    public static sprijn cfr_renamed_13024(String arg0) {
        if (!sprbhja.cfr_renamed_11642(arg0)) {
            throw new spreeja("Unable to find file.", arg0);
        }
        Pointer pointer = sprfu.cfr_renamed_4.hb_blob_create_from_file(arg0);
        return new sprijn(pointer);
    }

    public sprijn(Pointer arg0) {
        super(arg0);
    }

    public void cfr_renamed_12997() {
        sprijn sprijn2 = this;
        sprijn2.cfr_renamed_12973(sprfu.cfr_renamed_4.hb_blob_reference(sprijn2.cfr_renamed_12977()));
    }
}

