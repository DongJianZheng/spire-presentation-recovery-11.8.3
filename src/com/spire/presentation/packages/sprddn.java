/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprazia;
import com.spire.presentation.packages.sprbzm;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprgfja;
import com.spire.presentation.packages.sprgur;
import com.spire.presentation.packages.sprhyo;
import com.spire.presentation.packages.sprigja;
import com.spire.presentation.packages.sprmba;
import com.spire.presentation.packages.sprovm;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprpv;
import com.spire.presentation.packages.sprpxca;
import com.spire.presentation.packages.sprqq;
import com.spire.presentation.packages.sprruha;
import com.spire.presentation.packages.sprsyia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtyo;
import com.spire.presentation.packages.sprtzja;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprwen;
import com.spire.presentation.packages.sprwym;
import com.spire.presentation.packages.sprzdja;
import com.spire.presentation.packages.sprzvm;

@sprtea
public class sprddn
implements sprqq,
Cloneable {
    private boolean cfr_renamed_112;
    public sprwen cfr_renamed_119;
    private sprtyo cfr_renamed_91;
    private sprpv cfr_renamed_0;
    private int cfr_renamed_1;
    private sprvrx<sprzvm> cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private boolean cfr_renamed_4;

    public static long cfr_renamed_12135(spreen arg0, long arg1, int arg2) {
        boolean bl;
        boolean bl2;
        if (arg0 == null) {
            throw new NullPointerException("stream");
        }
        if (!arg0.cfr_renamed_11557() || !arg0.cfr_renamed_11552()) {
            throw new IllegalArgumentException(sprhyo.cfr_renamed_9("yt[tDp]p[5GtDp\u00135~p\t{LpM5]z\t}HcL5ZpL~HwEp\ttGq\tgLtMtKyL5Za[pHx\u0007"));
        }
        long l = arg0.cfr_renamed_806();
        if (l < 4L) {
            return -1L;
        }
        byte[] byArray = new byte[4];
        long l2 = Math.max(0L, l - (long)arg2);
        long l3 = l - 1L - 4L;
        spreen spreen2 = arg0;
        spreen2.cfr_renamed_11548(l3);
        spreen2.cfr_renamed_11556(byArray, 0, 4);
        long l4 = sprtzja.cfr_renamed_12136(byArray, 0);
        boolean bl3 = bl2 = l4 == arg1;
        if (!bl2) {
            while (l3 > l2) {
                l4 <<= 8;
                arg0.cfr_renamed_11548(--l3);
                if ((l4 = (l4 & 0xFFFFFFFFL) + ((long)arg0.cfr_renamed_12137() & 0xFFFFFFFFL)) != arg1) continue;
                bl = bl2 = true;
                break;
            }
        } else {
            bl = bl2;
        }
        if (bl) {
            return l3;
        }
        return -1L;
    }

    public int cfr_renamed_11861() {
        if (this.cfr_renamed_2 != null) {
            return this.cfr_renamed_2.size();
        }
        return 0;
    }

    private /* synthetic */ void cfr_renamed_12114(spreen arg0) {
        if (arg0 == null) {
            throw new NullPointerException("stream");
        }
        sprddn sprddn2 = this;
        while (sprddn2.cfr_renamed_12117(arg0) == 33639248) {
            sprzvm sprzvm2 = new sprzvm(this);
            sprddn sprddn3 = this;
            sprddn2 = sprddn3;
            sprzvm2.cfr_renamed_12114(arg0);
            sprddn3.cfr_renamed_2.add(sprzvm2);
        }
    }

    public boolean cfr_renamed_12138() {
        return this.cfr_renamed_112;
    }

    public void cfr_renamed_12139(int arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public void cfr_renamed_12140(spreen arg0, boolean arg1) {
        if (arg0 == null) {
            throw new NullPointerException("stream");
        }
        byte[] byArray = new byte[4];
        long l = sprddn.cfr_renamed_12135(arg0, 101010256L, 65557);
        if (l < 0L) {
            throw new sprovm(sprgur.cfr_renamed_9("YLt\nn\rvByLnH:HtI:B|\ryHtYhLv\r~DhHyYu_c\rhHyBhI4\rJBi^sOvH:ZhBtJ:KsA\u007f\r|Bh@{Y:Bh\r{_yEs[\u007f\rs^:Nu_hXjY4"));
        }
        spreen spreen2 = arg0;
        spreen2.cfr_renamed_11548(l + 12L);
        int n = this.cfr_renamed_12117(spreen2);
        arg0.cfr_renamed_11548(l - (long)n);
        sprddn sprddn2 = this;
        sprddn2.cfr_renamed_12114(arg0);
        sprddn2.cfr_renamed_12141(arg0);
    }

    public sprzvm cfr_renamed_12142(String arg0, spreen arg1, boolean arg2, int arg3) throws Exception {
        if ((arg0 = arg0.replace('\\', '/')).indexOf(58) != arg0.lastIndexOf(58)) {
            throw new IllegalArgumentException(sprhyo.cfr_renamed_9("@aLxgtDp$\u001fyt[tDp]p[5GtDp\u00135s|Y\\]pD5GtDp\tvF{]t@{Z5@yEpNtE5J}HgHv]p[f\u0007"));
        }
        if (this.cfr_renamed_91.cfr_renamed_12143(arg0)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprgur.cfr_renamed_9("JLhLwHnHh\rtLwH \rSY\u007f@:")).append(arg0).append(sprhyo.cfr_renamed_9("5Hy[pHqP5Lm@f]f\t|G5]}L5HgJ}@cL")).toString());
        }
        sprzvm sprzvm2 = new sprzvm(this, arg0, arg1, arg2, arg3);
        sprddn sprddn2 = this;
        sprzvm2.cfr_renamed_11756(sprddn2.cfr_renamed_1);
        return sprddn2.cfr_renamed_12144(sprzvm2);
    }

    private /* synthetic */ void cfr_renamed_12145(spreen arg0, long arg1) {
        if (arg0 == null) {
            throw new NullPointerException("stream");
        }
        spreen spreen2 = arg0;
        spreen spreen3 = arg0;
        spreen spreen4 = arg0;
        int n = (int)(spreen4.cfr_renamed_3274() - arg1);
        spreen4.cfr_renamed_4924(sprtzja.cfr_renamed_12109(101010256), 0, 4);
        spreen4.cfr_renamed_11594((byte)0);
        spreen4.cfr_renamed_11594((byte)0);
        spreen4.cfr_renamed_11594((byte)0);
        spreen3.cfr_renamed_11594((byte)0);
        byte[] byArray = sprtzja.cfr_renamed_12107((short)this.cfr_renamed_2.size());
        spreen2.cfr_renamed_4924(byArray, 0, 2);
        spreen3.cfr_renamed_4924(byArray, 0, 2);
        spreen2.cfr_renamed_4924(sprtzja.cfr_renamed_12109(n), 0, 4);
        spreen2.cfr_renamed_4924(sprtzja.cfr_renamed_12109((int)arg1), 0, 4);
        spreen2.cfr_renamed_11594((byte)0);
        spreen2.cfr_renamed_11594((byte)0);
    }

    public sprzvm cfr_renamed_1600(String arg0) {
        Object object = null;
        Object[] objectArray = new sprzvm[1];
        objectArray[0] = object;
        Object[] objectArray2 = objectArray;
        this.cfr_renamed_91.cfr_renamed_12146(arg0, objectArray2);
        object = objectArray2[0];
        return object;
    }

    public void cfr_renamed_11665() {
        this.cfr_renamed_2637();
    }

    public void cfr_renamed_12147(String arg0) {
        int n = this.cfr_renamed_1494(arg0);
        if (n >= 0) {
            this.cfr_renamed_12148(n);
        }
    }

    public sprzvm cfr_renamed_12149(String arg0, byte[] arg1) throws Exception {
        sprpdja sprpdja2 = new sprpdja(arg1);
        return this.cfr_renamed_12142(arg0, sprpdja2, false, 32);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_12150(spreen spreen2) {
        void arg0;
        long l = arg0.cfr_renamed_3274();
        int n = 0;
        int n2 = this.cfr_renamed_2.size();
        int n3 = n;
        while (n3 < n2) {
            sprzvm sprzvm2 = this.cfr_renamed_2.cfr_renamed_12151(n);
            sprzvm2.cfr_renamed_12113((spreen)arg0);
            n3 = ++n;
        }
        this.cfr_renamed_12145((spreen)arg0, l);
    }

    public sprzvm cfr_renamed_576(int arg0) {
        if (arg0 < 0 || arg0 > this.cfr_renamed_2.size()) {
            throw new IllegalArgumentException(sprgur.cfr_renamed_9("JLhLwHnHh\rtLwH \rsC~Hb"));
        }
        return this.cfr_renamed_2.cfr_renamed_12151(arg0);
    }

    public void cfr_renamed_12152(String arg0, spreen arg1, boolean arg2, int arg3) throws Exception {
        sprzvm sprzvm2 = this.cfr_renamed_1600(arg0);
        if (sprzvm2 != null) {
            sprzvm2.cfr_renamed_12111(arg1, arg2);
            return;
        }
        this.cfr_renamed_12142(arg0, arg1, arg2, arg3);
    }

    public static /* synthetic */ spreen cfr_renamed_12153(sprddn arg0, spreen arg1) {
        return arg0.cfr_renamed_11217(arg1);
    }

    public int cfr_renamed_12154(sprruha arg0) {
        int n = -1;
        int n2 = 0;
        int n3 = this.cfr_renamed_2.size();
        int n4 = n2;
        while (n4 < n3) {
            String string = this.cfr_renamed_2.cfr_renamed_12151(n2).cfr_renamed_12124();
            if (arg0.cfr_renamed_11883(string)) {
                n = n2;
                return n;
            }
            n4 = ++n2;
        }
        return n;
    }

    public void cfr_renamed_12155(String arg0, spreen arg1, boolean arg2) {
        sprzvm sprzvm2 = this.cfr_renamed_1600(arg0);
        if (sprzvm2 == null) {
            throw new IllegalArgumentException(sprhyo.cfr_renamed_9("jtG{Fa\ts@{M5ZeLv@s@pM5@aLx\u0007\u0018#EHgHxLaLg\t{HxL/\t|]pD[HxL"));
        }
        sprzvm2.cfr_renamed_12111(arg1, arg2);
    }

    public sprddn cfr_renamed_12099() {
        sprddn sprddn2;
        sprddn sprddn3 = sprddn2 = (sprddn)this.cfr_renamed_12100();
        sprddn3.cfr_renamed_2 = new sprvrx();
        sprddn3.cfr_renamed_91 = new sprtyo();
        int n = 0;
        int n2 = this.cfr_renamed_2.size();
        int n3 = n;
        while (n3 < n2) {
            sprzvm sprzvm2 = this.cfr_renamed_2.cfr_renamed_12151(n);
            sprzvm2 = sprzvm2.cfr_renamed_12099();
            sprddn2.cfr_renamed_12144(sprzvm2);
            n3 = ++n;
        }
        return sprddn2;
    }

    public boolean cfr_renamed_12156() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_12157(boolean arg0) {
        this.cfr_renamed_112 = arg0;
    }

    public void cfr_renamed_12158(sprruha arg0) {
        int n = 0;
        int n2 = this.cfr_renamed_2.size();
        int n3 = n;
        while (n3 < n2) {
            String string = this.cfr_renamed_2.cfr_renamed_12151(n).cfr_renamed_12124();
            if (arg0.cfr_renamed_11883(string)) {
                sprddn sprddn2 = this;
                sprddn2.cfr_renamed_2.cfr_renamed_12148(n);
                --n;
                sprddn2.cfr_renamed_91.cfr_renamed_12159(string);
                --n2;
            }
            n3 = ++n;
        }
    }

    public sprddn() {
        sprddn sprddn2 = this;
        sprddn sprddn3 = this;
        this.cfr_renamed_3 = new byte[4];
        sprddn sprddn4 = this;
        sprddn3.cfr_renamed_2 = new sprvrx();
        sprddn3.cfr_renamed_91 = new sprtyo();
        sprddn3.cfr_renamed_112 = true;
        sprddn2.cfr_renamed_1 = 9;
        sprddn2.cfr_renamed_4 = false;
        sprddn2.cfr_renamed_119 = new sprwym(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_12141(spreen arg0) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        if (!arg0.cfr_renamed_11557() || !arg0.cfr_renamed_11552()) {
            throw new IllegalArgumentException(sprgur.cfr_renamed_9("z\u007f\rtH\u007fI:^\u007fHqLxA\u007f\r{C~\rhH{I{OvH:^n_\u007fLw\rnB:]{_iH:DnHw^4 \u0010}{_{@\u007fY\u007f_:C{@\u007f\u0017:^n_\u007fLw"));
        }
        int n = 0;
        int n2 = this.cfr_renamed_2.size();
        int n3 = n;
        while (n3 < n2) {
            sprzvm sprzvm2 = this.cfr_renamed_2.cfr_renamed_12151(n);
            try {
                sprzvm2.cfr_renamed_12133(arg0, this.cfr_renamed_112);
                this.cfr_renamed_91.cfr_renamed_12160(sprzvm2.cfr_renamed_12124(), sprzvm2);
            }
            catch (sprovm sprovm2) {
                // empty catch block
            }
            n3 = ++n;
        }
        return;
    }

    @sprtea
    public static long cfr_renamed_12161(spreen arg0) {
        byte[] byArray = new byte[4];
        if (arg0.cfr_renamed_11556(byArray, 0, 4) != 4) {
            throw new sprovm(sprhyo.cfr_renamed_9("|{HwEp\taF5[pHq\tcHy\\p\tt]5]}L5ZeLv@s@pM5YzZ|]|F{\t8\tpGq\tzO5Za[pHx\tbHf\tgLtJ}Lq\u0007"));
        }
        return sprtzja.cfr_renamed_12136(byArray, 0);
    }

    public sprmba cfr_renamed_12162() {
        return this.cfr_renamed_2.cfr_renamed_12162();
    }

    public void cfr_renamed_12163(sprpv arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public int cfr_renamed_12164() {
        return this.cfr_renamed_1;
    }

    public sprpv cfr_renamed_12165() {
        return this.cfr_renamed_0;
    }

    public void cfr_renamed_2637() {
        if (this.cfr_renamed_2 != null) {
            int n = 0;
            int n2 = this.cfr_renamed_2.size();
            int n3 = n;
            while (n3 < n2) {
                this.cfr_renamed_2.cfr_renamed_12151(n++).cfr_renamed_2637();
                n3 = n;
            }
            this.cfr_renamed_2.clear();
            this.cfr_renamed_2 = null;
        }
        if (this.cfr_renamed_91 != null) {
            this.cfr_renamed_91.clear();
            this.cfr_renamed_91 = null;
        }
    }

    public void cfr_renamed_12148(int arg0) {
        if (arg0 < 0 || arg0 >= this.cfr_renamed_2.size()) {
            throw new IllegalArgumentException(sprgur.cfr_renamed_9("JLhLwHnHh\rtLwH \rsC~Hb"));
        }
        sprddn sprddn2 = this;
        sprzvm sprzvm2 = sprddn2.cfr_renamed_576(arg0);
        sprddn2.cfr_renamed_2.cfr_renamed_12148(arg0);
        sprddn2.cfr_renamed_91.cfr_renamed_12159(sprzvm2.cfr_renamed_12124());
    }

    public sprzvm cfr_renamed_12144(sprzvm arg0) {
        if (arg0 == null) {
            throw new NullPointerException("item");
        }
        this.cfr_renamed_2.add(arg0);
        this.cfr_renamed_91.cfr_renamed_12160(arg0.cfr_renamed_12124(), arg0);
        return arg0;
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

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_12166(String arg0, boolean arg1) {
        block5: {
            Object object;
            String string;
            if (arg0 == null || arg0.length() == 0) {
                throw new IllegalArgumentException(sprhyo.cfr_renamed_9("EHgHxLaLg\t{HxL/\tz\\aY`]S@yL[HxL"));
            }
            if (arg1 && !sprsyia.cfr_renamed_11642(string = sprazia.cfr_renamed_11703((String)(object = sprazia.cfr_renamed_11980(arg0))))) {
                sprsyia.cfr_renamed_11888(string);
            }
            object = new sprgfja(arg0, 2, 2);
            try {
                this.cfr_renamed_12167((spreen)object, false);
                if (object == null) break block5;
            }
            catch (Throwable throwable) {
                if (object != null) {
                    ((spreen)object).cfr_renamed_2637();
                }
                throw throwable;
            }
            ((spreen)object).cfr_renamed_2637();
            return;
        }
    }

    public int cfr_renamed_1494(String arg0) {
        Object object = null;
        int n = -1;
        Object[] objectArray = new sprzvm[1];
        objectArray[0] = object;
        Object[] objectArray2 = objectArray;
        boolean bl = this.cfr_renamed_91.cfr_renamed_12146(arg0, objectArray2);
        object = objectArray2[0];
        if (bl) {
            int n2 = 0;
            int n3 = this.cfr_renamed_2.size();
            int n4 = n2;
            while (n4 < n3) {
                if (this.cfr_renamed_2.cfr_renamed_12151(n2) == object) {
                    n = n2;
                    return n;
                }
                n4 = ++n2;
            }
        }
        return n;
    }

    public static int cfr_renamed_12168(spreen arg0) {
        byte[] byArray = new byte[2];
        if (arg0.cfr_renamed_11556(byArray, 0, 2) != 2) {
            throw new sprovm(sprgur.cfr_renamed_9("OC{OvH:Yu\rhH{I:[{AoH:Ln\rnE\u007f\ri]\u007fNsKsH~\rjBiDnDuC:\u0000:HtI:B|\riYhH{@:Z{^:_\u007fLyE\u007fI4"));
        }
        return sprtzja.cfr_renamed_12169(byArray, 0);
    }

    private /* synthetic */ spreen cfr_renamed_11217(spreen arg0) {
        if (this.cfr_renamed_4) {
            return new sprbzm(9, arg0);
        }
        return new sprpxca(arg0, 0, true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_12170(String arg0) {
        block4: {
            if (arg0 == null || arg0.length() == 0) {
                throw new IllegalArgumentException(sprhyo.cfr_renamed_9("yt[tDp]p[5GtDp\u00135@{Y`]S@yL[HxL"));
            }
            sprgfja sprgfja2 = new sprgfja(arg0, 3, 1);
            try {
                this.cfr_renamed_12140(sprgfja2, false);
                if (sprgfja2 == null) break block4;
            }
            catch (Throwable throwable) {
                if (sprgfja2 != null) {
                    sprgfja2.cfr_renamed_2637();
                }
                throw throwable;
            }
            sprgfja2.cfr_renamed_2637();
            return;
        }
    }

    public void cfr_renamed_11727(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            throw new IllegalArgumentException(sprgur.cfr_renamed_9("}{_{@\u007fY\u007f_:C{@\u007f\u0017:BoYjXnksA\u007fc{@\u007f"));
        }
        this.cfr_renamed_12166(arg0, false);
    }

    public void cfr_renamed_12167(spreen arg0, boolean arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        spreen spreen2 = null;
        if (!arg0.cfr_renamed_11557()) {
            spreen2 = arg0;
            arg0 = new sprpdja();
        }
        int n = 0;
        int n2 = this.cfr_renamed_2.size();
        int n3 = n;
        while (n3 < n2) {
            sprzvm sprzvm2 = this.cfr_renamed_2.cfr_renamed_12151(n);
            sprzvm2.cfr_renamed_11814(arg0);
            n3 = ++n;
        }
        this.cfr_renamed_12150(arg0);
        if (spreen2 != null) {
            spreen spreen3 = arg0;
            spreen3.cfr_renamed_11548(0L);
            ((sprpdja)spreen3).cfr_renamed_12171(spreen2);
            arg0.cfr_renamed_2637();
            arg0 = spreen2;
        }
        if (arg1) {
            arg0.cfr_renamed_2637();
        }
    }

    public sprzvm cfr_renamed_11745(String arg0) throws Exception {
        sprgfja sprgfja2 = new sprgfja(arg0, 3, 1);
        sprzdja sprzdja2 = new sprzdja(arg0);
        int n = 32;
        if (this.cfr_renamed_0 != null) {
            arg0 = this.cfr_renamed_0.cfr_renamed_12172(arg0);
        }
        return this.cfr_renamed_12142(arg0, sprgfja2, true, n);
    }

    public void cfr_renamed_12173() {
        if (this.cfr_renamed_3 == null) {
            this.cfr_renamed_3 = new byte[4];
        }
    }

    public void cfr_renamed_12174(String arg0, byte[] arg1) {
        sprzvm sprzvm2 = this.cfr_renamed_1600(arg0);
        if (sprzvm2 == null) {
            throw new IllegalArgumentException(sprhyo.cfr_renamed_9("jtG{Fa\ts@{M5ZeLv@s@pM5@aLx\u0007\u0018#EHgHxLaLg\t{HxL/\t|]pD[HxL"));
        }
        sprpdja sprpdja2 = new sprpdja(arg1);
        sprzvm2.cfr_renamed_12111(sprpdja2, true);
    }

    public void cfr_renamed_12175(boolean arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public sprzvm cfr_renamed_11851(String arg0) throws Exception {
        if (arg0 == null || arg0.length() == 0) {
            throw new IllegalArgumentException(sprgur.cfr_renamed_9("JLhLwHnHh\rtLwH \r~DhHyYu_cc{@\u007f"));
        }
        sprigja sprigja2 = new sprigja(arg0);
        int n = 32;
        if (this.cfr_renamed_0 != null) {
            arg0 = this.cfr_renamed_0.cfr_renamed_12172(arg0);
        }
        return this.cfr_renamed_12142(arg0, null, false, n);
    }

    public int cfr_renamed_12117(spreen spreen2) {
        sprddn sprddn2 = this;
        sprddn2.cfr_renamed_12173();
        if (spreen2.cfr_renamed_11556(sprddn2.cfr_renamed_3, 0, 4) != 4) {
            throw new sprovm(sprhyo.cfr_renamed_9("|{HwEp\taF5[pHq\tcHy\\p\tt]5]}L5ZeLv@s@pM5YzZ|]|F{\t8\tpGq\tzO5Za[pHx\tbHf\tgLtJ}Lq\u0007"));
        }
        return sprtzja.cfr_renamed_11604(this.cfr_renamed_3, 0);
    }

    public short cfr_renamed_12116(spreen spreen2) {
        sprddn sprddn2 = this;
        sprddn2.cfr_renamed_12173();
        if (spreen2.cfr_renamed_11556(sprddn2.cfr_renamed_3, 0, 2) != 2) {
            throw new sprovm(sprgur.cfr_renamed_9("OC{OvH:Yu\rhH{I:[{AoH:Ln\rnE\u007f\ri]\u007fNsKsH~\rjBiDnDuC:\u0000:HtI:B|\riYhH{@:Z{^:_\u007fLyE\u007fI4"));
        }
        return (short)sprtzja.cfr_renamed_12176(this.cfr_renamed_3, 0);
    }
}

