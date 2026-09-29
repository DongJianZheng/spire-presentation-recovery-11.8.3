/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprar;
import com.spire.presentation.packages.sprdbm;
import com.spire.presentation.packages.sprde;
import com.spire.presentation.packages.sprehm;
import com.spire.presentation.packages.sprfjm;
import com.spire.presentation.packages.sprhrm;
import com.spire.presentation.packages.sprhzg;
import com.spire.presentation.packages.sprifm;
import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmhm;
import com.spire.presentation.packages.sprnhm;
import com.spire.presentation.packages.sprnvg;
import com.spire.presentation.packages.sprnzl;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpam;
import com.spire.presentation.packages.sprqks;
import com.spire.presentation.packages.sprrk;
import com.spire.presentation.packages.sprsph;
import com.spire.presentation.packages.sprtem;
import com.spire.presentation.packages.sprtg;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprwcm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxu;
import com.spire.presentation.packages.sprzcm;
import com.spire.presentation.packages.sprzkl;
import com.spire.presentation.packages.sprzyg;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class sprvbh
implements sprtg {
    public sprifm cfr_renamed_723;
    public sprmhm cfr_renamed_1226;
    public List<sprde> cfr_renamed_287;
    public List<sprzyg> cfr_renamed_724;
    public List<sprzyg> cfr_renamed_953;
    private int cfr_renamed_133;
    public List<List<sprzyg>> cfr_renamed_0;
    private static final int[] cfr_renamed_1;
    private long cfr_renamed_2;
    public List<sprmhm> cfr_renamed_3;
    private byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public static sprvbh cfr_renamed_7785(sprvbh sprvbh2, byte[] byArray, sprzyg sprzyg2) {
        void arg2;
        void arg1;
        sprvbh arg0;
        return sprvbh.cfr_renamed_7786(arg0, new sprdbm((byte[])arg1), (sprzyg)arg2);
    }

    /*
     * WARNING - void declaration
     */
    public sprvbh(sprifm sprifm2, sprmhm sprmhm2, List<sprzyg> list, sprrk sprrk2) throws sprtqg {
        void arg2;
        void arg1;
        void arg0;
        sprvbh sprvbh2 = this;
        sprvbh sprvbh3 = this;
        sprvbh sprvbh4 = this;
        this.cfr_renamed_953 = new ArrayList<sprzyg>();
        sprvbh4.cfr_renamed_287 = new ArrayList<sprde>();
        sprvbh3.cfr_renamed_3 = new ArrayList<sprmhm>();
        sprvbh3.cfr_renamed_0 = new ArrayList<List<sprzyg>>();
        sprvbh3.cfr_renamed_724 = null;
        sprvbh2.cfr_renamed_723 = arg0;
        sprvbh2.cfr_renamed_1226 = arg1;
        this.cfr_renamed_724 = arg2;
        this.cfr_renamed_7787(sprrk2);
    }

    /*
     * WARNING - void declaration
     */
    public Iterator<sprzyg> cfr_renamed_7788(String string) {
        void arg0;
        return this.cfr_renamed_7789(new sprdbm((String)arg0));
    }

    public byte[] cfr_renamed_5209() {
        byte[] byArray = new byte[this.cfr_renamed_4.length];
        System.arraycopy(this.cfr_renamed_4, 0, byArray, 0, byArray.length);
        return byArray;
    }

    public Iterator<sprzyg> cfr_renamed_7790() {
        if (this.cfr_renamed_724 == null) {
            return new ArrayList<sprzyg>(this.cfr_renamed_953).iterator();
        }
        return this.cfr_renamed_724.iterator();
    }

    public boolean cfr_renamed_7791() {
        return this.cfr_renamed_7792();
    }

    public byte[] cfr_renamed_7793() {
        if (this.cfr_renamed_1226 == null) {
            return null;
        }
        return sproze.cfr_renamed_158(this.cfr_renamed_1226.cfr_renamed_7794());
    }

    public Date cfr_renamed_7696() {
        return this.cfr_renamed_723.cfr_renamed_2147();
    }

    public byte[] cfr_renamed_1972(boolean arg0) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream = new ByteArrayOutputStream();
        this.cfr_renamed_1310(byteArrayOutputStream2, arg0);
        return byteArrayOutputStream2.toByteArray();
    }

    public sprifm cfr_renamed_7735() {
        return this.cfr_renamed_723;
    }

    public byte[] cfr_renamed_91() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream = new ByteArrayOutputStream();
        this.cfr_renamed_1310(byteArrayOutputStream2, false);
        return byteArrayOutputStream2.toByteArray();
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_723.cfr_renamed_3();
    }

    private static /* synthetic */ sprvbh cfr_renamed_7795(sprvbh arg0, sprde arg1, sprzyg arg2) {
        int n;
        sprvbh sprvbh2 = new sprvbh(arg0);
        boolean bl = false;
        int n2 = n = 0;
        while (n2 < sprvbh2.cfr_renamed_287.size()) {
            if (arg1.equals(sprvbh2.cfr_renamed_287.get(n))) {
                bl |= sprvbh2.cfr_renamed_0.get(n).remove(arg2);
            }
            n2 = ++n;
        }
        if (bl) {
            return sprvbh2;
        }
        return null;
    }

    public boolean cfr_renamed_7760() {
        int n = this.cfr_renamed_723.cfr_renamed_593();
        return n == 1 || n == 2 || n == 16 || n == 20 || n == 21 || n == 18;
    }

    private static /* synthetic */ sprvbh cfr_renamed_7796(sprvbh arg0, sprde arg1) {
        int n;
        sprvbh sprvbh2 = new sprvbh(arg0);
        boolean bl = false;
        int n2 = n = sprvbh2.cfr_renamed_287.size() - 1;
        while (n2 >= 0) {
            if (arg1.equals(sprvbh2.cfr_renamed_287.get(n))) {
                bl = true;
                sprvbh2.cfr_renamed_287.remove(n);
                sprvbh2.cfr_renamed_3.remove(n);
                sprvbh2.cfr_renamed_0.remove(n);
            }
            n2 = --n;
        }
        if (bl) {
            return sprvbh2;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static sprvbh cfr_renamed_7797(sprvbh sprvbh2, byte[] byArray, sprzyg sprzyg2) {
        void arg2;
        void arg1;
        sprvbh arg0;
        return sprvbh.cfr_renamed_7795(arg0, new sprdbm((byte[])arg1), (sprzyg)arg2);
    }

    public long cfr_renamed_7798() {
        if (this.cfr_renamed_723.cfr_renamed_3() > 3) {
            if (this.cfr_renamed_7669()) {
                int n;
                int n2 = n = 0;
                while (n2 != cfr_renamed_1.length) {
                    long l = this.cfr_renamed_7799(true, cfr_renamed_1[n]);
                    if (l >= 0L) {
                        return l;
                    }
                    n2 = ++n;
                }
            } else {
                long l = this.cfr_renamed_7799(false, 24);
                if (l >= 0L) {
                    return l;
                }
                l = this.cfr_renamed_7799(false, 31);
                if (l >= 0L) {
                    return l;
                }
            }
            return 0L;
        }
        return (long)this.cfr_renamed_723.cfr_renamed_7800() * 24L * 60L * 60L;
    }

    /*
     * WARNING - void declaration
     */
    public sprvbh(sprvbh sprvbh2) {
        int n;
        void arg0;
        sprvbh sprvbh3 = this;
        sprvbh sprvbh4 = this;
        sprvbh sprvbh5 = this;
        this.cfr_renamed_953 = new ArrayList<sprzyg>();
        sprvbh5.cfr_renamed_287 = new ArrayList<sprde>();
        this.cfr_renamed_3 = new ArrayList<sprmhm>();
        this.cfr_renamed_0 = new ArrayList<List<sprzyg>>();
        sprvbh4.cfr_renamed_724 = null;
        sprvbh3.cfr_renamed_723 = arg0.cfr_renamed_723;
        sprvbh4.cfr_renamed_953 = new ArrayList<sprzyg>(arg0.cfr_renamed_953);
        sprvbh3.cfr_renamed_287 = new ArrayList<sprde>(arg0.cfr_renamed_287);
        sprvbh3.cfr_renamed_3 = new ArrayList<sprmhm>(arg0.cfr_renamed_3);
        sprvbh3.cfr_renamed_0 = new ArrayList<List<sprzyg>>(arg0.cfr_renamed_0.size());
        int n2 = n = 0;
        while (n2 != arg0.cfr_renamed_0.size()) {
            List<sprzyg> list = arg0.cfr_renamed_0.get(n);
            this.cfr_renamed_0.add(new ArrayList<sprzyg>(list));
            n2 = ++n;
        }
        if (arg0.cfr_renamed_724 != null) {
            this.cfr_renamed_724 = new ArrayList<sprzyg>(arg0.cfr_renamed_724.size());
            this.cfr_renamed_724.addAll(arg0.cfr_renamed_724);
        }
        sprvbh sprvbh6 = this;
        void v6 = arg0;
        this.cfr_renamed_4 = arg0.cfr_renamed_4;
        sprvbh6.cfr_renamed_2 = v6.cfr_renamed_2;
        sprvbh6.cfr_renamed_133 = v6.cfr_renamed_133;
    }

    public int cfr_renamed_7801() {
        return this.cfr_renamed_133;
    }

    public Iterator<sprzyg> cfr_renamed_7727(long arg0) {
        ArrayList<sprzyg> arrayList = new ArrayList<sprzyg>();
        Iterator<sprzyg> iterator = this.cfr_renamed_7802();
        while (iterator.hasNext()) {
            sprzyg sprzyg2 = iterator.next();
            if (sprzyg2.cfr_renamed_7541() != arg0) continue;
            arrayList.add(sprzyg2);
        }
        return arrayList.iterator();
    }

    static {
        int[] nArray = new int[5];
        nArray[0] = 19;
        nArray[1] = 18;
        nArray[2] = 17;
        nArray[3] = 16;
        nArray[4] = 31;
        cfr_renamed_1 = nArray;
    }

    /*
     * WARNING - void declaration
     */
    public static sprvbh cfr_renamed_7764(sprvbh sprvbh2, String string, sprzyg sprzyg2) {
        void arg2;
        void arg1;
        sprvbh arg0;
        return sprvbh.cfr_renamed_7786(arg0, new sprdbm((String)arg1), (sprzyg)arg2);
    }

    public Iterator<byte[]> cfr_renamed_7803() {
        int n;
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_287.size()) {
            if (this.cfr_renamed_287.get(n) instanceof sprdbm) {
                arrayList.add(((sprdbm)this.cfr_renamed_287.get(n)).cfr_renamed_7804());
            }
            n2 = ++n;
        }
        return arrayList.iterator();
    }

    public Iterator<String> cfr_renamed_7712() {
        int n;
        ArrayList<String> arrayList = new ArrayList<String>();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_287.size()) {
            if (this.cfr_renamed_287.get(n) instanceof sprdbm) {
                arrayList.add(((sprdbm)this.cfr_renamed_287.get(n)).cfr_renamed_6005());
            }
            n2 = ++n;
        }
        return arrayList.iterator();
    }

    public int cfr_renamed_7800() {
        if (this.cfr_renamed_723.cfr_renamed_3() > 3) {
            sprvbh sprvbh2 = this;
            long l = sprvbh2.cfr_renamed_7798() % 86400L;
            int n = (int)(sprvbh2.cfr_renamed_7798() / 86400L);
            if (l > 0L && n == 0) {
                return 1;
            }
            return n;
        }
        return this.cfr_renamed_723.cfr_renamed_7800();
    }

    public static sprvbh cfr_renamed_7805(sprvbh arg0, sprzyg arg1) {
        if (arg0.cfr_renamed_7669()) {
            if (arg1.cfr_renamed_7576() == 40) {
                throw new IllegalArgumentException(sprqks.cfr_renamed_9("\u000f\u0004\u001b\u0003\u001d\u0019\t\u001f\u0019M\b\u0014\f\b\\\u0004\u0012\u000e\u0013\u001f\u000e\b\u001f\u0019\\\u000b\u0013\u001f\\\u0000\u001d\u001e\b\b\u000eM\u0017\b\u0005M\u000e\b\n\u0002\u001f\f\b\u0004\u0013\u0003R"));
            }
        } else if (arg1.cfr_renamed_7576() == 32) {
            throw new IllegalArgumentException(sprsph.cfr_renamed_9("\u0007!\u0013&\u0015<\u0001:\u0011h\u00001\u0004-T!\u001a+\u001b:\u0006-\u0017<T.\u001b:T;\u0001*Y#\u00111T:\u0011>\u001b+\u0015<\u001d'\u001af"));
        }
        sprvbh sprvbh2 = new sprvbh(arg0);
        List<sprzyg> list = sprvbh2.cfr_renamed_724 != null ? sprvbh2.cfr_renamed_724 : sprvbh2.cfr_renamed_953;
        list.add(arg1);
        return sprvbh2;
    }

    /*
     * WARNING - void declaration
     */
    public static sprvbh cfr_renamed_7806(sprvbh sprvbh2, String string) {
        void arg1;
        sprvbh arg0;
        return sprvbh.cfr_renamed_7796(arg0, new sprdbm((String)arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprvbh(sprvbh sprvbh2, sprmhm sprmhm2, List<sprzyg> list) {
        void arg2;
        void arg1;
        void arg0;
        sprvbh sprvbh3 = this;
        void v1 = arg0;
        sprvbh sprvbh4 = this;
        sprvbh sprvbh5 = this;
        sprvbh sprvbh6 = this;
        this.cfr_renamed_953 = new ArrayList<sprzyg>();
        sprvbh6.cfr_renamed_287 = new ArrayList<sprde>();
        this.cfr_renamed_3 = new ArrayList<sprmhm>();
        this.cfr_renamed_0 = new ArrayList<List<sprzyg>>();
        sprvbh5.cfr_renamed_724 = null;
        sprvbh5.cfr_renamed_723 = arg0.cfr_renamed_723;
        sprvbh4.cfr_renamed_1226 = arg1;
        sprvbh4.cfr_renamed_724 = arg2;
        this.cfr_renamed_4 = v1.cfr_renamed_4;
        sprvbh3.cfr_renamed_2 = v1.cfr_renamed_2;
        sprvbh3.cfr_renamed_133 = sprvbh2.cfr_renamed_133;
    }

    /*
     * WARNING - void declaration
     */
    public static sprvbh cfr_renamed_7807(sprvbh sprvbh2, String string, sprzyg sprzyg2) {
        void arg2;
        void arg1;
        sprvbh arg0;
        return sprvbh.cfr_renamed_7795(arg0, new sprdbm((String)arg1), (sprzyg)arg2);
    }

    public void cfr_renamed_1310(OutputStream arg0, boolean arg1) throws IOException {
        sprjah sprjah2 = sprjah.cfr_renamed_7679(arg0);
        sprjah2.cfr_renamed_7680(this.cfr_renamed_723);
        if (!arg1 && this.cfr_renamed_1226 != null) {
            sprjah2.cfr_renamed_7680(this.cfr_renamed_1226);
        }
        if (this.cfr_renamed_724 == null) {
            int n;
            int n2 = n = 0;
            while (n2 != this.cfr_renamed_953.size()) {
                sprzyg sprzyg2 = this.cfr_renamed_953.get(n);
                sprzyg2.cfr_renamed_2623(sprjah2);
                n2 = ++n;
            }
            int n3 = n = 0;
            while (n3 != this.cfr_renamed_287.size()) {
                int n4;
                boolean bl;
                Object object;
                if (this.cfr_renamed_287.get(n) instanceof sprdbm) {
                    object = (sprdbm)this.cfr_renamed_287.get(n);
                    bl = arg1;
                    sprjah2.cfr_renamed_7680((sprzcm)object);
                } else {
                    object = (sprnvg)this.cfr_renamed_287.get(n);
                    bl = arg1;
                    sprjah2.cfr_renamed_7680(new sprnzl(((sprnvg)object).cfr_renamed_7563()));
                }
                if (!bl && this.cfr_renamed_3.get(n) != null) {
                    sprjah2.cfr_renamed_7680(this.cfr_renamed_3.get(n));
                }
                object = this.cfr_renamed_0.get(n);
                int n5 = n4 = 0;
                while (n5 != object.size()) {
                    sprzyg sprzyg3 = (sprzyg)object.get(n4);
                    sprzyg3.cfr_renamed_1310(sprjah2, arg1);
                    n5 = ++n4;
                }
                n3 = ++n;
            }
        } else {
            int n;
            int n6 = n = 0;
            while (n6 != this.cfr_renamed_724.size()) {
                this.cfr_renamed_724.get(++n).cfr_renamed_1310(sprjah2, arg1);
                n6 = n;
            }
        }
    }

    private /* synthetic */ long cfr_renamed_7799(boolean arg0, int arg1) {
        Iterator<sprzyg> iterator = this.cfr_renamed_7808(arg1);
        long l = -1L;
        long l2 = -1L;
        block0: while (true) {
            Iterator<sprzyg> iterator2 = iterator;
            while (iterator2.hasNext()) {
                sprzyg sprzyg2 = iterator.next();
                if (arg0 && sprzyg2.cfr_renamed_7541() != this.cfr_renamed_7541()) continue block0;
                sprhzg sprhzg2 = sprzyg2.cfr_renamed_7677();
                if (sprhzg2 == null) {
                    iterator2 = iterator;
                    continue;
                }
                if (!sprhzg2.cfr_renamed_7596(9)) {
                    iterator2 = iterator;
                    continue;
                }
                long l3 = sprhzg2.cfr_renamed_7620();
                if (sprzyg2.cfr_renamed_7541() == this.cfr_renamed_7541()) {
                    if (sprzyg2.cfr_renamed_7696().getTime() <= l2) continue block0;
                    l2 = sprzyg2.cfr_renamed_7696().getTime();
                    l = l3;
                    continue block0;
                }
                if (l3 != 0L && l3 <= l) continue block0;
                l = l3;
                continue block0;
            }
            break;
        }
        return l;
    }

    public long cfr_renamed_7541() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprvbh(sprifm sprifm2, sprrk sprrk2) throws sprtqg {
        void arg0;
        sprvbh sprvbh2 = this;
        sprvbh sprvbh3 = this;
        this.cfr_renamed_953 = new ArrayList<sprzyg>();
        sprvbh3.cfr_renamed_287 = new ArrayList<sprde>();
        this.cfr_renamed_3 = new ArrayList<sprmhm>();
        this.cfr_renamed_0 = new ArrayList<List<sprzyg>>();
        sprvbh2.cfr_renamed_724 = null;
        sprvbh2.cfr_renamed_723 = arg0;
        this.cfr_renamed_287 = new ArrayList<sprde>();
        this.cfr_renamed_0 = new ArrayList<List<sprzyg>>();
        this.cfr_renamed_7787(sprrk2);
    }

    public static sprvbh cfr_renamed_7809(sprvbh arg0, sprzyg arg1) {
        Iterator<List<sprzyg>> iterator;
        sprvbh sprvbh2 = new sprvbh(arg0);
        List<sprzyg> list = sprvbh2.cfr_renamed_724 != null ? sprvbh2.cfr_renamed_724 : sprvbh2.cfr_renamed_953;
        boolean bl = list.remove(arg1);
        Iterator<List<sprzyg>> iterator2 = iterator = sprvbh2.cfr_renamed_0.iterator();
        while (iterator2.hasNext()) {
            List<sprzyg> list2 = iterator.next();
            bl |= list2.remove(arg1);
            iterator2 = iterator;
        }
        if (bl) {
            return sprvbh2;
        }
        return null;
    }

    public boolean cfr_renamed_7669() {
        return !(this.cfr_renamed_723 instanceof sprpam) && (!this.cfr_renamed_7760() || this.cfr_renamed_723.cfr_renamed_593() == 1);
    }

    /*
     * WARNING - void declaration
     */
    public sprvbh(sprifm sprifm2, sprmhm sprmhm2, List<sprzyg> list, List<sprde> list2, List<sprmhm> list3, List<List<sprzyg>> list4, sprrk sprrk2) throws sprtqg {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprvbh sprvbh2 = this;
        sprvbh sprvbh3 = this;
        sprvbh sprvbh4 = this;
        sprvbh sprvbh5 = this;
        this.cfr_renamed_953 = new ArrayList<sprzyg>();
        sprvbh5.cfr_renamed_287 = new ArrayList<sprde>();
        this.cfr_renamed_3 = new ArrayList<sprmhm>();
        this.cfr_renamed_0 = new ArrayList<List<sprzyg>>();
        sprvbh4.cfr_renamed_724 = null;
        sprvbh4.cfr_renamed_723 = arg0;
        sprvbh3.cfr_renamed_1226 = arg1;
        sprvbh3.cfr_renamed_953 = arg2;
        sprvbh2.cfr_renamed_287 = arg3;
        sprvbh2.cfr_renamed_3 = arg4;
        this.cfr_renamed_0 = arg5;
        this.cfr_renamed_7787(sprrk2);
    }

    public int cfr_renamed_593() {
        return this.cfr_renamed_723.cfr_renamed_593();
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean cfr_renamed_7792() {
        int n = 0;
        boolean bl = false;
        if (this.cfr_renamed_7669()) {
            block0: while (true) {
                boolean bl2 = bl;
                while (!bl2) {
                    if (n >= this.cfr_renamed_953.size()) return bl;
                    int n2 = this.cfr_renamed_953.get(n).cfr_renamed_7576();
                    ++n;
                    if (n2 != 32) continue block0;
                    bl2 = bl = true;
                }
                return bl;
            }
        }
        block2: while (true) {
            boolean bl3 = bl;
            while (!bl3) {
                if (n >= this.cfr_renamed_724.size()) return bl;
                int n3 = this.cfr_renamed_724.get(n).cfr_renamed_7576();
                ++n;
                if (n3 != 40) continue block2;
                bl3 = bl = true;
            }
            return bl;
        }
    }

    public static sprvbh cfr_renamed_7810(sprvbh arg0, sprnvg arg1) {
        return sprvbh.cfr_renamed_7796(arg0, arg1);
    }

    public static sprvbh cfr_renamed_7811(sprvbh arg0, sprnvg arg1, sprzyg arg2) {
        return sprvbh.cfr_renamed_7786(arg0, arg1, arg2);
    }

    public Iterator<sprnvg> cfr_renamed_7756() {
        int n;
        ArrayList<sprnvg> arrayList = new ArrayList<sprnvg>();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_287.size()) {
            if (this.cfr_renamed_287.get(n) instanceof sprnvg) {
                arrayList.add((sprnvg)this.cfr_renamed_287.get(n));
            }
            n2 = ++n;
        }
        return arrayList.iterator();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_7787(sprrk sprrk2) throws sprtqg {
        sprvbh sprvbh2;
        sprjn sprjn2;
        void arg0;
        sprar sprar2 = this.cfr_renamed_723.cfr_renamed_1521();
        sprvbh sprvbh3 = this;
        this.cfr_renamed_4 = arg0.cfr_renamed_7812(sprvbh3.cfr_renamed_723);
        if (sprvbh3.cfr_renamed_723.cfr_renamed_3() <= 3) {
            sprjn2 = (sprwcm)sprar2;
            sprvbh2 = this;
            this.cfr_renamed_2 = ((sprwcm)sprjn2).cfr_renamed_2295().longValue();
            this.cfr_renamed_133 = ((sprwcm)sprjn2).cfr_renamed_2295().bitLength();
        } else if (this.cfr_renamed_723.cfr_renamed_3() == 4) {
            sprvbh sprvbh4 = this;
            sprvbh sprvbh5 = this;
            sprvbh sprvbh6 = this;
            sprvbh sprvbh7 = this;
            sprvbh sprvbh8 = this;
            sprvbh sprvbh9 = this;
            sprvbh sprvbh10 = this;
            this.cfr_renamed_2 = (long)(this.cfr_renamed_4[this.cfr_renamed_4.length - 8] & 0xFF) << 56 | (long)(sprvbh4.cfr_renamed_4[sprvbh4.cfr_renamed_4.length - 7] & 0xFF) << 48 | (long)(sprvbh5.cfr_renamed_4[sprvbh5.cfr_renamed_4.length - 6] & 0xFF) << 40 | (long)(sprvbh6.cfr_renamed_4[sprvbh6.cfr_renamed_4.length - 5] & 0xFF) << 32 | (long)(sprvbh7.cfr_renamed_4[sprvbh7.cfr_renamed_4.length - 4] & 0xFF) << 24 | (long)(sprvbh8.cfr_renamed_4[sprvbh8.cfr_renamed_4.length - 3] & 0xFF) << 16 | (long)(sprvbh9.cfr_renamed_4[sprvbh9.cfr_renamed_4.length - 2] & 0xFF) << 8 | (long)(sprvbh10.cfr_renamed_4[sprvbh10.cfr_renamed_4.length - 1] & 0xFF);
            sprvbh2 = this;
        } else {
            if (this.cfr_renamed_723.cfr_renamed_3() == 6) {
                this.cfr_renamed_2 = (long)(this.cfr_renamed_4[0] & 0xFF) << 56 | (long)(this.cfr_renamed_4[1] & 0xFF) << 48 | (long)(this.cfr_renamed_4[2] & 0xFF) << 40 | (long)(this.cfr_renamed_4[3] & 0xFF) << 32 | (long)(this.cfr_renamed_4[4] & 0xFF) << 24 | (long)(this.cfr_renamed_4[5] & 0xFF) << 16 | (long)(this.cfr_renamed_4[6] & 0xFF) << 8 | (long)(this.cfr_renamed_4[7] & 0xFF);
            }
            sprvbh2 = this;
        }
        if (sprvbh2.cfr_renamed_723.cfr_renamed_3() >= 4) {
            if (sprar2 instanceof sprwcm) {
                this.cfr_renamed_133 = ((sprwcm)sprar2).cfr_renamed_2295().bitLength();
                return;
            }
            if (sprar2 instanceof sprfjm) {
                this.cfr_renamed_133 = ((sprfjm)sprar2).cfr_renamed_1155().bitLength();
                return;
            }
            if (sprar2 instanceof sprehm) {
                this.cfr_renamed_133 = ((sprehm)sprar2).cfr_renamed_1155().bitLength();
                return;
            }
            if (sprar2 instanceof sprtem) {
                sprjn2 = ((sprtem)sprar2).cfr_renamed_7813();
                if (((sprxgf)sprjn2).cfr_renamed_5078(sprxu.cfr_renamed_88) || ((sprxgf)sprjn2).cfr_renamed_5078(sprhrm.cfr_renamed_2)) {
                    this.cfr_renamed_133 = 256;
                    return;
                }
                sprzkl sprzkl2 = sprnhm.cfr_renamed_7814((sprlem)sprjn2);
                sprvbh sprvbh11 = this;
                if (sprzkl2 != null) {
                    sprvbh11.cfr_renamed_133 = sprzkl2.cfr_renamed_1769().cfr_renamed_1938();
                    return;
                }
                sprvbh11.cfr_renamed_133 = -1;
            }
        }
    }

    private /* synthetic */ Iterator<sprzyg> cfr_renamed_7789(sprdbm arg0) {
        int n;
        ArrayList<sprzyg> arrayList = new ArrayList<sprzyg>();
        boolean bl = false;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_287.size()) {
            if (arg0.equals(this.cfr_renamed_287.get(n))) {
                bl = true;
                arrayList.addAll(this.cfr_renamed_0.get(n));
            }
            n2 = ++n;
        }
        if (bl) {
            return arrayList.iterator();
        }
        return null;
    }

    public Iterator<sprzyg> cfr_renamed_7802() {
        if (this.cfr_renamed_724 == null) {
            int n;
            ArrayList<sprzyg> arrayList = new ArrayList<sprzyg>(this.cfr_renamed_953);
            int n2 = n = 0;
            while (n2 != this.cfr_renamed_0.size()) {
                arrayList.addAll(this.cfr_renamed_0.get(n++));
                n2 = n;
            }
            return arrayList.iterator();
        }
        return this.cfr_renamed_724.iterator();
    }

    /*
     * WARNING - void declaration
     */
    public sprvbh(sprvbh sprvbh2, sprmhm sprmhm2, List<sprzyg> list, List<sprde> list2, List<sprmhm> list3, List<List<sprzyg>> list4) throws sprtqg {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprvbh sprvbh3 = this;
        sprvbh sprvbh4 = this;
        sprvbh sprvbh5 = this;
        void v3 = arg0;
        sprvbh sprvbh6 = this;
        sprvbh sprvbh7 = this;
        sprvbh sprvbh8 = this;
        this.cfr_renamed_953 = new ArrayList<sprzyg>();
        sprvbh8.cfr_renamed_287 = new ArrayList<sprde>();
        sprvbh7.cfr_renamed_3 = new ArrayList<sprmhm>();
        sprvbh7.cfr_renamed_0 = new ArrayList<List<sprzyg>>();
        sprvbh7.cfr_renamed_724 = null;
        sprvbh6.cfr_renamed_723 = arg0.cfr_renamed_723;
        sprvbh6.cfr_renamed_4 = arg0.cfr_renamed_4;
        this.cfr_renamed_133 = v3.cfr_renamed_133;
        sprvbh5.cfr_renamed_2 = v3.cfr_renamed_2;
        sprvbh5.cfr_renamed_1226 = arg1;
        sprvbh4.cfr_renamed_953 = arg2;
        sprvbh4.cfr_renamed_287 = arg3;
        sprvbh3.cfr_renamed_3 = arg4;
        sprvbh3.cfr_renamed_0 = list4;
    }

    private static /* synthetic */ sprvbh cfr_renamed_7786(sprvbh arg0, sprde arg1, sprzyg arg2) {
        int n;
        sprvbh sprvbh2 = new sprvbh(arg0);
        List<sprzyg> list = null;
        int n2 = n = 0;
        while (n2 != sprvbh2.cfr_renamed_287.size()) {
            if (arg1.equals(sprvbh2.cfr_renamed_287.get(n))) {
                list = sprvbh2.cfr_renamed_0.get(n);
            }
            n2 = ++n;
        }
        if (list != null) {
            list.add(arg2);
            return sprvbh2;
        }
        list = new ArrayList<sprzyg>();
        boolean bl = list.add(arg2);
        sprvbh sprvbh3 = sprvbh2;
        sprvbh2.cfr_renamed_287.add(arg1);
        sprvbh3.cfr_renamed_3.add(null);
        sprvbh2.cfr_renamed_0.add(list);
        return sprvbh3;
    }

    public static sprvbh cfr_renamed_7815(sprvbh arg0, sprnvg arg1, sprzyg arg2) {
        return sprvbh.cfr_renamed_7795(arg0, arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public static sprvbh cfr_renamed_7816(sprvbh sprvbh2, byte[] byArray) {
        void arg1;
        sprvbh arg0;
        return sprvbh.cfr_renamed_7796(arg0, new sprdbm((byte[])arg1));
    }

    public static sprvbh cfr_renamed_7774(sprvbh arg0, sprvbh arg1, boolean arg2, boolean arg3) throws sprtqg {
        int n;
        Iterator<sprzyg> iterator;
        ArrayList<sprzyg> arrayList;
        if (arg0.cfr_renamed_7541() != arg1.cfr_renamed_7541()) {
            throw new IllegalArgumentException(sprqks.cfr_renamed_9("&\u0019\u0014Q$8M\u0011\u0004\u000f\u0000\u001d\u0019\u001f\u0005R"));
        }
        sprvbh sprvbh2 = arg0;
        sprmhm sprmhm2 = sprvbh2.cfr_renamed_1226;
        ArrayList<sprzyg> arrayList2 = new ArrayList<sprzyg>(arg0.cfr_renamed_953);
        ArrayList<sprde> arrayList3 = new ArrayList<sprde>(arg0.cfr_renamed_287);
        ArrayList<sprmhm> arrayList4 = new ArrayList<sprmhm>(arg0.cfr_renamed_3);
        ArrayList<List<sprzyg>> arrayList5 = new ArrayList<List<sprzyg>>(arg0.cfr_renamed_0);
        ArrayList<sprzyg> arrayList6 = arrayList = sprvbh2.cfr_renamed_724 == null ? null : new ArrayList<sprzyg>(arg0.cfr_renamed_724);
        if (arg2 && arg1.cfr_renamed_1226 != null) {
            sprmhm2 = arg1.cfr_renamed_1226;
        }
        Iterator<sprzyg> iterator2 = iterator = arg1.cfr_renamed_953.iterator();
        while (iterator2.hasNext()) {
            boolean bl;
            sprzyg object2;
            block20: {
                int n2;
                object2 = iterator.next();
                boolean bl2 = false;
                int n3 = n2 = 0;
                while (n3 < arrayList2.size()) {
                    sprzyg sprzyg2 = (sprzyg)arrayList2.get(n2);
                    if (sprzyg.cfr_renamed_7698(sprzyg2, object2)) {
                        bl2 = true;
                        sprzyg2 = sprzyg.cfr_renamed_7699(sprzyg2, object2);
                        bl = bl2;
                        arrayList2.set(n2, sprzyg2);
                        break block20;
                    }
                    n3 = ++n2;
                }
                bl = bl2;
            }
            if (bl) break;
            arrayList2.add(object2);
            iterator2 = iterator;
        }
        int n4 = n = 0;
        while (n4 < arg1.cfr_renamed_287.size()) {
            int n5;
            int n6;
            sprmhm sprmhm3;
            ArrayList<sprzyg> arrayList7;
            sprde sprde2;
            block21: {
                int n7;
                sprde2 = arg1.cfr_renamed_287.get(n);
                arrayList7 = new ArrayList<sprzyg>(arg1.cfr_renamed_0.get(n));
                sprmhm3 = arg1.cfr_renamed_3.get(n);
                n6 = -1;
                int n8 = n7 = 0;
                while (n8 < arrayList3.size()) {
                    sprde sprde3 = (sprde)arrayList3.get(n7);
                    if (sprde3.equals(sprde2)) {
                        n5 = n6 = n7;
                        break block21;
                    }
                    n8 = ++n7;
                }
                n5 = n6;
            }
            if (n5 == -1) {
                arrayList3.add(sprde2);
                arrayList5.add(arrayList7);
                arrayList4.add(arg2 ? sprmhm3 : null);
            } else {
                sprmhm sprmhm4;
                if (arg2 && sprmhm3 != null && ((sprmhm4 = (sprmhm)arrayList4.get(n6)) == null || sproze.cfr_renamed_92(sprmhm3.cfr_renamed_7794(), sprmhm4.cfr_renamed_7794()))) {
                    arrayList4.set(n6, sprmhm3);
                }
                List list = (List)arrayList5.get(n6);
                for (sprzyg sprzyg3 : arrayList7) {
                    boolean bl;
                    block22: {
                        int n9;
                        boolean bl3 = false;
                        int n10 = n9 = 0;
                        while (n10 < list.size()) {
                            sprzyg sprzyg4 = (sprzyg)list.get(n9);
                            if (sprzyg.cfr_renamed_7698(sprzyg3, sprzyg4)) {
                                bl3 = true;
                                sprzyg4 = sprzyg.cfr_renamed_7699(sprzyg4, sprzyg3);
                                bl = bl3;
                                list.set(n9, sprzyg4);
                                break block22;
                            }
                            n10 = ++n9;
                        }
                        bl = bl3;
                    }
                    if (bl) continue;
                    list.add(sprzyg3);
                }
            }
            n4 = ++n;
        }
        if (arg1.cfr_renamed_724 != null) {
            if (arrayList == null && arg3) {
                arrayList = new ArrayList<sprzyg>(arg1.cfr_renamed_724);
            } else {
                for (sprzyg sprzyg5 : arg1.cfr_renamed_724) {
                    boolean bl;
                    block23: {
                        boolean bl4 = false;
                        ArrayList<sprzyg> arrayList8 = arrayList;
                        for (int i = 0; arrayList8 != null && i < arrayList.size(); ++i) {
                            sprzyg sprzyg6 = (sprzyg)arrayList.get(i);
                            if (sprzyg.cfr_renamed_7698(sprzyg6, sprzyg5)) {
                                bl4 = true;
                                sprzyg6 = sprzyg.cfr_renamed_7699(sprzyg6, sprzyg5);
                                bl = bl4;
                                arrayList.set(i, sprzyg6);
                                break block23;
                            }
                            arrayList8 = arrayList;
                        }
                        bl = bl4;
                    }
                    if (bl || arrayList == null) continue;
                    arrayList.add(sprzyg5);
                }
            }
        }
        sprvbh sprvbh3 = new sprvbh(arg0, sprmhm2, arrayList2, arrayList3, arrayList4, arrayList5);
        sprvbh3.cfr_renamed_724 = arrayList;
        return sprvbh3;
    }

    public Iterator<sprzyg> cfr_renamed_7808(int arg0) {
        ArrayList<sprzyg> arrayList = new ArrayList<sprzyg>();
        Iterator<sprzyg> iterator = this.cfr_renamed_7802();
        while (iterator.hasNext()) {
            sprzyg sprzyg2 = iterator.next();
            if (sprzyg2.cfr_renamed_7576() != arg0) continue;
            arrayList.add(sprzyg2);
        }
        return arrayList.iterator();
    }

    /*
     * WARNING - void declaration
     */
    public Iterator<sprzyg> cfr_renamed_7817(byte[] byArray) {
        void arg0;
        return this.cfr_renamed_7789(new sprdbm((byte[])arg0));
    }

    public Iterator<sprzyg> cfr_renamed_7818(sprnvg arg0) {
        int n;
        ArrayList<sprzyg> arrayList = new ArrayList<sprzyg>();
        boolean bl = false;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_287.size()) {
            if (arg0.equals(this.cfr_renamed_287.get(n))) {
                bl = true;
                arrayList.addAll(this.cfr_renamed_0.get(n));
            }
            n2 = ++n;
        }
        if (bl) {
            return arrayList.iterator();
        }
        return null;
    }

    public void cfr_renamed_2623(OutputStream arg0) throws IOException {
        this.cfr_renamed_1310(arg0, false);
    }
}

