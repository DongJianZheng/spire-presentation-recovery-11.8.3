/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprde;
import com.spire.presentation.packages.sprgwg;
import com.spire.presentation.packages.sprifm;
import com.spire.presentation.packages.spriyg;
import com.spire.presentation.packages.sprkfm;
import com.spire.presentation.packages.sprlgm;
import com.spire.presentation.packages.sprluda;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sprmhm;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpam;
import com.spire.presentation.packages.sprplc;
import com.spire.presentation.packages.sprrk;
import com.spire.presentation.packages.sprrrg;
import com.spire.presentation.packages.sprse;
import com.spire.presentation.packages.sprtbh;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprvbh;
import com.spire.presentation.packages.sprwem;
import com.spire.presentation.packages.sprysg;
import com.spire.presentation.packages.sprzcm;
import com.spire.presentation.packages.sprzyg;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class sprbrg
extends sprrrg
implements sprse<spriyg> {
    public List<sprvbh> cfr_renamed_2;
    private static final Logger cfr_renamed_3 = Logger.getLogger(sprbrg.class.getName());
    public List<spriyg> cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream = new ByteArrayOutputStream();
        this.cfr_renamed_2623(byteArrayOutputStream2);
        return byteArrayOutputStream2.toByteArray();
    }

    public static sprbrg cfr_renamed_7715(sprbrg arg0, sprvbh arg1) {
        spriyg spriyg2 = arg0.cfr_renamed_7708(arg1.cfr_renamed_7541());
        if (spriyg2 != null) {
            ArrayList<spriyg> arrayList = new ArrayList<spriyg>(arg0.cfr_renamed_4.size());
            Iterator<spriyg> iterator = arg0.cfr_renamed_7716();
            while (iterator.hasNext()) {
                spriyg spriyg3 = iterator.next();
                if (spriyg3.cfr_renamed_7541() != arg1.cfr_renamed_7541()) continue;
                spriyg3 = spriyg.cfr_renamed_7717(spriyg2, arg1);
                arrayList.add(spriyg3);
            }
            return new sprbrg(arrayList);
        }
        ArrayList<sprvbh> arrayList = new ArrayList<sprvbh>(arg0.cfr_renamed_2.size());
        boolean bl = false;
        Iterator<sprvbh> iterator = arg0.cfr_renamed_7718();
        while (iterator.hasNext()) {
            sprvbh sprvbh2 = iterator.next();
            ArrayList<sprvbh> arrayList2 = arrayList;
            if (sprvbh2.cfr_renamed_7541() == arg1.cfr_renamed_7541()) {
                arrayList2.add(arg1);
                bl = true;
                continue;
            }
            arrayList2.add(sprvbh2);
        }
        if (!bl) {
            arrayList.add(arg1);
        }
        return new sprbrg(new ArrayList<spriyg>(arg0.cfr_renamed_4), arrayList);
    }

    public static sprbrg cfr_renamed_7719(sprbrg arg0, sprtbh arg1) {
        Iterator<spriyg> iterator;
        ArrayList<spriyg> arrayList = new ArrayList<spriyg>(arg0.cfr_renamed_4.size());
        Iterator<spriyg> iterator2 = iterator = arg0.cfr_renamed_4.iterator();
        while (iterator2.hasNext()) {
            spriyg spriyg2 = iterator.next();
            sprvbh sprvbh2 = arg1.cfr_renamed_7720(spriyg2.cfr_renamed_7541());
            iterator2 = iterator;
            arrayList.add(spriyg.cfr_renamed_7717(spriyg2, sprvbh2));
        }
        return new sprbrg(arrayList);
    }

    @Override
    public Iterator<sprvbh> cfr_renamed_7458() {
        Iterator<spriyg> iterator;
        ArrayList<sprvbh> arrayList = new ArrayList<sprvbh>();
        Iterator<spriyg> iterator2 = iterator = this.cfr_renamed_7716();
        while (iterator2.hasNext()) {
            sprvbh sprvbh2 = iterator.next().cfr_renamed_1157();
            iterator2 = iterator;
            arrayList.add(sprvbh2);
        }
        ArrayList<sprvbh> arrayList2 = arrayList;
        arrayList2.addAll(this.cfr_renamed_2);
        return Collections.unmodifiableList(arrayList2).iterator();
    }

    public static sprbrg cfr_renamed_7721(sprbrg arg0, sprgwg arg1, sprysg arg2) throws sprtqg {
        ArrayList<spriyg> arrayList = new ArrayList<spriyg>(arg0.cfr_renamed_4.size());
        Iterator<spriyg> iterator = arg0.cfr_renamed_7716();
        while (iterator.hasNext()) {
            spriyg spriyg2 = iterator.next();
            if (spriyg2.cfr_renamed_7722()) {
                arrayList.add(spriyg2);
                continue;
            }
            arrayList.add(spriyg.cfr_renamed_7723(spriyg2, arg1, arg2));
        }
        return new sprbrg(arrayList, arg0.cfr_renamed_2);
    }

    public sprbrg(List<spriyg> arg0) {
        this(sprbrg.cfr_renamed_7724(arg0), new ArrayList<sprvbh>());
    }

    public spriyg cfr_renamed_7711() {
        return this.cfr_renamed_4.get(0);
    }

    @Override
    public sprvbh cfr_renamed_1157() {
        return this.cfr_renamed_4.get(0).cfr_renamed_1157();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprbrg(List<spriyg> list, List<sprvbh> list2) {
        void arg0;
        sprbrg sprbrg2 = this;
        sprbrg2.cfr_renamed_4 = arg0;
        sprbrg2.cfr_renamed_2 = list2;
    }

    public spriyg cfr_renamed_7708(long arg0) {
        int n;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.size()) {
            spriyg spriyg2 = this.cfr_renamed_4.get(n);
            if (arg0 == spriyg2.cfr_renamed_7541()) {
                return spriyg2;
            }
            n2 = ++n;
        }
        return null;
    }

    @Override
    public int cfr_renamed_84() {
        return this.cfr_renamed_4.size();
    }

    private static /* synthetic */ List<spriyg> cfr_renamed_7724(List<spriyg> arg0) {
        int n;
        ArrayList<spriyg> arrayList = new ArrayList<spriyg>(arg0.size());
        int n2 = n = 0;
        while (n2 != arg0.size()) {
            spriyg spriyg2 = arg0.get(n);
            if (n == 0) {
                if (!spriyg2.cfr_renamed_7669()) {
                    throw new IllegalArgumentException(sprplc.cfr_renamed_9("\r(\u001fmVm\u000b8\u00159F/\u0003m\u0007m\u000b,\u00159\u0003?F&\u00034"));
                }
            } else if (spriyg2.cfr_renamed_7669()) {
                throw new IllegalArgumentException(sprluda.cfr_renamed_9("`4rq;qh0eqi4+>e=rqf0x%n#+:n("));
            }
            arrayList.add(spriyg2);
            n2 = ++n;
        }
        return arrayList;
    }

    public Iterator<sprvbh> cfr_renamed_7718() {
        return this.cfr_renamed_2.iterator();
    }

    public Iterator<spriyg> cfr_renamed_7716() {
        return Collections.unmodifiableList(this.cfr_renamed_4).iterator();
    }

    @Override
    public void cfr_renamed_2623(OutputStream arg0) throws IOException {
        Object object;
        int n;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.size()) {
            spriyg spriyg2 = this.cfr_renamed_4.get(n);
            object = spriyg2;
            spriyg2.cfr_renamed_2623(arg0);
            n2 = ++n;
        }
        int n3 = n = 0;
        while (n3 != this.cfr_renamed_2.size()) {
            sprvbh sprvbh2 = this.cfr_renamed_2.get(n);
            object = sprvbh2;
            sprvbh2.cfr_renamed_2623(arg0);
            n3 = ++n;
        }
    }

    public spriyg cfr_renamed_7725(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.size()) {
            spriyg spriyg2 = this.cfr_renamed_4.get(n);
            if (sproze.cfr_renamed_92(arg0, spriyg2.cfr_renamed_1157().cfr_renamed_5209())) {
                return spriyg2;
            }
            n2 = ++n;
        }
        return null;
    }

    @Override
    public sprvbh cfr_renamed_7720(long arg0) {
        int n;
        spriyg spriyg2 = this.cfr_renamed_7708(arg0);
        if (spriyg2 != null) {
            return spriyg2.cfr_renamed_1157();
        }
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_2.size()) {
            sprvbh sprvbh2 = this.cfr_renamed_2.get(n);
            if (arg0 == sprvbh2.cfr_renamed_7541()) {
                return sprvbh2;
            }
            n2 = ++n;
        }
        return null;
    }

    @Override
    public Iterator<sprvbh> cfr_renamed_7726(long arg0) {
        ArrayList<sprvbh> arrayList = new ArrayList<sprvbh>();
        Iterator<sprvbh> iterator = this.cfr_renamed_7458();
        while (iterator.hasNext()) {
            sprvbh sprvbh2 = iterator.next();
            if (!sprvbh2.cfr_renamed_7727(arg0).hasNext()) continue;
            arrayList.add(sprvbh2);
        }
        return arrayList.iterator();
    }

    public static sprbrg cfr_renamed_7728(sprbrg sprbrg2, spriyg spriyg2) {
        int n;
        sprbrg arg0;
        int n2 = arg0.cfr_renamed_4.size();
        long l = spriyg2.cfr_renamed_7541();
        ArrayList<spriyg> arrayList = new ArrayList<spriyg>(n2);
        boolean bl = false;
        int n3 = n = 0;
        while (n3 < n2) {
            spriyg spriyg3 = arg0.cfr_renamed_4.get(n);
            if (spriyg3.cfr_renamed_7541() == l) {
                bl = true;
            } else {
                arrayList.add(spriyg3);
            }
            n3 = ++n;
        }
        if (!bl) {
            return null;
        }
        return new sprbrg(arrayList, arg0.cfr_renamed_2);
    }

    public static sprbrg cfr_renamed_7729(sprbrg arg0, spriyg arg1) {
        int n;
        ArrayList<spriyg> arrayList = new ArrayList<spriyg>(arg0.cfr_renamed_4);
        boolean bl = false;
        boolean bl2 = false;
        int n2 = n = 0;
        while (n2 != arrayList.size()) {
            spriyg spriyg2 = (spriyg)arrayList.get(n);
            if (spriyg2.cfr_renamed_7541() == arg1.cfr_renamed_7541()) {
                bl = true;
                arrayList.set(n, arg1);
            }
            if (spriyg2.cfr_renamed_7669()) {
                bl2 = true;
            }
            n2 = ++n;
        }
        if (!bl) {
            if (arg1.cfr_renamed_7669()) {
                if (bl2) {
                    throw new IllegalArgumentException(sprplc.cfr_renamed_9("\u0005,\b#\t9F,\u0002)F,F \u0007>\u0012(\u0014m\r(\u001fm\u0012\"F,F?\u000f#\u0001m\u0012%\u00079F,\n?\u0003,\u00024F%\u0007>F\"\b("));
                }
                arrayList.add(0, arg1);
            } else {
                arrayList.add(arg1);
            }
        }
        return new sprbrg(arrayList, arg0.cfr_renamed_2);
    }

    @Override
    public sprvbh cfr_renamed_5981(byte[] arg0) {
        int n;
        spriyg spriyg2 = this.cfr_renamed_7725(arg0);
        if (spriyg2 != null) {
            return spriyg2.cfr_renamed_1157();
        }
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_2.size()) {
            sprvbh sprvbh2 = this.cfr_renamed_2.get(n);
            if (sproze.cfr_renamed_92(arg0, sprvbh2.cfr_renamed_5209())) {
                return sprvbh2;
            }
            n2 = ++n;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprbrg(byte[] byArray, sprrk sprrk2) throws IOException, sprtqg {
        this(new ByteArrayInputStream((byte[])arg0), (sprrk)arg1);
        void arg1;
        void arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprbrg(InputStream inputStream, sprrk sprrk2) throws IOException, sprtqg {
        void arg1;
        sprbrg sprbrg2 = this;
        this.cfr_renamed_4 = new ArrayList<spriyg>();
        sprbrg2.cfr_renamed_2 = new ArrayList<sprvbh>();
        sprmam sprmam2 = sprmam.cfr_renamed_7730(inputStream);
        int n = sprmam2.cfr_renamed_7731();
        if (n != 5 && n != 7) {
            throw new IOException(new StringBuilder().insert(0, sprluda.cfr_renamed_9("\"n2y4\u007fq`4rqy8e6+5d4x?,%+\"\u007f0y%+&b%cqx4h#n%+:n(+%j61q\u007f0lq;)")).append(Integer.toHexString(n)).toString());
        }
        sprkfm sprkfm2 = (sprkfm)sprmam2.cfr_renamed_7676();
        sprmam sprmam3 = sprmam2;
        while (sprmam3.cfr_renamed_7534() == 61) {
            sprmam sprmam4 = sprmam2;
            sprmam3 = sprmam4;
            sprmam4.cfr_renamed_7676();
        }
        sprmam sprmam5 = sprmam2;
        sprmhm sprmhm2 = sprbrg.cfr_renamed_7732(sprmam5);
        List<sprzyg> list = sprbrg.cfr_renamed_7733(sprmam5);
        ArrayList<sprde> arrayList = new ArrayList<sprde>();
        ArrayList<sprmhm> arrayList2 = new ArrayList<sprmhm>();
        ArrayList<List<sprzyg>> arrayList3 = new ArrayList<List<sprzyg>>();
        sprbrg.cfr_renamed_7734(sprmam5, arrayList, arrayList2, arrayList3);
        sprkfm sprkfm3 = sprkfm2;
        this.cfr_renamed_4.add(new spriyg(sprkfm3, new sprvbh(sprkfm3.cfr_renamed_7735(), sprmhm2, list, arrayList, arrayList2, arrayList3, (sprrk)arg1)));
        while (sprmam2.cfr_renamed_7534() == 7 || sprmam2.cfr_renamed_7534() == 14) {
            try {
                List<sprzyg> list2;
                sprmhm sprmhm3;
                sprzcm sprzcm2;
                if (sprmam2.cfr_renamed_7534() == 7) {
                    sprzcm2 = (sprwem)sprmam2.cfr_renamed_7676();
                    sprmam sprmam6 = sprmam2;
                    while (sprmam6.cfr_renamed_7534() == 61) {
                        sprmam sprmam7 = sprmam2;
                        sprmam6 = sprmam7;
                        sprmam7.cfr_renamed_7676();
                    }
                    sprmam sprmam8 = sprmam2;
                    sprmhm3 = sprbrg.cfr_renamed_7732(sprmam8);
                    list2 = sprbrg.cfr_renamed_7733(sprmam8);
                    sprzcm sprzcm3 = sprzcm2;
                    this.cfr_renamed_4.add(new spriyg((sprkfm)sprzcm3, new sprvbh(((sprkfm)sprzcm3).cfr_renamed_7735(), sprmhm3, list2, (sprrk)arg1)));
                    continue;
                }
                sprzcm2 = (sprpam)sprmam2.cfr_renamed_7676();
                sprmam sprmam9 = sprmam2;
                sprmhm3 = sprbrg.cfr_renamed_7732(sprmam9);
                list2 = sprbrg.cfr_renamed_7733(sprmam9);
                this.cfr_renamed_2.add(new sprvbh((sprifm)sprzcm2, sprmhm3, list2, (sprrk)arg1));
            }
            catch (EOFException eOFException) {
                throw eOFException;
            }
            catch (sprlgm sprlgm2) {
                throw sprlgm2;
            }
            catch (IOException iOException) {
                if (!cfr_renamed_3.isLoggable(Level.FINE)) continue;
                cfr_renamed_3.fine(new StringBuilder().insert(0, sprplc.cfr_renamed_9(">\r$\u0016=\u000f#\u0001m\u0013#\r#\t:\bm\u00158\u0004&\u00034\\m")).append(iOException.getMessage()).toString());
            }
        }
    }

    @Override
    public Iterator<spriyg> iterator() {
        return this.cfr_renamed_7716();
    }
}

