/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Pointer
 *  com.sun.jna.Structure
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfu;
import com.spire.presentation.packages.sprtea;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

@sprtea
public class sprmqn
extends Structure {
    public int cluster;
    public int codepoint;
    public int mask;
    public int var1;
    public int var2;

    public sprmqn(Pointer arg0) {
        sprmqn sprmqn2 = this;
        super(arg0);
        sprmqn2.read();
    }

    public String toString() {
        return new StringBuilder().insert(0, "codepoint:[").append(this.codepoint).append("]").append(",mask:[").append(this.mask).append("]").append(",cluster:[").append(this.cluster).append("]").append(",var1:[").append(this.var1).append("]").append(",var2:[").append(this.var2).append("]").toString();
    }

    public int getGlyphFlags() {
        Pointer pointer = this.getPointer();
        return sprfu.cfr_renamed_4.hb_glyph_info_get_glyph_flags(pointer);
    }

    public List<String> getFieldOrder() {
        String[] stringArray = new String[5];
        stringArray[0] = "codepoint";
        stringArray[1] = "mask";
        stringArray[2] = "cluster";
        stringArray[3] = "var1";
        stringArray[4] = "var2";
        return Arrays.asList(stringArray);
    }

    public void setCluster(int arg0) {
        this.cluster = arg0;
    }

    public int getCluster() {
        return this.cluster;
    }

    public void setCodepoint(int arg0) {
        this.codepoint = arg0;
    }

    public int getCodepoint() {
        return this.codepoint;
    }
}

