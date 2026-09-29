/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbtl;
import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprine;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprtul;
import com.spire.presentation.packages.sprug;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class spreol
implements sprug {
    private final Map cfr_renamed_4;

    public spreol(List arg0) {
        Iterator iterator;
        HashMap<String, sprbtl> hashMap = new HashMap<String, sprbtl>();
        Iterator iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            sprbtl sprbtl2 = (sprbtl)iterator.next();
            iterator2 = iterator;
            hashMap.put(sprbtl2.cfr_renamed_10944(), sprbtl2);
        }
        this.cfr_renamed_4 = Collections.unmodifiableMap(hashMap);
    }

    public sprug cfr_renamed_10945() {
        Iterator iterator;
        Collection collection = this.cfr_renamed_3216((sprhd)null);
        ArrayList<sprtpl> arrayList = new ArrayList<sprtpl>(collection.size());
        Iterator iterator2 = iterator = collection.iterator();
        while (iterator2.hasNext()) {
            sprbtl sprbtl2 = (sprbtl)iterator.next();
            iterator2 = iterator;
            arrayList.add(sprbtl2.cfr_renamed_2141());
        }
        return new sprtul(arrayList);
    }

    public Collection cfr_renamed_3216(sprhd arg0) throws sprine {
        if (arg0 == null) {
            return this.cfr_renamed_4.values();
        }
        ArrayList arrayList = new ArrayList();
        for (Object v : this.cfr_renamed_4.values()) {
            if (!arg0.cfr_renamed_132(v)) continue;
            arrayList.add(v);
        }
        return Collections.unmodifiableList(arrayList);
    }
}

