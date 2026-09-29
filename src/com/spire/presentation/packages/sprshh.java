/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfhh;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprich;
import com.spire.presentation.packages.spril;
import com.spire.presentation.packages.sprjhh;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprkg;
import com.spire.presentation.packages.sprmuda;
import com.spire.presentation.packages.sprmve;
import com.spire.presentation.packages.sprsh;
import com.spire.presentation.packages.sprtih;
import com.spire.presentation.packages.sprxpo;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

public class sprshh
implements sprkg {
    private sprjj[] cfr_renamed_3;
    private final sprtih cfr_renamed_4;

    @Override
    public spril cfr_renamed_8510(int arg0) throws IOException {
        return new sprjhh(this, arg0);
    }

    public sprjj[] cfr_renamed_8507() {
        return this.cfr_renamed_3;
    }

    public static /* synthetic */ sprtih cfr_renamed_8511(sprshh arg0) {
        return arg0.cfr_renamed_4;
    }

    @Override
    public InputStream cfr_renamed_8512(sprfhh arg0, InputStream arg1) throws IOException {
        return arg1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprjj[] cfr_renamed_8513(sprfhh arg0) {
        try {
            int n;
            Map<String, String> map = arg0.cfr_renamed_8514();
            String string = map.get(sprxpo.cfr_renamed_9("&>(6'0"));
            if (string == null) {
                throw new IllegalStateException(sprmuda.cfr_renamed_9("?HQJ\u0018D\u0010K\u0016\u0007\u0017N\u0014K\u0015\u0007\u001eIQD\u001eI\u0005B\u001fS\\S\bW\u0014\u0007\u0019B\u0010C\u0014U"));
            }
            String string2 = string;
            String[] stringArray = string2.substring(string2.indexOf(61) + 1).split(",");
            sprjj[] sprjjArray = new sprjj[stringArray.length];
            int n2 = n = 0;
            while (true) {
                if (n2 >= stringArray.length) {
                    return sprjjArray;
                }
                String string3 = sprich.cfr_renamed_8494(stringArray[n]).trim();
                sprjjArray[n++] = this.cfr_renamed_4.cfr_renamed_8509().cfr_renamed_5279(new sprddm(sprich.cfr_renamed_5655(string3)));
                n2 = n;
            }
        }
        catch (sprhjg sprhjg2) {
            return null;
        }
    }

    public OutputStream cfr_renamed_8515() {
        int n;
        if (this.cfr_renamed_3.length == 1) {
            return this.cfr_renamed_3[0].cfr_renamed_470();
        }
        OutputStream outputStream = this.cfr_renamed_3[0].cfr_renamed_470();
        int n2 = n = 1;
        while (n2 < this.cfr_renamed_3.length) {
            OutputStream outputStream2 = this.cfr_renamed_3[n].cfr_renamed_470();
            outputStream = new sprmve(outputStream2, outputStream);
            n2 = ++n;
        }
        return outputStream;
    }

    /*
     * WARNING - void declaration
     */
    public sprshh(sprsh sprsh2, sprfhh sprfhh2) {
        void arg1;
        this.cfr_renamed_4 = (sprtih)sprsh2;
        this.cfr_renamed_3 = this.cfr_renamed_8513((sprfhh)arg1);
    }
}

