/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprmba;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprvvja;

@sprtea
public abstract class sprbsn<T>
implements sprdz,
Cloneable {
    private sprvrx cfr_renamed_4;

    public void cfr_renamed_12950(int arg0, T arg1, T arg2) {
    }

    public void cfr_renamed_12951(int arg0, T arg1) {
    }

    @sprtea
    public sprvrx cfr_renamed_12925() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_12952(int arg0, Object arg1) {
    }

    public sprbsn() {
        sprbsn sprbsn2 = this;
        sprbsn2.cfr_renamed_4 = new sprvrx();
    }

    public void cfr_renamed_12953(int arg0, T arg1) {
    }

    public int cfr_renamed_11861() {
        return this.cfr_renamed_4.size();
    }

    @Override
    public void clear() {
        sprbsn sprbsn2 = this;
        sprbsn2.cfr_renamed_12954();
        sprbsn2.cfr_renamed_4.clear();
        sprbsn2.cfr_renamed_12955();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object cfr_renamed_12100() {
        try {
            return this.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalStateException(cloneNotSupportedException);
        }
    }

    public boolean cfr_renamed_12943(T arg0) {
        int n = this.cfr_renamed_12956(arg0);
        boolean bl = false;
        if (n >= 0) {
            this.cfr_renamed_12148(n);
            bl = true;
        }
        return bl;
    }

    @sprtea
    public Object cfr_renamed_12099() {
        (sprbsn2 = (sprbsn)this.cfr_renamed_12100()).cfr_renamed_4 = new sprvrx(this.cfr_renamed_11861());
        sprbsn sprbsn2 = (sprbsn)this.cfr_renamed_12100();
        return sprbsn2;
    }

    public void cfr_renamed_12102(int arg0) {
        this.cfr_renamed_4.cfr_renamed_12102(arg0);
    }

    @Override
    public boolean cfr_renamed_12891() {
        return false;
    }

    public int cfr_renamed_12956(T arg0) {
        return this.cfr_renamed_4.indexOf(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_12957(int n, T t) {
        void arg1;
        void arg0;
        sprbsn sprbsn2 = this;
        sprbsn2.cfr_renamed_12952((int)arg0, arg1);
        sprbsn2.cfr_renamed_4.cfr_renamed_12929((int)arg0, arg1);
        sprbsn2.cfr_renamed_12958(n, arg1);
    }

    public void cfr_renamed_12954() {
    }

    public void cfr_renamed_12958(int arg0, Object arg1) {
    }

    public T cfr_renamed_576(int arg0) {
        return this.cfr_renamed_4.cfr_renamed_12151(arg0);
    }

    @Override
    public void cfr_renamed_12148(int arg0) {
        sprbsn sprbsn2 = this;
        T t = sprbsn2.cfr_renamed_576(arg0);
        sprbsn2.cfr_renamed_12953(arg0, t);
        sprbsn2.cfr_renamed_4.cfr_renamed_12148(arg0);
        sprbsn2.cfr_renamed_12951(arg0, t);
    }

    public sprdz cfr_renamed_12959() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_12960(int arg0, T arg1, T arg2) {
    }

    public int cfr_renamed_12961() {
        return this.cfr_renamed_4.cfr_renamed_12961();
    }

    public void cfr_renamed_12962(int arg0, T arg1) {
        sprbsn sprbsn2 = this;
        Object t = sprbsn2.cfr_renamed_4.cfr_renamed_12151(arg0);
        sprbsn2.cfr_renamed_12950(arg0, t, arg1);
        sprbsn2.cfr_renamed_4.cfr_renamed_12924(arg0, arg1);
        sprbsn2.cfr_renamed_12960(arg0, t, arg1);
    }

    public boolean cfr_renamed_12431(T arg0) {
        return this.cfr_renamed_4.contains(arg0);
    }

    public void cfr_renamed_12963(T[] arg0, int arg1) {
        this.cfr_renamed_4.cfr_renamed_12964(sprvvja.cfr_renamed_11609(arg0), arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprbsn(int n) {
        void arg0;
        sprbsn sprbsn2 = this;
        sprbsn2.cfr_renamed_4 = new sprvrx((int)arg0);
    }

    @Override
    public void cfr_renamed_12808(Object arg0) {
        sprbsn sprbsn2 = this;
        int n = sprbsn2.cfr_renamed_11861();
        sprbsn2.cfr_renamed_12952(n, arg0);
        sprbsn2.cfr_renamed_4.add(arg0);
        this.cfr_renamed_12958(n, arg0);
    }

    @Override
    public sprmba cfr_renamed_12162() {
        return this.cfr_renamed_4.cfr_renamed_12162();
    }

    public void cfr_renamed_12955() {
    }
}

