/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprieg;
import com.spire.presentation.packages.spriyf;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprjpfa;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprldg;
import com.spire.presentation.packages.sprlk;
import com.spire.presentation.packages.sprlyf;
import com.spire.presentation.packages.sprnuf;
import com.spire.presentation.packages.sproah;
import com.spire.presentation.packages.sprodg;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.spruag;
import com.spire.presentation.packages.sprutf;
import com.spire.presentation.packages.spruzf;
import com.spire.presentation.packages.sprvcg;
import com.spire.presentation.packages.sprxag;
import com.spire.presentation.packages.sprytf;
import com.spire.presentation.packages.sprztf;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class sprceg
extends sprodg
implements sprlk {
    private final int cfr_renamed_119;
    private List<sprlyf> cfr_renamed_91;
    private List<spriyf> cfr_renamed_0;
    private final long cfr_renamed_1;
    private final boolean cfr_renamed_2;
    private sprldg cfr_renamed_3;
    private long cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_5712(sprvcg arg0) {
        try {
            return sprytf.cfr_renamed_6504(this.cfr_renamed_2331(), arg0).cfr_renamed_91();
        }
        catch (IOException iOException) {
            throw new IllegalStateException(new StringBuilder().insert(0, sproah.cfr_renamed_9(")\u000b=\u00070\u0000|\u00113E9\u000b?\n8\u0000|\u00165\u00022\u0004(\u0010.\u0000fE")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public synchronized sprldg cfr_renamed_1157() {
        return new sprldg(this.cfr_renamed_119, this.cfr_renamed_6505().cfr_renamed_1157());
    }

    public int cfr_renamed_2331() {
        return this.cfr_renamed_119;
    }

    public void cfr_renamed_6506() {
        int n;
        spriyf[] spriyfArray;
        int n2;
        sprceg sprceg2 = this;
        List<spriyf> list = sprceg2.cfr_renamed_6507();
        long[] lArray = new long[list.size()];
        long l = sprceg2.cfr_renamed_320();
        int n3 = n2 = list.size() - 1;
        while (n3 >= 0) {
            spriyfArray = list.get(n2).cfr_renamed_6477();
            int n4 = (1 << spriyfArray.cfr_renamed_1153()) - 1;
            long l2 = l;
            lArray[n2] = l2 & (long)n4;
            l = l2 >>> spriyfArray.cfr_renamed_1153();
            n3 = --n2;
        }
        n2 = 0;
        List<spriyf> list2 = list;
        spriyfArray = list2.toArray(new spriyf[list2.size()]);
        sprceg sprceg3 = this;
        sprlyf[] sprlyfArray = sprceg3.cfr_renamed_91.toArray(new sprlyf[sprceg3.cfr_renamed_91.size()]);
        spriyf spriyf2 = this.cfr_renamed_6505();
        if ((long)(spriyfArray[0].cfr_renamed_320() - 1) != lArray[0]) {
            spriyfArray[0] = spruzf.cfr_renamed_6490(spriyf2.cfr_renamed_6477(), spriyf2.cfr_renamed_6474(), (int)lArray[0], spriyf2.cfr_renamed_6439(), spriyf2.cfr_renamed_2667());
            n2 = 1;
        }
        int n5 = n = 1;
        while (n5 < lArray.length) {
            boolean bl;
            sprnuf sprnuf2;
            spriyf spriyf3 = spriyfArray[n - 1];
            int n6 = spriyf3.cfr_renamed_6474().cfr_renamed_1146();
            byte[] byArray = new byte[16];
            byte[] byArray2 = new byte[n6];
            sprnuf sprnuf3 = sprnuf2 = new sprnuf(spriyf3.cfr_renamed_6439(), spriyf3.cfr_renamed_2667(), sprieg.cfr_renamed_6447(spriyf3.cfr_renamed_6474()));
            sprnuf sprnuf4 = sprnuf2;
            sprnuf4.cfr_renamed_6442((int)lArray[n - 1]);
            sprnuf4.cfr_renamed_6440(-2);
            sprnuf3.cfr_renamed_6437(byArray2, true);
            byte[] byArray3 = new byte[n6];
            sprnuf3.cfr_renamed_6437(byArray3, false);
            System.arraycopy(byArray3, 0, byArray, 0, byArray.length);
            boolean bl2 = n < lArray.length - 1 ? lArray[n] == (long)(spriyfArray[n].cfr_renamed_320() - 1) : lArray[n] == (long)spriyfArray[n].cfr_renamed_320();
            boolean bl3 = bl = sproze.cfr_renamed_92(byArray, spriyfArray[n].cfr_renamed_6439()) && sproze.cfr_renamed_92(byArray2, spriyfArray[n].cfr_renamed_2667());
            if (!bl) {
                int n7 = n;
                spriyfArray[n7] = spruzf.cfr_renamed_6490(list.get(n7).cfr_renamed_6477(), list.get(n).cfr_renamed_6474(), (int)lArray[n], byArray, byArray2);
                sprlyfArray[n - 1] = spruzf.cfr_renamed_6469(spriyfArray[n - 1], spriyfArray[n].cfr_renamed_1157().cfr_renamed_954());
                n2 = 1;
            } else if (!bl2) {
                int n8 = n;
                spriyfArray[n8] = spruzf.cfr_renamed_6490(list.get(n8).cfr_renamed_6477(), list.get(n).cfr_renamed_6474(), (int)lArray[n], byArray, byArray2);
                n2 = 1;
            }
            n5 = ++n;
        }
        if (n2 != 0) {
            this.cfr_renamed_6508(spriyfArray, sprlyfArray);
        }
    }

    public spriyf cfr_renamed_6505() {
        return this.cfr_renamed_0.get(0);
    }

    public int hashCode() {
        int n = this.cfr_renamed_119;
        n = 31 * n + (this.cfr_renamed_2 ? 1 : 0);
        n = 31 * n + ((Object)this.cfr_renamed_0).hashCode();
        n = 31 * n + ((Object)this.cfr_renamed_91).hashCode();
        n = 31 * n + (int)(this.cfr_renamed_1 ^ this.cfr_renamed_1 >>> 32);
        n = 31 * n + (int)(this.cfr_renamed_4 ^ this.cfr_renamed_4 >>> 32);
        return n;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_6508(spriyf[] arg0, sprlyf[] arg1) {
        sprceg sprceg2 = this;
        synchronized (sprceg2) {
            this.cfr_renamed_0 = Collections.unmodifiableList(Arrays.asList(arg0));
            this.cfr_renamed_91 = Collections.unmodifiableList(Arrays.asList(arg1));
            return;
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return sprceg.cfr_renamed_6509(this);
    }

    public void cfr_renamed_6510(int arg0) {
        sprnuf sprnuf2;
        sprxag sprxag2 = this.cfr_renamed_0.get(arg0 - 1).cfr_renamed_6486();
        int n = sprxag2.cfr_renamed_6445().cfr_renamed_1146();
        sprnuf sprnuf3 = sprnuf2 = sprxag2.cfr_renamed_6448();
        sprnuf3.cfr_renamed_6440(-2);
        byte[] byArray = new byte[n];
        sprnuf3.cfr_renamed_6437(byArray, true);
        byte[] byArray2 = new byte[n];
        sprnuf3.cfr_renamed_6437(byArray2, false);
        byte[] byArray3 = new byte[16];
        System.arraycopy(byArray2, 0, byArray3, 0, byArray3.length);
        ArrayList<spriyf> arrayList = new ArrayList<spriyf>(this.cfr_renamed_0);
        spriyf spriyf2 = this.cfr_renamed_0.get(arg0);
        arrayList.set(arg0, spruzf.cfr_renamed_6490(spriyf2.cfr_renamed_6477(), spriyf2.cfr_renamed_6474(), 0, byArray3, byArray));
        ArrayList<sprlyf> arrayList2 = new ArrayList<sprlyf>(this.cfr_renamed_91);
        arrayList2.set(arg0 - 1, spruzf.cfr_renamed_6469((spriyf)arrayList.get(arg0 - 1), ((spriyf)arrayList.get(arg0)).cfr_renamed_1157().cfr_renamed_954()));
        sprceg sprceg2 = this;
        sprceg2.cfr_renamed_0 = Collections.unmodifiableList(arrayList);
        sprceg2.cfr_renamed_91 = Collections.unmodifiableList(arrayList2);
    }

    /*
     * WARNING - void declaration
     */
    public sprceg(int n, List<spriyf> list, List<sprlyf> list2, long l, long l2) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprceg sprceg2 = this;
        sprceg sprceg3 = this;
        super(true);
        this.cfr_renamed_4 = 0L;
        sprceg3.cfr_renamed_119 = arg0;
        sprceg3.cfr_renamed_0 = Collections.unmodifiableList(arg1);
        sprceg2.cfr_renamed_91 = Collections.unmodifiableList(arg2);
        sprceg2.cfr_renamed_4 = arg3;
        this.cfr_renamed_1 = arg4;
        this.cfr_renamed_2 = false;
        this.cfr_renamed_6506();
    }

    public long cfr_renamed_6511() {
        return this.cfr_renamed_1;
    }

    public synchronized void cfr_renamed_6484() {
        ++this.cfr_renamed_4;
    }

    public synchronized List<sprlyf> cfr_renamed_1409() {
        return this.cfr_renamed_91;
    }

    @Override
    public long cfr_renamed_5649() {
        return this.cfr_renamed_1 - this.cfr_renamed_4;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (arg0 == null || this.getClass() != arg0.getClass()) {
            return false;
        }
        sprceg sprceg2 = (sprceg)arg0;
        if (this.cfr_renamed_119 != sprceg2.cfr_renamed_119) {
            return false;
        }
        if (this.cfr_renamed_2 != sprceg2.cfr_renamed_2) {
            return false;
        }
        if (this.cfr_renamed_1 != sprceg2.cfr_renamed_1) {
            return false;
        }
        if (this.cfr_renamed_4 != sprceg2.cfr_renamed_4) {
            return false;
        }
        if (!((Object)this.cfr_renamed_0).equals(sprceg2.cfr_renamed_0)) {
            return false;
        }
        return ((Object)this.cfr_renamed_91).equals(sprceg2.cfr_renamed_91);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprceg cfr_renamed_6509(sprceg arg0) {
        try {
            return sprceg.cfr_renamed_23(arg0.cfr_renamed_91());
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage(), exception);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprceg cfr_renamed_3249(int arg0) {
        sprceg sprceg2 = this;
        synchronized (sprceg2) {
            if (this.cfr_renamed_5649() < (long)arg0) {
                throw new IllegalArgumentException(sprjpfa.cfr_renamed_9("\f\u000f\u0018\u001b\u001c?\u0016\t\u0017\bY\u0019\u0001\u001f\u001c\u0019\u001d\u000fY\t\n\u001d\u001e\u0019\n\\\u000b\u0019\u0014\u001d\u0010\u0012\u0010\u0012\u001e\\\u0010\u0012Y\u001f\f\u000e\u000b\u0019\u0017\bY\u0010\u001c\u001d\u001f"));
            }
            sprceg sprceg3 = this;
            long l = sprceg3.cfr_renamed_4 + (long)arg0;
            long l2 = sprceg3.cfr_renamed_4;
            sprceg3.cfr_renamed_4 += (long)arg0;
            ArrayList<spriyf> arrayList = new ArrayList<spriyf>(this.cfr_renamed_6507());
            ArrayList<sprlyf> arrayList2 = new ArrayList<sprlyf>(this.cfr_renamed_1409());
            sprceg sprceg4 = sprceg.cfr_renamed_6509(new sprceg(this.cfr_renamed_119, arrayList, arrayList2, l2, l, true));
            sprceg3.cfr_renamed_6506();
            return sprceg4;
        }
    }

    public boolean cfr_renamed_6512() {
        return this.cfr_renamed_2;
    }

    @Override
    public synchronized byte[] cfr_renamed_91() throws IOException {
        sprjn sprjn2;
        sprutf sprutf2 = sprutf.cfr_renamed_5939().cfr_renamed_5940(0).cfr_renamed_5940(this.cfr_renamed_119).cfr_renamed_6513(this.cfr_renamed_4).cfr_renamed_6513(this.cfr_renamed_1).cfr_renamed_6514(this.cfr_renamed_2);
        Iterator<sprjn> iterator = this.cfr_renamed_0.iterator();
        Iterator<sprjn> iterator2 = iterator;
        while (iterator2.hasNext()) {
            sprjn2 = iterator.next();
            iterator2 = iterator;
            sprutf2.cfr_renamed_5941(sprjn2);
        }
        iterator = this.cfr_renamed_91.iterator();
        Iterator<sprjn> iterator3 = iterator;
        while (iterator3.hasNext()) {
            sprjn2 = (sprlyf)iterator.next();
            iterator3 = iterator;
            sprutf2.cfr_renamed_5941(sprjn2);
        }
        return sprutf2.cfr_renamed_1451();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprceg(int n, List<spriyf> list, List<sprlyf> list2, long l, long l2, boolean bl) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprceg sprceg2 = this;
        sprceg sprceg3 = this;
        sprceg sprceg4 = this;
        super(true);
        this.cfr_renamed_4 = 0L;
        sprceg4.cfr_renamed_119 = arg0;
        sprceg4.cfr_renamed_0 = Collections.unmodifiableList(arg1);
        sprceg3.cfr_renamed_91 = Collections.unmodifiableList(arg2);
        sprceg3.cfr_renamed_4 = arg3;
        sprceg2.cfr_renamed_1 = arg4;
        sprceg2.cfr_renamed_2 = bl;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static sprceg cfr_renamed_23(Object arg0) throws IOException {
        if (arg0 instanceof sprceg) {
            return (sprceg)arg0;
        }
        if (arg0 instanceof DataInputStream) {
            int n;
            if (((DataInputStream)arg0).readInt() != 0) {
                throw new IllegalStateException(sproah.cfr_renamed_9("\u00102\u000e2\n+\u000b|\u00139\u0017/\f3\u000b|\u00033\u0017|\r/\u0016|\u0015.\f*\u0004(\u0000|\u000e9\u001c"));
            }
            int n2 = ((DataInputStream)arg0).readInt();
            long l = ((DataInputStream)arg0).readLong();
            long l2 = ((DataInputStream)arg0).readLong();
            boolean bl = ((DataInputStream)arg0).readBoolean();
            ArrayList<spriyf> arrayList = new ArrayList<spriyf>();
            ArrayList<sprlyf> arrayList2 = new ArrayList<sprlyf>();
            int n3 = n = 0;
            while (n3 < n2) {
                arrayList.add(spriyf.cfr_renamed_23(arg0));
                n3 = ++n;
            }
            int n4 = n = 0;
            while (n4 < n2 - 1) {
                arrayList2.add(sprlyf.cfr_renamed_23(arg0));
                n4 = ++n;
            }
            return new sprceg(n2, arrayList, arrayList2, l, l2, bl);
        }
        if (arg0 instanceof byte[]) {
            InputStream inputStream = null;
            try {
                inputStream = new DataInputStream(new ByteArrayInputStream((byte[])arg0));
                sprceg sprceg2 = sprceg.cfr_renamed_23(inputStream);
                return sprceg2;
            }
            finally {
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        }
        if (arg0 instanceof InputStream) {
            return sprceg.cfr_renamed_23(sprkqe.cfr_renamed_471((InputStream)arg0));
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprjpfa.cfr_renamed_9("\u001a\u001d\u0017\u0012\u0016\bY\f\u0018\u000e\n\u0019Y")).append(arg0).toString());
    }

    public synchronized sprztf[] cfr_renamed_6478() {
        int n;
        int n2 = this.cfr_renamed_0.size();
        sprztf[] sprztfArray = new sprztf[n2];
        int n3 = n = 0;
        while (n3 < n2) {
            spriyf spriyf2 = this.cfr_renamed_0.get(n);
            sprztfArray[n++] = new sprztf(spriyf2.cfr_renamed_6477(), spriyf2.cfr_renamed_6474());
            n3 = n;
        }
        return sprztfArray;
    }

    public synchronized long cfr_renamed_320() {
        return this.cfr_renamed_4;
    }

    public static sprceg cfr_renamed_5967(byte[] arg0, byte[] arg1) throws IOException {
        sprceg.cfr_renamed_23(arg0).cfr_renamed_3 = sprldg.cfr_renamed_23(arg1);
        return sprceg.cfr_renamed_23(arg0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprvcg cfr_renamed_5709() {
        sprceg sprceg2 = this;
        int n = sprceg2.cfr_renamed_2331();
        sprceg sprceg3 = sprceg2;
        synchronized (sprceg2) {
            sprceg sprceg4 = this;
            sprytf.cfr_renamed_6515(sprceg4);
            List<spriyf> list = sprceg4.cfr_renamed_6507();
            List<sprlyf> list2 = sprceg4.cfr_renamed_1409();
            spriyf spriyf2 = sprceg4.cfr_renamed_6507().get(n - 1);
            int n2 = 0;
            spruag[] spruagArray = new spruag[n - 1];
            int n3 = n2;
            while (true) {
                if (n3 >= n - 1) {
                    this.cfr_renamed_6484();
                    // ** MonitorExit[var4_2] (shouldn't be in output)
                    return spriyf2.cfr_renamed_5709().cfr_renamed_6494(spruagArray);
                }
                spruagArray[n2] = new spruag(list2.get(n2), list.get(n2 + 1).cfr_renamed_1157());
                n3 = n2 + 1;
            }
        }
    }

    public synchronized List<spriyf> cfr_renamed_6507() {
        return this.cfr_renamed_0;
    }
}

