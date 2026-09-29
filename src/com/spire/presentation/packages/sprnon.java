/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spragp;
import com.spire.presentation.packages.spralq;
import com.spire.presentation.packages.sprdqn;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprtea;
import java.util.Iterator;

@sprtea
public class sprnon
implements Iterable {
    private sprdqn cfr_renamed_1;
    private spralq cfr_renamed_2;
    private spragp cfr_renamed_3;
    private String cfr_renamed_4;

    @sprtea
    public String cfr_renamed_13449(Object arg0) {
        String string = (String)this.cfr_renamed_2.get(arg0);
        if (string != null) {
            return string;
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = this.cfr_renamed_1.cfr_renamed_13448();
        String string2 = string = sprraia.cfr_renamed_11562(this.cfr_renamed_4, objectArray);
        this.cfr_renamed_2.put(arg0, string2);
        this.cfr_renamed_3.cfr_renamed_13301(string, arg0);
        return string2;
    }

    public Iterator iterator() {
        return this.cfr_renamed_3.cfr_renamed_12162();
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprnon(sprdqn sprdqn2, String string) {
        void arg0;
        sprnon sprnon2 = this;
        sprnon sprnon3 = this;
        this.cfr_renamed_3 = new spragp();
        sprnon3.cfr_renamed_2 = new spralq();
        sprnon2.cfr_renamed_1 = arg0;
        sprnon2.cfr_renamed_4 = string;
    }

    public int cfr_renamed_11861() {
        return this.cfr_renamed_3.size();
    }
}

