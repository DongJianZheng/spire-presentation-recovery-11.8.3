/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgig;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmih;
import com.spire.presentation.packages.sprpsl;
import com.spire.presentation.packages.sprvsq;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class sprich {
    private static final Map cfr_renamed_0;
    private static final Map cfr_renamed_1;
    private static final byte[] cfr_renamed_2;
    private static final Map cfr_renamed_3;
    private static final Map cfr_renamed_4;

    public static String cfr_renamed_8490(String arg0, List<String> arg1) {
        for (String string : arg1) {
            if (!string.startsWith(arg0)) continue;
            return string;
        }
        return null;
    }

    public static InputStream cfr_renamed_8491(InputStream arg0) {
        if (arg0 instanceof FileInputStream) {
            return new BufferedInputStream(arg0);
        }
        return arg0;
    }

    public static OutputStream cfr_renamed_8492(OutputStream arg0) {
        if (arg0 instanceof FileOutputStream) {
            return new BufferedOutputStream(arg0);
        }
        return arg0;
    }

    static {
        Object k;
        cfr_renamed_2 = new byte[2];
        sprich.cfr_renamed_2[0] = 13;
        sprich.cfr_renamed_2[1] = 10;
        HashMap<sprlem, String> hashMap = new HashMap<sprlem, String>();
        hashMap.put(sprpsl.cfr_renamed_956, "md5");
        hashMap.put(sprpsl.cfr_renamed_1472, sprvsq.cfr_renamed_9("P\u000bBN\u0012"));
        hashMap.put(sprpsl.cfr_renamed_2, sprgig.cfr_renamed_9("\"#0fcye"));
        hashMap.put(sprpsl.cfr_renamed_1197, sprvsq.cfr_renamed_9("P\u000bBN\u0011V\u0015"));
        hashMap.put(sprpsl.cfr_renamed_955, sprgig.cfr_renamed_9("\"#0fbse"));
        hashMap.put(sprpsl.cfr_renamed_119, sprvsq.cfr_renamed_9("P\u000bBN\u0016R\u0011"));
        hashMap.put(sprpsl.cfr_renamed_79, sprgig.cfr_renamed_9(",>8%9b\u007f`z|re"));
        hashMap.put(sprpsl.cfr_renamed_134, sprvsq.cfr_renamed_9("\u0004L\u0010W\u0011\u0010W\u0012R\u000eQ\u0013R\u0011N\u0011V\u0015"));
        hashMap.put(sprpsl.spr\ufe34, sprgig.cfr_renamed_9(",>8%9b\u007f`z|yazcfdzc"));
        cfr_renamed_4 = Collections.unmodifiableMap(hashMap);
        HashMap<sprlem, String> hashMap2 = new HashMap<sprlem, String>();
        hashMap2.put(sprpsl.cfr_renamed_956, "md5");
        hashMap2.put(sprpsl.cfr_renamed_1472, "sha1");
        hashMap2.put(sprpsl.cfr_renamed_2, sprvsq.cfr_renamed_9("\u0010K\u0002\u0011Q\u0017"));
        hashMap2.put(sprpsl.cfr_renamed_1197, sprgig.cfr_renamed_9("89*c~g"));
        hashMap2.put(sprpsl.cfr_renamed_955, sprvsq.cfr_renamed_9("\u0010K\u0002\u0010[\u0017"));
        hashMap2.put(sprpsl.cfr_renamed_119, sprgig.cfr_renamed_9("89*dzc"));
        hashMap2.put(sprpsl.cfr_renamed_79, sprvsq.cfr_renamed_9("\u0004L\u0010W\u0011\u0010W\u0012R\u000eZ\u0017"));
        hashMap2.put(sprpsl.cfr_renamed_134, sprgig.cfr_renamed_9(",>8%9b\u007f`z|yazcfc~g"));
        hashMap2.put(sprpsl.spr\ufe34, sprvsq.cfr_renamed_9("\u0004L\u0010W\u0011\u0010W\u0012R\u000eQ\u0013R\u0011N\u0016R\u0011"));
        cfr_renamed_3 = Collections.unmodifiableMap(hashMap2);
        cfr_renamed_1 = cfr_renamed_4;
        TreeMap<String, sprlem> treeMap = new TreeMap<String, sprlem>(String.CASE_INSENSITIVE_ORDER);
        Iterator iterator = cfr_renamed_1.keySet().iterator();
        Iterator iterator2 = iterator;
        while (iterator2.hasNext()) {
            k = iterator.next();
            treeMap.put(cfr_renamed_1.get(k).toString(), (sprlem)k);
            iterator2 = iterator;
        }
        iterator = cfr_renamed_3.keySet().iterator();
        Iterator iterator3 = iterator;
        while (iterator3.hasNext()) {
            k = iterator.next();
            treeMap.put(cfr_renamed_3.get(k).toString(), (sprlem)k);
            iterator3 = iterator;
        }
        cfr_renamed_0 = Collections.unmodifiableMap(treeMap);
    }

    public static OutputStream cfr_renamed_8493(OutputStream arg0) {
        return new sprmih(arg0);
    }

    public static sprlem cfr_renamed_5655(String arg0) {
        sprlem sprlem2 = (sprlem)cfr_renamed_0.get(sprkoe.cfr_renamed_425(arg0));
        if (sprlem2 == null) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprgig.cfr_renamed_9("$%:%><?k<\"2*=,q;08\".5qq")).append(arg0).toString());
        }
        return sprlem2;
    }

    public static String cfr_renamed_8494(String arg0) {
        if (arg0 == null || arg0.length() <= 1) {
            return arg0;
        }
        if (arg0.charAt(0) == '\"') {
            String string = arg0;
            if (string.charAt(string.length() - 1) == '\"') {
                String string2 = arg0;
                return string2.substring(1, string2.length() - 1);
            }
        }
        return arg0;
    }
}

