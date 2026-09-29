/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralo;
import com.spire.presentation.packages.sprawm;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sproan;
import com.spire.presentation.packages.sprsez;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryfn;

@sprtea
public class sprlcn {
    private static final int cfr_renamed_84 = 3840;
    private static int[] cfr_renamed_723;
    private int cfr_renamed_1226;
    private static final int cfr_renamed_287 = 61440;
    private static final int cfr_renamed_724 = 258;
    private static int[] cfr_renamed_953;
    private int cfr_renamed_133;
    private static final int cfr_renamed_185 = 257;
    private spreen spr\ufe34;
    private static int[] cfr_renamed_82;
    private static int[] cfr_renamed_126;
    private long cfr_renamed_88;
    private static final int cfr_renamed_31 = 256;
    private boolean cfr_renamed_272;
    private static final int cfr_renamed_145 = 32;
    private int cfr_renamed_114;
    private boolean cfr_renamed_96;
    private static final int cfr_renamed_105 = 29;
    private static final int cfr_renamed_137 = 285;
    private static final int cfr_renamed_79 = 31;
    private byte[] cfr_renamed_107;
    private byte[] cfr_renamed_132;
    private sproan cfr_renamed_102;
    private long cfr_renamed_93;
    private long cfr_renamed_86;
    private static int[] cfr_renamed_152;
    private static final int cfr_renamed_112 = 65535;
    private long cfr_renamed_119;
    private boolean cfr_renamed_91;
    private boolean cfr_renamed_0;
    private boolean cfr_renamed_1;
    private static int[] cfr_renamed_2;
    private sproan cfr_renamed_3;
    private static final int cfr_renamed_4 = 192;

    public void cfr_renamed_12253() throws Exception {
        int n = this.cfr_renamed_12254();
        if (n == -1) {
            throw new Exception(spralo.cfr_renamed_9("!V\bW\fAI\\\u000f\u0013\u001d[\f\u0013\u001aG\u001bV\b^IP\b]I]\u0006GIQ\f\u0013\u001bV\bWG"));
        }
        if (n % 31 != 0) {
            throw new NumberFormatException(sprsez.cfr_renamed_9(".\t\u0007\b\u0003\u001eF\u000f\u000e\t\u0005\u0007\u0015\u0019\u000bL\u000f\u0000\n\t\u0001\r\n"));
        }
        if ((n & 0xF00) != 2048) {
            throw new NumberFormatException(spralo.cfr_renamed_9("<]\u001aF\u0019C\u0006A\u001dV\r\u0013\n\\\u0004C\u001bV\u001a@\u0000\\\u0007\u0013\u0004V\u001d[\u0006WG"));
        }
        this.cfr_renamed_114 = (int)Math.pow(2.0, ((n & 0xF000) >> 12) + 8);
        if (this.cfr_renamed_114 > 65535) {
            throw new NumberFormatException(sprsez.cfr_renamed_9("3\u0002\u0015\u0019\u0016\u001c\t\u001e\u0012\t\u0002L\u0011\u0005\b\b\t\u001bF\u001f\u000f\u0016\u0003L\u0000\u0003\u0014L\u0002\t\u0000\u0000\u0007\u0018\u0003L\u0005\u0003\u000b\u001c\u0014\t\u0015\u001f\u000f\u0003\bL\u000b\t\u0012\u0004\t\bH"));
        }
        if ((n & 0x20) >> 5 == 1) {
            throw new UnsupportedOperationException(spralo.cfr_renamed_9("*F\u001aG\u0006^IW\u0000P\u001dZ\u0006]\bA\u0010\u0013\u0000@I]\u0006GI@\u001cC\u0019\\\u001bG\fWIR\u001d\u0013\u001d[\f\u0013\u0004\\\u0004V\u0007GG"));
        }
    }

    @sprtea
    public int cfr_renamed_12255() {
        int n = this.cfr_renamed_12256(8);
        return n |= this.cfr_renamed_12256(8) << 8;
    }

    public void cfr_renamed_12257() {
        this.cfr_renamed_93 = 1L;
    }

    static {
        int[] nArray = new int[3];
        nArray[0] = 3;
        nArray[1] = 3;
        nArray[2] = 11;
        cfr_renamed_152 = nArray;
        int[] nArray2 = new int[3];
        nArray2[0] = 2;
        nArray2[1] = 3;
        nArray2[2] = 7;
        cfr_renamed_953 = nArray2;
        int[] nArray3 = new int[29];
        nArray3[0] = 3;
        nArray3[1] = 4;
        nArray3[2] = 5;
        nArray3[3] = 6;
        nArray3[4] = 7;
        nArray3[5] = 8;
        nArray3[6] = 9;
        nArray3[7] = 10;
        nArray3[8] = 11;
        nArray3[9] = 13;
        nArray3[10] = 15;
        nArray3[11] = 17;
        nArray3[12] = 19;
        nArray3[13] = 23;
        nArray3[14] = 27;
        nArray3[15] = 31;
        nArray3[16] = 35;
        nArray3[17] = 43;
        nArray3[18] = 51;
        nArray3[19] = 59;
        nArray3[20] = 67;
        nArray3[21] = 83;
        nArray3[22] = 99;
        nArray3[23] = 115;
        nArray3[24] = 131;
        nArray3[25] = 163;
        nArray3[26] = 195;
        nArray3[27] = 227;
        nArray3[28] = 258;
        cfr_renamed_126 = nArray3;
        int[] nArray4 = new int[29];
        nArray4[0] = 0;
        nArray4[1] = 0;
        nArray4[2] = 0;
        nArray4[3] = 0;
        nArray4[4] = 0;
        nArray4[5] = 0;
        nArray4[6] = 0;
        nArray4[7] = 0;
        nArray4[8] = 1;
        nArray4[9] = 1;
        nArray4[10] = 1;
        nArray4[11] = 1;
        nArray4[12] = 2;
        nArray4[13] = 2;
        nArray4[14] = 2;
        nArray4[15] = 2;
        nArray4[16] = 3;
        nArray4[17] = 3;
        nArray4[18] = 3;
        nArray4[19] = 3;
        nArray4[20] = 4;
        nArray4[21] = 4;
        nArray4[22] = 4;
        nArray4[23] = 4;
        nArray4[24] = 5;
        nArray4[25] = 5;
        nArray4[26] = 5;
        nArray4[27] = 5;
        nArray4[28] = 0;
        cfr_renamed_723 = nArray4;
        int[] nArray5 = new int[30];
        nArray5[0] = 1;
        nArray5[1] = 2;
        nArray5[2] = 3;
        nArray5[3] = 4;
        nArray5[4] = 5;
        nArray5[5] = 7;
        nArray5[6] = 9;
        nArray5[7] = 13;
        nArray5[8] = 17;
        nArray5[9] = 25;
        nArray5[10] = 33;
        nArray5[11] = 49;
        nArray5[12] = 65;
        nArray5[13] = 97;
        nArray5[14] = 129;
        nArray5[15] = 193;
        nArray5[16] = 257;
        nArray5[17] = 385;
        nArray5[18] = 513;
        nArray5[19] = 769;
        nArray5[20] = 1025;
        nArray5[21] = 1537;
        nArray5[22] = 2049;
        nArray5[23] = 3073;
        nArray5[24] = 4097;
        nArray5[25] = 6145;
        nArray5[26] = 8193;
        nArray5[27] = 12289;
        nArray5[28] = 16385;
        nArray5[29] = 24577;
        cfr_renamed_82 = nArray5;
        int[] nArray6 = new int[30];
        nArray6[0] = 0;
        nArray6[1] = 0;
        nArray6[2] = 0;
        nArray6[3] = 0;
        nArray6[4] = 1;
        nArray6[5] = 1;
        nArray6[6] = 2;
        nArray6[7] = 2;
        nArray6[8] = 3;
        nArray6[9] = 3;
        nArray6[10] = 4;
        nArray6[11] = 4;
        nArray6[12] = 5;
        nArray6[13] = 5;
        nArray6[14] = 6;
        nArray6[15] = 6;
        nArray6[16] = 7;
        nArray6[17] = 7;
        nArray6[18] = 8;
        nArray6[19] = 8;
        nArray6[20] = 9;
        nArray6[21] = 9;
        nArray6[22] = 10;
        nArray6[23] = 10;
        nArray6[24] = 11;
        nArray6[25] = 11;
        nArray6[26] = 12;
        nArray6[27] = 12;
        nArray6[28] = 13;
        nArray6[29] = 13;
        cfr_renamed_2 = nArray6;
    }

    @sprtea
    public int cfr_renamed_12198(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException(sprsez.cfr_renamed_9(".\u000f\u0018\u0015L\u0005\u0003\u0013\u0002\u0012L\u0005\r\bL\b\u0003\u0012L\u0004\tF\u0000\u0003\u001f\u0015L\u0012\u0004\u0007\u0002F\u0016\u0003\u001e\tBkf6\r\u0014\r\u000b\t\u0012\t\u0014L\b\r\u000b\t\\L\u0005\u0003\u0013\u0002\u0012"));
        }
        if (arg0 > 32) {
            throw new IllegalArgumentException(spralo.cfr_renamed_9("p\u0006F\u0007GI\\\u000f\u0013\u000bZ\u001d@IZ\u001a\u0013\u001d\\\u0006\u0013\u0005R\u001bT\f\u001dd99R\u001bR\u0004V\u001dV\u001b\u0013\u0007R\u0004VS\u0013\n\\\u001c]\u001d"));
        }
        if (this.cfr_renamed_133 < arg0) {
            this.cfr_renamed_12258();
        }
        if (this.cfr_renamed_133 < arg0) {
            return -1;
        }
        long l = 0xFFFFFFFFL << arg0 & 0xFFFFFFFFL ^ 0xFFFFFFFFFFFFFFFFL;
        return (int)(this.cfr_renamed_86 & 0xFFFFFFFFL & (l & 0xFFFFFFFFL));
    }

    @sprtea
    public long cfr_renamed_12259() {
        return this.spr\ufe34.cfr_renamed_806() - this.spr\ufe34.cfr_renamed_3274() + (long)this.cfr_renamed_133 >> 3;
    }

    @sprtea
    public void cfr_renamed_12260() {
        sprlcn sprlcn2 = this;
        this.cfr_renamed_86 = (sprlcn2.cfr_renamed_86 & 0xFFFFFFFFL) >> (this.cfr_renamed_133 & 7);
        sprlcn2.cfr_renamed_133 &= 0xFFFFFFF8;
    }

    @sprtea
    public int cfr_renamed_12254() {
        int n = this.cfr_renamed_12256(8) << 8;
        return n |= this.cfr_renamed_12256(8);
    }

    @sprtea
    public int cfr_renamed_12200() {
        return this.cfr_renamed_133;
    }

    public void cfr_renamed_12258() {
        int n;
        int n2 = 4 - (this.cfr_renamed_133 >> 3) - ((this.cfr_renamed_133 & 7) != 0 ? 1 : 0);
        if (n2 == 0) {
            return;
        }
        sprlcn sprlcn2 = this;
        int n3 = sprlcn2.spr\ufe34.cfr_renamed_11556(sprlcn2.cfr_renamed_107, 0, n2);
        int n4 = n = 0;
        while (n4 < n3) {
            sprlcn sprlcn3 = this;
            sprlcn3.cfr_renamed_86 |= (long)(this.cfr_renamed_107[n] & 0xFF) << this.cfr_renamed_133 & 0xFFFFFFFFL;
            sprlcn3.cfr_renamed_133 += 8;
            n4 = ++n;
        }
    }

    @sprtea
    public long cfr_renamed_12261() {
        long l = (long)(this.cfr_renamed_12256(8) << 24) & 0xFFFFFFFFL;
        l |= (long)(this.cfr_renamed_12256(8) << 16);
        l |= (long)(this.cfr_renamed_12256(8) << 8);
        return l |= (long)this.cfr_renamed_12256(8);
    }

    public int cfr_renamed_11556(byte[] arg0, int arg1, int arg2) throws Exception {
        sprlcn sprlcn2;
        int n;
        block17: {
            if (arg0 == null) {
                throw new NullPointerException(sprsez.cfr_renamed_9("\u000e\u0013\n\u0000\t\u0014"));
            }
            if (arg1 < 0 || arg1 > arg0.length - 1) {
                throw new IllegalArgumentException(spralo.cfr_renamed_9("&U\u000f@\fGIW\u0006V\u001a\u0013\u0007\\\u001d\u0013\u000bV\u0005\\\u0007TIG\u0006\u0013\u001aC\fP\u0000U\u0000V\r\u0013\u000bF\u000fU\fAG>cc\bA\b^\fG\fAI]\b^\f\tI\\\u000fU\u001aV\u001d"));
            }
            if (arg2 < 0 || arg2 > arg0.length - arg1) {
                throw new IllegalArgumentException(sprsez.cfr_renamed_9(" \u0003\u0002\u0001\u0018\u000eL\u000f\u001fF\u0005\n\u0000\u0003\u000b\u0007\u0000Hal<\u0007\u001e\u0007\u0001\u0003\u0018\u0003\u001eF\u0002\u0007\u0001\u0003VF\u0000\u0003\u0002\u0001\u0018\u000e"));
            }
            n = arg2;
            block0: while (true) {
                int n2 = arg2;
                while (n2 > 0) {
                    int n3;
                    int n4;
                    if (this.cfr_renamed_119 < this.cfr_renamed_88) {
                        sprlcn sprlcn3 = this;
                        int n5 = (int)(sprlcn3.cfr_renamed_119 % 65535L);
                        sprlcn sprlcn4 = this;
                        int n6 = Math.min(65535 - n5, (int)(sprlcn4.cfr_renamed_88 - this.cfr_renamed_119));
                        n6 = Math.min(n6, arg2);
                        System.arraycopy(sprlcn3.cfr_renamed_132, n5, arg0, arg1, n6);
                        sprlcn4.cfr_renamed_119 += (long)n6;
                        arg1 += n6;
                        n2 = arg2 - n6;
                        continue;
                    }
                    if (!this.cfr_renamed_0) {
                        sprlcn2 = this;
                        break block17;
                    }
                    sprlcn sprlcn5 = this;
                    long l = sprlcn5.cfr_renamed_88;
                    if (!sprlcn5.cfr_renamed_272) {
                        if (!this.cfr_renamed_12262()) {
                            sprlcn2 = this;
                            break block17;
                        }
                    } else if (this.cfr_renamed_1226 == 0) {
                        this.cfr_renamed_0 = this.cfr_renamed_12263();
                        if (!this.cfr_renamed_0) {
                            sprlcn2 = this;
                            break block17;
                        }
                    } else {
                        int n7;
                        sprlcn sprlcn6 = this;
                        n4 = (int)(sprlcn6.cfr_renamed_88 % 65535L);
                        n3 = Math.min(sprlcn6.cfr_renamed_1226, 65535 - n4);
                        if (n3 != (n7 = sprlcn6.cfr_renamed_12264(sprlcn6.cfr_renamed_132, n4, n3))) {
                            throw new NumberFormatException(spralo.cfr_renamed_9("}\u0006GIV\u0007\\\u001cT\u0001\u0013\rR\u001dRIZ\u0007\u0013\u001aG\u001bV\b^G"));
                        }
                        sprlcn sprlcn7 = this;
                        sprlcn7.cfr_renamed_1226 -= n7;
                        sprlcn7.cfr_renamed_88 += (long)n7;
                    }
                    if (l >= this.cfr_renamed_88) continue block0;
                    n4 = (int)(l % 65535L);
                    n3 = (int)(this.cfr_renamed_88 % 65535L);
                    if (n4 < n3) {
                        sprlcn sprlcn8 = this;
                        int n8 = n4;
                        sprlcn8.cfr_renamed_12265(sprlcn8.cfr_renamed_132, n8, n3 - n8);
                        continue block0;
                    }
                    sprlcn sprlcn9 = this;
                    int n9 = n4;
                    sprlcn9.cfr_renamed_12265(sprlcn9.cfr_renamed_132, n9, 65535 - n9);
                    if (n3 <= 0) continue block0;
                    sprlcn sprlcn10 = this;
                    sprlcn10.cfr_renamed_12265(sprlcn10.cfr_renamed_132, 0, n3);
                    continue block0;
                }
                break;
            }
            sprlcn2 = this;
        }
        if (!(sprlcn2.cfr_renamed_0 || this.cfr_renamed_1 || this.cfr_renamed_96)) {
            sprlcn sprlcn11 = this;
            sprlcn11.cfr_renamed_12260();
            long l = sprlcn11.cfr_renamed_12261();
            if (l != this.cfr_renamed_93) {
                throw new Exception(sprsez.cfr_renamed_9("/\u000e\t\u0005\u0007\u0015\u0019\u000bL\u0005\u0004\u0003\u000f\rL\u0000\r\u000f\u0000\u0003\bH"));
            }
            this.cfr_renamed_1 = true;
        }
        return n - arg2;
    }

    public String cfr_renamed_12266(int arg0, int arg1) {
        int n;
        String string = "";
        int n2 = n = 0;
        while (n2 < arg1) {
            if ((n & 7) == 0) {
                string = new StringBuilder().insert(0, " ").append(string).toString();
            }
            string = new StringBuilder().insert(0, Integer.toString(arg0 & 1)).append(string).toString();
            arg0 >>= 1;
            n2 = ++n;
        }
        return string;
    }

    /*
     * WARNING - void declaration
     */
    public sprlcn(spreen spreen2, boolean bl) throws Exception {
        void arg1;
        void arg0;
        sprlcn sprlcn2 = this;
        sprlcn sprlcn3 = this;
        this.cfr_renamed_93 = 1L;
        sprlcn3.cfr_renamed_107 = new byte[4];
        sprlcn3.cfr_renamed_132 = new byte[65535];
        sprlcn2.cfr_renamed_91 = true;
        sprlcn2.cfr_renamed_0 = true;
        if (spreen2 == null) {
            throw new NullPointerException("stream");
        }
        if (arg0.cfr_renamed_806() == 0L) {
            throw new IllegalArgumentException(spralo.cfr_renamed_9("@\u001dA\fR\u0004\u0013D\u0013\u001aG\u001bZ\u0007TIP\b]I]\u0006GIQ\f\u0013\f^\u0019G\u0010"));
        }
        sprlcn sprlcn4 = this;
        sprlcn4.spr\ufe34 = arg0;
        sprlcn4.cfr_renamed_96 = arg1;
        if (!this.cfr_renamed_96) {
            this.cfr_renamed_12253();
        }
        this.cfr_renamed_12263();
    }

    @sprtea
    public int cfr_renamed_12256(int arg0) {
        int n = this.cfr_renamed_12198(arg0);
        if (n == -1) {
            return -1;
        }
        sprlcn sprlcn2 = this;
        sprlcn2.cfr_renamed_133 -= arg0;
        sprlcn2.cfr_renamed_86 = (sprlcn2.cfr_renamed_86 & 0xFFFFFFFFL) >> arg0;
        return n;
    }

    public sprlcn(spreen arg0) throws Exception {
        this(arg0, false);
    }

    public void cfr_renamed_12267(sproan[] arg0, sproan[] arg1) {
        int n;
        byte[] byArray;
        int n2;
        int n3;
        block14: {
            int n4;
            byte by = 0;
            sprlcn sprlcn2 = this;
            n3 = sprlcn2.cfr_renamed_12256(5);
            n2 = sprlcn2.cfr_renamed_12256(5);
            int n5 = sprlcn2.cfr_renamed_12256(4);
            if (n3 < 0 || n2 < 0 || n5 < 0) {
                throw new NumberFormatException(sprsez.cfr_renamed_9(";\u0014\u0003\b\u000bF\b\u001f\u0002\u0007\u0001\u000f\u000fF\u0004\u0013\n\u0000\u0001\u0007\u0002F\u000f\t\b\u0003\u001fH"));
            }
            int n6 = (n3 += 257) + ++n2;
            byArray = new byte[n6];
            n5 += 4;
            byte[] byArray2 = new byte[19];
            int n7 = n4 = 0;
            while (n7 < n5) {
                int n8 = this.cfr_renamed_12256(3);
                if (n8 < 0) {
                    throw new NumberFormatException(spralo.cfr_renamed_9("d\u001b\\\u0007TIW\u0010]\b^\u0000PI[\u001cU\u000f^\b]IP\u0006W\f@G"));
                }
                int n9 = sprawm.cfr_renamed_3[n4];
                byArray2[n9] = (byte)n8;
                n7 = ++n4;
            }
            sproan sproan2 = new sproan(byArray2);
            n4 = 0;
            block1: do {
                int n10;
                boolean bl;
                int n11;
                block13: {
                    boolean bl2 = false;
                    while (((n11 = sproan2.cfr_renamed_12197(this)) & 0xFFFFFFF0) == 0) {
                        byArray[n4++] = by = (byte)n11;
                        if (n4 != n6) continue;
                        bl = bl2 = true;
                        break block13;
                    }
                    bl = bl2;
                }
                if (bl) {
                    n = n3;
                    break block14;
                }
                if (n11 < 0) {
                    throw new NumberFormatException(sprsez.cfr_renamed_9(";\u0014\u0003\b\u000bF\b\u001f\u0002\u0007\u0001\u000f\u000fF\u0004\u0013\n\u0000\u0001\u0007\u0002F\u000f\t\b\u0003\u001fH"));
                }
                if (n11 >= 17) {
                    by = 0;
                    n10 = n11;
                } else {
                    if (n4 == 0) {
                        throw new NumberFormatException(spralo.cfr_renamed_9("d\u001b\\\u0007TIW\u0010]\b^\u0000PI[\u001cU\u000f^\b]IP\u0006W\f@G"));
                    }
                    n10 = n11;
                }
                int n12 = n10 - 16;
                int n13 = cfr_renamed_953[n12];
                int n14 = this.cfr_renamed_12256(n13);
                if (n14 < 0) {
                    throw new NumberFormatException(sprsez.cfr_renamed_9(";\u0014\u0003\b\u000bF\b\u001f\u0002\u0007\u0001\u000f\u000fF\u0004\u0013\n\u0000\u0001\u0007\u0002F\u000f\t\b\u0003\u001fH"));
                }
                if (n4 + (n14 += cfr_renamed_152[n12]) > n6) {
                    throw new NumberFormatException(spralo.cfr_renamed_9("d\u001b\\\u0007TIW\u0010]\b^\u0000PI[\u001cU\u000f^\b]IP\u0006W\f@G"));
                }
                int n15 = n14;
                while (true) {
                    --n14;
                    if (n15 <= 0) continue block1;
                    byArray[n4++] = by;
                    n15 = n14;
                }
            } while (n4 != n6);
            n = n3;
        }
        byte[] byArray3 = new byte[n];
        System.arraycopy(byArray, 0, byArray3, 0, n3);
        arg0[0] = new sproan(byArray3);
        byArray3 = new byte[n2];
        System.arraycopy(byArray, n3, byArray3, 0, n2);
        arg1[0] = new sproan(byArray3);
    }

    @sprtea
    public int cfr_renamed_12264(byte[] arg0, int arg1, int arg2) {
        if (arg0 == null) {
            throw new NullPointerException(sprsez.cfr_renamed_9("\u000e\u0013\n\u0000\t\u0014"));
        }
        if (arg1 < 0 || arg1 > arg0.length - 1) {
            throw new IllegalArgumentException(spralo.cfr_renamed_9("&U\u000f@\fGIP\b]I]\u0006GIQ\f\u0013\u0005V\u001a@IG\u0001R\u0007\u0013\u0013V\u001b\\I\\\u001b\u0013\u000eA\fR\u001dV\u001b\u0013\u001d[\b]IQ\u001cU\u000fV\u001b\u0013\u0005V\u0007T\u001d[I\u001eI\u0002G>cc\bA\b^\fG\fAI]\b^\f\tI\\\u000fU\u001aV\u001d"));
        }
        if (arg2 < 0) {
            throw new IllegalArgumentException(sprsez.cfr_renamed_9("*\t\b\u000b\u0012\u0004F\u000f\u0007\u0002F\u0002\t\u0018F\u000e\u0003L\n\t\u0015\u001fF\u0018\u000e\r\bL\u001c\t\u0014\u0003Hal<\u0007\u001e\u0007\u0001\u0003\u0018\u0003\u001eF\u0002\u0007\u0001\u0003VF\u0000\u0003\u0002\u0001\u0018\u000e"));
        }
        if (arg2 > arg0.length - arg1) {
            throw new IllegalArgumentException(spralo.cfr_renamed_9("\u007f\f]\u000eG\u0001\u0013\u0000@IG\u0006\\I_\bA\u000eVG>cc\bA\b^\fG\fAI]\b^\f\tI_\f]\u000eG\u0001"));
        }
        if ((this.cfr_renamed_133 & 7) != 0) {
            throw new UnsupportedOperationException(sprsez.cfr_renamed_9(">\u0003\r\u0002\u0005\b\u000bF\u0003\u0000L\u0013\u0002\u0007\u0000\n\u0005\u0001\u0002\u0003\bF\b\u0007\u0018\u0007L\u000f\u001fF\u0002\t\u0018F\u001f\u0013\u001c\u0016\u0003\u0014\u0018\u0003\bH"));
        }
        if (arg2 == 0) {
            return 0;
        }
        int n = 0;
        sprlcn sprlcn2 = this;
        while (sprlcn2.cfr_renamed_133 > 0 && arg2 > 0) {
            sprlcn sprlcn3 = this;
            sprlcn2 = sprlcn3;
            arg0[++arg1] = (byte)(sprlcn3.cfr_renamed_86 & 0xFFFFFFFFL);
            sprlcn sprlcn4 = this;
            sprlcn4.cfr_renamed_133 -= 8;
            --arg2;
            sprlcn4.cfr_renamed_86 = (sprlcn4.cfr_renamed_86 & 0xFFFFFFFFL) >> 8;
            ++n;
        }
        if (arg2 > 0) {
            n += this.spr\ufe34.cfr_renamed_11556(arg0, arg1, arg2);
        }
        return n;
    }

    @sprtea
    public void cfr_renamed_12199(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException(spralo.cfr_renamed_9("q\u0000G\u001a\u0013\n\\\u001c]\u001d\u0013\nR\u0007\u0013\u0007\\\u001d\u0013\u000bVI_\f@\u001a\u0013\u001d[\b]II\fA\u0006\u001dd99R\u001bR\u0004V\u001dV\u001b\u0013\u0007R\u0004VS\u0013\n\\\u001c]\u001d"));
        }
        if (arg0 == 0) {
            return;
        }
        if (arg0 >= this.cfr_renamed_133) {
            sprlcn sprlcn2 = this;
            sprlcn2.cfr_renamed_133 = 0;
            sprlcn2.cfr_renamed_86 = 0L;
            if ((arg0 -= this.cfr_renamed_133) > 0) {
                sprlcn sprlcn3 = this;
                sprlcn3.spr\ufe34.cfr_renamed_11548(sprlcn3.spr\ufe34.cfr_renamed_3274() + (long)(arg0 >> 3));
                if ((arg0 &= 7) > 0) {
                    sprlcn sprlcn4 = this;
                    sprlcn4.cfr_renamed_12258();
                    sprlcn4.cfr_renamed_133 -= arg0;
                    sprlcn4.cfr_renamed_86 = (sprlcn4.cfr_renamed_86 & 0xFFFFFFFFL) >> arg0;
                    return;
                }
            }
        } else {
            sprlcn sprlcn5 = this;
            sprlcn5.cfr_renamed_133 -= arg0;
            sprlcn5.cfr_renamed_86 = (sprlcn5.cfr_renamed_86 & 0xFFFFFFFFL) >> arg0;
        }
    }

    public boolean cfr_renamed_12263() {
        if (!this.cfr_renamed_91) {
            return false;
        }
        int n = this.cfr_renamed_12256(1);
        if (n == -1) {
            return false;
        }
        int n2 = this.cfr_renamed_12256(2);
        if (n2 == -1) {
            return false;
        }
        this.cfr_renamed_91 = n == 0;
        switch (n2) {
            case 0: {
                sprlcn sprlcn2 = this;
                while (false) {
                }
                sprlcn2.cfr_renamed_272 = true;
                sprlcn2.cfr_renamed_12260();
                int n3 = sprlcn2.cfr_renamed_12255();
                int n4 = sprlcn2.cfr_renamed_12255();
                if (n3 < 0) {
                    return false;
                }
                if (n3 != (n4 ^ 0xFFFF)) {
                    throw new NumberFormatException(sprsez.cfr_renamed_9("1\u001e\t\u0002\u0001L\u0004\u0000\t\u000f\rL\n\t\b\u000b\u0012\u0004H"));
                }
                if (n3 > 65535) {
                    throw new NumberFormatException(spralo.cfr_renamed_9("<]\n\\\u0004C\u001bV\u001a@\fWIQ\u0005\\\nXI_\f]\u000eG\u0001\u0013\nR\u0007\u0013\u0007\\\u001d\u0013\u000bVI^\u0006A\f\u0013\u001d[\b]I\u0005\\\u0006Z\u0006G"));
                }
                sprlcn sprlcn3 = this;
                sprlcn3.cfr_renamed_1226 = n3;
                sprlcn3.cfr_renamed_102 = null;
                this.cfr_renamed_3 = null;
                break;
            }
            case 1: {
                sprlcn sprlcn4 = this;
                sprlcn sprlcn5 = this;
                sprlcn5.cfr_renamed_272 = false;
                sprlcn4.cfr_renamed_1226 = -1;
                sprlcn5.cfr_renamed_102 = sproan.cfr_renamed_12205();
                sprlcn4.cfr_renamed_3 = sproan.cfr_renamed_12202();
                break;
            }
            case 2: {
                this.cfr_renamed_272 = false;
                this.cfr_renamed_1226 = -1;
                sproan[] sproanArray = new sproan[1];
                sproanArray[0] = this.cfr_renamed_102;
                sproan[] sproanArray2 = sproanArray;
                sproan[] sproanArray3 = new sproan[1];
                sproanArray3[0] = this.cfr_renamed_3;
                sproan[] sproanArray4 = sproanArray3;
                sprlcn sprlcn6 = this;
                this.cfr_renamed_12267(sproanArray2, sproanArray4);
                sprlcn6.cfr_renamed_102 = sproanArray2[0];
                sprlcn6.cfr_renamed_3 = sproanArray3[0];
                break;
            }
            default: {
                throw new NumberFormatException(sprsez.cfr_renamed_9("1\u001e\t\u0002\u0001L\u0004\u0000\t\u000f\rL\u0012\u0015\u0016\tH"));
            }
        }
        return true;
    }

    public void cfr_renamed_12265(byte[] arg0, int arg1, int arg2) {
        long[] lArray = new long[1];
        lArray[0] = this.cfr_renamed_93;
        long[] lArray2 = lArray;
        spryfn.cfr_renamed_12235(lArray2, arg0, arg1, arg2);
        this.cfr_renamed_93 = lArray2[0];
    }

    private /* synthetic */ boolean cfr_renamed_12262() {
        int n = 65535 - (int)(this.cfr_renamed_88 - this.cfr_renamed_119);
        boolean bl = false;
        int n2 = n;
        while (n2 >= 258) {
            int n3;
            int n4;
            int n5;
            while (((n5 = this.cfr_renamed_102.cfr_renamed_12197(this)) & 0xFFFFFF00) == 0) {
                this.cfr_renamed_132[(int)this.cfr_renamed_88++ % 65535] = (byte)n5;
                bl = true;
                if (--n >= 258) continue;
                return true;
            }
            if (n5 < 257) {
                if (n5 < 256) {
                    throw new NumberFormatException(spralo.cfr_renamed_9(" _\u0005V\u000eR\u0005\u0013\n\\\rVG"));
                }
                this.cfr_renamed_0 = this.cfr_renamed_12263();
                return bl | this.cfr_renamed_0;
            }
            if (n5 > 285) {
                throw new NumberFormatException(sprsez.cfr_renamed_9("/\u0000\n\t\u0001\r\nL\u0014\t\u0016\t\u0007\u0018F\u000f\t\b\u0003L\n\t\b\u000b\u0012\u0004H"));
            }
            int n6 = cfr_renamed_126[n5 - 257];
            int n7 = cfr_renamed_723[n5 - 257];
            if (n7 > 0) {
                n4 = this.cfr_renamed_12256(n7);
                if (n4 < 0) {
                    throw new NumberFormatException(spralo.cfr_renamed_9(">A\u0006]\u000e\u0013\rR\u001dRG"));
                }
                n6 += n4;
            }
            if ((n5 = this.cfr_renamed_3.cfr_renamed_12197(this)) < 0 || n5 > cfr_renamed_82.length) {
                throw new NumberFormatException(sprsez.cfr_renamed_9(";\u0014\u0003\b\u000bF\b\u000f\u001f\u0012\r\b\u000f\u0003L\u0005\u0003\u0002\tH"));
            }
            n4 = cfr_renamed_82[n5];
            n7 = cfr_renamed_2[n5];
            if (n7 > 0) {
                n3 = this.cfr_renamed_12256(n7);
                if (n3 < 0) {
                    throw new NumberFormatException(spralo.cfr_renamed_9(">A\u0006]\u000e\u0013\rR\u001dRG"));
                }
                n4 += n3;
            }
            int n8 = n3 = 0;
            while (n8 < n6) {
                sprlcn sprlcn2 = this;
                sprlcn sprlcn3 = this;
                sprlcn2.cfr_renamed_132[(int)sprlcn2.cfr_renamed_88 % 65535] = sprlcn3.cfr_renamed_132[(int)(this.cfr_renamed_88 - (long)n4) % 65535];
                --n;
                ++sprlcn3.cfr_renamed_88;
                n8 = ++n3;
            }
            bl = true;
            n2 = n;
        }
        return bl;
    }
}

