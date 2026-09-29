/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spracn;
import com.spire.presentation.packages.sprggn;
import com.spire.presentation.packages.sprqks;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprurca;
import com.spire.presentation.packages.sprzfn;
import com.spire.presentation.packages.sprzyd;

@sprtea
public final class sprgfn {
    @sprtea
    public int spr\ufe34;
    @sprtea
    public int cfr_renamed_82;
    private static final int cfr_renamed_126 = 8;
    private static final int cfr_renamed_88 = 7;
    private static final int cfr_renamed_31 = 6;
    private static final int cfr_renamed_272 = 4;
    private static final int cfr_renamed_145 = 8;
    private static final int cfr_renamed_114 = 32;
    private static final int cfr_renamed_96 = 10;
    private static final int cfr_renamed_105 = 12;
    @sprtea
    public long cfr_renamed_137;
    @sprtea
    public int cfr_renamed_79;
    @sprtea
    public sprzfn cfr_renamed_107;
    @sprtea
    public spracn cfr_renamed_132;
    private static final int cfr_renamed_102 = 2;
    @sprtea
    public long[] cfr_renamed_93;
    private boolean cfr_renamed_86;
    private static final int cfr_renamed_152 = 9;
    private static final int cfr_renamed_112 = 13;
    private static byte[] cfr_renamed_119;
    private static final int cfr_renamed_91 = 11;
    @sprtea
    public int cfr_renamed_0;
    private static final int cfr_renamed_1 = 1;
    private static final int cfr_renamed_2 = 5;
    private static final int cfr_renamed_3 = 3;
    private static final int cfr_renamed_4 = 0;

    @sprtea
    public int cfr_renamed_12028(spracn arg0) {
        return this.cfr_renamed_107.cfr_renamed_12029();
    }

    public sprgfn() {
        sprgfn sprgfn2 = this;
        sprgfn2.cfr_renamed_93 = new long[1];
        sprgfn2.cfr_renamed_86 = true;
    }

    @sprtea
    public int cfr_renamed_11575() {
        if (this.cfr_renamed_107 != null) {
            this.cfr_renamed_107.cfr_renamed_12030();
        }
        this.cfr_renamed_107 = null;
        return 0;
    }

    @sprtea
    public boolean cfr_renamed_12031() {
        return this.cfr_renamed_86;
    }

    @sprtea
    public int cfr_renamed_11578(byte[] arg0) {
        int n = 0;
        int n2 = arg0.length;
        if (this.cfr_renamed_0 != 6) {
            throw new sprurca(sprzyd.cfr_renamed_9("\n\u0013+\u00028\ny\u0002+\u00156\u0015w"));
        }
        if (sprggn.cfr_renamed_11567(1L, arg0, 0, arg0.length) != this.cfr_renamed_132.cfr_renamed_102) {
            return -3;
        }
        this.cfr_renamed_132.cfr_renamed_102 = sprggn.cfr_renamed_11567(0L, null, 0, 0);
        if (n2 >= 1 << this.cfr_renamed_79) {
            n2 = (1 << this.cfr_renamed_79) - 1;
            n = arg0.length - n2;
        }
        this.cfr_renamed_107.cfr_renamed_12032(arg0, n, n2);
        this.cfr_renamed_0 = 7;
        return 0;
    }

    @sprtea
    public int cfr_renamed_41() {
        sprgfn sprgfn2 = this;
        sprgfn2.cfr_renamed_132.cfr_renamed_93 = 0L;
        sprgfn2.cfr_renamed_132.cfr_renamed_152 = 0L;
        this.cfr_renamed_132.cfr_renamed_3 = null;
        this.cfr_renamed_0 = this.cfr_renamed_12031() ? 0 : 7;
        this.cfr_renamed_107.cfr_renamed_12033(null);
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public int cfr_renamed_11588(int arg0) {
        int n = arg0;
        if (this.cfr_renamed_132.cfr_renamed_86 == null) {
            throw new sprurca(sprqks.cfr_renamed_9("5\u0003\f\u0018\b/\t\u000b\u001a\b\u000eM\u0015\u001e\\\u0003\t\u0001\u0010C\\"));
        }
        n = n == 4 ? -5 : 0;
        int n2 = -5;
        sprgfn sprgfn2 = this;
        block16: while (true) {
            switch (sprgfn2.cfr_renamed_0) {
                case 0: {
                    if (this.cfr_renamed_132.cfr_renamed_0 == 0) {
                        return n2;
                    }
                    n2 = n;
                    sprgfn sprgfn3 = this;
                    --sprgfn3.cfr_renamed_132.cfr_renamed_0;
                    ++sprgfn3.cfr_renamed_132.cfr_renamed_152;
                    if (((sprgfn3.cfr_renamed_82 = sprgfn3.cfr_renamed_132.cfr_renamed_86[this.cfr_renamed_132.cfr_renamed_91++] & 0xFF) & 0xF) != 8) {
                        sprgfn sprgfn4 = this;
                        sprgfn4.cfr_renamed_0 = 13;
                        Object[] objectArray = new Object[1];
                        objectArray[0] = this.cfr_renamed_82;
                        sprgfn4.cfr_renamed_132.cfr_renamed_3 = sprraia.cfr_renamed_11562(sprzyd.cfr_renamed_9(",\t2\t6\u00107G:\b4\u0017+\u0002*\u00140\b7G4\u0002-\u000f6\u0003yOi\u001f\"Wc?k\u001ap"), objectArray);
                        sprgfn2 = this;
                        this.spr\ufe34 = 5;
                        continue block16;
                    }
                    if ((this.cfr_renamed_82 >> 4) + 8 > this.cfr_renamed_79) {
                        sprgfn sprgfn5 = this;
                        sprgfn5.cfr_renamed_0 = 13;
                        Object[] objectArray = new Object[1];
                        objectArray[0] = (this.cfr_renamed_82 >> 4) + 8;
                        sprgfn5.cfr_renamed_132.cfr_renamed_3 = sprraia.cfr_renamed_11562(sprqks.cfr_renamed_9("\u0015\u0003\n\f\u0010\u0004\u0018M\u000b\u0004\u0012\t\u0013\u001a\\\u001e\u0015\u0017\u0019MT\u0016L\u0010U"), objectArray);
                        sprgfn2 = this;
                        this.spr\ufe34 = 5;
                        continue block16;
                    }
                    this.cfr_renamed_0 = 1;
                }
                case 1: {
                    int n3;
                    if (this.cfr_renamed_132.cfr_renamed_0 == 0) {
                        return n2;
                    }
                    n2 = n;
                    sprgfn sprgfn6 = this;
                    --sprgfn6.cfr_renamed_132.cfr_renamed_0;
                    ++sprgfn6.cfr_renamed_132.cfr_renamed_152;
                    if (((this.cfr_renamed_82 << 8) + (n3 = sprgfn6.cfr_renamed_132.cfr_renamed_86[this.cfr_renamed_132.cfr_renamed_91++] & 0xFF & 0xFF)) % 31 != 0) {
                        sprgfn2 = this;
                        this.cfr_renamed_0 = 13;
                        this.cfr_renamed_132.cfr_renamed_3 = "incorrect header check";
                        this.spr\ufe34 = 5;
                        continue block16;
                    }
                    if ((n3 & 0x20) == 0) {
                        sprgfn2 = this;
                        this.cfr_renamed_0 = 7;
                        continue block16;
                    }
                    this.cfr_renamed_0 = 2;
                }
                case 2: {
                    if (this.cfr_renamed_132.cfr_renamed_0 == 0) {
                        return n2;
                    }
                    n2 = n;
                    sprgfn sprgfn7 = this;
                    --sprgfn7.cfr_renamed_132.cfr_renamed_0;
                    ++sprgfn7.cfr_renamed_132.cfr_renamed_152;
                    sprgfn7.cfr_renamed_137 = (sprgfn7.cfr_renamed_132.cfr_renamed_86[this.cfr_renamed_132.cfr_renamed_91++] & 0xFF & 0xFF) << 24 & 0xFF000000;
                    this.cfr_renamed_0 = 3;
                }
                case 3: {
                    if (this.cfr_renamed_132.cfr_renamed_0 == 0) {
                        return n2;
                    }
                    n2 = n;
                    sprgfn sprgfn8 = this;
                    --sprgfn8.cfr_renamed_132.cfr_renamed_0;
                    ++sprgfn8.cfr_renamed_132.cfr_renamed_152;
                    sprgfn8.cfr_renamed_137 += (long)((this.cfr_renamed_132.cfr_renamed_86[this.cfr_renamed_132.cfr_renamed_91++] & 0xFF & 0xFF) << 16) & 0xFF0000L;
                    this.cfr_renamed_0 = 4;
                }
                case 4: {
                    if (this.cfr_renamed_132.cfr_renamed_0 == 0) {
                        return n2;
                    }
                    n2 = n;
                    sprgfn sprgfn9 = this;
                    --sprgfn9.cfr_renamed_132.cfr_renamed_0;
                    ++sprgfn9.cfr_renamed_132.cfr_renamed_152;
                    sprgfn9.cfr_renamed_137 += (long)((this.cfr_renamed_132.cfr_renamed_86[this.cfr_renamed_132.cfr_renamed_91++] & 0xFF & 0xFF) << 8) & 0xFF00L;
                    this.cfr_renamed_0 = 5;
                }
                case 5: {
                    if (this.cfr_renamed_132.cfr_renamed_0 == 0) {
                        return n2;
                    }
                    n2 = n;
                    sprgfn sprgfn10 = this;
                    --sprgfn10.cfr_renamed_132.cfr_renamed_0;
                    ++sprgfn10.cfr_renamed_132.cfr_renamed_152;
                    sprgfn10.cfr_renamed_137 += (long)(this.cfr_renamed_132.cfr_renamed_86[this.cfr_renamed_132.cfr_renamed_91++] & 0xFF) & 0xFFL;
                    this.cfr_renamed_132.cfr_renamed_102 = this.cfr_renamed_137;
                    this.cfr_renamed_0 = 6;
                    return 2;
                }
                case 6: {
                    sprgfn sprgfn11 = this;
                    sprgfn11.cfr_renamed_0 = 13;
                    sprgfn11.cfr_renamed_132.cfr_renamed_3 = "need dictionary";
                    this.spr\ufe34 = 0;
                    return -2;
                }
                case 7: {
                    n2 = this.cfr_renamed_107.cfr_renamed_12034(n2);
                    if (n2 == -3) {
                        sprgfn2 = this;
                        this.cfr_renamed_0 = 13;
                        this.spr\ufe34 = 0;
                        continue block16;
                    }
                    if (n2 == 0) {
                        n2 = n;
                    }
                    if (n2 != 1) {
                        return n2;
                    }
                    n2 = n;
                    sprgfn sprgfn12 = this;
                    this.cfr_renamed_107.cfr_renamed_12033(sprgfn12.cfr_renamed_93);
                    if (!sprgfn12.cfr_renamed_12031()) {
                        sprgfn2 = this;
                        this.cfr_renamed_0 = 12;
                        continue block16;
                    }
                    this.cfr_renamed_0 = 8;
                }
                case 8: {
                    if (this.cfr_renamed_132.cfr_renamed_0 == 0) {
                        return n2;
                    }
                    n2 = n;
                    sprgfn sprgfn13 = this;
                    --sprgfn13.cfr_renamed_132.cfr_renamed_0;
                    ++sprgfn13.cfr_renamed_132.cfr_renamed_152;
                    sprgfn13.cfr_renamed_137 = (sprgfn13.cfr_renamed_132.cfr_renamed_86[this.cfr_renamed_132.cfr_renamed_91++] & 0xFF & 0xFF) << 24 & 0xFF000000;
                    this.cfr_renamed_0 = 9;
                }
                case 9: {
                    if (this.cfr_renamed_132.cfr_renamed_0 == 0) {
                        return n2;
                    }
                    n2 = n;
                    sprgfn sprgfn14 = this;
                    --sprgfn14.cfr_renamed_132.cfr_renamed_0;
                    ++sprgfn14.cfr_renamed_132.cfr_renamed_152;
                    sprgfn14.cfr_renamed_137 += (long)((this.cfr_renamed_132.cfr_renamed_86[this.cfr_renamed_132.cfr_renamed_91++] & 0xFF & 0xFF) << 16) & 0xFF0000L;
                    this.cfr_renamed_0 = 10;
                }
                case 10: {
                    if (this.cfr_renamed_132.cfr_renamed_0 == 0) {
                        return n2;
                    }
                    n2 = n;
                    sprgfn sprgfn15 = this;
                    --sprgfn15.cfr_renamed_132.cfr_renamed_0;
                    ++sprgfn15.cfr_renamed_132.cfr_renamed_152;
                    sprgfn15.cfr_renamed_137 += (long)((this.cfr_renamed_132.cfr_renamed_86[this.cfr_renamed_132.cfr_renamed_91++] & 0xFF & 0xFF) << 8) & 0xFF00L;
                    this.cfr_renamed_0 = 11;
                }
                case 11: {
                    if (this.cfr_renamed_132.cfr_renamed_0 == 0) {
                        return n2;
                    }
                    n2 = n;
                    sprgfn sprgfn16 = this;
                    --sprgfn16.cfr_renamed_132.cfr_renamed_0;
                    ++sprgfn16.cfr_renamed_132.cfr_renamed_152;
                    sprgfn16.cfr_renamed_137 += (long)(this.cfr_renamed_132.cfr_renamed_86[this.cfr_renamed_132.cfr_renamed_91++] & 0xFF) & 0xFFL;
                    if ((int)this.cfr_renamed_93[0] != (int)this.cfr_renamed_137) {
                        sprgfn2 = this;
                        this.cfr_renamed_0 = 13;
                        this.cfr_renamed_132.cfr_renamed_3 = "incorrect data check";
                        this.spr\ufe34 = 5;
                        continue block16;
                    }
                    this.cfr_renamed_0 = 12;
                }
                case 12: {
                    return 1;
                }
                case 13: {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = this.cfr_renamed_132.cfr_renamed_3;
                    throw new sprurca(sprraia.cfr_renamed_11562(sprzyd.cfr_renamed_9("\u001b\u0006=G*\u00138\u0013<Gq\u001ci\u001ap"), objectArray));
                }
            }
            break;
        }
        throw new sprurca(sprqks.cfr_renamed_9("/\u0019\u000e\b\u001d\u0000\\\b\u000e\u001f\u0013\u001fR"));
    }

    @sprtea
    public int cfr_renamed_11586() {
        int n;
        if (this.cfr_renamed_0 != 13) {
            sprgfn sprgfn2 = this;
            sprgfn2.cfr_renamed_0 = 13;
            sprgfn2.spr\ufe34 = 0;
        }
        if ((n = this.cfr_renamed_132.cfr_renamed_0) == 0) {
            return -5;
        }
        sprgfn sprgfn3 = this;
        int n2 = sprgfn3.cfr_renamed_132.cfr_renamed_91;
        int n3 = sprgfn3.spr\ufe34;
        int n4 = n;
        while (n4 != 0 && n3 < 4) {
            n3 = this.cfr_renamed_132.cfr_renamed_86[n2] == cfr_renamed_119[n3] ? ++n3 : (this.cfr_renamed_132.cfr_renamed_86[n2] != 0 ? 0 : 4 - n3);
            ++n2;
            n4 = --n;
        }
        this.cfr_renamed_132.cfr_renamed_152 += (long)(n2 - this.cfr_renamed_132.cfr_renamed_91);
        this.cfr_renamed_132.cfr_renamed_91 = n2;
        this.cfr_renamed_132.cfr_renamed_0 = n;
        this.spr\ufe34 = n3;
        if (n3 != 4) {
            return -3;
        }
        sprgfn sprgfn4 = this;
        long l = sprgfn4.cfr_renamed_132.cfr_renamed_152;
        long l2 = sprgfn4.cfr_renamed_132.cfr_renamed_93;
        sprgfn4.cfr_renamed_41();
        sprgfn sprgfn5 = this;
        sprgfn5.cfr_renamed_132.cfr_renamed_152 = l;
        sprgfn5.cfr_renamed_132.cfr_renamed_93 = l2;
        sprgfn5.cfr_renamed_0 = 7;
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public int cfr_renamed_11580(spracn spracn2, int n) {
        void arg1;
        void arg0;
        sprgfn sprgfn2 = this;
        sprgfn2.cfr_renamed_132 = arg0;
        sprgfn2.cfr_renamed_132.cfr_renamed_3 = null;
        sprgfn2.cfr_renamed_107 = null;
        if (n < 8 || arg1 > 15) {
            this.cfr_renamed_11575();
            throw new sprurca(sprzyd.cfr_renamed_9("%8\u0003y\u00100\t=\b.G*\u000e#\u0002w"));
        }
        sprgfn sprgfn3 = this;
        sprgfn3.cfr_renamed_79 = arg1;
        sprgfn sprgfn4 = this;
        sprgfn3.cfr_renamed_107 = new sprzfn((spracn)arg0, this.cfr_renamed_12031() ? this : null, 1 << arg1);
        this.cfr_renamed_41();
        return 0;
    }

    @sprtea
    public void cfr_renamed_12035(boolean arg0) {
        this.cfr_renamed_86 = arg0;
    }

    static {
        byte[] byArray = new byte[4];
        byArray[0] = 0;
        byArray[1] = 0;
        byArray[2] = -1;
        byArray[3] = -1;
        cfr_renamed_119 = byArray;
    }

    public sprgfn(boolean bl) {
        sprgfn sprgfn2 = this;
        this.cfr_renamed_93 = new long[1];
        sprgfn2.cfr_renamed_86 = 1;
        sprgfn2.cfr_renamed_86 = bl;
    }
}

