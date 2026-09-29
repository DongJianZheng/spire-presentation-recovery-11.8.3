/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprizda;
import com.spire.presentation.packages.sprpb;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprunb;
import com.spire.presentation.packages.sprvzy;
import com.spire.presentation.packages.sprwtb;
import java.math.BigInteger;
import java.util.Hashtable;

public abstract class sprrlb {
    public Hashtable cfr_renamed_119;
    public boolean cfr_renamed_91;
    public sprwtb[] cfr_renamed_0;
    public static sprwtb[] cfr_renamed_1 = new sprwtb[0];
    public sprwtb cfr_renamed_2;
    public sprpib cfr_renamed_3;
    public sprwtb cfr_renamed_4;

    public boolean cfr_renamed_1952() {
        return this.cfr_renamed_2 == null || this.cfr_renamed_4 == null || this.cfr_renamed_0.length > 0 && this.cfr_renamed_0[0].cfr_renamed_805();
    }

    public int hashCode() {
        int n;
        sprpib sprpib2 = this.cfr_renamed_1769();
        int n2 = n = null == sprpib2 ? 0 : ~sprpib2.hashCode();
        if (!this.cfr_renamed_1952()) {
            sprrlb sprrlb2 = this.cfr_renamed_1775();
            n ^= sprrlb2.cfr_renamed_1832().hashCode() * 17;
            n ^= sprrlb2.cfr_renamed_1831().hashCode() * 257;
        }
        return n;
    }

    public String toString() {
        if (this.cfr_renamed_1952()) {
            return sprizda.cfr_renamed_9("\tL\u0006");
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        stringBuffer.append(this.cfr_renamed_1953());
        stringBuffer.append(',');
        stringBuffer.append(this.cfr_renamed_1954());
        int n = 0;
        int n2 = n;
        while (n2 < this.cfr_renamed_0.length) {
            stringBuffer.append(',');
            stringBuffer.append(this.cfr_renamed_0[n++]);
            n2 = n;
        }
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer2.append(')');
        return stringBuffer2.toString();
    }

    public final sprwtb cfr_renamed_1954() {
        return this.cfr_renamed_4;
    }

    public sprwtb[] cfr_renamed_1955() {
        int n = this.cfr_renamed_0.length;
        if (n == 0) {
            return this.cfr_renamed_0;
        }
        sprwtb[] sprwtbArray = new sprwtb[n];
        System.arraycopy(this.cfr_renamed_0, 0, sprwtbArray, 0, n);
        return sprwtbArray;
    }

    public abstract boolean cfr_renamed_1956();

    public boolean cfr_renamed_1957() {
        int n = this.cfr_renamed_1958();
        return n == 0 || n == 5 || this.cfr_renamed_1952() || this.cfr_renamed_0[0].cfr_renamed_287();
    }

    public sprrlb cfr_renamed_1959(sprwtb arg0, sprwtb arg1) {
        return this.cfr_renamed_1769().cfr_renamed_1960(this.cfr_renamed_1953().cfr_renamed_1833(arg0), this.cfr_renamed_1954().cfr_renamed_1833(arg1), this.cfr_renamed_91);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static sprwtb[] cfr_renamed_1961(sprpib arg0) {
        int n = null == arg0 ? 0 : arg0.cfr_renamed_1874();
        switch (n) {
            case 0: 
            case 5: {
                return cfr_renamed_1;
            }
        }
        sprwtb sprwtb2 = arg0.cfr_renamed_1652(sprpb.cfr_renamed_0);
        switch (n) {
            case 1: 
            case 2: 
            case 6: {
                sprwtb[] sprwtbArray = new sprwtb[1];
                sprwtbArray[0] = sprwtb2;
                return sprwtbArray;
            }
            case 3: {
                sprwtb[] sprwtbArray = new sprwtb[3];
                sprwtbArray[0] = sprwtb2;
                sprwtbArray[1] = sprwtb2;
                sprwtbArray[2] = sprwtb2;
                return sprwtbArray;
            }
            case 4: {
                sprwtb[] sprwtbArray = new sprwtb[2];
                sprwtbArray[0] = sprwtb2;
                sprwtbArray[1] = arg0.cfr_renamed_1778();
                return sprwtbArray;
            }
        }
        throw new IllegalArgumentException(sprvzy.cfr_renamed_9("[mEmAt@#MlAqJj@bZf\u000epWpZfC"));
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprrlb)) {
            return false;
        }
        return this.cfr_renamed_1962((sprrlb)arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprrlb(sprpib sprpib2, sprwtb sprwtb2, sprwtb sprwtb3, sprwtb[] sprwtbArray) {
        void arg2;
        void arg1;
        void arg0;
        sprrlb sprrlb2 = this;
        sprrlb sprrlb3 = this;
        this.cfr_renamed_119 = null;
        sprrlb3.cfr_renamed_3 = arg0;
        sprrlb3.cfr_renamed_2 = arg1;
        sprrlb2.cfr_renamed_4 = arg2;
        sprrlb2.cfr_renamed_0 = sprwtbArray;
    }

    public void cfr_renamed_1963() {
        if (!this.cfr_renamed_1957()) {
            throw new IllegalStateException(sprizda.cfr_renamed_9("r/k.v`l/v`k.\".m2o!n`d/p-"));
        }
    }

    public sprwtb spr\u3181() {
        return this.cfr_renamed_1775().cfr_renamed_1831();
    }

    public sprwtb cfr_renamed_1964(int arg0) {
        if (arg0 < 0 || arg0 >= this.cfr_renamed_0.length) {
            return null;
        }
        return this.cfr_renamed_0[arg0];
    }

    public sprrlb cfr_renamed_1870(sprwtb arg0) {
        if (this.cfr_renamed_1952()) {
            return this;
        }
        return this.cfr_renamed_1769().cfr_renamed_1965(this.cfr_renamed_1953().cfr_renamed_1833(arg0), this.cfr_renamed_1954(), this.cfr_renamed_1966(), this.cfr_renamed_91);
    }

    public sprrlb cfr_renamed_1830(BigInteger arg0) {
        return this.cfr_renamed_1769().cfr_renamed_1967().cfr_renamed_1968(this, arg0);
    }

    public sprwtb cfr_renamed_1969() {
        sprrlb sprrlb2 = this;
        sprrlb2.cfr_renamed_1963();
        return sprrlb2.cfr_renamed_1832();
    }

    public sprrlb cfr_renamed_1804() {
        sprrlb sprrlb2 = this;
        return sprrlb2.cfr_renamed_1697(sprrlb2);
    }

    public final sprwtb cfr_renamed_1953() {
        return this.cfr_renamed_2;
    }

    public abstract sprrlb cfr_renamed_1774();

    public boolean cfr_renamed_1970() {
        BigInteger bigInteger = this.cfr_renamed_3.cfr_renamed_1843();
        return bigInteger == null || bigInteger.equals(sprpb.cfr_renamed_0) || !sprunb.cfr_renamed_1871(this, bigInteger).cfr_renamed_1952();
    }

    public sprrlb cfr_renamed_1869(sprwtb arg0) {
        if (this.cfr_renamed_1952()) {
            return this;
        }
        return this.cfr_renamed_1769().cfr_renamed_1965(this.cfr_renamed_1953(), this.cfr_renamed_1954().cfr_renamed_1833(arg0), this.cfr_renamed_1966(), this.cfr_renamed_91);
    }

    public int cfr_renamed_1958() {
        if (null == this.cfr_renamed_3) {
            return 0;
        }
        return this.cfr_renamed_3.cfr_renamed_1874();
    }

    public abstract boolean cfr_renamed_1971();

    public byte[] cfr_renamed_91() {
        sprrlb sprrlb2 = this;
        return sprrlb2.cfr_renamed_1972(sprrlb2.cfr_renamed_91);
    }

    public sprrlb cfr_renamed_1697(sprrlb arg0) {
        return this.cfr_renamed_1774().cfr_renamed_1772(arg0);
    }

    public sprrlb cfr_renamed_1771(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException(sprvzy.cfr_renamed_9("$K$\u000e`Om@lZ#Lf\u000emKdOwGuK"));
        }
        sprrlb sprrlb2 = this;
        while (--arg0 >= 0) {
            sprrlb2 = sprrlb2.cfr_renamed_1774();
        }
        return sprrlb2;
    }

    public sprwtb cfr_renamed_1831() {
        return this.cfr_renamed_4;
    }

    public final sprwtb[] cfr_renamed_1966() {
        return this.cfr_renamed_0;
    }

    public sprwtb cfr_renamed_1973() {
        sprrlb sprrlb2 = this;
        sprrlb2.cfr_renamed_1963();
        return sprrlb2.cfr_renamed_1831();
    }

    public boolean cfr_renamed_1974() {
        if (this.cfr_renamed_1952()) {
            return true;
        }
        if (this.cfr_renamed_1769() != null) {
            if (!this.cfr_renamed_1971()) {
                return false;
            }
            if (!this.cfr_renamed_1970()) {
                return false;
            }
        }
        return true;
    }

    public abstract sprrlb cfr_renamed_1772(sprrlb var1);

    public abstract sprrlb cfr_renamed_1975(sprrlb var1);

    public byte[] cfr_renamed_1972(boolean arg0) {
        if (this.cfr_renamed_1952()) {
            return new byte[1];
        }
        sprrlb sprrlb2 = this.cfr_renamed_1775();
        byte[] byArray = sprrlb2.cfr_renamed_1832().cfr_renamed_91();
        if (arg0) {
            byte[] byArray2 = new byte[byArray.length + 1];
            byte[] byArray3 = byArray2;
            byArray2[0] = (byte)(sprrlb2.cfr_renamed_1956() ? 3 : 2);
            System.arraycopy(byArray, 0, byArray3, 1, byArray.length);
            return byArray3;
        }
        byte[] byArray4 = sprrlb2.cfr_renamed_1831().cfr_renamed_91();
        byte[] byArray5 = new byte[byArray.length + byArray4.length + 1];
        byArray5[0] = 4;
        System.arraycopy(byArray, 0, byArray5, 1, byArray.length);
        System.arraycopy(byArray4, 0, byArray5, byArray.length + 1, byArray4.length);
        return byArray5;
    }

    public sprwtb cfr_renamed_1832() {
        return this.cfr_renamed_2;
    }

    public sprpib cfr_renamed_1769() {
        return this.cfr_renamed_3;
    }

    public sprrlb(sprpib arg0, sprwtb arg1, sprwtb arg2) {
        sprpib sprpib2 = arg0;
        this(sprpib2, arg1, arg2, sprrlb.cfr_renamed_1961(sprpib2));
    }

    public abstract sprrlb cfr_renamed_1773();

    public final sprrlb cfr_renamed_1976() {
        return this.cfr_renamed_1775().cfr_renamed_1977();
    }

    public abstract sprrlb cfr_renamed_1977();

    public boolean cfr_renamed_1978() {
        return this.cfr_renamed_91;
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprrlb cfr_renamed_1979(sprwtb arg0) {
        switch (this.cfr_renamed_1958()) {
            case 1: 
            case 6: {
                sprwtb sprwtb2 = arg0;
                return this.cfr_renamed_1959(sprwtb2, sprwtb2);
            }
            case 2: 
            case 3: 
            case 4: {
                sprwtb sprwtb3 = arg0.cfr_renamed_1048();
                sprwtb sprwtb4 = sprwtb3.cfr_renamed_1833(arg0);
                return this.cfr_renamed_1959(sprwtb3, sprwtb4);
            }
        }
        throw new IllegalStateException(sprizda.cfr_renamed_9("l/v`c`r2m*g#v)t%\"#m/p$k.c4g`q9q4g-"));
    }

    public sprwtb cfr_renamed_1980() {
        return this.cfr_renamed_1775().cfr_renamed_1832();
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprrlb cfr_renamed_1775() {
        if (this.cfr_renamed_1952()) {
            return this;
        }
        switch (this.cfr_renamed_1958()) {
            case 0: 
            case 5: {
                return this;
            }
        }
        sprwtb sprwtb2 = this.cfr_renamed_1964(0);
        if (sprwtb2.cfr_renamed_287()) {
            return this;
        }
        return this.cfr_renamed_1979(sprwtb2.cfr_renamed_952());
    }

    public boolean cfr_renamed_1962(sprrlb arg0) {
        sprrlb sprrlb2;
        if (null == arg0) {
            return false;
        }
        sprpib sprpib2 = this.cfr_renamed_1769();
        sprpib sprpib3 = arg0.cfr_renamed_1769();
        boolean bl = null == sprpib2;
        boolean bl2 = null == sprpib3;
        boolean bl3 = this.cfr_renamed_1952();
        boolean bl4 = arg0.cfr_renamed_1952();
        if (bl3 || bl4) {
            return bl3 && bl4 && (bl || bl2 || sprpib2.cfr_renamed_1931(sprpib3));
        }
        sprrlb sprrlb3 = this;
        sprrlb sprrlb4 = arg0;
        if (bl && bl2) {
            sprrlb2 = sprrlb3;
        } else if (bl) {
            sprrlb4 = sprrlb4.cfr_renamed_1775();
            sprrlb2 = sprrlb3;
        } else if (bl2) {
            sprrlb2 = sprrlb3 = sprrlb3.cfr_renamed_1775();
        } else {
            if (!sprpib2.cfr_renamed_1931(sprpib3)) {
                return false;
            }
            sprrlb[] sprrlbArray = new sprrlb[2];
            sprrlbArray[0] = this;
            sprrlbArray[1] = sprpib2.cfr_renamed_1873(sprrlb4);
            sprrlb[] sprrlbArray2 = sprrlbArray;
            sprpib2.cfr_renamed_1805(sprrlbArray2);
            sprrlb3 = sprrlbArray2[0];
            sprrlb4 = sprrlbArray2[1];
            sprrlb2 = sprrlb3;
        }
        return sprrlb2.cfr_renamed_1832().equals(sprrlb4.cfr_renamed_1832()) && sprrlb3.cfr_renamed_1831().equals(sprrlb4.cfr_renamed_1831());
    }
}

