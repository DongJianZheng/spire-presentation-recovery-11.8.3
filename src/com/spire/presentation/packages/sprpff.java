/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraxe;
import com.spire.presentation.packages.sprchf;
import com.spire.presentation.packages.sprdaf;
import com.spire.presentation.packages.spreye;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprhgf;
import com.spire.presentation.packages.sprhhf;
import com.spire.presentation.packages.sprhm;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.sprkef;
import com.spire.presentation.packages.sprngf;
import com.spire.presentation.packages.sprnze;
import com.spire.presentation.packages.sproaf;
import com.spire.presentation.packages.sprobf;
import com.spire.presentation.packages.sprsgf;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprxaf;
import com.spire.presentation.packages.sprybl;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class sprpff
implements sprii {
    private sproaf cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_5609(sprhgf arg0, sprhgf arg1, sprhgf arg2, sprhgf arg3, int arg4) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg4) {
            int n4 = arg0.cfr_renamed_3[n] * arg0.cfr_renamed_3[n] + arg1.cfr_renamed_3[n] * arg1.cfr_renamed_3[n];
            n2 += 2 * arg4 * n4;
            n3 = ++n;
        }
        n2 -= 4;
        sprhgf sprhgf2 = (sprhgf)arg0.clone();
        sprhgf sprhgf3 = (sprhgf)arg1.clone();
        int n5 = 0;
        int n6 = arg4;
        int n7 = n5;
        for (int i = 0; n7 < n6 && i < arg4; ++i) {
            int n8;
            int n9;
            int n10 = 0;
            int n11 = n9 = 0;
            while (n11 < arg4) {
                n8 = arg2.cfr_renamed_3[n9] * arg0.cfr_renamed_3[n9];
                int n12 = arg3.cfr_renamed_3[n9] * arg1.cfr_renamed_3[n9];
                int n13 = 4 * arg4 * (n8 + n12);
                n10 += n13;
                n11 = ++n9;
            }
            n8 = 4 * (arg2.cfr_renamed_754() + arg3.cfr_renamed_754());
            if ((n10 -= n8) > n2) {
                arg2.cfr_renamed_5456(sprhgf2);
                arg3.cfr_renamed_5456(sprhgf3);
                i = 0;
            } else if (n10 < -n2) {
                ++n5;
                arg2.cfr_renamed_5444(sprhgf2);
                arg3.cfr_renamed_5444(sprhgf3);
                i = 0;
            }
            n7 = ++n5;
            sprhgf2.cfr_renamed_772();
            sprhgf3.cfr_renamed_772();
        }
    }

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        this.cfr_renamed_4 = (sproaf)arg0;
    }

    private /* synthetic */ sprobf cfr_renamed_1319() {
        Object object;
        sprsgf sprsgf2;
        sprsgf sprsgf3;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        sprxaf sprxaf2;
        sprhhf sprhhf2;
        sprhgf sprhgf2;
        sprchf sprchf2;
        sprchf sprchf3;
        sprhgf sprhgf3;
        sprhgf sprhgf4;
        sprpff sprpff2 = this;
        int n = sprpff2.cfr_renamed_4.cfr_renamed_137;
        int n2 = sprpff2.cfr_renamed_4.cfr_renamed_287;
        int n3 = sprpff2.cfr_renamed_4.cfr_renamed_105;
        int n4 = sprpff2.cfr_renamed_4.cfr_renamed_88;
        int n5 = sprpff2.cfr_renamed_4.cfr_renamed_152;
        int n6 = sprpff2.cfr_renamed_4.cfr_renamed_132;
        int n7 = sprpff2.cfr_renamed_4.cfr_renamed_272;
        int n8 = 2 * n + 1;
        boolean bl = sprpff2.cfr_renamed_4.cfr_renamed_4;
        do {
            sprchf3 = this.cfr_renamed_4.cfr_renamed_1 == 0 ? sprchf.cfr_renamed_708(n, n3 + 1, n3, sprybl.cfr_renamed_2794()) : spreye.cfr_renamed_734(n, n4, n5, n6 + 1, n6, sprybl.cfr_renamed_2794());
            sprhgf4 = sprchf3.cfr_renamed_131();
        } while (bl && sprhgf4.cfr_renamed_748((int)n8).cfr_renamed_4.equals(BigInteger.ZERO) || (sprhgf3 = sprhgf4.cfr_renamed_778(n2)) == null);
        sprhhf sprhhf3 = sprhgf4.cfr_renamed_771();
        while (true) {
            sprchf2 = this.cfr_renamed_4.cfr_renamed_1 == 0 ? sprchf.cfr_renamed_708(n, n3 + 1, n3, sprybl.cfr_renamed_2794()) : spreye.cfr_renamed_734(n, n4, n5, n6 + 1, n6, sprybl.cfr_renamed_2794());
            sprhgf2 = sprchf2.cfr_renamed_131();
            if (bl && sprhgf2.cfr_renamed_748((int)n8).cfr_renamed_4.equals(BigInteger.ZERO) || sprhgf2.cfr_renamed_778(n2) == null) continue;
            sprhhf2 = sprhgf2.cfr_renamed_771();
            sprxaf2 = sprxaf.cfr_renamed_736(sprhhf3.cfr_renamed_4, sprhhf2.cfr_renamed_4);
            if (sprxaf2.cfr_renamed_2.equals(BigInteger.ONE)) break;
        }
        sprsgf sprsgf4 = (sprsgf)sprhhf3.cfr_renamed_3.clone();
        sprsgf4.cfr_renamed_737(sprxaf2.cfr_renamed_3.multiply(BigInteger.valueOf(n2)));
        sprsgf sprsgf5 = (sprsgf)sprhhf2.cfr_renamed_3.clone();
        sprsgf5.cfr_renamed_737(sprxaf2.cfr_renamed_4.multiply(BigInteger.valueOf(-n2)));
        if (this.cfr_renamed_4.cfr_renamed_31 == 0) {
            int n9;
            object7 = new int[n];
            object6 = new int[n];
            object7[0] = sprhgf4.cfr_renamed_3[0];
            object6[0] = sprhgf2.cfr_renamed_3[0];
            int n10 = n9 = 1;
            while (n10 < n) {
                int n11 = n9;
                object7[n11] = sprhgf4.cfr_renamed_3[n - n11];
                int n12 = n9++;
                object6[n12] = sprhgf2.cfr_renamed_3[n - n12];
                n10 = n9;
            }
            object5 = new sprhgf((int[])object7);
            object4 = new sprhgf((int[])object6);
            object3 = sprchf3.cfr_renamed_5442((sprhgf)object5);
            ((sprhgf)object3).cfr_renamed_5444(sprchf2.cfr_renamed_5442((sprhgf)object4));
            object2 = ((sprhgf)object3).cfr_renamed_771();
            sprsgf sprsgf6 = sprsgf3 = ((sprhgf)object5).cfr_renamed_5443(sprsgf5);
            sprsgf6.cfr_renamed_5445(((sprhgf)object4).cfr_renamed_5443(sprsgf4));
            sprsgf3 = sprsgf6.cfr_renamed_5443(((sprhhf)object2).cfr_renamed_3);
            sprsgf2 = sprsgf5;
            sprsgf3.cfr_renamed_789(((sprhhf)object2).cfr_renamed_4);
        } else {
            int n13;
            int n14 = 0;
            int n15 = n13 = 1;
            while (n15 < n) {
                ++n14;
                n15 = n13 * 10;
            }
            object6 = sprhhf3.cfr_renamed_3.cfr_renamed_787(new BigDecimal(sprhhf3.cfr_renamed_4), sprsgf5.cfr_renamed_792() + 1 + n14);
            object5 = sprhhf2.cfr_renamed_3.cfr_renamed_787(new BigDecimal(sprhhf2.cfr_renamed_4), sprsgf4.cfr_renamed_792() + 1 + n14);
            object4 = ((spraxe)object6).cfr_renamed_5443(sprsgf5);
            ((spraxe)object4).cfr_renamed_5466(((spraxe)object5).cfr_renamed_5443(sprsgf4));
            ((spraxe)object4).cfr_renamed_803();
            sprsgf3 = ((spraxe)object4).cfr_renamed_802();
            sprsgf2 = sprsgf5;
        }
        object7 = (sprsgf)sprsgf2.clone();
        ((sprsgf)object7).cfr_renamed_5461(sprchf3.cfr_renamed_5443(sprsgf3));
        object6 = (sprsgf)sprsgf4.clone();
        ((sprsgf)object6).cfr_renamed_5461(sprchf2.cfr_renamed_5443(sprsgf3));
        object5 = new sprhgf((sprsgf)object7);
        object4 = new sprhgf((sprsgf)object6);
        this.cfr_renamed_5609(sprhgf4, sprhgf2, (sprhgf)object5, (sprhgf)object4, n);
        if (n7 == 0) {
            object3 = object5;
            object = object2 = sprchf2.cfr_renamed_3238(sprhgf3, n2);
        } else {
            object3 = sprchf2;
            object = object2 = ((sprhgf)object5).cfr_renamed_3238(sprhgf3, n2);
        }
        ((sprhgf)object).cfr_renamed_762(n2);
        return new sprobf(sprchf3, (sprhm)object3, (sprhgf)object2, (sprhgf)object5, (sprhgf)object4, this.cfr_renamed_4);
    }

    public sprsil cfr_renamed_1321() {
        int n;
        ArrayList<sprnze> arrayList = new ArrayList<sprnze>();
        sprngf sprngf2 = null;
        int n2 = n = this.cfr_renamed_4.cfr_renamed_119;
        while (n2 >= 0) {
            sprnze sprnze2 = this.cfr_renamed_1318();
            arrayList.add(sprnze2);
            if (n == 0) {
                sprngf2 = new sprngf(sprnze2.cfr_renamed_1, this.cfr_renamed_4.cfr_renamed_1312());
            }
            n2 = --n;
        }
        sprdaf sprdaf2 = new sprdaf(arrayList, sprngf2);
        return new sprsil(sprngf2, sprdaf2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprsil cfr_renamed_1223() {
        int n;
        int n2;
        sprngf sprngf2 = null;
        ExecutorService executorService = Executors.newCachedThreadPool();
        ArrayList<Future<sprnze>> arrayList = new ArrayList<Future<sprnze>>();
        int n3 = n2 = this.cfr_renamed_4.cfr_renamed_119;
        while (n3 >= 0) {
            arrayList.add(executorService.submit(new sprkef(this, null)));
            n3 = --n2;
        }
        executorService.shutdown();
        ArrayList<sprnze> arrayList2 = new ArrayList<sprnze>();
        int n4 = n = this.cfr_renamed_4.cfr_renamed_119;
        while (true) {
            if (n4 < 0) {
                sprdaf sprdaf2 = new sprdaf(arrayList2, sprngf2);
                return new sprsil(sprngf2, sprdaf2);
            }
            Future future = (Future)arrayList.get(n);
            try {
                arrayList2.add((sprnze)future.get());
                if (n == this.cfr_renamed_4.cfr_renamed_119) {
                    sprngf2 = new sprngf(((sprnze)future.get()).cfr_renamed_1, this.cfr_renamed_4.cfr_renamed_1312());
                }
            }
            catch (Exception exception) {
                throw new IllegalStateException(exception);
            }
            n4 = --n;
        }
    }

    public sprnze cfr_renamed_1318() {
        sprobf sprobf2;
        while (!(sprobf2 = this.cfr_renamed_1319()).cfr_renamed_1320()) {
        }
        return sprobf2;
    }
}

