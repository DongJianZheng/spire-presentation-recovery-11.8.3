/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcan;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spredn;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprju;
import com.spire.presentation.packages.sprjyy;
import com.spire.presentation.packages.sprkdn;
import com.spire.presentation.packages.sprlan;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprmxe;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqbn;
import com.spire.presentation.packages.sprqen;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvan;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.io.IOException;

public abstract class sprnvm
extends sprxgf
implements sprju {
    public final int cfr_renamed_112;
    public final int cfr_renamed_119;
    private static final int cfr_renamed_91 = 3;
    public final int cfr_renamed_0;
    private static final int cfr_renamed_1 = 1;
    private static final int cfr_renamed_2 = 2;
    private static final int cfr_renamed_3 = 4;
    public final sprco cfr_renamed_4;

    public static sprnvm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprnvm) {
            return (sprnvm)arg0;
        }
        if (arg0 instanceof sprco) {
            sprxgf sprxgf2 = ((sprco)arg0).cfr_renamed_119();
            if (sprxgf2 instanceof sprnvm) {
                return (sprnvm)sprxgf2;
            }
        } else if (arg0 instanceof byte[]) {
            try {
                return sprnvm.cfr_renamed_11470(sprnvm.cfr_renamed_184((byte[])arg0));
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprjyy.cfr_renamed_9("1(>%2-w=8i4&9:#;\"*#i#(0.2-w&5#2*#i1;8$w+.=2\u0012\nsw")).append(iOException.getMessage()).toString());
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprmxe.cfr_renamed_9("f\u0006x\u0006|\u001f}H|\ny\rp\u001c3\u0001}Ht\rg!}\u001bg\t}\u000bvR3")).append(arg0.getClass().getName()).toString());
    }

    public static sprxgf cfr_renamed_11478(int arg0, int arg1, byte[] arg2) {
        return new spredn(4, arg0, arg1, (sprco)new sprfvg(arg2));
    }

    public abstract sprszm cfr_renamed_11278(sprxgf var1);

    public abstract String cfr_renamed_11282();

    @Override
    public final boolean cfr_renamed_11432(sprxgf arg0) {
        sprxgf sprxgf2;
        if (!(arg0 instanceof sprnvm)) {
            return false;
        }
        sprnvm sprnvm2 = (sprnvm)arg0;
        if (this.cfr_renamed_0 != sprnvm2.cfr_renamed_0 || this.cfr_renamed_119 != sprnvm2.cfr_renamed_119) {
            return false;
        }
        if (this.cfr_renamed_112 != sprnvm2.cfr_renamed_112 && this.cfr_renamed_4567() != sprnvm2.cfr_renamed_4567()) {
            return false;
        }
        sprxgf sprxgf3 = this.cfr_renamed_4.cfr_renamed_119();
        if (sprxgf3 == (sprxgf2 = sprnvm2.cfr_renamed_4.cfr_renamed_119())) {
            return true;
        }
        if (!this.cfr_renamed_4567()) {
            try {
                byte[] byArray = this.cfr_renamed_91();
                byte[] byArray2 = sprnvm2.cfr_renamed_91();
                return sproze.cfr_renamed_92(byArray, byArray2);
            }
            catch (IOException iOException) {
                return false;
            }
        }
        return sprxgf3.cfr_renamed_11432(sprxgf2);
    }

    public abstract sprnvm cfr_renamed_11279(int var1, int var2);

    @Override
    public sprju cfr_renamed_11273(int arg0, int arg1) throws IOException {
        return this.cfr_renamed_11460(arg0, arg1);
    }

    public static sprxgf cfr_renamed_11479(int arg0, int arg1, sprrvm arg2) {
        boolean bl;
        boolean bl2 = bl = arg2.cfr_renamed_84() == 1;
        if (bl) {
            return new sprkdn(3, arg0, arg1, arg2.cfr_renamed_576(0));
        }
        return new sprkdn(4, arg0, arg1, (sprco)sprqen.cfr_renamed_11287(arg2));
    }

    @Override
    public sprju cfr_renamed_11271() throws IOException {
        return this.cfr_renamed_11204();
    }

    public sprnvm(boolean arg0, int arg1, sprco arg2) {
        this(arg0, 128, arg1, arg2);
    }

    public static sprxgf cfr_renamed_11480(int arg0, int arg1, sprrvm arg2) {
        boolean bl;
        boolean bl2 = bl = arg2.cfr_renamed_84() == 1;
        if (bl) {
            return new spredn(3, arg0, arg1, arg2.cfr_renamed_576(0));
        }
        return new spredn(4, arg0, arg1, (sprco)sprcan.cfr_renamed_11287(arg2));
    }

    /*
     * WARNING - void declaration
     */
    public sprnvm(int n, int n2, int n3, sprco sprco2) {
        void arg2;
        void arg0;
        void arg1;
        void arg3;
        if (null == arg3) {
            throw new NullPointerException(sprjyy.cfr_renamed_9("n8+=nw*6'9&#i5,w'\"%;"));
        }
        if (arg1 == false || (arg1 & 0xC0) != arg1) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprmxe.cfr_renamed_9("z\u0006e\t\u007f\u0001wHg\ttHp\u0004r\u001b`R3")).append((int)arg1).toString());
        }
        this.cfr_renamed_112 = arg3 instanceof sprlm ? 1 : arg0;
        sprnvm sprnvm2 = this;
        this.cfr_renamed_119 = arg1;
        sprnvm2.cfr_renamed_0 = arg2;
        sprnvm2.cfr_renamed_4 = arg3;
    }

    public sprxgf cfr_renamed_10766(boolean arg0, int arg1) {
        sprqbn sprqbn2 = sprlan.cfr_renamed_576(arg1);
        if (null == sprqbn2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprjyy.cfr_renamed_9("<9:\"9'&%=2-w\u001c\u0019\u0000\u0001\f\u0005\u001a\u0016\u0005w=6.w'\"$5,%sw")).append(arg1).toString());
        }
        return this.cfr_renamed_11471(arg0, sprqbn2);
    }

    @Override
    public sprxgf cfr_renamed_4615() {
        sprnvm sprnvm2 = this;
        sprnvm sprnvm3 = this;
        return new sprycn(sprnvm2.cfr_renamed_112, sprnvm2.cfr_renamed_119, sprnvm3.cfr_renamed_0, sprnvm3.cfr_renamed_4);
    }

    public sprnvm cfr_renamed_11204() {
        if (!this.cfr_renamed_4567()) {
            throw new IllegalStateException(sprmxe.cfr_renamed_9("\u0007q\u0002v\u000bgHz\u0005c\u0004z\u000bz\u001c3E3\rk\u0018\u007f\u0001p\u0001gHv\u0010c\rp\u001cv\f="));
        }
        return sprnvm.cfr_renamed_11470(this.cfr_renamed_4.cfr_renamed_119());
    }

    public static sprnvm cfr_renamed_9663(Object arg0, int arg1, int arg2) {
        if (arg0 == null) {
            throw new NullPointerException(sprjyy.cfr_renamed_9("n8+=nw*6'9&#i5,w'\"%;"));
        }
        sprnvm sprnvm2 = sprnvm.cfr_renamed_23(arg0);
        if (!sprnvm2.cfr_renamed_11239(arg1, arg2)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprmxe.cfr_renamed_9("f\u0006v\u0010c\rp\u001cv\f3\u001cr\u000f3\u0001}Ht\rg!}\u001bg\t}\u000bvR3")).append(sprvan.cfr_renamed_11184(sprnvm2)).toString());
        }
        return sprnvm2;
    }

    public static sprnvm cfr_renamed_6501(Object arg0, int arg1) {
        if (arg0 == null) {
            throw new NullPointerException(sprjyy.cfr_renamed_9("n8+=nw*6'9&#i5,w'\"%;"));
        }
        sprnvm sprnvm2 = sprnvm.cfr_renamed_23(arg0);
        if (arg1 != sprnvm2.cfr_renamed_8120()) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprmxe.cfr_renamed_9("f\u0006v\u0010c\rp\u001cv\f3\u001cr\u000f3\u0001}Ht\rg!}\u001bg\t}\u000bvR3")).append(sprvan.cfr_renamed_11184(sprnvm2)).toString());
        }
        return sprnvm2;
    }

    public sprqqe cfr_renamed_8225() {
        if (!this.cfr_renamed_4567()) {
            throw new IllegalStateException(sprjyy.cfr_renamed_9("&5#2*#i>$'%>*>=wdw,/9; 4 #i21',4=2-y"));
        }
        if (this.cfr_renamed_4 instanceof sprqqe) {
            return (sprqqe)this.cfr_renamed_4;
        }
        return this.cfr_renamed_4.cfr_renamed_119();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean cfr_renamed_11481() {
        switch (this.cfr_renamed_112) {
            case 3: 
            case 4: {
                return true;
            }
        }
        return false;
    }

    @Override
    public sprco cfr_renamed_11270() throws IOException {
        return this.cfr_renamed_8225();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public sprco cfr_renamed_11266(boolean arg0, int arg1) throws IOException {
        sprxgf sprxgf2 = this.cfr_renamed_10766(arg0, arg1);
        switch (arg1) {
            case 3: {
                return ((sprgbf)sprxgf2).cfr_renamed_4828();
            }
            case 4: {
                return ((sproug)sprxgf2).cfr_renamed_4828();
            }
            case 16: {
                return ((sprszm)sprxgf2).cfr_renamed_4828();
            }
            case 17: {
                return ((spridn)sprxgf2).cfr_renamed_4828();
            }
        }
        return sprxgf2;
    }

    @Override
    public boolean cfr_renamed_11239(int arg0, int arg1) {
        return this.cfr_renamed_119 == arg0 && this.cfr_renamed_0 == arg1;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean cfr_renamed_4567() {
        switch (this.cfr_renamed_112) {
            case 1: 
            case 3: {
                return true;
            }
        }
        return false;
    }

    @Override
    public int cfr_renamed_312() {
        return this.cfr_renamed_0;
    }

    private static /* synthetic */ sprnvm cfr_renamed_11470(sprxgf arg0) {
        if (arg0 instanceof sprnvm) {
            return (sprnvm)arg0;
        }
        throw new IllegalStateException(new StringBuilder().insert(0, sprmxe.cfr_renamed_9("f\u0006v\u0010c\rp\u001cv\f3\u0007q\u0002v\u000bgR3")).append(arg0.getClass().getName()).toString());
    }

    public sprnvm(boolean arg0, int arg1, int arg2, sprco arg3) {
        int n;
        int n2;
        if (arg0) {
            n2 = 1;
            n = arg1;
        } else {
            n2 = 2;
            n = arg1;
        }
        this(n2, n, arg2, arg3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprnvm cfr_renamed_11460(int arg0, int arg1) {
        if (arg0 == 0 || (arg0 & 0xC0) != arg0) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprjyy.cfr_renamed_9(" 9?6%>-w+6:2i#(0i4%6:$sw")).append(arg0).toString());
        }
        switch (this.cfr_renamed_112) {
            case 1: {
                throw new IllegalStateException(sprmxe.cfr_renamed_9("\u0007q\u0002v\u000bgHv\u0010c\u0004z\u000bz\u001c3E3\u0001~\u0018\u007f\u0001p\u0001gHv\u0010c\rp\u001cv\f="));
            }
            case 2: {
                return sprvan.cfr_renamed_11440(sprnvm.cfr_renamed_11470(this.cfr_renamed_4.cfr_renamed_119()), arg0, arg1);
            }
        }
        return this.cfr_renamed_11279(arg0, arg1);
    }

    public static sprnvm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        if (128 != arg0.cfr_renamed_8120()) {
            throw new IllegalStateException(sprjyy.cfr_renamed_9("=? $i:,#!8-w&9%.i!(; 3i1&%i\u0014\u0006\u0019\u001d\u0012\u0011\u0003\u0016\u0004\u0019\u0012\n\u001e\u000f\u001e\nw=6.$"));
        }
        if (arg1) {
            return arg0.cfr_renamed_11204();
        }
        throw new IllegalArgumentException(sprmxe.cfr_renamed_9("\u001c{\u0001`H~\rg\u0000|\f3\u0006|\u001c3\u001er\u0004z\f3\u000e|\u001a3\u0001~\u0018\u007f\u0001p\u0001g\u0004jHg\tt\u000fv\f3\u001cr\u000ft\rwH|\ny\rp\u001c`"));
    }

    @Override
    public boolean cfr_renamed_10764(int arg0) {
        return this.cfr_renamed_119 == 128 && this.cfr_renamed_0 == arg0;
    }

    @Override
    public int cfr_renamed_8120() {
        return this.cfr_renamed_119;
    }

    @Override
    public sprxgf cfr_renamed_4612() {
        sprnvm sprnvm2 = this;
        sprnvm sprnvm3 = this;
        return new spredn(sprnvm2.cfr_renamed_112, sprnvm2.cfr_renamed_119, sprnvm3.cfr_renamed_0, sprnvm3.cfr_renamed_4);
    }

    @Override
    public int hashCode() {
        return this.cfr_renamed_119 * 7919 ^ this.cfr_renamed_0 ^ (this.cfr_renamed_4567() ? 15 : 240) ^ this.cfr_renamed_4.cfr_renamed_119().hashCode();
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprxgf cfr_renamed_11471(boolean arg0, sprqbn arg1) {
        if (arg0) {
            if (!this.cfr_renamed_4567()) {
                throw new IllegalStateException(sprjyy.cfr_renamed_9("&5#2*#i21'%>*>=wdw :9; 4 #i21',4=2-y"));
            }
            return arg1.cfr_renamed_11470(this.cfr_renamed_4.cfr_renamed_119());
        }
        if (1 == this.cfr_renamed_112) {
            throw new IllegalStateException(sprmxe.cfr_renamed_9("\u0007q\u0002v\u000bgHv\u0010c\u0004z\u000bz\u001c3E3\u0001~\u0018\u007f\u0001p\u0001gHv\u0010c\rp\u001cv\f="));
        }
        sprnvm sprnvm2 = this;
        sprxgf sprxgf2 = sprnvm2.cfr_renamed_4.cfr_renamed_119();
        switch (sprnvm2.cfr_renamed_112) {
            case 3: {
                return arg1.cfr_renamed_11473(this.cfr_renamed_11278(sprxgf2));
            }
            case 4: {
                if (sprxgf2 instanceof sprszm) {
                    return arg1.cfr_renamed_11473((sprszm)sprxgf2);
                }
                return arg1.cfr_renamed_11474((sprfvg)sprxgf2);
            }
        }
        return arg1.cfr_renamed_11470(sprxgf2);
    }

    public String toString() {
        sprnvm sprnvm2 = this;
        return new StringBuilder().insert(0, sprvan.cfr_renamed_11434(sprnvm2.cfr_renamed_119, sprnvm2.cfr_renamed_0)).append(this.cfr_renamed_4).toString();
    }

    public sprqqe cfr_renamed_8122() {
        if (this.cfr_renamed_4 instanceof sprqqe) {
            return (sprqqe)this.cfr_renamed_4;
        }
        return this.cfr_renamed_4.cfr_renamed_119();
    }

    @Override
    public final sprxgf cfr_renamed_2414() {
        return this;
    }
}

