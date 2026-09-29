/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdcka;
import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprpug;
import com.spire.presentation.packages.sprqug;
import com.spire.presentation.packages.sprrk;
import com.spire.presentation.packages.sprse;
import com.spire.presentation.packages.sprtbh;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprttg;
import com.spire.presentation.packages.sprtwe;
import com.spire.presentation.packages.sprvbh;
import com.spire.presentation.packages.sprxan;
import com.spire.presentation.packages.spryah;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class sprryg
implements sprse<sprtbh> {
    private List<Long> cfr_renamed_3;
    private Map<Long, sprtbh> cfr_renamed_4;

    public static sprryg cfr_renamed_7765(sprryg arg0, sprtbh arg1) {
        Long l = sprtwe.cfr_renamed_5187(arg1.cfr_renamed_1157().cfr_renamed_7541());
        if (arg0.cfr_renamed_4.containsKey(l)) {
            throw new IllegalArgumentException(sprxan.cfr_renamed_9(",\u0012\u0003\u0011\n\u001e\u001b\u0014\u0000\u0013O\u001c\u0003\u000f\n\u001c\u000b\u0004O\u001e\u0000\u0013\u001b\u001c\u0006\u0013\u001c]\u000e]\u0004\u0018\u0016]\u0018\u0014\u001b\u0015O\u001cO\u0016\n\u0004&9O\u001b\u0000\u000fO\t\u0007\u0018O\r\u000e\u000e\u001c\u0018\u000b]\u0006\u0013O\u000f\u0006\u0013\bS"));
        }
        HashMap<Long, sprtbh> hashMap = new HashMap<Long, sprtbh>(arg0.cfr_renamed_4);
        ArrayList<Long> arrayList = new ArrayList<Long>(arg0.cfr_renamed_3);
        hashMap.put(l, arg1);
        arrayList.add(l);
        return new sprryg(hashMap, arrayList);
    }

    public void cfr_renamed_2623(OutputStream arg0) throws IOException {
        Iterator<Long> iterator;
        sprjah sprjah2 = sprjah.cfr_renamed_7679(arg0);
        Iterator<Long> iterator2 = iterator = this.cfr_renamed_3.iterator();
        while (iterator2.hasNext()) {
            this.cfr_renamed_4.get(iterator.next()).cfr_renamed_2623(sprjah2);
            iterator2 = iterator;
        }
    }

    public Iterator<sprtbh> cfr_renamed_7705(String arg0) {
        return this.cfr_renamed_7706(arg0, false, false);
    }

    public sprtbh cfr_renamed_7766(byte[] arg0) {
        Iterator<sprtbh> iterator = this.cfr_renamed_7704();
        while (iterator.hasNext()) {
            sprtbh sprtbh2 = iterator.next();
            if (sprtbh2.cfr_renamed_5981(arg0) == null) continue;
            return sprtbh2;
        }
        return null;
    }

    public sprryg(Collection<sprtbh> collection) {
        Iterator<sprtbh> iterator;
        sprryg sprryg2 = this;
        this.cfr_renamed_4 = new HashMap<Long, sprtbh>();
        sprryg2.cfr_renamed_3 = new ArrayList<Long>();
        Iterator<sprtbh> iterator2 = iterator = collection.iterator();
        while (iterator2.hasNext()) {
            sprtbh sprtbh2 = iterator.next();
            Long l = sprtwe.cfr_renamed_5187(sprtbh2.cfr_renamed_1157().cfr_renamed_7541());
            iterator2 = iterator;
            this.cfr_renamed_4.put(l, sprtbh2);
            this.cfr_renamed_3.add(l);
        }
    }

    public sprtbh cfr_renamed_7767(long arg0) {
        Long l = sprtwe.cfr_renamed_5187(arg0);
        if (this.cfr_renamed_4.containsKey(l)) {
            return this.cfr_renamed_4.get(l);
        }
        Iterator<sprtbh> iterator = this.cfr_renamed_7704();
        while (iterator.hasNext()) {
            sprtbh sprtbh2 = iterator.next();
            if (sprtbh2.cfr_renamed_7720(arg0) == null) continue;
            return sprtbh2;
        }
        return null;
    }

    public static sprryg cfr_renamed_7768(sprryg arg0, sprtbh arg1) {
        Long l = sprtwe.cfr_renamed_5187(arg1.cfr_renamed_1157().cfr_renamed_7541());
        if (!arg0.cfr_renamed_4.containsKey(l)) {
            throw new IllegalArgumentException(sprdcka.cfr_renamed_9("e&J%C*R I'\u0006-I,UiH&RiE&H=G HiGiM,_iQ R!\u0006(\u0006\"C0o\r\u0006/I;\u0006=N,\u00069G:U,BiO'\u0006;O'Ag"));
        }
        HashMap<Long, sprtbh> hashMap = new HashMap<Long, sprtbh>(arg0.cfr_renamed_4);
        ArrayList<Long> arrayList = new ArrayList<Long>(arg0.cfr_renamed_3);
        hashMap.remove(l);
        int n = 0;
        int n2 = n;
        while (n2 < arrayList.size()) {
            if (((Long)arrayList.get(n)).longValue() == l.longValue()) {
                arrayList.remove(n);
                break;
            }
            n2 = ++n;
        }
        return new sprryg(hashMap, arrayList);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprryg(Map<Long, sprtbh> map, List<Long> list) {
        void arg0;
        sprryg sprryg2 = this;
        sprryg sprryg3 = this;
        this.cfr_renamed_4 = new HashMap<Long, sprtbh>();
        sprryg3.cfr_renamed_3 = new ArrayList<Long>();
        sprryg2.cfr_renamed_4 = arg0;
        sprryg2.cfr_renamed_3 = list;
    }

    public Iterator<sprtbh> cfr_renamed_7704() {
        return this.cfr_renamed_4.values().iterator();
    }

    @Override
    public Iterator<sprtbh> iterator() {
        sprryg sprryg2 = this;
        return new spryah<sprtbh>(sprryg2.cfr_renamed_3, sprryg2.cfr_renamed_4);
    }

    public sprvbh cfr_renamed_7720(long arg0) {
        Iterator<sprtbh> iterator = this.cfr_renamed_7704();
        while (iterator.hasNext()) {
            sprvbh sprvbh2 = iterator.next().cfr_renamed_7720(arg0);
            if (sprvbh2 == null) continue;
            return sprvbh2;
        }
        return null;
    }

    public Iterator<sprtbh> cfr_renamed_7709(String arg0, boolean arg1) {
        return this.cfr_renamed_7706(arg0, arg1, false);
    }

    /*
     * WARNING - void declaration
     */
    public sprryg(InputStream inputStream, sprrk sprrk2) throws IOException, sprtqg {
        void arg1;
        void arg0;
        sprryg sprryg2 = this;
        this.cfr_renamed_4 = new HashMap<Long, sprtbh>();
        sprryg2.cfr_renamed_3 = new ArrayList<Long>();
        sprqug sprqug2 = new sprqug((InputStream)arg0, (sprrk)arg1);
        block0: while (true) {
            Object object;
            sprqug sprqug3 = sprqug2;
            while ((object = sprqug3.cfr_renamed_7703()) != null) {
                if (object instanceof sprttg) continue block0;
                if (object instanceof sprpug) {
                    sprqug3 = sprqug2;
                    continue;
                }
                if (!(object instanceof sprtbh)) {
                    throw new sprtqg(new StringBuilder().insert(0, object.getClass().getName()).append(sprxan.cfr_renamed_9("O\u001b\u0000\b\u0001\u0019O\n\u0007\u0018\u001d\u0018O-(-?\b\r\u0011\u0006\u001e$\u0018\u0016/\u0006\u0013\b]\n\u0005\u001f\u0018\f\t\n\u0019")).toString());
                }
                sprtbh sprtbh2 = (sprtbh)object;
                Long l = sprtwe.cfr_renamed_5187(sprtbh2.cfr_renamed_1157().cfr_renamed_7541());
                sprqug3 = sprqug2;
                this.cfr_renamed_4.put(l, sprtbh2);
                this.cfr_renamed_3.add(l);
            }
            break;
        }
    }

    public byte[] cfr_renamed_91() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream = new ByteArrayOutputStream();
        this.cfr_renamed_2623(byteArrayOutputStream2);
        return byteArrayOutputStream2.toByteArray();
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_3.size();
    }

    public boolean cfr_renamed_7714(long arg0) {
        return this.cfr_renamed_7720(arg0) != null;
    }

    /*
     * WARNING - void declaration
     */
    public sprryg(byte[] byArray, sprrk sprrk2) throws IOException, sprtqg {
        this(new ByteArrayInputStream((byte[])arg0), (sprrk)arg1);
        void arg1;
        void arg0;
    }

    public Iterator<sprtbh> cfr_renamed_7706(String arg0, boolean arg1, boolean arg2) {
        Iterator<sprtbh> iterator = this.cfr_renamed_7704();
        ArrayList<sprtbh> arrayList = new ArrayList<sprtbh>();
        if (arg2) {
            arg0 = sprkoe.cfr_renamed_425(arg0);
        }
        while (iterator.hasNext()) {
            sprtbh sprtbh2 = iterator.next();
            Iterator<String> iterator2 = sprtbh2.cfr_renamed_1157().cfr_renamed_7712();
            while (iterator2.hasNext()) {
                String string = iterator2.next();
                if (arg2) {
                    string = sprkoe.cfr_renamed_425(string);
                }
                if (arg1) {
                    if (string.indexOf(arg0) < 0) continue;
                    arrayList.add(sprtbh2);
                    continue;
                }
                if (!string.equals(arg0)) continue;
                arrayList.add(sprtbh2);
            }
        }
        return arrayList.iterator();
    }

    public sprvbh cfr_renamed_5981(byte[] arg0) {
        Iterator<sprtbh> iterator = this.cfr_renamed_7704();
        while (iterator.hasNext()) {
            sprvbh sprvbh2 = iterator.next().cfr_renamed_5981(arg0);
            if (sprvbh2 == null) continue;
            return sprvbh2;
        }
        return null;
    }

    public Iterator<sprvbh> cfr_renamed_7726(long arg0) {
        ArrayList<sprvbh> arrayList = new ArrayList<sprvbh>();
        Iterator<sprtbh> iterator = this.iterator();
        while (iterator.hasNext()) {
            Iterator<sprvbh> iterator2 = iterator.next().cfr_renamed_7726(arg0);
            while (iterator2.hasNext()) {
                Iterator<sprvbh> iterator3;
                Iterator<sprvbh> iterator4 = iterator3;
                iterator2 = iterator4;
                arrayList.add(iterator4.next());
            }
        }
        return arrayList.iterator();
    }

    public boolean cfr_renamed_7769(byte[] arg0) {
        return this.cfr_renamed_5981(arg0) != null;
    }
}

