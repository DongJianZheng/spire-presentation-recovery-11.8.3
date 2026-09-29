/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprepaa;
import com.spire.presentation.packages.sprmvo;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprpvm;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvwm;

@sprtea
public class sprxen {
    private /* synthetic */ sprxen() {
    }

    private static /* synthetic */ spreen cfr_renamed_12180(int arg0, spreen arg1, int arg2) {
        switch (arg0) {
            case 8: {
                return new sprvwm(arg1, arg2, true);
            }
            case 0: {
                return new sprpvm(arg1, arg2, true);
            }
        }
        throw new IllegalStateException(sprepaa.cfr_renamed_9("u\u0017K\u0017O\u000eNYC\u0016M\tR\u001cS\nI\u0016NYM\u001cT\u0011O\u001d\u0000\nP\u001cC\u0010F\u0010E\u001d\u000e"));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_12181(byte[] arg0, int arg1, int arg2) {
        sprpdja sprpdja2 = new sprpdja(arg0);
        try {
            byte[] byArray = sprxen.cfr_renamed_12182(sprpdja2, arg1, arg2);
            return byArray;
        }
        finally {
            if (sprpdja2 != null) {
                sprpdja2.cfr_renamed_2637();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int cfr_renamed_12183(byte[] arg0, int arg1, int arg2, spreen arg3, int arg4) {
        spreen spreen2;
        int n = (int)arg3.cfr_renamed_3274();
        spreen spreen3 = sprxen.cfr_renamed_12180(arg4, arg3, 0);
        try {
            spreen3.cfr_renamed_4924(arg0, arg1, arg2);
            if (spreen3 != null) {
                spreen2 = arg3;
                spreen3.cfr_renamed_2637();
                return (int)spreen2.cfr_renamed_3274() - n;
            }
        }
        catch (Throwable throwable) {
            if (spreen3 == null) throw throwable;
            spreen3.cfr_renamed_2637();
            throw throwable;
        }
        spreen2 = arg3;
        return (int)spreen2.cfr_renamed_3274() - n;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_12184(spreen arg0, int arg1) {
        sprpdja sprpdja2 = new sprpdja();
        try {
            sprxen.cfr_renamed_12185(arg0, sprpdja2, arg1);
            byte[] byArray = sprpdja2.cfr_renamed_4529();
            return byArray;
        }
        finally {
            if (sprpdja2 != null) {
                sprpdja2.cfr_renamed_2637();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_12182(spreen arg0, int arg1, int arg2) {
        sprpdja sprpdja2;
        if (arg1 == 0) {
            arg1 = (int)arg0.cfr_renamed_806();
        }
        sprpdja sprpdja3 = new sprpdja(arg1);
        spreen spreen2 = sprxen.cfr_renamed_12180(arg2, arg0, 1);
        try {
            sprmvo.cfr_renamed_12186(spreen2, sprpdja3);
            if (spreen2 != null) {
                sprpdja2 = sprpdja3;
                spreen2.cfr_renamed_2637();
                return sprpdja2.cfr_renamed_4529();
            }
        }
        catch (Throwable throwable) {
            if (spreen2 == null) throw throwable;
            spreen2.cfr_renamed_2637();
            throw throwable;
        }
        sprpdja2 = sprpdja3;
        return sprpdja2.cfr_renamed_4529();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int cfr_renamed_12185(spreen arg0, sprpdja arg1, int arg2) {
        sprpdja sprpdja2;
        int n = (int)arg1.cfr_renamed_3274();
        spreen spreen2 = sprxen.cfr_renamed_12180(arg2, arg1, 0);
        try {
            sprmvo.cfr_renamed_12186(arg0, spreen2);
            if (spreen2 != null) {
                sprpdja2 = arg1;
                spreen2.cfr_renamed_2637();
                return (int)sprpdja2.cfr_renamed_3274() - n;
            }
        }
        catch (Throwable throwable) {
            if (spreen2 == null) throw throwable;
            spreen2.cfr_renamed_2637();
            throw throwable;
        }
        sprpdja2 = arg1;
        return (int)sprpdja2.cfr_renamed_3274() - n;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_12187(byte[] arg0, int arg1) {
        sprpdja sprpdja2 = new sprpdja(arg0);
        try {
            byte[] byArray = sprxen.cfr_renamed_12184(sprpdja2, arg1);
            return byArray;
        }
        finally {
            if (sprpdja2 != null) {
                sprpdja2.cfr_renamed_2637();
            }
        }
    }
}

