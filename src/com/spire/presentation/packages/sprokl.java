/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.spriml;
import com.spire.presentation.packages.spriw;
import com.spire.presentation.packages.sprkdl;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprsun;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprtwe;
import com.spire.presentation.packages.sprtxk;
import com.spire.presentation.packages.spruip;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprxcl;
import com.spire.presentation.packages.sprybl;

public class sprokl
implements spriw {
    private byte[] cfr_renamed_88;
    private final String cfr_renamed_31;
    private long cfr_renamed_272;
    private long cfr_renamed_145;
    private final int cfr_renamed_114;
    private sprxcl cfr_renamed_96;
    private long cfr_renamed_105;
    private long cfr_renamed_137;
    private long cfr_renamed_79;
    private final int cfr_renamed_107;
    private int cfr_renamed_132;
    private final sprkdl cfr_renamed_102;
    private final long cfr_renamed_93;
    private long cfr_renamed_86;
    private final int cfr_renamed_152;
    private long cfr_renamed_112;
    private long cfr_renamed_119;
    private final int cfr_renamed_91;
    private long cfr_renamed_0;
    private final byte[] cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private final int cfr_renamed_3;
    private long cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_10434(sprxcl arg0) {
        switch (this.cfr_renamed_96) {
            case cfr_renamed_152: 
            case cfr_renamed_112: {
                sprokl sprokl2;
                sprokl sprokl3 = this;
                while (false) {
                }
                sprokl3.cfr_renamed_1[sprokl3.cfr_renamed_132] = -128;
                if (sprokl3.cfr_renamed_132 >= 8) {
                    sprokl sprokl4 = this;
                    sprokl2 = sprokl4;
                    sprokl4.cfr_renamed_0 ^= sprpxe.cfr_renamed_456(this.cfr_renamed_1, 0);
                    sprokl4.cfr_renamed_112 ^= sprpxe.cfr_renamed_456(this.cfr_renamed_1, 8) & -1L << 56 - (this.cfr_renamed_132 - 8 << 3);
                } else {
                    sprokl sprokl5 = this;
                    sprokl2 = sprokl5;
                    sprokl5.cfr_renamed_0 ^= sprpxe.cfr_renamed_456(this.cfr_renamed_1, 0) & -1L << 56 - (this.cfr_renamed_132 << 3);
                }
                sprokl2.cfr_renamed_10435(this.cfr_renamed_152);
                sprokl sprokl6 = this;
                break;
            }
            default: {
                sprokl sprokl6 = this;
            }
        }
        sprokl6.cfr_renamed_119 ^= 1L;
        sprokl sprokl7 = this;
        sprokl7.cfr_renamed_132 = 0;
        sprokl7.cfr_renamed_96 = arg0;
    }

    public int cfr_renamed_10299() {
        return this.cfr_renamed_114;
    }

    private /* synthetic */ void cfr_renamed_10328(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 + this.cfr_renamed_3 > arg2.length) {
            throw new sprwjl(sprsun.cfr_renamed_9("7\u000f,\n-\u000ex\u0018-\u001c>\u001f*Z,\u00157Z+\u00127\b,"));
        }
        long l = sprpxe.cfr_renamed_456(arg0, arg1);
        sprokl sprokl2 = this;
        sprpxe.cfr_renamed_450(sprokl2.cfr_renamed_0 ^ l, arg2, arg3);
        sprokl2.cfr_renamed_0 = l;
        if (sprokl2.cfr_renamed_3 == 16) {
            long l2 = sprpxe.cfr_renamed_456(arg0, arg1 + 8);
            sprpxe.cfr_renamed_450(this.cfr_renamed_112 ^ l2, arg2, arg3 + 8);
            this.cfr_renamed_112 = l2;
        }
        sprokl sprokl3 = this;
        sprokl3.cfr_renamed_10435(sprokl3.cfr_renamed_152);
    }

    private /* synthetic */ void cfr_renamed_10435(int arg0) {
        if (arg0 >= 8) {
            if (arg0 == 12) {
                sprokl sprokl2 = this;
                sprokl sprokl3 = this;
                sprokl3.cfr_renamed_10436(240L);
                sprokl3.cfr_renamed_10436(225L);
                sprokl2.cfr_renamed_10436(210L);
                sprokl2.cfr_renamed_10436(195L);
            }
            this.cfr_renamed_10436(180L);
            this.cfr_renamed_10436(165L);
        }
        sprokl sprokl4 = this;
        sprokl sprokl5 = this;
        this.cfr_renamed_10436(150L);
        sprokl5.cfr_renamed_10436(135L);
        sprokl5.cfr_renamed_10436(120L);
        sprokl4.cfr_renamed_10436(105L);
        sprokl4.cfr_renamed_10436(90L);
        this.cfr_renamed_10436(75L);
    }

    private /* synthetic */ void cfr_renamed_10436(long arg0) {
        sprokl sprokl2 = this;
        long l = sprokl2.cfr_renamed_0 ^ this.cfr_renamed_112 ^ this.cfr_renamed_86 ^ this.cfr_renamed_272 ^ arg0 ^ this.cfr_renamed_112 & (this.cfr_renamed_0 ^ this.cfr_renamed_86 ^ this.cfr_renamed_119 ^ arg0);
        sprokl sprokl3 = this;
        long l2 = sprokl2.cfr_renamed_0 ^ sprokl3.cfr_renamed_86 ^ this.cfr_renamed_272 ^ this.cfr_renamed_119 ^ arg0 ^ (this.cfr_renamed_112 ^ this.cfr_renamed_86 ^ arg0) & (this.cfr_renamed_112 ^ this.cfr_renamed_272);
        long l3 = sprokl3.cfr_renamed_112 ^ this.cfr_renamed_86 ^ this.cfr_renamed_119 ^ arg0 ^ this.cfr_renamed_272 & this.cfr_renamed_119;
        long l4 = sprokl2.cfr_renamed_0 ^ this.cfr_renamed_112 ^ this.cfr_renamed_86 ^ arg0 ^ (this.cfr_renamed_0 ^ 0xFFFFFFFFFFFFFFFFL) & (this.cfr_renamed_272 ^ this.cfr_renamed_119);
        long l5 = sprokl2.cfr_renamed_112 ^ this.cfr_renamed_272 ^ this.cfr_renamed_119 ^ (this.cfr_renamed_0 ^ this.cfr_renamed_119) & this.cfr_renamed_112;
        long l6 = l;
        sprokl2.cfr_renamed_0 = l6 ^ sprtwe.cfr_renamed_5186(l6, 19) ^ sprtwe.cfr_renamed_5186(l, 28);
        long l7 = l2;
        sprokl2.cfr_renamed_112 = l7 ^ sprtwe.cfr_renamed_5186(l7, 39) ^ sprtwe.cfr_renamed_5186(l2, 61);
        long l8 = l3;
        sprokl2.cfr_renamed_86 = l8 ^ sprtwe.cfr_renamed_5186(l8, 1) ^ sprtwe.cfr_renamed_5186(l3, 6) ^ 0xFFFFFFFFFFFFFFFFL;
        long l9 = l4;
        sprokl2.cfr_renamed_272 = l9 ^ sprtwe.cfr_renamed_5186(l9, 10) ^ sprtwe.cfr_renamed_5186(l4, 17);
        long l10 = l5;
        sprokl2.cfr_renamed_119 = l10 ^ sprtwe.cfr_renamed_5186(l10, 7) ^ sprtwe.cfr_renamed_5186(l5, 41);
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprddl {
        if (arg1 + arg2 > arg0.length) {
            throw new sprddl(spruip.cfr_renamed_9("WkNpJ%\\pXc[w\u001eqQj\u001evVjLq"));
        }
        boolean bl = this.cfr_renamed_10098();
        int n = 0;
        if (bl) {
            if (this.cfr_renamed_132 > 0) {
                sprokl sprokl2 = this;
                int n2 = sprokl2.cfr_renamed_3 - sprokl2.cfr_renamed_132;
                if (arg2 < n2) {
                    sprokl sprokl3 = this;
                    System.arraycopy(arg0, arg1, sprokl3.cfr_renamed_1, this.cfr_renamed_132, arg2);
                    sprokl3.cfr_renamed_132 += arg2;
                    return 0;
                }
                sprokl sprokl4 = this;
                System.arraycopy(arg0, arg1, sprokl4.cfr_renamed_1, sprokl4.cfr_renamed_132, n2);
                arg1 += n2;
                arg2 -= n2;
                sprokl sprokl5 = this;
                sprokl5.cfr_renamed_10327(sprokl5.cfr_renamed_1, 0, arg3, arg4);
                n = sprokl5.cfr_renamed_3;
            }
            int n3 = arg2;
            while (n3 >= this.cfr_renamed_3) {
                int n4 = arg1;
                this.cfr_renamed_10327(arg0, n4, arg3, arg4 + n);
                arg1 = n4 + this.cfr_renamed_3;
                n += this.cfr_renamed_3;
                n3 = arg2 -= this.cfr_renamed_3;
            }
        } else {
            int n5;
            block9: {
                sprokl sprokl6 = this;
                n5 = sprokl6.cfr_renamed_91 - sprokl6.cfr_renamed_132;
                if (arg2 < n5) {
                    sprokl sprokl7 = this;
                    System.arraycopy(arg0, arg1, sprokl7.cfr_renamed_1, this.cfr_renamed_132, arg2);
                    sprokl7.cfr_renamed_132 += arg2;
                    return 0;
                }
                do {
                    sprokl sprokl8 = this;
                    if (sprokl8.cfr_renamed_132 < sprokl8.cfr_renamed_3) break block9;
                    sprokl sprokl9 = this;
                    sprokl9.cfr_renamed_10328(sprokl9.cfr_renamed_1, 0, arg3, arg4 + n);
                    sprokl9.cfr_renamed_132 -= this.cfr_renamed_3;
                    sprokl sprokl10 = this;
                    System.arraycopy(sprokl9.cfr_renamed_1, sprokl10.cfr_renamed_3, sprokl10.cfr_renamed_1, 0, this.cfr_renamed_132);
                    n += this.cfr_renamed_3;
                } while (arg2 >= (n5 += this.cfr_renamed_3));
                sprokl sprokl11 = this;
                System.arraycopy(arg0, arg1, sprokl11.cfr_renamed_1, this.cfr_renamed_132, arg2);
                sprokl11.cfr_renamed_132 += arg2;
                return n;
            }
            sprokl sprokl12 = this;
            n5 = this.cfr_renamed_3 - sprokl12.cfr_renamed_132;
            sprokl sprokl13 = this;
            System.arraycopy(arg0, arg1, sprokl13.cfr_renamed_1, sprokl13.cfr_renamed_132, n5);
            arg1 += n5;
            this.cfr_renamed_10328(sprokl12.cfr_renamed_1, 0, arg3, arg4 + n);
            n += this.cfr_renamed_3;
            int n6 = arg2 -= n5;
            while (n6 >= this.cfr_renamed_91) {
                int n7 = arg1;
                this.cfr_renamed_10328(arg0, n7, arg3, arg4 + n);
                arg1 = n7 + this.cfr_renamed_3;
                n += this.cfr_renamed_3;
                n6 = arg2 -= this.cfr_renamed_3;
            }
        }
        System.arraycopy(arg0, arg1, this.cfr_renamed_1, 0, arg2);
        this.cfr_renamed_132 = arg2;
        return n;
    }

    /*
     * WARNING - void declaration
     */
    public sprokl(sprkdl sprkdl2) {
        void arg0;
        sprokl sprokl2 = this;
        this.cfr_renamed_96 = sprxcl.cfr_renamed_2;
        sprokl2.cfr_renamed_132 = 0;
        sprokl2.cfr_renamed_102 = sprkdl2;
        switch (spriml.cfr_renamed_4[arg0.ordinal()]) {
            case 1: {
                sprokl sprokl3 = this;
                while (false) {
                }
                sprokl sprokl4 = this;
                sprokl sprokl5 = this;
                this.cfr_renamed_107 = 20;
                sprokl5.cfr_renamed_114 = 16;
                sprokl5.cfr_renamed_3 = 8;
                sprokl4.cfr_renamed_93 = -6899501409222262784L;
                sprokl4.cfr_renamed_31 = "Ascon-80pq AEAD";
                break;
            }
            case 2: {
                sprokl sprokl3 = this;
                sprokl sprokl6 = this;
                sprokl sprokl7 = this;
                this.cfr_renamed_107 = 16;
                sprokl7.cfr_renamed_114 = 16;
                sprokl7.cfr_renamed_3 = 16;
                sprokl6.cfr_renamed_93 = -9187330011336540160L;
                sprokl6.cfr_renamed_31 = "Ascon-128a AEAD";
                break;
            }
            case 3: {
                sprokl sprokl3 = this;
                sprokl sprokl8 = this;
                sprokl sprokl9 = this;
                this.cfr_renamed_107 = 16;
                sprokl9.cfr_renamed_114 = 16;
                sprokl9.cfr_renamed_3 = 8;
                sprokl8.cfr_renamed_93 = -9205344418435956736L;
                sprokl8.cfr_renamed_31 = "Ascon-128 AEAD";
                break;
            }
            default: {
                throw new IllegalArgumentException(sprsun.cfr_renamed_9("\u00136\f9\u00161\u001ex\n9\b9\u0017=\u000e=\bx\t=\u000e,\u00136\u001dx\u001c7\bx;\u000b9\u00174x;\u001d;\u001c"));
            }
        }
        sprokl3.cfr_renamed_152 = this.cfr_renamed_3 == 8 ? 6 : 8;
        sprokl sprokl10 = this;
        this.cfr_renamed_91 = this.cfr_renamed_3 + sprokl10.cfr_renamed_114;
        this.cfr_renamed_1 = new byte[sprokl10.cfr_renamed_91];
    }

    private /* synthetic */ long cfr_renamed_10437(int arg0) {
        return 128L << 56 - (arg0 << 3);
    }

    private /* synthetic */ void cfr_renamed_10438(sprxcl arg0) {
        sprokl sprokl2;
        switch (spriml.cfr_renamed_4[this.cfr_renamed_102.ordinal()]) {
            case 3: {
                sprokl sprokl3 = this;
                sprokl2 = sprokl3;
                sprokl3.cfr_renamed_112 ^= this.cfr_renamed_4;
                sprokl3.cfr_renamed_86 ^= this.cfr_renamed_105;
                break;
            }
            case 2: {
                sprokl sprokl4 = this;
                sprokl2 = sprokl4;
                sprokl4.cfr_renamed_86 ^= this.cfr_renamed_4;
                sprokl4.cfr_renamed_272 ^= this.cfr_renamed_105;
                break;
            }
            case 1: {
                sprokl sprokl5 = this;
                while (false) {
                }
                sprokl2 = sprokl5;
                sprokl5.cfr_renamed_112 ^= this.cfr_renamed_145 << 32 | this.cfr_renamed_4 >> 32;
                sprokl5.cfr_renamed_86 ^= this.cfr_renamed_4 << 32 | this.cfr_renamed_105 >> 32;
                sprokl5.cfr_renamed_272 ^= this.cfr_renamed_105 << 32;
                break;
            }
            default: {
                throw new IllegalStateException();
            }
        }
        sprokl2.cfr_renamed_10435(12);
        sprokl sprokl6 = this;
        sprokl6.cfr_renamed_272 ^= this.cfr_renamed_4;
        sprokl6.cfr_renamed_119 ^= this.cfr_renamed_105;
        sprokl6.cfr_renamed_96 = arg0;
    }

    @Override
    public int cfr_renamed_504(byte arg0, byte[] arg1, int arg2) throws sprddl {
        byte[] byArray = new byte[1];
        byArray[0] = arg0;
        return this.cfr_renamed_505(byArray, 0, 1, arg1, arg2);
    }

    @Override
    public int cfr_renamed_1202(int arg0) {
        int n = Math.max(0, arg0);
        switch (this.cfr_renamed_96) {
            case cfr_renamed_119: 
            case cfr_renamed_152: {
                while (false) {
                }
                return Math.max(0, n - this.cfr_renamed_114);
            }
            case cfr_renamed_4: 
            case cfr_renamed_3: {
                return Math.max(0, n + this.cfr_renamed_132 - this.cfr_renamed_114);
            }
            case cfr_renamed_1: 
            case cfr_renamed_91: {
                return n + this.cfr_renamed_132 + this.cfr_renamed_114;
            }
            default: {
                return n + this.cfr_renamed_114;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean cfr_renamed_10098() {
        switch (this.cfr_renamed_96) {
            case cfr_renamed_119: 
            case cfr_renamed_152: {
                this.cfr_renamed_10434(sprxcl.cfr_renamed_4);
                return false;
            }
            case cfr_renamed_86: 
            case cfr_renamed_112: {
                this.cfr_renamed_10434(sprxcl.cfr_renamed_91);
                return true;
            }
            case cfr_renamed_4: {
                return false;
            }
            case cfr_renamed_91: {
                return true;
            }
            case cfr_renamed_1: {
                throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(spruip.cfr_renamed_9("\u001ef_kPjJ%\\`\u001ew[pM`Z%XjL%[k]wGuJlQk")).toString());
            }
        }
        throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprsun.cfr_renamed_9("Z6\u001f=\u001e+Z,\u0015x\u0018=Z1\u00141\u000e1\u001b4\u0013\"\u001f<")).toString());
    }

    private /* synthetic */ void cfr_renamed_10318(byte[] arg0, int arg1) {
        sprokl sprokl2 = this;
        sprokl2.cfr_renamed_0 ^= sprpxe.cfr_renamed_456(arg0, arg1);
        if (sprokl2.cfr_renamed_3 == 16) {
            this.cfr_renamed_112 ^= sprpxe.cfr_renamed_456(arg0, 8 + arg1);
        }
        sprokl sprokl3 = this;
        sprokl3.cfr_renamed_10435(sprokl3.cfr_renamed_152);
    }

    private /* synthetic */ void cfr_renamed_3402(boolean arg0) {
        sprokl sprokl2;
        block8: {
            if (arg0) {
                this.cfr_renamed_2 = null;
            }
            sproze.cfr_renamed_3408(this.cfr_renamed_1);
            this.cfr_renamed_132 = 0;
            switch (this.cfr_renamed_96) {
                case cfr_renamed_119: 
                case cfr_renamed_86: {
                    break;
                }
                case cfr_renamed_152: 
                case cfr_renamed_4: 
                case cfr_renamed_3: {
                    while (false) {
                    }
                    sprokl2 = this;
                    this.cfr_renamed_96 = sprxcl.cfr_renamed_119;
                    break block8;
                }
                case cfr_renamed_112: 
                case cfr_renamed_1: 
                case cfr_renamed_91: {
                    this.cfr_renamed_96 = sprxcl.cfr_renamed_1;
                    return;
                }
                default: {
                    throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(spruip.cfr_renamed_9("\u001ek[`Zv\u001eqQ%\\`\u001elPlJl_iW\u007f[a")).toString());
                }
            }
            sprokl2 = this;
        }
        sprokl2.cfr_renamed_10439();
        if (this.cfr_renamed_88 != null) {
            sprokl sprokl3 = this;
            sprokl3.cfr_renamed_2417(this.cfr_renamed_88, 0, sprokl3.cfr_renamed_88.length);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int cfr_renamed_2345(int arg0) {
        int n;
        int n2 = Math.max(0, arg0);
        switch (this.cfr_renamed_96) {
            case cfr_renamed_119: 
            case cfr_renamed_152: {
                n = n2 = Math.max(0, n2 - this.cfr_renamed_114);
                return n - n2 % this.cfr_renamed_3;
            }
            case cfr_renamed_4: 
            case cfr_renamed_3: {
                n = n2 = Math.max(0, n2 + this.cfr_renamed_132 - this.cfr_renamed_114);
                return n - n2 % this.cfr_renamed_3;
            }
            case cfr_renamed_1: 
            case cfr_renamed_91: {
                n = n2 = n2 + this.cfr_renamed_132;
                return n - n2 % this.cfr_renamed_3;
            }
        }
        n = n2;
        return n - n2 % this.cfr_renamed_3;
    }

    @Override
    public void cfr_renamed_2417(byte[] arg0, int arg1, int arg2) {
        if (arg1 + arg2 > arg0.length) {
            throw new sprddl(sprsun.cfr_renamed_9("\u00136\n-\u000ex\u0018-\u001c>\u001f*Z,\u00157Z+\u00127\b,"));
        }
        if (arg2 <= 0) {
            return;
        }
        sprokl sprokl2 = this;
        sprokl2.cfr_renamed_10100();
        if (sprokl2.cfr_renamed_132 > 0) {
            sprokl sprokl3 = this;
            int n = sprokl3.cfr_renamed_3 - sprokl3.cfr_renamed_132;
            if (arg2 < n) {
                sprokl sprokl4 = this;
                System.arraycopy(arg0, arg1, sprokl4.cfr_renamed_1, this.cfr_renamed_132, arg2);
                sprokl4.cfr_renamed_132 += arg2;
                return;
            }
            sprokl sprokl5 = this;
            System.arraycopy(arg0, arg1, sprokl5.cfr_renamed_1, sprokl5.cfr_renamed_132, n);
            arg1 += n;
            arg2 -= n;
            sprokl sprokl6 = this;
            sprokl6.cfr_renamed_10318(sprokl6.cfr_renamed_1, 0);
        }
        int n = arg2;
        while (n >= this.cfr_renamed_3) {
            int n2 = arg1;
            this.cfr_renamed_10318(arg0, n2);
            arg1 = n2 + this.cfr_renamed_3;
            n = arg2 - this.cfr_renamed_3;
        }
        System.arraycopy(arg0, arg1, this.cfr_renamed_1, 0, arg2);
        this.cfr_renamed_132 = arg2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) throws IllegalArgumentException {
        sprokl sprokl2;
        sprtpk sprtpk2;
        byte[] byArray;
        sprtpk sprtpk3;
        Object object;
        if (!(arg1 instanceof sprtxk)) {
            if (!(arg1 instanceof sprkpk)) throw new IllegalArgumentException(sprsun.cfr_renamed_9("\u00136\f9\u00161\u001ex\n9\b9\u0017=\u000e=\b+Z(\u001b+\t=\u001ex\u000e7Z\u0019\t;\u00156"));
            object = (sprkpk)arg1;
            sprtpk3 = (sprtpk)((sprkpk)object).cfr_renamed_284();
            byArray = ((sprkpk)object).cfr_renamed_1205();
            sprtpk2 = sprtpk3;
            this.cfr_renamed_88 = null;
        } else {
            object = (sprtxk)arg1;
            sprtpk3 = ((sprtxk)object).cfr_renamed_1521();
            byArray = ((sprtxk)object).cfr_renamed_596();
            sprbj sprbj2 = object;
            this.cfr_renamed_88 = ((sprtxk)sprbj2).cfr_renamed_3388();
            int n = ((sprtxk)sprbj2).cfr_renamed_2404();
            if (n != this.cfr_renamed_114 * 8) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, spruip.cfr_renamed_9("wkHdRlZ%HdRp[%XjL%sD}%MlD`\u0004%")).append(n).toString());
            }
            sprtpk2 = sprtpk3;
        }
        if (sprtpk2 == null) {
            throw new IllegalArgumentException(spruip.cfr_renamed_9("\u007fv]jP%wkWq\u001eu_w_h[q[wM%SpMq\u001elPfRpZ`\u001ed\u001en[|"));
        }
        if (byArray == null || byArray.length != this.cfr_renamed_114) {
            throw new IllegalArgumentException((Object)((Object)this.cfr_renamed_102) + sprsun.cfr_renamed_9("Z*\u001f)\u000f1\b=\tx\u001f \u001b;\u000e4\u0003x") + this.cfr_renamed_114 + spruip.cfr_renamed_9("\u001egGq[v\u001ejX%wS"));
        }
        byte[] byArray2 = sprtpk3.cfr_renamed_1521();
        object = byArray2;
        if (byArray2.length != this.cfr_renamed_107) {
            throw new IllegalArgumentException((Object)((Object)this.cfr_renamed_102) + sprsun.cfr_renamed_9("x\u0011=\u0003x\u0017-\t,Z:\u001fx") + this.cfr_renamed_107 + spruip.cfr_renamed_9("%\\|J`M%RjPb"));
        }
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), 128, arg1, sprlrk.cfr_renamed_9915(arg0)));
        this.cfr_renamed_79 = sprpxe.cfr_renamed_456(byArray, 0);
        this.cfr_renamed_137 = sprpxe.cfr_renamed_456(byArray, 8);
        if (this.cfr_renamed_107 == 16) {
            sprokl2 = this;
            this.cfr_renamed_4 = sprpxe.cfr_renamed_456((byte[])object, 0);
            this.cfr_renamed_105 = sprpxe.cfr_renamed_456((byte[])object, 8);
        } else {
            if (this.cfr_renamed_107 != 20) throw new IllegalStateException();
            sprokl2 = this;
            Object object2 = object;
            this.cfr_renamed_145 = sprpxe.cfr_renamed_446((byte[])object2, 0);
            this.cfr_renamed_4 = sprpxe.cfr_renamed_456((byte[])object2, 4);
            this.cfr_renamed_105 = sprpxe.cfr_renamed_456((byte[])object, 12);
        }
        sprokl2.cfr_renamed_96 = arg0 ? sprxcl.cfr_renamed_86 : sprxcl.cfr_renamed_119;
        this.cfr_renamed_3402(true);
    }

    private /* synthetic */ void cfr_renamed_10440(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        sprokl sprokl2;
        block3: {
            block2: {
                block1: {
                    if (arg2 < 8) break block1;
                    sprokl sprokl3 = this;
                    sprokl3.cfr_renamed_0 ^= sprpxe.cfr_renamed_456(arg0, arg1);
                    arg1 += 8;
                    sprpxe.cfr_renamed_450(sprokl3.cfr_renamed_0, arg3, arg4);
                    arg4 += 8;
                    sprokl3.cfr_renamed_112 ^= this.cfr_renamed_10437(arg2 -= 8);
                    if (arg2 == 0) break block2;
                    sprokl sprokl4 = this;
                    sprokl2 = sprokl4;
                    sprokl4.cfr_renamed_112 ^= sprpxe.cfr_renamed_5176(arg0, arg1, arg2);
                    sprpxe.cfr_renamed_5164(sprokl4.cfr_renamed_112, arg3, arg4, arg2);
                    break block3;
                }
                this.cfr_renamed_0 ^= this.cfr_renamed_10437(arg2);
                if (arg2 != 0) {
                    sprokl sprokl5 = this;
                    sprokl5.cfr_renamed_0 ^= sprpxe.cfr_renamed_5176(arg0, arg1, arg2);
                    sprpxe.cfr_renamed_5164(sprokl5.cfr_renamed_0, arg3, arg4, arg2);
                }
            }
            sprokl2 = this;
        }
        sprokl2.cfr_renamed_10438(sprxcl.cfr_renamed_1);
    }

    private /* synthetic */ void cfr_renamed_10439() {
        sprokl sprokl2 = this;
        sprokl2.cfr_renamed_0 = sprokl2.cfr_renamed_93;
        if (sprokl2.cfr_renamed_107 == 20) {
            this.cfr_renamed_0 ^= this.cfr_renamed_145;
        }
        sprokl sprokl3 = this;
        sprokl sprokl4 = this;
        sprokl4.cfr_renamed_112 = sprokl4.cfr_renamed_4;
        sprokl4.cfr_renamed_86 = sprokl4.cfr_renamed_105;
        sprokl4.cfr_renamed_272 = sprokl4.cfr_renamed_79;
        sprokl3.cfr_renamed_119 = sprokl3.cfr_renamed_137;
        sprokl3.cfr_renamed_10435(12);
        if (this.cfr_renamed_107 == 20) {
            this.cfr_renamed_86 ^= this.cfr_renamed_145;
        }
        sprokl sprokl5 = this;
        sprokl5.cfr_renamed_272 ^= this.cfr_renamed_4;
        sprokl5.cfr_renamed_119 ^= this.cfr_renamed_105;
    }

    private /* synthetic */ void cfr_renamed_10441(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        if (arg2 >= 8) {
            long l = sprpxe.cfr_renamed_456(arg0, arg1);
            sprokl sprokl2 = this;
            this.cfr_renamed_0 ^= l;
            arg1 += 8;
            sprpxe.cfr_renamed_450(sprokl2.cfr_renamed_0, arg3, arg4);
            sprokl2.cfr_renamed_0 = l;
            arg4 += 8;
            sprokl2.cfr_renamed_112 ^= this.cfr_renamed_10437(arg2 -= 8);
            if (arg2 != 0) {
                long l2 = sprpxe.cfr_renamed_5176(arg0, arg1, arg2);
                sprokl sprokl3 = this;
                sprokl3.cfr_renamed_112 ^= l2;
                sprpxe.cfr_renamed_5164(sprokl3.cfr_renamed_112, arg3, arg4, arg2);
                sprokl3.cfr_renamed_112 &= -1L >>> (arg2 << 3);
                sprokl3.cfr_renamed_112 ^= l2;
            }
        } else {
            this.cfr_renamed_0 ^= this.cfr_renamed_10437(arg2);
            if (arg2 != 0) {
                long l = sprpxe.cfr_renamed_5176(arg0, arg1, arg2);
                sprokl sprokl4 = this;
                sprokl4.cfr_renamed_0 ^= l;
                sprpxe.cfr_renamed_5164(sprokl4.cfr_renamed_0, arg3, arg4, arg2);
                sprokl4.cfr_renamed_0 &= -1L >>> (arg2 << 3);
                sprokl4.cfr_renamed_0 ^= l;
            }
        }
        this.cfr_renamed_10438(sprxcl.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_3212(byte by) {
        void arg0;
        sprokl sprokl2 = this;
        sprokl2.cfr_renamed_10100();
        sprokl sprokl3 = this;
        sprokl2.cfr_renamed_1[sprokl3.cfr_renamed_132] = arg0;
        if (++sprokl3.cfr_renamed_132 == this.cfr_renamed_3) {
            sprokl sprokl4 = this;
            sprokl4.cfr_renamed_10318(sprokl4.cfr_renamed_1, 0);
        }
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_3402(true);
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws IllegalStateException, sprull, sprddl {
        if (this.cfr_renamed_10098()) {
            sprokl sprokl2 = this;
            int n = sprokl2.cfr_renamed_132 + sprokl2.cfr_renamed_114;
            if (arg1 + n > arg0.length) {
                throw new sprwjl(sprsun.cfr_renamed_9("7\u000f,\n-\u000ex\u0018-\u001c>\u001f*Z,\u00157Z+\u00127\b,"));
            }
            sprokl sprokl3 = this;
            sprokl sprokl4 = this;
            sprokl4.cfr_renamed_10440(sprokl3.cfr_renamed_1, 0, sprokl4.cfr_renamed_132, arg0, arg1);
            sprokl3.cfr_renamed_2 = new byte[sprokl3.cfr_renamed_114];
            sprpxe.cfr_renamed_450(sprokl3.cfr_renamed_272, this.cfr_renamed_2, 0);
            sprpxe.cfr_renamed_450(sprokl3.cfr_renamed_119, this.cfr_renamed_2, 8);
            System.arraycopy(sprokl3.cfr_renamed_2, 0, arg0, arg1 + this.cfr_renamed_132, this.cfr_renamed_114);
            this.cfr_renamed_3402(false);
            return n;
        }
        sprokl sprokl5 = this;
        if (sprokl5.cfr_renamed_132 < sprokl5.cfr_renamed_114) {
            throw new sprull(spruip.cfr_renamed_9("ZdJd\u001eqQj\u001evVjLq"));
        }
        sprokl sprokl6 = this;
        sprokl6.cfr_renamed_132 -= this.cfr_renamed_114;
        int n = sprokl6.cfr_renamed_132;
        if (arg1 + n > arg0.length) {
            throw new sprwjl(sprsun.cfr_renamed_9("7\u000f,\n-\u000ex\u0018-\u001c>\u001f*Z,\u00157Z+\u00127\b,"));
        }
        sprokl sprokl7 = this;
        sprokl sprokl8 = this;
        sprokl8.cfr_renamed_10441(sprokl7.cfr_renamed_1, 0, sprokl8.cfr_renamed_132, arg0, arg1);
        sprokl sprokl9 = this;
        sprokl7.cfr_renamed_272 ^= sprpxe.cfr_renamed_456(sprokl9.cfr_renamed_1, sprokl9.cfr_renamed_132);
        sprokl sprokl10 = this;
        sprokl7.cfr_renamed_119 ^= sprpxe.cfr_renamed_456(sprokl10.cfr_renamed_1, sprokl10.cfr_renamed_132 + 8);
        if ((sprokl7.cfr_renamed_272 | this.cfr_renamed_119) != 0L) {
            throw new sprull(new StringBuilder().insert(0, spruip.cfr_renamed_9("h_f\u001efV`]n\u001elP%")).append(this.cfr_renamed_1315()).append(sprsun.cfr_renamed_9("x\u001c9\u00134\u001f<")).toString());
        }
        this.cfr_renamed_3402(true);
        return n;
    }

    @Override
    public String cfr_renamed_1315() {
        return this.cfr_renamed_31;
    }

    public int cfr_renamed_10294() {
        return this.cfr_renamed_107;
    }

    private /* synthetic */ void cfr_renamed_10327(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 + this.cfr_renamed_3 > arg2.length) {
            throw new sprwjl(spruip.cfr_renamed_9("jKqNpJ%\\pXc[w\u001eqQj\u001evVjLq"));
        }
        sprokl sprokl2 = this;
        sprokl2.cfr_renamed_0 ^= sprpxe.cfr_renamed_456(arg0, arg1);
        sprpxe.cfr_renamed_450(sprokl2.cfr_renamed_0, arg2, arg3);
        if (sprokl2.cfr_renamed_3 == 16) {
            sprokl sprokl3 = this;
            sprokl3.cfr_renamed_112 ^= sprpxe.cfr_renamed_456(arg0, arg1 + 8);
            sprpxe.cfr_renamed_450(sprokl3.cfr_renamed_112, arg2, arg3 + 8);
        }
        sprokl sprokl4 = this;
        sprokl4.cfr_renamed_10435(sprokl4.cfr_renamed_152);
    }

    @Override
    public byte[] cfr_renamed_1472() {
        return this.cfr_renamed_2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_10100() {
        switch (this.cfr_renamed_96) {
            case cfr_renamed_119: {
                this.cfr_renamed_96 = sprxcl.cfr_renamed_152;
                return;
            }
            case cfr_renamed_86: {
                this.cfr_renamed_96 = sprxcl.cfr_renamed_112;
                return;
            }
            case cfr_renamed_152: 
            case cfr_renamed_112: {
                return;
            }
            case cfr_renamed_1: {
                throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprsun.cfr_renamed_9("Z;\u001b6\u00147\u000ex\u0018=Z*\u001f-\t=\u001ex\u001c7\bx\u001f6\u0019*\u0003(\u000e1\u00156")).toString());
            }
        }
        throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(spruip.cfr_renamed_9("\u001ek[`Zv\u001eqQ%\\`\u001elPlJl_iW\u007f[a")).toString());
    }

    public String cfr_renamed_10442() {
        return sprsun.cfr_renamed_9("\fiTj");
    }
}

