/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sprzvh
implements sprfo {
    private final int cfr_renamed_3;
    private final sprfo[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprzvh(int n, sprfo sprfo2) {
        void arg1;
        void arg0;
        sprzvh sprzvh2 = this;
        sprzvh2.cfr_renamed_3 = arg0;
        sprfo[] sprfoArray = new sprfo[1];
        sprfoArray[0] = arg1;
        sprzvh2.cfr_renamed_4 = sprfoArray;
    }

    @Override
    public byte cfr_renamed_324() {
        return 1;
    }

    @Override
    public long cfr_renamed_806() {
        int n;
        long l = 0L;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.length) {
            long l2 = this.cfr_renamed_4[n].cfr_renamed_806();
            l += 8L;
            l = l2 <= 8L ? (l += 8L) : (l2 % 8L == 0L ? (l += l2) : (l += (l2 / 8L + 1L) * 8L));
            n2 = ++n;
        }
        return l;
    }

    @Override
    public int cfr_renamed_8159() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprfo cfr_renamed_9004() {
        return this;
    }

    public List<sprfo> cfr_renamed_97() {
        return Collections.unmodifiableList(Arrays.asList(this.cfr_renamed_4));
    }

    /*
     * WARNING - void declaration
     */
    public sprzvh(int n, sprfo[] sprfoArray) {
        void arg1;
        void arg0;
        sprzvh sprzvh2 = this;
        sprzvh2.cfr_renamed_3 = arg0;
        sprzvh2.cfr_renamed_4 = new sprfo[sprfoArray.length];
        System.arraycopy(arg1, 0, this.cfr_renamed_4, 0, ((void)arg1).length);
    }

    /*
     * WARNING - void declaration
     */
    public sprzvh(int n, List<sprfo> list) {
        void arg0;
        List<sprfo> list2 = list;
        sprzvh sprzvh2 = this;
        sprzvh2.cfr_renamed_3 = arg0;
        sprzvh2.cfr_renamed_4 = list2.toArray(new sprfo[list2.size()]);
    }
}

