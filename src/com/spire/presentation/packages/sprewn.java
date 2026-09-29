/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbln;
import com.spire.presentation.packages.sprcop;
import com.spire.presentation.packages.sprcq;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprixl;
import com.spire.presentation.packages.sprmvn;
import com.spire.presentation.packages.sprogb;
import com.spire.presentation.packages.sprqvn;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryjn;
import com.spire.presentation.packages.spryxp;
import java.util.Iterator;

@sprtea
public abstract class sprewn
extends sprbln
implements sprcq {
    private String cfr_renamed_91;
    private sprqvn cfr_renamed_0;
    private String cfr_renamed_1;
    private sprmvn cfr_renamed_2;
    private boolean cfr_renamed_3;
    private boolean cfr_renamed_4;

    public void cfr_renamed_14387(int arg0, int[] arg1) {
        this.cfr_renamed_0.cfr_renamed_14876(arg0, arg1);
    }

    public sprewn(sprgdo arg0, boolean arg1, boolean arg2, sprmvn arg3, sprqvn arg4) {
        sprewn sprewn2 = this;
        super(arg0);
        sprewn2.cfr_renamed_4 = arg1;
        sprewn2.cfr_renamed_3 = arg2;
        this.cfr_renamed_2 = arg3;
        this.cfr_renamed_0 = arg4;
        this.cfr_renamed_1 = this.cfr_renamed_14884();
        this.cfr_renamed_91 = this.cfr_renamed_14885();
    }

    public float cfr_renamed_14871() {
        return this.cfr_renamed_14371().cfr_renamed_13261().cfr_renamed_14871();
    }

    public sprmvn cfr_renamed_4572() {
        return this.cfr_renamed_2;
    }

    public boolean cfr_renamed_13242() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ String cfr_renamed_14885() {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2;
        StringBuilder stringBuilder3 = new StringBuilder();
        if (!this.cfr_renamed_2820().cfr_renamed_13097().cfr_renamed_14515() && this.cfr_renamed_14371().cfr_renamed_14878()) {
            StringBuilder stringBuilder4 = stringBuilder3;
            sprghha.cfr_renamed_12279(stringBuilder3, this.cfr_renamed_1);
            stringBuilder2 = stringBuilder4;
            sprghha.cfr_renamed_12279(stringBuilder4, "+");
        } else {
            StringBuilder stringBuilder5 = stringBuilder3;
            stringBuilder2 = stringBuilder5;
            stringBuilder5.append('/');
        }
        sprghha.cfr_renamed_12279(stringBuilder2, this.cfr_renamed_14886());
        if (this.cfr_renamed_13242() && this.cfr_renamed_13243()) {
            StringBuilder stringBuilder6 = stringBuilder3;
            stringBuilder = stringBuilder6;
            sprghha.cfr_renamed_12279(stringBuilder6, sprogb.cfr_renamed_9("9\u0013z=q\u0018a0y8v"));
        } else if (this.cfr_renamed_13242()) {
            StringBuilder stringBuilder7 = stringBuilder3;
            stringBuilder = stringBuilder7;
            sprghha.cfr_renamed_12279(stringBuilder7, sprixl.cfr_renamed_9("cy W+"));
        } else {
            if (this.cfr_renamed_13243()) {
                sprghha.cfr_renamed_12279(stringBuilder3, sprogb.cfr_renamed_9("9\u0018a0y8v"));
            }
            stringBuilder = stringBuilder3;
        }
        return sprghha.cfr_renamed_13177(stringBuilder, " ", sprixl.cfr_renamed_9("l\t\u007f")).toString();
    }

    public sprgeja cfr_renamed_14872() {
        sprewn sprewn2 = this;
        sprewn sprewn3 = this;
        sprewn sprewn4 = this;
        sprewn sprewn5 = this;
        return new sprgeja(sprewn2.cfr_renamed_14370(sprewn2.cfr_renamed_14371().cfr_renamed_13261().cfr_renamed_14887()), sprewn3.cfr_renamed_14370(sprewn3.cfr_renamed_14371().cfr_renamed_13261().cfr_renamed_14888()), sprewn4.cfr_renamed_14370(this.cfr_renamed_14371().cfr_renamed_13261().cfr_renamed_13487() - sprewn4.cfr_renamed_14371().cfr_renamed_13261().cfr_renamed_14887()), sprewn5.cfr_renamed_14370(this.cfr_renamed_14371().cfr_renamed_13261().cfr_renamed_14889() - sprewn5.cfr_renamed_14371().cfr_renamed_13261().cfr_renamed_14888()));
    }

    public void cfr_renamed_14824(String arg0) {
        Iterator iterator;
        Iterator iterator2 = iterator = new sprcop(arg0).iterator();
        while (iterator2.hasNext()) {
            int n = (Integer)iterator.next();
            iterator2 = iterator;
            sprewn sprewn2 = this;
            int n2 = sprewn2.cfr_renamed_0.cfr_renamed_13261().cfr_renamed_13027().cfr_renamed_13469(n).cfr_renamed_13076();
            sprewn2.cfr_renamed_0.cfr_renamed_14874(n2, n);
        }
    }

    @sprtea
    public sprqvn cfr_renamed_14371() {
        return this.cfr_renamed_0;
    }

    public int cfr_renamed_13488() {
        sprewn sprewn2 = this;
        return sprewn2.cfr_renamed_14370(sprewn2.cfr_renamed_14371().cfr_renamed_13261().cfr_renamed_13488());
    }

    public void cfr_renamed_14829(String arg0, spryjn arg1) {
        Iterator iterator;
        this.cfr_renamed_2.cfr_renamed_14352(arg1);
        Iterator iterator2 = iterator = new sprcop(arg0).iterator();
        while (iterator2.hasNext()) {
            int n = (Integer)iterator.next();
            iterator2 = iterator;
            sprewn sprewn2 = this;
            sprewn2.cfr_renamed_14368(sprewn2.cfr_renamed_0.cfr_renamed_13261().cfr_renamed_13027().cfr_renamed_13469(n).cfr_renamed_13076(), n, arg1);
        }
        this.cfr_renamed_2.cfr_renamed_14365(arg1);
    }

    @sprtea
    public static int cfr_renamed_14883(int arg0, int arg1) {
        return spryxp.cfr_renamed_13526((double)arg0 * 1000.0 / (double)arg1);
    }

    @Override
    public String cfr_renamed_14599() {
        return this.cfr_renamed_1;
    }

    public int cfr_renamed_4690() {
        int n = 0;
        n = 0 | 0x20;
        n |= (this.cfr_renamed_14371().cfr_renamed_13261().cfr_renamed_13303() & 2) != 0 ? 64 : 0;
        return n |= (this.cfr_renamed_14371().cfr_renamed_13261().cfr_renamed_13303() & 1) != 0 ? 262144 : 0;
    }

    public void cfr_renamed_14368(int arg0, int arg1, spryjn arg2) {
        sprewn sprewn2 = this;
        sprewn2.cfr_renamed_0.cfr_renamed_14874(arg0, arg1);
        sprewn2.cfr_renamed_2.cfr_renamed_14838(arg0, arg1, arg2);
    }

    public boolean cfr_renamed_13243() {
        return this.cfr_renamed_3;
    }

    public String cfr_renamed_14857() {
        return this.cfr_renamed_91;
    }

    private /* synthetic */ String cfr_renamed_14886() {
        String string = this.cfr_renamed_14371().cfr_renamed_13261().cfr_renamed_14129();
        if (string == null) {
            string = this.cfr_renamed_14371().cfr_renamed_13261().cfr_renamed_13492();
        }
        return string;
    }

    public int cfr_renamed_13490() {
        int n = this.cfr_renamed_2820().cfr_renamed_13097().cfr_renamed_14529() ? this.cfr_renamed_14371().cfr_renamed_13261().cfr_renamed_14889() : this.cfr_renamed_14371().cfr_renamed_13261().cfr_renamed_13490();
        return this.cfr_renamed_14370(n);
    }

    @sprtea
    public int cfr_renamed_14370(int arg0) {
        return sprewn.cfr_renamed_14883(arg0, this.cfr_renamed_14371().cfr_renamed_13261().cfr_renamed_13317());
    }

    public int cfr_renamed_13491() {
        int n = this.cfr_renamed_2820().cfr_renamed_13097().cfr_renamed_14529() ? sprrgga.cfr_renamed_6433(this.cfr_renamed_14371().cfr_renamed_13261().cfr_renamed_14888()) : this.cfr_renamed_14371().cfr_renamed_13261().cfr_renamed_13491();
        return -this.cfr_renamed_14370(n);
    }

    private /* synthetic */ String cfr_renamed_14884() {
        int n;
        StringBuilder stringBuilder = new StringBuilder();
        sprghha.cfr_renamed_12279(stringBuilder, sprogb.cfr_renamed_9("S"));
        Object[] objectArray = new Object[1];
        objectArray[0] = this.cfr_renamed_19();
        String string = sprraia.cfr_renamed_11562(sprixl.cfr_renamed_9("@\u007f\u0001\u000b\u000e2"), objectArray);
        int n2 = 17;
        int n3 = n = 0;
        while (n3 < string.length()) {
            char c = string.charAt(n);
            stringBuilder.append((char)(c + n2));
            n3 = ++n;
        }
        return stringBuilder.toString();
    }
}

