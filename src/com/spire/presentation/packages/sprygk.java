/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprebda;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgyj;
import com.spire.presentation.packages.spruaf;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class sprygk {
    public static final int cfr_renamed_102 = 14284;
    public static final int cfr_renamed_93 = 13004;
    public static final int cfr_renamed_86 = 188;
    public static final int cfr_renamed_152 = 14796;
    public static final int cfr_renamed_112 = 12748;
    public static final int cfr_renamed_119 = 15052;
    private static final Map<String, Integer> cfr_renamed_91;
    public static final int cfr_renamed_0 = 14028;
    public static final int cfr_renamed_1 = 13516;
    public static final int cfr_renamed_2 = 13260;
    public static final int cfr_renamed_3 = 14540;
    public static final int cfr_renamed_4 = 13772;

    public static Integer cfr_renamed_9913(sprgf arg0) {
        return cfr_renamed_91.get(arg0.cfr_renamed_1315());
    }

    static {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put(sprebda.cfr_renamed_9("\"S _=^A(H"), spruaf.cfr_renamed_279(13004));
        hashMap.put("RIPEMD160", spruaf.cfr_renamed_279(12748));
        hashMap.put("SHA-1", spruaf.cfr_renamed_279(13260));
        hashMap.put("SHA-224", spruaf.cfr_renamed_279(14540));
        hashMap.put("SHA-256", spruaf.cfr_renamed_279(13516));
        hashMap.put("SHA-384", spruaf.cfr_renamed_279(14028));
        hashMap.put("SHA-512", spruaf.cfr_renamed_279(13772));
        hashMap.put(sprgyj.cfr_renamed_9("X\u0016Js>o9q9l?"), spruaf.cfr_renamed_279(14796));
        hashMap.put("SHA-512/256", spruaf.cfr_renamed_279(15052));
        hashMap.put(sprebda.cfr_renamed_9("'r\u0019h\u001cj\u001fu\u001c"), spruaf.cfr_renamed_279(14284));
        cfr_renamed_91 = Collections.unmodifiableMap(hashMap);
    }

    public static boolean cfr_renamed_9934(sprgf arg0) {
        return !cfr_renamed_91.containsKey(arg0.cfr_renamed_1315());
    }
}

