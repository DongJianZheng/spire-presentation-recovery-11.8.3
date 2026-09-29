/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.charts.entity.ChartRotationThreeD;
import com.spire.presentation.packages.sprbxf;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprlyf;
import com.spire.presentation.packages.sprnek;
import com.spire.presentation.packages.spruag;
import com.spire.presentation.packages.sprutf;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class sprkwf
implements sprjn {
    private final sprlyf cfr_renamed_2;
    private final int cfr_renamed_3;
    private final spruag[] cfr_renamed_4;

    public sprlyf cfr_renamed_79() {
        return this.cfr_renamed_2;
    }

    public spruag[] cfr_renamed_6502() {
        return this.cfr_renamed_4;
    }

    public int hashCode() {
        int n = this.cfr_renamed_3;
        n = 31 * n + Arrays.hashCode(this.cfr_renamed_4);
        n = 31 * n + (this.cfr_renamed_2 != null ? this.cfr_renamed_2.hashCode() : 0);
        return n;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static sprkwf cfr_renamed_6501(Object arg0, int arg1) throws IOException {
        if (arg0 instanceof sprkwf) {
            return (sprkwf)arg0;
        }
        if (arg0 instanceof DataInputStream) {
            int n = ((DataInputStream)arg0).readInt();
            if (n != arg1 - 1) {
                throw new IllegalStateException(sprnek.cfr_renamed_9("\u0015t\u000bl[b\u0003d\u001eb\u001fb\u001f'\u0016f\u0003I\bw\u0010"));
            }
            spruag[] spruagArray = new spruag[n];
            if (n != 0) {
                int n2;
                int n3 = n2 = 0;
                while (n3 < spruagArray.length) {
                    spruagArray[n2++] = new spruag(sprlyf.cfr_renamed_23(arg0), sprbxf.cfr_renamed_23(arg0));
                    n3 = n2;
                }
            }
            sprlyf sprlyf2 = sprlyf.cfr_renamed_23(arg0);
            return new sprkwf(n, spruagArray, sprlyf2);
        }
        if (arg0 instanceof byte[]) {
            InputStream inputStream = null;
            try {
                inputStream = new DataInputStream(new ByteArrayInputStream((byte[])arg0));
                sprkwf sprkwf2 = sprkwf.cfr_renamed_6501(inputStream, arg1);
                return sprkwf2;
            }
            finally {
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        }
        if (arg0 instanceof InputStream) {
            return sprkwf.cfr_renamed_6501(sprkqe.cfr_renamed_471((InputStream)arg0), arg1);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, ChartRotationThreeD.cfr_renamed_9("D^IQHK\u0007OFMTZ\u0007")).append(arg0).toString());
    }

    /*
     * WARNING - void declaration
     */
    public sprkwf(int n, spruag[] spruagArray, sprlyf sprlyf2) {
        void arg1;
        void arg0;
        sprkwf sprkwf2 = this;
        this.cfr_renamed_3 = arg0;
        sprkwf2.cfr_renamed_4 = arg1;
        sprkwf2.cfr_renamed_2 = sprlyf2;
    }

    public boolean equals(Object arg0) {
        int n;
        if (this == arg0) {
            return true;
        }
        if (arg0 == null || this.getClass() != arg0.getClass()) {
            return false;
        }
        sprkwf sprkwf2 = (sprkwf)arg0;
        if (this.cfr_renamed_3 != sprkwf2.cfr_renamed_3) {
            return false;
        }
        if (this.cfr_renamed_4.length != sprkwf2.cfr_renamed_4.length) {
            return false;
        }
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.length) {
            if (!this.cfr_renamed_4[n].equals(sprkwf2.cfr_renamed_4[n])) {
                return false;
            }
            n2 = ++n;
        }
        if (this.cfr_renamed_2 != null) {
            return this.cfr_renamed_2.equals(sprkwf2.cfr_renamed_2);
        }
        return sprkwf2.cfr_renamed_2 == null;
    }

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        sprutf sprutf2 = sprutf.cfr_renamed_5939();
        sprkwf sprkwf2 = this;
        sprutf2.cfr_renamed_5940(sprkwf2.cfr_renamed_3);
        if (sprkwf2.cfr_renamed_4 != null) {
            int n;
            spruag[] spruagArray = this.cfr_renamed_4;
            int n2 = this.cfr_renamed_4.length;
            int n3 = n = 0;
            while (n3 < n2) {
                spruag spruag2 = spruagArray[n];
                sprutf2.cfr_renamed_5941(spruag2);
                n3 = ++n;
            }
        }
        sprutf sprutf3 = sprutf2;
        sprutf3.cfr_renamed_5941(this.cfr_renamed_2);
        return sprutf3.cfr_renamed_1451();
    }

    public int cfr_renamed_6503() {
        return this.cfr_renamed_3;
    }
}

