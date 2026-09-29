/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbrg;
import com.spire.presentation.packages.sprhcaa;
import com.spire.presentation.packages.spriyg;
import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprprca;
import com.spire.presentation.packages.sprpug;
import com.spire.presentation.packages.sprqug;
import com.spire.presentation.packages.sprrk;
import com.spire.presentation.packages.sprse;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprttg;
import com.spire.presentation.packages.sprtwe;
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

public class sprlsg
implements sprse<sprbrg> {
    private List<Long> cfr_renamed_3;
    private Map<Long, sprbrg> cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprlsg(Map<Long, sprbrg> map, List<Long> list) {
        void arg0;
        sprlsg sprlsg2 = this;
        sprlsg sprlsg3 = this;
        this.cfr_renamed_4 = new HashMap<Long, sprbrg>();
        sprlsg3.cfr_renamed_3 = new ArrayList<Long>();
        sprlsg2.cfr_renamed_4 = arg0;
        sprlsg2.cfr_renamed_3 = list;
    }

    /*
     * WARNING - void declaration
     */
    public sprlsg(InputStream inputStream, sprrk sprrk2) throws IOException, sprtqg {
        void arg1;
        void arg0;
        sprlsg sprlsg2 = this;
        this.cfr_renamed_4 = new HashMap<Long, sprbrg>();
        sprlsg2.cfr_renamed_3 = new ArrayList<Long>();
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
                if (!(object instanceof sprbrg)) {
                    throw new sprtqg(new StringBuilder().insert(0, object.getClass().getName()).append(sprprca.cfr_renamed_9("vR9A8PvC>Q$Qvd\u0011d\u0005Q5F3@\u001dQ/f?Z1\u00143L&Q5@3P")).toString());
                }
                sprbrg sprbrg2 = (sprbrg)object;
                Long l = sprtwe.cfr_renamed_5187(sprbrg2.cfr_renamed_1157().cfr_renamed_7541());
                sprqug3 = sprqug2;
                this.cfr_renamed_4.put(l, sprbrg2);
                this.cfr_renamed_3.add(l);
            }
            break;
        }
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_3.size();
    }

    public sprlsg(Collection<sprbrg> collection) {
        Iterator<sprbrg> iterator;
        sprlsg sprlsg2 = this;
        this.cfr_renamed_4 = new HashMap<Long, sprbrg>();
        sprlsg2.cfr_renamed_3 = new ArrayList<Long>();
        Iterator<sprbrg> iterator2 = iterator = collection.iterator();
        while (iterator2.hasNext()) {
            sprbrg sprbrg2 = iterator.next();
            Long l = sprtwe.cfr_renamed_5187(sprbrg2.cfr_renamed_1157().cfr_renamed_7541());
            iterator2 = iterator;
            this.cfr_renamed_4.put(l, sprbrg2);
            this.cfr_renamed_3.add(l);
        }
    }

    public Iterator<sprbrg> cfr_renamed_7704() {
        return this.cfr_renamed_4.values().iterator();
    }

    public Iterator<sprbrg> cfr_renamed_7705(String arg0) {
        return this.cfr_renamed_7706(arg0, false, false);
    }

    public sprbrg cfr_renamed_7707(long arg0) {
        Long l = sprtwe.cfr_renamed_5187(arg0);
        if (this.cfr_renamed_4.containsKey(l)) {
            return this.cfr_renamed_4.get(l);
        }
        Iterator<sprbrg> iterator = this.cfr_renamed_7704();
        while (iterator.hasNext()) {
            sprbrg sprbrg2 = iterator.next();
            if (sprbrg2.cfr_renamed_7708(arg0) == null) continue;
            return sprbrg2;
        }
        return null;
    }

    public Iterator<sprbrg> cfr_renamed_7709(String arg0, boolean arg1) {
        return this.cfr_renamed_7706(arg0, arg1, false);
    }

    public static sprlsg cfr_renamed_7710(sprlsg arg0, sprbrg arg1) {
        Long l = sprtwe.cfr_renamed_5187(arg1.cfr_renamed_1157().cfr_renamed_7541());
        if (arg0.cfr_renamed_4.containsKey(l)) {
            throw new IllegalArgumentException(sprhcaa.cfr_renamed_9("f9I:@5Q?J8\u00057I$@7A/\u00055J8Q7L8VvDvN3\\vR?Q>\u00057\u0005=@/l\u0012\u00050J$\u0005\"M3\u0005&D%V3AvL8\u0005$L8Bx"));
        }
        HashMap<Long, sprbrg> hashMap = new HashMap<Long, sprbrg>(arg0.cfr_renamed_4);
        ArrayList<Long> arrayList = new ArrayList<Long>(arg0.cfr_renamed_3);
        hashMap.put(l, arg1);
        arrayList.add(l);
        return new sprlsg(hashMap, arrayList);
    }

    public Iterator<sprbrg> cfr_renamed_7706(String arg0, boolean arg1, boolean arg2) {
        Iterator<sprbrg> iterator = this.cfr_renamed_7704();
        ArrayList<sprbrg> arrayList = new ArrayList<sprbrg>();
        if (arg2) {
            arg0 = sprkoe.cfr_renamed_425(arg0);
        }
        while (iterator.hasNext()) {
            sprbrg sprbrg2 = iterator.next();
            Iterator<String> iterator2 = sprbrg2.cfr_renamed_7711().cfr_renamed_7712();
            while (iterator2.hasNext()) {
                String string = iterator2.next();
                if (arg2) {
                    string = sprkoe.cfr_renamed_425(string);
                }
                if (arg1) {
                    if (string.indexOf(arg0) < 0) continue;
                    arrayList.add(sprbrg2);
                    continue;
                }
                if (!string.equals(arg0)) continue;
                arrayList.add(sprbrg2);
            }
        }
        return arrayList.iterator();
    }

    public static sprlsg cfr_renamed_7713(sprlsg arg0, sprbrg arg1) {
        Long l = sprtwe.cfr_renamed_5187(arg1.cfr_renamed_1157().cfr_renamed_7541());
        if (!arg0.cfr_renamed_4.containsKey(l)) {
            throw new IllegalArgumentException(sprprca.cfr_renamed_9("\u0015[:X3W\"]9ZvP9Q%\u00148[\"\u00145[8@7]8\u00147\u0014=Q/\u0014!]\"\\vUv_3M\u001fpvR9Fv@>QvD7G%Q2\u0014?ZvF?Z1\u001a"));
        }
        HashMap<Long, sprbrg> hashMap = new HashMap<Long, sprbrg>(arg0.cfr_renamed_4);
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
        return new sprlsg(hashMap, arrayList);
    }

    /*
     * WARNING - void declaration
     */
    public sprlsg(byte[] byArray, sprrk sprrk2) throws IOException, sprtqg {
        this(new ByteArrayInputStream((byte[])arg0), (sprrk)arg1);
        void arg1;
        void arg0;
    }

    public boolean cfr_renamed_7714(long arg0) {
        return this.cfr_renamed_7708(arg0) != null;
    }

    @Override
    public Iterator<sprbrg> iterator() {
        sprlsg sprlsg2 = this;
        return new spryah<sprbrg>(sprlsg2.cfr_renamed_3, sprlsg2.cfr_renamed_4);
    }

    public byte[] cfr_renamed_91() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream = new ByteArrayOutputStream();
        this.cfr_renamed_2623(byteArrayOutputStream2);
        return byteArrayOutputStream2.toByteArray();
    }

    public spriyg cfr_renamed_7708(long arg0) {
        Iterator<sprbrg> iterator = this.cfr_renamed_7704();
        while (iterator.hasNext()) {
            spriyg spriyg2 = iterator.next().cfr_renamed_7708(arg0);
            if (spriyg2 == null) continue;
            return spriyg2;
        }
        return null;
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
}

