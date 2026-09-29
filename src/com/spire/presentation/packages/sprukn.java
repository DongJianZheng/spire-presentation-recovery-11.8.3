/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Pointer
 *  com.sun.jna.ptr.IntByReference
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcln;
import com.spire.presentation.packages.spreica;
import com.spire.presentation.packages.sprfu;
import com.spire.presentation.packages.sprkyja;
import com.spire.presentation.packages.sprnjn;
import com.spire.presentation.packages.sprquha;
import com.spire.presentation.packages.sprskn;
import com.spire.presentation.packages.sprsrn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvin;
import com.spire.presentation.packages.spryon;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;

@sprtea
public class sprukn
extends sprcln {
    private sprukn cfr_renamed_2;
    private sprsrn cfr_renamed_3;
    private final int cfr_renamed_4 = 128;

    @Override
    public void cfr_renamed_11540(boolean arg0) {
        super.cfr_renamed_11540(arg0);
    }

    public void cfr_renamed_12987() {
        sprfu.cfr_renamed_4.hb_ot_font_set_funcs(this.cfr_renamed_12977());
    }

    public sprukn cfr_renamed_8155() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprukn(sprukn sprukn2) {
        super(Pointer.NULL);
        void arg0;
        if (sprukn2 == null) {
            throw new sprkyja("parent");
        }
        if (arg0.cfr_renamed_12977() == Pointer.NULL) {
            throw new sprquha("Handle");
        }
        this.cfr_renamed_2 = arg0;
        this.cfr_renamed_12973(sprfu.cfr_renamed_4.hb_font_create_sub_font(arg0.cfr_renamed_12977()));
        sprukn sprukn3 = this;
        this.cfr_renamed_3 = new sprsrn(this.cfr_renamed_12977());
    }

    public boolean cfr_renamed_12988(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        IntByReference intByReference = new IntByReference(arg3[0]);
        IntByReference intByReference2 = new IntByReference(arg4[0]);
        arg3[0] = intByReference.getValue();
        arg4[0] = intByReference2.getValue();
        return sprfu.cfr_renamed_4.hb_font_get_glyph_contour_point_for_origin(this.cfr_renamed_12977(), arg0, arg1, arg2, intByReference, intByReference2);
    }

    public int cfr_renamed_12989(int arg0) {
        return sprfu.cfr_renamed_4.hb_font_get_glyph_h_advance(this.cfr_renamed_12977(), arg0);
    }

    public void cfr_renamed_12990(sprnjn arg0, sprskn[] arg1) {
        this.cfr_renamed_12991(arg0, arg1, null);
    }

    public boolean cfr_renamed_12992(int arg0, int[] arg1, int[] arg2) {
        IntByReference intByReference = new IntByReference(arg1[0]);
        IntByReference intByReference2 = new IntByReference(arg2[0]);
        boolean bl = false;
        bl = sprfu.cfr_renamed_4.hb_font_get_glyph_h_origin(this.cfr_renamed_12977(), arg0, intByReference, intByReference2);
        arg1[0] = intByReference.getValue();
        arg2[0] = intByReference2.getValue();
        return bl;
    }

    public void cfr_renamed_12993(int arg0, int arg1, int[] arg2, int[] arg3) {
        IntByReference intByReference = new IntByReference(arg2[0]);
        IntByReference intByReference2 = new IntByReference(arg3[0]);
        sprfu.cfr_renamed_4.hb_font_get_glyph_advance_for_direction(this.cfr_renamed_12977(), arg0, arg1, intByReference, intByReference2);
        arg2[0] = intByReference.getValue();
        arg3[0] = intByReference2.getValue();
    }

    public void cfr_renamed_12991(sprnjn arg0, sprskn[] arg1, String[] arg2) {
        Pointer pointer;
        if (arg0 == null) {
            throw new sprkyja("buffer");
        }
        if (arg0.cfr_renamed_12994() == 0) {
            throw new spreica("Buffer's Direction must be valid.");
        }
        if (arg0.cfr_renamed_696() != 1) {
            throw new spreica("Buffer's ContentType must of type Unicode.");
        }
        Pointer pointer2 = arg1 == null || arg1.length == 0 ? Pointer.NULL : sprcln.cfr_renamed_12975(arg1);
        Pointer pointer3 = arg2 == null || arg2.length == 0 ? Pointer.NULL : Pointer.NULL;
        try {
            sprfu.cfr_renamed_4.hb_shape_full(this.cfr_renamed_12977(), arg0.cfr_renamed_12977(), pointer2, arg1 == null ? 0 : arg1.length, Pointer.NULL);
            pointer = pointer2;
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
            pointer = pointer2;
        }
        if (pointer != Pointer.NULL) {
            // empty if block
        }
        if (pointer3 != Pointer.NULL) {
            // empty if block
        }
    }

    public sprsrn cfr_renamed_12995() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprukn(sprvin sprvin2) {
        super(Pointer.NULL);
        void arg0;
        if (sprvin2 == null) {
            throw new sprkyja("face");
        }
        this.cfr_renamed_12973(sprfu.cfr_renamed_4.hb_font_create(arg0.cfr_renamed_12977()));
        sprukn sprukn2 = this;
        this.cfr_renamed_3 = new sprsrn(this.cfr_renamed_12977());
    }

    public boolean cfr_renamed_12996(int arg0, int[] arg1, int[] arg2) {
        IntByReference intByReference = new IntByReference(arg1[0]);
        IntByReference intByReference2 = new IntByReference(arg2[0]);
        arg1[0] = intByReference.getValue();
        arg2[0] = intByReference2.getValue();
        return sprfu.cfr_renamed_4.hb_font_get_glyph_v_origin(this.cfr_renamed_12977(), arg0, intByReference, intByReference2);
    }

    public void cfr_renamed_12997() {
        sprukn sprukn2 = this;
        sprukn2.cfr_renamed_12973(sprfu.cfr_renamed_4.hb_font_reference(sprukn2.cfr_renamed_12977()));
    }

    @Override
    public void cfr_renamed_12974() {
        if (this.cfr_renamed_12977() != Pointer.NULL) {
            sprfu.cfr_renamed_4.hb_font_destroy(this.cfr_renamed_12977());
        }
    }

    public boolean cfr_renamed_12998(spryon arg0) {
        return sprfu.cfr_renamed_4.hb_font_get_h_extents(this.cfr_renamed_12977(), arg0);
    }
}

