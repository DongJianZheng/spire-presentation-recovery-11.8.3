/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravr;
import com.spire.presentation.packages.sprdan;
import com.spire.presentation.packages.sprddn;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprgtja;
import com.spire.presentation.packages.sprjpfa;
import com.spire.presentation.packages.sprken;
import com.spire.presentation.packages.sprlcn;
import com.spire.presentation.packages.sprovm;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprqdn;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprszca;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtzja;
import com.spire.presentation.packages.sprvwm;

@sprtea
public class sprzvm
implements Cloneable {
    private boolean cfr_renamed_105;
    private int cfr_renamed_137;
    private boolean cfr_renamed_79;
    private boolean cfr_renamed_107;
    private int cfr_renamed_132;
    private static final int cfr_renamed_102 = 255;
    private long cfr_renamed_93;
    private sprddn cfr_renamed_86;
    private String cfr_renamed_152;
    private long cfr_renamed_112;
    private spreen cfr_renamed_119;
    private boolean cfr_renamed_91;
    private int cfr_renamed_0;
    private short cfr_renamed_1;
    private long cfr_renamed_2;
    private int cfr_renamed_3;
    private long cfr_renamed_4;

    public static String cfr_renamed_9(String string) {
        String s;
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3;
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ 2;
        int n4 = n2;
        int n5 = 3;
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

    public static spreen cfr_renamed_12096(spreen arg0) {
        int n;
        if (arg0 == null) {
            return null;
        }
        spreen spreen2 = arg0;
        spreen spreen3 = spreen2;
        long l = spreen2.cfr_renamed_3274();
        spreen spreen4 = arg0;
        sprpdja sprpdja2 = new sprpdja((int)spreen4.cfr_renamed_806());
        spreen4.cfr_renamed_11548(0L);
        int n2 = 32768;
        byte[] byArray = new byte[32768];
        while ((n = spreen3.cfr_renamed_11556(byArray, 0, n2)) != 0) {
            spreen3 = arg0;
            sprpdja2.cfr_renamed_4924(byArray, 0, n);
        }
        arg0.cfr_renamed_11548(l);
        sprpdja sprpdja3 = sprpdja2;
        sprpdja3.cfr_renamed_11548(l);
        return sprpdja3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public spreen cfr_renamed_7830() {
        try {
            if (this.cfr_renamed_105) {
                this.cfr_renamed_12097();
            }
            return this.cfr_renamed_119;
        }
        catch (Exception exception) {
            return new sprpdja();
        }
    }

    public void cfr_renamed_12098(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            throw new IllegalArgumentException(sprjpfa.cfr_renamed_9(",\u0018\u000e\u0018\u0011\u001c\b\u001c\u000eY\u0012\u0018\u0011\u001cFY5\r\u0019\u00142\u0018\u0011\u001c"));
        }
        this.cfr_renamed_152 = arg0;
    }

    @sprtea
    public sprzvm cfr_renamed_12099() {
        ((sprzvm)this.cfr_renamed_12100()).cfr_renamed_119 = sprzvm.cfr_renamed_12096(this.cfr_renamed_119);
        return (sprzvm)this.cfr_renamed_12100();
    }

    private /* synthetic */ void cfr_renamed_12101() throws Exception {
        int n;
        sprlcn sprlcn2 = new sprlcn(this.cfr_renamed_119, true);
        sprpdja sprpdja2 = new sprpdja();
        byte[] byArray = new byte[4096];
        int n2 = 0;
        sprlcn sprlcn3 = sprlcn2;
        while ((n = sprlcn3.cfr_renamed_11556(byArray, 0, 4096)) > 0) {
            sprlcn3 = sprlcn2;
            sprpdja2.cfr_renamed_4924(byArray, 0, n);
            n2 += n;
        }
        if (this.cfr_renamed_112 <= 0L) {
            this.cfr_renamed_112 = n2;
        }
        if (this.cfr_renamed_107) {
            this.cfr_renamed_119.cfr_renamed_2637();
        }
        sprzvm sprzvm2 = this;
        this.cfr_renamed_107 = true;
        sprzvm2.cfr_renamed_119 = sprpdja2;
        sprpdja2.cfr_renamed_11561(this.cfr_renamed_112);
        ((sprpdja)sprzvm2.cfr_renamed_119).cfr_renamed_12102((int)sprzvm2.cfr_renamed_112);
        if (sprzvm2.cfr_renamed_79) {
            this.cfr_renamed_12103(sprpdja2.cfr_renamed_3461());
        }
        this.cfr_renamed_119.cfr_renamed_11548(0L);
    }

    private /* synthetic */ void cfr_renamed_12104(spreen arg0) {
        long l;
        long l2 = l = this.cfr_renamed_119 != null ? this.cfr_renamed_119.cfr_renamed_806() : 0L;
        if (l <= 0L) {
            return;
        }
        long l3 = arg0.cfr_renamed_3274();
        if (this.cfr_renamed_105 || this.cfr_renamed_0 == 0) {
            this.cfr_renamed_119.cfr_renamed_11548(0L);
            byte[] byArray = new byte[4096];
            while (l > 0L) {
                sprzvm sprzvm2 = this;
                int n = sprzvm2.cfr_renamed_119.cfr_renamed_11556(byArray, 0, 4096);
                arg0.cfr_renamed_4924(byArray, 0, n);
                l -= (long)n;
                if (sprzvm2.cfr_renamed_0 != 0 || (this.cfr_renamed_2 & 0xFFFFFFFFL) != 0L) continue;
                this.cfr_renamed_2 = sprqdn.cfr_renamed_12085(byArray, 0, n, this.cfr_renamed_2);
            }
        } else if (this.cfr_renamed_0 == 8) {
            this.cfr_renamed_112 = l;
            this.cfr_renamed_119.cfr_renamed_11548(0L);
            this.cfr_renamed_2 = 0L;
            byte[] byArray = new byte[4096];
            spreen spreen2 = this.cfr_renamed_86.cfr_renamed_119.cfr_renamed_12087(arg0);
            long l4 = l;
            while (l4 > 0L) {
                int n = this.cfr_renamed_119.cfr_renamed_11556(byArray, 0, 4096);
                boolean bl = l <= 4096L;
                spreen2.cfr_renamed_4924(byArray, 0, n);
                this.cfr_renamed_2 = sprqdn.cfr_renamed_12085(byArray, 0, n, this.cfr_renamed_2);
                l4 = l -= (long)n;
            }
            spreen2.cfr_renamed_2637();
        }
        this.cfr_renamed_93 = arg0.cfr_renamed_3274() - l3;
    }

    public int cfr_renamed_11731() {
        return this.cfr_renamed_0;
    }

    public sprzvm() {
        this.cfr_renamed_0 = 8;
        this.cfr_renamed_3 = 5;
        this.cfr_renamed_11665();
    }

    private /* synthetic */ void cfr_renamed_12105() {
        this.cfr_renamed_119 = new sprvwm(this.cfr_renamed_119, 1, this.cfr_renamed_107);
        this.cfr_renamed_119.cfr_renamed_11548(0L);
    }

    private /* synthetic */ void cfr_renamed_12103(byte[] arg0) {
        if (sprqdn.cfr_renamed_12085(arg0, 0, (int)this.cfr_renamed_112, 0L) != this.cfr_renamed_2) {
            throw new sprovm(spravr.cfr_renamed_9("n4V(^fz4ZfO'U3\\h"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_12106(spreen spreen2) {
        void arg0;
        sprzvm sprzvm2 = this;
        sprzvm2.cfr_renamed_137 = (int)spreen2.cfr_renamed_3274();
        spreen spreen3 = spreen2;
        spreen2.cfr_renamed_4924(sprtzja.cfr_renamed_11787(67324752L), 0, 4);
        spreen3.cfr_renamed_4924(sprtzja.cfr_renamed_12107((short)20), 0, 2);
        spreen3.cfr_renamed_4924(sprtzja.cfr_renamed_12107(this.cfr_renamed_1), 0, 2);
        spreen2.cfr_renamed_4924(sprtzja.cfr_renamed_12107((short)sprzvm2.cfr_renamed_0), 0, 2);
        int n = sprzvm2.cfr_renamed_12108(sprgtja.cfr_renamed_11979());
        byte[] byArray = new byte[4];
        spreen spreen4 = spreen2;
        byArray[0] = (byte)(n & 0xFF);
        byArray[1] = (byte)((n & 0xFF00) >> 8);
        byArray[2] = (byte)((n & 0xFF0000) >> 16);
        byArray[3] = (byte)(((long)n & 0xFF000000L) >> 24);
        spreen4.cfr_renamed_4924(byArray, 0, 4);
        sprzvm2.cfr_renamed_4 = spreen4.cfr_renamed_3274();
        sprzvm sprzvm3 = this;
        void v4 = arg0;
        v4.cfr_renamed_4924(sprtzja.cfr_renamed_11787(this.cfr_renamed_2), 0, 4);
        v4.cfr_renamed_4924(sprtzja.cfr_renamed_12109((int)this.cfr_renamed_93), 0, 4);
        arg0.cfr_renamed_4924(sprtzja.cfr_renamed_12109((int)sprzvm3.cfr_renamed_112), 0, 4);
        sprszca sprszca2 = (sprzvm3.cfr_renamed_1 & 0x800) != 0 ? sprszca.cfr_renamed_11605() : sprszca.cfr_renamed_11656();
        byte[] byArray2 = sprszca2.cfr_renamed_11606(this.cfr_renamed_152);
        int n2 = byArray2.length;
        void v5 = arg0;
        void v6 = arg0;
        v6.cfr_renamed_4924(sprtzja.cfr_renamed_12107((short)n2), 0, 2);
        v6.cfr_renamed_11594((byte)0);
        v5.cfr_renamed_11594((byte)0);
        v5.cfr_renamed_4924(byArray2, 0, byArray2.length);
    }

    private /* synthetic */ void cfr_renamed_12110(spreen arg0) {
        sprpdja sprpdja2;
        int n;
        block6: {
            sprzvm sprzvm2;
            if (this.cfr_renamed_93 > 0L) {
                sprpdja sprpdja3 = new sprpdja();
                int n2 = (int)this.cfr_renamed_93;
                sprpdja3.cfr_renamed_12102(n2);
                byte[] byArray = new byte[4096];
                int n3 = n2;
                while (n3 > 0) {
                    int n4 = Math.min(n2, 4096);
                    if (arg0.cfr_renamed_11556(byArray, 0, n4) != n4) {
                        throw new sprovm(sprjpfa.cfr_renamed_9("<\u0012\u001d\\\u0016\u001aY\u001a\u0010\u0010\u001c\\\u000b\u0019\u0018\u001f\u0011\u0019\u001d\\T\\\u000e\u000e\u0016\u0012\u001e\\\u001f\u0015\u0015\u0019Y\u001a\u0016\u000e\u0014\u001d\r\\\u0016\u000eY\u001a\u0010\u0010\u001c\\\u0010\u000fY\u001f\u0016\u000e\u000b\t\t\bW"));
                    }
                    sprpdja3.cfr_renamed_4924(byArray, 0, n4);
                    n3 = n2 - n4;
                }
                this.cfr_renamed_119 = sprpdja3;
                this.cfr_renamed_107 = true;
                return;
            }
            spreen spreen2 = arg0;
            long l = spreen2.cfr_renamed_806();
            long l2 = spreen2.cfr_renamed_3274();
            n = 0;
            sprpdja2 = new sprpdja();
            sprpdja2.cfr_renamed_12102(4096);
            int n5 = 0;
            byte[] byArray = new byte[1];
            long l3 = l2;
            while (l3 <= l) {
                int n6 = 1;
                if (arg0.cfr_renamed_11556(byArray, 0, n6) != n6) {
                    throw new sprovm(spravr.cfr_renamed_9("\u0003W\"\u0019)_f_/U#\u00194\\'Z.\\\"\u0019k\u00191K)W!\u0019 P*\\f_)K+X2\u0019)Kf_/U#\u0019/JfZ)K4L6Mh"));
                }
                if (n5 == 80 && byArray[0] == 75) {
                    sprzvm2 = this;
                    spreen spreen3 = arg0;
                    spreen3.cfr_renamed_11548(spreen3.cfr_renamed_3274() - 2L);
                    break block6;
                }
                l2 = arg0.cfr_renamed_3274();
                sprpdja2.cfr_renamed_4924(byArray, 0, n6);
                ++n;
                n5 = byArray[0];
                l3 = l2;
            }
            sprzvm2 = this;
        }
        sprzvm2.cfr_renamed_119 = sprpdja2;
        sprzvm sprzvm3 = this;
        sprzvm3.cfr_renamed_107 = true;
        sprzvm3.cfr_renamed_93 = n - 1;
    }

    private /* synthetic */ int cfr_renamed_12108(sprgtja arg0) {
        sprgtja sprgtja2 = arg0 = arg0.cfr_renamed_11925();
        int n = (arg0.cfr_renamed_12008() & 0x1F | arg0.cfr_renamed_12009() << 5 & 0x1E0 | sprgtja2.cfr_renamed_12010() - 1980 << 9 & 0xFE00) & 0xFFFF;
        int n2 = (sprgtja2.cfr_renamed_12011() / 2 & 0x1F | arg0.cfr_renamed_12012() << 5 & 0x7E0 | arg0.cfr_renamed_12013() << 11 & 0xF800) & 0xFFFF;
        return (int)((long)((n & 0xFFFF) << 16) | (long)(n2 & 0xFFFF));
    }

    public void cfr_renamed_12111(spreen arg0, boolean arg1) {
        if (this.cfr_renamed_119 != null && this.cfr_renamed_107) {
            this.cfr_renamed_119.cfr_renamed_2637();
        }
        this.cfr_renamed_107 = arg1;
        this.cfr_renamed_119 = arg0;
        this.cfr_renamed_12112();
        this.cfr_renamed_112 = this.cfr_renamed_119 != null ? arg0.cfr_renamed_806() : 0L;
    }

    @sprtea
    public void cfr_renamed_12113(spreen arg0) {
        spreen spreen2 = arg0;
        spreen spreen3 = arg0;
        sprzvm sprzvm2 = this;
        spreen spreen4 = arg0;
        arg0.cfr_renamed_4924(sprtzja.cfr_renamed_12109(33639248), 0, 4);
        spreen4.cfr_renamed_4924(sprtzja.cfr_renamed_12107((short)45), 0, 2);
        spreen4.cfr_renamed_4924(sprtzja.cfr_renamed_12107((short)20), 0, 2);
        arg0.cfr_renamed_4924(sprtzja.cfr_renamed_12107(sprzvm2.cfr_renamed_1), 0, 2);
        spreen3.cfr_renamed_4924(sprtzja.cfr_renamed_12107((short)sprzvm2.cfr_renamed_0), 0, 2);
        int n = this.cfr_renamed_12108(sprgtja.cfr_renamed_11979());
        byte[] byArray = new byte[]{(byte)(n & 0xFF), (byte)((n & 0xFF00) >> 8), (byte)((n & 0xFF0000) >> 16), (byte)(((long)n & 0xFF000000L) >> 24)};
        spreen2.cfr_renamed_4924(byArray, 0, 4);
        spreen3.cfr_renamed_4924(sprtzja.cfr_renamed_11787(this.cfr_renamed_2), 0, 4);
        spreen2.cfr_renamed_4924(sprtzja.cfr_renamed_12109((int)this.cfr_renamed_93), 0, 4);
        spreen2.cfr_renamed_4924(sprtzja.cfr_renamed_12109((int)this.cfr_renamed_112), 0, 4);
        sprszca sprszca2 = (this.cfr_renamed_1 & 0x800) != 0 ? sprszca.cfr_renamed_11605() : sprszca.cfr_renamed_11656();
        byte[] byArray2 = sprszca2.cfr_renamed_11606(this.cfr_renamed_152);
        arg0.cfr_renamed_4924(sprtzja.cfr_renamed_12107((short)byArray2.length), 0, 2);
        spreen spreen5 = arg0;
        sprzvm sprzvm3 = this;
        spreen spreen6 = arg0;
        spreen spreen7 = arg0;
        spreen spreen8 = arg0;
        spreen spreen9 = arg0;
        spreen9.cfr_renamed_11594((byte)0);
        spreen9.cfr_renamed_11594((byte)0);
        spreen8.cfr_renamed_11594((byte)0);
        spreen8.cfr_renamed_11594((byte)0);
        spreen7.cfr_renamed_11594((byte)0);
        spreen7.cfr_renamed_11594((byte)0);
        spreen6.cfr_renamed_11594((byte)0);
        spreen6.cfr_renamed_11594((byte)0);
        arg0.cfr_renamed_4924(sprtzja.cfr_renamed_12109(sprzvm3.cfr_renamed_132), 0, 4);
        spreen5.cfr_renamed_4924(sprtzja.cfr_renamed_12109(sprzvm3.cfr_renamed_137), 0, 4);
        byte[] byArray3 = sprszca2.cfr_renamed_11606(this.cfr_renamed_152);
        spreen5.cfr_renamed_4924(byArray3, 0, byArray3.length);
    }

    public int cfr_renamed_11792() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public void cfr_renamed_12114(spreen spreen2) {
        void arg0;
        void v0 = arg0;
        void v1 = arg0;
        v1.cfr_renamed_11548(arg0.cfr_renamed_3274() + 4L);
        sprzvm sprzvm2 = this;
        sprzvm2.cfr_renamed_1 = sprzvm2.cfr_renamed_12115().cfr_renamed_12116((spreen)arg0);
        this.cfr_renamed_0 = sprzvm2.cfr_renamed_12115().cfr_renamed_12116((spreen)arg0);
        this.cfr_renamed_105 = true;
        arg0.cfr_renamed_11548(v1.cfr_renamed_3274() + 4L);
        sprzvm sprzvm3 = this;
        sprzvm sprzvm4 = this;
        sprzvm4.cfr_renamed_2 = (long)sprzvm4.cfr_renamed_12115().cfr_renamed_12117((spreen)arg0) & 0xFFFFFFFFL;
        sprzvm4.cfr_renamed_93 = sprzvm4.cfr_renamed_12115().cfr_renamed_12117((spreen)arg0);
        sprzvm3.cfr_renamed_112 = sprzvm4.cfr_renamed_12115().cfr_renamed_12117((spreen)arg0);
        short s = sprzvm3.cfr_renamed_12115().cfr_renamed_12116((spreen)arg0);
        short s2 = this.cfr_renamed_12115().cfr_renamed_12116((spreen)arg0);
        short s3 = sprzvm3.cfr_renamed_12115().cfr_renamed_12116((spreen)arg0);
        v0.cfr_renamed_11548(v0.cfr_renamed_3274() + 4L);
        sprzvm sprzvm5 = this;
        sprzvm5.cfr_renamed_132 = sprzvm5.cfr_renamed_12115().cfr_renamed_12117((spreen)arg0);
        this.cfr_renamed_137 = sprzvm5.cfr_renamed_12115().cfr_renamed_12117((spreen)arg0);
        byte[] byArray = new byte[s];
        v0.cfr_renamed_11556(byArray, 0, s);
        sprszca sprszca2 = (this.cfr_renamed_1 & 0x800) != 0 ? sprszca.cfr_renamed_11605() : sprszca.cfr_renamed_11656();
        this.cfr_renamed_152 = sprszca2.cfr_renamed_11595(byArray, 0, byArray.length);
        void v6 = arg0;
        v6.cfr_renamed_11548(v6.cfr_renamed_3274() + (long)(s2 + s3));
    }

    public void cfr_renamed_12118(int arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public long cfr_renamed_11848() {
        return this.cfr_renamed_93;
    }

    public void cfr_renamed_12119(int arg0) {
        this.cfr_renamed_132 = arg0;
    }

    public void cfr_renamed_12112() {
        sprzvm sprzvm2 = this;
        sprzvm sprzvm3 = this;
        sprzvm3.cfr_renamed_93 = 0L;
        sprzvm3.cfr_renamed_112 = 0L;
        sprzvm2.cfr_renamed_105 = false;
        sprzvm2.cfr_renamed_2 = 0L;
    }

    public void cfr_renamed_11756(int arg0) throws Exception {
        if (this.cfr_renamed_3 != arg0) {
            if (this.cfr_renamed_105) {
                this.cfr_renamed_12097();
            }
            this.cfr_renamed_3 = arg0;
        }
    }

    private /* synthetic */ void cfr_renamed_12120(spreen arg0) {
        if (arg0 == null) {
            throw new NullPointerException(sprjpfa.cfr_renamed_9("\u0013\f\b\t\t\r/\r\u000e\u001c\u001d\u0014"));
        }
        spreen spreen2 = arg0;
        sprzvm sprzvm2 = this;
        spreen spreen3 = arg0;
        long l = spreen3.cfr_renamed_3274();
        spreen3.cfr_renamed_11548(this.cfr_renamed_4);
        arg0.cfr_renamed_4924(sprtzja.cfr_renamed_11787(sprzvm2.cfr_renamed_2), 0, 4);
        spreen2.cfr_renamed_4924(sprtzja.cfr_renamed_12109((int)sprzvm2.cfr_renamed_93), 0, 4);
        spreen2.cfr_renamed_4924(sprtzja.cfr_renamed_12109((int)this.cfr_renamed_112), 0, 4);
        arg0.cfr_renamed_11548(l);
    }

    public sprddn cfr_renamed_12115() {
        return this.cfr_renamed_86;
    }

    @sprtea
    public void cfr_renamed_2637() {
        if (this.cfr_renamed_119 != null) {
            sprzvm sprzvm2 = this;
            sprzvm2.cfr_renamed_119.cfr_renamed_2947();
            if (sprzvm2.cfr_renamed_107) {
                this.cfr_renamed_119.cfr_renamed_2637();
            }
            this.cfr_renamed_119 = null;
            this.cfr_renamed_152 = null;
        }
    }

    public boolean cfr_renamed_12121() {
        return this.cfr_renamed_91;
    }

    private /* synthetic */ void cfr_renamed_12122() {
        sprzvm sprzvm2 = this;
        sprzvm2.cfr_renamed_119.cfr_renamed_11548(0L);
        if (sprqdn.cfr_renamed_12094(sprzvm2.cfr_renamed_119, (int)this.cfr_renamed_112) != this.cfr_renamed_2) {
            throw new sprovm(spravr.cfr_renamed_9("n4V(^fz4ZfO'U3\\h"));
        }
    }

    public boolean cfr_renamed_12123() {
        return this.cfr_renamed_105;
    }

    public String cfr_renamed_12124() {
        return this.cfr_renamed_152;
    }

    public boolean cfr_renamed_12125() {
        return this.cfr_renamed_107;
    }

    public long cfr_renamed_12126() {
        return this.cfr_renamed_112;
    }

    public int cfr_renamed_12127() {
        return this.cfr_renamed_132;
    }

    private /* synthetic */ void cfr_renamed_12128(spreen arg0) {
        if (arg0 == null) {
            throw new NullPointerException("stream");
        }
        if (this.cfr_renamed_12115().cfr_renamed_12117(arg0) != 67324752) {
            throw new sprovm(sprjpfa.cfr_renamed_9(":\u001d\u0017[\r\\\u001f\u0015\u0017\u0018Y\u0010\u0016\u001f\u0018\u0010Y\u0014\u001c\u001d\u001d\u0019\u000b\\\n\u0015\u001e\u0012\u0018\b\f\u000e\u001c\\T\\\u000e\u000e\u0016\u0012\u001e\\\u001f\u0015\u0015\u0019Y\u001a\u0016\u000e\u0014\u001d\r\\\u0016\u000eY\u001a\u0010\u0010\u001c\\\u0010\u000fY\u001f\u0016\u000e\u000b\t\t\bW"));
        }
        sprzvm sprzvm2 = this;
        spreen spreen2 = arg0;
        spreen2.cfr_renamed_11548(arg0.cfr_renamed_3274() + 22L);
        short s = sprzvm2.cfr_renamed_12115().cfr_renamed_12116(arg0);
        short s2 = sprzvm2.cfr_renamed_12115().cfr_renamed_12116(arg0);
        arg0.cfr_renamed_11548(spreen2.cfr_renamed_3274() + (long)(s + s2));
    }

    public sprzvm(sprddn arg0, String arg1, spreen arg2, boolean arg3, int arg4) {
        sprzvm sprzvm2 = this;
        this(arg0);
        sprzvm2.cfr_renamed_152 = arg1;
        sprzvm2.cfr_renamed_107 = arg3;
        this.cfr_renamed_119 = arg2;
        this.cfr_renamed_132 = arg4;
        if (this.cfr_renamed_12129(this.cfr_renamed_152)) {
            this.cfr_renamed_1 = (short)(this.cfr_renamed_1 | 0x800);
        }
    }

    public void cfr_renamed_12130(boolean arg0) {
        this.cfr_renamed_91 = arg0;
    }

    @sprtea
    public sprzvm(sprddn sprddn2) {
        sprzvm sprzvm2 = this;
        this.cfr_renamed_0 = 8;
        sprzvm2.cfr_renamed_3 = 5;
        sprzvm2.cfr_renamed_86 = sprddn2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object cfr_renamed_12100() {
        try {
            return this.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalStateException(cloneNotSupportedException);
        }
    }

    @sprtea
    public void cfr_renamed_12131(spreen arg0) {
        int n;
        if (arg0 == null) {
            return;
        }
        sprzvm sprzvm2 = this;
        this.cfr_renamed_7830().cfr_renamed_11548(0L);
        arg0.cfr_renamed_11548(0L);
        int n2 = 32768;
        byte[] byArray = new byte[32768];
        while ((n = sprzvm2.cfr_renamed_7830().cfr_renamed_11556(byArray, 0, n2)) != 0) {
            sprzvm2 = this;
            arg0.cfr_renamed_4924(byArray, 0, n);
        }
        this.cfr_renamed_7830().cfr_renamed_11548(0L);
        arg0.cfr_renamed_11548(0L);
    }

    public long cfr_renamed_11599() {
        return this.cfr_renamed_2;
    }

    private /* synthetic */ void cfr_renamed_12097() throws Exception {
        if (this.cfr_renamed_105) {
            if (this.cfr_renamed_0 == 8) {
                sprzvm sprzvm2;
                sprzvm sprzvm3 = this;
                sprzvm3.cfr_renamed_119.cfr_renamed_11548(0L);
                if (sprzvm3.cfr_renamed_91) {
                    sprzvm sprzvm4 = this;
                    sprzvm2 = sprzvm4;
                    sprzvm4.cfr_renamed_12105();
                } else {
                    sprzvm sprzvm5 = this;
                    sprzvm2 = sprzvm5;
                    sprzvm5.cfr_renamed_12132();
                }
                sprzvm2.cfr_renamed_119.cfr_renamed_11548(0L);
                this.cfr_renamed_105 = false;
                return;
            }
            if (this.cfr_renamed_0 == 0) {
                this.cfr_renamed_105 = false;
                return;
            }
            throw new UnsupportedOperationException(new StringBuilder().insert(0, spravr.cfr_renamed_9("z)T6K#J5P)WfM?I#\u0003f")).append(sprken.cfr_renamed_12090(this.cfr_renamed_0)).append(sprjpfa.cfr_renamed_9("Y\u0015\n\\\u0017\u0013\r\\\n\t\t\f\u0016\u000e\r\u0019\u001d")).toString());
        }
    }

    @sprtea
    public void cfr_renamed_11814(spreen arg0) {
        if (this.cfr_renamed_119 == null || this.cfr_renamed_119.cfr_renamed_806() == 0L) {
            this.cfr_renamed_3 = 0;
            this.cfr_renamed_0 = 0;
        }
        sprzvm sprzvm2 = this;
        spreen spreen2 = arg0;
        this.cfr_renamed_12106(arg0);
        sprzvm2.cfr_renamed_12104(spreen2);
        sprzvm2.cfr_renamed_12120(spreen2);
    }

    private /* synthetic */ void cfr_renamed_12132() throws Exception {
        int n;
        sprvwm sprvwm2 = new sprvwm(this.cfr_renamed_119, 1, true);
        sprpdja sprpdja2 = new sprpdja();
        sprpdja2.cfr_renamed_12102((int)(this.cfr_renamed_112 > 0L ? this.cfr_renamed_112 : 4096L));
        byte[] byArray = new byte[4096];
        boolean bl = false;
        long l = 0L;
        sprvwm sprvwm3 = sprvwm2;
        while ((n = sprvwm3.cfr_renamed_11556(byArray, 0, 4096)) > 0) {
            bl = true;
            sprvwm3 = sprvwm2;
            sprpdja2.cfr_renamed_4924(byArray, 0, n);
            l += (long)n;
        }
        sprvwm2.dispose();
        if (this.cfr_renamed_112 <= 0L) {
            this.cfr_renamed_112 = l;
        }
        sprzvm sprzvm2 = this;
        if (!bl) {
            sprzvm2.cfr_renamed_119.cfr_renamed_11548(0L);
            this.cfr_renamed_12101();
            return;
        }
        if (sprzvm2.cfr_renamed_107) {
            this.cfr_renamed_119.cfr_renamed_2637();
        }
        sprzvm sprzvm3 = this;
        this.cfr_renamed_107 = true;
        sprzvm3.cfr_renamed_119 = sprpdja2;
        sprpdja2.cfr_renamed_11561(this.cfr_renamed_112);
        ((sprpdja)sprzvm3.cfr_renamed_119).cfr_renamed_12102((int)sprzvm3.cfr_renamed_112);
        if (sprzvm3.cfr_renamed_79) {
            this.cfr_renamed_12103(sprpdja2.cfr_renamed_3461());
        }
        this.cfr_renamed_119.cfr_renamed_11548(0L);
    }

    @sprtea
    public void cfr_renamed_12133(spreen arg0, boolean arg1) {
        if (arg0 == null) {
            throw new NullPointerException("stream");
        }
        arg0.cfr_renamed_11548(this.cfr_renamed_137);
        sprzvm sprzvm2 = this;
        this.cfr_renamed_79 = arg1;
        sprzvm2.cfr_renamed_12128(arg0);
        sprzvm2.cfr_renamed_12110(arg0);
    }

    private /* synthetic */ boolean cfr_renamed_12129(String arg0) {
        int n;
        if (arg0 == null || sprraia.cfr_renamed_11730(arg0, "")) {
            throw new IllegalArgumentException(spravr.cfr_renamed_9("_/U#w'T#"));
        }
        char[] cArray = arg0.toCharArray();
        int n2 = cArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            if (cArray[n] > '\u00ff') {
                return true;
            }
            n3 = ++n;
        }
        return false;
    }

    public void cfr_renamed_12134(sprdan arg0) {
        if (arg0 == null) {
            throw new NullPointerException("stream");
        }
        if (this.cfr_renamed_119 != null && this.cfr_renamed_107) {
            this.cfr_renamed_119.cfr_renamed_2637();
        }
        sprzvm sprzvm2 = this;
        this.cfr_renamed_119 = arg0.cfr_renamed_12088();
        this.cfr_renamed_93 = this.cfr_renamed_119.cfr_renamed_806();
        this.cfr_renamed_112 = arg0.cfr_renamed_12089();
        sprzvm2.cfr_renamed_105 = true;
        sprzvm2.cfr_renamed_2 = arg0.cfr_renamed_11599();
        this.cfr_renamed_107 = false;
    }

    public void cfr_renamed_11665() {
        if (this.cfr_renamed_152 != null) {
            this.cfr_renamed_2637();
            this.cfr_renamed_152 = null;
        }
    }
}

