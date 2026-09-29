/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqik;
import java.io.IOException;

public class sprbmk {
    private final int cfr_renamed_91;
    private final int cfr_renamed_0;
    private final int cfr_renamed_1;
    private final long cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    private final long cfr_renamed_4;

    public long cfr_renamed_9650() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprbmk(long l, long l2, int n, int n2, int n3, byte[] byArray) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprbmk sprbmk2 = this;
        sprbmk sprbmk3 = this;
        sprbmk sprbmk4 = this;
        sprbmk4.cfr_renamed_2 = arg0;
        sprbmk4.cfr_renamed_4 = arg1;
        sprbmk3.cfr_renamed_91 = arg2;
        sprbmk3.cfr_renamed_1 = arg3;
        sprbmk2.cfr_renamed_0 = arg4;
        sprbmk2.cfr_renamed_3 = byArray;
    }

    public long cfr_renamed_9651() {
        return this.cfr_renamed_4;
    }

    public long cfr_renamed_9652() {
        return this.cfr_renamed_91;
    }

    public byte[] cfr_renamed_9653() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    public int cfr_renamed_4821() {
        return this.cfr_renamed_1;
    }

    public static sprbmk cfr_renamed_6501(Object arg0, int arg1) throws IOException {
        if (arg0 instanceof sprbmk) {
            return (sprbmk)arg0;
        }
        sprqik sprqik2 = sprqik.cfr_renamed_9654(arg0);
        long l = sprqik2.cfr_renamed_9655();
        long l2 = sprqik2.cfr_renamed_9655();
        int n = sprqik2.cfr_renamed_9656();
        int n2 = sprqik2.cfr_renamed_9657();
        int n3 = sprqik2.cfr_renamed_9657();
        byte[] byArray = sprqik2.cfr_renamed_9658((int)((long)arg1 + l), (int)((long)arg1 + l + l2));
        return new sprbmk(l, l2, n, n2, n3, byArray);
    }

    public int cfr_renamed_9659() {
        return this.cfr_renamed_0;
    }

    public String cfr_renamed_9660() {
        return sprkoe.cfr_renamed_427(this.cfr_renamed_3);
    }
}

