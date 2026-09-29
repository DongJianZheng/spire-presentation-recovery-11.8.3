/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpod;
import com.spire.presentation.packages.sprsrd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class sprwvd {
    private Map cfr_renamed_3;
    private List cfr_renamed_4;

    public int cfr_renamed_84() {
        return this.cfr_renamed_4.size();
    }

    /*
     * WARNING - void declaration
     */
    public sprwvd(Collection collection) {
        void arg0;
        Iterator iterator;
        sprwvd sprwvd2 = this;
        this.cfr_renamed_4 = new ArrayList();
        sprwvd2.cfr_renamed_3 = new HashMap();
        Iterator iterator2 = iterator = collection.iterator();
        while (iterator2.hasNext()) {
            sprpod sprpod2 = (sprpod)iterator.next();
            sprsrd sprsrd2 = sprpod2.cfr_renamed_634();
            ArrayList<sprpod> arrayList = (ArrayList<sprpod>)this.cfr_renamed_3.get(sprsrd2);
            if (arrayList == null) {
                arrayList = new ArrayList<sprpod>(1);
                this.cfr_renamed_3.put(sprsrd2, arrayList);
            }
            arrayList.add(sprpod2);
            iterator2 = iterator;
        }
        this.cfr_renamed_4 = new ArrayList(arg0);
    }

    public Collection cfr_renamed_622() {
        return new ArrayList(this.cfr_renamed_4);
    }

    public sprpod cfr_renamed_3951(sprsrd arg0) {
        Collection collection = this.cfr_renamed_3954(arg0);
        if (collection.size() == 0) {
            return null;
        }
        return (sprpod)collection.iterator().next();
    }

    public Collection cfr_renamed_3954(sprsrd arg0) {
        if (arg0.cfr_renamed_102() != null && arg0.cfr_renamed_3955() != null) {
            Collection collection;
            ArrayList arrayList = new ArrayList();
            Collection collection2 = this.cfr_renamed_3954(new sprsrd(arg0.cfr_renamed_102(), arg0.cfr_renamed_114()));
            if (collection2 != null) {
                arrayList.addAll(collection2);
            }
            if ((collection = this.cfr_renamed_3954(new sprsrd(arg0.cfr_renamed_3955()))) != null) {
                arrayList.addAll(collection);
            }
            return arrayList;
        }
        ArrayList arrayList = (ArrayList)this.cfr_renamed_3.get(arg0);
        if (arrayList == null) {
            return new ArrayList();
        }
        return new ArrayList(arrayList);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 3;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 1;
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
}

