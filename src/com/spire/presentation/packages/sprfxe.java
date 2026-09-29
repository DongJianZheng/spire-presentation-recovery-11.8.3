/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spradf;
import com.spire.presentation.packages.spraye;
import com.spire.presentation.packages.spricf;
import com.spire.presentation.packages.sprnhf;
import com.spire.presentation.packages.sprtef;
import com.spire.presentation.packages.sprvef;
import com.spire.presentation.packages.sprwff;
import com.spire.presentation.packages.sprwxe;

public final class sprfxe {
    public static spradf[] cfr_renamed_5627(sprwxe arg0, spradf arg1) {
        sprwxe sprwxe2 = arg0;
        int n = sprwxe2.cfr_renamed_1150();
        sprwff sprwff2 = sprwxe2.cfr_renamed_1155();
        sprnhf sprnhf2 = sprwxe2.cfr_renamed_845();
        spricf spricf2 = sprwxe2.cfr_renamed_1147();
        spraye spraye2 = sprwxe2.cfr_renamed_1153();
        spricf[] spricfArray = sprwxe2.cfr_renamed_1148();
        sprwff sprwff3 = sprwff2.cfr_renamed_875();
        spradf spradf2 = (spradf)arg1.cfr_renamed_5467(sprwff3);
        spradf spradf3 = sprtef.cfr_renamed_5489((spradf)spraye2.cfr_renamed_5484(spradf2), sprnhf2, spricf2, spricfArray);
        spradf spradf4 = (spradf)spradf2.cfr_renamed_5468(spradf3);
        spradf4 = (spradf)spradf4.cfr_renamed_5467(sprwff2);
        spradf3 = (spradf)spradf3.cfr_renamed_5467(sprwff2);
        spradf spradf5 = spradf4.cfr_renamed_962(n);
        spradf[] spradfArray = new spradf[2];
        spradfArray[0] = spradf5;
        spradfArray[1] = spradf3;
        return spradfArray;
    }

    public static spradf cfr_renamed_5624(sprvef arg0, spradf arg1, spradf arg2) {
        return (spradf)arg0.cfr_renamed_1145().cfr_renamed_5532(arg1).cfr_renamed_5468(arg2);
    }

    private /* synthetic */ sprfxe() {
    }
}

