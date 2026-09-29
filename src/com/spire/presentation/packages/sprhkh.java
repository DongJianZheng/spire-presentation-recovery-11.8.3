/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfhh;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class sprhkh {
    public final sprfhh cfr_renamed_4;

    public sprfhh cfr_renamed_479() {
        return this.cfr_renamed_4;
    }

    public abstract OutputStream cfr_renamed_4004() throws IOException;

    public sprhkh(sprfhh sprfhh2) {
        this.cfr_renamed_4 = sprfhh2;
    }

    public static List<String> cfr_renamed_8496(Map<String, String> arg0) {
        Iterator<String> iterator;
        ArrayList<String> arrayList = new ArrayList<String>(arg0.size());
        Iterator<String> iterator2 = iterator = arg0.keySet().iterator();
        while (iterator2.hasNext()) {
            String string = iterator.next();
            arrayList.add(string + ": " + arg0.get(string));
            iterator2 = iterator;
        }
        return arrayList;
    }
}

