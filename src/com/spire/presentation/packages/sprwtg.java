/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcrg;
import com.spire.presentation.packages.sprdm;
import com.spire.presentation.packages.sprmah;
import com.spire.presentation.packages.sprrwg;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprvbh;
import com.spire.presentation.packages.spryye;
import java.util.Date;

public class sprwtg
extends sprcrg {
    public sprwtg(int arg0, sprdm arg1, sprsil arg2, Date arg3) throws sprtqg {
        sprwtg sprwtg2 = this;
        sprwtg sprwtg3 = this;
        sprwtg2.cfr_renamed_3 = sprwtg.cfr_renamed_8008(arg0, arg1, arg2.cfr_renamed_1224(), arg3);
        sprwtg2.cfr_renamed_4 = sprwtg.cfr_renamed_8009(sprwtg3.cfr_renamed_3, arg2.cfr_renamed_1225());
    }

    private static /* synthetic */ sprmah cfr_renamed_8009(sprvbh arg0, spryye arg1) throws sprtqg {
        return new sprrwg().cfr_renamed_8010(arg0, arg1);
    }

    public sprwtg(int arg0, sprsil arg1, Date arg2) throws sprtqg {
        sprwtg sprwtg2 = this;
        sprwtg sprwtg3 = this;
        sprwtg2.cfr_renamed_3 = sprwtg.cfr_renamed_8008(arg0, null, arg1.cfr_renamed_1224(), arg2);
        sprwtg2.cfr_renamed_4 = sprwtg.cfr_renamed_8009(sprwtg3.cfr_renamed_3, arg1.cfr_renamed_1225());
    }

    private static /* synthetic */ sprvbh cfr_renamed_8008(int arg0, sprdm arg1, spryye arg2, Date arg3) throws sprtqg {
        return new sprrwg().cfr_renamed_8011(arg0, arg1, arg2, arg3);
    }
}

