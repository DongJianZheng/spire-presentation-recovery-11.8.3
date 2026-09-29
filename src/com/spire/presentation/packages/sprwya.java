/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprama;
import com.spire.presentation.packages.sprbta;
import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprcya;
import com.spire.presentation.packages.sprfma;
import com.spire.presentation.packages.sprhbb;
import com.spire.presentation.packages.sprk;
import com.spire.presentation.packages.sprpqa;
import com.spire.presentation.packages.sprsza;
import com.spire.presentation.packages.sprthb;
import com.spire.presentation.packages.sprvqa;
import com.spire.presentation.packages.sprwna;
import com.spire.presentation.packages.sprwnd;
import com.spire.presentation.packages.sprwua;
import com.spire.presentation.packages.spry;
import com.spire.presentation.packages.spryya;
import com.spire.presentation.packages.sprzya;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class sprwya
implements spry {
    private sprcya cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprwnd cfr_renamed_1223() {
        int n;
        int n2;
        sprzya sprzya2 = null;
        ExecutorService executorService = Executors.newCachedThreadPool();
        ArrayList<Future<sprsza>> arrayList = new ArrayList<Future<sprsza>>();
        int n3 = n2 = this.cfr_renamed_4.cfr_renamed_132;
        while (n3 >= 0) {
            arrayList.add(executorService.submit(new sprthb(this, null)));
            n3 = --n2;
        }
        executorService.shutdown();
        ArrayList<sprsza> arrayList2 = new ArrayList<sprsza>();
        int n4 = n = this.cfr_renamed_4.cfr_renamed_132;
        while (true) {
            if (n4 < 0) {
                sprhbb sprhbb2 = new sprhbb(arrayList2, sprzya2);
                return new sprwnd(sprzya2, sprhbb2);
            }
            Future future = (Future)arrayList.get(n);
            try {
                arrayList2.add((sprsza)future.get());
                if (n == this.cfr_renamed_4.cfr_renamed_132) {
                    sprzya2 = new sprzya(((sprsza)future.get()).cfr_renamed_1, this.cfr_renamed_4.cfr_renamed_1312());
                }
            }
            catch (Exception exception) {
                throw new IllegalStateException(exception);
            }
            n4 = --n;
        }
    }

    @Override
    public void cfr_renamed_1222(sprccb arg0) {
        this.cfr_renamed_4 = (sprcya)arg0;
    }

    private /* synthetic */ void cfr_renamed_1317(sprama arg0, sprama arg1, sprama arg2, sprama arg3, int arg4) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg4) {
            int n4 = arg0.cfr_renamed_1[n] * arg0.cfr_renamed_1[n] + arg1.cfr_renamed_1[n] * arg1.cfr_renamed_1[n];
            n2 += 2 * arg4 * n4;
            n3 = ++n;
        }
        n2 -= 4;
        sprama sprama2 = (sprama)arg0.clone();
        sprama sprama3 = (sprama)arg1.clone();
        int n5 = 0;
        int n6 = arg4;
        int n7 = n5;
        for (int i = 0; n7 < n6 && i < arg4; ++i) {
            int n8;
            int n9;
            int n10 = 0;
            int n11 = n9 = 0;
            while (n11 < arg4) {
                n8 = arg2.cfr_renamed_1[n9] * arg0.cfr_renamed_1[n9];
                int n12 = arg3.cfr_renamed_1[n9] * arg1.cfr_renamed_1[n9];
                int n13 = 4 * arg4 * (n8 + n12);
                n10 += n13;
                n11 = ++n9;
            }
            n8 = 4 * (arg2.cfr_renamed_754() + arg3.cfr_renamed_754());
            if ((n10 -= n8) > n2) {
                arg2.cfr_renamed_753(sprama2);
                arg3.cfr_renamed_753(sprama3);
                i = 0;
            } else if (n10 < -n2) {
                ++n5;
                arg2.cfr_renamed_730(sprama2);
                arg3.cfr_renamed_730(sprama3);
                i = 0;
            }
            n7 = ++n5;
            sprama2.cfr_renamed_772();
            sprama3.cfr_renamed_772();
        }
    }

    public sprsza cfr_renamed_1318() {
        spryya spryya2;
        while (!(spryya2 = this.cfr_renamed_1319()).cfr_renamed_1320()) {
        }
        return spryya2;
    }

    public sprwnd cfr_renamed_1321() {
        int n;
        ArrayList<sprsza> arrayList = new ArrayList<sprsza>();
        sprzya sprzya2 = null;
        int n2 = n = this.cfr_renamed_4.cfr_renamed_132;
        while (n2 >= 0) {
            sprsza sprsza2 = this.cfr_renamed_1318();
            arrayList.add(sprsza2);
            if (n == 0) {
                sprzya2 = new sprzya(sprsza2.cfr_renamed_1, this.cfr_renamed_4.cfr_renamed_1312());
            }
            n2 = --n;
        }
        sprhbb sprhbb2 = new sprhbb(arrayList, sprzya2);
        return new sprwnd(sprzya2, sprhbb2);
    }

    private /* synthetic */ spryya cfr_renamed_1319() {
        Object object;
        sprwna sprwna2;
        sprwna sprwna3;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        sprfma sprfma2;
        sprvqa sprvqa2;
        sprama sprama2;
        sprwua sprwua2;
        sprk sprk2;
        sprama sprama3;
        sprama sprama4;
        sprwya sprwya2 = this;
        int n = sprwya2.cfr_renamed_4.cfr_renamed_88;
        int n2 = sprwya2.cfr_renamed_4.cfr_renamed_953;
        int n3 = sprwya2.cfr_renamed_4.cfr_renamed_31;
        int n4 = sprwya2.cfr_renamed_4.cfr_renamed_152;
        int n5 = sprwya2.cfr_renamed_4.cfr_renamed_126;
        int n6 = sprwya2.cfr_renamed_4.cfr_renamed_0;
        int n7 = sprwya2.cfr_renamed_4.cfr_renamed_4;
        int n8 = 2 * n + 1;
        boolean bl = sprwya2.cfr_renamed_4.spr\ufe34;
        do {
            sprk2 = this.cfr_renamed_4.cfr_renamed_137 == 0 ? sprwua.cfr_renamed_708(n, n3 + 1, n3, new SecureRandom()) : sprpqa.cfr_renamed_734(n, n4, n5, n6 + 1, n6, new SecureRandom());
            sprama4 = sprk2.cfr_renamed_131();
        } while (bl && sprama4.cfr_renamed_748((int)n8).cfr_renamed_3.equals(BigInteger.ZERO) || (sprama3 = sprama4.cfr_renamed_778(n2)) == null);
        sprvqa sprvqa3 = sprama4.cfr_renamed_771();
        while (true) {
            sprwua2 = this.cfr_renamed_4.cfr_renamed_137 == 0 ? sprwua.cfr_renamed_708(n, n3 + 1, n3, new SecureRandom()) : sprpqa.cfr_renamed_734(n, n4, n5, n6 + 1, n6, new SecureRandom());
            sprama2 = sprwua2.cfr_renamed_131();
            if (bl && sprama2.cfr_renamed_748((int)n8).cfr_renamed_3.equals(BigInteger.ZERO) || sprama2.cfr_renamed_778(n2) == null) continue;
            sprvqa2 = sprama2.cfr_renamed_771();
            sprfma2 = sprfma.cfr_renamed_736(sprvqa3.cfr_renamed_3, sprvqa2.cfr_renamed_3);
            if (sprfma2.cfr_renamed_4.equals(BigInteger.ONE)) break;
        }
        sprwna sprwna4 = (sprwna)sprvqa3.cfr_renamed_4.clone();
        sprwna4.cfr_renamed_737(sprfma2.cfr_renamed_2.multiply(BigInteger.valueOf(n2)));
        sprwna sprwna5 = (sprwna)sprvqa2.cfr_renamed_4.clone();
        sprwna5.cfr_renamed_737(sprfma2.cfr_renamed_3.multiply(BigInteger.valueOf(-n2)));
        if (this.cfr_renamed_4.cfr_renamed_2 == 0) {
            int n9;
            object7 = new int[n];
            object6 = new int[n];
            object7[0] = sprama4.cfr_renamed_1[0];
            object6[0] = sprama2.cfr_renamed_1[0];
            int n10 = n9 = 1;
            while (n10 < n) {
                int n11 = n9;
                object7[n11] = sprama4.cfr_renamed_1[n - n11];
                int n12 = n9++;
                object6[n12] = sprama2.cfr_renamed_1[n - n12];
                n10 = n9;
            }
            object5 = new sprama((int[])object7);
            object4 = new sprama((int[])object6);
            object3 = sprk2.cfr_renamed_723((sprama)object5);
            ((sprama)object3).cfr_renamed_730(sprwua2.cfr_renamed_723((sprama)object4));
            object2 = ((sprama)object3).cfr_renamed_771();
            sprwna sprwna6 = sprwna3 = ((sprama)object5).cfr_renamed_725(sprwna5);
            sprwna6.cfr_renamed_733(((sprama)object4).cfr_renamed_725(sprwna4));
            sprwna3 = sprwna6.cfr_renamed_725(((sprvqa)object2).cfr_renamed_4);
            sprwna2 = sprwna5;
            sprwna3.cfr_renamed_789(((sprvqa)object2).cfr_renamed_3);
        } else {
            int n13;
            int n14 = 0;
            int n15 = n13 = 1;
            while (n15 < n) {
                ++n14;
                n15 = n13 * 10;
            }
            object6 = sprvqa3.cfr_renamed_4.cfr_renamed_787(new BigDecimal(sprvqa3.cfr_renamed_3), sprwna5.cfr_renamed_792() + 1 + n14);
            object5 = sprvqa2.cfr_renamed_4.cfr_renamed_787(new BigDecimal(sprvqa2.cfr_renamed_3), sprwna4.cfr_renamed_792() + 1 + n14);
            object4 = ((sprbta)object6).cfr_renamed_725(sprwna5);
            ((sprbta)object4).cfr_renamed_800(((sprbta)object5).cfr_renamed_725(sprwna4));
            ((sprbta)object4).cfr_renamed_803();
            sprwna3 = ((sprbta)object4).cfr_renamed_802();
            sprwna2 = sprwna5;
        }
        object7 = (sprwna)sprwna2.clone();
        ((sprwna)object7).cfr_renamed_793(sprk2.cfr_renamed_725(sprwna3));
        object6 = (sprwna)sprwna4.clone();
        ((sprwna)object6).cfr_renamed_793(sprwua2.cfr_renamed_725(sprwna3));
        object5 = new sprama((sprwna)object7);
        object4 = new sprama((sprwna)object6);
        this.cfr_renamed_1317(sprama4, sprama2, (sprama)object5, (sprama)object4, n);
        if (n7 == 0) {
            object3 = object5;
            object = object2 = sprwua2.cfr_renamed_728(sprama3, n2);
        } else {
            object3 = sprwua2;
            object = object2 = ((sprama)object5).cfr_renamed_728(sprama3, n2);
        }
        ((sprama)object).cfr_renamed_762(n2);
        return new spryya(this, sprk2, (sprk)object3, (sprama)object2, (sprama)object5, (sprama)object4, this.cfr_renamed_4);
    }
}

