/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprakn;
import com.spire.presentation.packages.sprbff;
import com.spire.presentation.packages.sprekn;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sproqr;
import com.spire.presentation.packages.sprpmn;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvfja;

@sprtea
public class sprdpn
extends sprpmn {
    private static sprvfja cfr_renamed_4 = sprvfja.cfr_renamed_13347(sproqr.cfr_renamed_9("\u0000\u0001H\u001a\u0016"));

    private /* synthetic */ boolean cfr_renamed_12420(int arg0) {
        return arg0 == 9 || arg0 == 10 || arg0 == 13 || arg0 >= 32 && arg0 <= 55295 || arg0 >= 57344 && arg0 <= 65533 || arg0 >= 65536 && arg0 <= 0x10FFFF;
    }

    @sprtea
    public sprdpn(sprakn arg0) {
        super(arg0);
    }

    @sprtea
    public String cfr_renamed_13348(float arg0, String arg1) {
        int n;
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_13349()) {
            if (sprraia.cfr_renamed_12280(arg1) || arg1.length() <= 0 || this.cfr_renamed_12420(arg1.charAt(n))) {
                float f;
                float f2;
                sprekn sprekn2 = this.cfr_renamed_13350(n);
                if (sprekn2 != null) {
                    if (sprekn2.cfr_renamed_13351() != 1) {
                        sprekn sprekn3 = sprekn2;
                        sprghha.cfr_renamed_12279(stringBuilder, "(" + sprekn3.cfr_renamed_13351());
                        if (sprekn3.cfr_renamed_13352() != 1) {
                            sprghha.cfr_renamed_12279(stringBuilder, new StringBuilder().insert(0, ":").append(sprekn2.cfr_renamed_13352()).toString());
                        }
                        sprghha.cfr_renamed_12279(stringBuilder, ")");
                    }
                    stringBuilder.append(sprekn2.cfr_renamed_13072());
                }
                sprdpn sprdpn2 = this;
                float f3 = sprdpn2.cfr_renamed_13353(n);
                float f4 = sprdpn2.cfr_renamed_13354(n);
                float f5 = sprdpn2.cfr_renamed_13355(n);
                if (f3 != -1.0f) {
                    f2 = f4;
                    sprghha.cfr_renamed_12279(stringBuilder, new StringBuilder().insert(0, ",").append(this.cfr_renamed_13356(f3, arg0)).toString());
                } else {
                    if (f4 != 0.0f || f5 != 0.0f) {
                        sprghha.cfr_renamed_12279(stringBuilder, ",");
                    }
                    f2 = f4;
                }
                if (f2 != 0.0f) {
                    f = f5;
                    sprghha.cfr_renamed_12279(stringBuilder, new StringBuilder().insert(0, ",").append(this.cfr_renamed_13356(f4, arg0)).toString());
                } else {
                    if (f5 != 0.0f) {
                        sprghha.cfr_renamed_12279(stringBuilder, ",");
                    }
                    f = f5;
                }
                if (f != 0.0f) {
                    sprghha.cfr_renamed_12279(stringBuilder, new StringBuilder().insert(0, ",").append(this.cfr_renamed_13356(f5, arg0)).toString());
                }
                sprghha.cfr_renamed_12279(stringBuilder, sprbff.cfr_renamed_9("\u0013"));
            }
            n2 = ++n;
        }
        char[] cArray = new char[1];
        cArray[0] = 59;
        return sprraia.cfr_renamed_13357(stringBuilder.toString(), cArray);
    }

    private /* synthetic */ String cfr_renamed_13356(float arg0, float arg1) {
        Object[] objectArray = new Object[1];
        objectArray[0] = sprrgga.cfr_renamed_13358(arg0 * 100.0f / arg1, 4);
        return sprraia.cfr_renamed_13359(cfr_renamed_4, sproqr.cfr_renamed_9("7"), objectArray);
    }
}

