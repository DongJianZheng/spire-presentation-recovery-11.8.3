/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Library
 *  com.sun.jna.Pointer
 *  com.sun.jna.ptr.IntByReference
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjkn;
import com.spire.presentation.packages.sprjqn;
import com.spire.presentation.packages.sprmjn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryon;
import com.sun.jna.Library;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;

@sprtea
public interface sprfu
extends Library {
    public static final sprfu cfr_renamed_4 = sprjkn.cfr_renamed_12981();

    public Pointer hb_buffer_create();

    public int hb_buffer_get_direction(Pointer var1);

    public void hb_buffer_guess_segment_properties(Pointer var1);

    public Pointer hb_buffer_reference(Pointer var1);

    public void hb_font_get_glyph_advance_for_direction(Pointer var1, int var2, int var3, IntByReference var4, IntByReference var5);

    public boolean hb_shape_full(Pointer var1, Pointer var2, Pointer var3, int var4, Pointer var5);

    public void hb_buffer_set_flags(Pointer var1, int var2);

    public void hb_ot_font_set_funcs(Pointer var1);

    public Pointer hb_blob_get_data(Pointer var1, IntByReference var2);

    public void hb_face_destroy(Pointer var1);

    public boolean hb_ot_metrics_get_position(Pointer var1, int var2, IntByReference var3);

    public void hb_face_set_glyph_count(Pointer var1, int var2);

    public void hb_feature_to_string(Pointer var1, byte[] var2, int var3);

    public boolean hb_blob_is_immutable(Pointer var1);

    public void hb_blob_destroy(Pointer var1);

    public sprjqn hb_script_from_string(String var1, int var2);

    public Pointer hb_face_reference(Pointer var1);

    public Pointer hb_font_create(Pointer var1);

    public int hb_buffer_get_flags(Pointer var1);

    public int hb_face_get_glyph_count(Pointer var1);

    public int hb_buffer_get_content_type(Pointer var1);

    public Pointer hb_blob_create_from_file(String var1);

    public boolean hb_font_get_glyph_h_origin(Pointer var1, int var2, IntByReference var3, IntByReference var4);

    public int hb_buffer_get_cluster_level(Pointer var1);

    public int hb_glyph_info_get_glyph_flags(Pointer var1);

    public Pointer hb_blob_reference(Pointer var1);

    public void hb_buffer_set_direction(Pointer var1, int var2);

    public void hb_buffer_add_utf16(Pointer var1, char[] var2, int var3, int var4, int var5);

    public int hb_buffer_get_length(Pointer var1);

    public int hb_ot_metrics_get_x_variation(Pointer var1, int var2);

    public int hb_ot_metrics_get_y_variation(Pointer var1, int var2);

    public void hb_buffer_set_content_type(Pointer var1, int var2);

    public void hb_font_destroy(Pointer var1);

    public void hb_buffer_set_length(Pointer var1, int var2);

    public Pointer hb_face_create(Pointer var1, int var2);

    public void hb_buffer_reset(Pointer var1);

    public int hb_script_get_horizontal_direction(sprmjn var1);

    public boolean hb_font_get_glyph_v_origin(Pointer var1, int var2, IntByReference var3, IntByReference var4);

    public int hb_font_get_glyph_h_advance(Pointer var1, int var2);

    public boolean hb_font_get_h_extents(Pointer var1, spryon var2);

    public void hb_buffer_set_cluster_level(Pointer var1, int var2);

    public void hb_blob_make_immutable(Pointer var1);

    public void hb_face_set_upem(Pointer var1, int var2);

    public Pointer hb_buffer_get_glyph_infos(Pointer var1, IntByReference var2);

    public int hb_face_get_upem(Pointer var1);

    public int hb_buffer_get_script(Pointer var1);

    public boolean hb_font_get_glyph_contour_point_for_origin(Pointer var1, int var2, int var3, int var4, IntByReference var5, IntByReference var6);

    public Pointer hb_buffer_get_glyph_positions(Pointer var1, IntByReference var2);

    public Pointer hb_font_create_sub_font(Pointer var1);

    public float hb_ot_metrics_get_variation(Pointer var1, int var2);

    public void hb_buffer_destroy(Pointer var1);

    public void hb_buffer_set_script(Pointer var1, int var2);

    public Pointer hb_font_reference(Pointer var1);
}

