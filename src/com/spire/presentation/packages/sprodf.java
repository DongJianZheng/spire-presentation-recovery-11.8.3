/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spren;
import com.spire.presentation.packages.sprggf;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprohf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class sprodf
extends sprggf {
    public List<spren> cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_3221(sprjj arg0, byte[] arg1) {
        List<byte[]> list = this.cfr_renamed_5364(arg0, arg1);
        if (list.size() > 1) {
            return sprohf.cfr_renamed_5318(arg0, list.iterator());
        }
        return list.get(0);
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_4.size();
    }

    /*
     * WARNING - void declaration
     */
    public sprodf(spren ... sprenArray) {
        void arg0;
        sprodf sprodf2 = this;
        sprodf2.cfr_renamed_4 = new ArrayList<spren>(((void)arg0).length);
        this.cfr_renamed_4.addAll(Arrays.asList(arg0));
    }

    @Override
    public byte[] cfr_renamed_5328(sprjj arg0, byte[] arg1) {
        List<byte[]> list = this.cfr_renamed_5364(arg0, arg1);
        if (list.size() > 1) {
            int n;
            ArrayList<byte[]> arrayList = new ArrayList<byte[]>(list.size());
            int n2 = n = 0;
            while (n2 != arrayList.size()) {
                arrayList.add(list.get(n++));
                n2 = n;
            }
            return sprohf.cfr_renamed_5318(arg0, arrayList.iterator());
        }
        return list.get(0);
    }

    public sprodf(spren spren2) {
        this.cfr_renamed_4 = Collections.singletonList(spren2);
    }

    public List<byte[]> cfr_renamed_5364(sprjj arg0, byte[] arg1) {
        return sprohf.cfr_renamed_5325(arg0, this.cfr_renamed_4, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprodf(List<spren> list) {
        void arg0;
        this.cfr_renamed_4 = new ArrayList<spren>(arg0.size());
        this.cfr_renamed_4.addAll((Collection<spren>)arg0);
    }
}

