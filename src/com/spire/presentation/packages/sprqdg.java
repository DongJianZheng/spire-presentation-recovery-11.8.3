/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprieg;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprlyf;
import com.spire.presentation.packages.sprmye;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpag;
import com.spire.presentation.packages.sprsuf;
import com.spire.presentation.packages.sprutf;
import com.spire.presentation.packages.sprvcg;
import com.spire.presentation.packages.sprycg;
import com.spire.presentation.packages.sprzsd;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprqdg
implements sprjn {
    private final sprsuf cfr_renamed_1;
    private final int cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    public sprvcg cfr_renamed_6475(sprlyf arg0) {
        sprqdg sprqdg2 = this;
        sprgf sprgf2 = sprieg.cfr_renamed_6447(sprqdg2.cfr_renamed_1);
        sprpag.cfr_renamed_6455(sprqdg2.cfr_renamed_3, sprgf2);
        sprpag.cfr_renamed_6460(sprqdg2.cfr_renamed_2, sprgf2);
        sprpag.cfr_renamed_6461((short)-32383, sprgf2);
        sprpag.cfr_renamed_6455(arg0.cfr_renamed_6459().cfr_renamed_3369(), sprgf2);
        return new sprvcg(this, arg0, sprgf2);
    }

    public sprsuf cfr_renamed_6445() {
        return this.cfr_renamed_1;
    }

    public sprvcg cfr_renamed_6454(sprycg arg0) {
        sprqdg sprqdg2 = this;
        sprgf sprgf2 = sprieg.cfr_renamed_6447(sprqdg2.cfr_renamed_1);
        sprpag.cfr_renamed_6455(sprqdg2.cfr_renamed_3, sprgf2);
        sprpag.cfr_renamed_6460(sprqdg2.cfr_renamed_2, sprgf2);
        sprpag.cfr_renamed_6461((short)-32383, sprgf2);
        sprpag.cfr_renamed_6455(arg0.cfr_renamed_3369(), sprgf2);
        return new sprvcg(this, arg0, sprgf2);
    }

    /*
     * WARNING - void declaration
     */
    public sprqdg(sprsuf sprsuf2, byte[] byArray, int n, byte[] byArray2) {
        void arg2;
        void arg1;
        void arg0;
        sprqdg sprqdg2 = this;
        sprqdg sprqdg3 = this;
        sprqdg3.cfr_renamed_1 = arg0;
        sprqdg3.cfr_renamed_3 = arg1;
        sprqdg2.cfr_renamed_2 = arg2;
        sprqdg2.cfr_renamed_4 = byArray2;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (arg0 == null || this.getClass() != arg0.getClass()) {
            return false;
        }
        sprqdg sprqdg2 = (sprqdg)arg0;
        return this.cfr_renamed_2 == sprqdg2.cfr_renamed_2 && sprmye.cfr_renamed_5073(this.cfr_renamed_1, sprqdg2.cfr_renamed_1) && sproze.cfr_renamed_92(this.cfr_renamed_3, sprqdg2.cfr_renamed_3) && sproze.cfr_renamed_92(this.cfr_renamed_4, sprqdg2.cfr_renamed_4);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static sprqdg cfr_renamed_23(Object arg0) throws Exception {
        if (arg0 instanceof sprqdg) {
            return (sprqdg)arg0;
        }
        if (arg0 instanceof DataInputStream) {
            sprsuf sprsuf2 = sprsuf.cfr_renamed_6470(((DataInputStream)arg0).readInt());
            byte[] byArray = new byte[16];
            ((DataInputStream)arg0).readFully(byArray);
            int n = ((DataInputStream)arg0).readInt();
            byte[] byArray2 = new byte[sprsuf2.cfr_renamed_1146()];
            ((DataInputStream)arg0).readFully(byArray2);
            return new sprqdg(sprsuf2, byArray, n, byArray2);
        }
        if (arg0 instanceof byte[]) {
            InputStream inputStream = null;
            try {
                inputStream = new DataInputStream(new ByteArrayInputStream((byte[])arg0));
                sprqdg sprqdg2 = sprqdg.cfr_renamed_23(inputStream);
                return sprqdg2;
            }
            finally {
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        }
        if (arg0 instanceof InputStream) {
            return sprqdg.cfr_renamed_23(sprkqe.cfr_renamed_471((InputStream)arg0));
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprzsd.cfr_renamed_9("\u001fY\u0012V\u0013L\\H\u001dJ\u000f]\\")).append(arg0).toString());
    }

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        return sprutf.cfr_renamed_5939().cfr_renamed_5940(this.cfr_renamed_1.cfr_renamed_324()).cfr_renamed_6450(this.cfr_renamed_3).cfr_renamed_5940(this.cfr_renamed_2).cfr_renamed_6450(this.cfr_renamed_4).cfr_renamed_1451();
    }

    public int cfr_renamed_1604() {
        return this.cfr_renamed_2;
    }

    public byte[] cfr_renamed_6439() {
        return this.cfr_renamed_3;
    }

    public byte[] cfr_renamed_1150() {
        return this.cfr_renamed_4;
    }

    public int hashCode() {
        int n = sprmye.cfr_renamed_5182(this.cfr_renamed_1);
        n = 31 * n + sproze.cfr_renamed_95(this.cfr_renamed_3);
        n = 31 * n + this.cfr_renamed_2;
        n = 31 * n + sproze.cfr_renamed_95(this.cfr_renamed_4);
        return n;
    }
}

