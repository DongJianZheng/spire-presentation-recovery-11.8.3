/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprama;
import com.spire.presentation.packages.sprbta;
import com.spire.presentation.packages.sprrhf;
import com.spire.presentation.packages.sprvma;
import com.spire.presentation.packages.sprzra;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;

public class sprwna {
    public BigInteger[] cfr_renamed_3;
    private static final double cfr_renamed_4 = Math.log10(2.0);

    public BigInteger cfr_renamed_754() {
        int n;
        BigInteger bigInteger = sprvma.cfr_renamed_4;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.length) {
            bigInteger = bigInteger.add(this.cfr_renamed_3[n++]);
            n2 = n;
        }
        return bigInteger;
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
        sprwna sprwna2 = (sprwna)arg0;
        return sprzra.cfr_renamed_558(this.cfr_renamed_3, sprwna2.cfr_renamed_3);
    }

    public Object clone() {
        return new sprwna((BigInteger[])this.cfr_renamed_3.clone());
    }

    public sprbta cfr_renamed_787(BigDecimal arg0, int arg1) {
        int n;
        int n2 = (int)((double)this.cfr_renamed_788().bitLength() * cfr_renamed_4) + 1;
        BigDecimal bigDecimal = sprvma.cfr_renamed_3.divide(arg0, n2 + arg1 + 1, 6);
        sprbta sprbta2 = new sprbta(this.cfr_renamed_3.length);
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_3.length) {
            int n4 = n;
            BigDecimal bigDecimal2 = new BigDecimal(this.cfr_renamed_3[n]);
            sprbta2.cfr_renamed_3[n4] = bigDecimal2.multiply(bigDecimal).setScale(arg1, 6);
            n3 = ++n;
        }
        return sprbta2;
    }

    public void cfr_renamed_789(BigInteger arg0) {
        int n;
        BigInteger bigInteger = arg0.add(sprvma.cfr_renamed_2).divide(BigInteger.valueOf(2L));
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.length) {
            sprwna sprwna2 = this;
            int n3 = n;
            sprwna2.cfr_renamed_3[n3] = sprwna2.cfr_renamed_3[n3].compareTo(sprvma.cfr_renamed_4) > 0 ? this.cfr_renamed_3[n].add(bigInteger) : this.cfr_renamed_3[n].add(bigInteger.negate());
            sprwna sprwna3 = this;
            int n4 = n++;
            sprwna3.cfr_renamed_3[n4] = sprwna3.cfr_renamed_3[n4].divide(arg0);
            n2 = n;
        }
    }

    public void cfr_renamed_751(int arg0) {
        this.cfr_renamed_737(BigInteger.valueOf(arg0));
    }

    public void cfr_renamed_738(BigInteger arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.length) {
            sprwna sprwna2 = this;
            int n3 = n++;
            sprwna2.cfr_renamed_3[n3] = sprwna2.cfr_renamed_3[n3].mod(arg0);
            n2 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprwna(sprama sprama2) {
        int n;
        this.cfr_renamed_3 = new BigInteger[sprama2.cfr_renamed_1.length];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.length) {
            void arg0;
            int n3 = n++;
            this.cfr_renamed_3[n3] = BigInteger.valueOf(arg0.cfr_renamed_1[n3]);
            n2 = n;
        }
    }

    public BigInteger[] cfr_renamed_790() {
        return sprzra.cfr_renamed_530(this.cfr_renamed_3);
    }

    public sprwna cfr_renamed_725(sprwna arg0) {
        int n = this.cfr_renamed_3.length;
        if (arg0.cfr_renamed_3.length != n) {
            throw new IllegalArgumentException(sprrhf.cfr_renamed_9("\u001d!>66&s;5t0;625=0=6:''s9&''t11s ;1s'296"));
        }
        sprwna sprwna2 = this.cfr_renamed_791(arg0);
        if (sprwna2.cfr_renamed_3.length > n) {
            int n2;
            int n3 = n2 = n;
            while (n3 < sprwna2.cfr_renamed_3.length) {
                int n4 = n2 - n;
                BigInteger bigInteger = sprwna2.cfr_renamed_3[n2 - n].add(sprwna2.cfr_renamed_3[n2]);
                sprwna2.cfr_renamed_3[n4] = bigInteger;
                n3 = ++n2;
            }
            sprwna2.cfr_renamed_3 = sprzra.cfr_renamed_550(sprwna2.cfr_renamed_3, n);
        }
        return sprwna2;
    }

    public int hashCode() {
        int n = 1;
        n = 31 * n + sprzra.cfr_renamed_546(this.cfr_renamed_3);
        return n;
    }

    public int cfr_renamed_792() {
        return (int)((double)this.cfr_renamed_788().bitLength() * cfr_renamed_4) + 1;
    }

    private /* synthetic */ sprwna cfr_renamed_791(sprwna arg0) {
        int n;
        sprwna sprwna2;
        BigInteger[] bigIntegerArray = this.cfr_renamed_3;
        sprwna sprwna3 = arg0;
        BigInteger[] bigIntegerArray2 = sprwna3.cfr_renamed_3;
        int n2 = sprwna3.cfr_renamed_3.length;
        if (n2 <= 1) {
            int n3;
            BigInteger[] bigIntegerArray3 = sprzra.cfr_renamed_530(this.cfr_renamed_3);
            int n4 = n3 = 0;
            while (n4 < this.cfr_renamed_3.length) {
                bigIntegerArray3[++n3] = bigIntegerArray3[n3].multiply(arg0.cfr_renamed_3[0]);
                n4 = n3;
            }
            return new sprwna(bigIntegerArray3);
        }
        int n5 = n2 / 2;
        sprwna sprwna4 = new sprwna(sprzra.cfr_renamed_550(bigIntegerArray, n5));
        sprwna sprwna5 = new sprwna(sprzra.cfr_renamed_548(bigIntegerArray, n5, n2));
        sprwna sprwna6 = new sprwna(sprzra.cfr_renamed_550(bigIntegerArray2, n5));
        sprwna sprwna7 = new sprwna(sprzra.cfr_renamed_548(bigIntegerArray2, n5, n2));
        sprwna sprwna8 = (sprwna)sprwna4.clone();
        sprwna8.cfr_renamed_733(sprwna5);
        sprwna sprwna9 = (sprwna)sprwna6.clone();
        sprwna9.cfr_renamed_733(sprwna7);
        sprwna sprwna10 = sprwna4.cfr_renamed_791(sprwna6);
        sprwna sprwna11 = sprwna5.cfr_renamed_791(sprwna7);
        sprwna sprwna12 = sprwna2 = sprwna8.cfr_renamed_791(sprwna9);
        sprwna12.cfr_renamed_793(sprwna10);
        sprwna12.cfr_renamed_793(sprwna11);
        sprwna sprwna13 = new sprwna(2 * n2 - 1);
        int n6 = n = 0;
        while (n6 < sprwna10.cfr_renamed_3.length) {
            int n7 = n++;
            sprwna13.cfr_renamed_3[n7] = sprwna10.cfr_renamed_3[n7];
            n6 = n;
        }
        int n8 = n = 0;
        while (n8 < sprwna2.cfr_renamed_3.length) {
            int n9 = n5 + n;
            BigInteger bigInteger = sprwna13.cfr_renamed_3[n5 + n].add(sprwna2.cfr_renamed_3[n]);
            sprwna13.cfr_renamed_3[n9] = bigInteger;
            n8 = ++n;
        }
        int n10 = n = 0;
        while (n10 < sprwna11.cfr_renamed_3.length) {
            int n11 = 2 * n5 + n;
            BigInteger bigInteger = sprwna13.cfr_renamed_3[2 * n5 + n].add(sprwna11.cfr_renamed_3[n]);
            sprwna13.cfr_renamed_3[n11] = bigInteger;
            n10 = ++n;
        }
        return sprwna13;
    }

    public void cfr_renamed_737(BigInteger arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.length) {
            sprwna sprwna2 = this;
            int n3 = n++;
            sprwna2.cfr_renamed_3[n3] = sprwna2.cfr_renamed_3[n3].multiply(arg0);
            n2 = n;
        }
    }

    public void cfr_renamed_793(sprwna arg0) {
        int n;
        if (arg0.cfr_renamed_3.length > this.cfr_renamed_3.length) {
            int n2;
            n = this.cfr_renamed_3.length;
            this.cfr_renamed_3 = sprzra.cfr_renamed_550(this.cfr_renamed_3, arg0.cfr_renamed_3.length);
            int n3 = n2 = n;
            while (n3 < this.cfr_renamed_3.length) {
                this.cfr_renamed_3[n2++] = sprvma.cfr_renamed_4;
                n3 = n2;
            }
        }
        int n4 = n = 0;
        while (n4 < arg0.cfr_renamed_3.length) {
            sprwna sprwna2 = this;
            int n5 = n;
            BigInteger bigInteger = sprwna2.cfr_renamed_3[n].subtract(arg0.cfr_renamed_3[n5]);
            sprwna2.cfr_renamed_3[n5] = bigInteger;
            n4 = ++n;
        }
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

    public sprwna(BigInteger[] bigIntegerArray) {
        this.cfr_renamed_3 = bigIntegerArray;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_794(sprwna sprwna2, BigInteger bigInteger) {
        void arg0;
        sprwna sprwna3 = this;
        sprwna3.cfr_renamed_733((sprwna)arg0);
        sprwna3.cfr_renamed_738(bigInteger);
    }

    public static sprwna cfr_renamed_795(int arg0, int arg1, int arg2) {
        int n;
        int n2;
        ArrayList<BigInteger> arrayList = new ArrayList<BigInteger>();
        int n3 = n2 = 0;
        while (n3 < arg1) {
            arrayList.add(sprvma.cfr_renamed_2);
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
            arrayList3.add(sprvma.cfr_renamed_4);
        }
        Collections.shuffle(arrayList, new SecureRandom());
        sprwna sprwna2 = new sprwna(arg0);
        int n5 = n = 0;
        while (n5 < arrayList.size()) {
            int n6 = n++;
            sprwna2.cfr_renamed_3[n6] = (BigInteger)arrayList.get(n6);
            n5 = n;
        }
        return sprwna2;
    }

    public void cfr_renamed_733(sprwna arg0) {
        int n;
        if (arg0.cfr_renamed_3.length > this.cfr_renamed_3.length) {
            int n2;
            n = this.cfr_renamed_3.length;
            this.cfr_renamed_3 = sprzra.cfr_renamed_550(this.cfr_renamed_3, arg0.cfr_renamed_3.length);
            int n3 = n2 = n;
            while (n3 < this.cfr_renamed_3.length) {
                this.cfr_renamed_3[n2++] = sprvma.cfr_renamed_4;
                n3 = n2;
            }
        }
        int n4 = n = 0;
        while (n4 < arg0.cfr_renamed_3.length) {
            sprwna sprwna2 = this;
            int n5 = n;
            BigInteger bigInteger = sprwna2.cfr_renamed_3[n].add(arg0.cfr_renamed_3[n5]);
            sprwna2.cfr_renamed_3[n5] = bigInteger;
            n4 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprwna(int n) {
        void arg0;
        int n2;
        this.cfr_renamed_3 = new BigInteger[n];
        int n3 = n2 = 0;
        while (n3 < arg0) {
            this.cfr_renamed_3[n2++] = sprvma.cfr_renamed_4;
            n3 = n2;
        }
    }
}

