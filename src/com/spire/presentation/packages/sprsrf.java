/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spradf;
import com.spire.presentation.packages.spraye;
import com.spire.presentation.packages.spricf;
import com.spire.presentation.packages.sprnhf;
import com.spire.presentation.packages.sproof;
import com.spire.presentation.packages.sprsjf;
import com.spire.presentation.packages.sprtef;
import com.spire.presentation.packages.sprvef;
import com.spire.presentation.packages.sprwff;
import com.spire.presentation.packages.sprwxe;

public final class sprsrf {
    public static spradf[] cfr_renamed_5706(sprsjf arg0, spradf arg1) {
        sprsjf sprsjf2 = arg0;
        int n = sprsjf2.cfr_renamed_1150();
        sprwff sprwff2 = sprsjf2.cfr_renamed_1155();
        sprnhf sprnhf2 = sprsjf2.cfr_renamed_845();
        spricf spricf2 = sprsjf2.cfr_renamed_1147();
        spraye spraye2 = sprsjf2.cfr_renamed_1153();
        spricf[] spricfArray = sprsjf2.cfr_renamed_1148();
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

    private /* synthetic */ sprsrf() {
    }

    public static spradf cfr_renamed_5707(sproof arg0, spradf arg1, spradf arg2) {
        return (spradf)arg0.cfr_renamed_1145().cfr_renamed_5532(arg1).cfr_renamed_5468(arg2);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3;
        int cfr_ignored_0 = 2 << 3 ^ 2;
        int n4 = n2;
        int n5 = 4 << 4 ^ (2 << 2 ^ 3);
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

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
}

