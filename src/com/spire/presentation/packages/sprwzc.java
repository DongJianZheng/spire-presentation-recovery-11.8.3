/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprh;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprjsr;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprmtc;
import com.spire.presentation.packages.sproqo;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprqd;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprvmd;
import com.spire.presentation.packages.sprzra;
import java.util.Hashtable;

public class sprwzc
implements sprqd {
    private sprh cfr_renamed_145;
    private byte[] cfr_renamed_114;
    private static Hashtable cfr_renamed_96 = new Hashtable();
    private int cfr_renamed_105;
    private byte[] cfr_renamed_137;
    private byte[] cfr_renamed_79;
    private boolean cfr_renamed_107;
    private byte[] cfr_renamed_132;
    public static final int cfr_renamed_102 = 14284;
    public static final int cfr_renamed_93 = 188;
    public static final int cfr_renamed_86 = 14028;
    private sprlc cfr_renamed_152;
    public static final int cfr_renamed_112 = 13516;
    public static final int cfr_renamed_119 = 13004;
    private byte[] cfr_renamed_91;
    public static final int cfr_renamed_0 = 13772;
    public static final int cfr_renamed_1 = 13260;
    private int cfr_renamed_2;
    public static final int cfr_renamed_3 = 12748;
    private int cfr_renamed_4;

    @Override
    public void cfr_renamed_3219(byte[] arg0) throws sprpjd {
        sprwzc sprwzc2;
        int n;
        byte[] byArray = this.cfr_renamed_145.cfr_renamed_1337(arg0, 0, arg0.length);
        if ((byArray[0] & 0xC0 ^ 0x40) != 0) {
            throw new sprpjd(sprjsr.cfr_renamed_9("6\u00107\u00174\u00036\u0014?Q(\u0018<\u001f:\u0005.\u0003>"));
        }
        if ((byArray[byArray.length - 1] & 0xF ^ 0xC) != 0) {
            throw new sprpjd(sproqo.cfr_renamed_9("Zi[nXzZmS(DaPfV|BzR"));
        }
        int n2 = 0;
        if ((byArray[byArray.length - 1] & 0xFF ^ 0xBC) == 0) {
            n2 = 1;
        } else {
            n = (byArray[byArray.length - 2] & 0xFF) << 8 | byArray[byArray.length - 1] & 0xFF;
            Integer n3 = (Integer)cfr_renamed_96.get(this.cfr_renamed_152.cfr_renamed_1315());
            if (n3 != null) {
                if (n != n3) {
                    throw new IllegalStateException(new StringBuilder().insert(0, sprjsr.cfr_renamed_9("(\u0018<\u001f>\u0003{\u00185\u0018/\u0018:\u001d2\u0002>\u0015{\u00062\u00053Q,\u00034\u001f<Q?\u0018<\u0014(\u0005{\u00174\u0003{\u0005)\u00102\u001d>\u0003{")).append(n).toString());
                }
            } else {
                throw new IllegalArgumentException(sproqo.cfr_renamed_9("}YzRkXoYaDmS(_iD`\u0017aY(DaPfV|BzR"));
            }
            n2 = 2;
        }
        n = 0;
        int n4 = n = 0;
        while (n4 != byArray.length && (byArray[n] & 0xF ^ 0xA) != 0) {
            n4 = ++n;
        }
        int n5 = byArray.length - n2 - this.cfr_renamed_152.cfr_renamed_1218();
        if (n5 - ++n <= 0) {
            throw new sprpjd(sprjsr.cfr_renamed_9("6\u00107\u00174\u00036\u0014?Q9\u001d4\u00120"));
        }
        sprwzc sprwzc3 = this;
        if ((byArray[0] & 0x20) == 0) {
            sprwzc3.cfr_renamed_107 = true;
            int n6 = n;
            this.cfr_renamed_79 = new byte[n5 - n6];
            System.arraycopy(byArray, n6, this.cfr_renamed_79, 0, this.cfr_renamed_79.length);
            sprwzc2 = this;
        } else {
            sprwzc3.cfr_renamed_107 = false;
            int n7 = n;
            this.cfr_renamed_79 = new byte[n5 - n7];
            System.arraycopy(byArray, n7, this.cfr_renamed_79, 0, this.cfr_renamed_79.length);
            sprwzc2 = this;
        }
        sprwzc2.cfr_renamed_132 = arg0;
        this.cfr_renamed_137 = byArray;
        this.cfr_renamed_152.cfr_renamed_1197(this.cfr_renamed_79, 0, this.cfr_renamed_79.length);
        this.cfr_renamed_2 = this.cfr_renamed_79.length;
        System.arraycopy(this.cfr_renamed_79, 0, this.cfr_renamed_91, 0, this.cfr_renamed_79.length);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean cfr_renamed_3280(byte[] byArray) {
        void arg0;
        sprwzc sprwzc2 = this;
        sprwzc2.cfr_renamed_3277(sprwzc2.cfr_renamed_91);
        sprwzc2.cfr_renamed_3277((byte[])arg0);
        return false;
    }

    @Override
    public byte[] cfr_renamed_1329() throws sprvmd {
        sprwzc sprwzc2;
        int n;
        int n2;
        sprwzc sprwzc3 = this;
        int n3 = sprwzc3.cfr_renamed_152.cfr_renamed_1218();
        int n4 = 0;
        int n5 = 0;
        if (sprwzc3.cfr_renamed_4 == 188) {
            n4 = 8;
            n5 = this.cfr_renamed_114.length - n3 - 1;
            sprwzc sprwzc4 = this;
            this.cfr_renamed_152.cfr_renamed_1219(sprwzc4.cfr_renamed_114, n5);
            sprwzc4.cfr_renamed_114[this.cfr_renamed_114.length - 1] = -68;
        } else {
            n4 = 16;
            n5 = this.cfr_renamed_114.length - n3 - 2;
            sprwzc sprwzc5 = this;
            this.cfr_renamed_152.cfr_renamed_1219(sprwzc5.cfr_renamed_114, n5);
            sprwzc5.cfr_renamed_114[this.cfr_renamed_114.length - 2] = (byte)(this.cfr_renamed_4 >>> 8);
            sprwzc sprwzc6 = this;
            sprwzc6.cfr_renamed_114[sprwzc6.cfr_renamed_114.length - 1] = (byte)this.cfr_renamed_4;
        }
        int n6 = 0;
        int n7 = (n3 + this.cfr_renamed_2) * 8 + n4 + 4 - this.cfr_renamed_105;
        if (n7 > 0) {
            sprwzc sprwzc7 = this;
            n2 = sprwzc7.cfr_renamed_2 - (n7 + 7) / 8;
            n6 = 96;
            System.arraycopy(sprwzc7.cfr_renamed_91, 0, this.cfr_renamed_114, n5 -= n2, n2);
            n = n5;
        } else {
            n6 = 64;
            n = n5 = n5 - this.cfr_renamed_2;
            System.arraycopy(this.cfr_renamed_91, 0, this.cfr_renamed_114, n5, this.cfr_renamed_2);
        }
        if (n - 1 > 0) {
            int n8 = n2 = n5 - 1;
            while (n8 != 0) {
                this.cfr_renamed_114[n2--] = -69;
                n8 = n2;
            }
            sprwzc sprwzc8 = this;
            sprwzc2 = sprwzc8;
            int n9 = n5 - 1;
            sprwzc8.cfr_renamed_114[n9] = (byte)(sprwzc8.cfr_renamed_114[n9] ^ 1);
            sprwzc8.cfr_renamed_114[0] = 11;
            sprwzc8.cfr_renamed_114[0] = (byte)(sprwzc8.cfr_renamed_114[0] | n6);
        } else {
            sprwzc sprwzc9 = this;
            sprwzc2 = sprwzc9;
            sprwzc9.cfr_renamed_114[0] = 10;
            sprwzc9.cfr_renamed_114[0] = (byte)(sprwzc9.cfr_renamed_114[0] | n6);
        }
        byte[] byArray = sprwzc2.cfr_renamed_145.cfr_renamed_1337(this.cfr_renamed_114, 0, this.cfr_renamed_114.length);
        sprwzc sprwzc10 = this;
        sprwzc10.cfr_renamed_3277(sprwzc10.cfr_renamed_91);
        sprwzc10.cfr_renamed_3277(sprwzc10.cfr_renamed_114);
        return byArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean cfr_renamed_1328(byte[] arg0) {
        sprwzc sprwzc2;
        Object object;
        int n;
        byte[] byArray;
        byte[] byArray2 = null;
        if (this.cfr_renamed_132 == null) {
            try {
                byArray = byArray2 = this.cfr_renamed_145.cfr_renamed_1337(arg0, 0, arg0.length);
            }
            catch (Exception exception) {
                return false;
            }
        } else {
            if (!sprzra.cfr_renamed_92(this.cfr_renamed_132, arg0)) {
                throw new IllegalStateException(sproqo.cfr_renamed_9("}GlV|R_^|_ZRkX~RzRlzmD{VoR(Ti[dRl\u0017gY(SaQnRzRfC(DaPfV|BzR"));
            }
            byArray2 = this.cfr_renamed_137;
            this.cfr_renamed_132 = null;
            this.cfr_renamed_137 = null;
            byArray = byArray2;
        }
        if ((byArray[0] & 0xC0 ^ 0x40) != 0) {
            return this.cfr_renamed_3280(byArray2);
        }
        if ((byArray2[byArray2.length - 1] & 0xF ^ 0xC) != 0) {
            return this.cfr_renamed_3280(byArray2);
        }
        int n2 = 0;
        if ((byArray2[byArray2.length - 1] & 0xFF ^ 0xBC) == 0) {
            n2 = 1;
        } else {
            n = (byArray2[byArray2.length - 2] & 0xFF) << 8 | byArray2[byArray2.length - 1] & 0xFF;
            Integer n3 = (Integer)cfr_renamed_96.get(this.cfr_renamed_152.cfr_renamed_1315());
            object = n3;
            if (n3 == null) {
                throw new IllegalArgumentException(sproqo.cfr_renamed_9("}YzRkXoYaDmS(_iD`\u0017aY(DaPfV|BzR"));
            }
            if (n != object.intValue()) {
                throw new IllegalStateException(new StringBuilder().insert(0, sprjsr.cfr_renamed_9("(\u0018<\u001f>\u0003{\u00185\u0018/\u0018:\u001d2\u0002>\u0015{\u00062\u00053Q,\u00034\u001f<Q?\u0018<\u0014(\u0005{\u00174\u0003{\u0005)\u00102\u001d>\u0003{")).append(n).toString());
            }
            n2 = 2;
        }
        n = 0;
        int n4 = n = 0;
        while (n4 != byArray2.length && (byArray2[n] & 0xF ^ 0xA) != 0) {
            n4 = ++n;
        }
        object = new byte[this.cfr_renamed_152.cfr_renamed_1218()];
        int n5 = byArray2.length - n2 - ((byte[])object).length;
        if (n5 - ++n <= 0) {
            return this.cfr_renamed_3280(byArray2);
        }
        if ((byArray2[0] & 0x20) == 0) {
            this.cfr_renamed_107 = true;
            if (this.cfr_renamed_2 > n5 - n) {
                return this.cfr_renamed_3280(byArray2);
            }
            sprwzc sprwzc3 = this;
            sprwzc3.cfr_renamed_152.cfr_renamed_41();
            int n6 = n;
            sprwzc3.cfr_renamed_152.cfr_renamed_1197(byArray2, n6, n5 - n6);
            sprwzc3.cfr_renamed_152.cfr_renamed_1219((byte[])object, 0);
            boolean bl = true;
            int n7 = 0;
            int n8 = n7;
            while (n8 != ((Object)object).length) {
                byte[] byArray3 = byArray2;
                int n9 = n5 + n7;
                byArray3[n9] = (byte)(byArray3[n9] ^ object[n7]);
                if (byArray2[n5 + n7] != 0) {
                    bl = false;
                }
                n8 = ++n7;
            }
            if (!bl) {
                return this.cfr_renamed_3280(byArray2);
            }
            this.cfr_renamed_79 = new byte[n5 - n];
            System.arraycopy(byArray2, n, this.cfr_renamed_79, 0, this.cfr_renamed_79.length);
            sprwzc2 = this;
        } else {
            this.cfr_renamed_107 = false;
            this.cfr_renamed_152.cfr_renamed_1219((byte[])object, 0);
            boolean bl = true;
            int n10 = 0;
            int n11 = n10;
            while (n11 != ((Object)object).length) {
                byte[] byArray4 = byArray2;
                int n12 = n5 + n10;
                byArray4[n12] = (byte)(byArray4[n12] ^ object[n10]);
                if (byArray2[n5 + n10] != 0) {
                    bl = false;
                }
                n11 = ++n10;
            }
            if (!bl) {
                return this.cfr_renamed_3280(byArray2);
            }
            this.cfr_renamed_79 = new byte[n5 - n];
            System.arraycopy(byArray2, n, this.cfr_renamed_79, 0, this.cfr_renamed_79.length);
            sprwzc2 = this;
        }
        if (sprwzc2.cfr_renamed_2 != 0) {
            sprwzc sprwzc4 = this;
            if (!sprwzc4.cfr_renamed_3281(this.cfr_renamed_91, sprwzc4.cfr_renamed_79)) {
                return this.cfr_renamed_3280(byArray2);
            }
        }
        sprwzc sprwzc5 = this;
        sprwzc5.cfr_renamed_3277(sprwzc5.cfr_renamed_91);
        this.cfr_renamed_3277(byArray2);
        return true;
    }

    @Override
    public byte[] cfr_renamed_3276() {
        return this.cfr_renamed_79;
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        sprwzc sprwzc2;
        sprmtc sprmtc2 = (sprmtc)arg1;
        sprwzc sprwzc3 = this;
        sprwzc3.cfr_renamed_145.cfr_renamed_1217(arg0, sprmtc2);
        this.cfr_renamed_105 = sprmtc2.cfr_renamed_2295().bitLength();
        this.cfr_renamed_114 = new byte[(sprwzc3.cfr_renamed_105 + 7) / 8];
        if (this.cfr_renamed_4 == 188) {
            this.cfr_renamed_91 = new byte[this.cfr_renamed_114.length - this.cfr_renamed_152.cfr_renamed_1218() - 2];
            sprwzc2 = this;
        } else {
            this.cfr_renamed_91 = new byte[this.cfr_renamed_114.length - this.cfr_renamed_152.cfr_renamed_1218() - 3];
            sprwzc2 = this;
        }
        sprwzc2.cfr_renamed_41();
    }

    @Override
    public boolean cfr_renamed_2425() {
        return this.cfr_renamed_107;
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        int n = arg2;
        while (n > 0) {
            sprwzc sprwzc2 = this;
            if (sprwzc2.cfr_renamed_2 >= sprwzc2.cfr_renamed_91.length) break;
            this.cfr_renamed_1221(arg0[arg1++]);
            n = --arg2;
        }
        sprwzc sprwzc3 = this;
        sprwzc3.cfr_renamed_152.cfr_renamed_1197(arg0, arg1, arg2);
        sprwzc3.cfr_renamed_2 += arg2;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        sprwzc sprwzc2 = this;
        sprwzc2.cfr_renamed_152.cfr_renamed_1221(arg0);
        if (sprwzc2.cfr_renamed_2 < this.cfr_renamed_91.length) {
            sprwzc sprwzc3 = this;
            sprwzc3.cfr_renamed_91[sprwzc3.cfr_renamed_2] = arg0;
        }
        ++this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprwzc(sprh sprh2, sprlc sprlc2, boolean bl) {
        void arg1;
        void arg0;
        sprwzc sprwzc2 = this;
        sprwzc2.cfr_renamed_145 = arg0;
        sprwzc2.cfr_renamed_152 = arg1;
        if (bl) {
            this.cfr_renamed_4 = 188;
            return;
        }
        Integer n = (Integer)cfr_renamed_96.get(arg1.cfr_renamed_1315());
        if (n != null) {
            this.cfr_renamed_4 = n;
            return;
        }
        throw new IllegalArgumentException(sprjsr.cfr_renamed_9("5\u001e{\u0007:\u001d2\u0015{\u0005)\u00102\u001d>\u0003{\u00174\u0003{\u00152\u0016>\u0002/"));
    }

    private /* synthetic */ void cfr_renamed_3277(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 != arg0.length) {
            arg0[n++] = 0;
            n2 = n;
        }
    }

    @Override
    public void cfr_renamed_41() {
        sprwzc sprwzc2 = this;
        sprwzc sprwzc3 = this;
        sprwzc3.cfr_renamed_152.cfr_renamed_41();
        sprwzc2.cfr_renamed_2 = 0;
        sprwzc2.cfr_renamed_3277(sprwzc3.cfr_renamed_91);
        if (sprwzc2.cfr_renamed_79 != null) {
            sprwzc sprwzc4 = this;
            sprwzc4.cfr_renamed_3277(sprwzc4.cfr_renamed_79);
        }
        sprwzc sprwzc5 = this;
        sprwzc5.cfr_renamed_79 = null;
        sprwzc5.cfr_renamed_107 = false;
        if (this.cfr_renamed_132 != null) {
            sprwzc sprwzc6 = this;
            this.cfr_renamed_132 = null;
            sprwzc6.cfr_renamed_3277(sprwzc6.cfr_renamed_137);
            sprwzc6.cfr_renamed_137 = null;
        }
    }

    public sprwzc(sprh arg0, sprlc arg1) {
        this(arg0, arg1, false);
    }

    private /* synthetic */ boolean cfr_renamed_3281(byte[] arg0, byte[] arg1) {
        boolean bl = true;
        sprwzc sprwzc2 = this;
        if (sprwzc2.cfr_renamed_2 > sprwzc2.cfr_renamed_91.length) {
            int n;
            if (this.cfr_renamed_91.length > arg1.length) {
                bl = false;
            }
            int n2 = n = 0;
            while (n2 != this.cfr_renamed_91.length) {
                if (arg0[n] != arg1[n]) {
                    bl = false;
                }
                n2 = ++n;
            }
        } else {
            int n;
            if (this.cfr_renamed_2 != arg1.length) {
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

    static {
        cfr_renamed_96.put(sproqo.cfr_renamed_9("eAgMzL\u0006:\u000f"), spriwa.cfr_renamed_279(13004));
        cfr_renamed_96.put("RIPEMD160", spriwa.cfr_renamed_279(12748));
        cfr_renamed_96.put("SHA-1", spriwa.cfr_renamed_279(13260));
        cfr_renamed_96.put("SHA-256", spriwa.cfr_renamed_279(13516));
        cfr_renamed_96.put("SHA-384", spriwa.cfr_renamed_279(14028));
        cfr_renamed_96.put("SHA-512", spriwa.cfr_renamed_279(13772));
        cfr_renamed_96.put(sprjsr.cfr_renamed_9("\f\u00192\u00037\u00014\u001e7"), spriwa.cfr_renamed_279(14284));
    }
}

