/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Pointer
 *  com.sun.jna.ptr.IntByReference
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprawja;
import com.spire.presentation.packages.sprcln;
import com.spire.presentation.packages.spreica;
import com.spire.presentation.packages.sprfu;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprjqn;
import com.spire.presentation.packages.sprmmn;
import com.spire.presentation.packages.sprmqn;
import com.spire.presentation.packages.sprtea;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;

@sprtea
public class sprnjn
extends sprcln {
    public int cfr_renamed_4690() {
        return sprfu.cfr_renamed_4.hb_buffer_get_flags(this.cfr_renamed_12977());
    }

    public void cfr_renamed_13003(char[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 0) {
            throw new sprawja("itemOffset", "ItemOffset must be non negative.");
        }
        if (this.cfr_renamed_806() != 0 && this.cfr_renamed_696() != 1) {
            throw new spreica("Non empty buffer's ContentType must be of type Unicode.");
        }
        if (this.cfr_renamed_696() == 2) {
            throw new spreica("ContentType must not be of type Glyphs");
        }
        sprfu.cfr_renamed_4.hb_buffer_add_utf16(this.cfr_renamed_12977(), arg0, arg1, arg2, arg3);
    }

    private /* synthetic */ sprmmn[] cfr_renamed_13004() {
        IntByReference intByReference = new IntByReference();
        Pointer pointer = sprfu.cfr_renamed_4.hb_buffer_get_glyph_positions(this.cfr_renamed_12977(), intByReference);
        int n = intByReference.getValue();
        return (sprmmn[])new sprmmn(pointer).toArray(n);
    }

    public sprnjn(Pointer arg0) {
        super(arg0);
    }

    public int cfr_renamed_12994() {
        return sprfu.cfr_renamed_4.hb_buffer_get_direction(this.cfr_renamed_12977());
    }

    public void cfr_renamed_13005(int arg0) {
        sprfu.cfr_renamed_4.hb_buffer_set_cluster_level(this.cfr_renamed_12977(), arg0);
    }

    public int cfr_renamed_13006() {
        return sprfu.cfr_renamed_4.hb_buffer_get_cluster_level(this.cfr_renamed_12977());
    }

    public sprmmn[] cfr_renamed_13007() {
        return this.cfr_renamed_13004();
    }

    public sprnjn() {
        this(sprfu.cfr_renamed_4.hb_buffer_create());
    }

    public String toString() {
        int n;
        sprghha sprghha2 = new sprghha();
        sprmqn[] sprmqnArray = this.cfr_renamed_13008();
        int n2 = n = 0;
        while (n2 < sprmqnArray.length) {
            sprghha2.cfr_renamed_13009(sprmqnArray[n++].toString());
            n2 = n;
        }
        return sprghha2.toString();
    }

    public int cfr_renamed_806() {
        return sprfu.cfr_renamed_4.hb_buffer_get_length(this.cfr_renamed_12977());
    }

    @Override
    public void cfr_renamed_12974() {
        if (this.cfr_renamed_12977() != Pointer.NULL) {
            sprfu.cfr_renamed_4.hb_buffer_destroy(this.cfr_renamed_12977());
        }
    }

    private /* synthetic */ sprmqn[] cfr_renamed_13010() {
        IntByReference intByReference = new IntByReference();
        Pointer pointer = sprfu.cfr_renamed_4.hb_buffer_get_glyph_infos(this.cfr_renamed_12977(), intByReference);
        int n = intByReference.getValue();
        return (sprmqn[])new sprmqn(pointer).toArray(n);
    }

    public void cfr_renamed_13011(int arg0) {
        sprfu.cfr_renamed_4.hb_buffer_set_length(this.cfr_renamed_12977(), arg0);
    }

    public void cfr_renamed_12997() {
        sprnjn sprnjn2 = this;
        sprnjn2.cfr_renamed_12973(sprfu.cfr_renamed_4.hb_buffer_reference(sprnjn2.cfr_renamed_12977()));
    }

    public void cfr_renamed_13012(String arg0) {
        this.cfr_renamed_13013(arg0, 0, -1);
    }

    public void cfr_renamed_13014(int arg0) {
        sprfu.cfr_renamed_4.hb_buffer_set_content_type(this.cfr_renamed_12977(), arg0);
    }

    public void cfr_renamed_13013(String arg0, int arg1, int arg2) {
        this.cfr_renamed_13003(arg0.toCharArray(), arg0.length(), arg1, arg2);
    }

    public sprjqn cfr_renamed_13015() {
        return sprjqn.cfr_renamed_12972(sprfu.cfr_renamed_4.hb_buffer_get_script(this.cfr_renamed_12977()));
    }

    public void cfr_renamed_13016(int arg0) {
        sprfu.cfr_renamed_4.hb_buffer_set_direction(this.cfr_renamed_12977(), arg0);
    }

    public sprmqn[] cfr_renamed_13008() {
        return this.cfr_renamed_13010();
    }

    public int cfr_renamed_696() {
        return sprfu.cfr_renamed_4.hb_buffer_get_content_type(this.cfr_renamed_12977());
    }

    public void cfr_renamed_13017(sprjqn arg0) {
        sprfu.cfr_renamed_4.hb_buffer_set_script(this.cfr_renamed_12977(), sprjqn.cfr_renamed_12971(arg0));
    }

    public void cfr_renamed_13018() {
        if (this.cfr_renamed_696() != 1) {
            throw new spreica("ContentType must be of type Unicode.");
        }
        sprfu.cfr_renamed_4.hb_buffer_guess_segment_properties(this.cfr_renamed_12977());
    }

    @Override
    public void cfr_renamed_11540(boolean arg0) {
        super.cfr_renamed_11540(arg0);
    }

    public void cfr_renamed_13019(int arg0) {
        sprfu.cfr_renamed_4.hb_buffer_set_flags(this.cfr_renamed_12977(), arg0);
    }
}

