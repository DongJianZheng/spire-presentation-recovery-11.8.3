/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhef;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class sprlhf {
    private static final Comparator<byte[]> cfr_renamed_3 = new sprhef();
    private final LinkedList<byte[]> cfr_renamed_4;

    public void cfr_renamed_5314(byte[] arg0) {
        int n;
        if (this.cfr_renamed_4.size() == 0) {
            this.cfr_renamed_4.addFirst(arg0);
            return;
        }
        if (cfr_renamed_3.compare(arg0, this.cfr_renamed_4.get(0)) < 0) {
            this.cfr_renamed_4.addFirst(arg0);
            return;
        }
        int n2 = n = 1;
        while (n2 < this.cfr_renamed_4.size() && cfr_renamed_3.compare(this.cfr_renamed_4.get(n), arg0) <= 0) {
            n2 = ++n;
        }
        if (n == this.cfr_renamed_4.size()) {
            this.cfr_renamed_4.add(arg0);
            return;
        }
        this.cfr_renamed_4.add(n, arg0);
    }

    public List<byte[]> cfr_renamed_5312() {
        return new ArrayList<byte[]>(this.cfr_renamed_4);
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_4.size();
    }

    public sprlhf() {
        sprlhf sprlhf2 = this;
        sprlhf2.cfr_renamed_4 = new LinkedList();
    }

    public byte[] cfr_renamed_4541() {
        return this.cfr_renamed_4.getFirst();
    }
}

