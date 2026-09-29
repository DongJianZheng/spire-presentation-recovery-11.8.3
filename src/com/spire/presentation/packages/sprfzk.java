/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdbl;
import com.spire.presentation.packages.sprft;
import com.spire.presentation.packages.sprirk;
import com.spire.presentation.packages.sprosc;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprvv;
import com.spire.presentation.packages.sprwzk;
import com.spire.presentation.packages.sprxhj;
import com.spire.presentation.packages.sprzu;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprfzk
extends FilterInputStream {
    private sprzu cfr_renamed_132;
    private int cfr_renamed_102;
    private boolean cfr_renamed_93;
    private sprft cfr_renamed_86;
    private int cfr_renamed_152;
    private sprvv cfr_renamed_112;
    private byte[] cfr_renamed_119;
    private sprirk cfr_renamed_91;
    private static final int cfr_renamed_0 = 2048;
    private int cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private long cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprfzk(InputStream inputStream, sprirk sprirk2, int n) {
        void arg2;
        void arg1;
        void arg0;
        sprfzk sprfzk2 = this;
        super((InputStream)arg0);
        this.cfr_renamed_91 = arg1;
        sprfzk2.cfr_renamed_3 = new byte[arg2];
        sprfzk2.cfr_renamed_86 = sprirk2 instanceof sprft ? (sprft)arg1 : null;
    }

    private /* synthetic */ void cfr_renamed_2519() throws IOException {
        try {
            this.cfr_renamed_93 = true;
            this.cfr_renamed_3490(0, true);
            if (this.cfr_renamed_91 != null) {
                this.cfr_renamed_102 = this.cfr_renamed_91.cfr_renamed_1219(this.cfr_renamed_119, 0);
                return;
            }
            if (this.cfr_renamed_132 != null) {
                this.cfr_renamed_102 = this.cfr_renamed_132.cfr_renamed_1219(this.cfr_renamed_119, 0);
                return;
            }
            this.cfr_renamed_102 = 0;
            return;
        }
        catch (sprull sprull2) {
            throw new sprdbl(sprxhj.cfr_renamed_9("7=\u0000 \u0000o\u0014&\u001c.\u001e&\u0001&\u001c(R,\u001b?\u001a*\u0000"), sprull2);
        }
        catch (Exception exception) {
            throw new IOException(new StringBuilder().insert(0, sprosc.cfr_renamed_9("&X\u0011E\u0011\n\u0005C\rK\u000fC\u0010C\rMCI\nZ\u000bO\u0011\n")).append(exception).toString());
        }
    }

    @Override
    public int read() throws IOException {
        sprfzk sprfzk2 = this;
        if (sprfzk2.cfr_renamed_152 >= sprfzk2.cfr_renamed_102 && this.cfr_renamed_2518() < 0) {
            return -1;
        }
        return this.cfr_renamed_119[this.cfr_renamed_152++] & 0xFF;
    }

    public sprfzk(InputStream arg0, sprvv arg1) {
        this(arg0, arg1, 2048);
    }

    @Override
    public int available() throws IOException {
        sprfzk sprfzk2 = this;
        return sprfzk2.cfr_renamed_102 - sprfzk2.cfr_renamed_152;
    }

    @Override
    public int read(byte[] arg0) throws IOException {
        return this.read(arg0, 0, arg0.length);
    }

    @Override
    public void reset() throws IOException {
        if (this.cfr_renamed_86 == null) {
            throw new IOException(sprxhj.cfr_renamed_9(",\u001b?\u001a*\u0000o\u001f:\u0001;R&\u001f?\u001e*\u001f*\u001c;R\u001c\u0019&\u0002?\u001b!\u0015\f\u001b?\u001a*\u0000o\u0006 R-\u0017o\u0007<\u0017+R8\u001b;\u001ao\u0000*\u0001*\u0006g["));
        }
        sprfzk sprfzk2 = this;
        sprfzk2.in.reset();
        sprfzk2.cfr_renamed_86.cfr_renamed_3275(this.cfr_renamed_4);
        if (sprfzk2.cfr_renamed_2 != null) {
            this.cfr_renamed_119 = this.cfr_renamed_2;
        }
        this.cfr_renamed_152 = this.cfr_renamed_1;
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
            sprfzk sprfzk2;
            block5: {
                sprfzk sprfzk3;
                try {
                    this.in.close();
                    if (this.cfr_renamed_93) break block5;
                    sprfzk3 = this;
                }
                catch (Throwable throwable) {
                    if (!this.cfr_renamed_93) {
                        this.cfr_renamed_2519();
                    }
                    throw throwable;
                }
                sprfzk2 = sprfzk3;
                sprfzk3.cfr_renamed_2519();
                break block6;
            }
            sprfzk2 = this;
        }
        this.cfr_renamed_152 = 0;
        sprfzk2.cfr_renamed_102 = 0;
        this.cfr_renamed_1 = 0;
        this.cfr_renamed_4 = 0L;
        if (this.cfr_renamed_2 != null) {
            sproze.cfr_renamed_492(this.cfr_renamed_2, (byte)0);
            this.cfr_renamed_2 = null;
        }
        if (this.cfr_renamed_119 != null) {
            sproze.cfr_renamed_492(this.cfr_renamed_119, (byte)0);
            this.cfr_renamed_119 = null;
        }
        sproze.cfr_renamed_492(this.cfr_renamed_3, (byte)0);
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
                if (this.cfr_renamed_132 == null) ** GOTO lbl22
                v2 = this;
                v1 = v2;
                var3_3 = v2.cfr_renamed_132.cfr_renamed_1202(arg0);
                break block6;
            }
            v3 = this;
            if (this.cfr_renamed_91 != null) {
                var3_3 = v3.cfr_renamed_91.cfr_renamed_2345(arg0);
                v1 = this;
            } else {
                if (v3.cfr_renamed_132 != null) {
                    var3_3 = this.cfr_renamed_132.cfr_renamed_2345(arg0);
                }
lbl22:
                // 4 sources

                v1 = this;
            }
        }
        if (v1.cfr_renamed_119 == null || this.cfr_renamed_119.length < var3_3) {
            this.cfr_renamed_119 = new byte[var3_3];
        }
    }

    @Override
    public boolean markSupported() {
        if (this.cfr_renamed_86 != null) {
            return this.in.markSupported();
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public sprfzk(InputStream inputStream, sprvv sprvv2, int n) {
        void arg2;
        void arg1;
        void arg0;
        sprfzk sprfzk2 = this;
        super((InputStream)arg0);
        this.cfr_renamed_112 = arg1;
        sprfzk2.cfr_renamed_3 = new byte[arg2];
        sprfzk2.cfr_renamed_86 = sprvv2 instanceof sprft ? (sprft)arg1 : null;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ (2 << 2 ^ 1);
        int cfr_ignored_0 = (3 ^ 5) << 3 ^ 3;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 5;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    @Override
    public void mark(int arg0) {
        sprfzk sprfzk2 = this;
        sprfzk2.in.mark(arg0);
        if (sprfzk2.cfr_renamed_86 != null) {
            this.cfr_renamed_4 = this.cfr_renamed_86.cfr_renamed_3274();
        }
        if (this.cfr_renamed_119 != null) {
            this.cfr_renamed_2 = new byte[this.cfr_renamed_119.length];
            System.arraycopy(this.cfr_renamed_119, 0, this.cfr_renamed_2, 0, this.cfr_renamed_119.length);
        }
        this.cfr_renamed_1 = this.cfr_renamed_152;
    }

    public sprfzk(InputStream arg0, sprirk arg1) {
        this(arg0, arg1, 2048);
    }

    @Override
    public long skip(long arg0) throws IOException {
        int n;
        if (arg0 <= 0L) {
            return 0L;
        }
        if (this.cfr_renamed_86 != null) {
            long l;
            int n2 = this.available();
            if (arg0 <= (long)n2) {
                this.cfr_renamed_152 = (int)((long)this.cfr_renamed_152 + arg0);
                return arg0;
            }
            sprfzk sprfzk2 = this;
            sprfzk2.cfr_renamed_152 = sprfzk2.cfr_renamed_102;
            long l2 = sprfzk2.in.skip(arg0 - (long)n2);
            if (l2 != (l = sprfzk2.cfr_renamed_86.cfr_renamed_3273(l2))) {
                throw new IOException(new StringBuilder().insert(0, sprosc.cfr_renamed_9("6D\u0002H\u000fOC^\f\n\u0010A\nZCI\nZ\u000bO\u0011\n")).append(l2).append(sprxhj.cfr_renamed_9("R-\u000b;\u0017<\\")).toString());
            }
            return l2 + (long)n2;
        }
        int n3 = n = (int)Math.min(arg0, (long)this.available());
        this.cfr_renamed_152 += n3;
        return n3;
    }

    /*
     * WARNING - void declaration
     */
    public sprfzk(InputStream inputStream, sprzu sprzu2, int n) {
        void arg2;
        void arg1;
        void arg0;
        sprfzk sprfzk2 = this;
        super((InputStream)arg0);
        this.cfr_renamed_132 = arg1;
        sprfzk2.cfr_renamed_3 = new byte[arg2];
        sprfzk2.cfr_renamed_86 = sprzu2 instanceof sprft ? (sprft)arg1 : null;
    }

    private /* synthetic */ int cfr_renamed_2518() throws IOException {
        if (this.cfr_renamed_93) {
            return -1;
        }
        this.cfr_renamed_152 = 0;
        this.cfr_renamed_102 = 0;
        while (this.cfr_renamed_102 == 0) {
            sprfzk sprfzk2 = this;
            int n = sprfzk2.in.read(sprfzk2.cfr_renamed_3);
            if (n == -1) {
                sprfzk sprfzk3 = this;
                sprfzk3.cfr_renamed_2519();
                if (sprfzk3.cfr_renamed_102 == 0) {
                    return -1;
                }
                return this.cfr_renamed_102;
            }
            try {
                sprfzk sprfzk4 = this;
                sprfzk4.cfr_renamed_3490(n, false);
                if (sprfzk4.cfr_renamed_91 != null) {
                    sprfzk sprfzk5 = this;
                    this.cfr_renamed_102 = sprfzk5.cfr_renamed_91.cfr_renamed_505(sprfzk5.cfr_renamed_3, 0, n, this.cfr_renamed_119, 0);
                    continue;
                }
                if (this.cfr_renamed_132 != null) {
                    sprfzk sprfzk6 = this;
                    this.cfr_renamed_102 = sprfzk6.cfr_renamed_132.cfr_renamed_505(sprfzk6.cfr_renamed_3, 0, n, this.cfr_renamed_119, 0);
                    continue;
                }
                this.cfr_renamed_112.cfr_renamed_505(this.cfr_renamed_3, 0, n, this.cfr_renamed_119, 0);
                this.cfr_renamed_102 = n;
            }
            catch (Exception exception) {
                throw new sprwzk(sprosc.cfr_renamed_9("&X\u0011E\u0011\n\u0013X\fI\u0006Y\u0010C\rMCY\u0017X\u0006K\u000e\n"), exception);
            }
        }
        return this.cfr_renamed_102;
    }

    @Override
    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        sprfzk sprfzk2 = this;
        if (sprfzk2.cfr_renamed_152 >= sprfzk2.cfr_renamed_102 && this.cfr_renamed_2518() < 0) {
            return -1;
        }
        int n = Math.min(arg2, this.available());
        sprfzk sprfzk3 = this;
        System.arraycopy(sprfzk3.cfr_renamed_119, sprfzk3.cfr_renamed_152, arg0, arg1, n);
        int n2 = n;
        sprfzk3.cfr_renamed_152 += n2;
        return n2;
    }

    public sprfzk(InputStream arg0, sprzu arg1) {
        this(arg0, arg1, 2048);
    }
}

