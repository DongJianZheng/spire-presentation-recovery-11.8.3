/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreqea;
import com.spire.presentation.packages.sprtrda;
import com.spire.presentation.packages.spruw;

public class spraik
implements spruw {
    private final spruw cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public void cfr_renamed_1354(byte[] arg0) {
        this.cfr_renamed_3301(arg0, 0, arg0.length);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cfr_renamed_1353(byte[] arg0) {
        spraik spraik2 = this;
        synchronized (spraik2) {
            this.cfr_renamed_4 = 0;
            this.cfr_renamed_2.cfr_renamed_1353(arg0);
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cfr_renamed_3290(long arg0) {
        spraik spraik2 = this;
        synchronized (spraik2) {
            this.cfr_renamed_4 = 0;
            this.cfr_renamed_2.cfr_renamed_3290(arg0);
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public spraik(spruw spruw2, int n) {
        void arg0;
        void arg1;
        if (spruw2 == null) {
            throw new IllegalArgumentException(sprtrda.cfr_renamed_9(")? ?<;:5<z-; 4!.n8+z /\"6"));
        }
        if (arg1 < 2) {
            throw new IllegalArgumentException(spreqea.cfr_renamed_9("ZBCOB\\~BWN\rFXXY\u000bON\rJY\u000bANLXY\u000b\u001f"));
        }
        this.cfr_renamed_2 = arg0;
        this.cfr_renamed_3 = new byte[arg1];
    }

    @Override
    public void cfr_renamed_3240(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_3301(arg0, arg1, arg2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_3301(byte[] arg0, int arg1, int arg2) {
        spraik spraik2 = this;
        synchronized (spraik2) {
            int n;
            int n2 = n = 0;
            while (n2 < arg2) {
                if (this.cfr_renamed_4 < 1) {
                    spraik spraik3 = this;
                    spraik3.cfr_renamed_2.cfr_renamed_3240(spraik3.cfr_renamed_3, 0, this.cfr_renamed_3.length);
                    this.cfr_renamed_4 = this.cfr_renamed_3.length;
                }
                int n3 = arg1 + n;
                arg0[n3] = this.cfr_renamed_3[--this.cfr_renamed_4];
                n2 = ++n;
            }
            return;
        }
    }
}

