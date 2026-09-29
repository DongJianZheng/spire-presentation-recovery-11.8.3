/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdwy;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprsuf;
import com.spire.presentation.packages.sprutf;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class sprycg
implements sprjn {
    private final byte[] cfr_renamed_2;
    private final sprsuf cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        return sprutf.cfr_renamed_5939().cfr_renamed_5940(this.cfr_renamed_3.cfr_renamed_324()).cfr_renamed_6450(this.cfr_renamed_4).cfr_renamed_6450(this.cfr_renamed_2).cfr_renamed_1451();
    }

    public byte[] spr\u3181() {
        return this.cfr_renamed_2;
    }

    public sprsuf cfr_renamed_324() {
        return this.cfr_renamed_3;
    }

    public byte[] cfr_renamed_3369() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static sprycg cfr_renamed_23(Object arg0) throws IOException {
        if (arg0 instanceof sprycg) {
            return (sprycg)arg0;
        }
        if (arg0 instanceof DataInputStream) {
            sprsuf sprsuf2 = sprsuf.cfr_renamed_6470(((DataInputStream)arg0).readInt());
            byte[] byArray = new byte[sprsuf2.cfr_renamed_1146()];
            ((DataInputStream)arg0).readFully(byArray);
            byte[] byArray2 = new byte[sprsuf2.cfr_renamed_1155() * sprsuf2.cfr_renamed_1146()];
            ((DataInputStream)arg0).readFully(byArray2);
            return new sprycg(sprsuf2, byArray, byArray2);
        }
        if (arg0 instanceof byte[]) {
            InputStream inputStream = null;
            try {
                inputStream = new DataInputStream(new ByteArrayInputStream((byte[])arg0));
                sprycg sprycg2 = sprycg.cfr_renamed_23(inputStream);
                return sprycg2;
            }
            finally {
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        }
        if (arg0 instanceof InputStream) {
            return sprycg.cfr_renamed_23(sprkqe.cfr_renamed_471((InputStream)arg0));
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprdwy.cfr_renamed_9("\u00018\f7\r-B)\u0003+\u0011<B")).append(arg0).toString());
    }

    /*
     * WARNING - void declaration
     */
    public sprycg(sprsuf sprsuf2, byte[] byArray, byte[] byArray2) {
        void arg1;
        void arg0;
        sprycg sprycg2 = this;
        this.cfr_renamed_3 = arg0;
        sprycg2.cfr_renamed_4 = arg1;
        sprycg2.cfr_renamed_2 = byArray2;
    }

    public int hashCode() {
        int n = this.cfr_renamed_3 != null ? this.cfr_renamed_3.hashCode() : 0;
        n = 31 * n + Arrays.hashCode(this.cfr_renamed_4);
        n = 31 * n + Arrays.hashCode(this.cfr_renamed_2);
        return n;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (arg0 == null || this.getClass() != arg0.getClass()) {
            return false;
        }
        sprycg sprycg2 = (sprycg)arg0;
        if (this.cfr_renamed_3 != null ? !this.cfr_renamed_3.equals(sprycg2.cfr_renamed_3) : sprycg2.cfr_renamed_3 != null) {
            return false;
        }
        if (!Arrays.equals(this.cfr_renamed_4, sprycg2.cfr_renamed_4)) {
            return false;
        }
        return Arrays.equals(this.cfr_renamed_2, sprycg2.cfr_renamed_2);
    }
}

