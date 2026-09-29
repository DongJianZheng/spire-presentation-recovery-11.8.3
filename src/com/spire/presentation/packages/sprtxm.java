/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprrdn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprygn;

@sprtea
public class sprtxm
extends spreen {
    private sprygn cfr_renamed_2;
    private int cfr_renamed_3;
    private spreen cfr_renamed_4;

    @Override
    public long cfr_renamed_3274() {
        throw new UnsupportedOperationException();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int cfr_renamed_11556(byte[] arg0, int arg1, int arg2) {
        int n;
        if (this.cfr_renamed_3 == 0) {
            throw new UnsupportedOperationException();
        }
        byte[] byArray = new byte[arg2];
        int n2 = this.cfr_renamed_4.cfr_renamed_11556(byArray, 0, arg2);
        byte[] byArray2 = new byte[]{};
        try {
            byArray2 = this.cfr_renamed_2.cfr_renamed_11984(byArray, n2);
        }
        catch (sprrdn sprrdn2) {
            sprrdn2.printStackTrace();
        }
        int n3 = n = 0;
        while (n3 < n2) {
            int n4 = arg1 + n;
            byte by = byArray2[n];
            arg0[n4] = by;
            n3 = ++n;
        }
        return n2;
    }

    @Override
    public long cfr_renamed_806() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void cfr_renamed_2947() {
    }

    @Override
    public boolean cfr_renamed_11552() {
        return this.cfr_renamed_3 == 1;
    }

    @Override
    public long cfr_renamed_11547(long arg0, int arg1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void cfr_renamed_11548(long arg0) {
        throw new UnsupportedOperationException();
    }

    /*
     * WARNING - void declaration
     */
    public sprtxm(spreen spreen2, sprygn sprygn2, int n) {
        void arg0;
        void arg1;
        sprtxm sprtxm2 = this;
        this.cfr_renamed_2 = arg1;
        sprtxm2.cfr_renamed_4 = arg0;
        sprtxm2.cfr_renamed_3 = n;
    }

    @Override
    public boolean cfr_renamed_11557() {
        return false;
    }

    @Override
    public boolean cfr_renamed_11560() {
        return this.cfr_renamed_3 == 0;
    }

    @Override
    public void cfr_renamed_11561(long arg0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void cfr_renamed_4924(byte[] arg0, int arg1, int arg2) {
        sprtxm sprtxm2;
        byte[] byArray;
        if (this.cfr_renamed_3 == 1) {
            throw new UnsupportedOperationException();
        }
        if (arg2 == 0) {
            return;
        }
        if (arg1 != 0) {
            int n;
            byArray = new byte[arg2];
            int n2 = n = 0;
            while (n2 < arg2) {
                int n3 = n++;
                byArray[n3] = arg0[arg1 + n3];
                n2 = n;
            }
        } else {
            byArray = arg0;
        }
        byte[] byArray2 = new byte[]{};
        try {
            byArray2 = this.cfr_renamed_2.cfr_renamed_11959(byArray, arg2);
            sprtxm2 = this;
        }
        catch (sprrdn sprrdn2) {
            sprtxm2 = this;
            sprrdn2.printStackTrace();
        }
        sprtxm2.cfr_renamed_4.cfr_renamed_4924(byArray2, 0, byArray2.length);
    }
}

