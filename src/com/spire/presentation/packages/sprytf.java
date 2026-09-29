/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbxf;
import com.spire.presentation.packages.sprceg;
import com.spire.presentation.packages.sprdso;
import com.spire.presentation.packages.sprgwf;
import com.spire.presentation.packages.spriyf;
import com.spire.presentation.packages.sprjig;
import com.spire.presentation.packages.sprkwf;
import com.spire.presentation.packages.sprldg;
import com.spire.presentation.packages.sprlyf;
import com.spire.presentation.packages.sprpcka;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruag;
import com.spire.presentation.packages.spruzf;
import com.spire.presentation.packages.sprvcg;
import com.spire.presentation.packages.sprzyf;
import java.util.Arrays;
import java.util.List;

@sprtea
public class sprytf {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void cfr_renamed_6515(sprceg arg0) {
        sprceg sprceg2 = arg0;
        synchronized (sprceg2) {
            int n;
            if (arg0.cfr_renamed_320() >= arg0.cfr_renamed_6511()) {
                throw new sprjig(new StringBuilder().insert(0, sprpcka.cfr_renamed_9("INR\u001dQOHK@ID\u001dJXX")).append(arg0.cfr_renamed_6512() ? sprdso.cfr_renamed_9("6\u001f~\rd\b") : "").append(sprpcka.cfr_renamed_9("\u0001TR\u001dDEI\\TNUXE")).toString());
            }
            sprceg sprceg3 = arg0;
            int n2 = n = sprceg3.cfr_renamed_2331();
            List<spriyf> list = sprceg3.cfr_renamed_6507();
            while (list.get(n2 - 1).cfr_renamed_320() == 1 << list.get(n2 - 1).cfr_renamed_6477().cfr_renamed_1153()) {
                if (--n2 != 0) continue;
                throw new sprjig(new StringBuilder().insert(0, sprdso.cfr_renamed_9("\u0004e\u001f6\u001cd\u0005`\rb\t6\u0007s\u0015")).append(arg0.cfr_renamed_6512() ? sprpcka.cfr_renamed_9("\u001dRU@OE") : "").append(sprdso.cfr_renamed_9("6\u0005eLs\u0014~\rc\u001fb\trLb\u0004sL{\rn\u0005{\u0019{Lz\u0005{\u0005bLp\u0003dLb\u0004\u007f\u001f6$E?6\u001cd\u0005`\rb\t6\u0007s\u0015")).toString());
            }
            int n3 = n2;
            while (n3 < n) {
                int n4 = n2;
                arg0.cfr_renamed_6510(n4);
                n3 = n4 + 1;
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprkwf cfr_renamed_6499(sprceg arg0, byte[] arg1) {
        sprceg sprceg2 = arg0;
        int n = sprceg2.cfr_renamed_2331();
        Object object = sprceg2;
        synchronized (sprceg2) {
            sprceg sprceg3 = arg0;
            sprytf.cfr_renamed_6515(sprceg3);
            List<spriyf> list = sprceg3.cfr_renamed_6507();
            List<sprlyf> list2 = sprceg3.cfr_renamed_1409();
            spriyf spriyf2 = sprceg3.cfr_renamed_6507().get(n - 1);
            int n2 = 0;
            spruag[] spruagArray = new spruag[n - 1];
            int n3 = n2;
            while (true) {
                if (n3 >= n - 1) {
                    arg0.cfr_renamed_6484();
                    // ** MonitorExit[var5_3] (shouldn't be in output)
                    object = spriyf2.cfr_renamed_5709().cfr_renamed_6494(spruagArray);
                    ((sprvcg)object).cfr_renamed_1197(arg1, 0, arg1.length);
                    return sprytf.cfr_renamed_6504(n, (sprvcg)object);
                }
                spruagArray[n2] = new spruag(list2.get(n2), list.get(n2 + 1).cfr_renamed_1157());
                n3 = n2 + 1;
            }
        }
    }

    public static sprceg cfr_renamed_6516(sprgwf arg0) {
        int n;
        spriyf[] spriyfArray = new spriyf[arg0.cfr_renamed_6518()];
        sprlyf[] sprlyfArray = new sprlyf[arg0.cfr_renamed_6518() - 1];
        sprgwf sprgwf2 = arg0;
        byte[] byArray = new byte[sprgwf2.cfr_renamed_6517()[0].cfr_renamed_6467().cfr_renamed_1186()];
        sprgwf2.cfr_renamed_1295().nextBytes(byArray);
        byte[] byArray2 = new byte[16];
        sprgwf2.cfr_renamed_1295().nextBytes(byArray2);
        byte[] byArray3 = new byte[]{};
        long l = 1L;
        int n2 = n = 0;
        while (n2 < spriyfArray.length) {
            long l2;
            if (n == 0) {
                l2 = l;
                spriyfArray[n] = new spriyf(arg0.cfr_renamed_6517()[n].cfr_renamed_6467(), arg0.cfr_renamed_6517()[n].cfr_renamed_6489(), 0, byArray2, 1 << arg0.cfr_renamed_6517()[n].cfr_renamed_6467().cfr_renamed_1153(), byArray);
            } else {
                spriyfArray[n] = new sprzyf(arg0.cfr_renamed_6517()[n].cfr_renamed_6467(), arg0.cfr_renamed_6517()[n].cfr_renamed_6489(), -1, byArray3, 1 << arg0.cfr_renamed_6517()[n].cfr_renamed_6467().cfr_renamed_1153(), byArray3);
                l2 = l;
            }
            int n3 = 1 << arg0.cfr_renamed_6517()[n].cfr_renamed_6467().cfr_renamed_1153();
            l = l2 * (long)n3;
            n2 = ++n;
        }
        if (l == 0L) {
            l = Long.MAX_VALUE;
        }
        return new sprceg(arg0.cfr_renamed_6518(), Arrays.asList(spriyfArray), Arrays.asList(sprlyfArray), 0L, l);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ 2;
        int cfr_ignored_0 = 4 << 4;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 3 << 1;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_6519(sprceg arg0) {
        sprceg sprceg2 = arg0;
        synchronized (sprceg2) {
            sprceg sprceg3 = arg0;
            sprytf.cfr_renamed_6515(sprceg3);
            sprceg3.cfr_renamed_6484();
            sprceg3.cfr_renamed_6507().get(arg0.cfr_renamed_2331() - 1).cfr_renamed_6484();
            return;
        }
    }

    public static boolean cfr_renamed_6500(sprldg arg0, sprkwf arg1, byte[] arg2) {
        int n;
        int n2;
        int n3 = arg1.cfr_renamed_6503();
        if (n3 + 1 != arg0.cfr_renamed_2331()) {
            return false;
        }
        sprlyf[] sprlyfArray = new sprlyf[n3 + 1];
        sprbxf[] sprbxfArray = new sprbxf[n3];
        int n4 = n2 = 0;
        while (n4 < n3) {
            int n5 = n2;
            sprlyfArray[n5] = arg1.cfr_renamed_6502()[n5].cfr_renamed_79();
            int n6 = n2++;
            sprbxfArray[n6] = arg1.cfr_renamed_6502()[n6].cfr_renamed_1157();
            n4 = n2;
        }
        sprlyfArray[n3] = arg1.cfr_renamed_79();
        sprbxf sprbxf2 = arg0.cfr_renamed_5942();
        int n7 = n = 0;
        while (n7 < n3) {
            sprlyf sprlyf2 = sprlyfArray[n];
            byte[] byArray = sprbxfArray[n].cfr_renamed_954();
            if (!spruzf.cfr_renamed_6468(sprbxf2, sprlyf2, byArray)) {
                return false;
            }
            try {
                sprbxf2 = sprbxfArray[n];
            }
            catch (Exception exception) {
                throw new IllegalStateException(exception.getMessage(), exception);
            }
            n7 = ++n;
        }
        return spruzf.cfr_renamed_6468(sprbxf2, sprlyfArray[n3], arg2);
    }

    public static sprkwf cfr_renamed_6504(int arg0, sprvcg arg1) {
        return new sprkwf(arg0 - 1, arg1.cfr_renamed_6495(), spruzf.cfr_renamed_6488(arg1));
    }
}

