/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Pointer
 *  com.sun.jna.Structure
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprqu;
import com.spire.presentation.packages.sprtea;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

@sprtea
public class sprmjn
extends Structure
implements sprqu<sprmjn> {
    public static final sprmjn cfr_renamed_2 = new sprmjn(0, 0, 0, 0);
    public static final sprmjn cfr_renamed_3;
    public int value;
    public static final sprmjn cfr_renamed_4;

    public List<String> getFieldOrder() {
        String[] stringArray = new String[1];
        stringArray[0] = "value";
        return Arrays.asList(stringArray);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprmjn(int n, int n2, int n3, int n4) {
        void arg3;
        void arg2;
        void arg1;
        this.value = n << 24 | arg1 << 16 | arg2 << 8 | arg3;
    }

    /*
     * WARNING - void declaration
     */
    public sprmjn(char c, char c2, char c3, char c4) {
        void arg3;
        void arg2;
        void arg1;
        this.value = (byte)c << 24 | (byte)arg1 << 16 | (byte)arg2 << 8 | (byte)arg3;
    }

    static {
        cfr_renamed_4 = new sprmjn(127, 127, 127, 127);
        cfr_renamed_3 = new sprmjn(127, 127, 127, 127);
    }

    public static sprmjn cfr_renamed_12969(String arg0) {
        int n;
        if (arg0 != null && "".equals(arg0)) {
            return cfr_renamed_2;
        }
        char[] cArray = new char[4];
        int n2 = Math.min(4, arg0.length());
        int n3 = n = 0;
        while (n3 < n2) {
            int n4 = n++;
            cArray[n4] = arg0.charAt(n4);
            n3 = n;
        }
        int n5 = n;
        while (n5 < 4) {
            cArray[n++] = 32;
            n5 = n;
        }
        return new sprmjn(cArray[0], cArray[1], cArray[2], cArray[3]);
    }

    public sprmjn() {
    }

    private /* synthetic */ sprmjn(int n) {
        this.value = n;
    }

    public static sprmjn cfr_renamed_4704(int arg0) {
        return new sprmjn(arg0);
    }

    @Override
    public boolean equals(Object arg0) {
        if (arg0 instanceof sprmjn) {
            sprmjn sprmjn2 = (sprmjn)arg0;
            return this.value == sprmjn2.value;
        }
        return false;
    }

    public sprmjn(Pointer arg0) {
        sprmjn sprmjn2 = this;
        super(arg0);
        sprmjn2.read();
    }

    public static int cfr_renamed_12970(sprmjn arg0) {
        return arg0.value;
    }

    public boolean equals(sprmjn arg0) {
        return this.value == arg0.value;
    }
}

