/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfma;
import com.spire.presentation.packages.sprgna;
import com.spire.presentation.packages.sprhao;
import com.spire.presentation.packages.sprhpa;
import com.spire.presentation.packages.sprjva;
import com.spire.presentation.packages.sprk;
import com.spire.presentation.packages.sprona;
import com.spire.presentation.packages.sprqsa;
import com.spire.presentation.packages.sprvma;
import com.spire.presentation.packages.sprvqa;
import com.spire.presentation.packages.sprwna;
import com.spire.presentation.packages.spryta;
import com.spire.presentation.packages.sprzra;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

public class sprama
implements sprk {
    public int[] cfr_renamed_1;
    private static final int[] cfr_renamed_2;
    private static final int cfr_renamed_3 = 3;
    private static final List cfr_renamed_4;

    public boolean equals(Object arg0) {
        if (arg0 instanceof sprama) {
            return sprzra.cfr_renamed_549(this.cfr_renamed_1, ((sprama)arg0).cfr_renamed_1);
        }
        return false;
    }

    public void cfr_renamed_746(int arg0) {
        int n;
        int n2 = (arg0 + 1) / 2;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_1.length) {
            int n4 = n;
            this.cfr_renamed_1[n4] = this.cfr_renamed_1[n4] + (this.cfr_renamed_1[n] > 0 ? n2 : -n2);
            int n5 = n++;
            this.cfr_renamed_1[n5] = this.cfr_renamed_1[n5] / arg0;
            n3 = n;
        }
    }

    private /* synthetic */ void cfr_renamed_747(int[] arg0) {
        boolean bl = true;
        while (bl) {
            int n;
            bl = false;
            int n2 = n = 0;
            while (n2 != arg0.length - 1) {
                if (arg0[n] > arg0[n + 1]) {
                    int n3 = arg0[n];
                    arg0[n] = arg0[n + 1];
                    arg0[n + 1] = n3;
                    bl = true;
                }
                n2 = ++n;
            }
        }
    }

    public sprgna cfr_renamed_748(int arg0) {
        sprama sprama2 = this;
        int[] nArray = sprzra.cfr_renamed_541(sprama2.cfr_renamed_1, sprama2.cfr_renamed_1.length + 1);
        sprama sprama3 = new sprama(nArray);
        int n = nArray.length;
        sprama sprama4 = new sprama(n);
        sprama4.cfr_renamed_1[0] = -1;
        sprama4.cfr_renamed_1[n - 1] = 1;
        sprama sprama5 = new sprama(sprama3.cfr_renamed_1);
        sprama sprama6 = new sprama(n);
        sprama sprama7 = new sprama(n);
        sprama7.cfr_renamed_1[0] = 1;
        int n2 = n - 1;
        int n3 = sprama5.cfr_renamed_749();
        int n4 = n2;
        int n5 = 0;
        int n6 = 1;
        block0: while (true) {
            int n7 = n3;
            while (n7 > 0) {
                n5 = sprhpa.cfr_renamed_711(sprama5.cfr_renamed_1[n3], arg0);
                n5 = n5 * sprama4.cfr_renamed_1[n2] % arg0;
                sprama sprama8 = sprama4;
                sprama8.cfr_renamed_750(sprama5, n5, n2 - n3, arg0);
                sprama6.cfr_renamed_750(sprama7, n5, n2 - n3, arg0);
                n2 = sprama8.cfr_renamed_749();
                if (n2 >= n3) continue block0;
                n6 *= sprhpa.cfr_renamed_705(sprama5.cfr_renamed_1[n3], n4 - n2, arg0);
                n6 %= arg0;
                if (n4 % 2 == 1 && n3 % 2 == 1) {
                    n6 = -n6 % arg0;
                }
                sprama sprama9 = sprama4;
                sprama4 = sprama5;
                sprama5 = sprama9;
                int n8 = n2;
                n2 = n3;
                sprama sprama10 = sprama6;
                sprama6 = sprama7;
                sprama7 = sprama10;
                n4 = n3;
                n7 = n8;
            }
            break;
        }
        n6 *= sprhpa.cfr_renamed_705(sprama5.cfr_renamed_1[0], n2, arg0);
        n6 %= arg0;
        n5 = sprhpa.cfr_renamed_711(sprama5.cfr_renamed_1[0], arg0);
        sprama sprama11 = sprama7;
        sprama sprama12 = sprama7;
        sprama12.cfr_renamed_751(n5);
        sprama12.cfr_renamed_729(arg0);
        sprama11.cfr_renamed_751(n6);
        sprama11.cfr_renamed_729(arg0);
        sprama7.cfr_renamed_1 = sprzra.cfr_renamed_541(sprama11.cfr_renamed_1, sprama7.cfr_renamed_1.length - 1);
        return new sprgna(new sprwna(sprama7), BigInteger.valueOf(n6), BigInteger.valueOf(arg0));
    }

    private /* synthetic */ sprama cfr_renamed_752(sprama arg0) {
        int n;
        sprama sprama2;
        int[] nArray = this.cfr_renamed_1;
        sprama sprama3 = arg0;
        int[] nArray2 = sprama3.cfr_renamed_1;
        int n2 = sprama3.cfr_renamed_1.length;
        if (n2 <= 32) {
            int n3;
            int n4 = 2 * n2 - 1;
            sprama sprama4 = new sprama(new int[n4]);
            int n5 = n3 = 0;
            while (n5 < n4) {
                int n6 = Math.max(0, n3 - n2 + 1);
                while (n6 <= Math.min(n3, n2 - 1)) {
                    int n7;
                    int n8 = n3;
                    int n9 = sprama4.cfr_renamed_1[n8] + nArray2[n7] * nArray[n3 - n7];
                    sprama4.cfr_renamed_1[n8] = n9;
                    n6 = ++n7;
                }
                n5 = ++n3;
            }
            return sprama4;
        }
        int n10 = n2 / 2;
        sprama sprama5 = new sprama(sprzra.cfr_renamed_541(nArray, n10));
        sprama sprama6 = new sprama(sprzra.cfr_renamed_531(nArray, n10, n2));
        sprama sprama7 = new sprama(sprzra.cfr_renamed_541(nArray2, n10));
        sprama sprama8 = new sprama(sprzra.cfr_renamed_531(nArray2, n10, n2));
        sprama sprama9 = (sprama)sprama5.clone();
        sprama9.cfr_renamed_730(sprama6);
        sprama sprama10 = (sprama)sprama7.clone();
        sprama10.cfr_renamed_730(sprama8);
        sprama sprama11 = sprama5.cfr_renamed_752(sprama7);
        sprama sprama12 = sprama6.cfr_renamed_752(sprama8);
        sprama sprama13 = sprama2 = sprama9.cfr_renamed_752(sprama10);
        sprama13.cfr_renamed_753(sprama11);
        sprama13.cfr_renamed_753(sprama12);
        sprama sprama14 = new sprama(2 * n2 - 1);
        int n11 = n = 0;
        while (n11 < sprama11.cfr_renamed_1.length) {
            int n12 = n++;
            sprama14.cfr_renamed_1[n12] = sprama11.cfr_renamed_1[n12];
            n11 = n;
        }
        int n13 = n = 0;
        while (n13 < sprama2.cfr_renamed_1.length) {
            int n14 = n10 + n;
            int n15 = sprama14.cfr_renamed_1[n14] + sprama2.cfr_renamed_1[n];
            sprama14.cfr_renamed_1[n14] = n15;
            n13 = ++n;
        }
        int n16 = n = 0;
        while (n16 < sprama12.cfr_renamed_1.length) {
            int n17 = 2 * n10 + n;
            int n18 = sprama14.cfr_renamed_1[n17] + sprama12.cfr_renamed_1[n];
            sprama14.cfr_renamed_1[n17] = n18;
            n16 = ++n;
        }
        return sprama14;
    }

    public int cfr_renamed_754() {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_1.length) {
            n2 += this.cfr_renamed_1[n++];
            n3 = n;
        }
        return n2;
    }

    public byte[] cfr_renamed_755() {
        int n;
        BigInteger bigInteger = sprvma.cfr_renamed_4;
        int n2 = n = this.cfr_renamed_1.length - 1;
        while (n2 >= 0) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(3L));
            long l = this.cfr_renamed_1[n] + 1;
            bigInteger = bigInteger.add(BigInteger.valueOf(l));
            n2 = --n;
        }
        n = (BigInteger.valueOf(3L).pow(this.cfr_renamed_1.length).bitLength() + 7) / 8;
        byte[] byArray = bigInteger.toByteArray();
        if (byArray.length < n) {
            byte[] byArray2 = new byte[n];
            System.arraycopy(byArray, 0, byArray2, n - byArray.length, byArray.length);
            return byArray2;
        }
        if (byArray.length > n) {
            byArray = sprzra.cfr_renamed_533(byArray, 1, byArray.length);
        }
        return byArray;
    }

    public void cfr_renamed_756() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_1.length) {
            sprama sprama2 = this;
            int n3 = n;
            sprama2.cfr_renamed_1[n3] = sprama2.cfr_renamed_1[n3] % 3;
            if (sprama2.cfr_renamed_1[n] > 1) {
                int n4 = n;
                this.cfr_renamed_1[n4] = this.cfr_renamed_1[n4] - 3;
            }
            if (this.cfr_renamed_1[n] < -1) {
                int n5 = n;
                this.cfr_renamed_1[n5] = this.cfr_renamed_1[n5] + 3;
            }
            n2 = ++n;
        }
    }

    public void cfr_renamed_757(int arg0) {
        sprama sprama2;
        int n;
        int n2;
        int n3;
        sprama sprama3 = this;
        sprama3.cfr_renamed_758(arg0);
        int[] nArray = sprzra.cfr_renamed_535(sprama3.cfr_renamed_1);
        sprama3.cfr_renamed_747(nArray);
        int n4 = 0;
        int n5 = 0;
        int n6 = n3 = 0;
        while (n6 < nArray.length - 1) {
            n2 = nArray[n3 + 1] - nArray[n3];
            if (n2 > n4) {
                n4 = n2;
                n5 = nArray[n3];
            }
            n6 = ++n3;
        }
        n2 = nArray[nArray.length - 1];
        n3 = nArray[0];
        if (arg0 - n2 + n3 > n4) {
            n = (n2 + n3) / 2;
            sprama2 = this;
        } else {
            n = n5 + n4 / 2 + arg0 / 2;
            sprama2 = this;
        }
        sprama2.cfr_renamed_759(n);
    }

    public long cfr_renamed_760(int arg0) {
        int n;
        int n2 = this.cfr_renamed_1.length;
        sprama sprama2 = (sprama)this.clone();
        sprama2.cfr_renamed_757(arg0);
        long l = 0L;
        long l2 = 0L;
        int n3 = n = 0;
        while (n3 != sprama2.cfr_renamed_1.length) {
            int n4 = sprama2.cfr_renamed_1[n];
            l += (long)n4;
            int n5 = n4;
            l2 += (long)(n5 * n5);
            n3 = ++n;
        }
        long l3 = l;
        long l4 = l2 - l3 * l3 / (long)n2;
        return l4;
    }

    public sprama cfr_renamed_761() {
        int n;
        int n2 = this.cfr_renamed_1.length;
        int n3 = 0;
        sprama sprama2 = new sprama(n2 + 1);
        sprama2.cfr_renamed_1[0] = 1;
        sprama sprama3 = new sprama(n2 + 1);
        sprama sprama4 = new sprama(n2 + 1);
        sprama4.cfr_renamed_1 = sprzra.cfr_renamed_541(this.cfr_renamed_1, n2 + 1);
        sprama4.cfr_renamed_762(3);
        sprama sprama5 = new sprama(n2 + 1);
        sprama5.cfr_renamed_1[0] = -1;
        sprama5.cfr_renamed_1[n2] = 1;
        block0: while (true) {
            sprama sprama6 = sprama4;
            while (true) {
                if (sprama6.cfr_renamed_1[0] == 0) {
                    int n4;
                    int n5 = n4 = 1;
                    while (n5 <= n2) {
                        sprama4.cfr_renamed_1[n4 - 1] = sprama4.cfr_renamed_1[n4];
                        int n6 = n2 + 1 - n4;
                        int n7 = sprama3.cfr_renamed_1[n2 - n4];
                        sprama3.cfr_renamed_1[n6] = n7;
                        n5 = ++n4;
                    }
                    sprama4.cfr_renamed_1[n2] = 0;
                    ++n3;
                    sprama3.cfr_renamed_1[0] = 0;
                    if (!sprama4.cfr_renamed_763()) continue block0;
                    return null;
                }
                if (sprama4.cfr_renamed_764()) break block0;
                if (sprama4.cfr_renamed_749() < sprama5.cfr_renamed_749()) {
                    sprama sprama7 = sprama4;
                    sprama4 = sprama5;
                    sprama5 = sprama7;
                    sprama sprama8 = sprama2;
                    sprama2 = sprama3;
                    sprama3 = sprama8;
                }
                if (sprama4.cfr_renamed_1[0] == sprama5.cfr_renamed_1[0]) {
                    sprama sprama9 = sprama4;
                    sprama6 = sprama9;
                    sprama9.cfr_renamed_629(sprama5, 3);
                    sprama2.cfr_renamed_629(sprama3, 3);
                    continue;
                }
                sprama6 = sprama4;
                sprama4.cfr_renamed_765(sprama5, 3);
                sprama2.cfr_renamed_765(sprama3, 3);
            }
            break;
        }
        if (sprama2.cfr_renamed_1[n2] != 0) {
            return null;
        }
        sprama sprama10 = new sprama(n2);
        int n8 = 0;
        n3 %= n2;
        int n9 = n = n2 - 1;
        while (n9 >= 0) {
            n8 = n - n3;
            if (n8 < 0) {
                n8 += n2;
            }
            int n10 = sprama4.cfr_renamed_1[0] * sprama2.cfr_renamed_1[n];
            sprama10.cfr_renamed_1[n8] = n10;
            n9 = --n;
        }
        sprama sprama11 = sprama10;
        sprama11.cfr_renamed_766(3);
        return sprama11;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_762(int n) {
        void arg0;
        sprama sprama2 = this;
        sprama2.cfr_renamed_729((int)arg0);
        sprama2.cfr_renamed_766(n);
    }

    public void cfr_renamed_730(sprama arg0) {
        int n;
        if (arg0.cfr_renamed_1.length > this.cfr_renamed_1.length) {
            this.cfr_renamed_1 = sprzra.cfr_renamed_541(this.cfr_renamed_1, arg0.cfr_renamed_1.length);
        }
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_1.length) {
            int n3 = n;
            int n4 = this.cfr_renamed_1[n3] + arg0.cfr_renamed_1[n];
            this.cfr_renamed_1[n3] = n4;
            n2 = ++n;
        }
    }

    @Override
    public sprwna cfr_renamed_725(sprwna arg0) {
        return new sprwna(this).cfr_renamed_725(arg0);
    }

    public void cfr_renamed_767(int arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_1.length) {
            sprama sprama2 = this;
            while (sprama2.cfr_renamed_1[n] < -arg0 / 2) {
                sprama sprama3 = this;
                sprama2 = sprama3;
                int n3 = n;
                sprama3.cfr_renamed_1[n3] = sprama3.cfr_renamed_1[n3] + arg0;
            }
            sprama sprama4 = this;
            while (sprama4.cfr_renamed_1[n] > arg0 / 2) {
                sprama sprama5 = this;
                sprama4 = sprama5;
                int n4 = n;
                sprama5.cfr_renamed_1[n4] = sprama5.cfr_renamed_1[n4] - arg0;
            }
            n2 = ++n;
        }
    }

    public static sprama cfr_renamed_768(byte[] arg0, int arg1, int arg2) {
        return new sprama(sprona.cfr_renamed_719(arg0, arg1, arg2));
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_758(int n) {
        int n2;
        void arg0;
        this.cfr_renamed_729((int)arg0);
        int n3 = n2 = 0;
        while (n3 < this.cfr_renamed_1.length) {
            sprama sprama2 = this;
            while (sprama2.cfr_renamed_1[n2] < arg0 / 2) {
                sprama sprama3 = this;
                sprama2 = sprama3;
                int n4 = n2;
                sprama3.cfr_renamed_1[n4] = sprama3.cfr_renamed_1[n4] + arg0;
            }
            sprama sprama4 = this;
            while (sprama4.cfr_renamed_1[n2] >= arg0 / 2) {
                sprama sprama5 = this;
                sprama4 = sprama5;
                int n5 = n2;
                sprama5.cfr_renamed_1[n5] = sprama5.cfr_renamed_1[n5] - arg0;
            }
            n3 = ++n2;
        }
    }

    public sprama(int n) {
        this.cfr_renamed_1 = new int[n];
    }

    public boolean cfr_renamed_769() {
        int n;
        int n2 = n = 1;
        while (n2 < this.cfr_renamed_1.length) {
            if (this.cfr_renamed_1[n] != 0) {
                return false;
            }
            n2 = ++n;
        }
        return this.cfr_renamed_1[0] == 1;
    }

    private /* synthetic */ boolean cfr_renamed_763() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_1.length) {
            if (this.cfr_renamed_1[n] != 0) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    @Override
    public sprama cfr_renamed_723(sprama arg0) {
        int n = this.cfr_renamed_1.length;
        if (arg0.cfr_renamed_1.length != n) {
            throw new IllegalArgumentException(sprhao.cfr_renamed_9("G`dwlg)zo5jzlso|j|l{}f)x|f}5kp)aap)fhxl"));
        }
        sprama sprama2 = this.cfr_renamed_752(arg0);
        if (sprama2.cfr_renamed_1.length > n) {
            int n2;
            int n3 = n2 = n;
            while (n3 < sprama2.cfr_renamed_1.length) {
                int n4 = n2 - n;
                int n5 = sprama2.cfr_renamed_1[n4] + sprama2.cfr_renamed_1[n2];
                sprama2.cfr_renamed_1[n4] = n5;
                n3 = ++n2;
            }
            sprama2.cfr_renamed_1 = sprzra.cfr_renamed_541(sprama2.cfr_renamed_1, n);
        }
        return sprama2;
    }

    public void cfr_renamed_766(int arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_1.length) {
            sprama sprama2 = this;
            while (sprama2.cfr_renamed_1[n] < 0) {
                sprama sprama3 = this;
                sprama2 = sprama3;
                int n3 = n;
                sprama3.cfr_renamed_1[n3] = sprama3.cfr_renamed_1[n3] + arg0;
            }
            n2 = ++n;
        }
    }

    public void cfr_renamed_753(sprama arg0) {
        int n;
        if (arg0.cfr_renamed_1.length > this.cfr_renamed_1.length) {
            this.cfr_renamed_1 = sprzra.cfr_renamed_541(this.cfr_renamed_1, arg0.cfr_renamed_1.length);
        }
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_1.length) {
            int n3 = n;
            int n4 = this.cfr_renamed_1[n3] - arg0.cfr_renamed_1[n];
            this.cfr_renamed_1[n3] = n4;
            n2 = ++n;
        }
    }

    public void cfr_renamed_770(int arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_1.length) {
            sprama sprama2 = this;
            int n3 = n;
            sprama2.cfr_renamed_1[n3] = sprama2.cfr_renamed_1[n3] * 3;
            int n4 = n++;
            sprama2.cfr_renamed_1[n4] = sprama2.cfr_renamed_1[n4] % arg0;
            n2 = n;
        }
    }

    public void cfr_renamed_729(int arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_1.length) {
            int n3 = n++;
            this.cfr_renamed_1[n3] = this.cfr_renamed_1[n3] % arg0;
            n2 = n;
        }
    }

    public sprvqa cfr_renamed_771() {
        int n;
        LinkedList<Object> linkedList;
        BigInteger bigInteger;
        Object object;
        Object object2;
        Object object3;
        int n2 = this.cfr_renamed_1.length;
        LinkedList<Object> linkedList2 = new LinkedList<Object>();
        BigInteger bigInteger2 = null;
        BigInteger bigInteger3 = sprvma.cfr_renamed_2;
        BigInteger bigInteger4 = sprvma.cfr_renamed_2;
        int n3 = 1;
        Iterator iterator = cfr_renamed_4.iterator();
        while (true) {
            BigInteger bigInteger5;
            bigInteger2 = iterator.hasNext() ? (BigInteger)iterator.next() : bigInteger2.nextProbablePrime();
            object3 = this.cfr_renamed_748(bigInteger2.intValue());
            linkedList2.add(object3);
            object2 = bigInteger3.multiply(bigInteger2);
            object = sprfma.cfr_renamed_736(bigInteger2, bigInteger3);
            BigInteger bigInteger6 = bigInteger4;
            bigInteger4 = bigInteger6.multiply(((sprfma)object).cfr_renamed_2.multiply(bigInteger2));
            bigInteger = ((sprgna)object3).cfr_renamed_3.multiply(((sprfma)object).cfr_renamed_3.multiply(bigInteger3));
            bigInteger4 = bigInteger4.add(bigInteger).mod((BigInteger)object2);
            bigInteger3 = object2;
            BigInteger bigInteger7 = bigInteger3.divide(BigInteger.valueOf(2L));
            BigInteger bigInteger8 = bigInteger7.negate();
            if (bigInteger4.compareTo(bigInteger7) > 0) {
                bigInteger5 = bigInteger4 = bigInteger4.subtract(bigInteger3);
            } else {
                if (bigInteger4.compareTo(bigInteger8) < 0) {
                    bigInteger4 = bigInteger4.add(bigInteger3);
                }
                bigInteger5 = bigInteger4;
            }
            if (bigInteger5.equals(bigInteger6)) {
                if (++n3 < 3) continue;
                linkedList = linkedList2;
                break;
            }
            n3 = 1;
        }
        while (linkedList.size() > 1) {
            object3 = (sprgna)linkedList2.removeFirst();
            object2 = (sprgna)linkedList2.removeFirst();
            object = sprgna.cfr_renamed_735((sprgna)object3, (sprgna)object2);
            LinkedList<Object> linkedList3 = linkedList2;
            linkedList = linkedList3;
            linkedList3.addLast(object);
        }
        object3 = ((sprgna)linkedList2.getFirst()).cfr_renamed_4;
        object2 = bigInteger3.divide(BigInteger.valueOf(2L));
        object = ((BigInteger)object2).negate();
        if (bigInteger4.compareTo((BigInteger)object2) > 0) {
            bigInteger4 = bigInteger4.subtract(bigInteger3);
        }
        if (bigInteger4.compareTo((BigInteger)object) < 0) {
            bigInteger4 = bigInteger4.add(bigInteger3);
        }
        int n4 = n = 0;
        while (n4 < n2) {
            bigInteger = ((sprwna)object3).cfr_renamed_3[n];
            if (bigInteger.compareTo((BigInteger)object2) > 0) {
                ((sprwna)object3).cfr_renamed_3[n] = bigInteger.subtract(bigInteger3);
            }
            if (bigInteger.compareTo((BigInteger)object) < 0) {
                ((sprwna)object3).cfr_renamed_3[n] = bigInteger.add(bigInteger3);
            }
            n4 = ++n;
        }
        return new sprvqa((sprwna)object3, bigInteger4);
    }

    public void cfr_renamed_772() {
        int n;
        sprama sprama2 = this;
        int n2 = sprama2.cfr_renamed_1[sprama2.cfr_renamed_1.length - 1];
        int n3 = n = this.cfr_renamed_1.length - 1;
        while (n3 > 0) {
            sprama sprama3 = this;
            int n4 = n--;
            sprama3.cfr_renamed_1[n4] = sprama3.cfr_renamed_1[n4 - 1];
            n3 = n;
        }
        this.cfr_renamed_1[0] = n2;
    }

    public void cfr_renamed_751(int arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_1.length) {
            int n3 = n++;
            this.cfr_renamed_1[n3] = this.cfr_renamed_1[n3] * arg0;
            n2 = n;
        }
    }

    public int cfr_renamed_749() {
        int n;
        int n2 = n = this.cfr_renamed_1.length - 1;
        while (n2 > 0 && this.cfr_renamed_1[n] == 0) {
            n2 = --n;
        }
        return n;
    }

    static {
        int n;
        int[] nArray = new int[619];
        nArray[0] = 4507;
        nArray[1] = 4513;
        nArray[2] = 4517;
        nArray[3] = 4519;
        nArray[4] = 4523;
        nArray[5] = 4547;
        nArray[6] = 4549;
        nArray[7] = 4561;
        nArray[8] = 4567;
        nArray[9] = 4583;
        nArray[10] = 4591;
        nArray[11] = 4597;
        nArray[12] = 4603;
        nArray[13] = 4621;
        nArray[14] = 4637;
        nArray[15] = 4639;
        nArray[16] = 4643;
        nArray[17] = 4649;
        nArray[18] = 4651;
        nArray[19] = 4657;
        nArray[20] = 4663;
        nArray[21] = 4673;
        nArray[22] = 4679;
        nArray[23] = 4691;
        nArray[24] = 4703;
        nArray[25] = 4721;
        nArray[26] = 4723;
        nArray[27] = 4729;
        nArray[28] = 4733;
        nArray[29] = 4751;
        nArray[30] = 4759;
        nArray[31] = 4783;
        nArray[32] = 4787;
        nArray[33] = 4789;
        nArray[34] = 4793;
        nArray[35] = 4799;
        nArray[36] = 4801;
        nArray[37] = 4813;
        nArray[38] = 4817;
        nArray[39] = 4831;
        nArray[40] = 4861;
        nArray[41] = 4871;
        nArray[42] = 4877;
        nArray[43] = 4889;
        nArray[44] = 4903;
        nArray[45] = 4909;
        nArray[46] = 4919;
        nArray[47] = 4931;
        nArray[48] = 4933;
        nArray[49] = 4937;
        nArray[50] = 4943;
        nArray[51] = 4951;
        nArray[52] = 4957;
        nArray[53] = 4967;
        nArray[54] = 4969;
        nArray[55] = 4973;
        nArray[56] = 4987;
        nArray[57] = 4993;
        nArray[58] = 4999;
        nArray[59] = 5003;
        nArray[60] = 5009;
        nArray[61] = 5011;
        nArray[62] = 5021;
        nArray[63] = 5023;
        nArray[64] = 5039;
        nArray[65] = 5051;
        nArray[66] = 5059;
        nArray[67] = 5077;
        nArray[68] = 5081;
        nArray[69] = 5087;
        nArray[70] = 5099;
        nArray[71] = 5101;
        nArray[72] = 5107;
        nArray[73] = 5113;
        nArray[74] = 5119;
        nArray[75] = 5147;
        nArray[76] = 5153;
        nArray[77] = 5167;
        nArray[78] = 5171;
        nArray[79] = 5179;
        nArray[80] = 5189;
        nArray[81] = 5197;
        nArray[82] = 5209;
        nArray[83] = 5227;
        nArray[84] = 5231;
        nArray[85] = 5233;
        nArray[86] = 5237;
        nArray[87] = 5261;
        nArray[88] = 5273;
        nArray[89] = 5279;
        nArray[90] = 5281;
        nArray[91] = 5297;
        nArray[92] = 5303;
        nArray[93] = 5309;
        nArray[94] = 5323;
        nArray[95] = 5333;
        nArray[96] = 5347;
        nArray[97] = 5351;
        nArray[98] = 5381;
        nArray[99] = 5387;
        nArray[100] = 5393;
        nArray[101] = 5399;
        nArray[102] = 5407;
        nArray[103] = 5413;
        nArray[104] = 5417;
        nArray[105] = 5419;
        nArray[106] = 5431;
        nArray[107] = 5437;
        nArray[108] = 5441;
        nArray[109] = 5443;
        nArray[110] = 5449;
        nArray[111] = 5471;
        nArray[112] = 5477;
        nArray[113] = 5479;
        nArray[114] = 5483;
        nArray[115] = 5501;
        nArray[116] = 5503;
        nArray[117] = 5507;
        nArray[118] = 5519;
        nArray[119] = 5521;
        nArray[120] = 5527;
        nArray[121] = 5531;
        nArray[122] = 5557;
        nArray[123] = 5563;
        nArray[124] = 5569;
        nArray[125] = 5573;
        nArray[126] = 5581;
        nArray[127] = 5591;
        nArray[128] = 5623;
        nArray[129] = 5639;
        nArray[130] = 5641;
        nArray[131] = 5647;
        nArray[132] = 5651;
        nArray[133] = 5653;
        nArray[134] = 5657;
        nArray[135] = 5659;
        nArray[136] = 5669;
        nArray[137] = 5683;
        nArray[138] = 5689;
        nArray[139] = 5693;
        nArray[140] = 5701;
        nArray[141] = 5711;
        nArray[142] = 5717;
        nArray[143] = 5737;
        nArray[144] = 5741;
        nArray[145] = 5743;
        nArray[146] = 5749;
        nArray[147] = 5779;
        nArray[148] = 5783;
        nArray[149] = 5791;
        nArray[150] = 5801;
        nArray[151] = 5807;
        nArray[152] = 5813;
        nArray[153] = 5821;
        nArray[154] = 5827;
        nArray[155] = 5839;
        nArray[156] = 5843;
        nArray[157] = 5849;
        nArray[158] = 5851;
        nArray[159] = 5857;
        nArray[160] = 5861;
        nArray[161] = 5867;
        nArray[162] = 5869;
        nArray[163] = 5879;
        nArray[164] = 5881;
        nArray[165] = 5897;
        nArray[166] = 5903;
        nArray[167] = 5923;
        nArray[168] = 5927;
        nArray[169] = 5939;
        nArray[170] = 5953;
        nArray[171] = 5981;
        nArray[172] = 5987;
        nArray[173] = 6007;
        nArray[174] = 6011;
        nArray[175] = 6029;
        nArray[176] = 6037;
        nArray[177] = 6043;
        nArray[178] = 6047;
        nArray[179] = 6053;
        nArray[180] = 6067;
        nArray[181] = 6073;
        nArray[182] = 6079;
        nArray[183] = 6089;
        nArray[184] = 6091;
        nArray[185] = 6101;
        nArray[186] = 6113;
        nArray[187] = 6121;
        nArray[188] = 6131;
        nArray[189] = 6133;
        nArray[190] = 6143;
        nArray[191] = 6151;
        nArray[192] = 6163;
        nArray[193] = 6173;
        nArray[194] = 6197;
        nArray[195] = 6199;
        nArray[196] = 6203;
        nArray[197] = 6211;
        nArray[198] = 6217;
        nArray[199] = 6221;
        nArray[200] = 6229;
        nArray[201] = 6247;
        nArray[202] = 6257;
        nArray[203] = 6263;
        nArray[204] = 6269;
        nArray[205] = 6271;
        nArray[206] = 6277;
        nArray[207] = 6287;
        nArray[208] = 6299;
        nArray[209] = 6301;
        nArray[210] = 6311;
        nArray[211] = 6317;
        nArray[212] = 6323;
        nArray[213] = 6329;
        nArray[214] = 6337;
        nArray[215] = 6343;
        nArray[216] = 6353;
        nArray[217] = 6359;
        nArray[218] = 6361;
        nArray[219] = 6367;
        nArray[220] = 6373;
        nArray[221] = 6379;
        nArray[222] = 6389;
        nArray[223] = 6397;
        nArray[224] = 6421;
        nArray[225] = 6427;
        nArray[226] = 6449;
        nArray[227] = 6451;
        nArray[228] = 6469;
        nArray[229] = 6473;
        nArray[230] = 6481;
        nArray[231] = 6491;
        nArray[232] = 6521;
        nArray[233] = 6529;
        nArray[234] = 6547;
        nArray[235] = 6551;
        nArray[236] = 6553;
        nArray[237] = 6563;
        nArray[238] = 6569;
        nArray[239] = 6571;
        nArray[240] = 6577;
        nArray[241] = 6581;
        nArray[242] = 6599;
        nArray[243] = 6607;
        nArray[244] = 6619;
        nArray[245] = 6637;
        nArray[246] = 6653;
        nArray[247] = 6659;
        nArray[248] = 6661;
        nArray[249] = 6673;
        nArray[250] = 6679;
        nArray[251] = 6689;
        nArray[252] = 6691;
        nArray[253] = 6701;
        nArray[254] = 6703;
        nArray[255] = 6709;
        nArray[256] = 6719;
        nArray[257] = 6733;
        nArray[258] = 6737;
        nArray[259] = 6761;
        nArray[260] = 6763;
        nArray[261] = 6779;
        nArray[262] = 6781;
        nArray[263] = 6791;
        nArray[264] = 6793;
        nArray[265] = 6803;
        nArray[266] = 6823;
        nArray[267] = 6827;
        nArray[268] = 6829;
        nArray[269] = 6833;
        nArray[270] = 6841;
        nArray[271] = 6857;
        nArray[272] = 6863;
        nArray[273] = 6869;
        nArray[274] = 6871;
        nArray[275] = 6883;
        nArray[276] = 6899;
        nArray[277] = 6907;
        nArray[278] = 6911;
        nArray[279] = 6917;
        nArray[280] = 6947;
        nArray[281] = 6949;
        nArray[282] = 6959;
        nArray[283] = 6961;
        nArray[284] = 6967;
        nArray[285] = 6971;
        nArray[286] = 6977;
        nArray[287] = 6983;
        nArray[288] = 6991;
        nArray[289] = 6997;
        nArray[290] = 7001;
        nArray[291] = 7013;
        nArray[292] = 7019;
        nArray[293] = 7027;
        nArray[294] = 7039;
        nArray[295] = 7043;
        nArray[296] = 7057;
        nArray[297] = 7069;
        nArray[298] = 7079;
        nArray[299] = 7103;
        nArray[300] = 7109;
        nArray[301] = 7121;
        nArray[302] = 7127;
        nArray[303] = 7129;
        nArray[304] = 7151;
        nArray[305] = 7159;
        nArray[306] = 7177;
        nArray[307] = 7187;
        nArray[308] = 7193;
        nArray[309] = 7207;
        nArray[310] = 7211;
        nArray[311] = 7213;
        nArray[312] = 7219;
        nArray[313] = 7229;
        nArray[314] = 7237;
        nArray[315] = 7243;
        nArray[316] = 7247;
        nArray[317] = 7253;
        nArray[318] = 7283;
        nArray[319] = 7297;
        nArray[320] = 7307;
        nArray[321] = 7309;
        nArray[322] = 7321;
        nArray[323] = 7331;
        nArray[324] = 7333;
        nArray[325] = 7349;
        nArray[326] = 7351;
        nArray[327] = 7369;
        nArray[328] = 7393;
        nArray[329] = 7411;
        nArray[330] = 7417;
        nArray[331] = 7433;
        nArray[332] = 7451;
        nArray[333] = 7457;
        nArray[334] = 7459;
        nArray[335] = 7477;
        nArray[336] = 7481;
        nArray[337] = 7487;
        nArray[338] = 7489;
        nArray[339] = 7499;
        nArray[340] = 7507;
        nArray[341] = 7517;
        nArray[342] = 7523;
        nArray[343] = 7529;
        nArray[344] = 7537;
        nArray[345] = 7541;
        nArray[346] = 7547;
        nArray[347] = 7549;
        nArray[348] = 7559;
        nArray[349] = 7561;
        nArray[350] = 7573;
        nArray[351] = 7577;
        nArray[352] = 7583;
        nArray[353] = 7589;
        nArray[354] = 7591;
        nArray[355] = 7603;
        nArray[356] = 7607;
        nArray[357] = 7621;
        nArray[358] = 7639;
        nArray[359] = 7643;
        nArray[360] = 7649;
        nArray[361] = 7669;
        nArray[362] = 7673;
        nArray[363] = 7681;
        nArray[364] = 7687;
        nArray[365] = 7691;
        nArray[366] = 7699;
        nArray[367] = 7703;
        nArray[368] = 7717;
        nArray[369] = 7723;
        nArray[370] = 7727;
        nArray[371] = 7741;
        nArray[372] = 7753;
        nArray[373] = 7757;
        nArray[374] = 7759;
        nArray[375] = 7789;
        nArray[376] = 7793;
        nArray[377] = 7817;
        nArray[378] = 7823;
        nArray[379] = 7829;
        nArray[380] = 7841;
        nArray[381] = 7853;
        nArray[382] = 7867;
        nArray[383] = 7873;
        nArray[384] = 7877;
        nArray[385] = 7879;
        nArray[386] = 7883;
        nArray[387] = 7901;
        nArray[388] = 7907;
        nArray[389] = 7919;
        nArray[390] = 7927;
        nArray[391] = 7933;
        nArray[392] = 7937;
        nArray[393] = 7949;
        nArray[394] = 7951;
        nArray[395] = 7963;
        nArray[396] = 7993;
        nArray[397] = 8009;
        nArray[398] = 8011;
        nArray[399] = 8017;
        nArray[400] = 8039;
        nArray[401] = 8053;
        nArray[402] = 8059;
        nArray[403] = 8069;
        nArray[404] = 8081;
        nArray[405] = 8087;
        nArray[406] = 8089;
        nArray[407] = 8093;
        nArray[408] = 8101;
        nArray[409] = 8111;
        nArray[410] = 8117;
        nArray[411] = 8123;
        nArray[412] = 8147;
        nArray[413] = 8161;
        nArray[414] = 8167;
        nArray[415] = 8171;
        nArray[416] = 8179;
        nArray[417] = 8191;
        nArray[418] = 8209;
        nArray[419] = 8219;
        nArray[420] = 8221;
        nArray[421] = 8231;
        nArray[422] = 8233;
        nArray[423] = 8237;
        nArray[424] = 8243;
        nArray[425] = 8263;
        nArray[426] = 8269;
        nArray[427] = 8273;
        nArray[428] = 8287;
        nArray[429] = 8291;
        nArray[430] = 8293;
        nArray[431] = 8297;
        nArray[432] = 8311;
        nArray[433] = 8317;
        nArray[434] = 8329;
        nArray[435] = 8353;
        nArray[436] = 8363;
        nArray[437] = 8369;
        nArray[438] = 8377;
        nArray[439] = 8387;
        nArray[440] = 8389;
        nArray[441] = 8419;
        nArray[442] = 8423;
        nArray[443] = 8429;
        nArray[444] = 8431;
        nArray[445] = 8443;
        nArray[446] = 8447;
        nArray[447] = 8461;
        nArray[448] = 8467;
        nArray[449] = 8501;
        nArray[450] = 8513;
        nArray[451] = 8521;
        nArray[452] = 8527;
        nArray[453] = 8537;
        nArray[454] = 8539;
        nArray[455] = 8543;
        nArray[456] = 8563;
        nArray[457] = 8573;
        nArray[458] = 8581;
        nArray[459] = 8597;
        nArray[460] = 8599;
        nArray[461] = 8609;
        nArray[462] = 8623;
        nArray[463] = 8627;
        nArray[464] = 8629;
        nArray[465] = 8641;
        nArray[466] = 8647;
        nArray[467] = 8663;
        nArray[468] = 8669;
        nArray[469] = 8677;
        nArray[470] = 8681;
        nArray[471] = 8689;
        nArray[472] = 8693;
        nArray[473] = 8699;
        nArray[474] = 8707;
        nArray[475] = 8713;
        nArray[476] = 8719;
        nArray[477] = 8731;
        nArray[478] = 8737;
        nArray[479] = 8741;
        nArray[480] = 8747;
        nArray[481] = 8753;
        nArray[482] = 8761;
        nArray[483] = 8779;
        nArray[484] = 8783;
        nArray[485] = 8803;
        nArray[486] = 8807;
        nArray[487] = 8819;
        nArray[488] = 8821;
        nArray[489] = 8831;
        nArray[490] = 8837;
        nArray[491] = 8839;
        nArray[492] = 8849;
        nArray[493] = 8861;
        nArray[494] = 8863;
        nArray[495] = 8867;
        nArray[496] = 8887;
        nArray[497] = 8893;
        nArray[498] = 8923;
        nArray[499] = 8929;
        nArray[500] = 8933;
        nArray[501] = 8941;
        nArray[502] = 8951;
        nArray[503] = 8963;
        nArray[504] = 8969;
        nArray[505] = 8971;
        nArray[506] = 8999;
        nArray[507] = 9001;
        nArray[508] = 9007;
        nArray[509] = 9011;
        nArray[510] = 9013;
        nArray[511] = 9029;
        nArray[512] = 9041;
        nArray[513] = 9043;
        nArray[514] = 9049;
        nArray[515] = 9059;
        nArray[516] = 9067;
        nArray[517] = 9091;
        nArray[518] = 9103;
        nArray[519] = 9109;
        nArray[520] = 9127;
        nArray[521] = 9133;
        nArray[522] = 9137;
        nArray[523] = 9151;
        nArray[524] = 9157;
        nArray[525] = 9161;
        nArray[526] = 9173;
        nArray[527] = 9181;
        nArray[528] = 9187;
        nArray[529] = 9199;
        nArray[530] = 9203;
        nArray[531] = 9209;
        nArray[532] = 9221;
        nArray[533] = 9227;
        nArray[534] = 9239;
        nArray[535] = 9241;
        nArray[536] = 9257;
        nArray[537] = 9277;
        nArray[538] = 9281;
        nArray[539] = 9283;
        nArray[540] = 9293;
        nArray[541] = 9311;
        nArray[542] = 9319;
        nArray[543] = 9323;
        nArray[544] = 9337;
        nArray[545] = 9341;
        nArray[546] = 9343;
        nArray[547] = 9349;
        nArray[548] = 9371;
        nArray[549] = 9377;
        nArray[550] = 9391;
        nArray[551] = 9397;
        nArray[552] = 9403;
        nArray[553] = 9413;
        nArray[554] = 9419;
        nArray[555] = 9421;
        nArray[556] = 9431;
        nArray[557] = 9433;
        nArray[558] = 9437;
        nArray[559] = 9439;
        nArray[560] = 9461;
        nArray[561] = 9463;
        nArray[562] = 9467;
        nArray[563] = 9473;
        nArray[564] = 9479;
        nArray[565] = 9491;
        nArray[566] = 9497;
        nArray[567] = 9511;
        nArray[568] = 9521;
        nArray[569] = 9533;
        nArray[570] = 9539;
        nArray[571] = 9547;
        nArray[572] = 9551;
        nArray[573] = 9587;
        nArray[574] = 9601;
        nArray[575] = 9613;
        nArray[576] = 9619;
        nArray[577] = 9623;
        nArray[578] = 9629;
        nArray[579] = 9631;
        nArray[580] = 9643;
        nArray[581] = 9649;
        nArray[582] = 9661;
        nArray[583] = 9677;
        nArray[584] = 9679;
        nArray[585] = 9689;
        nArray[586] = 9697;
        nArray[587] = 9719;
        nArray[588] = 9721;
        nArray[589] = 9733;
        nArray[590] = 9739;
        nArray[591] = 9743;
        nArray[592] = 9749;
        nArray[593] = 9767;
        nArray[594] = 9769;
        nArray[595] = 9781;
        nArray[596] = 9787;
        nArray[597] = 9791;
        nArray[598] = 9803;
        nArray[599] = 9811;
        nArray[600] = 9817;
        nArray[601] = 9829;
        nArray[602] = 9833;
        nArray[603] = 9839;
        nArray[604] = 9851;
        nArray[605] = 9857;
        nArray[606] = 9859;
        nArray[607] = 9871;
        nArray[608] = 9883;
        nArray[609] = 9887;
        nArray[610] = 9901;
        nArray[611] = 9907;
        nArray[612] = 9923;
        nArray[613] = 9929;
        nArray[614] = 9931;
        nArray[615] = 9941;
        nArray[616] = 9949;
        nArray[617] = 9967;
        nArray[618] = 9973;
        cfr_renamed_2 = nArray;
        cfr_renamed_4 = new ArrayList();
        int n2 = n = 0;
        while (n2 != cfr_renamed_2.length) {
            int n3 = cfr_renamed_2[n];
            cfr_renamed_4.add(BigInteger.valueOf(n3));
            n2 = ++n;
        }
    }

    public sprvqa cfr_renamed_773() {
        int n;
        Object object;
        ExecutorService executorService;
        Object object2;
        Object object3;
        Object object4;
        BigInteger bigInteger;
        int n2;
        block13: {
            n2 = this.cfr_renamed_1.length;
            BigInteger bigInteger2 = this.cfr_renamed_774().pow((n2 + 1) / 2);
            bigInteger2 = bigInteger2.multiply(BigInteger.valueOf(2L).pow((this.cfr_renamed_749() + 1) / 2));
            BigInteger bigInteger3 = bigInteger2.multiply(BigInteger.valueOf(2L));
            BigInteger bigInteger4 = BigInteger.valueOf(10000L);
            bigInteger = sprvma.cfr_renamed_2;
            LinkedBlockingQueue<Object> linkedBlockingQueue = new LinkedBlockingQueue<Object>();
            Iterator iterator = cfr_renamed_4.iterator();
            ExecutorService executorService2 = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
            BigInteger bigInteger5 = bigInteger;
            while (bigInteger5.compareTo(bigInteger3) < 0) {
                ExecutorService executorService3;
                if (iterator.hasNext()) {
                    bigInteger4 = (BigInteger)iterator.next();
                    executorService3 = executorService2;
                } else {
                    bigInteger4 = bigInteger4.nextProbablePrime();
                    executorService3 = executorService2;
                }
                object4 = executorService3.submit(new sprqsa(this, bigInteger4.intValue(), null));
                linkedBlockingQueue.add(object4);
                bigInteger = bigInteger.multiply(bigInteger4);
                bigInteger5 = bigInteger;
            }
            object4 = null;
            LinkedBlockingQueue<Object> linkedBlockingQueue2 = linkedBlockingQueue;
            while (!linkedBlockingQueue2.isEmpty()) {
                block12: {
                    try {
                        object3 = (Future)linkedBlockingQueue.take();
                        object2 = (Future)linkedBlockingQueue.poll();
                        if (object2 != null) break block12;
                        object4 = (sprgna)object3.get();
                        executorService = executorService2;
                        break block13;
                    }
                    catch (Exception exception) {
                        throw new IllegalStateException(exception.toString());
                    }
                }
                object = executorService2.submit(new sprjva(this, (sprgna)object3.get(), (sprgna)object2.get(), null));
                linkedBlockingQueue.add(object);
                linkedBlockingQueue2 = linkedBlockingQueue;
            }
            executorService = executorService2;
        }
        executorService.shutdown();
        Future<sprgna> future = object4;
        object3 = ((sprgna)((Object)future)).cfr_renamed_3;
        object2 = ((sprgna)((Object)future)).cfr_renamed_4;
        object = bigInteger.divide(BigInteger.valueOf(2L));
        BigInteger bigInteger6 = ((BigInteger)object).negate();
        if (((BigInteger)object3).compareTo((BigInteger)object) > 0) {
            object3 = ((BigInteger)object3).subtract(bigInteger);
        }
        if (((BigInteger)object3).compareTo(bigInteger6) < 0) {
            object3 = ((BigInteger)object3).add(bigInteger);
        }
        int n3 = n = 0;
        while (n3 < n2) {
            BigInteger bigInteger7 = ((sprwna)object2).cfr_renamed_3[n];
            if (bigInteger7.compareTo((BigInteger)object) > 0) {
                ((sprwna)object2).cfr_renamed_3[n] = bigInteger7.subtract(bigInteger);
            }
            if (bigInteger7.compareTo(bigInteger6) < 0) {
                ((sprwna)object2).cfr_renamed_3[n] = bigInteger7.add(bigInteger);
            }
            n3 = ++n;
        }
        return new sprvqa((sprwna)object2, (BigInteger)object3);
    }

    public byte[] cfr_renamed_775() {
        return sprona.cfr_renamed_717(this.cfr_renamed_1);
    }

    public Object clone() {
        return new sprama((int[])this.cfr_renamed_1.clone());
    }

    public sprama(int[] nArray) {
        this.cfr_renamed_1 = nArray;
    }

    public void cfr_renamed_759(int arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_1.length) {
            int n3 = n++;
            this.cfr_renamed_1[n3] = this.cfr_renamed_1[n3] - arg0;
            n2 = n;
        }
    }

    @Override
    public sprama cfr_renamed_728(sprama arg0, int arg1) {
        sprama sprama2 = this.cfr_renamed_723(arg0);
        sprama2.cfr_renamed_729(arg1);
        return sprama2;
    }

    @Override
    public sprama cfr_renamed_131() {
        return (sprama)this.clone();
    }

    public static sprama cfr_renamed_776(byte[] arg0, int arg1) {
        return new sprama(sprona.cfr_renamed_713(arg0, arg1));
    }

    public static sprama cfr_renamed_777(InputStream arg0, int arg1, int arg2) throws IOException {
        return new sprama(sprona.cfr_renamed_720(arg0, arg1, arg2));
    }

    public sprama cfr_renamed_778(int arg0) {
        int n;
        int n2 = this.cfr_renamed_1.length;
        int n3 = 0;
        sprama sprama2 = new sprama(n2 + 1);
        sprama2.cfr_renamed_1[0] = 1;
        sprama sprama3 = new sprama(n2 + 1);
        sprama sprama4 = new sprama(n2 + 1);
        sprama4.cfr_renamed_1 = sprzra.cfr_renamed_541(this.cfr_renamed_1, n2 + 1);
        sprama4.cfr_renamed_762(2);
        sprama sprama5 = new sprama(n2 + 1);
        sprama5.cfr_renamed_1[0] = 1;
        sprama5.cfr_renamed_1[n2] = 1;
        block0: while (true) {
            sprama sprama6 = sprama4;
            while (true) {
                if (sprama6.cfr_renamed_1[0] == 0) {
                    int n4;
                    int n5 = n4 = 1;
                    while (n5 <= n2) {
                        sprama4.cfr_renamed_1[n4 - 1] = sprama4.cfr_renamed_1[n4];
                        int n6 = n2 + 1 - n4;
                        int n7 = sprama3.cfr_renamed_1[n2 - n4];
                        sprama3.cfr_renamed_1[n6] = n7;
                        n5 = ++n4;
                    }
                    sprama4.cfr_renamed_1[n2] = 0;
                    ++n3;
                    sprama3.cfr_renamed_1[0] = 0;
                    if (!sprama4.cfr_renamed_763()) continue block0;
                    return null;
                }
                if (sprama4.cfr_renamed_769()) break block0;
                if (sprama4.cfr_renamed_749() < sprama5.cfr_renamed_749()) {
                    sprama sprama7 = sprama4;
                    sprama4 = sprama5;
                    sprama5 = sprama7;
                    sprama sprama8 = sprama2;
                    sprama2 = sprama3;
                    sprama3 = sprama8;
                }
                sprama6 = sprama4;
                sprama4.cfr_renamed_765(sprama5, 2);
                sprama2.cfr_renamed_765(sprama3, 2);
            }
            break;
        }
        if (sprama2.cfr_renamed_1[n2] != 0) {
            return null;
        }
        sprama sprama9 = new sprama(n2);
        int n8 = 0;
        n3 %= n2;
        int n9 = n = n2 - 1;
        while (n9 >= 0) {
            n8 = n - n3;
            if (n8 < 0) {
                n8 += n2;
            }
            int n10 = sprama2.cfr_renamed_1[n];
            sprama9.cfr_renamed_1[n8] = n10;
            n9 = --n;
        }
        return this.cfr_renamed_779(sprama9, arg0);
    }

    private /* synthetic */ void cfr_renamed_750(sprama arg0, int arg1, int arg2, int arg3) {
        int n;
        int n2 = this.cfr_renamed_1.length;
        int n3 = n = arg2;
        while (n3 < n2) {
            sprama sprama2 = this;
            int n4 = n;
            int n5 = (sprama2.cfr_renamed_1[n] - arg0.cfr_renamed_1[n4 - arg2] * arg1) % arg3;
            sprama2.cfr_renamed_1[n4] = n5;
            n3 = ++n;
        }
    }

    public int cfr_renamed_780(int arg0) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 != this.cfr_renamed_1.length) {
            if (this.cfr_renamed_1[n] == arg0) {
                ++n2;
            }
            n3 = ++n;
        }
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_629(sprama sprama2, int n) {
        void arg0;
        sprama sprama3 = this;
        sprama3.cfr_renamed_753((sprama)arg0);
        sprama3.cfr_renamed_729(n);
    }

    public static sprama cfr_renamed_781(InputStream arg0, int arg1) throws IOException {
        return new sprama(sprona.cfr_renamed_721(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_765(sprama sprama2, int n) {
        void arg0;
        sprama sprama3 = this;
        sprama3.cfr_renamed_730((sprama)arg0);
        sprama3.cfr_renamed_729(n);
    }

    /*
     * WARNING - void declaration
     */
    public sprama(sprwna sprwna2) {
        void arg0;
        int n;
        this.cfr_renamed_1 = new int[sprwna2.cfr_renamed_3.length];
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_3.length) {
            int n3 = n++;
            this.cfr_renamed_1[n3] = arg0.cfr_renamed_3[n3].intValue();
            n2 = n;
        }
    }

    private /* synthetic */ BigInteger cfr_renamed_774() {
        int n;
        BigInteger bigInteger = sprvma.cfr_renamed_4;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_1.length) {
            long l = this.cfr_renamed_1[n] * this.cfr_renamed_1[n];
            bigInteger = bigInteger.add(BigInteger.valueOf(l));
            n2 = ++n;
        }
        return bigInteger;
    }

    private /* synthetic */ boolean cfr_renamed_764() {
        int n;
        int n2 = n = 1;
        while (n2 < this.cfr_renamed_1.length) {
            if (this.cfr_renamed_1[n] != 0) {
                return false;
            }
            n2 = ++n;
        }
        return Math.abs(this.cfr_renamed_1[0]) == 1;
    }

    private /* synthetic */ sprama cfr_renamed_779(sprama arg0, int arg1) {
        int n;
        if (sprhpa.cfr_renamed_709() && arg1 == 2048) {
            int n2;
            spryta spryta2 = new spryta(this);
            spryta spryta3 = new spryta(arg0);
            int n3 = n2 = 2;
            while (n3 < arg1) {
                spryta spryta4;
                spryta spryta5 = spryta4 = (spryta)spryta3.clone();
                spryta5.cfr_renamed_741((n2 *= 2) - 1);
                spryta3 = spryta2.cfr_renamed_744(spryta3).cfr_renamed_744(spryta3);
                spryta5.cfr_renamed_742(spryta3, n2 - 1);
                spryta3 = spryta5;
                n3 = n2;
            }
            return spryta3.cfr_renamed_131();
        }
        int n4 = n = 2;
        while (n4 < arg1) {
            sprama sprama2;
            sprama sprama3 = arg0;
            sprama sprama4 = sprama2 = new sprama(sprzra.cfr_renamed_541(sprama3.cfr_renamed_1, sprama3.cfr_renamed_1.length));
            sprama4.cfr_renamed_782(n *= 2);
            arg0 = this.cfr_renamed_728(arg0, n).cfr_renamed_728(arg0, n);
            sprama4.cfr_renamed_629(arg0, n);
            arg0 = sprama4;
            n4 = n;
        }
        return arg0;
    }

    public byte[] cfr_renamed_783(int arg0) {
        return sprona.cfr_renamed_718(this.cfr_renamed_1, arg0);
    }

    private /* synthetic */ void cfr_renamed_782(int arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_1.length) {
            sprama sprama2 = this;
            int n3 = n;
            sprama2.cfr_renamed_1[n3] = sprama2.cfr_renamed_1[n3] * 2;
            int n4 = n++;
            sprama2.cfr_renamed_1[n4] = sprama2.cfr_renamed_1[n4] % arg0;
            n2 = n;
        }
    }

    public void cfr_renamed_722() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_1.length) {
            this.cfr_renamed_1[n++] = 0;
            n2 = n;
        }
    }

    public static sprama cfr_renamed_784(byte[] arg0, int arg1) {
        return new sprama(sprona.cfr_renamed_716(arg0, arg1));
    }
}

