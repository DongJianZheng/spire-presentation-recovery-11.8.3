/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import java.io.IOException;
import java.io.OutputStream;

public class sprpnl {
    public boolean cfr_renamed_1;
    public byte[] cfr_renamed_2;
    public boolean cfr_renamed_3;
    public int cfr_renamed_4;

    public byte[] cfr_renamed_2609() {
        return this.cfr_renamed_2;
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprpnl) {
            sprpnl sprpnl2 = (sprpnl)arg0;
            if (this.cfr_renamed_4 == sprpnl2.cfr_renamed_4 && this.cfr_renamed_3 == sprpnl2.cfr_renamed_3) {
                return sproze.cfr_renamed_92(this.cfr_renamed_2, sprpnl2.cfr_renamed_2);
            }
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public sprpnl(int n, boolean bl, boolean bl2, byte[] byArray) {
        void arg2;
        void arg1;
        void arg0;
        sprpnl sprpnl2 = this;
        sprpnl sprpnl3 = this;
        sprpnl3.cfr_renamed_4 = arg0;
        sprpnl3.cfr_renamed_3 = arg1;
        sprpnl2.cfr_renamed_1 = arg2;
        sprpnl2.cfr_renamed_2 = byArray;
    }

    public void cfr_renamed_2623(OutputStream arg0) throws IOException {
        OutputStream outputStream;
        sprpnl sprpnl2;
        int n = this.cfr_renamed_2.length + 1;
        if (this.cfr_renamed_1) {
            sprpnl2 = this;
            OutputStream outputStream2 = arg0;
            int n2 = n;
            OutputStream outputStream3 = arg0;
            outputStream3.write(255);
            outputStream3.write((byte)(n >> 24));
            arg0.write((byte)(n2 >> 16));
            outputStream2.write((byte)(n2 >> 8));
            outputStream2.write((byte)n);
        } else if (n < 192) {
            sprpnl2 = this;
            arg0.write((byte)n);
        } else if (n <= 8383) {
            sprpnl2 = this;
            OutputStream outputStream4 = arg0;
            outputStream4.write((byte)(((n -= 192) >> 8 & 0xFF) + 192));
            outputStream4.write((byte)n);
        } else {
            OutputStream outputStream5 = arg0;
            int n3 = n;
            OutputStream outputStream6 = arg0;
            arg0.write(255);
            outputStream6.write((byte)(n >> 24));
            outputStream6.write((byte)(n >> 16));
            outputStream5.write((byte)(n3 >> 8));
            outputStream5.write((byte)n3);
            sprpnl2 = this;
        }
        OutputStream outputStream7 = arg0;
        if (sprpnl2.cfr_renamed_3) {
            outputStream7.write(0x80 | this.cfr_renamed_4);
            outputStream = arg0;
        } else {
            outputStream7.write(this.cfr_renamed_4);
            outputStream = arg0;
        }
        outputStream.write(this.cfr_renamed_2);
    }

    public int cfr_renamed_324() {
        return this.cfr_renamed_4;
    }

    public int hashCode() {
        return (this.cfr_renamed_3 ? 1 : 0) + 7 * this.cfr_renamed_4 + 49 * sproze.cfr_renamed_95(this.cfr_renamed_2);
    }

    public boolean cfr_renamed_7592() {
        return this.cfr_renamed_1;
    }

    public boolean cfr_renamed_101() {
        return this.cfr_renamed_3;
    }
}

