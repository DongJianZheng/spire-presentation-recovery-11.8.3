/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprajm;
import com.spire.presentation.packages.sprcim;
import com.spire.presentation.packages.sprkfz;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlgm;
import com.spire.presentation.packages.sprnxe;
import com.spire.presentation.packages.sprwi;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class spriam
extends InputStream {
    public int cfr_renamed_137;
    public boolean cfr_renamed_79;
    public boolean cfr_renamed_107;
    public boolean cfr_renamed_132;
    public sprcim cfr_renamed_102;
    public InputStream cfr_renamed_93;
    public boolean cfr_renamed_86;
    public String cfr_renamed_152;
    public sprwi cfr_renamed_112;
    private static final byte[] cfr_renamed_119;
    private boolean cfr_renamed_91;
    public boolean cfr_renamed_0;
    public boolean cfr_renamed_1;
    public boolean cfr_renamed_2;
    public byte[] cfr_renamed_3;
    public int cfr_renamed_4;

    @Override
    public int available() throws IOException {
        return this.cfr_renamed_93.available();
    }

    private /* synthetic */ boolean cfr_renamed_11103() throws IOException {
        int n;
        boolean bl;
        boolean bl2;
        int n2;
        block18: {
            this.cfr_renamed_152 = null;
            n2 = 0;
            bl2 = false;
            this.cfr_renamed_112 = sprkoe.cfr_renamed_5145();
            if (this.cfr_renamed_132) {
                bl = bl2 = true;
            } else {
                spriam spriam2 = this;
                while ((n = spriam2.cfr_renamed_93.read()) >= 0) {
                    if (n == 45 && (n2 == 0 || n2 == 10 || n2 == 13)) {
                        bl = bl2 = true;
                        break block18;
                    }
                    n2 = n;
                    spriam2 = this;
                }
                bl = bl2;
            }
        }
        if (bl) {
            int n3;
            boolean bl3;
            block19: {
                boolean bl4 = false;
                boolean bl5 = false;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(45);
                if (this.cfr_renamed_132) {
                    byteArrayOutputStream.write(45);
                }
                spriam spriam3 = this;
                while ((n = spriam3.cfr_renamed_93.read()) >= 0) {
                    int n4;
                    if (n2 == 13 && n == 10) {
                        bl5 = true;
                    }
                    if (bl4 && n2 != 13 && n == 10) {
                        bl3 = bl5;
                        break block19;
                    }
                    if (bl4 && n == 13) {
                        bl3 = bl5;
                        break block19;
                    }
                    if (n == 13 || n2 != 13 && n == 10) {
                        String string = sprkoe.cfr_renamed_427(byteArrayOutputStream.toByteArray());
                        if (string.trim().length() == 0) {
                            bl3 = bl5;
                            break block19;
                        }
                        if (this.cfr_renamed_112.size() != 0 && string.indexOf(58) < 0) {
                            throw new sprlgm(sprnxe.cfr_renamed_9("\u0010\u0013\u000f\u001c\u0015\u0014\u001d]\u0018\u000f\u0014\u0012\u000b]\u0011\u0018\u0018\u0019\u001c\u000f"));
                        }
                        this.cfr_renamed_112.cfr_renamed_4693(string);
                        byteArrayOutputStream.reset();
                    }
                    if (n != 10 && n != 13) {
                        byteArrayOutputStream.write(n);
                        bl4 = false;
                        n4 = n;
                    } else {
                        if (n == 13 || n2 != 13 && n == 10) {
                            bl4 = true;
                        }
                        n4 = n;
                    }
                    n2 = n4;
                    spriam3 = this;
                }
                bl3 = bl5;
            }
            if (bl3 && (n3 = this.cfr_renamed_93.read()) != 10) {
                throw new sprlgm(sprkfz.cfr_renamed_9("B6H7E+B+_=E,\u000b4B6NxN6O1E?XxB6\u000b0N9O=Y+"));
            }
        }
        if (this.cfr_renamed_112.size() > 0) {
            this.cfr_renamed_152 = this.cfr_renamed_112.cfr_renamed_576(0);
        }
        this.cfr_renamed_79 = sprnxe.cfr_renamed_9("TPTPT?<:03Y->-Y.0:78=]48*.8:<PTPTP").equals(this.cfr_renamed_152);
        this.cfr_renamed_1 = true;
        return bl2;
    }

    public String[] cfr_renamed_11104() {
        if (this.cfr_renamed_112.size() <= 1) {
            return null;
        }
        return this.cfr_renamed_112.cfr_renamed_5151(1, this.cfr_renamed_112.size());
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int read() throws IOException {
        spriam spriam2;
        if (this.cfr_renamed_2) {
            if (this.cfr_renamed_107) {
                this.cfr_renamed_11103();
            }
            this.cfr_renamed_102.cfr_renamed_41();
            this.cfr_renamed_2 = false;
        }
        if (this.cfr_renamed_79) {
            spriam spriam3;
            int n = this.cfr_renamed_93.read();
            if (n == 13 || n == 10 && this.cfr_renamed_4 != 13) {
                spriam3 = this;
                this.cfr_renamed_1 = true;
            } else if (this.cfr_renamed_1 && n == 45) {
                spriam spriam4;
                n = this.cfr_renamed_93.read();
                if (n == 45) {
                    spriam4 = this;
                    this.cfr_renamed_79 = false;
                    this.cfr_renamed_2 = true;
                    this.cfr_renamed_132 = true;
                } else {
                    spriam spriam5 = this;
                    spriam4 = spriam5;
                    n = spriam5.cfr_renamed_93.read();
                }
                spriam4.cfr_renamed_1 = false;
                spriam3 = this;
            } else {
                if (n != 10 && this.cfr_renamed_4 != 13) {
                    this.cfr_renamed_1 = false;
                }
                spriam3 = this;
            }
            spriam3.cfr_renamed_4 = n;
            if (n >= 0) return n;
            this.cfr_renamed_86 = true;
            return n;
        }
        if (this.cfr_renamed_137 > 2 || this.cfr_renamed_0) {
            int n;
            int n2 = this.cfr_renamed_8530();
            if (n2 == 13 || n2 == 10) {
                int n3 = n2 = this.cfr_renamed_8530();
                while (n3 == 10 || n2 == 13) {
                    n3 = this.cfr_renamed_8530();
                }
                if (n2 == 61) {
                    spriam spriam6 = this;
                    this.cfr_renamed_137 = spriam.cfr_renamed_11105(this.cfr_renamed_8530(), spriam6.cfr_renamed_8530(), this.cfr_renamed_8530(), this.cfr_renamed_8530(), this.cfr_renamed_3);
                    if (spriam6.cfr_renamed_137 != 0) {
                        throw new sprlgm(sprkfz.cfr_renamed_9("F9G>D*F=OxH*HxB6\u000b9Y5D*N<\u000b5N+X9L="));
                    }
                    this.cfr_renamed_0 = true;
                    int n4 = (this.cfr_renamed_3[0] & 0xFF) << 16 | (this.cfr_renamed_3[1] & 0xFF) << 8 | this.cfr_renamed_3[2] & 0xFF;
                    if (n4 == this.cfr_renamed_102.cfr_renamed_97()) return this.read();
                    throw new sprlgm(sprnxe.cfr_renamed_9("\u001e\u000b\u001eY\u001e\u0011\u0018\u001a\u0016Y\u001b\u0018\u0014\u0015\u0018\u001d]\u0010\u0013Y\u001c\u000b\u0010\u0016\u000f\u001c\u0019Y\u0010\u001c\u000e\n\u001c\u001e\u0018"));
                }
                if (n2 == 45) {
                    spriam spriam7;
                    block21: {
                        while ((n2 = this.cfr_renamed_93.read()) >= 0 && n2 != 10) {
                            if (n2 != 13) continue;
                            spriam7 = this;
                            break block21;
                        }
                        spriam7 = this;
                    }
                    if (!spriam7.cfr_renamed_0 && this.cfr_renamed_91) {
                        throw new sprlgm(sprkfz.cfr_renamed_9(";Y;\u000b;C=H3\u000b6D,\u000b>D-E<"));
                    }
                    spriam spriam8 = this;
                    spriam8.cfr_renamed_0 = false;
                    spriam8.cfr_renamed_2 = true;
                    this.cfr_renamed_137 = 3;
                    if (n2 >= 0) return -1;
                    this.cfr_renamed_86 = true;
                    return -1;
                }
            }
            if (n2 < 0) {
                this.cfr_renamed_86 = true;
                return -1;
            }
            this.cfr_renamed_137 = spriam.cfr_renamed_11105(n2, this.cfr_renamed_8530(), this.cfr_renamed_8530(), this.cfr_renamed_8530(), this.cfr_renamed_3);
            spriam spriam9 = this;
            if (this.cfr_renamed_137 == 0) {
                spriam9.cfr_renamed_102.cfr_renamed_11083(this.cfr_renamed_3, 0);
                spriam2 = this;
                return spriam2.cfr_renamed_3[this.cfr_renamed_137++] & 0xFF;
            }
            int n5 = n = spriam9.cfr_renamed_137;
            while (n5 < 3) {
                spriam spriam10 = this;
                byte by = spriam10.cfr_renamed_3[n];
                spriam10.cfr_renamed_102.cfr_renamed_11084(by & 0xFF);
                n5 = ++n;
            }
        }
        spriam2 = this;
        return spriam2.cfr_renamed_3[this.cfr_renamed_137++] & 0xFF;
    }

    private /* synthetic */ int cfr_renamed_8530() throws IOException {
        int n;
        int n2 = n = this.cfr_renamed_93.read();
        while (n2 == 32 || n == 9 || n == 12 || n == 11) {
            n2 = this.cfr_renamed_93.read();
        }
        if (n >= 128) {
            throw new sprlgm(sprnxe.cfr_renamed_9("\u0014\u0017\u000b\u0018\u0011\u0010\u0019Y\u001c\u000b\u0010\u0016\u000f"));
        }
        return n;
    }

    public void cfr_renamed_11106(boolean arg0) {
        this.cfr_renamed_91 = arg0;
    }

    public String cfr_renamed_11107() {
        return this.cfr_renamed_152;
    }

    public boolean cfr_renamed_8093() {
        return this.cfr_renamed_79;
    }

    private /* synthetic */ void cfr_renamed_11108(int arg0, int arg1, int arg2) {
        if (arg1 < 0 || arg2 < 0) {
            throw new IndexOutOfBoundsException(sprkfz.cfr_renamed_9("\u0017M>X=_xJ6OxG=E?_0\u000b;J6E7_xI=\u000b6N?J,B.Nv"));
        }
        if (arg1 > arg0 - arg2) {
            throw new IndexOutOfBoundsException(sprnxe.cfr_renamed_9("0\u0013\u000f\u001c\u0015\u0014\u001d]\u0016\u001b\u001f\u000e\u001c\tY\u001c\u0017\u0019Y\u0011\u001c\u0013\u001e\t\u0011S"));
        }
    }

    public spriam(InputStream arg0, boolean arg1) throws IOException {
        spriam spriam2 = this;
        spriam spriam3 = this;
        spriam spriam4 = this;
        spriam spriam5 = this;
        spriam spriam6 = this;
        spriam spriam7 = this;
        spriam7.cfr_renamed_91 = false;
        spriam7.cfr_renamed_2 = true;
        spriam6.cfr_renamed_3 = new byte[3];
        spriam6.cfr_renamed_137 = 3;
        spriam spriam8 = this;
        spriam6.cfr_renamed_102 = new sprajm();
        spriam5.cfr_renamed_0 = false;
        spriam5.cfr_renamed_107 = true;
        spriam4.cfr_renamed_152 = null;
        spriam4.cfr_renamed_1 = false;
        spriam3.cfr_renamed_79 = false;
        spriam3.cfr_renamed_132 = false;
        spriam3.cfr_renamed_112 = sprkoe.cfr_renamed_5145();
        spriam2.cfr_renamed_4 = 0;
        spriam2.cfr_renamed_93 = arg0;
        this.cfr_renamed_107 = arg1;
        if (this.cfr_renamed_107) {
            this.cfr_renamed_11103();
        }
        this.cfr_renamed_2 = false;
    }

    @Override
    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        int n;
        this.cfr_renamed_11108(arg0.length, arg1, arg2);
        if (arg2 == 0) {
            return 0;
        }
        int n2 = this.read();
        if (n2 == -1) {
            return -1;
        }
        arg0[arg1] = (byte)n2;
        int n3 = n = 1;
        while (n3 < arg2) {
            n2 = this.read();
            if (n2 == -1) {
                return n;
            }
            int n4 = arg1 + n;
            arg0[n4] = (byte)n2;
            n3 = ++n;
        }
        return n;
    }

    public boolean cfr_renamed_11109() {
        return this.cfr_renamed_86;
    }

    private static /* synthetic */ int cfr_renamed_11105(int arg0, int arg1, int arg2, int arg3, byte[] arg4) throws IOException {
        if (arg3 < 0) {
            throw new EOFException(sprkfz.cfr_renamed_9("-E=S(N;_=OxN6OxD>\u000b>B4NxB6\u000b9Y5D*N<\u000b+_*N9Fv"));
        }
        if (arg2 == 61) {
            int n = cfr_renamed_119[arg0] & 0xFF;
            int n2 = cfr_renamed_119[arg1] & 0xFF;
            if ((n | n2) < 0) {
                throw new sprlgm(sprnxe.cfr_renamed_9("\u0014\u0017\u000b\u0018\u0011\u0010\u0019Y\u001c\u000b\u0010\u0016\u000f"));
            }
            arg4[2] = (byte)(n << 2 | n2 >> 4);
            return 2;
        }
        if (arg3 == 61) {
            byte by = cfr_renamed_119[arg0];
            byte by2 = cfr_renamed_119[arg1];
            byte by3 = cfr_renamed_119[arg2];
            if ((by | by2 | by3) < 0) {
                throw new sprlgm(sprkfz.cfr_renamed_9("1E.J4B<\u000b9Y5D*"));
            }
            arg4[1] = (byte)(by << 2 | by2 >> 4);
            arg4[2] = (byte)(by2 << 4 | by3 >> 2);
            return 1;
        }
        byte by = cfr_renamed_119[arg0];
        byte by4 = cfr_renamed_119[arg1];
        byte by5 = cfr_renamed_119[arg2];
        byte by6 = cfr_renamed_119[arg3];
        if ((by | by4 | by5 | by6) < 0) {
            throw new sprlgm(sprnxe.cfr_renamed_9("\u0014\u0017\u000b\u0018\u0011\u0010\u0019Y\u001c\u000b\u0010\u0016\u000f"));
        }
        arg4[0] = (byte)(by << 2 | by4 >> 4);
        arg4[1] = (byte)(by4 << 4 | by5 >> 2);
        arg4[2] = (byte)(by5 << 6 | by6);
        return 0;
    }

    public spriam(InputStream arg0) throws IOException {
        this(arg0, true);
    }

    static {
        int n;
        cfr_renamed_119 = new byte[128];
        int n2 = n = 0;
        while (n2 < cfr_renamed_119.length) {
            spriam.cfr_renamed_119[n++] = -1;
            n2 = n;
        }
        int n3 = n = 65;
        while (n3 <= 90) {
            int n4 = n++;
            spriam.cfr_renamed_119[n4] = (byte)(n4 - 65);
            n3 = n;
        }
        int n5 = n = 97;
        while (n5 <= 122) {
            int n6 = n++;
            spriam.cfr_renamed_119[n6] = (byte)(n6 - 97 + 26);
            n5 = n;
        }
        int n7 = n = 48;
        while (n7 <= 57) {
            int n8 = n++;
            spriam.cfr_renamed_119[n8] = (byte)(n8 - 48 + 52);
            n7 = n;
        }
        spriam.cfr_renamed_119[43] = 62;
        spriam.cfr_renamed_119[47] = 63;
    }

    @Override
    public void close() throws IOException {
        this.cfr_renamed_93.close();
    }
}

