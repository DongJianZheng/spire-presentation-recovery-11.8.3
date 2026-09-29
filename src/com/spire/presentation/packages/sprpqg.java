/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbzo;
import com.spire.presentation.packages.spreah;
import com.spire.presentation.packages.spreg;
import com.spire.presentation.packages.sprfdm;
import com.spire.presentation.packages.sprid;
import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sprqj;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprtzl;
import com.spire.presentation.packages.sprujha;
import com.spire.presentation.packages.sprvbh;
import com.spire.presentation.packages.sprzyg;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class sprpqg {
    private sprfdm cfr_renamed_0;
    private byte cfr_renamed_1;
    private int cfr_renamed_2;
    private OutputStream cfr_renamed_3;
    private spreg cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprpqg(sprfdm sprfdm2) throws sprtqg {
        void arg0;
        sprpqg sprpqg2 = this;
        sprpqg2.cfr_renamed_0 = arg0;
        sprpqg2.cfr_renamed_2 = sprfdm2.cfr_renamed_7576();
    }

    public void cfr_renamed_1196(byte[] arg0) {
        if (this.cfr_renamed_2 == 1) {
            int n;
            int n2 = n = 0;
            while (n2 != arg0.length) {
                this.cfr_renamed_1221(arg0[n++]);
                n2 = n;
            }
        } else {
            this.cfr_renamed_7536(arg0, 0, arg0.length);
        }
    }

    public byte[] cfr_renamed_91() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream = new ByteArrayOutputStream();
        this.cfr_renamed_2623(byteArrayOutputStream2);
        return byteArrayOutputStream2.toByteArray();
    }

    public int cfr_renamed_579() {
        return this.cfr_renamed_0.cfr_renamed_579();
    }

    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (this.cfr_renamed_2 == 1) {
            int n;
            int n2 = arg1 + arg2;
            int n3 = n = arg1;
            while (n3 != n2) {
                this.cfr_renamed_1221(arg0[n++]);
                n3 = n;
            }
        } else {
            this.cfr_renamed_7536(arg0, arg1, arg2);
        }
    }

    public sprpqg(sprmam arg0) throws IOException, sprtqg {
        this(sprpqg.cfr_renamed_7675(arg0.cfr_renamed_7676()));
    }

    public boolean cfr_renamed_7826() {
        return this.cfr_renamed_0.cfr_renamed_7826();
    }

    public int cfr_renamed_2373() {
        return this.cfr_renamed_0.cfr_renamed_2373();
    }

    public void cfr_renamed_7694(sprqj arg0, sprvbh arg1) throws sprtqg {
        sprid sprid2 = arg0.cfr_renamed_2658(this.cfr_renamed_0.cfr_renamed_2373(), this.cfr_renamed_0.cfr_renamed_579());
        sprpqg sprpqg2 = this;
        this.cfr_renamed_4 = sprid2.cfr_renamed_7588(arg1);
        sprpqg2.cfr_renamed_1 = 0;
        sprpqg2.cfr_renamed_3 = this.cfr_renamed_4.cfr_renamed_470();
    }

    public long cfr_renamed_7541() {
        return this.cfr_renamed_0.cfr_renamed_7541();
    }

    private static /* synthetic */ sprfdm cfr_renamed_7675(sprtzl arg0) throws IOException {
        if (!(arg0 instanceof sprfdm)) {
            throw new IOException(new StringBuilder().insert(0, sprbzo.cfr_renamed_9("|\\lJyWjFlV)BhQbW}\u0012`\\)A}@lSd\b)")).append(arg0).toString());
        }
        return (sprfdm)arg0;
    }

    public int cfr_renamed_7576() {
        return this.cfr_renamed_0.cfr_renamed_7576();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_7827(sprzyg arg0) throws sprtqg {
        try {
            sprpqg sprpqg2 = this;
            sprpqg2.cfr_renamed_3.write(arg0.cfr_renamed_7684());
            sprpqg2.cfr_renamed_3.close();
            return this.cfr_renamed_4.cfr_renamed_1435(arg0.cfr_renamed_79());
        }
        catch (IOException iOException) {
            throw new sprtqg(new StringBuilder().insert(0, sprujha.cfr_renamed_9("c?w3z46%yqw5rqb#w8z4dk6")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_7536(byte[] arg0, int arg1, int arg2) {
        try {
            this.cfr_renamed_3.write(arg0, arg1, arg2);
            return;
        }
        catch (IOException iOException) {
            throw new spreah(iOException.getMessage(), iOException);
        }
    }

    public void cfr_renamed_2623(OutputStream arg0) throws IOException {
        sprjah.cfr_renamed_7679(arg0).cfr_renamed_7680(this.cfr_renamed_0);
    }

    public void cfr_renamed_1221(byte arg0) {
        block0: {
            block2: {
                sprpqg sprpqg2;
                block4: {
                    block3: {
                        block1: {
                            if (this.cfr_renamed_2 != 1) break block0;
                            if (arg0 != 13) break block1;
                            sprpqg sprpqg3 = this;
                            sprpqg2 = sprpqg3;
                            sprpqg3.cfr_renamed_7537((byte)13);
                            sprpqg3.cfr_renamed_7537((byte)10);
                            break block2;
                        }
                        if (arg0 != 10) break block3;
                        if (this.cfr_renamed_1 == 13) break block4;
                        sprpqg sprpqg4 = this;
                        sprpqg2 = sprpqg4;
                        sprpqg4.cfr_renamed_7537((byte)13);
                        sprpqg4.cfr_renamed_7537((byte)10);
                        break block2;
                    }
                    this.cfr_renamed_7537(arg0);
                }
                sprpqg2 = this;
            }
            sprpqg2.cfr_renamed_1 = arg0;
            return;
        }
        this.cfr_renamed_7537(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_7537(byte arg0) {
        try {
            this.cfr_renamed_3.write(arg0);
            return;
        }
        catch (IOException iOException) {
            throw new spreah(iOException.getMessage(), iOException);
        }
    }
}

