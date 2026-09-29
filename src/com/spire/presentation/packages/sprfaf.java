/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhef;
import com.spire.presentation.packages.sprpye;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class sprfaf {
    private static final Comparator<byte[]> cfr_renamed_3 = new sprhef();
    private final LinkedList<sprpye> cfr_renamed_4;

    public List<sprpye> cfr_renamed_5312() {
        return new ArrayList<sprpye>(this.cfr_renamed_4);
    }

    public sprpye cfr_renamed_4541() {
        return this.cfr_renamed_4.getFirst();
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_4.size();
    }

    public void cfr_renamed_5313(sprpye arg0) {
        int n;
        if (this.cfr_renamed_4.size() == 0) {
            this.cfr_renamed_4.addFirst(arg0);
            return;
        }
        if (cfr_renamed_3.compare(arg0.cfr_renamed_4, this.cfr_renamed_4.get((int)0).cfr_renamed_4) < 0) {
            this.cfr_renamed_4.addFirst(arg0);
            return;
        }
        int n2 = n = 1;
        while (n2 < this.cfr_renamed_4.size() && cfr_renamed_3.compare(this.cfr_renamed_4.get((int)n).cfr_renamed_4, arg0.cfr_renamed_4) <= 0) {
            n2 = ++n;
        }
        if (n == this.cfr_renamed_4.size()) {
            this.cfr_renamed_4.add(arg0);
            return;
        }
        this.cfr_renamed_4.add(n, arg0);
    }

    public sprfaf() {
        sprfaf sprfaf2 = this;
        sprfaf2.cfr_renamed_4 = new LinkedList();
    }
}

