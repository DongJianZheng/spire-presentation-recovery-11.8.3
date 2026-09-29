/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprgpr;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqs;
import com.spire.presentation.packages.sprsjl;
import com.spire.presentation.packages.sprtmha;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprybl;

public class sprruk
implements sprqs {
    private boolean cfr_renamed_107;
    public static final int cfr_renamed_132 = 20;
    private static final int[] cfr_renamed_102 = sprpxe.cfr_renamed_5165(sprkoe.cfr_renamed_433(sprgpr.cfr_renamed_9("i\u001f|\u0006b\u0003,V:Jn\u001ex\u0002,\fi\u001f|\u0006b\u0003,T>Jn\u001ex\u0002,\f")), 0, 8);
    public static final byte[] cfr_renamed_93;
    private int cfr_renamed_86;
    public int[] cfr_renamed_152;
    private int cfr_renamed_112;
    public int cfr_renamed_119;
    private int cfr_renamed_91;
    private static final int cfr_renamed_0 = 16;
    private byte[] cfr_renamed_1;
    public int[] cfr_renamed_2;
    private int cfr_renamed_3;
    public static final byte[] cfr_renamed_4;

    public void cfr_renamed_3602() {
        this.cfr_renamed_2[8] = this.cfr_renamed_2[8] + 1;
        if (this.cfr_renamed_2[8] == 0) {
            this.cfr_renamed_2[9] = this.cfr_renamed_2[9] + 1;
        }
    }

    private /* synthetic */ boolean cfr_renamed_3605() {
        if (++this.cfr_renamed_91 == 0 && ++this.cfr_renamed_112 == 0) {
            return (++this.cfr_renamed_3 & 0x20) != 0;
        }
        return false;
    }

    @Override
    public long cfr_renamed_3273(long arg0) {
        if (arg0 >= 0L) {
            long l = arg0;
            if (l >= 64L) {
                long l2 = l / 64L;
                this.cfr_renamed_10345(l2);
                l -= l2 * 64L;
            }
            sprruk sprruk2 = this;
            int n = sprruk2.cfr_renamed_86;
            sprruk2.cfr_renamed_86 = sprruk2.cfr_renamed_86 + (int)l & 0x3F;
            if (sprruk2.cfr_renamed_86 < n) {
                this.cfr_renamed_3602();
            }
        } else {
            long l;
            long l3 = -arg0;
            if (l3 >= 64L) {
                l = l3 / 64L;
                this.cfr_renamed_10346(l);
                l3 -= l * 64L;
            }
            long l4 = l = 0L;
            while (l4 < l3) {
                if (this.cfr_renamed_86 == 0) {
                    this.cfr_renamed_3603();
                }
                this.cfr_renamed_86 = this.cfr_renamed_86 - 1 & 0x3F;
                l4 = l + 1L;
            }
        }
        sprruk sprruk3 = this;
        sprruk3.cfr_renamed_3604(sprruk3.cfr_renamed_1);
        return arg0;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        sprruk sprruk2;
        if (!(arg1 instanceof sprkpk)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprtmha.cfr_renamed_9("\u000e4@\u0014Z]^\u001c\\\u001cC\u0018Z\u0018\\\u000e\u000e\u0010[\u000eZ]G\u0013M\u0011[\u0019K]O\u0013\u000e4x")).toString());
        }
        sprkpk sprkpk2 = (sprkpk)arg1;
        byte[] byArray = sprkpk2.cfr_renamed_1205();
        if (byArray == null || byArray.length != this.cfr_renamed_3540()) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprgpr.cfr_renamed_9(",\u0015i\u0016y\u000e~\u0002\u007fGi\u001fm\u0004x\u000buG")).append(this.cfr_renamed_3540()).append(sprtmha.cfr_renamed_9("]L\u0004Z\u0018]]A\u001b\u000e4x")).toString());
        }
        sprbj sprbj2 = sprkpk2.cfr_renamed_284();
        if (sprbj2 == null) {
            if (!this.cfr_renamed_107) {
                throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprgpr.cfr_renamed_9(",,i\u001e\\\u0006~\u0006a\u0002x\u0002~Go\u0006bGb\bxGn\u0002,\ty\u000b`Gj\b~Gj\u000e~\u0014xGe\te\u0013e\u0006`\u000e\u007f\u0006x\u000ec\t")).toString());
            }
            sprruk sprruk3 = this;
            sprruk2 = sprruk3;
            sprruk3.cfr_renamed_3471(null, byArray);
        } else if (sprbj2 instanceof sprtpk) {
            byte[] byArray2 = ((sprtpk)sprbj2).cfr_renamed_1521();
            this.cfr_renamed_3471(byArray2, byArray);
            sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), byArray2.length * 8, arg1, sprlrk.cfr_renamed_9915(arg0)));
            sprruk2 = this;
        } else {
            throw new IllegalArgumentException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprtmha.cfr_renamed_9("]g\u0013G\t\u000e\rO\u000fO\u0010K\tK\u000f]]C\b]\t\u000e\u001eA\u0013Z\u001cG\u0013\u000e\u001c\u000e6K\u0004~\u001c\\\u001cC\u0018Z\u0018\\]\u0006\u0012\\]@\bB\u0011\u000e\u001bA\u000f\u000e\u000fKPG\u0013G\t\u0007")).toString());
        }
        sprruk2.cfr_renamed_41();
        this.cfr_renamed_107 = true;
    }

    private /* synthetic */ void cfr_renamed_3607() {
        sprruk sprruk2 = this;
        this.cfr_renamed_91 = 0;
        sprruk2.cfr_renamed_112 = 0;
        sprruk2.cfr_renamed_3 = 0;
    }

    @Override
    public long cfr_renamed_3274() {
        return this.cfr_renamed_3374() * 64L + (long)this.cfr_renamed_86;
    }

    public int cfr_renamed_3540() {
        return 8;
    }

    public void cfr_renamed_3606() {
        this.cfr_renamed_2[9] = 0;
        this.cfr_renamed_2[8] = 0;
    }

    public long cfr_renamed_3374() {
        return (long)this.cfr_renamed_2[9] << 32 | (long)this.cfr_renamed_2[8] & 0xFFFFFFFFL;
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        int n;
        if (!this.cfr_renamed_107) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprgpr.cfr_renamed_9(",\tc\u0013,\u000eb\u000ex\u000em\u000be\u0014i\u0003")).toString());
        }
        if (arg1 + arg2 > arg0.length) {
            throw new sprddl(sprtmha.cfr_renamed_9("\u0014@\r[\t\u000e\u001f[\u001bH\u0018\\]Z\u0012A]]\u0015A\u000fZ"));
        }
        if (arg4 + arg2 > arg3.length) {
            throw new sprwjl(sprgpr.cfr_renamed_9("\by\u0013|\u0012xGn\u0012j\u0001i\u0015,\u0013c\b,\u0014d\b~\u0013"));
        }
        if (this.cfr_renamed_3609(arg2)) {
            throw new sprsjl(sprtmha.cfr_renamed_9("\u001c#\u0019M\u000e\u001fW\tK]B\u0014C\u0014Z]^\u0018\\]g+\u000e\nA\bB\u0019\u000e\u001fK]K\u0005M\u0018K\u0019K\u0019\u0015]m\u0015O\u0013I\u0018\u000e4x"));
        }
        int n2 = n = 0;
        while (n2 < arg2) {
            sprruk sprruk2 = this;
            arg3[n + arg4] = (byte)(sprruk2.cfr_renamed_1[sprruk2.cfr_renamed_86] ^ arg0[n + arg1]);
            sprruk sprruk3 = this;
            sprruk2.cfr_renamed_86 = sprruk3.cfr_renamed_86 + 1 & 0x3F;
            if (sprruk3.cfr_renamed_86 == 0) {
                sprruk sprruk4 = this;
                sprruk4.cfr_renamed_3602();
                sprruk4.cfr_renamed_3604(sprruk4.cfr_renamed_1);
            }
            n2 = ++n;
        }
        return arg2;
    }

    public static void cfr_renamed_3498(int arg0, int[] arg1, int[] arg2) {
        int n;
        if (arg1.length != 16) {
            throw new IllegalArgumentException();
        }
        if (arg2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (arg0 % 2 != 0) {
            throw new IllegalArgumentException(sprgpr.cfr_renamed_9(")y\nn\u0002~Gc\u0001,\u0015c\u0012b\u0003\u007fGa\u0012\u007f\u0013,\u0005iGi\u0011i\t"));
        }
        int n2 = arg1[0];
        int n3 = arg1[1];
        int n4 = arg1[2];
        int n5 = arg1[3];
        int n6 = arg1[4];
        int n7 = arg1[5];
        int n8 = arg1[6];
        int n9 = arg1[7];
        int n10 = arg1[8];
        int n11 = arg1[9];
        int n12 = arg1[10];
        int n13 = arg1[11];
        int n14 = arg1[12];
        int n15 = arg1[13];
        int n16 = arg1[14];
        int n17 = arg1[15];
        int n18 = n = arg0;
        while (n18 > 0) {
            n10 ^= spruaf.cfr_renamed_494((n6 ^= spruaf.cfr_renamed_494(n2 + n14, 7)) + n2, 9);
            n2 ^= spruaf.cfr_renamed_494((n14 ^= spruaf.cfr_renamed_494(n10 + n6, 13)) + n10, 18);
            n15 ^= spruaf.cfr_renamed_494((n11 ^= spruaf.cfr_renamed_494(n7 + n3, 7)) + n7, 9);
            n7 ^= spruaf.cfr_renamed_494((n3 ^= spruaf.cfr_renamed_494(n15 + n11, 13)) + n15, 18);
            n4 ^= spruaf.cfr_renamed_494((n16 ^= spruaf.cfr_renamed_494(n12 + n8, 7)) + n12, 9);
            n12 ^= spruaf.cfr_renamed_494((n8 ^= spruaf.cfr_renamed_494(n4 + n16, 13)) + n4, 18);
            n9 ^= spruaf.cfr_renamed_494((n5 ^= spruaf.cfr_renamed_494(n17 + n13, 7)) + n17, 9);
            n17 ^= spruaf.cfr_renamed_494((n13 ^= spruaf.cfr_renamed_494(n9 + n5, 13)) + n9, 18);
            n4 ^= spruaf.cfr_renamed_494((n3 ^= spruaf.cfr_renamed_494(n2 + n5, 7)) + n2, 9);
            n2 ^= spruaf.cfr_renamed_494((n5 ^= spruaf.cfr_renamed_494(n4 + n3, 13)) + n4, 18);
            n9 ^= spruaf.cfr_renamed_494((n8 ^= spruaf.cfr_renamed_494(n7 + n6, 7)) + n7, 9);
            n7 ^= spruaf.cfr_renamed_494((n6 ^= spruaf.cfr_renamed_494(n9 + n8, 13)) + n9, 18);
            n10 ^= spruaf.cfr_renamed_494((n13 ^= spruaf.cfr_renamed_494(n12 + n11, 7)) + n12, 9);
            n12 ^= spruaf.cfr_renamed_494((n11 ^= spruaf.cfr_renamed_494(n10 + n13, 13)) + n10, 18);
            n15 ^= spruaf.cfr_renamed_494((n14 ^= spruaf.cfr_renamed_494(n17 + n16, 7)) + n17, 9);
            n17 ^= spruaf.cfr_renamed_494((n16 ^= spruaf.cfr_renamed_494(n15 + n14, 13)) + n15, 18);
            n18 = n -= 2;
        }
        arg2[0] = n2 + arg1[0];
        arg2[1] = n3 + arg1[1];
        arg2[2] = n4 + arg1[2];
        arg2[3] = n5 + arg1[3];
        arg2[4] = n6 + arg1[4];
        arg2[5] = n7 + arg1[5];
        arg2[6] = n8 + arg1[6];
        arg2[7] = n9 + arg1[7];
        arg2[8] = n10 + arg1[8];
        arg2[9] = n11 + arg1[9];
        arg2[10] = n12 + arg1[10];
        arg2[11] = n13 + arg1[11];
        arg2[12] = n14 + arg1[12];
        arg2[13] = n15 + arg1[13];
        arg2[14] = n16 + arg1[14];
        arg2[15] = n17 + arg1[15];
    }

    @Override
    public long cfr_renamed_3275(long l) {
        sprruk sprruk2 = this;
        sprruk2.cfr_renamed_41();
        return sprruk2.cfr_renamed_3273(l);
    }

    @Override
    public void cfr_renamed_41() {
        sprruk sprruk2 = this;
        sprruk2.cfr_renamed_86 = 0;
        sprruk2.cfr_renamed_3607();
        sprruk2.cfr_renamed_3606();
        sprruk2.cfr_renamed_3604(sprruk2.cfr_renamed_1);
    }

    public sprruk() {
        this(20);
    }

    @Override
    public byte cfr_renamed_3243(byte arg0) {
        if (this.cfr_renamed_3605()) {
            throw new sprsjl(sprtmha.cfr_renamed_9("\u001c#\u0019M\u000e\u001fW\tK]B\u0014C\u0014Z]^\u0018\\]g+\u0015]m\u0015O\u0013I\u0018\u000e4x"));
        }
        sprruk sprruk2 = this;
        byte by = (byte)(sprruk2.cfr_renamed_1[this.cfr_renamed_86] ^ arg0);
        this.cfr_renamed_86 = sprruk2.cfr_renamed_86 + 1 & 0x3F;
        if (sprruk2.cfr_renamed_86 == 0) {
            sprruk sprruk3 = this;
            sprruk3.cfr_renamed_3602();
            sprruk3.cfr_renamed_3604(sprruk3.cfr_renamed_1);
        }
        return by;
    }

    public void cfr_renamed_10345(long arg0) {
        int n = (int)(arg0 >>> 32);
        int n2 = (int)arg0;
        if (n > 0) {
            this.cfr_renamed_2[9] = this.cfr_renamed_2[9] + n;
        }
        sprruk sprruk2 = this;
        int n3 = sprruk2.cfr_renamed_2[8];
        sprruk2.cfr_renamed_2[8] = sprruk2.cfr_renamed_2[8] + n2;
        if (n3 != 0 && this.cfr_renamed_2[8] < n3) {
            this.cfr_renamed_2[9] = this.cfr_renamed_2[9] + 1;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_3604(byte[] byArray) {
        void arg0;
        sprruk sprruk2 = this;
        sprruk sprruk3 = this;
        sprruk.cfr_renamed_3498(sprruk2.cfr_renamed_119, sprruk2.cfr_renamed_2, sprruk3.cfr_renamed_152);
        sprpxe.cfr_renamed_449(sprruk3.cfr_renamed_152, (byte[])arg0, 0);
    }

    static {
        cfr_renamed_4 = sprkoe.cfr_renamed_433(sprtmha.cfr_renamed_9("\u0018V\rO\u0013J]\u001dO\u0003\u001fW\tK]E"));
        cfr_renamed_93 = sprkoe.cfr_renamed_433(sprgpr.cfr_renamed_9("i\u001f|\u0006b\u0003,V:Jn\u001ex\u0002,\f"));
    }

    public void cfr_renamed_3603() {
        if (this.cfr_renamed_2[8] == 0 && this.cfr_renamed_2[9] == 0) {
            throw new IllegalStateException(sprtmha.cfr_renamed_9("\u001cZ\tK\u0010^\t\u000e\tA]\\\u0018J\bM\u0018\u000e\u001eA\b@\tK\u000f\u000e\rO\u000eZ]T\u0018\\\u0012\u0000"));
        }
        this.cfr_renamed_2[8] = this.cfr_renamed_2[8] - 1;
        if (this.cfr_renamed_2[8] == -1) {
            this.cfr_renamed_2[9] = this.cfr_renamed_2[9] - 1;
        }
    }

    @Override
    public String cfr_renamed_1315() {
        String string = sprgpr.cfr_renamed_9("4m\u000b\u007f\u0006>W");
        if (this.cfr_renamed_119 != 20) {
            string = new StringBuilder().insert(0, string).append("/").append(this.cfr_renamed_119).toString();
        }
        return string;
    }

    public void cfr_renamed_3471(byte[] arg0, byte[] arg1) {
        if (arg0 != null) {
            if (arg0.length != 16 && arg0.length != 32) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprtmha.cfr_renamed_9("]\\\u0018_\bG\u000fK\u000e\u000eL\u001cE\u000e\u001fG\t\u000e\u0012\\]\u001cH\u0018]L\u0014Z]E\u0018W")).toString());
            }
            int n = (arg0.length - 16) / 4;
            sprruk sprruk2 = this;
            sprruk2.cfr_renamed_2[0] = cfr_renamed_102[n];
            sprruk2.cfr_renamed_2[5] = cfr_renamed_102[n + 1];
            sprruk2.cfr_renamed_2[10] = cfr_renamed_102[n + 2];
            sprruk2.cfr_renamed_2[15] = cfr_renamed_102[n + 3];
            sprpxe.cfr_renamed_438(arg0, 0, this.cfr_renamed_2, 1, 4);
            sprpxe.cfr_renamed_438(arg0, arg0.length - 16, this.cfr_renamed_2, 11, 4);
        }
        sprpxe.cfr_renamed_438(arg1, 0, this.cfr_renamed_2, 6, 2);
    }

    private /* synthetic */ boolean cfr_renamed_3609(int arg0) {
        sprruk sprruk2 = this;
        sprruk2.cfr_renamed_91 += arg0;
        if (sprruk2.cfr_renamed_91 < arg0 && this.cfr_renamed_91 >= 0 && ++this.cfr_renamed_112 == 0) {
            return (++this.cfr_renamed_3 & 0x20) != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public sprruk(int n) {
        void arg0;
        sprruk sprruk2 = this;
        sprruk sprruk3 = this;
        this.cfr_renamed_86 = 0;
        sprruk3.cfr_renamed_2 = new int[16];
        sprruk3.cfr_renamed_152 = new int[16];
        sprruk2.cfr_renamed_1 = new byte[64];
        sprruk2.cfr_renamed_107 = false;
        if (n <= 0 || (arg0 & 1) != 0) {
            throw new IllegalArgumentException(sprgpr.cfr_renamed_9("+\u0015c\u0012b\u0003\u007f@,\ny\u0014xGn\u0002,\u0006,\u0017c\u0014e\u0013e\u0011iK,\u0002z\u0002bGb\u0012a\u0005i\u0015"));
        }
        this.cfr_renamed_119 = arg0;
    }

    public void cfr_renamed_10347(int arg0, int[] arg1, int arg2) {
        int n = (arg0 - 16) / 4;
        int n2 = arg2;
        arg1[arg2] = cfr_renamed_102[n];
        arg1[n2 + 1] = cfr_renamed_102[n + 1];
        arg1[n2 + 2] = cfr_renamed_102[n + 2];
        arg1[arg2 + 3] = cfr_renamed_102[n + 3];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void cfr_renamed_10346(long arg0) {
        sprruk sprruk2;
        int n = (int)(arg0 >>> 32);
        int n2 = (int)arg0;
        if (n != 0) {
            if (((long)this.cfr_renamed_2[9] & 0xFFFFFFFFL) < ((long)n & 0xFFFFFFFFL)) throw new IllegalStateException(sprtmha.cfr_renamed_9("\u001cZ\tK\u0010^\t\u000e\tA]\\\u0018J\bM\u0018\u000e\u001eA\b@\tK\u000f\u000e\rO\u000eZ]T\u0018\\\u0012\u0000"));
            sprruk sprruk3 = this;
            sprruk2 = sprruk3;
            sprruk3.cfr_renamed_2[9] = sprruk3.cfr_renamed_2[9] - n;
        } else {
            sprruk2 = this;
        }
        if (((long)sprruk2.cfr_renamed_2[8] & 0xFFFFFFFFL) >= ((long)n2 & 0xFFFFFFFFL)) {
            this.cfr_renamed_2[8] = this.cfr_renamed_2[8] - n2;
            return;
        }
        if (this.cfr_renamed_2[9] == 0) throw new IllegalStateException(sprgpr.cfr_renamed_9("m\u0013x\u0002a\u0017xGx\b,\u0015i\u0003y\u0004iGo\by\tx\u0002~G|\u0006\u007f\u0013,\u001di\u0015cI"));
        sprruk sprruk4 = this;
        sprruk4.cfr_renamed_2[9] = sprruk4.cfr_renamed_2[9] - 1;
        sprruk4.cfr_renamed_2[8] = sprruk4.cfr_renamed_2[8] - n2;
    }
}

