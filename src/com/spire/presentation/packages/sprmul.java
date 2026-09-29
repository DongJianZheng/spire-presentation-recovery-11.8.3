/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkol;
import com.spire.presentation.packages.sprrpl;
import com.spire.presentation.packages.sprse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class sprmul
implements sprse<sprrpl> {
    private List cfr_renamed_3;
    private Map cfr_renamed_4;

    public sprrpl cfr_renamed_10637(sprkol arg0) {
        Collection<sprrpl> collection = this.cfr_renamed_10640(arg0);
        if (collection.size() == 0) {
            return null;
        }
        return collection.iterator().next();
    }

    @Override
    public Iterator<sprrpl> iterator() {
        return this.cfr_renamed_622().iterator();
    }

    public Collection<sprrpl> cfr_renamed_622() {
        return new ArrayList<sprrpl>(this.cfr_renamed_3);
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_3.size();
    }

    /*
     * WARNING - void declaration
     */
    public sprmul(Collection<sprrpl> collection) {
        void arg0;
        Iterator<sprrpl> iterator;
        sprmul sprmul2 = this;
        this.cfr_renamed_3 = new ArrayList();
        sprmul2.cfr_renamed_4 = new HashMap();
        Iterator<sprrpl> iterator2 = iterator = collection.iterator();
        while (iterator2.hasNext()) {
            sprrpl sprrpl2 = iterator.next();
            sprkol sprkol2 = sprrpl2.cfr_renamed_634();
            ArrayList<sprrpl> arrayList = (ArrayList<sprrpl>)this.cfr_renamed_4.get(sprkol2);
            if (arrayList == null) {
                arrayList = new ArrayList<sprrpl>(1);
                this.cfr_renamed_4.put(sprkol2, arrayList);
            }
            arrayList.add(sprrpl2);
            iterator2 = iterator;
        }
        this.cfr_renamed_3 = new ArrayList(arg0);
    }

    public sprmul(sprrpl arg0) {
        sprmul sprmul2 = this;
        sprmul sprmul3 = this;
        sprmul2.cfr_renamed_3 = new ArrayList();
        sprmul3.cfr_renamed_4 = new HashMap();
        sprmul2.cfr_renamed_3 = new ArrayList(1);
        sprmul2.cfr_renamed_3.add(arg0);
        sprkol sprkol2 = arg0.cfr_renamed_634();
        this.cfr_renamed_4.put(sprkol2, this.cfr_renamed_3);
    }

    public Collection<sprrpl> cfr_renamed_10640(sprkol arg0) {
        if (arg0.cfr_renamed_102() != null && arg0.cfr_renamed_3955() != null) {
            Collection<sprrpl> collection;
            ArrayList<sprrpl> arrayList = new ArrayList<sprrpl>();
            Collection<sprrpl> collection2 = this.cfr_renamed_10640(new sprkol(arg0.cfr_renamed_102(), arg0.cfr_renamed_114()));
            if (collection2 != null) {
                arrayList.addAll(collection2);
            }
            if ((collection = this.cfr_renamed_10640(new sprkol(arg0.cfr_renamed_3955()))) != null) {
                arrayList.addAll(collection);
            }
            return arrayList;
        }
        ArrayList arrayList = (ArrayList)this.cfr_renamed_4.get(arg0);
        if (arrayList == null) {
            return new ArrayList<sprrpl>();
        }
        return new ArrayList<sprrpl>(arrayList);
    }
}

