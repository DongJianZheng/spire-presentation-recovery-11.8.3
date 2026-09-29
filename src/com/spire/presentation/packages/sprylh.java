/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfhh;
import com.spire.presentation.packages.sprfjh;
import com.spire.presentation.packages.sprhkh;
import com.spire.presentation.packages.sprich;
import com.spire.presentation.packages.sprklg;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprojh;
import com.spire.presentation.packages.sprpsl;
import com.spire.presentation.packages.sprssa;
import com.spire.presentation.packages.spruul;
import com.spire.presentation.packages.sprych;
import com.spire.presentation.packages.spryeh;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class sprylh
extends sprhkh {
    private final String cfr_renamed_119;
    private final OutputStream cfr_renamed_91;
    public static final Map cfr_renamed_0;
    private final String cfr_renamed_1;
    private final spruul cfr_renamed_2;
    public static final Map cfr_renamed_3;
    public static final Map cfr_renamed_4;

    static {
        HashMap<sprlem, String> hashMap = new HashMap<sprlem, String>();
        hashMap.put(sprpsl.cfr_renamed_956, "md5");
        hashMap.put(sprpsl.cfr_renamed_1472, sprssa.cfr_renamed_9("32!wq"));
        hashMap.put(sprpsl.cfr_renamed_2, sprklg.cfr_renamed_9("aTs\u0011 \u000e&"));
        hashMap.put(sprpsl.cfr_renamed_1197, sprssa.cfr_renamed_9("32!wrov"));
        hashMap.put(sprpsl.cfr_renamed_955, sprklg.cfr_renamed_9("aTs\u0011!\u0004&"));
        hashMap.put(sprpsl.cfr_renamed_119, sprssa.cfr_renamed_9("32!wukr"));
        hashMap.put(sprpsl.cfr_renamed_79, sprklg.cfr_renamed_9("[}OfN!\b#\r?\u0005&"));
        hashMap.put(sprpsl.cfr_renamed_134, sprssa.cfr_renamed_9("=/)4(snqkmhpkrwrov"));
        hashMap.put(sprpsl.spr\ufe34, sprklg.cfr_renamed_9("[}OfN!\b#\r?\u000e\"\r \u0011'\r "));
        cfr_renamed_3 = Collections.unmodifiableMap(hashMap);
        HashMap<sprlem, String> hashMap2 = new HashMap<sprlem, String>();
        hashMap2.put(sprpsl.cfr_renamed_956, "md5");
        hashMap2.put(sprpsl.cfr_renamed_1472, "sha1");
        hashMap2.put(sprpsl.cfr_renamed_2, sprssa.cfr_renamed_9(")(;rht"));
        hashMap2.put(sprpsl.cfr_renamed_1197, sprklg.cfr_renamed_9("Oz] \t$"));
        hashMap2.put(sprpsl.cfr_renamed_955, sprssa.cfr_renamed_9(")(;sbt"));
        hashMap2.put(sprpsl.cfr_renamed_119, sprklg.cfr_renamed_9("Oz]'\r "));
        hashMap2.put(sprpsl.cfr_renamed_79, sprssa.cfr_renamed_9("=/)4(snqkmct"));
        hashMap2.put(sprpsl.cfr_renamed_134, sprklg.cfr_renamed_9("[}OfN!\b#\r?\u000e\"\r \u0011 \t$"));
        hashMap2.put(sprpsl.spr\ufe34, sprssa.cfr_renamed_9("=/)4(snqkmhpkrwukr"));
        cfr_renamed_0 = Collections.unmodifiableMap(hashMap2);
        cfr_renamed_4 = cfr_renamed_3;
    }

    public /* synthetic */ sprylh(sprojh arg0, Map arg1, String arg2, OutputStream arg3, sprfjh arg4) {
        this(arg0, arg1, arg2, arg3);
    }

    @Override
    public OutputStream cfr_renamed_4004() throws IOException {
        sprylh sprylh2 = this;
        sprylh sprylh3 = this;
        ((sprfhh)((Object)sprylh2.cfr_renamed_4)).cfr_renamed_8495(sprylh3.cfr_renamed_91);
        sprylh2.cfr_renamed_91.write(sprkoe.cfr_renamed_433("\r\n"));
        if (sprylh3.cfr_renamed_1 == null) {
            return null;
        }
        sprylh sprylh4 = this;
        sprylh4.cfr_renamed_91.write(sprkoe.cfr_renamed_433(sprklg.cfr_renamed_9("hzUa\u001c{O2]|\u001cA\u0013_u_y2O{[|Yv\u001c\u007fYaOs[w1\u0018")));
        sprylh4.cfr_renamed_91.write(sprkoe.cfr_renamed_433(sprssa.cfr_renamed_9("WJwm")));
        sprylh4.cfr_renamed_91.write(sprkoe.cfr_renamed_433(this.cfr_renamed_1));
        sprylh4.cfr_renamed_91.write(sprkoe.cfr_renamed_433("\r\n"));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        sprych sprych2 = new sprych(byteArrayOutputStream);
        sprylh sprylh5 = this;
        return new spryeh(sprylh5, this.cfr_renamed_2.cfr_renamed_4131(sprych2, false, sprich.cfr_renamed_8493(this.cfr_renamed_91)), sprylh5.cfr_renamed_91, byteArrayOutputStream, sprych2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprylh(sprojh sprojh2, Map<String, String> map, String string, OutputStream outputStream) {
        void arg2;
        void arg0;
        void arg1;
        sprylh sprylh2 = this;
        sprylh sprylh3 = this;
        super(new sprfhh(sprylh.cfr_renamed_8496((Map<String, String>)arg1), arg0.cfr_renamed_1));
        sprylh3.cfr_renamed_2 = sprojh.cfr_renamed_8497((sprojh)arg0);
        sprylh3.cfr_renamed_119 = arg0.cfr_renamed_1;
        sprylh2.cfr_renamed_1 = arg2;
        sprylh2.cfr_renamed_91 = outputStream;
    }

    public static /* synthetic */ String cfr_renamed_8498(sprylh arg0) {
        return arg0.cfr_renamed_1;
    }
}

