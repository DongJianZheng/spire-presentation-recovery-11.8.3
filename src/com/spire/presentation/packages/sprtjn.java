/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhhn;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprson;
import com.spire.presentation.packages.sprsto;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprthn;
import com.spire.presentation.packages.spruon;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.sprww;
import com.spire.presentation.packages.sprxln;
import java.util.Iterator;

@sprtea
public class sprtjn
extends sprsmn {
    private sprww cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprtjn(sprww sprww2) {
        void arg0;
        if (sprww2 == null) {
            throw new NullPointerException();
        }
        this.cfr_renamed_4 = arg0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cfr_renamed_13122(sprson arg0) {
        try {
            sprhhn sprhhn2 = new sprhhn(arg0.cfr_renamed_12510());
            try {
                Iterator iterator;
                Iterator iterator2 = iterator = this.cfr_renamed_4.iterator();
                while (iterator2.hasNext()) {
                    ((spruon)iterator.next()).cfr_renamed_13980(sprhhn2);
                    iterator2 = iterator;
                }
                sprhhn2.cfr_renamed_13981();
                arg0.cfr_renamed_13706(sprhhn2.cfr_renamed_12510());
                return;
            }
            finally {
                if (sprhhn2 == null) return;
                sprhhn2.cfr_renamed_11665();
            }
        }
        catch (Exception exception) {
            sprson sprson2 = arg0;
            sprson2.cfr_renamed_13706(sprsto.cfr_renamed_13709());
            sprson2.cfr_renamed_13710(null);
        }
    }

    public static void cfr_renamed_13702(sprvjn arg0, sprww arg1) {
        if (arg1 == null || arg1.size() == 0) {
            return;
        }
        sprtjn sprtjn2 = new sprtjn(arg1);
        arg0.cfr_renamed_13121(sprtjn2);
    }

    @Override
    public void cfr_renamed_13098(sprxln arg0) {
        Iterator iterator;
        Iterator iterator2 = iterator = this.cfr_renamed_4.iterator();
        while (iterator2.hasNext()) {
            ((spruon)iterator.next()).cfr_renamed_13982(arg0);
            iterator2 = iterator;
        }
    }

    @Override
    public void cfr_renamed_13108(sprthn arg0) {
        Iterator iterator;
        Iterator iterator2 = iterator = this.cfr_renamed_4.iterator();
        while (iterator2.hasNext()) {
            ((spruon)iterator.next()).cfr_renamed_13983(arg0);
            iterator2 = iterator;
        }
    }

    public static void cfr_renamed_13984(sprvjn arg0, spruon arg1) {
        if (arg1 == null) {
            return;
        }
        sprwvn sprwvn2 = new sprwvn(1);
        sprovja.cfr_renamed_11658(sprwvn2, arg1);
        sprtjn sprtjn2 = new sprtjn(sprwvn2);
        arg0.cfr_renamed_13121(sprtjn2);
    }
}

