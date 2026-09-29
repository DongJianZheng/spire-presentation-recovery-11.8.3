/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprhcl;
import com.spire.presentation.packages.spriai;
import com.spire.presentation.packages.sprinh;
import com.spire.presentation.packages.spriw;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprtxk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprwxk;

public class sprcal
implements spriw {
    private final sprhcl cfr_renamed_96;
    private byte[] cfr_renamed_105;
    private long cfr_renamed_137;
    private long cfr_renamed_79;
    private int cfr_renamed_107;
    private final byte[] cfr_renamed_132;
    private final byte[] cfr_renamed_102;
    private static final int cfr_renamed_93 = 64;
    private static final int cfr_renamed_86 = 16;
    private static final byte[] cfr_renamed_152 = new byte[15];
    private final byte[] cfr_renamed_112;
    private static final long cfr_renamed_119 = 274877906880L;
    private final byte[] cfr_renamed_91;
    private static final int cfr_renamed_0 = 12;
    private static final int cfr_renamed_1 = 32;
    private int cfr_renamed_2;
    private static final long cfr_renamed_3 = -1L;
    private final spraq cfr_renamed_4;

    public sprcal() {
        this(new sprwxk());
    }

    @Override
    public String cfr_renamed_1315() {
        return spriai.cfr_renamed_9("H\u0014j?c\u001d9L[\u0013g\u0005:O;I");
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_10092(true, true);
    }

    private /* synthetic */ void cfr_renamed_10093(int n) {
        sprcal sprcal2 = this;
        sprcal2.cfr_renamed_10094(sprcal2.cfr_renamed_137);
        sprcal2.cfr_renamed_2 = n;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int cfr_renamed_2345(int arg0) {
        int n;
        int n2 = Math.max(0, arg0) + this.cfr_renamed_107;
        switch (this.cfr_renamed_2) {
            case 5: 
            case 6: 
            case 7: {
                n = n2 = Math.max(0, n2 - 16);
                return n - n2 % 64;
            }
            case 1: 
            case 2: 
            case 3: {
                break;
            }
            default: {
                throw new IllegalStateException();
            }
        }
        n = n2;
        return n - n2 % 64;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_10095() {
        byte[] byArray = new byte[64];
        try {
            sprcal sprcal2 = this;
            sprcal2.cfr_renamed_96.cfr_renamed_505(byArray, 0, 64, byArray, 0);
            sprcal2.cfr_renamed_4.cfr_renamed_5692(new sprtpk(byArray, 0, 32));
            return;
        }
        finally {
            sproze.cfr_renamed_3408(byArray);
        }
    }

    private /* synthetic */ void cfr_renamed_10096(int arg0) {
        sprcal sprcal2 = this;
        sprcal sprcal3 = this;
        sprcal3.cfr_renamed_10094(this.cfr_renamed_79);
        byte[] byArray = new byte[16];
        sprpxe.cfr_renamed_444(sprcal2.cfr_renamed_137, byArray, 0);
        sprpxe.cfr_renamed_444(sprcal3.cfr_renamed_79, byArray, 8);
        sprcal2.cfr_renamed_4.cfr_renamed_1197(byArray, 0, 16);
        sprcal2.cfr_renamed_4.cfr_renamed_1219(this.cfr_renamed_112, 0);
        this.cfr_renamed_2 = arg0;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int cfr_renamed_1202(int arg0) {
        int n = Math.max(0, arg0) + this.cfr_renamed_107;
        switch (this.cfr_renamed_2) {
            case 5: 
            case 6: 
            case 7: {
                return Math.max(0, n - 16);
            }
            case 1: 
            case 2: 
            case 3: {
                return n + 16;
            }
        }
        throw new IllegalStateException();
    }

    private /* synthetic */ long cfr_renamed_10097(long arg0, int arg1, long arg2) {
        if (arg0 + Long.MIN_VALUE > arg2 - (long)arg1 + Long.MIN_VALUE) {
            throw new IllegalStateException(sprinh.cfr_renamed_9("\r3,35z$\"\"?$>$>"));
        }
        return arg0 + (long)arg1;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprddl {
        if (null == arg0) {
            throw new NullPointerException(spriai.cfr_renamed_9("[b\u0012,\\h\u001de\u0012d\b+\u001en\\e\tg\u0010"));
        }
        if (null == arg3) {
            // empty if block
        }
        if (arg1 < 0) {
            throw new IllegalArgumentException(sprinh.cfr_renamed_9("f3/\u0015'<fz\";/4..a8$z/?&;537?"));
        }
        if (arg2 < 0) {
            throw new IllegalArgumentException(spriai.cfr_renamed_9(",\u0010n\u0012,\\h\u001de\u0012d\b+\u001en\\e\u0019l\u001d\u007f\u0015}\u0019"));
        }
        if (arg1 > arg0.length - arg2) {
            throw new sprddl(sprinh.cfr_renamed_9("\b41/5z#/'<$(a..5a))53."));
        }
        if (arg4 < 0) {
            throw new IllegalArgumentException(spriai.cfr_renamed_9("[d\t\u007f3m\u001a,\\h\u001de\u0012d\b+\u001en\\e\u0019l\u001d\u007f\u0015}\u0019"));
        }
        this.cfr_renamed_10098();
        int n = 0;
        switch (this.cfr_renamed_2) {
            case 7: {
                int n2;
                int n3 = n2 = 0;
                while (n3 < arg2) {
                    sprcal sprcal2 = this;
                    this.cfr_renamed_102[sprcal2.cfr_renamed_107] = arg0[arg1 + n2];
                    if (++sprcal2.cfr_renamed_107 == this.cfr_renamed_102.length) {
                        sprcal sprcal3 = this;
                        sprcal sprcal4 = this;
                        this.cfr_renamed_4.cfr_renamed_1197(sprcal4.cfr_renamed_102, 0, 64);
                        sprcal3.cfr_renamed_10099(sprcal4.cfr_renamed_102, 0, 64, arg3, arg4 + n);
                        n += 64;
                        System.arraycopy(sprcal3.cfr_renamed_102, 64, this.cfr_renamed_102, 0, 16);
                        sprcal3.cfr_renamed_107 = 16;
                    }
                    n3 = ++n2;
                }
                return n;
            }
            case 3: {
                int n4;
                if (this.cfr_renamed_107 != 0) {
                    while (arg2 > 0) {
                        sprcal sprcal5 = this;
                        --arg2;
                        byte by = arg0[arg1];
                        ++arg1;
                        this.cfr_renamed_102[sprcal5.cfr_renamed_107] = by;
                        if (++sprcal5.cfr_renamed_107 != 64) continue;
                        sprcal sprcal6 = this;
                        sprcal6.cfr_renamed_10099(this.cfr_renamed_102, 0, 64, arg3, arg4);
                        sprcal6.cfr_renamed_4.cfr_renamed_1197(arg3, arg4, 64);
                        sprcal6.cfr_renamed_107 = 0;
                        n = 64;
                        n4 = arg2;
                        break;
                    }
                } else {
                    n4 = arg2;
                }
                while (n4 >= 64) {
                    sprcal sprcal7 = this;
                    sprcal7.cfr_renamed_10099(arg0, arg1, 64, arg3, arg4 + n);
                    arg1 += 64;
                    int n5 = arg4 + n;
                    n += 64;
                    sprcal7.cfr_renamed_4.cfr_renamed_1197(arg3, n5, 64);
                    n4 = arg2 -= 64;
                }
                if (arg2 <= 0) return n;
                System.arraycopy(arg0, arg1, this.cfr_renamed_102, 0, arg2);
                this.cfr_renamed_107 = arg2;
                return n;
            }
            default: {
                throw new IllegalStateException();
            }
        }
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) throws IllegalArgumentException {
        sprkpk sprkpk2;
        byte[] byArray;
        sprtpk sprtpk2;
        if (arg1 instanceof sprtxk) {
            sprtxk sprtxk2 = (sprtxk)arg1;
            int n = sprtxk2.cfr_renamed_2404();
            if (128 != n) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprinh.cfr_renamed_9("\b47;-3%z7;-/$z'53z\f\u001b\u0002z23;?{z")).append(n).toString());
            }
            sprtxk sprtxk3 = sprtxk2;
            sprtpk2 = sprtxk3.cfr_renamed_1521();
            byArray = sprtxk3.cfr_renamed_596();
            sprkpk2 = new sprkpk(sprtpk2, byArray);
            this.cfr_renamed_105 = sprtxk2.cfr_renamed_3388();
        } else if (arg1 instanceof sprkpk) {
            sprkpk sprkpk3 = (sprkpk)arg1;
            sprtpk2 = (sprtpk)sprkpk3.cfr_renamed_284();
            sprkpk sprkpk4 = sprkpk3;
            byArray = sprkpk4.cfr_renamed_1205();
            sprkpk2 = sprkpk4;
            this.cfr_renamed_105 = null;
        } else {
            throw new IllegalArgumentException(spriai.cfr_renamed_9("\u0015e\nj\u0010b\u0018+\fj\u000ej\u0011n\bn\u000ex\\{\u001dx\u000fn\u0018+\bd\\H\u0014j?c\u001d9L[\u0013g\u0005:O;I"));
        }
        if (null == sprtpk2) {
            if (0 == this.cfr_renamed_2) {
                throw new IllegalArgumentException(sprinh.cfr_renamed_9("\u0011$#a74)5z#?a)1?\"3'3$>a3/z(4(.(;-z(4(."));
            }
        } else if (32 != sprtpk2.cfr_renamed_4600()) {
            throw new IllegalArgumentException(spriai.cfr_renamed_9("@\u0019r\\f\tx\b+\u001en\\9I=\\i\u0015\u007f\u000f"));
        }
        if (null == byArray || 12 != byArray.length) {
            throw new IllegalArgumentException(sprinh.cfr_renamed_9("\u0014.4\"?a74)5z#?acwz#35)"));
        }
        if (0 != this.cfr_renamed_2 && arg0 && sproze.cfr_renamed_92(this.cfr_renamed_91, byArray) && (null == sprtpk2 || sproze.cfr_renamed_92(this.cfr_renamed_132, sprtpk2.cfr_renamed_1521()))) {
            throw new IllegalArgumentException(spriai.cfr_renamed_9("h\u001de\u0012d\b+\u000en\tx\u0019+\u0012d\u0012h\u0019+\u001ad\u000e+?c\u001dH\u0014jN;,d\u0010rM8L>\\n\u0012h\u000er\f\u007f\u0015d\u0012"));
        }
        if (null != sprtpk2) {
            sprtpk2.cfr_renamed_9980(this.cfr_renamed_132, 0, 32);
        }
        System.arraycopy(byArray, 0, this.cfr_renamed_91, 0, 12);
        this.cfr_renamed_96.cfr_renamed_5535(true, sprkpk2);
        this.cfr_renamed_2 = arg0 ? 1 : 5;
        this.cfr_renamed_10092(true, false);
    }

    private /* synthetic */ void cfr_renamed_10094(long arg0) {
        int n = (int)arg0 & 0xF;
        if (0 != n) {
            this.cfr_renamed_4.cfr_renamed_1197(cfr_renamed_152, 0, 16 - n);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_10092(boolean bl, boolean bl2) {
        void v1;
        block8: {
            void arg1;
            sproze.cfr_renamed_3408(this.cfr_renamed_102);
            if (bl) {
                sproze.cfr_renamed_3408(this.cfr_renamed_112);
            }
            sprcal sprcal2 = this;
            this.cfr_renamed_137 = 0L;
            sprcal2.cfr_renamed_79 = 0L;
            sprcal2.cfr_renamed_107 = 0;
            switch (this.cfr_renamed_2) {
                case 1: 
                case 5: {
                    break;
                }
                case 6: 
                case 7: 
                case 8: {
                    this.cfr_renamed_2 = 5;
                    v1 = arg1;
                    break block8;
                }
                case 2: 
                case 3: 
                case 4: {
                    this.cfr_renamed_2 = 4;
                    return;
                }
                default: {
                    throw new IllegalStateException();
                }
            }
            v1 = arg1;
        }
        if (v1 != false) {
            this.cfr_renamed_96.cfr_renamed_41();
        }
        this.cfr_renamed_10095();
        if (null != this.cfr_renamed_105) {
            sprcal sprcal3 = this;
            sprcal3.cfr_renamed_2417(this.cfr_renamed_105, 0, sprcal3.cfr_renamed_105.length);
        }
    }

    private /* synthetic */ void cfr_renamed_10099(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        if (arg4 > arg3.length - arg2) {
            throw new sprwjl(sprinh.cfr_renamed_9("\u00154.1/5z#/'<$(a..5a))53."));
        }
        this.cfr_renamed_96.cfr_renamed_505(arg0, arg1, arg2, arg3, arg4);
        sprcal sprcal2 = this;
        sprcal2.cfr_renamed_79 = sprcal2.cfr_renamed_10097(sprcal2.cfr_renamed_79, arg2, 274877906880L);
    }

    @Override
    public int cfr_renamed_504(byte arg0, byte[] arg1, int arg2) throws sprddl {
        sprcal sprcal2 = this;
        sprcal2.cfr_renamed_10098();
        switch (sprcal2.cfr_renamed_2) {
            case 7: {
                sprcal sprcal3 = this;
                sprcal3.cfr_renamed_102[sprcal3.cfr_renamed_107] = arg0;
                if (++sprcal3.cfr_renamed_107 == this.cfr_renamed_102.length) {
                    sprcal sprcal4 = this;
                    sprcal sprcal5 = this;
                    this.cfr_renamed_4.cfr_renamed_1197(sprcal5.cfr_renamed_102, 0, 64);
                    sprcal4.cfr_renamed_10099(sprcal5.cfr_renamed_102, 0, 64, arg1, arg2);
                    System.arraycopy(sprcal4.cfr_renamed_102, 64, this.cfr_renamed_102, 0, 16);
                    sprcal4.cfr_renamed_107 = 16;
                    return 64;
                }
                return 0;
            }
            case 3: {
                sprcal sprcal6 = this;
                while (false) {
                }
                sprcal6.cfr_renamed_102[sprcal6.cfr_renamed_107] = arg0;
                if (++sprcal6.cfr_renamed_107 == 64) {
                    sprcal sprcal7 = this;
                    sprcal7.cfr_renamed_10099(this.cfr_renamed_102, 0, 64, arg1, arg2);
                    sprcal7.cfr_renamed_4.cfr_renamed_1197(arg1, arg2, 64);
                    sprcal7.cfr_renamed_107 = 0;
                    return 64;
                }
                return 0;
            }
        }
        throw new IllegalStateException();
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_10098() {
        switch (this.cfr_renamed_2) {
            case 5: 
            case 6: {
                this.cfr_renamed_10093(7);
                return;
            }
            case 1: 
            case 2: {
                this.cfr_renamed_10093(3);
                return;
            }
            case 3: 
            case 7: {
                return;
            }
            case 4: {
                throw new IllegalStateException(spriai.cfr_renamed_9("H\u0014j?c\u001d9L[\u0013g\u0005:O;I+\u001fj\u0012e\u0013\u007f\\i\u0019+\u000en\tx\u0019o\\m\u0013y\\n\u0012h\u000er\f\u007f\u0015d\u0012"));
            }
        }
        throw new IllegalStateException();
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_10100() {
        switch (this.cfr_renamed_2) {
            case 5: {
                this.cfr_renamed_2 = 6;
                return;
            }
            case 1: {
                this.cfr_renamed_2 = 2;
                return;
            }
            case 2: 
            case 6: {
                return;
            }
            case 4: {
                throw new IllegalStateException(sprinh.cfr_renamed_9("\u00022 \u0019);sj\u00115-#piqoa9 4/55z#?a($/2?%z'53z$4\"(8*53.4"));
            }
        }
        throw new IllegalStateException();
    }

    @Override
    public byte[] cfr_renamed_1472() {
        return sproze.cfr_renamed_158(this.cfr_renamed_112);
    }

    @Override
    public void cfr_renamed_2417(byte[] arg0, int arg1, int arg2) {
        if (null == arg0) {
            throw new NullPointerException(spriai.cfr_renamed_9("[b\u0012,\\h\u001de\u0012d\b+\u001en\\e\tg\u0010"));
        }
        if (arg1 < 0) {
            throw new IllegalArgumentException(sprinh.cfr_renamed_9("f3/\u0015'<fz\";/4..a8$z/?&;537?"));
        }
        if (arg2 < 0) {
            throw new IllegalArgumentException(spriai.cfr_renamed_9(",\u0010n\u0012,\\h\u001de\u0012d\b+\u001en\\e\u0019l\u001d\u007f\u0015}\u0019"));
        }
        if (arg1 > arg0.length - arg2) {
            throw new sprddl(sprinh.cfr_renamed_9("\b41/5z#/'<$(a..5a))53."));
        }
        this.cfr_renamed_10100();
        if (arg2 > 0) {
            sprcal sprcal2 = this;
            sprcal2.cfr_renamed_137 = sprcal2.cfr_renamed_10097(sprcal2.cfr_renamed_137, arg2, -1L);
            sprcal2.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprcal(spraq spraq2) {
        void arg0;
        sprcal sprcal2 = this;
        sprcal sprcal3 = this;
        this.cfr_renamed_132 = new byte[32];
        sprcal3.cfr_renamed_91 = new byte[12];
        sprcal3.cfr_renamed_102 = new byte[80];
        sprcal2.cfr_renamed_112 = new byte[16];
        sprcal2.cfr_renamed_2 = 0;
        if (null == arg0) {
            throw new NullPointerException(spriai.cfr_renamed_9("[{\u0013g\u0005:O;I,\\h\u001de\u0012d\b+\u001en\\e\tg\u0010"));
        }
        if (16 != arg0.cfr_renamed_2404()) {
            throw new IllegalArgumentException(sprinh.cfr_renamed_9("f*.68krjt}a74)5z#?a;aksbl8(.a\u0017\u0000\u0019"));
        }
        this.cfr_renamed_96 = new sprhcl();
        this.cfr_renamed_4 = arg0;
    }

    @Override
    public void cfr_renamed_3212(byte arg0) {
        sprcal sprcal2 = this;
        sprcal2.cfr_renamed_10100();
        sprcal2.cfr_renamed_137 = sprcal2.cfr_renamed_10097(sprcal2.cfr_renamed_137, 1, -1L);
        sprcal2.cfr_renamed_4.cfr_renamed_1221(arg0);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws IllegalStateException, sprull {
        sprcal sprcal2;
        int n;
        block11: {
            if (null == arg0) {
                throw new NullPointerException(spriai.cfr_renamed_9(",\u0013~\b,\\h\u001de\u0012d\b+\u001en\\e\tg\u0010"));
            }
            if (arg1 < 0) {
                throw new IllegalArgumentException(sprinh.cfr_renamed_9("}./5\u0015'<fz\";/4..a8$z/?&;537?"));
            }
            sprcal sprcal3 = this;
            sprcal3.cfr_renamed_10098();
            sproze.cfr_renamed_3408(sprcal3.cfr_renamed_112);
            n = 0;
            switch (this.cfr_renamed_2) {
                case 7: {
                    if (this.cfr_renamed_107 < 16) {
                        throw new sprull(spriai.cfr_renamed_9("o\u001d\u007f\u001d+\bd\u0013+\u000fc\u0013y\b"));
                    }
                    n = this.cfr_renamed_107 - 16;
                    if (arg1 > arg0.length - n) {
                        throw new sprwjl(sprinh.cfr_renamed_9("\u00154.1/5z#/'<$(a..5a))53."));
                    }
                    if (n > 0) {
                        sprcal sprcal4 = this;
                        sprcal sprcal5 = this;
                        sprcal4.cfr_renamed_4.cfr_renamed_1197(sprcal5.cfr_renamed_102, 0, n);
                        sprcal5.cfr_renamed_10099(sprcal4.cfr_renamed_102, 0, n, arg0, arg1);
                    }
                    this.cfr_renamed_10096(8);
                    if (sproze.cfr_renamed_5245(16, this.cfr_renamed_112, 0, this.cfr_renamed_102, n)) break;
                    throw new sprull(spriai.cfr_renamed_9("f\u001dh\\h\u0014n\u001f`\\b\u0012+?c\u001dH\u0014jN;,d\u0010rM8L>\\m\u001db\u0010n\u0018"));
                }
                case 3: {
                    n = this.cfr_renamed_107 + 16;
                    if (arg1 > arg0.length - n) {
                        throw new sprwjl(sprinh.cfr_renamed_9("\u00154.1/5z#/'<$(a..5a))53."));
                    }
                    if (this.cfr_renamed_107 > 0) {
                        sprcal sprcal6 = this;
                        sprcal sprcal7 = this;
                        sprcal7.cfr_renamed_10099(sprcal6.cfr_renamed_102, 0, sprcal7.cfr_renamed_107, arg0, arg1);
                        sprcal6.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, this.cfr_renamed_107);
                    }
                    sprcal sprcal8 = this;
                    sprcal2 = sprcal8;
                    sprcal8.cfr_renamed_10096(4);
                    System.arraycopy(sprcal8.cfr_renamed_112, 0, arg0, arg1 + this.cfr_renamed_107, 16);
                    break block11;
                }
                default: {
                    throw new IllegalStateException();
                }
            }
            sprcal2 = this;
        }
        sprcal2.cfr_renamed_10092(false, true);
        return n;
    }
}

