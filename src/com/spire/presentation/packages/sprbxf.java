/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprag;
import com.spire.presentation.packages.sprgzf;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprlyf;
import com.spire.presentation.packages.sprodg;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqdg;
import com.spire.presentation.packages.sprqog;
import com.spire.presentation.packages.sprsuf;
import com.spire.presentation.packages.sprutf;
import com.spire.presentation.packages.spruzf;
import com.spire.presentation.packages.sprvcg;
import com.spire.presentation.packages.sprztf;
import com.spire.presentation.packages.sprzyaa;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprbxf
extends sprodg
implements sprag {
    private final sprsuf cfr_renamed_1;
    private final sprgzf cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    public byte[] cfr_renamed_6439() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static sprbxf cfr_renamed_23(Object arg0) throws IOException {
        if (arg0 instanceof sprbxf) {
            return (sprbxf)arg0;
        }
        if (arg0 instanceof DataInputStream) {
            int n = ((DataInputStream)arg0).readInt();
            sprgzf sprgzf2 = sprgzf.cfr_renamed_6470(n);
            sprsuf sprsuf2 = sprsuf.cfr_renamed_6470(((DataInputStream)arg0).readInt());
            byte[] byArray = new byte[16];
            ((DataInputStream)arg0).readFully(byArray);
            byte[] byArray2 = new byte[sprgzf2.cfr_renamed_1186()];
            ((DataInputStream)arg0).readFully(byArray2);
            return new sprbxf(sprgzf2, sprsuf2, byArray2, byArray);
        }
        if (arg0 instanceof byte[]) {
            InputStream inputStream = null;
            try {
                inputStream = new DataInputStream(new ByteArrayInputStream((byte[])arg0));
                sprbxf sprbxf2 = sprbxf.cfr_renamed_23(inputStream);
                return sprbxf2;
            }
            finally {
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        }
        if (arg0 instanceof InputStream) {
            return sprbxf.cfr_renamed_23(sprkqe.cfr_renamed_471((InputStream)arg0));
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprqog.cfr_renamed_9("s,~#\u007f90=q?c(0")).append(arg0).toString());
    }

    public byte[] cfr_renamed_6472() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprbxf(sprgzf sprgzf2, sprsuf sprsuf2, byte[] byArray, byte[] byArray2) {
        void arg3;
        void arg1;
        void arg0;
        sprbxf sprbxf2 = this;
        sprbxf sprbxf3 = this;
        super(false);
        sprbxf3.cfr_renamed_2 = arg0;
        sprbxf3.cfr_renamed_1 = arg1;
        sprbxf2.cfr_renamed_3 = sproze.cfr_renamed_158((byte[])arg3);
        sprbxf2.cfr_renamed_4 = sproze.cfr_renamed_158(byArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprvcg cfr_renamed_6473(sprlyf sprlyf2) {
        void arg0;
        int n = this.cfr_renamed_6474().cfr_renamed_324();
        if (sprlyf2.cfr_renamed_6459().cfr_renamed_324().cfr_renamed_324() != n) {
            throw new IllegalArgumentException(sprzyaa.cfr_renamed_9("G\u000e[Z\\\u0003X\u001f\b\u001cZ\u0015EZD\tEZ[\u0013O\u0014I\u000e]\bMZL\u0015M\t\b\u0014G\u000e\b\u0017I\u000eK\u0012\b\u0015\\\t\b\tA\u001dF\u001b\\\u000fZ\u001f\b\u000eQ\nMZN\bG\u0017\b\u001fE\u0018M\u001eL\u001fLZG\u000e[Z[\u0013O\u0014I\u000e]\bM"));
        }
        return new sprqdg(sprsuf.cfr_renamed_6470(n), this.cfr_renamed_3, arg0.cfr_renamed_1604(), null).cfr_renamed_6475((sprlyf)arg0);
    }

    public int hashCode() {
        int n = this.cfr_renamed_2.hashCode();
        n = 31 * n + this.cfr_renamed_1.hashCode();
        n = 31 * n + sproze.cfr_renamed_95(this.cfr_renamed_3);
        n = 31 * n + sproze.cfr_renamed_95(this.cfr_renamed_4);
        return n;
    }

    public byte[] cfr_renamed_5974() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    @Override
    public boolean cfr_renamed_5711(sprvcg arg0) {
        return spruzf.cfr_renamed_6476(this, arg0);
    }

    public sprgzf cfr_renamed_6477() {
        return this.cfr_renamed_2;
    }

    public byte[] cfr_renamed_954() {
        return sprutf.cfr_renamed_5939().cfr_renamed_5940(this.cfr_renamed_2.cfr_renamed_324()).cfr_renamed_5940(this.cfr_renamed_1.cfr_renamed_324()).cfr_renamed_6450(this.cfr_renamed_3).cfr_renamed_6450(this.cfr_renamed_4).cfr_renamed_1451();
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (arg0 == null || this.getClass() != arg0.getClass()) {
            return false;
        }
        sprbxf sprbxf2 = (sprbxf)arg0;
        if (!this.cfr_renamed_2.equals(sprbxf2.cfr_renamed_2)) {
            return false;
        }
        if (!this.cfr_renamed_1.equals(sprbxf2.cfr_renamed_1)) {
            return false;
        }
        if (!sproze.cfr_renamed_92(this.cfr_renamed_3, sprbxf2.cfr_renamed_3)) {
            return false;
        }
        return sproze.cfr_renamed_92(this.cfr_renamed_4, sprbxf2.cfr_renamed_4);
    }

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_954();
    }

    public sprztf cfr_renamed_6478() {
        return new sprztf(this.cfr_renamed_6477(), this.cfr_renamed_6474());
    }

    public sprsuf cfr_renamed_6474() {
        return this.cfr_renamed_1;
    }

    public boolean cfr_renamed_6479(byte[] arg0) {
        return sproze.cfr_renamed_559(this.cfr_renamed_4, arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprvcg cfr_renamed_5710(byte[] arg0) {
        try {
            return this.cfr_renamed_6473(sprlyf.cfr_renamed_23(arg0));
        }
        catch (IOException iOException) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprqog.cfr_renamed_9(".q#~\"dm`,b>umc$w#q9e?uw0")).append(iOException.getMessage()).toString());
        }
    }
}

