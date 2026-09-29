/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprce;
import com.spire.presentation.packages.sprcl;
import com.spire.presentation.packages.sprdah;
import com.spire.presentation.packages.spreq;
import com.spire.presentation.packages.sprizg;
import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprmnja;
import com.spire.presentation.packages.sprmve;
import com.spire.presentation.packages.sprmxg;
import com.spire.presentation.packages.sproam;
import com.spire.presentation.packages.sprojm;
import com.spire.presentation.packages.sprqm;
import com.spire.presentation.packages.sprqqg;
import com.spire.presentation.packages.sprqqo;
import com.spire.presentation.packages.sprsm;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprvd;
import com.spire.presentation.packages.sprwdm;
import com.spire.presentation.packages.sprxam;
import com.spire.presentation.packages.spryvg;
import com.spire.presentation.packages.sprzcm;
import com.spire.presentation.packages.sprzrg;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class sprgvg
implements sprcl,
sprqm {
    private OutputStream cfr_renamed_724;
    public static final int cfr_renamed_953 = 9;
    private byte[] cfr_renamed_133;
    private sprjah cfr_renamed_185;
    private sprsm spr\ufe34;
    private sprvd cfr_renamed_82;
    private OutputStream cfr_renamed_126;
    public static final int cfr_renamed_88 = 8;
    public static final int cfr_renamed_31 = 11;
    private boolean cfr_renamed_272;
    private List<spryvg> cfr_renamed_145;
    public static final int cfr_renamed_114 = 2;
    private boolean cfr_renamed_96;
    private int cfr_renamed_105;
    private SecureRandom cfr_renamed_137;
    public static final int cfr_renamed_79 = 10;

    public OutputStream cfr_renamed_7847(OutputStream arg0, byte[] arg1) throws IOException, sprtqg {
        return this.cfr_renamed_7848(arg0, 0L, arg1);
    }

    private /* synthetic */ void cfr_renamed_7849(spryvg arg0, int arg1, byte[] arg2) throws IOException, sprtqg {
        if (arg0 instanceof sprdah) {
            sprdah sprdah2 = (sprdah)arg0;
            sprzcm sprzcm2 = arg0.cfr_renamed_7850(sprdah2.cfr_renamed_7851(this.cfr_renamed_105), arg1, arg2);
            this.cfr_renamed_185.cfr_renamed_7680(sprzcm2);
            return;
        }
        this.cfr_renamed_185.cfr_renamed_7680(arg0.cfr_renamed_7852(this.cfr_renamed_105, arg2));
    }

    private /* synthetic */ void cfr_renamed_7853(spryvg arg0, byte[] arg1) throws IOException, sprtqg {
        if (arg0 instanceof sprdah) {
            sprdah sprdah2 = (sprdah)arg0;
            sprzcm sprzcm2 = arg0.cfr_renamed_7854(sprdah2.cfr_renamed_7851(this.cfr_renamed_105), this.cfr_renamed_82.cfr_renamed_7855(), arg1);
            this.cfr_renamed_185.cfr_renamed_7680(sprzcm2);
            return;
        }
        this.cfr_renamed_185.cfr_renamed_7680(arg0.cfr_renamed_7852(this.cfr_renamed_105, arg1));
    }

    public sprgvg(sprvd arg0, boolean arg1) {
        sprgvg sprgvg2 = this;
        sprgvg sprgvg3 = this;
        this.cfr_renamed_272 = false;
        sprgvg3.cfr_renamed_133 = new byte[32];
        sprgvg sprgvg4 = this;
        sprgvg3.cfr_renamed_145 = new ArrayList<spryvg>();
        sprgvg3.cfr_renamed_96 = false;
        this.cfr_renamed_82 = arg0;
        sprgvg2.cfr_renamed_272 = arg1;
        sprgvg2.cfr_renamed_105 = this.cfr_renamed_82.cfr_renamed_593();
        sprgvg2.cfr_renamed_137 = sprgvg2.cfr_renamed_82.cfr_renamed_2794();
        sprgvg2.cfr_renamed_137.nextBytes(this.cfr_renamed_133);
    }

    private /* synthetic */ void cfr_renamed_7856(byte[] arg0) {
        int n;
        int n2 = 0;
        int n3 = n = 1;
        while (n3 != arg0.length - 2) {
            byte by = arg0[n];
            n2 += by & 0xFF;
            n3 = ++n;
        }
        arg0[arg0.length - 2] = (byte)(n2 >> 8);
        arg0[arg0.length - 1] = (byte)n2;
    }

    private /* synthetic */ void cfr_renamed_7857(spryvg arg0, byte[] arg1) throws IOException, sprtqg {
        if (arg0 instanceof sprdah) {
            sprdah sprdah2 = (sprdah)arg0;
            sprzcm sprzcm2 = arg0.cfr_renamed_7852(sprdah2.cfr_renamed_7851(this.cfr_renamed_105), arg1);
            this.cfr_renamed_185.cfr_renamed_7680(sprzcm2);
            return;
        }
        this.cfr_renamed_185.cfr_renamed_7680(arg0.cfr_renamed_7852(this.cfr_renamed_105, arg1));
    }

    public void cfr_renamed_7858(boolean arg0) {
        this.cfr_renamed_96 = arg0;
    }

    public OutputStream cfr_renamed_7859(OutputStream arg0, long arg1) throws IOException, sprtqg {
        return this.cfr_renamed_7848(arg0, arg1, null);
    }

    private /* synthetic */ byte[] cfr_renamed_7860(int arg0, byte[] arg1) {
        byte[] byArray = new byte[arg1.length + 3];
        byArray[0] = (byte)arg0;
        System.arraycopy(arg1, 0, byArray, 1, arg1.length);
        this.cfr_renamed_7856(byArray);
        return byArray;
    }

    private /* synthetic */ OutputStream cfr_renamed_7848(OutputStream arg0, long arg1, byte[] arg2) throws IOException, sprtqg, IllegalStateException {
        Object object;
        Object object2;
        int n;
        Object object3;
        sprgvg sprgvg2;
        byte[] byArray;
        byte[] byArray2;
        byte[] byArray3;
        if (this.cfr_renamed_724 != null) {
            throw new IllegalStateException(sprmnja.cfr_renamed_9("?\u00036\u0003*\u0007,\t*F9\n*\u00039\u0002!F1\bx\t(\u00036F+\u00129\u0012="));
        }
        if (this.cfr_renamed_145.size() == 0) {
            throw new IllegalStateException(sprqqo.cfr_renamed_9("_)\u0011#_%C?A2X)_f\\#E.^\"BfB6T%X X#U"));
        }
        this.cfr_renamed_185 = new sprjah(arg0, !this.cfr_renamed_272);
        sprgvg sprgvg3 = this;
        sprgvg3.cfr_renamed_105 = sprgvg3.cfr_renamed_82.cfr_renamed_593();
        sprgvg3.cfr_renamed_137 = sprgvg3.cfr_renamed_82.cfr_renamed_2794();
        boolean bl = !sprgvg3.cfr_renamed_96 && this.cfr_renamed_145.size() == 1 && this.cfr_renamed_145.get(0) instanceof sprdah;
        sprgvg sprgvg4 = this;
        if (bl) {
            byArray3 = ((sprdah)sprgvg4.cfr_renamed_145.get(0)).cfr_renamed_7861(this.cfr_renamed_105);
            byArray2 = null;
            byArray = byArray3;
            sprgvg2 = this;
        } else {
            byArray3 = sprmxg.cfr_renamed_7549(sprgvg4.cfr_renamed_105, this.cfr_renamed_137);
            sprgvg sprgvg5 = this;
            sprgvg2 = sprgvg5;
            byArray2 = sprgvg5.cfr_renamed_7860(sprgvg5.cfr_renamed_105, byArray3);
            byArray = byArray3;
        }
        boolean bl2 = sprgvg2.cfr_renamed_82.cfr_renamed_7862();
        if (this.cfr_renamed_82.cfr_renamed_7855() != -1 && !bl2) {
            sprgvg sprgvg6 = this;
            object3 = sproam.cfr_renamed_7863(2, sprgvg6.cfr_renamed_105, sprgvg6.cfr_renamed_82.cfr_renamed_7855(), this.cfr_renamed_82.cfr_renamed_7864());
            byArray = sprqqg.cfr_renamed_7865(this.cfr_renamed_82.cfr_renamed_7855(), this.cfr_renamed_105, byArray3, this.cfr_renamed_133, (byte[])object3);
        }
        object3 = this.cfr_renamed_82.cfr_renamed_2588(byArray);
        this.spr\ufe34 = object3.cfr_renamed_7571();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_145.size()) {
            object2 = this.cfr_renamed_145.get(n);
            if (object3 instanceof sprce) {
                object = (sprce)object3;
                sprgvg sprgvg7 = this;
                if (bl2) {
                    sprgvg7.cfr_renamed_7853((spryvg)object2, byArray2);
                } else {
                    sprgvg7.cfr_renamed_7849((spryvg)object2, object.cfr_renamed_7866(), byArray2);
                }
            } else {
                this.cfr_renamed_7857((spryvg)object2, byArray2);
            }
            n2 = ++n;
        }
        try {
            byte[] byArray4;
            sprgvg sprgvg8;
            sprxam sprxam2;
            if (object3 instanceof sprce) {
                sprgvg sprgvg9;
                sprce sprce2 = (sprce)object3;
                if (bl2) {
                    sprgvg sprgvg10;
                    object2 = sprce2.cfr_renamed_1205();
                    object = new sprojm(this.cfr_renamed_82.cfr_renamed_593(), sprce2.cfr_renamed_7866(), sprce2.cfr_renamed_7864(), (byte[])object2);
                    if (arg2 != null) {
                        sprgvg10 = this;
                        this.cfr_renamed_185 = new sprizg(arg0, (spreq)object, arg2);
                    } else {
                        long l = 1L << sprce2.cfr_renamed_7864() + 6;
                        long l2 = (arg1 + l - 1L) / l * 16L + 16L;
                        this.cfr_renamed_185 = new sprizg(arg0, (spreq)object, arg1 + l2 + 4L + (long)((Object)object2).length);
                        sprgvg10 = this;
                    }
                    sprgvg10.cfr_renamed_126 = this.cfr_renamed_724 = object3.cfr_renamed_1442(this.cfr_renamed_185);
                    return new sprzrg(this.cfr_renamed_126, this);
                }
                object2 = sproam.cfr_renamed_7867(this.cfr_renamed_82.cfr_renamed_593(), sprce2.cfr_renamed_7866(), sprce2.cfr_renamed_7864(), this.cfr_renamed_133);
                if (arg2 != null) {
                    sprgvg9 = this;
                    this.cfr_renamed_185 = new sprizg(arg0, (spreq)object2, arg2);
                } else {
                    long l = 1L << sprce2.cfr_renamed_7864() + 6;
                    long l3 = (arg1 + l - 1L) / l * 16L + 16L;
                    this.cfr_renamed_185 = new sprizg(arg0, (spreq)object2, arg1 + l3 + 4L + (long)this.cfr_renamed_133.length);
                    sprgvg9 = this;
                }
                sprgvg9.cfr_renamed_126 = this.cfr_renamed_724 = object3.cfr_renamed_1442(this.cfr_renamed_185);
                return new sprzrg(this.cfr_renamed_126, this);
            }
            if (this.spr\ufe34 != null) {
                sprxam2 = new sproam();
                if (this.cfr_renamed_272) {
                    throw new sprtqg(sprmnja.cfr_renamed_9("+\u001f5\u000b=\u0012*\u000f;K=\b;K1\b,\u0003?\u00141\u0012!F(\u0007;\r=\u0012+F6\t,F+\u0013(\u00167\u0014,\u0003<F1\bx\t4\u0002x6\u001f6x\u00007\u00145\u0007,"));
                }
            } else {
                sprxam2 = new sprwdm();
            }
            if (arg2 == null) {
                long l = this.spr\ufe34 == null ? arg1 + (long)object3.cfr_renamed_1195() + 2L : arg1 + (long)object3.cfr_renamed_1195() + 2L + 1L + 22L;
                sprgvg8 = this;
                this.cfr_renamed_185 = new sprizg(arg0, (spreq)((Object)sprxam2), l, this.cfr_renamed_272);
            } else {
                sprgvg8 = this;
                this.cfr_renamed_185 = new sprizg(arg0, (spreq)((Object)sprxam2), arg2);
            }
            sprgvg8.cfr_renamed_126 = this.cfr_renamed_724 = object3.cfr_renamed_1442(this.cfr_renamed_185);
            if (this.spr\ufe34 != null) {
                this.cfr_renamed_126 = new sprmve(this.spr\ufe34.cfr_renamed_470(), this.cfr_renamed_724);
            }
            byte[] byArray5 = byArray4 = new byte[object3.cfr_renamed_1195() + 2];
            this.cfr_renamed_137.nextBytes(byArray5);
            byArray5[byArray4.length - 1] = byArray4[byArray4.length - 3];
            byArray4[byArray4.length - 2] = byArray4[byArray4.length - 4];
            this.cfr_renamed_126.write(byArray4);
            return new sprzrg(this.cfr_renamed_126, this);
        }
        catch (Exception exception) {
            throw new sprtqg(sprqqo.cfr_renamed_9("t>R#A2X)_fR4T'E/_!\u0011%X6Y#C"), exception);
        }
    }

    @Override
    public void cfr_renamed_2637() throws IOException {
        if (this.cfr_renamed_724 != null) {
            if (this.spr\ufe34 != null) {
                new sprjah(this.cfr_renamed_126, 19, 20L).flush();
                sprgvg sprgvg2 = this;
                byte[] byArray = sprgvg2.spr\ufe34.cfr_renamed_580();
                sprgvg2.cfr_renamed_724.write(byArray);
            }
            this.cfr_renamed_724.close();
            this.cfr_renamed_724 = null;
            this.cfr_renamed_185 = null;
        }
    }

    public void cfr_renamed_7868(spryvg arg0) {
        this.cfr_renamed_145.add(arg0);
    }

    public sprgvg(sprvd arg0) {
        this(arg0, false);
    }
}

