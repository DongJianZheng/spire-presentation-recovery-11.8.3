/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlpf;
import com.spire.presentation.packages.sprqsf;
import com.spire.presentation.packages.sprrqf;
import com.spire.presentation.packages.sprtsf;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprvjf;
import com.spire.presentation.packages.sprvof;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public final class sprrsf
implements Serializable {
    private static final long cfr_renamed_2 = -3464451825208522308L;
    private final Map<Integer, sprqsf> cfr_renamed_3;
    private transient long cfr_renamed_4;

    public void cfr_renamed_5835(sprvjf arg0, long arg1, byte[] arg2, byte[] arg3) {
        int n;
        sprlpf sprlpf2 = arg0.cfr_renamed_5821();
        int n2 = sprlpf2.cfr_renamed_1452();
        long l = sprvof.cfr_renamed_5763(arg1, n2);
        int n3 = sprvof.cfr_renamed_5760(arg1, n2);
        sprrqf sprrqf2 = (sprrqf)((sprtsf)new sprtsf().cfr_renamed_5735(l)).cfr_renamed_5776(n3).cfr_renamed_1451();
        if (n3 < (1 << n2) - 1) {
            if (this.cfr_renamed_576(0) == null || n3 == 0) {
                this.cfr_renamed_5824(0, new sprqsf(sprlpf2, arg2, arg3, sprrqf2));
            }
            this.cfr_renamed_5900(0, arg2, arg3, sprrqf2);
        }
        int n4 = n = 1;
        while (n4 < arg0.cfr_renamed_1134()) {
            n3 = sprvof.cfr_renamed_5760(l, n2);
            l = sprvof.cfr_renamed_5763(l, n2);
            sprrqf2 = (sprrqf)((sprtsf)((sprtsf)new sprtsf().cfr_renamed_5733(n)).cfr_renamed_5735(l)).cfr_renamed_5776(n3).cfr_renamed_1451();
            if (this.cfr_renamed_3.get(n) == null || sprvof.cfr_renamed_5752(arg1, n2, n)) {
                this.cfr_renamed_3.put(n, new sprqsf(sprlpf2, arg2, arg3, sprrqf2));
            }
            if (n3 < (1 << n2) - 1 && sprvof.cfr_renamed_5757(arg1, n2, n)) {
                this.cfr_renamed_5900(n, arg2, arg3, sprrqf2);
            }
            n4 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprrsf(sprvjf sprvjf2, long l, byte[] byArray, byte[] byArray2) {
        void arg1;
        long l2;
        void arg0;
        sprrsf sprrsf2 = this;
        sprrsf sprrsf3 = this;
        sprrsf2.cfr_renamed_3 = new TreeMap<Integer, sprqsf>();
        sprrsf2.cfr_renamed_4 = (1L << arg0.cfr_renamed_1452()) - 1L;
        long l3 = l2 = 0L;
        while (l3 < arg1) {
            void arg3;
            void arg2;
            long l4 = l2;
            this.cfr_renamed_5835((sprvjf)arg0, l4, (byte[])arg2, (byte[])arg3);
            l3 = l4 + 1L;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        v0.defaultWriteObject();
        v0.writeLong(this.cfr_renamed_4);
    }

    public sprrsf(long l) {
        sprrsf sprrsf2 = this;
        sprrsf sprrsf3 = this;
        sprrsf2.cfr_renamed_3 = new TreeMap<Integer, sprqsf>();
        sprrsf2.cfr_renamed_4 = l;
    }

    public long cfr_renamed_5797() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_5824(int arg0, sprqsf arg1) {
        this.cfr_renamed_3.put(spruaf.cfr_renamed_279(arg0), arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprrsf(sprrsf sprrsf2, long l) {
        void arg1;
        Iterator<Integer> iterator;
        sprrsf sprrsf3 = this;
        sprrsf3.cfr_renamed_3 = new TreeMap<Integer, sprqsf>();
        Iterator<Integer> iterator2 = iterator = sprrsf2.cfr_renamed_3.keySet().iterator();
        while (iterator2.hasNext()) {
            void arg0;
            Integer n = iterator.next();
            this.cfr_renamed_3.put(n, new sprqsf(arg0.cfr_renamed_3.get(n)));
            iterator2 = iterator;
        }
        this.cfr_renamed_4 = arg1;
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        if (objectInputStream.available() != 0) {
            this.cfr_renamed_4 = arg0.readLong();
            return;
        }
        this.cfr_renamed_4 = 0L;
    }

    public sprqsf cfr_renamed_5900(int arg0, byte[] arg1, byte[] arg2, sprrqf arg3) {
        return this.cfr_renamed_3.put(spruaf.cfr_renamed_279(arg0), this.cfr_renamed_3.get(spruaf.cfr_renamed_279(arg0)).cfr_renamed_5798(arg1, arg2, arg3));
    }

    public boolean cfr_renamed_29() {
        return this.cfr_renamed_3.isEmpty();
    }

    public sprrsf cfr_renamed_5807(sprlem arg0) {
        Iterator<Integer> iterator;
        sprrsf sprrsf2 = new sprrsf(this.cfr_renamed_4);
        Iterator<Integer> iterator2 = iterator = this.cfr_renamed_3.keySet().iterator();
        while (iterator2.hasNext()) {
            Integer n;
            Integer n2 = n = iterator.next();
            sprrsf2.cfr_renamed_3.put(n2, this.cfr_renamed_3.get(n2).cfr_renamed_5807(arg0));
            iterator2 = iterator;
        }
        return sprrsf2;
    }

    public sprqsf cfr_renamed_576(int arg0) {
        return this.cfr_renamed_3.get(spruaf.cfr_renamed_279(arg0));
    }
}

