/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdtr;
import com.spire.presentation.packages.sprln;
import com.spire.presentation.packages.sprolo;
import com.spire.presentation.packages.sprphd;
import com.spire.presentation.packages.sprpj;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprqed;
import com.spire.presentation.packages.sprqk;
import com.spire.presentation.packages.sprxdd;
import com.spire.presentation.packages.sprzra;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprmhd
extends FilterInputStream {
    private sprqk cfr_renamed_132;
    private byte[] cfr_renamed_102;
    private int cfr_renamed_93;
    private byte[] cfr_renamed_86;
    private sprpj cfr_renamed_152;
    private int cfr_renamed_112;
    private byte[] cfr_renamed_119;
    private sprxdd cfr_renamed_91;
    private long cfr_renamed_0;
    private sprln cfr_renamed_1;
    private int cfr_renamed_2;
    private boolean cfr_renamed_3;
    private static final int cfr_renamed_4 = 2048;

    @Override
    public int available() throws IOException {
        sprmhd sprmhd2 = this;
        return sprmhd2.cfr_renamed_2 - sprmhd2.cfr_renamed_93;
    }

    /*
     * WARNING - void declaration
     */
    public sprmhd(InputStream inputStream, sprxdd sprxdd2, int n) {
        void arg2;
        void arg1;
        void arg0;
        sprmhd sprmhd2 = this;
        super((InputStream)arg0);
        this.cfr_renamed_91 = arg1;
        sprmhd2.cfr_renamed_86 = new byte[arg2];
        sprmhd2.cfr_renamed_1 = sprxdd2 instanceof sprln ? (sprln)arg1 : null;
    }

    @Override
    public void mark(int arg0) {
        sprmhd sprmhd2 = this;
        sprmhd2.in.mark(arg0);
        if (sprmhd2.cfr_renamed_1 != null) {
            this.cfr_renamed_0 = this.cfr_renamed_1.cfr_renamed_3274();
        }
        if (this.cfr_renamed_102 != null) {
            this.cfr_renamed_119 = new byte[this.cfr_renamed_102.length];
            System.arraycopy(this.cfr_renamed_102, 0, this.cfr_renamed_119, 0, this.cfr_renamed_102.length);
        }
        this.cfr_renamed_112 = this.cfr_renamed_93;
    }

    /*
     * WARNING - void declaration
     */
    public sprmhd(InputStream inputStream, sprpj sprpj2, int n) {
        void arg2;
        void arg1;
        void arg0;
        sprmhd sprmhd2 = this;
        super((InputStream)arg0);
        this.cfr_renamed_152 = arg1;
        sprmhd2.cfr_renamed_86 = new byte[arg2];
        sprmhd2.cfr_renamed_1 = sprpj2 instanceof sprln ? (sprln)arg1 : null;
    }

    @Override
    public boolean markSupported() {
        if (this.cfr_renamed_1 != null) {
            return this.in.markSupported();
        }
        return false;
    }

    @Override
    public int read(byte[] arg0) throws IOException {
        return this.read(arg0, 0, arg0.length);
    }

    @Override
    public void reset() throws IOException {
        if (this.cfr_renamed_1 == null) {
            throw new IOException(sprolo.cfr_renamed_9("Z\u000fI\u000e\\\u0014\u0019\u000bL\u0015MFP\u000bI\n\\\u000b\\\bMFj\rP\u0016I\u000fW\u0001z\u000fI\u000e\\\u0014\u0019\u0012VF[\u0003\u0019\u0013J\u0003]FN\u000fM\u000e\u0019\u0014\\\u0015\\\u0012\u0011O"));
        }
        sprmhd sprmhd2 = this;
        sprmhd2.in.reset();
        sprmhd2.cfr_renamed_1.cfr_renamed_3275(this.cfr_renamed_0);
        if (sprmhd2.cfr_renamed_119 != null) {
            this.cfr_renamed_102 = this.cfr_renamed_119;
        }
        this.cfr_renamed_93 = this.cfr_renamed_112;
    }

    private /* synthetic */ int cfr_renamed_2518() throws IOException {
        if (this.cfr_renamed_3) {
            return -1;
        }
        this.cfr_renamed_93 = 0;
        this.cfr_renamed_2 = 0;
        while (this.cfr_renamed_2 == 0) {
            sprmhd sprmhd2 = this;
            int n = sprmhd2.in.read(sprmhd2.cfr_renamed_86);
            if (n == -1) {
                sprmhd sprmhd3 = this;
                sprmhd3.cfr_renamed_2519();
                if (sprmhd3.cfr_renamed_2 == 0) {
                    return -1;
                }
                return this.cfr_renamed_2;
            }
            try {
                sprmhd sprmhd4 = this;
                sprmhd4.cfr_renamed_3490(n, false);
                if (sprmhd4.cfr_renamed_91 != null) {
                    sprmhd sprmhd5 = this;
                    this.cfr_renamed_2 = sprmhd5.cfr_renamed_91.cfr_renamed_505(sprmhd5.cfr_renamed_86, 0, n, this.cfr_renamed_102, 0);
                    continue;
                }
                if (this.cfr_renamed_152 != null) {
                    sprmhd sprmhd6 = this;
                    this.cfr_renamed_2 = sprmhd6.cfr_renamed_152.cfr_renamed_505(sprmhd6.cfr_renamed_86, 0, n, this.cfr_renamed_102, 0);
                    continue;
                }
                this.cfr_renamed_132.cfr_renamed_505(this.cfr_renamed_86, 0, n, this.cfr_renamed_102, 0);
                this.cfr_renamed_2 = n;
            }
            catch (Exception exception) {
                throw new sprqed(sprdtr.cfr_renamed_9("s\u001cD\u0001DNF\u001cY\rS\u001dE\u0007X\t\u0016\u001dB\u001cS\u000f[N"), exception);
            }
        }
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() throws IOException {
        block6: {
            sprmhd sprmhd2;
            block5: {
                sprmhd sprmhd3;
                try {
                    this.in.close();
                    if (this.cfr_renamed_3) break block5;
                    sprmhd3 = this;
                }
                catch (Throwable throwable) {
                    if (!this.cfr_renamed_3) {
                        this.cfr_renamed_2519();
                    }
                    throw throwable;
                }
                sprmhd2 = sprmhd3;
                sprmhd3.cfr_renamed_2519();
                break block6;
            }
            sprmhd2 = this;
        }
        this.cfr_renamed_93 = 0;
        sprmhd2.cfr_renamed_2 = 0;
        this.cfr_renamed_112 = 0;
        this.cfr_renamed_0 = 0L;
        if (this.cfr_renamed_119 != null) {
            sprzra.cfr_renamed_492(this.cfr_renamed_119, (byte)0);
            this.cfr_renamed_119 = null;
        }
        if (this.cfr_renamed_102 != null) {
            sprzra.cfr_renamed_492(this.cfr_renamed_102, (byte)0);
            this.cfr_renamed_102 = null;
        }
        sprzra.cfr_renamed_492(this.cfr_renamed_86, (byte)0);
    }

    @Override
    public long skip(long arg0) throws IOException {
        int n;
        if (arg0 <= 0L) {
            return 0L;
        }
        if (this.cfr_renamed_1 != null) {
            long l;
            int n2 = this.available();
            if (arg0 <= (long)n2) {
                this.cfr_renamed_93 = (int)((long)this.cfr_renamed_93 + arg0);
                return arg0;
            }
            sprmhd sprmhd2 = this;
            sprmhd2.cfr_renamed_93 = sprmhd2.cfr_renamed_2;
            long l2 = sprmhd2.in.skip(arg0 - (long)n2);
            if (l2 != (l = sprmhd2.cfr_renamed_1.cfr_renamed_3273(l2))) {
                throw new IOException(new StringBuilder().insert(0, sprolo.cfr_renamed_9("l\bX\u0004U\u0003\u0019\u0012VFJ\rP\u0016\u0019\u0005P\u0016Q\u0003KF")).append(l2).append(sprdtr.cfr_renamed_9("NT\u0017B\u000bE@")).toString());
            }
            return l2 + (long)n2;
        }
        int n3 = n = (int)Math.min(arg0, (long)this.available());
        this.cfr_renamed_93 += n3;
        return n3;
    }

    public sprmhd(InputStream arg0, sprxdd arg1) {
        this(arg0, arg1, 2048);
    }

    public sprmhd(InputStream arg0, sprqk arg1) {
        this(arg0, arg1, 2048);
    }

    public sprmhd(InputStream arg0, sprpj arg1) {
        this(arg0, arg1, 2048);
    }

    private /* synthetic */ void cfr_renamed_2519() throws IOException {
        try {
            this.cfr_renamed_3 = true;
            this.cfr_renamed_3490(0, true);
            if (this.cfr_renamed_91 != null) {
                this.cfr_renamed_2 = this.cfr_renamed_91.cfr_renamed_1219(this.cfr_renamed_102, 0);
                return;
            }
            if (this.cfr_renamed_152 != null) {
                this.cfr_renamed_2 = this.cfr_renamed_152.cfr_renamed_1219(this.cfr_renamed_102, 0);
                return;
            }
            this.cfr_renamed_2 = 0;
            return;
        }
        catch (sprpjd sprpjd2) {
            throw new sprphd(sprolo.cfr_renamed_9("#K\u0014V\u0014\u0019\u0000P\bX\nP\u0015P\b^FZ\u000fI\u000e\\\u0014"), sprpjd2);
        }
        catch (Exception exception) {
            throw new IOException(new StringBuilder().insert(0, sprdtr.cfr_renamed_9("s\u001cD\u0001DNP\u0007X\u000fZ\u0007E\u0007X\t\u0016\r_\u001e^\u000bDN")).append(exception).toString());
        }
    }

    @Override
    public int read() throws IOException {
        sprmhd sprmhd2 = this;
        if (sprmhd2.cfr_renamed_93 >= sprmhd2.cfr_renamed_2 && this.cfr_renamed_2518() < 0) {
            return -1;
        }
        return this.cfr_renamed_102[this.cfr_renamed_93++] & 0xFF;
    }

    /*
     * WARNING - void declaration
     */
    public sprmhd(InputStream inputStream, sprqk sprqk2, int n) {
        void arg2;
        void arg1;
        void arg0;
        sprmhd sprmhd2 = this;
        super((InputStream)arg0);
        this.cfr_renamed_132 = arg1;
        sprmhd2.cfr_renamed_86 = new byte[arg2];
        sprmhd2.cfr_renamed_1 = sprqk2 instanceof sprln ? (sprln)arg1 : null;
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void cfr_renamed_3490(int arg0, boolean arg1) {
        block6: {
            block4: {
                block5: {
                    var3_3 = arg0;
                    if (!arg1) break block4;
                    if (this.cfr_renamed_91 == null) break block5;
                    v0 = this;
                    v1 = v0;
                    var3_3 = v0.cfr_renamed_91.cfr_renamed_1202(arg0);
                    break block6;
                }
                if (this.cfr_renamed_152 == null) ** GOTO lbl22
                v2 = this;
                v1 = v2;
                var3_3 = v2.cfr_renamed_152.cfr_renamed_1202(arg0);
                break block6;
            }
            v3 = this;
            if (this.cfr_renamed_91 != null) {
                var3_3 = v3.cfr_renamed_91.cfr_renamed_2345(arg0);
                v1 = this;
            } else {
                if (v3.cfr_renamed_152 != null) {
                    var3_3 = this.cfr_renamed_152.cfr_renamed_2345(arg0);
                }
lbl22:
                // 4 sources

                v1 = this;
            }
        }
        if (v1.cfr_renamed_102 == null || this.cfr_renamed_102.length < var3_3) {
            this.cfr_renamed_102 = new byte[var3_3];
        }
    }

    @Override
    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        sprmhd sprmhd2 = this;
        if (sprmhd2.cfr_renamed_93 >= sprmhd2.cfr_renamed_2 && this.cfr_renamed_2518() < 0) {
            return -1;
        }
        int n = Math.min(arg2, this.available());
        sprmhd sprmhd3 = this;
        System.arraycopy(sprmhd3.cfr_renamed_102, sprmhd3.cfr_renamed_93, arg0, arg1, n);
        int n2 = n;
        sprmhd3.cfr_renamed_93 += n2;
        return n2;
    }
}

