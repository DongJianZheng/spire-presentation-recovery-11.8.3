/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjxd;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprurd;
import com.spire.presentation.packages.sprzud;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class spryxd {
    private final List cfr_renamed_3;
    private final Map cfr_renamed_4;

    public sprurd cfr_renamed_3993(sprjxd arg0) {
        Collection collection = this.cfr_renamed_3994(arg0);
        if (collection.size() == 0) {
            return null;
        }
        return (sprurd)collection.iterator().next();
    }

    public Collection cfr_renamed_3994(sprjxd arg0) {
        Cloneable cloneable;
        if (arg0 instanceof sprzud) {
            cloneable = (sprzud)arg0;
            spruhe spruhe2 = ((sprzud)cloneable).cfr_renamed_102();
            byte[] byArray = ((sprzud)cloneable).cfr_renamed_3955();
            if (spruhe2 != null && byArray != null) {
                Collection collection;
                ArrayList arrayList = new ArrayList();
                Collection collection2 = this.cfr_renamed_3994(new sprzud(spruhe2, ((sprzud)cloneable).cfr_renamed_114()));
                if (collection2 != null) {
                    arrayList.addAll(collection2);
                }
                if ((collection = this.cfr_renamed_3994(new sprzud(byArray))) != null) {
                    arrayList.addAll(collection);
                }
                return arrayList;
            }
        }
        if ((cloneable = (ArrayList)this.cfr_renamed_4.get(arg0)) == null) {
            return new ArrayList();
        }
        return new ArrayList(cloneable);
    }

    /*
     * WARNING - void declaration
     */
    public spryxd(Collection collection) {
        void arg0;
        Iterator iterator;
        spryxd spryxd2 = this;
        spryxd2.cfr_renamed_4 = new HashMap();
        Iterator iterator2 = iterator = collection.iterator();
        while (iterator2.hasNext()) {
            sprurd sprurd2 = (sprurd)iterator.next();
            sprjxd sprjxd2 = sprurd2.cfr_renamed_3995();
            ArrayList<sprurd> arrayList = (ArrayList<sprurd>)this.cfr_renamed_4.get(sprjxd2);
            if (arrayList == null) {
                arrayList = new ArrayList<sprurd>(1);
                this.cfr_renamed_4.put(sprjxd2, arrayList);
            }
            arrayList.add(sprurd2);
            iterator2 = iterator;
        }
        this.cfr_renamed_3 = new ArrayList(arg0);
    }

    public Collection cfr_renamed_3996() {
        return new ArrayList(this.cfr_renamed_3);
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_3.size();
    }
}

