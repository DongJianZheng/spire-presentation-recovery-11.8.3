/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcbaa;
import com.spire.presentation.packages.sprchl;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmvh;
import com.spire.presentation.packages.sprnhm;
import com.spire.presentation.packages.sprtny;
import com.spire.presentation.packages.sprzkl;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.TreeSet;

public class sprsgh {
    public static void cfr_renamed_8666(sprgxh arg0) {
        if (!sprmvh.cfr_renamed_8665(arg0)) {
            throw new IllegalArgumentException(sprcbaa.cfr_renamed_9("Q\u007fpz\"arzkcktczkal.m`nw\"jghk`gj\"atkp.afc|cmvkpgqzkm/<\"hkknjq"));
        }
        sprsgh.cfr_renamed_8667(arg0);
    }

    private static /* synthetic */ ArrayList cfr_renamed_8661(Enumeration arg0) {
        ArrayList arrayList = new ArrayList();
        Enumeration enumeration = arg0;
        while (enumeration.hasMoreElements()) {
            Enumeration enumeration2 = arg0;
            enumeration = enumeration2;
            arrayList.add(enumeration2.nextElement());
        }
        return arrayList;
    }

    public static void main(String[] arg0) {
        TreeSet treeSet = new TreeSet(sprsgh.cfr_renamed_8661(sprnhm.cfr_renamed_289()));
        treeSet.addAll(sprsgh.cfr_renamed_8661(sprchl.cfr_renamed_289()));
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            sprgxh sprgxh2;
            String string = (String)iterator.next();
            sprzkl sprzkl2 = sprchl.cfr_renamed_8048(string);
            if (sprzkl2 == null) {
                sprzkl2 = sprnhm.cfr_renamed_8048(string);
            }
            if (sprzkl2 == null || !sprmvh.cfr_renamed_8665(sprgxh2 = sprzkl2.cfr_renamed_1769())) continue;
            System.out.print(new StringBuilder().insert(0, string).append(":").toString());
            sprsgh.cfr_renamed_8667(sprgxh2);
        }
    }

    private static /* synthetic */ void cfr_renamed_8667(sprgxh arg0) {
        sprlsh sprlsh2 = arg0.cfr_renamed_1652(BigInteger.valueOf(2L));
        sprlsh sprlsh3 = sprlsh2.cfr_renamed_1817();
        System.out.println(sprlsh3.cfr_renamed_1779().toString(16).toUpperCase());
        if (!sprlsh3.cfr_renamed_1048().equals(sprlsh2)) {
            throw new IllegalStateException(sprtny.cfr_renamed_9("Jfq\u007fh\u007f\u007fsa;vgwb%edxlb|6f~`un6cwlz`r"));
        }
    }
}

