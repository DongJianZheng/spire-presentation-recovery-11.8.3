/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class spryah<T>
implements Iterator<T> {
    private final Iterator<Long> cfr_renamed_3;
    private final Map<Long, T> cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spryah(List<Long> list, Map<Long, T> map) {
        void arg0;
        spryah spryah2 = this;
        spryah2.cfr_renamed_3 = arg0.iterator();
        spryah2.cfr_renamed_4 = map;
    }

    @Override
    public T next() {
        spryah spryah2 = this;
        return spryah2.cfr_renamed_4.get(spryah2.cfr_renamed_3.next());
    }

    @Override
    public boolean hasNext() {
        return this.cfr_renamed_3.hasNext();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException(spravo.cfr_renamed_9(";$$.?$i/&5i ?  -(#%$"));
    }
}

