/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprde;
import com.spire.presentation.packages.sprqbm;
import com.spire.presentation.packages.sprqcm;

public class sprnvg
implements sprde {
    public sprqbm[] cfr_renamed_4;

    public int hashCode() {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 != this.cfr_renamed_4.length) {
            sprqbm sprqbm2 = this.cfr_renamed_4[n];
            n2 ^= sprqbm2.hashCode();
            n3 = ++n;
        }
        return n2;
    }

    public static sprnvg cfr_renamed_7562(sprqbm[] arg0) {
        if (arg0 == null) {
            arg0 = new sprqbm[]{};
        }
        return new sprnvg(arg0);
    }

    public sprqbm[] cfr_renamed_7563() {
        return this.cfr_renamed_4;
    }

    public sprqbm cfr_renamed_7564(int arg0) {
        int n;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.length) {
            if (this.cfr_renamed_4[n].cfr_renamed_324() == arg0) {
                return this.cfr_renamed_4[n];
            }
            n2 = ++n;
        }
        return null;
    }

    public sprqcm cfr_renamed_7565() {
        sprqbm sprqbm2 = this.cfr_renamed_7564(1);
        if (sprqbm2 == null) {
            return null;
        }
        return (sprqcm)sprqbm2;
    }

    public sprnvg(sprqbm[] sprqbmArray) {
        this.cfr_renamed_4 = sprqbmArray;
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprnvg) {
            int n;
            sprnvg sprnvg2 = (sprnvg)arg0;
            if (sprnvg2.cfr_renamed_4.length != this.cfr_renamed_4.length) {
                return false;
            }
            int n2 = n = 0;
            while (n2 != this.cfr_renamed_4.length) {
                if (!sprnvg2.cfr_renamed_4[n].equals(this.cfr_renamed_4[n])) {
                    return false;
                }
                n2 = ++n;
            }
            return true;
        }
        return false;
    }
}

