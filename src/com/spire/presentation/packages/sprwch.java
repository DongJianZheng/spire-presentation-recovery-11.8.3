/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprchl;
import com.spire.presentation.packages.sprcmfa;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmvh;
import com.spire.presentation.packages.sprnhm;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.spruci;
import com.spire.presentation.packages.sprzkl;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.TreeSet;

public class sprwch {
    private static final BigInteger cfr_renamed_3 = BigInteger.valueOf(1L);
    private static final SecureRandom cfr_renamed_4 = new SecureRandom();

    public static void cfr_renamed_8659(sprgxh arg0) {
        int n;
        sprlsh sprlsh2;
        BigInteger bigInteger;
        int n2;
        int n3 = arg0.cfr_renamed_1938();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n4 = n2 = 0;
        while (n4 < n3) {
            if (0 == (n2 & 1) && 0 != n2) {
                if (arrayList.contains(spruaf.cfr_renamed_279(n2 >>> 1))) {
                    arrayList.add(spruaf.cfr_renamed_279(n2));
                    System.out.print(new StringBuilder().insert(0, " ").append(n2).toString());
                }
            } else {
                bigInteger = cfr_renamed_3.shiftLeft(n2);
                sprlsh2 = arg0.cfr_renamed_1652(bigInteger);
                n = sprwch.cfr_renamed_8660(sprlsh2);
                if (n != 0) {
                    arrayList.add(spruaf.cfr_renamed_279(n2));
                    System.out.print(new StringBuilder().insert(0, " ").append(n2).toString());
                }
            }
            n4 = ++n2;
        }
        System.out.println();
        int n5 = n2 = 0;
        while (n5 < 1000) {
            int n6;
            bigInteger = new BigInteger(n3, cfr_renamed_4);
            sprlsh2 = arg0.cfr_renamed_1652(bigInteger);
            n = sprwch.cfr_renamed_8660(sprlsh2);
            int n7 = 0;
            int n8 = n6 = 0;
            while (n8 < arrayList.size()) {
                int n9 = (Integer)arrayList.get(n6);
                if (bigInteger.testBit(n9)) {
                    n7 ^= 1;
                }
                n8 = ++n6;
            }
            if (n != n7) {
                throw new IllegalStateException(sprcmfa.cfr_renamed_9(":v\u0001o\u0018o\u000fc\u0011+\u0001t\u0014e\u0010&\u0006g\u001bo\u0001\u007fUe\u001dc\u0016mU`\u0014o\u0019c\u0011"));
            }
            n5 = ++n2;
        }
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

    private static /* synthetic */ int cfr_renamed_8660(sprlsh arg0) {
        sprlsh sprlsh2 = arg0;
        int n = sprlsh2.cfr_renamed_1938();
        int n2 = 31 - spruaf.cfr_renamed_5201(n);
        int n3 = 1;
        sprlsh sprlsh3 = sprlsh2;
        block0: while (true) {
            int n4 = n2;
            while (n4 > 0) {
                sprlsh3 = sprlsh3.cfr_renamed_8662(n3).cfr_renamed_8663(sprlsh3);
                if (0 == ((n3 = n >>> --n2) & 1)) continue block0;
                sprlsh3 = sprlsh3.cfr_renamed_1048().cfr_renamed_8663(arg0);
                n4 = n2;
            }
            break;
        }
        if (sprlsh3.cfr_renamed_805()) {
            return 0;
        }
        if (sprlsh3.cfr_renamed_287()) {
            return 1;
        }
        throw new IllegalStateException(spruci.cfr_renamed_9("O8r3t8g:&3t$i$&?hvr$g5cve7j5s:g\"o9h"));
    }

    public static void cfr_renamed_8664(sprgxh arg0) {
        if (!sprmvh.cfr_renamed_8665(arg0)) {
            throw new IllegalArgumentException(sprcmfa.cfr_renamed_9("!t\u0014e\u0010&\u001ah\u0019\u007fUb\u0010`\u001ch\u0010bUi\u0003c\u0007&\u0016n\u0014t\u0014e\u0001c\u0007o\u0006r\u001ceX4U`\u001cc\u0019b\u0006"));
        }
        sprwch.cfr_renamed_8659(arg0);
    }

    public static void main(String[] arg0) {
        TreeSet treeSet = new TreeSet(sprwch.cfr_renamed_8661(sprnhm.cfr_renamed_289()));
        treeSet.addAll(sprwch.cfr_renamed_8661(sprchl.cfr_renamed_289()));
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
            sprwch.cfr_renamed_8659(sprgxh2);
        }
    }
}

