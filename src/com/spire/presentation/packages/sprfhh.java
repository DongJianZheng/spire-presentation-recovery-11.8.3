/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfdf;
import com.spire.presentation.packages.sprkfh;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprmlh;
import com.spire.presentation.packages.sprse;
import com.spire.presentation.packages.sprzpj;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class sprfhh
implements sprse<String> {
    private final String cfr_renamed_119;
    private String cfr_renamed_91;
    private String cfr_renamed_0;
    private final Map<String, List> cfr_renamed_1;
    private boolean cfr_renamed_2;
    private Map<String, String> cfr_renamed_3;
    private final List<String> cfr_renamed_4;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_8521(String arg0, String arg1) {
        sprfhh sprfhh2 = this;
        synchronized (sprfhh2) {
            sprmlh sprmlh2 = new sprmlh(arg0, arg1);
            ArrayList<sprmlh> arrayList = this.cfr_renamed_1.get(arg0);
            if (arrayList == null) {
                arrayList = new ArrayList<sprmlh>();
                this.cfr_renamed_1.put(arg0, arrayList);
            }
            arrayList.add(sprmlh2);
            return;
        }
    }

    public boolean cfr_renamed_8506() {
        return this.cfr_renamed_2;
    }

    public sprfhh(String arg0, String arg1) {
        sprfhh sprfhh2;
        sprfhh sprfhh3 = this;
        sprfhh sprfhh4 = this;
        sprfhh3.cfr_renamed_1 = new TreeMap<String, List>(String.CASE_INSENSITIVE_ORDER);
        String string = new StringBuilder().insert(0, sprfdf.cfr_renamed_9("a<L'G=V~v*R6\u0018s")).append(arg0).toString();
        sprfhh4.cfr_renamed_4 = new ArrayList<String>();
        sprfhh3.cfr_renamed_4.add(string);
        this.cfr_renamed_8521("Content-Type", arg0);
        String string2 = sprfhh3.cfr_renamed_8522("Content-Type") == null ? sprzpj.cfr_renamed_9("N\rB\u001c\u0015\u0018V\tS\u0006") : this.cfr_renamed_8522("Content-Type")[0];
        int n = string2.indexOf(59);
        if (n < 0) {
            arg0 = string2;
            sprfhh2 = this;
            this.cfr_renamed_3 = Collections.EMPTY_MAP;
        } else {
            arg0 = string2.substring(0, n);
            sprfhh sprfhh5 = this;
            sprfhh2 = sprfhh5;
            sprfhh5.cfr_renamed_3 = sprfhh5.cfr_renamed_8523(string2.substring(n + 1).trim());
        }
        String string3 = sprfhh2.cfr_renamed_119 = this.cfr_renamed_8522("Content-Transfer-Encoding") == null ? arg1 : this.cfr_renamed_8522("Content-Transfer-Encoding")[0];
        if (arg0.indexOf(sprfdf.cfr_renamed_9(">W?V:R2P'")) >= 0) {
            this.cfr_renamed_2 = true;
            String string4 = this.cfr_renamed_3.get(sprzpj.cfr_renamed_9("X\u0007O\u0006^\tH\u0011"));
            if (string4.startsWith(sprfdf.cfr_renamed_9("q")) && string4.endsWith(sprzpj.cfr_renamed_9("J"))) {
                String string5 = string4;
                this.cfr_renamed_0 = string5.substring(1, string5.length() - 1);
                return;
            }
            this.cfr_renamed_0 = string4;
            return;
        }
        this.cfr_renamed_0 = null;
        this.cfr_renamed_2 = false;
    }

    public String cfr_renamed_8524() {
        return this.cfr_renamed_0;
    }

    @Override
    public Iterator<String> iterator() {
        return this.cfr_renamed_1.keySet().iterator();
    }

    public String cfr_renamed_696() {
        return this.cfr_renamed_91;
    }

    public Map<String, String> cfr_renamed_8514() {
        return this.cfr_renamed_3;
    }

    private static /* synthetic */ List<String> cfr_renamed_8525(InputStream arg0) throws IOException {
        String string;
        sprkfh sprkfh2;
        ArrayList<String> arrayList = new ArrayList<String>();
        sprkfh sprkfh3 = sprkfh2 = new sprkfh(arg0);
        while ((string = sprkfh3.cfr_renamed_8520()) != null) {
            if (string.length() == 0) {
                return arrayList;
            }
            arrayList.add(string);
            sprkfh3 = sprkfh2;
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    public sprfhh(List<String> list, String string) {
        void arg1;
        sprfhh sprfhh2;
        void arg0;
        sprfhh sprfhh3 = this;
        this.cfr_renamed_1 = new TreeMap<String, List>(String.CASE_INSENSITIVE_ORDER);
        this.cfr_renamed_4 = arg0;
        String string2 = "";
        for (String string3 : arg0) {
            if (string3.startsWith(" ") || string3.startsWith(sprfdf.cfr_renamed_9("Z"))) {
                string2 = new StringBuilder().insert(0, string2).append(string3.trim()).toString();
                continue;
            }
            if (string2.length() != 0) {
                String string4 = string2;
                String string5 = string2;
                this.cfr_renamed_8521(string4.substring(0, string4.indexOf(58)).trim(), string5.substring(string5.indexOf(58) + 1).trim());
            }
            string2 = string3;
        }
        if (string2.trim().length() != 0) {
            String string6 = string2;
            String string7 = string2;
            this.cfr_renamed_8521(string6.substring(0, string6.indexOf(58)).trim(), string7.substring(string7.indexOf(58) + 1).trim());
        }
        String string8 = this.cfr_renamed_8522("Content-Type") == null ? sprzpj.cfr_renamed_9("N\rB\u001c\u0015\u0018V\tS\u0006") : this.cfr_renamed_8522("Content-Type")[0];
        int n = string8.indexOf(59);
        sprfhh sprfhh4 = this;
        if (n < 0) {
            sprfhh4.cfr_renamed_91 = string8;
            sprfhh2 = this;
            this.cfr_renamed_3 = Collections.EMPTY_MAP;
        } else {
            sprfhh4.cfr_renamed_91 = string8.substring(0, n);
            sprfhh sprfhh5 = this;
            sprfhh2 = sprfhh5;
            sprfhh5.cfr_renamed_3 = sprfhh5.cfr_renamed_8523(string8.substring(n + 1).trim());
        }
        sprfhh2.cfr_renamed_119 = this.cfr_renamed_8522("Content-Transfer-Encoding") == null ? arg1 : this.cfr_renamed_8522("Content-Transfer-Encoding")[0];
        sprfhh sprfhh6 = this;
        if (this.cfr_renamed_91.indexOf(sprfdf.cfr_renamed_9(">W?V:R2P'")) >= 0) {
            String string9;
            sprfhh6.cfr_renamed_2 = true;
            String string10 = string9 = this.cfr_renamed_3.get(sprzpj.cfr_renamed_9("X\u0007O\u0006^\tH\u0011"));
            this.cfr_renamed_0 = string10.substring(1, string10.length() - 1);
            return;
        }
        sprfhh6.cfr_renamed_0 = null;
        this.cfr_renamed_2 = false;
    }

    private /* synthetic */ Map<String, String> cfr_renamed_8523(String arg0) {
        int n;
        String[] stringArray = arg0.split(sprfdf.cfr_renamed_9("h"));
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        int n2 = n = 0;
        while (n2 != stringArray.length) {
            String string = stringArray[n];
            int n3 = string.indexOf(61);
            if (n3 < 0) {
                throw new IllegalArgumentException(sprzpj.cfr_renamed_9("\u0005[\u0004\\\u0007H\u0005_\f\u001a+U\u0006N\rT\u001c\u0017<C\u0018_HR\r[\f_\u001a"));
            }
            linkedHashMap.put(string.substring(0, n3).trim(), string.substring(n3 + 1).trim());
            n2 = ++n;
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public boolean cfr_renamed_8526(String arg0) {
        return this.cfr_renamed_1.containsKey(arg0);
    }

    public void cfr_renamed_8495(OutputStream arg0) throws IOException {
        Iterator<String> iterator;
        Iterator<String> iterator2 = iterator = this.cfr_renamed_4.iterator();
        while (iterator2.hasNext()) {
            iterator2 = iterator;
            OutputStream outputStream = arg0;
            arg0.write(sprkoe.cfr_renamed_431(iterator.next().toString()));
            outputStream.write(13);
            outputStream.write(10);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public boolean cfr_renamed_29() {
        sprfhh sprfhh2 = this;
        // MONITORENTER : sprfhh2
        // MONITOREXIT : sprfhh2
        return this.cfr_renamed_1.isEmpty();
    }

    public Iterator<String> cfr_renamed_289() {
        return this.cfr_renamed_1.keySet().iterator();
    }

    public sprfhh(InputStream arg0, String arg1) throws IOException {
        this(sprfhh.cfr_renamed_8525(arg0), arg1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String[] cfr_renamed_8522(String arg0) {
        sprfhh sprfhh2 = this;
        synchronized (sprfhh2) {
            int n;
            List list;
            block5: {
                list = this.cfr_renamed_1.get(arg0);
                if (list != null) break block5;
                return null;
            }
            String[] stringArray = new String[list.size()];
            int n2 = n = 0;
            while (n2 < list.size()) {
                int n3 = n++;
                stringArray[n3] = ((sprmlh)list.get((int)n3)).cfr_renamed_3;
                n2 = n;
            }
            return stringArray;
        }
    }

    public String cfr_renamed_8527() {
        return this.cfr_renamed_119;
    }
}

