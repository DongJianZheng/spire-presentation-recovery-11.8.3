/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjeka;
import com.spire.presentation.packages.sprru;
import com.spire.presentation.packages.sprtea;
import java.util.Iterator;

@sprtea
public class sprhym
implements Iterable {
    private sprjeka cfr_renamed_4;

    public int cfr_renamed_11861() {
        return this.cfr_renamed_4.size();
    }

    public sprhym() {
        sprhym sprhym2 = this;
        sprhym2.cfr_renamed_4 = new sprjeka();
    }

    public void cfr_renamed_722() {
        this.cfr_renamed_4.cfr_renamed_722();
    }

    public sprru cfr_renamed_12398() {
        if (this.cfr_renamed_4.size() == 0) {
            return null;
        }
        return (sprru)this.cfr_renamed_4.cfr_renamed_12398();
    }

    public sprru cfr_renamed_12514() {
        if (this.cfr_renamed_4.size() == 0) {
            return null;
        }
        return (sprru)this.cfr_renamed_4.cfr_renamed_12514();
    }

    public void cfr_renamed_12659(sprru arg0) {
        this.cfr_renamed_4.cfr_renamed_12516(arg0);
    }

    public Iterator iterator() {
        return this.cfr_renamed_4.iterator();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ 4 << 1;
        int cfr_ignored_0 = (3 ^ 5) << 3;
        int n4 = n2;
        int n5 = 5 << 4 ^ (2 << 2 ^ 1);
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
}

