/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbyo;
import com.spire.presentation.packages.sprnmp;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwvn;
import java.util.Iterator;

@sprtea
public class sprato {
    private float cfr_renamed_91;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private sprwvn cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ 2;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 3;
        int n4 = n2;
        int n5 = 4 << 4;
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

    public sprbyo cfr_renamed_576(int arg0) {
        if (arg0 >= 0 && arg0 < this.cfr_renamed_2.size()) {
            return (sprbyo)this.cfr_renamed_2.get(arg0);
        }
        return null;
    }

    public int cfr_renamed_11861() {
        return this.cfr_renamed_2.size();
    }

    public sprato() {
        this(1.0f);
    }

    public void cfr_renamed_18317(int arg0, int arg1) {
        Iterator iterator;
        int n = sprnmp.cfr_renamed_13480((float)arg0 * this.cfr_renamed_91);
        int n2 = sprnmp.cfr_renamed_13480((float)arg1 * this.cfr_renamed_91);
        int n3 = n - this.cfr_renamed_4;
        int n4 = n2 - this.cfr_renamed_3;
        if (n3 == 0 && n4 == 0) {
            return;
        }
        Iterator iterator2 = iterator = this.cfr_renamed_2.iterator();
        while (iterator2.hasNext()) {
            ((sprbyo)iterator.next()).cfr_renamed_18318(n3, n4);
            iterator2 = iterator;
        }
    }

    public void cfr_renamed_18319(int arg0, int arg1, boolean arg2, boolean arg3, boolean arg4) {
        sprato sprato2;
        int n;
        int n2;
        if (!arg4) {
            n2 = sprnmp.cfr_renamed_13480((float)arg0 * this.cfr_renamed_91);
            n = sprnmp.cfr_renamed_13480((float)arg1 * this.cfr_renamed_91);
            sprato2 = this;
        } else {
            n2 = sprnmp.cfr_renamed_13480((float)arg0 * this.cfr_renamed_91) - this.cfr_renamed_0;
            n = sprnmp.cfr_renamed_13480((float)arg1 * this.cfr_renamed_91) - this.cfr_renamed_1;
            sprato2 = this;
        }
        sprato2.cfr_renamed_0 += n2;
        sprato sprato3 = this;
        sprato3.cfr_renamed_1 += n;
        sprato sprato4 = this;
        sprbyo sprbyo2 = new sprbyo(n2, n, sprato4.cfr_renamed_0, sprato4.cfr_renamed_1, arg2, arg3);
        if (sprato3.cfr_renamed_13639() != null && this.cfr_renamed_13639().cfr_renamed_13522() && sprbyo2.cfr_renamed_13522()) {
            return;
        }
        sprato sprato5 = this;
        sprato sprato6 = this;
        sprato5.cfr_renamed_4 = sprrgga.cfr_renamed_12461(sprato5.cfr_renamed_0, sprato6.cfr_renamed_4);
        sprato5.cfr_renamed_3 = sprrgga.cfr_renamed_12461(sprato6.cfr_renamed_1, this.cfr_renamed_3);
        sprovja.cfr_renamed_11658(sprato5.cfr_renamed_2, sprbyo2);
    }

    private /* synthetic */ sprbyo cfr_renamed_13639() {
        sprato sprato2 = this;
        return sprato2.cfr_renamed_576(sprato2.cfr_renamed_2.size() - 1);
    }

    public sprato(float f) {
        sprato sprato2 = this;
        this.cfr_renamed_4 = Integer.MAX_VALUE;
        sprato2.cfr_renamed_3 = Integer.MAX_VALUE;
        sprato sprato3 = this;
        sprato2.cfr_renamed_2 = new sprwvn();
        sprato2.cfr_renamed_91 = f;
    }
}

