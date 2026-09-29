/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Pointer
 *  com.sun.jna.Structure
 *  com.sun.jna.ptr.IntByReference
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfu;
import com.spire.presentation.packages.sprtea;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import java.util.Arrays;
import java.util.List;

@sprtea
public class sprsrn
extends Structure {
    public Pointer font = Pointer.NULL;

    public List<String> getFieldOrder() {
        String[] stringArray = new String[1];
        stringArray[0] = "font";
        return Arrays.asList(stringArray);
    }

    public sprsrn() {
    }

    public sprsrn(Pointer pointer) {
        this.font = pointer;
    }

    public int getYVariation(int arg0) {
        return sprfu.cfr_renamed_4.hb_ot_metrics_get_y_variation(this.font, arg0);
    }

    public int getXVariation(int arg0) {
        return sprfu.cfr_renamed_4.hb_ot_metrics_get_x_variation(this.font, arg0);
    }

    public float getVariation(int arg0) {
        return sprfu.cfr_renamed_4.hb_ot_metrics_get_variation(this.font, arg0);
    }

    public boolean tryGetPosition(int arg0, IntByReference arg1) {
        return sprfu.cfr_renamed_4.hb_ot_metrics_get_position(this.font, arg0, arg1);
    }
}

