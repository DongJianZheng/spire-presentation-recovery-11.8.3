/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprxhf;

public class sprzwe
extends sprxhf {
    private final String cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprzwe(int n, int n2, int n3, String string) {
        super((int)arg0, (int)arg1, (int)arg2);
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_4 = string;
    }

    public sprzwe(int arg0) {
        this(arg0, "SHA-256");
    }

    public sprzwe(String arg0) {
        this(11, 50, arg0);
    }

    public sprzwe(int arg0, int arg1, int arg2) {
        this(arg0, arg1, arg2, "SHA-256");
    }

    public sprzwe() {
        this(11, 50, "SHA-256");
    }

    /*
     * WARNING - void declaration
     */
    public sprzwe(int n, String string) {
        super((int)arg0);
        void arg0;
        this.cfr_renamed_4 = string;
    }

    public sprzwe(int arg0, int arg1) {
        this(arg0, arg1, "SHA-256");
    }

    /*
     * WARNING - void declaration
     */
    public sprzwe(int n, int n2, String string) {
        super((int)arg0, (int)arg1);
        void arg1;
        void arg0;
        this.cfr_renamed_4 = string;
    }

    public String cfr_renamed_580() {
        return this.cfr_renamed_4;
    }
}

