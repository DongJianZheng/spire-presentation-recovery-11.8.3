/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbuy;
import com.spire.presentation.packages.sprrek;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Map;

public class sprynk {
    public static String[] cfr_renamed_5248(String[] arg0, String arg1) {
        String[] stringArray;
        if (arg0 == null) {
            String[] stringArray2 = new String[1];
            stringArray2[0] = arg1;
            return stringArray2;
        }
        int n = arg0.length;
        String[] stringArray3 = stringArray = new String[n + 1];
        System.arraycopy(arg0, 0, stringArray3, 0, n);
        stringArray3[n] = arg1;
        return stringArray;
    }

    public static String cfr_renamed_9747(String arg0, Map<String, String> arg1) {
        Iterator<Map.Entry<String, String>> iterator;
        StringWriter stringWriter;
        StringWriter stringWriter2 = stringWriter = new StringWriter();
        stringWriter2.write(arg0);
        stringWriter2.write(32);
        boolean bl = false;
        Iterator<Map.Entry<String, String>> iterator2 = iterator = arg1.entrySet().iterator();
        while (iterator2.hasNext()) {
            StringWriter stringWriter3;
            Map.Entry<String, String> entry = iterator.next();
            if (!bl) {
                bl = true;
                stringWriter3 = stringWriter;
            } else {
                StringWriter stringWriter4 = stringWriter;
                stringWriter3 = stringWriter4;
                stringWriter4.write(44);
            }
            stringWriter3.write(entry.getKey());
            StringWriter stringWriter5 = stringWriter;
            stringWriter5.write(sprbuy.cfr_renamed_9("O#"));
            stringWriter5.write(entry.getValue());
            iterator2 = iterator;
            stringWriter.write(34);
        }
        return stringWriter.toString();
    }

    public static Map<String, String> cfr_renamed_9748(String arg0, String arg1) {
        if ((arg1 = arg1.trim()).startsWith(arg0)) {
            arg1 = arg1.substring(arg0.length());
        }
        return new sprrek(arg1).cfr_renamed_9749();
    }
}

