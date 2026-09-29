/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprftd;
import com.spire.presentation.packages.sprltd;
import com.spire.presentation.packages.sprz;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class sprotd
extends sprltd {
    public sprotd(Collection arg0) throws IOException {
        super(sprotd.cfr_renamed_4326(arg0));
    }

    private static /* synthetic */ Collection cfr_renamed_4326(Collection arg0) throws IOException {
        ArrayList<sprftd> arrayList = new ArrayList<sprftd>(arg0.size());
        for (Object e : arg0) {
            if (e instanceof sprz) {
                sprz sprz2 = (sprz)e;
                arrayList.add(new sprftd(sprz2));
                continue;
            }
            arrayList.add((sprftd)e);
        }
        return arrayList;
    }

    public sprotd(sprz arg0) throws IOException {
        this(Collections.singletonList(arg0));
    }
}

