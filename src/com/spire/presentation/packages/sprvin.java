/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Pointer
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprawja;
import com.spire.presentation.packages.sprcln;
import com.spire.presentation.packages.sprfu;
import com.spire.presentation.packages.sprijn;
import com.spire.presentation.packages.sprkyja;
import com.spire.presentation.packages.sprtea;
import com.sun.jna.Pointer;

@sprtea
public class sprvin
extends sprcln {
    public void cfr_renamed_12999(int arg0) {
        sprfu.cfr_renamed_4.hb_face_set_upem(this.cfr_renamed_12977(), arg0);
    }

    public void cfr_renamed_12997() {
        sprvin sprvin2 = this;
        sprvin2.cfr_renamed_12973(sprfu.cfr_renamed_4.hb_face_reference(sprvin2.cfr_renamed_12977()));
    }

    @Override
    public void cfr_renamed_12974() {
        if (this.cfr_renamed_12977() != Pointer.NULL) {
            sprfu.cfr_renamed_4.hb_face_destroy(this.cfr_renamed_12977());
        }
    }

    public void cfr_renamed_13000(boolean arg0) {
        super.cfr_renamed_11540(arg0);
    }

    public sprvin(sprijn arg0, long arg1) {
        this(arg0, (int)arg1);
    }

    public int cfr_renamed_13001() {
        return sprfu.cfr_renamed_4.hb_face_get_glyph_count(this.cfr_renamed_12977());
    }

    public sprvin(Pointer arg0) {
        super(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprvin(sprijn sprijn2, int n) {
        this(Pointer.NULL);
        void arg0;
        void arg1;
        if (sprijn2 == null) {
            throw new sprkyja("blob");
        }
        if (arg1 < 0) {
            throw new sprawja("index", "Index must be non negative.");
        }
        this.cfr_renamed_12973(sprfu.cfr_renamed_4.hb_face_create(arg0.cfr_renamed_12977(), (int)arg1));
    }

    public int cfr_renamed_13002() {
        return sprfu.cfr_renamed_4.hb_face_get_upem(this.cfr_renamed_12977());
    }

    public void cfr_renamed_12083(int arg0) {
        sprfu.cfr_renamed_4.hb_face_set_glyph_count(this.cfr_renamed_12977(), arg0);
    }
}

