/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Pointer
 *  com.sun.jna.Structure
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmjn;
import com.spire.presentation.packages.sprtea;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

@sprtea
public class sprskn
extends Structure {
    public int end;
    public int tag;
    public int val;
    public int start;

    public sprskn(Pointer arg0) {
        sprskn sprskn2 = this;
        super(arg0);
        sprskn2.read();
    }

    public void setStart(int arg0) {
        this.start = arg0;
    }

    public void setTag(sprmjn arg0) {
        this.tag = sprmjn.cfr_renamed_12970(arg0);
    }

    public int getEnd() {
        return this.end;
    }

    public sprmjn getTag() {
        return sprmjn.cfr_renamed_4704(this.tag);
    }

    public sprskn(sprmjn sprmjn2) {
        this.tag = sprmjn.cfr_renamed_12970(sprmjn2);
    }

    /*
     * WARNING - void declaration
     */
    public sprskn(sprmjn sprmjn2, int n, int n2, int n3) {
        void arg2;
        void arg1;
        void arg0;
        sprskn sprskn2 = this;
        sprskn sprskn3 = this;
        sprskn3.tag = sprmjn.cfr_renamed_12970((sprmjn)arg0);
        sprskn3.val = arg1;
        sprskn2.start = arg2;
        sprskn2.end = n3;
    }

    public sprskn() {
    }

    public List<String> getFieldOrder() {
        String[] stringArray = new String[4];
        stringArray[0] = "tag";
        stringArray[1] = "val";
        stringArray[2] = "start";
        stringArray[3] = "end";
        return Arrays.asList(stringArray);
    }

    public int getValue() {
        return this.val;
    }

    public int getStart() {
        return this.start;
    }

    public void setEnd(int arg0) {
        this.end = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprskn(sprmjn sprmjn2, int n) {
        void arg0;
        sprskn sprskn2 = this;
        sprskn2.tag = sprmjn.cfr_renamed_12970((sprmjn)arg0);
        sprskn2.val = n;
    }

    public void setValue(int arg0) {
        this.val = arg0;
    }
}

