/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgzf;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprutf;
import com.spire.presentation.packages.sprxqr;
import com.spire.presentation.packages.sprycg;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

@sprtea
public class sprlyf
implements sprjn {
    private final int cfr_renamed_1;
    private final sprycg cfr_renamed_2;
    private final sprgzf cfr_renamed_3;
    private final byte[][] cfr_renamed_4;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static sprlyf cfr_renamed_23(Object arg0) throws IOException {
        if (arg0 instanceof sprlyf) {
            return (sprlyf)arg0;
        }
        if (arg0 instanceof DataInputStream) {
            int n;
            int n2 = ((DataInputStream)arg0).readInt();
            Object object = arg0;
            sprycg sprycg2 = sprycg.cfr_renamed_23(object);
            sprgzf sprgzf2 = sprgzf.cfr_renamed_6470(((DataInputStream)object).readInt());
            byte[][] byArrayArray = new byte[sprgzf2.cfr_renamed_1153()][];
            int n3 = n = 0;
            while (n3 < byArrayArray.length) {
                byArrayArray[n] = new byte[sprgzf2.cfr_renamed_1186()];
                ((DataInputStream)arg0).readFully(byArrayArray[n++]);
                n3 = n;
            }
            return new sprlyf(n2, sprycg2, sprgzf2, byArrayArray);
        }
        if (arg0 instanceof byte[]) {
            InputStream inputStream = null;
            try {
                inputStream = new DataInputStream(new ByteArrayInputStream((byte[])arg0));
                sprlyf sprlyf2 = sprlyf.cfr_renamed_23(inputStream);
                return sprlyf2;
            }
            finally {
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        }
        if (arg0 instanceof InputStream) {
            return sprlyf.cfr_renamed_23(sprkqe.cfr_renamed_471((InputStream)arg0));
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprxqr.cfr_renamed_9("3\f>\u0003?\u0019p\u001d1\u001f#\bp")).append(arg0).toString());
    }

    public byte[][] spr\u3181() {
        return this.cfr_renamed_4;
    }

    public int hashCode() {
        int n = this.cfr_renamed_1;
        n = 31 * n + (this.cfr_renamed_2 != null ? this.cfr_renamed_2.hashCode() : 0);
        n = 31 * n + (this.cfr_renamed_3 != null ? this.cfr_renamed_3.hashCode() : 0);
        n = 31 * n + Arrays.deepHashCode((Object[])this.cfr_renamed_4);
        return n;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (arg0 == null || this.getClass() != arg0.getClass()) {
            return false;
        }
        sprlyf sprlyf2 = (sprlyf)arg0;
        if (this.cfr_renamed_1 != sprlyf2.cfr_renamed_1) {
            return false;
        }
        if (this.cfr_renamed_2 != null ? !this.cfr_renamed_2.equals(sprlyf2.cfr_renamed_2) : sprlyf2.cfr_renamed_2 != null) {
            return false;
        }
        if (this.cfr_renamed_3 != null ? !this.cfr_renamed_3.equals(sprlyf2.cfr_renamed_3) : sprlyf2.cfr_renamed_3 != null) {
            return false;
        }
        return Arrays.deepEquals((Object[])this.cfr_renamed_4, (Object[])sprlyf2.cfr_renamed_4);
    }

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        return sprutf.cfr_renamed_5939().cfr_renamed_5940(this.cfr_renamed_1).cfr_renamed_6450(this.cfr_renamed_2.cfr_renamed_91()).cfr_renamed_5940(this.cfr_renamed_3.cfr_renamed_324()).cfr_renamed_6471(this.cfr_renamed_4).cfr_renamed_1451();
    }

    public sprgzf cfr_renamed_6445() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_1604() {
        return this.cfr_renamed_1;
    }

    public sprycg cfr_renamed_6459() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprlyf(int n, sprycg sprycg2, sprgzf sprgzf2, byte[][] byArray) {
        void arg2;
        void arg1;
        void arg0;
        sprlyf sprlyf2 = this;
        sprlyf sprlyf3 = this;
        sprlyf3.cfr_renamed_1 = arg0;
        sprlyf3.cfr_renamed_2 = arg1;
        sprlyf2.cfr_renamed_3 = arg2;
        sprlyf2.cfr_renamed_4 = byArray;
    }
}

