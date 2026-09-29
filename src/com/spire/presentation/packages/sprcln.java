/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Memory
 *  com.sun.jna.Native
 *  com.sun.jna.Pointer
 *  com.sun.jna.Structure
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxt;
import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@sprtea
public class sprcln
implements sprxt {
    private boolean cfr_renamed_1;
    private Pointer cfr_renamed_2 = Pointer.NULL;
    private boolean cfr_renamed_3;
    private static ConcurrentHashMap<Long, Pointer> cfr_renamed_4 = new ConcurrentHashMap();

    public void cfr_renamed_12973(Pointer arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public void cfr_renamed_11540(boolean arg0) {
        if (this.cfr_renamed_1) {
            return;
        }
        this.cfr_renamed_1 = true;
        if (arg0) {
            sprcln sprcln2 = this;
            sprcln2.cfr_renamed_12974();
            if (sprcln2.cfr_renamed_3) {
                // empty if block
            }
        }
    }

    public static Pointer cfr_renamed_12975(Structure[] arg0) {
        int n;
        int n2 = 0;
        n2 = arg0.length > 0 ? arg0[0].size() : 0;
        Memory memory = new Memory((long)(n2 * arg0.length));
        int n3 = n = 0;
        while (n3 < arg0.length) {
            Structure structure = arg0[n];
            structure.write();
            long l = n * n2;
            memory.write(l, structure.getPointer().getByteArray(0L, n2), 0, n2);
            n3 = ++n;
        }
        return memory;
    }

    public static Pointer cfr_renamed_12976(String[] arg0) {
        int n;
        String string;
        int n2;
        int n3 = 0;
        Memory memory = arg0;
        int n4 = ((String[])memory).length;
        int n5 = n2 = 0;
        while (n5 < n4) {
            string = memory[n2];
            n3 += string.length() + 1;
            n5 = ++n2;
        }
        memory = new Memory((long)n3);
        long l = 0L;
        string = arg0;
        int n6 = ((Memory)string).length;
        int n7 = n = 0;
        while (n7 < n6) {
            String string2 = string[n];
            long l2 = l;
            memory.setString(l2, string2);
            l = l2 + (long)(string2.length() + 1);
            n7 = ++n;
        }
        return memory.getPointer(0L);
    }

    public void cfr_renamed_12974() {
    }

    public Pointer cfr_renamed_12977() {
        return this.cfr_renamed_2;
    }

    @Override
    public void dispose() {
        this.cfr_renamed_11540(true);
    }

    /*
     * WARNING - void declaration
     */
    public sprcln(Pointer pointer, boolean bl) {
        void arg0;
        this.cfr_renamed_12973((Pointer)arg0);
        this.cfr_renamed_3 = bl;
    }

    /*
     * WARNING - void declaration
     */
    public sprcln(Pointer pointer) {
        void arg0;
        this.cfr_renamed_12973((Pointer)arg0);
        this.cfr_renamed_3 = true;
    }

    public static void cfr_renamed_12978(Long arg0, Pointer arg1) {
        if (!cfr_renamed_4.containsKey(arg0)) {
            cfr_renamed_4.put(arg0, arg1);
        }
    }

    public static void cfr_renamed_12979() {
        if (cfr_renamed_4.size() != 0) {
            Iterator<Map.Entry<Long, Pointer>> iterator;
            Iterator<Map.Entry<Long, Pointer>> iterator2 = iterator = cfr_renamed_4.entrySet().iterator();
            while (iterator2.hasNext()) {
                Pointer.nativeValue((Pointer)iterator.next().getValue(), (long)0L);
                iterator2 = iterator;
            }
            cfr_renamed_4.clear();
        }
    }

    public static Pointer cfr_renamed_12980(String arg0) {
        Memory memory = new Memory((long)(arg0.length() * Native.getNativeSize(Character.TYPE)));
        memory.write(0L, arg0.toCharArray(), 0, arg0.toCharArray().length);
        return memory;
    }
}

