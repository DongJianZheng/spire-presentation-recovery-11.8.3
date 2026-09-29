/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprchm;
import com.spire.presentation.packages.sprde;
import com.spire.presentation.packages.sprifm;
import com.spire.presentation.packages.sprlgm;
import com.spire.presentation.packages.sprlyy;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sprmhm;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrk;
import com.spire.presentation.packages.sprrrg;
import com.spire.presentation.packages.sprse;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprtwe;
import com.spire.presentation.packages.sprtzl;
import com.spire.presentation.packages.sprvbh;
import com.spire.presentation.packages.sprzyg;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class sprtbh
extends sprrrg
implements sprse<sprvbh> {
    private static final Logger cfr_renamed_3 = Logger.getLogger(sprtbh.class.getName());
    public List<sprvbh> cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprvbh cfr_renamed_7770(sprmam arg0, sprrk arg1) throws IOException, sprtqg {
        try {
            sprmam sprmam2 = arg0;
            sprifm sprifm2 = sprtbh.cfr_renamed_7771(sprmam2);
            sprmhm sprmhm2 = sprtbh.cfr_renamed_7732(sprmam2);
            List<sprzyg> list = sprtbh.cfr_renamed_7733(sprmam2);
            return new sprvbh(sprifm2, sprmhm2, list, arg1);
        }
        catch (EOFException eOFException) {
            throw eOFException;
        }
        catch (sprlgm sprlgm2) {
            throw sprlgm2;
        }
        catch (IOException iOException) {
            if (cfr_renamed_3.isLoggable(Level.FINE)) {
                cfr_renamed_3.fine(new StringBuilder().insert(0, sprlyy.cfr_renamed_9("z\"`9y g.)<g\"g&~'):|+b,ps)")).append(iOException.getMessage()).toString());
            }
            return null;
        }
    }

    @Override
    public Iterator<sprvbh> cfr_renamed_7458() {
        return Collections.unmodifiableList(this.cfr_renamed_4).iterator();
    }

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream = new ByteArrayOutputStream();
        this.cfr_renamed_2623(byteArrayOutputStream2);
        return byteArrayOutputStream2.toByteArray();
    }

    public static sprifm cfr_renamed_7771(sprmam arg0) throws IOException {
        sprtzl sprtzl2 = arg0.cfr_renamed_7676();
        if (!(sprtzl2 instanceof sprifm)) {
            throw new IOException(new StringBuilder().insert(0, sprchm.cfr_renamed_9("\u0004z\u0014l\u0001q\u0012`\u0014pQd\u0010w\u001aq\u00054\u0018zQg\u0005f\u0014u\u001c.Q")).append(sprtzl2).toString());
        }
        return (sprifm)sprtzl2;
    }

    private static /* synthetic */ List<sprvbh> cfr_renamed_7724(List<sprvbh> arg0) {
        int n;
        ArrayList<sprvbh> arrayList = new ArrayList<sprvbh>(arg0.size());
        int n2 = n = 0;
        while (n2 != arg0.size()) {
            sprvbh sprvbh2 = arg0.get(n);
            if (n == 0) {
                if (!sprvbh2.cfr_renamed_7669()) {
                    throw new IllegalArgumentException(sprlyy.cfr_renamed_9("\"l0)y)$|:}ik,)()$h:},{ib,p"));
                }
            } else if (sprvbh2.cfr_renamed_7669()) {
                throw new IllegalArgumentException(sprchm.cfr_renamed_9("\u007f\u0014mQ$Qw\u0010zQv\u00144\u001ez\u001dmQy\u0010g\u0005q\u00034\u001aq\b"));
            }
            arrayList.add(sprvbh2);
            n2 = ++n;
        }
        return arrayList;
    }

    public static sprtbh cfr_renamed_7772(sprtbh sprtbh2, sprvbh sprvbh2) {
        int n;
        sprtbh arg0;
        int n2 = arg0.cfr_renamed_4.size();
        long l = sprvbh2.cfr_renamed_7541();
        ArrayList<sprvbh> arrayList = new ArrayList<sprvbh>(n2);
        boolean bl = false;
        int n3 = n = 0;
        while (n3 < n2) {
            sprvbh sprvbh3 = arg0.cfr_renamed_4.get(n);
            if (sprvbh3.cfr_renamed_7541() == l) {
                bl = true;
            } else {
                arrayList.add(sprvbh3);
            }
            n3 = ++n;
        }
        if (!bl) {
            return null;
        }
        return new sprtbh(arrayList);
    }

    @Override
    public Iterator<sprvbh> cfr_renamed_7726(long arg0) {
        int n;
        ArrayList<sprvbh> arrayList = new ArrayList<sprvbh>();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.size()) {
            sprvbh sprvbh2 = this.cfr_renamed_4.get(n);
            if (sprvbh2.cfr_renamed_7727(arg0).hasNext()) {
                arrayList.add(sprvbh2);
            }
            n2 = ++n;
        }
        return arrayList.iterator();
    }

    @Override
    public int cfr_renamed_84() {
        return this.cfr_renamed_4.size();
    }

    public byte[] cfr_renamed_1972(boolean arg0) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream = new ByteArrayOutputStream();
        this.cfr_renamed_1310(byteArrayOutputStream2, arg0);
        return byteArrayOutputStream2.toByteArray();
    }

    @Override
    public sprvbh cfr_renamed_1157() {
        return this.cfr_renamed_4.get(0);
    }

    public sprtbh(List<sprvbh> list) {
        this.cfr_renamed_4 = sprtbh.cfr_renamed_7724(list);
    }

    @Override
    public Iterator<sprvbh> iterator() {
        return this.cfr_renamed_7458();
    }

    @Override
    public void cfr_renamed_2623(OutputStream arg0) throws IOException {
        this.cfr_renamed_1310(arg0, false);
    }

    public static sprtbh cfr_renamed_7773(sprtbh arg0, sprtbh arg1, boolean arg2, boolean arg3) throws sprtqg {
        Object object;
        Iterator iterator;
        Object object2;
        if (!sproze.cfr_renamed_92(arg0.cfr_renamed_1157().cfr_renamed_5209(), arg1.cfr_renamed_1157().cfr_renamed_5209())) {
            throw new IllegalArgumentException(sprlyy.cfr_renamed_9("\nh'g&}id,{.lij,{=`/`*h=l:)>`=aim o/l;`'niy;`$h;pib,p:'"));
        }
        HashSet<Long> hashSet = new HashSet<Long>();
        Object object3 = object2 = arg1.iterator();
        while (object3.hasNext()) {
            iterator = object2.next();
            object3 = object2;
            hashSet.add(sprtwe.cfr_renamed_5187(((sprvbh)((Object)iterator)).cfr_renamed_7541()));
        }
        object2 = new ArrayList();
        iterator = arg0.iterator();
        while (iterator.hasNext()) {
            object = (sprvbh)iterator.next();
            sprvbh sprvbh2 = arg1.cfr_renamed_7720(((sprvbh)object).cfr_renamed_7541());
            if (sprvbh2 != null) {
                object2.add(sprvbh.cfr_renamed_7774((sprvbh)object, sprvbh2, arg2, arg3));
                hashSet.remove(sprtwe.cfr_renamed_5187(((sprvbh)object).cfr_renamed_7541()));
                continue;
            }
            object2.add(object);
        }
        Iterator iterator2 = iterator = hashSet.iterator();
        while (iterator2.hasNext()) {
            object = (Long)iterator.next();
            iterator2 = iterator;
            object2.add(arg1.cfr_renamed_7720((Long)object));
        }
        return new sprtbh((List<sprvbh>)object2);
    }

    @Override
    public sprvbh cfr_renamed_7720(long arg0) {
        int n;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.size()) {
            sprvbh sprvbh2 = this.cfr_renamed_4.get(n);
            if (arg0 == sprvbh2.cfr_renamed_7541()) {
                return sprvbh2;
            }
            n2 = ++n;
        }
        return null;
    }

    public static sprtbh cfr_renamed_7775(sprtbh arg0, sprvbh arg1) {
        int n;
        ArrayList<sprvbh> arrayList = new ArrayList<sprvbh>(arg0.cfr_renamed_4);
        boolean bl = false;
        boolean bl2 = false;
        int n2 = n = 0;
        while (n2 != arrayList.size()) {
            sprvbh sprvbh2 = (sprvbh)arrayList.get(n);
            if (sprvbh2.cfr_renamed_7541() == arg1.cfr_renamed_7541()) {
                bl = true;
                arrayList.set(n, arg1);
            }
            if (sprvbh2.cfr_renamed_7669()) {
                bl2 = true;
            }
            n2 = ++n;
        }
        if (!bl) {
            if (arg1.cfr_renamed_7669()) {
                if (bl2) {
                    throw new IllegalArgumentException(sprchm.cfr_renamed_9("w\u0010z\u001f{\u00054\u0010p\u00154\u00104\u001cu\u0002`\u0014fQ\u007f\u0014mQ`\u001e4\u00104\u0003}\u001fsQ`\u0019u\u00054\u0010x\u0003q\u0010p\b4\u0019u\u00024\u001ez\u0014"));
                }
                arrayList.add(0, arg1);
            } else {
                arrayList.add(arg1);
            }
        }
        return new sprtbh(arrayList);
    }

    public static sprtbh cfr_renamed_7776(sprtbh arg0, sprtbh arg1) throws sprtqg {
        return sprtbh.cfr_renamed_7773(arg0, arg1, false, false);
    }

    @Override
    public sprvbh cfr_renamed_5981(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.size()) {
            sprvbh sprvbh2 = this.cfr_renamed_4.get(n);
            if (sproze.cfr_renamed_92(arg0, sprvbh2.cfr_renamed_5209())) {
                return sprvbh2;
            }
            n2 = ++n;
        }
        return null;
    }

    public void cfr_renamed_1310(OutputStream arg0, boolean arg1) throws IOException {
        int n;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.size()) {
            this.cfr_renamed_4.get(++n).cfr_renamed_1310(arg0, arg1);
            n2 = n;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprtbh(InputStream inputStream, sprrk sprrk2) throws IOException {
        sprtbh sprtbh2 = this;
        sprtbh2.cfr_renamed_4 = new ArrayList<sprvbh>();
        sprmam sprmam2 = sprmam.cfr_renamed_7730(inputStream);
        int n = sprmam2.cfr_renamed_7731();
        if (n != 6 && n != 14) {
            throw new IOException(new StringBuilder().insert(0, sprlyy.cfr_renamed_9("y<k%`*)\"l0);`'nim&l:gn}iz=h;}i~ }!)9|+e jib,pi}(ns)=h.)yq")).append(Integer.toHexString(n)).toString());
        }
        sprmam sprmam3 = sprmam2;
        sprifm sprifm2 = sprtbh.cfr_renamed_7771(sprmam3);
        sprmhm sprmhm2 = sprtbh.cfr_renamed_7732(sprmam3);
        List<sprzyg> list = sprtbh.cfr_renamed_7733(sprmam3);
        ArrayList<sprde> arrayList = new ArrayList<sprde>();
        ArrayList<sprmhm> arrayList2 = new ArrayList<sprmhm>();
        ArrayList<List<sprzyg>> arrayList3 = new ArrayList<List<sprzyg>>();
        sprtbh.cfr_renamed_7734(sprmam3, arrayList, arrayList2, arrayList3);
        try {
            void arg1;
            this.cfr_renamed_4.add(new sprvbh(sprifm2, sprmhm2, list, arrayList, arrayList2, arrayList3, (sprrk)arg1));
            while (sprmam2.cfr_renamed_7534() == 14) {
                sprvbh sprvbh2 = sprtbh.cfr_renamed_7770(sprmam2, (sprrk)arg1);
                if (sprvbh2 == null) continue;
                this.cfr_renamed_4.add(sprvbh2);
            }
            return;
        }
        catch (sprtqg sprtqg2) {
            throw new IOException(new StringBuilder().insert(0, sprchm.cfr_renamed_9("d\u0003{\u0012q\u0002g\u0018z\u00164\u0014l\u0012q\u0001`\u0018{\u001f.Q")).append(sprtqg2.toString()).toString());
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprtbh(byte[] byArray, sprrk sprrk2) throws IOException {
        this(new ByteArrayInputStream((byte[])arg0), (sprrk)arg1);
        void arg1;
        void arg0;
    }
}

