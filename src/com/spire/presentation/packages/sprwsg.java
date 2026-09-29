/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprief;
import com.spire.presentation.packages.sprpqg;
import com.spire.presentation.packages.sprse;
import java.util.Iterator;

public class sprwsg
implements sprse<sprpqg> {
    public sprpqg[] cfr_renamed_4;

    public boolean cfr_renamed_29() {
        return this.cfr_renamed_4.length == 0;
    }

    public sprpqg cfr_renamed_576(int arg0) {
        return this.cfr_renamed_4[arg0];
    }

    /*
     * WARNING - void declaration
     */
    public sprwsg(sprpqg sprpqg2) {
        void arg0;
        this.cfr_renamed_4 = new sprpqg[1];
        this.cfr_renamed_4[0] = arg0;
    }

    @Override
    public Iterator<sprpqg> iterator() {
        return new sprief<sprpqg>(this.cfr_renamed_4);
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_4.length;
    }

    /*
     * WARNING - void declaration
     */
    public sprwsg(sprpqg[] sprpqgArray) {
        void arg0;
        this.cfr_renamed_4 = new sprpqg[sprpqgArray.length];
        System.arraycopy(arg0, 0, this.cfr_renamed_4, 0, ((void)arg0).length);
    }
}

