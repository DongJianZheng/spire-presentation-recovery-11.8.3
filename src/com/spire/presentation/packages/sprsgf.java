/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraxe;
import com.spire.presentation.packages.sprhgf;
import com.spire.presentation.packages.sprnzha;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprwhf;
import com.spire.presentation.packages.sprybl;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class sprsgf {
    public BigInteger[] cfr_renamed_3;
    private static final double cfr_renamed_4 = Math.log10(2.0);

    public BigInteger cfr_renamed_754() {
        int n;
        BigInteger bigInteger = sprwhf.cfr_renamed_3;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.length) {
            bigInteger = bigInteger.add(this.cfr_renamed_3[n++]);
            n2 = n;
        }
        return bigInteger;
    }

    /*
     * WARNING - void declaration
     */
    public sprsgf(int n) {
        void arg0;
        int n2;
        this.cfr_renamed_3 = new BigInteger[n];
        int n3 = n2 = 0;
        while (n3 < arg0) {
            this.cfr_renamed_3[n2++] = sprwhf.cfr_renamed_3;
            n3 = n2;
        }
    }

    private /* synthetic */ sprsgf cfr_renamed_5460(sprsgf arg0) {
        int n;
        sprsgf sprsgf2;
        BigInteger[] bigIntegerArray = this.cfr_renamed_3;
        sprsgf sprsgf3 = arg0;
        BigInteger[] bigIntegerArray2 = sprsgf3.cfr_renamed_3;
        int n2 = sprsgf3.cfr_renamed_3.length;
        if (n2 <= 1) {
            int n3;
            BigInteger[] bigIntegerArray3 = sproze.cfr_renamed_530(this.cfr_renamed_3);
            int n4 = n3 = 0;
            while (n4 < this.cfr_renamed_3.length) {
                bigIntegerArray3[++n3] = bigIntegerArray3[n3].multiply(arg0.cfr_renamed_3[0]);
                n4 = n3;
            }
            return new sprsgf(bigIntegerArray3);
        }
        int n5 = n2 / 2;
        sprsgf sprsgf4 = new sprsgf(sproze.cfr_renamed_550(bigIntegerArray, n5));
        sprsgf sprsgf5 = new sprsgf(sproze.cfr_renamed_548(bigIntegerArray, n5, n2));
        sprsgf sprsgf6 = new sprsgf(sproze.cfr_renamed_550(bigIntegerArray2, n5));
        sprsgf sprsgf7 = new sprsgf(sproze.cfr_renamed_548(bigIntegerArray2, n5, n2));
        sprsgf sprsgf8 = (sprsgf)sprsgf4.clone();
        sprsgf8.cfr_renamed_5445(sprsgf5);
        sprsgf sprsgf9 = (sprsgf)sprsgf6.clone();
        sprsgf9.cfr_renamed_5445(sprsgf7);
        sprsgf sprsgf10 = sprsgf4.cfr_renamed_5460(sprsgf6);
        sprsgf sprsgf11 = sprsgf5.cfr_renamed_5460(sprsgf7);
        sprsgf sprsgf12 = sprsgf2 = sprsgf8.cfr_renamed_5460(sprsgf9);
        sprsgf12.cfr_renamed_5461(sprsgf10);
        sprsgf12.cfr_renamed_5461(sprsgf11);
        sprsgf sprsgf13 = new sprsgf(2 * n2 - 1);
        int n6 = n = 0;
        while (n6 < sprsgf10.cfr_renamed_3.length) {
            int n7 = n++;
            sprsgf13.cfr_renamed_3[n7] = sprsgf10.cfr_renamed_3[n7];
            n6 = n;
        }
        int n8 = n = 0;
        while (n8 < sprsgf2.cfr_renamed_3.length) {
            int n9 = n5 + n;
            BigInteger bigInteger = sprsgf13.cfr_renamed_3[n5 + n].add(sprsgf2.cfr_renamed_3[n]);
            sprsgf13.cfr_renamed_3[n9] = bigInteger;
            n8 = ++n;
        }
        int n10 = n = 0;
        while (n10 < sprsgf11.cfr_renamed_3.length) {
            int n11 = 2 * n5 + n;
            BigInteger bigInteger = sprsgf13.cfr_renamed_3[2 * n5 + n].add(sprsgf11.cfr_renamed_3[n]);
            sprsgf13.cfr_renamed_3[n11] = bigInteger;
            n10 = ++n;
        }
        return sprsgf13;
    }

    public void cfr_renamed_738(BigInteger arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.length) {
            sprsgf sprsgf2 = this;
            int n3 = n++;
            sprsgf2.cfr_renamed_3[n3] = sprsgf2.cfr_renamed_3[n3].mod(arg0);
            n2 = n;
        }
    }

    public int cfr_renamed_792() {
        return (int)((double)this.cfr_renamed_788().bitLength() * cfr_renamed_4) + 1;
    }

    public sprsgf(BigInteger[] bigIntegerArray) {
        this.cfr_renamed_3 = bigIntegerArray;
    }

    public int hashCode() {
        int n = 1;
        n = 31 * n + sproze.cfr_renamed_546(this.cfr_renamed_3);
        return n;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (arg0 == null) {
            return false;
        }
        if (this.getClass() != arg0.getClass()) {
            return false;
        }
        sprsgf sprsgf2 = (sprsgf)arg0;
        return sproze.cfr_renamed_558(this.cfr_renamed_3, sprsgf2.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_5462(sprsgf sprsgf2, BigInteger bigInteger) {
        void arg0;
        sprsgf sprsgf3 = this;
        sprsgf3.cfr_renamed_5445((sprsgf)arg0);
        sprsgf3.cfr_renamed_738(bigInteger);
    }

    public void cfr_renamed_737(BigInteger arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.length) {
            sprsgf sprsgf2 = this;
            int n3 = n++;
            sprsgf2.cfr_renamed_3[n3] = sprsgf2.cfr_renamed_3[n3].multiply(arg0);
            n2 = n;
        }
    }

    public BigInteger[] cfr_renamed_790() {
        return sproze.cfr_renamed_530(this.cfr_renamed_3);
    }

    public void cfr_renamed_5461(sprsgf arg0) {
        int n;
        if (arg0.cfr_renamed_3.length > this.cfr_renamed_3.length) {
            int n2;
            n = this.cfr_renamed_3.length;
            this.cfr_renamed_3 = sproze.cfr_renamed_550(this.cfr_renamed_3, arg0.cfr_renamed_3.length);
            int n3 = n2 = n;
            while (n3 < this.cfr_renamed_3.length) {
                this.cfr_renamed_3[n2++] = sprwhf.cfr_renamed_3;
                n3 = n2;
            }
        }
        int n4 = n = 0;
        while (n4 < arg0.cfr_renamed_3.length) {
            sprsgf sprsgf2 = this;
            int n5 = n;
            BigInteger bigInteger = sprsgf2.cfr_renamed_3[n].subtract(arg0.cfr_renamed_3[n5]);
            sprsgf2.cfr_renamed_3[n5] = bigInteger;
            n4 = ++n;
        }
    }

    public void cfr_renamed_789(BigInteger arg0) {
        int n;
        BigInteger bigInteger = arg0.add(sprwhf.cfr_renamed_4).divide(BigInteger.valueOf(2L));
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.length) {
            sprsgf sprsgf2 = this;
            int n3 = n;
            sprsgf2.cfr_renamed_3[n3] = sprsgf2.cfr_renamed_3[n3].compareTo(sprwhf.cfr_renamed_3) > 0 ? this.cfr_renamed_3[n].add(bigInteger) : this.cfr_renamed_3[n].add(bigInteger.negate());
            sprsgf sprsgf3 = this;
            int n4 = n++;
            sprsgf3.cfr_renamed_3[n4] = sprsgf3.cfr_renamed_3[n4].divide(arg0);
            n2 = n;
        }
    }

    public Object clone() {
        return new sprsgf((BigInteger[])this.cfr_renamed_3.clone());
    }

    private /* synthetic */ BigInteger cfr_renamed_788() {
        int n;
        BigInteger bigInteger = this.cfr_renamed_3[0].abs();
        int n2 = n = 1;
        while (n2 < this.cfr_renamed_3.length) {
            BigInteger bigInteger2 = this.cfr_renamed_3[n].abs();
            if (bigInteger2.compareTo(bigInteger) > 0) {
                bigInteger = bigInteger2;
            }
            n2 = ++n;
        }
        return bigInteger;
    }

    public spraxe cfr_renamed_787(BigDecimal arg0, int arg1) {
        int n;
        int n2 = (int)((double)this.cfr_renamed_788().bitLength() * cfr_renamed_4) + 1;
        BigDecimal bigDecimal = sprwhf.cfr_renamed_2.divide(arg0, n2 + arg1 + 1, 6);
        spraxe spraxe2 = new spraxe(this.cfr_renamed_3.length);
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_3.length) {
            int n4 = n;
            BigDecimal bigDecimal2 = new BigDecimal(this.cfr_renamed_3[n]);
            spraxe2.cfr_renamed_2[n4] = bigDecimal2.multiply(bigDecimal).setScale(arg1, 6);
            n3 = ++n;
        }
        return spraxe2;
    }

    public void cfr_renamed_5445(sprsgf arg0) {
        int n;
        if (arg0.cfr_renamed_3.length > this.cfr_renamed_3.length) {
            int n2;
            n = this.cfr_renamed_3.length;
            this.cfr_renamed_3 = sproze.cfr_renamed_550(this.cfr_renamed_3, arg0.cfr_renamed_3.length);
            int n3 = n2 = n;
            while (n3 < this.cfr_renamed_3.length) {
                this.cfr_renamed_3[n2++] = sprwhf.cfr_renamed_3;
                n3 = n2;
            }
        }
        int n4 = n = 0;
        while (n4 < arg0.cfr_renamed_3.length) {
            sprsgf sprsgf2 = this;
            int n5 = n;
            BigInteger bigInteger = sprsgf2.cfr_renamed_3[n].add(arg0.cfr_renamed_3[n5]);
            sprsgf2.cfr_renamed_3[n5] = bigInteger;
            n4 = ++n;
        }
    }

    public static sprsgf cfr_renamed_795(int arg0, int arg1, int arg2) {
        int n;
        int n2;
        ArrayList<BigInteger> arrayList = new ArrayList<BigInteger>();
        int n3 = n2 = 0;
        while (n3 < arg1) {
            arrayList.add(sprwhf.cfr_renamed_4);
            n3 = ++n2;
        }
        int n4 = n2 = 0;
        while (n4 < arg2) {
            arrayList.add(BigInteger.valueOf(-1L));
            n4 = ++n2;
        }
        ArrayList<BigInteger> arrayList2 = arrayList;
        while (arrayList2.size() < arg0) {
            ArrayList<BigInteger> arrayList3 = arrayList;
            arrayList2 = arrayList3;
            arrayList3.add(sprwhf.cfr_renamed_3);
        }
        Collections.shuffle(arrayList, sprybl.cfr_renamed_2794());
        sprsgf sprsgf2 = new sprsgf(arg0);
        int n5 = n = 0;
        while (n5 < arrayList.size()) {
            int n6 = n++;
            sprsgf2.cfr_renamed_3[n6] = (BigInteger)arrayList.get(n6);
            n5 = n;
        }
        return sprsgf2;
    }

    /*
     * WARNING - void declaration
     */
    public sprsgf(sprhgf sprhgf2) {
        int n;
        this.cfr_renamed_3 = new BigInteger[sprhgf2.cfr_renamed_3.length];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.length) {
            void arg0;
            int n3 = n++;
            this.cfr_renamed_3[n3] = BigInteger.valueOf(arg0.cfr_renamed_3[n3]);
            n2 = n;
        }
    }

    public sprsgf cfr_renamed_5443(sprsgf arg0) {
        int n = this.cfr_renamed_3.length;
        if (arg0.cfr_renamed_3.length != n) {
            throw new IllegalArgumentException(sprnzha.cfr_renamed_9(":p\u0019g\u0011wTj\u0012%\u0017j\u0011c\u0012l\u0017l\u0011k\u0000vTh\u0001v\u0000%\u0016`Tq\u001c`Tv\u0015h\u0011"));
        }
        sprsgf sprsgf2 = this.cfr_renamed_5460(arg0);
        if (sprsgf2.cfr_renamed_3.length > n) {
            int n2;
            int n3 = n2 = n;
            while (n3 < sprsgf2.cfr_renamed_3.length) {
                int n4 = n2 - n;
                BigInteger bigInteger = sprsgf2.cfr_renamed_3[n2 - n].add(sprsgf2.cfr_renamed_3[n2]);
                sprsgf2.cfr_renamed_3[n4] = bigInteger;
                n3 = ++n2;
            }
            sprsgf2.cfr_renamed_3 = sproze.cfr_renamed_550(sprsgf2.cfr_renamed_3, n);
        }
        return sprsgf2;
    }

    public void cfr_renamed_751(int arg0) {
        this.cfr_renamed_737(BigInteger.valueOf(arg0));
    }
}

