/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprnkp;
import com.spire.presentation.packages.sprsgf;
import java.math.BigDecimal;

public class spraxe {
    public BigDecimal[] cfr_renamed_2;
    private static final BigDecimal cfr_renamed_3;
    private static final BigDecimal cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spraxe cfr_renamed_5443(sprsgf sprsgf2) {
        void arg0;
        return this.cfr_renamed_5463(new spraxe((sprsgf)arg0));
    }

    /*
     * WARNING - void declaration
     */
    public spraxe(int n) {
        void arg0;
        int n2;
        this.cfr_renamed_2 = new BigDecimal[n];
        int n3 = n2 = 0;
        while (n3 < arg0) {
            this.cfr_renamed_2[n2++] = cfr_renamed_4;
            n3 = n2;
        }
    }

    private /* synthetic */ BigDecimal[] cfr_renamed_799(BigDecimal[] arg0, int arg1) {
        BigDecimal[] bigDecimalArray = new BigDecimal[arg1];
        System.arraycopy(arg0, 0, bigDecimalArray, 0, arg0.length < arg1 ? arg0.length : arg1);
        return bigDecimalArray;
    }

    static {
        cfr_renamed_4 = new BigDecimal("0");
        cfr_renamed_3 = new BigDecimal("0.5");
    }

    public Object clone() {
        return new spraxe((BigDecimal[])this.cfr_renamed_2.clone());
    }

    public spraxe(BigDecimal[] bigDecimalArray) {
        this.cfr_renamed_2 = bigDecimalArray;
    }

    public void cfr_renamed_803() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2.length) {
            spraxe spraxe2 = this;
            int n3 = n++;
            spraxe2.cfr_renamed_2[n3] = spraxe2.cfr_renamed_2[n3].multiply(cfr_renamed_3);
            n2 = n;
        }
    }

    private /* synthetic */ BigDecimal[] cfr_renamed_796(BigDecimal[] arg0, int arg1, int arg2) {
        int n = arg2 - arg1;
        BigDecimal[] bigDecimalArray = new BigDecimal[arg2 - arg1];
        System.arraycopy(arg0, arg1, bigDecimalArray, 0, arg0.length - arg1 < n ? arg0.length - arg1 : n);
        return bigDecimalArray;
    }

    public spraxe cfr_renamed_5463(spraxe arg0) {
        int n = this.cfr_renamed_2.length;
        if (arg0.cfr_renamed_2.length != n) {
            throw new IllegalArgumentException(sprnkp.cfr_renamed_9("*\u0019\t\u000e\u0001\u001eD\u0003\u0002L\u0007\u0003\u0001\n\u0002\u0005\u0007\u0005\u0001\u0002\u0010\u001fD\u0001\u0011\u001f\u0010L\u0006\tD\u0018\f\tD\u001f\u0005\u0001\u0001"));
        }
        spraxe spraxe2 = this.cfr_renamed_5464(arg0);
        if (spraxe2.cfr_renamed_2.length > n) {
            int n2;
            int n3 = n2 = n;
            while (n3 < spraxe2.cfr_renamed_2.length) {
                int n4 = n2 - n;
                BigDecimal bigDecimal = spraxe2.cfr_renamed_2[n2 - n].add(spraxe2.cfr_renamed_2[n2]);
                spraxe2.cfr_renamed_2[n4] = bigDecimal;
                n3 = ++n2;
            }
            spraxe2.cfr_renamed_2 = this.cfr_renamed_799(spraxe2.cfr_renamed_2, n);
        }
        return spraxe2;
    }

    public BigDecimal[] cfr_renamed_790() {
        BigDecimal[] bigDecimalArray = new BigDecimal[this.cfr_renamed_2.length];
        System.arraycopy(this.cfr_renamed_2, 0, bigDecimalArray, 0, this.cfr_renamed_2.length);
        return bigDecimalArray;
    }

    public void cfr_renamed_5465(spraxe arg0) {
        int n;
        if (arg0.cfr_renamed_2.length > this.cfr_renamed_2.length) {
            int n2;
            n = this.cfr_renamed_2.length;
            spraxe spraxe2 = this;
            spraxe2.cfr_renamed_2 = spraxe2.cfr_renamed_799(spraxe2.cfr_renamed_2, arg0.cfr_renamed_2.length);
            int n3 = n2 = n;
            while (n3 < this.cfr_renamed_2.length) {
                this.cfr_renamed_2[n2++] = cfr_renamed_4;
                n3 = n2;
            }
        }
        int n4 = n = 0;
        while (n4 < arg0.cfr_renamed_2.length) {
            spraxe spraxe3 = this;
            int n5 = n;
            BigDecimal bigDecimal = spraxe3.cfr_renamed_2[n].subtract(arg0.cfr_renamed_2[n5]);
            spraxe3.cfr_renamed_2[n5] = bigDecimal;
            n4 = ++n;
        }
    }

    private /* synthetic */ spraxe cfr_renamed_5464(spraxe arg0) {
        int n;
        spraxe spraxe2;
        BigDecimal[] bigDecimalArray = this.cfr_renamed_2;
        spraxe spraxe3 = arg0;
        BigDecimal[] bigDecimalArray2 = spraxe3.cfr_renamed_2;
        int n2 = spraxe3.cfr_renamed_2.length;
        if (n2 <= 1) {
            int n3;
            BigDecimal[] bigDecimalArray3 = (BigDecimal[])this.cfr_renamed_2.clone();
            int n4 = n3 = 0;
            while (n4 < this.cfr_renamed_2.length) {
                bigDecimalArray3[++n3] = bigDecimalArray3[n3].multiply(arg0.cfr_renamed_2[0]);
                n4 = n3;
            }
            return new spraxe(bigDecimalArray3);
        }
        int n5 = n2 / 2;
        spraxe spraxe4 = new spraxe(this.cfr_renamed_799(bigDecimalArray, n5));
        spraxe spraxe5 = new spraxe(this.cfr_renamed_796(bigDecimalArray, n5, n2));
        spraxe spraxe6 = new spraxe(this.cfr_renamed_799(bigDecimalArray2, n5));
        spraxe spraxe7 = new spraxe(this.cfr_renamed_796(bigDecimalArray2, n5, n2));
        spraxe spraxe8 = (spraxe)spraxe4.clone();
        spraxe8.cfr_renamed_5466(spraxe5);
        spraxe spraxe9 = (spraxe)spraxe6.clone();
        spraxe9.cfr_renamed_5466(spraxe7);
        spraxe spraxe10 = spraxe4.cfr_renamed_5464(spraxe6);
        spraxe spraxe11 = spraxe5.cfr_renamed_5464(spraxe7);
        spraxe spraxe12 = spraxe2 = spraxe8.cfr_renamed_5464(spraxe9);
        spraxe12.cfr_renamed_5465(spraxe10);
        spraxe12.cfr_renamed_5465(spraxe11);
        spraxe spraxe13 = new spraxe(2 * n2 - 1);
        int n6 = n = 0;
        while (n6 < spraxe10.cfr_renamed_2.length) {
            int n7 = n++;
            spraxe13.cfr_renamed_2[n7] = spraxe10.cfr_renamed_2[n7];
            n6 = n;
        }
        int n8 = n = 0;
        while (n8 < spraxe2.cfr_renamed_2.length) {
            int n9 = n5 + n;
            BigDecimal bigDecimal = spraxe13.cfr_renamed_2[n5 + n].add(spraxe2.cfr_renamed_2[n]);
            spraxe13.cfr_renamed_2[n9] = bigDecimal;
            n8 = ++n;
        }
        int n10 = n = 0;
        while (n10 < spraxe11.cfr_renamed_2.length) {
            int n11 = 2 * n5 + n;
            BigDecimal bigDecimal = spraxe13.cfr_renamed_2[2 * n5 + n].add(spraxe11.cfr_renamed_2[n]);
            spraxe13.cfr_renamed_2[n11] = bigDecimal;
            n10 = ++n;
        }
        return spraxe13;
    }

    public void cfr_renamed_5466(spraxe arg0) {
        int n;
        if (arg0.cfr_renamed_2.length > this.cfr_renamed_2.length) {
            int n2;
            n = this.cfr_renamed_2.length;
            spraxe spraxe2 = this;
            spraxe2.cfr_renamed_2 = spraxe2.cfr_renamed_799(spraxe2.cfr_renamed_2, arg0.cfr_renamed_2.length);
            int n3 = n2 = n;
            while (n3 < this.cfr_renamed_2.length) {
                this.cfr_renamed_2[n2++] = cfr_renamed_4;
                n3 = n2;
            }
        }
        int n4 = n = 0;
        while (n4 < arg0.cfr_renamed_2.length) {
            spraxe spraxe3 = this;
            int n5 = n;
            BigDecimal bigDecimal = spraxe3.cfr_renamed_2[n].add(arg0.cfr_renamed_2[n5]);
            spraxe3.cfr_renamed_2[n5] = bigDecimal;
            n4 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public spraxe(sprsgf sprsgf2) {
        int n;
        int n2 = sprsgf2.cfr_renamed_3.length;
        this.cfr_renamed_2 = new BigDecimal[n2];
        int n3 = n = 0;
        while (n3 < n2) {
            void arg0;
            int n4 = n;
            BigDecimal bigDecimal = new BigDecimal(arg0.cfr_renamed_3[n]);
            this.cfr_renamed_2[n4] = bigDecimal;
            n3 = ++n;
        }
    }

    public sprsgf cfr_renamed_802() {
        int n;
        int n2 = this.cfr_renamed_2.length;
        sprsgf sprsgf2 = new sprsgf(n2);
        int n3 = n = 0;
        while (n3 < n2) {
            int n4 = n++;
            sprsgf2.cfr_renamed_3[n4] = this.cfr_renamed_2[n4].setScale(0, 6).toBigInteger();
            n3 = n;
        }
        return sprsgf2;
    }
}

