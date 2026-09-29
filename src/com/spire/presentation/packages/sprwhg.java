/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprej;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprhk;
import com.spire.presentation.packages.sprifg;
import com.spire.presentation.packages.sprljg;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprvm;
import com.spire.presentation.packages.sprwlg;
import com.spire.presentation.packages.sprwpg;
import com.spire.presentation.packages.spryye;
import java.io.IOException;

public abstract class sprwhg {
    public sprej cfr_renamed_4 = sprifg.cfr_renamed_3;

    public abstract sprvm cfr_renamed_7483(sprddm var1) throws sprhjg;

    public sprhk cfr_renamed_7464(sprtpl arg0) throws sprhjg {
        return new sprwlg(this, arg0);
    }

    private /* synthetic */ sprljg cfr_renamed_7487(sprddm arg0, spryye arg1) throws sprhjg {
        sprvm sprvm2 = this.cfr_renamed_7483(arg0);
        sprvm2.cfr_renamed_5535(false, arg1);
        return new sprljg(sprvm2);
    }

    public abstract spryye cfr_renamed_7482(sprvhm var1) throws IOException;

    public static /* synthetic */ sprljg cfr_renamed_7488(sprwhg arg0, sprddm arg1, spryye arg2) throws sprhjg {
        return arg0.cfr_renamed_7487(arg1, arg2);
    }

    public sprhk cfr_renamed_7489(spryye arg0) throws sprhjg {
        return new sprwpg(this, arg0);
    }
}

