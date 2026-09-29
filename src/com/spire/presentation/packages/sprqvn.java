/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprewn;
import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprpyn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryjn;

@sprtea
public abstract class sprqvn {
    private sprgdo cfr_renamed_3;
    private sprfzo cfr_renamed_4;

    @sprtea
    public abstract void cfr_renamed_14874(int var1, int var2);

    public String cfr_renamed_14875(int arg0, int arg1) {
        StringBuilder stringBuilder = new StringBuilder();
        sprghha.cfr_renamed_12279(stringBuilder, "[");
        int n = arg0;
        int n2 = n;
        while (n2 <= arg1) {
            sprqvn sprqvn2 = this;
            stringBuilder.append(sprqvn2.cfr_renamed_14881(sprqvn2.cfr_renamed_14882(n)));
            sprghha.cfr_renamed_12279(stringBuilder, " ");
            n2 = ++n;
        }
        StringBuilder stringBuilder2 = stringBuilder;
        sprghha.cfr_renamed_12279(stringBuilder2, "]");
        return stringBuilder2.toString();
    }

    @sprtea
    public abstract void cfr_renamed_14876(int var1, int[] var2);

    @sprtea
    public abstract void cfr_renamed_14873(spryjn var1);

    public abstract boolean cfr_renamed_14877(int var1);

    @sprtea
    public abstract boolean cfr_renamed_14878();

    public sprfzo cfr_renamed_13261() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ int cfr_renamed_14881(int arg0) {
        return sprewn.cfr_renamed_14883(arg0, this.cfr_renamed_4.cfr_renamed_13317());
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 2 << 1;
        int n4 = n2;
        int n5 = 2 << 3 ^ 5;
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

    @sprtea
    public abstract void cfr_renamed_14858(spryjn var1);

    private /* synthetic */ int cfr_renamed_14882(int arg0) {
        if (!sprpyn.cfr_renamed_14841((byte)arg0)) {
            return 0;
        }
        int n = sprpyn.cfr_renamed_14850((byte)arg0);
        if (!this.cfr_renamed_14877(n)) {
            return 0;
        }
        return this.cfr_renamed_4.cfr_renamed_13027().cfr_renamed_13469(n).cfr_renamed_13470();
    }

    /*
     * WARNING - void declaration
     */
    public sprqvn(sprfzo sprfzo2, sprgdo sprgdo2) {
        void arg0;
        sprqvn sprqvn2 = this;
        sprqvn2.cfr_renamed_4 = arg0;
        sprqvn2.cfr_renamed_3 = sprgdo2;
    }
}

