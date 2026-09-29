/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprbp;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprkik;
import com.spire.presentation.packages.sprmml;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqed;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprwn;
import com.spire.presentation.packages.sprygk;
import com.spire.presentation.packages.sprzsd;

public class sprslk
implements sprbp {
    public static final int cfr_renamed_114 = 13260;
    private byte[] cfr_renamed_96;
    private int cfr_renamed_105;
    private sprwn cfr_renamed_137;
    private byte[] cfr_renamed_79;
    private byte[] cfr_renamed_107;
    public static final int cfr_renamed_132 = 14028;
    public static final int cfr_renamed_102 = 12748;
    public static final int cfr_renamed_93 = 13772;
    public static final int cfr_renamed_86 = 13004;
    private byte[] cfr_renamed_152;
    public static final int cfr_renamed_112 = 188;
    private byte[] cfr_renamed_119;
    public static final int cfr_renamed_91 = 14284;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private sprgf cfr_renamed_2;
    public static final int cfr_renamed_3 = 13516;
    private boolean cfr_renamed_4;

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        int n = arg2;
        while (n > 0) {
            sprslk sprslk2 = this;
            if (sprslk2.cfr_renamed_0 >= sprslk2.cfr_renamed_152.length) break;
            this.cfr_renamed_1221(arg0[arg1++]);
            n = --arg2;
        }
        sprslk sprslk3 = this;
        sprslk3.cfr_renamed_2.cfr_renamed_1197(arg0, arg1, arg2);
        sprslk3.cfr_renamed_0 += arg2;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        sprslk sprslk2;
        sprkik sprkik2 = (sprkik)arg1;
        sprslk sprslk3 = this;
        sprslk3.cfr_renamed_137.cfr_renamed_5535(arg0, sprkik2);
        this.cfr_renamed_1 = sprkik2.cfr_renamed_2295().bitLength();
        this.cfr_renamed_107 = new byte[(sprslk3.cfr_renamed_1 + 7) / 8];
        if (this.cfr_renamed_105 == 188) {
            this.cfr_renamed_152 = new byte[this.cfr_renamed_107.length - this.cfr_renamed_2.cfr_renamed_1218() - 2];
            sprslk2 = this;
        } else {
            this.cfr_renamed_152 = new byte[this.cfr_renamed_107.length - this.cfr_renamed_2.cfr_renamed_1218() - 3];
            sprslk2 = this;
        }
        sprslk2.cfr_renamed_41();
    }

    @Override
    public byte[] cfr_renamed_1329() throws sprmml {
        sprslk sprslk2;
        int n;
        int n2;
        sprslk sprslk3 = this;
        int n3 = sprslk3.cfr_renamed_2.cfr_renamed_1218();
        int n4 = 0;
        int n5 = 0;
        if (sprslk3.cfr_renamed_105 == 188) {
            n4 = 8;
            n5 = this.cfr_renamed_107.length - n3 - 1;
            sprslk sprslk4 = this;
            this.cfr_renamed_2.cfr_renamed_1219(sprslk4.cfr_renamed_107, n5);
            sprslk4.cfr_renamed_107[this.cfr_renamed_107.length - 1] = -68;
        } else {
            n4 = 16;
            n5 = this.cfr_renamed_107.length - n3 - 2;
            sprslk sprslk5 = this;
            this.cfr_renamed_2.cfr_renamed_1219(sprslk5.cfr_renamed_107, n5);
            sprslk5.cfr_renamed_107[this.cfr_renamed_107.length - 2] = (byte)(this.cfr_renamed_105 >>> 8);
            sprslk sprslk6 = this;
            sprslk6.cfr_renamed_107[sprslk6.cfr_renamed_107.length - 1] = (byte)this.cfr_renamed_105;
        }
        int n6 = 0;
        int n7 = (n3 + this.cfr_renamed_0) * 8 + n4 + 4 - this.cfr_renamed_1;
        if (n7 > 0) {
            sprslk sprslk7 = this;
            n2 = sprslk7.cfr_renamed_0 - (n7 + 7) / 8;
            n6 = 96;
            System.arraycopy(sprslk7.cfr_renamed_152, 0, this.cfr_renamed_107, n5 -= n2, n2);
            this.cfr_renamed_119 = new byte[n2];
            n = n5;
        } else {
            n6 = 64;
            n = n5 = n5 - this.cfr_renamed_0;
            sprslk sprslk8 = this;
            System.arraycopy(this.cfr_renamed_152, 0, sprslk8.cfr_renamed_107, n5, this.cfr_renamed_0);
            this.cfr_renamed_119 = new byte[sprslk8.cfr_renamed_0];
        }
        if (n - 1 > 0) {
            int n8 = n2 = n5 - 1;
            while (n8 != 0) {
                this.cfr_renamed_107[n2--] = -69;
                n8 = n2;
            }
            sprslk sprslk9 = this;
            sprslk2 = sprslk9;
            int n9 = n5 - 1;
            sprslk9.cfr_renamed_107[n9] = (byte)(sprslk9.cfr_renamed_107[n9] ^ 1);
            sprslk9.cfr_renamed_107[0] = 11;
            sprslk9.cfr_renamed_107[0] = (byte)(sprslk9.cfr_renamed_107[0] | n6);
        } else {
            sprslk sprslk10 = this;
            sprslk2 = sprslk10;
            sprslk10.cfr_renamed_107[0] = 10;
            sprslk10.cfr_renamed_107[0] = (byte)(sprslk10.cfr_renamed_107[0] | n6);
        }
        byte[] byArray = sprslk2.cfr_renamed_137.cfr_renamed_1337(this.cfr_renamed_107, 0, this.cfr_renamed_107.length);
        this.cfr_renamed_4 = (n6 & 0x20) == 0;
        System.arraycopy(this.cfr_renamed_152, 0, this.cfr_renamed_119, 0, this.cfr_renamed_119.length);
        sprslk sprslk11 = this;
        sprslk11.cfr_renamed_0 = 0;
        sprslk11.cfr_renamed_3277(sprslk11.cfr_renamed_152);
        sprslk11.cfr_renamed_3277(sprslk11.cfr_renamed_107);
        return byArray;
    }

    @Override
    public void cfr_renamed_3219(byte[] arg0) throws sprull {
        sprslk sprslk2;
        int n;
        byte[] byArray = this.cfr_renamed_137.cfr_renamed_1337(arg0, 0, arg0.length);
        if ((byArray[0] & 0xC0 ^ 0x40) != 0) {
            throw new sprull(sprzsd.cfr_renamed_9("\u0011Y\u0010^\u0013J\u0011]\u0018\u0018\u000fQ\u001bV\u001dL\tJ\u0019"));
        }
        if ((byArray[byArray.length - 1] & 0xF ^ 0xC) != 0) {
            throw new sprull(sprqed.cfr_renamed_9("B\u000bC\f@\u0018B\u000fKJ\\\u0003H\u0004N\u001eZ\u0018J"));
        }
        int n2 = 0;
        if ((byArray[byArray.length - 1] & 0xFF ^ 0xBC) == 0) {
            n2 = 1;
        } else {
            n = (byArray[byArray.length - 2] & 0xFF) << 8 | byArray[byArray.length - 1] & 0xFF;
            Integer n3 = sprygk.cfr_renamed_9913(this.cfr_renamed_2);
            if (n3 != null) {
                int n4 = n3;
                if (n != n4 && (n4 != 15052 || n != 16588)) {
                    throw new IllegalStateException(new StringBuilder().insert(0, sprzsd.cfr_renamed_9("\u000fQ\u001bV\u0019J\\Q\u0012Q\bQ\u001dT\u0015K\u0019\\\\O\u0015L\u0014\u0018\u000bJ\u0013V\u001b\u0018\u0018Q\u001b]\u000fL\\^\u0013J\\L\u000eY\u0015T\u0019J\\")).append(n).toString());
                }
            } else {
                throw new IllegalArgumentException(sprqed.cfr_renamed_9("\u001fA\u0018J\t@\rA\u0003\\\u000fKJG\u000b\\\u0002\u000f\u0003AJ\\\u0003H\u0004N\u001eZ\u0018J"));
            }
            n2 = 2;
        }
        n = 0;
        int n5 = n = 0;
        while (n5 != byArray.length && (byArray[n] & 0xF ^ 0xA) != 0) {
            n5 = ++n;
        }
        int n6 = byArray.length - n2 - this.cfr_renamed_2.cfr_renamed_1218();
        if (n6 - ++n <= 0) {
            throw new sprull(sprzsd.cfr_renamed_9("\u0011Y\u0010^\u0013J\u0011]\u0018\u0018\u001eT\u0013[\u0017"));
        }
        sprslk sprslk3 = this;
        if ((byArray[0] & 0x20) == 0) {
            sprslk3.cfr_renamed_4 = true;
            int n7 = n;
            this.cfr_renamed_119 = new byte[n6 - n7];
            System.arraycopy(byArray, n7, this.cfr_renamed_119, 0, this.cfr_renamed_119.length);
            sprslk2 = this;
        } else {
            sprslk3.cfr_renamed_4 = false;
            int n8 = n;
            this.cfr_renamed_119 = new byte[n6 - n8];
            System.arraycopy(byArray, n8, this.cfr_renamed_119, 0, this.cfr_renamed_119.length);
            sprslk2 = this;
        }
        sprslk2.cfr_renamed_79 = arg0;
        this.cfr_renamed_96 = byArray;
        this.cfr_renamed_2.cfr_renamed_1197(this.cfr_renamed_119, 0, this.cfr_renamed_119.length);
        this.cfr_renamed_0 = this.cfr_renamed_119.length;
        System.arraycopy(this.cfr_renamed_119, 0, this.cfr_renamed_152, 0, this.cfr_renamed_119.length);
    }

    public sprslk(sprwn arg0, sprgf arg1) {
        this(arg0, arg1, false);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean cfr_renamed_3280(byte[] byArray) {
        void arg0;
        sprslk sprslk2 = this;
        this.cfr_renamed_0 = 0;
        sprslk2.cfr_renamed_3277(sprslk2.cfr_renamed_152);
        sprslk2.cfr_renamed_3277((byte[])arg0);
        return false;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        sprslk sprslk2 = this;
        sprslk2.cfr_renamed_2.cfr_renamed_1221(arg0);
        if (sprslk2.cfr_renamed_0 < this.cfr_renamed_152.length) {
            sprslk sprslk3 = this;
            sprslk3.cfr_renamed_152[sprslk3.cfr_renamed_0] = arg0;
        }
        ++this.cfr_renamed_0;
    }

    private /* synthetic */ void cfr_renamed_3277(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 != arg0.length) {
            arg0[n++] = 0;
            n2 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprslk(sprwn sprwn2, sprgf sprgf2, boolean bl) {
        void arg1;
        void arg0;
        sprslk sprslk2 = this;
        sprslk2.cfr_renamed_137 = arg0;
        sprslk2.cfr_renamed_2 = arg1;
        if (bl) {
            this.cfr_renamed_105 = 188;
            return;
        }
        Integer n = sprygk.cfr_renamed_9913((sprgf)arg1);
        if (n != null) {
            this.cfr_renamed_105 = n;
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprqed.cfr_renamed_9("A\u0005\u000f\u001cN\u0006F\u000e\u000f\u001e]\u000bF\u0006J\u0018\u000f\f@\u0018\u000f\u000eF\rJ\u0019[P\u000f")).append(arg1.cfr_renamed_1315()).toString());
    }

    @Override
    public boolean cfr_renamed_2425() {
        return this.cfr_renamed_4;
    }

    @Override
    public byte[] cfr_renamed_3276() {
        return this.cfr_renamed_119;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean cfr_renamed_1328(byte[] arg0) {
        sprslk sprslk2;
        int n;
        Object object;
        int n2;
        byte[] byArray;
        byte[] byArray2 = null;
        if (this.cfr_renamed_79 == null) {
            try {
                byArray = byArray2 = this.cfr_renamed_137.cfr_renamed_1337(arg0, 0, arg0.length);
            }
            catch (Exception exception) {
                return false;
            }
        } else {
            if (!sproze.cfr_renamed_92(this.cfr_renamed_79, arg0)) {
                throw new IllegalStateException(sprzsd.cfr_renamed_9("M\f\\\u001dL\u0019o\u0015L\u0014j\u0019[\u0013N\u0019J\u0019\\1]\u000fK\u001d_\u0019\u0018\u001fY\u0010T\u0019\\\\W\u0012\u0018\u0018Q\u001a^\u0019J\u0019V\b\u0018\u000fQ\u001bV\u001dL\tJ\u0019"));
            }
            byArray2 = this.cfr_renamed_96;
            this.cfr_renamed_79 = null;
            this.cfr_renamed_96 = null;
            byArray = byArray2;
        }
        if ((byArray[0] & 0xC0 ^ 0x40) != 0) {
            return this.cfr_renamed_3280(byArray2);
        }
        if ((byArray2[byArray2.length - 1] & 0xF ^ 0xC) != 0) {
            return this.cfr_renamed_3280(byArray2);
        }
        int n3 = 0;
        if ((byArray2[byArray2.length - 1] & 0xFF ^ 0xBC) == 0) {
            n3 = 1;
        } else {
            n2 = (byArray2[byArray2.length - 2] & 0xFF) << 8 | byArray2[byArray2.length - 1] & 0xFF;
            Integer n4 = sprygk.cfr_renamed_9913(this.cfr_renamed_2);
            object = n4;
            if (n4 == null) {
                throw new IllegalArgumentException(sprzsd.cfr_renamed_9("M\u0012J\u0019[\u0013_\u0012Q\u000f]\u0018\u0018\u0014Y\u000fP\\Q\u0012\u0018\u000fQ\u001bV\u001dL\tJ\u0019"));
            }
            n = object.intValue();
            if (n2 != n && (n != 15052 || n2 != 16588)) {
                throw new IllegalStateException(new StringBuilder().insert(0, sprqed.cfr_renamed_9("\\\u0003H\u0004J\u0018\u000f\u0003A\u0003[\u0003N\u0006F\u0019J\u000e\u000f\u001dF\u001eGJX\u0018@\u0004HJK\u0003H\u000f\\\u001e\u000f\f@\u0018\u000f\u001e]\u000bF\u0006J\u0018\u000f")).append(n2).toString());
            }
            n3 = 2;
        }
        n2 = 0;
        int n5 = n2 = 0;
        while (n5 != byArray2.length && (byArray2[n2] & 0xF ^ 0xA) != 0) {
            n5 = ++n2;
        }
        object = new byte[this.cfr_renamed_2.cfr_renamed_1218()];
        n = byArray2.length - n3 - ((byte[])object).length;
        if (n - ++n2 <= 0) {
            return this.cfr_renamed_3280(byArray2);
        }
        if ((byArray2[0] & 0x20) == 0) {
            this.cfr_renamed_4 = true;
            if (this.cfr_renamed_0 > n - n2) {
                return this.cfr_renamed_3280(byArray2);
            }
            sprslk sprslk3 = this;
            sprslk3.cfr_renamed_2.cfr_renamed_41();
            int n6 = n2;
            sprslk3.cfr_renamed_2.cfr_renamed_1197(byArray2, n6, n - n6);
            sprslk3.cfr_renamed_2.cfr_renamed_1219((byte[])object, 0);
            boolean bl = true;
            int n7 = 0;
            int n8 = n7;
            while (n8 != ((Object)object).length) {
                byte[] byArray3 = byArray2;
                int n9 = n + n7;
                byArray3[n9] = (byte)(byArray3[n9] ^ object[n7]);
                if (byArray2[n + n7] != 0) {
                    bl = false;
                }
                n8 = ++n7;
            }
            if (!bl) {
                return this.cfr_renamed_3280(byArray2);
            }
            this.cfr_renamed_119 = new byte[n - n2];
            System.arraycopy(byArray2, n2, this.cfr_renamed_119, 0, this.cfr_renamed_119.length);
            sprslk2 = this;
        } else {
            this.cfr_renamed_4 = false;
            this.cfr_renamed_2.cfr_renamed_1219((byte[])object, 0);
            boolean bl = true;
            int n10 = 0;
            int n11 = n10;
            while (n11 != ((Object)object).length) {
                byte[] byArray4 = byArray2;
                int n12 = n + n10;
                byArray4[n12] = (byte)(byArray4[n12] ^ object[n10]);
                if (byArray2[n + n10] != 0) {
                    bl = false;
                }
                n11 = ++n10;
            }
            if (!bl) {
                return this.cfr_renamed_3280(byArray2);
            }
            this.cfr_renamed_119 = new byte[n - n2];
            System.arraycopy(byArray2, n2, this.cfr_renamed_119, 0, this.cfr_renamed_119.length);
            sprslk2 = this;
        }
        if (sprslk2.cfr_renamed_0 != 0) {
            sprslk sprslk4 = this;
            if (!sprslk4.cfr_renamed_3281(this.cfr_renamed_152, sprslk4.cfr_renamed_119)) {
                return this.cfr_renamed_3280(byArray2);
            }
        }
        sprslk sprslk5 = this;
        sprslk5.cfr_renamed_3277(sprslk5.cfr_renamed_152);
        sprslk5.cfr_renamed_3277(byArray2);
        this.cfr_renamed_0 = 0;
        return true;
    }

    private /* synthetic */ boolean cfr_renamed_3281(byte[] arg0, byte[] arg1) {
        boolean bl = true;
        sprslk sprslk2 = this;
        if (sprslk2.cfr_renamed_0 > sprslk2.cfr_renamed_152.length) {
            int n;
            if (this.cfr_renamed_152.length > arg1.length) {
                bl = false;
            }
            int n2 = n = 0;
            while (n2 != this.cfr_renamed_152.length) {
                if (arg0[n] != arg1[n]) {
                    bl = false;
                }
                n2 = ++n;
            }
        } else {
            int n;
            if (this.cfr_renamed_0 != arg1.length) {
                bl = false;
            }
            int n3 = n = 0;
            while (n3 != arg1.length) {
                if (arg0[n] != arg1[n]) {
                    bl = false;
                }
                n3 = ++n;
            }
        }
        return bl;
    }

    @Override
    public void cfr_renamed_41() {
        sprslk sprslk2 = this;
        sprslk sprslk3 = this;
        sprslk3.cfr_renamed_2.cfr_renamed_41();
        sprslk2.cfr_renamed_0 = 0;
        sprslk2.cfr_renamed_3277(sprslk3.cfr_renamed_152);
        if (sprslk2.cfr_renamed_119 != null) {
            sprslk sprslk4 = this;
            sprslk4.cfr_renamed_3277(sprslk4.cfr_renamed_119);
        }
        sprslk sprslk5 = this;
        sprslk5.cfr_renamed_119 = null;
        sprslk5.cfr_renamed_4 = false;
        if (this.cfr_renamed_79 != null) {
            sprslk sprslk6 = this;
            this.cfr_renamed_79 = null;
            sprslk6.cfr_renamed_3277(sprslk6.cfr_renamed_96);
            sprslk6.cfr_renamed_96 = null;
        }
    }
}

