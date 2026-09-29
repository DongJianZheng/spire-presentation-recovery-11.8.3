/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfar;
import com.spire.presentation.packages.sprfdn;
import com.spire.presentation.packages.sprgan;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprgzm;
import com.spire.presentation.packages.spricn;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprief;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqbn;
import com.spire.presentation.packages.sprqp;
import com.spire.presentation.packages.sprqym;
import com.spire.presentation.packages.sprrgq;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprse;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

public abstract class sprszm
extends sprxgf
implements sprse<sprco> {
    public static final sprqbn cfr_renamed_3 = new spricn(sprszm.class, 16);
    public sprco[] cfr_renamed_4;

    public sprco[] cfr_renamed_4529() {
        return sprrvm.cfr_renamed_11488(this.cfr_renamed_4);
    }

    @Override
    public int hashCode() {
        int n = this.cfr_renamed_4.length;
        int n2 = n + 1;
        while (--n >= 0) {
            n2 *= 257;
            n2 ^= this.cfr_renamed_4[n].cfr_renamed_119().hashCode();
        }
        return n2;
    }

    public sprszm() {
        this.cfr_renamed_4 = sprrvm.cfr_renamed_2;
    }

    public String toString() {
        StringBuffer stringBuffer;
        int n = this.cfr_renamed_84();
        if (0 == n) {
            return "[]";
        }
        StringBuffer stringBuffer2 = stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int n2 = 0;
        while (true) {
            stringBuffer2.append(this.cfr_renamed_4[n2++]);
            if (n2 >= n) break;
            StringBuffer stringBuffer3 = stringBuffer;
            stringBuffer2 = stringBuffer3;
            stringBuffer3.append(sprfar.cfr_renamed_9("\u0002G"));
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    public abstract spridn cfr_renamed_11221();

    public sproug[] cfr_renamed_11289() {
        int n;
        int n2 = this.cfr_renamed_84();
        sproug[] sprougArray = new sproug[n2];
        int n3 = n = 0;
        while (n3 < n2) {
            int n4 = n++;
            sprougArray[n4] = sproug.cfr_renamed_23(this.cfr_renamed_4[n4]);
            n3 = n;
        }
        return sprougArray;
    }

    public static sprszm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return (sprszm)cfr_renamed_3.cfr_renamed_11433(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprszm(sprco sprco2) {
        void arg0;
        if (null == arg0) {
            throw new NullPointerException(sprrgq.cfr_renamed_9("\u001c,W,V,U=\u001ciX(U'T=\u001b+^iU<W%"));
        }
        sprco[] sprcoArray = new sprco[1];
        sprcoArray[0] = arg0;
        this.cfr_renamed_4 = sprcoArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprszm(sprco[] sprcoArray) {
        void arg0;
        if (sproze.cfr_renamed_5272(sprcoArray)) {
            throw new NullPointerException(sprfar.cfr_renamed_9("\t\u0002B\u0002C\u0002@\u0013]@\u000e\u0004O\t@\bZGL\u0002\u000e\t[\u000bBK\u000e\b\\GM\b@\u0013O\u000e@G@\u0012B\u000b"));
        }
        this.cfr_renamed_4 = sprrvm.cfr_renamed_11488((sprco[])arg0);
    }

    public abstract sprgzm cfr_renamed_11215();

    public Enumeration cfr_renamed_329() {
        return new sprgan(this);
    }

    public sprco cfr_renamed_85(int arg0) {
        return this.cfr_renamed_4[arg0];
    }

    public sprqp cfr_renamed_4828() {
        int n = this.cfr_renamed_84();
        return new sprqym(this, n);
    }

    @Override
    public sprxgf cfr_renamed_4612() {
        return new sprfdn(this.cfr_renamed_4, false);
    }

    @Override
    public sprxgf cfr_renamed_4615() {
        return new sprcen(this.cfr_renamed_4, false);
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_4.length;
    }

    @Override
    public boolean cfr_renamed_11277() {
        return true;
    }

    public sprco[] cfr_renamed_11216() {
        return this.cfr_renamed_4;
    }

    public abstract sproug cfr_renamed_11220();

    /*
     * WARNING - void declaration
     */
    public sprszm(sprrvm sprrvm2) {
        void arg0;
        if (null == arg0) {
            throw new NullPointerException(sprrgq.cfr_renamed_9("\u001c,W,V,U=m,X=T;\u001ciX(U'T=\u001b+^iU<W%"));
        }
        this.cfr_renamed_4 = arg0.cfr_renamed_11217();
    }

    /*
     * WARNING - void declaration
     */
    public sprszm(sprco[] sprcoArray, boolean bl) {
        void arg0;
        this.cfr_renamed_4 = bl ? sprrvm.cfr_renamed_11488((sprco[])arg0) : arg0;
    }

    public static sprszm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprszm) {
            return (sprszm)arg0;
        }
        if (arg0 instanceof sprco) {
            sprxgf sprxgf2 = ((sprco)arg0).cfr_renamed_119();
            if (sprxgf2 instanceof sprszm) {
                return (sprszm)sprxgf2;
            }
        } else if (arg0 instanceof byte[]) {
            try {
                return (sprszm)cfr_renamed_3.cfr_renamed_184((byte[])arg0);
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprfar.cfr_renamed_9("H\u0006G\u000bK\u0003\u000e\u0013AGM\b@\u0014Z\u0015[\u0004ZG]\u0002_\u0012K\tM\u0002\u000e\u0001\\\bCGL\u001eZ\u0002u:\u0014G")).append(iOException.getMessage()).toString());
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprrgq.cfr_renamed_9("<U\"U&L'\u001b&Y#^*OiR'\u001b.^=r'H=Z'X,\u0001i")).append(arg0.getClass().getName()).toString());
    }

    public sprgbf[] cfr_renamed_11291() {
        int n;
        int n2 = this.cfr_renamed_84();
        sprgbf[] sprgbfArray = new sprgbf[n2];
        int n3 = n = 0;
        while (n3 < n2) {
            int n4 = n++;
            sprgbfArray[n4] = sprgbf.cfr_renamed_23(this.cfr_renamed_4[n4]);
            n3 = n;
        }
        return sprgbfArray;
    }

    @Override
    public Iterator<sprco> iterator() {
        return new sprief<sprco>(this.cfr_renamed_4);
    }

    public abstract sprgbf cfr_renamed_11222();

    @Override
    public boolean cfr_renamed_11432(sprxgf arg0) {
        int n;
        if (!(arg0 instanceof sprszm)) {
            return false;
        }
        sprszm sprszm2 = (sprszm)arg0;
        int n2 = this.cfr_renamed_84();
        if (sprszm2.cfr_renamed_84() != n2) {
            return false;
        }
        int n3 = n = 0;
        while (n3 < n2) {
            sprxgf sprxgf2;
            sprxgf sprxgf3 = this.cfr_renamed_4[n].cfr_renamed_119();
            if (sprxgf3 != (sprxgf2 = sprszm2.cfr_renamed_4[n].cfr_renamed_119()) && !sprxgf3.cfr_renamed_11432(sprxgf2)) {
                return false;
            }
            n3 = ++n;
        }
        return true;
    }
}

