/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprffp;
import com.spire.presentation.packages.sprtbp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruuc;

@sprtea
public class sprnoo {
    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static void cfr_renamed_16687(sprtbp arg0, int arg1, boolean arg2) {
        switch (arg1) {
            case 0: 
            case 16: 
            case 240: {
                sprnoo.cfr_renamed_16779(arg0, arg1, 0, 1, arg2);
                return;
            }
            case 17: {
                sprnoo.cfr_renamed_16779(arg0, 0, 3, 1, arg2);
                return;
            }
            case 1: 
            case 2: {
                sprnoo.cfr_renamed_16779(arg0, arg1, 0, 1, arg2);
                return;
            }
            case 3: {
                sprnoo.cfr_renamed_16779(arg0, 2, 0, 1, arg2);
                return;
            }
            case 19: {
                sprnoo.cfr_renamed_16779(arg0, 0, 3, 1, arg2);
                return;
            }
            case 18: {
                sprnoo.cfr_renamed_16779(arg0, 0, 4, 1, arg2);
                return;
            }
            case 20: {
                sprnoo.cfr_renamed_16779(arg0, 0, 1, 1, arg2);
                return;
            }
            case 255: {
                sprnoo.cfr_renamed_16779(arg0, 0, 6, 1, arg2);
                return;
            }
        }
        throw new IllegalArgumentException(spruuc.cfr_renamed_9("9\u0010\u001b\u0010\u0004\u0014\u001d\u0014\u001bQ\u0007\u0010\u0004\u0014SQ\u0005\u0018\u0007\u0014*\u0010\u0019"));
    }

    private static /* synthetic */ void cfr_renamed_16779(sprtbp arg0, int arg1, int arg2, int arg3, boolean arg4) {
        sprffp sprffp2;
        sprffp sprffp3 = arg0.cfr_renamed_16686();
        if (arg4) {
            sprffp sprffp4 = sprffp3;
            sprffp2 = sprffp4;
            arg0.cfr_renamed_12581(arg1);
            sprffp4.cfr_renamed_13942().cfr_renamed_5986(arg2);
        } else {
            arg0.cfr_renamed_12579(arg1);
            sprffp sprffp5 = sprffp3;
            sprffp2 = sprffp5;
            sprffp5.cfr_renamed_13943().cfr_renamed_5986(arg2);
        }
        sprffp2.cfr_renamed_16780(arg3);
    }
}

