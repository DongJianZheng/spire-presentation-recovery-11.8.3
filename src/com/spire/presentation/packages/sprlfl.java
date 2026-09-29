/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbhl;
import com.spire.presentation.packages.sprdgl;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprjpm;
import com.spire.presentation.packages.sprndl;
import com.spire.presentation.packages.sprrica;
import com.spire.presentation.packages.sprxq;
import java.util.Collections;
import java.util.Set;
import java.util.logging.Level;

public class sprlfl
extends sprdgl {
    private final int cfr_renamed_3;
    private final int cfr_renamed_4;

    public sprlfl(int arg0, Set<String> arg1) {
        this(arg0, 0, arg1);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void cfr_renamed_10580(sprxq arg0) {
        if (this.cfr_renamed_10586(arg0.cfr_renamed_9171())) {
            return;
        }
        spriil spriil2 = arg0.cfr_renamed_10343();
        switch (sprbhl.cfr_renamed_4[spriil2.ordinal()]) {
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                if (arg0.cfr_renamed_10429() < this.cfr_renamed_4) {
                    throw new sprndl(new StringBuilder().insert(0, sprjpm.cfr_renamed_9("j>k-p8|{}4|(95v/9+k4o2}>9")).append(this.cfr_renamed_4).append(sprrica.cfr_renamed_9("\u0002?K)Q}M;\u0002.G>W/K)[}M3N$\u0002")).append(arg0.cfr_renamed_10429()).toString());
                }
                if (spriil2 != spriil.cfr_renamed_0 && cfr_renamed_3.isLoggable(Level.FINE)) {
                    cfr_renamed_3.fine(new StringBuilder().insert(0, sprjpm.cfr_renamed_9("l(x<|{v=97|<x8`{z)`+m4~)x+q\"9(|)o2z>9=v)9:u<v)p/q69")).append(arg0.cfr_renamed_9171()).toString());
                }
                return;
            }
        }
        if (arg0.cfr_renamed_10429() < this.cfr_renamed_3) {
            throw new sprndl(new StringBuilder().insert(0, sprrica.cfr_renamed_9("Q8P+K>G}F2G.\u00023M)\u0002-P2T4F8\u0002")).append(this.cfr_renamed_3).append(sprjpm.cfr_renamed_9("99p/j{v=9(|8l)p/`{v5u\"9")).append(arg0.cfr_renamed_10429()).toString());
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprlfl(int n, int n2) {
        void arg0;
        sprlfl sprlfl2 = this;
        super(Collections.EMPTY_SET);
        sprlfl2.cfr_renamed_3 = arg0;
        sprlfl2.cfr_renamed_4 = n2;
    }

    /*
     * WARNING - void declaration
     */
    public sprlfl(int n, int n2, Set<String> set) {
        void arg0;
        void arg2;
        sprlfl sprlfl2 = this;
        super((Set<String>)arg2);
        sprlfl2.cfr_renamed_3 = arg0;
        sprlfl2.cfr_renamed_4 = n2;
    }

    public sprlfl(int arg0) {
        this(arg0, 0);
    }
}

