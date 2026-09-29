/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkoe;
import java.io.IOException;
import java.io.InputStream;

public class sprpgh
extends InputStream {
    private int cfr_renamed_119;
    private final byte[] cfr_renamed_91;
    private boolean cfr_renamed_0;
    private int cfr_renamed_1;
    private final InputStream cfr_renamed_2;
    private int cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprpgh(InputStream inputStream, String string) {
        void arg0;
        void arg1;
        sprpgh sprpgh2 = this;
        void v1 = arg1;
        sprpgh sprpgh3 = this;
        sprpgh sprpgh4 = this;
        sprpgh4.cfr_renamed_3 = 0;
        sprpgh4.cfr_renamed_119 = 0;
        sprpgh3.cfr_renamed_0 = 0;
        sprpgh3.cfr_renamed_2 = arg0;
        this.cfr_renamed_91 = sprkoe.cfr_renamed_433((String)v1);
        sprpgh2.cfr_renamed_4 = new byte[v1.length() + 3];
        sprpgh2.cfr_renamed_3 = 0;
    }

    @Override
    public int read() throws IOException {
        int n;
        block13: {
            int n2;
            int n3;
            block16: {
                block15: {
                    block14: {
                        sprpgh sprpgh2;
                        if (this.cfr_renamed_0) {
                            return -1;
                        }
                        sprpgh sprpgh3 = this;
                        if (sprpgh3.cfr_renamed_119 < sprpgh3.cfr_renamed_3) {
                            n = this.cfr_renamed_4[this.cfr_renamed_119++] & 0xFF;
                            sprpgh sprpgh4 = this;
                            if (sprpgh4.cfr_renamed_119 < sprpgh4.cfr_renamed_3) {
                                return n;
                            }
                            sprpgh sprpgh5 = this;
                            sprpgh5.cfr_renamed_3 = 0;
                            sprpgh5.cfr_renamed_119 = 0;
                            sprpgh2 = this;
                        } else {
                            sprpgh sprpgh6 = this;
                            sprpgh2 = sprpgh6;
                            n = sprpgh6.cfr_renamed_2.read();
                        }
                        sprpgh2.cfr_renamed_1 = n;
                        if (n < 0) {
                            return -1;
                        }
                        if (n != 13 && n != 10) break block13;
                        this.cfr_renamed_119 = 0;
                        if (n != 13) break block14;
                        n3 = this.cfr_renamed_2.read();
                        if (n3 != 10) break block15;
                        this.cfr_renamed_4[this.cfr_renamed_3++] = 10;
                        n2 = n3 = this.cfr_renamed_2.read();
                        break block16;
                    }
                    n3 = this.cfr_renamed_2.read();
                }
                n2 = n3;
            }
            if (n2 == 45) {
                this.cfr_renamed_4[this.cfr_renamed_3++] = 45;
                n3 = this.cfr_renamed_2.read();
            }
            if (n3 == 45) {
                sprpgh sprpgh7;
                int n4;
                block12: {
                    int n5;
                    this.cfr_renamed_4[this.cfr_renamed_3++] = 45;
                    sprpgh sprpgh8 = this;
                    sprpgh sprpgh9 = sprpgh8;
                    n4 = sprpgh8.cfr_renamed_3;
                    while (sprpgh9.cfr_renamed_3 - n4 != this.cfr_renamed_91.length && (n5 = this.cfr_renamed_2.read()) >= 0) {
                        sprpgh sprpgh10 = this;
                        this.cfr_renamed_4[sprpgh10.cfr_renamed_3] = (byte)n5;
                        sprpgh sprpgh11 = this;
                        if (sprpgh10.cfr_renamed_4[this.cfr_renamed_3] != sprpgh11.cfr_renamed_91[sprpgh11.cfr_renamed_3 - n4]) {
                            sprpgh sprpgh12 = this;
                            sprpgh7 = sprpgh12;
                            ++sprpgh12.cfr_renamed_3;
                            break block12;
                        }
                        sprpgh sprpgh13 = this;
                        sprpgh9 = sprpgh13;
                        ++sprpgh13.cfr_renamed_3;
                    }
                    sprpgh7 = this;
                }
                if (sprpgh7.cfr_renamed_3 - n4 == this.cfr_renamed_91.length) {
                    this.cfr_renamed_0 = true;
                    return -1;
                }
            } else if (n3 >= 0) {
                this.cfr_renamed_4[this.cfr_renamed_3++] = (byte)n3;
            }
        }
        return n;
    }
}

