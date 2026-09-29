/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.data.table.DataColumn;
import com.spire.presentation.packages.sprafm;
import com.spire.presentation.packages.sprdbm;
import com.spire.presentation.packages.sprfdm;
import com.spire.presentation.packages.sprifm;
import com.spire.presentation.packages.sprjdm;
import com.spire.presentation.packages.sprjem;
import com.spire.presentation.packages.sprkfm;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprmhm;
import com.spire.presentation.packages.sprmim;
import com.spire.presentation.packages.sprnem;
import com.spire.presentation.packages.sprnzl;
import com.spire.presentation.packages.sproam;
import com.spire.presentation.packages.sprojm;
import com.spire.presentation.packages.sprpam;
import com.spire.presentation.packages.sprpyl;
import com.spire.presentation.packages.sprtzl;
import com.spire.presentation.packages.sprucm;
import com.spire.presentation.packages.spruim;
import com.spire.presentation.packages.sprvgm;
import com.spire.presentation.packages.sprwdm;
import com.spire.presentation.packages.sprwem;
import com.spire.presentation.packages.sprxam;
import com.spire.presentation.packages.sprxcm;
import com.spire.presentation.packages.sprxm;
import com.spire.presentation.packages.sprywh;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class sprmam
extends InputStream
implements sprxm {
    public int cfr_renamed_0;
    public boolean cfr_renamed_1;
    public InputStream cfr_renamed_2;
    public int cfr_renamed_3;
    public boolean cfr_renamed_4;

    @Override
    public int available() throws IOException {
        return this.cfr_renamed_2.available();
    }

    public void cfr_renamed_4932(byte[] arg0) throws IOException {
        this.cfr_renamed_11040(arg0, 0, arg0.length);
    }

    public byte[] cfr_renamed_145() throws IOException {
        return sprkqe.cfr_renamed_471(this);
    }

    @Override
    public synchronized void mark(int arg0) {
        sprmam sprmam2 = this;
        sprmam2.cfr_renamed_4 = sprmam2.cfr_renamed_1;
        sprmam2.cfr_renamed_3 = sprmam2.cfr_renamed_0;
        sprmam2.cfr_renamed_2.mark(arg0);
    }

    public void cfr_renamed_11040(byte[] arg0, int arg1, int arg2) throws IOException {
        if (sprkqe.cfr_renamed_473(this, arg0, arg1, arg2) < arg2) {
            throw new EOFException();
        }
    }

    public int cfr_renamed_11093() throws IOException {
        return this.cfr_renamed_7731();
    }

    public static sprmam cfr_renamed_7730(InputStream arg0) {
        if (arg0 instanceof sprmam) {
            return (sprmam)arg0;
        }
        return new sprmam(arg0);
    }

    @Override
    public void close() throws IOException {
        this.cfr_renamed_2.close();
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprtzl cfr_renamed_7676() throws IOException {
        int n;
        sprmam sprmam2;
        int n2;
        boolean bl;
        int n3;
        int n4;
        block40: {
            block37: {
                int n5;
                int n6;
                block38: {
                    block39: {
                        n6 = this.read();
                        if (n6 < 0) {
                            return null;
                        }
                        if ((n6 & 0x80) == 0) {
                            throw new IOException(DataColumn.cfr_renamed_9("\u0018\u001c\u0007\u0013\u001d\u001b\u0015R\u0019\u0017\u0010\u0016\u0014\u0000Q\u0017\u001f\u0011\u001e\u0007\u001f\u0006\u0014\u0000\u0014\u0016"));
                        }
                        boolean bl2 = (n6 & 0x40) != 0;
                        n4 = 0;
                        n3 = 0;
                        bl = false;
                        if (!bl2) break block38;
                        n4 = n6 & 0x3F;
                        n5 = this.read();
                        if (n5 >= 192) break block39;
                        n3 = n5;
                        break block37;
                    }
                    if (n5 <= 223) {
                        int n7 = this.read();
                        n3 = (n5 - 192 << 8) + n7 + 192;
                        break block37;
                    } else if (n5 == 255) {
                        n3 = this.read() << 24 | this.read() << 16 | this.read() << 8 | this.read();
                        break block37;
                    } else {
                        bl = true;
                        n3 = 1 << (n5 & 0x1F);
                    }
                    break block37;
                }
                n5 = n6 & 3;
                n4 = (n6 & 0x3F) >> 2;
                switch (n5) {
                    case 0: {
                        n2 = n3 = this.read();
                        break block40;
                    }
                    case 1: {
                        n2 = n3 = this.read() << 8 | this.read();
                        break block40;
                    }
                    case 2: {
                        n2 = n3 = this.read() << 24 | this.read() << 16 | this.read() << 8 | this.read();
                        break block40;
                    }
                    case 3: {
                        bl = true;
                        n2 = n3;
                        break block40;
                    }
                    default: {
                        throw new IOException(sprywh.cfr_renamed_9("o)q)u0tgv\"t n/:3c7\u007fg\u007f)y(o)n\"h\"~"));
                    }
                }
            }
            n2 = n3;
        }
        if (n2 == 0 && bl) {
            sprmam2 = this;
            n = n4;
        } else {
            sprmam2 = new sprmam(new BufferedInputStream(new sprafm(this, bl, n3)));
            n = n4;
        }
        switch (n) {
            case 0: {
                return new sprxam(sprmam2);
            }
            case 1: {
                return new sprmim(sprmam2);
            }
            case 2: {
                return new sprxcm(sprmam2);
            }
            case 3: {
                return new sprjem(sprmam2);
            }
            case 4: {
                return new sprfdm(sprmam2);
            }
            case 5: {
                return new sprkfm(sprmam2);
            }
            case 6: {
                return new sprifm(sprmam2);
            }
            case 7: {
                return new sprwem(sprmam2);
            }
            case 8: {
                return new sprjdm(sprmam2);
            }
            case 9: {
                return new sprwdm(sprmam2);
            }
            case 10: {
                return new sprpyl(sprmam2);
            }
            case 11: {
                return new sprucm(sprmam2);
            }
            case 12: {
                return new sprmhm(sprmam2);
            }
            case 13: {
                return new sprdbm(sprmam2);
            }
            case 17: {
                return new sprnzl(sprmam2);
            }
            case 14: {
                return new sprpam(sprmam2);
            }
            case 18: {
                return new sproam(sprmam2);
            }
            case 19: {
                return new sprnem(sprmam2);
            }
            case 20: {
                return new sprojm(sprmam2);
            }
            case 21: {
                return new spruim(sprmam2);
            }
            case 60: 
            case 61: 
            case 62: 
            case 63: {
                return new sprvgm(n4, sprmam2);
            }
        }
        throw new IOException(new StringBuilder().insert(0, DataColumn.cfr_renamed_9("\u0007\u001f\u0019\u001f\u001d\u0006\u001cQ\u0002\u0010\u0011\u001a\u0017\u0005R\u0005\u000b\u0001\u0017Q\u0017\u001f\u0011\u001e\u0007\u001f\u0006\u0014\u0000\u0014\u0016KR")).append(n4).toString());
    }

    @Override
    public synchronized void reset() throws IOException {
        sprmam sprmam2 = this;
        sprmam2.cfr_renamed_1 = sprmam2.cfr_renamed_4;
        sprmam2.cfr_renamed_0 = sprmam2.cfr_renamed_3;
        sprmam2.cfr_renamed_2.reset();
    }

    @Override
    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 == 0) {
            return 0;
        }
        if (!this.cfr_renamed_1) {
            return this.cfr_renamed_2.read(arg0, arg1, arg2);
        }
        if (this.cfr_renamed_0 < 0) {
            return -1;
        }
        arg0[arg1] = (byte)this.cfr_renamed_0;
        this.cfr_renamed_1 = false;
        return 1;
    }

    @Override
    public boolean markSupported() {
        return this.cfr_renamed_2.markSupported();
    }

    public sprmam(InputStream inputStream) {
        sprmam sprmam2 = this;
        this.cfr_renamed_1 = false;
        sprmam2.cfr_renamed_4 = false;
        sprmam2.cfr_renamed_2 = inputStream;
    }

    public int cfr_renamed_7731() throws IOException {
        int n;
        sprmam sprmam2 = this;
        while ((n = sprmam2.cfr_renamed_7534()) == 10 || n == 21) {
            sprmam sprmam3 = this;
            sprmam2 = sprmam3;
            sprmam3.cfr_renamed_7676();
        }
        return n;
    }

    @Override
    public int read() throws IOException {
        if (this.cfr_renamed_1) {
            this.cfr_renamed_1 = false;
            return this.cfr_renamed_0;
        }
        return this.cfr_renamed_2.read();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int cfr_renamed_7534() throws IOException {
        if (!this.cfr_renamed_1) {
            sprmam sprmam2;
            try {
                this.cfr_renamed_0 = this.cfr_renamed_2.read();
                sprmam2 = this;
            }
            catch (EOFException eOFException) {
                sprmam2 = this;
                this.cfr_renamed_0 = -1;
            }
            sprmam2.cfr_renamed_1 = true;
        }
        if (this.cfr_renamed_0 < 0) {
            return this.cfr_renamed_0;
        }
        sprmam sprmam3 = this;
        int n = sprmam3.cfr_renamed_0 & 0x3F;
        if ((sprmam3.cfr_renamed_0 & 0x40) == 0) {
            n >>= 2;
        }
        return n;
    }
}

