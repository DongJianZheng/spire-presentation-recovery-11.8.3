/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkmn;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprtea;

@sprtea
public abstract class sprvjn
implements Cloneable {
    private sprkmn cfr_renamed_4;

    public abstract void cfr_renamed_13121(sprsmn var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object cfr_renamed_12100() {
        try {
            return this.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalStateException(cloneNotSupportedException);
        }
    }

    @sprtea
    public sprvjn cfr_renamed_13689() {
        if (this.cfr_renamed_8155() != null) {
            return this.cfr_renamed_8155().cfr_renamed_13690(this);
        }
        return null;
    }

    public sprkmn cfr_renamed_8155() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public sprvjn cfr_renamed_12304() {
        if (this.cfr_renamed_8155() != null) {
            return this.cfr_renamed_8155().cfr_renamed_13691(this);
        }
        return null;
    }

    public void cfr_renamed_13692(sprkmn arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = 4 << 3;
        int n4 = n2;
        int n5 = 5 << 4 ^ 5;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public sprvjn cfr_renamed_13616() {
        return (sprvjn)this.cfr_renamed_12100();
    }
}

