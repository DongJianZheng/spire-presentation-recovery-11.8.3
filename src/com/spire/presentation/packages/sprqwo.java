/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdrja;
import com.spire.presentation.packages.sprfqja;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprhbja;
import com.spire.presentation.packages.sprlsn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprujo;
import com.spire.presentation.packages.sprxln;

@sprtea
public class sprqwo {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprhbja cfr_renamed_16509(sprujo arg0) {
        sprujo sprujo2 = arg0;
        long l = sprujo2.cfr_renamed_13220();
        long l2 = sprujo2.cfr_renamed_13220();
        long l3 = sprujo2.cfr_renamed_13220();
        sprujo2.cfr_renamed_13220();
        sprqwo.cfr_renamed_17670(arg0);
        sprdrja sprdrja2 = new sprdrja();
        try {
            int n;
            int n2 = n = 0;
            while ((long)n2 < (l3 & 0xFFFFFFFFL)) {
                sprdrja2.cfr_renamed_13650(sprqwo.cfr_renamed_17670(arg0));
                n2 = ++n;
            }
            sprhbja sprhbja2 = new sprhbja(sprdrja2);
            return sprhbja2;
        }
        finally {
            if (sprdrja2 != null) {
                sprdrja2.dispose();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprxln cfr_renamed_16444(sprhbja arg0) {
        int n;
        sprgeja[] sprgejaArray;
        sprxln sprxln2;
        block6: {
            sprgeja[] sprgejaArray2;
            block5: {
                sprxln2 = new sprxln();
                sprfqja sprfqja2 = new sprfqja();
                try {
                    sprgejaArray2 = arg0.cfr_renamed_17671(sprfqja2);
                    if (sprfqja2 == null) break block5;
                    sprgejaArray = sprgejaArray2;
                    sprfqja2.dispose();
                    break block6;
                }
                catch (Throwable throwable) {
                    if (sprfqja2 != null) {
                        sprfqja2.dispose();
                    }
                    throw throwable;
                }
            }
            sprgejaArray = sprgejaArray2;
        }
        sprgeja[] sprgejaArray3 = sprgejaArray;
        int n2 = sprgejaArray3.length;
        int n3 = n = 0;
        while (n3 < n2) {
            sprgeja sprgeja2 = sprgejaArray3[n];
            sprxln2.cfr_renamed_12507(sprlsn.cfr_renamed_13253(sprgeja2));
            n3 = ++n;
        }
        return sprxln2;
    }

    public static sprgeja cfr_renamed_17670(sprujo arg0) {
        return sprgeja.cfr_renamed_14827(arg0.cfr_renamed_12261(), arg0.cfr_renamed_12261(), arg0.cfr_renamed_12261(), arg0.cfr_renamed_12261());
    }

    private /* synthetic */ sprqwo() {
    }
}

