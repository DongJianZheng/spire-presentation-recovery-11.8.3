/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprctl;
import com.spire.presentation.packages.sprdjl;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprse;
import com.spire.presentation.packages.spryil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class sprbyl
implements sprse<sprctl> {
    private final Map cfr_renamed_3;
    private final List cfr_renamed_4;

    @Override
    public Iterator<sprctl> iterator() {
        return this.cfr_renamed_3996().iterator();
    }

    /*
     * WARNING - void declaration
     */
    public sprbyl(Collection<sprctl> collection) {
        void arg0;
        Iterator<sprctl> iterator;
        sprbyl sprbyl2 = this;
        sprbyl2.cfr_renamed_3 = new HashMap();
        Iterator<sprctl> iterator2 = iterator = collection.iterator();
        while (iterator2.hasNext()) {
            sprctl sprctl2 = iterator.next();
            spryil spryil2 = sprctl2.cfr_renamed_3995();
            ArrayList<sprctl> arrayList = (ArrayList<sprctl>)this.cfr_renamed_3.get(spryil2);
            if (arrayList == null) {
                arrayList = new ArrayList<sprctl>(1);
                this.cfr_renamed_3.put(spryil2, arrayList);
            }
            arrayList.add(sprctl2);
            iterator2 = iterator;
        }
        this.cfr_renamed_4 = new ArrayList(arg0);
    }

    public Collection<sprctl> cfr_renamed_3996() {
        return new ArrayList<sprctl>(this.cfr_renamed_4);
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_4.size();
    }

    public sprbyl(sprctl arg0) {
        sprbyl sprbyl2 = this;
        sprbyl sprbyl3 = this;
        sprbyl2.cfr_renamed_3 = new HashMap();
        sprbyl3.cfr_renamed_4 = new ArrayList(1);
        sprbyl2.cfr_renamed_4.add(arg0);
        spryil spryil2 = arg0.cfr_renamed_3995();
        this.cfr_renamed_3.put(spryil2, this.cfr_renamed_4);
    }

    public sprctl cfr_renamed_10662(spryil arg0) {
        Collection<sprctl> collection = this.cfr_renamed_10663(arg0);
        if (collection.size() == 0) {
            return null;
        }
        return collection.iterator().next();
    }

    public Collection<sprctl> cfr_renamed_10663(spryil arg0) {
        Cloneable cloneable;
        if (arg0 instanceof sprdjl) {
            cloneable = (sprdjl)arg0;
            sprnbm sprnbm2 = ((sprdjl)cloneable).cfr_renamed_102();
            byte[] byArray = ((sprdjl)cloneable).cfr_renamed_3955();
            if (sprnbm2 != null && byArray != null) {
                Collection<sprctl> collection;
                ArrayList<sprctl> arrayList = new ArrayList<sprctl>();
                Collection<sprctl> collection2 = this.cfr_renamed_10663(new sprdjl(sprnbm2, ((sprdjl)cloneable).cfr_renamed_114()));
                if (collection2 != null) {
                    arrayList.addAll(collection2);
                }
                if ((collection = this.cfr_renamed_10663(new sprdjl(byArray))) != null) {
                    arrayList.addAll(collection);
                }
                return arrayList;
            }
        }
        if ((cloneable = (ArrayList)this.cfr_renamed_3.get(arg0)) == null) {
            return new ArrayList<sprctl>();
        }
        return new ArrayList<sprctl>((Collection<sprctl>)((Object)cloneable));
    }
}

