/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraxg;
import com.spire.presentation.packages.sprbg;
import com.spire.presentation.packages.sprcvg;
import com.spire.presentation.packages.sprczg;
import com.spire.presentation.packages.sprgbo;
import com.spire.presentation.packages.sprirk;
import com.spire.presentation.packages.sprivk;
import com.spire.presentation.packages.sprjem;
import com.spire.presentation.packages.sprjzk;
import com.spire.presentation.packages.sprlxg;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sproam;
import com.spire.presentation.packages.sprohl;
import com.spire.presentation.packages.sprojm;
import com.spire.presentation.packages.sprrxg;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprtxk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprvoy;
import com.spire.presentation.packages.sprxug;
import com.spire.presentation.packages.sprycm;
import com.spire.presentation.packages.sprzu;

public class spratg
extends sprxug {
    @Override
    public sprbg cfr_renamed_7568(boolean arg0, int arg1, byte[] arg2) throws sprtqg {
        sprmr sprmr2 = sprczg.cfr_renamed_8002(arg1);
        return sprrxg.cfr_renamed_8001(arg0, sprmr2, arg2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_7824(sprjem arg0, byte[] arg1) throws sprtqg {
        sprjzk sprjzk2;
        if (arg0.cfr_renamed_3() < 5) {
            throw new sprtqg(sprgbo.cfr_renamed_9("jO|Wr$IeZo\\p\u0019IlWm$[a\u0019r\\vJmVj\u00191\u0019kK$UeMaK*"));
        }
        sprjem sprjem2 = arg0;
        byte[] byArray = sprjem2.cfr_renamed_7954();
        byte[] byArray2 = new byte[sprycm.cfr_renamed_7909(sprjem2.cfr_renamed_7757())];
        sprjzk sprjzk3 = sprjzk2 = new sprjzk(new sprohl());
        sprjzk sprjzk4 = sprjzk2;
        sprjzk3.cfr_renamed_5671(new sprivk(arg1, null, byArray));
        sprjzk3.cfr_renamed_2341(byArray2, 0, byArray2.length);
        sprtpk sprtpk2 = new sprtpk(byArray2);
        sprjem sprjem3 = arg0;
        sprjem sprjem4 = arg0;
        sprzu sprzu2 = sprlxg.cfr_renamed_7911(sprjem3.cfr_renamed_7757(), sprjem4.cfr_renamed_7855());
        int n = 128;
        byte[] byArray3 = sprjem3.cfr_renamed_8027();
        byte[] byArray4 = sprjem4.cfr_renamed_8028();
        byte[] byArray5 = sprjem3.cfr_renamed_7821();
        sprtxk sprtxk2 = new sprtxk(sprtpk2, n, byArray4, arg0.cfr_renamed_7954());
        sprzu2.cfr_renamed_5535(false, sprtxk2);
        byte[] byArray6 = new byte[sprzu2.cfr_renamed_1202(byArray5.length + byArray3.length)];
        int n2 = sprzu2.cfr_renamed_505(byArray5, 0, byArray5.length, byArray6, 0);
        n2 += sprzu2.cfr_renamed_505(byArray3, 0, byArray3.length, byArray6, n2);
        try {
            sprzu2.cfr_renamed_1219(byArray6, n2);
            return byArray6;
        }
        catch (sprull sprull2) {
            throw new sprtqg(sprvoy.cfr_renamed_9("\u0018\">?-.453z/?>5+?/33=})8).324}33<2"), sprull2);
        }
    }

    @Override
    public sprbg cfr_renamed_7567(sprojm arg0, spraxg arg1) throws sprtqg {
        return sprlxg.cfr_renamed_7953(arg0, arg1);
    }

    @Override
    public sprbg cfr_renamed_7570(sproam arg0, spraxg arg1) throws sprtqg {
        return sprlxg.cfr_renamed_7956(arg0, arg1);
    }

    public spratg(char[] arg0, sprcvg arg1) {
        super(arg0, arg1);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_7820(int arg0, byte[] arg1, byte[] arg2) throws sprtqg {
        try {
            if (arg2 != null && arg2.length > 0) {
                int n;
                sprmr sprmr2;
                sprmr sprmr3 = sprmr2 = sprczg.cfr_renamed_8002(arg0);
                sprirk sprirk2 = sprrxg.cfr_renamed_7999(false, sprmr3, arg1, new byte[sprmr3.cfr_renamed_1195()]);
                byte[] byArray = new byte[arg2.length];
                int n2 = n = sprirk2.cfr_renamed_505(arg2, 0, arg2.length, byArray, 0);
                n = n2 + sprirk2.cfr_renamed_1219(byArray, n2);
                return byArray;
            }
        }
        catch (Exception exception) {
            throw new sprtqg(sprgbo.cfr_renamed_9("AAg\\tMmVj\u0019v\\gVr\\vPj^$JaJwPkW$Pj_k"), exception);
        }
        {
            byte[] byArray = new byte[arg1.length + 1];
            byArray[0] = (byte)arg0;
            System.arraycopy(arg1, 0, byArray, 1, arg1.length);
            return byArray;
        }
    }
}

