/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxgf;
import java.util.Iterator;

@sprtea
public class sprwxn
extends sprqqe {
    private sprgbf cfr_renamed_2;
    private sprlem cfr_renamed_3;
    private sproug cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        return null;
    }

    public int cfr_renamed_15383() {
        return 0;
    }

    public sprwxn cfr_renamed_15393(sproug arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sprgbf cfr_renamed_15437() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprwxn cfr_renamed_15438(byte[] byArray) {
        void arg0;
        this.cfr_renamed_2 = new sprdye((byte[])arg0);
        return this;
    }

    public sprwxn() {
    }

    public sproug cfr_renamed_8455() {
        return this.cfr_renamed_4;
    }

    public sprwxn cfr_renamed_15434(sprlem arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    public boolean cfr_renamed_15388(sprqqe arg0) {
        return false;
    }

    public sprwxn(sprszm sprszm2) {
        Iterator<sprco> iterator = sprszm2.iterator();
        iterator.hasNext();
        Iterator<sprco> iterator2 = iterator;
        this.cfr_renamed_4 = sproug.cfr_renamed_23(iterator2.next());
        iterator2.hasNext();
        Iterator<sprco> iterator3 = iterator;
        this.cfr_renamed_3 = sprlem.cfr_renamed_23(iterator3.next());
        iterator3.hasNext();
        this.cfr_renamed_2 = sprgbf.cfr_renamed_23(iterator.next());
    }

    public sprwxn cfr_renamed_15439(sprgbf arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprwxn(sproug sproug2, sprlem sprlem2, sprgbf sprgbf2) {
        void arg1;
        void arg0;
        sprwxn sprwxn2 = this;
        this.cfr_renamed_4 = arg0;
        sprwxn2.cfr_renamed_3 = arg1;
        sprwxn2.cfr_renamed_2 = sprgbf2;
    }

    public sprlem cfr_renamed_89() {
        return this.cfr_renamed_3;
    }

    public static sprwxn cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprwxn) {
            return (sprwxn)arg0;
        }
        if (arg0 != null) {
            return new sprwxn(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

