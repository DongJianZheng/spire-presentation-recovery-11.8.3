/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprazm;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sproxfa;
import com.spire.presentation.packages.sprxub;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class sprmfn
extends sprazm {
    private int cfr_renamed_2;
    private final int cfr_renamed_3;
    private static final byte[] cfr_renamed_4 = new byte[0];

    public void cfr_renamed_11311(byte[] arg0) throws IOException {
        if (this.cfr_renamed_2 != arg0.length) {
            throw new IllegalArgumentException(sprxub.cfr_renamed_9("qTuGvS3MvOtU{\u0001}Ng\u0001aHtIg\u0001uNa\u0001w@g@"));
        }
        if (this.cfr_renamed_2 == 0) {
            return;
        }
        sprmfn sprmfn2 = this;
        int n = sprmfn2.cfr_renamed_4584();
        if (sprmfn2.cfr_renamed_2 >= n) {
            throw new IOException(new StringBuilder().insert(0, sproxfa.cfr_renamed_9("\u0004l\u0015q\u0012s\u0013f\u0003#\u0014w\u0015f\u0006nG.Gl\u0012wGl\u0001#\u0005l\u0012m\u0003pGo\u0002m\u0000w\u000f#\u0001l\u0012m\u00039G")).append(this.cfr_renamed_2).append(sprxub.cfr_renamed_9("3\u001f.\u0001")).append(n).toString());
        }
        if ((this.cfr_renamed_2 -= sprkqe.cfr_renamed_473((InputStream)this.cfr_renamed_3, arg0, 0, arg0.length)) != 0) {
            throw new EOFException(new StringBuilder().insert(0, sproxfa.cfr_renamed_9("#F!#\u000bf\td\u0013kG")).append(this.cfr_renamed_3).append(sprxub.cfr_renamed_9("\u0001|CyDpU3UaT}BrUvE3Cj\u0001")).append(this.cfr_renamed_2).toString());
        }
        this.cfr_renamed_4609(true);
    }

    public int cfr_renamed_4583() {
        return this.cfr_renamed_2;
    }

    @Override
    public int read() throws IOException {
        if (this.cfr_renamed_2 == 0) {
            return -1;
        }
        int n = this.cfr_renamed_3.read();
        if (n < 0) {
            throw new EOFException(new StringBuilder().insert(0, sproxfa.cfr_renamed_9("#F!#\u000bf\td\u0013kG")).append(this.cfr_renamed_3).append(sprxub.cfr_renamed_9("\u0001|CyDpU3UaT}BrUvE3Cj\u0001")).append(this.cfr_renamed_2).toString());
        }
        if (--this.cfr_renamed_2 == 0) {
            this.cfr_renamed_4609(true);
        }
        return n;
    }

    /*
     * WARNING - void declaration
     */
    public sprmfn(InputStream inputStream, int n, int n2) {
        super((InputStream)arg0, (int)arg2);
        void arg1;
        void arg2;
        void arg0;
        if (n <= 0) {
            if (arg1 < 0) {
                throw new IllegalArgumentException(sproxfa.cfr_renamed_9("m\u0002d\u0006w\u000eu\u0002#\u000bf\td\u0013k\u0014#\tl\u0013#\u0006o\u000bl\u0010f\u0003"));
            }
            this.cfr_renamed_4609(true);
        }
        sprmfn sprmfn2 = this;
        sprmfn2.cfr_renamed_2 = sprmfn2.cfr_renamed_3 = arg1;
    }

    public byte[] cfr_renamed_954() throws IOException {
        if (this.cfr_renamed_2 == 0) {
            return cfr_renamed_4;
        }
        sprmfn sprmfn2 = this;
        int n = sprmfn2.cfr_renamed_4584();
        if (sprmfn2.cfr_renamed_2 >= n) {
            throw new IOException(new StringBuilder().insert(0, sprxub.cfr_renamed_9("B|SaTcUvE3RgSv@~\u0001>\u0001|Tg\u0001|G3C|T}E`\u0001\u007fD}FgI3G|T}E)\u0001")).append(this.cfr_renamed_2).append(sproxfa.cfr_renamed_9("#Y>G")).append(n).toString());
        }
        sprmfn sprmfn3 = this;
        byte[] byArray = new byte[sprmfn3.cfr_renamed_2];
        if ((sprmfn3.cfr_renamed_2 -= sprkqe.cfr_renamed_473((InputStream)this.cfr_renamed_3, byArray, 0, byArray.length)) != 0) {
            throw new EOFException(new StringBuilder().insert(0, sprxub.cfr_renamed_9("eVg3MvOtU{\u0001")).append(this.cfr_renamed_3).append(sproxfa.cfr_renamed_9("Gl\u0005i\u0002`\u0013#\u0013q\u0012m\u0004b\u0013f\u0003#\u0005zG")).append(this.cfr_renamed_2).toString());
        }
        this.cfr_renamed_4609(true);
        return byArray;
    }

    @Override
    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.cfr_renamed_2 == 0) {
            return -1;
        }
        int n = Math.min(arg2, this.cfr_renamed_2);
        int n2 = this.cfr_renamed_3.read(arg0, arg1, n);
        if (n2 < 0) {
            throw new EOFException(new StringBuilder().insert(0, sprxub.cfr_renamed_9("eVg3MvOtU{\u0001")).append(this.cfr_renamed_3).append(sproxfa.cfr_renamed_9("Gl\u0005i\u0002`\u0013#\u0013q\u0012m\u0004b\u0013f\u0003#\u0005zG")).append(this.cfr_renamed_2).toString());
        }
        if ((this.cfr_renamed_2 -= n2) == 0) {
            this.cfr_renamed_4609(true);
        }
        return n2;
    }
}

