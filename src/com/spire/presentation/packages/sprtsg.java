/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprczg;
import com.spire.presentation.packages.sprdah;
import com.spire.presentation.packages.sprirk;
import com.spire.presentation.packages.sprkro;
import com.spire.presentation.packages.sprmjm;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprrxg;
import com.spire.presentation.packages.sprsm;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprzvg;
import java.security.SecureRandom;

public class sprtsg
extends sprdah {
    public sprtsg(char[] arg0, sprsm arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_7915(int arg0, byte[] arg1, byte[] arg2) throws sprtqg {
        try {
            int n;
            sprmr sprmr2;
            sprmr sprmr3 = sprmr2 = sprczg.cfr_renamed_8002(arg0);
            sprirk sprirk2 = sprrxg.cfr_renamed_7999(true, sprmr3, arg1, new byte[sprmr3.cfr_renamed_1195()]);
            byte[] byArray = new byte[arg2.length];
            int n2 = n = sprirk2.cfr_renamed_505(arg2, 0, arg2.length, byArray, 0);
            n = n2 + sprirk2.cfr_renamed_1219(byArray, n2);
            return byArray;
        }
        catch (sprull sprull2) {
            throw new sprtqg(new StringBuilder().insert(0, sprkro.cfr_renamed_9("FN@RZPWILN\u0003FBIOEG\u001a\u0003")).append(sprull2.getMessage()).toString(), sprull2);
        }
    }

    public sprtsg(char[] arg0, sprmjm arg1) {
        super(arg0, arg1);
    }

    public sprtsg(char[] arg0, int arg1) {
        char[] cArray = arg0;
        super(arg0, new sprzvg(), arg1);
    }

    public sprtsg(char[] arg0, sprsm arg1) {
        super(arg0, arg1);
    }

    public sprtsg(char[] arg0) {
        char[] cArray = arg0;
        this(arg0, new sprzvg());
    }

    @Override
    public sprdah cfr_renamed_1555(SecureRandom arg0) {
        sprtsg sprtsg2 = this;
        super.cfr_renamed_1555(arg0);
        return sprtsg2;
    }
}

