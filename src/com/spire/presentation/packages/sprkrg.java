/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprchl;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmxg;
import com.spire.presentation.packages.sprnhm;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.spruzo;
import java.io.IOException;
import java.math.BigInteger;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class sprkrg {
    public static sprhfm cfr_renamed_7928(sprlem arg0) {
        sprhfm sprhfm2 = sprchl.cfr_renamed_7994(arg0);
        if (sprhfm2 == null) {
            return sprnhm.cfr_renamed_7994(arg0);
        }
        return sprhfm2;
    }

    public static spreuh cfr_renamed_7977(BigInteger arg0, sprgxh arg1) throws IOException {
        return arg1.cfr_renamed_2002(sprhdf.cfr_renamed_514(arg0));
    }

    public static SecretKey cfr_renamed_7995(int arg0, byte[] arg1) throws sprtqg {
        String string = sprmxg.cfr_renamed_7548(arg0);
        if (string == null) {
            throw new sprtqg(new StringBuilder().insert(0, spruzo.cfr_renamed_9("`\\~\\zE{\u0012fKx_pFg[v\u0012t^r]g[aZx\b5")).append(arg0).toString());
        }
        return new SecretKeySpec(arg1, string);
    }
}

