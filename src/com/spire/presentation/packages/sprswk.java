/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfvd;
import com.spire.presentation.packages.sprhzz;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqs;
import com.spire.presentation.packages.sprsrk;
import com.spire.presentation.packages.sprwjl;

public class sprswk
extends sprsrk
implements sprqs {
    private byte[] cfr_renamed_91;
    private final sprmr cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private final int cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public long cfr_renamed_3273(long l) {
        void arg0;
        sprswk sprswk2 = this;
        sprswk2.cfr_renamed_3392((long)arg0);
        sprswk2.cfr_renamed_10006();
        sprswk2.cfr_renamed_0.cfr_renamed_3064(this.cfr_renamed_91, 0, this.cfr_renamed_2, 0);
        return l;
    }

    private /* synthetic */ void cfr_renamed_10007(int arg0) {
        int n = this.cfr_renamed_91.length - arg0;
        while (--n >= 0) {
            int n2 = n;
            this.cfr_renamed_91[n2] = (byte)(this.cfr_renamed_91[n2] - 1);
            if (this.cfr_renamed_91[n2] == -1) continue;
            return;
        }
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_0.cfr_renamed_1315()).append(sprhzz.cfr_renamed_9("0oV\u007f")).toString();
    }

    private /* synthetic */ void cfr_renamed_3392(long arg0) {
        long l;
        if (arg0 >= 0L) {
            long l2 = (arg0 + (long)this.cfr_renamed_4) / (long)this.cfr_renamed_3;
            long l3 = l2;
            if (l3 > 255L) {
                int n;
                int n2 = n = 5;
                while (n2 >= 1) {
                    long l4 = 1L << 8 * n;
                    long l5 = l3;
                    while (l5 >= l4) {
                        this.cfr_renamed_10008(n);
                        l5 = l3 - l4;
                    }
                    n2 = --n;
                }
            }
            this.cfr_renamed_10009((int)l3);
            this.cfr_renamed_4 = (int)(arg0 + (long)this.cfr_renamed_4 - (long)this.cfr_renamed_3 * l2);
            return;
        }
        long l6 = (-arg0 - (long)this.cfr_renamed_4) / (long)this.cfr_renamed_3;
        long l7 = l6;
        if (l7 > 255L) {
            int n;
            int n3 = n = 5;
            while (n3 >= 1) {
                long l8 = 1L << 8 * n;
                long l9 = l7;
                while (l9 > l8) {
                    this.cfr_renamed_10007(n);
                    l9 = l7 - l8;
                }
                n3 = --n;
            }
        }
        long l10 = l = 0L;
        while (l10 != l7) {
            this.cfr_renamed_10007(0);
            l10 = l + 1L;
        }
        int n = (int)((long)this.cfr_renamed_4 + arg0 + (long)this.cfr_renamed_3 * l6);
        if (n >= 0) {
            this.cfr_renamed_4 = 0;
            return;
        }
        this.cfr_renamed_10007(0);
        this.cfr_renamed_4 = this.cfr_renamed_3 + n;
    }

    @Override
    public void cfr_renamed_41() {
        sprswk sprswk2 = this;
        sproze.cfr_renamed_492(sprswk2.cfr_renamed_91, (byte)0);
        System.arraycopy(sprswk2.cfr_renamed_1, 0, this.cfr_renamed_91, 0, this.cfr_renamed_1.length);
        this.cfr_renamed_0.cfr_renamed_41();
        this.cfr_renamed_4 = 0;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) throws IllegalArgumentException {
        if (arg1 instanceof sprkpk) {
            sprkpk sprkpk2 = (sprkpk)arg1;
            this.cfr_renamed_1 = sproze.cfr_renamed_158(sprkpk2.cfr_renamed_1205());
            if (this.cfr_renamed_3 < this.cfr_renamed_1.length) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprfvd.cfr_renamed_9("M\u0016\\m]\u000bMbc-j'.0k3{+|'}bG\u0014.,abi0k#z'|bz*o,4b")).append(this.cfr_renamed_3).append(sprhzz.cfr_renamed_9("\u001c}EkYl\u0012")).toString());
            }
            int n = 8 > this.cfr_renamed_3 / 2 ? this.cfr_renamed_3 / 2 : 8;
            sprswk sprswk2 = this;
            if (sprswk2.cfr_renamed_3 - sprswk2.cfr_renamed_1.length > n) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprfvd.cfr_renamed_9("M\u0016\\m]\u000bMbc-j'.0k3{+|'}bG\u0014.-hbo6..k#}64b")).append(this.cfr_renamed_3 - n).append(sprhzz.cfr_renamed_9("\u001c}EkYl\u0012")).toString());
            }
            if (sprkpk2.cfr_renamed_284() != null) {
                this.cfr_renamed_0.cfr_renamed_5535(true, sprkpk2.cfr_renamed_284());
            }
            this.cfr_renamed_41();
            return;
        }
        throw new IllegalArgumentException(sprfvd.cfr_renamed_9("M\u0016\\m]\u000bMbc-j'.0k3{+|'}b^#|#c'z'|1Y+z*G\u0014"));
    }

    private /* synthetic */ void cfr_renamed_10006() {
        if (this.cfr_renamed_1.length < this.cfr_renamed_3) {
            int n;
            int n2 = n = this.cfr_renamed_1.length - 1;
            while (n2 >= 0) {
                if (this.cfr_renamed_91[n] != this.cfr_renamed_1[n]) {
                    throw new IllegalStateException(sprhzz.cfr_renamed_9("\u007fpIqHzN?Uq\u001c\\hM\u0013Lu\\\u001crS{Y?SjH?Sy\u001cm]q[z\u0012"));
                }
                n2 = --n;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprswk(sprmr sprmr2) {
        void arg0;
        sprswk sprswk2 = this;
        sprswk sprswk3 = this;
        super((sprmr)arg0);
        sprswk2.cfr_renamed_0 = arg0;
        sprswk2.cfr_renamed_3 = sprswk3.cfr_renamed_0.cfr_renamed_1195();
        sprswk2.cfr_renamed_1 = new byte[sprswk2.cfr_renamed_3];
        sprswk2.cfr_renamed_91 = new byte[sprswk2.cfr_renamed_3];
        this.cfr_renamed_2 = new byte[this.cfr_renamed_3];
        this.cfr_renamed_4 = 0;
    }

    private /* synthetic */ void cfr_renamed_10010() {
        if (this.cfr_renamed_1.length < this.cfr_renamed_3) {
            sprswk sprswk2 = this;
            sprswk sprswk3 = this;
            if (sprswk2.cfr_renamed_91[sprswk2.cfr_renamed_1.length - 1] != sprswk3.cfr_renamed_1[sprswk3.cfr_renamed_1.length - 1]) {
                throw new IllegalStateException(sprfvd.cfr_renamed_9("\u0001a7`6k0.+`bM\u0016\\m]\u000bMbc-j'.-{6.-hb|#`%kl"));
            }
        }
    }

    @Override
    public long cfr_renamed_3275(long l) {
        sprswk sprswk2 = this;
        sprswk2.cfr_renamed_41();
        return sprswk2.cfr_renamed_3273(l);
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_0.cfr_renamed_1195();
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprddl {
        int n;
        if (arg1 + arg2 > arg0.length) {
            throw new sprddl(sprhzz.cfr_renamed_9("vRoIk\u001c}IyZzN?HpS?Or]sP"));
        }
        if (arg4 + arg2 > arg3.length) {
            throw new sprwjl(sprfvd.cfr_renamed_9("-{6~7zbl7h$k0.6a-.1f-|6"));
        }
        int n2 = n = 0;
        while (n2 < arg2) {
            byte[] byArray;
            byte by;
            if (this.cfr_renamed_4 == 0) {
                sprswk sprswk2 = this;
                sprswk2.cfr_renamed_10010();
                sprswk2.cfr_renamed_0.cfr_renamed_3064(this.cfr_renamed_91, 0, this.cfr_renamed_2, 0);
                by = (byte)(arg0[arg1 + n] ^ this.cfr_renamed_2[this.cfr_renamed_4++]);
                byArray = arg3;
            } else {
                by = (byte)(arg0[arg1 + n] ^ this.cfr_renamed_2[this.cfr_renamed_4++]);
                sprswk sprswk3 = this;
                if (sprswk3.cfr_renamed_4 == sprswk3.cfr_renamed_91.length) {
                    this.cfr_renamed_4 = 0;
                    this.cfr_renamed_3391();
                }
                byArray = arg3;
            }
            int n3 = arg4 + n;
            byArray[n3] = by;
            n2 = ++n;
        }
        return arg2;
    }

    @Override
    public byte cfr_renamed_3272(byte arg0) throws sprddl, IllegalStateException {
        if (this.cfr_renamed_4 == 0) {
            sprswk sprswk2 = this;
            sprswk2.cfr_renamed_10010();
            sprswk sprswk3 = this;
            sprswk2.cfr_renamed_0.cfr_renamed_3064(sprswk3.cfr_renamed_91, 0, this.cfr_renamed_2, 0);
            return (byte)(sprswk3.cfr_renamed_2[this.cfr_renamed_4++] ^ arg0);
        }
        byte by = (byte)(this.cfr_renamed_2[this.cfr_renamed_4++] ^ arg0);
        sprswk sprswk4 = this;
        if (sprswk4.cfr_renamed_4 == sprswk4.cfr_renamed_91.length) {
            this.cfr_renamed_4 = 0;
            this.cfr_renamed_3391();
        }
        return by;
    }

    private /* synthetic */ void cfr_renamed_10008(int arg0) {
        int n = this.cfr_renamed_91.length - arg0;
        while (--n >= 0) {
            int n2 = n;
            this.cfr_renamed_91[n2] = (byte)(this.cfr_renamed_91[n2] + 1);
            if (this.cfr_renamed_91[n2] == 0) continue;
            return;
        }
    }

    @Override
    public long cfr_renamed_3274() {
        int n;
        byte[] byArray = new byte[this.cfr_renamed_91.length];
        System.arraycopy(this.cfr_renamed_91, 0, byArray, 0, byArray.length);
        int n2 = n = byArray.length - 1;
        while (n2 >= 1) {
            int n3;
            if ((n < this.cfr_renamed_1.length ? (byArray[n] & 0xFF) - (this.cfr_renamed_1[n] & 0xFF) : byArray[n] & 0xFF) < 0) {
                int n4 = n - 1;
                n3 += 256;
                byArray[n4] = (byte)(byArray[n4] - 1);
            }
            byArray[n--] = (byte)n3;
            n2 = n;
        }
        return sprpxe.cfr_renamed_456(byArray, byArray.length - 8) * (long)this.cfr_renamed_3 + (long)this.cfr_renamed_4;
    }

    private /* synthetic */ void cfr_renamed_10009(int arg0) {
        sprswk sprswk2 = this;
        byte by = sprswk2.cfr_renamed_91[sprswk2.cfr_renamed_91.length - 1];
        sprswk sprswk3 = this;
        byte[] byArray = sprswk3.cfr_renamed_91;
        int n = sprswk3.cfr_renamed_91.length - 1;
        byArray[n] = (byte)(byArray[n] + arg0);
        if (by != 0) {
            sprswk sprswk4 = this;
            if (sprswk4.cfr_renamed_91[sprswk4.cfr_renamed_91.length - 1] < by) {
                this.cfr_renamed_10008(1);
            }
        }
    }

    private /* synthetic */ void cfr_renamed_3391() {
        int n = this.cfr_renamed_91.length;
        while (--n >= 0) {
            int n2 = n;
            this.cfr_renamed_91[n2] = (byte)(this.cfr_renamed_91[n2] + 1);
            if (this.cfr_renamed_91[n2] == 0) continue;
            return;
        }
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprddl, IllegalStateException {
        if (this.cfr_renamed_4 != 0) {
            sprswk sprswk2 = this;
            sprswk2.cfr_renamed_505(arg0, arg1, sprswk2.cfr_renamed_3, arg2, arg3);
            return sprswk2.cfr_renamed_3;
        }
        if (arg1 + this.cfr_renamed_3 > arg0.length) {
            throw new sprddl(sprhzz.cfr_renamed_9("vRoIk\u001c}IyZzN?HpS?Or]sP"));
        }
        if (arg3 + this.cfr_renamed_3 > arg2.length) {
            throw new sprwjl(sprfvd.cfr_renamed_9("-{6~7zbl7h$k0.6a-.1f-|6"));
        }
        sprswk sprswk3 = this;
        sprswk3.cfr_renamed_0.cfr_renamed_3064(sprswk3.cfr_renamed_91, 0, this.cfr_renamed_2, 0);
        int n = 0;
        int n2 = n;
        while (n2 < this.cfr_renamed_3) {
            int n3 = arg3 + n;
            byte by = (byte)(arg0[arg1 + n] ^ this.cfr_renamed_2[n]);
            arg2[n3] = by;
            n2 = ++n;
        }
        sprswk sprswk4 = this;
        sprswk4.cfr_renamed_3391();
        return sprswk4.cfr_renamed_3;
    }
}

