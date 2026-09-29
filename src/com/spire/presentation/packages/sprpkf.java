/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhdca;
import com.spire.presentation.packages.sprxl;
import com.spire.presentation.packages.sprzto;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class sprpkf
implements sprxl {
    private final int cfr_renamed_2;
    private final String cfr_renamed_3;
    private static final Map<String, sprpkf> cfr_renamed_4;

    private static /* synthetic */ String cfr_renamed_5892(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            throw new NullPointerException(sprzto.cfr_renamed_9("F=@>U8S9J\u001fF<Bq\u001al\u0007?R=K"));
        }
        return new StringBuilder().insert(0, arg0).append("-").append(arg1).append("-").append(arg2).append("-").append(arg3).append("-").append(arg4).append("-").append(arg5).toString();
    }

    @Override
    public String toString() {
        return this.cfr_renamed_3;
    }

    @Override
    public int cfr_renamed_4721() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprpkf(int n, String string) {
        void arg0;
        sprpkf sprpkf2 = this;
        sprpkf2.cfr_renamed_2 = arg0;
        sprpkf2.cfr_renamed_3 = string;
    }

    public static sprpkf cfr_renamed_5847(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            throw new NullPointerException(sprhdca.cfr_renamed_9("]\u0018[\u001bN\u001dH\u001cQ:]\u0019YT\u0001I\u001c\u001aI\u0018P"));
        }
        return cfr_renamed_4.get(sprpkf.cfr_renamed_5892(arg0, arg1, arg2, arg3, arg4, arg5));
    }

    static {
        HashMap<String, sprpkf> hashMap = new HashMap<String, sprpkf>();
        hashMap.put(sprpkf.cfr_renamed_5892("SHA-256", 32, 16, 67, 20, 2), new sprpkf(1, sprzto.cfr_renamed_9("\tj\u0002t\u001cs\u000et\u0019fcxc\u0017~\u0015\u000e\u0015d\u0011")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHA-256", 32, 16, 67, 20, 4), new sprpkf(2, sprhdca.cfr_renamed_9(",q'o9h+o<}FcF\f[\b+\u000eA\n")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHA-256", 32, 16, 67, 40, 2), new sprpkf(3, sprzto.cfr_renamed_9("\tj\u0002t\u001cs\u000et\u0019fcxe\u0017~\u0015\u000e\u0015d\u0011")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHA-256", 32, 16, 67, 40, 4), new sprpkf(4, sprhdca.cfr_renamed_9(",q'o9h+o<}Fc@\f[\b+\u000eA\n")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHA-256", 32, 16, 67, 40, 8), new sprpkf(5, sprzto.cfr_renamed_9("\tj\u0002t\u001cs\u000et\u0019fcxe\u0017~\u001f\u000e\u0015d\u0011")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHA-256", 32, 16, 67, 60, 3), new sprpkf(6, sprhdca.cfr_renamed_9(",q'o9h+o<}FcB\f[\u000f+\u000eA\n")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHA-256", 32, 16, 67, 60, 6), new sprpkf(7, sprzto.cfr_renamed_9("\tj\u0002t\u001cs\u000et\u0019fcxg\u0017~\u0011\u000e\u0015d\u0011")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHA-256", 32, 16, 67, 60, 12), new sprpkf(8, sprhdca.cfr_renamed_9("d9o'q c't5\u000e+\nD\u0013E\u000e+\u000eA\n")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHA-512", 64, 16, 131, 20, 2), new sprpkf(9, sprzto.cfr_renamed_9("\tj\u0002t\u001cs\u000et\u0019fcxc\u0017~\u0015\u000e\u0012`\u0015")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHA-512", 64, 16, 131, 20, 4), new sprpkf(10, sprhdca.cfr_renamed_9(",q'o9h+o<}FcF\f[\b+\tE\u000e")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHA-512", 64, 16, 131, 40, 2), new sprpkf(11, sprzto.cfr_renamed_9("\tj\u0002t\u001cs\u000et\u0019fcxe\u0017~\u0015\u000e\u0012`\u0015")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHA-512", 64, 16, 131, 40, 4), new sprpkf(12, sprhdca.cfr_renamed_9(",q'o9h+o<}Fc@\f[\b+\tE\u000e")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHA-512", 64, 16, 131, 40, 8), new sprpkf(13, sprzto.cfr_renamed_9("\tj\u0002t\u001cs\u000et\u0019fcxe\u0017~\u001f\u000e\u0012`\u0015")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHA-512", 64, 16, 131, 60, 3), new sprpkf(14, sprhdca.cfr_renamed_9(",q'o9h+o<}FcB\f[\u000f+\tE\u000e")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHA-512", 64, 16, 131, 60, 6), new sprpkf(15, sprzto.cfr_renamed_9("\tj\u0002t\u001cs\u000et\u0019fcxg\u0017~\u0011\u000e\u0012`\u0015")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHA-512", 64, 16, 131, 60, 12), new sprpkf(16, sprhdca.cfr_renamed_9("d9o'q c't5\u000e+\nD\u0013E\u000e+\tE\u000e")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHAKE128", 32, 16, 67, 20, 2), new sprpkf(17, sprzto.cfr_renamed_9("\u007f\u001ct\u0002j\u0005x\u0002o\u0010l\u0014xc\u0017~\u0015\u000e\u0015d\u0011")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHAKE128", 32, 16, 67, 20, 4), new sprpkf(18, sprhdca.cfr_renamed_9("d9o'q c't5w1cF\f[\b+\u000eA\n")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHAKE128", 32, 16, 67, 40, 2), new sprpkf(19, sprzto.cfr_renamed_9("\u007f\u001ct\u0002j\u0005x\u0002o\u0010l\u0014xe\u0017~\u0015\u000e\u0015d\u0011")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHAKE128", 32, 16, 67, 40, 4), new sprpkf(20, sprhdca.cfr_renamed_9("d9o'q c't5w1c@\f[\b+\u000eA\n")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHAKE128", 32, 16, 67, 40, 8), new sprpkf(21, sprzto.cfr_renamed_9("\u007f\u001ct\u0002j\u0005x\u0002o\u0010l\u0014xe\u0017~\u001f\u000e\u0015d\u0011")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHAKE128", 32, 16, 67, 60, 3), new sprpkf(22, sprhdca.cfr_renamed_9("d9o'q c't5w1cB\f[\u000f+\u000eA\n")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHAKE128", 32, 16, 67, 60, 6), new sprpkf(23, sprzto.cfr_renamed_9("\u007f\u001ct\u0002j\u0005x\u0002o\u0010l\u0014xg\u0017~\u0011\u000e\u0015d\u0011")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHAKE128", 32, 16, 67, 60, 12), new sprpkf(24, sprhdca.cfr_renamed_9(",q'o9h+o<}?y+\nD\u0013E\u000e+\u000eA\n")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHAKE256", 64, 16, 131, 20, 2), new sprpkf(25, sprzto.cfr_renamed_9("\u007f\u001ct\u0002j\u0005x\u0002o\u0010l\u0014xc\u0017~\u0015\u000e\u0012`\u0015")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHAKE256", 64, 16, 131, 20, 4), new sprpkf(26, sprhdca.cfr_renamed_9("d9o'q c't5w1cF\f[\b+\tE\u000e")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHAKE256", 64, 16, 131, 40, 2), new sprpkf(27, sprzto.cfr_renamed_9("\u007f\u001ct\u0002j\u0005x\u0002o\u0010l\u0014xe\u0017~\u0015\u000e\u0012`\u0015")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHAKE256", 64, 16, 131, 40, 4), new sprpkf(28, sprhdca.cfr_renamed_9("d9o'q c't5w1c@\f[\b+\tE\u000e")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHAKE256", 64, 16, 131, 40, 8), new sprpkf(29, sprzto.cfr_renamed_9("\u007f\u001ct\u0002j\u0005x\u0002o\u0010l\u0014xe\u0017~\u001f\u000e\u0012`\u0015")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHAKE256", 64, 16, 131, 60, 3), new sprpkf(30, sprhdca.cfr_renamed_9("d9o'q c't5w1cB\f[\u000f+\tE\u000e")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHAKE256", 64, 16, 131, 60, 6), new sprpkf(31, sprzto.cfr_renamed_9("\u007f\u001ct\u0002j\u0005x\u0002o\u0010l\u0014xg\u0017~\u0011\u000e\u0012`\u0015")));
        hashMap.put(sprpkf.cfr_renamed_5892("SHAKE256", 64, 16, 131, 60, 12), new sprpkf(32, sprhdca.cfr_renamed_9(",q'o9h+o<}?y+\nD\u0013E\u000e+\tE\u000e")));
        cfr_renamed_4 = Collections.unmodifiableMap(hashMap);
    }
}

